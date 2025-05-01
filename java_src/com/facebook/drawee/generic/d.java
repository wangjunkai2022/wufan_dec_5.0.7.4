package com.facebook.drawee.generic;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.drawee.drawable.h;
import com.facebook.drawee.drawable.u;
import com.facebook.drawee.drawable.v;
import javax.annotation.Nullable;
/* compiled from: RootDrawable.java */
/* loaded from: classes.dex */
public class d extends h implements u {
    @VisibleForTesting
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    Drawable f11355f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private v f11356g;

    public d(Drawable drawable) {
        super(drawable);
        this.f11355f = null;
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (isVisible()) {
            v vVar = this.f11356g;
            if (vVar != null) {
                vVar.a();
            }
            super.draw(canvas);
            Drawable drawable = this.f11355f;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.f11355f.draw(canvas);
            }
        }
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.u
    public void o(@Nullable v vVar) {
        this.f11356g = vVar;
    }

    @Override // com.facebook.drawee.drawable.h, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        v vVar = this.f11356g;
        if (vVar != null) {
            vVar.onVisibilityChange(z4);
        }
        return super.setVisible(z4, z5);
    }

    public void x(@Nullable Drawable drawable) {
        this.f11355f = drawable;
        invalidateSelf();
    }
}
