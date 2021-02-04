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

public class Second_zone extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap map_second_z;
    private final static int YELLOW_COL = 0xFFFFFF00;
    private final static int YELLOW_TRANS = 0xFFFFFF80;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_zone);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_zone_two);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        Polygon poly1 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.877453947650686, 13.846544618272024),
                        new LatLng(44.87592769716375, 13.84713470424706),
                        new LatLng(44.87576043437317, 13.847461933742533),
                        new LatLng(44.87753187467014, 13.84689062323034)));

        poly1.setTag("alpha");

        Polygon poly2 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87951137567372, 13.847388173011314),
                        new LatLng(44.877496712490284, 13.847720766924516),
                        new LatLng(44.87707856600884, 13.848085547345448),
                        new LatLng(44.8748053165216, 13.849147702100515),
                        new LatLng(44.87498778802271, 13.849373007654616),
                        new LatLng(44.877192606259676, 13.84839668358683),
                        new LatLng(44.877511917759605, 13.848042632001809),
                        new LatLng(44.87951897804269, 13.847752953432247)));

        poly2.setTag("alpha");

        Polygon poly3 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87635060373185, 13.847616160783693),
                        new LatLng(44.8749744828121, 13.848072136309858),
                        new LatLng(44.875016299125946, 13.848302806281918),
                        new LatLng(44.875635937306335, 13.848174060251),
                        new LatLng(44.87613012248349, 13.850722158779567),
                        new LatLng(44.87639622043639, 13.850754345287296),
                        new LatLng(44.875959058863984, 13.848174060251),
                        new LatLng(44.87640762460686, 13.847975576786668)));

        poly3.setTag("alpha");

        Polygon poly4 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87154381806284, 13.845873251597327),
                        new LatLng(44.87148679236839, 13.846447244318497),
                        new LatLng(44.87131191321977, 13.845588937445719),
                        new LatLng(44.87098116207276, 13.844676986393388),
                        new LatLng(44.870737849670725, 13.844204917613359),
                        new LatLng(44.87023981639033, 13.84399570531312),
                        new LatLng(44.86980260805004, 13.844060078328578),
                        new LatLng(44.86937680195241, 13.844601884542021),
                        new LatLng(44.86906504906209, 13.845728412312544),
                        new LatLng(44.86908025655933, 13.846457973154408),
                        new LatLng(44.86939200936732, 13.847090974473083),
                        new LatLng(44.86941482048207, 13.847101703308994),
                        new LatLng(44.869034634055566, 13.847713246955848),
                        new LatLng(44.86844914203432, 13.846994414955525),
                        new LatLng(44.868361697911524, 13.847187534001899),
                        new LatLng(44.8690840584201, 13.848056569710588),
                        new LatLng(44.86967334580475, 13.847080245642799),
                        new LatLng(44.8692779536449, 13.846377506890713),
                        new LatLng(44.86920571824532, 13.845728412318172),
                        new LatLng(44.869384405647445, 13.844950571714715),
                        new LatLng(44.869787400730715, 13.844274655052402),
                        new LatLng(44.87011435693256, 13.84414054460353),
                        new LatLng(44.870589580658425, 13.844301477142174),
                        new LatLng(44.870836695445185, 13.844666257563105),
                        new LatLng(44.87108380917093, 13.845465555838382),
                        new LatLng(44.87122447344617, 13.846179023427204),
                        new LatLng(44.87134232702287, 13.846640363371325),
                        new LatLng(44.871635059056395, 13.847337737705459),
                        new LatLng(44.871901177794804, 13.84713925424113),
                        new LatLng(44.871635059056395, 13.846516981758363),
                        new LatLng(44.871743233976645, 13.84573816444646)));

        poly4.setTag("alpha");

        Polygon poly5 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87011988607681, 13.844461432973203),
                        new LatLng(44.870146498706596, 13.844794026886404),
                        new LatLng(44.869815740862244, 13.844928137335277),
                        new LatLng(44.869724496984475, 13.844606272257982)));

        poly5.setTag("alpha");

        Polygon poly6 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87139252630655, 13.848896465542444),
                        new LatLng(44.87159971973209, 13.848907194378352),
                        new LatLng(44.872603361731045, 13.850419960241627),
                        new LatLng(44.87248551073658, 13.850529930809701)));

        poly6.setTag("alpha");

        Polygon poly7 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.87007141305157, 13.848993025083347),
                        new LatLng(44.870630276164114, 13.84904130484494),
                        new LatLng(44.870778545058634, 13.849234423891316),
                        new LatLng(44.87074432919382, 13.849475822699285),
                        new LatLng(44.87096293020232, 13.84967162395464),
                        new LatLng(44.87088119253112, 13.84988083625488),
                        new LatLng(44.87004670129209, 13.849440953982578)));

        poly7.setTag("alpha");

        Polygon poly8 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.868735061888394, 13.849457047236712),
                        new LatLng(44.86877688273591, 13.849293432489088),
                        new LatLng(44.870067611224464, 13.849293432489088),
                        new LatLng(44.869911736861226, 13.849963984733447),
                        new LatLng(44.86980718674689, 13.849921069389808),
                        new LatLng(44.86990603413261, 13.849486551535463)));

        poly8.setTag("alpha");

        Polygon poly9 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.869086736251674, 13.849878154046468),
                        new LatLng(44.869149467128246, 13.849655530701343),
                        new LatLng(44.87073482476595, 13.850309989691837),
                        new LatLng(44.87049341221278, 13.851530394776569),
                        new LatLng(44.868925156405766, 13.850894711249483),
                        new LatLng(44.86898028369812, 13.850664041277424),
                        new LatLng(44.870417376552794, 13.851299724805074),
                        new LatLng(44.87057324954666, 13.850460193395138)));

        poly9.setTag("alpha");

        Polygon poly10 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.869108597018524, 13.849581769963242),
                        new LatLng(44.868652370578125, 13.84944765951437),
                        new LatLng(44.86850789811812, 13.85083167934673),
                        new LatLng(44.86853070958327, 13.851840189922246),
                        new LatLng(44.86944696262623, 13.852333716374094),
                        new LatLng(44.86993739913331, 13.849957279220085),
                        new LatLng(44.86974350613, 13.849855355278942),
                        new LatLng(44.86930249216066, 13.851888469683841),
                        new LatLng(44.8687968426755, 13.851722172727237),
                        new LatLng(44.86867138008534, 13.850826314928774),
                        new LatLng(44.86876642752725, 13.849758795755754),
                        new LatLng(44.869097191401586, 13.849946550384175)));

        poly10.setTag("alpha");

        Polygon poly11 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.869150417594625, 13.849694422740294),
                        new LatLng(44.868842465367756, 13.851700715055419),
                        new LatLng(44.86867993435017, 13.851659140812444),
                        new LatLng(44.869027807171825, 13.849652848497321)));

        poly11.setTag("alpha");

        Polygon poly12 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86523626010442, 13.85174363040289),
                        new LatLng(44.86509558120741, 13.85238199613952),
                        new LatLng(44.865350323822575, 13.852639488201355),
                        new LatLng(44.86554803373198, 13.851990393628816)));

        poly12.setTag("alpha");

        Polygon poly13 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86375341118815, 13.849029234919449),
                        new LatLng(44.8638940933651, 13.849109701188771),
                        new LatLng(44.86384466453129, 13.849613956476528),
                        new LatLng(44.86430853345568, 13.849823168776771),
                        new LatLng(44.86438457718504, 13.8500216522411),
                        new LatLng(44.864502444767034, 13.84998946573337),
                        new LatLng(44.86457848824028, 13.850289873138843),
                        new LatLng(44.864574686068984, 13.850713662157277),
                        new LatLng(44.86422488523734, 13.851250103952767),
                        new LatLng(44.864103214884636, 13.851470045088917),
                        new LatLng(44.86373059782978, 13.851132086757758),
                        new LatLng(44.86353668391851, 13.850778035172738),
                        new LatLng(44.86368877331593, 13.850558094036588),
                        new LatLng(44.86377622453749, 13.85042934800567),
                        new LatLng(44.86376862008873, 13.85025232221316),
                        new LatLng(44.86353668391851, 13.850193313615655),
                        new LatLng(44.86373059782978, 13.849029234919449)));

        poly13.setTag("alpha");

        Polygon poly14 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86428572031727, 13.851775816912344),
                        new LatLng(44.86381424676631, 13.851657799717337),
                        new LatLng(44.86374960896238, 13.851920656197127),
                        new LatLng(44.86344923233306, 13.851759723658478),
                        new LatLng(44.86328193327769, 13.852140597333275),
                        new LatLng(44.86349866150639, 13.852537564261937),
                        new LatLng(44.86355949735373, 13.852768234233995),
                        new LatLng(44.86373059782978, 13.852687767964673),
                        new LatLng(44.86372679560251, 13.852038673392133),
                        new LatLng(44.86422868743171, 13.852296165453966)));

        poly14.setTag("alpha");

        Polygon poly15 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86278003316582, 13.85109453583837),
                        new LatLng(44.86240360523197, 13.851706079485226),
                        new LatLng(44.862110826248475, 13.850542000789016),
                        new LatLng(44.86225531476407, 13.850558094042881),
                        new LatLng(44.8624492329914, 13.851035527240867)));

        poly15.setTag("alpha");

        Polygon poly16 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86119825878651, 13.85230689431797),
                        new LatLng(44.86090927608697, 13.851303748160408),
                        new LatLng(44.86082182051041, 13.851303748160408),
                        new LatLng(44.86092068332628, 13.852274707810238)));

        poly16.setTag("alpha");

        Polygon poly17 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.86032370143257, 13.85289161587505),
                        new LatLng(44.86041496021202, 13.85306864166756),
                        new LatLng(44.860684933254305, 13.853385142326902),
                        new LatLng(44.86067732839722, 13.854103974332853),
                        new LatLng(44.860487206643185, 13.854103974332853),
                        new LatLng(44.86012217111553, 13.853910855286477),
                        new LatLng(44.85998147972137, 13.853873304360793),
                        new LatLng(44.859966269820326, 13.853449515342358),
                        new LatLng(44.86010696125166, 13.853063277249609)));

        poly17.setTag("alpha");

        Polygon poly18 = googleMap.addPolygon(new PolygonOptions()
                .fillColor(YELLOW_TRANS)
                .strokeColor(YELLOW_COL)
                .clickable(true)
                .add(
                        new LatLng(44.85404931342777, 13.860771945945748),
                        new LatLng(44.85489734641564, 13.862231067629473),
                        new LatLng(44.85646788573948, 13.860096029283433),
                        new LatLng(44.85636521256445, 13.85981707954978),
                        new LatLng(44.85527002063975, 13.859404019367254)));

        poly18.setTag("alpha");


        //camera position in Pula
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(44.86711916409849, 13.84941051638291), 16));

    }
}