package com.beizi.fusion.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.EulerAngleView;
import com.umeng.analytics.pro.bm;
import java.util.List;
/* compiled from: EulerAngleUtil.java */
/* loaded from: classes2.dex */
public class x {

    /* renamed from: a  reason: collision with root package name */
    private static final String f7038a = an.class.getSimpleName();

    /* renamed from: k  reason: collision with root package name */
    private static SensorManager f7039k;

    /* renamed from: b  reason: collision with root package name */
    private Context f7040b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewBean f7041c;

    /* renamed from: d  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewBean f7042d;

    /* renamed from: e  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f7043e;

    /* renamed from: f  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f7044f;

    /* renamed from: g  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f7045g;

    /* renamed from: h  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleRenderBean f7046h;

    /* renamed from: l  reason: collision with root package name */
    private Sensor f7049l;

    /* renamed from: p  reason: collision with root package name */
    private String f7053p;

    /* renamed from: q  reason: collision with root package name */
    private String f7054q;

    /* renamed from: r  reason: collision with root package name */
    private String f7055r;

    /* renamed from: u  reason: collision with root package name */
    private float f7058u;

    /* renamed from: v  reason: collision with root package name */
    private EulerAngleView f7059v;

    /* renamed from: w  reason: collision with root package name */
    private a f7060w;

    /* renamed from: y  reason: collision with root package name */
    private String f7062y;

    /* renamed from: i  reason: collision with root package name */
    private float f7047i = 1.0E-9f;

    /* renamed from: j  reason: collision with root package name */
    private float[] f7048j = new float[3];

    /* renamed from: m  reason: collision with root package name */
    private double f7050m = 0.0d;

    /* renamed from: n  reason: collision with root package name */
    private double f7051n = 0.0d;

    /* renamed from: o  reason: collision with root package name */
    private double f7052o = 0.0d;

    /* renamed from: s  reason: collision with root package name */
    private boolean f7056s = false;

    /* renamed from: t  reason: collision with root package name */
    private int f7057t = 0;

    /* renamed from: x  reason: collision with root package name */
    private boolean f7061x = false;

    /* renamed from: z  reason: collision with root package name */
    private SensorEventListener f7063z = new SensorEventListener() { // from class: com.beizi.fusion.g.x.1
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                x.this.a(sensorEvent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    };

    /* compiled from: EulerAngleUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public x(Context context, String str, AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean, AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean2) {
        this.f7062y = null;
        f7039k = (SensorManager) context.getApplicationContext().getSystemService(bm.ac);
        this.f7040b = context;
        this.f7041c = eulerAngleViewBean;
        this.f7042d = eulerAngleViewBean2;
        this.f7062y = "splash_cool_" + str;
        c();
        d();
    }

    private void d() {
        List<AdSpacesBean.BuyerBean.EulerAngleRuleBean> rules;
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f7043e;
            if (eulerAngleViewRuleBean != null && (rules = eulerAngleViewRuleBean.getRules()) != null && rules.size() != 0) {
                int passivationTime = this.f7043e.getPassivationTime();
                final double d5 = 0.0d;
                final double d6 = 0.0d;
                final double d7 = 0.0d;
                for (AdSpacesBean.BuyerBean.EulerAngleRuleBean eulerAngleRuleBean : rules) {
                    if (eulerAngleRuleBean != null) {
                        if ("x".equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if (passivationTime > 0 && eulerAngleRuleBean.getPangle() > 0.0d) {
                                this.f7050m = eulerAngleRuleBean.getPangle();
                            } else {
                                this.f7050m = eulerAngleRuleBean.getAngle();
                            }
                            d5 = eulerAngleRuleBean.getAngle();
                            this.f7053p = eulerAngleRuleBean.getDirection();
                        } else if ("y".equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if (passivationTime > 0 && eulerAngleRuleBean.getPangle() > 0.0d) {
                                this.f7051n = eulerAngleRuleBean.getPangle();
                            } else {
                                this.f7051n = eulerAngleRuleBean.getAngle();
                            }
                            d6 = eulerAngleRuleBean.getAngle();
                            this.f7054q = eulerAngleRuleBean.getDirection();
                        } else if (bm.aH.equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if (passivationTime > 0 && eulerAngleRuleBean.getPangle() > 0.0d) {
                                this.f7052o = eulerAngleRuleBean.getPangle();
                            } else {
                                this.f7052o = eulerAngleRuleBean.getAngle();
                            }
                            d7 = eulerAngleRuleBean.getAngle();
                            this.f7055r = eulerAngleRuleBean.getDirection();
                        }
                    }
                }
                if (passivationTime > 0) {
                    new Handler().postDelayed(new Runnable() { // from class: com.beizi.fusion.g.x.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                x.this.f7056s = true;
                                x.this.f7058u = 0.0f;
                                x.this.f7048j[0] = 0.0f;
                                x.this.f7048j[1] = 0.0f;
                                x.this.f7048j[2] = 0.0f;
                                x.this.f7050m = d5;
                                x.this.f7051n = d6;
                                x.this.f7052o = d7;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }, al.b(passivationTime));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean e() {
        try {
            if (this.f7050m > 0.0d) {
                if ("2".equals(this.f7053p)) {
                    float[] fArr = this.f7048j;
                    if (fArr[0] > 0.0f && Math.abs(fArr[0]) >= this.f7050m) {
                        return true;
                    }
                } else if ("1".equals(this.f7053p)) {
                    float[] fArr2 = this.f7048j;
                    if (fArr2[0] < 0.0f && Math.abs(fArr2[0]) >= this.f7050m) {
                        return true;
                    }
                } else if ("0".equals(this.f7053p) && Math.abs(this.f7048j[0]) >= this.f7050m) {
                    return true;
                }
            }
            if (this.f7051n > 0.0d) {
                if ("2".equals(this.f7054q)) {
                    float[] fArr3 = this.f7048j;
                    if (fArr3[1] < 0.0f && Math.abs(fArr3[1]) >= this.f7051n) {
                        return true;
                    }
                } else if ("1".equals(this.f7054q)) {
                    float[] fArr4 = this.f7048j;
                    if (fArr4[1] > 0.0f && Math.abs(fArr4[1]) >= this.f7051n) {
                        return true;
                    }
                } else if ("0".equals(this.f7054q) && Math.abs(this.f7048j[1]) >= this.f7051n) {
                    return true;
                }
            }
            if (this.f7052o > 0.0d) {
                if ("2".equals(this.f7055r)) {
                    float[] fArr5 = this.f7048j;
                    if (fArr5[2] > 0.0f && Math.abs(fArr5[2]) >= this.f7052o) {
                        return true;
                    }
                } else if ("1".equals(this.f7055r)) {
                    float[] fArr6 = this.f7048j;
                    if (fArr6[2] < 0.0f && Math.abs(fArr6[2]) >= this.f7052o) {
                        return true;
                    }
                } else if ("0".equals(this.f7055r) && Math.abs(this.f7048j[2]) >= this.f7052o) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    private void f() {
        try {
            if (this.f7060w == null || this.f7061x || !ax.b(this.f7059v)) {
                return;
            }
            this.f7061x = true;
            if (this.f7056s && this.f7045g != null) {
                at.a(this.f7040b, this.f7062y, Long.valueOf(System.currentTimeMillis()));
            }
            this.f7060w.a();
            b();
            af.a(f7038a, "onEulerAngleHappened");
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean b(long j4) {
        try {
            return System.currentTimeMillis() - this.f7040b.getPackageManager().getPackageInfo(this.f7040b.getPackageName(), 0).firstInstallTime < j4;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private void c() {
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean = this.f7041c;
            if (eulerAngleViewBean != null) {
                this.f7045g = eulerAngleViewBean.getCoolRule();
            }
            AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean2 = this.f7042d;
            if (eulerAngleViewBean2 != null) {
                this.f7044f = eulerAngleViewBean2.getNomalRule();
                this.f7046h = this.f7042d.getRender();
            } else {
                AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean3 = this.f7041c;
                if (eulerAngleViewBean3 != null) {
                    this.f7044f = eulerAngleViewBean3.getNomalRule();
                    this.f7046h = this.f7041c.getRender();
                }
            }
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f7045g;
            if (eulerAngleViewRuleBean == null) {
                this.f7056s = true;
                this.f7043e = this.f7044f;
            } else if (a(eulerAngleViewRuleBean.getCoolTime())) {
                this.f7056s = false;
                this.f7043e = this.f7045g;
            } else if (b(this.f7045g.getUserProtectTime())) {
                this.f7056s = false;
                this.f7043e = this.f7045g;
            } else {
                this.f7056s = true;
                this.f7043e = this.f7044f;
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean a(long j4) {
        try {
            long longValue = ((Long) at.b(this.f7040b, this.f7062y, 0L)).longValue();
            if (longValue != 0) {
                return System.currentTimeMillis() - longValue < j4;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    public void b() {
        try {
            af.a("BeiZis", "enter unRegisterListener");
            SensorManager sensorManager = f7039k;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f7063z);
            }
            EulerAngleView eulerAngleView = this.f7059v;
            if (eulerAngleView != null) {
                eulerAngleView.onDestroy();
            }
            this.f7059v = null;
            this.f7040b = null;
            this.f7060w = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a() {
        try {
            SensorManager sensorManager = f7039k;
            if (sensorManager != null) {
                Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                this.f7049l = defaultSensor;
                if (defaultSensor != null) {
                    f7039k.registerListener(this.f7063z, defaultSensor, 1);
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(ViewGroup viewGroup, int i4, int i5) {
        AdSpacesBean.BuyerBean.EulerAngleRenderBean eulerAngleRenderBean;
        String str;
        String str2;
        String str3;
        int parseInt;
        int parseInt2;
        int parseInt3;
        int parseInt4;
        try {
            if (this.f7040b != null && (eulerAngleRenderBean = this.f7046h) != null && viewGroup != null) {
                String str4 = null;
                if (eulerAngleRenderBean != null) {
                    str4 = eulerAngleRenderBean.getCenterX();
                    str = this.f7046h.getCenterY();
                    str2 = this.f7046h.getWidth();
                    str3 = this.f7046h.getHeight();
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                str4 = (TextUtils.isEmpty(str4) || "0".equals(str4)) ? "85%" : "85%";
                str = (TextUtils.isEmpty(str) || "0".equals(str)) ? "50%" : "50%";
                str2 = (TextUtils.isEmpty(str2) || "0".equals(str2)) ? "120" : "120";
                str3 = (TextUtils.isEmpty(str3) || "0".equals(str3)) ? "120" : "120";
                float j4 = av.j(this.f7040b);
                int i6 = 100;
                if (str4.endsWith("%")) {
                    parseInt = (Integer.parseInt(str4.substring(0, str4.indexOf("%"))) * i4) / 100;
                } else {
                    parseInt = Integer.parseInt(str4);
                }
                if (str.endsWith("%")) {
                    parseInt2 = (Integer.parseInt(str.substring(0, str.indexOf("%"))) * i5) / 100;
                } else {
                    parseInt2 = Integer.parseInt(str);
                }
                if (str2.endsWith("%")) {
                    parseInt3 = (((int) j4) * Integer.parseInt(str2.substring(0, str2.indexOf("%")))) / 100;
                } else {
                    parseInt3 = Integer.parseInt(str2);
                }
                if (str3.endsWith("%")) {
                    parseInt4 = (Integer.parseInt(str3.substring(0, str3.indexOf("%"))) * parseInt3) / 100;
                } else {
                    parseInt4 = Integer.parseInt(str3);
                }
                if (parseInt3 == 0) {
                    parseInt3 = 100;
                }
                if (parseInt4 != 0) {
                    i6 = parseInt4;
                }
                if (parseInt2 == 0) {
                    parseInt2 = av.a(this.f7040b, i5) / 2;
                }
                if (parseInt == 0) {
                    parseInt = av.a(this.f7040b, i4) / 2;
                }
                int a5 = av.a(this.f7040b, parseInt3);
                int a6 = av.a(this.f7040b, i6);
                int a7 = av.a(this.f7040b, parseInt);
                int a8 = av.a(this.f7040b, parseInt2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                EulerAngleView eulerAngleView = new EulerAngleView(this.f7040b);
                this.f7059v = eulerAngleView;
                eulerAngleView.setEulerAngleViewRuleBean(this.f7043e);
                this.f7059v.setEulerAngleRenderBean(this.f7046h);
                this.f7059v.setAnimationViewWidthAndHeight(a5, a6);
                this.f7059v.buildEulerAngleView();
                this.f7059v.measure(0, 0);
                int measuredWidth = this.f7059v.getMeasuredWidth();
                int measuredHeight = this.f7059v.getMeasuredHeight();
                af.a("BeiZis", "centerYInt = " + a8 + ",centerXInt = " + a7 + ",adWidthDp = " + i4 + ",adHeightDp = " + i5 + ",widthInt = " + a5 + ",heightInt = " + a6 + ",viewWidth = " + measuredWidth + ",viewHeight = " + measuredHeight);
                layoutParams.topMargin = a8 - (measuredHeight / 2);
                layoutParams.leftMargin = a7 - (measuredWidth / 2);
                viewGroup.addView(this.f7059v, layoutParams);
                this.f7059v.startContinuousRotations();
            }
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
    }

    public void a(a aVar) {
        this.f7060w = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            try {
                if (this.f7061x) {
                    return;
                }
                Sensor sensor = sensorEvent.sensor;
                float[] fArr = sensorEvent.values;
                int type = sensor.getType();
                if (fArr != null && type == 4) {
                    float f5 = this.f7058u;
                    if (f5 != 0.0f) {
                        float f6 = fArr[0];
                        float f7 = fArr[1];
                        float f8 = fArr[2];
                        float f9 = (((float) sensorEvent.timestamp) - f5) * this.f7047i;
                        float[] fArr2 = this.f7048j;
                        double d5 = fArr2[0];
                        double degrees = Math.toDegrees(f6 * f9);
                        Double.isNaN(d5);
                        fArr2[0] = (float) (d5 + degrees);
                        float[] fArr3 = this.f7048j;
                        double d6 = fArr3[1];
                        double degrees2 = Math.toDegrees(f7 * f9);
                        Double.isNaN(d6);
                        fArr3[1] = (float) (d6 + degrees2);
                        float[] fArr4 = this.f7048j;
                        double d7 = fArr4[2];
                        double degrees3 = Math.toDegrees(f8 * f9);
                        Double.isNaN(d7);
                        fArr4[2] = (float) (d7 + degrees3);
                        EulerAngleView eulerAngleView = this.f7059v;
                        if (eulerAngleView != null) {
                            eulerAngleView.setAngle(this.f7050m, this.f7051n, this.f7052o);
                            EulerAngleView eulerAngleView2 = this.f7059v;
                            float[] fArr5 = this.f7048j;
                            eulerAngleView2.setCurrentProgress(fArr5[0], fArr5[1], fArr5[2]);
                        }
                        af.a(f7038a, "rotate  x: " + String.format("%.4f", Float.valueOf(this.f7048j[0])) + ",y: " + String.format("%.4f", Float.valueOf(this.f7048j[1])) + ",z: " + String.format("%.4f", Float.valueOf(this.f7048j[2])) + ",x : " + this.f7050m + ",y : " + this.f7051n + ",z : " + this.f7052o);
                        if (e()) {
                            f();
                        }
                    }
                    this.f7058u = (float) sensorEvent.timestamp;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
