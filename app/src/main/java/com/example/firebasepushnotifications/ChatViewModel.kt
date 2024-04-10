package com.example.firebasepushnotifications

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ChatViewModel: ViewModel() {
    var state by mutableStateOf(ChatState())

//    private val api: FcmApi = Retrofit.Builder()
//        .baseUrl("http://10.0.2.2:8080")
//        .addConverterFactory(MoshiConverterFactory.create())
}