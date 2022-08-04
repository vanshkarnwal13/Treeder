package com.brocode.carbon_footprint_app.views

import android.content.Context
import android.opengl.Visibility
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.brocode.carbon_footprint_app.R
import com.brocode.carbon_footprint_app.models.ApiHolder
import com.brocode.carbon_footprint_app.models.Food
import com.brocode.carbon_footprint_app.models.Result
import kotlinx.android.synthetic.main.layout_detect.*
import kotlinx.android.synthetic.main.layout_detect.view.*
import okhttp3.ResponseBody
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class DetectFragment() : Fragment() {
    constructor(context: Context) : this()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root=inflater.inflate(R.layout.layout_detect, container, false)

        val retrofit=Retrofit.Builder()
            .baseUrl("https://parcus.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val apiHolder=retrofit.create(ApiHolder::class.java)
        val call=apiHolder.getCarbon(Food(root.food_name.text.toString()))

        root.capture2.setOnClickListener {

            progress_bar.visibility=View.VISIBLE
            call.enqueue(object: Callback<Result> {
                override fun onFailure(call: Call<Result>, t: Throwable) {
                    Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
                    root.progress_bar.visibility=View.INVISIBLE
                }

                override fun onResponse(call: Call<Result>, response: Response<Result>) {
                    Toast.makeText(context, response.message(), Toast.LENGTH_SHORT).show()
                    root.progress_bar.visibility=View.INVISIBLE

                    root.imageView.visibility=View.VISIBLE

                    val text="Your food contains ${response.body()?.co2PerServing} carbon per serving."
                    root.result.text=text
                }
            })
        }

        return root
    }
}