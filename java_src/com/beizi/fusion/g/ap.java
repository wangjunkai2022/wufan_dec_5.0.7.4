package com.beizi.fusion.g;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.ScrollClickView;
/* compiled from: ScrollClickUtil.java */
/* loaded from: classes2.dex */
public class ap {

    /* renamed from: j  reason: collision with root package name */
    private static AdSpacesBean.BuyerBean.ScrollClickBean f6902j;

    /* renamed from: a  reason: collision with root package name */
    ScrollClickView f6903a;

    /* renamed from: b  reason: collision with root package name */
    int f6904b;

    /* renamed from: c  reason: collision with root package name */
    int f6905c;

    /* renamed from: d  reason: collision with root package name */
    private Context f6906d;

    /* renamed from: e  reason: collision with root package name */
    private int f6907e;

    /* renamed from: f  reason: collision with root package name */
    private int f6908f;

    /* renamed from: g  reason: collision with root package name */
    private a f6909g = null;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6910h = false;

    /* renamed from: i  reason: collision with root package name */
    private int f6911i = 200;

    /* compiled from: ScrollClickUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);

        void c_();
    }

    public ap(Context context) {
        this.f6906d = context;
    }

    private void c() {
        Pair<Integer, Boolean> c5 = c(this.f6908f);
        if (((Boolean) c5.second).booleanValue()) {
            aa.a(new Runnable() { // from class: com.beizi.fusion.g.ap.1
                @Override // java.lang.Runnable
                public void run() {
                    ap.this.a();
                }
            }, this.f6907e + (((Integer) c5.first).intValue() * 10));
        }
    }

    public void b(int i4) {
        this.f6908f = i4;
        c();
    }

    public void a(AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean) {
        if (scrollClickBean == null) {
            return;
        }
        f6902j = scrollClickBean;
        a(scrollClickBean.getRandomClickTime());
        b(scrollClickBean.getRandomClickNum());
    }

    public void b() {
        this.f6910h = false;
        ScrollClickView scrollClickView = this.f6903a;
        if (scrollClickView != null) {
            scrollClickView.stopAnim();
        }
        this.f6909g = null;
        this.f6906d = null;
        this.f6903a = null;
        this.f6911i = 200;
    }

    public void a(int i4) {
        this.f6907e = i4;
    }

    public static Pair<Integer, Boolean> c(int i4) {
        int random = (int) ((Math.random() * 100.0d) + 1.0d);
        if (random <= i4) {
            return new Pair<>(Integer.valueOf(random), Boolean.TRUE);
        }
        return new Pair<>(Integer.valueOf(random), Boolean.FALSE);
    }

    public void a(a aVar) {
        this.f6909g = aVar;
    }

    protected void a() {
        StringBuilder sb = new StringBuilder();
        sb.append("enter callBackShakeHappened and mShakeStateListener != null ? ");
        sb.append(this.f6909g != null);
        sb.append(",!isCallBack = ");
        sb.append(!this.f6910h);
        af.a("ScrollClickUtil", sb.toString());
        if (this.f6909g == null || this.f6910h) {
            return;
        }
        af.a("ScrollClickUtil", "callback onShakeHappened()");
        this.f6909g.b("100", "200", "105", "206", "100", "200", "105", "206");
        this.f6910h = true;
        ScrollClickView scrollClickView = this.f6903a;
        if (scrollClickView != null) {
            scrollClickView.stopAnim();
        }
    }

    public View a(final int i4, final int i5, AdSpacesBean.BuyerBean.ScrollClickPositionBean scrollClickPositionBean) {
        int parseInt;
        int parseInt2;
        af.a("ScrollClickUtil", "enter getScrollClick");
        if (this.f6906d == null || scrollClickPositionBean == null) {
            return null;
        }
        ScrollClickView scrollClickView = new ScrollClickView(this.f6906d);
        this.f6903a = scrollClickView;
        try {
            AdSpacesBean.BuyerBean.ScrollClickBean scrollClickBean = f6902j;
            if (scrollClickBean != null) {
                scrollClickView.setScrollDirection(scrollClickBean.getScrollDirection());
                this.f6903a.setTitleText(f6902j.getTitle());
                this.f6903a.setTitleFont(f6902j.getTitleFont());
                this.f6903a.setDetailText(f6902j.getDetails());
                this.f6903a.setDetailsFont(f6902j.getDetailsFont());
                AdSpacesBean.BuyerBean.ScrollClickPositionBean position = f6902j.getPosition();
                String width = position.getWidth();
                String height = position.getHeight();
                if (width.endsWith("%")) {
                    parseInt = (Integer.parseInt(width.substring(0, width.indexOf("%"))) * i4) / 100;
                } else {
                    parseInt = Integer.parseInt(width);
                }
                if (height.endsWith("%")) {
                    parseInt2 = (Integer.parseInt(height.substring(0, height.indexOf("%"))) * parseInt) / 100;
                } else {
                    parseInt2 = Integer.parseInt(height);
                }
                this.f6903a.setHandWidth(parseInt);
                this.f6903a.setScrollbarHeight(parseInt2);
                this.f6903a.buildRealView();
            }
            String top = scrollClickPositionBean.getTop();
            String centerX = scrollClickPositionBean.getCenterX();
            centerX = (TextUtils.isEmpty(centerX) || "0".equals(centerX)) ? "50%" : "50%";
            top = (TextUtils.isEmpty(top) || "0".equals(top)) ? "50%" : "50%";
            av.j(this.f6906d);
            if (centerX.endsWith("%")) {
                this.f6904b = (Integer.parseInt(centerX.substring(0, centerX.indexOf("%"))) * i4) / 100;
            } else {
                this.f6904b = Integer.parseInt(centerX);
            }
            if (top.endsWith("%")) {
                this.f6905c = (Integer.parseInt(top.substring(0, top.indexOf("%"))) * i5) / 100;
            } else {
                this.f6905c = Integer.parseInt(top);
            }
            this.f6904b = av.a(this.f6906d, this.f6904b);
            this.f6905c = av.a(this.f6906d, this.f6905c);
            final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            af.a("ScrollClickUtil", "topInt = " + this.f6905c + ",centerXInt = " + this.f6904b + ",adWidthDp = " + i4 + ",adHeightDp = " + i5);
            this.f6903a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.beizi.fusion.g.ap.2
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    ScrollClickView scrollClickView2 = ap.this.f6903a;
                    if (scrollClickView2 == null) {
                        return;
                    }
                    scrollClickView2.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    int measuredWidth = ap.this.f6903a.getMeasuredWidth();
                    ap apVar = ap.this;
                    if (apVar.f6905c == 0) {
                        apVar.f6905c = av.a(apVar.f6906d, i5) / 2;
                    }
                    ap apVar2 = ap.this;
                    if (apVar2.f6904b == 0) {
                        apVar2.f6904b = av.a(apVar2.f6906d, i4) / 2;
                    }
                    FrameLayout.LayoutParams layoutParams2 = layoutParams;
                    ap apVar3 = ap.this;
                    layoutParams2.topMargin = apVar3.f6905c;
                    layoutParams2.leftMargin = apVar3.f6904b - (measuredWidth / 2);
                    apVar3.f6903a.setLayoutParams(layoutParams2);
                    af.a("ScrollClickUtil", "topMargin = " + layoutParams.topMargin + ",leftMargin = " + layoutParams.leftMargin + ",scrollViewWidthInt = " + measuredWidth);
                }
            });
            this.f6903a.setLayoutParams(layoutParams);
            this.f6903a.postDelayed(new Runnable() { // from class: com.beizi.fusion.g.ap.3
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ScrollClickView scrollClickView2 = ap.this.f6903a;
                        if (scrollClickView2 != null) {
                            scrollClickView2.startAnim();
                        }
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                }
            }, 10L);
        } catch (NumberFormatException e5) {
            e5.printStackTrace();
        }
        return this.f6903a;
    }
}
