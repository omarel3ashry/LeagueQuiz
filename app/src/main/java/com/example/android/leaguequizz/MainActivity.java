package com.example.android.leaguequizz;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Objects;


public class MainActivity extends AppCompatActivity {

    int result = 0;
    EditText name,
            Question5,
            Question9,
            Question11,
            Question12;
    CheckBox Question2n1,
            Question2n2,
            Question2n3,
            Question7n1,
            Question7n2,
            Question7n3,
            Question8n1,
            Question8n2,
            Question8n3;
    RadioGroup Question1,
            Question3,
            Question4,
            Question6,
            Question10;
    RadioButton Question1A,
            Question3A,
            Question4A,
            Question6A,
            Question10A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Question1 = findViewById(R.id.joke);
        Question3 = findViewById(R.id.brother);
        Question4 = findViewById(R.id.items);
        Question6 = findViewById(R.id.nasus_counter);
        Question10 = findViewById(R.id.gnar);
        Question2n1 = findViewById(R.id.vayne);
        Question2n2 = findViewById(R.id.kalista);
        Question2n3 = findViewById(R.id.ahri);
        Question7n1 = findViewById(R.id.shaco);
        Question7n2 = findViewById(R.id.twitch);
        Question7n3 = findViewById(R.id.evelynn);
        Question8n1 = findViewById(R.id.top);
        Question8n2 = findViewById(R.id.mid);
        Question8n3 = findViewById(R.id.bot);
        Question5 = findViewById(R.id.q5_varus);
        Question9 = findViewById(R.id.q9_draven);
        Question11 = findViewById(R.id.q11_zed);
        Question12 = findViewById(R.id.q12_zoe);
        name = findViewById(R.id.name);
    }

    @SuppressLint("SetTextI18n")
    public void submit(View view) {
        Question1A = Question1.findViewById(Question1.getCheckedRadioButtonId());
        Question3A = Question3.findViewById(Question3.getCheckedRadioButtonId());
        Question4A = Question4.findViewById(Question4.getCheckedRadioButtonId());
        Question6A = Question6.findViewById(Question6.getCheckedRadioButtonId());
        Question10A = Question10.findViewById(Question10.getCheckedRadioButtonId());

        if (Question1A == findViewById(R.id.heimer)) {
            result += 1;
        }
        if (Question3A == findViewById(R.id.draven_b)) {
            result += 1;
        }
        if (Question4A == findViewById(R.id.atk_spd)) {
            result += 1;
        }
        if (Question6A == findViewById(R.id.teemo)) {
            result += 1;
        }
        if (Question10A == findViewById(R.id.both)) {
            result += 1;
        }
        if (Question2n1.isChecked() && Question2n2.isChecked() && !Question2n3.isChecked()) {
            result += 1;
        }
        if (Question7n1.isChecked() && Question7n2.isChecked() && Question7n3.isChecked()) {
            result += 1;
        }
        if (Question8n1.isChecked() && Question8n2.isChecked() && !Question8n3.isChecked()) {
            result += 1;
        }
        if (Objects.equals(Question5.getText().toString(), "varus")) {
            result += 1;
        }
        else if (Objects.equals(Question5.getText().toString(), "Varus")){
            result += 1;
        }
        else if (Objects.equals(Question5.getText().toString(), "VARUS")){
            result += 1;
        }

        if (Objects.equals(Question9.getText().toString(), "draven")) {
            result += 1;
        }
        else if (Objects.equals(Question9.getText().toString(), "Draven")){
            result += 1;
        }
        else if (Objects.equals(Question9.getText().toString(), "DRAVEN")){
            result += 1;
        }
        if (Objects.equals(Question11.getText().toString(), "zed")) {
            result += 1;
        }
        else if (Objects.equals(Question11.getText().toString(), "Zed")){
            result += 1;
        }
        else if (Objects.equals(Question11.getText().toString(), "ZED")){
            result += 1;
        }
        if (Objects.equals(Question12.getText().toString(), "zoe")) {
            result += 1;
        }
        else if (Objects.equals(Question12.getText().toString(), "Zoe")){
            result += 1;
        }
        else if (Objects.equals(Question12.getText().toString(), "ZOE")){
            result += 1;
        }
        

        Dialog fialog = new Dialog(this);
        fialog.setContentView(R.layout.score_dialog);
        fialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        TextView tt = fialog.findViewById(R.id.res_dialog);
        tt.setText(name.getText().toString() + " your score " + result);
        fialog.show();
        result = 0;
    }

    @SuppressLint("SetTextI18n")
    public void reset(View view) {
        //CheckBox
        if (Question2n1.isChecked()) {
            Question2n1.setChecked(false);
        }
        if (Question2n2.isChecked()) {
            Question2n2.setChecked(false);
        }
        if (Question2n3.isChecked()) {
            Question2n3.setChecked(false);
        }
        if (Question7n1.isChecked()) {
            Question7n1.setChecked(false);
        }
        if (Question7n2.isChecked()) {
            Question7n2.setChecked(false);
        }
        if (Question7n3.isChecked()) {
            Question7n3.setChecked(false);
        }
        if (Question8n1.isChecked()) {
            Question8n1.setChecked(false);
        }
        if (Question8n2.isChecked()) {
            Question8n2.setChecked(false);
        }
        if (Question8n3.isChecked()) {
            Question8n3.setChecked(false);
        }
        //RadioButton
        RadioButton r11 = findViewById(R.id.diana);
        if (r11.isChecked()) {
            r11.setChecked(false);
        }
        RadioButton r12 = findViewById(R.id.galio);
        if (r12.isChecked()) {
            r12.setChecked(false);
        }
        RadioButton r13 = findViewById(R.id.heimer);
        if (r13.isChecked()) {
            r13.setChecked(false);
        }
        RadioButton r21 = findViewById(R.id.maokai);
        if (r21.isChecked()) {
            r21.setChecked(false);
        }
        RadioButton r22 = findViewById(R.id.nasus);
        if (r22.isChecked()) {
            r22.setChecked(false);
        }
        RadioButton r23 = findViewById(R.id.draven_b);
        if (r23.isChecked()) {
            r23.setChecked(false);
        }
        RadioButton r31 = findViewById(R.id.atk_spd);
        if (r31.isChecked()) {
            r31.setChecked(false);
        }
        RadioButton r32 = findViewById(R.id.armor);
        if (r32.isChecked()) {
            r32.setChecked(false);
        }
        RadioButton r33 = findViewById(R.id.health);
        if (r33.isChecked()) {
            r33.setChecked(false);
        }
        RadioButton r41 = findViewById(R.id.akali);
        if (r41.isChecked()) {
            r41.setChecked(false);
        }
        RadioButton r42 = findViewById(R.id.teemo);
        if (r42.isChecked()) {
            r42.setChecked(false);
        }
        RadioButton r43 = findViewById(R.id.braum);
        if (r43.isChecked()) {
            r43.setChecked(false);
        }
        RadioButton r51 = findViewById(R.id.ranged);
        if (r51.isChecked()) {
            r51.setChecked(false);
        }
        RadioButton r52 = findViewById(R.id.melee);
        if (r52.isChecked()) {
            r52.setChecked(false);
        }
        RadioButton r53 = findViewById(R.id.both);
        if (r53.isChecked()) {
            r53.setChecked(false);
        }

        //EditText
        name.getText().clear();
        Question5.getText().clear();
        Question9.getText().clear();
        Question11.getText().clear();
        Question12.getText().clear();
        result = 0;
    }
}
