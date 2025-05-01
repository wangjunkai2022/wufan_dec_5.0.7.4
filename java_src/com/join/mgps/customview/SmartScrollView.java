package com.join.mgps.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
/* loaded from: classes4.dex */
public class SmartScrollView extends ScrollView {

    /* renamed from: b  reason: collision with root package name */
    private boolean f47981b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f47982c;

    /* renamed from: d  reason: collision with root package name */
    private a f47983d;

    /* loaded from: classes4.dex */
    public interface a {
        void a();

        void b();
    }

    public SmartScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47981b = true;
        this.f47982c = false;
    }

    private void c() {
        a aVar;
        if (this.f47981b) {
            a aVar2 = this.f47983d;
            if (aVar2 != null) {
                aVar2.b();
            }
        } else if (!this.f47982c || (aVar = this.f47983d) == null) {
        } else {
            aVar.a();
        }
    }

    public boolean a() {
        return this.f47982c;
    }

    public boolean b() {
        return this.f47981b;
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        super.onOverScrolled(i4, i5, z4, z5);
        if (i5 == 0) {
            this.f47981b = z5;
            this.f47982c = false;
        } else {
            this.f47981b = false;
            this.f47982c = z5;
        }
        c();
    }

    @Override // android.view.View
    protected void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    public void setScanScrollChangedListener(a aVar) {
        this.f47983d = aVar;
    }
}
