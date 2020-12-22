package com.example.act6marker;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        // Add a marker in Sydney and move the camera
        LatLng fiat = new LatLng(14.3744, 120.8892);
        LatLng urdaneta = new LatLng(15.9787, 120.5632);
        LatLng labit = new LatLng(15.9571, 120.5298);

        mMap.addMarker(new MarkerOptions().position(fiat).title("Marker in Precious's School,Fiat Lux Academe "));
        mMap.addMarker(new MarkerOptions().position(urdaneta).title("Marker in Jesusa's School,Urdaneta National High School"));
        mMap.addMarker(new MarkerOptions().position(labit).title("Marker in Eddie's School,Labit National High School"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(fiat));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urdaneta));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(labit));
    }
}