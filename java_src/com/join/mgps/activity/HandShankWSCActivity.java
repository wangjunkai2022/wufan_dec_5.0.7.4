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
@EActivity(R.layout.activity_wsc_key_map)
/* loaded from: classes4.dex */
public class HandShankWSCActivity extends HandShankBaseActivity implements View.OnClickListener {
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f33821d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33822e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33823f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33824g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33825h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33826i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33827j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33828k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33829l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f33830m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    Button f33831n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    Button f33832o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f33833p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    TextView f33834q;

    /* renamed from: r  reason: collision with root package name */
    private Map<String, String> f33835r = new HashMap();

    /* renamed from: s  reason: collision with root package name */
    private Map<String, Integer> f33836s = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    private Map<String, String> f33837t = new HashMap();

    /* renamed from: u  reason: collision with root package name */
    private Map<String, a> f33838u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f33839v;

    /* renamed from: w  reason: collision with root package name */
    private List<String> f33840w;

    /* renamed from: x  reason: collision with root package name */
    private List<String> f33841x;

    /* renamed from: y  reason: collision with root package name */
    private Button f33842y;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33843a;

        /* renamed from: b  reason: collision with root package name */
        public int f33844b;

        /* renamed from: c  reason: collision with root package name */
        public int f33845c;

        /* renamed from: d  reason: collision with root package name */
        public int f33846d;

        /* renamed from: e  reason: collision with root package name */
        public int f33847e;

        /* renamed from: f  reason: collision with root package name */
        public int f33848f;

        /* renamed from: g  reason: collision with root package name */
        public int f33849g;

        /* renamed from: h  reason: collision with root package name */
        public int f33850h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33843a = i4;
            this.f33844b = i5;
            this.f33845c = i6;
            this.f33846d = i7;
            this.f33847e = i8;
            this.f33848f = i9;
            this.f33849g = i10;
            this.f33850h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.b(str)) {
                this.f33836s.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33836s;
        if (map == null || map.size() == 0) {
            this.f33836s.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53478j, 104);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53487m, 21);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53493o, 20);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53490n, 19);
            this.f33836s.put(com.join.mgps.joystick.map.b.f53496p, 22);
        }
        Map<String, String> x02 = x0();
        this.f33837t = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33837t.put(com.join.mgps.joystick.map.b.P0, com.join.mgps.joystick.map.b.f53457c);
            this.f33837t.put(com.join.mgps.joystick.map.b.Q0, com.join.mgps.joystick.map.b.f53460d);
            this.f33837t.put(com.join.mgps.joystick.map.b.R0, com.join.mgps.joystick.map.b.f53469g);
            this.f33837t.put(com.join.mgps.joystick.map.b.S0, com.join.mgps.joystick.map.b.f53472h);
            this.f33837t.put(com.join.mgps.joystick.map.b.T0, com.join.mgps.joystick.map.b.f53475i);
            this.f33837t.put(com.join.mgps.joystick.map.b.U0, com.join.mgps.joystick.map.b.f53481k);
            this.f33837t.put(com.join.mgps.joystick.map.b.V0, com.join.mgps.joystick.map.b.f53478j);
            this.f33837t.put(com.join.mgps.joystick.map.b.W0, com.join.mgps.joystick.map.b.f53484l);
            this.f33837t.put(com.join.mgps.joystick.map.b.X0, com.join.mgps.joystick.map.b.f53487m);
            this.f33837t.put(com.join.mgps.joystick.map.b.Y0, com.join.mgps.joystick.map.b.f53490n);
            this.f33837t.put(com.join.mgps.joystick.map.b.Z0, com.join.mgps.joystick.map.b.f53496p);
            this.f33837t.put(com.join.mgps.joystick.map.b.f53453a1, com.join.mgps.joystick.map.b.f53493o);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.f53456b1.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33839v = true;
        this.f33835r.clear();
        this.f33835r.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.P0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.Q0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.R0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.S0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53475i, com.join.mgps.joystick.map.b.T0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.U0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53478j, com.join.mgps.joystick.map.b.V0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53484l, com.join.mgps.joystick.map.b.W0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53487m, com.join.mgps.joystick.map.b.X0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53490n, com.join.mgps.joystick.map.b.Y0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53496p, com.join.mgps.joystick.map.b.Z0);
        this.f33835r.put(com.join.mgps.joystick.map.b.f53493o, com.join.mgps.joystick.map.b.f53453a1);
        this.f33837t.clear();
        this.f33837t.put(com.join.mgps.joystick.map.b.P0, com.join.mgps.joystick.map.b.f53457c);
        this.f33837t.put(com.join.mgps.joystick.map.b.Q0, com.join.mgps.joystick.map.b.f53460d);
        this.f33837t.put(com.join.mgps.joystick.map.b.R0, com.join.mgps.joystick.map.b.f53469g);
        this.f33837t.put(com.join.mgps.joystick.map.b.S0, com.join.mgps.joystick.map.b.f53472h);
        this.f33837t.put(com.join.mgps.joystick.map.b.T0, com.join.mgps.joystick.map.b.f53475i);
        this.f33837t.put(com.join.mgps.joystick.map.b.U0, com.join.mgps.joystick.map.b.f53481k);
        this.f33837t.put(com.join.mgps.joystick.map.b.V0, com.join.mgps.joystick.map.b.f53478j);
        this.f33837t.put(com.join.mgps.joystick.map.b.W0, com.join.mgps.joystick.map.b.f53484l);
        this.f33837t.put(com.join.mgps.joystick.map.b.X0, com.join.mgps.joystick.map.b.f53487m);
        this.f33837t.put(com.join.mgps.joystick.map.b.Y0, com.join.mgps.joystick.map.b.f53490n);
        this.f33837t.put(com.join.mgps.joystick.map.b.Z0, com.join.mgps.joystick.map.b.f53496p);
        this.f33837t.put(com.join.mgps.joystick.map.b.f53453a1, com.join.mgps.joystick.map.b.f53493o);
        for (String str : this.f33837t.keySet()) {
            a aVar = this.f33838u.get(str);
            ((TextView) findViewById(aVar.f33850h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33837t.get(str)));
            ((Button) findViewById(aVar.f33843a)).setBackgroundResource(aVar.f33844b);
            if (aVar.f33847e != 0) {
                ((Button) findViewById(aVar.f33843a)).setTextColor(getResources().getColor(aVar.f33847e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.WSC, D0(this.f33835r));
        this.f33835r.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33838u.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33838u.get(key);
            if (this.f33835r.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33843a);
                if (aVar.f33847e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33849g));
                }
                button.setBackgroundResource(aVar.f33846d);
                ((TextView) findViewById(aVar.f33850h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33835r, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33843a);
                if (aVar.f33847e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33847e));
                }
                button2.setBackgroundResource(aVar.f33844b);
            }
        }
    }

    private void H0() {
        this.f33840w = new ArrayList();
        this.f33841x = new ArrayList();
        for (String str : this.f33837t.keySet()) {
            if (!this.f33835r.containsValue(str)) {
                this.f33841x.add(str);
            }
        }
        for (String str2 : this.f33837t.values()) {
            if (!this.f33835r.containsKey(str2)) {
                this.f33840w.add(str2);
            }
        }
        Iterator<String> it2 = this.f33841x.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33837t.get(next);
            if (this.f33840w.contains(str3)) {
                it2.remove();
                this.f33840w.remove(str3);
                this.f33835r.put(str3, next);
            }
        }
        if (this.f33840w.size() >= this.f33841x.size()) {
            for (int i4 = 0; i4 < this.f33841x.size(); i4++) {
                this.f33835r.put(this.f33840w.get(i4), this.f33841x.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33837t.keySet()) {
            String str2 = this.f33837t.get(str);
            a aVar = this.f33838u.get(str);
            if (this.f33836s.containsKey(str2)) {
                ((TextView) findViewById(aVar.f33850h)).setText(com.join.mgps.joystick.map.b.f53451a.get(str2));
            } else {
                ((TextView) findViewById(aVar.f33850h)).setText("");
            }
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.WSC.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.f53456b1.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33834q.setText("WSC游戏手柄设置");
        this.f33821d.setTag(com.join.mgps.joystick.map.b.P0);
        this.f33822e.setTag(com.join.mgps.joystick.map.b.Q0);
        this.f33821d.setText("选择");
        this.f33822e.setText("开始");
        this.f33821d.setOnClickListener(this);
        this.f33822e.setOnClickListener(this);
        this.f33823f.setOnClickListener(this);
        this.f33825h.setOnClickListener(this);
        this.f33826i.setOnClickListener(this);
        this.f33824g.setOnClickListener(this);
        this.f33827j.setOnClickListener(this);
        this.f33828k.setOnClickListener(this);
        this.f33829l.setOnClickListener(this);
        this.f33830m.setOnClickListener(this);
        this.f33832o.setOnClickListener(this);
        this.f33831n.setOnClickListener(this);
        ((View) this.f33821d.getParent()).setVisibility(8);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33838u = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.Q0, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.P0, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.R0, new a(R.id.f15589a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.a_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.S0, new a(R.id.f15591b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.b_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.Y0, new a(R.id.up, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.up_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.f53453a1, new a(R.id.down, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.down_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.X0, new a(R.id.left, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.left_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.Z0, new a(R.id.right, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.right_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.T0, new a(R.id.f15607l1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l1_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.V0, new a(R.id.f15608l2, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.l2_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.U0, new a(R.id.f15614r1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        this.f33838u.put(com.join.mgps.joystick.map.b.W0, new a(R.id.f15615r2, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r2_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33839v) {
            this.f33839v = false;
            finish();
            return;
        }
        if (this.f33835r.size() < 12) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.WSC, D0(this.f33835r));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        Button button;
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33836s.containsValue(Integer.valueOf(i4)) && (button = this.f33842y) != null) {
                String str = (String) button.getTag();
                String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33836s, Integer.valueOf(i4));
                if (this.f33835r.containsKey(str2)) {
                    ((TextView) findViewById(this.f33838u.get(this.f33835r.get(str2)).f33850h)).setText("");
                }
                if (this.f33837t.containsValue(str2)) {
                    ((TextView) findViewById(this.f33838u.get((String) com.join.mgps.joystick.map.b.c(this.f33837t, str2)).f33850h)).setText("");
                }
                this.f33835r.put(str2, str);
                this.f33839v = false;
                this.f33842y.setBackgroundResource(this.f33838u.get(str).f33846d);
                this.f33842y = null;
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
        if (this.f33835r.containsValue(str)) {
            return;
        }
        Button button = this.f33842y;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33838u.get(this.f33842y.getTag());
            this.f33842y.setBackgroundResource(aVar.f33844b);
            if (aVar.f33847e != 0) {
                this.f33842y.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33842y = button2;
        a aVar2 = this.f33838u.get(button2.getTag());
        this.f33842y.setBackgroundResource(aVar2.f33845c);
        if (aVar2.f33847e != 0) {
            this.f33842y.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
