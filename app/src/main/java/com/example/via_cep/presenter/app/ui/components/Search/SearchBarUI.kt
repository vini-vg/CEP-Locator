package com.example.via_cep.presenter.app.ui.components.Search

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBarUI(
    modifier: Modifier = Modifier,
    query: String = "",
    placeholder: String = "",
    onQueryChange: (String) -> Unit
) {

    var active by remember {
        mutableStateOf(false)
    }
    SearchBar(
        modifier = Modifier,
        query = query,
        onQueryChange = {
            onQueryChange("")
        } ,
        onSearch = {} ,
        active = false,
        onActiveChange = {
        },
        placeholder = {
            Text(text = placeholder,
                color = Color.Gray)
        },
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null,
                tint = Color.Gray
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = null,
                modifier = Modifier.clickable {
                    onQueryChange("")
                },
                tint = Color.Gray
            )
        },
        shape = RoundedCornerShape(16.dp),
        content = {

    }

    )
}

@Preview(showBackground = true)
@Composable
private fun SearchBarUIPreview() {
    
    var query by remember {
        mutableStateOf("valor inicial")
    }

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        SearchBarUI(
            query = query ,
            placeholder = "Ex Joâo Negrao",
            onQueryChange = {
                query = it
            }
        )

    }
}