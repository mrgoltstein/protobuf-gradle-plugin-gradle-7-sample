plugins {
    `kotlin-dsl`
}

repositories {
    jcenter()
    google()
}

dependencies {
    implementation("com.android.tools.build:gradle:7.0.0-alpha06")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30")
    implementation(gradleApi())
    implementation(localGroovy())
}
