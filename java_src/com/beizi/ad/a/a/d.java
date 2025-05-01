package com.beizi.ad.a.a;

import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.beizi.ad.R;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.p;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.ScrollClickView;
import com.join.mgps.Util.v;
import java.util.List;
/* compiled from: ScrollUtil.java */
/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private Context f5284a;

    /* renamed from: b  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.ScrollClickBean f5285b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.ScrollClickBean f5286c;

    /* renamed from: d  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.ScrollClickPositionBean f5287d;

    /* renamed from: f  reason: collision with root package name */
    private View f5289f;

    /* renamed from: g  reason: collision with root package name */
    private String f5290g;

    /* renamed from: l  reason: collision with root package name */
    private int f5295l;

    /* renamed from: m  reason: collision with root package name */
    private ValueAnimator f5296m;

    /* renamed from: n  reason: collision with root package name */
    private int f5297n;

    /* renamed from: o  reason: collision with root package name */
    private ImageView f5298o;

    /* renamed from: p  reason: collision with root package name */
    private ImageView f5299p;

    /* renamed from: q  reason: collision with root package name */
    private ImageView f5300q;

    /* renamed from: u  reason: collision with root package name */
    private LinearLayout f5304u;

    /* renamed from: e  reason: collision with root package name */
    private a f5288e = null;

    /* renamed from: h  reason: collision with root package name */
    private String f5291h = "up";

    /* renamed from: i  reason: collision with root package name */
    private String f5292i = ScrollClickView.DIR_DOWN;

    /* renamed from: j  reason: collision with root package name */
    private String f5293j = ScrollClickView.DIR_LEFT;

    /* renamed from: k  reason: collision with root package name */
    private String f5294k = ScrollClickView.DIR_RIGHT;

    /* renamed from: r  reason: collision with root package name */
    private String f5301r = "#9CBBFF";

    /* renamed from: s  reason: collision with root package name */
    private String f5302s = "#C1D4FF";

    /* renamed from: t  reason: collision with root package name */
    private String f5303t = "#FFFFFF";

    /* compiled from: ScrollUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

        void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public d(Context context, AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean, String str, String str2) {
        try {
            this.f5284a = context;
            this.f5285b = scrollClickBean;
            AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean a5 = a(scrollClickBean.getOrderData(), str2);
            if (a5 != null && a5.getScrollClick() != null) {
                this.f5286c = a5.getScrollClick();
            }
            AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean2 = this.f5286c;
            if (scrollClickBean2 != null) {
                this.f5290g = scrollClickBean2.getScrollDirection();
                this.f5295l = this.f5286c.getScrollDistance();
                this.f5287d = this.f5286c.getPosition();
                return;
            }
            AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean3 = this.f5285b;
            if (scrollClickBean3 != null) {
                this.f5290g = scrollClickBean3.getScrollDirection();
                this.f5295l = this.f5285b.getScrollDistance();
                this.f5287d = this.f5285b.getPosition();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    static /* synthetic */ int h(d dVar) {
        int i4 = dVar.f5297n;
        dVar.f5297n = i4 + 1;
        return i4;
    }

    private void b() {
        this.f5304u.setGravity(17);
        int i4 = this.f5304u.getLayoutParams().width;
        int i5 = this.f5304u.getLayoutParams().height;
        this.f5298o = new ImageView(this.f5284a);
        this.f5299p = new ImageView(this.f5284a);
        this.f5300q = new ImageView(this.f5284a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (this.f5291h.equals(this.f5290g)) {
            this.f5304u.setOrientation(1);
            ImageView imageView = this.f5298o;
            int i6 = R.mipmap.beizi_interaction_icon_arrow_up;
            imageView.setImageResource(i6);
            this.f5299p.setImageResource(i6);
            this.f5300q.setImageResource(i6);
            this.f5298o.setColorFilter(Color.parseColor(this.f5301r));
            this.f5299p.setColorFilter(Color.parseColor(this.f5302s));
            this.f5300q.setColorFilter(Color.parseColor(this.f5303t));
            layoutParams.width = i4;
            layoutParams.height = i5 / 3;
        } else if (this.f5292i.equals(this.f5290g)) {
            this.f5304u.setOrientation(1);
            ImageView imageView2 = this.f5298o;
            int i7 = R.mipmap.beizi_interaction_icon_arrow_down;
            imageView2.setImageResource(i7);
            this.f5299p.setImageResource(i7);
            this.f5300q.setImageResource(i7);
            this.f5298o.setColorFilter(Color.parseColor(this.f5303t));
            this.f5299p.setColorFilter(Color.parseColor(this.f5302s));
            this.f5300q.setColorFilter(Color.parseColor(this.f5301r));
            layoutParams.width = i4;
            layoutParams.height = i5 / 3;
        } else if (this.f5293j.equals(this.f5290g)) {
            this.f5304u.setOrientation(0);
            ImageView imageView3 = this.f5298o;
            int i8 = R.mipmap.beizi_interaction_icon_arrow_left;
            imageView3.setImageResource(i8);
            this.f5299p.setImageResource(i8);
            this.f5300q.setImageResource(i8);
            this.f5298o.setColorFilter(Color.parseColor(this.f5301r));
            this.f5299p.setColorFilter(Color.parseColor(this.f5302s));
            this.f5300q.setColorFilter(Color.parseColor(this.f5303t));
            layoutParams.width = i4 / 3;
            layoutParams.height = i5;
        } else if (this.f5294k.equals(this.f5290g)) {
            this.f5304u.setOrientation(0);
            ImageView imageView4 = this.f5298o;
            int i9 = R.mipmap.beizi_interaction_icon_arrow_right;
            imageView4.setImageResource(i9);
            this.f5299p.setImageResource(i9);
            this.f5300q.setImageResource(i9);
            this.f5298o.setColorFilter(Color.parseColor(this.f5303t));
            this.f5299p.setColorFilter(Color.parseColor(this.f5302s));
            this.f5300q.setColorFilter(Color.parseColor(this.f5301r));
            layoutParams.width = i4 / 3;
            layoutParams.height = i5;
        }
        this.f5304u.addView(this.f5298o, layoutParams);
        this.f5304u.addView(this.f5299p, layoutParams);
        this.f5304u.addView(this.f5300q, layoutParams);
    }

    private void c() {
        View view = this.f5289f;
        if (view == null) {
            return;
        }
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.ad.a.a.d.1

            /* renamed from: a  reason: collision with root package name */
            float f5305a;

            /* renamed from: b  reason: collision with root package name */
            float f5306b;

            /* renamed from: c  reason: collision with root package name */
            float f5307c;

            /* renamed from: d  reason: collision with root package name */
            float f5308d;

            /* renamed from: e  reason: collision with root package name */
            float f5309e;

            /* renamed from: f  reason: collision with root package name */
            float f5310f;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f5305a = motionEvent.getX();
                    this.f5306b = motionEvent.getY();
                    this.f5307c = motionEvent.getX();
                    this.f5308d = motionEvent.getY();
                    this.f5309e = motionEvent.getRawX();
                    this.f5310f = motionEvent.getRawY();
                } else if (action == 1) {
                    l.b("BeiZisAd", "mCurPosX = " + this.f5307c + ",mCurPosY = " + this.f5308d + ",mPosX = " + this.f5305a + ",mPosY = " + this.f5306b);
                    float f5 = this.f5308d;
                    float f6 = this.f5306b;
                    if (f5 - f6 > 0.0f && Math.abs(f5 - f6) > d.this.f5295l) {
                        if (d.this.f5292i.equalsIgnoreCase(d.this.f5290g) && d.this.f5288e != null) {
                            d.this.f5288e.a(this.f5305a + "", this.f5306b + "", this.f5309e + "", this.f5310f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                        }
                    } else {
                        float f7 = this.f5308d;
                        float f8 = this.f5306b;
                        if (f7 - f8 < 0.0f && Math.abs(f7 - f8) > d.this.f5295l) {
                            if (d.this.f5291h.equalsIgnoreCase(d.this.f5290g) && d.this.f5288e != null) {
                                d.this.f5288e.a(this.f5305a + "", this.f5306b + "", this.f5309e + "", this.f5310f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                            }
                        } else {
                            float f9 = this.f5307c;
                            float f10 = this.f5305a;
                            if (f9 - f10 < 0.0f && Math.abs(f9 - f10) > d.this.f5295l) {
                                if (d.this.f5293j.equalsIgnoreCase(d.this.f5290g) && d.this.f5288e != null) {
                                    d.this.f5288e.a(this.f5305a + "", this.f5306b + "", this.f5309e + "", this.f5310f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                                }
                            } else {
                                float f11 = this.f5307c;
                                float f12 = this.f5305a;
                                if (f11 - f12 > 0.0f && Math.abs(f11 - f12) > d.this.f5295l) {
                                    if (d.this.f5294k.equalsIgnoreCase(d.this.f5290g) && d.this.f5288e != null) {
                                        d.this.f5288e.a(this.f5305a + "", this.f5306b + "", this.f5309e + "", this.f5310f + "", motionEvent.getX() + "", motionEvent.getY() + "", motionEvent.getRawX() + "", motionEvent.getRawY() + "");
                                    }
                                } else if (Math.abs(this.f5307c - this.f5305a) <= 15.0f && Math.abs(this.f5308d - this.f5306b) <= 15.0f && d.this.f5288e != null) {
                                    d.this.f5288e.b(this.f5305a + "", this.f5306b + "", this.f5309e + "", this.f5310f + "", this.f5305a + "", this.f5306b + "", this.f5309e + "", this.f5310f + "");
                                }
                            }
                        }
                    }
                } else if (action == 2) {
                    this.f5307c = motionEvent.getX();
                    this.f5308d = motionEvent.getY();
                }
                return true;
            }
        });
    }

    private void d() {
        try {
            ValueAnimator ofInt = ValueAnimator.ofInt(10, 0);
            this.f5296m = ofInt;
            ofInt.setDuration(500L);
            this.f5296m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.beizi.ad.a.a.d.2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                }
            });
            this.f5296m.addListener(new AnimatorListenerAdapter() { // from class: com.beizi.ad.a.a.d.3
                /* JADX WARN: Removed duplicated region for block: B:32:0x01f0 A[Catch: Exception -> 0x0208, TryCatch #0 {Exception -> 0x0208, blocks: (B:3:0x0007, B:5:0x0021, B:8:0x0035, B:10:0x0047, B:30:0x01e8, B:32:0x01f0, B:33:0x01f6, B:35:0x01fe, B:12:0x0059, B:14:0x0061, B:15:0x009c, B:17:0x00a4, B:18:0x00df, B:20:0x00e7, B:21:0x0122, B:23:0x012a, B:24:0x0165, B:26:0x016d, B:27:0x01a7, B:29:0x01af), top: B:40:0x0007 }] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x01fe A[Catch: Exception -> 0x0208, TRY_LEAVE, TryCatch #0 {Exception -> 0x0208, blocks: (B:3:0x0007, B:5:0x0021, B:8:0x0035, B:10:0x0047, B:30:0x01e8, B:32:0x01f0, B:33:0x01f6, B:35:0x01fe, B:12:0x0059, B:14:0x0061, B:15:0x009c, B:17:0x00a4, B:18:0x00df, B:20:0x00e7, B:21:0x0122, B:23:0x012a, B:24:0x0165, B:26:0x016d, B:27:0x01a7, B:29:0x01af), top: B:40:0x0007 }] */
                /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void onAnimationEnd(android.animation.Animator r5) {
                    /*
                        Method dump skipped, instructions count: 525
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.beizi.ad.a.a.d.AnonymousClass3.onAnimationEnd(android.animation.Animator):void");
                }
            });
            ValueAnimator valueAnimator = this.f5296m;
            if (valueAnimator != null) {
                valueAnimator.start();
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (this.f5284a == null) {
                    return;
                }
                this.f5304u = new LinearLayout(this.f5284a);
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
                    viewGroup.addView(this.f5304u, layoutParams);
                } else if (viewGroup instanceof FrameLayout) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
                    if (b5[0] > 0) {
                        layoutParams2.width = b5[0];
                    }
                    if (b5[1] > 0) {
                        layoutParams2.height = b5[1];
                    }
                    layoutParams2.leftMargin = b5[2];
                    layoutParams2.topMargin = b5[3];
                    viewGroup.addView(this.f5304u, layoutParams2);
                } else if (viewGroup instanceof LinearLayout) {
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    if (b5[0] > 0) {
                        layoutParams3.width = b5[0];
                    }
                    if (b5[1] > 0) {
                        layoutParams3.height = b5[1];
                    }
                    layoutParams3.leftMargin = b5[2];
                    layoutParams3.topMargin = b5[3];
                    viewGroup.addView(this.f5304u, layoutParams3);
                } else {
                    ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -2);
                    if (b5[0] > 0) {
                        layoutParams4.width = b5[0];
                    }
                    if (b5[1] > 0) {
                        layoutParams4.height = b5[1];
                    }
                    viewGroup.addView(this.f5304u, layoutParams4);
                }
                b();
                d();
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    public void a(View view, a aVar) {
        this.f5289f = view;
        this.f5288e = aVar;
        c();
    }

    private AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean a(List<AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataScrollViewOrderBean orderDataScrollViewOrderBean : list) {
                List<String> orderList = orderDataScrollViewOrderBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataScrollViewOrderBean;
                }
            }
        }
        return null;
    }

    public void a() {
        try {
            this.f5289f = null;
            this.f5288e = null;
            this.f5286c = null;
            this.f5285b = null;
            ValueAnimator valueAnimator = this.f5296m;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.f5296m.removeAllListeners();
            }
            this.f5296m = null;
            this.f5298o = null;
            this.f5299p = null;
            this.f5300q = null;
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    private int[] b(ViewGroup viewGroup) {
        AdSpacesBean.BuyerBean.ScrollClickPositionBean scrollClickPositionBean;
        int parseInt;
        int parseInt2;
        int parseInt3;
        int[] iArr = new int[4];
        if (viewGroup != null) {
            try {
                scrollClickPositionBean = this.f5287d;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (scrollClickPositionBean != null) {
                String centerX = scrollClickPositionBean.getCenterX();
                String top = this.f5287d.getTop();
                String width = this.f5287d.getWidth();
                String height = this.f5287d.getHeight();
                if (TextUtils.isEmpty(centerX) || "0".equals(centerX)) {
                    centerX = v.f28122v;
                }
                if (TextUtils.isEmpty(top) || "0".equals(top)) {
                    top = v.f28122v;
                }
                viewGroup.measure(0, 0);
                int px2dip = ViewUtil.px2dip(this.f5284a, viewGroup.getMeasuredWidth());
                int px2dip2 = ViewUtil.px2dip(this.f5284a, viewGroup.getMeasuredHeight());
                if (px2dip <= 0) {
                    px2dip = p.k(this.f5284a);
                }
                l.a("ScrollUtil", "position containerWidth:" + px2dip + ";containerHeight:" + px2dip2 + ";" + viewGroup.getLayoutParams().width + ";" + viewGroup.getLayoutParams().height);
                width = (TextUtils.isEmpty(width) || "0".equals(width)) ? "20" : "20";
                height = (TextUtils.isEmpty(height) || "0".equals(height)) ? "20" : "20";
                if (centerX.endsWith("%")) {
                    parseInt = (Integer.parseInt(centerX.substring(0, centerX.indexOf("%"))) * px2dip) / 100;
                } else {
                    parseInt = !TextUtils.isEmpty(centerX) ? Integer.parseInt(centerX) : 0;
                }
                if (top.endsWith("%")) {
                    parseInt2 = (px2dip2 * Integer.parseInt(top.substring(0, top.indexOf("%")))) / 100;
                } else {
                    parseInt2 = !TextUtils.isEmpty(top) ? Integer.parseInt(top) : 0;
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
                int dip2px = ViewUtil.dip2px(this.f5284a, parseInt3);
                int dip2px2 = ViewUtil.dip2px(this.f5284a, i4);
                int dip2px3 = ViewUtil.dip2px(this.f5284a, parseInt);
                int dip2px4 = ViewUtil.dip2px(this.f5284a, parseInt2);
                iArr[0] = dip2px;
                iArr[1] = dip2px2;
                if (dip2px3 > 0) {
                    iArr[2] = dip2px3;
                }
                if (dip2px4 > 0) {
                    iArr[3] = dip2px4;
                }
                l.a("ScrollUtil", "position widthInt:" + iArr[0] + ";heightInt:" + iArr[1] + ";centerX:" + iArr[2] + ";centerY:" + iArr[3] + ";" + centerX + ";" + top);
                return iArr;
            }
        }
        int dip2px5 = ViewUtil.dip2px(this.f5284a, 20.0f);
        int dip2px6 = ViewUtil.dip2px(this.f5284a, 10.0f);
        iArr[0] = dip2px5;
        iArr[1] = dip2px5;
        iArr[2] = dip2px6;
        iArr[3] = dip2px6;
        return iArr;
    }
}
