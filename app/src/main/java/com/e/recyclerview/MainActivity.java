package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import adaptor.ContactAdapter;
import model.Contacts;

public class MainActivity extends AppCompatActivity {
private RecyclerView recycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycleView=findViewById(R.id.recycleView);
        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Saugat Malla","9876766",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","908066545",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang Rai","9086544365",R.drawable.dahayang));
        contactsList.add(new Contacts("bhuwan Kc","987665566",R.drawable.bhuwan));

        ContactAdapter contactAdapter=new ContactAdapter(this,contactsList);
        recycleView.setAdapter(contactAdapter);
        recycleView.setLayoutManager(new LinearLayoutManager(this));

    }
}
