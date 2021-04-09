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

public class Kol_Verudela extends FragmentActivity implements OnMapReadyCallback,
        View.OnClickListener, GoogleMap.OnPolylineClickListener {

    private final static int Red = 0xFFFF0000;
    private GoogleMap kol_verud;
    private Button dir_b_verud;
    private LatLng Bus_station = new LatLng(44.87663061328511, 13.854614457951289);
    private LatLng last_bus_station = new LatLng(44.839234920051226, 13.834343819820413);
    private RelativeLayout first_station;

    private MarkerOptions Bustation_option;
    private MarkerOptions Last_Bus_station;

    private List<MarkerOptions> markerOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kol__verudela);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_kolverud);
        mapFragment.getMapAsync(this);

        dir_b_verud = findViewById(R.id.Dir_B);
        dir_b_verud.setOnClickListener(this);
        first_station = findViewById(R.id.rel_firststat1);
        first_station.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_B:
                startActivity(new Intent(Kol_Verudela.this, Verude_Kol.class));
                break;
            case R.id.rel_firststat1:
                kol_verud.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.87663061328511, 13.854614457951289), 16));
                break;
        }


    }

    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        kol_verud = googleMap;
        kol_verud.setMapType(GoogleMap.MAP_TYPE_NORMAL);


        markerOptionsList = new ArrayList<>();

        //bus station marker option
        Bustation_option = new MarkerOptions().position(Bus_station)
                .title("Bus station Pula")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_a));

        markerOptionsList.add(Bustation_option);

        Last_Bus_station = new MarkerOptions().position(last_bus_station)
                .title("Bus station Pula")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon_b));

        markerOptionsList.add(Last_Bus_station);

        // Add polylines to the map.
        // Polylines are useful to show a route or some other connection between points.
        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .color(Red)
                .add(
                        new LatLng(44.87663061328511, 13.854614457951289),
                        new LatLng(44.87703812942924, 13.854267934547734),
                        new LatLng(44.876843743720336, 13.853208953427908),
                        new LatLng(44.876545382982705, 13.851818243282592),
                        new LatLng(44.876577027376726, 13.85126961450967),
                        new LatLng(44.87654990361151, 13.851020817740554),
                        new LatLng(44.87632387173751, 13.851014438336218),
                        new LatLng(44.876007425622326, 13.850759262162766),
                        new LatLng(44.874221732785486, 13.848762508605502),
                        new LatLng(44.874185183804165, 13.848481636376642),
                        new LatLng(44.874091062693495, 13.84837514069722),
                        new LatLng(44.873790571758676, 13.848311987816293),
                        new LatLng(44.87331745519202, 13.847842852129414),
                        new LatLng(44.8728826959988, 13.846651969231957),
                        new LatLng(44.87177660265611, 13.847328607241876),
                        new LatLng(44.87036997926034, 13.84801426709193),
                        new LatLng(44.869916016139875, 13.848212747544045),
                        new LatLng(44.86989683452285, 13.848528511948674),
                        new LatLng(44.86923186784798, 13.848564599309201),
                        new LatLng(44.869020867201286, 13.848438293547352),
                        new LatLng(44.86825997965762, 13.847590240574917),
                        new LatLng(44.86760138813271, 13.846976755594993),
                        new LatLng(44.86763422352546, 13.84503681354721),
                        new LatLng(44.86704491526407, 13.84488660983655),
                        new LatLng(44.866660911150475, 13.844511100559899),
                        new LatLng(44.86376368860363, 13.841195890151948),
                        new LatLng(44.86316293392464, 13.840546795545167),
                        new LatLng(44.86145569172648, 13.838610240714017),
                        new LatLng(44.861113476708034, 13.838368841888737),
                        new LatLng(44.86042523819486, 13.83869607140125),
                        new LatLng(44.85920844279286, 13.839774319467057),
                        new LatLng(44.858185554234964, 13.839430996717311),
                        new LatLng(44.856478164472236, 13.838714846896703),
                        new LatLng(44.85467565356177, 13.83804965903521),
                        new LatLng(44.8532838026662, 13.839535602801377),
                        new LatLng(44.85083467200385, 13.840823063178462),
                        new LatLng(44.84824852037073, 13.841187843618636),
                        new LatLng(44.846772840466, 13.840780147935757),
                        new LatLng(44.84251293433974, 13.838784584351275),
                        new LatLng(44.84091538832928, 13.837540039320094),
                        new LatLng(44.839515597214, 13.836038002266747),
                        new LatLng(44.8393404750526, 13.835597855598794),
                        new LatLng(44.83927970098451, 13.835029479670462),
                        new LatLng(44.839234920051226, 13.834343819820413)));




        //camera in Pula
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.8766990379954, 13.854485711920372), 13));

        for (MarkerOptions options : markerOptionsList){
            LatLng latLng = new LatLng(options.getPosition().latitude, options.getPosition().longitude);
            kol_verud.addMarker(options);

        }

        // Set listeners for click events.
        googleMap.setOnPolylineClickListener(this);

    }
}