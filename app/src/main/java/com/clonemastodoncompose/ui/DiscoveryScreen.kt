package com.clonemastodoncompose.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R


@Composable
fun DiscoveryScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface)
        ) {

            TextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                shape = CircleShape,
                placeholder = {
                    Text(
                        text = stringResource(id = R.string.search_mastodon),
                        color = Color.White
                    )

                },
                trailingIcon = {
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_search_24px),
                            contentDescription = stringResource(id = R.string.back)
                        )
                    }
                },
                leadingIcon = {
                    IconButton(onClick = { /* TODO */ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_qr_code_scanner_24px),
                            contentDescription = stringResource(id = R.string.scan_qr_code)
                        )
                    }
                }
            )


        }
        Column(modifier = Modifier.fillMaxSize()) {
            var selectedTab by remember { mutableIntStateOf(0) }
            val tabs = listOf("Publicações", "Hashtags", "Noticias", "Para você")
            TabRow(selectedTabIndex = selectedTab) {
                tabs.forEachIndexed { index, tab ->
                    Tab (
                        selected = selectedTab == index,
                        onClick = {selectedTab = index},
                        text = { Text(tab) },
                    )
                }
            }
            HorizontalDivider(thickness = 1.dp, color = Color.Gray)
            Box(modifier = Modifier.weight(1f)) {
                // Simular ViewPager2
            }
        }
    }
}

@Preview
@Composable
private fun DiscoveryScreenPreview() {
    DiscoveryScreen(PaddingValues())
}