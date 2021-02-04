package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;

public class Third_zone extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map_third_z;
    private final static int Grey_COL = 0xFF808080;
    private final static int Grey_TRANS = 0xFFEDEDED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_zone);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_zone_three);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        map_third_z = googleMap;


        Polygon pol1 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(Grey_TRANS)
                .strokeColor(Grey_COL)
                .clickable(true)
                .add(
                        new LatLng(44.874539314949, 13.848192385680873),
                        new LatLng(44.8740299099249, 13.8483318605477),
                        new LatLng(44.87349008773956, 13.847918800365175)));

        pol1.setTag("alpha");

        Polygon pol2 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(Grey_TRANS)
                .strokeColor(Grey_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87373719007257, 13.849426201810495),
                        new LatLng(44.87498789175889, 13.850086025218944),
                        new LatLng(44.876158736787914, 13.851115993466282),
                        new LatLng(44.87616633959984, 13.851319841348566),
                        new LatLng(44.8750068991736, 13.850338152862824),
                        new LatLng(44.87366115869849, 13.84964077852869)));

        pol2.setTag("alpha");

        Polygon pol3 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(Grey_TRANS)
                .strokeColor(Grey_COL)
                .clickable(true)
                .add(
                        new LatLng(44.8744984486334, 13.849223695041834),
                        new LatLng(44.872977822181575, 13.84914322877251),
                        new LatLng(44.871898153009596, 13.847319326667854),
                        new LatLng(44.87176889548352, 13.847442708280814),
                        new LatLng(44.87279534430727, 13.849282703639338),
                        new LatLng(44.874559272855734, 13.849454365013894)));

        pol3.setTag("alpha");

        Polygon pol4 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(Grey_TRANS)
                .strokeColor(Grey_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87331616504254, 13.84745880153468),
                        new LatLng(44.872977822181575, 13.84658976582599),
                        new LatLng(44.872852368705125, 13.846697054185087),
                        new LatLng(44.873175505892476, 13.847598276401508)));

        pol4.setTag("alpha");

        Polygon pol5 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(Grey_TRANS)
                .strokeColor(Grey_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86878258558327, 13.848384163637068),
                        new LatLng(44.87120053904071, 13.84842707898071),
                        new LatLng(44.87158071116057, 13.848555825011625),
                        new LatLng(44.87264517973641, 13.849017164955745),
                        new LatLng(44.872713609185624, 13.849381945376678),
                        new LatLng(44.8715426940616, 13.848888418924828),
                        new LatLng(44.87107127994789, 13.848727486386183),
                        new LatLng(44.86896507618053, 13.84882404590937)));

        pol5.setTag("alpha");


        //camera position in Pula
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.86711916409849, 13.84941051638291), 16));


    }
}