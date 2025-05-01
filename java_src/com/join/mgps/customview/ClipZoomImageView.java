package com.join.mgps.customview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
/* loaded from: classes4.dex */
public class ClipZoomImageView extends ImageView implements ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: p  reason: collision with root package name */
    private static final String f46557p = ClipZoomImageView.class.getSimpleName();

    /* renamed from: q  reason: collision with root package name */
    public static float f46558q = 4.0f;

    /* renamed from: r  reason: collision with root package name */
    private static float f46559r = 2.0f;

    /* renamed from: b  reason: collision with root package name */
    private float f46560b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f46561c;

    /* renamed from: d  reason: collision with root package name */
    private final float[] f46562d;

    /* renamed from: e  reason: collision with root package name */
    private ScaleGestureDetector f46563e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f46564f;

    /* renamed from: g  reason: collision with root package name */
    private GestureDetector f46565g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f46566h;

    /* renamed from: i  reason: collision with root package name */
    private int f46567i;

    /* renamed from: j  reason: collision with root package name */
    private float f46568j;

    /* renamed from: k  reason: collision with root package name */
    private float f46569k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f46570l;

    /* renamed from: m  reason: collision with root package name */
    private int f46571m;

    /* renamed from: n  reason: collision with root package name */
    private int f46572n;

    /* renamed from: o  reason: collision with root package name */
    private int f46573o;

    /* loaded from: classes4.dex */
    class a extends GestureDetector.SimpleOnGestureListener {
        a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            if (ClipZoomImageView.this.f46566h) {
                return true;
            }
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (ClipZoomImageView.this.getScale() < ClipZoomImageView.f46559r) {
                ClipZoomImageView clipZoomImageView = ClipZoomImageView.this;
                clipZoomImageView.postDelayed(new b(ClipZoomImageView.f46559r, x4, y2), 16L);
                ClipZoomImageView.this.f46566h = true;
            } else {
                ClipZoomImageView clipZoomImageView2 = ClipZoomImageView.this;
                clipZoomImageView2.postDelayed(new b(clipZoomImageView2.f46560b, x4, y2), 16L);
                ClipZoomImageView.this.f46566h = true;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    private class b implements Runnable {

        /* renamed from: g  reason: collision with root package name */
        static final float f46575g = 1.07f;

        /* renamed from: h  reason: collision with root package name */
        static final float f46576h = 0.93f;

        /* renamed from: b  reason: collision with root package name */
        private float f46577b;

        /* renamed from: c  reason: collision with root package name */
        private float f46578c;

        /* renamed from: d  reason: collision with root package name */
        private float f46579d;

        /* renamed from: e  reason: collision with root package name */
        private float f46580e;

        public b(float f5, float f6, float f7) {
            this.f46577b = f5;
            this.f46579d = f6;
            this.f46580e = f7;
            if (ClipZoomImageView.this.getScale() < this.f46577b) {
                this.f46578c = f46575g;
            } else {
                this.f46578c = f46576h;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Matrix matrix = ClipZoomImageView.this.f46564f;
            float f5 = this.f46578c;
            matrix.postScale(f5, f5, this.f46579d, this.f46580e);
            ClipZoomImageView.this.g();
            ClipZoomImageView clipZoomImageView = ClipZoomImageView.this;
            clipZoomImageView.setImageMatrix(clipZoomImageView.f46564f);
            float scale = ClipZoomImageView.this.getScale();
            float f6 = this.f46578c;
            if ((f6 > 1.0f && scale < this.f46577b) || (f6 < 1.0f && this.f46577b < scale)) {
                ClipZoomImageView.this.postDelayed(this, 16L);
                return;
            }
            float f7 = this.f46577b / scale;
            ClipZoomImageView.this.f46564f.postScale(f7, f7, this.f46579d, this.f46580e);
            ClipZoomImageView.this.g();
            ClipZoomImageView clipZoomImageView2 = ClipZoomImageView.this;
            clipZoomImageView2.setImageMatrix(clipZoomImageView2.f46564f);
            ClipZoomImageView.this.f46566h = false;
        }
    }

    public ClipZoomImageView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        float f5;
        RectF matrixRectF = getMatrixRectF();
        int width = getWidth();
        int height = getHeight();
        StringBuilder sb = new StringBuilder();
        sb.append("rect.width() =  ");
        sb.append(matrixRectF.width());
        sb.append(" , width - 2 * mHorizontalPadding =");
        sb.append(width - (this.f46572n * 2));
        double width2 = matrixRectF.width();
        Double.isNaN(width2);
        int i4 = this.f46572n;
        if (width2 + 0.01d >= width - (i4 * 2)) {
            float f6 = matrixRectF.left;
            f5 = f6 > ((float) i4) ? (-f6) + i4 : 0.0f;
            float f7 = matrixRectF.right;
            if (f7 < width - i4) {
                f5 = (width - i4) - f7;
            }
        } else {
            f5 = 0.0f;
        }
        double height2 = matrixRectF.height();
        Double.isNaN(height2);
        int i5 = this.f46573o;
        if (height2 + 0.01d >= height - (i5 * 2)) {
            float f8 = matrixRectF.top;
            r10 = f8 > ((float) i5) ? (-f8) + i5 : 0.0f;
            float f9 = matrixRectF.bottom;
            if (f9 < height - i5) {
                r10 = (height - i5) - f9;
            }
        }
        this.f46564f.postTranslate(f5, r10);
    }

    private RectF getMatrixRectF() {
        Matrix matrix = this.f46564f;
        RectF rectF = new RectF();
        Drawable drawable = getDrawable();
        if (drawable != null) {
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(rectF);
        }
        return rectF;
    }

    private boolean i(float f5, float f6) {
        return Math.sqrt((double) ((f5 * f5) + (f6 * f6))) >= ((double) this.f46567i);
    }

    public final float getScale() {
        this.f46564f.getValues(this.f46562d);
        return this.f46562d[0];
    }

    public Bitmap h() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        draw(new Canvas(createBitmap));
        return Bitmap.createBitmap(createBitmap, this.f46572n, this.f46573o, getWidth() - (this.f46572n * 2), getWidth() - (this.f46572n * 2));
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Drawable drawable;
        if (!this.f46561c || (drawable = getDrawable()) == null) {
            return;
        }
        this.f46573o = (getHeight() - (getWidth() - (this.f46572n * 2))) / 2;
        int width = getWidth();
        int height = getHeight();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float width2 = (intrinsicWidth >= getWidth() - (this.f46572n * 2) || intrinsicHeight <= getHeight() - (this.f46573o * 2)) ? 1.0f : ((getWidth() * 1.0f) - (this.f46572n * 2)) / intrinsicWidth;
        if (intrinsicHeight < getHeight() - (this.f46573o * 2) && intrinsicWidth > getWidth() - (this.f46572n * 2)) {
            width2 = ((getHeight() * 1.0f) - (this.f46573o * 2)) / intrinsicHeight;
        }
        if (intrinsicWidth < getWidth() - (this.f46572n * 2) && intrinsicHeight < getHeight() - (this.f46573o * 2)) {
            width2 = Math.max(((getWidth() * 1.0f) - (this.f46572n * 2)) / intrinsicWidth, ((getHeight() * 1.0f) - (this.f46573o * 2)) / intrinsicHeight);
        }
        this.f46560b = width2;
        f46559r = 2.0f * width2;
        f46558q = 4.0f * width2;
        this.f46564f.postTranslate((width - intrinsicWidth) / 2, (height - intrinsicHeight) / 2);
        this.f46564f.postScale(width2, width2, getWidth() / 2, getHeight() / 2);
        setImageMatrix(this.f46564f);
        this.f46561c = false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scale = getScale();
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (getDrawable() == null) {
            return true;
        }
        float f5 = f46558q;
        if ((scale < f5 && scaleFactor > 1.0f) || (scale > this.f46560b && scaleFactor < 1.0f)) {
            float f6 = this.f46560b;
            if (scaleFactor * scale < f6) {
                scaleFactor = f6 / scale;
            }
            if (scaleFactor * scale > f5) {
                scaleFactor = f5 / scale;
            }
            this.f46564f.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            g();
            setImageMatrix(this.f46564f);
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r10 != 3) goto L18;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            android.view.GestureDetector r10 = r9.f46565g
            boolean r10 = r10.onTouchEvent(r11)
            r0 = 1
            if (r10 == 0) goto La
            return r0
        La:
            android.view.ScaleGestureDetector r10 = r9.f46563e
            r10.onTouchEvent(r11)
            int r10 = r11.getPointerCount()
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L18:
            if (r3 >= r10) goto L27
            float r6 = r11.getX(r3)
            float r4 = r4 + r6
            float r6 = r11.getY(r3)
            float r5 = r5 + r6
            int r3 = r3 + 1
            goto L18
        L27:
            float r3 = (float) r10
            float r4 = r4 / r3
            float r5 = r5 / r3
            int r3 = r9.f46571m
            if (r10 == r3) goto L34
            r9.f46570l = r1
            r9.f46568j = r4
            r9.f46569k = r5
        L34:
            r9.f46571m = r10
            int r10 = r11.getAction()
            if (r10 == r0) goto L9c
            r11 = 2
            if (r10 == r11) goto L43
            r11 = 3
            if (r10 == r11) goto L9c
            goto L9e
        L43:
            float r10 = r9.f46568j
            float r10 = r4 - r10
            float r1 = r9.f46569k
            float r1 = r5 - r1
            boolean r3 = r9.f46570l
            if (r3 != 0) goto L55
            boolean r3 = r9.i(r10, r1)
            r9.f46570l = r3
        L55:
            boolean r3 = r9.f46570l
            if (r3 == 0) goto L97
            android.graphics.drawable.Drawable r3 = r9.getDrawable()
            if (r3 == 0) goto L97
            android.graphics.RectF r3 = r9.getMatrixRectF()
            float r6 = r3.width()
            int r7 = r9.getWidth()
            int r8 = r9.f46572n
            int r8 = r8 * 2
            int r7 = r7 - r8
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L76
            r10 = 0
        L76:
            float r3 = r3.height()
            int r6 = r9.getHeight()
            int r7 = r9.f46573o
            int r7 = r7 * 2
            int r6 = r6 - r7
            float r11 = (float) r6
            int r11 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r11 > 0) goto L89
            goto L8a
        L89:
            r2 = r1
        L8a:
            android.graphics.Matrix r11 = r9.f46564f
            r11.postTranslate(r10, r2)
            r9.g()
            android.graphics.Matrix r10 = r9.f46564f
            r9.setImageMatrix(r10)
        L97:
            r9.f46568j = r4
            r9.f46569k = r5
            goto L9e
        L9c:
            r9.f46571m = r1
        L9e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.ClipZoomImageView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setHorizontalPadding(int i4) {
        this.f46572n = i4;
    }

    public ClipZoomImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46560b = 1.0f;
        this.f46561c = true;
        this.f46562d = new float[9];
        this.f46563e = null;
        this.f46564f = new Matrix();
        setScaleType(ImageView.ScaleType.MATRIX);
        this.f46565g = new GestureDetector(context, new a());
        this.f46563e = new ScaleGestureDetector(context, this);
        setOnTouchListener(this);
    }
}
