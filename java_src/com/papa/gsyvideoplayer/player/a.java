package com.papa.gsyvideoplayer.player;
/* compiled from: BasePlayerManager.java */
/* loaded from: classes.dex */
public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    protected b f58265a;

    public b a() {
        return this.f58265a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(com.papa.gsyvideoplayer.model.a aVar) {
        b bVar = this.f58265a;
        if (bVar != null) {
            bVar.a(getMediaPlayer(), aVar);
        }
    }

    public void g(b bVar) {
        this.f58265a = bVar;
    }
}
