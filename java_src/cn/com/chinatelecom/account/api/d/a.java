package cn.com.chinatelecom.account.api.d;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static Executor f626b = Executors.newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    public Handler f627a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        f626b.execute(runnable);
    }
}
