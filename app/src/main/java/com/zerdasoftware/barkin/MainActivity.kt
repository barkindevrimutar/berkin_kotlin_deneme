package com.zerdasoftware.barkin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var count = 0

    private lateinit var barkin : PersonModel
    private lateinit var selin : PersonModel
    private var personList = ArrayList<PersonModel>()

    private lateinit var welcomeText : TextView
    private lateinit var fullNameTextView : TextView
    private lateinit var ageTextView : TextView
    private lateinit var jopTextView : TextView
    private lateinit var homelandTextView : TextView

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeText = findViewById(R.id.welcomeTextView)
        fullNameTextView = findViewById(R.id.fullNameTextView)
        ageTextView = findViewById(R.id.ageTextView)
        jopTextView = findViewById(R.id.jopTextView)
        homelandTextView = findViewById(R.id.homelandTextView)

        barkin = PersonModel(1,
            "Barkın Devrim",
            "Utar",
            "Dentist Assistant",
            "07/11/1999",
            "ÇANAKKALE")

        selin = PersonModel(2,
            "Selin",
            "Doğan",
            "Student",
            "28/09/1999",
            "BAYBURT")

        personList.add(barkin)
        personList.add(selin)



        welcomeText.setOnClickListener {
            count = 0
            setTextView()
            fullNameTextView.visibility = View.VISIBLE
        }

        fullNameTextView.setOnClickListener {
            setTextView()
            ageTextView.visibility = View.VISIBLE
        }

        ageTextView.setOnClickListener {
            setTextView()
            jopTextView.visibility = View.VISIBLE
        }

        jopTextView.setOnClickListener {
            setTextView()
            homelandTextView.visibility = View.VISIBLE
        }

        homelandTextView.setOnClickListener {
            setTextView()
            count = 1
        }

    }

    @SuppressLint("SetTextI18n")
    fun setTextView(){
        fullNameTextView.text = "${personList[count].name} ${personList[count].surname}"
        ageTextView.text = personList[count].birthDay
        jopTextView.text = personList[count].job
        homelandTextView.text = personList[count].homeland
    }
}