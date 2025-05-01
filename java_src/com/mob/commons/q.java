package com.mob.commons;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.mob.MobSDK;
import com.mob.tools.MobLog;
import com.mob.tools.a;
import com.mob.tools.log.NLog;
import com.mob.tools.network.NetworkHelper;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import com.mob.tools.utils.FileLocker;
import com.mob.tools.utils.HashonHelper;
import com.mob.tools.utils.MobRSA;
import com.mob.tools.utils.ReflectHelper;
import com.tencent.stat.DeviceInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes5.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f56434a;

    /* renamed from: b  reason: collision with root package name */
    private static q f56435b;

    /* renamed from: c  reason: collision with root package name */
    private File f56436c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f56437d = new BigInteger("f53c224aefb38daa0825c1b8ea691b16d2e16db10880548afddd780c6670a091a11dafa954ea4a9483797fda1045d2693a08daa48cf9cedce1e8733b857304cb", 16);

    /* renamed from: e  reason: collision with root package name */
    private BigInteger f56438e = new BigInteger("27749621e6ca022469645faed16e8261acf6af822467382d55c24bb9bc02356ab16e76ddc799dc8ba6b4f110411996eeb63505c9dcf969d3fc085d712f0f1a9713b67aa1128d7cc41bda363afb0ec7ade60e542a4e22869395331cc0096de412034551e98bb2629ae1b7168b8bc82006d064ab335d8567283e70beb6a49e9423", 16);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private int f56441a;

        /* renamed from: b  reason: collision with root package name */
        private int f56442b;

        /* renamed from: c  reason: collision with root package name */
        private String f56443c;

        /* renamed from: d  reason: collision with root package name */
        private String f56444d;

        private a() {
        }

        private void b(final int i4, final int i5, final String str, final String str2) {
            MobLog.getInstance().d("[LGSM] SLR: onL", new Object[0]);
            if (q.a().a(new com.mob.tools.utils.i() { // from class: com.mob.commons.q.a.1
                @Override // com.mob.tools.utils.i
                protected void a() throws Throwable {
                    MobLog.getInstance().d("[LGSM] SLR: Ins", new Object[0]);
                    HashMap hashMap = new HashMap();
                    hashMap.put(l.a("010,hkfegjim0h5flhkfkfm<g"), Integer.valueOf(i4));
                    hashMap.put(l.a("006)hkfegjhe3f;gl"), str);
                    hashMap.put(l.a("004kSgeHlh"), Integer.valueOf(i5));
                    hashMap.put(l.a("005hCflfl;fk"), Long.valueOf(System.currentTimeMillis()));
                    String encode = URLEncoder.encode(str2);
                    if (TextUtils.isEmpty(encode)) {
                        encode = str2;
                    }
                    hashMap.put(l.a("003Mfhhkgl"), Base64.encodeToString(encode.getBytes("utf-8"), 2));
                    hashMap.put(l.a("005kQfkfh0hYhk"), 1);
                    NLog mobLog = MobLog.getInstance();
                    mobLog.d("[LGSM] W l " + hashMap, new Object[0]);
                    q.b(i5).a(HashonHelper.fromHashMap(hashMap));
                }
            }) && x.b()) {
                MobLog.getInstance().d("[LGSM] SLR: U", new Object[0]);
                z.f56519c.execute(new c());
            }
        }

        public a a(int i4, int i5, String str, String str2) {
            this.f56441a = i4;
            this.f56442b = i5;
            this.f56443c = str;
            this.f56444d = str2;
            return this;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b(this.f56441a, this.f56442b, this.f56443c, this.f56444d);
            } catch (Throwable th) {
                MobLog.getInstance().w(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private Runnable f56453a;

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!com.mob.commons.b.c()) {
                    MobLog.getInstance().d("[LGSM] ULR Ck nt: FBDN", new Object[0]);
                } else {
                    DH.requester(MobSDK.getContext()).getDetailNetworkTypeForStatic().request(new DH.DHResponder() { // from class: com.mob.commons.q.c.2
                        @Override // com.mob.tools.utils.DH.DHResponder
                        public void onResponse(DH.DHResponse dHResponse) {
                            if (l.a("004gIfm8gh").equals(dHResponse.getDetailNetworkTypeForStatic())) {
                                return;
                            }
                            int intValue = ((Integer) com.mob.commons.b.a(l.a("004ehCflfl"), 0)).intValue();
                            NLog mobLog = MobLog.getInstance();
                            mobLog.d("[LGSM] ULR Ck cerr: " + intValue, new Object[0]);
                            if (intValue == 1) {
                                q.a().a(c.this.f56453a);
                                return;
                            }
                            q.b(1).a(((Long) com.mob.commons.b.a("cerr_max", Long.valueOf((long) com.join.mgps.Util.v.f28103c))).longValue());
                        }
                    });
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }

        private c() {
            this.f56453a = new com.mob.tools.utils.i() { // from class: com.mob.commons.q.c.1
                @Override // com.mob.tools.utils.i
                protected void a() {
                    MobLog.getInstance().d("[LGSM] UCLR", new Object[0]);
                    q.b(1).a(new b());
                }
            };
        }
    }

    private q() {
    }

    public void b() {
        MobLog.getInstance().d("[LGSM] Sd last", new Object[0]);
        z.f56519c.execute(new c());
    }

    public static synchronized q a() {
        q qVar;
        synchronized (q.class) {
            if (f56435b == null) {
                f56435b = new q();
            }
            qVar = f56435b;
        }
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mob.tools.a b(int i4) {
        String a5 = l.a("005(fnfh_eiOgl");
        return new com.mob.tools.a(a5, l.a("005(fnfh_eiOgl") + "-" + i4, 50);
    }

    /* loaded from: classes5.dex */
    private static class b implements a.InterfaceC0555a {

        /* renamed from: a  reason: collision with root package name */
        ArrayList<HashMap<String, Object>> f56450a;

        /* renamed from: b  reason: collision with root package name */
        int f56451b;

        /* renamed from: c  reason: collision with root package name */
        String f56452c;

        private b() {
            this.f56450a = new ArrayList<>();
            this.f56451b = -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private String b(String str) throws Throwable {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th;
            byte[] bArr;
            GZIPOutputStream gZIPOutputStream;
            Throwable th2;
            try {
                bArr = str.getBytes();
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                            try {
                                byte[] bArr2 = new byte[1024];
                                while (true) {
                                    int read = byteArrayInputStream.read(bArr2, 0, 1024);
                                    if (read != -1) {
                                        gZIPOutputStream.write(bArr2, 0, read);
                                    } else {
                                        gZIPOutputStream.flush();
                                        v.a(gZIPOutputStream);
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.flush();
                                        String encodeToString = Base64.encodeToString(byteArray, 2);
                                        v.a(byteArrayOutputStream, byteArrayInputStream);
                                        return encodeToString;
                                    }
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                v.a(gZIPOutputStream);
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            gZIPOutputStream = null;
                            th2 = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        v.a(bArr, byteArrayInputStream);
                        throw th;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    bArr = null;
                    v.a(bArr, byteArrayInputStream);
                    throw th;
                }
            } catch (Throwable th7) {
                byteArrayInputStream = null;
                th = th7;
                bArr = null;
            }
        }

        @Override // com.mob.tools.a.InterfaceC0555a
        public void a(String str) {
            NLog mobLog = MobLog.getInstance();
            mobLog.d("[LGSM] ULL onRd " + str, new Object[0]);
            HashMap<String, Object> fromJson = HashonHelper.fromJson(str);
            try {
                this.f56451b = Integer.parseInt(String.valueOf(fromJson.get(l.a("010%hkfegjimSh9flhkfkfmVg"))));
            } catch (Throwable unused) {
            }
            this.f56452c = (String) fromJson.get(l.a("006)hkfegjheFfCgl"));
            this.f56450a.add(fromJson);
        }

        @Override // com.mob.tools.a.InterfaceC0555a
        public boolean a(DH.DHResponse dHResponse) {
            String b5;
            String str;
            MobLog.getInstance().d("[LGSM] ULL onUd", new Object[0]);
            HashMap<String, Object> a5 = a(dHResponse, this.f56451b, this.f56452c);
            a5.put(l.a("006h7flflfhhkgl"), this.f56450a);
            try {
                String fromHashMap = HashonHelper.fromHashMap(a5);
                this.f56450a.clear();
                b5 = b(fromHashMap);
            } catch (Throwable th) {
                MobLog.getInstance().d("[LGSM] ULL onUd: E", new Object[0]);
                MobLog.getInstance().d(th);
            }
            if (!l.a("004g%fm!gh").equals(dHResponse.getDetailNetworkTypeForStatic())) {
                HashMap<String, Object> hashMap = new HashMap<>();
                hashMap.put("m", b5);
                NetworkHelper.NetworkTimeOut networkTimeOut = new NetworkHelper.NetworkTimeOut();
                networkTimeOut.readTimout = 10000;
                networkTimeOut.connectionTimeout = 10000;
                HashMap<String, String> hashMap2 = new HashMap<>();
                hashMap2.put(l.a("013EgmhkRh@fljmggfe2hgkDfk kUge"), aa.c());
                hashMap2.put(l.a("004.fhfmfkfe"), dHResponse.getODH());
                MobLog.getInstance().d("[LGSM] ULL onUd: Req", new Object[0]);
                String httpPostNew = new NetworkHelper().httpPostNew(i.a().a(com.kuaishou.weapon.p0.t.f55695n) + "/errlog", hashMap, hashMap2, networkTimeOut);
                MobLog.getInstance().d("[LGSM] ULL onUd: " + String.format("Resp(%s): %s", str, httpPostNew), new Object[0]);
                Object obj = HashonHelper.fromJson(httpPostNew).get(l.a("006Khk2kfk3fihk"));
                return (obj != null ? ((Integer) obj).intValue() : 0) == 200;
            }
            throw new IllegalStateException("network is disconnected!");
        }

        private HashMap<String, Object> a(DH.DHResponse dHResponse, int i4, String str) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put(l.a("0035gj8hOge"), u.a());
            hashMap.put(l.a("0041fefifkfe"), e.a((MobProduct) null));
            hashMap.put(l.a("004lifk"), Integer.valueOf(DH.SyncMtd.getPlatformCode()));
            hashMap.put(l.a("0037hkfegj"), str);
            hashMap.put(l.a("006!hkfegjff]hCfl"), Integer.valueOf(i4));
            hashMap.put(l.a("007fllgf>fh7h"), dHResponse.getAppName());
            hashMap.put(l.a("006flll)gjgl"), DH.SyncMtd.getPackageName());
            hashMap.put(l.a("006fll$ff!h?fl"), String.valueOf(DH.SyncMtd.getAppVersion()));
            hashMap.put(l.a("005+fhfmfe-hi"), DH.SyncMtd.getModel());
            if (com.mob.commons.b.b()) {
                hashMap.put(l.a("0087feBhIfffkTeh5fkfe"), dHResponse.getDeviceKey());
            }
            hashMap.put(l.a("006%hkgehkff4hUfl"), String.valueOf(DH.SyncMtd.getOSVersionInt()));
            hashMap.put(l.a("011ghk]hifmflgj2kYge[lh"), dHResponse.getDetailNetworkTypeForStatic());
            return hashMap;
        }
    }

    public void a(int i4, String str, int i5, String str2) {
        MobLog.getInstance().d("[LGSM] Sd curr", new Object[0]);
        if (i4 == 1) {
            new a().a(i5, i4, str, str2).run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(final Runnable runnable) {
        if (this.f56436c == null) {
            File file = new File(MobSDK.getContext().getFilesDir(), l.a("005_fn-iLfm1e.gj"));
            this.f56436c = file;
            if (!file.exists()) {
                try {
                    this.f56436c.createNewFile();
                } catch (Throwable unused) {
                }
            }
        }
        return p.a(this.f56436c, new o() { // from class: com.mob.commons.q.1
            @Override // com.mob.commons.o
            public boolean a(FileLocker fileLocker) {
                runnable.run();
                return false;
            }
        });
    }

    public int a(int i4, String str) {
        if (MobSDK.getContextSafely() != null && f56434a) {
            Intent intent = new Intent();
            intent.setPackage(l.a("015eg3fnhk:jfDfl:hShkfegjfn3i fmgl"));
            intent.putExtra(l.a("007lfeEgj(fYglGh"), MobSDK.getContext().getPackageName());
            intent.putExtra(l.a("008l$flfkfmflfk-k<ge"), i4);
            intent.putExtra(DeviceInfo.TAG_VERSION, MobSDK.SDK_VERSION_CODE);
            intent.putExtra(l.a("003Ifhhkgl"), a(str));
            ReflectHelper.invokeInstanceMethod(MobSDK.getContextSafely(), l.a("013@hkThg fehlflfmPfMfeDefNhk;k"), new Object[]{intent}, new Class[]{Intent.class}, 0);
        }
        return 0;
    }

    private String a(String str) {
        DataOutputStream dataOutputStream;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] c5 = v.c();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                try {
                    byte[] encode = new MobRSA(1024).encode(c5, this.f56437d, this.f56438e);
                    dataOutputStream.writeInt(encode.length);
                    dataOutputStream.write(encode);
                    byte[] AES128Encode = Data.AES128Encode(c5, str.getBytes("utf-8"));
                    dataOutputStream.writeInt(AES128Encode.length);
                    dataOutputStream.write(AES128Encode);
                    dataOutputStream.flush();
                    v.a(dataOutputStream, byteArrayOutputStream);
                    return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                } catch (Throwable th) {
                    th = th;
                    v.a(dataOutputStream, byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = null;
            }
        } catch (Throwable th3) {
            MobLog.getInstance().d(th3);
            return null;
        }
    }
}
