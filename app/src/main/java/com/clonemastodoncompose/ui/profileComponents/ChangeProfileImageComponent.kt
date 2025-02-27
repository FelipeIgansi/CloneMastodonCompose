package com.clonemastodoncompose.ui.profileComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R


@Composable
fun ChangeProfileImageComponent() {
    OutlinedButton(
        onClick = {/*TODO()*/ },
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(
            width = 2.dp,
            color = if (isSystemInDarkTheme()) Color.White else Color.Black
        ),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Gray
        ),
        modifier = Modifier
            .size(104.dp)
            .offset(x = 12.dp, y = 0.dp - 50.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.boy), // replace with actual avatar resource
            contentDescription = stringResource(id = R.string.profile_picture),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(96.dp)
//                            .align(Alignment.Center)
                .clip(CircleShape)
        )
    }
}

@Preview
@Composable
private fun ChangeProfileImageComponentPreview() {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        ChangeProfileImageComponent()
    }
}