package com.beizi.fusion.b;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.beizi.fusion.g.af;
import com.beizi.fusion.model.AdSpacesBean;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
/* compiled from: AdProcessStatus.java */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static SparseArray<String> f6510a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public static SparseArray<String> f6511b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public static SparseArray<String> f6512c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    public static SparseArray<String> f6513d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public static SparseArray<String> f6514e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public static SparseArray<String> f6515f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public static SparseArray<String> f6516g = new SparseArray<>();

    /* renamed from: h  reason: collision with root package name */
    public static SparseArray<String> f6517h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    public static SparseArray<String> f6518i = new SparseArray<>();

    /* renamed from: j  reason: collision with root package name */
    public static SparseArray<String> f6519j = new SparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    public static SparseArray<String> f6520k = new SparseArray<>();

    /* renamed from: l  reason: collision with root package name */
    private HashMap<String, Pair<AdSpacesBean.BuyerBean, AdSpacesBean.ForwardBean>> f6521l = new HashMap<>();

    /* renamed from: m  reason: collision with root package name */
    private HashMap<String, com.beizi.fusion.b.b> f6522m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private com.beizi.fusion.b.b f6523n;

    /* compiled from: AdProcessStatus.java */
    /* renamed from: com.beizi.fusion.b.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0185a extends l {
        public C0185a() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class b extends l {
        public b() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class c extends l {
        public c() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class d extends l {
        public d() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class e extends l {
        public e() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class f extends l {
        public f() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class g extends l {
        public g() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class h extends l {
        public h() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class i extends l {
        public i() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class j extends l {
        public j() {
            super();
        }
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class k extends l {
        public k() {
            super();
        }
    }

    static {
        f6510a.put(1, "100.000");
        f6510a.put(2, "100.200");
        f6511b.put(-1, "210.400");
        f6511b.put(-2, "210.999");
        f6511b.put(1, "200.001");
        f6511b.put(2, "210.100");
        f6511b.put(3, "210.200");
        f6511b.put(4, "210.401");
        f6511b.put(5, "210.402");
        f6511b.put(6, "210.403");
        f6511b.put(7, "210.404");
        f6512c.put(-1, "220.400");
        f6512c.put(-2, "220.999");
        f6512c.put(1, "220.000");
        f6512c.put(2, "200.000");
        f6512c.put(3, "220.401");
        f6512c.put(4, "220.402");
        f6512c.put(5, "220.403");
        f6512c.put(6, "220.404");
        f6513d.put(-1, "230.400");
        f6513d.put(-2, "230.999");
        f6513d.put(1, "230.000");
        f6513d.put(2, "230.200");
        f6513d.put(3, "230.401");
        f6513d.put(4, "230.402");
        f6514e.put(-1, "245.400");
        f6514e.put(-2, "245.999");
        f6514e.put(1, "240.000");
        f6514e.put(2, "245.000");
        f6514e.put(3, "245.200");
        f6514e.put(4, "245.401");
        f6514e.put(5, "245.402");
        f6514e.put(6, "245.403");
        f6514e.put(7, "245.404");
        f6514e.put(8, "245.300");
        f6514e.put(9, "240.100");
        f6514e.put(10, "245.405");
        f6515f.put(-1, "249.400");
        f6515f.put(-2, "249.999");
        f6515f.put(1, "248.000");
        f6515f.put(2, "249.000");
        f6515f.put(3, "248.401");
        f6515f.put(4, "248.402");
        f6515f.put(5, "249.401");
        f6515f.put(6, "249.402");
        f6516g.put(-1, "280.600");
        f6516g.put(1, "250.100");
        f6516g.put(2, "250.200");
        f6516g.put(16, "250.401");
        f6516g.put(3, "255.200");
        f6516g.put(4, "280.200");
        f6516g.put(5, "280.280");
        f6516g.put(6, "280.300");
        f6516g.put(12, "280.350");
        f6516g.put(7, "290.300");
        f6516g.put(17, "290.301");
        f6516g.put(8, "280.400");
        f6516g.put(9, "280.450");
        f6516g.put(11, "280.500");
        f6516g.put(13, "280.301");
        f6516g.put(14, "280.302");
        f6516g.put(15, "280.303");
        f6516g.put(18, "250.000");
        f6516g.put(19, "250.400");
        f6516g.put(20, "280.000");
        f6516g.put(21, "250.500");
        f6516g.put(22, "290.500");
        f6517h.put(1, "280.210");
        f6517h.put(-2, "280.249");
        f6517h.put(2, "280.220");
        f6517h.put(3, "280.250");
        f6517h.put(4, "280.241");
        f6517h.put(5, "280.240");
        f6517h.put(6, "280.242");
        f6517h.put(7, "280.243");
        f6518i.put(1, "280.261");
        f6518i.put(2, "280.262");
        f6518i.put(3, "280.263");
        f6518i.put(4, "280.264");
        f6520k.put(1, "212.000");
        f6520k.put(2, "212.400");
        f6520k.put(3, "212.401");
        f6520k.put(4, "212.999");
        f6520k.put(5, "214.000");
        f6520k.put(6, "214.200");
        f6520k.put(7, "216.200");
        f6520k.put(8, "216.401");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.beizi.fusion.b.b b(String str) {
        com.beizi.fusion.b.b bVar = this.f6523n;
        if (bVar == null || str == null) {
            return null;
        }
        try {
            com.beizi.fusion.b.b clone = bVar.clone();
            clone.c(str);
            clone.h(String.valueOf(System.currentTimeMillis()));
            return clone;
        } catch (CloneNotSupportedException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private Pair<AdSpacesBean.BuyerBean, AdSpacesBean.ForwardBean> c(String str) {
        if (this.f6521l.containsKey(str)) {
            return this.f6521l.get(str);
        }
        return null;
    }

    public static String a(l lVar) {
        if (lVar instanceof i) {
            return f6510a.get(lVar.a());
        }
        if (lVar instanceof h) {
            return f6511b.get(lVar.a());
        }
        if (lVar instanceof k) {
            return f6512c.get(lVar.a());
        }
        if (lVar instanceof g) {
            return f6513d.get(lVar.a());
        }
        return lVar instanceof j ? f6519j.get(lVar.a()) : "0";
    }

    /* compiled from: AdProcessStatus.java */
    /* loaded from: classes2.dex */
    public class l extends Observable {

        /* renamed from: a  reason: collision with root package name */
        private int f6536a = 0;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, Integer> f6538c = new HashMap();

        public l() {
        }

        public void a(int i4) {
            if (this.f6536a != i4) {
                this.f6536a = i4;
                com.beizi.fusion.b.b b5 = a.this.b(a.a(this));
                setChanged();
                notifyObservers(b5);
            }
        }

        public int a() {
            return this.f6536a;
        }

        public void a(String str, int i4) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            int i5 = 0;
            Map<String, Integer> map = this.f6538c;
            if (map != null && map.containsKey(str)) {
                i5 = this.f6538c.get(str).intValue();
            }
            if (i5 != i4 || i4 == 17) {
                this.f6538c.put(str, Integer.valueOf(i4));
                String a5 = a.a(str, this);
                af.b("BeiZis", "changeStatus channel = " + str + ",eventCode = " + a5);
                com.beizi.fusion.b.b a6 = a.this.a(str, a5);
                if ("290.300".equalsIgnoreCase(a5)) {
                    af.b("BeiZis", "eventBean = " + a6);
                }
                setChanged();
                notifyObservers(a6);
            }
        }

        public int a(String str) {
            Map<String, Integer> map;
            if (TextUtils.isEmpty(str) || (map = this.f6538c) == null || !map.containsKey(str)) {
                return 0;
            }
            return this.f6538c.get(str).intValue();
        }
    }

    public static String a(String str, l lVar) {
        if (lVar instanceof d) {
            return f6514e.get(lVar.a(str));
        }
        if (lVar instanceof e) {
            return f6515f.get(lVar.a(str));
        }
        if (lVar instanceof f) {
            return f6516g.get(lVar.a(str));
        }
        if (lVar instanceof c) {
            return f6517h.get(lVar.a(str));
        }
        if (lVar instanceof b) {
            return f6518i.get(lVar.a(str));
        }
        return lVar instanceof C0185a ? f6520k.get(lVar.a(str)) : "0";
    }

    public void a(com.beizi.fusion.b.b bVar) {
        this.f6523n = bVar;
    }

    public com.beizi.fusion.b.b a(String str) {
        if (this.f6522m.containsKey(str)) {
            try {
                com.beizi.fusion.b.b bVar = this.f6522m.get(str);
                if (bVar != null) {
                    com.beizi.fusion.b.b clone = bVar.clone();
                    this.f6522m.put(str, clone);
                    return clone;
                }
            } catch (CloneNotSupportedException e5) {
                e5.printStackTrace();
            }
        } else {
            com.beizi.fusion.b.b bVar2 = this.f6523n;
            if (bVar2 != null) {
                try {
                    com.beizi.fusion.b.b clone2 = bVar2.clone();
                    this.f6522m.put(str, clone2);
                    return clone2;
                } catch (CloneNotSupportedException e6) {
                    e6.printStackTrace();
                }
            }
        }
        com.beizi.fusion.b.b bVar3 = new com.beizi.fusion.b.b(com.beizi.fusion.d.b.f6675b, "", "", "", com.beizi.fusion.d.b.a().b(), "", "", String.valueOf(System.currentTimeMillis()), "");
        this.f6522m.put(str, bVar3);
        return bVar3;
    }

    public void a(String str, com.beizi.fusion.b.b bVar) {
        if (TextUtils.isEmpty(str) || bVar == null) {
            return;
        }
        this.f6522m.put(str, bVar);
    }

    public void a(AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean) {
        Pair<AdSpacesBean.BuyerBean, AdSpacesBean.ForwardBean> pair = new Pair<>(buyerBean, forwardBean);
        if (buyerBean == null || TextUtils.isEmpty(buyerBean.getBuyerSpaceUuId())) {
            return;
        }
        this.f6521l.put(buyerBean.getBuyerSpaceUuId(), pair);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.beizi.fusion.b.b a(String str, String str2) {
        Pair<AdSpacesBean.BuyerBean, AdSpacesBean.ForwardBean> c5 = c(str);
        StringBuilder sb = new StringBuilder();
        sb.append("getChannelEventBean eventCode = ");
        sb.append(str2);
        sb.append(",channelData == null ");
        sb.append(c5 == null);
        af.b("BeiZis", sb.toString());
        if (c5 != null) {
            AdSpacesBean.BuyerBean buyerBean = (AdSpacesBean.BuyerBean) c5.first;
            AdSpacesBean.ForwardBean forwardBean = (AdSpacesBean.ForwardBean) c5.second;
            com.beizi.fusion.b.b a5 = a(str);
            if (a5 == null || buyerBean == null || forwardBean == null) {
                return a5;
            }
            a5.c(str2);
            a5.h(String.valueOf(System.currentTimeMillis()));
            a(a5, str, buyerBean, forwardBean);
            this.f6522m.put(str, a5);
            return a5;
        }
        af.c("BeiZis", "getChannelEventBean eventCode = " + str2 + ",but channelData is null !!!");
        return null;
    }

    private static void a(com.beizi.fusion.b.b bVar, String str, AdSpacesBean.BuyerBean buyerBean, AdSpacesBean.ForwardBean forwardBean) {
        if (bVar == null) {
            return;
        }
        bVar.j(String.valueOf(com.beizi.fusion.f.b.a(buyerBean.getId())));
        bVar.k(buyerBean.getAppId());
        bVar.l(buyerBean.getSpaceId());
        bVar.D(buyerBean.getFilterSsid());
        bVar.E(buyerBean.getRenderViewSsid());
        bVar.M(String.valueOf(buyerBean.getAvgPrice()));
        bVar.L(com.beizi.fusion.f.b.b(forwardBean.getBaseId()));
        if (!"BPDI".equalsIgnoreCase(buyerBean.getBidType()) && !"C2S".equalsIgnoreCase(buyerBean.getBidType()) && !"S2S".equalsIgnoreCase(buyerBean.getBidType())) {
            bVar.a(0);
        } else {
            bVar.a(1);
            if (buyerBean.getBidPrice() > 0.0d) {
                bVar.N(String.valueOf(buyerBean.getBidPrice()));
            } else {
                bVar.N("0");
            }
        }
        if (forwardBean != null) {
            bVar.n(forwardBean.getForwardId());
            bVar.o(forwardBean.getParentForwardId());
            bVar.p(forwardBean.getLevel());
            bVar.q(forwardBean.getBuyerSpaceUuId());
        }
    }
}
