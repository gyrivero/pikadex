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
import com.cloudfoxgames.pikadex.common.Utils;
import com.cloudfoxgames.pikadex.data.model.Pokemon;
import com.cloudfoxgames.pikadex.data.model.Type;
import com.cloudfoxgames.pikadex.data.viewmodel.PokemonViewModel;
import com.cloudfoxgames.pikadex.databinding.FragmentPokemonBinding;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class PokemonFragment extends Fragment {
    int idPokemon;
    Pokemon pokemon;
    Utils utils;
    List<Type> listTypes;
    private PokemonViewModel viewModel;
    private FragmentPokemonBinding binding;

    public PokemonFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            idPokemon = getArguments().getInt("idPokemon");
            pokemon = (Pokemon) getArguments().getSerializable("Pokemon");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentPokemonBinding.inflate(inflater, container, false);
        utils = new Utils(getActivity());
        listTypes = utils.jsonTypesParse("types.json");
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

        setViews();
        //observerData();
        //viewModel.getPokemon(idPokemon);
    }

    private void setViews() {
        setPokemonName();
        setPokemonImage();
        setPokemonType();
        setPokemonWeaks();
    }

    private void setPokemonImage() {
        Glide.with(getActivity())
                .load("https://img.pokemondb.net/sprites/home/normal/"+pokemon.getName()+".png")
                .into(binding.pokemonIV);
        binding.pokemonCV.setBackground(getBackgroundByType(listTypes.get(pokemon.getType1()).getName()));
    }

    private void setPokemonName() {
        String name = pokemon.getName();
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        binding.pokemonNameTV.setText(name);
    }


    private void setPokemonWeaks() {
        String weaks = "Weaks:";
        if (pokemon.getSecondaryType() != null) {
            for (int i = 0; i < listTypes.size(); i++) {
                float effect;
                effect = pokemon.getPrimaryType().getEffectiveness().get(i) * pokemon.getSecondaryType().getEffectiveness().get(i);
                if (effect>1.0f) {
                    weaks += " " + listTypes.get(i).getName() + " x" + effect;
                }
            }
        } else {
            for (int i = 0; i < listTypes.size(); i++) {
                float effect;
                effect = pokemon.getPrimaryType().getEffectiveness().get(i);
                if (effect > 1) {
                    weaks += " " + listTypes.get(i).getName() + " x" + effect;
                }
            }
        }
        binding.weaksTV.setText(weaks);
    }

    private void setPokemonType() {
        pokemon.setPrimaryType(listTypes.get(pokemon.getType1()));
        String type = pokemon.getPrimaryType().getName();
        if (pokemon.getType2() >= 0) {
            pokemon.setSecondaryType(listTypes.get(pokemon.getType2()));
            type += " " + pokemon.getSecondaryType().getName();
        } else {
            pokemon.setSecondaryType(null);
        }
        binding.typeTV.setText(type);
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
        } else if (type.equals("Fire")) {
            return getResources().getDrawable(R.drawable.amie_fire_wallpaper,null);
        } else if (type.equals("Fairy")) {
            return getResources().getDrawable(R.drawable.amie_fairy_wallpaper,null);
        } else if (type.equals("Dark")) {
            return getResources().getDrawable(R.drawable.amie_dark_wallpaper,null);
        } else if (type.equals("Ground")) {
            return getResources().getDrawable(R.drawable.amie_ground_wallpaper,null);
        } else if (type.equals("Grass")) {
            return getResources().getDrawable(R.drawable.amie_grass_wallpaper,null);
        } else if (type.equals("Dragon")) {
            return getResources().getDrawable(R.drawable.amie_dragon_wallpaper,null);
        } else if (type.equals("Electric")) {
            return getResources().getDrawable(R.drawable.amie_electric_wallpaper,null);
        } else if (type.equals("Fighting")) {
            return getResources().getDrawable(R.drawable.amie_fighting_wallpaper,null);
        } else if (type.equals("Flying")) {
            return getResources().getDrawable(R.drawable.amie_flying_wallpaper,null);
        } else if (type.equals("Ghost")) {
            return getResources().getDrawable(R.drawable.amie_ghost_wallpaper,null);
        } else if (type.equals("Ice")) {
            return getResources().getDrawable(R.drawable.amie_ice_wallpaper,null);
        } else if (type.equals("Normal")) {
            return getResources().getDrawable(R.drawable.amie_normal_wallpaper,null);
        } else if (type.equals("Poison")) {
            return getResources().getDrawable(R.drawable.amie_poison_wallpaper,null);
        } else if (type.equals("Psychic")) {
            return getResources().getDrawable(R.drawable.amie_psychic_wallpaper,null);
        } else if (type.equals("Rock")) {
            return getResources().getDrawable(R.drawable.amie_rock_wallpaper,null);
        } else if (type.equals("Steel")) {
            return getResources().getDrawable(R.drawable.amie_steel_wallpaper,null);
        } else if (type.equals("Water")) {
            return getResources().getDrawable(R.drawable.amie_water_wallpaper,null);
        }
        return getResources().getDrawable(R.drawable.amie_normal_wallpaper,null);
    }
}