package com.example.lingkaran;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView jari;
    TextView luas;
    TextView keliling ;
    RadioButton dtor;
    RadioButton rtod;
    Button count;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.desain);

        jari = (TextView)this.findViewById(R.id.jari);
        keliling = (TextView)this.findViewById(R.id.keliling);
        luas = (TextView)this.findViewById(R.id.luas);

        dtor = (RadioButton)this.findViewById(R.id.dtor);
        dtor.setChecked(true);
        rtod = (RadioButton)this.findViewById(R.id.rtod);

        count = (Button)this.findViewById(R.id.count);
        count.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (dtor.isChecked()){
            convertJariToLuas();}
        if (rtod.isChecked()){
            convertJariToKeliling();}
    }

    protected void convertJariToLuas() {
        double val= Double.parseDouble(jari.getText().toString());
        luas.setText(Double.toString(3.14*val*val));
    }

    protected void convertJariToKeliling() {
        double val= Double.parseDouble(jari.getText().toString());
        keliling.setText(Double.toString(2*3.14*val));
    }

}
