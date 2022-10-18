package com.example.karaokeeed.A;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.example.karaokeeed.B.SpeechActivity;
import com.example.karaokeeed.R;

public class KaraokeeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karaokeeed);

        new SplashActivity().execute();
    }

    class SplashActivity extends AsyncTask<Void,Void,Void>{

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid){
            super.onPostExecute(aVoid);
            startActivity(new Intent(KaraokeeedActivity.this, SpeechActivity.class));
            finish();
        }
    }
}