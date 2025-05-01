package com.xinzhu.overmind.client.hook;

import com.xinzhu.overmind.Overmind;
import com.xinzhu.overmind.client.hook.delegate.AppInstrumentationHook;
import com.xinzhu.overmind.client.hook.proxies.os.f;
import com.xinzhu.overmind.client.hook.proxies.os.g;
import com.xinzhu.overmind.client.hook.proxies.os.h;
import com.xinzhu.overmind.client.hook.proxies.os.i;
import com.xinzhu.overmind.client.hook.proxies.os.j;
import com.xinzhu.overmind.client.hook.proxies.os.k;
import java.util.HashMap;
import java.util.Map;
/* compiled from: HookManager.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final String f67568b = "HookManager";

    /* renamed from: c  reason: collision with root package name */
    private static c f67569c = new c();

    /* renamed from: a  reason: collision with root package name */
    private Map<Class<?>, d> f67570a = new HashMap();

    public static c c() {
        return f67569c;
    }

    void a(d dVar) {
        this.f67570a.put(dVar.getClass(), dVar);
    }

    public void b(Class<?> cls) {
        d dVar = this.f67570a.get(cls);
        if (dVar == null || !dVar.a()) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("checkEnv: ");
        sb.append(cls.getSimpleName());
        sb.append(" is bad env");
        dVar.injectHook();
    }

    public void d() {
        if (Overmind.get().isVirtualProcess()) {
            a(new com.xinzhu.overmind.client.hook.proxies.display.a());
            a(new com.xinzhu.overmind.client.hook.proxies.libcore.a());
            a(new com.xinzhu.overmind.client.hook.proxies.accounts.a());
            a(new com.xinzhu.overmind.client.hook.proxies.am.b());
            a(new com.xinzhu.overmind.client.hook.proxies.pm.c());
            a(new com.xinzhu.overmind.client.hook.proxies.telephony.d());
            a(new com.xinzhu.overmind.client.hook.proxies.app.b());
            a(new com.xinzhu.overmind.client.hook.proxies.appos.a());
            a(new com.xinzhu.overmind.client.hook.proxies.app.d());
            a(new com.xinzhu.overmind.client.hook.proxies.app.a());
            a(new com.xinzhu.overmind.client.hook.proxies.appwidget.a());
            a(new com.xinzhu.overmind.client.hook.proxies.context.a());
            a(new com.xinzhu.overmind.client.hook.proxies.vm.a());
            a(new j());
            a(new com.xinzhu.overmind.client.hook.proxies.context.b());
            a(new com.xinzhu.overmind.client.hook.proxies.session.a());
            a(new com.xinzhu.overmind.client.hook.proxies.location.b());
            a(new com.xinzhu.overmind.client.hook.proxies.os.storage.a());
            a(new com.xinzhu.overmind.client.hook.proxies.pm.b());
            a(new com.xinzhu.overmind.client.hook.proxies.app.c());
            a(new com.xinzhu.overmind.client.hook.proxies.accessibility.a());
            a(new com.xinzhu.overmind.client.hook.proxies.audio.a());
            a(new com.xinzhu.overmind.client.hook.proxies.backup.a());
            a(new com.xinzhu.overmind.client.hook.proxies.clipboard.a());
            a(new com.xinzhu.overmind.client.hook.proxies.sms.a());
            a(new com.xinzhu.overmind.client.hook.proxies.subscription.a());
            a(new f());
            a(new com.xinzhu.overmind.client.hook.proxies.telephony.e());
            a(new com.xinzhu.overmind.client.hook.proxies.telecom.a());
            a(new com.xinzhu.overmind.client.hook.proxies.app.f());
            a(new com.xinzhu.overmind.client.hook.proxies.os.c());
            a(new com.xinzhu.overmind.client.hook.proxies.input.a());
            a(new com.xinzhu.overmind.client.hook.proxies.os.e());
            a(new com.xinzhu.overmind.client.hook.proxies.media.a());
            a(new k());
            a(new com.xinzhu.overmind.client.hook.proxies.net.wifi.a());
            a(new com.xinzhu.overmind.client.hook.proxies.net.a());
            a(new com.xinzhu.overmind.client.hook.proxies.telephony.c());
            a(new com.xinzhu.overmind.client.hook.proxies.textservice.a());
            a(new com.xinzhu.overmind.client.hook.proxies.net.c());
            a(new com.xinzhu.overmind.client.hook.proxies.location.a());
            a(AppInstrumentationHook.h());
            if (com.xinzhu.overmind.utils.e.h()) {
                a(new com.xinzhu.overmind.client.hook.proxies.am.a());
            }
            if (com.xinzhu.overmind.utils.e.g()) {
                a(new com.xinzhu.overmind.client.hook.proxies.permission.b());
                a(new g());
                a(new com.xinzhu.overmind.client.hook.proxies.net.d());
            }
            if (com.xinzhu.overmind.utils.e.f()) {
                a(new com.xinzhu.overmind.client.hook.proxies.am.c());
                a(new com.xinzhu.overmind.client.hook.proxies.app.e());
                a(new com.xinzhu.overmind.client.hook.proxies.role.a());
            }
            if (com.xinzhu.overmind.utils.e.y()) {
                a(new com.xinzhu.overmind.client.hook.proxies.pm.a());
                a(new h());
            }
            if (com.xinzhu.overmind.utils.e.w()) {
                a(new com.xinzhu.overmind.client.hook.proxies.view.a());
                a(new com.xinzhu.overmind.client.hook.proxies.os.b());
            }
            com.xinzhu.overmind.utils.e.e();
            if (com.xinzhu.overmind.utils.e.d()) {
                a(new com.xinzhu.overmind.client.hook.proxies.pm.d());
                a(new com.xinzhu.overmind.client.hook.proxies.os.a());
                a(new com.xinzhu.overmind.client.hook.proxies.os.d());
            }
            if (com.xinzhu.overmind.utils.e.c()) {
                a(new com.xinzhu.overmind.client.hook.proxies.net.b());
            }
            if (com.xinzhu.overmind.utils.e.b()) {
                a(new com.xinzhu.overmind.client.hook.proxies.view.b());
                a(new i());
            }
            if (com.xinzhu.overmind.utils.e.a()) {
                a(new com.xinzhu.overmind.client.hook.proxies.app.c());
            }
            if (com.xinzhu.overmind.utils.e.p()) {
                a(new com.xinzhu.overmind.client.hook.proxies.permission.a());
            }
            if (com.xinzhu.overmind.utils.e.t()) {
                a(new com.xinzhu.overmind.client.hook.proxies.clipboard.b());
            }
            if (com.xinzhu.overmind.utils.e.w() && (com.xinzhu.overmind.utils.e.o() || com.xinzhu.overmind.utils.e.q())) {
                a(new com.xinzhu.overmind.client.hook.proxies.telephony.b());
            }
        }
        e();
    }

    void e() {
        for (d dVar : this.f67570a.values()) {
            dVar.injectHook();
        }
    }
}
