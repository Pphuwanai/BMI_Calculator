package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.bmicalculator.model.Human;

public class MainActivity extends AppCompatActivity {
    private Human human;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            EditText et1 = (EditText) findViewById(R.id.editText);
            EditText et2 = (EditText) findViewById(R.id.editText2);
            public void onClick(View view) {
                if(et1.length() == 0 || et2.length() == 0) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                    dialog.setTitle("ผิดพลาด");
                    dialog.setMessage("ป้อนข้อมูลไม่ครบ");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    dialog.show();
                }
                else {
                    human = new Human(Double.parseDouble(String.valueOf(et1.getText())),Double.parseDouble(String.valueOf(et2.getText())));
                    Intent intent = new Intent(MainActivity.this,activity_2.class);

                    intent.putExtra("value",human.calculator());
                    intent.putExtra("name",human.valueBMI());
                    startActivity(intent);
                }


            }
        });


    }
}
