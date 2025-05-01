package com.ss.android.socialbase.downloader.wv;

import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class qv<K, T> extends LinkedHashMap<K, T> {
    private int vv;

    public qv() {
        this(4, 4);
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, T> entry) {
        return size() > this.vv;
    }

    public void vv(int i4) {
        this.vv = i4;
    }

    public qv(int i4, int i5) {
        this(i4, i5, true);
    }

    public qv(int i4, int i5, boolean z4) {
        super(i4, 0.75f, z4);
        vv(i5);
    }
}
