package com.qq.e.comm.managers.devtool;

import android.content.Context;
import android.text.TextUtils;
/* loaded from: classes5.dex */
public class DevTools {

    /* renamed from: a  reason: collision with root package name */
    private String f59841a;

    public String getDemoGameUrl() {
        String str = this.f59841a;
        this.f59841a = null;
        return str;
    }

    public void testDemoGame(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context.getPackageName().equals("com.qq.e.union.demo.union")) {
            this.f59841a = str;
        }
    }
}
