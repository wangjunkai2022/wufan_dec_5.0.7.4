package cn.sharesdk.framework.utils;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.bytedance.sdk.openadsdk.TTAdConstant;
/* compiled from: PendingIntentUtils.java */
/* loaded from: classes2.dex */
public class c {
    public static PendingIntent a(Context context, int i4, Intent intent, int i5) {
        if (Build.VERSION.SDK_INT >= 23) {
            return PendingIntent.getBroadcast(context, i4, intent, TTAdConstant.KEY_CLICK_AREA);
        }
        return PendingIntent.getBroadcast(context, i4, intent, i5);
    }
}
