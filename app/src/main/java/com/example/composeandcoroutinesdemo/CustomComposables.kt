package com.example.composeandcoroutinesdemo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SampleButton() {
    Button({/* Do nothing for now */}, modifier = Modifier.getSampleButtonModifier()) {
        Text("Button")
    }
}

@Composable
fun SpanishGreeting(innerPadding: PaddingValues) {
    val modifier = Modifier.getSpanishGreetingModifier(innerPadding)
    Text("Hola!!!", modifier)
}