package com.iamgusto.sample.slider.manenos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SliderManenos() {
    val names = mutableListOf(
        "Matthew", "Mark", "Luke", "John", "Acts of Apostles",
        "Romans", "1 Corinthians", "2 Corinthians", "Galatians", "Ephesians"
    )
    var mutableIndex by remember { mutableStateOf(0) }

    fun increaseMutableIndex() {
        mutableIndex = (mutableIndex + 1) % names.size
    }

    fun decreaseMutableIndex() {
        mutableIndex = (mutableIndex + names.size - 1) % names.size
    }
    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(names.get(mutableIndex))
        Row {
            Button(onClick = { decreaseMutableIndex() }) {
                Text("Previous")
            }
            Spacer(modifier = Modifier.width(10.dp))
            Button(onClick = { increaseMutableIndex() }) {
                Text("Next")
            }
        }
    }
}



