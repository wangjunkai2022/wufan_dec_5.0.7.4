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
@EActivity(R.layout.activity_ps_key_map)
/* loaded from: classes4.dex */
public class HandShankPSActivity extends HandShankBaseActivity implements View.OnClickListener {
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f33684d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33685e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33686f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33687g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33688h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33689i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33690j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33691k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33692l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f33693m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    Button f33694n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    TextView f33695o;

    /* renamed from: p  reason: collision with root package name */
    private Map<String, String> f33696p = new HashMap();

    /* renamed from: q  reason: collision with root package name */
    private Map<String, Integer> f33697q = new HashMap();

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f33698r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private Map<String, a> f33699s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f33700t;

    /* renamed from: u  reason: collision with root package name */
    private List<String> f33701u;

    /* renamed from: v  reason: collision with root package name */
    private List<String> f33702v;

    /* renamed from: w  reason: collision with root package name */
    private Button f33703w;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33704a;

        /* renamed from: b  reason: collision with root package name */
        public int f33705b;

        /* renamed from: c  reason: collision with root package name */
        public int f33706c;

        /* renamed from: d  reason: collision with root package name */
        public int f33707d;

        /* renamed from: e  reason: collision with root package name */
        public int f33708e;

        /* renamed from: f  reason: collision with root package name */
        public int f33709f;

        /* renamed from: g  reason: collision with root package name */
        public int f33710g;

        /* renamed from: h  reason: collision with root package name */
        public int f33711h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33704a = i4;
            this.f33705b = i5;
            this.f33706c = i6;
            this.f33707d = i7;
            this.f33708e = i8;
            this.f33709f = i9;
            this.f33710g = i10;
            this.f33711h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.a(str)) {
                this.f33697q.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33697q;
        if (map == null || map.size() == 0) {
            this.f33697q.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33697q.put(com.join.mgps.joystick.map.b.f53478j, 104);
        }
        Map<String, String> x02 = x0();
        this.f33698r = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33698r.put(com.join.mgps.joystick.map.b.D0, com.join.mgps.joystick.map.b.f53457c);
            this.f33698r.put(com.join.mgps.joystick.map.b.E0, com.join.mgps.joystick.map.b.f53460d);
            this.f33698r.put(com.join.mgps.joystick.map.b.F0, com.join.mgps.joystick.map.b.f53463e);
            this.f33698r.put(com.join.mgps.joystick.map.b.G0, com.join.mgps.joystick.map.b.f53469g);
            this.f33698r.put(com.join.mgps.joystick.map.b.H0, com.join.mgps.joystick.map.b.f53466f);
            this.f33698r.put(com.join.mgps.joystick.map.b.I0, com.join.mgps.joystick.map.b.f53472h);
            this.f33698r.put(com.join.mgps.joystick.map.b.J0, com.join.mgps.joystick.map.b.f53475i);
            this.f33698r.put(com.join.mgps.joystick.map.b.K0, com.join.mgps.joystick.map.b.f53481k);
            this.f33698r.put(com.join.mgps.joystick.map.b.L0, com.join.mgps.joystick.map.b.f53478j);
            this.f33698r.put(com.join.mgps.joystick.map.b.M0, com.join.mgps.joystick.map.b.f53484l);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.N0.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33700t = true;
        this.f33696p.clear();
        this.f33696p.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.D0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.E0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53463e, com.join.mgps.joystick.map.b.F0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.G0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53466f, com.join.mgps.joystick.map.b.H0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.I0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.J0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.K0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.L0);
        this.f33696p.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.M0);
        this.f33698r.clear();
        this.f33698r.put(com.join.mgps.joystick.map.b.D0, com.join.mgps.joystick.map.b.f53457c);
        this.f33698r.put(com.join.mgps.joystick.map.b.E0, com.join.mgps.joystick.map.b.f53460d);
        this.f33698r.put(com.join.mgps.joystick.map.b.F0, com.join.mgps.joystick.map.b.f53463e);
        this.f33698r.put(com.join.mgps.joystick.map.b.G0, com.join.mgps.joystick.map.b.f53469g);
        this.f33698r.put(com.join.mgps.joystick.map.b.H0, com.join.mgps.joystick.map.b.f53466f);
        this.f33698r.put(com.join.mgps.joystick.map.b.I0, com.join.mgps.joystick.map.b.f53472h);
        this.f33698r.put(com.join.mgps.joystick.map.b.J0, com.join.mgps.joystick.map.b.f53475i);
        this.f33698r.put(com.join.mgps.joystick.map.b.K0, com.join.mgps.joystick.map.b.f53481k);
        this.f33698r.put(com.join.mgps.joystick.map.b.L0, com.join.mgps.joystick.map.b.f53478j);
        this.f33698r.put(com.join.mgps.joystick.map.b.M0, com.join.mgps.joystick.map.b.f53484l);
        for (String str : this.f33698r.keySet()) {
            a aVar = this.f33699s.get(str);
            ((TextView) findViewById(aVar.f33711h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33698r.get(str)));
            ((Button) findViewById(aVar.f33704a)).setBackgroundResource(aVar.f33705b);
            if (aVar.f33708e != 0) {
                ((Button) findViewById(aVar.f33704a)).setTextColor(getResources().getColor(aVar.f33708e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.PS, D0(this.f33696p));
        this.f33696p.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33699s.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33699s.get(key);
            if (this.f33696p.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33704a);
                if (aVar.f33708e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33710g));
                }
                button.setBackgroundResource(aVar.f33707d);
                ((TextView) findViewById(aVar.f33711h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33696p, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33704a);
                if (aVar.f33708e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33708e));
                }
                button2.setBackgroundResource(aVar.f33705b);
            }
        }
    }

    private void H0() {
        this.f33701u = new ArrayList();
        this.f33702v = new ArrayList();
        for (String str : this.f33698r.keySet()) {
            if (!this.f33696p.containsValue(str)) {
                this.f33702v.add(str);
            }
        }
        for (String str2 : this.f33698r.values()) {
            if (!this.f33696p.containsKey(str2)) {
                this.f33701u.add(str2);
            }
        }
        Iterator<String> it2 = this.f33702v.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33698r.get(next);
            if (this.f33701u.contains(str3)) {
                it2.remove();
                this.f33701u.remove(str3);
                this.f33696p.put(str3, next);
            }
        }
        if (this.f33701u.size() >= this.f33702v.size()) {
            for (int i4 = 0; i4 < this.f33702v.size(); i4++) {
                this.f33696p.put(this.f33701u.get(i4), this.f33702v.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33698r.keySet()) {
            String str2 = this.f33698r.get(str);
            a aVar = this.f33699s.get(str);
            if (this.f33697q.containsKey(str2)) {
                ((TextView) findViewById(aVar.f33711h)).setText(com.join.mgps.joystick.map.b.f53451a.get(str2));
            } else {
                ((TextView) findViewById(aVar.f33711h)).setText("");
            }
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.PS.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.N0.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33695o.setText("PS游戏手柄设置");
        this.f33684d.setTag(com.join.mgps.joystick.map.b.D0);
        this.f33685e.setTag(com.join.mgps.joystick.map.b.E0);
        this.f33684d.setText("选择");
        this.f33685e.setText("开始");
        this.f33684d.setOnClickListener(this);
        this.f33685e.setOnClickListener(this);
        this.f33686f.setOnClickListener(this);
        this.f33688h.setOnClickListener(this);
        this.f33689i.setOnClickListener(this);
        this.f33687g.setOnClickListener(this);
        this.f33690j.setOnClickListener(this);
        this.f33691k.setOnClickListener(this);
        this.f33692l.setOnClickListener(this);
        this.f33693m.setOnClickListener(this);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33699s = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.E0, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.D0, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.G0, new a(R.id.f15589a, R.drawable.handshank_psp_a_normal, R.drawable.handshank_psp_a_selected, R.drawable.handshank_psp_a_pressed, 0, 0, 0, R.id.a_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.I0, new a(R.id.f15591b, R.drawable.handshank_psp_b_normal, R.drawable.handshank_psp_b_selected, R.drawable.handshank_psp_b_pressed, 0, 0, 0, R.id.b_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.F0, new a(R.id.f15620x, R.drawable.handshank_psp_x_normal, R.drawable.handshank_psp_x_selected, R.drawable.handshank_psp_x_pressed, 0, 0, 0, R.id.x_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.H0, new a(R.id.f15621y, R.drawable.handshank_psp_y_normal, R.drawable.handshank_psp_y_selected, R.drawable.handshank_psp_y_pressed, 0, 0, 0, R.id.y_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.J0, new a(R.id.f15607l1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l1_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.L0, new a(R.id.f15608l2, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l2_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.K0, new a(R.id.f15614r1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        this.f33699s.put(com.join.mgps.joystick.map.b.M0, new a(R.id.f15615r2, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r2_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33700t) {
            this.f33700t = false;
            finish();
            return;
        }
        if (this.f33696p.size() < 10) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.PS, D0(this.f33696p));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        Button button;
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33697q.containsValue(Integer.valueOf(i4)) && (button = this.f33703w) != null) {
                String str = (String) button.getTag();
                String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33697q, Integer.valueOf(i4));
                if (this.f33696p.containsKey(str2)) {
                    ((TextView) findViewById(this.f33699s.get(this.f33696p.get(str2)).f33711h)).setText("");
                }
                if (this.f33698r.containsValue(str2)) {
                    ((TextView) findViewById(this.f33699s.get((String) com.join.mgps.joystick.map.b.c(this.f33698r, str2)).f33711h)).setText("");
                }
                this.f33696p.put(str2, str);
                this.f33700t = false;
                this.f33703w.setBackgroundResource(this.f33699s.get(str).f33707d);
                this.f33703w = null;
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
        if (this.f33696p.containsValue(str)) {
            return;
        }
        Button button = this.f33703w;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33699s.get(this.f33703w.getTag());
            this.f33703w.setBackgroundResource(aVar.f33705b);
            if (aVar.f33708e != 0) {
                this.f33703w.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33703w = button2;
        a aVar2 = this.f33699s.get(button2.getTag());
        this.f33703w.setBackgroundResource(aVar2.f33706c);
        if (aVar2.f33708e != 0) {
            this.f33703w.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
