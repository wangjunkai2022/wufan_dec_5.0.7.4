package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes2.dex */
public final class g extends com.efs.sdk.base.core.f.a {

    /* renamed from: b  reason: collision with root package name */
    private ConcurrentHashMap<String, a> f10412b = new ConcurrentHashMap<>(10);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f10413a;

        /* renamed from: b  reason: collision with root package name */
        String f10414b;

        /* renamed from: c  reason: collision with root package name */
        String f10415c;

        /* renamed from: d  reason: collision with root package name */
        AtomicInteger f10416d = new AtomicInteger(0);

        a(String str, String str2, String str3) {
            this.f10413a = str;
            this.f10414b = str2;
            this.f10415c = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, String str2, String str3) {
        String str4 = str + "_" + str2 + "_" + str3.trim();
        if (!this.f10412b.containsKey(str4) || this.f10412b.get(str4) == null) {
            this.f10412b.putIfAbsent(str4, new a(str, str2, str3));
        }
        this.f10412b.get(str4).f10416d.incrementAndGet();
    }

    @Override // com.efs.sdk.base.core.f.a
    public final void a() {
        f fVar;
        try {
            if (this.f10394a != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                for (Map.Entry<String, a> entry : this.f10412b.entrySet()) {
                    a value = entry.getValue();
                    int i4 = value.f10416d.get();
                    if (i4 > 0) {
                        ControllerCenter controllerCenter = this.f10394a;
                        String str = value.f10413a;
                        String str2 = value.f10414b;
                        String str3 = value.f10415c;
                        fVar = f.a.f10411a;
                        b bVar = new b("efs_core", "req_succ_rate", fVar.f10407a.f10401c);
                        bVar.put("rep_code", str);
                        bVar.put("px_code", str2);
                        bVar.put("path", str3);
                        bVar.put("cnt", Integer.valueOf(i4));
                        controllerCenter.send(bVar);
                        value.f10416d.addAndGet(i4 * (-1));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
