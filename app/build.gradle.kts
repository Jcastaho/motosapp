plugins {
    id("com.android.application")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.straccion.motos_admin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.straccion.motos_admin"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("androidx.navigation:navigation-ui:2.7.6")
    implementation("com.google.android.gms:play-services-auth:20.6.0")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")

    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("id.zelory:compressor:2.1.1")
    implementation ("com.squareup.picasso:picasso:2.8")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.github.smarteist:autoimageslider:1.4.0")
    implementation ("com.github.d-max:spots-dialog:1.1@aar")
    implementation ("com.eightbitlab:blurview:1.6.6")
    implementation ("androidx.legacy:legacy-support-v4:1.0.0")
    implementation ("com.github.mancj:MaterialSearchBar:0.8.5")
    implementation ("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("org.jsoup:jsoup:1.17.2")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("io.github.florent37:shapeofview:1.4.7")


    implementation("com.google.firebase:firebase-firestore")
    implementation("com.google.firebase:firebase-auth:22.3.0")
    implementation(platform("com.google.firebase:firebase-bom:32.3.1"))
    implementation("com.firebaseui:firebase-ui-firestore:8.0.2")
    implementation ("com.google.firebase:firebase-storage")
    implementation("androidx.activity:activity:1.8.0")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}