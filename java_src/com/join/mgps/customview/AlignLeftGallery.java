package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Transformation;
import java.lang.reflect.Field;
/* loaded from: classes4.dex */
public class AlignLeftGallery extends android.widget.Gallery {

    /* renamed from: j  reason: collision with root package name */
    private static final String f46375j = "AlignLeftGallery";

    /* renamed from: k  reason: collision with root package name */
    private static int f46376k;

    /* renamed from: l  reason: collision with root package name */
    private static int f46377l;

    /* renamed from: b  reason: collision with root package name */
    private Camera f46378b;

    /* renamed from: c  reason: collision with root package name */
    private int f46379c;

    /* renamed from: d  reason: collision with root package name */
    private int f46380d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f46381e;

    /* renamed from: f  reason: collision with root package name */
    private int f46382f;

    /* renamed from: g  reason: collision with root package name */
    private a f46383g;

    /* renamed from: h  reason: collision with root package name */
    private float f46384h;

    /* renamed from: i  reason: collision with root package name */
    private float f46385i;

    /* loaded from: classes4.dex */
    public interface a {
        void onItemClick(int i4);
    }

    public AlignLeftGallery(Context context) {
        super(context);
        this.f46378b = new Camera();
        setStaticTransformationsEnabled(true);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842966});
        this.f46380d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.Gallery, android.view.ViewGroup
    protected boolean getChildStaticTransformation(View view, Transformation transformation) {
        transformation.clear();
        transformation.setTransformationType(2);
        this.f46378b.save();
        Matrix matrix = transformation.getMatrix();
        if (this.f46381e) {
            f46376k = getChildAt(0).getWidth();
            StringBuilder sb = new StringBuilder();
            sb.append("firstChildWidth = ");
            sb.append(f46376k);
            f46377l = getChildAt(0).getPaddingLeft();
            this.f46381e = false;
        }
        int i4 = (((f46376k / 2) + f46377l) + this.f46380d) - (this.f46379c / 2);
        this.f46382f = i4;
        this.f46378b.translate(i4, 0.0f, 0.0f);
        this.f46378b.getMatrix(matrix);
        this.f46378b.restore();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f46382f);
        sb2.append("    offsetX");
        return true;
    }

    @Override // android.widget.Gallery, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        try {
            Field declaredField = AlignLeftGallery.class.getSuperclass().getDeclaredField("mDownTouchPosition");
            declaredField.setAccessible(true);
            int i4 = declaredField.getInt(this);
            StringBuilder sb = new StringBuilder();
            sb.append("mDownTouchPosition = ");
            sb.append(i4);
            a aVar = this.f46383g;
            if (aVar == null || i4 < 0) {
                return false;
            }
            aVar.onItemClick(i4);
            return false;
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return false;
        } catch (IllegalArgumentException e6) {
            e6.printStackTrace();
            return false;
        } catch (NoSuchFieldException e7) {
            e7.printStackTrace();
            return false;
        } catch (SecurityException e8) {
            e8.printStackTrace();
            return false;
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        StringBuilder sb = new StringBuilder();
        sb.append("onSizeChanged------- w = ");
        sb.append(i4);
        sb.append(" h = ");
        sb.append(i5);
        sb.append("oldw = ");
        sb.append(i6);
        sb.append("oldh = ");
        sb.append(i7);
        if (!this.f46381e) {
            this.f46379c = i4;
            getLayoutParams().width = this.f46379c;
            this.f46381e = true;
        }
        super.onSizeChanged(i4, i5, i6, i7);
    }

    @Override // android.widget.Gallery, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.offsetLocation(-this.f46382f, 0.0f);
        return super.onTouchEvent(motionEvent);
    }

    public void setOnItemClickListener(a aVar) {
        this.f46383g = aVar;
    }

    public AlignLeftGallery(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46378b = new Camera();
        a(context, attributeSet);
        setStaticTransformationsEnabled(true);
    }

    public AlignLeftGallery(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46378b = new Camera();
        a(context, attributeSet);
        setStaticTransformationsEnabled(true);
    }
}
