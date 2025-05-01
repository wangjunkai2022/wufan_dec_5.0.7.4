package com.melnykov.fab;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: RecyclerViewScrollDetector.java */
/* loaded from: classes5.dex */
abstract class c extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    private int f55966a;

    abstract void b();

    abstract void c();

    public void d(int i4) {
        this.f55966a = i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        if (Math.abs(i5) > this.f55966a) {
            if (i5 > 0) {
                c();
            } else {
                b();
            }
        }
    }
}
