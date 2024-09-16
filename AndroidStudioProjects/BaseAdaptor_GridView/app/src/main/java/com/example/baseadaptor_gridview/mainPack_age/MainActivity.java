package com.example.baseadaptor_gridview.mainPack_age;

import android.os.Bundle;
import android.widget.GridView;
import untildata.Adaptor_Base;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.baseadaptor_gridview.R;

public class MainActivity extends AppCompatActivity {
    GridView grid_view;
    int []img_view = {R.drawable.cat,R.drawable.images,R.drawable.nature,R.drawable.dogs};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        grid_view = findViewById(R.id.grid_view);
       // Adaptor_Base adaptors = new Adaptor_Base(getApplicationContext(), img_view);
    }
}