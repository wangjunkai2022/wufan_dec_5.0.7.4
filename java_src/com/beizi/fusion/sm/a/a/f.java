package com.beizi.fusion.sm.a.a;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.beizi.fusion.sm.a.a.m;
import com.beizi.fusion.sm.repeackage.com.google.android.gms.ads.identifier.internal.IAdvertisingIdService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GmsImpl.java */
/* loaded from: classes2.dex */
public class f implements com.beizi.fusion.sm.a.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7089a;

    public f(Context context) {
        this.f7089a = context;
    }

    @Override // com.beizi.fusion.sm.a.d
    public boolean a() {
        Context context = this.f7089a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().getPackageInfo(com.xinzhu.overmind.client.hook.env.b.f67615e, 0) != null;
        } catch (Exception e5) {
            com.beizi.fusion.sm.a.f.a(e5);
            return false;
        }
    }

    @Override // com.beizi.fusion.sm.a.d
    public void a(com.beizi.fusion.sm.a.c cVar) {
        if (this.f7089a == null || cVar == null) {
            return;
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage(com.xinzhu.overmind.client.hook.env.b.f67613c);
        m.a(this.f7089a, intent, cVar, new m.a() { // from class: com.beizi.fusion.sm.a.a.f.1
            @Override // com.beizi.fusion.sm.a.a.m.a
            public String a(IBinder iBinder) throws com.beizi.fusion.sm.a.e, RemoteException {
                IAdvertisingIdService asInterface = IAdvertisingIdService.Stub.asInterface(iBinder);
                if (asInterface.isLimitAdTrackingEnabled(true)) {
                    com.beizi.fusion.sm.a.f.a("User has disabled advertising identifier");
                }
                return asInterface.getId();
            }
        });
    }
}
