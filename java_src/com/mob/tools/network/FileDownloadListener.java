package com.mob.tools.network;

import com.mob.tools.proguard.EverythingKeeper;
@Deprecated
/* loaded from: classes5.dex */
public abstract class FileDownloadListener implements EverythingKeeper {
    private boolean isCanceled = false;

    public void cancel() {
        this.isCanceled = true;
    }

    public boolean isCanceled() {
        return this.isCanceled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onProgress(int i4, long j4, long j5);
}
