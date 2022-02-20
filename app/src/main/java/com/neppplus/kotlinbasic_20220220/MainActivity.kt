package com.neppplus.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
//주석 달기 컨트롤 + 슬래시
//        btnLog 버튼이 눌리면 해야할 일을 지정.
        btnLog.setOnClickListener {
//            로그 버튼이 눌릴때마다 실행될 코드 { }

//            로그를 찍어보자.
            Log.d("메인화면","로그 버튼 눌림")
            Log.e("메인화면","e로 로그 찍어보기")
        }

        btnToast.setOnClickListener { 
//            토스트 띄워보자 
            Toast.makeText(this, "토스트 버튼이 눌린", Toast.LENGTH_SHORT).show()
            
        }
        btnvariablePractice.setOnClickListener {

            var myName : String // 내용 변경 가능

            val friendName : String  // 한번 대입한 값으로 고정

//        myName에는 내이름 넣고, friendName에는 친구 이름

            myName = "최다영"
            friendName = "최진화"
//        내이름 친구 이름 다시 대입(데이터 변경)

            myName = "최다영" // 추가로 다시 대입해도 됨. var
//        friendName = "조상민" // 한번 넣은 걸로 계속 사용


            Toast.makeText(this, myName, Toast.LENGTH_SHORT).show()

        }

        btnConditionPractice.setOnClickListener {
            val userAge = 10

            if(userAge >= 20) {
                Toast.makeText(this,"성인입니다.",Toast.LENGTH_SHORT).show()

            }

            else if (userAge >=17) {
                Toast.makeText(this,"고등학생입니다.",Toast.LENGTH_SHORT).show()

            }

            else if(userAge >= 14) {
                Toast.makeText(this,"중학생입니다.", Toast.LENGTH_SHORT).show()

            }

            else {
                Toast.makeText(this,"미성년자입니다.",Toast.LENGTH_SHORT).show()
            }
        }

        btnConditionPractice2.setOnClickListener {

            val salary = 4000
            val minutes = 50
            val overWork = false

//            기준1) 연봉이 5천 이상이면 ok
            if(salary >= 5000) {
                Toast.makeText(this,"연봉이 5천이상", Toast.LENGTH_SHORT).show()
            }

            if(!overWork) { // overWork 변수에 true 있을 때만 실행 => ! 넣어서 야근하지 않으면
                Toast.makeText(this,"야근을 안함", Toast.LENGTH_SHORT).show()

            }
//            기준 3. 연봉 4000이상, 거리 30분 이내

            if(salary >= 4000 && minutes < 30) {
                Toast.makeText(this,"연봉 AND 출퇴근 시간 OK", Toast.LENGTH_SHORT).show()
            }

            if(salary >= 5000 || minutes < 60) {
                Toast.makeText(this,"연봉 OR 출퇴근 시간 OK", Toast.LENGTH_SHORT).show()
            }

        }

        btnCalaulateAge.setOnClickListener {
//            1. edtBirthYear 입령된 값을 받아오기 => 변수에 저장해두기
            val inputBirthYear = edtBirthYear.text.toString()

            Log.d("입력된 년도",inputBirthYear)





        }



    }

}