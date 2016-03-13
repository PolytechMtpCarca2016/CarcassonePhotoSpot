package hackatoncarcassonne.carcaphotospot;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private LatLng carcassonne = new LatLng(43.206533, 2.364089);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("CarcaCitySpot");


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MapsActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


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
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) mMap.setMyLocationEnabled(true);
        else {
            // Show rationale and request permission.
        }
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
        // Add a marker in Sydney and move the camera
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(carcassonne, 16.38f));

<<<<<<< HEAD
        // Ajout des marqueurs pour la démonstration

=======
        //Photo1 EMPLACEMENT
>>>>>>> master

        final LatLng EntreeNordOuest = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker DouveColor = mMap.addMarker(new MarkerOptions()
                .position(DouveColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker Douve = mMap.addMarker(new MarkerOptions()
                                .position(Douve)
                                .title("L'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo2 EMPLACEMENT

        final LatLng DouvePorteNarbonaise = new LatLng(43.206702, 2.365674);


        //COLOR

        Marker DouvePorteNarbonnaiseColor = mMap.addMarker(new MarkerOptions()
                .position(DouvePorteNarbonaiseColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker DouvePorteNarbonaise = mMap.addMarker(new MarkerOptions()
                                .position(DouvePorteNarbonaise)
                                .title("Les douves du chateau")
                                .snippet("Une vue sur les douves du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo3 EMPLACEMENT

        final LatLng EntreeNordOuest = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker EntreNordOuestColor = mMap.addMarker(new MarkerOptions()
                .position(EntreeNordOuestColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker EntreNordOuest = mMap.addMarker(new MarkerOptions()
                                .position(EntreeNordOuest)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo5 EMPLACEMENT

        final LatLng Cathédrale = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker CathédraleColor = mMap.addMarker(new MarkerOptions()
                .position(CathédraleColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker Cathédrale = mMap.addMarker(new MarkerOptions()
                                .position(Cathédrale)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo6 EMPLACEMENT

        final LatLng amphithéatre = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker AmphithéatreColor = mMap.addMarker(new MarkerOptions()
                .position(AmphithéatreColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker Amphithéatre = mMap.addMarker(new MarkerOptions()
                                .position(Amphithéatre)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo7 EMPLACEMENT

        final LatLng MuraillesSud = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker MuraillesSudColor = mMap.addMarker(new MarkerOptions()
                .position(MuraillesSudColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker MuraillesSud = mMap.addMarker(new MarkerOptions()
                                .position(MuraillesSud)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo8 EMPLACEMENT

        final LatLng Arche = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker ArcheColor = mMap.addMarker(new MarkerOptions()
                .position(ArcheColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker Arche = mMap.addMarker(new MarkerOptions()
                                .position(Arche)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo9 EMPLACEMENT

        final LatLng DouveChâteau = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker DouveChâteauColor = mMap.addMarker(new MarkerOptions()
                .position(DouveChâteauColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker DouveChâteau = mMap.addMarker(new MarkerOptions()
                                .position(DouveChâteau)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));

        //Photo10 EMPLACEMENT

        final LatLng château = new LatLng(43.207516, 2.366192);


        //COLOR

        Marker châteauColor = mMap.addMarker(new MarkerOptions()
                .position(châteauColor)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

                        //PHOTO

                        Marker château = mMap.addMarker(new MarkerOptions()
                                .position(château)
                                .title("Vue vers le sud de l'entre du chateau")
                                .snippet("Une vue sur le pont levis et l'entree du chateau")
                                .icon(BitmapDescriptorFactory.fromResource(R.drawable.arrow)));
