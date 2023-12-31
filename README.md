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

Experiment the SQLite [here](https://sqliteonline.com/)

##### Assignment 
Try doing `update` and `delete` on SQlite Project.

#### Room Database
- Room Database is not a separate database that we have. It is a layer developed on top of SQLiteDatabase.
- Room Database is a part of Android Jetpack that helps us to achieve the required features related database in a much fasterway.
- Room Database works on [ORM](https://en.wikipedia.org/wiki/Object%E2%80%93relational_mapping) (Object Relational mapping), it avoids the developers to write lengthy queries. 
- Three Major components
  - Entity - is a dataclass that represents a table.
    - the dataclass name becomes the table name
    - The entries of the dataclass becomes the coloumn names
    - @Entity annotation should be used
  - DAO
    - Database Access object , Interface
    - Abstract methods that represent a query
    - We will annotate each method with the appropriate annotation that represents the kind of query you want to run.
  - RoomDatabase
    - will help us to manage the whole database. 

Read More about room database [here](https://developer.android.com/training/data-storage/room)

### Notifications
- Refer to the official Document [here](https://developer.android.com/develop/ui/views/notifications)
 - Refer to the slide deck given by Google [here](https://docs.google.com/presentation/d/1D2n0-V0qG7H0YV5ZWx4rtJpjuHDBJ6m7vcvEmdYR8Ew/edit?resourcekey=0-NjY_l12AwzTN0Znqt7KY6w#slide=id.g3a6358ac69_0_152)
- Refer to my ebook [chapter 30](https://android-app-development-documentation.readthedocs.io/en/latest/notifications.html)

#### Assignment
Just like the way we used BigPictureStyle() use BigTextStyle to display a lengthy text to the user upon expanding the notification (ex: gmail Notifications)

#### Alarm Manager
Refer to these [slides](https://docs.google.com/presentation/d/112BSR8Uep_QGZtMHcE0OVBb2rYJ7rAv_ry_l1L3fhNU/edit#slide=id.g18e5d42159_0_330)

#### Broadcast Receivers
[Slides](https://docs.google.com/presentation/d/1qF9Yeau7uHIP7_aOHWgPU_RnfxACZzGyAZIzcJWz0R0/edit#slide=id.g188d52e48a_1_6)

Learn about [Implicit Broadcast Exceptions](https://developer.android.com/guide/components/broadcast-exceptions)


#### Job Scheduler 
- Intelligent Scheduling algorithm used to schedule the tasks
- Available from API 21+

The Three Major components of JobScheduler
- JobService
  - This is where we define the task that we want to perform

- JobInfo
  - We will set the conditions required to perform the tasks defined in the job service

- JobScheduler
  - This is a system service that schdules the jobs based on the conditions set on jobInfo object

Refer to these [slides](https://docs.google.com/presentation/d/1UILCEnzR1vurX0XaFV71Ke_yyIhEJ9--iRzwVpYKLwc/edit?resourcekey=0-RTKA4Q5ubz5BcdHZ6gRt-Q#slide=id.g18e75634d0_0_172)

#### Assignment
- Get the data from chuck norries api and display it on logcat under `MAIN` tag using jobScheduler.
  - Make sure that the device is in charging state
  - Make sure that the device is connected to unmetered netwrok (WIFI)

#### Work Manager

[Read about it here](https://developer.android.com/reference/androidx/work/WorkManager)

Implement the work manager by refering to this [document](https://developer.android.com/develop/background-work/background-tasks/persistent/getting-started#:~:text=To%20get%20started%20using%20WorkManager,library%20into%20your%20Android%20project.&text=Once%20you've%20added%20the,define%20some%20work%20to%20run.)

#### Content Providers
Provide data to the same app or a different application

#### assignment
Try the same concept using RoomDB. 

### Firebase
Firebase is an app development platform that helps you build and grow apps and games users love. Backed by Google and trusted by millions of businesses around the world.

[Link](https://firebase.google.com/docs)

Prerequisites
Install or update Android Studio to its latest version.

Make sure that your project meets these requirements:

Targets API level 19 (KitKat) or higher
Uses Android 4.4 or higher
Uses Jetpack (AndroidX), which includes meeting these version requirements:
com.android.tools.build:gradle v7.3.0 or later
compileSdkVersion 28 or later
Set up a physical device or use an emulator to run your app.
Note that Firebase SDKs with a dependency on Google Play services require the device or emulator to have Google Play services installed.

Sign into Firebase using your Google account.

Before using any of the firebase features, make sure you check out [this](https://firebase.google.com/docs/android/setup) documentation and complete the initial set up procedures

[Real Time Databases documentation](https://firebase.google.com/docs/database/android/start)

#### Assignment
- Explore Firebase Authentication (Google Sign in Authentication).

#### Services in Android
There are 4 basic building blocks of android applications
- Activities
- Services
- Broadcast Receivers
- Content Providers

A ***Service*** is an application component that can perform long-running operations in the background. **It does not provide a user interface.** Once started, a service might continue running for some time, even after the user switches to another application. Additionally, a component can bind to a service to interact with it and even perform interprocess communication (IPC). For example, a service can handle network transactions, play music, perform file I/O, or interact with a content provider, all from the background.

```Caution: A service runs in the main thread of its hosting process; the service does not create its own thread and does not run in a separate process unless you specify otherwise. You should run any blocking operations on a separate thread within the service to avoid Application Not Responding (ANR) errors.```

[***Types of Services***](https://developer.android.com/develop/background-work/services#Types-of-services)

- Foreground
- Background
- Bound


[Permissions in Android](https://developer.android.com/guide/topics/permissions/overview)


### Important Links

[Receive Location Updates - Codelab](https://codelabs.developers.google.com/codelabs/while-in-use-location#0)


[JetPack components playlist](https://www.youtube.com/watch?v=6X4ieh6rIeA&list=PLodYIve2fV8blZG0rD4PK2FUFuQcEhXcH)

[Working with sensors](https://developer.android.com/codelabs/activity-recognition-transition#0)

[Payment gateway Integration](https://developer.android.com/codelabs/pay-android-checkout#0)

[Publish Your App on Google Play store](https://support.google.com/googleplay/android-developer/answer/9859152?hl=en)

[Dart Programming for Flutter](https://dart.dev/guides)

[Flutter Development environment](https://docs.flutter.dev/get-started/editor) can be set up majorly with two IDEs
- Android Studio
- Visual Studio Code (Open source)

[Lazy vs lateinit](https://medium.com/huawei-developers/kotlin-lateinit-vs-by-lazy-initialization-example-tutorial-c19d84216480)

[Coroutine Codelab](https://developer.android.com/codelabs/kotlin-coroutines#0)


***All The best***
Contact me @ `pavankreddy.t@gmail.com`







