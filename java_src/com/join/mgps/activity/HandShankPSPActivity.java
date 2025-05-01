package com.join.mgps.activity;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.joystick.map.KeyMap;
import com.papa.controller.core.PadKeyEvent;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_psp_key_map)
/* loaded from: classes4.dex */
public class HandShankPSPActivity extends HandShankBaseActivity implements View.OnClickListener {
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f33719d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33720e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33721f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33722g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33723h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33724i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33725j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33726k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33727l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    TextView f33728m;

    /* renamed from: n  reason: collision with root package name */
    private Map<String, String> f33729n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private Map<String, Integer> f33730o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private Map<String, String> f33731p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private Map<String, a> f33732q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f33733r;

    /* renamed from: s  reason: collision with root package name */
    private List<String> f33734s;

    /* renamed from: t  reason: collision with root package name */
    private List<String> f33735t;

    /* renamed from: u  reason: collision with root package name */
    private Button f33736u;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33737a;

        /* renamed from: b  reason: collision with root package name */
        public int f33738b;

        /* renamed from: c  reason: collision with root package name */
        public int f33739c;

        /* renamed from: d  reason: collision with root package name */
        public int f33740d;

        /* renamed from: e  reason: collision with root package name */
        public int f33741e;

        /* renamed from: f  reason: collision with root package name */
        public int f33742f;

        /* renamed from: g  reason: collision with root package name */
        public int f33743g;

        /* renamed from: h  reason: collision with root package name */
        public int f33744h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33737a = i4;
            this.f33738b = i5;
            this.f33739c = i6;
            this.f33740d = i7;
            this.f33741e = i8;
            this.f33742f = i9;
            this.f33743g = i10;
            this.f33744h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.a(str)) {
                this.f33730o.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33730o;
        if (map == null || map.size() == 0) {
            this.f33730o.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33730o.put(com.join.mgps.joystick.map.b.f53481k, 103);
        }
        Map<String, String> x02 = x0();
        this.f33731p = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33731p.put(com.join.mgps.joystick.map.b.f53479j0, com.join.mgps.joystick.map.b.f53457c);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53482k0, com.join.mgps.joystick.map.b.f53460d);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53485l0, com.join.mgps.joystick.map.b.f53463e);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53488m0, com.join.mgps.joystick.map.b.f53469g);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53491n0, com.join.mgps.joystick.map.b.f53466f);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53494o0, com.join.mgps.joystick.map.b.f53472h);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53497p0, com.join.mgps.joystick.map.b.f53475i);
            this.f33731p.put(com.join.mgps.joystick.map.b.f53500q0, com.join.mgps.joystick.map.b.f53481k);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.f53503r0.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33733r = true;
        this.f33729n.clear();
        this.f33729n.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.f53479j0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.f53482k0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53463e, com.join.mgps.joystick.map.b.f53485l0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.f53488m0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53466f, com.join.mgps.joystick.map.b.f53491n0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.f53494o0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.f53497p0);
        this.f33729n.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.f53500q0);
        this.f33731p.clear();
        this.f33731p.put(com.join.mgps.joystick.map.b.f53479j0, com.join.mgps.joystick.map.b.f53457c);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53482k0, com.join.mgps.joystick.map.b.f53460d);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53485l0, com.join.mgps.joystick.map.b.f53463e);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53488m0, com.join.mgps.joystick.map.b.f53469g);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53491n0, com.join.mgps.joystick.map.b.f53466f);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53494o0, com.join.mgps.joystick.map.b.f53472h);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53497p0, com.join.mgps.joystick.map.b.f53475i);
        this.f33731p.put(com.join.mgps.joystick.map.b.f53500q0, com.join.mgps.joystick.map.b.f53481k);
        for (String str : this.f33731p.keySet()) {
            a aVar = this.f33732q.get(str);
            ((TextView) findViewById(aVar.f33744h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33731p.get(str)));
            ((Button) findViewById(aVar.f33737a)).setBackgroundResource(aVar.f33738b);
            if (aVar.f33741e != 0) {
                ((Button) findViewById(aVar.f33737a)).setTextColor(getResources().getColor(aVar.f33741e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.PSP, D0(this.f33729n));
        this.f33729n.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33732q.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33732q.get(key);
            if (this.f33729n.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33737a);
                PrintStream printStream = System.out;
                printStream.println("t----------" + aVar.f33741e);
                PrintStream printStream2 = System.out;
                printStream2.println("btn----------" + button);
                if (aVar.f33741e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33743g));
                }
                button.setBackgroundResource(aVar.f33740d);
                ((TextView) findViewById(aVar.f33744h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33729n, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33737a);
                if (aVar.f33741e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33741e));
                }
                button2.setBackgroundResource(aVar.f33738b);
            }
        }
    }

    private void H0() {
        this.f33734s = new ArrayList();
        this.f33735t = new ArrayList();
        for (String str : this.f33731p.keySet()) {
            if (!this.f33729n.containsValue(str)) {
                this.f33735t.add(str);
            }
        }
        for (String str2 : this.f33731p.values()) {
            if (!this.f33729n.containsKey(str2)) {
                this.f33734s.add(str2);
            }
        }
        Iterator<String> it2 = this.f33735t.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33731p.get(next);
            if (this.f33734s.contains(str3)) {
                it2.remove();
                this.f33734s.remove(str3);
                this.f33729n.put(str3, next);
            }
        }
        if (this.f33734s.size() >= this.f33735t.size()) {
            for (int i4 = 0; i4 < this.f33735t.size(); i4++) {
                this.f33729n.put(this.f33734s.get(i4), this.f33735t.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33731p.keySet()) {
            String str2 = this.f33731p.get(str);
            a aVar = this.f33732q.get(str);
            if (this.f33730o.containsKey(str2)) {
                ((TextView) findViewById(aVar.f33744h)).setText(com.join.mgps.joystick.map.b.f53451a.get(str2));
            } else {
                ((TextView) findViewById(aVar.f33744h)).setText("");
            }
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.PSP.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.f53503r0.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33728m.setText("PSP游戏手柄设置");
        this.f33719d.setTag(com.join.mgps.joystick.map.b.f53479j0);
        this.f33720e.setTag(com.join.mgps.joystick.map.b.f53482k0);
        this.f33719d.setText("选择");
        this.f33720e.setText("开始");
        this.f33719d.setOnClickListener(this);
        this.f33720e.setOnClickListener(this);
        this.f33721f.setOnClickListener(this);
        this.f33722g.setOnClickListener(this);
        this.f33723h.setOnClickListener(this);
        this.f33724i.setOnClickListener(this);
        this.f33725j.setOnClickListener(this);
        this.f33726k.setOnClickListener(this);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33732q = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.f53482k0, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53479j0, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53488m0, new a(R.id.f15589a, R.drawable.handshank_psp_a_normal, R.drawable.handshank_psp_a_selected, R.drawable.handshank_psp_a_pressed, 0, 0, 0, R.id.a_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53494o0, new a(R.id.f15591b, R.drawable.handshank_psp_b_normal, R.drawable.handshank_psp_b_selected, R.drawable.handshank_psp_b_pressed, 0, 0, 0, R.id.b_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53485l0, new a(R.id.f15620x, R.drawable.handshank_psp_x_normal, R.drawable.handshank_psp_x_selected, R.drawable.handshank_psp_x_pressed, 0, 0, 0, R.id.x_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53491n0, new a(R.id.f15621y, R.drawable.handshank_psp_y_normal, R.drawable.handshank_psp_y_selected, R.drawable.handshank_psp_y_pressed, 0, 0, 0, R.id.y_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53497p0, new a(R.id.f15606l, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l1_tv));
        this.f33732q.put(com.join.mgps.joystick.map.b.f53500q0, new a(R.id.f15613r, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33733r) {
            this.f33733r = false;
            finish();
            return;
        }
        if (this.f33729n.size() < 8) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.PSP, D0(this.f33729n));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        Button button;
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33730o.containsValue(Integer.valueOf(i4)) && (button = this.f33736u) != null) {
                String str = (String) button.getTag();
                String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33730o, Integer.valueOf(i4));
                if (this.f33729n.containsKey(str2)) {
                    ((TextView) findViewById(this.f33732q.get(this.f33729n.get(str2)).f33744h)).setText("");
                }
                if (this.f33731p.containsValue(str2)) {
                    ((TextView) findViewById(this.f33732q.get((String) com.join.mgps.joystick.map.b.c(this.f33731p, str2)).f33744h)).setText("");
                }
                this.f33729n.put(str2, str);
                this.f33733r = false;
                this.f33736u.setBackgroundResource(this.f33732q.get(str).f33740d);
                this.f33736u = null;
                G0();
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
        if (this.f33729n.containsValue(str)) {
            return;
        }
        Button button = this.f33736u;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33732q.get(this.f33736u.getTag());
            this.f33736u.setBackgroundResource(aVar.f33738b);
            if (aVar.f33741e != 0) {
                this.f33736u.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33736u = button2;
        a aVar2 = this.f33732q.get(button2.getTag());
        this.f33736u.setBackgroundResource(aVar2.f33739c);
        if (aVar2.f33741e != 0) {
            this.f33736u.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
