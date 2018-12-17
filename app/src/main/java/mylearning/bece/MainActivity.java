package mylearning.bece;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mtoggle;
    NavigationView navigationView,navigationView1;
    String email;
    Bundle b1;
    Button login,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            navigationView = findViewById(R.id.design_navigation_view);
            navigationView.setNavigationItemSelectedListener(this);
            View heade=navigationView.getHeaderView(0);
            login=(Button)heade.findViewById(R.id.login);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, loginp.class));
                }
            });
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mtoggle = new ActionBarDrawerToggle(this, mDrawerLayout,toolbar,R.string.nav_draw_Open,R.string.nav_draw_Close);
            mDrawerLayout.addDrawerListener(mtoggle);
            mtoggle.syncState();
            BottomNavigationView bottomnav = findViewById(R.id.bottom_navigation);
            bottomnav.setOnNavigationItemSelectedListener(navListener);
            DBclass dbs = new DBclass(this);
            dbs.open();
            dbs.getdata();
            String dp1 = dbs.getName().trim();
            dbs.close();
            if (!dp1.equals("")) {
                if (dp1.equals("250213")){
                    Intent day=new Intent(MainActivity.this,MainActivity3.class);
                    startActivity(day);
                    finish();
                }
                else {
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                finish();}
            } else {
                Home selectedFragmentper = new Home();
                Home view_selectedFragmentper = new Home();
             //   Bundle b = new Bundle();
             //   b.putString("per_email", b1.getString("email"));
             //   selectedFragmentper.setArguments(b);
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragmentper).commit();
                bottomnav.setOnNavigationItemSelectedListener(navListener);
            }
        } catch (Exception e)
        {
        }
    }
    @Override
    public void onBackPressed() {
        if(mDrawerLayout.isDrawerOpen(GravityCompat.START))
        {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener()
            {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    android.support.v4.app.FragmentManager  fm=getSupportFragmentManager();
                    android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                    Fragment selectedFragment = null;
                    switch(item.getItemId())
                    {
                        case R.id.nav_home:
                            selectedFragment = new Home();
                            break;
                        case R.id.nav_cat:
                            selectedFragment = new notifications();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedFragment).commit();
                    return true;
                }
            };
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        BottomNavigationView bottomnav = findViewById(R.id.bottom_navigation);
        bottomnav.setVisibility(View.INVISIBLE);
        Fragment selectedFragment = null;
        //  Bundle data = new Bundle();
        //data.putString("per_email",email);
        //  String Detail;
        switch (item.getItemId())
        {
            case  R.id.My_Orders:
                Intent dps=new Intent(MainActivity.this,faculty.class);
                bottomnav.setVisibility(View.VISIBLE);
                startActivity(dps);
                break;
            case R.id.previous:
                Intent das=new Intent(MainActivity.this,previousp.class);
                bottomnav.setVisibility(View.VISIBLE);
                startActivity(das);
                break;
            case  R.id.My_Profile:
                Intent dp=new Intent(MainActivity.this,subatt.class);
                bottomnav.setVisibility(View.VISIBLE);
                startActivity(dp);
                break;
            case  R.id.edit_profile:
                bottomnav.setVisibility(View.INVISIBLE);
                Intent i =new Intent(MainActivity.this,subatt1.class);
                i.putExtra("UserName",email);
                startActivity(i);
                break;
            case  R.id.Change_pass:
                bottomnav.setVisibility(View.INVISIBLE);
                Intent d2 =new Intent(MainActivity.this,predictor.class);
                startActivity(d2);
                break;
            case R.id.Logout:
                bottomnav.setVisibility(View.INVISIBLE);
                DBclass db=new DBclass(MainActivity.this);
                db.open();
                db.deleteEntry(email);
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
                break;
        }
        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
    }
}
