package cn.sharesdk.framework;

import android.os.Handler;
import android.os.Message;
import com.mob.tools.utils.UIHandler;
import java.util.HashMap;
/* loaded from: classes2.dex */
public class ReflectablePlatformActionListener implements PlatformActionListener {

    /* renamed from: a  reason: collision with root package name */
    private int f770a;

    /* renamed from: b  reason: collision with root package name */
    private Handler.Callback f771b;

    /* renamed from: c  reason: collision with root package name */
    private int f772c;

    /* renamed from: d  reason: collision with root package name */
    private Handler.Callback f773d;

    /* renamed from: e  reason: collision with root package name */
    private int f774e;

    /* renamed from: f  reason: collision with root package name */
    private Handler.Callback f775f;

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onCancel(Platform platform, int i4) {
        if (this.f775f != null) {
            Message message = new Message();
            message.what = this.f774e;
            message.obj = new Object[]{platform, Integer.valueOf(i4)};
            UIHandler.sendMessage(message, this.f775f);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap) {
        if (this.f771b != null) {
            Message message = new Message();
            message.what = this.f770a;
            message.obj = new Object[]{platform, Integer.valueOf(i4), hashMap};
            UIHandler.sendMessage(message, this.f771b);
        }
    }

    @Override // cn.sharesdk.framework.PlatformActionListener
    public void onError(Platform platform, int i4, Throwable th) {
        if (this.f773d != null) {
            Message message = new Message();
            message.what = this.f772c;
            message.obj = new Object[]{platform, Integer.valueOf(i4), th};
            UIHandler.sendMessage(message, this.f773d);
        }
    }

    public void setOnCancelCallback(int i4, Handler.Callback callback) {
        this.f774e = i4;
        this.f775f = callback;
    }

    public void setOnCompleteCallback(int i4, Handler.Callback callback) {
        this.f770a = i4;
        this.f771b = callback;
    }

    public void setOnErrorCallback(int i4, Handler.Callback callback) {
        this.f772c = i4;
        this.f773d = callback;
    }
}
