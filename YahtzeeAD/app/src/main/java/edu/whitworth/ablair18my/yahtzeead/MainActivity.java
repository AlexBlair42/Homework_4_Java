package edu.whitworth.ablair18my.yahtzeead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Random random = new Random();
                int chosen = random.nextInt(6);
                int image[] = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five,R.drawable.six};


                ImageView iv = (ImageView) findViewById(R.id.imageView);
                iv.setImageResource(image[chosen]);
                chosen = random.nextInt(6);
                ImageView iv2 = (ImageView) findViewById(R.id.imageView2);
                iv2.setImageResource(image[chosen]);
                chosen = random.nextInt(6);
                ImageView iv3 = (ImageView) findViewById(R.id.imageView3);
                iv3.setImageResource(image[chosen]);
                chosen = random.nextInt(6);
                ImageView iv4 = (ImageView) findViewById(R.id.imageView4);
                iv4.setImageResource(image[chosen]);
                chosen = random.nextInt(6);
                ImageView iv5 = (ImageView) findViewById(R.id.imageView5);
                iv5.setImageResource(image[chosen]);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ;
                }
                chosen = random.nextInt(6);
            }


    });
    }
}
