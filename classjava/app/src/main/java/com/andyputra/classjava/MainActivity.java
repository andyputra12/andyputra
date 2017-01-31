package com.andyputra.classjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String showStrig;
    public TextView showText;
    public barang [] arrBarang = new barang[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showText = (TextView) findViewById(R.id.show_text);


        showStrig = "manipulasi Class Java Android";
        addseparator();

        initBarang();
        showStrig += arrBarang[5].toString();
        addseparator();
        showStrig += arrBarang[2].toString();
        showText.setText(showStrig);
    }
    public void addseparator(){
        showStrig += "\n---------------------------------------------\n";
    }

    public void initBarang(){
        arrBarang[0] = new barang("laptop", 1, 7000000);
        arrBarang[1] = new barang("Printer",barang.ELEKTRONIK , 7000000);
        arrBarang[2] = new barang("Yizzy", barang.NON_ELEKTRONIK, 20000000);
        arrBarang[3] = new barang("LCD", barang.ELEKTRONIK, 7000000);
        arrBarang[4] = new barang("Rijal", barang.NON_ELEKTRONIK, 100);
        arrBarang[5] = new barang("Vibrator", barang.ELEKTRONIK, 7000);
        arrBarang[6] = new barang("Keyboard", barang.ELEKTRONIK, 1000);
        arrBarang[7] = new barang("Mouse", barang.ELEKTRONIK, 7000000);
        arrBarang[8] = new barang("KacaMata", barang.NON_ELEKTRONIK, 5000);
        arrBarang[9] = new barang("KaosKaki", barang.NON_ELEKTRONIK, 1000);
    }
}