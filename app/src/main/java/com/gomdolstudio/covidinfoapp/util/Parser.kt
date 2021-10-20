package com.gomdolstudio.covidinfoapp.util

fun convertMarkDownToString(markDown: String): String{
    var convertedString = markDown.replace("<b>","")
    convertedString = convertedString.replace("</b>","")
    convertedString = convertedString.replace("&quot;","\"")
    return convertedString
}