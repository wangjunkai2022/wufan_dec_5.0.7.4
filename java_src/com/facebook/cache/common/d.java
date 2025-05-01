package com.facebook.cache.common;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: CacheKeyUtil.java */
/* loaded from: classes2.dex */
public final class d {
    public static String a(c cVar) {
        try {
            if (cVar instanceof f) {
                return c(((f) cVar).c().get(0));
            }
            return c(cVar);
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException(e5);
        }
    }

    public static List<String> b(c cVar) {
        try {
            if (cVar instanceof f) {
                List<c> c5 = ((f) cVar).c();
                ArrayList arrayList = new ArrayList(c5.size());
                for (int i4 = 0; i4 < c5.size(); i4++) {
                    arrayList.add(c(c5.get(i4)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c(cVar));
            return arrayList2;
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static String c(c cVar) throws UnsupportedEncodingException {
        return com.facebook.common.util.d.i(cVar.a().getBytes("UTF-8"));
    }
}
