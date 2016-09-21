package com.example.kevin.sanguoshaenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int mode;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent getIntent = getIntent();
        mode = getIntent.getIntExtra("choice",0);

            startMain();

    }

    public void startMain(){
        GridView gridview = (GridView) findViewById(R.id.gridView);

        //MAYBE HAVE FOUR OF THESE SO THAT I CAN HAVE THIS ON A NEW LINE?
        //BUT MAYBE THE INDEXING DOESN'T WORK TOO WELL.......MAYBE ITS FINE?
        //I don't know about this...I may just ignore this and have everything together...

        gridview.setAdapter(new ImageAdapterReg(this));
        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "" + position,
                //        Toast.LENGTH_SHORT).show();

                Intent startIntent = new Intent(MainActivity.this, CharacterInfo.class);
                startIntent.putExtra("charPos",position);
                startIntent.putExtra("mode",mode);
                startActivity(startIntent);
            }
        });

    }

}
