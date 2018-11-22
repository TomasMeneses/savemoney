package com.example.tomas.savemoney

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val listView = findViewById<ListView>(R.id.ListaPrincipal)

        listView.adapter = MyCustomAdapter(this)

        imageViewAdd.setOnClickListener {
            val i = Intent(this, KeyboardActivity::class.java)
            startActivity(i)
        }

        imageViewPerfil.setOnClickListener {
            val j = Intent(this, PerfilActivity::class.java)
            startActivity(j)
        }
    }

    private class MyCustomAdapter(context: Context): BaseAdapter(){

        private val mContext: Context

        init {
            mContext = context
        }

        override fun getCount(): Int {
            return 5
        }

        override fun getItem(position: Int): Any {
            return "Teste"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
            val layoutInflater = LayoutInflater.from(mContext)
            val rowMain = layoutInflater.inflate(R.layout.receitas_despesas, viewGroup, false)
            return rowMain

//            val textView = TextView(mContext)
//            textView.text = "Essa é minha linha"
//            return textView
        }
    }
}
