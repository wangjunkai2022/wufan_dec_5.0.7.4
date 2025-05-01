package com.ss.android.socialbase.downloader.depend;

import java.util.List;
/* loaded from: classes5.dex */
public abstract class m implements v {
    private boolean vv = false;

    @Override // com.ss.android.socialbase.downloader.depend.v
    public void vv(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.vv = true;
    }

    @Override // com.ss.android.socialbase.downloader.depend.v
    public boolean vv() {
        return this.vv;
    }
}
