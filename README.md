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

### TabNavigation using ViewPager2 and TabLayout
Explore this [link](https://developer.android.com/guide/navigation/navigation-swipe-view) for more details of the ViewPager and Lateral Navigation.

***Rules to Remember***
- You can never display an Activity over another Activity
- You should be using a `fragment` to display different screens on an Activity.

***Fragments*** 
A fragment represents a modular portion of the user interface within an activity. A fragment has its own lifecycle, receives its own input events, and you can add or remove fragments while the containing activity is running.



#### Assignment
1. Explore `NavigationDrawer` and develop an app with the following requirements
   1. add Multiple books details as options and they should get displayed on the left hand side as the user swipes the screen from atmost left to the center the screen.
   2. Upon tapping each item, display the list of books from the api on the fragment using Recyclerview on the fragment. 

2. Try to add recyclerview to fragment and display it as one of the four fragments on a lateral navigation model (TabNavigation).

### Companion Object in Koltin


In Kotlin, a companion object is a special object that is associated with a class and shares the same name as the class. It can be accessed directly using the class name without creating an instance of the class. Companion objects are similar to static members in Java, but they have some key differences.

Purpose of Companion Objects

Companion objects are primarily used to define members that are shared across all instances of a class. This can be useful for functions that are related to the class itself, rather than specific instances of the class. For example, a companion object might contain a factory method for creating instances of the class, a utility function for working with the class's data, or a singleton instance of the class.

Benefits of Companion Objects

Companion objects offer several benefits over regular class members:

Access without Instance: Companion objects can be accessed directly using the class name, eliminating the need to create an instance of the class. This makes them more convenient to use and reduces boilerplate code.

Shared Members: Companion objects can define members that are shared across all instances of a class, promoting code reuse and consistency.

Factory Methods: Companion objects are well-suited for implementing factory methods, which create instances of the class with specific configurations.

Static-like Behavior: Companion objects provide static-like behavior in Kotlin, enabling encapsulation and preventing accidental modifications of static fields.

Syntax of Companion Objects

A companion object is declared within a class definition using the companion object keyword. The companion object can have its own members, including functions, properties, and nested classes.

Kotlin
class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
        fun getMessage(): String = "Hello from Companion Object"
    }
}
Use code with caution. Learn more
Accessing Companion Objects

Companion objects can be accessed directly using the class name. For instance, to call the create() function in the MyClass example, you would write:

Kotlin
val instance = MyClass.create()
Use code with caution. Learn more
Similarly, to access the getMessage() function:

Kotlin
val message = MyClass.getMessage()
Use code with caution. Learn more
Common Uses of Companion Objects

Companion objects are commonly used for:

Factory Methods: Creating instances of classes with specific configurations.

Singleton Classes: Managing single instances of classes.

Extension Functions: Providing utility functions for the class.

Static-like Members: Encapsulating and managing class-level data.

In summary, companion objects provide a powerful and flexible mechanism for defining members that are shared across instances of a class in Kotlin. They offer a way to organize code, simplify access to shared functionality, and implement patterns like factory methods and singleton classes.

### Navigation components
- Navigation Graph 
  - This is a resource that collects all the navigation related data in one place. this is typically a graph that shows all your fragments on a screen and the possible directions that a user would take.
- NavHostFragment
  - This navHostFragment shows various destinations from your nav graph
- NavController
  - This operates the whole navigation

Step 1 -
  - create a nav graph
    - res>select android resource file > Choose navigation under the resource type > give it a name and click ok

Refer this [Video](https://youtu.be/NqpyCKlYLVU?si=faByKLO9DCkUyN8g) 

[Ebook (Develop Apps in Android)](https://android-app-development-documentation.readthedocs.io/en/latest/)



