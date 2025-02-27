package com.clonemastodoncompose.ui

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
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.clonemastodoncompose.R
import com.clonemastodoncompose.ui.profileComponents.BasicUserInformationComponent
import com.clonemastodoncompose.ui.profileComponents.ChangeProfileImageComponent
import com.clonemastodoncompose.ui.profileComponents.CoverImageComponent
import com.clonemastodoncompose.ui.profileComponents.EditTextBioComponent
import com.clonemastodoncompose.ui.profileComponents.EditTextNameComponent
import com.clonemastodoncompose.ui.profileComponents.FollowedByComponent
import com.clonemastodoncompose.ui.profileComponents.FollowersCountComponent
import com.clonemastodoncompose.ui.profileComponents.FollowingCountComponent
import com.clonemastodoncompose.ui.profileComponents.TableComponent


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(paddingValues: PaddingValues) {

    val editProfileInfos by remember { mutableStateOf(false) }
    val isActionInProgress by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
    ) {
        Column {

            Column(modifier = Modifier.fillMaxWidth()) {
                CoverImageComponent()

                Column {
                    Row {
                        ChangeProfileImageComponent()

                        Spacer(Modifier.width(15.dp))

                        BasicUserInformationComponent()

                    }
                    Column(
                        modifier = Modifier
                            .offset(y = 0.dp - 50.dp)
                    ) {
                        Text(
                            text = "Founder, CEO and lead developer @Mastodon, Germany.",
                            style = MaterialTheme.typography.bodyMedium.copy(fontSize = 16.sp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 8.dp)
                        )


                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 8.dp, vertical = 4.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            FollowersCountComponent()
                            FollowingCountComponent()
                        }


                        FollowedByComponent()


                        if (editProfileInfos) {
                            EditTextNameComponent()
                            EditTextBioComponent()
                        }


                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp, vertical = 8.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Box(
                                modifier = Modifier.weight(1f)
                            ) {
                                Button(
                                    onClick = {  /*Save changes action*/ },
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(40.dp)
                                ) {
                                    Text(text = stringResource(id = R.string.save_changes))
                                }
                                if (isActionInProgress) {
                                    CircularProgressIndicator(
                                        modifier = Modifier
                                            .align(Alignment.Center)
                                            .size(24.dp),
                                        strokeWidth = 2.dp
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(8.dp))
                            IconButton(
                                onClick = {  /*QR code action*/ },
                                modifier = Modifier.size(36.dp)
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.ic_qr_code_20px),
                                    contentDescription = stringResource(id = R.string.qr_code),
                                    tint = MaterialTheme.colorScheme.onSurface,
                                    modifier = Modifier.padding(9.dp)
                                )
                            }
                        }

                        TableComponent()
                    }
                }
            }
        }

        FloatingActionButton(
            onClick = { /* New post action */ },
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(end = 16.dp, bottom = 16.dp),
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            elevation = FloatingActionButtonDefaults.elevation(6.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_edit_24px),
                contentDescription = stringResource(id = R.string.new_post)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun ProfileScreenPrev() {
    ProfileScreen(PaddingValues())
}