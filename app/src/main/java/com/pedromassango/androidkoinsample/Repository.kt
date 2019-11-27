package com.pedromassango.androidkoinsample

import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    private lateinit var apiInterface: APIInterface
    var ss: data? = null
    fun getMessage(): String {
        var text: Int? = null
        var displayResponse = ""
        var messageData: MutableLiveData<String>? = null

        apiInterface = APIClient.client!!.create(APIInterface::class.java!!)
        var a = ""
        var sss = mutableListOf<data.Datum>()
        var ssss = mutableListOf<data.Datum>()
//        val call = apiInterface.doGetListResources()
//
//        call.enqueue(object : retrofit2.Callback<data> {
//            override fun onFailure(call: Call<data>?, t: Throwable?) {
//                Log.e("df", t.toString())
//            }
//
//            override fun onResponse(call: Call<data>?, response: Response<data>?) {
//                val resource = response!!.body()
//                Log.e("val",response.body().toString())
//                 ss = resource
//
//            }
//        })
//        return ss
        val call = apiInterface.doGetListResources()
        call.enqueue(object : Callback<data> {
            override fun onResponse(call: Call<data>, response: Response<data>) {
                val resource = response.body()
                a = resource.page.toString()
            }

            override fun onFailure(call: Call<data>, t: Throwable) {
                call.cancel()
            }
        })
        return a
    }
}