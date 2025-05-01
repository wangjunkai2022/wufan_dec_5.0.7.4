package com.join.mgps.activity;

import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
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
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.handshank_set_key)
/* loaded from: classes4.dex */
public class HandShankSetKeyActivity extends HandShankBaseActivity implements View.OnClickListener {

    /* renamed from: d  reason: collision with root package name */
    private Map<String, a> f33786d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, String> f33787e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33788f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33789g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33790h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33791i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33792j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33793k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33794l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f33795m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    Button f33796n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    Button f33797o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f33798p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    Button f33799q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    Button f33800r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    Button f33801s;
    @Extra

    /* renamed from: t  reason: collision with root package name */
    String f33802t;

    /* renamed from: u  reason: collision with root package name */
    private Button f33803u;

    /* renamed from: v  reason: collision with root package name */
    private List<String> f33804v;

    /* renamed from: w  reason: collision with root package name */
    private List<String> f33805w;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public int f33806a;

        /* renamed from: b  reason: collision with root package name */
        public int f33807b;

        /* renamed from: c  reason: collision with root package name */
        public int f33808c;

        /* renamed from: d  reason: collision with root package name */
        public int f33809d;

        /* renamed from: e  reason: collision with root package name */
        public int f33810e;

        /* renamed from: f  reason: collision with root package name */
        public int f33811f;

        /* renamed from: g  reason: collision with root package name */
        public int f33812g;

        public a(int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f33806a = i4;
            this.f33807b = i5;
            this.f33808c = i6;
            this.f33809d = i7;
            this.f33810e = i8;
            this.f33811f = i9;
            this.f33812g = i10;
        }
    }

    private void C0() {
        for (Map.Entry<String, a> entry : this.f33786d.entrySet()) {
            String key = entry.getKey();
            a aVar = this.f33786d.get(key);
            if (this.f33787e.containsValue(key)) {
                Button button = (Button) findViewById(aVar.f33806a);
                if (aVar.f33810e != 0) {
                    button.setTextColor(getResources().getColor(aVar.f33812g));
                }
                button.setBackgroundResource(aVar.f33809d);
            } else {
                Button button2 = (Button) findViewById(aVar.f33806a);
                if (aVar.f33810e != 0) {
                    button2.setTextColor(getResources().getColor(aVar.f33810e));
                }
                button2.setBackgroundResource(aVar.f33807b);
            }
        }
    }

    private void D0() {
        this.f33804v = new ArrayList();
        this.f33805w = new ArrayList();
        for (String str : com.join.mgps.joystick.map.b.f53454b.keySet()) {
            if (!this.f33787e.containsValue(str)) {
                this.f33805w.add(str);
            }
        }
        for (Integer num : com.join.mgps.joystick.map.b.f53454b.values()) {
            Map<String, String> map = this.f33787e;
            if (!map.containsKey(num + "")) {
                List<String> list = this.f33804v;
                list.add(num + "");
            }
        }
        Iterator<String> it2 = this.f33805w.iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            Integer num2 = com.join.mgps.joystick.map.b.f53454b.get(next);
            List<String> list2 = this.f33804v;
            if (list2.contains(num2 + "")) {
                it2.remove();
                List<String> list3 = this.f33804v;
                list3.remove(num2 + "");
                Map<String, String> map2 = this.f33787e;
                map2.put(num2 + "", next);
            }
        }
        if (this.f33804v.size() == this.f33805w.size()) {
            for (int i4 = 0; i4 < this.f33804v.size(); i4++) {
                this.f33787e.put(this.f33804v.get(i4), this.f33805w.get(i4));
            }
        }
    }

    private void clear() {
        for (String str : this.f33786d.keySet()) {
            a aVar = this.f33786d.get(str);
            Button button = (Button) findViewById(aVar.f33806a);
            button.setBackgroundResource(aVar.f33807b);
            if (aVar.f33810e != 0) {
                button.setTextColor(getResources().getColor(aVar.f33810e));
            }
        }
        this.f33787e.clear();
        this.f33787e.put("108", com.join.mgps.joystick.map.b.f53460d);
        this.f33787e.put("109", com.join.mgps.joystick.map.b.f53457c);
        this.f33787e.put("99", com.join.mgps.joystick.map.b.f53463e);
        this.f33787e.put("96", com.join.mgps.joystick.map.b.f53469g);
        this.f33787e.put("100", com.join.mgps.joystick.map.b.f53466f);
        this.f33787e.put("97", com.join.mgps.joystick.map.b.f53472h);
        this.f33787e.put("102", com.join.mgps.joystick.map.b.f53475i);
        this.f33787e.put("104", com.join.mgps.joystick.map.b.f53478j);
        this.f33787e.put("103", com.join.mgps.joystick.map.b.f53481k);
        this.f33787e.put("105", com.join.mgps.joystick.map.b.f53484l);
        this.f33787e.put("21", com.join.mgps.joystick.map.b.f53487m);
        this.f33787e.put("19", com.join.mgps.joystick.map.b.f53490n);
        this.f33787e.put("22", com.join.mgps.joystick.map.b.f53496p);
        this.f33787e.put("20", com.join.mgps.joystick.map.b.f53493o);
        this.f33787e.put("107", com.join.mgps.joystick.map.b.f53502r);
        this.f33787e.put("106", com.join.mgps.joystick.map.b.f53499q);
        com.join.mgps.joystick.map.d.p(KeyMap.keySection, this.f33787e);
        this.f33787e.clear();
        Toast.makeText(this, "按钮重置成功", 1).show();
    }

    private void x0() {
        this.f33788f.setOnClickListener(this);
        this.f33789g.setOnClickListener(this);
        this.f33790h.setOnClickListener(this);
        this.f33791i.setOnClickListener(this);
        this.f33798p.setOnClickListener(this);
        this.f33799q.setOnClickListener(this);
        this.f33800r.setOnClickListener(this);
        this.f33801s.setOnClickListener(this);
        this.f33792j.setOnClickListener(this);
        this.f33795m.setOnClickListener(this);
        this.f33793k.setOnClickListener(this);
        this.f33794l.setOnClickListener(this);
        this.f33797o.setOnClickListener(this);
        this.f33796n.setOnClickListener(this);
    }

    private void y0() {
        HashMap hashMap = new HashMap();
        this.f33786d = hashMap;
        hashMap.put(com.join.mgps.joystick.map.b.f53475i, new a(R.id.f15607l1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53478j, new a(R.id.f15608l2, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53481k, new a(R.id.f15614r1, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53484l, new a(R.id.f15615r2, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53466f, new a(R.id.f15621y, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53463e, new a(R.id.f15620x, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53469g, new a(R.id.f15589a, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53472h, new a(R.id.f15591b, R.drawable.handshank_set_key_normal, R.drawable.handshank_set_key_selected, R.drawable.handshank_set_key_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53457c, new a(R.id.select, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53460d, new a(R.id.start, R.drawable.handshank_set_skey_normal, R.drawable.handshank_set_skey_selected, R.drawable.handshank_set_skey_pressed, R.color.handshank_key_set_normal_txt, R.color.handshank_key_set_selected_txt, R.color.handshank_key_set_pressed_txt));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53490n, new a(R.id.up, R.drawable.handshank_set_top_normal, R.drawable.handshank_set_top_selected, R.drawable.handshank_set_top_pressed, 0, 0, 0));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53493o, new a(R.id.down, R.drawable.handshank_set_down_normal, R.drawable.handshank_set_down_selected, R.drawable.handshank_set_down_pressed, 0, 0, 0));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53487m, new a(R.id.left, R.drawable.handshank_set_left_normal, R.drawable.handshank_set_left_selected, R.drawable.handshank_set_left_pressed, 0, 0, 0));
        this.f33786d.put(com.join.mgps.joystick.map.b.f53496p, new a(R.id.right, R.drawable.handshank_set_right_normal, R.drawable.handshank_set_right_selected, R.drawable.handshank_set_right_pressed, 0, 0, 0));
        this.f33787e = new HashMap();
    }

    public boolean A0(int i4, KeyEvent keyEvent) {
        Button button;
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (i4 != 106 && i4 != 107 && (button = this.f33803u) != null) {
                Map<String, String> map = this.f33787e;
                map.put(i4 + "", (String) button.getTag());
                this.f33803u.setBackgroundResource(this.f33786d.get(this.f33803u.getTag()).f33809d);
                this.f33803u.setTextColor(getResources().getColor(R.color.handshank_key_set_pressed_txt));
                this.f33803u = null;
                C0();
            }
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void B0() {
        clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        y0();
        x0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity
    public boolean n0(int i4, PadKeyEvent padKeyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(padKeyEvent.c())) {
            return false;
        }
        if (padKeyEvent.d() != 0) {
            A0(i4, p0(padKeyEvent));
        }
        return super.n0(i4, padKeyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = (String) view.getTag();
        if (this.f33787e.containsValue(str)) {
            return;
        }
        Button button = this.f33803u;
        if (button != null) {
            if (str.equals(button.getTag())) {
                return;
            }
            a aVar = this.f33786d.get(this.f33803u.getTag());
            this.f33803u.setBackgroundResource(aVar.f33807b);
            if (aVar.f33810e != 0) {
                this.f33803u.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
            }
        }
        Button button2 = (Button) view;
        this.f33803u = button2;
        a aVar2 = this.f33786d.get(button2.getTag());
        this.f33803u.setBackgroundResource(aVar2.f33808c);
        if (aVar2.f33810e != 0) {
            this.f33803u.setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
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
        if (TextUtils.isEmpty(this.f33802t)) {
            finish();
        } else if (this.f33802t.equals("first")) {
            Intent intent = new Intent(this, HandShankYesActivity_.class);
            intent.setFlags(603979776);
            startActivity(intent);
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        if (this.f33787e.size() < 14) {
            D0();
        }
        this.f33787e.put("107", com.join.mgps.joystick.map.b.f53502r);
        this.f33787e.put("106", com.join.mgps.joystick.map.b.f53499q);
        com.join.mgps.joystick.map.d.p(KeyMap.keySection, this.f33787e);
        Intent intent = new Intent(this, HandShankYesActivity_.class);
        intent.setFlags(603979776);
        startActivity(intent);
        finish();
    }
}
