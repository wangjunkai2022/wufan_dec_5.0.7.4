package com.ss.android.socialbase.appdownloader.u.vv;

import java.io.PrintStream;
/* loaded from: classes5.dex */
public class qv extends Exception {

    /* renamed from: m  reason: collision with root package name */
    protected int f60898m;

    /* renamed from: p  reason: collision with root package name */
    protected int f60899p;
    protected Throwable vv;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qv(java.lang.String r4, com.ss.android.socialbase.appdownloader.u.vv.n r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            if (r4 != 0) goto Lb
            r4 = r1
            goto L1c
        Lb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            java.lang.String r4 = " "
            r2.append(r4)
            java.lang.String r4 = r2.toString()
        L1c:
            r0.append(r4)
            if (r5 != 0) goto L23
            r4 = r1
            goto L3a
        L23:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "(position:"
            r4.<init>(r2)
            java.lang.String r2 = r5.i()
            r4.append(r2)
            java.lang.String r2 = ") "
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L3a:
            r0.append(r4)
            if (r6 != 0) goto L40
            goto L4a
        L40:
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "caused by: "
            java.lang.String r1 = r1.concat(r4)
        L4a:
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            r4 = -1
            r3.f60898m = r4
            r3.f60899p = r4
            if (r5 == 0) goto L67
            int r4 = r5.p()
            r3.f60898m = r4
            int r4 = r5.u()
            r3.f60899p = r4
        L67:
            r3.vv = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.appdownloader.u.vv.qv.<init>(java.lang.String, com.ss.android.socialbase.appdownloader.u.vv.n, java.lang.Throwable):void");
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        if (this.vv == null) {
            super.printStackTrace();
            return;
        }
        synchronized (System.err) {
            PrintStream printStream = System.err;
            printStream.println(super.getMessage() + "; nested exception is:");
            this.vv.printStackTrace();
        }
    }
}
