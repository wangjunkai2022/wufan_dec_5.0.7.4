package com.mob.commons;

import android.content.pm.ApplicationInfo;
import android.media.MediaDrm;
import android.os.Build;
import android.text.TextUtils;
import com.mob.MobSDK;
import com.mob.commons.a;
import com.mob.tools.MobLog;
import com.mob.tools.log.NLog;
import com.mob.tools.utils.DH;
import com.mob.tools.utils.Data;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes5.dex */
public class y {

    /* renamed from: e  reason: collision with root package name */
    private static volatile y f56497e;

    /* renamed from: f  reason: collision with root package name */
    private HashMap<String, Integer> f56502f;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f56498a = null;

    /* renamed from: b  reason: collision with root package name */
    private volatile String f56499b = null;

    /* renamed from: c  reason: collision with root package name */
    private volatile String f56500c = null;

    /* renamed from: d  reason: collision with root package name */
    private volatile String f56501d = null;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f56503g = new byte[0];

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f56504h = new byte[0];

    private y() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            HashMap hashMap = (HashMap) ab.a().a("key_drds");
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            if (hashMap.containsKey(str)) {
                int intValue = ((Integer) hashMap.get(str)).intValue();
                if (intValue < 100000) {
                    hashMap.put(str, Integer.valueOf(intValue + 1));
                }
            } else {
                hashMap.put(str, 1);
            }
            ArrayList<Map.Entry> arrayList = new ArrayList(hashMap.entrySet());
            Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: com.mob.commons.y.2
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                    return entry2.getValue().compareTo(entry.getValue());
                }
            });
            for (int size = arrayList.size(); size > 7; size--) {
                arrayList.remove(size - 1);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : arrayList) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            ab.a().a("key_drds", linkedHashMap);
            this.f56502f = new LinkedHashMap();
            int min = Math.min(3, arrayList.size());
            for (int i4 = 0; i4 < min; i4++) {
                Map.Entry entry2 = (Map.Entry) arrayList.get(i4);
                this.f56502f.put(entry2.getKey(), entry2.getValue());
            }
        } catch (Throwable th) {
            MobLog.getInstance().d(th);
        }
    }

    private String j() {
        if (!TextUtils.isEmpty(h())) {
            return "12" + c(h());
        } else if (!TextUtils.isEmpty(g())) {
            return "22" + c(g());
        } else if (!TextUtils.isEmpty(l())) {
            return "32" + c(this.f56501d);
        } else {
            return "42" + c(UUID.randomUUID().toString());
        }
    }

    private String k() {
        if (!TextUtils.isEmpty(h())) {
            return "12" + c(h());
        }
        return "42" + c(UUID.randomUUID().toString());
    }

    private String l() {
        DH.requester(MobSDK.getContext()).getOD().request(new DH.DHResponder() { // from class: com.mob.commons.y.1
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                String od = dHResponse.getOD();
                List<String> asList = Arrays.asList("00000000-0000-0000-0000-000000000000", "00000000000000000000000000000000");
                a.c i4 = ab.a().i();
                if (i4 != null && i4.d() != null) {
                    asList = i4.d();
                }
                if (TextUtils.isEmpty(od) || asList.contains(od)) {
                    return;
                }
                y.this.f56501d = od;
            }
        });
        return this.f56501d;
    }

    private String m() throws Throwable {
        if (Build.VERSION.SDK_INT < 18) {
            return null;
        }
        final String[] strArr = {null};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        z.f56519c.execute(new com.mob.tools.utils.i() { // from class: com.mob.commons.y.3
            @Override // com.mob.tools.utils.i
            protected void a() {
                long currentTimeMillis = System.currentTimeMillis();
                String a5 = com.mob.commons.a.l.a("061h)fjkgeeiigiiiEg)fgjlik4gdRemeeThCiigj?dgKfgedimemejfkejggjliikgjlieem0j3fkfj2dRfjijggKdWggemelgjfkijedifigif-d%iiigigjljl?d'iggi");
                UUID uuid = new UUID(-1301668207276963122L, -6645017420763422227L);
                MediaDrm mediaDrm = null;
                try {
                    try {
                        MediaDrm mediaDrm2 = new MediaDrm(uuid);
                        try {
                            com.mob.tools.a.d.a(MobSDK.getContext()).a(mediaDrm2.getClass(), mediaDrm2, com.mob.commons.a.l.a("012fej]ejeeFgVeigj8gj:ehFk"), new Class[]{Object.class, byte[].class, String.class}, new Object[]{new WeakReference(mediaDrm2), y.this.a(uuid), a5}, (Object[]) null);
                            byte[] propertyByteArray = mediaDrm2.getPropertyByteArray(com.mob.commons.a.l.a("014EedPgHeeejYdg5fl=f;ejefehTg$ffed"));
                            strArr[0] = Data.byteToHex(propertyByteArray, 0, propertyByteArray.length);
                            NLog mobLog = MobLog.getInstance();
                            mobLog.d("rddd wv c " + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
                            countDownLatch.countDown();
                            if (Build.VERSION.SDK_INT >= 28) {
                                mediaDrm2.close();
                            } else {
                                mediaDrm2.release();
                            }
                        } catch (Throwable th) {
                            th = th;
                            mediaDrm = mediaDrm2;
                            try {
                                MobLog.getInstance().d(th);
                                countDownLatch.countDown();
                                if (Build.VERSION.SDK_INT >= 28) {
                                    if (mediaDrm != null) {
                                        mediaDrm.close();
                                    }
                                } else if (mediaDrm != null) {
                                    mediaDrm.release();
                                }
                            } catch (Throwable th2) {
                                try {
                                    countDownLatch.countDown();
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        if (mediaDrm != null) {
                                            mediaDrm.close();
                                        }
                                    } else if (mediaDrm != null) {
                                        mediaDrm.release();
                                    }
                                } catch (Throwable th3) {
                                    MobLog.getInstance().d(th3);
                                }
                                throw th2;
                            }
                        }
                    } catch (Throwable th4) {
                        MobLog.getInstance().d(th4);
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        });
        countDownLatch.await(3L, TimeUnit.SECONDS);
        return strArr[0];
    }

    private String n() {
        final String[] strArr = new String[1];
        if (b.a(com.mob.commons.a.l.a("003ehh"))) {
            try {
                strArr[0] = ab.a().b("key_pddt", (String) null);
                if (!TextUtils.isEmpty(strArr[0])) {
                    long b5 = ab.a().b("key_lgpdt", 0L);
                    long j4 = 604800000;
                    try {
                        j4 = Long.parseLong(String.valueOf(b.a(com.mob.commons.a.l.a("006IgjfdgjfkBek"), 604800))) * 1000;
                    } catch (Throwable unused) {
                    }
                    if (System.currentTimeMillis() - b5 < j4) {
                        MobLog.getInstance().d("rddd che p useable", new Object[0]);
                        return strArr[0];
                    }
                }
                if ((com.mob.commons.a.l.a("004Geeejeeel").equalsIgnoreCase(DH.SyncMtd.getManufacturer()) && Build.VERSION.SDK_INT <= 25) || (com.mob.commons.a.l.a("006iRehOePghYgUej").equalsIgnoreCase(DH.SyncMtd.getManufacturer()) && Build.VERSION.SDK_INT <= 22)) {
                    return null;
                }
                final List<String> o4 = o();
                if (!o4.isEmpty()) {
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    final StringBuilder sb = new StringBuilder();
                    DH.RequestBuilder requester = DH.requester(MobSDK.getContext());
                    for (String str : o4) {
                        requester.getAInfoForPkg(str, 1);
                    }
                    requester.request(new DH.DHResponder() { // from class: com.mob.commons.y.4
                        @Override // com.mob.tools.utils.DH.DHResponder
                        public void onResponse(DH.DHResponse dHResponse) {
                            int i4 = 0;
                            for (int i5 = 0; i5 < o4.size(); i5++) {
                                try {
                                    ApplicationInfo aInfoForPkg = dHResponse.getAInfoForPkg(i5);
                                    if (aInfoForPkg != null) {
                                        sb.append((String) o4.get(i5));
                                        sb.append(com.mob.tools.c.a(aInfoForPkg, (String) o4.get(i5)));
                                        i4++;
                                    }
                                } finally {
                                    countDownLatch.countDown();
                                }
                            }
                            if (i4 > 0) {
                                StringBuilder sb2 = sb;
                                String str2 = Build.BRAND;
                                Locale locale = Locale.ROOT;
                                sb2.append(str2.toUpperCase(locale));
                                sb2.append(Build.MODEL.toUpperCase(locale));
                                sb2.append(Build.MANUFACTURER.toUpperCase(locale));
                                sb.append(i4);
                                strArr[0] = Data.MD5(sb.toString());
                                ab.a().a("key_pddt", strArr[0]);
                                ab.a().a("key_lgpdt", System.currentTimeMillis());
                            }
                        }
                    });
                    try {
                        countDownLatch.await(1000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable unused2) {
                    }
                }
            } catch (Throwable th) {
                MobLog.getInstance().d(th);
            }
        }
        return strArr[0];
    }

    private List<String> o() {
        final ArrayList arrayList = new ArrayList();
        DH.requester(MobSDK.getContext()).getSA().request(new DH.DHResponder() { // from class: com.mob.commons.y.5
            @Override // com.mob.tools.utils.DH.DHResponder
            public void onResponse(DH.DHResponse dHResponse) {
                if (dHResponse.getSA() == null || dHResponse.getSA().isEmpty()) {
                    return;
                }
                Iterator<HashMap<String, String>> it2 = dHResponse.getSA().iterator();
                while (it2.hasNext()) {
                    String str = it2.next().get(com.mob.commons.a.l.a("003kKfifk"));
                    if (str != null && !str.contains("com.google.android") && !str.contains("com.miui.packageinstaller")) {
                        arrayList.add(str);
                    }
                }
                Collections.sort(arrayList);
            }
        });
        return arrayList;
    }

    public String b() {
        return "2";
    }

    public String c() {
        if (TextUtils.isEmpty(this.f56499b)) {
            String b5 = ab.a().b("key_rdt2", (String) null);
            if (!TextUtils.isEmpty(b5)) {
                this.f56499b = b5;
            }
        }
        return this.f56499b;
    }

    public boolean d() {
        if (TextUtils.isEmpty(this.f56499b)) {
            synchronized (this) {
                if (TextUtils.isEmpty(this.f56499b)) {
                    return TextUtils.isEmpty(ab.a().b("key_rdt2", (String) null));
                }
                return false;
            }
        }
        return false;
    }

    public synchronized String e() {
        String c5;
        c5 = c();
        if (TextUtils.isEmpty(c5)) {
            c5 = j();
            this.f56499b = c5;
            if (!TextUtils.isEmpty(c5)) {
                ab.a().a("key_rdt2", c5);
            }
        }
        return c5;
    }

    public String f() {
        String c5 = c();
        if (TextUtils.isEmpty(c5)) {
            c5 = k();
            this.f56499b = c5;
            if (!TextUtils.isEmpty(c5)) {
                ab.a().a("key_rdt2", c5);
            }
        }
        return c5;
    }

    public String g() {
        if (TextUtils.isEmpty(this.f56500c)) {
            synchronized (this.f56504h) {
                if (TextUtils.isEmpty(this.f56500c)) {
                    this.f56500c = n();
                }
            }
        }
        return this.f56500c;
    }

    public String h() {
        if (TextUtils.isEmpty(this.f56498a)) {
            synchronized (this.f56503g) {
                if (TextUtils.isEmpty(this.f56498a)) {
                    this.f56498a = m();
                    b(this.f56498a);
                }
            }
        }
        return this.f56498a;
    }

    public HashMap<String, Integer> i() {
        return this.f56502f;
    }

    public static y a() {
        if (f56497e == null) {
            synchronized (y.class) {
                if (f56497e == null) {
                    f56497e = new y();
                }
            }
        }
        return f56497e;
    }

    private String c(String str) {
        StringBuilder sb = new StringBuilder(str);
        String manufacturer = DH.SyncMtd.getManufacturer();
        String model = DH.SyncMtd.getModel();
        if (!TextUtils.isEmpty(manufacturer)) {
            sb.append(manufacturer.trim().toUpperCase());
        }
        if (!TextUtils.isEmpty(model)) {
            sb.append(model.trim().toUpperCase());
        }
        return Data.MD5(sb.toString());
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, this.f56499b)) {
            return;
        }
        NLog mobLog = MobLog.getInstance();
        mobLog.d("rddd saveRD pre is " + this.f56499b + " cur is " + str, new Object[0]);
        ab.a().a("key_rdt2", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] a(UUID uuid) {
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        byte[] bArr = new byte[16];
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = (7 - i4) * 8;
            bArr[i4] = (byte) (mostSignificantBits >>> i5);
            bArr[i4 + 8] = (byte) (leastSignificantBits >>> i5);
        }
        return bArr;
    }
}
