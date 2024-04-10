package com.example.firebasepushnotifications

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.ktx.messaging
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChatScreen(
    messageText: String,
    onMessageChange: (message: String) -> Unit,
    onMessageSend: () -> Unit,
    onMessageBroadcast: () -> Unit
) {
    OutlinedTextField(
        value = messageText,
        onValueChange = onMessageChange,
        placeholder = {
            Text(text = "Enter a message.")
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
    Spacer(modifier = Modifier.height(16.dp))
    Row(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End
    ) {
        IconButton(
            onClick = { /*TODO*/ },
        ) {

        }
        Spacer(modifier = Modifier.width(16.dp))
        IconButton(onClick = { /*TODO*/ }) {
            
        }
    }
}