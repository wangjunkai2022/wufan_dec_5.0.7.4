package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class MStarBar extends View {

    /* renamed from: b  reason: collision with root package name */
    private int f47378b;

    /* renamed from: c  reason: collision with root package name */
    private int f47379c;

    /* renamed from: d  reason: collision with root package name */
    private int f47380d;

    /* renamed from: e  reason: collision with root package name */
    private float f47381e;

    /* renamed from: f  reason: collision with root package name */
    private Bitmap f47382f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable f47383g;

    /* renamed from: h  reason: collision with root package name */
    private a f47384h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f47385i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f47386j;

    /* loaded from: classes4.dex */
    public interface a {
        void a(float f5);
    }

    public MStarBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47378b = 0;
        this.f47379c = 5;
        this.f47381e = 0.0f;
        this.f47386j = true;
        b(context, attributeSet);
    }

    private Bitmap a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        int i4 = this.f47380d;
        Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i5 = this.f47380d;
        drawable.setBounds(0, 0, i5, i5);
        drawable.draw(canvas);
        return createBitmap;
    }

    private void b(Context context, AttributeSet attributeSet) {
        setClickable(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RatingBar);
        this.f47378b = (int) obtainStyledAttributes.getDimension(2, 0.0f);
        this.f47380d = (int) obtainStyledAttributes.getDimension(5, 20.0f);
        this.f47379c = obtainStyledAttributes.getInteger(1, 5);
        this.f47383g = obtainStyledAttributes.getDrawable(3);
        this.f47386j = obtainStyledAttributes.getBoolean(0, false);
        this.f47382f = a(obtainStyledAttributes.getDrawable(4));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f47385i = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.f47385i;
        Bitmap bitmap = this.f47382f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
    }

    public float getStarMark() {
        return this.f47381e;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f47382f == null || this.f47383g == null) {
            return;
        }
        for (int i4 = 0; i4 < this.f47379c; i4++) {
            Drawable drawable = this.f47383g;
            int i5 = this.f47378b;
            int i6 = this.f47380d;
            drawable.setBounds((i5 + i6) * i4, 0, ((i5 + i6) * i4) + i6, i6);
            this.f47383g.draw(canvas);
        }
        float f5 = this.f47381e;
        if (f5 > 1.0f) {
            int i7 = this.f47380d;
            canvas.drawRect(0.0f, 0.0f, i7, i7, this.f47385i);
            float f6 = this.f47381e;
            if (f6 - ((int) f6) == 0.0f) {
                for (int i8 = 1; i8 < this.f47381e; i8++) {
                    canvas.translate(this.f47378b + this.f47380d, 0.0f);
                    int i9 = this.f47380d;
                    canvas.drawRect(0.0f, 0.0f, i9, i9, this.f47385i);
                }
                return;
            }
            for (int i10 = 1; i10 < this.f47381e - 1.0f; i10++) {
                canvas.translate(this.f47378b + this.f47380d, 0.0f);
                int i11 = this.f47380d;
                canvas.drawRect(0.0f, 0.0f, i11, i11, this.f47385i);
            }
            canvas.translate(this.f47378b + this.f47380d, 0.0f);
            float f7 = this.f47381e;
            canvas.drawRect(0.0f, 0.0f, ((Math.round((f7 - ((int) f7)) * 10.0f) * 1.0f) / 10.0f) * this.f47380d, this.f47380d, this.f47385i);
            return;
        }
        int i12 = this.f47380d;
        canvas.drawRect(0.0f, 0.0f, i12 * f5, i12, this.f47385i);
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int i6 = this.f47380d;
        int i7 = this.f47379c;
        setMeasuredDimension((i6 * i7) + (this.f47378b * (i7 - 1)), i6);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            int x4 = (int) motionEvent.getX();
            if (x4 < 0) {
                x4 = 0;
            }
            if (x4 > getMeasuredWidth()) {
                x4 = getMeasuredWidth();
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setStarMark((x4 * 1.0f) / ((getMeasuredWidth() * 1.0f) / this.f47379c));
            } else if (action == 2) {
                setStarMark((x4 * 1.0f) / ((getMeasuredWidth() * 1.0f) / this.f47379c));
            }
            invalidate();
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setIntegerMark(boolean z4) {
    }

    public void setOnStarChangeListener(a aVar) {
        this.f47384h = aVar;
    }

    public void setStarCount(int i4) {
        this.f47379c = i4;
        requestLayout();
    }

    public void setStarMark(double d5) {
        if (!this.f47386j) {
            this.f47381e = (int) Math.ceil(d5);
        } else {
            this.f47381e = (((float) Math.round(d5 * 10.0d)) * 1.0f) / 10.0f;
        }
        a aVar = this.f47384h;
        if (aVar != null) {
            aVar.a(this.f47381e);
        }
        invalidate();
    }

    public MStarBar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47378b = 0;
        this.f47379c = 5;
        this.f47381e = 0.0f;
        this.f47386j = true;
        b(context, attributeSet);
    }
}
