package com.beizi.fusion.d.a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.beizi.fusion.d.a.b;
import com.beizi.fusion.d.a.c;
import com.beizi.fusion.g.ab;
import com.beizi.fusion.g.ad;
import com.beizi.fusion.g.af;
import com.beizi.fusion.g.au;
import com.beizi.fusion.g.d;
import com.beizi.fusion.g.l;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: BidS2SRequest.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private InterfaceC0187a f6595a;

    /* renamed from: b  reason: collision with root package name */
    private String f6596b = "1002";

    /* renamed from: c  reason: collision with root package name */
    private String f6597c = "不出价";

    /* renamed from: d  reason: collision with root package name */
    private String f6598d = "1003";

    /* renamed from: e  reason: collision with root package name */
    private String f6599e = "网络错误";

    /* renamed from: f  reason: collision with root package name */
    private String f6600f = "1004";

    /* renamed from: g  reason: collision with root package name */
    private String f6601g = "未找到渠道buyer";

    /* compiled from: BidS2SRequest.java */
    /* renamed from: com.beizi.fusion.d.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0187a {
        void a();

        void a(AdSpacesBean.ForwardBean forwardBean, AdSpacesBean.BuyerBean buyerBean, String str, double d5);

        void a(String str, int i4);

        void a(String str, String str2, String str3, int i4);
    }

    public a(InterfaceC0187a interfaceC0187a) {
        this.f6595a = interfaceC0187a;
    }

    public void a(final Context context, final String str, final String str2, final List<AdSpacesBean.ForwardBean> list, final List<AdSpacesBean.BuyerBean> list2, final int i4) {
        if (this.f6595a == null) {
            return;
        }
        if (context != null && i4 > 0 && !list.isEmpty() && !list2.isEmpty()) {
            for (AdSpacesBean.ForwardBean forwardBean : list) {
                AdSpacesBean.BuyerBean a5 = com.beizi.fusion.f.b.a(forwardBean.getBuyerId(), list2, forwardBean.getBuyerSpaceUuId());
                if (a5 != null && "S2S".equalsIgnoreCase(a5.getBidType())) {
                    this.f6595a.a(a5.getBuyerSpaceUuId(), 18);
                }
            }
            l.a().execute(new Runnable() { // from class: com.beizi.fusion.d.a.a.1
                /* JADX WARN: Removed duplicated region for block: B:28:0x0089 A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:31:0x001a A[SYNTHETIC] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r12 = this;
                        java.util.ArrayList r6 = new java.util.ArrayList
                        r6.<init>()
                        java.util.ArrayList r4 = new java.util.ArrayList
                        r4.<init>()
                        java.util.ArrayList r5 = new java.util.ArrayList
                        r5.<init>()
                        java.util.ArrayList r7 = new java.util.ArrayList
                        r7.<init>()
                        java.util.List r0 = r2
                        java.util.Iterator r0 = r0.iterator()
                    L1a:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto Ldd
                        java.lang.Object r1 = r0.next()
                        com.beizi.fusion.model.AdSpacesBean$ForwardBean r1 = (com.beizi.fusion.model.AdSpacesBean.ForwardBean) r1
                        java.lang.String r2 = r1.getBuyerId()
                        java.util.List r3 = r3
                        java.lang.String r8 = r1.getBuyerSpaceUuId()
                        com.beizi.fusion.model.AdSpacesBean$BuyerBean r2 = com.beizi.fusion.f.b.a(r2, r3, r8)
                        r3 = 0
                        if (r2 == 0) goto L82
                        java.lang.String r8 = r2.getBidType()
                        java.lang.String r9 = "S2S"
                        boolean r8 = r9.equalsIgnoreCase(r8)
                        if (r8 == 0) goto L82
                        java.lang.String r8 = r2.getId()
                        java.lang.String r9 = "GDT"
                        boolean r8 = r9.equalsIgnoreCase(r8)
                        if (r8 == 0) goto L68
                        android.content.Context r3 = r4
                        java.lang.String r8 = r2.getAppId()
                        java.lang.String r3 = com.beizi.fusion.d.k.c(r3, r8)
                        android.content.Context r8 = r4
                        java.lang.String r9 = r2.getAppId()
                        java.lang.String r10 = r2.getSpaceId()
                        java.lang.String r8 = com.beizi.fusion.d.k.a(r8, r9, r10)
                        goto L83
                    L68:
                        java.lang.String r8 = r2.getId()
                        java.lang.String r9 = "KUAISHOU"
                        boolean r8 = r9.equalsIgnoreCase(r8)
                        if (r8 == 0) goto L82
                        android.content.Context r8 = r4
                        java.lang.String r9 = r2.getAppId()
                        java.lang.String r8 = com.beizi.fusion.d.n.b(r8, r9)
                        r11 = r8
                        r8 = r3
                        r3 = r11
                        goto L83
                    L82:
                        r8 = r3
                    L83:
                        boolean r9 = android.text.TextUtils.isEmpty(r3)
                        if (r9 != 0) goto L1a
                        java.lang.String r9 = r2.getBuyerSpaceUuId()
                        r6.add(r9)
                        r4.add(r1)
                        r5.add(r2)
                        com.beizi.fusion.d.a.b$k r1 = new com.beizi.fusion.d.a.b$k
                        r1.<init>()
                        java.lang.StringBuilder r9 = new java.lang.StringBuilder
                        r9.<init>()
                        java.lang.String r10 = r2.getId()
                        int r10 = com.beizi.fusion.f.b.a(r10)
                        r9.append(r10)
                        java.lang.String r10 = ""
                        r9.append(r10)
                        java.lang.String r9 = r9.toString()
                        r1.a(r9)
                        java.lang.String r9 = r2.getId()
                        r1.b(r9)
                        java.lang.String r9 = r2.getAppId()
                        r1.c(r9)
                        java.lang.String r2 = r2.getSpaceId()
                        r1.d(r2)
                        r1.e(r3)
                        boolean r2 = android.text.TextUtils.isEmpty(r8)
                        if (r2 != 0) goto Ld8
                        r1.f(r8)
                    Ld8:
                        r7.add(r1)
                        goto L1a
                    Ldd:
                        boolean r0 = r6.isEmpty()
                        if (r0 == 0) goto Lf4
                        java.lang.String r0 = "BeiZis"
                        java.lang.String r1 = "S2S竞价失败--token or buyerId is null"
                        com.beizi.fusion.g.af.c(r0, r1)
                        com.beizi.fusion.d.a.a r0 = com.beizi.fusion.d.a.a.this
                        com.beizi.fusion.d.a.a$a r0 = com.beizi.fusion.d.a.a.a(r0)
                        r0.a()
                        return
                    Lf4:
                        com.beizi.fusion.d.a.a r0 = com.beizi.fusion.d.a.a.this
                        android.content.Context r1 = r4
                        java.lang.String r2 = r5
                        java.lang.String r3 = r6
                        int r8 = r7
                        com.beizi.fusion.d.a.a.a(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.beizi.fusion.d.a.a.AnonymousClass1.run():void");
                }
            });
            return;
        }
        this.f6595a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, List<AdSpacesBean.ForwardBean> list, List<AdSpacesBean.BuyerBean> list2, List<String> list3, List<b.k> list4, int i4) {
        try {
            boolean equals = "1".equals(str);
            String a5 = au.a();
            String a6 = ab.a(context, ab.a(context, a5, str2, equals, list3, list4, i4), a5);
            if (TextUtils.isEmpty(a6)) {
                af.c("BeiZis", "S2S竞价失败-- response is null");
                a(this.f6598d, this.f6599e, list3);
                return;
            }
            JSONObject jSONObject = new JSONObject(d.b(ad.a(), a6));
            af.c("BeiZis", "S2S竞价结果--response is " + jSONObject.toString());
            int optInt = jSONObject.optInt("code");
            if (optInt != 200) {
                af.c("BeiZis", "S2S竞价失败--response code is " + optInt);
                a(this.f6598d, this.f6599e, list3);
                return;
            }
            String optString = jSONObject.optString("data");
            if (!TextUtils.isEmpty(optString) && !optString.equals("null")) {
                a(list, list2, optString, list3);
                return;
            }
            af.c("BeiZis", "S2S竞价失败--data is null");
            a(this.f6598d, this.f6599e, list3);
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f6595a.a();
            af.c("BeiZis", "S2S竞价失败--数据异常");
        }
    }

    private void a(List<AdSpacesBean.ForwardBean> list, List<AdSpacesBean.BuyerBean> list2, String str, List<String> list3) {
        c.b c5;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c a5 = c.a(str);
            if (a5 != null && a5.a() != null && a5.a().size() != 0) {
                String str2 = null;
                final AdSpacesBean.ForwardBean forwardBean = null;
                for (AdSpacesBean.ForwardBean forwardBean2 : list) {
                    Iterator<c.C0189c> it2 = a5.a().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (forwardBean2.getBuyerId().equals(it2.next().a())) {
                                forwardBean = forwardBean2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                final AdSpacesBean.BuyerBean buyerBean = null;
                for (AdSpacesBean.BuyerBean buyerBean2 : list2) {
                    Iterator<c.C0189c> it3 = a5.a().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (buyerBean2.getId().equals(it3.next().a())) {
                                buyerBean = buyerBean2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (forwardBean != null && buyerBean != null) {
                    List<c.a> b5 = a5.a().get(0).b();
                    if (b5 == null || b5.size() <= 0) {
                        return;
                    }
                    final double parseDouble = Double.parseDouble(b5.get(0).a());
                    if ("GDT".equalsIgnoreCase(buyerBean.getId())) {
                        c.d b6 = b5.get(0).b();
                        if (b6 != null && !TextUtils.isEmpty(b6.a())) {
                            str2 = b6.a();
                        }
                    } else if ("KUAISHOU".equalsIgnoreCase(buyerBean.getId()) && (c5 = a5.a().get(0).c()) != null && !TextUtils.isEmpty(c5.a())) {
                        str2 = c5.a();
                    }
                    final String str3 = str2;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.beizi.fusion.d.a.a.2
                        @Override // java.lang.Runnable
                        public void run() {
                            a.this.f6595a.a(forwardBean, buyerBean, str3, parseDouble);
                        }
                    });
                    return;
                }
                af.c("BeiZis", "S2S竞价失败--tempBuyerBean is null");
                a(this.f6600f, this.f6601g, list3);
                return;
            }
            af.c("BeiZis", "S2S竞价失败--不出价");
            a(this.f6596b, this.f6597c, list3);
        } catch (Exception e5) {
            e5.printStackTrace();
            this.f6595a.a();
        }
    }

    private void a(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("S2S竞价失败，errorCode：");
        sb.append(str);
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0) {
            return;
        }
        for (String str3 : list) {
            this.f6595a.a(str, str2, str3, 21);
        }
    }
}
