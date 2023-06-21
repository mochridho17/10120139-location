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

public class ProfileFragment extends Fragment {

    public ProfileFragment() {
        // Diperlukan konstruktor kosong
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        return view;
    }
}