package com.clonemastodoncompose.ui

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R
import com.clonemastodoncompose.ui.theme.masterialDark_tertiaryContainer


// This composable represents the toolbar in the profile QR screen.
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileQrToolbar() {
    TopAppBar(
        title = { /* Add title or actions if needed */ },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Default.Close, null)
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(painterResource(R.drawable.ic_qr_code_20px), null)
            }
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp), // Using a default action bar size of 56dp
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Transparent
        )
    )
}


@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ProfileQRScreen(paddingValues: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(Color.Transparent)
    ) {
        ProfileQrToolbar()

        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(40.dp)
                        .background(Color.Blue)
                        .padding(10.dp)
                        .padding(top = 17.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f)
                    )


                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(30.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.boy),
                            contentDescription = "User Avatar",
                            modifier = Modifier
                                .size(20.dp)
                                .clip(RoundedCornerShape(10.dp))
                        )
                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = "Gargron",
                            style = MaterialTheme.typography.bodyMedium,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                        )
                        Spacer(modifier = Modifier.width(4.dp))

                        Text(
                            text = "mastodon.social",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White,
                            maxLines = 1,
                            modifier = Modifier
                                .clip(RoundedCornerShape(4.dp))
                                .background(
                                    color = masterialDark_tertiaryContainer
                                )
                                .padding(5.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(24.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Button(
                    onClick = { /* TODO: Implement share action */ },
                    modifier = Modifier
                        .weight(1f)
                        .height(40.dp)
                        .padding(start = 16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_share_20px),
                        contentDescription = "Share Icon",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Text(text = stringResource(id = R.string.share_user))
                }

                Button(
                    onClick = { /* TODO: Implement save action */ },
                    modifier = Modifier
                        .height(40.dp)
                        .padding(start = 16.dp),
                    contentPadding = PaddingValues(horizontal = 16.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_download_20px),
                        contentDescription = "Download Icon",
                        tint = MaterialTheme.colorScheme.onPrimary
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Text(text = stringResource(id = R.string.save))
                }
            }
        }
    }
}