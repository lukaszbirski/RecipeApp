package pl.birskidev.recipeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.birskidev.recipeapp.ui.theme.RecipeAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayView()
        }
    }
}

@Composable
fun DisplayView() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Hey look some text")
        Spacer(modifier = Modifier.padding(top = 10.dp))
        Button(onClick = {}) {
            Text(text = "A BUTTON")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DisplayView()
}