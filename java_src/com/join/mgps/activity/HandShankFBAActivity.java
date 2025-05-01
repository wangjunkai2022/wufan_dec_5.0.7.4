package com.join.mgps.activity;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.joystick.map.KeyCodes;
import com.join.mgps.joystick.map.KeyMap;
import com.papa.controller.core.PadKeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.activity_fba_key_map1)
/* loaded from: classes4.dex */
public class HandShankFBAActivity extends HandShankBaseActivity implements View.OnClickListener {
    View[] C;
    a[] D;
    @ViewById

    /* renamed from: d  reason: collision with root package name */
    Button f33495d;
    @ViewById

    /* renamed from: e  reason: collision with root package name */
    Button f33496e;
    @ViewById

    /* renamed from: f  reason: collision with root package name */
    Button f33497f;
    @ViewById

    /* renamed from: g  reason: collision with root package name */
    Button f33498g;
    @ViewById

    /* renamed from: h  reason: collision with root package name */
    Button f33499h;
    @ViewById

    /* renamed from: i  reason: collision with root package name */
    Button f33500i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    Button f33501j;
    @ViewById

    /* renamed from: k  reason: collision with root package name */
    Button f33502k;
    @ViewById

    /* renamed from: l  reason: collision with root package name */
    Button f33503l;
    @ViewById

    /* renamed from: m  reason: collision with root package name */
    Button f33504m;
    @ViewById

    /* renamed from: n  reason: collision with root package name */
    Button f33505n;
    @ViewById

    /* renamed from: o  reason: collision with root package name */
    Button f33506o;
    @ViewById

    /* renamed from: p  reason: collision with root package name */
    Button f33507p;
    @ViewById

    /* renamed from: q  reason: collision with root package name */
    Button f33508q;
    @ViewById

    /* renamed from: r  reason: collision with root package name */
    Button f33509r;
    @ViewById

    /* renamed from: s  reason: collision with root package name */
    Button f33510s;
    @ViewById

    /* renamed from: t  reason: collision with root package name */
    Button f33511t;
    @ViewById

    /* renamed from: u  reason: collision with root package name */
    Button f33512u;
    @ViewById

    /* renamed from: v  reason: collision with root package name */
    Button f33513v;
    @ViewById

    /* renamed from: w  reason: collision with root package name */
    Button f33514w;
    @ViewById

    /* renamed from: x  reason: collision with root package name */
    TextView f33515x;
    @ViewById

    /* renamed from: y  reason: collision with root package name */
    Button f33516y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f33517z;
    final String A = "街机游戏手柄设置";
    KeyMap.EmuMap B = KeyMap.EmuMap.FBA;
    com.join.mgps.joystick.map.d E = new com.join.mgps.joystick.map.d(this.B);
    HashMap<String, String> F = new HashMap<>();
    HashMap<String, String> G = new HashMap<>();
    HashMap<String, String> H = new HashMap<>();
    View I = null;

    private View A0(String str) {
        int i4 = 0;
        while (true) {
            View[] viewArr = this.C;
            if (viewArr == null || i4 >= viewArr.length) {
                break;
            }
            a aVar = (a) viewArr[i4].getTag();
            if (aVar != null && !TextUtils.isEmpty(aVar.f33519b) && aVar.f33519b.equals(str)) {
                return this.C[i4];
            }
            i4++;
        }
        return null;
    }

    private void C0() {
        com.join.mgps.joystick.map.d.f(this.B);
        for (Map.Entry entry : com.join.mgps.joystick.map.d.c(KeyMap.keySection).entrySet()) {
            this.F.put((String) entry.getValue(), (String) entry.getKey());
        }
        this.G.putAll(com.join.mgps.joystick.map.d.c(this.B.section));
        this.H.putAll(this.G);
    }

    private void initView() {
        this.C = new View[]{this.f33495d, this.f33496e, this.f33505n, this.f33503l, this.f33504m, this.f33497f, this.f33498g, this.f33499h, this.f33500i, this.f33501j, this.f33502k, this.f33506o, this.f33507p, this.f33508q, this.f33509r, this.f33510s, this.f33511t, this.f33512u, this.f33513v, this.f33514w};
        KeyCodes keyCodes = KeyCodes.KEY_A;
        int value = keyCodes.value();
        KeyCodes keyCodes2 = KeyCodes.KEY_B;
        KeyCodes keyCodes3 = KeyCodes.KEY_C;
        int value2 = keyCodes3.value();
        KeyCodes keyCodes4 = KeyCodes.KEY_D;
        a[] aVarArr = {new a(KeyCodes.KEY_SELECT), new a(KeyCodes.KEY_START), new a(value | keyCodes2.value() | keyCodes3.value()), new a(keyCodes.value() | keyCodes2.value()), new a(value2 | keyCodes4.value()), new a(keyCodes), new a(keyCodes2), new a(keyCodes3), new a(keyCodes4), new a(KeyCodes.KEY_E), new a(KeyCodes.KEY_F), new a(KeyCodes.KEY_1), new a(KeyCodes.KEY_2), new a(KeyCodes.KEY_3), new a(KeyCodes.KEY_4), new a(KeyCodes.KEY_SP0), new a(KeyCodes.KEY_SP1), new a(KeyCodes.KEY_SP2), new a(KeyCodes.KEY_SP3), new a(KeyCodes.KEY_SP4)};
        this.D = aVarArr;
        z0(this.C, aVarArr);
    }

    String B0(String str) {
        return TextUtils.isEmpty(str) ? "" : str.replace("KEY_", "").replace("BUTTON_", "");
    }

    boolean D0(int i4) {
        HashMap<String, String> hashMap = this.F;
        if (hashMap != null) {
            return hashMap.containsKey(i4 + "");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void E0() {
        if (this.f33517z) {
            this.f33517z = false;
            finish();
            return;
        }
        com.join.mgps.joystick.map.d.m(this, this.B, this.H);
        finish();
    }

    public boolean F0(int i4, KeyEvent keyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            if (D0(i4) && this.I != null) {
                HashMap<String, String> hashMap = this.F;
                x0(this.I, hashMap.get(i4 + ""));
                this.f33517z = false;
            }
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void G0() {
        this.H.clear();
        for (String str : this.G.keySet()) {
            this.G.put(str, "");
        }
        KeyMap.EmuMap emuMap = this.B;
        if (emuMap != null) {
            for (String str2 : emuMap.map.keySet()) {
                this.G.put(str2, this.B.map.get(str2));
            }
        }
        this.H.putAll(this.G);
        z0(this.C, this.D);
    }

    void H0(View view) {
        if (view == null) {
            return;
        }
        View view2 = this.I;
        if (view2 != null) {
            if (view2.getId() == view.getId()) {
                I0(this.I);
                return;
            }
            I0(this.I);
        }
        this.I = view;
        if (view instanceof Button) {
            view.setBackgroundResource(R.drawable.handshank_set_skey_selected);
            ((Button) view).setTextColor(getResources().getColor(R.color.handshank_key_set_selected_txt));
        }
    }

    void I0(View view) {
        if (view == null || view.getTag() == null) {
            return;
        }
        a aVar = (a) view.getTag();
        if (view instanceof Button) {
            if (aVar.a()) {
                view.setBackgroundResource(R.drawable.handshank_set_skey_pressed);
                Button button = (Button) view;
                button.setTextColor(getResources().getColor(R.color.handshank_key_set_pressed_txt));
                String B0 = B0(aVar.f33519b);
                if (TextUtils.isEmpty(B0)) {
                    B0 = "";
                }
                button.setText(B0);
            } else {
                view.setBackgroundResource(R.drawable.handshank_set_skey_normal);
                Button button2 = (Button) view;
                button2.setTextColor(getResources().getColor(R.color.handshank_key_set_normal_txt));
                button2.setText("待定");
            }
        }
        this.I = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterViews() {
        this.f33515x.setText("街机游戏手柄设置");
        C0();
        initView();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity
    public boolean n0(int i4, PadKeyEvent padKeyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(padKeyEvent.c())) {
            return false;
        }
        if (padKeyEvent.d() != 0) {
            F0(i4, p0(padKeyEvent));
        }
        return super.n0(i4, padKeyEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = (a) view.getTag();
        H0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void w0() {
        finish();
    }

    void x0(View view, String str) {
        if (view == null || view.getTag() == null) {
            return;
        }
        View A0 = A0(str);
        if (A0 != null) {
            y0(A0);
        }
        a aVar = (a) view.getTag();
        aVar.f33519b = str;
        this.H.put(aVar.f33518a, str);
        I0(view);
    }

    void y0(View view) {
        if (view == null || view.getTag() == null) {
            return;
        }
        a aVar = (a) view.getTag();
        aVar.f33519b = "";
        this.H.put(aVar.f33518a, "");
        I0(view);
    }

    void z0(View[] viewArr, a[] aVarArr) {
        for (int i4 = 0; viewArr != null && i4 < viewArr.length; i4++) {
            if (viewArr[i4] != null) {
                viewArr[i4].setOnClickListener(this);
                aVarArr[i4].b();
                viewArr[i4].setTag(aVarArr[i4]);
                I0(viewArr[i4]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        String f33518a;

        /* renamed from: b  reason: collision with root package name */
        String f33519b;

        public a(KeyCodes keyCodes) {
            String str = keyCodes.value() + "";
            this.f33518a = str;
            HashMap<String, String> hashMap = HandShankFBAActivity.this.H;
            if (hashMap != null) {
                this.f33519b = hashMap.get(str);
            }
        }

        public boolean a() {
            return !TextUtils.isEmpty(this.f33519b);
        }

        public void b() {
            HashMap<String, String> hashMap = HandShankFBAActivity.this.H;
            if (hashMap != null) {
                this.f33519b = hashMap.get(this.f33518a);
            }
        }

        public a(int i4) {
            String str = i4 + "";
            this.f33518a = str;
            HashMap<String, String> hashMap = HandShankFBAActivity.this.H;
            if (hashMap != null) {
                this.f33519b = hashMap.get(str);
            }
        }

        public a(String str, String str2) {
            this.f33518a = str;
            this.f33519b = str2;
        }
    }
}
