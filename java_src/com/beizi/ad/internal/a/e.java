package com.beizi.ad.internal.a;

import android.view.View;
import com.beizi.ad.internal.utilities.ViewUtil;
/* compiled from: MediationDisplayable.java */
/* loaded from: classes2.dex */
public class e implements com.beizi.ad.internal.view.c {

    /* renamed from: a  reason: collision with root package name */
    private View f5646a;

    /* renamed from: b  reason: collision with root package name */
    private b f5647b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(b bVar) {
        this.f5647b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view) {
        this.f5646a = view;
    }

    @Override // com.beizi.ad.internal.view.c
    public void destroy() {
        this.f5647b.b();
        ViewUtil.removeChildFromParent(this.f5646a);
    }

    @Override // com.beizi.ad.internal.view.c
    public boolean failed() {
        return this.f5647b.f5628g;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeHeight() {
        View view = this.f5646a;
        if (view != null) {
            return view.getHeight();
        }
        return -1;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getCreativeWidth() {
        View view = this.f5646a;
        if (view != null) {
            return view.getWidth();
        }
        return -1;
    }

    @Override // com.beizi.ad.internal.view.c
    public int getRefreshInterval() {
        return 0;
    }

    @Override // com.beizi.ad.internal.view.c
    public View getView() {
        return this.f5646a;
    }

    @Override // com.beizi.ad.internal.view.c
    public void onDestroy() {
        this.f5647b.i();
        destroy();
    }

    @Override // com.beizi.ad.internal.view.c
    public void onPause() {
        this.f5647b.j();
    }

    @Override // com.beizi.ad.internal.view.c
    public void onResume() {
        this.f5647b.k();
    }

    @Override // com.beizi.ad.internal.view.c
    public void visible() {
    }

    public b a() {
        return this.f5647b;
    }
}
