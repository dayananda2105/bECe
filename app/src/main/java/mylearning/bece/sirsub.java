package mylearning.bece;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class sirsub extends AppCompatActivity {
Button year1,year2,year3,year4,sec1,sec2,sec3,sub1,sub2,sub3,sub4,sub5,sub6,lab1,lab2,lab3;
TextView op1,op2;
    TextView op3;
Calendar calendar;
SimpleDateFormat simpleDateFormat;
String date;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirsub);
        year1=(Button)findViewById(R.id.year1);
        year2=(Button)findViewById(R.id.year2);
        year3=(Button)findViewById(R.id.year3);
        year4=(Button)findViewById(R.id.year4);
        sec1=(Button)findViewById(R.id.sec1);
        sec2=(Button)findViewById(R.id.sec2);
        sec3=(Button)findViewById(R.id.sec3);
        sub1=(Button)findViewById(R.id.sub1);
        sub2=(Button)findViewById(R.id.sub2);
        sub3=(Button)findViewById(R.id.sub3);
        sub4=(Button)findViewById(R.id.sub4);
        sub5=(Button)findViewById(R.id.sub5);
        sub6=(Button)findViewById(R.id.sub6);
        lab1=(Button)findViewById(R.id.lab1);
        lab2=(Button)findViewById(R.id.lab2);
        lab3=(Button)findViewById(R.id.lab3);
        op1=(TextView)findViewById(R.id.op1);
        op2=(TextView)findViewById(R.id.op2);
        op3=(TextView)findViewById(R.id.op3);
        calendar= Calendar.getInstance();
        simpleDateFormat=new SimpleDateFormat("yyyyMM");
        date=simpleDateFormat.format(calendar.getTime());
        year1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String sd1= String.valueOf("06");
                float ope1 = Float.valueOf(date);
                float ope2 = Float.valueOf(sd1);
                int ope3= (int) (((ope1)-(ope2))/100);
                String opr2= String.valueOf(ope3);
                op2.setText(opr2, TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.VISIBLE);
                sec2.setVisibility(View.VISIBLE);
                sec3.setVisibility(View.VISIBLE);
            }
        });
        year2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sd1= String.valueOf("106");
                float ope1 = Float.valueOf(date);
                float ope2 = Float.valueOf(sd1);
                int ope3= (int) (((ope1)-(ope2))/100);
                String opr2= String.valueOf(ope3);
                op2.setText(opr2, TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.VISIBLE);
                sec2.setVisibility(View.VISIBLE);
                sec3.setVisibility(View.VISIBLE);
            }
        });
        year3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sd1= String.valueOf("206");
                float ope1 = Float.valueOf(date);
                float ope2 = Float.valueOf(sd1);
                int ope3= (int) (((ope1)-(ope2))/100);
                String opr2= String.valueOf(ope3);
                op2.setText(opr2, TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.VISIBLE);
                sec2.setVisibility(View.VISIBLE);
                sec3.setVisibility(View.VISIBLE);
            }
        });
        year4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sd1= String.valueOf("306");
                float ope1 = Float.valueOf(date);
                float ope2 = Float.valueOf(sd1);
                int ope3= (int) (((ope1)-(ope2))/100);
                String opr2= String.valueOf(ope3);
                op2.setText(opr2, TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.VISIBLE);
                sec2.setVisibility(View.VISIBLE);
                sec3.setVisibility(View.VISIBLE);
            }
        });
        sec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"A", TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.INVISIBLE);
                sec2.setVisibility(View.INVISIBLE);
                sec3.setVisibility(View.INVISIBLE);
                sub1.setVisibility(View.VISIBLE);
                sub2.setVisibility(View.VISIBLE);
                sub3.setVisibility(View.VISIBLE);
                sub4.setVisibility(View.VISIBLE);
                sub5.setVisibility(View.VISIBLE);
                sub6.setVisibility(View.VISIBLE);
                lab1.setVisibility(View.VISIBLE);
                lab2.setVisibility(View.VISIBLE);
                lab3.setVisibility(View.VISIBLE);
            }
        });
        sec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"B", TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.INVISIBLE);
                sec2.setVisibility(View.INVISIBLE);
                sec3.setVisibility(View.INVISIBLE);
                sub1.setVisibility(View.VISIBLE);
                sub2.setVisibility(View.VISIBLE);
                sub3.setVisibility(View.VISIBLE);
                sub4.setVisibility(View.VISIBLE);
                sub5.setVisibility(View.VISIBLE);
                sub6.setVisibility(View.VISIBLE);
                lab1.setVisibility(View.VISIBLE);
                lab2.setVisibility(View.VISIBLE);
                lab3.setVisibility(View.VISIBLE);
            }
        });
        sec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"C", TextView.BufferType.EDITABLE);
                sec1.setVisibility(View.INVISIBLE);
                sec2.setVisibility(View.INVISIBLE);
                sec3.setVisibility(View.INVISIBLE);
                sub1.setVisibility(View.VISIBLE);
                sub2.setVisibility(View.VISIBLE);
                sub3.setVisibility(View.VISIBLE);
                sub4.setVisibility(View.VISIBLE);
                sub5.setVisibility(View.VISIBLE);
                sub6.setVisibility(View.VISIBLE);
                lab1.setVisibility(View.VISIBLE);
                lab2.setVisibility(View.VISIBLE);
                lab3.setVisibility(View.VISIBLE);
            }
        });
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("1",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("2",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("3",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("4",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("5",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("6",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        lab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("7",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        lab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("8",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        lab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setText("9",TextView.BufferType.EDITABLE);
                Intent ma=new Intent(sirsub.this,siratt.class);
                ma.putExtra("id",op3.getText().toString());
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
    }
}
