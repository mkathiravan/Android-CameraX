package net.kathir.andoirx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button camerxView,cameraXKotlinView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        camerxView = (Button)findViewById(R.id.cameraX_View);
        cameraXKotlinView = (Button)findViewById(R.id.cameraX_kotlinView);
        camerxView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,CamearXViewActivity.class);
                startActivity(intent);
            }
        });

        cameraXKotlinView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,CamearXKotlinActivity.class);
                startActivity(intent);

            }
        });
    }
}
