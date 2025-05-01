package com.ss.android.downloadlib.n;

import android.annotation.TargetApi;
import android.os.AsyncTask;
/* loaded from: classes5.dex */
public class m {
    static final vv vv = new C0615m();

    @TargetApi(11)
    /* renamed from: com.ss.android.downloadlib.n.m$m  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static class C0615m extends vv {
        private C0615m() {
            super();
        }

        @Override // com.ss.android.downloadlib.n.m.vv
        public <T> void vv(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, tArr);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes5.dex */
    private static class vv {
        private vv() {
        }

        public <T> void vv(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
            try {
                asyncTask.execute(tArr);
            } catch (Throwable unused) {
            }
        }
    }

    public static <T> void vv(AsyncTask<T, ?, ?> asyncTask, T... tArr) {
        vv.vv(asyncTask, tArr);
    }
}
