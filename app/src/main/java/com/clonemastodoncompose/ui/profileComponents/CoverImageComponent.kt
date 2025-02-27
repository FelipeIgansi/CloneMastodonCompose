package com.clonemastodoncompose.ui.profileComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clonemastodoncompose.R

@Composable
fun CoverImageComponent() {
    Box(
        contentAlignment = Alignment.BottomEnd,
        modifier = Modifier
            .fillMaxWidth()
            .height(144.dp)
            .background(Color.LightGray)
    ) {
        /*Image(
            painter = painterResource(id = R.drawable.image_placeholder), // replace with your resource
            contentDescription = stringResource(id = R.string.profile_header),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(144.dp)
        )*/
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            ),
            shape = RoundedCornerShape(4.dp),
            contentPadding = PaddingValues(10.dp),
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                text = stringResource(id = R.string.follows_you)
                    .uppercase(),
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 14.sp,
            )
        }

    }
}


@Preview
@Composable
private fun CoverImageComponentPreview() {
    CoverImageComponent()
}