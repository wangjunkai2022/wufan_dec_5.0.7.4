package com.vuaukou.vco.hykiiuy.plugin;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes8.dex */
final class j {
    private j() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(ClassLoader classLoader, File file) {
        String path = file.getPath();
        Field a5 = e.a(classLoader, a.auu.a.c("IgwWNQAHDQ=="));
        String[] split = ((String) a5.get(classLoader)).split(a.auu.a.c("dA=="));
        StringBuilder sb = new StringBuilder(path);
        for (String str : split) {
            if (str != null && !path.equals(str)) {
                sb.append(':').append(str);
            }
        }
        a5.set(classLoader, sb.toString());
        Field a6 = e.a(classLoader, a.auu.a.c("IgwWFwABHB4EAA0kHwAjABoREg=="));
        List list = (List) a6.get(classLoader);
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (path.equals((String) it2.next())) {
                    it2.remove();
                    break;
                }
            } else {
                break;
            }
        }
        list.add(0, path);
        a6.set(classLoader, list);
    }

    private static void b(ClassLoader classLoader, File file) {
        String path = file.getPath();
        Field a5 = e.a(classLoader, a.auu.a.c("IgwWNQAHDQ=="));
        String[] split = ((String) a5.get(classLoader)).split(a.auu.a.c("dA=="));
        StringBuilder sb = new StringBuilder(path);
        for (String str : split) {
            if (str != null && !path.equals(str)) {
                sb.append(':').append(str);
            }
        }
        a5.set(classLoader, sb.toString());
        Field a6 = e.a(classLoader, a.auu.a.c("IgwWFwABHB4EAA0kHwAjABoREg=="));
        List list = (List) a6.get(classLoader);
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (path.equals((String) it2.next())) {
                    it2.remove();
                    break;
                }
            } else {
                break;
            }
        }
        list.add(0, path);
        a6.set(classLoader, list);
    }
}
