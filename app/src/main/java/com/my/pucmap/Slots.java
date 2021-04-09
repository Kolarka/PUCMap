package com.my.pucmap;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;
import java.util.List;

public class Slots extends FragmentActivity implements OnMapReadyCallback {
    private static final String TAG ="Map" ;
    private GoogleMap slotMap;
    private LatLng KarolinaParking = new LatLng(44.87325137951341, 13.848156335234844);
    //zone three
    private LatLng AmfiteatarskaParking = new LatLng(44.872818946077345, 13.849079350421702);
    private LatLng CarinskiParking = new LatLng(44.8736700290084, 13.848130854251579);
    private LatLng ValerijinParking = new LatLng(44.873841099435694, 13.849402221337852);
    private LatLng IstarskaParking1 = new LatLng(44.872162463983855, 13.849002286828682);
    private LatLng IstarskaParking2 = new LatLng(44.87043647979265, 13.848733395374847);
    private LatLng GiardiniParking = new LatLng(44.869896623893084, 13.848495349327552);
    private LatLng FlavijevParking = new LatLng(44.874389249274095, 13.849898815194113);
    //zone two
    private LatLng YachtParking2 = new LatLng(44.87727382028733, 13.846940673935414);
    private LatLng YachtParking1 = new LatLng(44.8764741093856, 13.847200848200972);
    private LatLng KolodvorskaParking= new LatLng(44.877283086042375, 13.848077595267178);
    private LatLng KolSplitParking = new LatLng(44.87594001225041, 13.848713614080937);
    private LatLng ScalierovaParking = new LatLng(44.8721465444935, 13.849902503238281);
    private LatLng CastropolaParking = new LatLng(44.86968756684438, 13.844346018944767);
    private LatLng DobrichevaParking = new LatLng(44.870038954351955, 13.849463291504565);
    private LatLng EpulonovaParking = new LatLng(44.86974169952379, 13.85012412074871);
    private LatLng TeslinaParking = new LatLng(44.86954642359222, 13.85109780958679);
    private LatLng CroatParking = new LatLng(44.86423738011775, 13.85039976469652);
    private LatLng MarsovoParking = new LatLng(44.864020654670085, 13.851094456821679);
    //zone one
    private LatLng CarrarinaParking = new LatLng(44.87111513771027, 13.847878488219827);
    private LatLng StaraParking = new LatLng(44.86912679363273, 13.842393370791148);
    private LatLng BenediktinskeParking = new LatLng(44.868241426162164, 13.842993515053825);
    private LatLng AnticovaParking = new LatLng(44.867534773722085, 13.846357317983324);
    private LatLng VeronskaParking = new LatLng(44.86834744035051, 13.84960144978011);
    private LatLng SupilovaParking = new LatLng(44.86777762443466, 13.85032899897127);
    private LatLng CankarevaParking = new LatLng(44.86777833730052, 13.85206874679517);
    private LatLng TrznicaParking = new LatLng(44.86704003949059, 13.850831913175945);
    private LatLng PedagParking = new LatLng(44.86668336244491, 13.85141428779861);



    private MarkerOptions greenOption;
    //zone three
    private MarkerOptions amfit_option;
    private MarkerOptions carin_option;
    private MarkerOptions val_option;
    private MarkerOptions ist_option;
    private MarkerOptions ista_option;
    private MarkerOptions giar_option;
    private MarkerOptions flav_option;
    //zone two
    private MarkerOptions yact1_option;
    private MarkerOptions yact2_option;
    private MarkerOptions kol_option;
    private MarkerOptions kolspl_option;
    private MarkerOptions scalie_option;
    private MarkerOptions castro_option;
    private MarkerOptions dobri_option;
    private MarkerOptions epulo_option;
    private MarkerOptions tesl_option;
    private MarkerOptions croat_option;
    private MarkerOptions mars_option;
    //zone three
    private MarkerOptions carra_option;
    private MarkerOptions stara_option;
    private MarkerOptions trz_option;
    private MarkerOptions benedik_option;
    private MarkerOptions anti_option;
    private MarkerOptions veron_option;
    private MarkerOptions supil_option;
    private MarkerOptions pedag_option;
    private MarkerOptions canka_option;




    private List<MarkerOptions> markerOptionsList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slots);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map_slot);
        mapFragment.getMapAsync(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        slotMap = googleMap;
        slotMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            return;
        }
        slotMap.setMyLocationEnabled(true);


        markerOptionsList = new ArrayList<>();

        //green option parking slot
        greenOption = new MarkerOptions().position(KarolinaParking)
                .title("Karolina - parkiralište 24/7 + stanica za punjenje električnih vozila")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

        markerOptionsList.add(greenOption);

        // zone three parking slots
        amfit_option = new MarkerOptions().position(AmfiteatarskaParking)
                .title("Amfiteatarska ulica\n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(amfit_option);

        carin_option = new MarkerOptions().position(CarinskiParking)
                .title("Carinski gat \n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(carin_option);

        val_option = new MarkerOptions().position(ValerijinParking)
                .title("Valerijin park \n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(val_option);

        ist_option = new MarkerOptions().position(IstarskaParking1)
                .title("Istarska ulica \n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(ist_option);

        ista_option = new MarkerOptions().position(IstarskaParking2)
                .title("Istarska ulica \n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(ista_option);

        giar_option = new MarkerOptions().position(GiardiniParking)
                .title("Giardini \n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(giar_option);

        flav_option = new MarkerOptions().position(FlavijevParking)
                .title("Flavijevska ulica \n" + "Zona III - 708523")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA));

        markerOptionsList.add(flav_option);

        //zone two
        yact2_option = new MarkerOptions().position(YachtParking2)
                .title("Yacht service II\n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(yact2_option);

        yact1_option = new MarkerOptions().position(YachtParking1)
                .title("Yacht service I\n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(yact1_option);

        kol_option = new MarkerOptions().position(KolodvorskaParking)
                .title("Kolodvorska ulica \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(kol_option);

         kolspl_option= new MarkerOptions().position(KolSplitParking)
                .title("Križanje ulica Kolodvorske i Splitske \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(kolspl_option);

         scalie_option = new MarkerOptions().position(ScalierovaParking)
                .title("Scalierova ulica \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(scalie_option);

         castro_option = new MarkerOptions().position(CastropolaParking)
                .title("Ulica Castropola \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(castro_option);

         dobri_option= new MarkerOptions().position(DobrichevaParking)
                .title("Dobricheva  ulica \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(dobri_option);

         epulo_option = new MarkerOptions().position(EpulonovaParking)
                .title("Epulonova ulica \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(epulo_option);
         tesl_option= new MarkerOptions().position(TeslinaParking)
                .title("Teslina ulica \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(tesl_option);

         croat_option = new MarkerOptions().position(CroatParking)
                .title("Croatia osiguranje \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(croat_option);

         mars_option= new MarkerOptions().position(MarsovoParking)
                .title("Marsovo polje \n" + "Zona II - 708522")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        markerOptionsList.add(mars_option);

        //zone one
         carra_option = new MarkerOptions().position(CarrarinaParking)
                .title("Carrarina ulica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(carra_option);

         stara_option= new MarkerOptions().position(StaraParking)
                .title("Stara tržnica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(stara_option);

        benedik_option = new MarkerOptions().position(BenediktinskeParking)
                .title("Benediktinske opatije \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(benedik_option);

        anti_option= new MarkerOptions().position(AnticovaParking)
                .title("Anticova  ulica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(anti_option);

        veron_option = new MarkerOptions().position(VeronskaParking)
                .title("Veronska  ulica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(veron_option);

        supil_option= new MarkerOptions().position(SupilovaParking)
                .title("Supilova ulica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(supil_option);

        canka_option = new MarkerOptions().position(CankarevaParking)
                .title("Cankareva ulica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(canka_option);

        trz_option= new MarkerOptions().position(TrznicaParking)
                .title("Tržnica \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(trz_option);
        pedag_option= new MarkerOptions().position(PedagParking)
                .title("Pedagoški fakultet \n" + "Zona I - 708521")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));

        markerOptionsList.add(pedag_option);



        for (MarkerOptions options : markerOptionsList){
            LatLng latLng = new LatLng(options.getPosition().latitude, options.getPosition().longitude);
            slotMap.addMarker(options);
            slotMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng,15));
        }

    }
}