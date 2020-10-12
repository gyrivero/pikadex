package com.cloudfoxgames.pikadex.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.cloudfoxgames.pikadex.R;
import com.cloudfoxgames.pikadex.data.viewmodel.PokemonViewModel;
import com.cloudfoxgames.pikadex.databinding.ActivityMainBinding;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;
import com.cloudfoxgames.pikadex.retrofit.model.Pokemon;

import java.util.ArrayList;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    Button button;
    PokemonViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        button = findViewById(R.id.button);

        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout,new HomeFragment())
                .commit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}