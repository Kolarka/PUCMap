package com.my.pucmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;
import java.util.List;

public class Stoja_kol extends FragmentActivity implements OnMapReadyCallback,
        GoogleMap.OnPolylineClickListener, View.OnClickListener{

    private final static int Greeen = 0xFF008000;
    private Button direction_a;
    private GoogleMap sto_kol_map;

    private LatLng Bus_station = new LatLng(44.87663061328511, 13.854614457951289);
    private LatLng last_bus_station = new LatLng(44.860139532823084, 13.814604386658418);
    private RelativeLayout first_station;

    private MarkerOptions Bustation_option;
    private MarkerOptions Last_Bus_station;

    private List<MarkerOptions> markerOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stoja_kol);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_stojkol);
        mapFragment.getMapAsync(this);

        direction_a = findViewById(R.id.Dir_A);
        direction_a.setOnClickListener(this);
        first_station = findViewById(R.id.rel_firststation);
        first_station.setOnClickListener(this);
    }
    @Override
    public void onMapReady(GoogleMap googleMap) {
         sto_kol_map = googleMap;
        sto_kol_map.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        markerOptionsList = new ArrayList<>();

        //bus station marker option
        Bustation_option = new MarkerOptions().position(Bus_station)
                .title("Bus station Pula")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_b));

        markerOptionsList.add(Bustation_option);

        Last_Bus_station = new MarkerOptions().position(last_bus_station)
                .title("Bus station Pula")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_a));

        markerOptionsList.add(Last_Bus_station);


        // Add polylines to the map.
        // Polylines are useful to show a route or some other connection between points.
        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .color(Greeen)
                .add(
                        new LatLng(44.87663061328511, 13.854614457951289),
                        new LatLng(44.87715520065131, 13.854442796576732),
                        new LatLng(44.87761896231105, 13.857006988359165),
                        new LatLng(44.87837161672126, 13.86099811531759),
                        new LatLng(44.87824997628615, 13.861319980504707),
                        new LatLng(44.87839442429166, 13.86159893023836),
                        new LatLng(44.87859969188626, 13.861674032089729),
                        new LatLng(44.87939984840588, 13.863039276485168),
                        new LatLng(44.8791717764273, 13.863312861800866),
                        new LatLng(44.87890189008475, 13.863618633624295),
                        new LatLng(44.87874984088359, 13.863742015237255),
                        new LatLng(44.87858258629821, 13.86375810849112),
                        new LatLng(44.87813783878554, 13.86360254037043),
                        new LatLng(44.877742504777245, 13.86349525201133),
                        new LatLng(44.877301552102104, 13.863548896190881),
                        new LatLng(44.87685679464947, 13.863613269214653),
                        new LatLng(44.87583421969361, 13.863817117096938),
                        new LatLng(44.87564034655615, 13.863881490112398),
                        new LatLng(44.87572777962057, 13.864557406774713),
                        new LatLng(44.87605090066251, 13.866531512582105),
                        new LatLng(44.87614973732475, 13.867132327393053),
                        new LatLng(44.8759710709268, 13.867330810857382),
                        new LatLng(44.874892576937334, 13.867606618211328),
                        new LatLng(44.87349476914355, 13.867959387328439),
                        new LatLng(44.87188993636448, 13.868365261485204),
                        new LatLng(44.87023129332417, 13.86880527458521),
                        new LatLng(44.867861528328575, 13.869326841806334),
                        new LatLng(44.86766796409072, 13.869357187536837),
                        new LatLng(44.867517413677916, 13.869182699586439),
                        new LatLng(44.867877658652354, 13.867544030139218),
                        new LatLng(44.86800670107981, 13.867316437160436),
                        new LatLng(44.86799594755525, 13.866838491904996),
                        new LatLng(44.86828091527764, 13.865480520464939),
                        new LatLng(44.86825403159052, 13.864911538017989),
                        new LatLng(44.867200181161934, 13.861755582045562),
                        new LatLng(44.866931338650815, 13.86064037633969),
                        new LatLng(44.8669743535326, 13.860056221027486),
                        new LatLng(44.86700661467285, 13.85982104161608),
                        new LatLng(44.866920584925346, 13.859350682793265),
                        new LatLng(44.86682917817772, 13.857249240955856),
                        new LatLng(44.86696897667412, 13.856672672076279),
                        new LatLng(44.86787228185103, 13.855162971983702),
                        new LatLng(44.86861427192758, 13.851885633089259),
                        new LatLng(44.86861427194852, 13.851665626445584),
                        new LatLng(44.86858738841711, 13.85041386506229),
                        new LatLng(44.868813209690835, 13.848919337834962),
                        new LatLng(44.8690134909193, 13.848564672095666),
                        new LatLng(44.86909682920892, 13.8485457060141),
                        new LatLng(44.86872315012917, 13.84811707257073),
                        new LatLng(44.86806718961859, 13.8474380868507),
                        new LatLng(44.867556395519465, 13.847001866974702),
                        new LatLng(44.867602098314805, 13.845674241215692),
                        new LatLng(44.86762898230642, 13.845018014793542),
                        new LatLng(44.867088611664784, 13.844881459006274),
                        new LatLng(44.86689773326052, 13.84477524894951),
                        new LatLng(44.86519861869669, 13.842836915376216),
                        new LatLng(44.86328705486602, 13.840708920996068),
                        new LatLng(44.86316337907265, 13.840530639829359),
                        new LatLng(44.86305583468852, 13.839881999839832),
                        new LatLng(44.86282461358236, 13.839191634470865),
                        new LatLng(44.862709002681044, 13.838759207811181),
                        new LatLng(44.86254230745779, 13.837458134562752),
                        new LatLng(44.86231646158269, 13.83585739727866),
                        new LatLng(44.86224386807754, 13.835637390732504),
                        new LatLng(44.86207986019186, 13.835523594243115),
                        new LatLng(44.86176931936805, 13.833306459231201),
                        new LatLng(44.861586489368456, 13.831880209897509),
                        new LatLng(44.86152196099469, 13.830423614833311),
                        new LatLng(44.86112941182936, 13.827472492541787),
                        new LatLng(44.860365815351194, 13.827100757212401),
                        new LatLng(44.85999313775334, 13.826778933350475),
                        new LatLng(44.85974977890381, 13.826392695257722),
                        new LatLng(44.85964330908365, 13.826135203195888),
                        new LatLng(44.85968323528202, 13.826025232592231),
                        new LatLng(44.85963000033502, 13.825821384709947),
                        new LatLng(44.859508320271374, 13.825783833784264),
                        new LatLng(44.85937142989241, 13.825360044765826),
                        new LatLng(44.859443677632974, 13.824748501118972),
                        new LatLng(44.85959958034322, 13.824292525592808),
                        new LatLng(44.86005968100242, 13.823439583137981),
                        new LatLng(44.860592024284536, 13.821953639364482),
                        new LatLng(44.860941847214875, 13.82076810293621),
                        new LatLng(44.86163007955263, 13.81959865982205),
                        new LatLng(44.86192286098091, 13.818804725964728),
                        new LatLng(44.86195327974522, 13.81843458112584),
                        new LatLng(44.86139813476675, 13.817554816581241),
                        new LatLng(44.86113196745726, 13.81699155264834),
                        new LatLng(44.86068328265326, 13.815612897233935),
                        new LatLng(44.86051217312057, 13.815065726602539),
                        new LatLng(44.860139532823084, 13.814604386658418)));




        //camera in Pula
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.86025417118449, 13.814587465671368), 13));

        for (MarkerOptions options : markerOptionsList){
            LatLng latLng = new LatLng(options.getPosition().latitude, options.getPosition().longitude);
            sto_kol_map.addMarker(options);

        }

        // Set listeners for click events.
        googleMap.setOnPolylineClickListener(this);


    }
    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Dir_A:
                startActivity(new Intent(Stoja_kol.this, Kol_stoja.class));
                break;
            case R.id.rel_firststation:
                sto_kol_map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.860139532823084, 13.814604386658418), 16));
                break;
        }

    }


}