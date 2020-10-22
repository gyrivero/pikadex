package com.cloudfoxgames.pikadex.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.cloudfoxgames.pikadex.R;
import com.cloudfoxgames.pikadex.databinding.TypeEffectItemBinding;

import java.util.ArrayList;
import java.util.List;

public class EffectAdapter extends ArrayAdapter {
    TextView effectTV;
    ArrayList<String> effectsList;
    private Context mContext;
    public EffectAdapter(@NonNull Context context, @NonNull ArrayList<String> effectList) {
        super(context, R.layout.type_effect_item,R.id.effectTV);
        this.effectsList = effectList;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return this.effectsList.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.effectsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
        v= layoutInflater.inflate(R.layout.type_effect_item, null);
        effectTV = v.findViewById(R.id.effectTV);
        effectTV.setText(effectsList.get(position));
        return v;
    }
}
