package com.lucas.animacao.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

    @Composable
    fun BoxComponent(
        visible: Boolean,
        enter: EnterTransition,
        exit: ExitTransition
    ) {
        AnimatedVisibility(
            visible = visible,
            enter = enter,
            exit = exit
        ) {
            Box(modifier = Modifier.size(200.dp).background(color = Color.Red))
        }
    }

