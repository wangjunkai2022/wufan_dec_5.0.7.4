package com.mingle.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.motion.widget.Key;
import com.mingle.shapeloading.R;
import com.mingle.widget.ShapeLoadingView;
import com.nineoldandroids.animation.a;
import com.nineoldandroids.animation.l;
/* loaded from: classes5.dex */
public class LoadingView extends FrameLayout {

    /* renamed from: j  reason: collision with root package name */
    private static final int f55970j = 500;

    /* renamed from: k  reason: collision with root package name */
    private static float f55971k = 200.0f;

    /* renamed from: b  reason: collision with root package name */
    private ShapeLoadingView f55972b;

    /* renamed from: c  reason: collision with root package name */
    private ImageView f55973c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f55974d;

    /* renamed from: e  reason: collision with root package name */
    private int f55975e;

    /* renamed from: f  reason: collision with root package name */
    private String f55976f;

    /* renamed from: g  reason: collision with root package name */
    private com.nineoldandroids.animation.d f55977g;

    /* renamed from: h  reason: collision with root package name */
    private Runnable f55978h;

    /* renamed from: i  reason: collision with root package name */
    public float f55979i;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LoadingView.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements a.InterfaceC0575a {
        b() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void b(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void c(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            LoadingView.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements a.InterfaceC0575a {
        c() {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void a(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void b(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void c(com.nineoldandroids.animation.a aVar) {
        }

        @Override // com.nineoldandroids.animation.a.InterfaceC0575a
        public void d(com.nineoldandroids.animation.a aVar) {
            LoadingView.this.f55972b.a();
            LoadingView.this.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f55983a;

        static {
            int[] iArr = new int[ShapeLoadingView.Shape.values().length];
            f55983a = iArr;
            try {
                iArr[ShapeLoadingView.Shape.SHAPE_RECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55983a[ShapeLoadingView.Shape.SHAPE_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55983a[ShapeLoadingView.Shape.SHAPE_TRIANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public LoadingView(Context context) {
        super(context);
        this.f55977g = null;
        this.f55978h = new a();
        this.f55979i = 1.2f;
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoadingView);
        this.f55976f = obtainStyledAttributes.getString(R.styleable.LoadingView_loadingText);
        this.f55975e = obtainStyledAttributes.getResourceId(R.styleable.LoadingView_loadingTextAppearance, -1);
        obtainStyledAttributes.recycle();
    }

    private void e(long j4) {
        com.nineoldandroids.animation.d dVar = this.f55977g;
        if (dVar == null || !dVar.g()) {
            removeCallbacks(this.f55978h);
            if (j4 > 0) {
                postDelayed(this.f55978h, j4);
            } else {
                post(this.f55978h);
            }
        }
    }

    private void f() {
        com.nineoldandroids.animation.d dVar = this.f55977g;
        if (dVar != null) {
            if (dVar.g()) {
                this.f55977g.cancel();
            }
            this.f55977g = null;
        }
        removeCallbacks(this.f55978h);
    }

    public int b(float f5) {
        return (int) ((f5 * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void c() {
        l r02 = l.r0(this.f55972b, "translationY", 0.0f, f55971k);
        l r03 = l.r0(this.f55973c, "scaleX", 1.0f, 0.2f);
        r02.k(500L);
        r02.l(new AccelerateInterpolator(this.f55979i));
        com.nineoldandroids.animation.d dVar = new com.nineoldandroids.animation.d();
        dVar.k(500L);
        dVar.C(r02, r03);
        dVar.a(new c());
        dVar.q();
    }

    public void g() {
        l r02;
        l r03 = l.r0(this.f55972b, "translationY", f55971k, 0.0f);
        l r04 = l.r0(this.f55973c, "scaleX", 0.2f, 1.0f);
        int i4 = d.f55983a[this.f55972b.getShape().ordinal()];
        if (i4 == 1) {
            r02 = l.r0(this.f55972b, Key.ROTATION, 0.0f, -120.0f);
        } else if (i4 != 2) {
            r02 = i4 != 3 ? null : l.r0(this.f55972b, Key.ROTATION, 0.0f, 180.0f);
        } else {
            r02 = l.r0(this.f55972b, Key.ROTATION, 0.0f, 180.0f);
        }
        r03.k(500L);
        r02.k(500L);
        r03.l(new DecelerateInterpolator(this.f55979i));
        r02.l(new DecelerateInterpolator(this.f55979i));
        com.nineoldandroids.animation.d dVar = new com.nineoldandroids.animation.d();
        dVar.k(500L);
        dVar.C(r03, r02, r04);
        dVar.a(new b());
        dVar.q();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.load_view, (ViewGroup) null);
        f55971k = b(54.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f55972b = (ShapeLoadingView) inflate.findViewById(R.id.shapeLoadingView);
        this.f55973c = (ImageView) inflate.findViewById(R.id.indication);
        TextView textView = (TextView) inflate.findViewById(R.id.promptTV);
        this.f55974d = textView;
        if (this.f55975e != -1) {
            textView.setTextAppearance(getContext(), this.f55975e);
        }
        setLoadingText(this.f55976f);
        addView(inflate, layoutParams);
        e(900L);
    }

    public void setLoadingText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f55974d.setVisibility(8);
        } else {
            this.f55974d.setVisibility(0);
        }
        this.f55974d.setText(charSequence);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        if (i4 == 0) {
            e(200L);
        } else {
            f();
        }
    }

    public LoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f55977g = null;
        this.f55978h = new a();
        this.f55979i = 1.2f;
        d(context, attributeSet);
    }

    public LoadingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f55977g = null;
        this.f55978h = new a();
        this.f55979i = 1.2f;
        d(context, attributeSet);
    }

    @TargetApi(21)
    public LoadingView(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f55977g = null;
        this.f55978h = new a();
        this.f55979i = 1.2f;
        d(context, attributeSet);
    }
}
