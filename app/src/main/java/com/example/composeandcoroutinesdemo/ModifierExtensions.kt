package com.example.composeandcoroutinesdemo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun Modifier.getSampleButtonModifier(): Modifier {
    return this.size(100.dp)
}

fun Modifier.getSpanishGreetingModifier(innerPadding: PaddingValues): Modifier {
    return this.fillMaxWidth().padding(innerPadding)
}