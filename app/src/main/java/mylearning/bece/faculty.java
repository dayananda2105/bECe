package mylearning.bece;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class faculty extends AppCompatActivity {
        private DatabaseReference databaseReference;
        private RecyclerView recyclerView;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_faculty);
        try {        databaseReference = FirebaseDatabase.getInstance().getReference("faculty");
                databaseReference.keepSynced(true);
                recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                FirebaseRecyclerAdapter<lists,faculty.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<lists,faculty.listv>(lists.class,R.layout.imagesview,faculty.listv.class,databaseReference) {
                        @Override
                        protected void populateViewHolder(faculty.listv viewHolder, final lists model, final int position) {
                                viewHolder.setSpec(model.getSpec());
                                viewHolder.setPic(model.getPic());
                                viewHolder.setExp(model.getExp());
                                viewHolder.setNamse(model.getNamse());
                                viewHolder.setPost(model.getPost());
                        }
                };
                recyclerView.setAdapter(firebaseRecyclerAdapter);
        } catch (Exception e) {
        }

}
public static class listv extends RecyclerView.ViewHolder{
                View mview;
                TextView post,sls,of,pri;
                public listv(View itemView) {
                        super(itemView);
                        mview=itemView;
                }
                public void setPic(String pic) {
                   TextView post1=(TextView)mview.findViewById(R.id.gals);
                    post1.setText(pic);
                }
                public void setNamse(String namse){
                        post=(TextView)mview.findViewById(R.id.namse);
                        post.setText(namse);
                }
                public void setExp(final String exp) {
                        sls=(TextView)mview.findViewById(R.id.exp);
                        sls.setText(exp);
                }
        public void setSpec(final String spec) {
               TextView sls1=(TextView)mview.findViewById(R.id.spec);
                sls1.setText(spec);
        }
        public void setPost(final String post) {
               TextView sls2=(TextView)mview.findViewById(R.id.poset);
                sls2.setText(post);
        }
}
}
