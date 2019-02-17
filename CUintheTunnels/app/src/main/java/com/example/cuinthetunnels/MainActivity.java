package com.example.cuinthetunnels;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Graph cuGraph;

    private Spinner startLocation, endLocation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cuGraph = initGraph(cuGraph);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        addItemsOnstartLocation();
        addItemsOnendLocation();

        /*
        // email button on bottom right
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void addItemsOnstartLocation () {
        startLocation = (Spinner) findViewById(R.id.startLocation);
        List<String> list = new ArrayList<String>();
        list.add("Tory");
        list.add("UC");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list);
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        startLocation.setAdapter(dataAdapter);
    }

    public void addItemsOnendLocation () {
        endLocation = (Spinner) findViewById(R.id.endLocation);
        List<String> list = new ArrayList<String>();
        list.add("Stacie");
        list.add("River");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, list);
        dataAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        endLocation.setAdapter(dataAdapter);

    public Graph initGraph(Graph g){
        Node tb, ml, pa, sa, rh, lh, uc, gy, ac, me, mb, sc, hp, ru, la, nb, ro, gh, co, pg, dt;
        Node aa, sp, sr, ls, sd, mc, cc, tt, le, at, ap, nw, ph, fh, ah, hc, vs, ih, tc, fr, cb;
        Node rb, lx, gb, uh, ss, kh; //48 nodes

        //Instantiate Nodes and set names
        tb = new Node("TB");

        ml = new Node("ML");

        pa = new Node("PA");

        sa = new Node("SA");

        rh = new Node("RH");

        lh = new Node("LH");

        uc = new Node("UC");

        gy = new Node("GY");

        ac = new Node("AC");

        me = new Node("ME");

        mb = new Node("MB");

        sc = new Node("SC");

        hp = new Node("HP");

        ru = new Node("RU");

        la = new Node("la");

        nb = new Node("NB");

        ro = new Node("RO");

        gh = new Node("GH");

        co = new Node("CO");

        pg = new Node("PG");

        dt = new Node("DT");

        aa = new Node("AA");

        sp = new Node("SP");

        sr = new Node("SR");

        ls = new Node("LS");

        sd = new Node("SD");

        mc = new Node("MC");

        cc = new Node("CC");

        tt = new Node("TT");

        le = new Node("LE");

        at = new Node("AT");

        ap = new Node("AP");

        nw = new Node("NW");

        ph = new Node("PH");

        fh = new Node("FH");

        ah = new Node("AH");

        hc = new Node("HC");

        vs = new Node("VS");

        ih = new Node("IH");

        tc = new Node("TC");

        fr = new Node("FR");

        cb = new Node("CB");

        rb = new Node("RB");

        lx = new Node("LX");

        gb = new Node("GB");

        uh = new Node("UH");

        ss = new Node("SS");

        kh = new Node("KH");

        //Dummy nodes for intersections
        Node x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13; //Dummy Nodes
        x1 = new Node(null);


        //Instantiate and add edges
        Edge tb_at = new Edge(tb, at);
        Edge tb_uc = new Edge(tb, uc);
        tb.addEdge(tb_at);
        tb.addEdge(tb_uc);

        Edge rh_ph = new Edge(rh, ph);
        rh.addEdge(rh_ph);

        Edge lh_fr = new Edge(lh, fr);
        lh.addEdge(lh_fr);

        Edge uc_tb = new Edge(uc, tb);
        uc.addEdge(uc_tb);

        Edge gy_ih = new Edge(gy, ih);
        gy.addEdge(gy_ih);

        Edge ac_fh = new Edge(ac, fh);
        Edge ac_ah = new Edge(ac, ah);
        Edge ac_x1 = new Edge(ac, x1);
        ac.addEdge(ac_fh);
        ac.addEdge(ac_ah);
        ac.addEdge(ac_x1);

        Edge me_mc = new Edge(me, mc);
        Edge me_aa = new Edge(me, aa);
        Edge me_cb = new Edge(me, cb);
        me.addEdge(me_mc);
        me.addEdge(me_aa);
        me.addEdge(me_cb);

        Edge sc_rb = new Edge(sc, rb);
        sc.addEdge(sc_rb);

        Edge nb_nw = new Edge(nb, nw);
        nb.addEdge(nb_nw);

        Edge gh_co = new Edge(gh, co);
        gh.addEdge(gh_co);

        Edge co_gh = new Edge(co, gh);
        Edge co_sd = new Edge(co, sd);
        co.addEdge(co_gh);
        co.addEdge(co_sd);

        Edge aa_me = new Edge(aa, me);
        aa.addEdge(aa_me);

        Edge sr_hc = new Edge(sr, hc);
        sr.addEdge(sr_hc);

        Edge sd_co = new Edge(sd, co);
        sd.addEdge(sd_co);

        Edge mc_me = new Edge(mc, me);
        mc.addEdge(mc_me);

        Edge at_tb = new Edge(at, tb);
        at.addEdge(at_tb);

        Edge nw_nb = new Edge(nw, nb);
        nw.addEdge(nw_nb);

        Edge fh_ac = new Edge(fh, ac);
        fh.addEdge(fh_ac);

        Edge ah_ac = new Edge(ah, ac);
        ah.addEdge(ah_ac);

        Edge ih_gy = new Edge(ih, gy);
        ih.addEdge(ih_gy);

        Edge hc_la = new Edge(hc, la);
        hc.addEdge(hc_la);

        Edge fr_ph = new Edge(fr, ph);
        Edge fr_lh = new Edge(fr, lh);
        fr.addEdge(fr_ph);
        fr.addEdge(fr_lh);

        Edge cb_me = new Edge(cb, me);
        cb.addEdge(cb_me);

        Edge rb_sc = new Edge(rb, sc);
        rb.addEdge(rb_sc);

        Edge x1_ac = new Edge(x1, ac);
        x1.addEdge(x1_ac);

        return g;
    }
}
