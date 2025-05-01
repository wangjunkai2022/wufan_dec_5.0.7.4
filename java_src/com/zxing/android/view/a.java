package com.zxing.android.view;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
/* compiled from: ViewfinderResultPointCallback.java */
/* loaded from: classes6.dex */
public final class a implements ResultPointCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ViewfinderView f68811a;

    public a(ViewfinderView viewfinderView) {
        this.f68811a = viewfinderView;
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.f68811a.a(resultPoint);
    }
}
