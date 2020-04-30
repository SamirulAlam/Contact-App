package com.example.kucse19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements StudentAdapter.ItemClicked {
    Button btncall,btninfo;
    ImageView ivcall,ivpic;
    TextView tvtel,tvhome,tvhall,tvblood,tvname;
    FragmentManager fragmentManager;
    Fragment btnfrag,callfrag,infofrag,listfrag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncall=findViewById(R.id.btncall);
        btninfo=findViewById(R.id.btninfo);
        ivcall=findViewById(R.id.ivcall);
        ivpic=findViewById(R.id.ivpic);
        tvtel=findViewById(R.id.tvtel);
        tvhome=findViewById(R.id.tvhome);
        tvhall=findViewById(R.id.tvhall);
        tvblood=findViewById(R.id.tvblood);
        tvname=findViewById(R.id.tvname);

        fragmentManager=getSupportFragmentManager();
        btnfrag=fragmentManager.findFragmentById(R.id.btnfrag);
        callfrag=fragmentManager.findFragmentById(R.id.callfrag);
        infofrag=fragmentManager.findFragmentById(R.id.infofrag);
        listfrag=fragmentManager.findFragmentById(R.id.listfrag);
        if(findViewById(R.id.layout_land) != null) {
            fragmentManager.beginTransaction()
                    .show(listfrag)
                    .show(btnfrag)
                    .show(callfrag)
                    .hide(infofrag)
                    .commit();

            btncall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentManager.beginTransaction()
                            .show(listfrag)
                            .show(btnfrag)
                            .show(callfrag)
                            .hide(infofrag)
                            .commit();
                }
            });

            btninfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentManager.beginTransaction()
                            .show(listfrag)
                            .show(btnfrag)
                            .hide(callfrag)
                            .show(infofrag)
                            .commit();
                }
            });
            onItemClicked(0);
        }
        if (findViewById(R.id.layout_portrait) != null){
            fragmentManager.beginTransaction()
                    .show(listfrag)
                    .hide(btnfrag)
                    .hide(callfrag)
                    .hide(infofrag)
                    .commit();
            btncall.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentManager.beginTransaction()
                            .hide(listfrag)
                            .show(btnfrag)
                            .show(callfrag)
                            .hide(infofrag)
                            .commit();
                }
            });
            btninfo.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    fragmentManager.beginTransaction()
                            .hide(listfrag)
                            .show(btnfrag)
                            .hide(callfrag)
                            .show(infofrag)
                            .commit();
                }
            });

        }




    }

    @Override
    public void onItemClicked(final int index) {
            tvtel.setText(ApplicationClass.students.get(index).getPhone());
            tvhome.setText(ApplicationClass.students.get(index).getHome());
            tvname.setText(ApplicationClass.students.get(index).getName());
            tvhall.setText(ApplicationClass.students.get(index).getHall());
            tvblood.setText(ApplicationClass.students.get(index).getBlood());

        ivcall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+ApplicationClass.students.get(index).getPhone()));
                startActivity(intent);
            }
        });

            if(ApplicationClass.students.get(index).getPhoto().equals("eva")){
                ivpic.setImageResource(R.drawable.eva);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("sahriar")){
                ivpic.setImageResource(R.drawable.sahriar);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("dev")){
                ivpic.setImageResource(R.drawable.dev);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("masum")){
                ivpic.setImageResource(R.drawable.masum);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("tanveer")){
                ivpic.setImageResource(R.drawable.tanveer);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("arnab")){
                ivpic.setImageResource(R.drawable.arnab);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("asif")){
                ivpic.setImageResource(R.drawable.asif);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("mondal")){
                ivpic.setImageResource(R.drawable.mondal);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("shafi")){
                ivpic.setImageResource(R.drawable.shafi);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("sujon")){
                ivpic.setImageResource(R.drawable.sujon);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("mahi")){
                ivpic.setImageResource(R.drawable.mahi);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("urme")){
                ivpic.setImageResource(R.drawable.urme);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("fida")){
                ivpic.setImageResource(R.drawable.fida);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("oni")){
                ivpic.setImageResource(R.drawable.oni);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("samir")){
                ivpic.setImageResource(R.drawable.samir);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("nuhas")){
                ivpic.setImageResource(R.drawable.nuhas);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("rahul")){
                ivpic.setImageResource(R.drawable.rahul);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("mehedi")){
                ivpic.setImageResource(R.drawable.mehedi);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("noor")){
                ivpic.setImageResource(R.drawable.noor);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("sammi")){
                ivpic.setImageResource(R.drawable.sammi);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("meem")){
                ivpic.setImageResource(R.drawable.meem);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("monir")){
                ivpic.setImageResource(R.drawable.monir);
            }else if(ApplicationClass.students.get(index).getPhoto().equals("rois")){
                ivpic.setImageResource(R.drawable.rois);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("motiur")){
                ivpic.setImageResource(R.drawable.motiur);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("sakib")){
                ivpic.setImageResource(R.drawable.sakib);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("biswas")){
                ivpic.setImageResource(R.drawable.biswas);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("jweal")){
                ivpic.setImageResource(R.drawable.jweal);
            }
            else if(ApplicationClass.students.get(index).getPhoto().equals("azhar")){
                ivpic.setImageResource(R.drawable.azhar);
            }
            else {
                ivpic.setImageResource(R.drawable.amit);
            }

            if(findViewById(R.id.layout_portrait) != null){
                fragmentManager.beginTransaction()
                        .hide(listfrag)
                        .show(btnfrag)
                        .show(callfrag)
                        .addToBackStack(null)
                        .hide(infofrag)
                        .commit();

            }




    }
}
