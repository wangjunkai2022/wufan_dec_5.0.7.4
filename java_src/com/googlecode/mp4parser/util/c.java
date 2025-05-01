package com.googlecode.mp4parser.util;
/* compiled from: CastUtils.java */
/* loaded from: classes3.dex */
public class c {
    public static int a(long j4) {
        if (j4 > 2147483647L || j4 < -2147483648L) {
            throw new RuntimeException("A cast to int has gone wrong. Please contact the mp4parser discussion group (" + j4 + ")");
        }
        return (int) j4;
    }
}
