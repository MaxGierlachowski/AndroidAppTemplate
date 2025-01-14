plugins {
    id("android-library-convention")
}

android.buildFeatures.viewBinding = true

dependencies {
    api(Libs.control_core)

    implementation(Kotlin.stdlib.jdk8)
    api(AndroidX.core.ktx)
    api(AndroidX.fragmentKtx)
    api(AndroidX.lifecycle.viewModelKtx)

    /*api(Libs.loco_core)
    api(Libs.util_permissions)
    api(Libs.util_ui)
    api(Libs.koin_android)
    api(Libs.koin_androidx_scope)
    api(Libs.koin_androidx_viewmodel)
    api(Libs.koin_androidx_fragment)
    api(Libs.flowbinding_activity)
    api(Libs.flowbinding_android)
    api(Libs.flowbinding_appcompat)
    api(Libs.flowbinding_core)
    api(Libs.flowbinding_drawerlayout)
    api(Libs.flowbinding_lifecycle)
    api(Libs.flowbinding_material)
    api(Libs.flowbinding_navigation)
    api(Libs.flowbinding_preference)
    api(Libs.flowbinding_recyclerview)
    api(Libs.flowbinding_swiperefreshlayout)
    api(Libs.flowbinding_viewpager2)

    api(Google.android.material)

    api(AndroidX.activityKtx)
    api(AndroidX.appCompat)
    api(AndroidX.browser)
    api(AndroidX.constraintLayout)
    api(AndroidX.lifecycle.runtimeKtx)
    api(AndroidX.lifecycle.viewModelKtx)
    api(AndroidX.navigation.fragmentKtx)
    api(AndroidX.navigation.uiKtx)
    api(AndroidX.viewPager2)*/

    debugApi(Square.leakCanary.android)
    releaseApi(Square.leakCanary.objectWatcher.android)
}
