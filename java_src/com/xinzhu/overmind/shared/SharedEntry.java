package com.xinzhu.overmind.shared;

import android.content.Context;
import com.join.mgps.va.overmind.VApp;
import com.xinzhu.overmind.Overmind;
/* loaded from: classes.dex */
public final class SharedEntry extends VApp {
    @Override // com.join.mgps.va.overmind.VApp, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        try {
            g gVar = new g();
            gVar.g(context);
            gVar.f();
            if (com.xinzhu.overmind.utils.e.g()) {
                Overmind.get().setXPEnable(false);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    @Override // com.join.mgps.va.overmind.VApp, com.papa91.arc.MApplication, com.papa91.arc.BuglyApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        Overmind.get().doCreate();
        if (Overmind.get().isVirtualProcess()) {
            Overmind.get().setCustomCallback(new b());
        }
    }
}
