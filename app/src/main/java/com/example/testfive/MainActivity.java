package com.example.testfive;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String s1[], s2[];
    int images[] = {R.drawable.cambridge, R.drawable.stanforduniversity, R.drawable.massachusettsinstituteoftechnology, R.drawable.princetenuneversity, R.drawable.harvarduiversity, R.drawable.yaleuniversity, R.drawable.theuniversityofchicago, R.drawable.imperialcollegelondon, R.drawable.universityofpennsylvania, R.drawable.johnshopkinsuniversity, R.drawable.universityofcaliforniaberkeley, R.drawable.ethzurich, R.drawable.ulc};


    /*    <item>University of Oxford</item>
            <item>University of Cambridge</item>
            <item>Stanford University</item>
            <item>Massachusetts Institute of Technology</item>
            <item>Princeton University</item>
            <item>Harvard University</item>
            <item>Yale University</item>
            <item>The University of Chicago
    United States
    </item>
            <item>Imperial College London</item>
            <item>University of Pennsylvania United States
    </item>
            <item>Johns Hopkins University</item>
            <item>University of California, Berkeley</item>
            <item>ETH Zurich</item>
            <item>UCL</item>
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_university);
        s1 = getResources().getStringArray(R.array.topUniversities_in_the_world_2020);
        s2 = getResources().getStringArray(R.array.description);



        MyrecyclerviewAdabter myrecyclerviewAdabter = new MyrecyclerviewAdabter(this, s1, s2, images);
       recyclerView.setAdapter(myrecyclerviewAdabter);
recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}