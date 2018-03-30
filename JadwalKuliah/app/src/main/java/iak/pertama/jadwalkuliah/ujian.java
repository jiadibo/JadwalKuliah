package iak.pertama.jadwalkuliah;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class ujian extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ujian);

 mainGrid = findViewById(R.id.mainGrid);
//        //membuat event
setSingleEvent(mainGrid);
        //setToggleElevent(mainGrid);
    }


    private void setSingleEvent(GridLayout mainGrid) {
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            CardView CardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            final int finalI1 = i;
            CardView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (finalI1 == 0) {
                        Intent intent = new Intent(ujian.this, senin.class);
                        startActivity(intent);
                    } else if (finalI == 1) {
                        Intent intent = new Intent(ujian.this, selasa.class);
                        startActivity(intent);
                    } else if (finalI == 2) {
                        Intent intent = new Intent(ujian.this, rabu.class);
                        startActivity(intent);
                    } else if (finalI == 3) {
                        Intent intent = new Intent(ujian.this, kamis.class);
                        startActivity(intent);
                    } else if (finalI == 4) {
                        Intent intent = new Intent(ujian.this, jumat.class);
                        startActivity(intent);
                    } else if (finalI == 5) {
                        Intent intent = new Intent(ujian.this, sabtu.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(ujian.this, "Please set activity for this card item", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
}
