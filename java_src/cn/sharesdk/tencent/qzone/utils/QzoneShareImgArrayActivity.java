package cn.sharesdk.tencent.qzone.utils;

import android.app.PendingIntent;
import android.widget.LinearLayout;
import cn.sharesdk.framework.PlatformActionListener;
import cn.sharesdk.framework.utils.SSDKLog;
import com.mob.tools.FakeActivity;
import java.lang.reflect.Method;
/* loaded from: classes2.dex */
public class QzoneShareImgArrayActivity extends FakeActivity {
    private String appid;
    private PlatformActionListener pa;

    @Override // com.mob.tools.FakeActivity
    public void onCreate() {
        try {
            LinearLayout linearLayout = new LinearLayout(this.activity);
            linearLayout.setOrientation(1);
            this.activity.setContentView(linearLayout);
        } catch (Throwable th) {
            SSDKLog.b().a(th);
        }
        try {
            Class<?> cls = Class.forName("cn.sharesdk.tencent.qq.ReceiveActivity");
            Method method = cls.getMethod("setUriScheme", String.class);
            method.invoke(null, "tencent" + this.appid);
            cls.getMethod("setPlatformActionListener", PlatformActionListener.class).invoke(null, this.pa);
        } catch (Throwable th2) {
            SSDKLog b5 = SSDKLog.b();
            b5.a("setlistener" + th2, new Object[0]);
        }
        PendingIntent pendingIntent = (PendingIntent) this.activity.getIntent().getParcelableExtra("key_extra_pending_intent");
        if (pendingIntent != null) {
            try {
                this.activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 0, 0, 0);
                finish();
                return;
            } catch (Throwable th3) {
                SSDKLog b6 = SSDKLog.b();
                b6.d("startIntentSenderForResult: " + th3, new Object[0]);
                PlatformActionListener platformActionListener = this.pa;
                if (platformActionListener != null) {
                    platformActionListener.onError(null, 9, new Throwable("-20 QQ版本过低"));
                }
                finish();
                return;
            }
        }
        SSDKLog.b().a("pI null", new Object[0]);
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setSharedCallback(PlatformActionListener platformActionListener) {
        this.pa = platformActionListener;
    }
}
