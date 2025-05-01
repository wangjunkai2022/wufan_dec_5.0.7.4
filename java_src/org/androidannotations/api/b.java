package org.androidannotations.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
/* compiled from: UiThreadExecutor.java */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f72056a = new a(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, C0792b> f72057b = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UiThreadExecutor.java */
    /* loaded from: classes7.dex */
    public static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Runnable callback = message.getCallback();
            if (callback != null) {
                callback.run();
                b.c((C0792b) message.obj);
                return;
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UiThreadExecutor.java */
    /* renamed from: org.androidannotations.api.b$b  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public static final class C0792b {

        /* renamed from: a  reason: collision with root package name */
        int f72058a;

        /* renamed from: b  reason: collision with root package name */
        final String f72059b;

        /* synthetic */ C0792b(String str, a aVar) {
            this(str);
        }

        private C0792b(String str) {
            this.f72058a = 0;
            this.f72059b = str;
        }
    }

    private b() {
    }

    public static void b(String str) {
        C0792b remove;
        Map<String, C0792b> map = f72057b;
        synchronized (map) {
            remove = map.remove(str);
        }
        if (remove == null) {
            return;
        }
        f72056a.removeCallbacksAndMessages(remove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(C0792b c0792b) {
        String str;
        C0792b remove;
        Map<String, C0792b> map = f72057b;
        synchronized (map) {
            int i4 = c0792b.f72058a - 1;
            c0792b.f72058a = i4;
            if (i4 == 0 && (remove = map.remove((str = c0792b.f72059b))) != c0792b) {
                map.put(str, remove);
            }
        }
    }

    private static C0792b d(String str) {
        C0792b c0792b;
        Map<String, C0792b> map = f72057b;
        synchronized (map) {
            c0792b = map.get(str);
            if (c0792b == null) {
                c0792b = new C0792b(str, null);
                map.put(str, c0792b);
            }
            c0792b.f72058a++;
        }
        return c0792b;
    }

    public static void e(String str, Runnable runnable, long j4) {
        if ("".equals(str)) {
            f72056a.postDelayed(runnable, j4);
            return;
        }
        f72056a.postAtTime(runnable, d(str), SystemClock.uptimeMillis() + j4);
    }
}
