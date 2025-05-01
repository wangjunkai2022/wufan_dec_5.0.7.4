package com.kwad.framework.filedownloader.a;

import com.kwad.framework.filedownloader.f.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes5.dex */
public class d {
    public static b a(Map<String, List<String>> map, b bVar, List<String> list) {
        int responseCode = bVar.getResponseCode();
        String bg = bVar.bg("Location");
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (bi(responseCode)) {
            if (bg != null) {
                if (com.kwad.framework.filedownloader.f.d.ajb) {
                    com.kwad.framework.filedownloader.f.d.c(d.class, "redirect to %s with %d, %s", bg, Integer.valueOf(responseCode), arrayList);
                }
                bVar.vI();
                bVar = a(map, bg);
                arrayList.add(bg);
                bVar.execute();
                responseCode = bVar.getResponseCode();
                bg = bVar.bg("Location");
                i4++;
                if (i4 >= 10) {
                    throw new IllegalAccessException(f.b("redirect too many times! %s", arrayList));
                }
            } else {
                throw new IllegalAccessException(f.b("receive %d (redirect) but the location is null with response [%s]", Integer.valueOf(responseCode), bVar.vH()));
            }
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return bVar;
    }

    private static boolean bi(int i4) {
        return i4 == 301 || i4 == 302 || i4 == 303 || i4 == 300 || i4 == 307 || i4 == 308;
    }

    private static b a(Map<String, List<String>> map, String str) {
        b bk = com.kwad.framework.filedownloader.download.b.vS().bk(str);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            if (value != null) {
                for (String str2 : value) {
                    bk.addHeader(key, str2);
                }
            }
        }
        return bk;
    }
}
