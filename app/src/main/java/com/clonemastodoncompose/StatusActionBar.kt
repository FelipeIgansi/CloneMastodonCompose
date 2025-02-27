package com.clonemastodoncompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StatusActionBar(paddingValues: PaddingValues) {
    Box(
        Modifier
            .padding(paddingValues)
            .fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        // Outer Row container equivalent to a horizontal LinearLayout
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(42.dp)
                .padding(bottom = 8.dp, start = 8.dp, end = 8.dp)
        ) {
            // Reply button container (equivalent to FrameLayout with a background)
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray
                )
            ) {
                // Row to align the icon and text similar to drawableStart
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_reply),
                        contentDescription = "Reply Icon",
                        tint = MaterialTheme.colorScheme.outline
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "123", // Preview text
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.outline
                    )
                }
            }

            // Spacer with weight to distribute extra space
            Spacer(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
            // Boost button container
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_repeat_selector),
                        contentDescription = "Boost Icon",
                        tint = MaterialTheme.colorScheme.outline
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "123", // Preview text
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.outline
                    )
                }
            }
            // Spacer with weight to distribute extra space
            Spacer(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
            // Favorite button container

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.LightGray
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_star_selector),
                        contentDescription = "Favorite Icon",
                        tint = MaterialTheme.colorScheme.outline
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        text = "123", // Preview text
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.outline
                    )
                }
            }

            // Spacer with weight to distribute extra space
            Spacer(
                modifier = Modifier
                    .weight(1f)
                    .height(1.dp)
            )
            // Share button container

            IconButton (
                onClick = {},
            ) {

                Icon(
                    painter = painterResource(id = R.drawable.ic_share_20px),
                    contentDescription = "Share Icon",
                    tint = MaterialTheme.colorScheme.outline
                )
            }
        }
    }

}


@Preview
@Composable
private fun StatusActioBarPrev() {
    StatusActionBar(PaddingValues())
}