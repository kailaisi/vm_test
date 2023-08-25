package com.example.myapplication

import io.flutter.embedding.android.FlutterActivity
import io.flutter.plugin.common.MethodChannel

/**
 * 用于创建缓存的Flutter引擎，生成对应的channel
 */
class FlutterEmbeddingActivity : FlutterActivity() {
    private var methodChannel: MethodChannel? = null

    override fun onDestroy() {
        super.onDestroy()
        methodChannel?.setMethodCallHandler(null)
    }

}
