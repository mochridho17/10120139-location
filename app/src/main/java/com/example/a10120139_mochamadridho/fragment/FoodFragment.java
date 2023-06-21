package com.example.a10120139_mochamadridho.fragment;
//Nim   : 10120139
//Nama  : Mochamad Ridho
//Kelas : IF4
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.a10120139_mochamadridho.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class FoodFragment extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);
        SupportMapFragment mMapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mMapFragment.getMapAsync(this);
        return view;
    }



    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng reveuse = new LatLng(-6.884875265054253, 107.61988062151461);
        LatLng mcDonald = new LatLng(-6.884752794014742, 107.61350392853277);
        LatLng pagiSero = new LatLng(-6.883463963974836, 107.61474847359145);
        LatLng ayamBangDava = new LatLng(-6.884955171961591, 107.61946916148271);
        LatLng mieGacoan = new LatLng(-6.88853405195437, 107.61316060577816);

        mMap.addMarker(new MarkerOptions().position(reveuse).title("Reveus Resto"));
        mMap.addMarker(new MarkerOptions().position(mcDonald).title("McDonald's Simpang Dago"));
        mMap.addMarker(new MarkerOptions().position(pagiSero).title("Rumah Makan Pagi Sero (Padang Food Specialty)"));
        mMap.addMarker(new MarkerOptions().position(ayamBangDava).title("Ayam Bang Dava"));
        mMap.addMarker(new MarkerOptions().position(mieGacoan).title("Mie Gacoan Dago"));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(reveuse, 15));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}