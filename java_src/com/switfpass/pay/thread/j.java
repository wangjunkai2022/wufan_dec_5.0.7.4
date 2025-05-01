package com.switfpass.pay.thread;
/* loaded from: classes5.dex */
final class j implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ b f61821b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ e f61822c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(b bVar, e eVar) {
        this.f61821b = bVar;
        this.f61822c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f61821b.b(new k(this.f61822c));
        e eVar = this.f61822c;
        if (eVar != null) {
            eVar.onPreExecute();
        }
        Object obj = null;
        try {
            obj = this.f61821b.a();
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        e eVar2 = this.f61822c;
        if (eVar2 != null) {
            if (obj == null || !(obj instanceof Exception)) {
                eVar2.onSucceed(obj);
                return;
            }
            eVar2.onError("发送错误啦" + ((Exception) obj).getMessage());
        }
    }
}
