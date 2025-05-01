package com.join.mgps.activity;

import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.joystick.map.KeyMap;
import com.papa.controller.core.PadKeyEvent;
import com.papa.controller.core.PadMotionEvent;
import java.util.HashMap;
import java.util.Map;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Extra;
import org.androidannotations.annotations.ViewById;
@EActivity(R.layout.handshank_check_key)
/* loaded from: classes4.dex */
public class HandShankCheckKeyActivity extends HandShankBaseActivity {

    /* renamed from: d  reason: collision with root package name */
    private boolean f33472d;

    /* renamed from: e  reason: collision with root package name */
    private SoundPool f33473e;

    /* renamed from: f  reason: collision with root package name */
    private TransitionDrawable f33474f;
    @Extra

    /* renamed from: i  reason: collision with root package name */
    String f33477i;
    @ViewById

    /* renamed from: j  reason: collision with root package name */
    TextView f33478j;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<Integer, c> f33475g = new HashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private HashMap<String, Integer> f33476h = new HashMap<>();

    /* renamed from: k  reason: collision with root package name */
    Handler f33479k = new Handler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f33480b;

        a(c cVar) {
            this.f33480b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33480b != null) {
                HandShankCheckKeyActivity.this.K0();
                ImageView imageView = (ImageView) HandShankCheckKeyActivity.this.findViewById(this.f33480b.f33484a);
                imageView.setImageResource(this.f33480b.f33486c);
                imageView.invalidate();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f33482b;

        b(c cVar) {
            this.f33482b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = this.f33482b;
            if (cVar != null) {
                ImageView imageView = (ImageView) HandShankCheckKeyActivity.this.findViewById(cVar.f33484a);
                imageView.setImageResource(this.f33482b.f33485b);
                imageView.invalidate();
                HandShankCheckKeyActivity.this.f33472d = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        public int f33484a;

        /* renamed from: b  reason: collision with root package name */
        public int f33485b;

        /* renamed from: c  reason: collision with root package name */
        public int f33486c;

        public c(int i4, int i5, int i6) {
            this.f33484a = i4;
            this.f33485b = i5;
            this.f33486c = i6;
        }
    }

    private void D0() {
        this.f33476h.clear();
        Map c5 = com.join.mgps.joystick.map.d.c(KeyMap.keySection);
        for (String str : c5.keySet()) {
            this.f33476h.put(str, Integer.valueOf(Integer.parseInt((String) c5.get(str))));
        }
        if (this.f33476h.size() == 0) {
            this.f33476h.put(com.join.mgps.joystick.map.b.f53460d, 108);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53457c, 109);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53463e, 99);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53469g, 96);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53466f, 100);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53472h, 97);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53475i, 102);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53478j, 104);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53481k, 103);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53484l, 105);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53487m, 21);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53490n, 19);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53496p, 22);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53493o, 20);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53502r, 107);
            this.f33476h.put(com.join.mgps.joystick.map.b.f53499q, 106);
        }
        E0(this.f33476h);
    }

    private void E0(Map<String, Integer> map) {
        this.f33475g.clear();
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53466f), new c(R.id.f15621y, R.drawable.handshank_check_point_normal, R.drawable.handshank_check_point_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53469g), new c(R.id.f15589a, R.drawable.handshank_check_point_normal, R.drawable.handshank_check_point_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53463e), new c(R.id.f15620x, R.drawable.handshank_check_point_normal, R.drawable.handshank_check_point_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53472h), new c(R.id.f15591b, R.drawable.handshank_check_point_normal, R.drawable.handshank_check_point_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53475i), new c(R.id.handshank_check_lb, R.drawable.handshank_check_lb_normal, R.drawable.handshank_check_lb_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53478j), new c(R.id.handshank_check_ls, R.drawable.handshank_check_ls_normal, R.drawable.handshank_check_ls_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53481k), new c(R.id.handshank_check_rb, R.drawable.handshank_check_rb_normal, R.drawable.handshank_check_rb_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53484l), new c(R.id.handshank_check_rs, R.drawable.handshank_check_rs_normal, R.drawable.handshank_check_rs_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53499q), new c(R.id.handshank_check_stick_l, R.drawable.handshank_check_stick_normal, R.drawable.handshank_check_stick_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53502r), new c(R.id.handshank_check_stick_r, R.drawable.handshank_check_stick_normal, R.drawable.handshank_check_stick_pressed));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53487m), new c(R.id.handshank_check_cross, R.drawable.handshank_check_cross_bg, R.drawable.handshank_check_cross_left));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53490n), new c(R.id.handshank_check_cross, R.drawable.handshank_check_cross_bg, R.drawable.handshank_check_cross_top));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53496p), new c(R.id.handshank_check_cross, R.drawable.handshank_check_cross_bg, R.drawable.handshank_check_cross_right));
        this.f33475g.put(map.get(com.join.mgps.joystick.map.b.f53493o), new c(R.id.handshank_check_cross, R.drawable.handshank_check_cross_bg, R.drawable.handshank_check_cross_down));
    }

    private void F0() {
        findViewById(R.id.handshank_check_layout).requestFocus();
        this.f33478j.setText("校验手柄按键");
    }

    private void G0() {
        SoundPool soundPool = new SoundPool(21, 3, 10);
        this.f33473e = soundPool;
        soundPool.load(this, R.raw.jiejitoubi, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        this.f33473e.play(1, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    private void y0(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AudioManager audioManager = (AudioManager) getSystemService("audio");
        if (keyCode == 24) {
            audioManager.adjustStreamVolume(3, 1, 5);
        } else if (keyCode != 25) {
        } else {
            audioManager.adjustStreamVolume(3, -1, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void A0() {
        Intent intent = new Intent(this, HandShankSetKeyActivity_.class);
        if (!TextUtils.isEmpty(this.f33477i)) {
            intent.putExtra("from", this.f33477i);
            startActivity(intent);
            finish();
            return;
        }
        startActivity(intent);
    }

    void B0(c cVar) {
        this.f33479k.post(new a(cVar));
    }

    void C0(c cVar) {
        this.f33479k.post(new b(cVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void H0() {
        Intent intent = new Intent(this, HandShankYesActivity_.class);
        intent.setFlags(603979776);
        startActivity(intent);
        finish();
    }

    public boolean I0(int i4, KeyEvent keyEvent) {
        try {
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        y0(keyEvent);
        if (i4 != 4) {
            if (!this.f33472d) {
                this.f33472d = true;
                B0(this.f33475g.get(Integer.valueOf(i4)));
            }
            return true;
        }
        return super.onKeyDown(i4, keyEvent);
    }

    public boolean J0(int i4, KeyEvent keyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(keyEvent.getDevice().getName())) {
            return false;
        }
        if (i4 != 4) {
            C0(this.f33475g.get(Integer.valueOf(i4)));
            return true;
        }
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @AfterViews
    public void afterView() {
        G0();
        F0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity
    public boolean n0(int i4, PadKeyEvent padKeyEvent) {
        if (com.join.mgps.joystick.map.a.b().f(padKeyEvent.c())) {
            return false;
        }
        if (padKeyEvent.d() == 0) {
            I0(i4, p0(padKeyEvent));
        } else {
            J0(i4, p0(padKeyEvent));
        }
        return super.n0(i4, padKeyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity
    public boolean o0(PadMotionEvent padMotionEvent) {
        return super.o0(padMotionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.join.mgps.activity.HandShankBaseActivity, com.BaseActivity, com.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        D0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Click
    public void z0() {
        if (TextUtils.isEmpty(this.f33477i)) {
            finish();
        } else if (this.f33477i.equals("first")) {
            Intent intent = new Intent(this, HandShankYesActivity_.class);
            intent.setFlags(603979776);
            startActivity(intent);
            finish();
        }
    }
}
