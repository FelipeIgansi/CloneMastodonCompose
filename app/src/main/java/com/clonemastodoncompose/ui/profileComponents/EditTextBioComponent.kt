package com.clonemastodoncompose.ui.profileComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R


@Composable
fun EditTextBioComponent() {
    OutlinedTextField(
        value = "Founder, CEO and lead developer @Mastodon, Germany.", // TODO: dynamic value
        onValueChange = {  /*handle text change */ },
        label = { Text(text = stringResource(id = R.string.profile_bio)) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    )
}