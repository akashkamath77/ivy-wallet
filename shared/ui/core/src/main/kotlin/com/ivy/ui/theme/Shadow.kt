package com.ivy.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp

/**
 * Subtle shadow elevation for minimalist design
 * Used for cards, buttons, and other elevated surfaces
 */
object IvyShadows {
    // Subtle shadow - 2dp elevation
    val subtle = 2.dp
    
    // Light shadow - 4dp elevation
    val light = 4.dp
    
    // Medium shadow - 8dp elevation
    val medium = 8.dp
}

/**
 * Apply subtle box shadow to a modifier
 */
fun Modifier.ivyCardShadow() = this.shadow(
    elevation = IvyShadows.subtle,
    shape = RoundedCornerShape(12.dp),
    ambientColor = ShadowColor,
    spotColor = ShadowColor
)

/**
 * Apply light box shadow to a modifier
 */
fun Modifier.ivyLightShadow() = this.shadow(
    elevation = IvyShadows.light,
    shape = RoundedCornerShape(12.dp),
    ambientColor = ShadowColor,
    spotColor = ShadowColor
)

/**
 * Apply medium box shadow to a modifier
 */
fun Modifier.ivyMediumShadow() = this.shadow(
    elevation = IvyShadows.medium,
    shape = RoundedCornerShape(16.dp),
    ambientColor = ShadowColor,
    spotColor = ShadowColor
)

/**
 * Card elevation for minimalist design
 */
object IvyCardElevation {
    @Composable
    fun default() = CardDefaults.cardElevation(
        defaultElevation = IvyShadows.subtle,
        pressedElevation = IvyShadows.light,
        focusedElevation = IvyShadows.light,
        hoveredElevation = IvyShadows.light,
        draggedElevation = IvyShadows.medium
    )

    @Composable
    fun elevated() = ElevatedCardDefaults.elevatedCardElevation(
        defaultElevation = IvyShadows.light,
        pressedElevation = IvyShadows.medium,
        focusedElevation = IvyShadows.light,
        hoveredElevation = IvyShadows.medium,
        draggedElevation = IvyShadows.medium
    )
}
