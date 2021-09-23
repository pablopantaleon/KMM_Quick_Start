import SwiftUI
import shared

@main
struct iOSApp: App {
    
    private let networkModule = NetworkModule(cache: CacheModule())
    
    var body: some Scene {
        WindowGroup {
            MovieReviewsList(networkModule: networkModule)
        }
    }
}
