package com.beizi.fusion.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.view.View;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.ShakeView;
import com.umeng.analytics.pro.bm;
/* compiled from: NativeShakeUtil.java */
/* loaded from: classes2.dex */
public class ag {

    /* renamed from: b  reason: collision with root package name */
    private static SensorManager f6839b;

    /* renamed from: a  reason: collision with root package name */
    ShakeView f6840a;

    /* renamed from: c  reason: collision with root package name */
    private Context f6841c;

    /* renamed from: d  reason: collision with root package name */
    private double f6842d;

    /* renamed from: e  reason: collision with root package name */
    private double f6843e;

    /* renamed from: f  reason: collision with root package name */
    private double f6844f;

    /* renamed from: g  reason: collision with root package name */
    private int f6845g;

    /* renamed from: h  reason: collision with root package name */
    private int f6846h;

    /* renamed from: t  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.CoolShakeViewBean f6858t;

    /* renamed from: u  reason: collision with root package name */
    private String f6859u;

    /* renamed from: i  reason: collision with root package name */
    private int f6847i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f6848j = 0;

    /* renamed from: k  reason: collision with root package name */
    private float f6849k = -100.0f;

    /* renamed from: l  reason: collision with root package name */
    private float f6850l = -100.0f;

    /* renamed from: m  reason: collision with root package name */
    private float f6851m = -100.0f;

    /* renamed from: n  reason: collision with root package name */
    private int f6852n = 0;

    /* renamed from: o  reason: collision with root package name */
    private a f6853o = null;

    /* renamed from: p  reason: collision with root package name */
    private boolean f6854p = false;

    /* renamed from: q  reason: collision with root package name */
    private int f6855q = 200;

    /* renamed from: r  reason: collision with root package name */
    private View f6856r = null;

    /* renamed from: s  reason: collision with root package name */
    private long f6857s = 0;

    /* renamed from: v  reason: collision with root package name */
    private boolean f6860v = false;

    /* renamed from: w  reason: collision with root package name */
    private final SensorEventListener f6861w = new SensorEventListener() { // from class: com.beizi.fusion.g.ag.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (System.currentTimeMillis() - ag.this.f6857s < 200) {
                return;
            }
            if (ax.a(ag.this.f6856r)) {
                if (ag.this.f6860v && ag.this.f6858t != null && !TextUtils.isEmpty(ag.this.f6859u) && aq.a().b(ag.this.f6859u) > 0) {
                    af.c("ShakeUtil", "mShakeCount isUserSensitiveScheme:" + ag.this.f6860v + ";coolShakeViewBean:" + ag.this.f6858t + ";coolConfigKey:" + ag.this.f6859u + ";getCoolTime:" + aq.a().b(ag.this.f6859u));
                    ag agVar = ag.this;
                    agVar.a(agVar.f6858t);
                }
                float[] fArr = sensorEvent.values;
                float f5 = fArr[0];
                float f6 = fArr[1];
                float f7 = fArr[2];
                if (ag.this.f6849k == -100.0f) {
                    ag.this.f6849k = f5;
                }
                if (ag.this.f6850l == -100.0f) {
                    ag.this.f6850l = f6;
                }
                if (ag.this.f6851m == -100.0f) {
                    ag.this.f6851m = f7;
                }
                af.b("ShakeUtil", "x = " + f5 + ",initialX = " + ag.this.f6849k + ",y = " + f6 + ",initialY = " + ag.this.f6850l + ",z = " + f7 + ",initialZ = " + ag.this.f6851m);
                double abs = (double) Math.abs(f5 - ag.this.f6849k);
                Double.isNaN(abs);
                double d5 = abs / 9.8d;
                double abs2 = (double) Math.abs(f6 - ag.this.f6850l);
                Double.isNaN(abs2);
                double d6 = abs2 / 9.8d;
                double abs3 = (double) Math.abs(f7 - ag.this.f6851m);
                Double.isNaN(abs3);
                double d7 = abs3 / 9.8d;
                af.b("ShakeUtil", "rotateX = " + d5 + ",rotateY = " + d6 + ",rotateZ = " + d7 + ",rotateAmplitude = " + ag.this.f6844f);
                if (d5 > ag.this.f6844f) {
                    ag.j(ag.this);
                    ag.this.f6849k = f5;
                }
                if (d6 > ag.this.f6844f) {
                    ag.j(ag.this);
                    ag.this.f6850l = f6;
                }
                if (d7 > ag.this.f6844f) {
                    ag.j(ag.this);
                    ag.this.f6851m = f7;
                }
                ag agVar2 = ag.this;
                if (agVar2.a(f5, f6, f7, agVar2.f6842d)) {
                    ag.this.f6852n = 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("mRotateCount:");
                sb.append(ag.this.f6848j);
                sb.append(";mShakeCount:");
                sb.append(ag.this.f6847i);
                sb.append(",mShakeState = ");
                sb.append(ag.this.f6852n);
                sb.append(",isShakeStart = ");
                ag agVar3 = ag.this;
                sb.append(agVar3.a(f5, f6, f7, agVar3.f6842d));
                sb.append(",isShakeEnd = ");
                ag agVar4 = ag.this;
                sb.append(agVar4.b(f5, f6, f7, agVar4.f6843e));
                af.b("ShakeUtil", sb.toString());
                if (ag.this.f6852n == 1) {
                    ag agVar5 = ag.this;
                    if (agVar5.b(f5, f6, f7, agVar5.f6843e)) {
                        ag.this.f6852n = 2;
                        ag.p(ag.this);
                    }
                }
                af.b("ShakeUtil", "mShakeCount = " + ag.this.f6847i + ",dstShakeCount = " + ag.this.f6845g + ",mRotateCount = " + ag.this.f6848j + ",dstRotateCount = " + ag.this.f6846h);
                if ((ag.this.f6845g > 0 && ag.this.f6847i >= ag.this.f6845g) || (ag.this.f6846h > 0 && ag.this.f6848j >= ag.this.f6846h)) {
                    ag.this.a();
                }
                ag.this.f6857s = System.currentTimeMillis();
                return;
            }
            af.b("ShakeUtil", "onShakeHappened mContainerView is not show");
            ag.this.d();
        }
    };

    /* compiled from: NativeShakeUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public ag(Context context) {
        this.f6841c = context;
        f6839b = (SensorManager) context.getApplicationContext().getSystemService(bm.ac);
    }

    static /* synthetic */ int j(ag agVar) {
        int i4 = agVar.f6848j;
        agVar.f6848j = i4 + 1;
        return i4;
    }

    static /* synthetic */ int p(ag agVar) {
        int i4 = agVar.f6847i;
        agVar.f6847i = i4 + 1;
        return i4;
    }

    public void d() {
        this.f6849k = -100.0f;
        this.f6850l = -100.0f;
        this.f6851m = -100.0f;
        this.f6852n = 0;
        this.f6855q = 200;
        this.f6847i = 0;
        this.f6848j = 0;
        this.f6854p = false;
    }

    public void c(double d5) {
        this.f6844f = d5;
    }

    public void b(double d5) {
        this.f6843e = d5;
    }

    public void c() {
        af.a("BeiZis", "enter unRegisterShakeListenerAndSetDefault");
        SensorManager sensorManager = f6839b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f6861w);
        }
        d();
        ShakeView shakeView = this.f6840a;
        if (shakeView != null) {
            shakeView.stopShake();
        }
        this.f6853o = null;
        this.f6841c = null;
        this.f6840a = null;
    }

    public void b(int i4) {
        this.f6846h = i4;
    }

    public void a(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        if (shakeViewBean == null) {
            return;
        }
        af.a("BeiZis", "setShakeParams shakeCount:" + shakeViewBean.getShakeCount() + ";rotatCount:" + shakeViewBean.getRotatCount());
        try {
            this.f6860v = true;
            a(shakeViewBean.getShakeCount());
            a(shakeViewBean.getShakeStartAmplitude());
            b(shakeViewBean.getShakeEndAmplitude());
            c(shakeViewBean.getRotatAmplitude());
            b(shakeViewBean.getRotatCount());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b(AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean) {
        this.f6858t = coolShakeViewBean;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(float f5, float f6, float f7, double d5) {
        double d6 = f5;
        Double.isNaN(d6);
        double pow = Math.pow(d6 / 9.8d, 2.0d);
        double d7 = f6;
        Double.isNaN(d7);
        double pow2 = pow + Math.pow(d7 / 9.8d, 2.0d);
        double d8 = f7;
        Double.isNaN(d8);
        return Math.sqrt(pow2 + Math.pow(d8 / 9.8d, 2.0d)) < d5;
    }

    public void b() {
        SensorManager sensorManager = f6839b;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f6861w, sensorManager.getDefaultSensor(1), 100000);
        }
    }

    public void a(AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean) {
        if (coolShakeViewBean == null) {
            return;
        }
        af.c("ShakeUtil", "setShakeCoolParams mShakeCount:" + coolShakeViewBean.getShakeCount() + ";mRotateCount:" + coolShakeViewBean.getRotatCount());
        try {
            this.f6860v = false;
            a(coolShakeViewBean.getShakeCount());
            a(coolShakeViewBean.getShakeStartAmplitude());
            b(coolShakeViewBean.getShakeEndAmplitude());
            c(coolShakeViewBean.getRotatAmplitude());
            b(coolShakeViewBean.getRotatCount());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean, String str) {
        b(coolShakeViewBean);
        a(str);
    }

    public void a(double d5) {
        this.f6842d = d5;
    }

    public void a(int i4) {
        this.f6845g = i4;
    }

    public void a(a aVar) {
        this.f6853o = aVar;
    }

    public void a(String str) {
        this.f6859u = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(float f5, float f6, float f7, double d5) {
        double d6 = f5;
        Double.isNaN(d6);
        double pow = Math.pow(d6 / 9.8d, 2.0d);
        double d7 = f6;
        Double.isNaN(d7);
        double pow2 = pow + Math.pow(d7 / 9.8d, 2.0d);
        double d8 = f7;
        Double.isNaN(d8);
        return Math.sqrt(pow2 + Math.pow(d8 / 9.8d, 2.0d)) > d5;
    }

    protected void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter callBackShakeHappened and mShakeStateListener != null ? ");
        sb.append(this.f6853o != null);
        sb.append(",!isCallBack = ");
        sb.append(!this.f6854p);
        af.a("BeiZis", sb.toString());
        if (this.f6853o == null || this.f6854p) {
            return;
        }
        af.a("BeiZis", "callback onShakeHappened()");
        this.f6854p = true;
        this.f6853o.a();
    }

    public void a(View view) {
        this.f6856r = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
        if (r3 >= 400) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0167  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a(int r10, int r11, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r12) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ag.a(int, int, com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r3 >= 400) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View a(int r10, int r11, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ag.a(int, int, com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean, java.lang.String):android.view.View");
    }
}
