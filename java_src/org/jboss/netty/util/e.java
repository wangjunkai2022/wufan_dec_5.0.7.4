package org.jboss.netty.util;

import java.util.Objects;
/* compiled from: ThreadRenamingRunnable.java */
/* loaded from: classes7.dex */
public class e implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static volatile d f72739e = d.f72737a;

    /* renamed from: b  reason: collision with root package name */
    private final d f72740b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f72741c;

    /* renamed from: d  reason: collision with root package name */
    private final String f72742d;

    public e(Runnable runnable, String str, d dVar) {
        Objects.requireNonNull(runnable, "runnable");
        Objects.requireNonNull(str, "proposedThreadName");
        this.f72741c = runnable;
        this.f72740b = dVar;
        this.f72742d = str;
    }

    private String a(String str) {
        String str2;
        try {
            d dVar = this.f72740b;
            if (dVar == null) {
                dVar = b();
            }
            str2 = dVar.a(str, this.f72742d);
        } catch (Throwable th) {
            th.printStackTrace();
            str2 = null;
        }
        return str2 == null ? str : str2;
    }

    public static d b() {
        return f72739e;
    }

    public static void c(d dVar) {
        Objects.requireNonNull(dVar, "threadNameDeterminer");
        f72739e = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = r4.a(r1)
            boolean r3 = r1.equals(r2)
            if (r3 != 0) goto L1b
            r0.setName(r2)     // Catch: java.lang.SecurityException -> L17
            r2 = 1
            goto L1c
        L17:
            r2 = move-exception
            r2.printStackTrace()
        L1b:
            r2 = 0
        L1c:
            java.lang.Runnable r3 = r4.f72741c     // Catch: java.lang.Throwable -> L27
            r3.run()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L26
            r0.setName(r1)
        L26:
            return
        L27:
            r3 = move-exception
            if (r2 == 0) goto L2d
            r0.setName(r1)
        L2d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jboss.netty.util.e.run():void");
    }

    public e(Runnable runnable, String str) {
        this(runnable, str, null);
    }
}
