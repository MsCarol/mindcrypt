package com.carolkariuki.mindcrypt;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.io.IOException;
import java.util.ArrayList;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.support.v7.widget.RecyclerView;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.carolkariuki.mindcrypt.adapter.CurrenciesAdapter;
import com.carolkariuki.mindcrypt.model.Currencies;
import com.carolkariuki.mindcrypt.restclient.APISERVICE;

import org.json.JSONArray;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {

    private CurrenciesAdapter adapter;
    private RecyclerView recyclerView;
    ArrayList<String> rateslist;
    private ArrayList<Currencies> coinslist;
    private TextView rate_view;
    JSONObject jsonobject;
    JSONArray jsonarray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview);

        rate_view = (TextView) findViewById(R.id.current_rate);

        //temporary spinner
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                        .createFromResource(this,R.array.currencies ,
                               android.R.layout.simple_spinner_item);
        spinner.setAdapter(staticAdapter);



        String afriancurerncies = "DZD,AOA,XOF,BIF,EGP,ETB,GHS,KES,MUR,ZAR,UGX,ZBN,NGN,NAD,MAD,RWF,BWP,TZS,ZMW,TND";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        APISERVICE service = retrofit.create(APISERVICE.class);
        final Call<ResponseBody> result = service.getCalls("/data/price?fsym=ETH&tsyms=" + afriancurerncies);
        result.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String result = response.body().string();
                    for (int i = 0; i < result.length(); i++) {
                        //    rate_view.setText("DZD : " + coinslist.get(i).getDZD());
                        rate_view.setText(result);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();


            }
        });
    }

    private void prepareCoins() {
        rate_view = (TextView) findViewById(R.id.current_rate);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        // Spinner adapter
        spinner
                .setAdapter(new ArrayAdapter<String>(MainActivity.this,
                        android.R.layout.simple_spinner_dropdown_item,
                        rateslist));
        ArrayAdapter<Currencies> dataAdapter = new ArrayAdapter<Currencies>(this,
                android.R.layout.simple_spinner_item, coinslist);

        // Drop down layout style - list view
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


                rate_view.setText("DZD : " + coinslist.get(i).getDZD());
                rate_view.setText("AOA : " + coinslist.get(i).getAOA());
                rate_view.setText("BWP : " + coinslist.get(i).getBWP());
                rate_view.setText("DZD : " + coinslist.get(i).getDZD());
                rate_view.setText("EGP : " + coinslist.get(i).getEGP());
                rate_view.setText("ETB : " + coinslist.get(i).getETB());
                rate_view.setText("GHS : " + coinslist.get(i).getGHS());
                rate_view.setText("KES : " + coinslist.get(i).getKES());
                rate_view.setText("MAD : " + coinslist.get(i).getMAD());
                rate_view.setText("NAD : " + coinslist.get(i).getNAD());
                rate_view.setText("DZD : " + coinslist.get(i).getDZD());
                rate_view.setText("ETB : " + coinslist.get(i).getETB());
                rate_view.setText("XOF : " + coinslist.get(i).getXOF());
                rate_view.setText("MUR : " + coinslist.get(i).getMUR());
                rate_view.setText("ZAR : " + coinslist.get(i).getZAR());
                rate_view.setText("UGX : " + coinslist.get(i).getUGX());
                rate_view.setText("ZMW : " + coinslist.get(i).getZMW());
                rate_view.setText("NGN : " + coinslist.get(i).getNGN());
                rate_view.setText("RWF : " + coinslist.get(i).getRWF());
                rate_view.setText("TZS : " + coinslist.get(i).getTZS());
                rate_view.setText("TND : " + coinslist.get(i).getTND());


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();


            }
        });


    }
}

//incomplete project
//missing addition of ethereum card
//user value conversion to bitcoin/ethereum
//dispalying of single value from json