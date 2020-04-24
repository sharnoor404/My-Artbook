package com.example.myartbook

import android.graphics.Bitmap

class Globals {
    companion object Chosen{
        var chosenImage:Bitmap?=null
        fun returnImage():Bitmap{
            return this.chosenImage!!
        }
    }
}