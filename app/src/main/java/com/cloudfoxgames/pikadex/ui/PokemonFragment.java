package com.cloudfoxgames.pikadex.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cloudfoxgames.pikadex.R;
import com.cloudfoxgames.pikadex.data.viewmodel.PokemonViewModel;
import com.cloudfoxgames.pikadex.databinding.FragmentPokemonBinding;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PokemonFragment extends Fragment {
    int idPokemon;
    private PokemonViewModel viewModel;
    private FragmentPokemonBinding binding;
    TextView pokemonTV;

    public PokemonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idPokemon = getArguments().getInt("idPokemon");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPokemonBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

        observerData();
        viewModel.getPokemon(idPokemon);
    }

    private void observerData() {
        viewModel.getDetailedPokemon().observe(getViewLifecycleOwner(), new Observer<DetailedPokemon>() {
            @Override
            public void onChanged(DetailedPokemon detailedPokemon) {
                String name = detailedPokemon.getName();
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                binding.pokemonNameTV.setText(name);
                Glide.with(getActivity())
                        .load("https://img.pokemondb.net/sprites/home/normal/"+detailedPokemon.getName()+".png")
                        .into(binding.pokemonIV);
                String type = "";
                for (int i = 0; i < detailedPokemon.getTypes().size();i++) {
                    String tempType = detailedPokemon.getTypes().get(i).getType().getName();
                    tempType = tempType.substring(0, 1).toUpperCase() + tempType.substring(1);
                    if (i>0) {
                        type = type + " " + tempType;
                    } else {
                        type = tempType;
                        binding.pokemonCV.setBackground(getBackgroundByType(tempType));
                    }
                }
                binding.typeTV.setText(type);
            }
        });
    }

    private Drawable getBackgroundByType(String type) {
        if (type.equals("Bug")) {
            return getResources().getDrawable(R.drawable.amie_bug_wallpaper,null);
        }
        return getResources().getDrawable(R.drawable.amie_normal_wallpaper,null);
    }


}