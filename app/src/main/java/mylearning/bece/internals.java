package mylearning.bece;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class internals extends AppCompatActivity {
    ImageView imageView;
    TextView deta;
    String email;
    Bundle b1;
    private DatabaseReference databaseReference;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internals);
        try{
            Bundle b1 = new Bundle(getIntent().getExtras());
            final String email = b1.getString("year").trim();
            databaseReference = FirebaseDatabase.getInstance().getReference("ECE").child(email).child("att");
            databaseReference.keepSynced(true);
            recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            FirebaseRecyclerAdapter<proff,internals.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<proff,internals.listv>(proff.class,R.layout.atts,internals.listv.class,databaseReference) {
                @Override
                protected void populateViewHolder(final internals.listv viewHolder, final proff model, final int position) {
                    viewHolder.view.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent ma = new Intent(internals.this, profile.class);
                            ma.putExtra("id", model.ronum);
                            ma.putExtra("years",email);
                            startActivity(ma);
                        }
                    });
                    viewHolder.setNam(model.getNam());
                    viewHolder.setIdnum(model.getIdnum());
                    viewHolder.setTtl(model.getTtl());
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
    }
}