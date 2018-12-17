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

public class subatt extends AppCompatActivity {
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
        setContentView(R.layout.activity_subatt);
        year1=(Button)findViewById(R.id.year1);
        year2=(Button)findViewById(R.id.year2);
        year3=(Button)findViewById(R.id.year3);
        year4=(Button)findViewById(R.id.year4);
        sec1=(Button)findViewById(R.id.sec1);
        sec2=(Button)findViewById(R.id.sec2);
        sec3=(Button)findViewById(R.id.sec3);
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
                Intent ma=new Intent(subatt.this,attendance.class);
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"B", TextView.BufferType.EDITABLE);
                Intent ma=new Intent(subatt.this,attendance.class);
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
        sec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"C", TextView.BufferType.EDITABLE);
                Intent ma=new Intent(subatt.this,attendance.class);
                ma.putExtra("year",op2.getText().toString());
                startActivity(ma);
                finish();
            }
        });
    }
}
