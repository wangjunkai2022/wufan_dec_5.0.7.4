package com.join.mgps.activity;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.joystick.map.KeyMap;
import com.papa.controller.core.PadKeyEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_md_key_map)
/* loaded from: classes4.dex */
public class HandShankMDActivity extends HandShankBaseActivity implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, String> f33621d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33622e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33623f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33624g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33625h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33626i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33627j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33628k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33629l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f33630m;

    /* renamed from: n  reason: collision with root package name */
    private Button f33631n;

    /* renamed from: o  reason: collision with root package name */
    private Map<String, String> f33632o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private Map<String, Integer> f33633p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private Map<String, String> f33634q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, a> f33635r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f33636s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f33637t;

    /* renamed from: u  reason: collision with root package name */
    private List<String> f33638u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33639a;

        /* renamed from: b  reason: collision with root package name */
        public int f33640b;

        /* renamed from: c  reason: collision with root package name */
        public int f33641c;

        /* renamed from: d  reason: collision with root package name */
        public int f33642d;

        /* renamed from: e  reason: collision with root package name */
        public int f33643e;

        /* renamed from: f  reason: collision with root package name */
        public int f33644f;

        /* renamed from: g  reason: collision with root package name */
        public int f33645g;

        /* renamed from: h  reason: collision with root package name */
        public int f33646h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33639a = i4;
            this.f33640b = i5;
            this.f33641c = i6;
            this.f33642d = i7;
            this.f33643e = i8;
            this.f33644f = i9;
            this.f33645g = i10;
            this.f33646h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.a(str)) {
                this.f33633p.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33633p;
        if (map == null || map.size() == 0) {
            this.f33633p.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53478j, 104);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33633p.put(com.join.mgps.joystick.map.b.f53502r, 107);
        }
        Map<String, String> x02 = x0();
        this.f33634q = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33634q.put(com.join.mgps.joystick.map.b.f53509t0, com.join.mgps.joystick.map.b.f53457c);
            this.f33634q.put(com.join.mgps.joystick.map.b.f53512u0, com.join.mgps.joystick.map.b.f53460d);
            this.f33634q.put(com.join.mgps.joystick.map.b.f53518w0, com.join.mgps.joystick.map.b.f53469g);
            this.f33634q.put(com.join.mgps.joystick.map.b.f53524y0, com.join.mgps.joystick.map.b.f53472h);
            this.f33634q.put(com.join.mgps.joystick.map.b.f53515v0, com.join.mgps.joystick.map.b.f53463e);
            this.f33634q.put(com.join.mgps.joystick.map.b.f53521x0, com.join.mgps.joystick.map.b.f53466f);
            this.f33634q.put(com.join.mgps.joystick.map.b.A0, com.join.mgps.joystick.map.b.f53481k);
            this.f33634q.put(com.join.mgps.joystick.map.b.f53527z0, com.join.mgps.joystick.map.b.f53475i);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.B0.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33636s = true;
        this.f33632o.clear();
        this.f33632o.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.f53509t0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.f53512u0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53463e, com.join.mgps.joystick.map.b.f53515v0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.f53518w0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53466f, com.join.mgps.joystick.map.b.f53521x0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.f53524y0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.f53527z0);
        this.f33632o.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.A0);
        this.f33634q.clear();
        this.f33634q.put(com.join.mgps.joystick.map.b.f53509t0, com.join.mgps.joystick.map.b.f53457c);
        this.f33634q.put(com.join.mgps.joystick.map.b.f53512u0, com.join.mgps.joystick.map.b.f53460d);
        this.f33634q.put(com.join.mgps.joystick.map.b.f53515v0, com.join.mgps.joystick.map.b.f53463e);
        this.f33634q.put(com.join.mgps.joystick.map.b.f53518w0, com.join.mgps.joystick.map.b.f53469g);
        this.f33634q.put(com.join.mgps.joystick.map.b.f53521x0, com.join.mgps.joystick.map.b.f53466f);
        this.f33634q.put(com.join.mgps.joystick.map.b.f53524y0, com.join.mgps.joystick.map.b.f53472h);
        this.f33634q.put(com.join.mgps.joystick.map.b.f53527z0, com.join.mgps.joystick.map.b.f53475i);
        this.f33634q.put(com.join.mgps.joystick.map.b.A0, com.join.mgps.joystick.map.b.f53481k);
        for (String str : this.f33634q.keySet()) {
            a aVar = this.f33635r.get(str);
            ((TextView) findViewById(aVar.f33646h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33634q.get(str)));
            ((Button) findViewById(aVar.f33639a)).setBackgroundResource(aVar.f33640b);
            if (aVar.f33643e != 0) {
                ((Button) findViewById(aVar.f33639a)).setTextColor(getResources().getColor(aVar.f33643e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.MD, D0(this.f33632o));
        this.f33632o.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33635r.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33635r.get(key);
            if (this.f33632o.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33639a);
                if (aVar.f33643e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33645g));
                }
                button.setBackgroundResource(aVar.f33642d);
                ((TextView) findViewById(aVar.f33646h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33632o, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33639a);
                if (aVar.f33643e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33643e));
                }
                button2.setBackgroundResource(aVar.f33640b);
            }
        }
    }

    private void H0() {
        this.f33637t = new ArrayList();
        this.f33638u = new ArrayList();
        for (String str : this.f33634q.keySet()) {
            if (!this.f33632o.containsValue(str)) {
                this.f33638u.add(str);
            }
        }
        for (String str2 : this.f33634q.values()) {
            if (!this.f33632o.containsKey(str2)) {
                this.f33637t.add(str2);
            }
        }
        Iterator<String> it2 = this.f33638u.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33634q.get(next);
            if (this.f33637t.contains(str3)) {
                it2.remove();
                this.f33637t.remove(str3);
                this.f33632o.put(str3, next);
            }
        }
        if (this.f33637t.size() >= this.f33638u.size()) {
            for (int i4 = 0; i4 < this.f33638u.size(); i4++) {
                this.f33632o.put(this.f33637t.get(i4), this.f33638u.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33634q.keySet()) {
            ((TextView) findViewById(this.f33635r.get(str).f33646h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33634q.get(str)));
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.MD.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.B0.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33630m.setText("MD手柄设置");
        this.f33622e.setTag(com.join.mgps.joystick.map.b.f53509t0);
        this.f33623f.setTag(com.join.mgps.joystick.map.b.f53512u0);
        this.f33622e.setText("选择");
        this.f33623f.setText("开始");
        this.f33622e.setOnClickListener(this);
        this.f33623f.setOnClickListener(this);
        this.f33622e.setOnClickListener(this);
        this.f33623f.setOnClickListener(this);
        this.f33624g.setOnClickListener(this);
        this.f33625h.setOnClickListener(this);
        this.f33626i.setOnClickListener(this);
        this.f33627j.setOnClickListener(this);
        this.f33628k.setOnClickListener(this);
        this.f33629l.setOnClickListener(this);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33635r = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.f53512u0, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.f53509t0, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.f53515v0, new a(R.id.f15620x, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.x_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.f53524y0, new a(R.id.f15591b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.b_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.f53521x0, new a(R.id.f15621y, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.y_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.f53518w0, new a(R.id.f15589a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.a_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.A0, new a(R.id.f15595c, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        this.f33635r.put(com.join.mgps.joystick.map.b.f53527z0, new a(R.id.f15622z, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l1_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33636s) {
            this.f33636s = false;
            finish();
            return;
        }
        if (this.f33632o.size() < 8) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.MD, D0(this.f33632o));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33633p.containsValue(Integer.valueOf(i4))) {
                if (i4 == 4) {
                    finish();
                    return true;
                }
                Button button = this.f33631n;
                if (button != null) {
                    String str = (String) button.getTag();
                    String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33633p, Integer.valueOf(i4));
                    if (this.f33632o.containsKey(str2)) {
                        ((TextView) findViewById(this.f33635r.get(this.f33632o.get(str2)).f33646h)).setText("");
                    }
                    if (this.f33634q.containsValue(str2)) {
                        ((TextView) findViewById(this.f33635r.get((String) com.join.mgps.joystick.map.b.c(this.f33634q, str2)).f33646h)).setText("");
                    }
                    this.f33632o.put(str2, str);
                    this.f33636s = false;
                    this.f33631n.setBackgroundResource(this.f33635r.get(str).f33642d);
                    this.f33631n = null;
                    G0();
                }
                return true;
            }
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void F0() {
        E0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        z0();
        y0();
        initView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity
    public boolean n0(int i4, PadKeyEvent padKeyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(padKeyEvent.c())) {
            return false;
        }
        if (padKeyEvent.d() != 0) {
            C0(i4, p0(padKeyEvent));
        }
        return super.n0(i4, padKeyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = (String) view.getTag();
        if (this.f33632o.containsValue(str)) {
            return;
        }
        Button button = this.f33631n;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33635r.get(this.f33631n.getTag());
            this.f33631n.setBackgroundResource(aVar.f33640b);
            if (aVar.f33643e != 0) {
                this.f33631n.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33631n = button2;
        a aVar2 = this.f33635r.get(button2.getTag());
        this.f33631n.setBackgroundResource(aVar2.f33641c);
        if (aVar2.f33643e != 0) {
            this.f33631n.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        finish();
    }
}
