package com.join.mgps.pulltorefresh.library;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.join.android.app.mgsim.wufun.R;
import com.join.mgps.pulltorefresh.library.internal.FlipLoadingLayout;
import com.join.mgps.pulltorefresh.library.internal.LoadingLayout;
import com.join.mgps.pulltorefresh.library.internal.RotateLoadingLayout;
/* loaded from: classes4.dex */
public abstract class PullToRefreshBase<T extends View> extends LinearLayout implements com.join.mgps.pulltorefresh.library.b<T> {
    static final boolean A = false;
    static final String B = "PullToRefresh";
    static final float C = 2.0f;
    public static final int D = 200;
    public static final int E = 325;
    static final int F = 225;
    static final String G = "ptr_state";
    static final String H = "ptr_mode";
    static final String I = "ptr_current_mode";
    static final String J = "ptr_disable_scrolling";
    static final String K = "ptr_show_refreshing_view";
    static final String L = "ptr_super";

    /* renamed from: z  reason: collision with root package name */
    static final boolean f53905z = true;

    /* renamed from: b  reason: collision with root package name */
    private int f53906b;

    /* renamed from: c  reason: collision with root package name */
    private float f53907c;

    /* renamed from: d  reason: collision with root package name */
    private float f53908d;

    /* renamed from: e  reason: collision with root package name */
    private float f53909e;

    /* renamed from: f  reason: collision with root package name */
    private float f53910f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f53911g;

    /* renamed from: h  reason: collision with root package name */
    private State f53912h;

    /* renamed from: i  reason: collision with root package name */
    private Mode f53913i;

    /* renamed from: j  reason: collision with root package name */
    private Mode f53914j;

    /* renamed from: k  reason: collision with root package name */
    T f53915k;

    /* renamed from: l  reason: collision with root package name */
    private FrameLayout f53916l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f53917m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f53918n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f53919o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f53920p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f53921q;

    /* renamed from: r  reason: collision with root package name */
    private Interpolator f53922r;

    /* renamed from: s  reason: collision with root package name */
    private AnimationStyle f53923s;

    /* renamed from: t  reason: collision with root package name */
    private LoadingLayout f53924t;

    /* renamed from: u  reason: collision with root package name */
    private LoadingLayout f53925u;

    /* renamed from: v  reason: collision with root package name */
    private h<T> f53926v;

    /* renamed from: w  reason: collision with root package name */
    private g<T> f53927w;

    /* renamed from: x  reason: collision with root package name */
    private f<T> f53928x;

    /* renamed from: y  reason: collision with root package name */
    private PullToRefreshBase<T>.j f53929y;

    /* loaded from: classes4.dex */
    public enum AnimationStyle {
        ROTATE,
        FLIP;

        static AnimationStyle getDefault() {
            return ROTATE;
        }

        static AnimationStyle mapIntToValue(int i4) {
            if (i4 != 1) {
                return ROTATE;
            }
            return FLIP;
        }

        LoadingLayout createLoadingLayout(Context context, Mode mode, Orientation orientation, TypedArray typedArray) {
            if (d.f53936d[ordinal()] != 2) {
                return new RotateLoadingLayout(context, mode, orientation, typedArray);
            }
            return new FlipLoadingLayout(context, mode, orientation, typedArray);
        }
    }

    /* loaded from: classes4.dex */
    public enum Mode {
        DISABLED(0),
        PULL_FROM_START(1),
        PULL_FROM_END(2),
        BOTH(3),
        MANUAL_REFRESH_ONLY(4);
        
        public static Mode PULL_DOWN_TO_REFRESH;
        public static Mode PULL_UP_TO_REFRESH;
        private int mIntValue;

        static {
            Mode mode = PULL_FROM_START;
            Mode mode2 = PULL_FROM_END;
            PULL_DOWN_TO_REFRESH = mode;
            PULL_UP_TO_REFRESH = mode2;
        }

        Mode(int i4) {
            this.mIntValue = i4;
        }

        static Mode getDefault() {
            return PULL_FROM_START;
        }

        static Mode mapIntToValue(int i4) {
            Mode[] values;
            for (Mode mode : values()) {
                if (i4 == mode.getIntValue()) {
                    return mode;
                }
            }
            return getDefault();
        }

        int getIntValue() {
            return this.mIntValue;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean permitsPullToRefresh() {
            return (this == DISABLED || this == MANUAL_REFRESH_ONLY) ? false : true;
        }

        public boolean showFooterLoadingLayout() {
            return this == PULL_FROM_END || this == BOTH || this == MANUAL_REFRESH_ONLY;
        }

        public boolean showHeaderLoadingLayout() {
            return this == PULL_FROM_START || this == BOTH;
        }
    }

    /* loaded from: classes4.dex */
    public enum Orientation {
        VERTICAL,
        HORIZONTAL
    }

    /* loaded from: classes4.dex */
    public enum State {
        RESET(0),
        PULL_TO_REFRESH(1),
        RELEASE_TO_REFRESH(2),
        REFRESHING(8),
        MANUAL_REFRESHING(9),
        OVERSCROLLING(16);
        
        private int mIntValue;

        State(int i4) {
            this.mIntValue = i4;
        }

        static State mapIntToValue(int i4) {
            State[] values;
            for (State state : values()) {
                if (i4 == state.getIntValue()) {
                    return state;
                }
            }
            return RESET;
        }

        int getIntValue() {
            return this.mIntValue;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements i {
        a() {
        }

        @Override // com.join.mgps.pulltorefresh.library.PullToRefreshBase.i
        public void a() {
            PullToRefreshBase.this.n();
        }
    }

    /* loaded from: classes4.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PullToRefreshBase.this.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements i {
        c() {
        }

        @Override // com.join.mgps.pulltorefresh.library.PullToRefreshBase.i
        public void a() {
            PullToRefreshBase.this.K(0, 200L, 225L, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f53933a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f53934b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f53935c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f53936d;

        static {
            int[] iArr = new int[AnimationStyle.values().length];
            f53936d = iArr;
            try {
                iArr[AnimationStyle.ROTATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f53936d[AnimationStyle.FLIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Mode.values().length];
            f53935c = iArr2;
            try {
                iArr2[Mode.PULL_FROM_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f53935c[Mode.PULL_FROM_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f53935c[Mode.MANUAL_REFRESH_ONLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f53935c[Mode.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[State.values().length];
            f53934b = iArr3;
            try {
                iArr3[State.RESET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f53934b[State.PULL_TO_REFRESH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f53934b[State.RELEASE_TO_REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f53934b[State.REFRESHING.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f53934b[State.MANUAL_REFRESHING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f53934b[State.OVERSCROLLING.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr4 = new int[Orientation.values().length];
            f53933a = iArr4;
            try {
                iArr4[Orientation.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f53933a[Orientation.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface e {
        void a();
    }

    /* loaded from: classes4.dex */
    public interface f<V extends View> {
        void a(PullToRefreshBase<V> pullToRefreshBase, State state, Mode mode);
    }

    /* loaded from: classes4.dex */
    public interface g<V extends View> {
        void a(PullToRefreshBase<V> pullToRefreshBase);

        void b(PullToRefreshBase<V> pullToRefreshBase);
    }

    /* loaded from: classes4.dex */
    public interface h<V extends View> {
        void O(PullToRefreshBase<V> pullToRefreshBase);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public interface i {
        void a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public final class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final Interpolator f53937b;

        /* renamed from: c  reason: collision with root package name */
        private final int f53938c;

        /* renamed from: d  reason: collision with root package name */
        private final int f53939d;

        /* renamed from: e  reason: collision with root package name */
        private final long f53940e;

        /* renamed from: f  reason: collision with root package name */
        private i f53941f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f53942g = true;

        /* renamed from: h  reason: collision with root package name */
        private long f53943h = -1;

        /* renamed from: i  reason: collision with root package name */
        private int f53944i = -1;

        public j(int i4, int i5, long j4, i iVar) {
            this.f53939d = i4;
            this.f53938c = i5;
            this.f53937b = PullToRefreshBase.this.f53922r;
            this.f53940e = j4;
            this.f53941f = iVar;
        }

        public void a() {
            this.f53942g = false;
            PullToRefreshBase.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f53943h == -1) {
                this.f53943h = System.currentTimeMillis();
            } else {
                int round = this.f53939d - Math.round((this.f53939d - this.f53938c) * this.f53937b.getInterpolation(((float) Math.max(Math.min(((System.currentTimeMillis() - this.f53943h) * 1000) / this.f53940e, 1000L), 0L)) / 1000.0f));
                this.f53944i = round;
                PullToRefreshBase.this.setHeaderScroll(round);
            }
            if (this.f53942g && this.f53938c != this.f53944i) {
                com.join.mgps.pulltorefresh.library.internal.c.a(PullToRefreshBase.this, this);
                return;
            }
            i iVar = this.f53941f;
            if (iVar != null) {
                iVar.a();
            }
        }
    }

    public PullToRefreshBase(Context context) {
        super(context);
        this.f53911g = false;
        this.f53912h = State.RESET;
        this.f53913i = Mode.getDefault();
        this.f53917m = true;
        this.f53918n = false;
        this.f53919o = true;
        this.f53920p = true;
        this.f53921q = true;
        this.f53923s = AnimationStyle.getDefault();
        t(context, null);
    }

    private void E() {
        float f5;
        float f6;
        int round;
        int footerSize;
        if (d.f53933a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            f5 = this.f53910f;
            f6 = this.f53908d;
        } else {
            f5 = this.f53909e;
            f6 = this.f53907c;
        }
        int[] iArr = d.f53935c;
        if (iArr[this.f53914j.ordinal()] != 1) {
            round = Math.round(Math.min(f5 - f6, 0.0f) / 2.0f);
            footerSize = getHeaderSize();
        } else {
            round = Math.round(Math.max(f5 - f6, 0.0f) / 2.0f);
            footerSize = getFooterSize();
        }
        setHeaderScroll(round);
        if (round == 0 || c()) {
            return;
        }
        float abs = Math.abs(round) / footerSize;
        if (iArr[this.f53914j.ordinal()] != 1) {
            this.f53924t.c(abs);
        } else {
            this.f53925u.c(abs);
        }
        State state = this.f53912h;
        State state2 = State.PULL_TO_REFRESH;
        if (state != state2 && footerSize >= Math.abs(round)) {
            H(state2, new boolean[0]);
        } else if (this.f53912h != state2 || footerSize >= Math.abs(round)) {
        } else {
            H(State.RELEASE_TO_REFRESH, new boolean[0]);
        }
    }

    private final void J(int i4, long j4) {
        K(i4, j4, 0L, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i4, long j4, long j5, i iVar) {
        int scrollX;
        PullToRefreshBase<T>.j jVar = this.f53929y;
        if (jVar != null) {
            jVar.a();
        }
        if (d.f53933a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            scrollX = getScrollY();
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        if (i5 != i4) {
            if (this.f53922r == null) {
                this.f53922r = new DecelerateInterpolator();
            }
            PullToRefreshBase<T>.j jVar2 = new j(i5, i4, j4, iVar);
            this.f53929y = jVar2;
            if (j5 > 0) {
                postDelayed(jVar2, j5);
            } else {
                post(jVar2);
            }
        }
    }

    private final void M(int i4) {
        K(i4, 200L, 0L, new c());
    }

    private LinearLayout.LayoutParams getLoadingLayoutLayoutParams() {
        if (d.f53933a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return new LinearLayout.LayoutParams(-2, -1);
    }

    private int getMaximumPullScroll() {
        if (d.f53933a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            return Math.round(getHeight() / 2.0f);
        }
        return Math.round(getWidth() / 2.0f);
    }

    private void k(Context context, T t4) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.f53916l = frameLayout;
        frameLayout.addView(t4, -1, -1);
        m(this.f53916l, new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        h<T> hVar = this.f53926v;
        if (hVar != null) {
            hVar.O(this);
            return;
        }
        g<T> gVar = this.f53927w;
        if (gVar != null) {
            Mode mode = this.f53914j;
            if (mode == Mode.PULL_FROM_START) {
                gVar.b(this);
            } else if (mode == Mode.PULL_FROM_END) {
                gVar.a(this);
            }
        }
    }

    private void t(Context context, AttributeSet attributeSet) {
        if (d.f53933a[getPullToRefreshScrollDirection().ordinal()] != 1) {
            setOrientation(1);
        } else {
            setOrientation(0);
        }
        setGravity(17);
        this.f53906b = ViewConfiguration.get(context).getScaledTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PullToRefresh);
        if (obtainStyledAttributes.hasValue(12)) {
            this.f53913i = Mode.mapIntToValue(obtainStyledAttributes.getInteger(12, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f53923s = AnimationStyle.mapIntToValue(obtainStyledAttributes.getInteger(1, 0));
        }
        T q4 = q(context, attributeSet);
        this.f53915k = q4;
        k(context, q4);
        this.f53924t = o(context, Mode.PULL_FROM_START, obtainStyledAttributes);
        this.f53925u = o(context, Mode.PULL_FROM_END, obtainStyledAttributes);
        if (obtainStyledAttributes.hasValue(14)) {
            Drawable drawable = obtainStyledAttributes.getDrawable(14);
            if (drawable != null) {
                this.f53915k.setBackgroundDrawable(drawable);
            }
        } else if (obtainStyledAttributes.hasValue(0)) {
            com.join.mgps.pulltorefresh.library.internal.b.a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
            Drawable drawable2 = obtainStyledAttributes.getDrawable(0);
            if (drawable2 != null) {
                this.f53915k.setBackgroundDrawable(drawable2);
            }
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.f53920p = obtainStyledAttributes.getBoolean(13, true);
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.f53918n = obtainStyledAttributes.getBoolean(16, false);
        }
        s(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        O();
    }

    private boolean v() {
        int i4 = d.f53935c[this.f53913i.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 4) {
                    return false;
                }
                return w() || x();
            }
            return x();
        }
        return w();
    }

    protected void A() {
        int i4 = d.f53935c[this.f53914j.ordinal()];
        if (i4 == 1) {
            this.f53925u.e();
        } else if (i4 != 2) {
        } else {
            this.f53924t.e();
        }
    }

    protected void B(boolean z4) {
        if (this.f53913i.showHeaderLoadingLayout()) {
            this.f53924t.g();
        }
        if (this.f53913i.showFooterLoadingLayout()) {
            this.f53925u.g();
        }
        if (z4) {
            if (this.f53917m) {
                a aVar = new a();
                int i4 = d.f53935c[this.f53914j.ordinal()];
                if (i4 != 1 && i4 != 3) {
                    L(-getHeaderSize(), aVar);
                    return;
                } else {
                    L(getFooterSize(), aVar);
                    return;
                }
            }
            I(0);
            return;
        }
        n();
    }

    protected void C() {
        int i4 = d.f53935c[this.f53914j.ordinal()];
        if (i4 == 1) {
            this.f53925u.i();
        } else if (i4 != 2) {
        } else {
            this.f53924t.i();
        }
    }

    protected void D() {
        this.f53911g = false;
        this.f53921q = true;
        this.f53924t.k();
        this.f53925u.k();
        I(0);
    }

    protected final void F() {
        int maximumPullScroll = (int) (getMaximumPullScroll() * 1.2f);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int i4 = d.f53933a[getPullToRefreshScrollDirection().ordinal()];
        if (i4 == 1) {
            if (this.f53913i.showHeaderLoadingLayout()) {
                this.f53924t.setWidth(maximumPullScroll);
                paddingLeft = -maximumPullScroll;
            } else {
                paddingLeft = 0;
            }
            if (this.f53913i.showFooterLoadingLayout()) {
                this.f53925u.setWidth(maximumPullScroll);
                paddingRight = -maximumPullScroll;
            } else {
                paddingRight = 0;
            }
        } else if (i4 == 2) {
            if (this.f53913i.showHeaderLoadingLayout()) {
                this.f53924t.setHeight(maximumPullScroll);
                paddingTop = -maximumPullScroll;
            } else {
                paddingTop = 0;
            }
            if (this.f53913i.showFooterLoadingLayout()) {
                this.f53925u.setHeight(maximumPullScroll);
                paddingBottom = -maximumPullScroll;
            } else {
                paddingBottom = 0;
            }
        }
        String.format("Setting Padding. L: %d, T: %d, R: %d, B: %d", Integer.valueOf(paddingLeft), Integer.valueOf(paddingTop), Integer.valueOf(paddingRight), Integer.valueOf(paddingBottom));
        setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
    }

    protected final void G(int i4, int i5) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f53916l.getLayoutParams();
        int i6 = d.f53933a[getPullToRefreshScrollDirection().ordinal()];
        if (i6 != 1) {
            if (i6 == 2 && layoutParams.height != i5) {
                layoutParams.height = i5;
                this.f53916l.requestLayout();
            }
        } else if (layoutParams.width != i4) {
            layoutParams.width = i4;
            this.f53916l.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void H(State state, boolean... zArr) {
        this.f53912h = state;
        StringBuilder sb = new StringBuilder();
        sb.append("State: ");
        sb.append(this.f53912h.name());
        int i4 = d.f53934b[this.f53912h.ordinal()];
        if (i4 == 1) {
            D();
        } else if (i4 == 2) {
            A();
        } else if (i4 == 3) {
            C();
        } else if (i4 == 4 || i4 == 5) {
            B(zArr[0]);
        }
        f<T> fVar = this.f53928x;
        if (fVar != null) {
            fVar.a(this, this.f53912h, this.f53914j);
        }
    }

    protected final void I(int i4) {
        J(i4, getPullToRefreshScrollDuration());
    }

    protected final void L(int i4, i iVar) {
        K(i4, getPullToRefreshScrollDuration(), 0L, iVar);
    }

    protected final void N(int i4) {
        J(i4, getPullToRefreshScrollDurationLonger());
    }

    protected void O() {
        LinearLayout.LayoutParams loadingLayoutLayoutParams = getLoadingLayoutLayoutParams();
        if (this == this.f53924t.getParent()) {
            removeView(this.f53924t);
        }
        if (this.f53913i.showHeaderLoadingLayout()) {
            l(this.f53924t, 0, loadingLayoutLayoutParams);
        }
        if (this == this.f53925u.getParent()) {
            removeView(this.f53925u);
        }
        if (this.f53913i.showFooterLoadingLayout()) {
            m(this.f53925u, loadingLayoutLayoutParams);
        }
        F();
        Mode mode = this.f53913i;
        if (mode == Mode.BOTH) {
            mode = Mode.PULL_FROM_START;
        }
        this.f53914j = mode;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean a() {
        return this.f53913i.permitsPullToRefresh();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        StringBuilder sb = new StringBuilder();
        sb.append("addView: ");
        sb.append(view.getClass().getSimpleName());
        T refreshableView = getRefreshableView();
        if (refreshableView instanceof ViewGroup) {
            ((ViewGroup) refreshableView).addView(view, i4, layoutParams);
            return;
        }
        throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final com.join.mgps.pulltorefresh.library.a b(boolean z4, boolean z5) {
        return p(z4, z5);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean c() {
        State state = this.f53912h;
        return state == State.REFRESHING || state == State.MANUAL_REFRESHING;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean d() {
        if (this.f53913i.showHeaderLoadingLayout() && x()) {
            M((-getHeaderSize()) * 2);
            return true;
        } else if (this.f53913i.showFooterLoadingLayout() && w()) {
            M(getFooterSize() * 2);
            return true;
        } else {
            return false;
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean e() {
        return this.f53918n;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void f() {
        if (c()) {
            H(State.RESET, new boolean[0]);
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean g() {
        return Build.VERSION.SDK_INT >= 9 && this.f53920p && com.join.mgps.pulltorefresh.library.d.a(this.f53915k);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final Mode getCurrentMode() {
        return this.f53914j;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean getFilterTouchEvents() {
        return this.f53919o;
    }

    protected final LoadingLayout getFooterLayout() {
        return this.f53925u;
    }

    protected final int getFooterSize() {
        return this.f53925u.getContentSize();
    }

    protected final LoadingLayout getHeaderLayout() {
        return this.f53924t;
    }

    protected final int getHeaderSize() {
        return this.f53924t.getContentSize();
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final com.join.mgps.pulltorefresh.library.a getLoadingLayoutProxy() {
        return b(true, true);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final Mode getMode() {
        return this.f53913i;
    }

    public abstract Orientation getPullToRefreshScrollDirection();

    protected int getPullToRefreshScrollDuration() {
        return 200;
    }

    protected int getPullToRefreshScrollDurationLonger() {
        return E;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final T getRefreshableView() {
        return this.f53915k;
    }

    protected FrameLayout getRefreshableViewWrapper() {
        return this.f53916l;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final boolean getShowViewWhileRefreshing() {
        return this.f53917m;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final State getState() {
        return this.f53912h;
    }

    protected final void l(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
    }

    protected final void m(View view, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, -1, layoutParams);
    }

    protected LoadingLayout o(Context context, Mode mode, TypedArray typedArray) {
        LoadingLayout createLoadingLayout = this.f53923s.createLoadingLayout(context, mode, getPullToRefreshScrollDirection(), typedArray);
        createLoadingLayout.setVisibility(4);
        return createLoadingLayout;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f5;
        float f6;
        if (a()) {
            int action = motionEvent.getAction();
            if (action != 3 && action != 1) {
                if (action == 0 || !this.f53911g) {
                    if (action != 0) {
                        if (action == 2) {
                            if (!this.f53918n && c()) {
                                return true;
                            }
                            if (v()) {
                                float y2 = motionEvent.getY();
                                float x4 = motionEvent.getX();
                                if (d.f53933a[getPullToRefreshScrollDirection().ordinal()] != 1) {
                                    f5 = y2 - this.f53908d;
                                    f6 = x4 - this.f53907c;
                                } else {
                                    f5 = x4 - this.f53907c;
                                    f6 = y2 - this.f53908d;
                                }
                                float abs = Math.abs(f5);
                                if (abs > this.f53906b && (!this.f53919o || abs > Math.abs(f6))) {
                                    if (this.f53913i.showHeaderLoadingLayout() && f5 >= 1.0f && x()) {
                                        this.f53908d = y2;
                                        this.f53907c = x4;
                                        this.f53911g = true;
                                        if (this.f53913i == Mode.BOTH) {
                                            this.f53914j = Mode.PULL_FROM_START;
                                        }
                                    } else if (this.f53913i.showFooterLoadingLayout() && f5 <= -1.0f && w()) {
                                        this.f53908d = y2;
                                        this.f53907c = x4;
                                        this.f53911g = true;
                                        if (this.f53913i == Mode.BOTH) {
                                            this.f53914j = Mode.PULL_FROM_END;
                                        }
                                    }
                                }
                            }
                        }
                    } else if (v()) {
                        float y4 = motionEvent.getY();
                        this.f53910f = y4;
                        this.f53908d = y4;
                        float x5 = motionEvent.getX();
                        this.f53909e = x5;
                        this.f53907c = x5;
                        this.f53911g = false;
                    }
                    return this.f53911g;
                }
                return true;
            }
            this.f53911g = false;
            return false;
        }
        return false;
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            setMode(Mode.mapIntToValue(bundle.getInt(H, 0)));
            this.f53914j = Mode.mapIntToValue(bundle.getInt(I, 0));
            this.f53918n = bundle.getBoolean(J, false);
            this.f53917m = bundle.getBoolean(K, true);
            super.onRestoreInstanceState(bundle.getParcelable(L));
            State mapIntToValue = State.mapIntToValue(bundle.getInt(G, 0));
            if (mapIntToValue == State.REFRESHING || mapIntToValue == State.MANUAL_REFRESHING) {
                H(mapIntToValue, true);
            }
            y(bundle);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        z(bundle);
        bundle.putInt(G, this.f53912h.getIntValue());
        bundle.putInt(H, this.f53913i.getIntValue());
        bundle.putInt(I, this.f53914j.getIntValue());
        bundle.putBoolean(J, this.f53918n);
        bundle.putBoolean(K, this.f53917m);
        bundle.putParcelable(L, super.onSaveInstanceState());
        return bundle;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i4, int i5, int i6, int i7) {
        String.format("onSizeChanged. W: %d, H: %d", Integer.valueOf(i4), Integer.valueOf(i5));
        super.onSizeChanged(i4, i5, i6, i7);
        F();
        G(i4, i5);
        post(new b());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002d, code lost:
        if (r0 != 3) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.a()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = r4.f53918n
            r2 = 1
            if (r0 != 0) goto L14
            boolean r0 = r4.c()
            if (r0 == 0) goto L14
            return r2
        L14:
            int r0 = r5.getAction()
            if (r0 != 0) goto L21
            int r0 = r5.getEdgeFlags()
            if (r0 == 0) goto L21
            return r1
        L21:
            int r0 = r5.getAction()
            if (r0 == 0) goto L74
            if (r0 == r2) goto L44
            r3 = 2
            if (r0 == r3) goto L30
            r5 = 3
            if (r0 == r5) goto L44
            goto L8b
        L30:
            boolean r0 = r4.f53911g
            if (r0 == 0) goto L8b
            float r0 = r5.getY()
            r4.f53908d = r0
            float r5 = r5.getX()
            r4.f53907c = r5
            r4.E()
            return r2
        L44:
            boolean r5 = r4.f53911g
            if (r5 == 0) goto L8b
            r4.f53911g = r1
            com.join.mgps.pulltorefresh.library.PullToRefreshBase$State r5 = r4.f53912h
            com.join.mgps.pulltorefresh.library.PullToRefreshBase$State r0 = com.join.mgps.pulltorefresh.library.PullToRefreshBase.State.RELEASE_TO_REFRESH
            if (r5 != r0) goto L62
            com.join.mgps.pulltorefresh.library.PullToRefreshBase$h<T extends android.view.View> r5 = r4.f53926v
            if (r5 != 0) goto L58
            com.join.mgps.pulltorefresh.library.PullToRefreshBase$g<T extends android.view.View> r5 = r4.f53927w
            if (r5 == 0) goto L62
        L58:
            com.join.mgps.pulltorefresh.library.PullToRefreshBase$State r5 = com.join.mgps.pulltorefresh.library.PullToRefreshBase.State.REFRESHING
            boolean[] r0 = new boolean[r2]
            r0[r1] = r2
            r4.H(r5, r0)
            return r2
        L62:
            boolean r5 = r4.c()
            if (r5 == 0) goto L6c
            r4.I(r1)
            return r2
        L6c:
            com.join.mgps.pulltorefresh.library.PullToRefreshBase$State r5 = com.join.mgps.pulltorefresh.library.PullToRefreshBase.State.RESET
            boolean[] r0 = new boolean[r1]
            r4.H(r5, r0)
            return r2
        L74:
            boolean r0 = r4.v()
            if (r0 == 0) goto L8b
            float r0 = r5.getY()
            r4.f53910f = r0
            r4.f53908d = r0
            float r5 = r5.getX()
            r4.f53909e = r5
            r4.f53907c = r5
            return r2
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.pulltorefresh.library.PullToRefreshBase.onTouchEvent(android.view.MotionEvent):boolean");
    }

    protected com.join.mgps.pulltorefresh.library.c p(boolean z4, boolean z5) {
        com.join.mgps.pulltorefresh.library.c cVar = new com.join.mgps.pulltorefresh.library.c();
        if (z4 && this.f53913i.showHeaderLoadingLayout()) {
            cVar.a(this.f53924t);
        }
        if (z5 && this.f53913i.showFooterLoadingLayout()) {
            cVar.a(this.f53925u);
        }
        return cVar;
    }

    protected abstract T q(Context context, AttributeSet attributeSet);

    protected final void r() {
        this.f53921q = false;
    }

    protected void s(TypedArray typedArray) {
    }

    public void setDisableScrollingWhileRefreshing(boolean z4) {
        setScrollingWhileRefreshingEnabled(!z4);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setFilterTouchEvents(boolean z4) {
        this.f53919o = z4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setHeaderScroll(int i4) {
        StringBuilder sb = new StringBuilder();
        sb.append("setHeaderScroll: ");
        sb.append(i4);
        int maximumPullScroll = getMaximumPullScroll();
        int min = Math.min(maximumPullScroll, Math.max(-maximumPullScroll, i4));
        if (this.f53921q) {
            if (min < 0) {
                this.f53924t.setVisibility(0);
            } else if (min > 0) {
                this.f53925u.setVisibility(0);
            } else {
                this.f53924t.setVisibility(4);
                this.f53925u.setVisibility(4);
            }
        }
        int i5 = d.f53933a[getPullToRefreshScrollDirection().ordinal()];
        if (i5 == 1) {
            scrollTo(min, 0);
        } else if (i5 != 2) {
        } else {
            scrollTo(0, min);
        }
    }

    public void setLastUpdatedLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setLastUpdatedLabel(charSequence);
    }

    public void setLoadingDrawable(Drawable drawable) {
        getLoadingLayoutProxy().setLoadingDrawable(drawable);
    }

    @Override // android.view.View
    public void setLongClickable(boolean z4) {
        getRefreshableView().setLongClickable(z4);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setMode(Mode mode) {
        if (mode != this.f53913i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting mode to: ");
            sb.append(mode);
            this.f53913i = mode;
            O();
        }
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public void setOnPullEventListener(f<T> fVar) {
        this.f53928x = fVar;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setOnRefreshListener(h<T> hVar) {
        this.f53926v = hVar;
        this.f53927w = null;
    }

    public void setPullLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setPullLabel(charSequence);
    }

    public final void setPullToRefreshEnabled(boolean z4) {
        setMode(z4 ? Mode.getDefault() : Mode.DISABLED);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setPullToRefreshOverScrollEnabled(boolean z4) {
        this.f53920p = z4;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setRefreshing() {
        setRefreshing(true);
    }

    public void setRefreshingLabel(CharSequence charSequence) {
        getLoadingLayoutProxy().setRefreshingLabel(charSequence);
    }

    public void setReleaseLabel(CharSequence charSequence) {
        setReleaseLabel(charSequence, Mode.BOTH);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public void setScrollAnimationInterpolator(Interpolator interpolator) {
        this.f53922r = interpolator;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setScrollingWhileRefreshingEnabled(boolean z4) {
        this.f53918n = z4;
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setShowViewWhileRefreshing(boolean z4) {
        this.f53917m = z4;
    }

    public final boolean u() {
        return !e();
    }

    protected abstract boolean w();

    protected abstract boolean x();

    protected void y(Bundle bundle) {
    }

    protected void z(Bundle bundle) {
    }

    public void setLoadingDrawable(Drawable drawable, Mode mode) {
        b(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setLoadingDrawable(drawable);
    }

    public void setPullLabel(CharSequence charSequence, Mode mode) {
        b(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setPullLabel(charSequence);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setRefreshing(boolean z4) {
        if (c()) {
            return;
        }
        H(State.MANUAL_REFRESHING, z4);
    }

    public void setRefreshingLabel(CharSequence charSequence, Mode mode) {
        b(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setRefreshingLabel(charSequence);
    }

    public void setReleaseLabel(CharSequence charSequence, Mode mode) {
        b(mode.showHeaderLoadingLayout(), mode.showFooterLoadingLayout()).setReleaseLabel(charSequence);
    }

    @Override // com.join.mgps.pulltorefresh.library.b
    public final void setOnRefreshListener(g<T> gVar) {
        this.f53927w = gVar;
        this.f53926v = null;
    }

    public PullToRefreshBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53911g = false;
        this.f53912h = State.RESET;
        this.f53913i = Mode.getDefault();
        this.f53917m = true;
        this.f53918n = false;
        this.f53919o = true;
        this.f53920p = true;
        this.f53921q = true;
        this.f53923s = AnimationStyle.getDefault();
        t(context, attributeSet);
    }

    public PullToRefreshBase(Context context, Mode mode) {
        super(context);
        this.f53911g = false;
        this.f53912h = State.RESET;
        this.f53913i = Mode.getDefault();
        this.f53917m = true;
        this.f53918n = false;
        this.f53919o = true;
        this.f53920p = true;
        this.f53921q = true;
        this.f53923s = AnimationStyle.getDefault();
        this.f53913i = mode;
        t(context, null);
    }

    public PullToRefreshBase(Context context, Mode mode, AnimationStyle animationStyle) {
        super(context);
        this.f53911g = false;
        this.f53912h = State.RESET;
        this.f53913i = Mode.getDefault();
        this.f53917m = true;
        this.f53918n = false;
        this.f53919o = true;
        this.f53920p = true;
        this.f53921q = true;
        this.f53923s = AnimationStyle.getDefault();
        this.f53913i = mode;
        this.f53923s = animationStyle;
        t(context, null);
    }
}
