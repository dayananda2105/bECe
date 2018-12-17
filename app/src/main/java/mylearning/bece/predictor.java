package mylearning.bece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class predictor extends AppCompatActivity {
    EditText asn1, asn2, mid1, ttl;
    TextView mid2;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predictor);
        try {
            asn1 = (EditText) findViewById(R.id.ass1);
            asn2 = (EditText) findViewById(R.id.ass2);
            mid1 = (EditText) findViewById(R.id.mid1);
            ttl = (EditText) findViewById(R.id.ttl);
            ok = (Button) findViewById(R.id.done);
            mid2 = (TextView) findViewById(R.id.mid2);
            ok.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (asn1.getText().toString().isEmpty()|| asn2.getText().toString().isEmpty()|| mid1.getText().toString().isEmpty()|| ttl.getText().toString().isEmpty()) {
                            Toast.makeText(predictor.this,"fill all the details",Toast.LENGTH_LONG).show();
                    } else {
                        final String po1 = (asn1.getText()).toString();
                        float pos1 = Float.valueOf(po1);
                        final String po2 = (asn2.getText()).toString();
                        float pos2 = Float.valueOf(po2);
                        final String po3 = (mid1.getText()).toString();
                        float pos3 = Float.valueOf(po3);
                        String po4 = (ttl.getText()).toString();
                        float pos4 = Float.valueOf(po4);
                        float pos6;
                        float da3;
                        if (pos1 > pos2) {
                            pos6 = pos1 + (pos2 / 2);
                            Toast.makeText(predictor.this, String.valueOf(pos6), Toast.LENGTH_LONG).show();
                        } else {
                            pos6 = (pos1 / 2) + pos2;
                            Toast.makeText(predictor.this, String.valueOf(pos6) + "a", Toast.LENGTH_LONG).show();
                        }
                        da3 = (pos4 - (pos3 / 6) - pos6) * (2);
                        Toast.makeText(predictor.this, String.valueOf(da3) + "d", Toast.LENGTH_LONG).show();
                        if (da3 < pos3) {
                            da3 = (pos4 - (pos3 / 2) - pos6) * (6);
                            Toast.makeText(predictor.this, String.valueOf(da3) + "s", Toast.LENGTH_LONG).show();
                        }
                        if (da3 < 30) {
                            if (da3 > 0) {
                                mid2.setText(String.valueOf(da3), TextView.BufferType.EDITABLE);
                            } else {
                                mid2.setText("reached already", TextView.BufferType.EDITABLE);
                                Toast.makeText(predictor.this, "reached already", Toast.LENGTH_LONG).show();
                            }
                        } else {
                            mid2.setText("cant be reached", TextView.BufferType.EDITABLE);
                            Toast.makeText(predictor.this, "cant be reached", Toast.LENGTH_LONG).show();
                        }
                    }
                }
            });
        } catch (Exception e) { }
    }
}