package com.example.teste1.api

import android.net.Uri
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.MalformedURLException
import java.net.URL
import java.util.*

object NetworkUtil {

    const val BASE_URL =
        "https://raw.githubusercontent.com/gabrielbmoro/workshopAndroid/master/jsonFiles/filmesJson.json"

    // construir a url
    fun buildUrl(): Uri {
        val uri = Uri.parse(BASE_URL)
            .buildUpon()
            .build()

        return uri
    }

    // fazer a chamada (url)
    fun callApi(uri: Uri): String {
        var httpURLConnection: HttpURLConnection? = null
        var inputStream: InputStream? = null
        var scanner: Scanner? = null

        try {
            httpURLConnection = URL(uri.toString()).openConnection() as? HttpURLConnection
            inputStream = httpURLConnection?.inputStream
            scanner = Scanner(inputStream)
            var strResponse = ""

            while (scanner.hasNext()) {
                strResponse += scanner.nextLine()
            }

            return strResponse
        } catch (erro: MalformedURLException) {
            erro.printStackTrace()
        } finally {
            scanner?.close()
            inputStream?.close()
        }
        return ""
    }
}