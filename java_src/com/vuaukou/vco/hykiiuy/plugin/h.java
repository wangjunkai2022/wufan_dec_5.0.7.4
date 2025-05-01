package com.vuaukou.vco.hykiiuy.plugin;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes8.dex */
final class h {
    private h() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(ClassLoader classLoader, File file) {
        Object obj = e.a(classLoader, a.auu.a.c("PgQADS0aFjo=")).get(classLoader);
        List list = (List) e.a(obj, a.auu.a.c("IAQADBcWKScHBgQTCiEnFxEGFRwXJwAH")).get(obj);
        ArrayList arrayList = list == null ? new ArrayList(2) : list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (file.equals((File) it2.next())) {
                it2.remove();
                break;
            }
        }
        arrayList.add(0, file);
        List list2 = (List) e.a(obj, a.auu.a.c("PRwHEQQeKy8RHRMEPwwsFxUXGDcMPAAXEQ4BDCsW")).get(obj);
        if (list2 == null) {
            list2 = new ArrayList(2);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + list2.size() + 1);
        arrayList2.addAll(arrayList);
        arrayList2.addAll(list2);
        e.a(obj, a.auu.a.c("IAQADBcWKScHBgQTCjUvERwgDRYIKwsAFg==")).set(obj, (Object[]) e.a(obj, a.auu.a.c("IwQfADESESYgGAAMFgs6Fg=="), List.class, File.class, List.class).invoke(obj, arrayList2, null, new ArrayList()));
    }

    private static void b(ClassLoader classLoader, File file) {
        Object obj = e.a(classLoader, a.auu.a.c("PgQADS0aFjo=")).get(classLoader);
        List list = (List) e.a(obj, a.auu.a.c("IAQADBcWKScHBgQTCiEnFxEGFRwXJwAH")).get(obj);
        ArrayList arrayList = list == null ? new ArrayList(2) : list;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (file.equals((File) it2.next())) {
                it2.remove();
                break;
            }
        }
        arrayList.add(0, file);
        List list2 = (List) e.a(obj, a.auu.a.c("PRwHEQQeKy8RHRMEPwwsFxUXGDcMPAAXEQ4BDCsW")).get(obj);
        if (list2 == null) {
            list2 = new ArrayList(2);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() + list2.size() + 1);
        arrayList2.addAll(arrayList);
        arrayList2.addAll(list2);
        e.a(obj, a.auu.a.c("IAQADBcWKScHBgQTCjUvERwgDRYIKwsAFg==")).set(obj, (Object[]) e.a(obj, a.auu.a.c("IwQfADESESYgGAAMFgs6Fg=="), List.class, File.class, List.class).invoke(obj, arrayList2, null, new ArrayList()));
    }
}
