package com.qq.e.comm.managers;

import com.qq.e.comm.managers.plugin.e;
import com.qq.e.comm.util.GDTLogger;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f59839b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f59840c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(a aVar, boolean z4) {
        this.f59840c = aVar;
        this.f59839b = z4;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f59840c.f59833d.getPOFactory(this.f59839b, true);
            this.f59840c.f59831b = true;
        } catch (e e5) {
            GDTLogger.e(e5.getMessage(), e5);
        }
    }
}
