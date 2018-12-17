package mylearning.bece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class siratt extends AppCompatActivity {
    private DatabaseReference databaseReference;
    String op1,op2="daya";
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_siratt);
        Bundle b1 = new Bundle(getIntent().getExtras());
        final String email1 = b1.getString("id").trim();
        final String email = b1.getString("year").trim();
        Toast.makeText(siratt.this, email1+email, Toast.LENGTH_LONG).show();
        try{
            databaseReference = FirebaseDatabase.getInstance().getReference("ECE").child(email).child("att");
            databaseReference.keepSynced(true);
            recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            FirebaseRecyclerAdapter<proff,siratt.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<proff,siratt.listv>(proff.class,R.layout.atts,siratt.listv.class,databaseReference) {
                @Override
                protected void populateViewHolder(final siratt.listv viewHolder, final proff model, final int position) {
                    viewHolder.view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent ma=new Intent(siratt.this,profile.class);
                            ma.putExtra("id",model.ronum);
                            startActivity(ma);
                            finish();
                        }
                    });
                    if (email1.equals("1")){
                        if(op2=="daya"){
                            op1=model.getSu1();
                            op2=null;
                        }
                        viewHolder.setSu1(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu1())));
                                viewHolder.view.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        String oo0=model.getSu1();
                                        float ope2 = Float.valueOf(oo0);
                                        float opee2=ope2+1;
                                        String po1=String.valueOf(opee2);
                                        String or1=model.getSu2();
                                        float ope1 = Float.valueOf(or1);
                                        String oo2=model.getSu3();
                                        float ope3=Float.valueOf(oo2);
                                        String oo3=model.getSu4();
                                        float ope4=Float.valueOf(oo3);
                                        String oo4=model.getSu5();
                                        float ope5=Float.valueOf(oo4);
                                        String oo5=model.getSu6();
                                        float ope6=Float.valueOf(oo5);
                                        String oo6=model.getLa1();
                                        float ope7=Float.valueOf(oo6);
                                        String oo7=model.getLa2();
                                        float ope8=Float.valueOf(oo7);
                                        String oo8=model.getLa3();
                                        float ope9=Float.valueOf(oo8);
                                        String on1=model.getRonum();
                                        String on2=model.getIdnum();
                                        String on3=model.getNam();
                                        float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                        String odp1=String.valueOf(od1);
                                        update(on1,on2,on3,po1,or1,oo2,oo3,oo4,oo5,oo6,oo7,oo8,odp1);
                                    }
                                });
                                viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                                    @Override
                                    public boolean onLongClick(View view) {
                                        String oo0=model.getSu1();
                                        float ope2 = Float.valueOf(oo0);
                                        float opee2=ope2-1;
                                        String po1=String.valueOf(opee2);
                                        String or1=model.getSu2();
                                        float ope1 = Float.valueOf(or1);
                                        String oo2=model.getSu3();
                                        float ope3=Float.valueOf(oo2);
                                        String oo3=model.getSu4();
                                        float ope4=Float.valueOf(oo3);
                                        String oo4=model.getSu5();
                                        float ope5=Float.valueOf(oo4);
                                        String oo5=model.getSu6();
                                        float ope6=Float.valueOf(oo5);
                                        String oo6=model.getLa1();
                                        float ope7=Float.valueOf(oo6);
                                        String oo7=model.getLa2();
                                        float ope8=Float.valueOf(oo7);
                                        String oo8=model.getLa3();
                                        float ope9=Float.valueOf(oo8);
                                        String on1=model.getRonum();
                                        String on2=model.getIdnum();
                                        String on3=model.getNam();
                                        float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                        String odp1=String.valueOf(od1);
                                        update(on1,on2,on3,po1,or1,oo2,oo3,oo4,oo5,oo6,oo7,oo8,odp1);
                                        return true;
                                    }
                                });
                    }
                    else if (email1.equals("2")){
                        if(op2=="daya"){
                            op1=model.getSu2();
                            op2=null;
                        }
                        viewHolder.setSu2(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu2())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope2 = Float.valueOf(or1);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,po1,oo2,oo3,oo4,oo5,oo6,oo7,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope2 = Float.valueOf(or1);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,po1,oo2,oo3,oo4,oo5,oo6,oo7,oo8,odp1);
                                return true;
                            }
                        });
                       }
                    else if (email1.equals("3")){
                        if(op2=="daya"){
                        op1=model.getSu3();
                        op2=null;
                    }
                    viewHolder.setSu3(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu3())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope3=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope2 = Float.valueOf(oo2);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,po1,oo3,oo4,oo5,oo6,oo7,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope3=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope2 = Float.valueOf(oo2);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,po1,oo3,oo4,oo5,oo6,oo7,oo8,odp1);
                                return true;
                            }
                        });
                    }else if (email1.equals("4")){
                        if(op2=="daya"){
                            op1=model.getSu4();
                            op2=null;
                        }
                        viewHolder.setSu4(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu4())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope2=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4 = Float.valueOf(oo3);
                                float opee2=ope4+1;
                                String po1=String.valueOf(opee2);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,po1,oo4,oo5,oo6,oo7,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope2=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4 = Float.valueOf(oo3);
                                float opee2=ope4-1;
                                String po1=String.valueOf(opee2);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,po1,oo4,oo5,oo6,oo7,oo8,odp1);
                                return true;
                            }
                        });
                    }else if (email1.equals("5")){
                        if(op2=="daya"){
                            op1=model.getSu5();
                            op2=null;
                        }
                        viewHolder.setSu5(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu5())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope5=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope2 = Float.valueOf(oo4);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,po1,oo5,oo6,oo7,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope5=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope2 = Float.valueOf(oo4);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,po1,oo5,oo6,oo7,oo8,odp1);
                                return true;
                            }
                        });
                    }else if (email1.equals("6")){
                        if(op2=="daya"){
                            op1=model.getSu6();
                            op2=null;
                        }
                        viewHolder.setSu6(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu6())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope6=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope2 = Float.valueOf(oo5);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,po1,oo6,oo7,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope6=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope2 = Float.valueOf(oo5);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,po1,oo6,oo7,oo8,odp1);
                                return true;
                            }
                        });
                    }else if (email1.equals("7")){
                        if(op2=="daya"){
                            op1=model.getLa1();
                            op2=null;
                        }
                        viewHolder.setLa1(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getLa1())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope7=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope2 = Float.valueOf(oo6);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,oo5,po1,oo7,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope7=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope2 = Float.valueOf(oo6);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope9=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,oo5,po1,oo7,oo8,odp1);
                                return true;
                            }
                        });
                    }else if (email1.equals("8")){
                        if(op2=="daya"){
                            op1=model.getLa2();
                            op2=null;
                        }
                        viewHolder.setLa2(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getLa2())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope9=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope2 = Float.valueOf(oo7);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String oo8=model.getLa3();
                                float ope8=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,oo5,oo6,po1,oo8,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope9=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope2 = Float.valueOf(oo7);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String oo8=model.getLa3();
                                float ope8=Float.valueOf(oo8);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,oo5,oo6,po1,oo8,odp1);
                                return true;
                            }
                        });
                    }else{
                        if(op2=="daya"){
                            op1=model.getLa3();
                            op2=null;
                        }
                        viewHolder.setLa3(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getLa3())));
                        viewHolder.view.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope9=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope2 = Float.valueOf(oo8);
                                float opee2=ope2+1;
                                String po1=String.valueOf(opee2);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,oo5,oo6,oo7,po1,odp1);
                            }
                        });
                        viewHolder.view.setOnLongClickListener(new View.OnLongClickListener() {
                            @Override
                            public boolean onLongClick(View view) {
                                String oo0=model.getSu1();
                                float ope1 = Float.valueOf(oo0);
                                String or1=model.getSu2();
                                float ope9=Float.valueOf(or1);
                                String oo2=model.getSu3();
                                float ope3=Float.valueOf(oo2);
                                String oo3=model.getSu4();
                                float ope4=Float.valueOf(oo3);
                                String oo4=model.getSu5();
                                float ope5=Float.valueOf(oo4);
                                String oo5=model.getSu6();
                                float ope6=Float.valueOf(oo5);
                                String oo6=model.getLa1();
                                float ope7=Float.valueOf(oo6);
                                String oo7=model.getLa2();
                                float ope8=Float.valueOf(oo7);
                                String oo8=model.getLa3();
                                float ope2 = Float.valueOf(oo8);
                                float opee2=ope2-1;
                                String po1=String.valueOf(opee2);
                                String on1=model.getRonum();
                                String on2=model.getIdnum();
                                String on3=model.getNam();
                                float od1=ope1+opee2+ope3+ope4+ope5+ope6+ope7+ope8+ope9;
                                String odp1=String.valueOf(od1);
                                update(on1,on2,on3,oo0,or1,oo2,oo3,oo4,oo5,oo6,oo7,po1,odp1);
                                return true;
                            }
                        });
                    }
                    viewHolder.setNam(model.getNam());
                    viewHolder.setIdnum(model.getIdnum());
                    viewHolder.setRonum(model.getRonum());
                }
                private void update(String pp1,String pp2,String pp3,String pp4,String pp5,String pp6,String pp7,String pp8,String pp9,String pp10,String pp11,String pp12,String pp13) {
                    DatabaseReference databaseReference1 = FirebaseDatabase.getInstance().getReference("ECE").child(email).child("att").child(pp1);
                    proff att1=new proff(pp1,pp2,pp3,pp4,pp5,pp6,pp7,pp8,pp9,pp10,pp11,pp12,pp13);
                    databaseReference1.setValue(att1);
                }
            };
            recyclerView.setAdapter(firebaseRecyclerAdapter);
        } catch (Exception e) { }
    }
    public static class listv extends RecyclerView.ViewHolder{
        View view;
        public listv(View itemView) {
            super(itemView);
                view=itemView;
            }
            public void setNam(String nam){
            TextView mid=view.findViewById(R.id.mar);
            mid.setText(nam);
        }public void setIdnum(String idnum) {
            TextView mnam=view.findViewById(R.id.nam);
            mnam.setText(idnum);
        }
        public void setTtl(String ttl){
            TextView mmar=view.findViewById(R.id.ids);
            mmar.setText(ttl);
        }
        public void setRonum(String ronum){
            TextView mmar1=view.findViewById(R.id.idsg);
            mmar1.setText(ronum);
        }
        public void setSu1(String su1){
            TextView uall=view.findViewById(R.id.ids);
            uall.setText(su1);
        }
        public void setSu2(String su2){
            TextView uall1=view.findViewById(R.id.ids);
            uall1.setText(su2);
        }
        public void setSu3(String su3){
            TextView uall2=view.findViewById(R.id.ids);
            uall2.setText(su3);
        }
        public void setSu4(String su4){
            TextView uall3=view.findViewById(R.id.ids);
            uall3.setText(su4);
        }
        public void setSu5(String su5){
            TextView uall4=view.findViewById(R.id.ids);
            uall4.setText(su5);
        }
        public void setSu6(String su6){
            TextView uall5=view.findViewById(R.id.ids);
            uall5.setText(su6);
        }
        public void setLa1(String la1){
            TextView uall6=view.findViewById(R.id.ids);
            uall6.setText(la1);
        }
        public void setLa2(String la2){
            TextView uall7=view.findViewById(R.id.ids);
            uall7.setText(la2);
        }
        public void setLa3(String la3){
            TextView uall8=view.findViewById(R.id.ids);
            uall8.setText(la3);
        }
    }
}
