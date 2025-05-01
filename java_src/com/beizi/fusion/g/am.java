package com.beizi.fusion.g;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.beizi.fusion.model.AdSpacesBean;
import com.beizi.fusion.widget.RegionClickView;
/* compiled from: RegionClickUtil.java */
/* loaded from: classes2.dex */
public class am {

    /* renamed from: d  reason: collision with root package name */
    private static String f6867d;

    /* renamed from: e  reason: collision with root package name */
    private static String f6868e;

    /* renamed from: f  reason: collision with root package name */
    private static String f6869f;

    /* renamed from: g  reason: collision with root package name */
    private static String f6870g;

    /* renamed from: a  reason: collision with root package name */
    private Context f6871a;

    /* renamed from: b  reason: collision with root package name */
    private a f6872b;

    /* renamed from: c  reason: collision with root package name */
    private AdSpacesBean.BuyerBean.RegionalClickViewBean f6873c = null;

    /* compiled from: RegionClickUtil.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8);
    }

    public am(Context context) {
        this.f6871a = context;
    }

    public void a(AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean) {
        this.f6873c = regionalClickViewBean;
    }

    public View a(int i4, int i5, AdSpacesBean.BuyerBean.PercentPositionBean percentPositionBean, boolean z4) {
        if (this.f6871a == null || percentPositionBean == null) {
            return null;
        }
        af.c("BeiZis", "adWidthDp = " + i4 + ",adHeightDp = " + i5);
        RegionClickView regionClickView = new RegionClickView(this.f6871a);
        AdSpacesBean.BuyerBean.RegionalClickViewBean regionalClickViewBean = this.f6873c;
        if (regionalClickViewBean != null) {
            regionClickView.setRegionalClickViewBean(regionalClickViewBean);
        }
        regionClickView.setLayoutParams(a(i4, i5, percentPositionBean));
        if (z4) {
            regionClickView.setOnClickListener(new View.OnClickListener() { // from class: com.beizi.fusion.g.am.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (am.this.f6872b != null) {
                        am.this.f6872b.a(am.f6867d, am.f6868e, am.f6869f, am.f6870g, am.f6867d, am.f6868e, am.f6869f, am.f6870g);
                    }
                }
            });
            regionClickView.setOnTouchListener(new View.OnTouchListener() { // from class: com.beizi.fusion.g.am.2
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    try {
                        if (motionEvent.getAction() == 0) {
                            String unused = am.f6867d = motionEvent.getX() + "";
                            String unused2 = am.f6868e = motionEvent.getY() + "";
                            String unused3 = am.f6869f = motionEvent.getRawX() + "";
                            String unused4 = am.f6870g = motionEvent.getRawY() + "";
                            return false;
                        }
                        return false;
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return false;
                    }
                }
            });
        }
        return regionClickView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00fd, code lost:
        if (r2 >= 400) goto L29;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.ViewGroup.MarginLayoutParams a(int r11, int r12, com.beizi.fusion.model.AdSpacesBean.BuyerBean.PercentPositionBean r13) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.g.am.a(int, int, com.beizi.fusion.model.AdSpacesBean$BuyerBean$PercentPositionBean):android.view.ViewGroup$MarginLayoutParams");
    }

    public void a(a aVar) {
        this.f6872b = aVar;
    }

    public void a() {
        this.f6871a = null;
        this.f6873c = null;
    }
}
