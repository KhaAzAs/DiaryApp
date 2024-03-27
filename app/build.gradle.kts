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
    val compose_version = "1.4.6"
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose.ui:ui:$compose_version")
    implementation("androidx.compose.ui:ui-tooling-preview:$compose_version")
    implementation("androidx.compose.material3:material3:1.2.0-alpha08")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.5.1")
    debugImplementation("androidx.compose.ui:ui-tooling:$compose_version")
    debugImplementation("androidx.compose.ui:ui-test-manifest:$compose_version")

    // Compose Navigation
    implementation("androidx.navigation:navigation-compose:2.7.3")

    // Firebase
    implementation("com.google.firebase:firebase-auth-ktx:22.1.2")
    implementation("com.google.firebase:firebase-storage-ktx:20.2.1")

    // Room components
    implementation("androidx.room:room-runtime:2.5.2")
    ksp("androidx.room:room-compiler:2.5.2")
    implementation("androidx.room:room-ktx:2.5.2")

    // Runtime Compose
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.2")

    // Splash API
    implementation("androidx.core:core-splashscreen:1.0.1")

    // Mongo DB Realm
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.1")
    implementation("io.realm.kotlin:library-sync:1.11.0")

    // Dagger Hilt
    implementation("com.google.dagger:hilt-android:2.48")
    ksp("com.google.dagger:hilt-compiler:2.48")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")

    // Coil
    implementation("io.coil-kt:coil-compose:2.3.0")

    // Pager - Accompanist [DEPRECATED]
//    implementation "com.google.accompanist:accompanist-pager:0.27.0"

    // Date-Time Picker
    implementation("com.maxkeppeler.sheets-compose-dialogs:core:1.0.2")

    // CALENDAR
    implementation("com.maxkeppeler.sheets-compose-dialogs:calendar:1.0.2")

    // CLOCK
    implementation("com.maxkeppeler.sheets-compose-dialogs:clock:1.0.2")

    // Message Bar Compose
    implementation("com.github.stevdza-san:MessageBarCompose:1.0.5")

    // One-Tap Compose
    implementation("com.github.stevdza-san:OneTapCompose:1.0.7")

    // Desugar JDK
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")

}
