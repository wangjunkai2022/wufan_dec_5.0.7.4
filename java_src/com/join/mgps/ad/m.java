package com.join.mgps.ad;

import java.util.List;
/* compiled from: IInfoStreamVideo.java */
/* loaded from: classes4.dex */
public interface m<T> {
    void onADClick();

    void onADExpose();

    void onADLoaded(List<T> list);

    void onError(int i4, String str);

    void onInitSuccess();
}
