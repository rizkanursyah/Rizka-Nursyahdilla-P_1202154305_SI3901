package com.example.android.rizkanursyahdillap_1202154305_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Food, et_Portion; //untuk deklarasi objek
    Intent intent;
    String restaurant, menu;
    int portion;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // method yang pertama kali dijalankan ketika activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_Food = (EditText)findViewById(R.id.et_food); // masukan makanan
        et_Portion = (EditText)findViewById(R.id.et_portion); // masukan porsi
        intent = new Intent(this,ReviewPesanan.class);// untuk pindah aktivitas
    }

    public void onEatbus(View view) {
        menu = et_Food.getText().toString();
        restaurant = "Eabus";
        portion = Integer.parseInt(et_Portion.getText().toString());
        int total = 50000 * portion;
        Log.d("TOTAL HARGA", "Rp."+total);
        intent.putExtra("restaurant", restaurant);//putExtra melepar ke second activity, intent untuk melink ke aktivitas selanjutny
        intent.putExtra("menu",menu);
        intent.putExtra("portion", portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }


    public void onAbnormal(View view) {
        menu = et_Food.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(et_Portion.getText().toString());
        int total = 30000 * portion;
        Log.d("TOTAL HARGA", "Rp."+total);
        intent.putExtra("restaurant", restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion", portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
