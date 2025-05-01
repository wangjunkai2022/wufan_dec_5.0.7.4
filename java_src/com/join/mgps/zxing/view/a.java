package com.join.mgps.zxing.view;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
/* compiled from: FaceTransferViewfinderResultPointCallback.java */
/* loaded from: classes5.dex */
public final class a implements ResultPointCallback {

    /* renamed from: a  reason: collision with root package name */
    private final com.zxing.android.view.ViewfinderView f55180a;

    public a(com.zxing.android.view.ViewfinderView viewfinderView) {
        this.f55180a = viewfinderView;
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.f55180a.a(resultPoint);
    }
}
