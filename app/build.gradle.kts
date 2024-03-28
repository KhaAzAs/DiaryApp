//import com.android.build.api.dsl.Packaging

//plugins {
//    alias(libs.plugins.androidApplication)
//    alias(libs.plugins.jetbrainsKotlinAndroid)
//
//    // Add the Google services Gradle plugin
////    id("com.google.devtools.ksp")
////    id("dagger.hilt.android.plugin")
////    id("io.realm.kotlin")
////    id("com.google.gms.google-services")
//}
//
//android {
//    namespace = "one.khaz.diaryapp"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "one.khaz.diaryapp"
//        minSdk = 21
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//        vectorDrawables {
//            useSupportLibrary = true
//        }
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_1_8
//        targetCompatibility = JavaVersion.VERSION_1_8
//    }
//    kotlinOptions {
//        jvmTarget = "1.8"
//    }
//    buildFeatures {
//        compose = true
//    }
//    composeOptions {
//        kotlinCompilerExtensionVersion = "1.5.1"
//    }
//    packaging {
//        resources {
//            excludes += "/META-INF/{AL2.0,LGPL2.1}"
//        }
//    }
//}
//
//dependencies {
//
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//    implementation(libs.androidx.navigation.runtime.ktx)
//    // Compose Navigation
//    implementation(libs.androidx.navigation.compose)
//
//    // Import the BoM for the Firebase platform
//    implementation(platform(libs.firebasebom))
//    // Add the dependency for the Firebase Authentication library
//    // When using the BoM, you don't specify versions in Firebase library dependencies
//    implementation(libs.firebase.auth)
//    // Add the dependency for the Cloud Storage library
//    // When using the BoM, you don't specify versions in Firebase library dependencies
//    implementation(libs.firebase.storage)
//
//    // Room components
////    implementation(libs.androidx.room.runtime)
////    annotationProcessor(libs.room.compiler)
//    // To use Kotlin Symbol Processing (KSP)
////    ksp(libs.room.compiler)
//    // optional - Kotlin Extensions and Coroutines support for Room
////    implementation(libs.androidx.room.ktx)
//
//    // Runtime Compose
////    implementation(libs.androidx.lifecycle.runtime.compose)
//
//    // Splash API
//    implementation(libs.androidx.core.splashscreen)
//
//    // Mongo DB Realm
//    implementation(libs.kotlinx.coroutines.core)
//    implementation(libs.library.sync)
//
//    // Dagger Hilt
////    implementation(libs.dagger.hilt.android)
////    ksp(libs.hilt.compiler)
////    implementation(libs.androidx.hilt.navigation.compose)
//
//    // Coil
////    implementation(libs.coil)
//
//    // Pager - Accompanist [DEPRECATED]
////    implementation "com.google.accompanist:accompanist-pager:0.27.0"
//
//    // Date-Time Picker
////    implementation(libs.sheets.compose.dialogs.core)
//
//    // CALENDAR
////    implementation(libs.calendar)
//
//    // CLOCK
////    implementation(libs.clock)
//
//    // Message Bar Compose
////    implementation(libs.messagebarcompose)
//
//    // One-Tap Compose
//    implementation(libs.onetapcompose)
//
//    // Desugar JDK
////    coreLibraryDesugaring(libs.desugar.jdk.libs)
//
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//
//
//}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
//    id 'kotlin-kapt'
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("io.realm.kotlin")
//    id("com.google.gms.google-services")
}

android {
    namespace = "one.khaz.diaryapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "one.khaz.diaryapp"
        minSdk =  21
        targetSdk =  34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility =  JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled =  true
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.6"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.runtime.ktx)

    // Compose Navigation
    implementation(libs.androidx.navigation.compose)

    // Firebase
    implementation(libs.firebase.auth.ktx)
    implementation(libs.firebase.storage.ktx)

    // Room components
    implementation(libs.androidx.room.runtime)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.room.ktx)

    // Runtime Compose
    implementation(libs.androidx.lifecycle.runtime.compose)

    // Splash API
    implementation(libs.androidx.core.splashscreen)

    // Mongo DB Realm
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.library.sync)

    // Dagger Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    implementation(libs.androidx.hilt.navigation.compose)

    // Coil
    implementation(libs.coil.compose)

    // Pager - Accompanist [DEPRECATED]
//    implementation "com.google.accompanist:accompanist-pager:0.27.0"

    // Date-Time Picker
    implementation(libs.core)

    // CALENDAR
    implementation(libs.calendar)

    // CLOCK
    implementation(libs.clock)

    // Message Bar Compose
    implementation(libs.messagebarcompose)

    // One-Tap Compose
    implementation(libs.onetapcompose)

    // Desugar JDK
    coreLibraryDesugaring(libs.desugar.jdk.libs)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}
