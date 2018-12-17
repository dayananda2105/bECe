package mylearning.bece;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
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

public class notifications extends android.support.v4.app.Fragment {
    private DatabaseReference databaseReference;
    private RecyclerView recyclerView;
    private View myFragmentView;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
try {        myFragmentView = inflater.inflate(R.layout.activity_notifications, container, false);
        databaseReference = FirebaseDatabase.getInstance().getReference("notifications");
        databaseReference.keepSynced(true);
        recyclerView = (RecyclerView) myFragmentView.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        FirebaseRecyclerAdapter<list,notifications.listv> firebaseRecyclerAdapter=new FirebaseRecyclerAdapter<list,notifications.listv>(list.class,R.layout.imageview,notifications.listv.class,databaseReference) {
            @Override
            protected void populateViewHolder(notifications.listv viewHolder, final list model, final int position) {
                viewHolder.setAbout(model.getAbout());
                viewHolder.setGal(getContext(),model.getGal());
                viewHolder.setText(model.getText());
            }
        };
        recyclerView.setAdapter(firebaseRecyclerAdapter);
    } catch (Exception e) { }
        return myFragmentView;
}
public static class listv extends RecyclerView.ViewHolder{
    View mview;
    TextView post,sls,of,pri;
    public listv(View itemView) {
        super(itemView);
        mview=itemView;
    }
    public void setGal(Context context, String gal) {
        ImageView imageView = (ImageView) mview.findViewById(R.id.imageView);
        Picasso.with(context).load(gal).fit().centerCrop().into(imageView);
    }
    public void setAbout(String about){
        post=(TextView)mview.findViewById(R.id.head);
        post.setText(about);
    }
    public void setText(final String text) {
        sls=(TextView)mview.findViewById(R.id.dec);
        sls.setText(text);
    }
    }
}
