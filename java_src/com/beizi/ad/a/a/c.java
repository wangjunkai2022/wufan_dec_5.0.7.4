package com.beizi.ad.a.a;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.beizi.ad.internal.utilities.ViewUtil;
import com.beizi.ad.lance.a.l;
import com.beizi.ad.lance.a.p;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
/* compiled from: RegionClickUtil.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f5267a;

    /* renamed from: b  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.RegionalClickViewBean f5268b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.RegionalClickViewBean f5269c;

    /* renamed from: d  reason: collision with root package name */
    private a f5270d = null;

    /* renamed from: e  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.PercentPositionBean f5271e;

    /* renamed from: f  reason: collision with root package name */
    private String f5272f;

    /* renamed from: g  reason: collision with root package name */
    private String f5273g;

    /* renamed from: h  reason: collision with root package name */
    private double f5274h;

    /* renamed from: i  reason: collision with root package name */
    private String f5275i;

    /* renamed from: j  reason: collision with root package name */
    private int f5276j;

    /* compiled from: RegionClickUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public c(Context context, AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean, String str) {
        this.f5272f = null;
        this.f5273g = null;
        this.f5274h = 0.0d;
        this.f5275i = null;
        this.f5276j = 0;
        try {
            this.f5267a = context;
            this.f5268b = regionalClickViewBean;
            AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean a5 = a(regionalClickViewBean.getOrderData(), str);
            if (a5 != null && a5.getRegionalClickView() != null) {
                this.f5269c = a5.getRegionalClickView();
            }
            AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean2 = this.f5269c;
            if (regionalClickViewBean2 != null) {
                this.f5275i = regionalClickViewBean2.getTitle();
                this.f5271e = this.f5269c.getPosition();
                this.f5272f = this.f5269c.getTitleColor();
                this.f5273g = this.f5269c.getBackgroundColor();
                this.f5274h = this.f5269c.getBackgroundAlpha();
                this.f5276j = this.f5269c.getIsDisableClick();
            } else {
                AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean3 = this.f5268b;
                if (regionalClickViewBean3 != null) {
                    this.f5275i = regionalClickViewBean3.getTitle();
                    this.f5271e = this.f5268b.getPosition();
                    this.f5272f = this.f5268b.getTitleColor();
                    this.f5273g = this.f5268b.getBackgroundColor();
                    this.f5274h = this.f5268b.getBackgroundAlpha();
                    this.f5276j = this.f5268b.getIsDisableClick();
                }
            }
            if (TextUtils.isEmpty(this.f5275i)) {
                this.f5275i = "点击跳转网页或第三方应用";
            }
            if (TextUtils.isEmpty(this.f5273g)) {
                this.f5273g = "#3976FF";
            }
            if (TextUtils.isEmpty(this.f5272f)) {
                this.f5272f = "#FFFFFF";
            }
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
                percentPositionBean = this.f5271e;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            if (percentPositionBean != null) {
                String centerX = percentPositionBean.getCenterX();
                String centerY = this.f5271e.getCenterY();
                String width = this.f5271e.getWidth();
                String height = this.f5271e.getHeight();
                centerX = (TextUtils.isEmpty(centerX) || "0".equals(centerX)) ? "0" : "0";
                centerY = (TextUtils.isEmpty(centerY) || "0".equals(centerY)) ? "0" : "0";
                viewGroup.measure(0, 0);
                int px2dip = ViewUtil.px2dip(this.f5267a, viewGroup.getMeasuredWidth());
                int px2dip2 = ViewUtil.px2dip(this.f5267a, viewGroup.getMeasuredHeight());
                if (px2dip <= 0) {
                    px2dip = p.k(this.f5267a);
                }
                l.a("RegionClickUtil", "position containerWidth:" + px2dip + ";containerHeight:" + px2dip2 + ";" + viewGroup.getLayoutParams().width + ";" + viewGroup.getLayoutParams().height);
                if (TextUtils.isEmpty(width) || "0".equals(width)) {
                    width = String.valueOf(px2dip);
                }
                height = (TextUtils.isEmpty(height) || "0".equals(height)) ? "40" : "40";
                int i4 = 40;
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
                if (width.endsWith("%")) {
                    parseInt3 = (px2dip * Integer.parseInt(width.substring(0, width.indexOf("%")))) / 100;
                } else {
                    parseInt3 = !TextUtils.isEmpty(width) ? Integer.parseInt(width) : 0;
                }
                if (height.endsWith("%")) {
                    i4 = (Integer.parseInt(height.substring(0, height.indexOf("%"))) * parseInt3) / 100;
                } else if (!TextUtils.isEmpty(width)) {
                    i4 = Integer.parseInt(height);
                }
                int dip2px = ViewUtil.dip2px(this.f5267a, parseInt3);
                int dip2px2 = ViewUtil.dip2px(this.f5267a, i4);
                int dip2px3 = ViewUtil.dip2px(this.f5267a, parseInt);
                int dip2px4 = ViewUtil.dip2px(this.f5267a, parseInt2);
                iArr[0] = dip2px;
                iArr[1] = dip2px2;
                if (dip2px3 > 0) {
                    iArr[2] = dip2px3;
                }
                if (dip2px4 > 0) {
                    iArr[3] = dip2px4;
                }
                l.a("RegionClickUtil", "position widthInt:" + iArr[0] + ";heightInt:" + iArr[1] + ";centerX:" + iArr[2] + ";centerY:" + iArr[3] + ";" + centerX + ";" + centerY);
                return iArr;
            }
        }
        int i5 = viewGroup.getLayoutParams().width;
        int dip2px5 = ViewUtil.dip2px(this.f5267a, 40.0f);
        iArr[0] = i5;
        iArr[1] = dip2px5;
        iArr[2] = 0;
        iArr[3] = 0;
        return iArr;
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (this.f5267a == null) {
                    return;
                }
                TextView textView = new TextView(this.f5267a);
                textView.setVisibility(0);
                textView.setLines(1);
                textView.setGravity(17);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f5276j == 0) {
                    textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.ad.a.a.c.1

                        /* renamed from: a  reason: collision with root package name */
                        float f5277a;

                        /* renamed from: b  reason: collision with root package name */
                        float f5278b;

                        /* renamed from: c  reason: collision with root package name */
                        float f5279c;

                        /* renamed from: d  reason: collision with root package name */
                        float f5280d;

                        /* renamed from: e  reason: collision with root package name */
                        float f5281e;

                        /* renamed from: f  reason: collision with root package name */
                        float f5282f;

                        @Override // android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            int action = motionEvent.getAction();
                            if (action == 0) {
                                this.f5277a = motionEvent.getX();
                                this.f5278b = motionEvent.getY();
                                this.f5279c = motionEvent.getRawX();
                                this.f5280d = motionEvent.getRawY();
                                this.f5281e = motionEvent.getX();
                                this.f5282f = motionEvent.getY();
                            } else if (action != 1) {
                                if (action == 2) {
                                    this.f5281e = motionEvent.getX();
                                    this.f5282f = motionEvent.getY();
                                }
                            } else if (Math.abs(this.f5281e - this.f5277a) <= 15.0f && Math.abs(this.f5282f - this.f5278b) <= 15.0f && c.this.f5270d != null) {
                                c.this.f5270d.a(String.valueOf(this.f5277a), String.valueOf(this.f5278b), String.valueOf(this.f5279c), String.valueOf(this.f5280d), String.valueOf(this.f5277a), String.valueOf(this.f5278b), String.valueOf(this.f5279c), String.valueOf(this.f5280d));
                            }
                            return true;
                        }
                    });
                }
                if (!TextUtils.isEmpty(this.f5275i)) {
                    textView.setText(this.f5275i);
                }
                if (TextUtils.isEmpty(this.f5272f)) {
                    this.f5272f = "#FFFFFF";
                }
                if (!TextUtils.isEmpty(this.f5272f) && this.f5272f.startsWith("#")) {
                    textView.setTextColor(Color.parseColor(this.f5272f));
                }
                if (TextUtils.isEmpty(this.f5273g)) {
                    this.f5273g = "#80000000";
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                if (!TextUtils.isEmpty(this.f5273g) && this.f5273g.startsWith("#")) {
                    gradientDrawable.setColor(Color.parseColor(this.f5273g));
                }
                double d5 = this.f5274h;
                if (d5 > 0.0d) {
                    gradientDrawable.setAlpha((int) (d5 * 255.0d));
                }
                gradientDrawable.setCornerRadius(ViewUtil.dip2px(this.f5267a, 7.0f));
                textView.setBackgroundDrawable(gradientDrawable);
                int[] b5 = b(viewGroup);
                try {
                    textView.setTextSize(2, (float) (b5[1] > 0 ? ViewUtil.px2dip(this.f5267a, b5[1]) / 3 : 14.0d));
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
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
                    viewGroup.addView(textView, layoutParams);
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
                    viewGroup.addView(textView, layoutParams2);
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
                    viewGroup.addView(textView, layoutParams3);
                } else {
                    ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, -2);
                    if (b5[0] > 0) {
                        layoutParams4.width = b5[0];
                    }
                    if (b5[1] > 0) {
                        layoutParams4.height = b5[1];
                    }
                    viewGroup.addView(textView, layoutParams4);
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    public void a(a aVar) {
        this.f5270d = aVar;
    }

    private AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean a(List<AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataRegionalClickViewBean orderDataRegionalClickViewBean : list) {
                List<String> orderList = orderDataRegionalClickViewBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataRegionalClickViewBean;
                }
            }
        }
        return null;
    }

    public void a() {
        this.f5268b = null;
        this.f5269c = null;
        this.f5271e = null;
        this.f5270d = null;
        this.f5267a = null;
    }
}
