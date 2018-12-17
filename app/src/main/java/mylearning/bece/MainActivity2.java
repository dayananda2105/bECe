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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mtoggle;
    NavigationView navigationView,navigationView1;
    String email;
    TextView id,rid,name,yeas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try {
            android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            navigationView = findViewById(R.id.design_navigation_view);
            navigationView.setNavigationItemSelectedListener(this);
            View heade = navigationView.getHeaderView(0);
            id = (TextView) heade.findViewById(R.id.id);
            rid =(TextView) heade.findViewById(R.id.rid);
            name = (TextView) heade.findViewById(R.id.nams);
            yeas = (TextView) heade.findViewById(R.id.yeas);
            mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
            mtoggle = new ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.nav_draw_Open, R.string.nav_draw_Close);
            mDrawerLayout.addDrawerListener(mtoggle);
            mtoggle.syncState();
            BottomNavigationView bottomnav = findViewById(R.id.bottom_navigation);
            Home selectedFragmentper = new Home();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragmentper).commit();
            bottomnav.setOnNavigationItemSelectedListener(navListener);
            DBclass db = new DBclass(this);
            db.open();
            id.setText(db.getName());
            rid.setText(db.getUsName());
            db.getdata();
            String dp1 = db.getdata();
            name.setText(dp1);
            yeas.setText(db.getyas());
            db.close();
            Bundle bundle = getIntent().getExtras();
        } catch (Exception e) {
            Toast.makeText(MainActivity2.this, e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }       @Override
        public void onBackPressed () {
            if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
                mDrawerLayout.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            if (mtoggle.onOptionsItemSelected(item)) {
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
        private BottomNavigationView.OnNavigationItemSelectedListener navListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
                        android.support.v4.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                        Fragment selectedFragment = null;
                        switch (item.getItemId()) {
                            case R.id.nav_home:
                                selectedFragment = new Home();
                                break;
                            case R.id.nav_cat:
                                selectedFragment = new notifications();
                                break;
                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                        return true;
                    }
                };
        @Override
        public boolean onNavigationItemSelected (@NonNull MenuItem item){
            BottomNavigationView bottomnav = findViewById(R.id.bottom_navigation);
            bottomnav.setVisibility(View.INVISIBLE);
            Fragment selectedFragment = null;
            //  Bundle data = new Bundle();
            //data.putString("per_email",email);
            //  String Detail;
            switch (item.getItemId()) {
                case R.id.Profile:
                    Intent dps1 = new Intent(MainActivity2.this, myprofile.class);
                    dps1.putExtra("id",id.getText().toString());
                    dps1.putExtra("year",yeas.getText().toString());
                    bottomnav.setVisibility(View.VISIBLE);
                    startActivity(dps1);
                    break;
                case R.id.previous:
                    Intent das=new Intent(MainActivity2.this,previousp.class);
                    bottomnav.setVisibility(View.VISIBLE);
                    das.putExtra("year",yeas.getText().toString());
                    bottomnav.setVisibility(View.VISIBLE);
                    startActivity(das);
                    break;
                case R.id.My_Orders:
                    Intent dps = new Intent(MainActivity2.this, faculty.class);
                    bottomnav.setVisibility(View.VISIBLE);
                    startActivity(dps);
                    break;
                case R.id.My_Profile:
                    Intent dp = new Intent(MainActivity2.this,subatt.class);
                    bottomnav.setVisibility(View.VISIBLE);
                    startActivity(dp);
                    break;
                case R.id.edit_profile:
                    bottomnav.setVisibility(View.INVISIBLE);
                    Intent i = new Intent(MainActivity2.this,subatt1.class);
                    startActivity(i);
                    break;
                case R.id.Change_pass:
                    bottomnav.setVisibility(View.INVISIBLE);
                    Intent d2 = new Intent(MainActivity2.this, predictor.class);
                    startActivity(d2);
                    break;
                case R.id.Logout:
                    bottomnav.setVisibility(View.INVISIBLE);
                    DBclass db=new DBclass(MainActivity2.this);
                    db.open();
                    String des1=name.getText().toString();
                    db.deleteEntry(des1);
                    Toast.makeText(this,des1+"logout", Toast.LENGTH_SHORT).show();
                    Intent d4 =new Intent(MainActivity2.this,MainActivity.class);
                    startActivity(d4);
                    finish();
                    break;
            }
            mDrawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
        @Override
        public void onPointerCaptureChanged ( boolean hasCapture){

        }
    }