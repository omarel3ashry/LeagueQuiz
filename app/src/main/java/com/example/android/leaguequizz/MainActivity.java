package com.example.android.leaguequizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Objects;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {


    int result = 0;
    EditText name, Q5, Q9, Q11, Q12;
    CheckBox Q2n1, Q2n2, Q2n3, Q7n1, Q7n2, Q7n3, Q8n1, Q8n2, Q8n3;
    RadioGroup Q1, Q3, Q4, Q6, Q10;
    RadioButton Q1A, Q3A, Q4A, Q6A, Q10A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Q1 = (RadioGroup) findViewById(R.id.joke);
        Q3 = (RadioGroup) findViewById(R.id.brother);
        Q4 = (RadioGroup) findViewById(R.id.items);
        Q6 = (RadioGroup) findViewById(R.id.nasus_counter);
        Q10 = (RadioGroup) findViewById(R.id.gnar);
        Q2n1 = (CheckBox) findViewById(R.id.vayne);
        Q2n2 = (CheckBox) findViewById(R.id.kalista);
        Q2n3 = (CheckBox) findViewById(R.id.ahri);
        Q7n1 = (CheckBox) findViewById(R.id.shaco);
        Q7n2 = (CheckBox) findViewById(R.id.twitch);
        Q7n3 = (CheckBox) findViewById(R.id.evelynn);
        Q8n1 = (CheckBox) findViewById(R.id.top);
        Q8n2 = (CheckBox) findViewById(R.id.mid);
        Q8n3 = (CheckBox) findViewById(R.id.bot);
        Q5 = (EditText) findViewById(R.id.q5_varus);
        Q9 = (EditText) findViewById(R.id.q9_draven);
        Q11 = (EditText) findViewById(R.id.q11_zed);
        Q12 = (EditText) findViewById(R.id.q12_zoe);
        name = (EditText) findViewById(R.id.name);
    }

    public void submit(View view) {
        Q1A = (RadioButton) Q1.findViewById(Q1.getCheckedRadioButtonId());
        Q3A = (RadioButton) Q3.findViewById(Q3.getCheckedRadioButtonId());
        Q4A = (RadioButton) Q4.findViewById(Q4.getCheckedRadioButtonId());
        Q6A = (RadioButton) Q6.findViewById(Q6.getCheckedRadioButtonId());
        Q10A = (RadioButton) Q10.findViewById(Q10.getCheckedRadioButtonId());

        if (Q1A == findViewById(R.id.heimer)) {
            result += 1;
        }
        if (Q3A == findViewById(R.id.draven_b)) {
            result += 1;
        }
        if (Q4A == findViewById(R.id.atk_spd)) {
            result += 1;
        }
        if (Q6A == findViewById(R.id.teemo)) {
            result += 1;
        }
        if (Q10A == findViewById(R.id.both)) {
            result += 1;
        }
        if (Q2n1.isChecked() && Q2n2.isChecked() && !Q2n3.isChecked()) {
            result += 1;
        }
        if (Q7n1.isChecked() && Q7n2.isChecked() && Q7n3.isChecked()) {
            result += 1;
        }
        if (Q8n1.isChecked() && Q8n2.isChecked() && !Q8n3.isChecked()) {
            result += 1;
        }
        if (Objects.equals(Q5.getText().toString(), "varus")||Objects.equals(Q5.getText().toString(), "Varus")||Objects.equals(Q5.getText().toString(), "VARUS")) {
            result += 1;
        }
        if (Objects.equals(Q9.getText().toString(), "draven")||Objects.equals(Q9.getText().toString(), "Draven")||Objects.equals(Q9.getText().toString(), "DRAVEN")) {
            result += 1;
        }
        if (Objects.equals(Q11.getText().toString(), "zed")||Objects.equals(Q11.getText().toString(), "Zed")||Objects.equals(Q11.getText().toString(), "ZED")) {
            result += 1;
        }
        if (Objects.equals(Q12.getText().toString(), "zoe")||Objects.equals(Q12.getText().toString(), "Zoe")||Objects.equals(Q12.getText().toString(), "ZOE")) {
            result += 1;
        }

        Toast toast = Toast.makeText(this, name.getText().toString() + " your score is " + result, LENGTH_LONG);
        toast.show();
        result = 0;
    }

    public void reset(View view) {
        //CheckBox
        if (Q2n1.isChecked()) {
            Q2n1.setChecked(false);
        }
        if (Q2n2.isChecked()) {
            Q2n2.setChecked(false);
        }
        if (Q2n3.isChecked()) {
            Q2n3.setChecked(false);
        }
        if (Q7n1.isChecked()) {
            Q7n1.setChecked(false);
        }
        if (Q7n2.isChecked()) {
            Q7n2.setChecked(false);
        }
        if (Q7n3.isChecked()) {
            Q7n3.setChecked(false);
        }
        if (Q8n1.isChecked()) {
            Q8n1.setChecked(false);
        }
        if (Q8n2.isChecked()) {
            Q8n2.setChecked(false);
        }
        if (Q8n3.isChecked()) {
            Q8n3.setChecked(false);
        }
        //RadioButton
        RadioButton r11 = (RadioButton) findViewById(R.id.diana);
        if (r11.isChecked()) {
            r11.setChecked(false);
        }
        RadioButton r12 = (RadioButton) findViewById(R.id.galio);
        if (r12.isChecked()) {
            r12.setChecked(false);
        }
        RadioButton r13 = (RadioButton) findViewById(R.id.heimer);
        if (r13.isChecked()) {
            r13.setChecked(false);
        }
        RadioButton r21 = (RadioButton) findViewById(R.id.maokai);
        if (r21.isChecked()) {
            r21.setChecked(false);
        }
        RadioButton r22 = (RadioButton) findViewById(R.id.nasus);
        if (r22.isChecked()) {
            r22.setChecked(false);
        }
        RadioButton r23 = (RadioButton) findViewById(R.id.draven_b);
        if (r23.isChecked()) {
            r23.setChecked(false);
        }
        RadioButton r31 = (RadioButton) findViewById(R.id.atk_spd);
        if (r31.isChecked()) {
            r31.setChecked(false);
        }
        RadioButton r32 = (RadioButton) findViewById(R.id.armor);
        if (r32.isChecked()) {
            r32.setChecked(false);
        }
        RadioButton r33 = (RadioButton) findViewById(R.id.health);
        if (r33.isChecked()) {
            r33.setChecked(false);
        }
        RadioButton r41 = (RadioButton) findViewById(R.id.akali);
        if (r41.isChecked()) {
            r41.setChecked(false);
        }
        RadioButton r42 = (RadioButton) findViewById(R.id.teemo);
        if (r42.isChecked()) {
            r42.setChecked(false);
        }
        RadioButton r43 = (RadioButton) findViewById(R.id.braum);
        if (r43.isChecked()) {
            r43.setChecked(false);
        }
        RadioButton r51 = (RadioButton) findViewById(R.id.ranged);
        if (r51.isChecked()) {
            r51.setChecked(false);
        }
        RadioButton r52 = (RadioButton) findViewById(R.id.melee);
        if (r52.isChecked()) {
            r52.setChecked(false);
        }
        RadioButton r53 = (RadioButton) findViewById(R.id.both);
        if (r53.isChecked()) {
            r53.setChecked(false);
        }

        //EditText
        name.getText().clear();
        Q5.getText().clear();
        Q9.getText().clear();
        Q11.getText().clear();
        Q12.getText().clear();
    }
}
