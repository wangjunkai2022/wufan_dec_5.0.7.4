package com.aggmoread.sdk.z.c.a.a.d.b;
/* loaded from: classes2.dex */
public class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3256a;

        static {
            int[] iArr = new int[com.aggmoread.sdk.z.c.a.a.c.i.values().length];
            f3256a = iArr;
            try {
                iArr[com.aggmoread.sdk.z.c.a.a.c.i.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3256a[com.aggmoread.sdk.z.c.a.a.c.i.SPLASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3256a[com.aggmoread.sdk.z.c.a.a.c.i.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3256a[com.aggmoread.sdk.z.c.a.a.c.i.REWARD_VIDEO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3256a[com.aggmoread.sdk.z.c.a.a.c.i.INFORMATION_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3256a[com.aggmoread.sdk.z.c.a.a.c.i.FULL_SCREEN_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3256a[com.aggmoread.sdk.z.c.a.a.c.i.DRAW.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r5.f3261e.a() == com.aggmoread.sdk.z.c.a.a.c.i.DRAW.a()) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.aggmoread.sdk.z.c.a.a.d.b.a a(com.aggmoread.sdk.z.c.a.a.d.b.d r5, com.aggmoread.sdk.z.c.a.a.d.b.e r6) {
        /*
            r4 = this;
            com.aggmoread.sdk.z.c.a.a.e.f r0 = r6.f3309c
            java.lang.Object r1 = com.aggmoread.sdk.z.c.a.a.d.b.e.c.U
            java.lang.String r0 = r0.c(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L95
            if (r1 != 0) goto L9d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L95
            com.aggmoread.sdk.z.c.a.a.c.i r1 = r5.f3261e     // Catch: java.lang.Exception -> L95
            int r1 = r1.a()     // Catch: java.lang.Exception -> L95
            if (r1 != r0) goto L82
            int[] r0 = com.aggmoread.sdk.z.c.a.a.d.b.b.a.f3256a     // Catch: java.lang.Exception -> L95
            com.aggmoread.sdk.z.c.a.a.c.i r1 = r5.f3261e     // Catch: java.lang.Exception -> L95
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> L95
            r0 = r0[r1]     // Catch: java.lang.Exception -> L95
            switch(r0) {
                case 1: goto L7d;
                case 2: goto L78;
                case 3: goto L73;
                case 4: goto L6e;
                case 5: goto L2f;
                case 6: goto L29;
                case 7: goto L90;
                default: goto L27;
            }     // Catch: java.lang.Exception -> L95
        L27:
            goto L9d
        L29:
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.d(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L2f:
            com.aggmoread.sdk.z.c.a.a.e.f r0 = r6.f3309c     // Catch: java.lang.Exception -> L95
            java.lang.Object r1 = com.aggmoread.sdk.z.c.a.a.d.b.e.c.S     // Catch: java.lang.Exception -> L95
            java.lang.String r2 = "2"
            java.lang.String r0 = r0.a(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = "xxx"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L95
            r2.<init>()     // Catch: java.lang.Exception -> L95
            java.lang.String r3 = "v1 "
            r2.append(r3)     // Catch: java.lang.Exception -> L95
            r2.append(r0)     // Catch: java.lang.Exception -> L95
            java.lang.String r3 = ", v2 "
            r2.append(r3)     // Catch: java.lang.Exception -> L95
            java.lang.String r3 = r5.f3262f     // Catch: java.lang.Exception -> L95
            r2.append(r3)     // Catch: java.lang.Exception -> L95
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L95
            com.aggmoread.sdk.z.c.a.a.e.e.b(r1, r2)     // Catch: java.lang.Exception -> L95
            java.lang.String r1 = r5.f3262f     // Catch: java.lang.Exception -> L95
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L95
            if (r1 != 0) goto L9d
            java.lang.String r1 = r5.f3262f     // Catch: java.lang.Exception -> L95
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Exception -> L95
            if (r0 == 0) goto L9d
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.e(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L6e:
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.g(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L73:
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.f(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L78:
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.h(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L7d:
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.b(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L82:
            com.aggmoread.sdk.z.c.a.a.c.i r0 = r5.f3261e     // Catch: java.lang.Exception -> L95
            int r0 = r0.a()     // Catch: java.lang.Exception -> L95
            com.aggmoread.sdk.z.c.a.a.c.i r1 = com.aggmoread.sdk.z.c.a.a.c.i.DRAW     // Catch: java.lang.Exception -> L95
            int r1 = r1.a()     // Catch: java.lang.Exception -> L95
            if (r0 != r1) goto L9d
        L90:
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = r4.c(r5, r6)     // Catch: java.lang.Exception -> L95
            goto L9e
        L95:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.aggmoread.sdk.z.c.a.a.e.e.a(r0)
        L9d:
            r0 = 0
        L9e:
            if (r0 != 0) goto La5
            com.aggmoread.sdk.z.c.a.a.d.b.a r0 = new com.aggmoread.sdk.z.c.a.a.d.b.a
            r0.<init>(r5, r6)
        La5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aggmoread.sdk.z.c.a.a.d.b.b.a(com.aggmoread.sdk.z.c.a.a.d.b.d, com.aggmoread.sdk.z.c.a.a.d.b.e):com.aggmoread.sdk.z.c.a.a.d.b.a");
    }

    public boolean a() {
        return false;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a b(d dVar, e eVar) {
        return null;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a c(d dVar, e eVar) {
        return null;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a d(d dVar, e eVar) {
        return null;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a e(d dVar, e eVar) {
        return null;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a f(d dVar, e eVar) {
        return null;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a g(d dVar, e eVar) {
        return null;
    }

    public com.aggmoread.sdk.z.c.a.a.d.b.a h(d dVar, e eVar) {
        return null;
    }
}
