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
@EActivity(R.layout.activity_gbc_key_map)
/* loaded from: classes4.dex */
public class HandShankGBCActivity extends HandShankBaseActivity implements View.OnClickListener {
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f33589d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33590e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33591f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33592g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33593h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33594i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33595j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33596k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    TextView f33597l;

    /* renamed from: m  reason: collision with root package name */
    private Map<String, String> f33598m = new HashMap();

    /* renamed from: n  reason: collision with root package name */
    private Map<String, Integer> f33599n = new HashMap();

    /* renamed from: o  reason: collision with root package name */
    private Map<String, String> f33600o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private Map<String, a> f33601p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f33602q;

    /* renamed from: r  reason: collision with root package name */
    private List<String> f33603r;

    /* renamed from: s  reason: collision with root package name */
    private List<String> f33604s;

    /* renamed from: t  reason: collision with root package name */
    private Button f33605t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33606a;

        /* renamed from: b  reason: collision with root package name */
        public int f33607b;

        /* renamed from: c  reason: collision with root package name */
        public int f33608c;

        /* renamed from: d  reason: collision with root package name */
        public int f33609d;

        /* renamed from: e  reason: collision with root package name */
        public int f33610e;

        /* renamed from: f  reason: collision with root package name */
        public int f33611f;

        /* renamed from: g  reason: collision with root package name */
        public int f33612g;

        /* renamed from: h  reason: collision with root package name */
        public int f33613h;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f33606a = i4;
            this.f33607b = i5;
            this.f33608c = i6;
            this.f33609d = i7;
            this.f33610e = i8;
            this.f33611f = i9;
            this.f33612g = i10;
            this.f33613h = i11;
        }
    }

    private void A0() {
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            String str2 = (String) c5.get(str);
            if (com.join.mgps.joystick.map.b.a(str)) {
                this.f33599n.put(str, Integer.valueOf(Integer.parseInt(str2)));
            }
        }
        Map<String, Integer> map = this.f33599n;
        if (map == null || map.size() == 0) {
            this.f33599n.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53478j, 104);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33599n.put(com.join.mgps.joystick.map.b.f53502r, 107);
        }
        Map<String, String> x02 = x0();
        this.f33600o = x02;
        if (x02 == null || x02.size() == 0) {
            this.f33600o.put(com.join.mgps.joystick.map.b.f53462d1, com.join.mgps.joystick.map.b.f53457c);
            this.f33600o.put(com.join.mgps.joystick.map.b.f53465e1, com.join.mgps.joystick.map.b.f53460d);
            this.f33600o.put(com.join.mgps.joystick.map.b.f53474h1, com.join.mgps.joystick.map.b.f53463e);
            this.f33600o.put(com.join.mgps.joystick.map.b.f53468f1, com.join.mgps.joystick.map.b.f53469g);
            this.f33600o.put(com.join.mgps.joystick.map.b.f53477i1, com.join.mgps.joystick.map.b.f53466f);
            this.f33600o.put(com.join.mgps.joystick.map.b.f53471g1, com.join.mgps.joystick.map.b.f53472h);
            this.f33600o.put(com.join.mgps.joystick.map.b.f53480j1, com.join.mgps.joystick.map.b.f53481k);
        }
    }

    private Map<String, String> D0(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, com.join.mgps.joystick.map.b.f53483k1.get(map.get(str)));
        }
        return hashMap;
    }

    private void E0() {
        this.f33602q = true;
        this.f33598m.clear();
        this.f33598m.put(com.join.mgps.joystick.map.b.f53457c, com.join.mgps.joystick.map.b.f53462d1);
        this.f33598m.put(com.join.mgps.joystick.map.b.f53460d, com.join.mgps.joystick.map.b.f53465e1);
        this.f33598m.put(com.join.mgps.joystick.map.b.f53463e, com.join.mgps.joystick.map.b.f53474h1);
        this.f33598m.put(com.join.mgps.joystick.map.b.f53469g, com.join.mgps.joystick.map.b.f53468f1);
        this.f33598m.put(com.join.mgps.joystick.map.b.f53466f, com.join.mgps.joystick.map.b.f53477i1);
        this.f33598m.put(com.join.mgps.joystick.map.b.f53472h, com.join.mgps.joystick.map.b.f53471g1);
        this.f33598m.put(com.join.mgps.joystick.map.b.f53481k, com.join.mgps.joystick.map.b.f53480j1);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53462d1, com.join.mgps.joystick.map.b.f53457c);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53465e1, com.join.mgps.joystick.map.b.f53460d);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53474h1, com.join.mgps.joystick.map.b.f53463e);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53468f1, com.join.mgps.joystick.map.b.f53469g);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53477i1, com.join.mgps.joystick.map.b.f53466f);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53471g1, com.join.mgps.joystick.map.b.f53472h);
        this.f33600o.put(com.join.mgps.joystick.map.b.f53480j1, com.join.mgps.joystick.map.b.f53481k);
        for (String str : this.f33600o.keySet()) {
            a aVar = this.f33601p.get(str);
            ((TextView) findViewById(aVar.f33613h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33600o.get(str)));
            ((Button) findViewById(aVar.f33606a)).setBackgroundResource(aVar.f33607b);
            if (aVar.f33610e != 0) {
                ((Button) findViewById(aVar.f33606a)).setTextColor(getResources().getColor(aVar.f33610e));
            }
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.GBC, D0(this.f33598m));
        this.f33598m.clear();
    }

    private void G0() {
        for (Map.Entry<String, a> entry : this.f33601p.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33601p.get(key);
            if (this.f33598m.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33606a);
                if (aVar.f33610e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33612g));
                }
                button.setBackgroundResource(aVar.f33609d);
                ((TextView) findViewById(aVar.f33613h)).setText(com.join.mgps.joystick.map.b.f53451a.get(com.join.mgps.joystick.map.b.c(this.f33598m, key)));
            } else {
                Button button2 = (Button) findViewById(aVar.f33606a);
                if (aVar.f33610e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33610e));
                }
                button2.setBackgroundResource(aVar.f33607b);
            }
        }
    }

    private void H0() {
        this.f33603r = new ArrayList();
        this.f33604s = new ArrayList();
        for (String str : this.f33600o.keySet()) {
            if (!this.f33598m.containsValue(str)) {
                this.f33604s.add(str);
            }
        }
        for (String str2 : this.f33600o.values()) {
            if (!this.f33598m.containsKey(str2)) {
                this.f33603r.add(str2);
            }
        }
        Iterator<String> it2 = this.f33604s.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            String str3 = this.f33600o.get(next);
            if (this.f33603r.contains(str3)) {
                it2.remove();
                this.f33603r.remove(str3);
                this.f33598m.put(str3, next);
            }
        }
        if (this.f33603r.size() >= this.f33604s.size()) {
            for (int i4 = 0; i4 < this.f33604s.size(); i4++) {
                this.f33598m.put(this.f33603r.get(i4), this.f33604s.get(i4));
            }
        }
    }

    private void initView() {
        for (String str : this.f33600o.keySet()) {
            ((TextView) findViewById(this.f33601p.get(str).f33613h)).setText(com.join.mgps.joystick.map.b.f53451a.get(this.f33600o.get(str)));
        }
    }

    private Map<String, String> x0() {
        HashMap hashMap = new HashMap();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.EmuMap.GBC.section);
        for (Map.Entry<String, String> entry : com.join.mgps.joystick.map.b.f53483k1.entrySet()) {
            hashMap.put(entry.getKey(), (String) c5.get(entry.getValue()));
        }
        return hashMap;
    }

    private void y0() {
        this.f33597l.setText("GBC游戏手柄设置");
        this.f33589d.setTag(com.join.mgps.joystick.map.b.f53462d1);
        this.f33590e.setTag(com.join.mgps.joystick.map.b.f53465e1);
        this.f33589d.setText("选择");
        this.f33590e.setText("开始");
        this.f33589d.setOnClickListener(this);
        this.f33590e.setOnClickListener(this);
        this.f33591f.setOnClickListener(this);
        this.f33592g.setOnClickListener(this);
        this.f33593h.setOnClickListener(this);
        this.f33594i.setOnClickListener(this);
        this.f33595j.setOnClickListener(this);
    }

    private void z0() {
        HashMap hashMap = new HashMap();
        this.f33601p = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.f53465e1, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.start_tv));
        this.f33601p.put(com.join.mgps.joystick.map.b.f53462d1, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.select_tv));
        this.f33601p.put(com.join.mgps.joystick.map.b.f53468f1, new a(R.id.f15589a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.a_tv));
        this.f33601p.put(com.join.mgps.joystick.map.b.f53471g1, new a(R.id.f15591b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.b_tv));
        this.f33601p.put(com.join.mgps.joystick.map.b.f53474h1, new a(R.id.f15620x, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.x_tv));
        this.f33601p.put(com.join.mgps.joystick.map.b.f53477i1, new a(R.id.f15621y, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.y_tv));
        this.f33601p.put(com.join.mgps.joystick.map.b.f53480j1, new a(R.id.ab, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt, R.id.r1_tv));
        A0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        if (this.f33602q) {
            this.f33602q = false;
            finish();
            return;
        }
        if (this.f33598m.size() < 7) {
            H0();
        }
        com.join.mgps.joystick.map.d.o(this, KeyMap.EmuMap.GBC, D0(this.f33598m));
        finish();
    }

    public boolean C0(int i4, KeyEvent keyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (this.f33599n.containsValue(Integer.valueOf(i4))) {
                if (i4 == 4) {
                    finish();
                    return true;
                }
                Button button = this.f33605t;
                if (button != null) {
                    String str = (String) button.getTag();
                    String str2 = (String) com.join.mgps.joystick.map.b.c(this.f33599n, Integer.valueOf(i4));
                    if (this.f33598m.containsKey(str2)) {
                        ((TextView) findViewById(this.f33601p.get(this.f33598m.get(str2)).f33613h)).setText("");
                    }
                    if (this.f33600o.containsValue(str2)) {
                        ((TextView) findViewById(this.f33601p.get((String) com.join.mgps.joystick.map.b.c(this.f33600o, str2)).f33613h)).setText("");
                    }
                    this.f33598m.put(str2, str);
                    this.f33602q = false;
                    this.f33605t.setBackgroundResource(this.f33601p.get(str).f33609d);
                    this.f33605t = null;
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
        if (this.f33598m.containsValue(str)) {
            return;
        }
        Button button = this.f33605t;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33601p.get(this.f33605t.getTag());
            this.f33605t.setBackgroundResource(aVar.f33607b);
            if (aVar.f33610e != 0) {
                this.f33605t.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33605t = button2;
        a aVar2 = this.f33601p.get(button2.getTag());
        this.f33605t.setBackgroundResource(aVar2.f33608c);
        if (aVar2.f33610e != 0) {
            this.f33605t.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
