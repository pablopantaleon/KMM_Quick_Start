# Kotlin Multiplatform Mobile (KMM) - Example
This is a basic example project that has still work in progress where you can find things related of how to start with KMM and how the things are connected. You can also check 
**[How to Create a KMM Project Article](https://ppantaleon.medium.com/kotlin-multiplatform-mobile-how-to-create-a-project-9af893ece79d)**

### Project Structure
* /android: Contains all the UI using JetPack Compose, Hilt and ViewModel
* /ios: Contains all the UI using SwiftUI 
* /shared: Contains all the business logic. Domain and Data, using Ktor, SQLDelight, etc.

### API
This project use NYTime API, it has a hardcoded API-KEY but you can use your own
* [Create an account](https://developer.nytimes.com/get-started)
* Then enable the [Movies Review and get the API key](https://developer.nytimes.com/my-apps/)

### Screenshots & Gifs
<img src="https://github.com/pablopantaleon/KMM_Quick_Start/blob/master/screenshots/demo_android.gif" width="240" />


### buildSrc
This project use *buildSrc*, this is used because is a sample project so keep in mind that this could increase the build time. It's better if you use: [Composite Builds](https://proandroiddev.com/stop-using-gradle-buildsrc-use-composite-builds-instead-3c38ac7a2ab3)

### Useful Resources
* [Kotlin Stability Levels](https://kotlinlang.org/docs/components-stability.html#stability-levels-explained)
* [NY Times API](https://developer.nytimes.com/docs/movie-reviews-api/1/routes/reviews/search.json/get)
* [How the Search Response looks](https://api.nytimes.com/svc/movies/v2/reviews/search.json?api-key=ZQDWIE2LGsS4jZN1xHDtDISOBLX4WfAo)
