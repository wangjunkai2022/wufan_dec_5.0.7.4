package com.beizi.fusion.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Pair;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.update.ShakeArcView;
import com.beizi.fusion.widget.ShakeView;
import com.umeng.analytics.pro.bm;
import java.math.BigDecimal;
/* compiled from: ShakeUtil.java */
/* loaded from: classes2.dex */
public class ar {

    /* renamed from: b  reason: collision with root package name */
    private static SensorManager f6920b;

    /* renamed from: a  reason: collision with root package name */
    ShakeView f6921a;

    /* renamed from: c  reason: collision with root package name */
    private Context f6922c;

    /* renamed from: d  reason: collision with root package name */
    private double f6923d;

    /* renamed from: e  reason: collision with root package name */
    private double f6924e;

    /* renamed from: f  reason: collision with root package name */
    private double f6925f;

    /* renamed from: g  reason: collision with root package name */
    private int f6926g;

    /* renamed from: h  reason: collision with root package name */
    private int f6927h;

    /* renamed from: i  reason: collision with root package name */
    private int f6928i;

    /* renamed from: j  reason: collision with root package name */
    private int f6929j;

    /* renamed from: k  reason: collision with root package name */
    private int f6930k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f6931l = 0;

    /* renamed from: m  reason: collision with root package name */
    private float f6932m = -100.0f;

    /* renamed from: n  reason: collision with root package name */
    private float f6933n = -100.0f;

    /* renamed from: o  reason: collision with root package name */
    private float f6934o = -100.0f;

    /* renamed from: p  reason: collision with root package name */
    private int f6935p = 0;

    /* renamed from: q  reason: collision with root package name */
    private a f6936q = null;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6937r = false;

    /* renamed from: s  reason: collision with root package name */
    private int f6938s = 200;

    /* renamed from: t  reason: collision with root package name */
    private long f6939t = 0;

    /* renamed from: u  reason: collision with root package name */
    private ShakeArcView f6940u = null;

    /* renamed from: v  reason: collision with root package name */
    private int f6941v = 0;

    /* renamed from: w  reason: collision with root package name */
    private final SensorEventListener f6942w = new SensorEventListener() { // from class: com.beizi.fusion.g.ar.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (System.currentTimeMillis() - ar.this.f6939t < 200) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = fArr[2];
            if (ar.this.f6932m == -100.0f) {
                ar.this.f6932m = f5;
            }
            if (ar.this.f6933n == -100.0f) {
                ar.this.f6933n = f6;
            }
            if (ar.this.f6934o == -100.0f) {
                ar.this.f6934o = f7;
            }
            af.b("ShakeUtil", "x = " + f5 + ",initialX = " + ar.this.f6932m + ",y = " + f6 + ",initialY = " + ar.this.f6933n + ",z = " + f7 + ",initialZ = " + ar.this.f6934o);
            double abs = (double) Math.abs(f5 - ar.this.f6932m);
            Double.isNaN(abs);
            double d5 = abs / 9.8d;
            double abs2 = (double) Math.abs(f6 - ar.this.f6933n);
            Double.isNaN(abs2);
            double d6 = abs2 / 9.8d;
            double abs3 = (double) Math.abs(f7 - ar.this.f6934o);
            Double.isNaN(abs3);
            double d7 = abs3 / 9.8d;
            af.b("ShakeUtil", "rotateX = " + d5 + ",rotateY = " + d6 + ",rotateZ = " + d7 + ",rotateAmplitude = " + ar.this.f6925f);
            if (d5 > ar.this.f6925f) {
                ar.f(ar.this);
                ar.this.f6932m = f5;
            }
            if (d6 > ar.this.f6925f) {
                ar.f(ar.this);
                ar.this.f6933n = f6;
            }
            if (d7 > ar.this.f6925f) {
                ar.f(ar.this);
                ar.this.f6934o = f7;
            }
            ar arVar = ar.this;
            double a5 = arVar.a(f5, f6, f7, arVar.f6923d);
            if (a5 > ar.this.f6923d) {
                ar.this.f6935p = 1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("startSatisfy:");
            sb.append(a5);
            sb.append(";mShakeState = ");
            sb.append(ar.this.f6935p);
            sb.append(",isShakeStart = ");
            ar arVar2 = ar.this;
            sb.append(arVar2.a(f5, f6, f7, arVar2.f6923d));
            sb.append(",isShakeEnd = ");
            ar arVar3 = ar.this;
            sb.append(arVar3.b(f5, f6, f7, arVar3.f6924e));
            af.b("ShakeUtil", sb.toString());
            if (ar.this.f6935p == 1) {
                ar arVar4 = ar.this;
                if (arVar4.b(f5, f6, f7, arVar4.f6924e)) {
                    ar.this.f6935p = 2;
                    ar.j(ar.this);
                }
            }
            ar.this.a(d5, d6, d7, a5);
            af.b("ShakeUtil", "mShakeCount = " + ar.this.f6930k + ",dstShakeCount = " + ar.this.f6926g + ",mRotateCount = " + ar.this.f6931l + ",dstRotateCount = " + ar.this.f6927h);
            if ((ar.this.f6926g <= 0 || ar.this.f6930k < ar.this.f6926g) && (ar.this.f6927h <= 0 || ar.this.f6931l < ar.this.f6927h)) {
                return;
            }
            ar.this.a();
        }
    };

    /* compiled from: ShakeUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b();
    }

    public ar(Context context) {
        this.f6922c = context;
        f6920b = (SensorManager) context.getApplicationContext().getSystemService(bm.ac);
    }

    static /* synthetic */ int f(ar arVar) {
        int i4 = arVar.f6931l;
        arVar.f6931l = i4 + 1;
        return i4;
    }

    static /* synthetic */ int j(ar arVar) {
        int i4 = arVar.f6930k;
        arVar.f6930k = i4 + 1;
        return i4;
    }

    private void e() {
        int i4;
        ShakeArcView shakeArcView = this.f6940u;
        if (shakeArcView == null || (i4 = this.f6941v) == 0) {
            return;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                shakeArcView.setMaxProgress(this.f6926g);
                return;
            }
            return;
        }
        if (this.f6927h > 0) {
            double d5 = this.f6925f;
            if (d5 > 0.0d) {
                shakeArcView.setMaxProgress(d5);
                return;
            }
        }
        shakeArcView.setMaxProgress(this.f6923d);
    }

    private void f() {
        Pair<Integer, Boolean> f5 = f(this.f6929j);
        if (((Boolean) f5.second).booleanValue()) {
            aa.a(new Runnable() { // from class: com.beizi.fusion.g.ar.2
                @Override // java.lang.Runnable
                public void run() {
                    ar.this.a();
                }
            }, this.f6928i + (((Integer) f5.first).intValue() * 10));
        }
    }

    public void d(int i4) {
        this.f6929j = i4;
        if (i4 > 0) {
            f();
        }
    }

    public void g(int i4) {
        this.f6938s = i4;
    }

    public void c(double d5) {
        this.f6925f = d5;
    }

    public void b(double d5) {
        this.f6924e = d5;
    }

    public void c(int i4) {
        this.f6928i = i4;
    }

    protected void d() {
        this.f6937r = false;
        this.f6930k = 0;
        this.f6931l = 0;
        this.f6932m = -100.0f;
        this.f6933n = -100.0f;
        this.f6934o = -100.0f;
        this.f6935p = 0;
        this.f6936q = null;
        this.f6922c = null;
        this.f6921a = null;
        this.f6938s = 200;
        this.f6940u = null;
    }

    public void b(int i4) {
        this.f6926g = i4;
    }

    public void c() {
        af.a("BeiZis", "enter unRegisterShakeListenerAndSetDefault");
        SensorManager sensorManager = f6920b;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f6942w);
        }
        d();
        ShakeView shakeView = this.f6921a;
        if (shakeView != null) {
            shakeView.stopShake();
        }
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

    public void a(AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean) {
        if (shakeViewBean == null) {
            return;
        }
        af.c("ShakeUtil", "setShakeParams mShakeCount:" + shakeViewBean.getShakeCount() + ";mRotateCount:" + shakeViewBean.getRotatCount());
        try {
            this.f6932m = -100.0f;
            this.f6933n = -100.0f;
            this.f6934o = -100.0f;
            this.f6930k = 0;
            this.f6931l = 0;
            this.f6935p = 0;
            b(shakeViewBean.getShakeCount());
            a(shakeViewBean.getShakeStartAmplitude());
            b(shakeViewBean.getShakeEndAmplitude());
            c(shakeViewBean.getRotatAmplitude());
            e(shakeViewBean.getRotatCount());
            c(shakeViewBean.getRandomClickTime());
            d(shakeViewBean.getRandomClickNum());
            g(shakeViewBean.getAnimationInterval());
            e();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public static Pair<Integer, Boolean> f(int i4) {
        int random = (int) ((Math.random() * 100.0d) + 1.0d);
        if (random <= i4) {
            return new Pair<>(Integer.valueOf(random), Boolean.TRUE);
        }
        return new Pair<>(Integer.valueOf(random), Boolean.FALSE);
    }

    public void b() {
        SensorManager sensorManager = f6920b;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f6942w, sensorManager.getDefaultSensor(1), 100000);
        }
    }

    public void e(int i4) {
        this.f6927h = i4;
    }

    public void a(AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean) {
        if (coolShakeViewBean == null) {
            return;
        }
        af.c("ShakeUtil", "setShakeCoolParams mShakeCount:" + coolShakeViewBean.getShakeCount() + ";mRotateCount:" + coolShakeViewBean.getRotatCount());
        try {
            b(coolShakeViewBean.getShakeCount());
            a(coolShakeViewBean.getShakeStartAmplitude());
            b(coolShakeViewBean.getShakeEndAmplitude());
            c(coolShakeViewBean.getRotatAmplitude());
            e(coolShakeViewBean.getRotatCount());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeViewBean) {
        if (aliaseShakeViewBean == null) {
            return;
        }
        af.c("ShakeUtil", "setShakeAliaseParams mShakeCount:" + aliaseShakeViewBean.getShakeCount() + ";mRotateCount:" + aliaseShakeViewBean.getRotatCount());
        try {
            b(aliaseShakeViewBean.getShakeCount());
            a(aliaseShakeViewBean.getShakeStartAmplitude());
            b(aliaseShakeViewBean.getShakeEndAmplitude());
            c(aliaseShakeViewBean.getRotatAmplitude());
            e(aliaseShakeViewBean.getRotatCount());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(ShakeArcView shakeArcView, int i4) {
        af.c("ShakeUtil", "setShakeFeedback feedback:" + i4);
        a(shakeArcView);
        a(i4);
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(double d5, double d6, double d7, double d8) {
        ShakeArcView shakeArcView = this.f6940u;
        if (shakeArcView == null) {
            return;
        }
        if (this.f6941v == 2) {
            shakeArcView.setCurrentProgress(this.f6930k);
        } else if (this.f6927h > 0 && this.f6925f > 0.0d) {
            double doubleValue = new BigDecimal((d5 < d6 || d5 < d7) ? (d6 < d5 || d6 < d7) ? (d7 < d5 || d7 < d6) ? 0.0d : d7 : d6 : d5).setScale(2, 4).doubleValue();
            if (doubleValue >= 0.1d) {
                this.f6940u.setCurrentProgress(doubleValue);
            } else if (doubleValue < 0.1d) {
                this.f6940u.setCurrentProgress(0.0d);
            }
        } else {
            int i4 = this.f6926g;
            if (i4 > 0 && this.f6930k >= i4) {
                shakeArcView.setCurrentProgress(this.f6923d);
                return;
            }
            double doubleValue2 = new BigDecimal(d8).setScale(2, 4).doubleValue();
            if (doubleValue2 >= 1.1d) {
                this.f6940u.setCurrentProgress(doubleValue2);
            } else if (doubleValue2 < 1.1d) {
                this.f6940u.setCurrentProgress(0.0d);
            }
        }
    }

    public void a(int i4) {
        this.f6941v = i4;
    }

    public void a(double d5) {
        this.f6923d = d5;
    }

    public void a(a aVar) {
        this.f6936q = aVar;
    }

    public void a(ShakeArcView shakeArcView) {
        this.f6940u = shakeArcView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double a(float f5, float f6, float f7, double d5) {
        double d6 = f5;
        Double.isNaN(d6);
        double pow = Math.pow(d6 / 9.8d, 2.0d);
        double d7 = f6;
        Double.isNaN(d7);
        double pow2 = pow + Math.pow(d7 / 9.8d, 2.0d);
        double d8 = f7;
        Double.isNaN(d8);
        return Math.sqrt(pow2 + Math.pow(d8 / 9.8d, 2.0d));
    }

    protected void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter callBackShakeHappened and mShakeStateListener != null ? ");
        sb.append(this.f6936q != null);
        sb.append(",!isCallBack = ");
        sb.append(!this.f6937r);
        af.a("BeiZis", sb.toString());
        if (this.f6936q == null || this.f6937r) {
            return;
        }
        af.a("BeiZis", "callback onShakeHappened()");
        ShakeArcView shakeArcView = this.f6940u;
        if (shakeArcView != null && !ax.b(shakeArcView)) {
            af.b("ShakeUtil", "mShakeCount onShakeHappened mShakeArcView is not show");
            this.f6932m = -100.0f;
            this.f6933n = -100.0f;
            this.f6934o = -100.0f;
            this.f6930k = 0;
            this.f6931l = 0;
            this.f6935p = 0;
            return;
        }
        this.f6936q.b();
        this.f6937r = true;
        ShakeView shakeView = this.f6921a;
        if (shakeView != null) {
            shakeView.stopShake();
            c();
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.ar.a(int, int, com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean):android.view.View");
    }
}
