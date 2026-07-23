package com.ivy.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Light Theme Color Scheme
private val LightColorScheme = lightColorScheme(
    primary = Black,
    onPrimary = White,
    primaryContainer = LightGray,
    onPrimaryContainer = Black,
    secondary = CharcoalGray,
    onSecondary = White,
    secondaryContainer = MediumGray,
    onSecondaryContainer = Black,
    tertiary = DarkGray,
    onTertiary = White,
    tertiaryContainer = BorderGray,
    onTertiaryContainer = Black,
    error = ErrorRed,
    onError = White,
    errorContainer = Color(0xFFFFEBEE),
    onErrorContainer = ErrorRed,
    background = White,
    onBackground = TextPrimary,
    surface = SurfaceLight,
    onSurface = TextPrimary,
    surfaceVariant = SurfaceVariant,
    onSurfaceVariant = TextSecondary,
    outline = BorderGray,
    outlineVariant = MediumGray,
    scrim = Color.Black.copy(alpha = 0.32f)
)

// Dark Theme Color Scheme
private val DarkColorScheme = darkColorScheme(
    primary = White,
    onPrimary = Black,
    primaryContainer = CharcoalGray,
    onPrimaryContainer = White,
    secondary = MediumGray,
    onSecondary = Black,
    secondaryContainer = DarkGray,
    onSecondaryContainer = White,
    tertiary = LightGray,
    onTertiary = Black,
    tertiaryContainer = CharcoalGray,
    onTertiaryContainer = LightGray,
    error = ErrorRed,
    onError = White,
    errorContainer = Color(0xFF5F2C2C),
    onErrorContainer = Color(0xFFFFB4AB),
    background = Black,
    onBackground = White,
    surface = CharcoalGray,
    onSurface = White,
    surfaceVariant = Color(0xFF3A3A3A),
    onSurfaceVariant = MediumGray,
    outline = DarkGray,
    outlineVariant = CharcoalGray,
    scrim = Color.Black.copy(alpha = 0.6f)
)

@Composable
fun IvyWalletTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        shapes = IvyShapes,
        typography = IvyTypography,
        content = content
    )
}
