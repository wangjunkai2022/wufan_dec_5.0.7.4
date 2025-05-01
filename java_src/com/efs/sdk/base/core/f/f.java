package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public c f10407a;

    /* renamed from: b  reason: collision with root package name */
    public ControllerCenter f10408b;

    /* renamed from: c  reason: collision with root package name */
    public d f10409c;

    /* renamed from: d  reason: collision with root package name */
    public g f10410d;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final f f10411a = new f((byte) 0);

        public static /* synthetic */ f a() {
            return f10411a;
        }
    }

    /* synthetic */ f(byte b5) {
        this();
    }

    public final void a(String str, String str2, String str3) {
        this.f10410d.a(str, str2, str3);
    }

    private f() {
        this.f10407a = new c();
        this.f10409c = new d();
        this.f10410d = new g();
    }

    public final void a(int i4) {
        ControllerCenter controllerCenter = this.f10408b;
        if (controllerCenter != null) {
            controllerCenter.send(a("flow_limit", i4));
        }
    }

    public final void a(int i4, String str) {
        if (this.f10408b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            b a5 = a("flow_limit_type", i4);
            a5.put("code", str);
            this.f10408b.send(a5);
        }
    }

    public final b a(String str, int i4) {
        b bVar = new b("efs_core", str, this.f10407a.f10401c);
        bVar.put("cver", Integer.valueOf(i4));
        return bVar;
    }
}
