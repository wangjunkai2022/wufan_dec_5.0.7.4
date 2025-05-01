package com.umeng.analytics.pro;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
/* compiled from: DeviceIdSupplier.java */
/* loaded from: classes6.dex */
public class ba {
    @SuppressLint({"SuspiciousIndentation"})
    public static ax a() {
        String str = Build.BRAND;
        bl.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (bk.b()) {
            return new bb();
        }
        if (bk.d()) {
            return new bc();
        }
        if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase("redmi") && !str.equalsIgnoreCase("meitu") && !str.equalsIgnoreCase("小米") && !str.equalsIgnoreCase("blackshark")) {
            if (str.equalsIgnoreCase("vivo")) {
                return new bi();
            }
            if (!str.equalsIgnoreCase("oppo") && !str.equalsIgnoreCase("oneplus") && !str.equalsIgnoreCase("realme")) {
                if (!str.equalsIgnoreCase("lenovo") && !str.equalsIgnoreCase("zuk")) {
                    if (str.equalsIgnoreCase("nubia")) {
                        return new bf();
                    }
                    if (str.equalsIgnoreCase("samsung")) {
                        return new bh();
                    }
                    if (!str.equalsIgnoreCase("meizu") && !str.equalsIgnoreCase("mblu") && !bk.a()) {
                        if (bk.e()) {
                            return new az();
                        }
                        return null;
                    }
                    return new be();
                }
                return new bd();
            }
            return new bg();
        }
        return new bj();
    }

    public static ax b() {
        return new bb();
    }
}
