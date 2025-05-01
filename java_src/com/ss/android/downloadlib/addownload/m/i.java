package com.ss.android.downloadlib.addownload.m;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.ss.android.downloadlib.addownload.b;
import java.util.Iterator;
import java.util.LinkedList;
import q.a;
/* loaded from: classes5.dex */
public class i {
    private static volatile i vv;

    /* renamed from: m  reason: collision with root package name */
    private final LinkedList<vv> f60496m = new LinkedList<>();

    /* renamed from: p  reason: collision with root package name */
    private static final String[] f60495p = {"com", a.f73126a, "ss"};

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f60494i = {3101, 3102, 3103, 3201, 3202, 3203};

    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        public final String f60497i;

        /* renamed from: m  reason: collision with root package name */
        public final int f60498m;

        /* renamed from: o  reason: collision with root package name */
        public final long f60499o;

        /* renamed from: p  reason: collision with root package name */
        public final String f60500p;
        public final String vv;

        private vv(String str, int i4, String str2, String str3, long j4) {
            this.vv = str;
            this.f60498m = i4;
            this.f60500p = str2 != null ? str2.toLowerCase() : null;
            this.f60497i = str3 != null ? str3.toLowerCase() : null;
            this.f60499o = j4;
        }
    }

    private i() {
    }

    private vv p(String str) {
        try {
            PackageManager packageManager = b.getContext().getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return new vv(str, packageInfo.versionCode, packageInfo.versionName, (String) packageManager.getApplicationLabel(packageInfo.applicationInfo), System.currentTimeMillis());
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static i vv() {
        if (vv == null) {
            synchronized (i.class) {
                if (vv == null) {
                    vv = new i();
                }
            }
        }
        return vv;
    }

    public void m(String str) {
        m();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f60496m) {
            Iterator<vv> it2 = this.f60496m.iterator();
            while (it2.hasNext()) {
                if (str.equals(it2.next().vv)) {
                    it2.remove();
                    return;
                }
            }
        }
    }

    public void vv(String str) {
        vv p4;
        m();
        if (TextUtils.isEmpty(str) || (p4 = p(str)) == null) {
            return;
        }
        synchronized (this.f60496m) {
            this.f60496m.add(p4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        r7[1] = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00de, code lost:
        r7[2] = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<com.ss.android.downloadlib.addownload.m.i.vv, java.lang.Integer> m(com.ss.android.downloadad.api.vv.m r19) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.m.i.m(com.ss.android.downloadad.api.vv.m):android.util.Pair");
    }

    public vv vv(com.ss.android.downloadad.api.vv.m mVar) {
        if (mVar == null) {
            return null;
        }
        m();
        synchronized (this.f60496m) {
            Iterator<vv> it2 = this.f60496m.iterator();
            while (it2.hasNext()) {
                vv next = it2.next();
                if (next.f60499o > mVar.pd()) {
                    return next;
                }
            }
            return null;
        }
    }

    private static boolean vv(String str, String str2) {
        String[] split;
        String[] split2;
        boolean z4;
        try {
            split = str.split("\\.");
            split2 = str2.split("\\.");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (split.length != 0 && split2.length != 0) {
            int i4 = 0;
            int i5 = 0;
            for (String str3 : split) {
                String[] strArr = f60495p;
                int length = strArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        z4 = false;
                        break;
                    }
                    String str4 = strArr[i6];
                    if (str4.equals(str3)) {
                        if (i4 < split2.length && str4.equals(split2[i4])) {
                            i4++;
                        }
                        z4 = true;
                    } else {
                        i6++;
                    }
                }
                if (!z4) {
                    int i7 = i5;
                    int i8 = i4;
                    while (i4 < split2.length) {
                        if (str3.equals(split2[i4])) {
                            if (i4 == i8) {
                                i8++;
                            }
                            i7++;
                            if (i7 >= 2) {
                                return true;
                            }
                        }
                        i4++;
                    }
                    i4 = i8;
                    i5 = i7;
                }
            }
            return false;
        }
        return false;
    }

    private void m() {
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f60496m) {
            Iterator<vv> it2 = this.f60496m.iterator();
            while (it2.hasNext() && currentTimeMillis - it2.next().f60499o > 1800000) {
                it2.remove();
            }
        }
    }
}
