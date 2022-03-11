package com.example.challenge2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.GridView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private var gridView: GridView? = null
    private var arrayList: ArrayList<GridItem>? = null
    private var gridAdapter: GridAdapter? = null
//    private var content: FrameLayout? = null
//
//    private val mOnNavigationItemSelectedListener =
//        BottomNavigationView.OnNavigationItemSelectedListener { item ->
//            when (item.itemId) {
//                R.id.it_beranda-> {
//                    val fragment = fragment_first()
//                    addFragment(fragment)
//                    return@OnNavigationItemSelectedListener true
//                }
//                R.id.it_promo-> {
//                    val fragment = fragment_second()
//                    addFragment(fragment)
//                    return@OnNavigationItemSelectedListener true
//                }
//            }
//            false
//        }
//
//    private fun addFragment(fragment: Fragment) {
//        supportFragmentManager
//            .beginTransaction()
//            .setCustomAnimations(
//                R.anim.design_bottom_sheet_slide_in,
//                R.anim.design_bottom_sheet_slide_out
////            )
//            .replace(R.id.main_container, fragment, fragment.javaClass.getSimpleName())
//            .commit()
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

//        gridView = findViewById(R.id.gvFoods)
//        arrayList = ArrayList()
//        arrayList = setDataList()
//        gridAdapter = GridAdapter(applicationContext, arrayList!!)
//        gridView?.adapter = gridAdapter


//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
//        val fragment = fragment_first.newInstance()
//        addFragment(fragment)
    }

//    private fun setDataList(): ArrayList<GridItem> {
//        var arrayList: ArrayList<GridItem> = ArrayList()
//
//        arrayList.add(GridItem(R.drawable.goride_vertical,""))
//        arrayList.add(GridItem(R.drawable.gocar_vertical,""))
//        arrayList.add(GridItem(R.drawable.gofood_vertical,""))
//        arrayList.add(GridItem(R.drawable.gosend_vertical,""))
//        arrayList.add(GridItem(R.drawable.gomart_vertical,""))
//        arrayList.add(GridItem(R.drawable.gopulsa_vertical,""))
//        arrayList.add(GridItem(R.drawable.goride_vertical,""))
//
//
//
//        return arrayList
//    }
}