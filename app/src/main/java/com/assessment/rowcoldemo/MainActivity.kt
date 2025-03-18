package com.assessment.rowcoldemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.assessment.rowcoldemo.ui.theme.RowColDemoTheme
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.LastBaseline
import androidx.compose.ui.layout.FirstBaseline

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RowColDemoTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
//    Row(modifier) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Column(modifier) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Column(modifier) {
//        Row {
//            Column {
//                TextCell("1")
//                TextCell("2")
//                TextCell("3")
//            }
//            Column {
//                TextCell("4")
//                TextCell("5")
//                TextCell("6")
//            }
//            Column {
//                TextCell("7")
//                TextCell("8")
//            }}
//        Row {
//            TextCell("9")
//            TextCell("10")
//            TextCell("11")
//        }
//    }
//    Row(verticalAlignment = Alignment.CenterVertically,
//        modifier = modifier.size(width = 400.dp, height = 200.dp)) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Column(horizontalAlignment = Alignment.End,
//        modifier = modifier.width(250.dp)) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Row( horizontalArrangement = Arrangement.End,
//        modifier = modifier.size(width = 400.dp, height = 200.dp) ) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Column( verticalArrangement = Arrangement.Bottom ,
//        modifier = modifier.height(400.dp)) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Row(horizontalArrangement = Arrangement.SpaceEvenly ,
//        modifier = modifier.width(1000.dp)) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//    Row(horizontalArrangement = Arrangement.SpaceBetween ,
//        modifier = modifier.width(1000.dp)) {
//        TextCell("1")
//        TextCell("2")
//        TextCell("3")
//    }
//     Row(horizontalArrangement = Arrangement.SpaceAround ,
//         modifier = modifier.width(1000.dp)) {
//         TextCell("1")
//         TextCell("2")
//         TextCell("3")
//     }
//    Row(modifier = modifier.height(300.dp)) {
//        TextCell("1" , Modifier.align(Alignment.Top) )
//        TextCell("2" , Modifier.align(Alignment.CenterVertically) )
//        TextCell("3" , Modifier.align(Alignment.Bottom) )
//    }
//    Row {
//        Text(
//            text = "Large Text",
//            Modifier.alignByBaseline(),
//            fontSize = 40.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = "Small Text",
//            Modifier.alignByBaseline(),
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//    }
//    Row {
//        Text(
//            text = " Large Text\n\nMore Text ",
//            Modifier .alignBy(LastBaseline) ,
//            fontSize = 40.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = "Small Text",
//            Modifier .alignByBaseline() ,
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold,
//        )
//    }
//    Row {
//        Text(
//            text = "Large Text\n\nMore Text",
//            Modifier.alignBy( FirstBaseline ),
//            fontSize = 40.sp,
//            fontWeight = FontWeight.Bold
//        )
//        Text(
//            text = "Small Text",
//            modifier = Modifier.paddingFrom(
//                alignmentLine = FirstBaseline, before = 80.dp, after = 0.dp),
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold
//        )
//    }
    Row {
        TextCell("1", Modifier.weight(weight = 0.2f, fill = true))
        TextCell("2", Modifier.weight(weight = 0.4f, fill = true))
        TextCell("3", Modifier.weight(weight = 0.3f, fill = true))
    }
}

@Composable
fun TextCell(text: String, modifier: Modifier = Modifier) {
    val cellModifier = modifier
        .padding(4.dp)
        .size(100.dp, 100.dp)
        .border(width = 4.dp, color = Color.Black)
    Text(text = text, cellModifier.then(modifier),
        fontSize = 80.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RowColDemoTheme {
        MainScreen()
    }
}