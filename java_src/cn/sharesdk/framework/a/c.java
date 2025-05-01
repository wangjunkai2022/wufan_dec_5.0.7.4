package cn.sharesdk.framework.a;

import android.text.TextUtils;
import android.util.Base64;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.framework.ShareSDKCallback;
import cn.sharesdk.framework.a.a.e;
import cn.sharesdk.framework.utils.SSDKLog;
import com.facebook.common.util.f;
import com.mob.MobCommunicator;
import com.mob.MobSDK;
import com.mob.tools.network.KVPair;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.Hashon;
import com.mob.tools.utils.ResHelper;
import com.umeng.analytics.pro.bm;
import com.umeng.umcrash.UMCrash;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: Protocols.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: h  reason: collision with root package name */
    private static MobCommunicator f908h;

    /* renamed from: a  reason: collision with root package name */
    private e f909a = e.a();

    /* renamed from: b  reason: collision with root package name */
    private NetworkHelper f910b = new NetworkHelper();

    /* renamed from: c  reason: collision with root package name */
    private Hashon f911c = new Hashon();

    /* renamed from: d  reason: collision with root package name */
    private String f912d;

    /* renamed from: e  reason: collision with root package name */
    private String f913e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f914f;

    /* renamed from: g  reason: collision with root package name */
    private HashMap<String, String> f915g;

    public c() {
        try {
            this.f915g = (HashMap) this.f909a.l("buffered_server_paths");
        } catch (Throwable unused) {
            this.f915g = new HashMap<>();
        }
        h();
    }

    private static synchronized MobCommunicator g() {
        MobCommunicator mobCommunicator;
        synchronized (c.class) {
            if (f908h == null) {
                f908h = new MobCommunicator(1024, "009cbd92ccef123be840deec0c6ed0547194c1e471d11b6f375e56038458fb18833e5bab2e1206b261495d7e2d1d9e5aa859e6d4b671a8ca5d78efede48e291a3f", "1dfd1d615cb891ce9a76f42d036af7fce5f8b8efaa11b2f42590ecc4ea4cff28f5f6b0726aeb76254ab5b02a58c1d5b486c39d9da1a58fa6ba2f22196493b3a4cbc283dcf749bf63679ee24d185de70c8dfe05605886c9b53e9f569082eabdf98c4fb0dcf07eb9bb3e647903489ff0b5d933bd004af5be4a1022fdda41f347f1");
            }
            mobCommunicator = f908h;
        }
        return mobCommunicator;
    }

    private void h() {
        this.f912d = (DH.SyncMtd.getPackageName() + net.lingala.zip4j.util.e.F0 + DH.SyncMtd.getAppVersionName()) + " ShareSDK/3.10.22 " + ("Android/" + DH.SyncMtd.getOSVersionInt());
        try {
            this.f913e = MobSDK.dynamicModifyUrl("api-share.mob.com");
        } catch (Throwable th) {
            this.f913e = MobSDK.checkRequestUrl("api-share.mob.com");
            SSDKLog.b().a("001 dynamicModifyUrl catch, no problem " + th, new Object[0]);
        }
        this.f914f = true;
    }

    private String i() {
        return this.f913e + "/conn";
    }

    private String j() {
        HashMap<String, String> hashMap = this.f915g;
        if (hashMap != null && hashMap.containsKey("/date")) {
            return this.f915g.get("/date") + "/date";
        }
        return this.f913e + "/date";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String k() {
        return this.f913e + "/conf5";
    }

    private String l() {
        try {
            return MobSDK.dynamicModifyUrl("up.mob.com/upload/image");
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("002 dynamicModifyUrl catch, no problem " + th, new Object[0]);
            return MobSDK.checkRequestUrl("up.mob.com/upload/image");
        }
    }

    private String m() {
        HashMap<String, String> hashMap = this.f915g;
        if (hashMap != null && hashMap.containsKey("/log5")) {
            return this.f915g.get("/log5") + "/log5";
        }
        return this.f913e + "/log5";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String n() {
        try {
            return MobSDK.dynamicModifyUrl("l.mob.com/url/shareSdkEncryptMapping.do");
        } catch (Throwable th) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("003 dynamicModifyUrl catch, no problem " + th, new Object[0]);
            return MobSDK.checkRequestUrl("l.mob.com/url/shareSdkEncryptMapping.do");
        }
    }

    private String o() {
        HashMap<String, String> hashMap = this.f915g;
        if (hashMap != null && hashMap.containsKey("/snsconf")) {
            return this.f915g.get("/snsconf") + "/snsconf";
        }
        return this.f913e + "/snsconf";
    }

    static /* synthetic */ MobCommunicator e() {
        return f();
    }

    private static synchronized MobCommunicator f() {
        MobCommunicator mobCommunicator;
        synchronized (c.class) {
            if (f908h == null) {
                f908h = new MobCommunicator(1024, "bb7addd7e33383b74e82aba9b1d274c73aea6c0c71fcc88730270f630dbe490e1d162004f74e9532f98e17004630fbea9b346de63c23e83a7dfad70dd47cebfd", "288e7c44e01569a905386e6341baabfcde63ec37d0f0835cc662c299a5d0072970808a7fa434f0a51fa581d09d5ec4350ba5d548eafbe1fd956fb3afd678c1fb6134c904668652ec5cceb5d85da337a0f2f13ea457cca74a01b3ba0f4c809ad30d382bba2562ec9b996ae44c3700731c1b914997ef826331759e4084a019a03f");
            }
            mobCommunicator = f908h;
        }
        return mobCommunicator;
    }

    public void b(String str) {
        this.f913e = str;
    }

    public HashMap<String, Object> c(String str) throws Throwable {
        KVPair<String> kVPair = new KVPair<>(f.f10925c, str);
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
        String httpPost = this.f910b.httpPost(l(), (ArrayList<KVPair<String>>) null, kVPair, arrayList, (NetworkHelper.NetworkTimeOut) null);
        SSDKLog.b().c("upload file response == %s", httpPost);
        return this.f911c.fromJson(httpPost);
    }

    public HashMap<String, Object> d(String str) throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("appkey", MobSDK.getAppkey()));
        arrayList.add(new KVPair<>(com.alipay.sdk.packet.d.f4907p, str));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 10000;
        networkTimeOut.connectionTimeout = 10000;
        return this.f911c.fromJson(this.f910b.httpPost(o(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut));
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SSDKLog.b().a("duid === " + str, new Object[0]);
        this.f912d += " " + str;
    }

    public long b() throws Throwable {
        String str;
        if (this.f909a.i()) {
            try {
                str = this.f910b.httpGet(j(), null, null, null);
            } catch (Throwable th) {
                SSDKLog.b().a(th);
                str = "{}";
            }
            HashMap fromJson = this.f911c.fromJson(str);
            if (fromJson.containsKey(UMCrash.SP_KEY_TIMESTAMP)) {
                try {
                    long currentTimeMillis = System.currentTimeMillis() - ResHelper.parseLong(String.valueOf(fromJson.get(UMCrash.SP_KEY_TIMESTAMP)));
                    this.f909a.a("service_time", Long.valueOf(currentTimeMillis));
                    return currentTimeMillis;
                } catch (Throwable th2) {
                    SSDKLog.b().a(th2);
                    return this.f909a.b();
                }
            }
            return this.f909a.b();
        }
        return 0L;
    }

    public void a(HashMap<String, String> hashMap) {
        this.f915g = hashMap;
        this.f909a.a("buffered_server_paths", hashMap);
    }

    public HashMap<String, Object> a() throws Throwable {
        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
        arrayList.add(new KVPair<>("appkey", MobSDK.getAppkey()));
        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
        arrayList2.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
        networkTimeOut.readTimout = 30000;
        networkTimeOut.connectionTimeout = 30000;
        String httpPost = this.f910b.httpPost(i(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut);
        SSDKLog.b().c(" isConnectToServer response == %s", httpPost);
        return this.f911c.fromJson(httpPost);
    }

    public ArrayList<cn.sharesdk.framework.a.a.c> c() throws Throwable {
        ArrayList<cn.sharesdk.framework.a.a.c> a5 = cn.sharesdk.framework.a.a.d.a();
        return a5 == null ? new ArrayList<>() : a5;
    }

    public HashMap<String, Object> d() throws Throwable {
        return this.f911c.fromJson(this.f909a.g());
    }

    public void b(HashMap<String, Object> hashMap) throws Throwable {
        this.f909a.g(this.f911c.fromHashMap(hashMap));
    }

    public void a(final ShareSDKCallback<HashMap<String, Object>> shareSDKCallback) throws Throwable {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.c.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if (!"none".equals(networkType) && !TextUtils.isEmpty(networkType)) {
                        String appkey = MobSDK.getAppkey();
                        ArrayList<KVPair<String>> arrayList = new ArrayList<>();
                        arrayList.add(new KVPair<>("appkey", appkey));
                        arrayList.add(new KVPair<>(com.alipay.sdk.packet.d.f4907p, dHResponse.getDeviceKey()));
                        arrayList.add(new KVPair<>("plat", String.valueOf(DH.SyncMtd.getPlatformCode())));
                        arrayList.add(new KVPair<>("apppkg", DH.SyncMtd.getPackageName()));
                        arrayList.add(new KVPair<>("appver", String.valueOf(DH.SyncMtd.getAppVersion())));
                        arrayList.add(new KVPair<>("sdkver", String.valueOf(ShareSDK.SDK_VERSION_CODE)));
                        arrayList.add(new KVPair<>("networktype", dHResponse.getDetailNetworkTypeForStatic()));
                        ArrayList<KVPair<String>> arrayList2 = new ArrayList<>();
                        arrayList2.add(new KVPair<>("User-Identity", cn.sharesdk.framework.network.a.a()));
                        NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                        networkTimeOut.readTimout = 10000;
                        networkTimeOut.connectionTimeout = 10000;
                        String httpPost = c.this.f910b.httpPost(c.this.k(), arrayList, (KVPair<String>) null, arrayList2, networkTimeOut);
                        HashMap fromJson = new Hashon().fromJson(httpPost);
                        if (fromJson.containsKey("error")) {
                            if (String.valueOf(fromJson.get("error")).contains("'appkey' is illegal")) {
                                if (TextUtils.isEmpty(appkey)) {
                                    cn.sharesdk.framework.b.a().b();
                                } else {
                                    cn.sharesdk.framework.a.f838a = true;
                                }
                            }
                        } else if (!TextUtils.isEmpty(appkey)) {
                            cn.sharesdk.framework.a.f839b = appkey;
                        }
                        SSDKLog.b().c(" get server config response == %s", httpPost);
                        shareSDKCallback.onCallback(c.this.f911c.fromJson(httpPost));
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("getServerConfig" + th, new Object[0]);
                }
            }
        });
    }

    public boolean a(String str, boolean z4) {
        try {
            if (MobSDK.isMob()) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("m", str);
                hashMap.put(bm.aM, z4 ? "1" : "0");
                String str2 = (String) g().requestSynchronized(hashMap, m(), false);
                SSDKLog.b().c("> Upload All Log  resp: %s", str2);
                if (!TextUtils.isEmpty(str2)) {
                    if (((Integer) this.f911c.fromJson(str2).get("status")).intValue() != 200) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            SSDKLog.b().a(th);
            return false;
        }
    }

    public void a(String str, final ArrayList<String> arrayList, final int i4, final String str2, final ShareSDKCallback<HashMap<String, Object>> shareSDKCallback) throws Throwable {
        DH.requester(MobSDK.getContext()).getDeviceKey().getDetailNetworkTypeForStatic().getScreenSize().getCarrier().getNetworkType().request(new DH.DHResponder() { // from class: cn.sharesdk.framework.a.c.2
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                try {
                    String networkType = dHResponse.getNetworkType();
                    if ("none".equals(networkType) || TextUtils.isEmpty(networkType) || !c.this.f914f) {
                        return;
                    }
                    boolean c5 = c.this.f909a.c();
                    boolean d5 = c.this.f909a.d();
                    StringBuilder sb = new StringBuilder();
                    sb.append(Data.urlEncode(DH.SyncMtd.getPackageName(), "utf-8"));
                    sb.append("|");
                    sb.append(Data.urlEncode(DH.SyncMtd.getAppVersionName(), "utf-8"));
                    sb.append("|");
                    sb.append(Data.urlEncode(String.valueOf(ShareSDK.SDK_VERSION_CODE), "utf-8"));
                    sb.append("|");
                    sb.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getPlatformCode()), "utf-8"));
                    sb.append("|");
                    sb.append(Data.urlEncode(dHResponse.getDetailNetworkTypeForStatic(), "utf-8"));
                    sb.append("|");
                    if (c5) {
                        sb.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getOSVersionInt()), "utf-8"));
                        sb.append("|");
                        sb.append(Data.urlEncode(dHResponse.getScreenSize(), "utf-8"));
                        sb.append("|");
                        sb.append(Data.urlEncode(DH.SyncMtd.getManufacturer(), "utf-8"));
                        sb.append("|");
                        sb.append(Data.urlEncode(DH.SyncMtd.getModel(), "utf-8"));
                        sb.append("|");
                        sb.append(Data.urlEncode(dHResponse.getCarrier(), "utf-8"));
                        sb.append("|");
                    } else {
                        sb.append("|||||");
                    }
                    if (d5) {
                        sb.append(str2);
                    } else {
                        sb.append(str2.split("\\|")[0]);
                        sb.append("|||||");
                    }
                    String sb2 = sb.toString();
                    SSDKLog.b().c("shorLinkMsg ===>>>>", sb2);
                    String encodeToString = Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.format("%s:%s", dHResponse.getDeviceKey(), MobSDK.getAppkey())), sb2), 2);
                    new ArrayList().add(new KVPair("User-Identity", cn.sharesdk.framework.network.a.a()));
                    NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                    networkTimeOut.readTimout = 5000;
                    networkTimeOut.connectionTimeout = 5000;
                    HashMap<String, Object> hashMap = new HashMap<>();
                    hashMap.put("key", MobSDK.getAppkey());
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                        arrayList2.add(URLEncoder.encode((String) arrayList.get(i5), "UTF-8"));
                    }
                    hashMap.put("urls", arrayList2);
                    hashMap.put("deviceid", dHResponse.getDeviceKey());
                    hashMap.put("snsplat", Integer.valueOf(i4));
                    if (TextUtils.isEmpty(str2)) {
                        SSDKLog.b().a("shortLinkMsg null", new Object[0]);
                        return;
                    }
                    hashMap.put("m", encodeToString);
                    HashMap hashMap2 = (HashMap) c.e().requestSynchronized(hashMap, c.this.n(), false);
                    SSDKLog.b().c("> SERVER_SHORT_LINK_URL  resp: %s", hashMap2);
                    if (hashMap2.size() == 0) {
                        c.this.f914f = false;
                    } else if (hashMap2.get("data") != null) {
                        shareSDKCallback.onCallback(hashMap2);
                    }
                } catch (Throwable th) {
                    SSDKLog b5 = SSDKLog.b();
                    b5.a("getShortLink" + th, new Object[0]);
                    ShareSDKCallback shareSDKCallback2 = shareSDKCallback;
                    if (shareSDKCallback2 != null) {
                        shareSDKCallback2.onCallback(new HashMap());
                    }
                }
            }
        });
    }

    public void a(cn.sharesdk.framework.a.b.c cVar) throws Throwable {
        cn.sharesdk.framework.a.a.d.a(cVar.toString(), cVar.f877e);
    }

    public void a(ArrayList<String> arrayList) throws Throwable {
        cn.sharesdk.framework.a.a.d.a(arrayList);
    }

    public HashMap<String, Object> a(String str, String str2) throws Throwable {
        byte[] decode = Base64.decode(str, 2);
        return this.f911c.fromJson(new String(Data.AES128Decode(Data.rawMD5(MobSDK.getAppkey() + ":" + str2), decode), "UTF-8").trim());
    }

    public HashMap<String, Object> a(String str, ArrayList<String> arrayList, int i4, String str2, HashMap<String, String> hashMap) throws Throwable {
        if (this.f914f) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new KVPair("key", MobSDK.getAppkey()));
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                arrayList2.add(new KVPair("urls", arrayList.get(i5).toString()));
            }
            arrayList2.add(new KVPair("deviceid", hashMap.get(bm.bv)));
            arrayList2.add(new KVPair("snsplat", String.valueOf(i4)));
            String a5 = a(str2, hashMap);
            if (TextUtils.isEmpty(a5)) {
                return null;
            }
            arrayList2.add(new KVPair("m", a5));
            new ArrayList().add(new KVPair("User-Identity", cn.sharesdk.framework.network.a.a()));
            NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
            networkTimeOut.readTimout = 5000;
            networkTimeOut.connectionTimeout = 5000;
            HashMap<String, Object> hashMap2 = new HashMap<>();
            hashMap2.put("key", MobSDK.getAppkey());
            ArrayList arrayList3 = new ArrayList();
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                arrayList3.add(URLEncoder.encode(arrayList.get(i6), "UTF-8"));
            }
            hashMap2.put("urls", arrayList3);
            hashMap2.put("deviceid", hashMap.get(bm.bv));
            hashMap2.put("snsplat", Integer.valueOf(i4));
            if (TextUtils.isEmpty(a5)) {
                return null;
            }
            hashMap2.put("m", a5);
            HashMap<String, Object> hashMap3 = (HashMap) f().requestSynchronized(hashMap2, n(), false);
            SSDKLog.b().c("> SERVER_SHORT_LINK_URL  resp: %s", hashMap3);
            if (hashMap3.size() == 0) {
                this.f914f = false;
                return null;
            } else if (hashMap3.get("data") == null) {
                return null;
            } else {
                return hashMap3;
            }
        }
        return null;
    }

    private String a(String str, HashMap<String, String> hashMap) throws Throwable {
        boolean c5 = this.f909a.c();
        boolean d5 = this.f909a.d();
        StringBuilder sb = new StringBuilder();
        sb.append(Data.urlEncode(DH.SyncMtd.getPackageName(), "utf-8"));
        sb.append("|");
        sb.append(Data.urlEncode(DH.SyncMtd.getAppVersionName(), "utf-8"));
        sb.append("|");
        sb.append(Data.urlEncode(String.valueOf(ShareSDK.SDK_VERSION_CODE), "utf-8"));
        sb.append("|");
        sb.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getPlatformCode()), "utf-8"));
        sb.append("|");
        sb.append(Data.urlEncode(hashMap.get("dnwktfs"), "utf-8"));
        sb.append("|");
        if (c5) {
            sb.append(Data.urlEncode(String.valueOf(DH.SyncMtd.getOSVersionInt()), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(hashMap.get("srs"), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(DH.SyncMtd.getManufacturer(), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(DH.SyncMtd.getModel(), "utf-8"));
            sb.append("|");
            sb.append(Data.urlEncode(hashMap.get("car"), "utf-8"));
            sb.append("|");
        } else {
            sb.append("|||||");
        }
        if (d5) {
            sb.append(str);
        } else {
            sb.append(str.split("\\|")[0]);
            sb.append("|||||");
        }
        String sb2 = sb.toString();
        SSDKLog.b().c("shorLinkMsg ===>>>>", sb2);
        return Base64.encodeToString(Data.AES128Encode(Data.rawMD5(String.format("%s:%s", hashMap.get(bm.bv), MobSDK.getAppkey())), sb2), 2);
    }
}
