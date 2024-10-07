package com.example.via_cep.presenter.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.via_cep.presenter.features.features.forms.screen.FormScreen

import com.example.via_cep.presenter.app.ui.theme.Via_cepTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Via_cepTheme {
                FormScreen()
                }
            }
        }
    }


