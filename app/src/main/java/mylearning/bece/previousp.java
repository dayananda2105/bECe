package mylearning.bece;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class previousp extends AppCompatActivity {
    private DatabaseReference databaseReference;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previousp);
       try{
           databaseReference = FirebaseDatabase.getInstance().getReference("previous");
        databaseReference.keepSynced(true);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        FirebaseRecyclerAdapter<list,notifications.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<list,notifications.listv>(list.class,R.layout.imageviews,notifications.listv.class,databaseReference) {
            @Override
            protected void populateViewHolder(notifications.listv viewHolder, final list model, final int position) {
                viewHolder.setAbout(model.getAbout());
                viewHolder.setGal(getApplicationContext(),model.getGal());
                viewHolder.setText(model.getText());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    } catch (Exception e) { }

}
}
