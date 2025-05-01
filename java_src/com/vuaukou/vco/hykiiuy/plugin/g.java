package com.vuaukou.vco.hykiiuy.plugin;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
/* loaded from: classes8.dex */
final class g {
    private g() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(ClassLoader classLoader, File file) {
        Object obj = e.a(classLoader, a.auu.a.c("PgQADS0aFjo=")).get(classLoader);
        Field a5 = e.a(obj, a.auu.a.c("IAQADBcWKScHBgQTCiEnFxEGFRwXJwAH"));
        File[] fileArr = (File[]) a5.get(obj);
        ArrayList arrayList = new ArrayList(fileArr.length + 1);
        arrayList.add(file);
        for (File file2 : fileArr) {
            if (!file.equals(file2)) {
                arrayList.add(file2);
            }
        }
        a5.set(obj, arrayList.toArray(new File[0]));
    }

    private static void b(ClassLoader classLoader, File file) {
        Object obj = e.a(classLoader, a.auu.a.c("PgQADS0aFjo=")).get(classLoader);
        Field a5 = e.a(obj, a.auu.a.c("IAQADBcWKScHBgQTCiEnFxEGFRwXJwAH"));
        File[] fileArr = (File[]) a5.get(obj);
        ArrayList arrayList = new ArrayList(fileArr.length + 1);
        arrayList.add(file);
        for (File file2 : fileArr) {
            if (!file.equals(file2)) {
                arrayList.add(file2);
            }
        }
        a5.set(obj, arrayList.toArray(new File[0]));
    }
}
