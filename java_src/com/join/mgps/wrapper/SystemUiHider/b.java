package com.join.mgps.wrapper.SystemUiHider;

import android.app.Activity;
import android.view.View;
/* compiled from: SystemUiHiderBase.java */
/* loaded from: classes5.dex */
class b extends a {

    /* renamed from: i  reason: collision with root package name */
    private boolean f54993i;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Activity activity, View view, int i4) {
        super(activity, view, i4);
        this.f54993i = true;
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.a
    public void b() {
        if ((this.f54991c & 2) != 0) {
            this.f54989a.getWindow().setFlags(1024, 1024);
        }
        this.f54992d.onVisibilityChange(false);
        this.f54993i = false;
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.a
    public boolean c() {
        return this.f54993i;
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.a
    public void e() {
        if ((this.f54991c & 1) == 0) {
            this.f54989a.getWindow().setFlags(768, 768);
        }
    }

    @Override // com.join.mgps.wrapper.SystemUiHider.a
    public void f() {
        if ((this.f54991c & 2) != 0) {
            this.f54989a.getWindow().setFlags(0, 1024);
        }
        this.f54992d.onVisibilityChange(true);
        this.f54993i = true;
    }
}
