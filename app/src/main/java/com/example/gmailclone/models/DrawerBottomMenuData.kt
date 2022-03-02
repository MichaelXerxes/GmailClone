package com.example.gmailclone.models



import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.VideoCall
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DrawerBottomMenuData(
    val icon: ImageVector?=null, val title:String?=null) {

    object Mail : DrawerBottomMenuData( icon = Icons.Outlined.Mail,"Mail")
    object Meet : DrawerBottomMenuData(icon = Icons.Outlined.VideoCall, "Meet")
}