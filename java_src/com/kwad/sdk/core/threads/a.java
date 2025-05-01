package com.kwad.sdk.core.threads;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes5.dex */
public final class a {
    private static Map<String, WeakReference<C0527a>> aBH = new ConcurrentHashMap();

    /* renamed from: com.kwad.sdk.core.threads.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class C0527a {
        private HandlerThread aBI;
        private Handler fS;

        public C0527a(String str) {
            String str2;
            if (TextUtils.isEmpty(str)) {
                str2 = "ksad-HT";
            } else {
                str2 = "ksad-" + str;
            }
            HandlerThread handlerThread = new HandlerThread(str2);
            this.aBI = handlerThread;
            handlerThread.start();
            this.fS = new Handler(this.aBI.getLooper());
        }

        public final Handler getHandler() {
            return this.fS;
        }
    }

    public static synchronized Handler Gi() {
        Handler handler;
        synchronized (a.class) {
            handler = eC("commonHT").getHandler();
        }
        return handler;
    }

    public static synchronized Handler Gj() {
        Handler handler;
        synchronized (a.class) {
            handler = eC("reportHT").getHandler();
        }
        return handler;
    }

    @NonNull
    private static C0527a eC(String str) {
        WeakReference<C0527a> weakReference = aBH.get(str);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        C0527a c0527a = new C0527a(str);
        aBH.put(str, new WeakReference<>(c0527a));
        return c0527a;
    }
}
