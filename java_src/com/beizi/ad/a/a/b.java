package com.beizi.ad.a.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.List;
/* compiled from: FullScreenClickUtil.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private Context f5253a;

    /* renamed from: b  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.FullScreenClickBean f5254b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.FullScreenClickBean f5255c;

    /* renamed from: e  reason: collision with root package name */
    private int f5257e;

    /* renamed from: d  reason: collision with root package name */
    private a f5256d = null;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5258f = false;

    /* compiled from: FullScreenClickUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public b(Context context, AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClickBean, String str) {
        this.f5253a = context;
        this.f5254b = fullScreenClickBean;
        AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean a5 = a(fullScreenClickBean.getOrderData(), str);
        if (a5 != null && a5.getFullScreenClick() != null) {
            this.f5255c = a5.getFullScreenClick();
        }
        AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClickBean2 = this.f5255c;
        if (fullScreenClickBean2 != null) {
            this.f5257e = fullScreenClickBean2.getRandomClickNum();
            return;
        }
        AdSpacesBean.BuyerBean.FullScreenClickBean fullScreenClickBean3 = this.f5254b;
        if (fullScreenClickBean3 != null) {
            this.f5257e = fullScreenClickBean3.getRandomClickNum();
        }
    }

    public void a(View view, final a aVar) {
        if (view == null || aVar == null || !a(this.f5257e)) {
            return;
        }
        this.f5258f = true;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.ad.a.a.b.1

            /* renamed from: a  reason: collision with root package name */
            float f5259a;

            /* renamed from: b  reason: collision with root package name */
            float f5260b;

            /* renamed from: c  reason: collision with root package name */
            float f5261c;

            /* renamed from: d  reason: collision with root package name */
            float f5262d;

            /* renamed from: e  reason: collision with root package name */
            float f5263e;

            /* renamed from: f  reason: collision with root package name */
            float f5264f;

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                a aVar2;
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f5259a = motionEvent.getX();
                    this.f5260b = motionEvent.getY();
                    this.f5261c = motionEvent.getRawX();
                    this.f5262d = motionEvent.getRawY();
                    this.f5263e = motionEvent.getX();
                    this.f5264f = motionEvent.getY();
                } else if (action != 1) {
                    if (action == 2) {
                        this.f5263e = motionEvent.getX();
                        this.f5264f = motionEvent.getY();
                    }
                } else if (Math.abs(this.f5263e - this.f5259a) <= 15.0f && Math.abs(this.f5264f - this.f5260b) <= 15.0f && (aVar2 = aVar) != null) {
                    aVar2.a(String.valueOf(this.f5259a), String.valueOf(this.f5260b), String.valueOf(this.f5261c), String.valueOf(this.f5262d), String.valueOf(this.f5259a), String.valueOf(this.f5260b), String.valueOf(this.f5261c), String.valueOf(this.f5262d));
                }
                return true;
            }
        });
    }

    public void b() {
        this.f5254b = null;
        this.f5255c = null;
        this.f5256d = null;
        this.f5253a = null;
    }

    public static boolean a(int i4) {
        return ((int) ((Math.random() * 100.0d) + 1.0d)) <= i4;
    }

    private AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean a(List<AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean> list, String str) {
        if (list != null && str != null) {
            for (AdSpacesBean.BuyerBean.OrderDataFullScreenClickBean orderDataFullScreenClickBean : list) {
                List<String> orderList = orderDataFullScreenClickBean.getOrderList();
                if (orderList != null && orderList.contains(str)) {
                    return orderDataFullScreenClickBean;
                }
            }
        }
        return null;
    }

    public boolean a() {
        return this.f5258f;
    }
}
