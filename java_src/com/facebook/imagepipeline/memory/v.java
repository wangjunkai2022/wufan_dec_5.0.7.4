package com.facebook.imagepipeline.memory;
/* compiled from: MemoryChunkUtil.java */
/* loaded from: classes2.dex */
public class v {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i4, int i5, int i6) {
        return Math.min(Math.max(0, i6 - i4), i5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i4, int i5, int i6, int i7, int i8) {
        com.facebook.common.internal.h.d(i7 >= 0);
        com.facebook.common.internal.h.d(i4 >= 0);
        com.facebook.common.internal.h.d(i6 >= 0);
        com.facebook.common.internal.h.d(i4 + i7 <= i8);
        com.facebook.common.internal.h.d(i6 + i7 <= i5);
    }
}
