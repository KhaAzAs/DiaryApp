//// Top-level build file where you can add configuration options common to all sub-projects/modules.
//plugins {
//    alias(libs.plugins.androidApplication) apply false
//    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
//
//    // Add the dependency for the Google services Gradle plugin
//    alias(libs.plugins.androidLibrary) apply false
////    id("io.realm.kotlin") version "1.11.0" apply false
////    id("com.google.dagger.hilt.android") version "2.48" apply false
////    id("com.google.gms.google-services") version "4.3.15" apply false
////    id("com.google.devtools.ksp") version "1.8.10-1.0.9" apply false
//}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("com.android.library") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.8.20" apply false
    id("io.realm.kotlin") version "1.11.0" apply false
    id("com.google.dagger.hilt.android") version "2.48" apply false
//    id("com.google.gms.google-services") version "4.3.15" apply false
    id("com.google.devtools.ksp") version "1.8.20-1.0.11" apply false
}