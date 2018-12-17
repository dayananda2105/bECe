package mylearning.bece;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Myprofil extends AppCompatActivity {
    Bundle b1;
    private DatabaseReference databaseReference;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofil);try{
            databaseReference = FirebaseDatabase.getInstance().getReference("ECE").child("2016B").child("att");
            databaseReference.keepSynced(true);
            recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            FirebaseRecyclerAdapter<proff,attendance.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<proff,attendance.listv>(proff.class,R.layout.atts,attendance.listv.class,databaseReference) {
                @Override
                protected void populateViewHolder(final attendance.listv viewHolder, final proff model, final int position) {
                    viewHolder.view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent ma=new Intent(Myprofil.this,profile.class);
                            ma.putExtra("id",model.idnum);
                            startActivity(ma);
                            finish();
                        }
                    });
                    viewHolder.setNam(model.getNam());
                    viewHolder.setIdnum(model.getIdnum());
                    viewHolder.setTtl(model.getTtl());
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

    }
}
