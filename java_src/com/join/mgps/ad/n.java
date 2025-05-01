package com.join.mgps.ad;

import java.util.Map;
/* compiled from: IRewardVideo.java */
/* loaded from: classes.dex */
public interface n {
    void a(String str, int i4, int i5);

    void b(boolean z4);

    void c(String str);

    void d(String str, int i4, int i5, Map<String, Object> map);

    void onADClick();

    void onADClose();

    void onADExpose();

    void onADShow();

    void onError(int i4, String str);

    void onInitSuccess();

    void onReward(Map<String, Object> map);

    void onVideoCached();

    void onVideoComplete();
}
