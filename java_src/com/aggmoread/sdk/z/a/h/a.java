package com.aggmoread.sdk.z.a.h;

import android.content.Context;
import com.aggmoread.sdk.z.a.g.h;
import com.aggmoread.sdk.z.a.m.f;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2.dex */
public class a {

    /* renamed from: h  reason: collision with root package name */
    private static a f2129h;

    /* renamed from: a  reason: collision with root package name */
    private Context f2130a;

    /* renamed from: b  reason: collision with root package name */
    private com.aggmoread.sdk.z.a.g.a f2131b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2133d;

    /* renamed from: e  reason: collision with root package name */
    private b f2134e;

    /* renamed from: c  reason: collision with root package name */
    private h f2132c = h.f2125d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<EnumC0059a, com.aggmoread.sdk.z.a.g.a> f2135f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private final Map<EnumC0059a, h> f2136g = new HashMap();

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.aggmoread.sdk.z.a.h.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class EnumC0059a {

        /* renamed from: b  reason: collision with root package name */
        public static final EnumC0059a f2137b = new EnumC0059a("API", 0);

        /* renamed from: c  reason: collision with root package name */
        public static final EnumC0059a f2138c = new EnumC0059a("DSP", 1);

        /* renamed from: d  reason: collision with root package name */
        public static final EnumC0059a f2139d = new EnumC0059a("AG", 2);

        /* renamed from: e  reason: collision with root package name */
        public static final EnumC0059a f2140e = new EnumC0059a("RS", 3);

        private EnumC0059a(String str, int i4) {
        }
    }

    private a() {
    }

    public static synchronized a d() {
        a aVar;
        synchronized (a.class) {
            if (f2129h == null) {
                synchronized (a.class) {
                    if (f2129h == null) {
                        f2129h = new a();
                    }
                }
            }
            aVar = f2129h;
        }
        return aVar;
    }

    public Context a() {
        return this.f2130a;
    }

    public com.aggmoread.sdk.z.a.g.a a(EnumC0059a enumC0059a) {
        return this.f2135f.containsKey(enumC0059a) ? this.f2135f.get(enumC0059a) : this.f2131b;
    }

    public void a(EnumC0059a enumC0059a, h hVar) {
        this.f2136g.put(enumC0059a, hVar);
    }

    public boolean a(Context context, EnumC0059a enumC0059a, com.aggmoread.sdk.z.a.g.a aVar, b bVar) {
        if (this.f2133d) {
            if (enumC0059a != null && aVar != null && !this.f2135f.containsKey(enumC0059a)) {
                this.f2135f.put(enumC0059a, aVar);
            }
            return true;
        } else if (context == null || aVar == null) {
            return this.f2133d;
        } else {
            this.f2130a = context.getApplicationContext();
            if (enumC0059a != null) {
                this.f2135f.put(enumC0059a, aVar);
            } else {
                this.f2135f.put(EnumC0059a.f2137b, aVar);
                this.f2131b = aVar;
            }
            this.f2134e = bVar;
            f.a(context);
            this.f2133d = true;
            return true;
        }
    }

    public com.aggmoread.sdk.z.a.g.a b() {
        return a(EnumC0059a.f2137b);
    }

    public h b(EnumC0059a enumC0059a) {
        return this.f2136g.containsKey(enumC0059a) ? this.f2136g.get(enumC0059a) : this.f2132c;
    }

    public b c() {
        return this.f2134e;
    }

    public h e() {
        return b(EnumC0059a.f2137b);
    }

    public boolean f() {
        return this.f2133d;
    }
}
