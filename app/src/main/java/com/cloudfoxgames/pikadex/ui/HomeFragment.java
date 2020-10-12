package com.cloudfoxgames.pikadex.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.cloudfoxgames.pikadex.R;
import com.cloudfoxgames.pikadex.data.viewmodel.PokemonViewModel;
import com.cloudfoxgames.pikadex.databinding.FragmentHomeBinding;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;
import com.cloudfoxgames.pikadex.retrofit.model.Pokemon;

import java.util.ArrayList;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class HomeFragment extends Fragment {
    private static final String TAG = "Home";
    private FragmentHomeBinding binding;
    private PokemonViewModel viewModel;
    private PokemonAdapter adapter;
    private ArrayList<Pokemon> pokemonList;
    private ArrayList<DetailedPokemon> detailedPokemons;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(this).get(PokemonViewModel.class);

        initRecyclerView();
        observeData();
        viewModel.getPokemons();
    }


    private void observeData() {
        viewModel.getPokemonList().observe(getViewLifecycleOwner(), new Observer<ArrayList<Pokemon>>() {
            @Override
            public void onChanged(ArrayList<Pokemon> pokemons) {
                Log.e(TAG, "onChanged: " + pokemons.size() );
                adapter.updateList(pokemons);
            }
        });
    }


    private void initRecyclerView() {
        binding.pokemonRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new PokemonAdapter(getActivity(),pokemonList);
        binding.pokemonRecyclerView.setAdapter(adapter);
    }
}