package com.join.mgps.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class CircleImageView extends ImageView {

    /* renamed from: s  reason: collision with root package name */
    private static final ImageView.ScaleType f46492s = ImageView.ScaleType.CENTER_CROP;

    /* renamed from: t  reason: collision with root package name */
    private static final Bitmap.Config f46493t = Bitmap.Config.ARGB_8888;

    /* renamed from: u  reason: collision with root package name */
    private static final int f46494u = 2;

    /* renamed from: v  reason: collision with root package name */
    private static final int f46495v = 0;

    /* renamed from: w  reason: collision with root package name */
    private static final int f46496w = -16777216;

    /* renamed from: x  reason: collision with root package name */
    private static final boolean f46497x = false;

    /* renamed from: b  reason: collision with root package name */
    private final RectF f46498b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f46499c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f46500d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f46501e;

    /* renamed from: f  reason: collision with root package name */
    private final Paint f46502f;

    /* renamed from: g  reason: collision with root package name */
    private int f46503g;

    /* renamed from: h  reason: collision with root package name */
    private int f46504h;

    /* renamed from: i  reason: collision with root package name */
    private Bitmap f46505i;

    /* renamed from: j  reason: collision with root package name */
    private BitmapShader f46506j;

    /* renamed from: k  reason: collision with root package name */
    private int f46507k;

    /* renamed from: l  reason: collision with root package name */
    private int f46508l;

    /* renamed from: m  reason: collision with root package name */
    private float f46509m;

    /* renamed from: n  reason: collision with root package name */
    private float f46510n;

    /* renamed from: o  reason: collision with root package name */
    private ColorFilter f46511o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f46512p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f46513q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f46514r;

    public CircleImageView(Context context) {
        super(context);
        this.f46498b = new RectF();
        this.f46499c = new RectF();
        this.f46500d = new Matrix();
        this.f46501e = new Paint();
        this.f46502f = new Paint();
        this.f46503g = -16777216;
        this.f46504h = 0;
        b();
    }

    private Bitmap a(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, f46493t);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), f46493t);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    private void b() {
        super.setScaleType(f46492s);
        this.f46512p = true;
        if (this.f46513q) {
            d();
            this.f46513q = false;
        }
    }

    private void d() {
        if (!this.f46512p) {
            this.f46513q = true;
        } else if (this.f46505i == null) {
        } else {
            Bitmap bitmap = this.f46505i;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f46506j = new BitmapShader(bitmap, tileMode, tileMode);
            this.f46501e.setAntiAlias(true);
            this.f46501e.setShader(this.f46506j);
            this.f46502f.setStyle(Paint.Style.STROKE);
            this.f46502f.setAntiAlias(true);
            this.f46502f.setColor(this.f46503g);
            this.f46502f.setStrokeWidth(this.f46504h);
            this.f46508l = this.f46505i.getHeight();
            this.f46507k = this.f46505i.getWidth();
            this.f46499c.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f46510n = Math.min((this.f46499c.height() - this.f46504h) / 2.0f, (this.f46499c.width() - this.f46504h) / 2.0f);
            this.f46498b.set(this.f46499c);
            if (!this.f46514r) {
                RectF rectF = this.f46498b;
                int i4 = this.f46504h;
                rectF.inset(i4, i4);
            }
            this.f46509m = Math.min(this.f46498b.height() / 2.0f, this.f46498b.width() / 2.0f);
            e();
            invalidate();
        }
    }

    private void e() {
        float width;
        float height;
        this.f46500d.set(null);
        float f5 = 0.0f;
        if (this.f46507k * this.f46498b.height() > this.f46498b.width() * this.f46508l) {
            width = this.f46498b.height() / this.f46508l;
            f5 = (this.f46498b.width() - (this.f46507k * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = this.f46498b.width() / this.f46507k;
            height = (this.f46498b.height() - (this.f46508l * width)) * 0.5f;
        }
        this.f46500d.setScale(width, width);
        Matrix matrix = this.f46500d;
        RectF rectF = this.f46498b;
        matrix.postTranslate(((int) (f5 + 0.5f)) + rectF.left, ((int) (height + 0.5f)) + rectF.top);
        this.f46506j.setLocalMatrix(this.f46500d);
    }

    public boolean c() {
        return this.f46514r;
    }

    public int getBorderColor() {
        return this.f46503g;
    }

    public int getBorderWidth() {
        return this.f46504h;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return f46492s;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (getDrawable() == null) {
            return;
        }
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f46509m, this.f46501e);
        if (this.f46504h != 0) {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, this.f46510n, this.f46502f);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        d();
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z4) {
        if (z4) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    public void setBorderColor(int i4) {
        if (i4 == this.f46503g) {
            return;
        }
        this.f46503g = i4;
        this.f46502f.setColor(i4);
        invalidate();
    }

    public void setBorderColorResource(@ColorRes int i4) {
        setBorderColor(getContext().getResources().getColor(i4));
    }

    public void setBorderOverlay(boolean z4) {
        if (z4 == this.f46514r) {
            return;
        }
        this.f46514r = z4;
        d();
    }

    public void setBorderWidth(int i4) {
        if (i4 == this.f46504h) {
            return;
        }
        this.f46504h = i4;
        d();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        if (colorFilter == this.f46511o) {
            return;
        }
        this.f46511o = colorFilter;
        this.f46501e.setColorFilter(colorFilter);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f46505i = bitmap;
        d();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        this.f46505i = a(drawable);
        d();
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i4) {
        super.setImageResource(i4);
        this.f46505i = a(getDrawable());
        d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        this.f46505i = a(getDrawable());
        d();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != f46492s) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46498b = new RectF();
        this.f46499c = new RectF();
        this.f46500d = new Matrix();
        this.f46501e = new Paint();
        this.f46502f = new Paint();
        this.f46503g = -16777216;
        this.f46504h = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CircleImageView, i4, 0);
        this.f46504h = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.f46503g = obtainStyledAttributes.getColor(0, -16777216);
        this.f46514r = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        b();
    }
}
