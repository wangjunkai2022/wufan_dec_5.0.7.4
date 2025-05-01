package com.sdk.n;

import com.sdk.Unicorn.base.module.manager.SDKManager;
import com.sdk.f.g;
import com.sdk.o.b;
import java.util.Properties;
/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f60078a = "a";

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f60079b = g.f60051b;

    public static String a(String str, String str2) {
        if (b.a(str2).booleanValue()) {
            return null;
        }
        Properties properties = new Properties();
        try {
            properties.load(SDKManager.mContext.getAssets().open(str));
        } catch (Exception unused) {
            String str3 = f60078a;
            b.a(str3, "域名读取失败！《" + str2 + "+》", Boolean.valueOf(f60079b));
        }
        return properties.getProperty(str2);
    }
}
