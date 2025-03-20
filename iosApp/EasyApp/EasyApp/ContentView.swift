//
//  ContentView.swift
//  EasyApp
//
//  Created by Indra Mahkota on 30/12/24.
//

import UIKit
import SwiftUI
import shared

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        MainViewControllerKt.mainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}
}

struct ContentView: View {
    var body: some View {
      ComposeView().ignoresSafeArea()
    }
}

//#Preview {
//    ContentView()
//}
