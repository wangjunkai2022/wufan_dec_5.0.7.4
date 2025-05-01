package com.beizi.fusion.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.TwistView;
import com.umeng.analytics.pro.bm;
/* compiled from: RollUtil.java */
/* loaded from: classes2.dex */
public class an {

    /* renamed from: a  reason: collision with root package name */
    private static final String f6876a = "an";

    /* renamed from: c  reason: collision with root package name */
    private static SensorManager f6877c;

    /* renamed from: n  reason: collision with root package name */
    private static String f6878n;

    /* renamed from: o  reason: collision with root package name */
    private static String f6879o;

    /* renamed from: p  reason: collision with root package name */
    private static String f6880p;

    /* renamed from: q  reason: collision with root package name */
    private static String f6881q;

    /* renamed from: b  reason: collision with root package name */
    private Context f6882b;

    /* renamed from: j  reason: collision with root package name */
    private long f6889j;

    /* renamed from: k  reason: collision with root package name */
    private double f6890k;

    /* renamed from: l  reason: collision with root package name */
    private double f6891l;

    /* renamed from: m  reason: collision with root package name */
    private TwistView f6892m;

    /* renamed from: d  reason: collision with root package name */
    private long f6883d = 0;

    /* renamed from: e  reason: collision with root package name */
    private double f6884e = -999.0d;

    /* renamed from: f  reason: collision with root package name */
    private double f6885f = -999.0d;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6886g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6887h = false;

    /* renamed from: i  reason: collision with root package name */
    private int f6888i = 0;

    /* renamed from: r  reason: collision with root package name */
    private boolean f6893r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f6894s = false;

    /* renamed from: t  reason: collision with root package name */
    private a f6895t = null;

    /* renamed from: u  reason: collision with root package name */
    private final SensorEventListener f6896u = new SensorEventListener() { // from class: com.beizi.fusion.g.an.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                if (System.currentTimeMillis() - an.this.f6883d < 80) {
                    return;
                }
                an.this.f6883d = System.currentTimeMillis();
                float[] fArr = sensorEvent.values;
                double d5 = fArr[0];
                Double.isNaN(d5);
                double d6 = d5 / 9.8d;
                double d7 = fArr[1];
                Double.isNaN(d7);
                double d8 = d7 / 9.8d;
                double d9 = fArr[2];
                Double.isNaN(d9);
                double d10 = d9 / 9.8d;
                double degrees = Math.toDegrees(Math.atan2(d6, d8));
                double d11 = degrees <= 0.0d ? (-degrees) - 180.0d : 180.0d - degrees;
                double degrees2 = Math.toDegrees(Math.atan2(d6, d10));
                double d12 = degrees2 <= 0.0d ? (-degrees2) - 180.0d : 180.0d - degrees2;
                double degrees3 = Math.toDegrees(Math.atan2(d10, Math.sqrt((d6 * d6) + (d8 * d8)))) + 90.0d;
                if (degrees3 > 45.0d && degrees3 < 135.0d && (Math.abs((Math.sin(d8) / 3.141592653589793d) * 180.0d) >= 45.0d || !an.this.f6886g)) {
                    if (an.this.f6885f != -999.0d && an.this.f6887h) {
                        if ((d11 < an.this.f6885f || d11 - an.this.f6885f <= an.this.f6890k || d11 - an.this.f6885f > 180.0d) && (d11 >= an.this.f6885f || an.this.f6885f <= 0.0d || (360.0d - an.this.f6885f) + d11 <= an.this.f6890k || (360.0d - an.this.f6885f) + d11 > 180.0d)) {
                            if (d11 < an.this.f6885f || ((d11 - an.this.f6885f >= an.this.f6891l || Math.abs(d11 - an.this.f6885f) > 180.0d) && (Math.abs(d11 - an.this.f6885f) < 180.0d || (-(360.0d - Math.abs(d11 - an.this.f6885f))) >= an.this.f6891l))) {
                                if (d11 >= an.this.f6885f) {
                                    return;
                                }
                                if ((d11 - an.this.f6885f >= an.this.f6891l || Math.abs(d11 - an.this.f6885f) > 180.0d) && (Math.abs(d11 - an.this.f6885f) < 180.0d || 360.0d - Math.abs(d11 - an.this.f6885f) >= an.this.f6891l)) {
                                    return;
                                }
                            }
                            if (an.this.f6888i == 1) {
                                an.this.f6888i = 2;
                                af.a(an.f6876a, "发生垂直状态回滚");
                                an.this.i();
                                return;
                            }
                            return;
                        }
                        af.c(an.f6876a, "11111发生垂直状态滚动 rollStatus:" + an.this.f6888i);
                        an.this.f6888i = 1;
                        an.this.i();
                        return;
                    }
                    an.this.f6885f = d11;
                    an.this.f6887h = true;
                    an.this.f6886g = false;
                    return;
                }
                if (an.this.f6884e != -999.0d && an.this.f6886g) {
                    if ((d12 < an.this.f6884e || d12 - an.this.f6884e <= an.this.f6890k || d12 - an.this.f6884e > 180.0d) && (d12 >= an.this.f6884e || an.this.f6884e <= 0.0d || (360.0d - an.this.f6884e) + d12 <= an.this.f6890k || (360.0d - an.this.f6884e) + d12 > 180.0d)) {
                        if (d12 < an.this.f6884e || ((d12 - an.this.f6884e >= an.this.f6891l || Math.abs(d12 - an.this.f6884e) > 180.0d) && (Math.abs(d12 - an.this.f6884e) < 180.0d || (-(360.0d - Math.abs(d12 - an.this.f6884e))) >= an.this.f6891l))) {
                            if (d12 >= an.this.f6884e) {
                                return;
                            }
                            if ((d12 - an.this.f6884e >= an.this.f6891l || Math.abs(d12 - an.this.f6884e) > 180.0d) && (Math.abs(d12 - an.this.f6884e) < 180.0d || 360.0d - Math.abs(d12 - an.this.f6884e) >= an.this.f6891l)) {
                                return;
                            }
                        }
                        af.a(an.f6876a, "2222发生水平状态回滚 rollStatus:" + an.this.f6888i);
                        if (an.this.f6888i == 1) {
                            an.this.f6888i = 2;
                            af.a(an.f6876a, "发生水平状态回滚");
                            an.this.i();
                            return;
                        }
                        return;
                    }
                    af.c(an.f6876a, "11111发生水平状态滚动 rollStatus:" + an.this.f6888i);
                    an.this.f6888i = 1;
                    an.this.i();
                    return;
                }
                an.this.f6884e = d12;
                an.this.f6886g = true;
                an.this.f6887h = false;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    };

    /* compiled from: RollUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public an(Context context) {
        this.f6882b = context;
        f6877c = (SensorManager) context.getApplicationContext().getSystemService(bm.ac);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        TwistView twistView = this.f6892m;
        if (twistView != null) {
            twistView.updateRollStatus(this.f6888i);
        }
    }

    public void c() {
        this.f6894s = false;
    }

    public void b() {
        SensorManager sensorManager = f6877c;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this.f6896u);
        }
        TwistView twistView = this.f6892m;
        if (twistView != null) {
            twistView.destroyView();
            this.f6892m = null;
        }
        this.f6894s = false;
        this.f6893r = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (r4 >= 400) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ViewGroup r11, int r12, int r13, com.beizi.fusion.model.AdSpacesBean.BuyerBean.RollViewBean r14) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.an.a(android.view.ViewGroup, int, int, com.beizi.fusion.model.AdSpacesBean$BuyerBean$RollViewBean):void");
    }

    public void b(double d5) {
        this.f6891l = d5;
    }

    public void a() {
        SensorManager sensorManager = f6877c;
        if (sensorManager != null) {
            sensorManager.registerListener(this.f6896u, sensorManager.getDefaultSensor(1), 100000);
        }
    }

    public void a(AdSpacesBean.BuyerBean.RollViewBean rollViewBean) {
        if (rollViewBean == null) {
            return;
        }
        try {
            String str = f6876a;
            af.a(str, "setRollParams getRollTime:" + rollViewBean.getRollTime() + ";getRollPlusAmplitude:" + rollViewBean.getRollPlusAmplitude() + ";getRollMinusAmplitude:" + rollViewBean.getRollMinusAmplitude());
            a(rollViewBean.getRollTime());
            a(rollViewBean.getRollPlusAmplitude());
            b(rollViewBean.getRollMinusAmplitude());
            TwistView twistView = this.f6892m;
            if (twistView != null) {
                twistView.setDurationAnimation(rollViewBean.getRollTime());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(AdSpacesBean.BuyerBean.CoolRollViewBean coolRollViewBean) {
        if (coolRollViewBean == null) {
            return;
        }
        try {
            String str = f6876a;
            af.a(str, "setRollCoolParams getRollTime:" + coolRollViewBean.getRollTime() + ";getRollPlusAmplitude:" + coolRollViewBean.getRollPlusAmplitude() + ";getRollMinusAmplitude:" + coolRollViewBean.getRollMinusAmplitude());
            a(coolRollViewBean.getRollTime());
            a(coolRollViewBean.getRollPlusAmplitude());
            b(coolRollViewBean.getRollMinusAmplitude());
            TwistView twistView = this.f6892m;
            if (twistView != null) {
                twistView.setDurationAnimation(coolRollViewBean.getRollTime());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(long j4) {
        this.f6889j = j4;
    }

    public void a(double d5) {
        this.f6890k = d5;
    }

    public void a(a aVar) {
        this.f6895t = aVar;
    }
}
