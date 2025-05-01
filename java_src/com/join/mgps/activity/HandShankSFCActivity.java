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
@EActivity(R.layout.activity_sfc_key_map)
/* loaded from: classes4.dex */
public class HandShankSFCActivity extends HandShankBaseActivity implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    private Map<Integer, String> f33752d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33753e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33754f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33755g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33756h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33757i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33758j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33759k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f33760l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f33761m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    Button f33762n;

    /* renamed from: o  reason: collision with root package name */
    private Button f33763o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, String> f33764p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private Map<String, Integer> f33765q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f33766r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private Map<String, a> f33767s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f33768t;

    /* renamed from: u  reason: collision with root package name */
    private List<String> f33769u;

    /* renamed from: v  reason: collision with root package name */
    private List<String> f33770v;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33771a;

        /* renamed from: b  reason: collision with root package name */
        public int f33772b;

        /* renamed from: c  reason: collision with root package name */
        public int f33773c;

        /* renamed from: d  reason: collision with root package name */
        public int f33774d;

        /* renamed from: e  reason: collision with root package name */
        public int f33775e;

        /* renamed from: f  reason: collision with root package name */
        public int f33776f;

        /* renamed from: g  reason: collision with root package name */
        public int f33777g;

        /* renamed from: h  reason: collision with root package name */
        public int f33778h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33771a = i4;
            this.f33772b = i5;
            this.f33773c = i6;
            this.f33774d = i7;
            this.f33775e = i8;
            this.f33776f = i9;
            this.f33777g = i10;
            this.f33778h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.a(str)) {
                this.f33765q.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33765q;
        if (map == null || map.size() == 0) {
            this.f33765q.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53478j, 104);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33765q.put(com.join.mgps.joystick.map.b.f53502r, 107);
        }
        Map<String, String> x02 = x0();
        this.f33766r = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33766r.put(com.join.mgps.joystick.map.b.Z, com.join.mgps.joystick.map.b.f53457c);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53452a0, com.join.mgps.joystick.map.b.f53460d);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53455b0, com.join.mgps.joystick.map.b.f53463e);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53458c0, com.join.mgps.joystick.map.b.f53469g);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53461d0, com.join.mgps.joystick.map.b.f53466f);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53464e0, com.join.mgps.joystick.map.b.f53472h);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53467f0, com.join.mgps.joystick.map.b.f53475i);
            this.f33766r.put(com.join.mgps.joystick.map.b.f53470g0, com.join.mgps.joystick.map.b.f53481k);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.f53473h0.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33768t = true;
        this.f33764p.clear();
        this.f33764p.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.Z);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.f53452a0);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53463e, com.join.mgps.joystick.map.b.f53455b0);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.f53458c0);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53466f, com.join.mgps.joystick.map.b.f53461d0);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.f53464e0);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.f53467f0);
        this.f33764p.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.f53470g0);
        this.f33766r.clear();
        this.f33766r.put(com.join.mgps.joystick.map.b.Z, com.join.mgps.joystick.map.b.f53457c);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53452a0, com.join.mgps.joystick.map.b.f53460d);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53455b0, com.join.mgps.joystick.map.b.f53463e);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53458c0, com.join.mgps.joystick.map.b.f53469g);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53461d0, com.join.mgps.joystick.map.b.f53466f);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53464e0, com.join.mgps.joystick.map.b.f53472h);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53467f0, com.join.mgps.joystick.map.b.f53475i);
        this.f33766r.put(com.join.mgps.joystick.map.b.f53470g0, com.join.mgps.joystick.map.b.f53481k);
        for (String str : this.f33766r.keySet()) {
            a aVar = this.f33767s.get(str);
            ((TextView) findViewById(aVar.f33778h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33766r.get(str)));
            ((Button) findViewById(aVar.f33771a)).setBackgroundResource(aVar.f33772b);
            if (aVar.f33775e != 0) {
                ((Button) findViewById(aVar.f33771a)).setTextColor(getResources().getColor(aVar.f33775e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.SFC, D0(this.f33764p));
        this.f33764p.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33767s.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33767s.get(key);
            if (this.f33764p.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33771a);
                if (aVar.f33775e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33777g));
                }
                button.setBackgroundResource(aVar.f33774d);
                ((TextView) findViewById(aVar.f33778h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33764p, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33771a);
                if (aVar.f33775e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33775e));
                }
                button2.setBackgroundResource(aVar.f33772b);
            }
        }
    }

    private void H0() {
        this.f33769u = new ArrayList();
        this.f33770v = new ArrayList();
        for (String str : this.f33766r.keySet()) {
            if (!this.f33764p.containsValue(str)) {
                this.f33770v.add(str);
            }
        }
        for (String str2 : this.f33766r.values()) {
            if (!this.f33764p.containsKey(str2)) {
                this.f33769u.add(str2);
            }
        }
        Iterator<String> it2 = this.f33770v.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33766r.get(next);
            if (this.f33769u.contains(str3)) {
                it2.remove();
                this.f33769u.remove(str3);
                this.f33764p.put(str3, next);
            }
        }
        if (this.f33769u.size() >= this.f33770v.size()) {
            for (int i4 = 0; i4 < this.f33770v.size(); i4++) {
                this.f33764p.put(this.f33769u.get(i4), this.f33770v.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33766r.keySet()) {
            ((TextView) findViewById(this.f33767s.get(str).f33778h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33766r.get(str)));
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.SFC.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.f53473h0.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33760l.setText("SFC手柄设置");
        this.f33753e.setTag(com.join.mgps.joystick.map.b.Z);
        this.f33754f.setTag(com.join.mgps.joystick.map.b.f53452a0);
        this.f33753e.setText("选择");
        this.f33754f.setText("开始");
        this.f33753e.setOnClickListener(this);
        this.f33754f.setOnClickListener(this);
        this.f33755g.setOnClickListener(this);
        this.f33756h.setOnClickListener(this);
        this.f33757i.setOnClickListener(this);
        this.f33758j.setOnClickListener(this);
        this.f33759k.setOnClickListener(this);
        this.f33761m.setOnClickListener(this);
        this.f33762n.setOnClickListener(this);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33767s = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.f53452a0, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.Z, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.f53455b0, new a(R.id.f15620x, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.x_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.f53458c0, new a(R.id.f15589a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.a_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.f53461d0, new a(R.id.f15621y, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.y_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.f53464e0, new a(R.id.f15591b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.b_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.f53467f0, new a(R.id.f15607l1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l1_tv));
        this.f33767s.put(com.join.mgps.joystick.map.b.f53470g0, new a(R.id.f15614r1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33768t) {
            this.f33768t = false;
            finish();
            return;
        }
        if (this.f33764p.size() < 8) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.SFC, D0(this.f33764p));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33765q.containsValue(Integer.valueOf(i4))) {
                if (i4 == 4) {
                    finish();
                    return true;
                }
                Button button = this.f33763o;
                if (button != null) {
                    String str = (String) button.getTag();
                    String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33765q, Integer.valueOf(i4));
                    if (this.f33764p.containsKey(str2)) {
                        ((TextView) findViewById(this.f33767s.get(this.f33764p.get(str2)).f33778h)).setText("");
                    }
                    if (this.f33766r.containsValue(str2)) {
                        ((TextView) findViewById(this.f33767s.get((String) com.join.mgps.joystick.map.b.c(this.f33766r, str2)).f33778h)).setText("");
                    }
                    this.f33764p.put(str2, str);
                    this.f33768t = false;
                    this.f33763o.setBackgroundResource(this.f33767s.get(str).f33774d);
                    this.f33763o = null;
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
        if (this.f33764p.containsValue(str)) {
            return;
        }
        Button button = this.f33763o;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33767s.get(this.f33763o.getTag());
            this.f33763o.setBackgroundResource(aVar.f33772b);
            if (aVar.f33775e != 0) {
                this.f33763o.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33763o = button2;
        a aVar2 = this.f33767s.get(button2.getTag());
        this.f33763o.setBackgroundResource(aVar2.f33773c);
        if (aVar2.f33775e != 0) {
            this.f33763o.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
