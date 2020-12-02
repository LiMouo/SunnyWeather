package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @Response:响应
 * @name:地名
 * @Location:经纬度
 * @address:地址
 * 数据模型
 */
class PlaceResponse {
    data class PlaceResponse(val status : String,val places : List<Place>)
    data class Place(val name : String,val location:Location,@SerializedName("formatted_address")val address:String)
    data class Location(val lng : String,val lat : String)
}