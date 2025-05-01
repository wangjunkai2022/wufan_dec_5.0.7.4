package com.switfpass.pay.activity.zxing.decoding;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.switfpass.pay.activity.zxing.ViewfinderView;
/* loaded from: classes5.dex */
public final class i implements ResultPointCallback {

    /* renamed from: a  reason: collision with root package name */
    private final ViewfinderView f61682a;

    public i(ViewfinderView viewfinderView) {
        this.f61682a = viewfinderView;
    }

    @Override // com.google.zxing.ResultPointCallback
    public final void foundPossibleResultPoint(ResultPoint resultPoint) {
        this.f61682a.a(resultPoint);
    }
}
