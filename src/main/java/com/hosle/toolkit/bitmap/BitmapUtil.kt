package com.hosle.toolkit.bitmap

import android.graphics.Bitmap
import android.util.Log
import java.io.*

/**
 * Created by tanjiahao on 2018/11/28
 * Original Project HoToolKit
 */

fun bmpToByteArray(originBmp: Bitmap,destWidth:Int, destHeight:Int, needRecycle: Boolean): ByteArray {
    val output = ByteArrayOutputStream()
    val bmp = Bitmap.createScaledBitmap(originBmp, destWidth, destHeight, true)

    bmp.compress(Bitmap.CompressFormat.PNG, 100, output)
    if (needRecycle) {
        bmp.recycle()
    }

    val result = output.toByteArray()
    try {
        output.close()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    return result
}

fun saveBitmapAsFile(saveFile: File, bitmap: Bitmap): Boolean {

    var saved = false
    var os: FileOutputStream? = null
    try {
        Log.d("FileCache", "Saving File To Cache " + saveFile.path)
        os = FileOutputStream(saveFile)

        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, os)
        os.flush()
        os.close()
        saved = true
    } catch (e: FileNotFoundException) {
        e.printStackTrace()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return saved
}