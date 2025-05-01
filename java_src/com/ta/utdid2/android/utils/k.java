package com.ta.utdid2.android.utils;
/* loaded from: classes5.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f62059a = "com.ta.utdid2.android.utils.k";

    /* renamed from: b  reason: collision with root package name */
    public static final int f62060b = 86400000;

    public static boolean a(long j4, int i4) {
        boolean z4 = (System.currentTimeMillis() - j4) / 86400000 < ((long) i4);
        if (d.f62050b) {
            StringBuilder sb = new StringBuilder("isUpToDate: ");
            sb.append(z4);
            sb.append("; oldTimestamp: ");
            sb.append(j4);
            sb.append("; currentTimestamp");
            sb.append(System.currentTimeMillis());
        }
        return z4;
    }
}
