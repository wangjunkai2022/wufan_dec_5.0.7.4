package com.danikula.videocache.file;

import java.io.File;
/* compiled from: TotalCountLruDiskUsage.java */
/* loaded from: classes2.dex */
public class g extends e {

    /* renamed from: b  reason: collision with root package name */
    private final int f10073b;

    public g(int i4) {
        if (i4 > 0) {
            this.f10073b = i4;
            return;
        }
        throw new IllegalArgumentException("Max count must be positive number!");
    }

    @Override // com.danikula.videocache.file.e
    protected boolean b(File file, long j4, int i4) {
        return i4 <= this.f10073b;
    }
}
