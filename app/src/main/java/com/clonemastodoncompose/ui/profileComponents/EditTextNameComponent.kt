package com.clonemastodoncompose.ui.profileComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R

@Composable
fun EditTextNameComponent() {
    OutlinedTextField(
        value = "Eugen",
        onValueChange = {  /*handle text change */ },
        label = { Text(text = stringResource(id = R.string.display_name)) },
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(horizontal = 16.dp)
    )
}