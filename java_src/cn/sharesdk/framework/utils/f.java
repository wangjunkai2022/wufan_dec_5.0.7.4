package cn.sharesdk.framework.utils;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.MobHandlerThread;
/* compiled from: SSDKHandlerThread.java */
/* loaded from: classes2.dex */
public abstract class f implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    protected final Handler f1059a = MobHandlerThread.newHandler(this);

    public void a(int i4, int i5, Object obj) {
        Message message = new Message();
        message.what = -1;
        message.arg1 = i4;
        message.arg2 = i5;
        message.obj = obj;
        this.f1059a.sendMessage(message);
    }

    protected void a(Message message) {
    }

    protected abstract void b(Message message);

    public void c() {
        a(0, 0, null);
    }

    protected void c(Message message) {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 == -2) {
            c(message);
            return false;
        } else if (i4 != -1) {
            b(message);
            return false;
        } else {
            a(message);
            return false;
        }
    }
}
