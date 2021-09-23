//
//  MovieReviewsList.swift
//  ios
//
//  Created by Pablo Reyes on 23/09/21.
//  Copyright © 2021 orgName. All rights reserved.
//

import SwiftUI
import shared

struct MovieReviewsList: View {
    
    // dependencies
    private let networkModule: NetworkModule
    private let useCasesModule: UseCaseModule
    
    init(
        networkModule: NetworkModule
    ) {
        self.networkModule = networkModule
        self.useCasesModule = UseCaseModule(
            repository: networkModule.repository
        )
    }
    
    var body: some View {
        Text("Build Movie Reviews List Here")
    }
}
