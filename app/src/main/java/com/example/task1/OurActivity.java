package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class OurActivity extends AppCompatActivity {
    ListView listView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our);
               // getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        listView = findViewById(R.id.activitylist);
        ArrayList<Activity> arrayList = new ArrayList<>();
        arrayList.add(new Activity("STUDENT MENTORSHIP","Guidance and mentorship of freshers by seniors",R.drawable.smp));
        arrayList.add(new Activity("PDS DOUBT SESSIONS","To help freshers to cope up with PDS course",R.drawable.pds));
        arrayList.add(new Activity("FORESIGHT","Series of posts on experiences of seniors in CDC internships and placements",R.drawable.foresight));
        activitylistadapter activitylistadapter = new activitylistadapter(this,R.layout.activity,arrayList);
        listView.setAdapter(activitylistadapter);
        button=(Button)findViewById(R.id.secondactivity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensecondactivity();
                            }
        });
    }
    public void opensecondactivity(){
        Intent intent = new Intent(this,Pds.class);
        startActivity(intent);
    }
}