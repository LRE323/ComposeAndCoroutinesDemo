package com.example.composeandcoroutinesdemo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeandcoroutinesdemo.ui.theme.ComposeAndCoroutinesDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContent()
        }
    }

    private fun onClickSampleButton() {
        Toast.makeText(this, "Clicked button", Toast.LENGTH_SHORT).show()
    }
}

@Preview(showBackground = true, showSystemUi = true,
    device = "spec:parent=pixel_7,navigation=buttons"
)
@Composable
fun MainContent() {
    ComposeAndCoroutinesDemoTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Text("Hola!!!", modifier = Modifier.padding(innerPadding))
            SampleButton()
        }
    }
}

@Composable
fun SampleButton() {
    Button({/* Do nothing for now */}) {
        Text("Sample Button")
    }
}