package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    GridView gv1;
    ArrayList<HinhAnh> arrayList;
    HinhAnhAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList =new ArrayList<>();
        addList();
        gv1 = findViewById(R.id.gv_1);
        gv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, arrayList.get(position).getTen(), Toast.LENGTH_SHORT).show();
            }
        });
        adapter = new HinhAnhAdapter(
                this,
                R.layout.hinhanh,
                arrayList
        );
        gv1.setAdapter(adapter);
    }

    private void addList() {
        arrayList.add(new HinhAnh("hinh 1", R.drawable.oppo));
        arrayList.add(new HinhAnh("hinh 2", R.drawable.realme));
        arrayList.add(new HinhAnh("hinh 3", R.drawable.samsung));
        arrayList.add(new HinhAnh("hinh 4", R.drawable.samsungs));
        arrayList.add(new HinhAnh("hinh 5", R.drawable.vivopro));
        arrayList.add(new HinhAnh("hinh 6", R.drawable.xiaomi));
    }
}