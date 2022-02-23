package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText proba1, fis1, qui1, ing1, ori1, met1, sop1, lab1, proy1, prom1, prom2, prom3, promfn;
    private EditText proba2, fis2, qui2, ing2, ori2, met2, sop2, lab2, proy2;
    private EditText proba3, fis3, qui3, ing3, ori3, met3, sop3, lab3, proy3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_SHORT).show();

        proba1 = (EditText) findViewById(R.id.txt_proba1);
        fis1 = (EditText) findViewById(R.id.txt_fis1);
        qui1 = (EditText) findViewById(R.id.txt_qui1);
        ing1 = (EditText) findViewById(R.id.txt_ing1);
        ori1 = (EditText) findViewById(R.id.txt_ori1);
        met1 = (EditText) findViewById(R.id.txt_met1);
        sop1 = (EditText) findViewById(R.id.txt_sop1);
        lab1 = (EditText) findViewById(R.id.txt_lab1);
        proy1 = (EditText) findViewById(R.id.txt_proy1);
        prom1 = (EditText) findViewById(R.id.txt_prom1);

        proba2 = (EditText) findViewById(R.id.txt_proba2);
        fis2 = (EditText) findViewById(R.id.txt_fis2);
        qui2 = (EditText) findViewById(R.id.txt_qui2);
        ing2 = (EditText) findViewById(R.id.txt_ing2);
        ori2 = (EditText) findViewById(R.id.txt_ori2);
        met2 = (EditText) findViewById(R.id.txt_met2);
        sop2 = (EditText) findViewById(R.id.txt_sop2);
        lab2 = (EditText) findViewById(R.id.txt_lab2);
        proy2 = (EditText) findViewById(R.id.txt_proy2);
        prom2 = (EditText) findViewById(R.id.txt_prom2);

        proba3 = (EditText) findViewById(R.id.txt_proba3);
        fis3 = (EditText) findViewById(R.id.txt_fis3);
        qui3 = (EditText) findViewById(R.id.txt_qui3);
        ing3 = (EditText) findViewById(R.id.txt_ing3);
        ori3 = (EditText) findViewById(R.id.txt_ori3);
        met3 = (EditText) findViewById(R.id.txt_met3);
        sop3 = (EditText) findViewById(R.id.txt_sop3);
        lab3 = (EditText) findViewById(R.id.txt_lab3);
        proy3 = (EditText) findViewById(R.id.txt_proy3);
        prom3 = (EditText) findViewById(R.id.txt_prom3);
        promfn = (EditText) findViewById(R.id.txt_promfn);
    }

    public boolean promedio1(View view){

        boolean retorno = true;

        String mat1 = proba1.getText().toString();
        String mat2 = fis1.getText().toString();
        String mat3 = qui1.getText().toString();
        String mat4 = ing1.getText().toString();
        String mat5 = ori1.getText().toString();
        String mat6 = met1.getText().toString();
        String mat7 = sop1.getText().toString();
        String mat8 = lab1.getText().toString();
        String mat9 = proy1.getText().toString();

        if(mat1.isEmpty() || mat2.isEmpty() || mat3.isEmpty() || mat4.isEmpty() || mat5.isEmpty() || mat6.isEmpty() || mat7.isEmpty() || mat8.isEmpty() || mat9.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;

            double cal1 = Double.parseDouble(mat1);
            double cal2 = Double.parseDouble(mat2);
            double cal3 = Double.parseDouble(mat3);
            double cal4 = Double.parseDouble(mat4);
            double cal5 = Double.parseDouble(mat5);
            double cal6 = Double.parseDouble(mat6);
            double cal7 = Double.parseDouble(mat7);
            double cal8 = Double.parseDouble(mat8);
            double cal9 = Double.parseDouble(mat9);

            if (cal1 > 10 || cal2 > 10 || cal3 > 10 || cal4 > 10 || cal5 > 10 || cal6 > 10 || cal7 > 10 || cal8 > 10 || cal9 > 10){
                Toast.makeText(this, "Los valores no deben ser mayor a 10", Toast.LENGTH_LONG).show();
            } else{
                double promedio1 = (cal1 + cal2 + cal3 + cal4 + cal5 + cal6 + cal7 + cal8 + cal9)/9;

                String result = String.valueOf(promedio1);
                prom1.setText(result);

                if (cal1 < cal2 && cal1 < cal3 && cal1 < cal4 && cal1 < cal5 && cal1 < cal6 && cal1 < cal7 && cal1 < cal8 && cal1 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Probabilidad", Toast.LENGTH_LONG).show();
                } else if (cal2 < cal1 && cal2 < cal3 && cal2 < cal4 && cal2 < cal5 && cal2 < cal6 && cal2 < cal7 && cal2 < cal8 && cal2 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de FisicaIV", Toast.LENGTH_LONG).show();
                } else if (cal3 < cal1 && cal3 < cal2 && cal3 < cal4 && cal3 < cal5 && cal3 < cal6 && cal3 < cal7 && cal3 < cal8 && cal3 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de QuimicaIV", Toast.LENGTH_LONG).show();
                } else if (cal4 < cal1 && cal4 < cal2 && cal4 < cal3 && cal4 < cal5 && cal4 < cal6 && cal4 < cal7 && cal4 < cal8 && cal4 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de InglesIV", Toast.LENGTH_LONG).show();
                } else if (cal5 < cal1 && cal5 < cal2 && cal5 < cal3 && cal5 < cal4 && cal5 < cal6 && cal5 < cal7 && cal5 < cal8 && cal5 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Orientacion", Toast.LENGTH_LONG).show();
                } else if (cal6 < cal1 && cal6 < cal2 && cal6 < cal3 && cal6 < cal4 && cal6 < cal5 && cal6 < cal7 && cal6 < cal8 && cal6 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Metodos agiles", Toast.LENGTH_LONG).show();
                } else if (cal7 < cal1 && cal7 < cal2 && cal7 < cal3 && cal7 < cal4 && cal7 < cal5 && cal7 < cal6 && cal7 < cal8 && cal7 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Soporte de Software", Toast.LENGTH_LONG).show();
                } else if (cal8 < cal1 && cal8 < cal2 && cal8 < cal3 && cal8 < cal4 && cal8 < cal5 && cal8 < cal6 && cal8 < cal7 && cal8 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Laboratorio", Toast.LENGTH_LONG).show();
                } else if (cal9 < cal1 && cal9 < cal2 && cal9 < cal3 && cal9 < cal4 && cal9 < cal5 && cal9 < cal6 && cal9 < cal7 && cal9 < cal8){
                    Toast.makeText(this, "La menor calificacion fue de Proyecto Integrador", Toast.LENGTH_LONG).show();
                }
            }
        }
        return retorno;
    }

    public boolean promedio2(View view){

        boolean retorno = true;

        String mat1 = proba2.getText().toString();
        String mat2 = fis2.getText().toString();
        String mat3 = qui2.getText().toString();
        String mat4 = ing2.getText().toString();
        String mat5 = ori2.getText().toString();
        String mat6 = met2.getText().toString();
        String mat7 = sop2.getText().toString();
        String mat8 = lab2.getText().toString();
        String mat9 = proy2.getText().toString();

        if(mat1.isEmpty() || mat2.isEmpty() || mat3.isEmpty() || mat4.isEmpty() || mat5.isEmpty() || mat6.isEmpty() || mat7.isEmpty() || mat8.isEmpty() || mat9.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;

            double cal1 = Double.parseDouble(mat1);
            double cal2 = Double.parseDouble(mat2);
            double cal3 = Double.parseDouble(mat3);
            double cal4 = Double.parseDouble(mat4);
            double cal5 = Double.parseDouble(mat5);
            double cal6 = Double.parseDouble(mat6);
            double cal7 = Double.parseDouble(mat7);
            double cal8 = Double.parseDouble(mat8);
            double cal9 = Double.parseDouble(mat9);

            if (cal1 > 10 || cal2 > 10 || cal3 > 10 || cal4 > 10 || cal5 > 10 || cal6 > 10 || cal7 > 10 || cal8 > 10 || cal9 > 10){
                Toast.makeText(this, "Los valores no deben ser mayor a 10", Toast.LENGTH_LONG).show();
            } else{
                double promedio2 = (cal1 + cal2 + cal3 + cal4 + cal5 + cal6 + cal7 + cal8 + cal9)/9;

                String result = String.valueOf(promedio2);
                prom2.setText(result);

                if (cal1 < cal2 && cal1 < cal3 && cal1 < cal4 && cal1 < cal5 && cal1 < cal6 && cal1 < cal7 && cal1 < cal8 && cal1 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Probabilidad", Toast.LENGTH_LONG).show();
                } else if (cal2 < cal1 && cal2 < cal3 && cal2 < cal4 && cal2 < cal5 && cal2 < cal6 && cal2 < cal7 && cal2 < cal8 && cal2 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de FisicaIV", Toast.LENGTH_LONG).show();
                } else if (cal3 < cal1 && cal3 < cal2 && cal3 < cal4 && cal3 < cal5 && cal3 < cal6 && cal3 < cal7 && cal3 < cal8 && cal3 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de QuimicaIV", Toast.LENGTH_LONG).show();
                } else if (cal4 < cal1 && cal4 < cal2 && cal4 < cal3 && cal4 < cal5 && cal4 < cal6 && cal4 < cal7 && cal4 < cal8 && cal4 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de InglesIV", Toast.LENGTH_LONG).show();
                } else if (cal5 < cal1 && cal5 < cal2 && cal5 < cal3 && cal5 < cal4 && cal5 < cal6 && cal5 < cal7 && cal5 < cal8 && cal5 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Orientacion", Toast.LENGTH_LONG).show();
                } else if (cal6 < cal1 && cal6 < cal2 && cal6 < cal3 && cal6 < cal4 && cal6 < cal5 && cal6 < cal7 && cal6 < cal8 && cal6 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Metodos agiles", Toast.LENGTH_LONG).show();
                } else if (cal7 < cal1 && cal7 < cal2 && cal7 < cal3 && cal7 < cal4 && cal7 < cal5 && cal7 < cal6 && cal7 < cal8 && cal7 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Soporte de Software", Toast.LENGTH_LONG).show();
                } else if (cal8 < cal1 && cal8 < cal2 && cal8 < cal3 && cal8 < cal4 && cal8 < cal5 && cal8 < cal6 && cal8 < cal7 && cal8 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Laboratorio", Toast.LENGTH_LONG).show();
                } else if (cal9 < cal1 && cal9 < cal2 && cal9 < cal3 && cal9 < cal4 && cal9 < cal5 && cal9 < cal6 && cal9 < cal7 && cal9 < cal8){
                    Toast.makeText(this, "La menor calificacion fue de Proyecto Integrador", Toast.LENGTH_LONG).show();
                }
            }
        }
        return retorno;
    }

    public boolean promedio3(View view){

        boolean retorno = true;

        String mat1 = proba3.getText().toString();
        String mat2 = fis3.getText().toString();
        String mat3 = qui3.getText().toString();
        String mat4 = ing3.getText().toString();
        String mat5 = ori3.getText().toString();
        String mat6 = met3.getText().toString();
        String mat7 = sop3.getText().toString();
        String mat8 = lab3.getText().toString();
        String mat9 = proy3.getText().toString();

        if(mat1.isEmpty() || mat2.isEmpty() || mat3.isEmpty() || mat4.isEmpty() || mat5.isEmpty() || mat6.isEmpty() || mat7.isEmpty() || mat8.isEmpty() || mat9.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;
            double cal1 = Double.parseDouble(mat1);
            double cal2 = Double.parseDouble(mat2);
            double cal3 = Double.parseDouble(mat3);
            double cal4 = Double.parseDouble(mat4);
            double cal5 = Double.parseDouble(mat5);
            double cal6 = Double.parseDouble(mat6);
            double cal7 = Double.parseDouble(mat7);
            double cal8 = Double.parseDouble(mat8);
            double cal9 = Double.parseDouble(mat9);

            if (cal1 > 10 || cal2 > 10 || cal3 > 10 || cal4 > 10 || cal5 > 10 || cal6 > 10 || cal7 > 10 || cal8 > 10 || cal9 > 10){
                Toast.makeText(this, "Los valores no deben ser mayor a 10", Toast.LENGTH_LONG).show();
            } else{
                double promedio3 = (cal1 + cal2 + cal3 + cal4 + cal5 + cal6 + cal7 + cal8 + cal9)/9;

                String result = String.valueOf(promedio3);
                prom3.setText(result);

                if (cal1 < cal2 && cal1 < cal3 && cal1 < cal4 && cal1 < cal5 && cal1 < cal6 && cal1 < cal7 && cal1 < cal8 && cal1 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Probabilidad", Toast.LENGTH_LONG).show();
                } else if (cal2 < cal1 && cal2 < cal3 && cal2 < cal4 && cal2 < cal5 && cal2 < cal6 && cal2 < cal7 && cal2 < cal8 && cal2 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de FisicaIV", Toast.LENGTH_LONG).show();
                } else if (cal3 < cal1 && cal3 < cal2 && cal3 < cal4 && cal3 < cal5 && cal3 < cal6 && cal3 < cal7 && cal3 < cal8 && cal3 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de QuimicaIV", Toast.LENGTH_LONG).show();
                } else if (cal4 < cal1 && cal4 < cal2 && cal4 < cal3 && cal4 < cal5 && cal4 < cal6 && cal4 < cal7 && cal4 < cal8 && cal4 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de InglesIV", Toast.LENGTH_LONG).show();
                } else if (cal5 < cal1 && cal5 < cal2 && cal5 < cal3 && cal5 < cal4 && cal5 < cal6 && cal5 < cal7 && cal5 < cal8 && cal5 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Orientacion", Toast.LENGTH_LONG).show();
                } else if (cal6 < cal1 && cal6 < cal2 && cal6 < cal3 && cal6 < cal4 && cal6 < cal5 && cal6 < cal7 && cal6 < cal8 && cal6 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Metodos agiles", Toast.LENGTH_LONG).show();
                } else if (cal7 < cal1 && cal7 < cal2 && cal7 < cal3 && cal7 < cal4 && cal7 < cal5 && cal7 < cal6 && cal7 < cal8 && cal7 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Soporte de Software", Toast.LENGTH_LONG).show();
                } else if (cal8 < cal1 && cal8 < cal2 && cal8 < cal3 && cal8 < cal4 && cal8 < cal5 && cal8 < cal6 && cal8 < cal7 && cal8 < cal9){
                    Toast.makeText(this, "La menor calificacion fue de Laboratorio", Toast.LENGTH_LONG).show();
                } else if (cal9 < cal1 && cal9 < cal2 && cal9 < cal3 && cal9 < cal4 && cal9 < cal5 && cal9 < cal6 && cal9 < cal7 && cal9 < cal8){
                    Toast.makeText(this, "La menor calificacion fue de Proyecto Integrador", Toast.LENGTH_LONG).show();
                }
            }
        }
        return retorno;
    }

    public boolean promediofn(View view){

        boolean retorno = true;

        String promedio1 = prom1.getText().toString();
        String promedio2 = prom2.getText().toString();
        String promedio3 = prom3.getText().toString();

        if(promedio1.isEmpty() || promedio2.isEmpty() || promedio3.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos y calcula los promedios", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;
            double cal1 = Double.parseDouble(promedio1);
            double cal2 = Double.parseDouble(promedio2);
            double cal3 = Double.parseDouble(promedio3);

            double promediofn = (cal1 + cal2 + cal3)/3;

            String result = String.valueOf(promediofn);
            promfn.setText(result);
        }
        return retorno;
    }

    public boolean extrapp(View view){

        boolean retorno = true;

        String mat1 = proba1.getText().toString();
        String mat2 = fis1.getText().toString();
        String mat3 = qui1.getText().toString();
        String mat4 = ing1.getText().toString();
        String mat5 = ori1.getText().toString();
        String mat6 = met1.getText().toString();
        String mat7 = sop1.getText().toString();
        String mat8 = lab1.getText().toString();
        String mat9 = proy1.getText().toString();

        if(mat1.isEmpty() || mat2.isEmpty() || mat3.isEmpty() || mat4.isEmpty() || mat5.isEmpty() || mat6.isEmpty() || mat7.isEmpty() || mat8.isEmpty() || mat9.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;
            double cal1 = Double.parseDouble(mat1);
            double cal2 = Double.parseDouble(mat2);
            double cal3 = Double.parseDouble(mat3);
            double cal4 = Double.parseDouble(mat4);
            double cal5 = Double.parseDouble(mat5);
            double cal6 = Double.parseDouble(mat6);
            double cal7 = Double.parseDouble(mat7);
            double cal8 = Double.parseDouble(mat8);
            double cal9 = Double.parseDouble(mat9);

            if (cal1 < 6){
                Toast.makeText(this, "Haras extraordinario de Probabilidad", Toast.LENGTH_LONG).show();
            } else if (cal2 < 6){
                Toast.makeText(this, "Haras extraordinario de FisicaIV", Toast.LENGTH_LONG).show();
            } else if (cal3 < 6){
                Toast.makeText(this, "Haras extraordinario de QuimicaIV", Toast.LENGTH_LONG).show();
            } else if (cal4 < 6){
                Toast.makeText(this, "Haras extraordinario de InglesIV", Toast.LENGTH_LONG).show();
            } else if (cal5 < 6){
                Toast.makeText(this, "Haras extraordinario de Orientacion", Toast.LENGTH_LONG).show();
            } else if (cal6 < 6){
                Toast.makeText(this, "Haras extraordinario de Metodos agiles", Toast.LENGTH_LONG).show();
            } else if (cal7 < 6){
                Toast.makeText(this, "Haras extraordinario de Soporte de Software", Toast.LENGTH_LONG).show();
            } else if (cal8 < 6){
                Toast.makeText(this, "Haras extraordinario de Laboratorio", Toast.LENGTH_LONG).show();
            } else if (cal9 < 6){
                Toast.makeText(this, "Haras extraordinario de Proyecto Integrador", Toast.LENGTH_LONG).show();
            }
        }
        return retorno;
    }

    public boolean extrasp(View view){

        boolean retorno = true;

        String mat1 = proba2.getText().toString();
        String mat2 = fis2.getText().toString();
        String mat3 = qui2.getText().toString();
        String mat4 = ing2.getText().toString();
        String mat5 = ori2.getText().toString();
        String mat6 = met2.getText().toString();
        String mat7 = sop2.getText().toString();
        String mat8 = lab2.getText().toString();
        String mat9 = proy2.getText().toString();

        if(mat1.isEmpty() || mat2.isEmpty() || mat3.isEmpty() || mat4.isEmpty() || mat5.isEmpty() || mat6.isEmpty() || mat7.isEmpty() || mat8.isEmpty() || mat9.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;
            double cal1 = Double.parseDouble(mat1);
            double cal2 = Double.parseDouble(mat2);
            double cal3 = Double.parseDouble(mat3);
            double cal4 = Double.parseDouble(mat4);
            double cal5 = Double.parseDouble(mat5);
            double cal6 = Double.parseDouble(mat6);
            double cal7 = Double.parseDouble(mat7);
            double cal8 = Double.parseDouble(mat8);
            double cal9 = Double.parseDouble(mat9);

            if (cal1 < 6){
                Toast.makeText(this, "Haras extraordinario de Probabilidad", Toast.LENGTH_LONG).show();
            } else if (cal2 < 6){
                Toast.makeText(this, "Haras extraordinario de FisicaIV", Toast.LENGTH_LONG).show();
            } else if (cal3 < 6){
                Toast.makeText(this, "Haras extraordinario de QuimicaIV", Toast.LENGTH_LONG).show();
            } else if (cal4 < 6){
                Toast.makeText(this, "Haras extraordinario de InglesIV", Toast.LENGTH_LONG).show();
            } else if (cal5 < 6){
                Toast.makeText(this, "Haras extraordinario de Orientacion", Toast.LENGTH_LONG).show();
            } else if (cal6 < 6){
                Toast.makeText(this, "Haras extraordinario de Metodos agiles", Toast.LENGTH_LONG).show();
            } else if (cal7 < 6){
                Toast.makeText(this, "Haras extraordinario de Soporte de Software", Toast.LENGTH_LONG).show();
            } else if (cal8 < 6){
                Toast.makeText(this, "Haras extraordinario de Laboratorio", Toast.LENGTH_LONG).show();
            } else if (cal9 < 6){
                Toast.makeText(this, "Haras extraordinario de Proyecto Integrador", Toast.LENGTH_LONG).show();
            }
        }
        return retorno;
    }

    public boolean extratp(View view){

        boolean retorno = true;

        String mat1 = proba3.getText().toString();
        String mat2 = fis3.getText().toString();
        String mat3 = qui3.getText().toString();
        String mat4 = ing3.getText().toString();
        String mat5 = ori3.getText().toString();
        String mat6 = met3.getText().toString();
        String mat7 = sop3.getText().toString();
        String mat8 = lab3.getText().toString();
        String mat9 = proy3.getText().toString();

        if(mat1.isEmpty() || mat2.isEmpty() || mat3.isEmpty() || mat4.isEmpty() || mat5.isEmpty() || mat6.isEmpty() || mat7.isEmpty() || mat8.isEmpty() || mat9.isEmpty()){
            Toast.makeText(this, "Porfavor llena los campos", Toast.LENGTH_LONG).show();
            retorno = false;
        } else{
            retorno = true;
            double cal1 = Double.parseDouble(mat1);
            double cal2 = Double.parseDouble(mat2);
            double cal3 = Double.parseDouble(mat3);
            double cal4 = Double.parseDouble(mat4);
            double cal5 = Double.parseDouble(mat5);
            double cal6 = Double.parseDouble(mat6);
            double cal7 = Double.parseDouble(mat7);
            double cal8 = Double.parseDouble(mat8);
            double cal9 = Double.parseDouble(mat9);

            if (cal1 < 6){
                Toast.makeText(this, "Haras extraordinario de Probabilidad", Toast.LENGTH_LONG).show();
            } else if (cal2 < 6){
                Toast.makeText(this, "Haras extraordinario de FisicaIV", Toast.LENGTH_LONG).show();
            } else if (cal3 < 6){
                Toast.makeText(this, "Haras extraordinario de QuimicaIV", Toast.LENGTH_LONG).show();
            } else if (cal4 < 6){
                Toast.makeText(this, "Haras extraordinario de InglesIV", Toast.LENGTH_LONG).show();
            } else if (cal5 < 6){
                Toast.makeText(this, "Haras extraordinario de Orientacion", Toast.LENGTH_LONG).show();
            } else if (cal6 < 6){
                Toast.makeText(this, "Haras extraordinario de Metodos agiles", Toast.LENGTH_LONG).show();
            } else if (cal7 < 6){
                Toast.makeText(this, "Haras extraordinario de Soporte de Software", Toast.LENGTH_LONG).show();
            } else if (cal8 < 6){
                Toast.makeText(this, "Haras extraordinario de Laboratorio", Toast.LENGTH_LONG).show();
            } else if (cal9 < 6){
                Toast.makeText(this, "Haras extraordinario de Proyecto Integrador", Toast.LENGTH_LONG).show();
            }
        }
        return retorno;
    }
}