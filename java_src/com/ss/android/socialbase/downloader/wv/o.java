package com.ss.android.socialbase.downloader.wv;
/* loaded from: classes5.dex */
public class o {

    /* renamed from: i  reason: collision with root package name */
    private int f61473i = 10;

    /* renamed from: m  reason: collision with root package name */
    private vv f61474m;

    /* renamed from: p  reason: collision with root package name */
    private int f61475p;
    private vv vv;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class vv {

        /* renamed from: i  reason: collision with root package name */
        vv f61476i;

        /* renamed from: m  reason: collision with root package name */
        long f61477m;

        /* renamed from: p  reason: collision with root package name */
        vv f61478p;
        long vv;

        private vv() {
        }
    }

    public long m(long j4, long j5) {
        synchronized (this) {
            vv vvVar = this.vv;
            if (vvVar == null) {
                return -1L;
            }
            vv vv2 = vv(j4);
            if (vv2 == null) {
                return -1L;
            }
            long j6 = vvVar.vv - vv2.vv;
            long j7 = j5 - vv2.f61477m;
            if (j6 < 0 || j7 <= 0) {
                return -1L;
            }
            return j6 / j7;
        }
    }

    public boolean vv(long j4, long j5) {
        synchronized (this) {
            vv vvVar = this.vv;
            if (vvVar != null) {
                if (j4 >= vvVar.vv && j5 >= vvVar.f61477m) {
                    vv vvVar2 = vvVar.f61478p;
                    if (vvVar2 != null && j5 - vvVar2.f61477m < 1000) {
                        vvVar.vv = j4;
                        vvVar.f61477m = j5;
                        return true;
                    }
                }
                return false;
            }
            vv vv2 = vv();
            vv2.vv = j4;
            vv2.f61477m = j5;
            if (vvVar != null) {
                vv2.f61478p = vvVar;
                vvVar.f61476i = vv2;
            }
            this.vv = vv2;
            return true;
        }
    }

    private vv vv() {
        vv vvVar;
        int i4 = this.f61475p;
        if (i4 >= this.f61473i && (vvVar = this.f61474m) != null) {
            vv vvVar2 = vvVar.f61476i;
            vvVar.f61476i = null;
            this.f61474m = vvVar2;
            if (vvVar2 != null) {
                vvVar2.f61478p = null;
            }
            return vvVar;
        }
        this.f61475p = i4 + 1;
        return new vv();
    }

    private vv vv(long j4) {
        vv vvVar = this.vv;
        vv vvVar2 = null;
        while (vvVar != null && vvVar.f61477m > j4) {
            vvVar2 = vvVar;
            vvVar = vvVar.f61478p;
        }
        return (vvVar == null || vvVar2 == null || vvVar == vvVar2 || j4 - vvVar.f61477m >= vvVar2.f61477m - j4) ? vvVar2 : vvVar;
    }
}
