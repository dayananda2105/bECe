package mylearning.bece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class attendance1 extends AppCompatActivity {
EditText ud,ud1,ud2,ud3,ud4,ud5,ud6,ud7,ud8,ud9,ud11,ud10,ud12;
Button btn;
FirebaseDatabase firebaseDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance1);
        Bundle b1 = new Bundle(getIntent().getExtras());
        final String email = b1.getString("year").trim();
        ud=(EditText)findViewById(R.id.vp);
        ud1=(EditText)findViewById(R.id.vp1);
        ud2=(EditText)findViewById(R.id.vp2);
        ud3=(EditText)findViewById(R.id.vp3);
        ud4=(EditText)findViewById(R.id.vp4);
        ud5=(EditText)findViewById(R.id.vp5);
        ud6=(EditText)findViewById(R.id.vp6);
        ud7=(EditText)findViewById(R.id.vp7);
        ud8=(EditText)findViewById(R.id.vp8);
        ud9=(EditText)findViewById(R.id.vp9);
        ud10=(EditText)findViewById(R.id.vp10);
        ud11=(EditText)findViewById(R.id.vp11);
        ud12=(EditText)findViewById(R.id.vp12);
        btn=(Button)findViewById(R.id.bttn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ud.getText().toString().isEmpty()||ud1.getText().toString().isEmpty()||ud2.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()){
                    //if (ud.getText().toString().isEmpty()||ud1.getText().toString().isEmpty()||ud2.getText().toString().isEmpty()||ud3.getText().toString().isEmpty()||ud4.getText().toString().isEmpty()||ud5.getText().toString().isEmpty()||ud6.getText().toString().isEmpty()||ud7.getText().toString().isEmpty()||ud8.getText().toString().isEmpty()||ud9.getText().toString().isEmpty()||ud10.getText().toString().isEmpty()||ud11.getText().toString().isEmpty()||ud12.getText().toString().isEmpty()){
                    Toast.makeText(attendance1.this,"fill all the details",Toast.LENGTH_LONG).show();
                }
                else {
                firebaseDatabase = FirebaseDatabase.getInstance();
                final DatabaseReference databaseReference = firebaseDatabase.getReference("ECE").child(email).child("att").child(ud.getText().toString());
                    proff att1=new proff(ud.getText().toString(),ud1.getText().toString(),ud2.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString(),ud3.getText().toString());
                    //       proff att1=new proff(ud.getText().toString(),ud1.getText().toString(),ud2.getText().toString(),ud3.getText().toString(),ud4.getText().toString(),ud5.getText().toString(),ud6.getText().toString(),ud7.getText().toString(),ud8.getText().toString(),ud9.getText().toString(),ud10.getText().toString(),ud11.getText().toString(),ud12.getText().toString());
                databaseReference.setValue(att1);
                Intent gt=new Intent(attendance1.this,MainActivity3.class);
                startActivity(gt);
                finish();
            }}
        });
    }
}
