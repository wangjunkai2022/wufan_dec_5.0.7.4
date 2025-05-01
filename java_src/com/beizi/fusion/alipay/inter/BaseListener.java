package com.beizi.fusion.alipay.inter;

import java.util.Map;
/* loaded from: classes2.dex */
public interface BaseListener {
    void failCallback(int i4, String str);

    void successCallBack(Map<String, Object> map);
}
