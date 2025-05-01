package com.xinzhu.overmind.server;

import android.os.IBinder;
import com.xinzhu.overmind.server.accounts.MindAccountManagerService;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ServiceManager.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static i f67990b = null;

    /* renamed from: c  reason: collision with root package name */
    public static final String f67991c = "activity_manager";

    /* renamed from: d  reason: collision with root package name */
    public static final String f67992d = "job_manager";

    /* renamed from: e  reason: collision with root package name */
    public static final String f67993e = "notification_manager";

    /* renamed from: f  reason: collision with root package name */
    public static final String f67994f = "package_manager";

    /* renamed from: g  reason: collision with root package name */
    public static final String f67995g = "storage_manager";

    /* renamed from: h  reason: collision with root package name */
    public static final String f67996h = "user_manager";

    /* renamed from: i  reason: collision with root package name */
    public static final String f67997i = "file_share";

    /* renamed from: j  reason: collision with root package name */
    public static final String f67998j = "Xposed_manager";

    /* renamed from: k  reason: collision with root package name */
    public static final String f67999k = "v_service";

    /* renamed from: l  reason: collision with root package name */
    public static final String f68000l = "account_manager";

    /* renamed from: m  reason: collision with root package name */
    public static final String f68001m = "device_manager";

    /* renamed from: n  reason: collision with root package name */
    public static final String f68002n = "content_manager";

    /* renamed from: o  reason: collision with root package name */
    public static final String f68003o = "widget_manager";

    /* renamed from: a  reason: collision with root package name */
    private Map<String, IBinder> f68004a;

    private i() {
        HashMap hashMap = new HashMap();
        this.f68004a = hashMap;
        hashMap.put(f67991c, com.xinzhu.overmind.server.am.f.get());
        this.f68004a.put(f67992d, com.xinzhu.overmind.server.am.g.get());
        this.f68004a.put(f67994f, com.xinzhu.overmind.server.pm.i.get());
        this.f68004a.put(f67995g, com.xinzhu.overmind.server.os.h.get());
        this.f68004a.put(f67996h, com.xinzhu.overmind.server.user.c.get());
        this.f68004a.put(f67993e, com.xinzhu.overmind.server.os.g.get());
        this.f68004a.put(f67997i, com.xinzhu.overmind.server.os.f.get());
        this.f68004a.put(f68000l, MindAccountManagerService.get());
        this.f68004a.put(f68001m, com.xinzhu.overmind.server.os.e.get());
        this.f68004a.put(f68003o, h.get());
        this.f68004a.put(f68002n, com.xinzhu.overmind.server.content.b.get());
    }

    public static i a() {
        if (f67990b == null) {
            synchronized (i.class) {
                if (f67990b == null) {
                    f67990b = new i();
                }
            }
        }
        return f67990b;
    }

    public static IBinder b(String str) {
        return a().c(str);
    }

    public IBinder c(String str) {
        return this.f68004a.get(str);
    }
}
