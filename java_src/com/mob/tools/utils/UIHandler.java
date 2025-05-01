package com.mob.tools.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mob.tools.proguard.PublicMemberKeeper;
/* loaded from: classes5.dex */
public class UIHandler implements PublicMemberKeeper {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f57030a;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Message f57031a;

        /* renamed from: b  reason: collision with root package name */
        public final Handler.Callback f57032b;

        public a(Message message, Handler.Callback callback) {
            this.f57031a = message;
            this.f57032b = callback;
        }
    }

    private static void b() {
        f57030a = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.mob.tools.utils.UIHandler.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                UIHandler.b(message);
                return false;
            }
        });
    }

    public static boolean sendEmptyMessage(int i4, Handler.Callback callback) {
        a();
        return f57030a.sendMessage(a(i4, callback));
    }

    public static boolean sendEmptyMessageDelayed(int i4, long j4, Handler.Callback callback) {
        a();
        return f57030a.sendMessageDelayed(a(i4, callback), j4);
    }

    public static boolean sendMessage(Message message, Handler.Callback callback) {
        a();
        return f57030a.sendMessage(a(message, callback));
    }

    public static boolean sendMessageDelayed(Message message, long j4, Handler.Callback callback) {
        a();
        return f57030a.sendMessageDelayed(a(message, callback), j4);
    }

    private static synchronized void a() {
        synchronized (UIHandler.class) {
            if (f57030a == null) {
                b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Message message) {
        a aVar = (a) message.obj;
        Message message2 = aVar.f57031a;
        Handler.Callback callback = aVar.f57032b;
        if (callback != null) {
            callback.handleMessage(message2);
        }
    }

    private static Message a(Message message, Handler.Callback callback) {
        Message message2 = new Message();
        message2.obj = new a(message, callback);
        return message2;
    }

    private static Message a(int i4, Handler.Callback callback) {
        Message message = new Message();
        message.what = i4;
        return a(message, callback);
    }
}
