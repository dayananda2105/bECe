package mylearning.bece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profile extends AppCompatActivity {
    TextView daypic,daypic2,prfatt,prfdman,prfdttl,daypic3,daypic4,psb1,psb2,psb3,psb4,psb5,psb6,pla1,pla2,pla3;
    FirebaseDatabase firebaseDatabase;
String od1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
      try{
          daypic=(TextView)findViewById(R.id.prfid);
          daypic2=(TextView)findViewById(R.id.prfide);
          daypic3=(TextView) findViewById(R.id.prfidse);
          daypic4=(TextView) findViewById(R.id.prfidse1);
          prfdman=(TextView)findViewById(R.id.prfnam);
          psb1=(TextView)findViewById(R.id.psb1);
          psb2=(TextView)findViewById(R.id.psb2);
          psb3=(TextView)findViewById(R.id.psb3);
          psb4=(TextView)findViewById(R.id.psb4);
          psb5=(TextView)findViewById(R.id.psb5);
          psb6=(TextView)findViewById(R.id.psb6);
          pla1=(TextView)findViewById(R.id.plab1);
          pla2=(TextView)findViewById(R.id.plab2);
          pla3=(TextView)findViewById(R.id.plab3);
          Bundle b1 = new Bundle(getIntent().getExtras());
          final String email1 = b1.getString("id").trim();
          final String email = b1.getString("years").trim();
          firebaseDatabase = FirebaseDatabase.getInstance();
          DatabaseReference databaseReference = firebaseDatabase.getReference("ECE").child(email).child("att").child(email1);
          databaseReference.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(DataSnapshot dataSnapshot) {
                  proff pff=dataSnapshot.getValue(proff.class);
                  prfdman.setText(pff.getNam());
                  daypic.setText(pff.getIdnum());
                  daypic2.setText(pff.getRonum());
                  daypic3.setText(pff.getTtl());
                  psb1.setText(pff.getSu1());
                  psb2.setText(pff.getSu2());
                  psb3.setText(pff.getSu3());
                  psb4.setText(pff.getSu4());
                  psb5.setText(pff.getSu5());
                  psb6.setText(pff.getSu6());
                  pla1.setText(pff.getLa1());
                  pla2.setText(pff.getLa2());
                  pla3.setText(pff.getLa3());
                  DatabaseReference databaseReference1=firebaseDatabase.getReference("ECE").child(email).child("att").child("0");
                  databaseReference1.addValueEventListener(new ValueEventListener() {
                      @Override
                      public void onDataChange(DataSnapshot dataSnapshot) {
                          proff prff1=dataSnapshot.getValue(proff.class);
                         String od3= prff1.getTtl();
                          String od2=(daypic3.getText()).toString();
                          float ode2=Float.valueOf(od2);
                          float ode3=Float.valueOf(od3);
                          float od4=(1-(ode2/ode3))*100;
                          daypic4.setText(String.valueOf(od4),TextView.BufferType.EDITABLE);
                      }
                      @Override
                      public void onCancelled(DatabaseError databaseError) {
                          Toast.makeText(profile.this, databaseError.getCode(), Toast.LENGTH_LONG).show();
                      }
                  });
              }
              @Override
              public void onCancelled(DatabaseError databaseError) {
                  Toast.makeText(profile.this, databaseError.getCode(), Toast.LENGTH_LONG).show();
              }
          });
      }catch (Exception e){ }
    }
}
