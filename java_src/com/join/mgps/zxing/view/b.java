package com.join.mgps.zxing.view;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
/* compiled from: ViewfinderResultPointCallback.java */
/* loaded from: classes5.dex */
public final class b implements ResultPointCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ViewfinderView f55181a;

    public b(ViewfinderView viewfinderView) {
        this.f55181a = viewfinderView;
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.f55181a.a(resultPoint);
    }
}
