package com.example.a10120139_mochamadridho;
//Nim   : 10120139
//Nama  : Mochamad Ridho
//Kelas : IF4
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;


import android.view.MenuItem;

import com.example.a10120139_mochamadridho.adapter.ViewPagerAdapter;
import com.example.a10120139_mochamadridho.fragment.FoodFragment;
import com.example.a10120139_mochamadridho.fragment.HomeFragment;
import com.example.a10120139_mochamadridho.fragment.LocationFragment;
import com.example.a10120139_mochamadridho.fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // Inisialisasi adapter ViewPager
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new HomeFragment());
        viewPagerAdapter.addFragment(new LocationFragment());
        viewPagerAdapter.addFragment(new FoodFragment());
        viewPagerAdapter.addFragment(new ProfileFragment());
        viewPager.setAdapter(viewPagerAdapter);

        // Mengatur aksi ketika item navigasi terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        viewPager.setCurrentItem(0);
                        return true;
                    case R.id.action_location:
                        viewPager.setCurrentItem(1);
                        return true;
                    case R.id.action_food:
                        viewPager.setCurrentItem(2);
                        return true;
                    case R.id.action_profile:
                        viewPager.setCurrentItem(3);
                        return true;
                }
                return false;
            }
        });

        // Mengatur aksi ketika halaman ViewPager berubah
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                // Tidak digunakan
            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.setSelectedItemId(R.id.action_home);
                        break;
                    case 1:
                        bottomNavigationView.setSelectedItemId(R.id.action_location);
                        break;
                    case 2:
                        bottomNavigationView.setSelectedItemId(R.id.action_food);
                        break;
                    case 3:
                        bottomNavigationView.setSelectedItemId(R.id.action_profile);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // Tidak digunakan
            }
        });
    }
}
