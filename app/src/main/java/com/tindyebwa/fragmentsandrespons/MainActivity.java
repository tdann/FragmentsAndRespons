package com.tindyebwa.fragmentsandrespons;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    String[] items={"Diphtheria","Polio","Tuberclosis","Hepatitis B"};
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=MainActivity.this;
        int configuration=getResources().getConfiguration().orientation;
        if(configuration== Configuration.ORIENTATION_PORTRAIT){
           setContentView(R.layout.activity_main);
            ListView listView= (ListView) findViewById(R.id.lviewp);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout rp1= (RelativeLayout) findViewById(R.id.diptl);
                RelativeLayout rp2= (RelativeLayout) findViewById(R.id.polil);
                RelativeLayout rp3 = (RelativeLayout) findViewById(R.id.tbl);
                RelativeLayout rp4 = (RelativeLayout) findViewById(R.id.hepl);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Diphtheria":

                            rp1.setVisibility(View.VISIBLE);
                            rp2.setVisibility(View.INVISIBLE);
                            rp3.setVisibility(view.INVISIBLE);
                            rp4.setVisibility(view.INVISIBLE);

                            break;
                        case "Polio":

                            rp1.setVisibility(View.INVISIBLE);
                            rp2.setVisibility(View.VISIBLE);
                            rp3.setVisibility(view.INVISIBLE);
                            rp4.setVisibility(view.INVISIBLE);
                            break;
                        case "Tuberclosis":

                            rp1.setVisibility(View.INVISIBLE);
                            rp2.setVisibility(View.INVISIBLE);
                            rp3.setVisibility(view.VISIBLE);
                            rp4.setVisibility(view.INVISIBLE);
                            break;
                        case "Hepatitis B":

                            rp1.setVisibility(View.INVISIBLE);
                            rp2.setVisibility(View.INVISIBLE);
                            rp3.setVisibility(view.INVISIBLE);
                            rp4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });

        }
        else if(configuration== Configuration.ORIENTATION_LANDSCAPE){
            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.lview);

            ListAdapter adapter=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout r1= (RelativeLayout) findViewById(R.id.dipt);
                RelativeLayout r2= (RelativeLayout) findViewById(R.id.poli);
                RelativeLayout r3 = (RelativeLayout) findViewById(R.id.tb);
                RelativeLayout r4 = (RelativeLayout) findViewById(R.id.hep);


                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String user_chose=String.valueOf(parent.getItemAtPosition(position));
                    switch (user_chose){
                        case "Diphtheria":

                            r1.setVisibility(View.VISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Polio":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.VISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Tuberclosis":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.VISIBLE);
                            r4.setVisibility(view.INVISIBLE);
                            break;
                        case "Hepatitis B":

                            r1.setVisibility(View.INVISIBLE);
                            r2.setVisibility(View.INVISIBLE);
                            r3.setVisibility(view.INVISIBLE);
                            r4.setVisibility(view.VISIBLE);
                            break;

                    }
                }
            });
        }
    }
}
