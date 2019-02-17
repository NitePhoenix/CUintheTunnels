package com.example.cuinthetunnels;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    Graph cuGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        cuGraph = initGraph(cuGraph);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
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

    public Graph initGraph(Graph g){
        Node tb, ml, pa, sa, rh, lh, uc, gy, ac, me, mb, sc, hp, ru, la, nb, ro, gh, co, pg, dt;
        Node aa, sp, sr, ls, sd, mc, cc, tt, le, at, ap, nw, ph, fh, ah, hc, vs, ih, tc, fr, cb;
        Node rb, lx, gb, uh, ss, kh; //48 nodes
        tb = new Node();
        tb.name = "TB";

        ml = new Node();
        ml.name = "ML";

        pa = new Node();
        pa.name = "PA";

        sa = new Node();
        sa.name = "SA";

        rh = new Node();
        rh.name = "RH";

        lh = new Node();
        lh.name = "LH";

        uc = new Node();
        uc.name = "UC";

        gy = new Node();
        gy.name = "GY";

        ac = new Node();
        ac.name = "AC";

        me = new Node();
        me.name = "ME";

        mb = new Node();
        mb.name = "MB";

        sc = new Node();
        sc.name = "SC";

        hp = new Node();
        hp.name = "HP";

        ru = new Node();
        ru.name = "RU";

        la = new Node();
        la.name = "la";

        nb = new Node();
        nb.name = "NB";

        ro = new Node();
        ro.name = "RO";

        gh = new Node();
        gh.name = "GH";

        co = new Node();
        co.name = "CO";

        pg = new Node();
        pg.name = "PG";

        dt = new Node();
        dt.name = "DT";

        aa = new Node();
        aa.name = "AA";

        sp = new Node();
        sp.name = "SP";

        sr = new Node();
        sr.name = "SR";

        ls = new Node();
        ls.name = "LS";

        sd = new Node();
        sd.name = "SD";

        mc = new Node();
        mc.name = "MC";

        cc = new Node();
        cc.name = "CC";

        tt = new Node();
        tt.name = "TT";

        le = new Node();
        le.name = "LE";

        at = new Node();
        at.name = "AT";

        ap = new Node();
        ap.name = "AP";

        nw = new Node();
        nw.name = "NW";

        ph = new Node();
        ph.name = "PH";

        fh = new Node();
        fh.name = "FH";

        ah = new Node();
        ah.name = "AH";

        hc = new Node();
        hc.name = "HC";

        vs = new Node();
        vs.name = "VS";

        ih = new Node();
        ih.name = "IH";

        tc = new Node();
        tc.name = "TC";

        fr = new Node();
        fr.name = "FR";

        cb = new Node();
        cb.name = "CB";

        rb = new Node();
        rb.name = "RB";

        lx = new Node();
        lx.name = "LX";

        gb = new Node();
        gb.name = "GB";

        uh = new Node();
        uh.name = "UH";

        ss = new Node();
        ss.name = "SS";

        kh = new Node();
        kh.name = "KH";
        return g;
    }
}
