package com.airbnb.lottie.parser.moshi;

import external.org.apache.commons.lang3.d;
/* compiled from: JsonScope.java */
/* loaded from: classes2.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    static final int f4215a = 1;

    /* renamed from: b  reason: collision with root package name */
    static final int f4216b = 2;

    /* renamed from: c  reason: collision with root package name */
    static final int f4217c = 3;

    /* renamed from: d  reason: collision with root package name */
    static final int f4218d = 4;

    /* renamed from: e  reason: collision with root package name */
    static final int f4219e = 5;

    /* renamed from: f  reason: collision with root package name */
    static final int f4220f = 6;

    /* renamed from: g  reason: collision with root package name */
    static final int f4221g = 7;

    /* renamed from: h  reason: collision with root package name */
    static final int f4222h = 8;

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(int i4, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = iArr[i5];
            if (i6 == 1 || i6 == 2) {
                sb.append('[');
                sb.append(iArr2[i5]);
                sb.append(']');
            } else if (i6 == 3 || i6 == 4 || i6 == 5) {
                sb.append(d.f68897a);
                if (strArr[i5] != null) {
                    sb.append(strArr[i5]);
                }
            }
        }
        return sb.toString();
    }
}
