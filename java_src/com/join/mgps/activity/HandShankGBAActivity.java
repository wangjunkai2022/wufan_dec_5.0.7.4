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
@EActivity(R.layout.activity_gba_key_map)
/* loaded from: classes4.dex */
public class HandShankGBAActivity extends HandShankBaseActivity implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, String> f33555d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33556e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33557f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33558g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33559h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33560i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33561j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33562k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33563l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f33564m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    TextView f33565n;

    /* renamed from: o  reason: collision with root package name */
    private Button f33566o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, String> f33567p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private Map<String, Integer> f33568q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f33569r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private Map<String, a> f33570s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f33571t;

    /* renamed from: u  reason: collision with root package name */
    private List<String> f33572u;

    /* renamed from: v  reason: collision with root package name */
    private List<String> f33573v;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33574a;

        /* renamed from: b  reason: collision with root package name */
        public int f33575b;

        /* renamed from: c  reason: collision with root package name */
        public int f33576c;

        /* renamed from: d  reason: collision with root package name */
        public int f33577d;

        /* renamed from: e  reason: collision with root package name */
        public int f33578e;

        /* renamed from: f  reason: collision with root package name */
        public int f33579f;

        /* renamed from: g  reason: collision with root package name */
        public int f33580g;

        /* renamed from: h  reason: collision with root package name */
        public int f33581h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33574a = i4;
            this.f33575b = i5;
            this.f33576c = i6;
            this.f33577d = i7;
            this.f33578e = i8;
            this.f33579f = i9;
            this.f33580g = i10;
            this.f33581h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.a(str)) {
                this.f33568q.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33568q;
        if (map == null || map.size() == 0) {
            this.f33568q.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53478j, 104);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33568q.put(com.join.mgps.joystick.map.b.f53502r, 107);
        }
        Map<String, String> x02 = x0();
        this.f33569r = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33569r.put(com.join.mgps.joystick.map.b.C, com.join.mgps.joystick.map.b.f53457c);
            this.f33569r.put(com.join.mgps.joystick.map.b.D, com.join.mgps.joystick.map.b.f53460d);
            this.f33569r.put(com.join.mgps.joystick.map.b.E, com.join.mgps.joystick.map.b.f53469g);
            this.f33569r.put(com.join.mgps.joystick.map.b.F, com.join.mgps.joystick.map.b.f53463e);
            this.f33569r.put(com.join.mgps.joystick.map.b.H, com.join.mgps.joystick.map.b.f53481k);
            this.f33569r.put(com.join.mgps.joystick.map.b.G, com.join.mgps.joystick.map.b.f53475i);
            this.f33569r.put(com.join.mgps.joystick.map.b.J, com.join.mgps.joystick.map.b.f53466f);
            this.f33569r.put(com.join.mgps.joystick.map.b.I, com.join.mgps.joystick.map.b.f53472h);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.K.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33571t = true;
        this.f33567p.clear();
        this.f33567p.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.C);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.D);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53463e, com.join.mgps.joystick.map.b.F);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.E);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53466f, com.join.mgps.joystick.map.b.J);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.I);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.G);
        this.f33567p.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.H);
        this.f33569r.clear();
        this.f33569r.put(com.join.mgps.joystick.map.b.C, com.join.mgps.joystick.map.b.f53457c);
        this.f33569r.put(com.join.mgps.joystick.map.b.D, com.join.mgps.joystick.map.b.f53460d);
        this.f33569r.put(com.join.mgps.joystick.map.b.E, com.join.mgps.joystick.map.b.f53469g);
        this.f33569r.put(com.join.mgps.joystick.map.b.F, com.join.mgps.joystick.map.b.f53463e);
        this.f33569r.put(com.join.mgps.joystick.map.b.H, com.join.mgps.joystick.map.b.f53481k);
        this.f33569r.put(com.join.mgps.joystick.map.b.G, com.join.mgps.joystick.map.b.f53475i);
        this.f33569r.put(com.join.mgps.joystick.map.b.J, com.join.mgps.joystick.map.b.f53466f);
        this.f33569r.put(com.join.mgps.joystick.map.b.I, com.join.mgps.joystick.map.b.f53472h);
        for (String str : this.f33569r.keySet()) {
            a aVar = this.f33570s.get(str);
            ((TextView) findViewById(aVar.f33581h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33569r.get(str)));
            ((Button) findViewById(aVar.f33574a)).setBackgroundResource(aVar.f33575b);
            if (aVar.f33578e != 0) {
                ((Button) findViewById(aVar.f33574a)).setTextColor(getResources().getColor(aVar.f33578e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.GBA, D0(this.f33567p));
        this.f33567p.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33570s.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33570s.get(key);
            if (this.f33567p.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33574a);
                if (aVar.f33578e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33580g));
                }
                button.setBackgroundResource(aVar.f33577d);
                ((TextView) findViewById(aVar.f33581h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33567p, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33574a);
                if (aVar.f33578e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33578e));
                }
                button2.setBackgroundResource(aVar.f33575b);
            }
        }
    }

    private void H0() {
        this.f33572u = new ArrayList();
        this.f33573v = new ArrayList();
        for (String str : this.f33569r.keySet()) {
            if (!this.f33567p.containsValue(str)) {
                this.f33573v.add(str);
            }
        }
        for (String str2 : this.f33569r.values()) {
            if (!this.f33567p.containsKey(str2)) {
                this.f33572u.add(str2);
            }
        }
        Iterator<String> it2 = this.f33573v.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33569r.get(next);
            if (this.f33572u.contains(str3)) {
                it2.remove();
                this.f33572u.remove(str3);
                this.f33567p.put(str3, next);
            }
        }
        if (this.f33572u.size() >= this.f33573v.size()) {
            for (int i4 = 0; i4 < this.f33573v.size(); i4++) {
                this.f33567p.put(this.f33572u.get(i4), this.f33573v.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33569r.keySet()) {
            ((TextView) findViewById(this.f33570s.get(str).f33581h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33569r.get(str)));
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.GBA.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.K.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33565n.setText("GBA手柄设置");
        this.f33556e.setTag(com.join.mgps.joystick.map.b.C);
        this.f33557f.setTag(com.join.mgps.joystick.map.b.D);
        this.f33556e.setText("选择");
        this.f33557f.setText("开始");
        this.f33556e.setOnClickListener(this);
        this.f33557f.setOnClickListener(this);
        this.f33556e.setOnClickListener(this);
        this.f33557f.setOnClickListener(this);
        this.f33558g.setOnClickListener(this);
        this.f33559h.setOnClickListener(this);
        this.f33560i.setOnClickListener(this);
        this.f33561j.setOnClickListener(this);
        this.f33562k.setOnClickListener(this);
        this.f33563l.setOnClickListener(this);
        this.f33564m.setOnClickListener(this);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33570s = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.D, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.C, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.E, new a(R.id.f15589a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.a_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.F, new a(R.id.f15591b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.x_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.G, new a(R.id.f15606l, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l1_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.H, new a(R.id.f15613r, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.I, new a(R.id.turbo_a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.b_tv));
        this.f33570s.put(com.join.mgps.joystick.map.b.J, new a(R.id.turbo_b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.y_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33571t) {
            this.f33571t = false;
            finish();
            return;
        }
        if (this.f33567p.size() < 8) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.GBA, D0(this.f33567p));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33568q.containsValue(Integer.valueOf(i4))) {
                if (i4 == 4) {
                    finish();
                    return true;
                }
                Button button = this.f33566o;
                if (button != null) {
                    String str = (String) button.getTag();
                    String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33568q, Integer.valueOf(i4));
                    if (this.f33567p.containsKey(str2)) {
                        ((TextView) findViewById(this.f33570s.get(this.f33567p.get(str2)).f33581h)).setText("");
                    }
                    if (this.f33569r.containsValue(str2)) {
                        ((TextView) findViewById(this.f33570s.get((String) com.join.mgps.joystick.map.b.c(this.f33569r, str2)).f33581h)).setText("");
                    }
                    this.f33567p.put(str2, str);
                    this.f33571t = false;
                    this.f33566o.setBackgroundResource(this.f33570s.get(str).f33577d);
                    this.f33566o = null;
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
        if (this.f33567p.containsValue(str)) {
            return;
        }
        Button button = this.f33566o;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33570s.get(this.f33566o.getTag());
            this.f33566o.setBackgroundResource(aVar.f33575b);
            if (aVar.f33578e != 0) {
                this.f33566o.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33566o = button2;
        a aVar2 = this.f33570s.get(button2.getTag());
        this.f33566o.setBackgroundResource(aVar2.f33576c);
        if (aVar2.f33578e != 0) {
            this.f33566o.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
