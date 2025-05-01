package com.beizi.ad.a.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.motion.widget.Key;
import com.beizi.ad.R;
import com.beizi.ad.internal.utilities.ImageManager;
import com.beizi.ad.internal.utilities.SPUtils;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.p;
import com.beizi.fusion.model.AdSpacesBean;
import com.join.mgps.Util.v;
import com.umeng.analytics.pro.bm;
import java.util.ArrayList;
import java.util.List;
/* compiled from: EulerAngleUtil.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: g  reason: collision with root package name */
    private static final String f5219g = "a";

    /* renamed from: q  reason: collision with root package name */
    private static SensorManager f5220q;
    private float A;
    private InterfaceC0166a B;
    private String E;
    private AnimatorSet J;
    private boolean K;

    /* renamed from: h  reason: collision with root package name */
    private Context f5227h;

    /* renamed from: i  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewBean f5228i;

    /* renamed from: j  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewBean f5229j;

    /* renamed from: k  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f5230k;

    /* renamed from: l  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f5231l;

    /* renamed from: m  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleViewRuleBean f5232m;

    /* renamed from: n  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.EulerAngleRenderBean f5233n;

    /* renamed from: r  reason: collision with root package name */
    private Sensor f5236r;

    /* renamed from: v  reason: collision with root package name */
    private String f5240v;

    /* renamed from: w  reason: collision with root package name */
    private String f5241w;

    /* renamed from: x  reason: collision with root package name */
    private String f5242x;

    /* renamed from: o  reason: collision with root package name */
    private float f5234o = 1.0E-9f;

    /* renamed from: p  reason: collision with root package name */
    private float[] f5235p = new float[3];

    /* renamed from: s  reason: collision with root package name */
    private double f5237s = 0.0d;

    /* renamed from: t  reason: collision with root package name */
    private double f5238t = 0.0d;

    /* renamed from: u  reason: collision with root package name */
    private double f5239u = 0.0d;

    /* renamed from: y  reason: collision with root package name */
    private boolean f5243y = false;

    /* renamed from: z  reason: collision with root package name */
    private int f5244z = 0;
    private boolean C = true;
    private boolean D = false;

    /* renamed from: a  reason: collision with root package name */
    String f5221a = "x";

    /* renamed from: b  reason: collision with root package name */
    String f5222b = "y";

    /* renamed from: c  reason: collision with root package name */
    String f5223c = bm.aH;

    /* renamed from: d  reason: collision with root package name */
    String f5224d = "0";

    /* renamed from: e  reason: collision with root package name */
    String f5225e = "1";

    /* renamed from: f  reason: collision with root package name */
    String f5226f = "2";
    private int F = 350;
    private float G = 60.0f;
    private float H = 60.0f;
    private float I = 30.0f;
    private SensorEventListener L = new SensorEventListener() { // from class: com.beizi.ad.a.a.a.4
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            try {
                a.this.a(sensorEvent);
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    };

    /* compiled from: EulerAngleUtil.java */
    /* renamed from: com.beizi.ad.a.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0166a {
        void a();
    }

    public a(Context context, AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean, String str, String str2) {
        this.E = null;
        this.K = false;
        this.f5227h = context;
        this.f5228i = eulerAngleViewBean;
        this.E = "beizi_cool_" + str;
        AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean a5 = a(this.f5228i.getOrderData(), str2);
        if (a5 != null && a5.getEulerAngleRule() != null) {
            this.f5229j = a5.getEulerAngleRule();
        }
        AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean2 = this.f5228i;
        if (eulerAngleViewBean2 != null) {
            this.f5232m = eulerAngleViewBean2.getCoolRule();
        }
        AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean3 = this.f5229j;
        if (eulerAngleViewBean3 != null) {
            this.f5231l = eulerAngleViewBean3.getNomalRule();
            this.f5233n = this.f5229j.getRender();
        } else {
            AdSpacesBean.BuyerBean.EulerAngleViewBean eulerAngleViewBean4 = this.f5228i;
            if (eulerAngleViewBean4 != null) {
                this.f5231l = eulerAngleViewBean4.getNomalRule();
                this.f5233n = this.f5228i.getRender();
            }
        }
        if (!d()) {
            this.K = false;
            return;
        }
        this.K = true;
        e();
        k();
    }

    private boolean d() {
        List<AdSpacesBean.BuyerBean.EulerAngleRuleBean> rules;
        AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f5231l;
        if (eulerAngleViewRuleBean != null && (rules = eulerAngleViewRuleBean.getRules()) != null && rules.size() != 0) {
            for (AdSpacesBean.BuyerBean.EulerAngleRuleBean eulerAngleRuleBean : rules) {
                if (eulerAngleRuleBean != null) {
                    String axis = eulerAngleRuleBean.getAxis();
                    double angle = eulerAngleRuleBean.getAngle();
                    if (!TextUtils.isEmpty(axis) && angle > 0.0d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:2:0x0000, B:4:0x0007, B:7:0x000e, B:12:0x001d, B:14:0x0021, B:16:0x0029, B:8:0x0011, B:10:0x0017, B:11:0x001b), top: B:21:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[Catch: Exception -> 0x0031, TRY_LEAVE, TryCatch #0 {Exception -> 0x0031, blocks: (B:2:0x0000, B:4:0x0007, B:7:0x000e, B:12:0x001d, B:14:0x0021, B:16:0x0029, B:8:0x0011, B:10:0x0017, B:11:0x001b), top: B:21:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void e() {
        /*
            r2 = this;
            boolean r0 = r2.i()     // Catch: java.lang.Exception -> L31
            r1 = 0
            if (r0 != 0) goto L11
            boolean r0 = r2.h()     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto Le
            goto L11
        Le:
            r2.f5243y = r1     // Catch: java.lang.Exception -> L31
            goto L1d
        L11:
            boolean r0 = r2.g()     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L1b
            r0 = 1
            r2.f5243y = r0     // Catch: java.lang.Exception -> L31
            goto L1d
        L1b:
            r2.f5243y = r1     // Catch: java.lang.Exception -> L31
        L1d:
            boolean r0 = r2.f5243y     // Catch: java.lang.Exception -> L31
            if (r0 == 0) goto L29
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r2.f5232m     // Catch: java.lang.Exception -> L31
            r2.f5230k = r0     // Catch: java.lang.Exception -> L31
            r2.f()     // Catch: java.lang.Exception -> L31
            return
        L29:
            com.beizi.fusion.model.AdSpacesBean$BuyerBean$EulerAngleViewRuleBean r0 = r2.f5231l     // Catch: java.lang.Exception -> L31
            r2.f5230k = r0     // Catch: java.lang.Exception -> L31
            r2.f()     // Catch: java.lang.Exception -> L31
            goto L35
        L31:
            r0 = move-exception
            r0.printStackTrace()
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.a.a.a.e():void");
    }

    private void f() {
        List<AdSpacesBean.BuyerBean.EulerAngleRuleBean> rules;
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f5230k;
            if (eulerAngleViewRuleBean != null && (rules = eulerAngleViewRuleBean.getRules()) != null && rules.size() != 0) {
                int passivationTime = this.f5230k.getPassivationTime();
                final double d5 = 0.0d;
                final double d6 = 0.0d;
                final double d7 = 0.0d;
                for (AdSpacesBean.BuyerBean.EulerAngleRuleBean eulerAngleRuleBean : rules) {
                    if (eulerAngleRuleBean != null) {
                        if (this.f5221a.equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if (passivationTime > 0 && eulerAngleRuleBean.getPangle() > 0.0d) {
                                this.f5237s = eulerAngleRuleBean.getPangle();
                            } else {
                                this.f5237s = eulerAngleRuleBean.getAngle();
                            }
                            d5 = eulerAngleRuleBean.getAngle();
                            this.f5240v = eulerAngleRuleBean.getDirection();
                        } else if (this.f5222b.equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if (passivationTime > 0 && eulerAngleRuleBean.getPangle() > 0.0d) {
                                this.f5238t = eulerAngleRuleBean.getPangle();
                            } else {
                                this.f5238t = eulerAngleRuleBean.getAngle();
                            }
                            d6 = eulerAngleRuleBean.getAngle();
                            this.f5241w = eulerAngleRuleBean.getDirection();
                        } else if (this.f5223c.equalsIgnoreCase(eulerAngleRuleBean.getAxis())) {
                            if (passivationTime > 0 && eulerAngleRuleBean.getPangle() > 0.0d) {
                                this.f5239u = eulerAngleRuleBean.getPangle();
                            } else {
                                this.f5239u = eulerAngleRuleBean.getAngle();
                            }
                            d7 = eulerAngleRuleBean.getAngle();
                            this.f5242x = eulerAngleRuleBean.getDirection();
                        }
                    }
                }
                if (passivationTime > 0) {
                    new Handler().postDelayed(new Runnable() { // from class: com.beizi.ad.a.a.a.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                a.this.A = 0.0f;
                                a.this.f5235p[0] = 0.0f;
                                a.this.f5235p[1] = 0.0f;
                                a.this.f5235p[2] = 0.0f;
                                a.this.f5237s = d5;
                                a.this.f5238t = d6;
                                a.this.f5239u = d7;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                            }
                        }
                    }, a(passivationTime));
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean g() {
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f5232m;
            if (eulerAngleViewRuleBean != null && eulerAngleViewRuleBean != null && eulerAngleViewRuleBean.getRules() != null && this.f5232m.getRules().size() > 0) {
                if (this.f5232m.getStyle() != null) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    private boolean h() {
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f5232m;
            if (eulerAngleViewRuleBean == null) {
                return false;
            }
            long coolTime = eulerAngleViewRuleBean.getCoolTime();
            long longValue = ((Long) SPUtils.getFromFusionSdk(this.f5227h, this.E, 0L)).longValue();
            if (longValue != 0) {
                return System.currentTimeMillis() - longValue < coolTime;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private boolean i() {
        try {
            AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f5232m;
            if (eulerAngleViewRuleBean == null) {
                return false;
            }
            return System.currentTimeMillis() - this.f5227h.getPackageManager().getPackageInfo(this.f5227h.getPackageName(), 0).firstInstallTime < eulerAngleViewRuleBean.getUserProtectTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private void j() {
        this.A = 0.0f;
        float[] fArr = this.f5235p;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
    }

    private void k() {
        try {
            if (f5220q == null) {
                f5220q = (SensorManager) this.f5227h.getApplicationContext().getSystemService(bm.ac);
            }
            if (this.f5236r == null) {
                this.f5236r = f5220q.getDefaultSensor(4);
            }
            f5220q.registerListener(this.L, this.f5236r, 1);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void l() {
        try {
            l.a(f5219g, "enter unRegisterListener");
            SensorManager sensorManager = f5220q;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.L);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean m() {
        try {
            if (this.f5237s > 0.0d) {
                if (this.f5226f.equals(this.f5240v)) {
                    float[] fArr = this.f5235p;
                    if (fArr[0] > 0.0f && Math.abs(fArr[0]) >= this.f5237s) {
                        return true;
                    }
                } else if (this.f5225e.equals(this.f5240v)) {
                    float[] fArr2 = this.f5235p;
                    if (fArr2[0] < 0.0f && Math.abs(fArr2[0]) >= this.f5237s) {
                        return true;
                    }
                } else if (this.f5224d.equals(this.f5240v) && Math.abs(this.f5235p[0]) >= this.f5237s) {
                    return true;
                }
            }
            if (this.f5238t > 0.0d) {
                if (this.f5226f.equals(this.f5241w)) {
                    float[] fArr3 = this.f5235p;
                    if (fArr3[1] < 0.0f && Math.abs(fArr3[1]) >= this.f5238t) {
                        return true;
                    }
                } else if (this.f5225e.equals(this.f5241w)) {
                    float[] fArr4 = this.f5235p;
                    if (fArr4[1] > 0.0f && Math.abs(fArr4[1]) >= this.f5238t) {
                        return true;
                    }
                } else if (this.f5224d.equals(this.f5241w) && Math.abs(this.f5235p[1]) >= this.f5238t) {
                    return true;
                }
            }
            if (this.f5239u > 0.0d) {
                if (this.f5226f.equals(this.f5242x)) {
                    float[] fArr5 = this.f5235p;
                    if (fArr5[2] > 0.0f && Math.abs(fArr5[2]) >= this.f5239u) {
                        return true;
                    }
                } else if (this.f5225e.equals(this.f5242x)) {
                    float[] fArr6 = this.f5235p;
                    if (fArr6[2] < 0.0f && Math.abs(fArr6[2]) >= this.f5239u) {
                        return true;
                    }
                } else if (this.f5224d.equals(this.f5242x) && Math.abs(this.f5235p[2]) >= this.f5239u) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    private void n() {
        try {
            if (this.B != null && this.C) {
                l.a(f5219g, "onEulerAngleHappened");
                b();
                if (!this.f5243y) {
                    SPUtils.putToFusionSdk(this.f5227h, this.E, Long.valueOf(System.currentTimeMillis()));
                }
                this.B.a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void c() {
        try {
            l();
            this.f5228i = null;
            this.f5229j = null;
            this.f5230k = null;
            this.f5231l = null;
            this.f5232m = null;
            this.f5233n = null;
            this.f5227h = null;
            this.B = null;
            f5220q = null;
            this.f5236r = null;
            AnimatorSet animatorSet = this.J;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            this.J = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b() {
        this.C = false;
        j();
        l();
    }

    private AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean a(List<AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataEulerAngleViewBean orderDataEulerAngleViewBean : list) {
                List<String> orderList = orderDataEulerAngleViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataEulerAngleViewBean;
                }
            }
        }
        return null;
    }

    private int[] b(ViewGroup viewGroup) {
        AdSpacesBean.BuyerBean.EulerAngleRenderBean eulerAngleRenderBean;
        int parseInt;
        int parseInt2;
        int parseInt3;
        int[] iArr = new int[4];
        if (viewGroup != null) {
            try {
                eulerAngleRenderBean = this.f5233n;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (eulerAngleRenderBean != null) {
                String centerX = eulerAngleRenderBean.getCenterX();
                String centerY = this.f5233n.getCenterY();
                String width = this.f5233n.getWidth();
                String height = this.f5233n.getHeight();
                if (TextUtils.isEmpty(centerX) || "0".equals(centerX)) {
                    centerX = v.f28122v;
                }
                if (TextUtils.isEmpty(centerY) || "0".equals(centerY)) {
                    centerY = v.f28122v;
                }
                viewGroup.measure(0, 0);
                int px2dip = ViewUtil.px2dip(this.f5227h, viewGroup.getMeasuredWidth());
                int px2dip2 = ViewUtil.px2dip(this.f5227h, viewGroup.getMeasuredHeight());
                if (px2dip <= 0) {
                    px2dip = p.k(this.f5227h);
                }
                String str = f5219g;
                l.a(str, "position containerWidth:" + px2dip + ";containerHeight:" + px2dip2 + ";" + viewGroup.getLayoutParams().width + ";" + viewGroup.getLayoutParams().height);
                width = (TextUtils.isEmpty(width) || "0".equals(width)) ? "20" : "20";
                height = (TextUtils.isEmpty(height) || "0".equals(height)) ? "20" : "20";
                if (centerX.endsWith("%")) {
                    parseInt = (Integer.parseInt(centerX.substring(0, centerX.indexOf("%"))) * px2dip) / 100;
                } else {
                    parseInt = !TextUtils.isEmpty(centerX) ? Integer.parseInt(centerX) : 0;
                }
                if (centerY.endsWith("%")) {
                    parseInt2 = (px2dip2 * Integer.parseInt(centerY.substring(0, centerY.indexOf("%")))) / 100;
                } else {
                    parseInt2 = !TextUtils.isEmpty(centerY) ? Integer.parseInt(centerY) : 0;
                }
                int i4 = 20;
                if (width.endsWith("%")) {
                    parseInt3 = (px2dip * Integer.parseInt(width.substring(0, width.indexOf("%")))) / 100;
                } else {
                    parseInt3 = !TextUtils.isEmpty(width) ? Integer.parseInt(width) : 20;
                }
                if (height.endsWith("%")) {
                    i4 = (Integer.parseInt(height.substring(0, height.indexOf("%"))) * parseInt3) / 100;
                } else if (!TextUtils.isEmpty(width)) {
                    i4 = Integer.parseInt(height);
                }
                int dip2px = ViewUtil.dip2px(this.f5227h, parseInt3);
                int dip2px2 = ViewUtil.dip2px(this.f5227h, i4);
                int dip2px3 = ViewUtil.dip2px(this.f5227h, parseInt);
                int dip2px4 = ViewUtil.dip2px(this.f5227h, parseInt2);
                iArr[0] = dip2px;
                iArr[1] = dip2px2;
                if (dip2px3 > 0) {
                    iArr[2] = dip2px3;
                }
                if (dip2px4 > 0) {
                    iArr[3] = dip2px4;
                }
                l.a(str, "position widthInt:" + iArr[0] + ";heightInt:" + iArr[1] + ";centerX:" + iArr[2] + ";centerY:" + iArr[3] + ";" + centerX + ";" + centerY);
                return iArr;
            }
        }
        int dip2px5 = ViewUtil.dip2px(this.f5227h, 20.0f);
        int dip2px6 = ViewUtil.dip2px(this.f5227h, 10.0f);
        iArr[0] = dip2px5;
        iArr[1] = dip2px5;
        iArr[2] = dip2px6;
        iArr[3] = dip2px6;
        return iArr;
    }

    public int a(int i4) {
        double random = Math.random();
        double d5 = i4;
        Double.isNaN(d5);
        return (int) ((random * d5) + 1.0d);
    }

    public void a() {
        if (this.D || !this.K) {
            return;
        }
        this.C = true;
        j();
        e();
        k();
    }

    public void a(InterfaceC0166a interfaceC0166a) {
        this.B = interfaceC0166a;
    }

    public void a(ViewGroup viewGroup) {
        AdSpacesBean.BuyerBean.EulerAngleStyleBean style;
        List<String> imgs;
        if (viewGroup != null) {
            try {
                if (this.f5227h != null && this.K) {
                    final ImageView imageView = new ImageView(this.f5227h);
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.mipmap.beizi_interaction_icon_euler_angle);
                    String str = null;
                    AdSpacesBean.BuyerBean.EulerAngleViewRuleBean eulerAngleViewRuleBean = this.f5230k;
                    if (eulerAngleViewRuleBean != null && (style = eulerAngleViewRuleBean.getStyle()) != null && (imgs = style.getImgs()) != null && imgs.size() > 0) {
                        str = imgs.get(0);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ImageManager.with(this.f5227h).getCacheBitmap(str, new ImageManager.BitmapLoadedListener() { // from class: com.beizi.ad.a.a.a.2
                            @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                            public void onBitmapLoadFailed() {
                            }

                            @Override // com.beizi.ad.internal.utilities.ImageManager.BitmapLoadedListener
                            public void onBitmapLoaded(Bitmap bitmap) {
                                try {
                                    ImageView imageView2 = imageView;
                                    if (imageView2 == null || bitmap == null) {
                                        return;
                                    }
                                    imageView2.setImageBitmap(bitmap);
                                } catch (Exception e5) {
                                    e5.printStackTrace();
                                }
                            }
                        });
                    }
                    int[] b5 = b(viewGroup);
                    if (viewGroup instanceof RelativeLayout) {
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                        if (b5[0] > 0) {
                            layoutParams.width = b5[0];
                        }
                        if (b5[1] > 0) {
                            layoutParams.height = b5[1];
                        }
                        layoutParams.leftMargin = b5[2];
                        layoutParams.topMargin = b5[3];
                        layoutParams.addRule(17);
                        viewGroup.addView(imageView, layoutParams);
                    } else if (viewGroup instanceof FrameLayout) {
                        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 17);
                        if (b5[0] > 0) {
                            layoutParams2.width = b5[0];
                        }
                        if (b5[1] > 0) {
                            layoutParams2.height = b5[1];
                        }
                        layoutParams2.leftMargin = b5[2];
                        layoutParams2.topMargin = b5[3];
                        viewGroup.addView(imageView, layoutParams2);
                    } else if (viewGroup instanceof LinearLayout) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2, 17.0f);
                        if (b5[0] > 0) {
                            layoutParams3.width = b5[0];
                        }
                        if (b5[1] > 0) {
                            layoutParams3.height = b5[1];
                        }
                        layoutParams3.leftMargin = b5[2];
                        layoutParams3.topMargin = b5[3];
                        viewGroup.addView(imageView, layoutParams3);
                    } else {
                        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -2);
                        if (b5[0] > 0) {
                            layoutParams4.width = b5[0];
                        }
                        if (b5[1] > 0) {
                            layoutParams4.height = b5[1];
                        }
                        viewGroup.addView(imageView, layoutParams4);
                    }
                    a(imageView);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private void a(ImageView imageView) {
        try {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f5240v)) {
                if (this.f5226f.equals(this.f5240v)) {
                    a(imageView, arrayList, "rotationX", 0.0f, -this.G);
                    a(imageView, arrayList, "rotationX", -this.G, 0.0f);
                } else if (this.f5225e.equals(this.f5240v)) {
                    a(imageView, arrayList, "rotationX", 0.0f, this.G);
                    a(imageView, arrayList, "rotationX", this.G, 0.0f);
                } else {
                    a(imageView, arrayList, "rotationX", 0.0f, this.G);
                    a(imageView, arrayList, "rotationX", this.G, 0.0f);
                    a(imageView, arrayList, "rotationX", 0.0f, -this.G);
                    a(imageView, arrayList, "rotationX", -this.G, 0.0f);
                }
            }
            if (!TextUtils.isEmpty(this.f5241w)) {
                if (this.f5226f.equals(this.f5241w)) {
                    a(imageView, arrayList, "rotationY", 0.0f, -this.H);
                    a(imageView, arrayList, "rotationY", -this.H, 0.0f);
                } else if (this.f5225e.equals(this.f5241w)) {
                    a(imageView, arrayList, "rotationY", 0.0f, this.H);
                    a(imageView, arrayList, "rotationY", this.H, 0.0f);
                } else {
                    a(imageView, arrayList, "rotationY", 0.0f, this.H);
                    a(imageView, arrayList, "rotationY", this.H, 0.0f);
                    a(imageView, arrayList, "rotationY", 0.0f, -this.H);
                    a(imageView, arrayList, "rotationY", -this.H, 0.0f);
                }
            }
            if (!TextUtils.isEmpty(this.f5242x)) {
                if (this.f5226f.equals(this.f5242x)) {
                    a(imageView, arrayList, Key.ROTATION, 0.0f, -this.I);
                    a(imageView, arrayList, Key.ROTATION, -this.I, 0.0f);
                } else if (this.f5225e.equals(this.f5242x)) {
                    a(imageView, arrayList, Key.ROTATION, 0.0f, this.I);
                    a(imageView, arrayList, Key.ROTATION, this.I, 0.0f);
                } else {
                    a(imageView, arrayList, Key.ROTATION, 0.0f, this.I);
                    a(imageView, arrayList, Key.ROTATION, this.I, 0.0f);
                    a(imageView, arrayList, Key.ROTATION, 0.0f, -this.I);
                    a(imageView, arrayList, Key.ROTATION, -this.I, 0.0f);
                }
            }
            if (this.J != null) {
                this.J = null;
            }
            if (arrayList.size() > 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.J = animatorSet;
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.beizi.ad.a.a.a.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        try {
                            if (a.this.J != null) {
                                a.this.J.start();
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
                this.J.playSequentially(arrayList);
                this.J.start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(ImageView imageView, List<Animator> list, String str, float f5, float f6) {
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, f5, f6);
            ofFloat.setDuration(this.F);
            list.add(ofFloat);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SensorEvent sensorEvent) {
        if (sensorEvent != null) {
            try {
                if (this.C) {
                    Sensor sensor = sensorEvent.sensor;
                    float[] fArr = sensorEvent.values;
                    int type = sensor.getType();
                    if (fArr != null && type == 4) {
                        float f5 = this.A;
                        if (f5 != 0.0f) {
                            float f6 = fArr[0];
                            float f7 = fArr[1];
                            float f8 = fArr[2];
                            float f9 = (((float) sensorEvent.timestamp) - f5) * this.f5234o;
                            float[] fArr2 = this.f5235p;
                            double d5 = fArr2[0];
                            double degrees = Math.toDegrees(f6 * f9);
                            Double.isNaN(d5);
                            fArr2[0] = (float) (d5 + degrees);
                            float[] fArr3 = this.f5235p;
                            double d6 = fArr3[1];
                            double degrees2 = Math.toDegrees(f7 * f9);
                            Double.isNaN(d6);
                            fArr3[1] = (float) (d6 + degrees2);
                            float[] fArr4 = this.f5235p;
                            double d7 = fArr4[2];
                            double degrees3 = Math.toDegrees(f8 * f9);
                            Double.isNaN(d7);
                            fArr4[2] = (float) (d7 + degrees3);
                            l.a(f5219g, "rotate  x: " + String.format("%.4f", Float.valueOf(this.f5235p[0])) + ",y: " + String.format("%.4f", Float.valueOf(this.f5235p[1])) + ",z: " + String.format("%.4f", Float.valueOf(this.f5235p[2])) + ",x : " + this.f5237s + ",y : " + this.f5238t + ",z : " + this.f5239u);
                            if (m()) {
                                n();
                            }
                        }
                        this.A = (float) sensorEvent.timestamp;
                    }
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }
}
