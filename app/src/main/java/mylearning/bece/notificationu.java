package mylearning.bece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class notificationu extends AppCompatActivity {
    ImageView imageView;
    TextView deta;
    String email,op1,op3,op4,op5,op6,op7,op8,op9,op11,op12,op2="daya";
    Bundle b1;
    private DatabaseReference databaseReference;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificationu);
        try{
            Bundle b1 = new Bundle(getIntent().getExtras());
            final String email = b1.getString("year").trim();
            databaseReference = FirebaseDatabase.getInstance().getReference("ECE").child(email).child("att");
            databaseReference.keepSynced(true);
            recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            FirebaseRecyclerAdapter<proff,notificationu.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<proff,notificationu.listv>(proff.class,R.layout.incatt,notificationu.listv.class,databaseReference) {
                @Override
                protected void populateViewHolder(final notificationu.listv viewHolder, final proff model, final int position) {
                    if(op2=="daya"){
                        op1=model.getSu1();
                        op3=model.getSu2();
                        op4=model.getSu3();
                        op5=model.getSu4();
                        op6=model.getSu5();
                        op7=model.getSu6();
                        op8=model.getLa1();
                        op9=model.getLa2();
                        op11=model.getLa3();
                        op12=model.getTtl();
                        op2=null;
                    }
                    viewHolder.setSu1(String.valueOf(Float.valueOf(op1)-Float.valueOf(model.getSu1())));
                    viewHolder.setSu2(String.valueOf(Float.valueOf(op3)-Float.valueOf(model.getSu2())));
                    viewHolder.setSu3(String.valueOf(Float.valueOf(op4)-Float.valueOf(model.getSu3())));
                    viewHolder.setSu4(String.valueOf(Float.valueOf(op5)-Float.valueOf(model.getSu4())));
                    viewHolder.setSu5(String.valueOf(Float.valueOf(op6)-Float.valueOf(model.getSu5())));
                    viewHolder.setSu6(String.valueOf(Float.valueOf(op7)-Float.valueOf(model.getSu6())));
                    viewHolder.setLa1(String.valueOf(Float.valueOf(op8)-Float.valueOf(model.getLa1())));
                    viewHolder.setLa2(String.valueOf(Float.valueOf(op9)-Float.valueOf(model.getLa2())));
                    viewHolder.setLa3(String.valueOf(Float.valueOf(op11)-Float.valueOf(model.getLa3())));
                    viewHolder.setTtl(String.valueOf(Float.valueOf(op12)-Float.valueOf(model.getTtl())));
                    viewHolder.setRonum(model.getRonum());
                }
            };
            recyclerView.setAdapter(firebaseRecyclerAdapter);
        } catch (Exception e) {
        }
    }
    public static class listv extends RecyclerView.ViewHolder{
        View view;
        public listv(View itemView) {
            super(itemView);
            view=itemView;
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
            TextView uall=view.findViewById(R.id.ids1);
            uall.setText(su1);
        }
        public void setSu2(String su2){
            TextView uall1=view.findViewById(R.id.ids2);
            uall1.setText(su2);
        }
        public void setSu3(String su3){
            TextView uall2=view.findViewById(R.id.ids3);
            uall2.setText(su3);
        }
        public void setSu4(String su4){
            TextView uall3=view.findViewById(R.id.ids4);
            uall3.setText(su4);
        }
        public void setSu5(String su5){
            TextView uall4=view.findViewById(R.id.ids5);
            uall4.setText(su5);
        }
        public void setSu6(String su6){
            TextView uall5=view.findViewById(R.id.ids6);
            uall5.setText(su6);
        }
        public void setLa1(String la1){
            TextView uall6=view.findViewById(R.id.ids7);
            uall6.setText(la1);
        }
        public void setLa2(String la2){
            TextView uall7=view.findViewById(R.id.ids8);
            uall7.setText(la2);
        }
        public void setLa3(String la3){
            TextView uall8=view.findViewById(R.id.ids9);
            uall8.setText(la3);
        }
    }
}
