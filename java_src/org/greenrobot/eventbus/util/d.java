package org.greenrobot.eventbus.util;

import java.util.HashMap;
import java.util.Map;
/* compiled from: ExceptionToResourceMapping.java */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<? extends Throwable>, Integer> f72432a = new HashMap();

    public d a(Class<? extends Throwable> cls, int i4) {
        this.f72432a.put(cls, Integer.valueOf(i4));
        return this;
    }

    public Integer b(Throwable th) {
        int i4 = 20;
        Throwable th2 = th;
        do {
            Integer c5 = c(th2);
            if (c5 == null) {
                th2 = th2.getCause();
                i4--;
                if (i4 <= 0 || th2 == th) {
                    break;
                }
            } else {
                return c5;
            }
        } while (th2 != null);
        String str = org.greenrobot.eventbus.c.f72303q;
        StringBuilder sb = new StringBuilder();
        sb.append("No specific message ressource ID found for ");
        sb.append(th);
        return null;
    }

    protected Integer c(Throwable th) {
        Class<?> cls = th.getClass();
        Integer num = this.f72432a.get(cls);
        if (num == null) {
            Class<? extends Throwable> cls2 = null;
            for (Map.Entry<Class<? extends Throwable>, Integer> entry : this.f72432a.entrySet()) {
                Class<? extends Throwable> key = entry.getKey();
                if (key.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(key))) {
                    num = entry.getValue();
                    cls2 = key;
                }
            }
        }
        return num;
    }
}
