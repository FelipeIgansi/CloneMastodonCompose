package com.clonemastodoncompose.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R


@Composable
fun TimelineScreen(paddingValues: PaddingValues) {
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ) {
            Button(
                onClick = { /* Ação do botão de novos posts */ },
                modifier = Modifier.padding(8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_arrow_upward_20px),
                    contentDescription = null
                )
                Text(text = stringResource(id = R.string.see_new_posts))
            }
        }
        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            // Aqui você pode preencher a lista com itens
        }

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.BottomEnd
        ) {
            FloatingActionButton(
                onClick = { /* Ação do FAB */ },
                containerColor = MaterialTheme.colorScheme.primary,
                modifier = Modifier
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_edit_24px),
                    contentDescription = stringResource(id = R.string.new_post)
                )
            }
        }


    }
}

@Preview
@Composable
private fun TimelineScreenPreview() {
    TimelineScreen(PaddingValues())
}