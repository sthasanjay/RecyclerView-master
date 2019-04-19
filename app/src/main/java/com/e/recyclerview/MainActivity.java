package com.e.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
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
        contactsList.add(new Contacts("Saugat Malla","9876766","Bhaktapur", "saugat@gmail.com",R.drawable.saugat));
        contactsList.add(new Contacts("Rajesh Hamal","908066545","Bhaktapur", "saugat@gmail.com",R.drawable.rajesh));
        contactsList.add(new Contacts("Dahayang Rai","9086544365","Bhaktapur", "saugat@gmail.com",R.drawable.dahayang));
        contactsList.add(new Contacts("bhuwan Kc","987665566","Bhaktapur", "saugat@gmail.com",R.drawable.bhuwan));
        contactsList.add(new Contacts("Nischal Basnet","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.nischal));
        contactsList.add(new Contacts("Paul Shah","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.paul));
        contactsList.add(new Contacts("Pradeep Khadka","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.pradeep));
        contactsList.add(new Contacts("Emma Stone","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));
        contactsList.add(new Contacts("sita Gurung","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));
        contactsList.add(new Contacts("rishav Shahi","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));
        contactsList.add(new Contacts("alish rai","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));
        contactsList.add(new Contacts("sita Gurung","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));
        contactsList.add(new Contacts("ram Shahi","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));
        contactsList.add(new Contacts("hari rai","12345678","Bhaktapur", "saugat@gmail.com",R.drawable.noavatar));

        ContactAdapter contactAdapter=new ContactAdapter(this,contactsList);
        recycleView.setAdapter(contactAdapter);
        recycleView.setLayoutManager(new GridLayoutManager(this,2));

    }
}
