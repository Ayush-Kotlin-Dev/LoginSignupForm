plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.devtools.ksp")
    id("dagger.hilt.android.plugin")
    id("com.google.dagger.hilt.android")
    id ("kotlinx-serialization")
}

android {
    namespace = "ggv.ayush.instau"
    compileSdk = 34

    defaultConfig {
        applicationId = "ggv.ayush.instau"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
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
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation (libs.androidx.lifecycle.viewmodel.compose)
    implementation (libs.androidx.material.icons.extended)

    implementation (libs.androidx.navigation.compose)
    implementation (libs.coil.compose)



// Horizontal Pager and Indicators - Accompanist
    implementation(libs.accompanist.pager)
    implementation (libs.accompanist.pager.indicators)


    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    //hilt
    implementation (libs.androidx.lifecycle.viewmodel.compose.v251)
    implementation(libs.androidx.hilt.navigation.compose)

    implementation(libs.coil.compose)
    implementation (libs.glide)
    implementation (libs.kotlinx.coroutines.play.services)

    // Room
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
    implementation(libs.androidx.room.room.paging)

    // Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation(libs.retrofit2.kotlinx.serialization.converter)

    // Paging 3.0
    implementation(libs.androidx.paging.compose)

    // KotlinX Serialization

    // DataStore Preferences
    implementation(libs.androidx.datastore.preferences)

    // Coil
    implementation(libs.coil.compose)

    // System UI Controller - Accompanist
    implementation (libs.accompanist.systemuicontroller)
    // Swipe to Refresh - Accompanist
    implementation (libs.accompanist.swiperefresh)
    implementation (libs.ui)
    implementation (libs.androidx.material)
    implementation (libs.ui.tooling)
}