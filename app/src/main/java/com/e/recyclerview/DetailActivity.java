package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {

    CircleImageView cirImg;
    TextView FullName, PhoneNo,Address,Email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        cirImg = findViewById(R.id.imgProfile);
        FullName = findViewById(R.id.tvName);
        PhoneNo = findViewById(R.id.tvPhone);
        Address=findViewById(R.id.tvAddress);
        Email=findViewById(R.id.tvEmail);


        Bundle bundle=getIntent().getExtras();

        if(bundle!=null){

            cirImg.setImageResource(bundle.getInt("image"));
            FullName.setText(bundle.getString("name"));
            PhoneNo.setText(bundle.getString("phone"));
            Address.setText(bundle.getString("address"));
            Email.setText(bundle.getString("email"));
        }


    }
}
