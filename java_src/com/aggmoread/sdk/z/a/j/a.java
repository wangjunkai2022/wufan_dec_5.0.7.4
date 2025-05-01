package com.aggmoread.sdk.z.a.j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    static ConcurrentHashMap<Integer, List<AbstractC0060a>> f2173a = new ConcurrentHashMap<>();

    /* renamed from: com.aggmoread.sdk.z.a.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0060a {
    }

    public static boolean a(int i4, AbstractC0060a abstractC0060a) {
        if (abstractC0060a == null) {
            return false;
        }
        List<AbstractC0060a> list = f2173a.get(Integer.valueOf(i4));
        if (list == null) {
            list = new ArrayList<>();
            f2173a.put(Integer.valueOf(i4), list);
        }
        if (list.contains(abstractC0060a)) {
            return false;
        }
        list.add(abstractC0060a);
        return true;
    }
}
