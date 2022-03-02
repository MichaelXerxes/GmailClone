package com.example.gmailclone.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.gmailclone.GmailApp
import com.example.gmailclone.models.DrawerBottomMenuData
import com.example.gmailclone.ui.theme.GmailCloneTheme

@Composable
fun HomeBottomMenu(){
   val itemsList= listOf(
       DrawerBottomMenuData.Mail,
       DrawerBottomMenuData.Meet)

    BottomNavigation(backgroundColor = Color.Gray, contentColor = Color.Black) {
        itemsList.forEach {

            BottomNavigationItem(selected = false,
                onClick = { /*TODO*/ },
                alwaysShowLabel = true,
                label={Text(text=it.title!!)},
                icon = { Icon(imageVector = it.icon!!,
                contentDescription = it.title)})

            }
        }
    }


