package giel.hva.nl.studentportal;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private ObjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FloatingActionButton myFab = findViewById(R.id.floatingActionButton);
        //Maak plus icon wit
        myFab.setColorFilter(Color.WHITE);


        myFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddPortalActivity.class);
                startActivity(intent);
            }
        });

        RecyclerView recyclerView =  findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new StaggeredGridLayoutManager(3 , LinearLayout.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new ObjectAdapter(this);
        recyclerView.setAdapter(adapter);

    }


    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }
}
