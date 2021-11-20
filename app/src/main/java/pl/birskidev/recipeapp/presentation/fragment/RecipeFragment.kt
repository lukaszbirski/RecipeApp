package pl.birskidev.recipeapp.presentation.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import pl.birskidev.recipeapp.presentation.viewmodel.RecipeListViewModel

@AndroidEntryPoint
class RecipeFragment: Fragment() {

    private val viewModel : RecipeListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply{
            setContent {
                DisplayView()
            }
        }
    }

    @Composable
    fun DisplayView() {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "This is Recipe Fragment", fontSize = 24.sp)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        DisplayView()
    }
}