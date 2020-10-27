package edu.kmmccall001.petthecat;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("SpellCheckingInspection")
    public static final String EXTRA_MESSAGE = "edu.converse.kmmccall001.helloworld.MESSAGE";
    private Object ImageButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
//
//        ImageButton catButton = (ImageButton) findViewById(R.id.cat);
//        catButton.setVisibility(View.INVISIBLE);
//        ImageButton wolfButton = (ImageButton) findViewById(R.id.wolf);
//        wolfButton.setVisibility(View.INVISIBLE);
//        ImageButton ravenButton = (ImageButton) findViewById(R.id.raven);
//        ravenButton.setVisibility(View.INVISIBLE);
//        ImageButton tigerButton = (ImageButton) findViewById(R.id.tiger);
//        tigerButton.setVisibility(View.INVISIBLE);
//        ImageButton duckButton = (ImageButton) findViewById(R.id.duck);
//        duckButton.setVisibility(View.INVISIBLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner spinner = findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(spinner.getSelectedItem().equals("Cat")){
                    ImageButton catButton = (ImageButton) findViewById(R.id.cat);
                    catButton.setVisibility(View.VISIBLE);
                }
                else if (spinner.getSelectedItem().equals("Wolf")) {
                    ImageButton wolfButton = (ImageButton) findViewById(R.id.wolf);
                    wolfButton.setVisibility(View.VISIBLE);
                }
                else if (spinner.getSelectedItem().equals("Raven")) {
                    ImageButton ravenButton = (ImageButton) findViewById(R.id.raven);
                    ravenButton.setVisibility(View.VISIBLE);
                }
                else if (spinner.getSelectedItem().equals("Tiger")) {
                    ImageButton tigerButton = (ImageButton) findViewById(R.id.tiger);
                    tigerButton.setVisibility(View.VISIBLE);
                }
                else if (spinner.getSelectedItem().equals("Duck")) {
                    ImageButton duckButton = (ImageButton) findViewById(R.id.duck);
                    duckButton.setVisibility(View.VISIBLE);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                ImageButton catButton = (ImageButton) findViewById(R.id.cat);
                catButton.setVisibility(View.INVISIBLE);
                ImageButton wolfButton = (ImageButton) findViewById(R.id.wolf);
                wolfButton.setVisibility(View.INVISIBLE);
                ImageButton ravenButton = (ImageButton) findViewById(R.id.raven);
                ravenButton.setVisibility(View.INVISIBLE);
                ImageButton tigerButton = (ImageButton) findViewById(R.id.tiger);
                tigerButton.setVisibility(View.INVISIBLE);
                ImageButton duckButton = (ImageButton) findViewById(R.id.duck);
                duckButton.setVisibility(View.INVISIBLE);
            }
            public void catmeow(View view){
                MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.kitten);
                player.start();
            }

            public void duckquack (View view){
                MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.quack);
                player.start();
            }

            public void tigeroar (View view){
                MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.roar);
                player.start();
            }

            public void ravencaw (View view){
                MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.caw);
                player.start();
            }

            public void wolfhowl (View view){
                MediaPlayer player = MediaPlayer.create(MainActivity.this,R.raw.howl);
                player.start();
            }
        });
    }}




