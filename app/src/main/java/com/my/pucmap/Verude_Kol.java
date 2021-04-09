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

public class Verude_Kol extends FragmentActivity implements OnMapReadyCallback,
        View.OnClickListener, GoogleMap.OnPolylineClickListener {
    private GoogleMap verud_sijd;
    private Button dir_A_verudsij;
    private final static int Red = 0xFFFF0000;
    private LatLng Bus_station = new LatLng(44.839234920051226, 13.834343819820413);
    private LatLng last_bus_station = new LatLng(44.88420750960857, 13.870560220433704);
    private RelativeLayout first_station;

    private MarkerOptions Bustation_option;
    private MarkerOptions Last_Bus_station;

    private List<MarkerOptions> markerOptionsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verude__kol);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_verudsij);
        mapFragment.getMapAsync(this);

        dir_A_verudsij = findViewById(R.id.Dir_A);
        dir_A_verudsij.setOnClickListener(this);
        first_station = findViewById(R.id.rel_firststat2);
        first_station.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Dir_A:
                startActivity(new Intent(Verude_Kol.this, Kol_Verudela.class));
                break;
            case R.id.rel_firststat1:
                verud_sijd.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.865587324387306, 13.848883885168599), 14));
                break;
        }

    }

    @Override
    public void onPolylineClick(Polyline polyline) {

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        verud_sijd = googleMap;
        verud_sijd.setMapType(GoogleMap.MAP_TYPE_NORMAL);


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
                        new LatLng(44.839234920051226, 13.834343819820413),

                        new LatLng(44.83892485765126, 13.83393752920062),

                        new LatLng(44.8386787479974, 13.83413585864449),

                        new LatLng(44.839047912083984, 13.835028341141903),

                        new LatLng(44.83943465287593, 13.835871241278351),

                        new LatLng(44.84173746475207, 13.838375150507208),

                        new LatLng(44.84597369503847, 13.840457609667842),

                        new LatLng(44.848258669175515, 13.841176553901871),

                        new LatLng(44.850877489752236, 13.84082947723375),

                        new LatLng(44.85335559270677, 13.839342006404726),

                        new LatLng(44.85419917789508, 13.840705521331332),

                        new LatLng(44.85664199029807, 13.843928374794217),

                        new LatLng(44.857432806641526, 13.843928374794217),

                        new LatLng(44.85817089209658, 13.844597736667279),

                        new LatLng(44.8583613362821, 13.844676107149912),

                        new LatLng(44.86103625455334, 13.845796417382292),

                        new LatLng(44.86066010168053, 13.847521105503196),

                        new LatLng(44.86306325828522, 13.84870037943202),

                        new LatLng(44.864784823877976, 13.84939085738441),

                        new LatLng(44.86633986574829, 13.850494064915935),

                        new LatLng(44.86694060052157, 13.851320219003252),

                        new LatLng(44.86672768728023, 13.852028322210648),

                        new LatLng(44.86866668951261, 13.85295100214756),

                        new LatLng(44.87006577219327, 13.85345525741989),

                        new LatLng(44.87255970467405, 13.85454959874041),

                        new LatLng(44.87398910511693, 13.8552040576335),

                        new LatLng(44.87460495284899, 13.854796361847422),

                        new LatLng(44.8750231173053, 13.855944347350324),

                        new LatLng(44.87534244084397, 13.856985044488468),

                        new LatLng(44.87595827415873, 13.858304691259711),

                        new LatLng(44.87674136124098, 13.860246610661816),

                        new LatLng(44.87823908063776, 13.861330223145863),


                        new LatLng(44.878497566335206, 13.861523342202425),

                        new LatLng(44.879630328196754, 13.863304329057394),

                        new LatLng(44.88010927457795, 13.864194822298034),

                        new LatLng(44.88020050199143, 13.864763450631248),

                        new LatLng(44.88061102356202, 13.865192604090275),

                        new LatLng(44.88115077894739, 13.865160417580851),

                        new LatLng(44.88147006848181, 13.864731264121822),

                        new LatLng(44.882161856394355, 13.864827823650101),

                        new LatLng(44.882488742294235, 13.864656162266492),

                        new LatLng(44.88318051795792, 13.863851499530814),

                        new LatLng(44.88391029431046, 13.863754939947608),

                        new LatLng(44.88612997365101, 13.865278434727161),

                        new LatLng(44.885324209546155, 13.869258833059646),

                        new LatLng(44.884959331521905, 13.870396089726073),

                        new LatLng(44.884710093123495, 13.870810572723567),

                        new LatLng(44.884524648380484, 13.870988853899686),

                        new LatLng(44.884306951615045, 13.870950921734554),
                        new LatLng(44.88420750960857, 13.870560220433704)));




        //camera in Pula
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.839234920051226, 13.834343819820413), 13));

        for (MarkerOptions options : markerOptionsList){
            LatLng latLng = new LatLng(options.getPosition().latitude, options.getPosition().longitude);
            verud_sijd.addMarker(options);

        }

        // Set listeners for click events.
        googleMap.setOnPolylineClickListener(this);

    }
}