package com.clonemastodoncompose.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R

@Composable
fun SplashScreen(paddingValues: PaddingValues) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(id = R.drawable.splash_logo),
                contentDescription = null,
                modifier = Modifier.size(300.dp, 78.dp)
            )
            Spacer(modifier = Modifier.weight(1f))


            Box(Modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(R.drawable.splash_art_layer0),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                )
                Image(
                    painter = painterResource(R.drawable.splash_art_layer1),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterEnd)
                        .offset(y = (-20).dp)
                        .width(150.dp)
                        .height(176.dp)
                )

                Image(
                    painter = painterResource(R.drawable.splash_art_layer2),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(y = (-20).dp)
                        .width(150.dp)
                        .height(176.dp)
                )

                Image(
                    painter = painterResource(R.drawable.splash_art_layer3),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.BottomCenter)
                )
                Image(
                    painter = painterResource(R.drawable.splash_art_layer4),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .padding(bottom = 50.dp)
                        .offset(x = 0.dp - 80.dp, y = (-90).dp)
                        .align(Alignment.CenterStart)
                        .width(250.dp)
                        .height(176.dp)
                )

            }
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    Text(stringResource(id = R.string.join_default_server))
                }
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                ) {
                    Text(stringResource(id = R.string.pick_server))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    HorizontalDivider(
                        modifier = Modifier.weight(1f),
                        color = Color.White.copy(alpha = 0.7f)
                    )
                    Text(
                        text = stringResource(id = R.string.signup_or_login),
                        style = MaterialTheme.typography.labelLarge,
                        color = Color.White.copy(alpha = 0.7f),
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    HorizontalDivider(
                        modifier = Modifier.weight(1f),
                        color = Color.White.copy(alpha = 0.7f)
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    TextButton(onClick = {}) {
                        Text(stringResource(id = R.string.learn_more), color = Color.White)
                    }
                    TextButton(onClick = {}) {
                        Text(stringResource(id = R.string.log_in), color = Color.White)
                    }
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}


@Preview
@Composable
private fun SplashScreenPreview() {
    SplashScreen(PaddingValues())
}