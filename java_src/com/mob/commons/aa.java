package com.mob.commons;

import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.utils.DH;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes5.dex */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f56115a = {s.a("008=elfkfdgjgielflic"), s.a("006Aelhcelelflic"), s.a("007Shcghfjfeeeegic"), s.a("007Dhcghfjglekelfk"), s.a("009 elgiedgkgigjeegcil"), s.a("008Qhcghfjfdflelflic"), s.a("008Uhcghfjidekfdgjfl")};

    /* renamed from: b  reason: collision with root package name */
    private static AtomicBoolean f56116b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    private static AtomicBoolean f56117c = new AtomicBoolean(false);

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, MobProduct> f56118d = new HashMap<>();

    public static void a() {
        g();
        z.f56519c.execute(new com.mob.tools.utils.i() { // from class: com.mob.commons.aa.1
            @Override // com.mob.tools.utils.i
            protected void a() {
                MobLog.getInstance().d("init sks start", new Object[0]);
                aa.b();
                MobLog.getInstance().d("init sks over", new Object[0]);
            }
        });
    }

    public static ArrayList<MobProduct> b() {
        ArrayList<MobProduct> arrayList;
        HashMap<String, MobProduct> hashMap = f56118d;
        synchronized (hashMap) {
            if (x.h() && f56116b.compareAndSet(false, true)) {
                hashMap.putAll(h());
            }
            arrayList = new ArrayList<>();
            arrayList.addAll(hashMap.values());
        }
        return arrayList;
    }

    public static synchronized String c() {
        String a5;
        synchronized (aa.class) {
            a5 = a(b(), 0);
        }
        return a5;
    }

    public static synchronized String d() {
        String a5;
        synchronized (aa.class) {
            a5 = a(b(), 1);
        }
        return a5;
    }

    public static synchronized String e() {
        String a5;
        synchronized (aa.class) {
            a5 = a(b(), 2);
        }
        return a5;
    }

    public static synchronized String f() {
        String a5;
        synchronized (aa.class) {
            a5 = a(b(), 3);
        }
        return a5;
    }

    private static void g() {
        if (x.h() && f56117c.compareAndSet(false, true)) {
            try {
                MOBLINK moblink = new MOBLINK();
                if (moblink instanceof MobProduct) {
                    moblink.getProductTag();
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static HashMap<String, MobProduct> h() {
        Class<?> cls;
        HashMap<String, MobProduct> hashMap = new HashMap<>();
        for (Object obj : t.f56476a) {
            try {
                if (obj instanceof String) {
                    cls = Class.forName(String.valueOf(obj).trim());
                } else {
                    cls = (Class) obj;
                }
                if (MobProduct.class.isAssignableFrom(cls) && !MobProduct.class.equals(cls)) {
                    MobProduct mobProduct = (MobProduct) cls.newInstance();
                    String productTag = mobProduct.getProductTag();
                    String[] strArr = f56115a;
                    int length = strArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            String str = strArr[i4];
                            if (str.equals(productTag)) {
                                hashMap.put(str, mobProduct);
                                break;
                            }
                            i4++;
                        }
                    }
                } else {
                    cls.newInstance();
                }
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    public static void a(MobProduct mobProduct) {
        HashMap<String, MobProduct> hashMap = f56118d;
        synchronized (hashMap) {
            if (mobProduct != null) {
                if (!hashMap.containsKey(mobProduct.getProductTag())) {
                    hashMap.put(mobProduct.getProductTag(), mobProduct);
                }
            }
        }
    }

    private static synchronized String a(final ArrayList<MobProduct> arrayList, final int i4) {
        String str;
        synchronized (aa.class) {
            final String[] strArr = {""};
            DH.RequestBuilder carrier = DH.requester(MobSDK.getContext()).getMIUIVersion().getDetailNetworkTypeForStatic().getCarrier();
            if (x.b() && i4 != 3) {
                carrier.getDeviceKey();
            } else {
                carrier.getDeviceKeyFromCache(true);
            }
            carrier.request(new DH.DHResponder() { // from class: com.mob.commons.aa.2
                @Override // com.mob.tools.utils.DH.DHResponder
                public void onResponse(DH.DHResponse dHResponse) throws Throwable {
                    String deviceKeyFromCache;
                    String str2;
                    String str3;
                    String str4 = "";
                    String encode = TextUtils.isEmpty(DH.SyncMtd.getPackageName()) ? "" : URLEncoder.encode(DH.SyncMtd.getPackageName(), "utf-8");
                    String encode2 = TextUtils.isEmpty(DH.SyncMtd.getAppVersionName()) ? "" : URLEncoder.encode(DH.SyncMtd.getAppVersionName(), "utf-8");
                    String encode3 = TextUtils.isEmpty(DH.SyncMtd.getManufacturer()) ? "" : URLEncoder.encode(DH.SyncMtd.getManufacturer(), "utf-8");
                    String encode4 = TextUtils.isEmpty(DH.SyncMtd.getModel()) ? "" : URLEncoder.encode(DH.SyncMtd.getModel(), "utf-8");
                    String encode5 = TextUtils.isEmpty(dHResponse.getMIUIVersion()) ? "" : URLEncoder.encode(dHResponse.getMIUIVersion(), "utf-8");
                    String encode6 = TextUtils.isEmpty(DH.SyncMtd.getOSVersionName()) ? "" : URLEncoder.encode(DH.SyncMtd.getOSVersionName(), "utf-8");
                    HashMap<String, Object> b5 = s.a().b();
                    String str5 = s.a("004Jfdglgl[l") + encode + ";" + encode2;
                    String str6 = s.a("012_elilel=lJfd.eFdcdjdkdidcjg") + DH.SyncMtd.getOSVersionInt() + ";" + encode6;
                    if (x.b() && i4 != 3) {
                        deviceKeyFromCache = dHResponse.getDeviceKey();
                    } else {
                        deviceKeyFromCache = dHResponse.getDeviceKeyFromCache(new int[0]);
                    }
                    String str7 = s.a("004-elfleeIl") + deviceKeyFromCache;
                    String str8 = s.a("0038gchc=l") + encode3 + ";" + encode4;
                    if (!TextUtils.isEmpty(encode5)) {
                        str8 = str8 + ";" + encode5;
                    }
                    String str9 = s.a("003JeggiSl") + dHResponse.getDetailNetworkTypeForStatic() + ";" + dHResponse.getCarrier();
                    String str10 = s.a("005Jfe=deKejTl") + Locale.getDefault().toString().replace(s.a("0027hkdj"), "-");
                    String str11 = s.a("0047edfegkOl") + MobSDK.SDK_VERSION_CODE;
                    String a5 = s.a("004Velflic1l");
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            try {
                                MobProduct mobProduct = (MobProduct) arrayList.get(i5);
                                if (i5 != 0) {
                                    str3 = str4;
                                    try {
                                        a5 = a5 + ",";
                                    } catch (Throwable unused) {
                                    }
                                } else {
                                    str3 = str4;
                                }
                                try {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(a5);
                                    String str12 = a5;
                                    try {
                                        sb.append(mobProduct.getProductTag());
                                        sb.append(";");
                                        sb.append(mobProduct.getSdkver());
                                        sb.append(";");
                                        sb.append(b5.get(mobProduct.getProductTag()));
                                        a5 = sb.toString();
                                    } catch (Throwable unused2) {
                                        a5 = str12;
                                    }
                                } catch (Throwable unused3) {
                                }
                            } catch (Throwable unused4) {
                                str3 = str4;
                            }
                            i5++;
                            str4 = str3;
                        }
                    }
                    String str13 = str4;
                    String str14 = CSCenter.getInstance().isCusControllerNotNull() ? "DC/7" : "DC/2";
                    int i6 = i4;
                    if (i6 == 1) {
                        str14 = "DC/[DC]";
                    } else if (i6 == 2) {
                        str14 = "DC/[DC2]";
                    }
                    String timezone = DH.SyncMtd.getTimezone();
                    if (TextUtils.isEmpty(timezone)) {
                        str2 = str13;
                    } else {
                        str2 = s.a("003Cfcijdh") + timezone;
                    }
                    String c5 = ac.a().c();
                    String str15 = "TID/";
                    if (!TextUtils.isEmpty(c5)) {
                        str15 = "TID/" + c5;
                    }
                    int a6 = com.mob.commons.cc.a.a();
                    String str16 = "SVM/" + a6;
                    if (com.mob.tools.b.d.c()) {
                        if (!s.a("004!elflic9l").equals(a5)) {
                            a5 = a5 + ",";
                        }
                        a5 = a5 + "CS;" + a6;
                    }
                    String str17 = "RD/";
                    String f5 = y.a().f();
                    if (!TextUtils.isEmpty(f5)) {
                        str17 = "RD/" + f5;
                    }
                    strArr[0] = str5 + " " + str6 + " " + str7 + " " + str8 + " " + str9 + " " + str10 + " " + str11 + " " + a5 + " " + str14 + " " + str2 + " " + str15 + " " + str16 + " " + str17;
                }
            });
            str = strArr[0];
        }
        return str;
    }
}
