package com.cloudfoxgames.pikadex.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.cloudfoxgames.pikadex.R;
import com.cloudfoxgames.pikadex.databinding.ListItemBinding;
import com.cloudfoxgames.pikadex.retrofit.model.DetailedPokemon;
import com.cloudfoxgames.pikadex.retrofit.model.Pokemon;

import java.util.ArrayList;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder> {
    private Context mContext;
    private ArrayList<Pokemon> mList;
    private ListItemBinding binding;
    private Pokemon pokemon;

    public PokemonAdapter(Context mContext, ArrayList<Pokemon> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        binding = ListItemBinding.inflate(inflater,parent,false);
        return new PokemonViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        holder.itemBinding.pokemonName.setText(mList.get(position).getName());
        Glide.with(mContext).load(mList.get(position).getUrl())
                .into(holder.itemBinding.pokemonImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pokemon = mList.get(position);
                Fragment fragment = new PokemonFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("idPokemon",pokemon.getId());
                fragment.setArguments(bundle);
                ((MainActivity)mContext).getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frameLayout,fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    class PokemonViewHolder extends RecyclerView.ViewHolder{
        private ListItemBinding itemBinding;

        public PokemonViewHolder(ListItemBinding itemBinding) {
            super(itemBinding.getRoot());
            this.itemBinding = itemBinding;
        }
    }

    public  void updateList(ArrayList<Pokemon> updatedList){
        mList = updatedList;
        notifyDataSetChanged();
    }

    public  Pokemon getPokemonAt(int position){
        return pokemon;
    }
}