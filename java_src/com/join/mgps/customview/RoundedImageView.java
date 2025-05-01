package com.join.mgps.customview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.join.android.app.mgsim.wufun.R;
/* loaded from: classes4.dex */
public class RoundedImageView extends ImageView {

    /* renamed from: m  reason: collision with root package name */
    private static final int f47590m = -2;

    /* renamed from: n  reason: collision with root package name */
    private static final int f47591n = 0;

    /* renamed from: o  reason: collision with root package name */
    private static final int f47592o = 1;

    /* renamed from: p  reason: collision with root package name */
    private static final int f47593p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final String f47594q = "RoundedImageView";

    /* renamed from: r  reason: collision with root package name */
    public static final float f47595r = 6.0f;

    /* renamed from: s  reason: collision with root package name */
    public static final float f47596s = 0.0f;

    /* renamed from: t  reason: collision with root package name */
    public static final Shader.TileMode f47597t = Shader.TileMode.CLAMP;

    /* renamed from: u  reason: collision with root package name */
    private static final ImageView.ScaleType[] f47598u = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ boolean f47599v = false;

    /* renamed from: b  reason: collision with root package name */
    private float f47600b;

    /* renamed from: c  reason: collision with root package name */
    private float f47601c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f47602d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f47603e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f47604f;

    /* renamed from: g  reason: collision with root package name */
    private Shader.TileMode f47605g;

    /* renamed from: h  reason: collision with root package name */
    private Shader.TileMode f47606h;

    /* renamed from: i  reason: collision with root package name */
    private int f47607i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f47608j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f47609k;

    /* renamed from: l  reason: collision with root package name */
    private ImageView.ScaleType f47610l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f47611a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f47611a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f47611a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f47611a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f47611a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f47611a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f47611a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f47611a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f47600b = 6.0f;
        this.f47601c = 0.0f;
        this.f47602d = ColorStateList.valueOf(-16777216);
        this.f47603e = false;
        this.f47604f = false;
        Shader.TileMode tileMode = f47597t;
        this.f47605g = tileMode;
        this.f47606h = tileMode;
    }

    private static Shader.TileMode d(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    return null;
                }
                return Shader.TileMode.MIRROR;
            }
            return Shader.TileMode.REPEAT;
        }
        return Shader.TileMode.CLAMP;
    }

    private Drawable e() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i4 = this.f47607i;
        if (i4 != 0) {
            try {
                drawable = resources.getDrawable(i4);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find resource: ");
                sb.append(this.f47607i);
                this.f47607i = 0;
            }
        }
        return c0.c(drawable);
    }

    private void f(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        if (drawable instanceof c0) {
            ((c0) drawable).q(this.f47610l).o(this.f47600b).n(this.f47601c).m(this.f47602d).p(this.f47603e).r(this.f47605g).s(this.f47606h);
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i4 = 0; i4 < numberOfLayers; i4++) {
                f(layerDrawable.getDrawable(i4));
            }
        }
        invalidate();
    }

    private void g(boolean z4) {
        if (this.f47604f) {
            if (z4) {
                this.f47609k = c0.c(this.f47609k);
            }
            f(this.f47609k);
        }
    }

    private void h() {
        f(this.f47608j);
    }

    public boolean a() {
        return this.f47603e;
    }

    public void b(boolean z4) {
        if (this.f47604f == z4) {
            return;
        }
        this.f47604f = z4;
        g(true);
        invalidate();
    }

    public boolean c() {
        return this.f47604f;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    public int getBorderColor() {
        return this.f47602d.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f47602d;
    }

    public float getBorderWidth() {
        return this.f47601c;
    }

    public float getCornerRadius() {
        return this.f47600b;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f47610l;
    }

    public Shader.TileMode getTileModeX() {
        return this.f47605g;
    }

    public Shader.TileMode getTileModeY() {
        return this.f47606h;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f47609k = drawable;
        g(true);
        super.setBackgroundDrawable(this.f47609k);
    }

    public void setBorderColor(int i4) {
        setBorderColor(ColorStateList.valueOf(i4));
    }

    public void setBorderWidth(int i4) {
        setBorderWidth(getResources().getDimension(i4));
    }

    public void setCornerRadius(int i4) {
        setCornerRadius(getResources().getDimension(i4));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.f47607i = 0;
        this.f47608j = c0.b(bitmap);
        h();
        super.setImageDrawable(this.f47608j);
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.f47607i = 0;
        this.f47608j = c0.c(drawable);
        h();
        super.setImageDrawable(this.f47608j);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        if (this.f47607i != i4) {
            this.f47607i = i4;
            this.f47608j = e();
            h();
            super.setImageDrawable(this.f47608j);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z4) {
        this.f47603e = z4;
        h();
        g(false);
        invalidate();
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f47610l != scaleType) {
            this.f47610l = scaleType;
            switch (a.f47611a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            h();
            g(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f47605g == tileMode) {
            return;
        }
        this.f47605g = tileMode;
        h();
        g(false);
        invalidate();
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f47606h == tileMode) {
            return;
        }
        this.f47606h = tileMode;
        h();
        g(false);
        invalidate();
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (this.f47602d.equals(colorStateList)) {
            return;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        this.f47602d = colorStateList;
        h();
        g(false);
        if (this.f47601c > 0.0f) {
            invalidate();
        }
    }

    public void setBorderWidth(float f5) {
        if (this.f47601c == f5) {
            return;
        }
        this.f47601c = f5;
        h();
        g(false);
        invalidate();
    }

    public void setCornerRadius(float f5) {
        if (this.f47600b == f5) {
            return;
        }
        this.f47600b = f5;
        h();
        g(false);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f47600b = 6.0f;
        this.f47601c = 0.0f;
        this.f47602d = ColorStateList.valueOf(-16777216);
        this.f47603e = false;
        this.f47604f = false;
        Shader.TileMode tileMode = f47597t;
        this.f47605g = tileMode;
        this.f47606h = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RoundedImageView, i4, 0);
        int i5 = obtainStyledAttributes.getInt(0, -1);
        if (i5 >= 0) {
            setScaleType(f47598u[i5]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        this.f47600b = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.f47601c = dimensionPixelSize;
        if (this.f47600b < 0.0f) {
            this.f47600b = 6.0f;
        }
        if (dimensionPixelSize < 0.0f) {
            this.f47601c = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        this.f47602d = colorStateList;
        if (colorStateList == null) {
            this.f47602d = ColorStateList.valueOf(-16777216);
        }
        this.f47604f = obtainStyledAttributes.getBoolean(4, false);
        this.f47603e = obtainStyledAttributes.getBoolean(5, false);
        int i6 = obtainStyledAttributes.getInt(6, -2);
        if (i6 != -2) {
            setTileModeX(d(i6));
            setTileModeY(d(i6));
        }
        int i7 = obtainStyledAttributes.getInt(7, -2);
        if (i7 != -2) {
            setTileModeX(d(i7));
        }
        int i8 = obtainStyledAttributes.getInt(8, -2);
        if (i8 != -2) {
            setTileModeY(d(i8));
        }
        h();
        g(true);
        obtainStyledAttributes.recycle();
    }
}
