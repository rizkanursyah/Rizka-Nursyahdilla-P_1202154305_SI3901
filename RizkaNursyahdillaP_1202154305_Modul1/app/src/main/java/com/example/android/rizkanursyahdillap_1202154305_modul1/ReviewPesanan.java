package com.example.android.rizkanursyahdillap_1202154305_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ReviewPesanan extends AppCompatActivity {
    TextView tvRestaurant, tvMenu, tvPortion, tvprice;
    String restaurant, menu;
    int portion, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_pesanan);
        tvRestaurant = (TextView)findViewById(R.id.tv_restaurant);// mengambil id dari xml
        tvMenu = (TextView)findViewById(R.id.tv_menu);
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvprice = (TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent(); // mengambil data dari activity sebelumnya
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion",0);
        price = intent.getIntExtra("price",0);

        tvRestaurant.setText(restaurant); //setText untuk mengisi komponen dengan datanya
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvprice.setText("Rp. "+price);

        Toast toast = null; //inisialsasi toasnya null
        if (price < 65000){
            toast = Toast.makeText(getApplicationContext(), "Makan disini aja atuh!!",Toast.LENGTH_SHORT); // pesan yang akan timbul jika kurang dari 65000
        }else {
           toast = Toast.makeText(getApplicationContext(),"Jangan disini makan malamnya",Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
