package com.kwad.sdk.h;
/* loaded from: classes5.dex */
abstract class n implements Runnable {
    abstract void doTask();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            doTask();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
