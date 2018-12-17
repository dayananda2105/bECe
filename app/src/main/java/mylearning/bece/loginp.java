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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginp extends AppCompatActivity {
EditText lid,lrid,lname;
Button login;
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
        setContentView(R.layout.activity_loginp);
        lid=(EditText)findViewById(R.id.lid);
        lrid=(EditText)findViewById(R.id.lrid);
        lname=(EditText)findViewById(R.id.lnam);
        login=(Button)findViewById(R.id.login);
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
            }
        });
        sec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"B", TextView.BufferType.EDITABLE);
            }
        });
        sec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String opr1=op2.getText().toString();
                op2.setText(opr1+"C", TextView.BufferType.EDITABLE);
            }
        });
 login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (lid.getText().toString().isEmpty()||lrid.getText().toString().isEmpty()||lname.getText().toString().isEmpty()||op2.getText().toString().isEmpty()){
                    Toast.makeText(loginp.this,"fill all the details",Toast.LENGTH_LONG).show();
                }
                else {
                DBclass db=new DBclass(loginp.this);
                db.open();
                db.insertContact(lid.getText().toString(),lrid.getText().toString(),lname.getText().toString(),op2.getText().toString());
                db.close();
                Intent gts=new Intent(loginp.this,MainActivity2.class);
                startActivity(gts);
                finish();
            }}
        });
    }
}
