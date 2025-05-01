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
/* compiled from: ShakeUtil.java */
/* loaded from: classes2.dex */
public class e {
    private long A;
    private String D;
    private AnimatorSet G;
    private String H;
    private boolean I;

    /* renamed from: a  reason: collision with root package name */
    private Context f5314a;

    /* renamed from: b  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.ShakeViewBean f5315b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.ShakeViewBean f5316c;

    /* renamed from: d  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.AliaseShakeViewBean f5317d;

    /* renamed from: e  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.CoolShakeViewBean f5318e;

    /* renamed from: f  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.PercentPositionBean f5319f;

    /* renamed from: l  reason: collision with root package name */
    private SensorManager f5325l;

    /* renamed from: m  reason: collision with root package name */
    private Sensor f5326m;

    /* renamed from: s  reason: collision with root package name */
    private double f5332s;

    /* renamed from: t  reason: collision with root package name */
    private double f5333t;

    /* renamed from: u  reason: collision with root package name */
    private double f5334u;

    /* renamed from: v  reason: collision with root package name */
    private int f5335v;

    /* renamed from: w  reason: collision with root package name */
    private int f5336w;

    /* renamed from: g  reason: collision with root package name */
    private double f5320g = 9.8d;

    /* renamed from: h  reason: collision with root package name */
    private int f5321h = -100;

    /* renamed from: i  reason: collision with root package name */
    private int f5322i = 0;

    /* renamed from: j  reason: collision with root package name */
    private int f5323j = 1;

    /* renamed from: k  reason: collision with root package name */
    private int f5324k = 2;

    /* renamed from: n  reason: collision with root package name */
    private a f5327n = null;

    /* renamed from: o  reason: collision with root package name */
    private float f5328o = -100;

    /* renamed from: p  reason: collision with root package name */
    private float f5329p = -100;

    /* renamed from: q  reason: collision with root package name */
    private float f5330q = -100;

    /* renamed from: r  reason: collision with root package name */
    private int f5331r = 0;

    /* renamed from: x  reason: collision with root package name */
    private int f5337x = 0;

    /* renamed from: y  reason: collision with root package name */
    private int f5338y = 0;

    /* renamed from: z  reason: collision with root package name */
    private boolean f5339z = true;
    private boolean B = false;
    private boolean C = false;
    private int E = 80;
    private float F = 30.0f;
    private final SensorEventListener J = new SensorEventListener() { // from class: com.beizi.ad.a.a.e.4
        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            e.this.a(sensorEvent);
        }
    };

    /* compiled from: ShakeUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public e(Context context, AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean, String str, String str2) {
        this.D = null;
        this.I = false;
        try {
            this.f5314a = context;
            this.f5315b = shakeViewBean;
            this.D = "beizi_cool_" + str;
            AdSpacesBean.BuyerBean.OrderDataShakeViewBean a5 = a(shakeViewBean.getOrderData(), str2);
            if (a5 != null && a5.getShakeView() != null) {
                this.f5316c = a5.getShakeView();
            }
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = this.f5315b;
            if (shakeViewBean2 != null) {
                this.f5318e = shakeViewBean2.getCoolShakeView();
            }
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean3 = this.f5316c;
            if (shakeViewBean3 != null) {
                this.f5317d = shakeViewBean3.getAliaseShakeView();
                this.f5319f = this.f5316c.getPosition();
                List<String> imageURL = this.f5316c.getImageURL();
                if (imageURL != null && imageURL.size() > 0) {
                    this.H = imageURL.get(0);
                }
            } else {
                AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean4 = this.f5315b;
                if (shakeViewBean4 != null) {
                    this.f5317d = shakeViewBean4.getAliaseShakeView();
                    this.f5319f = this.f5315b.getPosition();
                    List<String> imageURL2 = this.f5315b.getImageURL();
                    if (imageURL2 != null && imageURL2.size() > 0) {
                        this.H = imageURL2.get(0);
                    }
                }
            }
            if (!d()) {
                this.I = false;
                return;
            }
            this.I = true;
            g();
            m();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean d() {
        double d5;
        double d6;
        int i4;
        AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean = this.f5316c;
        if (shakeViewBean != null) {
            d5 = shakeViewBean.getShakeStartAmplitude();
            d6 = this.f5316c.getShakeEndAmplitude();
            i4 = this.f5316c.getShakeCount();
        } else {
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = this.f5315b;
            if (shakeViewBean2 != null) {
                d5 = shakeViewBean2.getShakeStartAmplitude();
                d6 = this.f5315b.getShakeEndAmplitude();
                i4 = this.f5315b.getShakeCount();
            } else {
                d5 = 0.0d;
                d6 = 0.0d;
                i4 = 0;
            }
        }
        return d5 > 0.0d && d6 > 0.0d && i4 > 0;
    }

    private boolean e() {
        AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean;
        try {
            coolShakeViewBean = this.f5318e;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        if (coolShakeViewBean == null) {
            return false;
        }
        if (coolShakeViewBean.getShakeCount() <= 0) {
            return this.f5318e.getRotatCount() > 0;
        }
        return true;
    }

    private boolean f() {
        try {
            AdSpacesBean.BuyerBean.AliaseShakeViewBean aliaseShakeViewBean = this.f5317d;
            if (aliaseShakeViewBean != null && aliaseShakeViewBean != null && aliaseShakeViewBean.getPassivationTime() > 0) {
                if (this.f5317d.getShakeCount() > 0) {
                    return true;
                }
                if (this.f5317d.getRotatCount() > 0) {
                    return true;
                }
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:2:0x0000, B:4:0x000a, B:7:0x0011, B:12:0x0020, B:14:0x0024, B:16:0x0028, B:18:0x002e, B:19:0x0032, B:8:0x0014, B:10:0x001a, B:11:0x001e), top: B:24:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: Exception -> 0x0036, TryCatch #0 {Exception -> 0x0036, blocks: (B:2:0x0000, B:4:0x000a, B:7:0x0011, B:12:0x0020, B:14:0x0024, B:16:0x0028, B:18:0x002e, B:19:0x0032, B:8:0x0014, B:10:0x001a, B:11:0x001e), top: B:24:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g() {
        /*
            r2 = this;
            r2.o()     // Catch: java.lang.Exception -> L36
            boolean r0 = r2.l()     // Catch: java.lang.Exception -> L36
            r1 = 0
            if (r0 != 0) goto L14
            boolean r0 = r2.k()     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L11
            goto L14
        L11:
            r2.B = r1     // Catch: java.lang.Exception -> L36
            goto L20
        L14:
            boolean r0 = r2.e()     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L1e
            r0 = 1
            r2.B = r0     // Catch: java.lang.Exception -> L36
            goto L20
        L1e:
            r2.B = r1     // Catch: java.lang.Exception -> L36
        L20:
            boolean r0 = r2.B     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L28
            r2.j()     // Catch: java.lang.Exception -> L36
            return
        L28:
            boolean r0 = r2.f()     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L32
            r2.i()     // Catch: java.lang.Exception -> L36
            goto L3a
        L32:
            r2.h()     // Catch: java.lang.Exception -> L36
            goto L3a
        L36:
            r0 = move-exception
            r0.printStackTrace()
        L3a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.a.a.e.g():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            l.a("ShakeUtil", "setShakeSensitivityNormal");
            o();
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean = this.f5316c;
            if (shakeViewBean != null) {
                b(shakeViewBean.getShakeCount());
                a(this.f5316c.getShakeStartAmplitude());
                b(this.f5316c.getShakeEndAmplitude());
                c(this.f5316c.getRotatAmplitude());
                c(this.f5316c.getRotatCount());
                return;
            }
            AdSpacesBean.BuyerBean.ShakeViewBean shakeViewBean2 = this.f5315b;
            if (shakeViewBean2 != null) {
                b(shakeViewBean2.getShakeCount());
                a(this.f5315b.getShakeStartAmplitude());
                b(this.f5315b.getShakeEndAmplitude());
                c(this.f5315b.getRotatAmplitude());
                c(this.f5315b.getRotatCount());
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void i() {
        try {
            if (this.f5317d == null) {
                return;
            }
            l.a("ShakeUtil", "setShakeSensitivityAliase");
            b(this.f5317d.getShakeCount());
            a(this.f5317d.getShakeStartAmplitude());
            b(this.f5317d.getShakeEndAmplitude());
            c(this.f5317d.getRotatAmplitude());
            c(this.f5317d.getRotatCount());
            new Handler().postDelayed(new Runnable() { // from class: com.beizi.ad.a.a.e.1
                @Override // java.lang.Runnable
                public void run() {
                    e.this.h();
                }
            }, a(this.f5317d.getPassivationTime()));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void j() {
        try {
            if (this.f5318e == null) {
                return;
            }
            l.a("ShakeUtil", "setShakeSensitivityCool");
            b(this.f5318e.getShakeCount());
            a(this.f5318e.getShakeStartAmplitude());
            b(this.f5318e.getShakeEndAmplitude());
            c(this.f5318e.getRotatAmplitude());
            c(this.f5318e.getRotatCount());
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private boolean k() {
        try {
            AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean = this.f5318e;
            if (coolShakeViewBean == null) {
                return false;
            }
            long coolTime = coolShakeViewBean.getCoolTime();
            long longValue = ((Long) SPUtils.getFromFusionSdk(this.f5314a, this.D, 0L)).longValue();
            if (longValue != 0) {
                return System.currentTimeMillis() - longValue < coolTime;
            }
            return false;
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private boolean l() {
        try {
            AdSpacesBean.BuyerBean.CoolShakeViewBean coolShakeViewBean = this.f5318e;
            if (coolShakeViewBean == null) {
                return false;
            }
            return System.currentTimeMillis() - this.f5314a.getPackageManager().getPackageInfo(this.f5314a.getPackageName(), 0).firstInstallTime < coolShakeViewBean.getUserProtectTime();
        } catch (Exception e5) {
            e5.printStackTrace();
            return false;
        }
    }

    private void m() {
        try {
            l.a("ShakeUtil", "registerShakeListener");
            this.C = true;
            o();
            if (this.f5325l == null) {
                this.f5325l = (SensorManager) this.f5314a.getApplicationContext().getSystemService(bm.ac);
            }
            if (this.f5326m == null) {
                this.f5326m = this.f5325l.getDefaultSensor(1);
            }
            this.f5325l.registerListener(this.J, this.f5326m, 2);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void n() {
        try {
            l.a("ShakeUtil", "unRegisterShakeListener");
            this.C = false;
            SensorManager sensorManager = this.f5325l;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.J);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void o() {
        this.f5337x = 0;
        this.f5338y = 0;
        int i4 = this.f5321h;
        this.f5328o = i4;
        this.f5329p = i4;
        this.f5330q = i4;
        this.f5331r = this.f5322i;
    }

    private void p() {
        try {
            if (this.f5327n != null && this.f5339z) {
                l.a("ShakeUtil", "callBackResult");
                b();
                if (!this.B) {
                    SPUtils.putToFusionSdk(this.f5314a, this.D, Long.valueOf(System.currentTimeMillis()));
                }
                this.f5327n.a();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void c(double d5) {
        this.f5334u = d5;
    }

    public void b() {
        try {
            this.f5339z = false;
            n();
            o();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void c(int i4) {
        this.f5336w = i4;
    }

    public void a() {
        try {
            if (!this.C && this.I) {
                this.f5339z = true;
                g();
                m();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void c() {
        try {
            n();
            this.f5315b = null;
            this.f5316c = null;
            this.f5318e = null;
            this.f5317d = null;
            this.f5319f = null;
            this.f5314a = null;
            this.f5325l = null;
            this.f5326m = null;
            this.f5327n = null;
            AnimatorSet animatorSet = this.G;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
            }
            this.G = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private int[] b(ViewGroup viewGroup) {
        AdSpacesBean.BuyerBean.PercentPositionBean percentPositionBean;
        int parseInt;
        int parseInt2;
        int parseInt3;
        int[] iArr = new int[4];
        if (viewGroup != null) {
            try {
                percentPositionBean = this.f5319f;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (percentPositionBean != null) {
                String centerX = percentPositionBean.getCenterX();
                String centerY = this.f5319f.getCenterY();
                String width = this.f5319f.getWidth();
                String height = this.f5319f.getHeight();
                if (TextUtils.isEmpty(centerX) || "0".equals(centerX)) {
                    centerX = v.f28122v;
                }
                if (TextUtils.isEmpty(centerY) || "0".equals(centerY)) {
                    centerY = v.f28122v;
                }
                viewGroup.measure(0, 0);
                int px2dip = ViewUtil.px2dip(this.f5314a, viewGroup.getMeasuredWidth());
                int px2dip2 = ViewUtil.px2dip(this.f5314a, viewGroup.getMeasuredHeight());
                if (px2dip <= 0) {
                    px2dip = p.k(this.f5314a);
                }
                l.a("ShakeUtil", "position containerWidth:" + px2dip + ";containerHeight:" + px2dip2 + ";" + viewGroup.getLayoutParams().width + ";" + viewGroup.getLayoutParams().height);
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
                int dip2px = ViewUtil.dip2px(this.f5314a, parseInt3);
                int dip2px2 = ViewUtil.dip2px(this.f5314a, i4);
                int dip2px3 = ViewUtil.dip2px(this.f5314a, parseInt);
                int dip2px4 = ViewUtil.dip2px(this.f5314a, parseInt2);
                iArr[0] = dip2px;
                iArr[1] = dip2px2;
                if (dip2px3 > 0) {
                    iArr[2] = dip2px3;
                }
                if (dip2px4 > 0) {
                    iArr[3] = dip2px4;
                }
                l.a("ShakeUtil", "position widthInt:" + iArr[0] + ";heightInt:" + iArr[1] + ";centerX:" + iArr[2] + ";centerY:" + iArr[3] + ";" + centerX + ";" + centerY);
                return iArr;
            }
        }
        int dip2px5 = ViewUtil.dip2px(this.f5314a, 20.0f);
        int dip2px6 = ViewUtil.dip2px(this.f5314a, 10.0f);
        iArr[0] = dip2px5;
        iArr[1] = dip2px5;
        iArr[2] = dip2px6;
        iArr[3] = dip2px6;
        return iArr;
    }

    private AdSpacesBean.BuyerBean.OrderDataShakeViewBean a(List<AdSpacesBean.BuyerBean.OrderDataShakeViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataShakeViewBean orderDataShakeViewBean : list) {
                List<String> orderList = orderDataShakeViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataShakeViewBean;
                }
            }
        }
        return null;
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (this.f5314a != null && this.I) {
                    final ImageView imageView = new ImageView(this.f5314a);
                    imageView.setVisibility(0);
                    imageView.setImageResource(R.mipmap.beizi_interaction_icon_shake);
                    if (!TextUtils.isEmpty(this.H)) {
                        ImageManager.with(this.f5314a).getCacheBitmap(this.H, new ImageManager.BitmapLoadedListener() { // from class: com.beizi.ad.a.a.e.2
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

    public void b(double d5) {
        this.f5333t = d5;
    }

    public void b(int i4) {
        this.f5335v = i4;
    }

    private void a(ImageView imageView) {
        try {
            ArrayList arrayList = new ArrayList();
            a(imageView, arrayList, Key.ROTATION, 0.0f, this.F);
            a(imageView, arrayList, Key.ROTATION, this.F, 0.0f);
            a(imageView, arrayList, Key.ROTATION, 0.0f, -this.F);
            a(imageView, arrayList, Key.ROTATION, -this.F, 0.0f);
            if (arrayList.size() > 0) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.G = animatorSet;
                animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.beizi.ad.a.a.e.3
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                        try {
                            if (e.this.G != null) {
                                e.this.G.start();
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
                this.G.playSequentially(arrayList);
                this.G.start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private void a(ImageView imageView, List<Animator> list, String str, float f5, float f6) {
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, f5, f6);
            ofFloat.setDuration(this.E);
            list.add(ofFloat);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public int a(int i4) {
        double random = Math.random();
        double d5 = i4;
        Double.isNaN(d5);
        return (int) ((random * d5) + 1.0d);
    }

    public void a(double d5) {
        this.f5332s = d5;
    }

    public void a(a aVar) {
        this.f5327n = aVar;
    }

    private double a(float f5, float f6, float f7) {
        double d5 = f5;
        try {
            double d6 = this.f5320g;
            Double.isNaN(d5);
            double pow = Math.pow(d5 / d6, 2.0d);
            double d7 = f6;
            double d8 = this.f5320g;
            Double.isNaN(d7);
            double pow2 = pow + Math.pow(d7 / d8, 2.0d);
            double d9 = f7;
            double d10 = this.f5320g;
            Double.isNaN(d9);
            return Math.sqrt(pow2 + Math.pow(d9 / d10, 2.0d));
        } catch (Exception e5) {
            e5.printStackTrace();
            return 0.0d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(SensorEvent sensorEvent) {
        float[] fArr;
        try {
            if (System.currentTimeMillis() - this.A >= 100 && sensorEvent != null && this.f5339z && (fArr = sensorEvent.values) != null) {
                this.A = System.currentTimeMillis();
                double a5 = a(fArr[0], fArr[1], fArr[2]);
                if (a5 > this.f5332s) {
                    this.f5331r = this.f5323j;
                } else if (a5 <= this.f5333t && this.f5331r == this.f5323j) {
                    this.f5331r = this.f5324k;
                    this.f5337x++;
                }
                l.b("ShakeUtil", " current: " + String.format("%.4f", Double.valueOf(a5)) + ", execute: " + this.f5337x + ", count: " + this.f5335v + "_" + this.f5336w + ", shake: " + this.f5332s + "_" + this.f5333t);
                int i4 = this.f5335v;
                if (i4 <= 0 || this.f5337x < i4) {
                    return;
                }
                p();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }
}
