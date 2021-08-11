package com.example.zootour;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Experience extends AppCompatActivity {

    RecyclerView recyclerView;
    expAdapter adapter;

    List<explayout>explayoutList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.experience);

        explayoutList = new ArrayList<>();
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        explayoutList.add(
                new explayout(
                        "Bernhard Schulte",
                        "Team Leader",
                        "01/04/2013",
                        "30/10/2018",
                        R.drawable.bsm
                ));

        explayoutList.add(
                new explayout(
                        "ISS India",
                        "Port Disbursement",
                        "01/06/2010",
                        "30/03/2013",
                        R.drawable.iss
                ));

        explayoutList.add(
                new explayout(
                        "Doehle Danautic",
                        "Crew Manager",
                        "01/10/2009",
                        "30/04/2010",
                        R.drawable.ddi
                ));

        explayoutList.add(
                new explayout(
                        "Link India Marine",
                        "Marine Personnel Officer",
                        "01/11/2006",
                        "15/10/2009",
                        R.drawable.lmpl
                ));
        explayoutList.add(
                new explayout(
                        "Nautical Marine",
                        "Marine Personnel Officer",
                        "01/04/2003",
                        "15/09/2006",
                        R.drawable.nmms
                ));

        adapter = new expAdapter(this,explayoutList);
        recyclerView.setAdapter(adapter);
    }

}
