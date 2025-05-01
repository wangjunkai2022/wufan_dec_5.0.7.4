package com.melnykov.fab;

import android.widget.AbsListView;
import androidx.annotation.NonNull;
/* compiled from: AbsListViewScrollDetector.java */
/* loaded from: classes5.dex */
abstract class a implements AbsListView.OnScrollListener {

    /* renamed from: b  reason: collision with root package name */
    private int f55956b;

    /* renamed from: c  reason: collision with root package name */
    private int f55957c;

    /* renamed from: d  reason: collision with root package name */
    private AbsListView f55958d;

    /* renamed from: e  reason: collision with root package name */
    private int f55959e;

    private int b() {
        AbsListView absListView = this.f55958d;
        if (absListView == null || absListView.getChildAt(0) == null) {
            return 0;
        }
        return this.f55958d.getChildAt(0).getTop();
    }

    private boolean c(int i4) {
        return i4 == this.f55957c;
    }

    abstract void d();

    abstract void e();

    public void f(@NonNull AbsListView absListView) {
        this.f55958d = absListView;
    }

    public void g(int i4) {
        this.f55959e = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        if (i6 == 0) {
            return;
        }
        if (c(i4)) {
            int b5 = b();
            if (Math.abs(this.f55956b - b5) > this.f55959e) {
                if (this.f55956b > b5) {
                    e();
                } else {
                    d();
                }
            }
            this.f55956b = b5;
            return;
        }
        if (i4 > this.f55957c) {
            e();
        } else {
            d();
        }
        this.f55956b = b();
        this.f55957c = i4;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i4) {
    }
}
