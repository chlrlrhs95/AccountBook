package com.example.accountbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        bottomTabListener()
    }

    /**
     * 바텀 탭 리스너 함수로, 바텀 탭 변화를 감지
     * 탭이 변화할 떄 필요한 코드는 이곳에서 작성
     * */
    private fun bottomTabListener() {
        val bnvMain = findViewById<BottomNavigationView>(R.id.bnv_main)

        bnvMain.setOnItemSelectedListener { item ->
            setFragment(
                when (item.itemId) {
                    R.id.tab_main -> {
                        MainFragment()
                    }
                    R.id.tab_list -> {
                        ListFragment()
                    }
                    else -> {
                        MainFragment()
                    }
                }
            )
            true
        }
        // bnvMain이 시작될 때 바로 tab_main의 아이디가 선택되도록 설정
        bnvMain.selectedItemId = R.id.tab_main

    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fl_con, fragment).commit()
    }
}
