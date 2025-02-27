package com.clonemastodoncompose.ui.profileComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun FollowedByComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
            .padding(horizontal = 16.dp, vertical = 4.dp)
            .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.05f))
            .clickable {  /*Handle click action*/ },
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.wrapContentSize()) {
            Row {
                Box(
                    Modifier
                        .size(20.dp)
                        .background(Color.Green)
                )

                /* Image(
                     painter = painterResource(id = R.drawable.avatar1_placeholder),
                     contentDescription = null,
                     modifier = Modifier
                         .size(30.dp)
                         .graphicsLayer { rotationZ = -4f }
                 )*/
                Box(
                    Modifier
                        .size(20.dp)
                        .background(Color.Blue)
                )

                /*Image(
                    painter = painterResource(id = R.drawable.avatar2_placeholder),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .offset(x = (-10).dp)
                        .graphicsLayer { rotationZ = 2f }
                )*/
                Box(
                    Modifier
                        .size(20.dp)
                        .background(Color.Gray)
                )

                /* Image(
                     painter = painterResource(id = R.drawable.avatar3_placeholder),
                     contentDescription = null,
                     modifier = Modifier
                         .size(30.dp)
                         .offset(x = (-10).dp)
                         .graphicsLayer { rotationZ = -2f }
                 )*/
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "Followed by blah and blah", // TODO: dynamic text
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.weight(1f),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }
}


@Preview(showBackground = true)
@Composable
private fun FollowedByComponentPreview() {
    FollowedByComponent()
}