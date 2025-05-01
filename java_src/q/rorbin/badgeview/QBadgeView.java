package q.rorbin.badgeview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import q.rorbin.badgeview.a;
/* loaded from: classes7.dex */
public class QBadgeView extends View implements q.rorbin.badgeview.a {
    protected Paint.FontMetrics A;
    protected PointF B;
    protected PointF C;
    protected PointF D;
    protected PointF E;
    protected List<PointF> F;
    protected View G;
    protected int H;
    protected int I;
    protected TextPaint J;
    protected Paint K;
    protected Paint L;
    protected b M;
    protected a.InterfaceC0806a N;
    protected ViewGroup O;

    /* renamed from: b  reason: collision with root package name */
    protected int f73128b;

    /* renamed from: c  reason: collision with root package name */
    protected int f73129c;

    /* renamed from: d  reason: collision with root package name */
    protected int f73130d;

    /* renamed from: e  reason: collision with root package name */
    protected Drawable f73131e;

    /* renamed from: f  reason: collision with root package name */
    protected Bitmap f73132f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f73133g;

    /* renamed from: h  reason: collision with root package name */
    protected float f73134h;

    /* renamed from: i  reason: collision with root package name */
    protected float f73135i;

    /* renamed from: j  reason: collision with root package name */
    protected float f73136j;

    /* renamed from: k  reason: collision with root package name */
    protected int f73137k;

    /* renamed from: l  reason: collision with root package name */
    protected String f73138l;

    /* renamed from: m  reason: collision with root package name */
    protected boolean f73139m;

    /* renamed from: n  reason: collision with root package name */
    protected boolean f73140n;

    /* renamed from: o  reason: collision with root package name */
    protected boolean f73141o;

    /* renamed from: p  reason: collision with root package name */
    protected boolean f73142p;

    /* renamed from: q  reason: collision with root package name */
    protected int f73143q;

    /* renamed from: r  reason: collision with root package name */
    protected float f73144r;

    /* renamed from: s  reason: collision with root package name */
    protected float f73145s;

    /* renamed from: t  reason: collision with root package name */
    protected float f73146t;

    /* renamed from: u  reason: collision with root package name */
    protected float f73147u;

    /* renamed from: v  reason: collision with root package name */
    protected int f73148v;

    /* renamed from: w  reason: collision with root package name */
    protected boolean f73149w;

    /* renamed from: x  reason: collision with root package name */
    protected RectF f73150x;

    /* renamed from: y  reason: collision with root package name */
    protected RectF f73151y;

    /* renamed from: z  reason: collision with root package name */
    protected Path f73152z;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class a extends ViewGroup {
        public a(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            for (int i8 = 0; i8 < getChildCount(); i8++) {
                View childAt = getChildAt(i8);
                childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i4, int i5) {
            View view = null;
            View view2 = null;
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt instanceof QBadgeView) {
                    view2 = childAt;
                } else {
                    view = childAt;
                }
            }
            if (view == null) {
                super.onMeasure(i4, i5);
                return;
            }
            view.measure(i4, i5);
            if (view2 != null) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
            }
            setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public QBadgeView(Context context) {
        this(context, null);
    }

    private void A(Canvas canvas, PointF pointF, float f5) {
        if (pointF.x == -1000.0f && pointF.y == -1000.0f) {
            return;
        }
        if (!this.f73138l.isEmpty() && this.f73138l.length() != 1) {
            this.f73151y.left = pointF.x - ((this.f73150x.width() / 2.0f) + this.f73136j);
            this.f73151y.top = pointF.y - ((this.f73150x.height() / 2.0f) + (this.f73136j * 0.5f));
            this.f73151y.right = pointF.x + (this.f73150x.width() / 2.0f) + this.f73136j;
            this.f73151y.bottom = pointF.y + (this.f73150x.height() / 2.0f) + (this.f73136j * 0.5f);
            float height = this.f73151y.height() / 2.0f;
            if (this.f73131e != null) {
                B(canvas);
            } else {
                canvas.drawRoundRect(this.f73151y, height, height, this.K);
                if (this.f73129c != 0 && this.f73134h > 0.0f) {
                    canvas.drawRoundRect(this.f73151y, height, height, this.L);
                }
            }
        } else {
            RectF rectF = this.f73151y;
            float f6 = pointF.x;
            float f7 = (int) f5;
            rectF.left = f6 - f7;
            float f8 = pointF.y;
            rectF.top = f8 - f7;
            rectF.right = f6 + f7;
            rectF.bottom = f7 + f8;
            if (this.f73131e != null) {
                B(canvas);
            } else {
                canvas.drawCircle(f6, f8, f5, this.K);
                if (this.f73129c != 0 && this.f73134h > 0.0f) {
                    canvas.drawCircle(pointF.x, pointF.y, f5, this.L);
                }
            }
        }
        if (this.f73138l.isEmpty()) {
            return;
        }
        String str = this.f73138l;
        float f9 = pointF.x;
        RectF rectF2 = this.f73151y;
        float f10 = rectF2.bottom + rectF2.top;
        Paint.FontMetrics fontMetrics = this.A;
        canvas.drawText(str, f9, ((f10 - fontMetrics.bottom) - fontMetrics.top) / 2.0f, this.J);
    }

    private void B(Canvas canvas) {
        this.K.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        RectF rectF = this.f73151y;
        int i4 = (int) rectF.left;
        int i5 = (int) rectF.top;
        int i6 = (int) rectF.right;
        int i7 = (int) rectF.bottom;
        if (this.f73133g) {
            i6 = i4 + this.f73132f.getWidth();
            i7 = this.f73132f.getHeight() + i5;
            canvas.saveLayer(i4, i5, i6, i7, null, 31);
        }
        this.f73131e.setBounds(i4, i5, i6, i7);
        this.f73131e.draw(canvas);
        if (this.f73133g) {
            this.K.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(this.f73132f, i4, i5, this.K);
            canvas.restore();
            this.K.setXfermode(null);
            if (!this.f73138l.isEmpty() && this.f73138l.length() != 1) {
                RectF rectF2 = this.f73151y;
                canvas.drawRoundRect(rectF2, rectF2.height() / 2.0f, this.f73151y.height() / 2.0f, this.L);
                return;
            }
            canvas.drawCircle(this.f73151y.centerX(), this.f73151y.centerY(), this.f73151y.width() / 2.0f, this.L);
            return;
        }
        canvas.drawRect(this.f73151y, this.L);
    }

    private void C(Canvas canvas, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        PointF pointF = this.C;
        float f10 = pointF.y;
        PointF pointF2 = this.D;
        float f11 = f10 - pointF2.y;
        float f12 = pointF.x - pointF2.x;
        this.F.clear();
        if (f12 != 0.0f) {
            double d5 = f11 / f12;
            Double.isNaN(d5);
            double d6 = (-1.0d) / d5;
            e.a(this.C, f6, Double.valueOf(d6), this.F);
            e.a(this.D, f5, Double.valueOf(d6), this.F);
        } else {
            e.a(this.C, f6, Double.valueOf(0.0d), this.F);
            e.a(this.D, f5, Double.valueOf(0.0d), this.F);
        }
        this.f73152z.reset();
        Path path = this.f73152z;
        PointF pointF3 = this.D;
        float f13 = pointF3.x;
        float f14 = pointF3.y;
        int i4 = this.f73148v;
        path.addCircle(f13, f14, f5, (i4 == 1 || i4 == 2) ? Path.Direction.CCW : Path.Direction.CW);
        PointF pointF4 = this.E;
        PointF pointF5 = this.D;
        float f15 = pointF5.x;
        PointF pointF6 = this.C;
        pointF4.x = (f15 + pointF6.x) / 2.0f;
        pointF4.y = (pointF5.y + pointF6.y) / 2.0f;
        this.f73152z.moveTo(this.F.get(2).x, this.F.get(2).y);
        Path path2 = this.f73152z;
        PointF pointF7 = this.E;
        path2.quadTo(pointF7.x, pointF7.y, this.F.get(0).x, this.F.get(0).y);
        this.f73152z.lineTo(this.F.get(1).x, this.F.get(1).y);
        Path path3 = this.f73152z;
        PointF pointF8 = this.E;
        path3.quadTo(pointF8.x, pointF8.y, this.F.get(3).x, this.F.get(3).y);
        this.f73152z.lineTo(this.F.get(2).x, this.F.get(2).y);
        this.f73152z.close();
        canvas.drawPath(this.f73152z, this.K);
        if (this.f73129c == 0 || this.f73134h <= 0.0f) {
            return;
        }
        this.f73152z.reset();
        this.f73152z.moveTo(this.F.get(2).x, this.F.get(2).y);
        Path path4 = this.f73152z;
        PointF pointF9 = this.E;
        path4.quadTo(pointF9.x, pointF9.y, this.F.get(0).x, this.F.get(0).y);
        this.f73152z.moveTo(this.F.get(1).x, this.F.get(1).y);
        Path path5 = this.f73152z;
        PointF pointF10 = this.E;
        path5.quadTo(pointF10.x, pointF10.y, this.F.get(3).x, this.F.get(3).y);
        int i5 = this.f73148v;
        if (i5 != 1 && i5 != 2) {
            float f16 = this.F.get(3).x;
            PointF pointF11 = this.D;
            f7 = f16 - pointF11.x;
            f8 = pointF11.y;
            f9 = this.F.get(3).y;
        } else {
            float f17 = this.F.get(2).x;
            PointF pointF12 = this.D;
            f7 = f17 - pointF12.x;
            f8 = pointF12.y;
            f9 = this.F.get(2).y;
        }
        double atan = Math.atan((f8 - f9) / f7);
        int i6 = this.f73148v;
        float e5 = 360.0f - ((float) e.e(e.d(atan, i6 + (-1) == 0 ? 4 : i6 - 1)));
        if (Build.VERSION.SDK_INT >= 21) {
            Path path6 = this.f73152z;
            PointF pointF13 = this.D;
            float f18 = pointF13.x;
            float f19 = pointF13.y;
            path6.addArc(f18 - f5, f19 - f5, f18 + f5, f19 + f5, e5, 180.0f);
        } else {
            Path path7 = this.f73152z;
            PointF pointF14 = this.D;
            float f20 = pointF14.x;
            float f21 = pointF14.y;
            path7.addArc(new RectF(f20 - f5, f21 - f5, f20 + f5, f21 + f5), e5, 180.0f);
        }
        canvas.drawPath(this.f73152z, this.L);
    }

    private void D(View view) {
        if (view.getParent() != null && (view.getParent() instanceof View)) {
            D((View) view.getParent());
        } else if (view instanceof ViewGroup) {
            this.O = (ViewGroup) view;
        }
    }

    private void E() {
        float height = this.f73150x.height() > this.f73150x.width() ? this.f73150x.height() : this.f73150x.width();
        switch (this.f73143q) {
            case 17:
                PointF pointF = this.B;
                pointF.x = this.H / 2.0f;
                pointF.y = this.I / 2.0f;
                break;
            case 49:
                PointF pointF2 = this.B;
                pointF2.x = this.H / 2.0f;
                pointF2.y = this.f73145s + this.f73136j + (this.f73150x.height() / 2.0f);
                break;
            case 81:
                PointF pointF3 = this.B;
                pointF3.x = this.H / 2.0f;
                pointF3.y = this.I - ((this.f73145s + this.f73136j) + (this.f73150x.height() / 2.0f));
                break;
            case 8388627:
                PointF pointF4 = this.B;
                pointF4.x = this.f73144r + this.f73136j + (height / 2.0f);
                pointF4.y = this.I / 2.0f;
                break;
            case 8388629:
                PointF pointF5 = this.B;
                pointF5.x = this.H - ((this.f73144r + this.f73136j) + (height / 2.0f));
                pointF5.y = this.I / 2.0f;
                break;
            case 8388659:
                PointF pointF6 = this.B;
                float f5 = this.f73144r;
                float f6 = this.f73136j;
                pointF6.x = f5 + f6 + (height / 2.0f);
                pointF6.y = this.f73145s + f6 + (this.f73150x.height() / 2.0f);
                break;
            case 8388661:
                PointF pointF7 = this.B;
                float f7 = this.f73144r;
                float f8 = this.f73136j;
                pointF7.x = this.H - ((f7 + f8) + (height / 2.0f));
                pointF7.y = this.f73145s + f8 + (this.f73150x.height() / 2.0f);
                break;
            case 8388691:
                PointF pointF8 = this.B;
                float f9 = this.f73144r;
                float f10 = this.f73136j;
                pointF8.x = f9 + f10 + (height / 2.0f);
                pointF8.y = this.I - ((this.f73145s + f10) + (this.f73150x.height() / 2.0f));
                break;
            case 8388693:
                PointF pointF9 = this.B;
                float f11 = this.f73144r;
                float f12 = this.f73136j;
                pointF9.x = this.H - ((f11 + f12) + (height / 2.0f));
                pointF9.y = this.I - ((this.f73145s + f12) + (this.f73150x.height() / 2.0f));
                break;
        }
        I();
    }

    private void F(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        this.O = viewGroup;
        if (viewGroup == null) {
            D(view);
        }
    }

    private void G() {
        setLayerType(1, null);
        this.f73150x = new RectF();
        this.f73151y = new RectF();
        this.f73152z = new Path();
        this.B = new PointF();
        this.C = new PointF();
        this.D = new PointF();
        this.E = new PointF();
        this.F = new ArrayList();
        TextPaint textPaint = new TextPaint();
        this.J = textPaint;
        textPaint.setAntiAlias(true);
        this.J.setSubpixelText(true);
        this.J.setFakeBoldText(true);
        this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint = new Paint();
        this.K = paint;
        paint.setAntiAlias(true);
        this.K.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.L = paint2;
        paint2.setAntiAlias(true);
        this.L.setStyle(Paint.Style.STROKE);
        this.f73128b = -1552832;
        this.f73130d = -1;
        this.f73135i = d.a(getContext(), 11.0f);
        this.f73136j = d.a(getContext(), 5.0f);
        this.f73137k = 0;
        this.f73143q = 8388661;
        this.f73144r = d.a(getContext(), 1.0f);
        this.f73145s = d.a(getContext(), 1.0f);
        this.f73147u = d.a(getContext(), 90.0f);
        this.f73142p = true;
        this.f73133g = false;
        if (Build.VERSION.SDK_INT >= 21) {
            setTranslationZ(1000.0f);
        }
    }

    private void H() {
        N(this.f73142p);
        this.K.setColor(this.f73128b);
        this.L.setColor(this.f73129c);
        this.L.setStrokeWidth(this.f73134h);
        this.J.setColor(this.f73130d);
        this.J.setTextAlign(Paint.Align.CENTER);
    }

    private void I() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        PointF pointF = this.D;
        PointF pointF2 = this.B;
        pointF.x = pointF2.x + iArr[0];
        pointF.y = pointF2.y + iArr[1];
    }

    private void J() {
        RectF rectF = this.f73150x;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        if (TextUtils.isEmpty(this.f73138l)) {
            RectF rectF2 = this.f73150x;
            rectF2.right = 0.0f;
            rectF2.bottom = 0.0f;
        } else {
            this.J.setTextSize(this.f73135i);
            this.f73150x.right = this.J.measureText(this.f73138l);
            Paint.FontMetrics fontMetrics = this.J.getFontMetrics();
            this.A = fontMetrics;
            this.f73150x.bottom = fontMetrics.descent - fontMetrics.ascent;
        }
        z();
    }

    private void K() {
        if (this.f73149w) {
            x(this.C);
            O(5);
            return;
        }
        L();
        O(4);
    }

    private void N(boolean z4) {
        int a5 = d.a(getContext(), 1.0f);
        int a6 = d.a(getContext(), 1.5f);
        int i4 = this.f73148v;
        if (i4 == 1) {
            a5 = d.a(getContext(), 1.0f);
            a6 = d.a(getContext(), -1.5f);
        } else if (i4 == 2) {
            a5 = d.a(getContext(), -1.0f);
            a6 = d.a(getContext(), -1.5f);
        } else if (i4 == 3) {
            a5 = d.a(getContext(), -1.0f);
            a6 = d.a(getContext(), 1.5f);
        } else if (i4 == 4) {
            a5 = d.a(getContext(), 1.0f);
            a6 = d.a(getContext(), 1.5f);
        }
        this.K.setShadowLayer(z4 ? d.a(getContext(), 2.0f) : 0.0f, a5, a6, 855638016);
    }

    private void O(int i4) {
        a.InterfaceC0806a interfaceC0806a = this.N;
        if (interfaceC0806a != null) {
            interfaceC0806a.a(i4, this, this.G);
        }
    }

    private float getBadgeCircleRadius() {
        float width;
        float f5;
        if (this.f73138l.isEmpty()) {
            return this.f73136j;
        }
        if (this.f73138l.length() == 1) {
            if (this.f73150x.height() > this.f73150x.width()) {
                width = this.f73150x.height() / 2.0f;
                f5 = this.f73136j;
            } else {
                width = this.f73150x.width() / 2.0f;
                f5 = this.f73136j;
            }
            return width + (f5 * 0.5f);
        }
        return this.f73151y.height() / 2.0f;
    }

    private void z() {
        if (this.f73138l != null && this.f73133g) {
            Bitmap bitmap = this.f73132f;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f73132f.recycle();
            }
            float badgeCircleRadius = getBadgeCircleRadius();
            if (!this.f73138l.isEmpty() && this.f73138l.length() != 1) {
                this.f73132f = Bitmap.createBitmap((int) (this.f73150x.width() + (this.f73136j * 2.0f)), (int) (this.f73150x.height() + this.f73136j), Bitmap.Config.ARGB_4444);
                Canvas canvas = new Canvas(this.f73132f);
                if (Build.VERSION.SDK_INT >= 21) {
                    canvas.drawRoundRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), canvas.getHeight() / 2.0f, canvas.getHeight() / 2.0f, this.K);
                    return;
                } else {
                    canvas.drawRoundRect(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), canvas.getHeight() / 2.0f, canvas.getHeight() / 2.0f, this.K);
                    return;
                }
            }
            int i4 = ((int) badgeCircleRadius) * 2;
            this.f73132f = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_4444);
            Canvas canvas2 = new Canvas(this.f73132f);
            canvas2.drawCircle(canvas2.getWidth() / 2.0f, canvas2.getHeight() / 2.0f, canvas2.getWidth() / 2.0f, this.K);
        }
    }

    public void L() {
        PointF pointF = this.C;
        pointF.x = -1000.0f;
        pointF.y = -1000.0f;
        this.f73148v = 4;
        M(false);
        getParent().requestDisallowInterceptTouchEvent(false);
        invalidate();
    }

    protected void M(boolean z4) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (z4) {
            this.O.addView(this, new FrameLayout.LayoutParams(-1, -1));
        } else {
            c(this.G);
        }
    }

    @Override // q.rorbin.badgeview.a
    public float a(boolean z4) {
        return z4 ? d.b(getContext(), this.f73135i) : this.f73135i;
    }

    @Override // q.rorbin.badgeview.a
    public boolean b() {
        return this.f73142p;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a c(View view) {
        if (view != null) {
            if (getParent() != null) {
                ((ViewGroup) getParent()).removeView(this);
            }
            ViewParent parent = view.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                this.G = view;
                if (parent instanceof a) {
                    ((a) parent).addView(this);
                } else {
                    ViewGroup viewGroup = (ViewGroup) parent;
                    int indexOfChild = viewGroup.indexOfChild(view);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    viewGroup.removeView(view);
                    a aVar = new a(getContext());
                    aVar.setId(view.getId());
                    view.setId(-1);
                    viewGroup.addView(aVar, indexOfChild, layoutParams);
                    aVar.addView(view);
                    aVar.addView(this);
                }
                return this;
            }
            throw new IllegalStateException("targetView must have a parent");
        }
        throw new IllegalStateException("targetView can not be null");
    }

    @Override // q.rorbin.badgeview.a
    public float d(boolean z4) {
        return z4 ? d.b(getContext(), this.f73144r) : this.f73144r;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a e(String str) {
        this.f73138l = str;
        this.f73137k = 1;
        J();
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public float f(boolean z4) {
        return z4 ? d.b(getContext(), this.f73145s) : this.f73145s;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a g(int i4) {
        this.f73128b = i4;
        if (i4 == 0) {
            this.J.setXfermode(null);
        } else {
            this.J.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public Drawable getBadgeBackground() {
        return this.f73131e;
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeBackgroundColor() {
        return this.f73128b;
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeGravity() {
        return this.f73143q;
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeNumber() {
        return this.f73137k;
    }

    @Override // q.rorbin.badgeview.a
    public String getBadgeText() {
        return this.f73138l;
    }

    @Override // q.rorbin.badgeview.a
    public int getBadgeTextColor() {
        return this.f73130d;
    }

    @Override // q.rorbin.badgeview.a
    public PointF getDragCenter() {
        if (this.f73139m && this.f73140n) {
            return this.C;
        }
        return null;
    }

    @Override // q.rorbin.badgeview.a
    public View getTargetView() {
        return this.G;
    }

    @Override // q.rorbin.badgeview.a
    public boolean h() {
        return this.f73139m;
    }

    @Override // q.rorbin.badgeview.a
    public void hide(boolean z4) {
        if (z4 && this.O != null) {
            I();
            x(this.D);
            return;
        }
        q(0);
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a i(a.InterfaceC0806a interfaceC0806a) {
        this.f73139m = interfaceC0806a != null;
        this.N = interfaceC0806a;
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public float j(boolean z4) {
        return z4 ? d.b(getContext(), this.f73136j) : this.f73136j;
    }

    @Override // q.rorbin.badgeview.a
    public boolean k() {
        return this.f73141o;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a l(int i4) {
        this.f73130d = i4;
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a m(float f5, boolean z4) {
        return r(f5, f5, z4);
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a n(int i4, float f5, boolean z4) {
        this.f73129c = i4;
        if (z4) {
            f5 = d.a(getContext(), f5);
        }
        this.f73134h = f5;
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a o(int i4) {
        if (i4 != 8388659 && i4 != 8388661 && i4 != 8388691 && i4 != 8388693 && i4 != 17 && i4 != 49 && i4 != 81 && i4 != 8388627 && i4 != 8388629) {
            throw new IllegalStateException("only support Gravity.START | Gravity.TOP , Gravity.END | Gravity.TOP , Gravity.START | Gravity.BOTTOM , Gravity.END | Gravity.BOTTOM , Gravity.CENTER , Gravity.CENTER | Gravity.TOP , Gravity.CENTER | Gravity.BOTTOM ,Gravity.CENTER | Gravity.START , Gravity.CENTER | Gravity.END");
        }
        this.f73143q = i4;
        invalidate();
        return this;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.O == null) {
            F(this.G);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        b bVar = this.M;
        if (bVar != null && bVar.isRunning()) {
            this.M.b(canvas);
        } else if (this.f73138l != null) {
            H();
            float badgeCircleRadius = getBadgeCircleRadius();
            float b5 = this.f73146t * (1.0f - (e.b(this.D, this.C) / this.f73147u));
            if (this.f73139m && this.f73140n) {
                this.f73148v = e.c(this.C, this.D);
                N(this.f73142p);
                boolean z4 = b5 < ((float) d.a(getContext(), 1.5f));
                this.f73149w = z4;
                if (z4) {
                    O(3);
                    A(canvas, this.C, badgeCircleRadius);
                    return;
                }
                O(2);
                C(canvas, b5, badgeCircleRadius);
                A(canvas, this.C, badgeCircleRadius);
                return;
            }
            E();
            A(canvas, this.B, badgeCircleRadius);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        this.H = i4;
        this.I = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
        if (r0 != 6) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L31
            r3 = 2
            if (r0 == r3) goto L18
            r3 = 3
            if (r0 == r3) goto L31
            r3 = 5
            if (r0 == r3) goto L45
            r3 = 6
            if (r0 == r3) goto L31
            goto La8
        L18:
            boolean r0 = r6.f73140n
            if (r0 == 0) goto La8
            android.graphics.PointF r0 = r6.C
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.C
            float r3 = r7.getRawY()
            r0.y = r3
            r6.invalidate()
            goto La8
        L31:
            int r0 = r7.getActionIndex()
            int r0 = r7.getPointerId(r0)
            if (r0 != 0) goto La8
            boolean r0 = r6.f73140n
            if (r0 == 0) goto La8
            r6.f73140n = r1
            r6.K()
            goto La8
        L45:
            float r0 = r7.getX()
            float r3 = r7.getY()
            boolean r4 = r6.f73139m
            if (r4 == 0) goto La8
            int r4 = r7.getActionIndex()
            int r4 = r7.getPointerId(r4)
            if (r4 != 0) goto La8
            android.graphics.RectF r4 = r6.f73151y
            float r5 = r4.left
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 <= 0) goto La8
            float r5 = r4.right
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto La8
            float r0 = r4.top
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto La8
            float r0 = r4.bottom
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto La8
            java.lang.String r0 = r6.f73138l
            if (r0 == 0) goto La8
            r6.I()
            r6.f73140n = r2
            r6.O(r2)
            android.content.Context r0 = r6.getContext()
            r3 = 1088421888(0x40e00000, float:7.0)
            int r0 = q.rorbin.badgeview.d.a(r0, r3)
            float r0 = (float) r0
            r6.f73146t = r0
            android.view.ViewParent r0 = r6.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r6.M(r2)
            android.graphics.PointF r0 = r6.C
            float r3 = r7.getRawX()
            r0.x = r3
            android.graphics.PointF r0 = r6.C
            float r3 = r7.getRawY()
            r0.y = r3
        La8:
            boolean r0 = r6.f73140n
            if (r0 != 0) goto Lb2
            boolean r7 = super.onTouchEvent(r7)
            if (r7 == 0) goto Lb3
        Lb2:
            r1 = 1
        Lb3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q.rorbin.badgeview.QBadgeView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a p(Drawable drawable) {
        return w(drawable, false);
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a q(int i4) {
        this.f73137k = i4;
        if (i4 < 0) {
            this.f73138l = "";
        } else if (i4 > 99) {
            this.f73138l = this.f73141o ? String.valueOf(i4) : "99+";
        } else if (i4 > 0 && i4 <= 99) {
            this.f73138l = String.valueOf(i4);
        } else if (i4 == 0) {
            this.f73138l = null;
        }
        J();
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a r(float f5, float f6, boolean z4) {
        if (z4) {
            f5 = d.a(getContext(), f5);
        }
        this.f73144r = f5;
        if (z4) {
            f6 = d.a(getContext(), f6);
        }
        this.f73145s = f6;
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a s(boolean z4) {
        this.f73142p = z4;
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a t(boolean z4) {
        this.f73141o = z4;
        int i4 = this.f73137k;
        if (i4 > 99) {
            q(i4);
        }
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a u(float f5, boolean z4) {
        if (z4) {
            f5 = d.a(getContext(), f5);
        }
        this.f73136j = f5;
        z();
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a v(float f5, boolean z4) {
        if (z4) {
            f5 = d.a(getContext(), f5);
        }
        this.f73135i = f5;
        J();
        invalidate();
        return this;
    }

    @Override // q.rorbin.badgeview.a
    public q.rorbin.badgeview.a w(Drawable drawable, boolean z4) {
        this.f73133g = z4;
        this.f73131e = drawable;
        z();
        invalidate();
        return this;
    }

    protected void x(PointF pointF) {
        if (this.f73138l == null) {
            return;
        }
        b bVar = this.M;
        if (bVar == null || !bVar.isRunning()) {
            M(true);
            b bVar2 = new b(y(), pointF, this);
            this.M = bVar2;
            bVar2.start();
            q(0);
        }
    }

    protected Bitmap y() {
        Bitmap createBitmap = Bitmap.createBitmap(((int) this.f73151y.width()) + d.a(getContext(), 3.0f), ((int) this.f73151y.height()) + d.a(getContext(), 3.0f), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        A(canvas, new PointF(canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f), getBadgeCircleRadius());
        return createBitmap;
    }

    private QBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private QBadgeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        G();
    }
}
