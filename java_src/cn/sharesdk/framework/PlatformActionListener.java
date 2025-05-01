package cn.sharesdk.framework;

import java.util.HashMap;
/* loaded from: classes2.dex */
public interface PlatformActionListener {
    void onCancel(Platform platform, int i4);

    void onComplete(Platform platform, int i4, HashMap<String, Object> hashMap);

    void onError(Platform platform, int i4, Throwable th);
}
