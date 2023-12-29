package com.nareshtechnologies.servicesinandroid

import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.nareshtechnologies.servicesinandroid.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    private lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMapsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        val charminar = LatLng(17.361431, 78.474533)
        mMap.addMarker(MarkerOptions().position(charminar).title("Marker in Charminar"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(charminar,15F))

        if(checkCallingOrSelfPermission(android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
            mMap.uiSettings.isMyLocationButtonEnabled = true
            // Now how to fetch the current location
            val l:LocationManager = getSystemService(LOCATION_SERVICE) as LocationManager
            val location:Location? = l.getLastKnownLocation(LocationManager.GPS_PROVIDER)
            val lat:Double? = location?.latitude
            val longit:Double? = location?.longitude
            var l1 = 0.00
            var l2 = 0.00
            if(lat!=null && longit!=null){
                l1 = lat
                l2 = longit
            }
            val loc = LatLng(l1,l2)
            mMap.addMarker(MarkerOptions().position(loc).title("Marker in MyLoc"))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(loc,15F))
            
        }
    }
}
