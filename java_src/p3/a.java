package p3;

import android.annotation.TargetApi;
import android.view.View;
import it.sephiroth.android.library.util.b;
/* compiled from: ViewHelper14.java */
/* loaded from: classes6.dex */
public class a extends b.C0776b {
    public a(View view) {
        super(view);
    }

    @Override // it.sephiroth.android.library.util.b.C0776b, it.sephiroth.android.library.util.b.a
    @TargetApi(11)
    public boolean a() {
        return this.f69314a.isHardwareAccelerated();
    }

    @Override // it.sephiroth.android.library.util.b.C0776b, it.sephiroth.android.library.util.b.a
    @TargetApi(14)
    public void c(int i4) {
        this.f69314a.setScrollX(i4);
    }
}
