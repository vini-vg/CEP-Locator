package com.example.via_cep.components

import android.widget.Space
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AdressCard(
    modifier: Modifier = Modifier
){
    Card(
        modifier = modifier
            .padding(16.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 8.dp
        ),
        content = {
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){

                    Text(
                        text = "Meu endereço",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )

                    MenuOption()

                }

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Avenida Não sei oq não sei oq la\nCuritiba/PR - 098678622",
                    fontSize = 16.sp,
                    color = Color.Gray

                )

            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun AdressCardPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ){
        AdressCard()
    }
}