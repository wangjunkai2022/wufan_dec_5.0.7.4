package com.join.mgps.Util;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
/* compiled from: FlipCardAnimation.java */
/* loaded from: classes3.dex */
public class i0 extends Animation {

    /* renamed from: b  reason: collision with root package name */
    private final float f27825b;

    /* renamed from: c  reason: collision with root package name */
    private final float f27826c;

    /* renamed from: d  reason: collision with root package name */
    private final float f27827d;

    /* renamed from: e  reason: collision with root package name */
    private final float f27828e;

    /* renamed from: f  reason: collision with root package name */
    private Camera f27829f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f27830g = false;

    /* renamed from: h  reason: collision with root package name */
    private a f27831h;

    /* compiled from: FlipCardAnimation.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public i0(float f5, float f6, float f7, float f8) {
        this.f27825b = f5;
        this.f27826c = f6;
        this.f27827d = f7;
        this.f27828e = f8;
    }

    public void a() {
        this.f27830g = false;
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f5, Transformation transformation) {
        try {
            float f6 = this.f27825b;
            float f7 = f6 + ((this.f27826c - f6) * f5);
            float f8 = this.f27827d;
            float f9 = this.f27828e;
            Camera camera = this.f27829f;
            Matrix matrix = transformation.getMatrix();
            camera.save();
            if (f7 > 90.0f || f7 < -90.0f) {
                if (!this.f27830g) {
                    a aVar = this.f27831h;
                    if (aVar != null) {
                        aVar.a();
                    }
                    this.f27830g = true;
                }
                if (f7 > 0.0f) {
                    f7 = (f7 + 270.0f) - 90.0f;
                } else if (f7 < 0.0f) {
                    f7 = (f7 + 90.0f) - 270.0f;
                }
            }
            camera.rotateY(f7);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f8, -f9);
            matrix.postTranslate(f8, f9);
        } catch (Exception e5) {
            e5.printStackTrace();
        }
    }

    public void b(a aVar) {
        this.f27831h = aVar;
    }

    @Override // android.view.animation.Animation
    public void initialize(int i4, int i5, int i6, int i7) {
        super.initialize(i4, i5, i6, i7);
        this.f27829f = new Camera();
    }
}
