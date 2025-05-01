package com.beizi.ad.a.a;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
/* compiled from: TextureVideoViewOutlineProvider.java */
@RequiresApi(api = 21)
/* loaded from: classes2.dex */
public class f extends ViewOutlineProvider {

    /* renamed from: a  reason: collision with root package name */
    private float f5345a;

    public f(float f5) {
        this.f5345a = f5;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        outline.setRoundRect(new Rect(0, 0, (rect.right - rect.left) - 0, (rect.bottom - rect.top) - 0), this.f5345a);
    }
}
