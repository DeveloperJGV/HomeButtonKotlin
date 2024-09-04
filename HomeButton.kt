    package com.dacomsa.fritec2019.presentation.ui.main

    import androidx.compose.foundation.background
    import androidx.compose.foundation.layout.*
    import androidx.compose.foundation.shape.CircleShape
    import androidx.compose.foundation.shape.RoundedCornerShape
    import androidx.compose.material.icons.Icons
    import androidx.compose.material.icons.filled.DirectionsCar
    import androidx.compose.material3.*
    import androidx.compose.runtime.Composable
    import androidx.compose.ui.Alignment
    import androidx.compose.ui.Modifier
    import androidx.compose.ui.graphics.Color
    import androidx.compose.ui.graphics.vector.ImageVector
    import androidx.compose.ui.res.colorResource
    import androidx.compose.ui.res.stringResource
    import androidx.compose.ui.tooling.preview.Preview
    import androidx.compose.ui.unit.dp
    import androidx.compose.ui.unit.sp
    import com.dacomsa.fritec2019.R
    import com.dacomsa.fritec2019.presentation.theme.Fritec2024Theme
    import androidx.compose.foundation.clickable
    import androidx.compose.foundation.isSystemInDarkTheme
    import androidx.compose.ui.graphics.painter.Painter
    import com.dacomsa.fritec2019.presentation.theme.SplashScreenBackgroundLight


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun HomeButton(
        text: String,
        icon: Painter,
        modifier: Modifier = Modifier,
        onClick: () -> Unit
    ) {
        val isDarkTheme = isSystemInDarkTheme()

        Box(
            modifier = modifier
                .width(120.dp)
                .height(160.dp)
                .background(
                    color = if (isDarkTheme) MaterialTheme.colorScheme.surface else MaterialTheme.colorScheme.secondary,
                    shape = RoundedCornerShape(16.dp)
                )
                .clickable(onClick = onClick)
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(64.dp)
                        .background(
                            color = if (isDarkTheme) SplashScreenBackgroundLight else Color.White, 
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                  
                    Icon(
                        painter = icon,
                        contentDescription = text,
                        tint = Color.Unspecified
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = text,
                    color = if (isDarkTheme) MaterialTheme.colorScheme.onPrimary else Color.Black,
                    fontSize = 16.sp
                )
            }
        }
    }
