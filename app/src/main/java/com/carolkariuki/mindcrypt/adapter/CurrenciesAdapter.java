package com.carolkariuki.mindcrypt.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.carolkariuki.mindcrypt.R;

import java.util.List;

import com.carolkariuki.mindcrypt.model.Currencies;

/**
 * Created by carolkariuki on 10/31/17.
 */


public class CurrenciesAdapter extends RecyclerView.Adapter<CurrenciesAdapter.ViewHolder> {

    List<Currencies> currencies;
    Context context;
    public CurrenciesAdapter(Context context, List<Currencies> currencies)
    {
        this.currencies=currencies;
        this.context=context;
    }
    public void setGridData(List<Currencies> mGridData)
    {
        this.currencies=mGridData;
        notifyDataSetChanged();
    }

    @Override
    public CurrenciesAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CurrenciesAdapter.ViewHolder viewHolder, int i) {

        viewHolder.currency_type.setText(currencies.get(i).getBWP().toString());
    }

    @Override
    public int getItemCount() {
        return currencies.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView currency_type;
        public ViewHolder(View view) {
            super(view);

            currency_type = (TextView)view.findViewById(R.id.currency_type);
        }
    }

}

