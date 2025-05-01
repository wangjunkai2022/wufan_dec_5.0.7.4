package com.xinzhu.overmind.client.hook.delegate;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.util.ArrayMap;
import com.xinzhu.haunted.android.app.g;
import com.xinzhu.haunted.android.app.m;
import com.xinzhu.haunted.android.content.f;
import com.xinzhu.haunted.android.provider.a;
import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.utils.e;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ContentProviderDelegate.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67596b = "ContentProviderDelegate";

    /* renamed from: c  reason: collision with root package name */
    private static Set<String> f67597c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private IInterface f67598a;

    private static void a(Object obj) {
        if (e.w()) {
            Object d5 = new a.c(obj).d();
            if (d5 != null) {
                new a.C0704a(d5).c(null);
                return;
            }
            return;
        }
        new a.c(obj).e(null);
    }

    public static void b() {
        Object b5;
        Object b6 = a.e.b();
        if (b6 != null) {
            a(b6);
        }
        Object b7 = a.d.b();
        if (b7 != null) {
            a(b7);
        }
        if (Build.VERSION.SDK_INT < 17 || a.b.f67041a == null || (b5 = a.b.b()) == null) {
            return;
        }
        a(b5);
    }

    public static IInterface c(IInterface iInterface, String str) {
        str.hashCode();
        if (str.equals("downloads")) {
            return new com.xinzhu.overmind.client.hook.proxies.context.providers.b().b(iInterface, Overmind.getHostPkg());
        }
        if (!str.equals("settings")) {
            return new com.xinzhu.overmind.client.hook.proxies.context.providers.a().b(iInterface, Overmind.getHostPkg());
        }
        return new com.xinzhu.overmind.client.hook.proxies.context.providers.c().b(iInterface, Overmind.getHostPkg());
    }

    public static void d() {
        b();
        Overmind.getContext().getContentResolver().call(Uri.parse("content://settings"), "GET_global", "render_shadows_in_compositor", (Bundle) null);
        for (Object obj : ((ArrayMap) new g(Overmind.mainThread()).Z()).values()) {
            g.e eVar = new g.e(obj);
            String[] c5 = eVar.c();
            if (c5 != null && c5.length > 0) {
                String str = c5[0];
                if (!f67597c.contains(str)) {
                    f67597c.add(str);
                    eVar.f(c(eVar.d(), str));
                    eVar.e(new String[]{str});
                }
            }
        }
    }

    public static void update(Object obj, String str) {
        IInterface b5;
        if (e.w()) {
            b5 = new f(obj).b();
        } else {
            b5 = new m.a(obj).b();
        }
        if (b5 instanceof Proxy) {
            return;
        }
        IInterface c5 = c(b5, str);
        if (e.w()) {
            new f(obj).c(c5);
        } else {
            new m.a(obj).c(c5);
        }
    }
}
