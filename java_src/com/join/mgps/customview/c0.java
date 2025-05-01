package com.join.mgps.customview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
/* compiled from: RoundedDrawable.java */
/* loaded from: classes4.dex */
public class c0 extends Drawable {

    /* renamed from: t  reason: collision with root package name */
    public static final String f48413t = "RoundedDrawable";

    /* renamed from: u  reason: collision with root package name */
    public static final int f48414u = -16777216;

    /* renamed from: a  reason: collision with root package name */
    private final RectF f48415a = new RectF();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f48416b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final RectF f48417c;

    /* renamed from: d  reason: collision with root package name */
    private final Bitmap f48418d;

    /* renamed from: e  reason: collision with root package name */
    private final Paint f48419e;

    /* renamed from: f  reason: collision with root package name */
    private final int f48420f;

    /* renamed from: g  reason: collision with root package name */
    private final int f48421g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f48422h;

    /* renamed from: i  reason: collision with root package name */
    private final Paint f48423i;

    /* renamed from: j  reason: collision with root package name */
    private final Matrix f48424j;

    /* renamed from: k  reason: collision with root package name */
    private BitmapShader f48425k;

    /* renamed from: l  reason: collision with root package name */
    private Shader.TileMode f48426l;

    /* renamed from: m  reason: collision with root package name */
    private Shader.TileMode f48427m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f48428n;

    /* renamed from: o  reason: collision with root package name */
    private float f48429o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f48430p;

    /* renamed from: q  reason: collision with root package name */
    private float f48431q;

    /* renamed from: r  reason: collision with root package name */
    private ColorStateList f48432r;

    /* renamed from: s  reason: collision with root package name */
    private ImageView.ScaleType f48433s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RoundedDrawable.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f48434a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f48434a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f48434a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f48434a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f48434a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f48434a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f48434a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f48434a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public c0(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f48417c = rectF;
        this.f48422h = new RectF();
        this.f48424j = new Matrix();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f48426l = tileMode;
        this.f48427m = tileMode;
        this.f48428n = true;
        this.f48429o = 0.0f;
        this.f48430p = false;
        this.f48431q = 0.0f;
        this.f48432r = ColorStateList.valueOf(-16777216);
        this.f48433s = ImageView.ScaleType.FIT_CENTER;
        this.f48418d = bitmap;
        int width = bitmap.getWidth();
        this.f48420f = width;
        int height = bitmap.getHeight();
        this.f48421g = height;
        rectF.set(0.0f, 0.0f, width, height);
        Paint paint = new Paint();
        this.f48419e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f48423i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f48432r.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f48431q);
    }

    public static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static c0 b(Bitmap bitmap) {
        if (bitmap != null) {
            return new c0(bitmap);
        }
        return null;
    }

    public static Drawable c(Drawable drawable) {
        if (drawable == null || (drawable instanceof c0)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i4), c(layerDrawable.getDrawable(i4)));
            }
            return layerDrawable;
        }
        Bitmap a5 = a(drawable);
        return a5 != null ? new c0(a5) : drawable;
    }

    private void u() {
        float width;
        float height;
        int i4 = a.f48434a[this.f48433s.ordinal()];
        if (i4 == 1) {
            this.f48422h.set(this.f48415a);
            RectF rectF = this.f48422h;
            float f5 = this.f48431q;
            rectF.inset(f5 / 2.0f, f5 / 2.0f);
            this.f48424j.reset();
            this.f48424j.setTranslate((int) (((this.f48422h.width() - this.f48420f) * 0.5f) + 0.5f), (int) (((this.f48422h.height() - this.f48421g) * 0.5f) + 0.5f));
        } else if (i4 == 2) {
            this.f48422h.set(this.f48415a);
            RectF rectF2 = this.f48422h;
            float f6 = this.f48431q;
            rectF2.inset(f6 / 2.0f, f6 / 2.0f);
            this.f48424j.reset();
            float f7 = 0.0f;
            if (this.f48420f * this.f48422h.height() > this.f48422h.width() * this.f48421g) {
                width = this.f48422h.height() / this.f48421g;
                f7 = (this.f48422h.width() - (this.f48420f * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = this.f48422h.width() / this.f48420f;
                height = (this.f48422h.height() - (this.f48421g * width)) * 0.5f;
            }
            this.f48424j.setScale(width, width);
            Matrix matrix = this.f48424j;
            float f8 = this.f48431q;
            matrix.postTranslate(((int) (f7 + 0.5f)) + f8, ((int) (height + 0.5f)) + f8);
        } else if (i4 == 3) {
            this.f48424j.reset();
            float min = (((float) this.f48420f) > this.f48415a.width() || ((float) this.f48421g) > this.f48415a.height()) ? Math.min(this.f48415a.width() / this.f48420f, this.f48415a.height() / this.f48421g) : 1.0f;
            this.f48424j.setScale(min, min);
            this.f48424j.postTranslate((int) (((this.f48415a.width() - (this.f48420f * min)) * 0.5f) + 0.5f), (int) (((this.f48415a.height() - (this.f48421g * min)) * 0.5f) + 0.5f));
            this.f48422h.set(this.f48417c);
            this.f48424j.mapRect(this.f48422h);
            RectF rectF3 = this.f48422h;
            float f9 = this.f48431q;
            rectF3.inset(f9 / 2.0f, f9 / 2.0f);
            this.f48424j.setRectToRect(this.f48417c, this.f48422h, Matrix.ScaleToFit.FILL);
        } else if (i4 == 5) {
            this.f48422h.set(this.f48417c);
            this.f48424j.setRectToRect(this.f48417c, this.f48415a, Matrix.ScaleToFit.END);
            this.f48424j.mapRect(this.f48422h);
            RectF rectF4 = this.f48422h;
            float f10 = this.f48431q;
            rectF4.inset(f10 / 2.0f, f10 / 2.0f);
            this.f48424j.setRectToRect(this.f48417c, this.f48422h, Matrix.ScaleToFit.FILL);
        } else if (i4 == 6) {
            this.f48422h.set(this.f48417c);
            this.f48424j.setRectToRect(this.f48417c, this.f48415a, Matrix.ScaleToFit.START);
            this.f48424j.mapRect(this.f48422h);
            RectF rectF5 = this.f48422h;
            float f11 = this.f48431q;
            rectF5.inset(f11 / 2.0f, f11 / 2.0f);
            this.f48424j.setRectToRect(this.f48417c, this.f48422h, Matrix.ScaleToFit.FILL);
        } else if (i4 != 7) {
            this.f48422h.set(this.f48417c);
            this.f48424j.setRectToRect(this.f48417c, this.f48415a, Matrix.ScaleToFit.CENTER);
            this.f48424j.mapRect(this.f48422h);
            RectF rectF6 = this.f48422h;
            float f12 = this.f48431q;
            rectF6.inset(f12 / 2.0f, f12 / 2.0f);
            this.f48424j.setRectToRect(this.f48417c, this.f48422h, Matrix.ScaleToFit.FILL);
        } else {
            this.f48422h.set(this.f48415a);
            RectF rectF7 = this.f48422h;
            float f13 = this.f48431q;
            rectF7.inset(f13 / 2.0f, f13 / 2.0f);
            this.f48424j.reset();
            this.f48424j.setRectToRect(this.f48417c, this.f48422h, Matrix.ScaleToFit.FILL);
        }
        this.f48416b.set(this.f48422h);
    }

    public int d() {
        return this.f48432r.getDefaultColor();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f48428n) {
            BitmapShader bitmapShader = new BitmapShader(this.f48418d, this.f48426l, this.f48427m);
            this.f48425k = bitmapShader;
            Shader.TileMode tileMode = this.f48426l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f48427m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f48424j);
            }
            this.f48419e.setShader(this.f48425k);
            this.f48428n = false;
        }
        if (this.f48430p) {
            if (this.f48431q > 0.0f) {
                canvas.drawOval(this.f48416b, this.f48419e);
                canvas.drawOval(this.f48422h, this.f48423i);
                return;
            }
            canvas.drawOval(this.f48416b, this.f48419e);
        } else if (this.f48431q > 0.0f) {
            canvas.drawRoundRect(this.f48416b, Math.max(this.f48429o, 0.0f), Math.max(this.f48429o, 0.0f), this.f48419e);
            RectF rectF = this.f48422h;
            float f5 = this.f48429o;
            canvas.drawRoundRect(rectF, f5, f5, this.f48423i);
        } else {
            RectF rectF2 = this.f48416b;
            float f6 = this.f48429o;
            canvas.drawRoundRect(rectF2, f6, f6, this.f48419e);
        }
    }

    public ColorStateList e() {
        return this.f48432r;
    }

    public float f() {
        return this.f48431q;
    }

    public float g() {
        return this.f48429o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f48421g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f48420f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ImageView.ScaleType h() {
        return this.f48433s;
    }

    public Shader.TileMode i() {
        return this.f48426l;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f48432r.isStateful();
    }

    public Shader.TileMode j() {
        return this.f48427m;
    }

    public boolean k() {
        return this.f48430p;
    }

    public c0 l(int i4) {
        return m(ColorStateList.valueOf(i4));
    }

    public c0 m(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f48432r = colorStateList;
        this.f48423i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    public c0 n(float f5) {
        this.f48431q = f5;
        this.f48423i.setStrokeWidth(f5);
        return this;
    }

    public c0 o(float f5) {
        this.f48429o = f5;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f48415a.set(rect);
        u();
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState = this.f48432r.getColorForState(iArr, 0);
        if (this.f48423i.getColor() != colorForState) {
            this.f48423i.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    public c0 p(boolean z4) {
        this.f48430p = z4;
        return this;
    }

    public c0 q(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f48433s != scaleType) {
            this.f48433s = scaleType;
            u();
        }
        return this;
    }

    public c0 r(Shader.TileMode tileMode) {
        if (this.f48426l != tileMode) {
            this.f48426l = tileMode;
            this.f48428n = true;
            invalidateSelf();
        }
        return this;
    }

    public c0 s(Shader.TileMode tileMode) {
        if (this.f48427m != tileMode) {
            this.f48427m = tileMode;
            this.f48428n = true;
            invalidateSelf();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f48419e.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f48419e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        this.f48419e.setDither(z4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f48419e.setFilterBitmap(z4);
        invalidateSelf();
    }

    public Bitmap t() {
        return a(this);
    }
}
