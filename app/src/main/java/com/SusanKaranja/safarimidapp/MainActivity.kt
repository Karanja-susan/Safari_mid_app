package com.SusanKaranja.safarimidapp

import android.graphics.BlurMaskFilter.Blur
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.SusanKaranja.safarimidapp.ui.theme.SafariMidAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SafariMidAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
//                    Greeting("Android")
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home() {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)) {
        Text(text = "Susan's Mobile App",
            color=Color.Magenta,
            fontSize = 50.sp,
            fontFamily = FontFamily.Cursive)
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Welcome to my Andriod Application",
            color = Color.Blue,
            fontFamily = FontFamily.Default,
            fontSize = 20.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Tap the button to login and create an account",
            color = Color.Red,
            fontSize = 15.sp,
            fontFamily = FontFamily.Monospace)
//        Spacer(modifier = Modifier.height(5.dp))
        Image(painter = painterResource(id = R.drawable.nat5),
            contentDescription =null,
            modifier = Modifier
                .height(150.dp)
                .width(200.dp))
//        Spacer(modifier = Modifier.height(5.dp))
        Image(painter = painterResource(id = R.drawable.nat9), contentDescription =null,
            modifier = Modifier
                .height(200.dp)
                .width(150.dp))
//        Spacer(modifier = Modifier.height(5.dp))
        Image(painter = painterResource(id = R.drawable.nat8), contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .width(150.dp))
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { /*START*/ }) {
            
        }

    }
}

@Preview
@Composable
private fun Homeprev() {
    Home()
}