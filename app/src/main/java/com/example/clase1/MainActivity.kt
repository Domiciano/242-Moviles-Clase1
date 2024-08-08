package com.example.clase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clase1.ui.theme.Clase1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clase1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(modifier = Modifier.padding(innerPadding)) {
                        WhatsApp()
                    }

                }
            }
        }
    }
}

@Composable
fun WhatsApp() {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {

        Box(
            modifier = Modifier
                .size(84.dp)
                .clip(CircleShape)
        ) {
            Image(
                painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Perfil"
            )
        }

        Box(modifier = Modifier.width(16.dp))

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = "Stewart Family")
            Text(text = "Steve: Great, thanks!")
        }
        Column(modifier = Modifier, horizontalAlignment = Alignment.End) {
            Text(text = "11:39PM")
            Text(text = "1")
        }
    }
}

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.horizontalGradient(
                    colors = listOf(
                        Color(0xff303334), Color(0xff676661)
                    )
                )
            )
    ) {


        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = ""
        )

        Box(modifier = Modifier.weight(1f))

        Row(modifier = Modifier.padding(horizontal = 24.dp)) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(18.dp))
                    .size(56.dp)
                    .border(2.dp, Color.Green, shape = RoundedCornerShape(18.dp))
                    .background(Color.Blue)
                    .padding(8.dp), contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "User"
                )
            }
            Box(modifier = Modifier.width(16.dp))
            TextField(
                modifier = Modifier.weight(1f),
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Alfa"
                    )
                })
        }
        Text(
            text = "Alfa", textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()
        )

        Row(modifier = Modifier.padding(horizontal = 24.dp)) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(18.dp))
                    .size(56.dp)
                    .border(2.dp, Color.Green, shape = RoundedCornerShape(18.dp))
                    .background(Color.Blue)
                    .padding(8.dp), contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "User"
                )
            }

            Box(modifier = Modifier.width(16.dp))
            TextField(
                modifier = Modifier.weight(1f),
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(
                        text = "Alfa"
                    )
                })
            Box(modifier = Modifier
                .width(16.dp)
                .clickable { })
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(18.dp))
                    .size(56.dp)
                    .border(2.dp, Color.Green, shape = RoundedCornerShape(18.dp))
                    .background(Color.Blue)
                    .padding(8.dp), contentAlignment = Alignment.Center

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "User"
                )
            }
        }

        Text(text = "Alfa beta gamma",
            color = Color.White,
            modifier = Modifier.fillMaxWidth(), textAlign = TextAlign.Center)


        Row (modifier = Modifier.fillMaxWidth().padding(horizontal = 32.dp), verticalAlignment = Alignment.CenterVertically){
            Box(modifier = Modifier.height(2.dp).weight(1f).background(Color.White))
            Text(text = "Redes sociales", color = Color.White, modifier = Modifier.padding(horizontal = 24.dp))
            Box(modifier = Modifier.height(2.dp).weight(1f).background(Color.White))
        }

        Box(modifier = Modifier.weight(2f))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Mi boton")
        }
    }

}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Clase1Theme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun WhatsappPreview() {
    Clase1Theme {
        WhatsApp()
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    Clase1Theme {
        LoginScreen()
    }
}