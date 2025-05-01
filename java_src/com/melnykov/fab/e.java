package com.melnykov.fab;

import android.widget.ScrollView;
import com.melnykov.fab.ObservableScrollView;
/* compiled from: ScrollViewScrollDetector.java */
/* loaded from: classes5.dex */
abstract class e implements ObservableScrollView.a {

    /* renamed from: a  reason: collision with root package name */
    private int f55967a;

    /* renamed from: b  reason: collision with root package name */
    private int f55968b;

    @Override // com.melnykov.fab.ObservableScrollView.a
    public void a(ScrollView scrollView, int i4, int i5, int i6, int i7) {
        if (Math.abs(i5 - this.f55967a) > this.f55968b) {
            if (i5 > this.f55967a) {
                c();
            } else {
                b();
            }
        }
        this.f55967a = i5;
    }

    abstract void b();

    abstract void c();

    public void d(int i4) {
        this.f55968b = i4;
    }
}
