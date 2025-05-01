package com.xinzhu.overmind.utils.helpers;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ComponentInfo;
/* compiled from: ComponentHelper.java */
/* loaded from: classes.dex */
public class e {
    public static boolean a(Intent intent, Intent intent2) {
        return new Intent.FilterComparison(intent).equals(new Intent.FilterComparison(intent2));
    }

    public static boolean b(Intent intent) {
        return "application/vnd.android.package-archive".equals(intent.getType());
    }

    public static boolean c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null || com.xinzhu.overmind.client.e.getVPackageName() == null) {
            return false;
        }
        return component.getPackageName().equals(com.xinzhu.overmind.client.e.getVPackageName());
    }

    public static boolean d(Intent[] intentArr) {
        for (Intent intent : intentArr) {
            if (!c(intent)) {
                return false;
            }
        }
        return true;
    }

    public static ComponentName e(ComponentInfo componentInfo) {
        return new ComponentName(componentInfo.packageName, componentInfo.name);
    }
}
