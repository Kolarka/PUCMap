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
import com.google.android.gms.maps.model.Polyline;

public class First_zone extends AppCompatActivity implements OnMapReadyCallback,
        GoogleMap.OnPolylineClickListener, GoogleMap.OnPolygonClickListener{

    private static  final int COLOR_RED = 0xFFFF0000;
    private static final int RED_TRANS = 0xFFFF8080;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_zone);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_zone_one);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Polygons for  parking spots in zone one
        Polygon polygon1 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.871738655115216, 13.84722300094848),
                        new LatLng(44.87181757004096, 13.84746294698083),
                        new LatLng(44.87016059955698, 13.848196578440806),
                        new LatLng(44.87007017687556, 13.847986058108813)));

        polygon1.setTag("alpha");

        Polygon polygon2 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.87011173821813, 13.848595795320541),
                        new LatLng(44.87013074724337, 13.84913223711603),
                        new LatLng(44.86995966579022, 13.84914296595194),
                        new LatLng(44.86994921079603, 13.84860786526094)));


        polygon2.setTag("alpha1");

        Polygon polygon3 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.869736071060295, 13.841368247851786),
                        new LatLng(44.86977432696273, 13.841542926712233),
                        new LatLng(44.86934566926375, 13.841846016326683),
                        new LatLng(44.8692848395312, 13.841618028563602)));


        polygon3.setTag("alpha1");

        Polygon polygon4 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.86930765068843, 13.841711905877812),
                        new LatLng(44.86873353237464, 13.842068681958747),
                        new LatLng(44.869091860024156, 13.84272582315822),
                        new LatLng(44.8694739469966, 13.842245707751259)));


        polygon4.setTag("alpha1");

        Polygon polygon5 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.868892261330934, 13.843134860047217),
                        new LatLng(44.868622326776, 13.843632409812532),
                        new LatLng(44.868071998533146, 13.843070487031758),
                        new LatLng(44.868399914959056, 13.842552820699112)));


        polygon5.setTag("alpha1");

        Polygon polygon6 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.867734575316724, 13.844809899583671),
                        new LatLng(44.86765948650451, 13.846702198018752),
                        new LatLng(44.86750740759749, 13.846699515809775),
                        new LatLng(44.86758439759439, 13.844762960928065)));


        polygon6.setTag("alpha1");

        Polygon polygon7 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.86763192222593, 13.847018698707364),
                        new LatLng(44.86698558378679, 13.848397354121769),
                        new LatLng(44.86688483037627, 13.848287383553693),
                        new LatLng(44.867507407591035, 13.846926162497644)));


        polygon7.setTag("alpha1");

        Polygon polygon8 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.86635634731337, 13.848882833971938),
                        new LatLng(44.866461854207536, 13.849159101496614),
                        new LatLng(44.86574706497947, 13.849628488067665),
                        new LatLng(44.865678627247384, 13.849350879438502)));


        polygon8.setTag("alpha1");

        Polygon polygon9 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.867176634577284, 13.850488136059031),
                        new LatLng(44.86687247381008, 13.850242713937593),
                        new LatLng(44.86668047149831, 13.850572625641819),
                        new LatLng(44.86705497046327, 13.85081402444979)));


        polygon9.setTag("alpha1");

        Polygon polygon10 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.86667001590231, 13.850826094400919),
                        new LatLng(44.86645710166014, 13.851586500646022),
                        new LatLng(44.8667070857122, 13.851743409871203),
                        new LatLng(44.86689623642172, 13.851137230642303)));


        polygon10.setTag("alpha1");

        Polygon polygon11 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.86576560018742, 13.851007814068064),
                        new LatLng(44.86653932086089, 13.85219603264507),
                        new LatLng(44.86693663284105, 13.852909500233068),
                        new LatLng(44.86680546316041, 13.85301142417421),
                        new LatLng(44.86651080554152, 13.852338189720873),
                        new LatLng(44.86564203204063, 13.8511124202181842)));


        polygon11.setTag("alpha1");

        Polygon polygon12 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.86695374193536, 13.851418192045617),
                        new LatLng(44.86768942699474, 13.85189830745258),
                        new LatLng(44.86784530737632, 13.8514557429713),
                        new LatLng(44.86795936592468, 13.851528162613691),
                        new LatLng(44.86784150542082, 13.851946587214174),
                        new LatLng(44.868457418937616, 13.852228219156805),
                        new LatLng(44.868417498816804, 13.852415973785225),
                        new LatLng(44.867780674098604, 13.85217725718623),
                        new LatLng(44.867679922079766, 13.852501804472501),
                        new LatLng(44.86752974421492, 13.852429384830112),
                        new LatLng(44.867620991571904, 13.852078015454067),
                        new LatLng(44.86689290967496, 13.851611311091993)));


        polygon12.setTag("alpha1");

        Polygon polygon13 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(RED_TRANS)
                .strokeColor(COLOR_RED)
                .clickable(true)
                .add(
                        new LatLng(44.8686836324423, 13.84947895493035),
                        new LatLng(44.86809243395528, 13.849154407644079),
                        new LatLng(44.86748792247113, 13.851013178465442),
                        new LatLng(44.86762859552163, 13.851088280316812),
                        new LatLng(44.86809623589422, 13.849559421199672),
                        new LatLng(44.868269223849865, 13.849690849439565),
                        new LatLng(44.86808673104642, 13.850441867953249),
                        new LatLng(44.868227402633515, 13.850522334222571),
                        new LatLng(44.868472626605225, 13.849741811410139),
                        new LatLng(44.8685980896286, 13.849830324306392)));


        polygon13.setTag("alpha1");

       //camera position in Pula
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.86711916409849, 13.84941051638291), 16));



    }

    @Override
    public void onPolygonClick(Polygon polygon) {

    }

    @Override
    public void onPolylineClick(Polyline polyline) {

    }
}