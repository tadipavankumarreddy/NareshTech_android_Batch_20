# NareshTech_android_Batch_20
whatever the code that is discussed and explained will be present here along with the important links. This also serves as the notes.

[Demo Sessions 03rd Oct 2023 to 11th Oct 2023 can be found here](https://docs.google.com/document/d/1gOPSfRau1JgC-OV5V4KUWerZmK0Q8IDDM3hPw_PmzbU/edit)

Access My Free Ebook (Android application development using Java) [here](https://android-app-development-documentation.readthedocs.io/en/latest/)

[Refer to this documentation for Material Design Components](https://developer.android.com/design/ui/mobile/guides/components/material-overview)

[Refer to this for MDC](https://github.com/material-components/material-components-android/blob/master/docs/components/TextField.md)

***Whenever you have multiple items to show on a single view, you are going to need an adapter.***

***For each view that can display multiple items, there will be a separate Adapter available***

***We need ArrayAdapter to display multiple items on the spinner***

[Refer for ViewBinding](https://developer.android.com/topic/libraries/view-binding)

[Intents and intent filters](https://developer.android.com/guide/components/intents-filters)

**Intents are messaging objects. When you send a message, it reaches to the android OS. The OS based on the message that is being sent, takes an appropriate action**

**What are the basic uses of Intents?**
- Start Activities
- Start Services
- Deliver a Broadcast

**Intents are two types**
- Explicit Intents
  - These intents are responsible to open an activity from an external Application (User apps).
  
- Implicit Intents
  - These intents are responsible to open an activity from an internal app (System Apps).

***How an Intent Communicates ?***

![ref](/intents.png)


[Common Intents in android](https://developer.android.com/guide/components/intents-common)

**Assignment**
1. customize the app (Happy birthday) to involve a few animations
[Link for animation](https://developer.android.com/develop/ui/views/animations/reposition-view#:~:text=One%20way%20that%20Android%20lets,or%20deceleration%20of%20the%20animation.)

2. Use the Implicit intents to open a certain address on google Maps.


### Assignment
- Improvise the "Register Me" app by adding another screen that displays the data coming from the first screen.

### Constraint Layout in Android
[Constraint Layout Introduction](https://developer.android.com/develop/ui/views/layout/constraint-layout)

- Constraint Layout is an official Replacement of Relative Layout. 

- **\>><<** -> Wrap_content
- **|-| |-|** -> Fixed
- **|^^| |^^|** -> Match Constraint 

### List View Android
[Official Documentation](https://developer.android.com/reference/kotlin/android/widget/ListView)

### Assignment
- Create an app that lists out all your 20 favorite places along with the place names. Use CardView and Recyclerview to display the list in an attractive UI. Now, when the user clicks on a place, make sure the details activity is up and shows the user more information about the places. 

### Networking in android

We can connect to internet to communicate with the rest services and apis. 
- AsyncTask (Now deprecated - It is no longer used)
- Executors (This is a java library that helps us to connect to internet)  
**3rd Party libraries**
- Retrofit 
- OkHttp  
**1st Party Libraries**
- Volley

Public apis can be accessed from [here](https://github.com/public-apis/public-apis)

[Access this Presentation](https://docs.google.com/presentation/d/1HVNyrppFuOv-6MgUCIQ-SZyZxLcK4DVKtSyI82T5R6A/edit?resourcekey=0-xuLPU518hMsSLE9bJaJ65Q#slide=id.g1880535e8d_0_323

### Volley 
- It is a networking library developed by Google. 
- Its easy to implement and also faster when compared with other networking libraries
- Know more by [clicking here](https://google.github.io/volley/)

### Convert the Json Response to Equivalent Kotlin DataClasses

- Go to this [link](https://github.com/google/gson) and add the dependency `implementation("com.google.code.gson:gson:2.10.1")`

- Go to this [link](https://json2kt.com/) and paste your json response to download the equivalent data classes for your json response

- Add these files to your project. Note that you can even create a sub package to hold all these files (this is not mandatory - However better organisation of files will happen if you create a new package)

### Image Loading Libraries
- [Glide](https://github.com/bumptech/glide)
- [Picasso](https://square.github.io/picasso/)


### Retrofit Networking Library
[Official Document](https://square.github.io/retrofit/)

### Assignments
1. Try to do Post Request using Volley and AsyncTask as well. 
  
2. Pick any interesting public repository available on the github, try to finish building an app.




