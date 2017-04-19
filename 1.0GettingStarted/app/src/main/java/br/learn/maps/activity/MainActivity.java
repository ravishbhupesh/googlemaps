package br.learn.maps.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.learn.maps.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonMapMarker = (Button) findViewById(R.id.button_add_map_marker);
        buttonMapMarker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapsMarkerActivity.class);
                startActivity(intent);
            }
        });

        Button buttonShowMyLocationButton = (Button) findViewById(R.id.button_show_my_location);
        buttonShowMyLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyLocationActivity.class);
                startActivity(intent);
            }
        });

        Button buttonLastKnownLoc = (Button) findViewById(R.id.button_last_known_location);
        buttonLastKnownLoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LastKnownLocationActivity.class);
                startActivity(intent);
            }
        });

        Button buttonTrackloc = (Button) findViewById(R.id.button_track_location);
        buttonTrackloc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LocTrackActivity.class);
                startActivity(intent);
            }
        });
    }
}
