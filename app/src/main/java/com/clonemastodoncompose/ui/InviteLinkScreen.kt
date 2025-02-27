package com.clonemastodoncompose.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.clonemastodoncompose.R
import com.clonemastodoncompose.ui.theme.CloneMastodonComposeTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InviteLinkScreen(padding: PaddingValues) {
    var inviteLink by remember { mutableStateOf("") }
    var showAlertDialog by remember { mutableStateOf(true) }



    Box(Modifier.padding(padding)) {
        if (showAlertDialog) {
            AlertDialog(
                title = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_confirmation_number_24px),
                            contentDescription = null,
                            tint = MaterialTheme.colorScheme.secondary, // matches ?colorM3Secondary
                            modifier = Modifier.padding(bottom = 16.dp)
                        )
                        Text(
                            text = stringResource(id = R.string.enter_invite_link),
                            style = MaterialTheme.typography.headlineSmall, // equivalente a m3_headline_small
                            color = MaterialTheme.colorScheme.onSurface,     // equivalent to m3_headline_small
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                },
                onDismissRequest = { showAlertDialog = false },
                dismissButton = {
                    OutlinedButton(
                        onClick = { showAlertDialog = false },
                        border = BorderStroke(width = 1.dp, color = Color.Red),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text("Exit")
                    }
                },
                confirmButton = {
                    Button(
                        onClick = { /* TODO(Action) */ },
                        colors = ButtonDefaults.outlinedButtonColors(
                            containerColor = Color.Blue,
                            contentColor = Color.White
                        ),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text("Confirm")
                    }
                },
                modifier = Modifier,
                text = {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(24.dp)
                    ) {
                        // First section: Icon above text (drawableTop in XML)
                        Spacer(modifier = Modifier.height(16.dp))

                        // Segunda seção: Subtítulo
                        Text(
                            text = stringResource(id = R.string.need_invite_to_join_server),
                            style = MaterialTheme.typography.bodyMedium, // equivalent to m3_body_medium
                            color = MaterialTheme.colorScheme.onSurfaceVariant, // ?colorM3OnSurfaceVariant
                            modifier = Modifier.fillMaxWidth()
                        )

                        Spacer(modifier = Modifier.height(16.dp))

                        // Third section: Box containing text field, label, supporting text and clear button
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(76.dp)
                        ) {
                            // Input field (equivalent to EditText)
                            OutlinedTextField(
                                value = inviteLink,
                                onValueChange = { inviteLink = it },
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .align(Alignment.Center),
                                label = {
                                    Text(
                                        text = stringResource(id = R.string.server_url),
                                        style = MaterialTheme.typography.bodyMedium, // equivalent to m3_body_small
                                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                                        maxLines = 1,
                                    )
                                },
                                placeholder = {
                                    Text(
                                        text = "example.social/invite/AbC123",
                                        style = MaterialTheme.typography.bodyMedium
                                    )
                                },
                                textStyle = MaterialTheme.typography.bodyLarge.copy(color = MaterialTheme.colorScheme.onSurface),
                                singleLine = true,
                                keyboardOptions = KeyboardOptions(
                                    keyboardType = KeyboardType.Uri,
                                    imeAction = ImeAction.Done
                                ),
                                trailingIcon = {
                                    IconButton(
                                        onClick = { inviteLink = "" },
                                        modifier = Modifier
                                            .size(48.dp)
                                            .padding(top = 4.dp)
                                            .align(Alignment.TopEnd)
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_m3_cancel),
                                            contentDescription = R.string.clear.toString()
                                        )
                                    }
                                },
                                // If you have a custom background (bg_m3_filled_text_field), you can apply it with Modifier.background()
                                colors = TextFieldDefaults.colors(
                                    focusedContainerColor = Color.Transparent
                                )
                            )
                            // Clear button (equivalent to ImageButton)

                        }
                    }
                }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CloneMastodonComposeTheme {
        InviteLinkScreen(PaddingValues())
    }
}