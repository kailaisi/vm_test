/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.kailaisi.buildsrc

object App {
    const val applicationId = "com.kailaisi.crypto"
}

object Versions {
    const val ktlint = "0.45.2"
    const val compileSdk = 33
    const val minSdk = 21
    const val targetSdk = 33
}

object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.4.0"


    object Kotlin {
        private const val version = "1.7.21"
        const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object Coroutines {
        private const val version = "1.7.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.10.1"
        const val cardView = "androidx.cardview:cardview:1.0.0"

        object RecycleView {
            const val recycleView = "androidx.recyclerview:recyclerview:1.3.0"
        }


        object Lifecycle {
            private const val version = "2.6.1"
            const val viewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val runtimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
            const val livedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val extensions = "androidx.lifecycle:lifecycle-extensions:2.2.0"
        }

        object ConstraintLayout {
            const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
        }

        object AppCompat {
            const val appCompat = "androidx.appcompat:appcompat:1.6.1"
        }

        object Activity {
            private const val version = "1.7.2"
            const val activity = "androidx.activity:activity:$version"
            const val activityKtx = "androidx.activity:activity-ktx:$version"
        }

        object Fragment {
            private const val version = "1.5.7"
            const val fragment = "androidx.fragment:fragment:$version"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
        }

        object DataStore {
            const val dataStoreCore = "androidx.datastore:datastore-core:1.0.0"
            const val dataStorePreferences = "androidx.datastore:datastore-preferences:1.0.0"
        }

        object MultiDex {
            const val multiDex = "androidx.multidex:multidex:2.0.1"
        }
    }

    object Google {
        const val material = "com.google.android.material:material:1.9.0"
        const val analytics = "com.google.firebase:firebase-analytics-ktx:21.2.2"
        const val crash = "com.google.firebase:firebase-crashlytics:18.3.2"
        const val gson = "com.google.code.gson:gson:2.10.1"

        object Hilt {
            private const val version = "2.43.2"
            const val android = "com.google.dagger:hilt-android:$version"
            const val androidCompiler = "com.google.dagger:hilt-compiler:$version"
            const val androidGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"

        }

        object Android {
            const val flexBox = "com.google.android:flexbox:2.0.1"
            const val exoplayerCore = "com.google.android.exoplayer:exoplayer-core:2.9.1"
            const val exoplayerHls = "com.google.android.exoplayer:exoplayer-hls:2.9.1"

        }

    }

    object Squareup {
        const val retrofit2 = "com.squareup.retrofit2:retrofit:2.9.0"
        const val convertGson = "com.squareup.retrofit2:converter-gson:2.9.0"
        const val retrofitKotlinCoroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:0.9.2"
        const val okhttp = "com.squareup.okhttp3:okhttp:4.11.0"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:4.10.0"
        const val rxJava = "com.squareup.retrofit2:adapter-rxjava2:2.9.0"
        const val rxAndroid = "io.reactivex.rxjava2:rxandroid:2.1.1"

    }

    object jakewharton {
        const val butterknife = "com.jakewharton:butterknife:10.2.1"
        const val compile = "com.jakewharton:butterknife-compiler:10.2.0"
        const val rxbinding = "com.jakewharton.rxbinding2:rxbinding:2.2.0"
    }

    object RxLifeCycle {
        const val rxlifecycle = "com.trello.rxlifecycle2:rxlifecycle:2.2.2"
        const val rxlifecycleComponents = "com.trello.rxlifecycle2:rxlifecycle-components:2.2.2"
        const val rxlifecycleKtx = "com.trello.rxlifecycle2:rxlifecycle-kotlin:2.2.2"
    }

    object Tencent {
        const val mmkv = "com.tencent:mmkv-static:1.2.16"
    }


    object Utils {
        const val immersionBar = "com.geyifeng.immersionbar:immersionbar:3.2.2"
        const val liveEventBus = "io.github.jeremyliao:live-event-bus-x:1.8.0"
        const val eventbus = "org.greenrobot:eventbus:3.3.1"
        const val brav = "com.github.CymChad:BaseRecyclerViewAdapterHelper:3.0.7"
        const val pinyin = "com.github.promeg:tinypinyin:3.0.0"
        const val glide = "com.github.bumptech.glide:glide:4.15.1"
        const val uil = "com.nostra13.universalimageloader:universal-image-loader:1.9.5"
        const val toolsFinal = "cn.finalteam:toolsfinal:1.1.5"
        const val rxpermissions = "com.github.tbruyelle:rxpermissions:0.10.2"
        const val superTextView = "com.github.chenBingX:SuperTextView:v3.1.1"
        const val tabLayout = "io.github.h07000223:flycoTabLayout:3.0.0"
        const val anko = "org.jetbrains.anko:anko:0.10.8"
        const val utilCodex = "com.blankj:utilcodex:1.31.1"
        const val lottie = "com.airbnb.android:lottie:3.1.0"
        const val maxHeightScrollerView = "com.bskim:maxheightscrollview:1.0.0@aar"
        const val circleImageView = "de.hdodenhof:circleimageview:3.1.0"
        const val statusBarUtil = "com.jaeger.statusbarutil:library:1.5.1"
        const val javaWebSocket = "org.java-websocket:Java-WebSocket:1.4.0"
        const val mpAndroidChart = "com.github.PhilJay:MPAndroidChart:v3.1.0"
        const val wsManager = "com.rabtman.wsmanager:wsmanager:1.0.2"
        const val logger = "com.orhanobut:logger:2.2.0"
        const val banner2 = "io.github.youth5201314:banner:2.2.2"
        const val sentry = "io.sentry:sentry-android:6.21.0"
    }

    object View {
        const val consecutiveScroller = "com.github.donkingliang:ConsecutiveScroller:4.4.1"
        const val wheelview = "com.github.zyyoona7:wheelview:1.0.7"
        const val newbieGuide = "com.github.huburt-Hu:NewbieGuide:v2.4.0"
        const val basePopup = "io.github.razerdp:BasePopup:3.2.1"
        const val materialSearchView = "com.miguelcatalan:materialsearchview:1.4.0"
        const val searchViewLayout = "xyz.sahildave:searchviewlayout:0.6"
        const val easyPop = "com.github.zyyoona7:EasyPopup:1.1.1"
        const val topSnackbar = "com.androidadvance:topsnackbar:1.1.1"
        const val photoView = "com.github.chrisbanes:PhotoView:2.1.3"
        const val seekBar = "com.github.warkiz.widget:indicatorseekbar:2.1.2"
        const val autoVerticalTextview = "com.github.paradoxie:AutoVerticalTextview:0.1"
        const val gesturelockview = "com.wangnan:gesturelockview:1.0.2"
        const val banner = "com.youth.banner:banner:1.4.10"
        const val wheelPicker = "com.github.gzu-liyujiang.AndroidPicker:WheelPicker:4.1.11"
        const val toaster = "com.github.getActivity:Toaster:12.2"
        const val rCLayout = "com.github.IHoveYou:RCLayout:1.0.2"
        const val perfectTextView = "com.github.FlyJingFish:PerfectTextView:1.1.9"
    }


    object SmartRefreshLayout {
        private const val version = "2.0.5"
        const val kernel = "io.github.scwang90:refresh-layout-kernel:2.0.5"     //核心必须依赖
        const val classics = "io.github.scwang90:refresh-header-classics:2.0.5"    //经典刷新头
        const val radar = "io.github.scwang90:refresh-header-radar:2.0.5"       //雷达刷新头
        const val falsify = "io.github.scwang90:refresh-header-falsify:2.0.5"     //虚拟刷新头
        const val material = "io.github.scwang90:refresh-header-material:2.0.5"    //谷歌刷新头
        const val twoLevel = "io.github.scwang90:refresh-header-two-level:2.0.5"   //二级刷新头
        const val footBall = "io.github.scwang90:refresh-footer-ball:2.0.5"        //球脉冲加载
        const val footerClassics = "io.github.scwang90:refresh-footer-classics:2.0.5"    //经典加载

        const val SmartRefreshLayout = "com.scwang.smartrefresh:SmartRefreshLayout:1.1.3"
        const val SmartRefreshLayoutHeader = "com.scwang.smartrefresh:SmartRefreshHeader:1.1.3"
    }


    object Zxing {
        const val zxingAndroidEmbedded = "com.journeyapps:zxing-android-embedded:3.3.0"
    }

    object ViewBindingKTX {
        private const val version = "2.1.0"
        const val base = "com.github.DylanCaiCoding.ViewBindingKTX:viewbinding-base:$version"
        const val brah = "com.github.DylanCaiCoding.ViewBindingKTX:viewbinding-brvah:$version"
    }

    object ARouter {
        private const val version = "1.5.2"
        const val api = "com.alibaba:arouter-api:$version"
        const val annotationProcessor = "com.alibaba:arouter-compiler:$version"
    }

    object Permission {
        const val permissionx = "com.guolindev.permissionx:permissionx:1.7.1"
    }

    object AutoSize {
        const val autoSize = "com.github.JessYanCoding:AndroidAutoSize:v1.2.1"
    }

    object BubbleDialog {
        const val bubbleDialog = "com.github.xujiaji:happy-bubble:1.1.4"
    }


    object ExchangeFlutterModule {
        private const val version = "1.0.0"
    }


}
