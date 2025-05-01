package com.kwad.components.core.webview.tachikoma;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* loaded from: classes5.dex */
public final class h {
    private final Map<String, HashMap<Integer, String>> Zp = new ConcurrentHashMap();
    private Map<String, Integer> Zq = new ConcurrentSkipListMap();
    private int Zr = 0;

    /* loaded from: classes5.dex */
    static class a {
        private static final h Zs = new h();
    }

    private static int aR(String str) {
        return ((((str.length() * 2) + 12) + 16) + 16) / 1024;
    }

    private void q(String str, String str2) {
        int aR = aR(str2);
        this.Zr += aR;
        this.Zq.put(str, Integer.valueOf(aR));
    }

    public static h tf() {
        return a.Zs;
    }

    public final void b(String str, int i4, String str2) {
        if (TextUtils.isEmpty(str2) || com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.aui) == 0) {
            return;
        }
        if (this.Zp.containsKey(str)) {
            if (this.Zp.get(str).containsKey(Integer.valueOf(i4))) {
                return;
            }
            this.Zp.remove(str);
        }
        aR(aR(str2));
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(Integer.valueOf(i4), str2);
        this.Zp.put(str, hashMap);
        q(str, str2);
    }

    public final String n(String str, int i4) {
        if (com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.aui) != 0 && this.Zp.containsKey(str)) {
            HashMap<Integer, String> hashMap = this.Zp.get(str);
            if (hashMap.containsKey(Integer.valueOf(i4))) {
                return hashMap.get(Integer.valueOf(i4));
            }
        }
        return "";
    }

    private void aR(int i4) {
        if (this.Zr + i4 > com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.aui)) {
            ArrayList<String> arrayList = new ArrayList();
            Iterator<Map.Entry<String, Integer>> it2 = this.Zq.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<String, Integer> next = it2.next();
                arrayList.add(next.getKey());
                this.Zr -= next.getValue().intValue();
                it2.remove();
                if (this.Zr <= com.kwad.sdk.core.config.d.a(com.kwad.sdk.core.config.c.aui) - i4) {
                    break;
                }
            }
            for (String str : arrayList) {
                this.Zp.remove(str);
            }
        }
    }
}
