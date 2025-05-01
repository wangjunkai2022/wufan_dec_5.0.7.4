package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.Checkable;
import android.widget.ListAdapter;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.EdgeEffectCompat;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.util.b;
import it.sephiroth.android.library.widget.AdapterView;
import java.util.ArrayList;
import java.util.List;
@TargetApi(11)
/* loaded from: classes6.dex */
public abstract class AbsHListView extends AdapterView<ListAdapter> implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnTouchModeChangeListener {
    private static final String P2 = "AbsListView";
    public static final int Q2 = 0;
    public static final int R2 = 1;
    public static final int S2 = 2;
    public static final int T2 = -1;
    public static final int U2 = 0;
    public static final int V2 = 1;
    public static final int W2 = 2;
    public static final int X2 = 3;
    public static final int Y2 = 4;
    public static final int Z2 = 5;

    /* renamed from: a3  reason: collision with root package name */
    public static final int f69315a3 = 6;

    /* renamed from: b3  reason: collision with root package name */
    public static final int f69316b3 = 0;

    /* renamed from: c3  reason: collision with root package name */
    public static final int f69317c3 = 1;

    /* renamed from: d3  reason: collision with root package name */
    public static final int f69318d3 = 2;

    /* renamed from: e3  reason: collision with root package name */
    public static final int f69319e3 = 3;

    /* renamed from: f3  reason: collision with root package name */
    public static final int f69320f3 = 4;

    /* renamed from: g3  reason: collision with root package name */
    public static final int f69321g3 = 5;

    /* renamed from: h3  reason: collision with root package name */
    public static final int f69322h3 = 6;

    /* renamed from: i3  reason: collision with root package name */
    protected static final int f69323i3 = 3;

    /* renamed from: j3  reason: collision with root package name */
    private static final int f69324j3 = 20;

    /* renamed from: k3  reason: collision with root package name */
    private static final int f69325k3 = -1;

    /* renamed from: l3  reason: collision with root package name */
    private static final int f69326l3 = 0;

    /* renamed from: m3  reason: collision with root package name */
    private static final int f69327m3 = 1;

    /* renamed from: n3  reason: collision with root package name */
    private static final int f69328n3 = -1;

    /* renamed from: o3  reason: collision with root package name */
    static final Interpolator f69329o3 = new LinearInterpolator();

    /* renamed from: p3  reason: collision with root package name */
    public static final int[] f69330p3 = {0};
    protected final l A1;
    private EdgeEffectCompat A2;
    int B1;
    private EdgeEffectCompat B2;
    int C1;
    private int C2;
    int D1;
    private int D2;
    int E1;
    private int E2;
    protected Rect F1;
    private boolean F2;
    protected int G1;
    private int G2;
    View H1;
    private int H2;
    View I1;
    private h I2;
    protected boolean J1;
    private int J2;
    protected boolean K1;
    private int K2;
    b.a L;
    protected int L1;
    protected boolean L2;
    protected int M;
    int M1;
    private int M2;
    public Object N;
    int N1;
    private SavedState N2;
    Object O;
    int O1;
    private float O2;
    int P;
    int P1;
    protected SparseArrayCompat<Boolean> Q;
    protected int Q1;
    LongSparseArray<Integer> R;
    int R1;
    protected int S;
    int S1;
    protected c T;
    private VelocityTracker T1;
    protected ListAdapter U;
    private g U1;
    boolean V;
    protected k V1;
    boolean W;
    protected int W1;
    protected boolean X1;
    boolean Y1;
    boolean Z1;

    /* renamed from: a2  reason: collision with root package name */
    private i f69331a2;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f69332b2;

    /* renamed from: c2  reason: collision with root package name */
    private Rect f69333c2;

    /* renamed from: d2  reason: collision with root package name */
    protected int f69334d2;

    /* renamed from: e2  reason: collision with root package name */
    private ContextMenu.ContextMenuInfo f69335e2;

    /* renamed from: f2  reason: collision with root package name */
    protected int f69336f2;

    /* renamed from: g2  reason: collision with root package name */
    private int f69337g2;

    /* renamed from: h2  reason: collision with root package name */
    private e f69338h2;

    /* renamed from: i2  reason: collision with root package name */
    private Runnable f69339i2;

    /* renamed from: j2  reason: collision with root package name */
    private d f69340j2;

    /* renamed from: k2  reason: collision with root package name */
    private j f69341k2;

    /* renamed from: l2  reason: collision with root package name */
    private Runnable f69342l2;

    /* renamed from: m2  reason: collision with root package name */
    private int f69343m2;

    /* renamed from: n2  reason: collision with root package name */
    private int f69344n2;

    /* renamed from: o2  reason: collision with root package name */
    private boolean f69345o2;

    /* renamed from: p0  reason: collision with root package name */
    Drawable f69346p0;

    /* renamed from: p1  reason: collision with root package name */
    int f69347p1;

    /* renamed from: p2  reason: collision with root package name */
    private int f69348p2;

    /* renamed from: q2  reason: collision with root package name */
    private int f69349q2;

    /* renamed from: r2  reason: collision with root package name */
    private Runnable f69350r2;

    /* renamed from: s2  reason: collision with root package name */
    protected Runnable f69351s2;

    /* renamed from: t2  reason: collision with root package name */
    private int f69352t2;

    /* renamed from: u2  reason: collision with root package name */
    private int f69353u2;

    /* renamed from: v1  reason: collision with root package name */
    protected Rect f69354v1;
    private float v2;

    /* renamed from: w2  reason: collision with root package name */
    protected final boolean[] f69355w2;

    /* renamed from: x2  reason: collision with root package name */
    private int f69356x2;
    int y2;

    /* renamed from: z2  reason: collision with root package name */
    int f69357z2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        long f69363b;

        /* renamed from: c  reason: collision with root package name */
        long f69364c;

        /* renamed from: d  reason: collision with root package name */
        int f69365d;

        /* renamed from: e  reason: collision with root package name */
        int f69366e;

        /* renamed from: f  reason: collision with root package name */
        int f69367f;

        /* renamed from: g  reason: collision with root package name */
        String f69368g;

        /* renamed from: h  reason: collision with root package name */
        boolean f69369h;

        /* renamed from: i  reason: collision with root package name */
        int f69370i;

        /* renamed from: j  reason: collision with root package name */
        SparseArrayCompat<Boolean> f69371j;

        /* renamed from: k  reason: collision with root package name */
        LongSparseArray<Integer> f69372k;

        /* loaded from: classes6.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        private SparseArrayCompat<Boolean> a(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt < 0) {
                return null;
            }
            SparseArrayCompat<Boolean> sparseArrayCompat = new SparseArrayCompat<>(readInt);
            b(sparseArrayCompat, parcel, readInt);
            return sparseArrayCompat;
        }

        private void b(SparseArrayCompat<Boolean> sparseArrayCompat, Parcel parcel, int i4) {
            while (i4 > 0) {
                int readInt = parcel.readInt();
                boolean z4 = true;
                if (parcel.readByte() != 1) {
                    z4 = false;
                }
                sparseArrayCompat.append(readInt, Boolean.valueOf(z4));
                i4--;
            }
        }

        private LongSparseArray<Integer> c(Parcel parcel) {
            int readInt = parcel.readInt();
            if (readInt <= 0) {
                return null;
            }
            LongSparseArray<Integer> longSparseArray = new LongSparseArray<>(readInt);
            d(longSparseArray, parcel, readInt);
            return longSparseArray;
        }

        private void d(LongSparseArray<Integer> longSparseArray, Parcel parcel, int i4) {
            while (i4 > 0) {
                longSparseArray.put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
                i4--;
            }
        }

        private void e(SparseArrayCompat<Boolean> sparseArrayCompat, Parcel parcel) {
            if (sparseArrayCompat == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = sparseArrayCompat.size();
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                parcel.writeInt(sparseArrayCompat.keyAt(i4));
                parcel.writeByte(sparseArrayCompat.valueAt(i4).booleanValue() ? (byte) 1 : (byte) 0);
            }
        }

        private void f(LongSparseArray<Integer> longSparseArray, Parcel parcel) {
            int size = longSparseArray != null ? longSparseArray.size() : 0;
            parcel.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                parcel.writeLong(longSparseArray.keyAt(i4));
                parcel.writeInt(longSparseArray.valueAt(i4).intValue());
            }
        }

        public String toString() {
            return "AbsListView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.f69363b + " firstId=" + this.f69364c + " viewLeft=" + this.f69365d + " position=" + this.f69366e + " width=" + this.f69367f + " filter=" + this.f69368g + " checkState=" + this.f69371j + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeLong(this.f69363b);
            parcel.writeLong(this.f69364c);
            parcel.writeInt(this.f69365d);
            parcel.writeInt(this.f69366e);
            parcel.writeInt(this.f69367f);
            parcel.writeString(this.f69368g);
            parcel.writeByte(this.f69369h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f69370i);
            e(this.f69371j, parcel);
            f(this.f69372k, parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f69363b = parcel.readLong();
            this.f69364c = parcel.readLong();
            this.f69365d = parcel.readInt();
            this.f69366e = parcel.readInt();
            this.f69367f = parcel.readInt();
            this.f69368g = parcel.readString();
            this.f69369h = parcel.readByte() != 0;
            this.f69370i = parcel.readInt();
            this.f69371j = a(parcel);
            this.f69372k = c(parcel);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f69373b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f69374c;

        a(View view, j jVar) {
            this.f69373b = view;
            this.f69374c = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsHListView.this.Q1 = -1;
            this.f69373b.setPressed(false);
            AbsHListView.this.setPressed(false);
            if (AbsHListView.this.f69439n) {
                return;
            }
            this.f69374c.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsHListView absHListView = AbsHListView.this;
            if (absHListView.J1) {
                absHListView.K1 = false;
                absHListView.J1 = false;
                absHListView.setChildrenDrawnWithCacheEnabled(false);
                if ((AbsHListView.this.getPersistentDrawingCache() & 2) == 0) {
                    AbsHListView.this.setChildrenDrawingCacheEnabled(false);
                }
                if (AbsHListView.this.isAlwaysDrawnWithCacheEnabled()) {
                    return;
                }
                AbsHListView.this.invalidate();
            }
        }
    }

    /* loaded from: classes6.dex */
    public class c extends AdapterView<ListAdapter>.c {
        public c() {
            super();
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.c
        public /* bridge */ /* synthetic */ void a() {
            super.a();
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.c, android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
        }

        @Override // it.sephiroth.android.library.widget.AdapterView.c, android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
        }
    }

    /* loaded from: classes6.dex */
    private class d extends o implements Runnable {
        private d() {
            super(AbsHListView.this, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsHListView absHListView;
            int i4;
            boolean z4;
            if (!AbsHListView.this.isPressed() || (i4 = (absHListView = AbsHListView.this).f69442q) < 0) {
                return;
            }
            View childAt = absHListView.getChildAt(i4 - absHListView.f69427b);
            AbsHListView absHListView2 = AbsHListView.this;
            if (!absHListView2.f69439n) {
                if (b()) {
                    AbsHListView absHListView3 = AbsHListView.this;
                    z4 = absHListView3.u0(childAt, absHListView3.f69442q, absHListView3.f69443r);
                } else {
                    z4 = false;
                }
                if (z4) {
                    AbsHListView.this.setPressed(false);
                    childAt.setPressed(false);
                    return;
                }
                return;
            }
            absHListView2.setPressed(false);
            if (childAt != null) {
                childAt.setPressed(false);
            }
        }

        /* synthetic */ d(AbsHListView absHListView, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class e extends o implements Runnable {
        private e() {
            super(AbsHListView.this, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                it.sephiroth.android.library.widget.AbsHListView r0 = it.sephiroth.android.library.widget.AbsHListView.this
                int r1 = r0.L1
                int r2 = r0.f69427b
                int r1 = r1 - r2
                android.view.View r0 = r0.getChildAt(r1)
                if (r0 == 0) goto L3d
                it.sephiroth.android.library.widget.AbsHListView r1 = it.sephiroth.android.library.widget.AbsHListView.this
                int r2 = r1.L1
                android.widget.ListAdapter r1 = r1.U
                long r3 = r1.getItemId(r2)
                boolean r1 = r7.b()
                r5 = 0
                if (r1 == 0) goto L29
                it.sephiroth.android.library.widget.AbsHListView r1 = it.sephiroth.android.library.widget.AbsHListView.this
                boolean r6 = r1.f69439n
                if (r6 != 0) goto L29
                boolean r1 = r1.u0(r0, r2, r3)
                goto L2a
            L29:
                r1 = 0
            L2a:
                if (r1 == 0) goto L38
                it.sephiroth.android.library.widget.AbsHListView r1 = it.sephiroth.android.library.widget.AbsHListView.this
                r2 = -1
                r1.Q1 = r2
                r1.setPressed(r5)
                r0.setPressed(r5)
                goto L3d
            L38:
                it.sephiroth.android.library.widget.AbsHListView r0 = it.sephiroth.android.library.widget.AbsHListView.this
                r1 = 2
                r0.Q1 = r1
            L3d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.AbsHListView.e.run():void");
        }

        /* synthetic */ e(AbsHListView absHListView, a aVar) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Drawable current;
            AbsHListView absHListView = AbsHListView.this;
            if (absHListView.Q1 == 0) {
                absHListView.Q1 = 1;
                View childAt = absHListView.getChildAt(absHListView.L1 - absHListView.f69427b);
                if (childAt == null || childAt.hasFocusable()) {
                    return;
                }
                AbsHListView absHListView2 = AbsHListView.this;
                absHListView2.S = 0;
                if (!absHListView2.f69439n) {
                    childAt.setPressed(true);
                    AbsHListView.this.setPressed(true);
                    AbsHListView.this.p0();
                    AbsHListView absHListView3 = AbsHListView.this;
                    absHListView3.y0(absHListView3.L1, childAt);
                    AbsHListView.this.refreshDrawableState();
                    int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    boolean isLongClickable = AbsHListView.this.isLongClickable();
                    Drawable drawable = AbsHListView.this.f69346p0;
                    if (drawable != null && (current = drawable.getCurrent()) != null && (current instanceof TransitionDrawable)) {
                        if (isLongClickable) {
                            ((TransitionDrawable) current).startTransition(longPressTimeout);
                        } else {
                            ((TransitionDrawable) current).resetTransition();
                        }
                    }
                    if (isLongClickable) {
                        if (AbsHListView.this.f69338h2 == null) {
                            AbsHListView absHListView4 = AbsHListView.this;
                            absHListView4.f69338h2 = new e(absHListView4, null);
                        }
                        AbsHListView.this.f69338h2.a();
                        AbsHListView absHListView5 = AbsHListView.this;
                        absHListView5.postDelayed(absHListView5.f69338h2, longPressTimeout);
                        return;
                    }
                    AbsHListView.this.Q1 = 2;
                    return;
                }
                absHListView2.Q1 = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class g implements Runnable {

        /* renamed from: f  reason: collision with root package name */
        private static final int f69381f = 40;

        /* renamed from: b  reason: collision with root package name */
        private final it.sephiroth.android.library.widget.c f69382b;

        /* renamed from: c  reason: collision with root package name */
        private int f69383c;

        /* renamed from: d  reason: collision with root package name */
        private final Runnable f69384d = new a();

        /* loaded from: classes6.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                int i4 = AbsHListView.this.f69356x2;
                VelocityTracker velocityTracker = AbsHListView.this.T1;
                it.sephiroth.android.library.widget.c cVar = g.this.f69382b;
                if (velocityTracker == null || i4 == -1) {
                    return;
                }
                velocityTracker.computeCurrentVelocity(1000, AbsHListView.this.f69353u2);
                float f5 = -velocityTracker.getXVelocity(i4);
                if (Math.abs(f5) >= AbsHListView.this.f69352t2 && cVar.q(f5, 0.0f)) {
                    AbsHListView.this.postDelayed(this, 40L);
                    return;
                }
                g.this.c();
                AbsHListView absHListView = AbsHListView.this;
                absHListView.Q1 = 3;
                absHListView.C0(1);
            }
        }

        g() {
            this.f69382b = new it.sephiroth.android.library.widget.c(AbsHListView.this.getContext());
        }

        void b(int i4) {
            this.f69382b.r(AbsHListView.this.getScrollX(), 0, AbsHListView.this.f69357z2);
            int overScrollMode = AbsHListView.this.getOverScrollMode();
            if (overScrollMode != 0 && (overScrollMode != 1 || AbsHListView.this.T())) {
                AbsHListView absHListView = AbsHListView.this;
                absHListView.Q1 = -1;
                k kVar = absHListView.V1;
                if (kVar != null) {
                    kVar.f();
                }
            } else {
                AbsHListView.this.Q1 = 6;
                int g4 = (int) this.f69382b.g();
                if (i4 > 0) {
                    AbsHListView.this.A2.onAbsorb(g4);
                } else {
                    AbsHListView.this.B2.onAbsorb(g4);
                }
            }
            AbsHListView.this.invalidate();
            AbsHListView.this.L.b(this);
        }

        void c() {
            AbsHListView absHListView = AbsHListView.this;
            absHListView.Q1 = -1;
            absHListView.removeCallbacks(this);
            AbsHListView.this.removeCallbacks(this.f69384d);
            AbsHListView.this.C0(0);
            AbsHListView.this.R();
            this.f69382b.a();
            AbsHListView.this.overScrollBy(0, 0, 0, 0, 0, 0, 0, 0, false);
        }

        void d() {
            AbsHListView.this.postDelayed(this.f69384d, 40L);
        }

        void e(int i4) {
            int i5 = i4 < 0 ? Integer.MAX_VALUE : 0;
            this.f69383c = i5;
            this.f69382b.w(null);
            this.f69382b.d(i5, 0, i4, 0, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            AbsHListView absHListView = AbsHListView.this;
            absHListView.Q1 = 4;
            absHListView.L.b(this);
        }

        void f(int i4) {
            this.f69382b.w(null);
            this.f69382b.e(AbsHListView.this.getScrollX(), 0, i4, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0, AbsHListView.this.getWidth(), 0);
            AbsHListView absHListView = AbsHListView.this;
            absHListView.Q1 = 6;
            absHListView.invalidate();
            AbsHListView.this.L.b(this);
        }

        void g(int i4, int i5, boolean z4) {
            int i6 = i4 < 0 ? Integer.MAX_VALUE : 0;
            this.f69383c = i6;
            this.f69382b.w(z4 ? AbsHListView.f69329o3 : null);
            this.f69382b.z(i6, 0, i4, 0, i5);
            AbsHListView absHListView = AbsHListView.this;
            absHListView.Q1 = 4;
            absHListView.L.b(this);
        }

        void h() {
            if (this.f69382b.x(AbsHListView.this.getScrollX(), 0, 0, 0, 0, 0)) {
                AbsHListView absHListView = AbsHListView.this;
                absHListView.Q1 = 6;
                absHListView.invalidate();
                AbsHListView.this.L.b(this);
                return;
            }
            AbsHListView absHListView2 = AbsHListView.this;
            absHListView2.Q1 = -1;
            absHListView2.C0(0);
        }

        @Override // java.lang.Runnable
        public void run() {
            int max;
            int i4 = AbsHListView.this.Q1;
            boolean z4 = false;
            if (i4 != 3) {
                if (i4 != 4) {
                    if (i4 != 6) {
                        c();
                        return;
                    }
                    it.sephiroth.android.library.widget.c cVar = this.f69382b;
                    if (cVar.b()) {
                        int scrollX = AbsHListView.this.getScrollX();
                        int h4 = cVar.h();
                        AbsHListView absHListView = AbsHListView.this;
                        if (!absHListView.overScrollBy(h4 - scrollX, 0, scrollX, 0, 0, 0, absHListView.f69357z2, 0, false)) {
                            AbsHListView.this.invalidate();
                            AbsHListView.this.L.b(this);
                            return;
                        }
                        boolean z5 = scrollX <= 0 && h4 > 0;
                        if (scrollX >= 0 && h4 < 0) {
                            z4 = true;
                        }
                        if (!z5 && !z4) {
                            h();
                            return;
                        }
                        int g4 = (int) cVar.g();
                        if (z4) {
                            g4 = -g4;
                        }
                        cVar.a();
                        e(g4);
                        return;
                    }
                    c();
                    return;
                }
            } else if (this.f69382b.o()) {
                return;
            }
            AbsHListView absHListView2 = AbsHListView.this;
            if (absHListView2.f69439n) {
                absHListView2.p0();
            }
            AbsHListView absHListView3 = AbsHListView.this;
            if (absHListView3.f69445t != 0 && absHListView3.getChildCount() != 0) {
                it.sephiroth.android.library.widget.c cVar2 = this.f69382b;
                boolean b5 = cVar2.b();
                int h5 = cVar2.h();
                int i5 = this.f69383c - h5;
                if (i5 > 0) {
                    AbsHListView absHListView4 = AbsHListView.this;
                    absHListView4.L1 = absHListView4.f69427b;
                    AbsHListView.this.M1 = absHListView4.getChildAt(0).getLeft();
                    max = Math.min(((AbsHListView.this.getWidth() - AbsHListView.this.getPaddingRight()) - AbsHListView.this.getPaddingLeft()) - 1, i5);
                } else {
                    int childCount = AbsHListView.this.getChildCount() - 1;
                    AbsHListView absHListView5 = AbsHListView.this;
                    absHListView5.L1 = absHListView5.f69427b + childCount;
                    AbsHListView.this.M1 = absHListView5.getChildAt(childCount).getLeft();
                    max = Math.max(-(((AbsHListView.this.getWidth() - AbsHListView.this.getPaddingRight()) - AbsHListView.this.getPaddingLeft()) - 1), i5);
                }
                AbsHListView absHListView6 = AbsHListView.this;
                View childAt = absHListView6.getChildAt(absHListView6.L1 - absHListView6.f69427b);
                int left = childAt != null ? childAt.getLeft() : 0;
                boolean V0 = AbsHListView.this.V0(max, max);
                if (V0 && max != 0) {
                    z4 = true;
                }
                if (z4) {
                    if (childAt != null) {
                        AbsHListView absHListView7 = AbsHListView.this;
                        absHListView7.overScrollBy(-(max - (childAt.getLeft() - left)), 0, absHListView7.getScrollX(), 0, 0, 0, AbsHListView.this.f69357z2, 0, false);
                    }
                    if (b5) {
                        b(max);
                        return;
                    }
                    return;
                } else if (b5 && !z4) {
                    if (V0) {
                        AbsHListView.this.invalidate();
                    }
                    this.f69383c = h5;
                    AbsHListView.this.L.b(this);
                    return;
                } else {
                    c();
                    return;
                }
            }
            c();
        }
    }

    @TargetApi(14)
    /* loaded from: classes6.dex */
    class h extends AccessibilityDelegateCompat {
        h() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int k4 = AbsHListView.this.k(view);
            ListAdapter adapter = AbsHListView.this.getAdapter();
            if (k4 == -1 || adapter == null || !AbsHListView.this.isEnabled() || !adapter.isEnabled(k4)) {
                return;
            }
            if (k4 == AbsHListView.this.getSelectedItemPosition()) {
                accessibilityNodeInfoCompat.setSelected(true);
                accessibilityNodeInfoCompat.addAction(8);
            } else {
                accessibilityNodeInfoCompat.addAction(4);
            }
            if (AbsHListView.this.isClickable()) {
                accessibilityNodeInfoCompat.addAction(16);
                accessibilityNodeInfoCompat.setClickable(true);
            }
            if (AbsHListView.this.isLongClickable()) {
                accessibilityNodeInfoCompat.addAction(32);
                accessibilityNodeInfoCompat.setLongClickable(true);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            if (super.performAccessibilityAction(view, i4, bundle)) {
                return true;
            }
            int k4 = AbsHListView.this.k(view);
            ListAdapter adapter = AbsHListView.this.getAdapter();
            if (k4 != -1 && adapter != null && AbsHListView.this.isEnabled() && adapter.isEnabled(k4)) {
                long j4 = AbsHListView.this.j(k4);
                if (i4 != 4) {
                    if (i4 == 8) {
                        if (AbsHListView.this.getSelectedItemPosition() == k4) {
                            AbsHListView.this.setSelection(-1);
                            return true;
                        }
                        return false;
                    } else if (i4 != 16) {
                        if (i4 == 32 && AbsHListView.this.isLongClickable()) {
                            return AbsHListView.this.u0(view, k4, j4);
                        }
                        return false;
                    } else if (AbsHListView.this.isClickable()) {
                        return AbsHListView.this.q(view, k4, j4);
                    } else {
                        return false;
                    }
                } else if (AbsHListView.this.getSelectedItemPosition() != k4) {
                    AbsHListView.this.setSelection(k4);
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes6.dex */
    public interface i {

        /* renamed from: a  reason: collision with root package name */
        public static final int f69388a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f69389b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f69390c = 2;

        void a(AbsHListView absHListView, int i4, int i5, int i6);

        void b(AbsHListView absHListView, int i4);
    }

    /* loaded from: classes6.dex */
    private class j extends o implements Runnable {

        /* renamed from: d  reason: collision with root package name */
        int f69391d;

        private j() {
            super(AbsHListView.this, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            AbsHListView absHListView = AbsHListView.this;
            if (absHListView.f69439n) {
                return;
            }
            ListAdapter listAdapter = absHListView.U;
            int i4 = this.f69391d;
            if (listAdapter == null || absHListView.f69445t <= 0 || i4 == -1 || i4 >= listAdapter.getCount() || !b()) {
                return;
            }
            AbsHListView absHListView2 = AbsHListView.this;
            View childAt = absHListView2.getChildAt(i4 - absHListView2.f69427b);
            if (childAt != null) {
                AbsHListView.this.q(childAt, i4, listAdapter.getItemId(i4));
            }
        }

        /* synthetic */ j(AbsHListView absHListView, a aVar) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public class k implements Runnable {

        /* renamed from: j  reason: collision with root package name */
        private static final int f69393j = 200;

        /* renamed from: k  reason: collision with root package name */
        private static final int f69394k = 1;

        /* renamed from: l  reason: collision with root package name */
        private static final int f69395l = 2;

        /* renamed from: m  reason: collision with root package name */
        private static final int f69396m = 3;

        /* renamed from: n  reason: collision with root package name */
        private static final int f69397n = 4;

        /* renamed from: o  reason: collision with root package name */
        private static final int f69398o = 5;

        /* renamed from: b  reason: collision with root package name */
        private int f69399b;

        /* renamed from: c  reason: collision with root package name */
        private int f69400c;

        /* renamed from: d  reason: collision with root package name */
        private int f69401d;

        /* renamed from: e  reason: collision with root package name */
        private int f69402e;

        /* renamed from: f  reason: collision with root package name */
        private int f69403f;

        /* renamed from: g  reason: collision with root package name */
        private final int f69404g;

        /* renamed from: h  reason: collision with root package name */
        private int f69405h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f69407b;

            a(int i4) {
                this.f69407b = i4;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.b(this.f69407b);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f69409b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f69410c;

            b(int i4, int i5) {
                this.f69409b = i4;
                this.f69410c = i5;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.c(this.f69409b, this.f69410c);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public class c implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f69412b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f69413c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f69414d;

            c(int i4, int i5, int i6) {
                this.f69412b = i4;
                this.f69413c = i5;
                this.f69414d = i6;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.e(this.f69412b, this.f69413c, this.f69414d);
            }
        }

        k() {
            this.f69404g = ViewConfiguration.get(AbsHListView.this.getContext()).getScaledFadingEdgeLength();
        }

        void a(int i4, int i5, int i6) {
            AbsHListView absHListView = AbsHListView.this;
            int i7 = absHListView.f69427b;
            int childCount = (absHListView.getChildCount() + i7) - 1;
            AbsHListView absHListView2 = AbsHListView.this;
            int i8 = absHListView2.F1.left;
            int width = absHListView2.getWidth() - AbsHListView.this.F1.right;
            if (i4 < i7 || i4 > childCount) {
                StringBuilder sb = new StringBuilder();
                sb.append("scrollToVisible called with targetPos ");
                sb.append(i4);
                sb.append(" not visible [");
                sb.append(i7);
                sb.append(", ");
                sb.append(childCount);
                sb.append("]");
            }
            i5 = (i5 < i7 || i5 > childCount) ? -1 : -1;
            View childAt = AbsHListView.this.getChildAt(i4 - i7);
            int left = childAt.getLeft();
            int right = childAt.getRight();
            int i9 = right > width ? right - width : 0;
            if (left < i8) {
                i9 = left - i8;
            }
            if (i9 == 0) {
                return;
            }
            if (i5 >= 0) {
                View childAt2 = AbsHListView.this.getChildAt(i5 - i7);
                int left2 = childAt2.getLeft();
                int right2 = childAt2.getRight();
                int abs = Math.abs(i9);
                if (i9 < 0 && right2 + abs > width) {
                    i9 = Math.max(0, right2 - width);
                } else if (i9 > 0 && left2 - abs < i8) {
                    i9 = Math.min(0, left2 - i8);
                }
            }
            AbsHListView.this.M0(i9, i6);
        }

        void b(int i4) {
            int i5;
            f();
            AbsHListView absHListView = AbsHListView.this;
            if (absHListView.f69439n) {
                absHListView.f69351s2 = new a(i4);
                return;
            }
            int childCount = absHListView.getChildCount();
            if (childCount == 0) {
                return;
            }
            AbsHListView absHListView2 = AbsHListView.this;
            int i6 = absHListView2.f69427b;
            int i7 = (childCount + i6) - 1;
            int max = Math.max(0, Math.min(absHListView2.getCount() - 1, i4));
            if (max < i6) {
                i5 = (i6 - max) + 1;
                this.f69399b = 2;
            } else if (max > i7) {
                i5 = (max - i7) + 1;
                this.f69399b = 1;
            } else {
                a(max, -1, 200);
                return;
            }
            if (i5 > 0) {
                this.f69403f = 200 / i5;
            } else {
                this.f69403f = 200;
            }
            this.f69400c = max;
            this.f69401d = -1;
            this.f69402e = -1;
            AbsHListView.this.L.b(this);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0064  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        void c(int r7, int r8) {
            /*
                r6 = this;
                r6.f()
                r0 = -1
                if (r8 != r0) goto La
                r6.b(r7)
                return
            La:
                it.sephiroth.android.library.widget.AbsHListView r1 = it.sephiroth.android.library.widget.AbsHListView.this
                boolean r2 = r1.f69439n
                if (r2 == 0) goto L18
                it.sephiroth.android.library.widget.AbsHListView$k$b r0 = new it.sephiroth.android.library.widget.AbsHListView$k$b
                r0.<init>(r7, r8)
                r1.f69351s2 = r0
                return
            L18:
                int r1 = r1.getChildCount()
                if (r1 != 0) goto L1f
                return
            L1f:
                it.sephiroth.android.library.widget.AbsHListView r2 = it.sephiroth.android.library.widget.AbsHListView.this
                int r3 = r2.f69427b
                int r1 = r1 + r3
                r4 = 1
                int r1 = r1 - r4
                r5 = 0
                int r2 = r2.getCount()
                int r2 = r2 - r4
                int r7 = java.lang.Math.min(r2, r7)
                int r7 = java.lang.Math.max(r5, r7)
                r2 = 200(0xc8, float:2.8E-43)
                if (r7 >= r3) goto L4a
                int r1 = r1 - r8
                if (r1 >= r4) goto L3c
                return
            L3c:
                int r3 = r3 - r7
                int r3 = r3 + r4
                int r1 = r1 - r4
                if (r1 >= r3) goto L46
                r3 = 4
                r6.f69399b = r3
            L44:
                r3 = r1
                goto L5e
            L46:
                r1 = 2
                r6.f69399b = r1
                goto L5e
            L4a:
                if (r7 <= r1) goto L74
                int r3 = r8 - r3
                if (r3 >= r4) goto L51
                return
            L51:
                int r1 = r7 - r1
                int r1 = r1 + r4
                int r3 = r3 - r4
                if (r3 >= r1) goto L5b
                r1 = 3
                r6.f69399b = r1
                goto L5e
            L5b:
                r6.f69399b = r4
                goto L44
            L5e:
                if (r3 <= 0) goto L64
                int r2 = r2 / r3
                r6.f69403f = r2
                goto L66
            L64:
                r6.f69403f = r2
            L66:
                r6.f69400c = r7
                r6.f69401d = r8
                r6.f69402e = r0
                it.sephiroth.android.library.widget.AbsHListView r7 = it.sephiroth.android.library.widget.AbsHListView.this
                it.sephiroth.android.library.util.b$a r7 = r7.L
                r7.b(r6)
                return
            L74:
                r6.a(r7, r8, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.AbsHListView.k.c(int, int):void");
        }

        void d(int i4, int i5) {
            e(i4, i5, 200);
        }

        void e(int i4, int i5, int i6) {
            int i7;
            f();
            AbsHListView absHListView = AbsHListView.this;
            if (absHListView.f69439n) {
                absHListView.f69351s2 = new c(i4, i5, i6);
                return;
            }
            int childCount = absHListView.getChildCount();
            if (childCount == 0) {
                return;
            }
            int paddingLeft = i5 + AbsHListView.this.getPaddingLeft();
            int max = Math.max(0, Math.min(AbsHListView.this.getCount() - 1, i4));
            this.f69400c = max;
            this.f69405h = paddingLeft;
            this.f69401d = -1;
            this.f69402e = -1;
            this.f69399b = 5;
            AbsHListView absHListView2 = AbsHListView.this;
            int i8 = absHListView2.f69427b;
            int i9 = (i8 + childCount) - 1;
            if (max < i8) {
                i7 = i8 - max;
            } else if (max <= i9) {
                AbsHListView.this.N0(absHListView2.getChildAt(max - i8).getLeft() - paddingLeft, i6, false);
                return;
            } else {
                i7 = max - i9;
            }
            float f5 = i7 / childCount;
            if (f5 >= 1.0f) {
                i6 = (int) (i6 / f5);
            }
            this.f69403f = i6;
            this.f69402e = -1;
            absHListView2.L.b(this);
        }

        public void f() {
            AbsHListView.this.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            int width = AbsHListView.this.getWidth();
            AbsHListView absHListView = AbsHListView.this;
            int i4 = absHListView.f69427b;
            int i5 = this.f69399b;
            if (i5 == 1) {
                int childCount = absHListView.getChildCount() - 1;
                int i6 = i4 + childCount;
                if (childCount < 0) {
                    return;
                }
                if (i6 == this.f69402e) {
                    AbsHListView.this.L.b(this);
                    return;
                }
                View childAt = AbsHListView.this.getChildAt(childCount);
                int width2 = childAt.getWidth();
                int left = width - childAt.getLeft();
                AbsHListView absHListView2 = AbsHListView.this;
                int i7 = absHListView2.f69445t - 1;
                int i8 = absHListView2.F1.right;
                if (i6 < i7) {
                    i8 = Math.max(i8, this.f69404g);
                }
                AbsHListView.this.N0((width2 - left) + i8, this.f69403f, true);
                this.f69402e = i6;
                if (i6 < this.f69400c) {
                    AbsHListView.this.L.b(this);
                    return;
                }
                return;
            }
            int i9 = 0;
            if (i5 == 2) {
                if (i4 == this.f69402e) {
                    absHListView.L.b(this);
                    return;
                }
                View childAt2 = absHListView.getChildAt(0);
                if (childAt2 == null) {
                    return;
                }
                AbsHListView.this.N0(childAt2.getLeft() - (i4 > 0 ? Math.max(this.f69404g, AbsHListView.this.F1.left) : AbsHListView.this.F1.left), this.f69403f, true);
                this.f69402e = i4;
                if (i4 > this.f69400c) {
                    AbsHListView.this.L.b(this);
                }
            } else if (i5 == 3) {
                int childCount2 = absHListView.getChildCount();
                if (i4 == this.f69401d || childCount2 <= 1) {
                    return;
                }
                int i10 = childCount2 + i4;
                AbsHListView absHListView3 = AbsHListView.this;
                if (i10 >= absHListView3.f69445t) {
                    return;
                }
                int i11 = i4 + 1;
                if (i11 == this.f69402e) {
                    absHListView3.L.b(this);
                    return;
                }
                View childAt3 = absHListView3.getChildAt(1);
                int width3 = childAt3.getWidth();
                int left2 = childAt3.getLeft();
                int max = Math.max(AbsHListView.this.F1.right, this.f69404g);
                if (i11 < this.f69401d) {
                    AbsHListView.this.N0(Math.max(0, (width3 + left2) - max), this.f69403f, true);
                    this.f69402e = i11;
                    AbsHListView.this.L.b(this);
                } else if (left2 > max) {
                    AbsHListView.this.N0(left2 - max, this.f69403f, true);
                }
            } else if (i5 == 4) {
                int childCount3 = absHListView.getChildCount() - 2;
                if (childCount3 < 0) {
                    return;
                }
                int i12 = i4 + childCount3;
                if (i12 == this.f69402e) {
                    AbsHListView.this.L.b(this);
                    return;
                }
                View childAt4 = AbsHListView.this.getChildAt(childCount3);
                int width4 = childAt4.getWidth();
                int left3 = childAt4.getLeft();
                int i13 = width - left3;
                int max2 = Math.max(AbsHListView.this.F1.left, this.f69404g);
                this.f69402e = i12;
                if (i12 > this.f69401d) {
                    AbsHListView.this.N0(-(i13 - max2), this.f69403f, true);
                    AbsHListView.this.L.b(this);
                    return;
                }
                int i14 = width - max2;
                int i15 = left3 + width4;
                if (i14 > i15) {
                    AbsHListView.this.N0(-(i14 - i15), this.f69403f, true);
                }
            } else if (i5 != 5) {
            } else {
                if (this.f69402e == i4) {
                    absHListView.L.b(this);
                    return;
                }
                this.f69402e = i4;
                int childCount4 = absHListView.getChildCount();
                int i16 = this.f69400c;
                int i17 = (i4 + childCount4) - 1;
                if (i16 < i4) {
                    i9 = (i4 - i16) + 1;
                } else if (i16 > i17) {
                    i9 = i16 - i17;
                }
                float min = Math.min(Math.abs(i9 / childCount4), 1.0f);
                if (i16 < i4) {
                    AbsHListView.this.N0((int) ((-AbsHListView.this.getWidth()) * min), (int) (this.f69403f * min), true);
                    AbsHListView.this.L.b(this);
                } else if (i16 > i17) {
                    AbsHListView.this.N0((int) (AbsHListView.this.getWidth() * min), (int) (this.f69403f * min), true);
                    AbsHListView.this.L.b(this);
                } else {
                    int left4 = AbsHListView.this.getChildAt(i16 - i4).getLeft() - this.f69405h;
                    AbsHListView.this.N0(left4, (int) (this.f69403f * (Math.abs(left4) / AbsHListView.this.getWidth())), true);
                }
            }
        }
    }

    /* loaded from: classes6.dex */
    public class l {

        /* renamed from: a  reason: collision with root package name */
        private m f69416a;

        /* renamed from: b  reason: collision with root package name */
        private int f69417b;

        /* renamed from: c  reason: collision with root package name */
        private View[] f69418c = new View[0];

        /* renamed from: d  reason: collision with root package name */
        private ArrayList<View>[] f69419d;

        /* renamed from: e  reason: collision with root package name */
        private int f69420e;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<View> f69421f;

        /* renamed from: g  reason: collision with root package name */
        private ArrayList<View> f69422g;

        /* renamed from: h  reason: collision with root package name */
        private SparseArrayCompat<View> f69423h;

        public l() {
        }

        @SuppressLint({"NewApi"})
        private void k() {
            int length = this.f69418c.length;
            int i4 = this.f69420e;
            ArrayList<View>[] arrayListArr = this.f69419d;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                ArrayList<View> arrayList = arrayListArr[i6];
                int size = arrayList.size();
                int i7 = size - length;
                int i8 = size - 1;
                int i9 = 0;
                while (i9 < i7) {
                    AbsHListView.this.removeDetachedView(arrayList.remove(i8), false);
                    i9++;
                    i8--;
                }
            }
            if (this.f69423h != null) {
                while (i5 < this.f69423h.size()) {
                    if (!this.f69423h.valueAt(i5).hasTransientState()) {
                        this.f69423h.removeAt(i5);
                        i5--;
                    }
                    i5++;
                }
            }
        }

        @SuppressLint({"NewApi"})
        public void c(View view, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.f69361d = i4;
            int i5 = layoutParams.f69358a;
            int i6 = Build.VERSION.SDK_INT;
            boolean z4 = i6 >= 16 && view.hasTransientState();
            if (q(i5) && !z4) {
                view.onStartTemporaryDetach();
                if (this.f69420e == 1) {
                    this.f69421f.add(view);
                } else {
                    this.f69419d[i5].add(view);
                }
                if (i6 >= 14) {
                    view.setAccessibilityDelegate(null);
                }
                m mVar = this.f69416a;
                if (mVar != null) {
                    mVar.a(view);
                    return;
                }
                return;
            }
            if (i5 != -2 || z4) {
                if (this.f69422g == null) {
                    this.f69422g = new ArrayList<>();
                }
                this.f69422g.add(view);
            }
            if (z4) {
                if (this.f69423h == null) {
                    this.f69423h = new SparseArrayCompat<>();
                }
                view.onStartTemporaryDetach();
                this.f69423h.put(i4, view);
            }
        }

        public void d() {
            int i4 = this.f69420e;
            if (i4 == 1) {
                ArrayList<View> arrayList = this.f69421f;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    AbsHListView.this.removeDetachedView(arrayList.remove((size - 1) - i5), false);
                }
            } else {
                for (int i6 = 0; i6 < i4; i6++) {
                    ArrayList<View> arrayList2 = this.f69419d[i6];
                    int size2 = arrayList2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        AbsHListView.this.removeDetachedView(arrayList2.remove((size2 - 1) - i7), false);
                    }
                }
            }
            SparseArrayCompat<View> sparseArrayCompat = this.f69423h;
            if (sparseArrayCompat != null) {
                sparseArrayCompat.clear();
            }
        }

        void e() {
            SparseArrayCompat<View> sparseArrayCompat = this.f69423h;
            if (sparseArrayCompat != null) {
                sparseArrayCompat.clear();
            }
        }

        public void f(int i4, int i5) {
            if (this.f69418c.length < i4) {
                this.f69418c = new View[i4];
            }
            this.f69417b = i5;
            View[] viewArr = this.f69418c;
            for (int i6 = 0; i6 < i4; i6++) {
                View childAt = AbsHListView.this.getChildAt(i6);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams != null && layoutParams.f69358a != -2) {
                    viewArr[i6] = childAt;
                }
            }
        }

        public View g(int i4) {
            int i5 = i4 - this.f69417b;
            View[] viewArr = this.f69418c;
            if (i5 < 0 || i5 >= viewArr.length) {
                return null;
            }
            View view = viewArr[i5];
            viewArr[i5] = null;
            return view;
        }

        View h(int i4) {
            if (this.f69420e == 1) {
                return AbsHListView.H0(this.f69421f, i4);
            }
            int itemViewType = AbsHListView.this.U.getItemViewType(i4);
            if (itemViewType >= 0) {
                ArrayList<View>[] arrayListArr = this.f69419d;
                if (itemViewType < arrayListArr.length) {
                    return AbsHListView.H0(arrayListArr[itemViewType], i4);
                }
                return null;
            }
            return null;
        }

        View i(int i4) {
            int indexOfKey;
            SparseArrayCompat<View> sparseArrayCompat = this.f69423h;
            if (sparseArrayCompat != null && (indexOfKey = sparseArrayCompat.indexOfKey(i4)) >= 0) {
                View valueAt = this.f69423h.valueAt(indexOfKey);
                this.f69423h.removeAt(indexOfKey);
                return valueAt;
            }
            return null;
        }

        public void j() {
            int i4 = this.f69420e;
            if (i4 == 1) {
                ArrayList<View> arrayList = this.f69421f;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.get(i5).forceLayout();
                }
            } else {
                for (int i6 = 0; i6 < i4; i6++) {
                    ArrayList<View> arrayList2 = this.f69419d[i6];
                    int size2 = arrayList2.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        arrayList2.get(i7).forceLayout();
                    }
                }
            }
            SparseArrayCompat<View> sparseArrayCompat = this.f69423h;
            if (sparseArrayCompat != null) {
                int size3 = sparseArrayCompat.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    this.f69423h.valueAt(i8).forceLayout();
                }
            }
        }

        void l(List<View> list) {
            int i4 = this.f69420e;
            if (i4 == 1) {
                list.addAll(this.f69421f);
                return;
            }
            ArrayList<View>[] arrayListArr = this.f69419d;
            for (int i5 = 0; i5 < i4; i5++) {
                list.addAll(arrayListArr[i5]);
            }
        }

        public void m() {
            ArrayList<View> arrayList = this.f69422g;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                AbsHListView.this.removeDetachedView(this.f69422g.get(i4), false);
            }
            this.f69422g.clear();
        }

        @SuppressLint({"NewApi"})
        public void n() {
            View[] viewArr = this.f69418c;
            boolean z4 = this.f69416a != null;
            boolean z5 = this.f69420e > 1;
            ArrayList<View> arrayList = this.f69421f;
            for (int length = viewArr.length - 1; length >= 0; length--) {
                View view = viewArr[length];
                if (view != null) {
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    int i4 = layoutParams.f69358a;
                    viewArr[length] = null;
                    int i5 = Build.VERSION.SDK_INT;
                    boolean z6 = i5 >= 16 && view.hasTransientState();
                    if (!q(i4) || z6) {
                        if (i4 != -2 || z6) {
                            AbsHListView.this.removeDetachedView(view, false);
                        }
                        if (z6) {
                            if (this.f69423h == null) {
                                this.f69423h = new SparseArrayCompat<>();
                            }
                            this.f69423h.put(this.f69417b + length, view);
                        }
                    } else {
                        if (z5) {
                            arrayList = this.f69419d[i4];
                        }
                        view.onStartTemporaryDetach();
                        layoutParams.f69361d = this.f69417b + length;
                        arrayList.add(view);
                        if (i5 >= 14) {
                            view.setAccessibilityDelegate(null);
                        }
                        if (z4) {
                            this.f69416a.a(view);
                        }
                    }
                }
            }
            k();
        }

        void o(int i4) {
            View[] viewArr;
            int i5 = this.f69420e;
            if (i5 == 1) {
                ArrayList<View> arrayList = this.f69421f;
                int size = arrayList.size();
                for (int i6 = 0; i6 < size; i6++) {
                    arrayList.get(i6).setDrawingCacheBackgroundColor(i4);
                }
            } else {
                for (int i7 = 0; i7 < i5; i7++) {
                    ArrayList<View> arrayList2 = this.f69419d[i7];
                    int size2 = arrayList2.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        arrayList2.get(i8).setDrawingCacheBackgroundColor(i4);
                    }
                }
            }
            for (View view : this.f69418c) {
                if (view != null) {
                    view.setDrawingCacheBackgroundColor(i4);
                }
            }
        }

        public void p(int i4) {
            if (i4 >= 1) {
                ArrayList<View>[] arrayListArr = new ArrayList[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    arrayListArr[i5] = new ArrayList<>();
                }
                this.f69420e = i4;
                this.f69421f = arrayListArr[0];
                this.f69419d = arrayListArr;
                return;
            }
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }

        public boolean q(int i4) {
            return i4 >= 0;
        }
    }

    /* loaded from: classes6.dex */
    public interface m {
        void a(View view);
    }

    /* loaded from: classes6.dex */
    public interface n {
        void adjustListItemSelectionBounds(Rect rect);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class o {

        /* renamed from: b  reason: collision with root package name */
        private int f69425b;

        private o() {
        }

        public void a() {
            this.f69425b = AbsHListView.this.getWindowAttachCount();
        }

        public boolean b() {
            return AbsHListView.this.hasWindowFocus() && AbsHListView.this.getWindowAttachCount() == this.f69425b;
        }

        /* synthetic */ o(AbsHListView absHListView, a aVar) {
            this();
        }
    }

    public AbsHListView(Context context) {
        super(context);
        this.M = 0;
        this.S = 0;
        this.W = false;
        this.f69347p1 = -1;
        this.f69354v1 = new Rect();
        this.A1 = new l();
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = new Rect();
        this.G1 = 0;
        this.Q1 = -1;
        this.W1 = 0;
        this.f69332b2 = true;
        this.f69334d2 = -1;
        this.f69335e2 = null;
        this.f69337g2 = -1;
        this.f69348p2 = 0;
        this.v2 = 1.0f;
        this.f69355w2 = new boolean[1];
        this.f69356x2 = -1;
        this.E2 = 0;
        e0();
    }

    private void B0() {
        VelocityTracker velocityTracker = this.T1;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.T1 = null;
        }
    }

    static View H0(ArrayList<View> arrayList, int i4) {
        int size = arrayList.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                View view = arrayList.get(i5);
                if (((LayoutParams) view.getLayoutParams()).f69361d == i4) {
                    arrayList.remove(i5);
                    return view;
                }
            }
            return arrayList.remove(size - 1);
        }
        return null;
    }

    private void I0(int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount;
        VelocityTracker velocityTracker;
        ViewParent parent;
        int i10 = i4 - this.O1;
        int i11 = i10 - this.S1;
        int i12 = this.R1;
        int i13 = i12 != Integer.MIN_VALUE ? i4 - i12 : i11;
        int i14 = this.Q1;
        if (i14 == 3) {
            if (i4 != i12) {
                if (Math.abs(i10) > this.f69349q2 && (parent = getParent()) != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                int i15 = this.L1;
                if (i15 >= 0) {
                    childCount = i15 - this.f69427b;
                } else {
                    childCount = getChildCount() / 2;
                }
                View childAt = getChildAt(childCount);
                int left = childAt != null ? childAt.getLeft() : 0;
                boolean V0 = i13 != 0 ? V0(i11, i13) : false;
                View childAt2 = getChildAt(childCount);
                if (childAt2 != null) {
                    int left2 = childAt2.getLeft();
                    if (V0) {
                        int i16 = (-i13) - (left2 - left);
                        overScrollBy(i16, 0, getScrollX(), 0, 0, 0, this.y2, 0, true);
                        if (Math.abs(this.y2) == Math.abs(getScrollX()) && (velocityTracker = this.T1) != null) {
                            velocityTracker.clear();
                        }
                        int overScrollMode = getOverScrollMode();
                        if (overScrollMode == 0 || (overScrollMode == 1 && !T())) {
                            this.E2 = 0;
                            this.Q1 = 5;
                            if (i10 > 0) {
                                this.A2.onPull(i16 / getWidth());
                                if (!this.B2.isFinished()) {
                                    this.B2.onRelease();
                                }
                                invalidate();
                            } else if (i10 < 0) {
                                this.B2.onPull(i16 / getWidth());
                                if (!this.A2.isFinished()) {
                                    this.A2.onRelease();
                                }
                                invalidate();
                            }
                        }
                    }
                    this.O1 = i4;
                }
                this.R1 = i4;
            }
        } else if (i14 != 5 || i4 == i12) {
        } else {
            int scrollX = getScrollX();
            int i17 = scrollX - i13;
            int i18 = i4 > this.R1 ? 1 : -1;
            if (this.E2 == 0) {
                this.E2 = i18;
            }
            int i19 = -i13;
            if ((i17 >= 0 || scrollX < 0) && (i17 <= 0 || scrollX > 0)) {
                i5 = i19;
                i6 = 0;
            } else {
                int i20 = -scrollX;
                i6 = i13 + i20;
                i5 = i20;
            }
            if (i5 != 0) {
                i7 = i6;
                int i21 = i5;
                i8 = i18;
                overScrollBy(i5, 0, getScrollX(), 0, 0, 0, this.y2, 0, true);
                int overScrollMode2 = getOverScrollMode();
                if (overScrollMode2 == 0 || (overScrollMode2 == 1 && !T())) {
                    if (i10 > 0) {
                        this.A2.onPull(i21 / getWidth());
                        if (!this.B2.isFinished()) {
                            this.B2.onRelease();
                        }
                        invalidate();
                    } else if (i10 < 0) {
                        this.B2.onPull(i21 / getWidth());
                        if (!this.A2.isFinished()) {
                            this.A2.onRelease();
                        }
                        invalidate();
                    }
                }
            } else {
                i7 = i6;
                i8 = i18;
            }
            if (i7 != 0) {
                if (getScrollX() != 0) {
                    i9 = 0;
                    this.L.c(0);
                    h0();
                } else {
                    i9 = 0;
                }
                V0(i7, i7);
                this.Q1 = 3;
                int Y = Y(i4);
                this.S1 = i9;
                View childAt3 = getChildAt(Y - this.f69427b);
                this.M1 = childAt3 != null ? childAt3.getLeft() : 0;
                this.O1 = i4;
                this.L1 = Y;
            }
            this.R1 = i4;
            this.E2 = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        b.a aVar = this.L;
        if (aVar == null || aVar.a()) {
            return;
        }
        if (this.f69350r2 == null) {
            this.f69350r2 = new b();
        }
        post(this.f69350r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        return childCount == this.f69445t && getChildAt(0).getLeft() >= this.F1.left && getChildAt(childCount - 1).getRight() <= getWidth() - this.F1.right;
    }

    private boolean T0(int i4) {
        int i5 = i4 - this.O1;
        int abs = Math.abs(i5);
        boolean z4 = getScrollX() != 0;
        if (z4 || abs > this.f69349q2) {
            V();
            if (z4) {
                this.Q1 = 5;
                this.S1 = 0;
            } else {
                this.Q1 = 3;
                this.S1 = i5 > 0 ? this.f69349q2 : -this.f69349q2;
            }
            Handler handler = getHandler();
            if (handler != null) {
                handler.removeCallbacks(this.f69338h2);
            }
            setPressed(false);
            View childAt = getChildAt(this.L1 - this.f69427b);
            if (childAt != null) {
                childAt.setPressed(false);
            }
            C0(1);
            ViewParent parent = getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            I0(i4);
            return true;
        }
        return false;
    }

    private void V() {
        b.a aVar;
        if (!this.Y1 || this.J1 || (aVar = this.L) == null || aVar.a()) {
            return;
        }
        setChildrenDrawnWithCacheEnabled(true);
        setChildrenDrawingCacheEnabled(true);
        this.K1 = true;
        this.J1 = true;
    }

    private void W(Canvas canvas) {
        if (this.f69354v1.isEmpty()) {
            return;
        }
        Drawable drawable = this.f69346p0;
        drawable.setBounds(this.f69354v1);
        drawable.draw(canvas);
    }

    private void W0() {
        int i4 = this.f69427b;
        int childCount = getChildCount();
        boolean z4 = Build.VERSION.SDK_INT >= 11;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int i6 = i4 + i5;
            if (childAt instanceof Checkable) {
                ((Checkable) childAt).setChecked(this.Q.get(i6, Boolean.FALSE).booleanValue());
            } else if (z4) {
                childAt.setActivated(this.Q.get(i6, Boolean.FALSE).booleanValue());
            }
        }
    }

    private void Z0() {
        setSelector(getResources().getDrawable(17301602));
    }

    private void a0() {
        EdgeEffectCompat edgeEffectCompat = this.A2;
        if (edgeEffectCompat != null) {
            edgeEffectCompat.finish();
            this.B2.finish();
        }
    }

    public static int c0(Rect rect, Rect rect2, int i4) {
        int width;
        int height;
        int width2;
        int i5;
        int height2;
        int i6;
        if (i4 == 1 || i4 == 2) {
            width = rect.right + (rect.width() / 2);
            height = (rect.height() / 2) + rect.top;
            width2 = rect2.left + (rect2.width() / 2);
            i5 = rect2.top;
            height2 = rect2.height() / 2;
        } else if (i4 != 17) {
            if (i4 == 33) {
                width = rect.left + (rect.width() / 2);
                height = rect.top;
                width2 = rect2.left + (rect2.width() / 2);
                i6 = rect2.bottom;
            } else if (i4 == 66) {
                width = rect.right;
                height = (rect.height() / 2) + rect.top;
                width2 = rect2.left;
                i5 = rect2.top;
                height2 = rect2.height() / 2;
            } else if (i4 == 130) {
                width = rect.left + (rect.width() / 2);
                height = rect.bottom;
                width2 = rect2.left + (rect2.width() / 2);
                i6 = rect2.top;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
            }
            int i7 = width2 - width;
            int i8 = i6 - height;
            return (i8 * i8) + (i7 * i7);
        } else {
            width = rect.left;
            height = (rect.height() / 2) + rect.top;
            width2 = rect2.right;
            i5 = rect2.top;
            height2 = rect2.height() / 2;
        }
        i6 = height2 + i5;
        int i72 = width2 - width;
        int i82 = i6 - height;
        return (i82 * i82) + (i72 * i72);
    }

    private void e0() {
        if (Build.VERSION.SDK_INT < 10) {
            return;
        }
        setClickable(true);
        setFocusableInTouchMode(true);
        setWillNotDraw(false);
        setAlwaysDrawnWithCacheEnabled(false);
        setScrollingCacheEnabled(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f69349q2 = viewConfiguration.getScaledTouchSlop();
        this.f69352t2 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f69353u2 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.y2 = viewConfiguration.getScaledOverscrollDistance();
        this.f69357z2 = viewConfiguration.getScaledOverflingDistance();
        this.L = it.sephiroth.android.library.util.b.a(this);
    }

    private void f0() {
        VelocityTracker velocityTracker = this.T1;
        if (velocityTracker == null) {
            this.T1 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void g0() {
        if (this.T1 == null) {
            this.T1 = VelocityTracker.obtain();
        }
    }

    private void s0(MotionEvent motionEvent) {
        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
        if (motionEvent.getPointerId(action) == this.f69356x2) {
            int i4 = action == 0 ? 1 : 0;
            this.O1 = (int) motionEvent.getX(i4);
            this.P1 = (int) motionEvent.getY(i4);
            this.S1 = 0;
            this.f69356x2 = motionEvent.getPointerId(i4);
        }
    }

    private void x0(int i4, int i5, int i6, int i7) {
        this.f69354v1.set(i4 - this.B1, i5 - this.C1, i6 + this.D1, i7 + this.E1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int A0() {
        int i4 = this.f69442q;
        if (i4 < 0) {
            i4 = this.f69334d2;
        }
        return Math.min(Math.max(0, i4), this.f69445t - 1);
    }

    void C0(int i4) {
        i iVar;
        if (i4 == this.f69348p2 || (iVar = this.f69331a2) == null) {
            return;
        }
        this.f69348p2 = i4;
        iVar.b(this, i4);
    }

    void D0() {
        if (getChildCount() > 0) {
            E0();
            requestLayout();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void E0() {
        removeAllViewsInLayout();
        this.f69427b = 0;
        this.f69439n = false;
        this.f69351s2 = null;
        this.f69432g = false;
        this.N2 = null;
        this.f69448w = -1;
        this.f69449x = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        this.W1 = 0;
        this.f69347p1 = -1;
        this.f69354v1.setEmpty();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean F0() {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.AbsHListView.F0():boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean G0() {
        if (this.f69442q >= 0 || !F0()) {
            return false;
        }
        Y0();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void J0(int i4, int i5) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean K0() {
        return (hasFocus() && !isInTouchMode()) || U0();
    }

    public boolean L0(float f5, float f6, int i4) {
        int w02 = w0((int) f5, (int) f6);
        if (w02 != -1) {
            long itemId = this.U.getItemId(w02);
            View childAt = getChildAt(w02 - this.f69427b);
            if (childAt != null) {
                this.f69335e2 = U(childAt, w02, itemId);
                return super.showContextMenuForChild(this);
            }
        }
        return L0(f5, f6, i4);
    }

    public void M0(int i4, int i5) {
        N0(i4, i5, false);
    }

    public void N0(int i4, int i5, boolean z4) {
        if (this.U1 == null) {
            this.U1 = new g();
        }
        int i6 = this.f69427b;
        int childCount = getChildCount();
        int i7 = i6 + childCount;
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        if (i4 != 0 && this.f69445t != 0 && childCount != 0 && ((i6 != 0 || getChildAt(0).getLeft() != paddingLeft || i4 >= 0) && (i7 != this.f69445t || getChildAt(childCount - 1).getRight() != width || i4 <= 0))) {
            C0(2);
            this.U1.g(i4, i5, z4);
            return;
        }
        this.U1.c();
        k kVar = this.V1;
        if (kVar != null) {
            kVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void O0(int i4) {
        int lastVisiblePosition;
        View childAt;
        Rect rect;
        if (i4 < 0) {
            lastVisiblePosition = getFirstVisiblePosition();
        } else {
            lastVisiblePosition = i4 > 0 ? getLastVisiblePosition() : -1;
        }
        if (lastVisiblePosition <= -1 || (childAt = getChildAt(lastVisiblePosition - getFirstVisiblePosition())) == null) {
            return;
        }
        if (childAt.getGlobalVisibleRect(new Rect())) {
            float width = (rect.width() * rect.height()) / (childAt.getWidth() * childAt.getHeight());
            if (i4 < 0 && width < 0.75f) {
                lastVisiblePosition++;
            } else if (i4 > 0 && width < 0.75f) {
                lastVisiblePosition--;
            }
        }
        P0(Math.max(0, Math.min(getCount(), lastVisiblePosition + i4)));
    }

    public void P0(int i4) {
        if (this.V1 == null) {
            this.V1 = new k();
        }
        this.V1.b(i4);
    }

    public void Q() {
        SparseArrayCompat<Boolean> sparseArrayCompat = this.Q;
        if (sparseArrayCompat != null) {
            sparseArrayCompat.clear();
        }
        LongSparseArray<Integer> longSparseArray = this.R;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
        this.P = 0;
    }

    public void Q0(int i4, int i5) {
        if (this.V1 == null) {
            this.V1 = new k();
        }
        this.V1.c(i4, i5);
    }

    public void R0(int i4, int i5) {
        if (this.V1 == null) {
            this.V1 = new k();
        }
        this.V1.d(i4, i5);
    }

    void S() {
        Object obj;
        boolean z4;
        Object obj2;
        Object obj3;
        this.Q.clear();
        int i4 = 0;
        boolean z5 = false;
        while (i4 < this.R.size()) {
            long keyAt = this.R.keyAt(i4);
            int intValue = this.R.valueAt(i4).intValue();
            if (keyAt != this.U.getItemId(intValue)) {
                int max = Math.max(0, intValue - 20);
                int min = Math.min(intValue + 20, this.f69445t);
                while (true) {
                    if (max >= min) {
                        z4 = false;
                        break;
                    } else if (keyAt == this.U.getItemId(max)) {
                        this.Q.put(max, Boolean.TRUE);
                        this.R.setValueAt(i4, Integer.valueOf(max));
                        z4 = true;
                        break;
                    } else {
                        max++;
                    }
                }
                if (!z4) {
                    this.R.delete(keyAt);
                    i4--;
                    this.P--;
                    if (Build.VERSION.SDK_INT > 11 && (obj2 = this.N) != null && (obj3 = this.O) != null) {
                        ((o3.b) obj3).a((ActionMode) obj2, intValue, keyAt, false);
                    }
                    z5 = true;
                }
            } else {
                this.Q.put(intValue, Boolean.TRUE);
            }
            i4++;
        }
        if (!z5 || (obj = this.N) == null || Build.VERSION.SDK_INT <= 11) {
            return;
        }
        ((ActionMode) obj).invalidate();
    }

    public void S0(int i4, int i5, int i6) {
        if (this.V1 == null) {
            this.V1 = new k();
        }
        this.V1.e(i4, i5, i6);
    }

    ContextMenu.ContextMenuInfo U(View view, int i4, long j4) {
        return new AdapterView.b(view, i4, j4);
    }

    boolean U0() {
        int i4 = this.Q1;
        return i4 == 1 || i4 == 2;
    }

    boolean V0(int i4, int i5) {
        int min;
        int min2;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        if (childCount == 0) {
            return true;
        }
        int left = getChildAt(0).getLeft();
        int i10 = childCount - 1;
        int right = getChildAt(i10).getRight();
        Rect rect = this.F1;
        int i11 = 0 - left;
        int width = right - (getWidth() - 0);
        int width2 = (getWidth() - getPaddingRight()) - getPaddingLeft();
        if (i4 < 0) {
            min = Math.max(-(width2 - 1), i4);
        } else {
            min = Math.min(width2 - 1, i4);
        }
        if (i5 < 0) {
            min2 = Math.max(-(width2 - 1), i5);
        } else {
            min2 = Math.min(width2 - 1, i5);
        }
        int i12 = this.f69427b;
        if (i12 == 0) {
            this.C2 = left - rect.left;
        } else {
            this.C2 += min2;
        }
        int i13 = i12 + childCount;
        int i14 = this.f69445t;
        if (i13 == i14) {
            this.D2 = rect.right + right;
        } else {
            this.D2 += min2;
        }
        boolean z4 = i12 == 0 && left >= rect.left && min2 >= 0;
        boolean z5 = i13 == i14 && right <= getWidth() - rect.right && min2 <= 0;
        if (z4 || z5) {
            return min2 != 0;
        }
        boolean z6 = min2 < 0;
        boolean isInTouchMode = isInTouchMode();
        if (isInTouchMode) {
            d0();
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = this.f69445t - getFooterViewsCount();
        if (z6) {
            int i15 = -min2;
            int i16 = 0;
            i7 = 0;
            while (i16 < childCount) {
                View childAt = getChildAt(i16);
                if (childAt.getRight() >= i15) {
                    break;
                }
                i7++;
                int i17 = i12 + i16;
                if (i17 < headerViewsCount || i17 >= footerViewsCount) {
                    i9 = childCount;
                } else {
                    i9 = childCount;
                    this.A1.c(childAt, i17);
                }
                i16++;
                childCount = i9;
            }
            i6 = 0;
        } else {
            int width3 = getWidth() - min2;
            i6 = 0;
            i7 = 0;
            while (i10 >= 0) {
                View childAt2 = getChildAt(i10);
                if (childAt2.getLeft() <= width3) {
                    break;
                }
                i7++;
                int i18 = i12 + i10;
                if (i18 >= headerViewsCount && i18 < footerViewsCount) {
                    this.A1.c(childAt2, i18);
                }
                int i19 = i10;
                i10--;
                i6 = i19;
            }
        }
        this.N1 = this.M1 + min;
        this.B = true;
        if (i7 > 0) {
            detachViewsFromParent(i6, i7);
            this.A1.m();
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        r0(min2);
        if (z6) {
            this.f69427b += i7;
        }
        int abs = Math.abs(min2);
        if (i11 < abs || width < abs) {
            X(z6);
        }
        if (!isInTouchMode && (i8 = this.f69442q) != -1) {
            int i20 = i8 - this.f69427b;
            if (i20 >= 0 && i20 < getChildCount()) {
                y0(this.f69442q, getChildAt(i20));
            }
        } else {
            int i21 = this.f69347p1;
            if (i21 != -1) {
                int i22 = i21 - this.f69427b;
                if (i22 >= 0 && i22 < getChildCount()) {
                    y0(-1, getChildAt(i22));
                }
            } else {
                this.f69354v1.setEmpty();
            }
        }
        this.B = false;
        j0();
        return false;
    }

    protected abstract void X(boolean z4);

    /* JADX INFO: Access modifiers changed from: protected */
    public void X0() {
        if (this.H1 != null) {
            boolean z4 = this.f69427b > 0;
            if (!z4 && getChildCount() > 0) {
                z4 = getChildAt(0).getLeft() < this.F1.left;
            }
            this.H1.setVisibility(z4 ? 0 : 4);
        }
        if (this.I1 != null) {
            int childCount = getChildCount();
            boolean z5 = this.f69427b + childCount < this.f69445t;
            if (!z5 && childCount > 0) {
                z5 = getChildAt(childCount - 1).getRight() > getRight() - this.F1.right;
            }
            this.I1.setVisibility(z5 ? 0 : 4);
        }
    }

    protected int Y(int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return -1;
        }
        int Z = Z(i4);
        return Z != -1 ? Z : (this.f69427b + childCount) - 1;
    }

    void Y0() {
        if (this.f69346p0 != null) {
            if (K0()) {
                this.f69346p0.setState(getDrawableState());
            } else {
                this.f69346p0.setState(f69330p3);
            }
        }
    }

    protected abstract int Z(int i4);

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        int childCount = getChildCount();
        int i4 = this.f69427b;
        ListAdapter listAdapter = this.U;
        if (listAdapter == null) {
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (listAdapter.isEnabled(i4 + i5)) {
                arrayList.add(childAt);
            }
            childAt.addTouchables(arrayList);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: b0 */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public boolean checkInputConnectionProxy(View view) {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollExtent() {
        int childCount = getChildCount();
        if (childCount > 0) {
            if (this.f69332b2) {
                int i4 = childCount * 100;
                View childAt = getChildAt(0);
                int left = childAt.getLeft();
                int width = childAt.getWidth();
                if (width > 0) {
                    i4 += (left * 100) / width;
                }
                View childAt2 = getChildAt(childCount - 1);
                int right = childAt2.getRight();
                int width2 = childAt2.getWidth();
                return width2 > 0 ? i4 - (((right - getWidth()) * 100) / width2) : i4;
            }
            return 1;
        }
        return 0;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollOffset() {
        int i4 = this.f69427b;
        int childCount = getChildCount();
        int i5 = 0;
        if (i4 >= 0 && childCount > 0) {
            if (this.f69332b2) {
                View childAt = getChildAt(0);
                int left = childAt.getLeft();
                int width = childAt.getWidth();
                if (width > 0) {
                    return Math.max(((i4 * 100) - ((left * 100) / width)) + ((int) ((getScrollX() / getWidth()) * this.f69445t * 100.0f)), 0);
                }
            } else {
                int i6 = this.f69445t;
                if (i4 != 0) {
                    i5 = i4 + childCount == i6 ? i6 : (childCount / 2) + i4;
                }
                return (int) (i4 + (childCount * (i5 / i6)));
            }
        }
        return 0;
    }

    @Override // android.view.View
    protected int computeHorizontalScrollRange() {
        if (this.f69332b2) {
            int max = Math.max(this.f69445t * 100, 0);
            return getScrollX() != 0 ? max + Math.abs((int) ((getScrollX() / getWidth()) * this.f69445t * 100.0f)) : max;
        }
        return this.f69445t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void d0() {
        int i4 = this.f69442q;
        if (i4 != -1) {
            if (this.S != 4) {
                this.f69334d2 = i4;
            }
            int i5 = this.f69440o;
            if (i5 >= 0 && i5 != i4) {
                this.f69334d2 = i5;
            }
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.W1 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z4 = this.W;
        if (!z4) {
            W(canvas);
        }
        super.dispatchDraw(canvas);
        if (z4) {
            W(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z4) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.A2 != null) {
            int scrollX = getScrollX();
            if (!this.A2.isFinished()) {
                int save = canvas.save();
                Rect rect = this.F1;
                int i4 = rect.top + this.G2;
                int height = (getHeight() - i4) - (rect.bottom + this.H2);
                int min = Math.min(0, this.C2 + scrollX);
                canvas.rotate(-90.0f);
                canvas.translate((-getHeight()) + i4, min);
                this.A2.setSize(height, height);
                if (this.A2.draw(canvas)) {
                    invalidate();
                }
                canvas.restoreToCount(save);
            }
            if (this.B2.isFinished()) {
                return;
            }
            int save2 = canvas.save();
            Rect rect2 = this.F1;
            int i5 = rect2.left + this.G2;
            int height2 = (getHeight() - i5) - (rect2.right + this.H2);
            int max = Math.max(getWidth(), scrollX + this.D2);
            canvas.rotate(90.0f);
            canvas.translate(-i5, -max);
            this.B2.setSize(height2, height2);
            if (this.B2.draw(canvas)) {
                invalidate();
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Y0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -1, 0);
    }

    @ViewDebug.ExportedProperty(category = "drawing")
    public int getCacheColorHint() {
        return this.f69344n2;
    }

    public int getCheckedItemCount() {
        return this.P;
    }

    public long[] getCheckedItemIds() {
        LongSparseArray<Integer> longSparseArray;
        if (this.M == 0 || (longSparseArray = this.R) == null || this.U == null) {
            return new long[0];
        }
        int size = longSparseArray.size();
        long[] jArr = new long[size];
        for (int i4 = 0; i4 < size; i4++) {
            jArr[i4] = longSparseArray.keyAt(i4);
        }
        return jArr;
    }

    public int getCheckedItemPosition() {
        SparseArrayCompat<Boolean> sparseArrayCompat;
        if (this.M == 1 && (sparseArrayCompat = this.Q) != null && sparseArrayCompat.size() == 1) {
            return this.Q.keyAt(0);
        }
        return -1;
    }

    public SparseArrayCompat<Boolean> getCheckedItemPositions() {
        if (this.M != 0) {
            return this.Q;
        }
        return null;
    }

    public int getChoiceMode() {
        return this.M;
    }

    @Override // android.view.View
    protected ContextMenu.ContextMenuInfo getContextMenuInfo() {
        return this.f69335e2;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        View selectedView = getSelectedView();
        if (selectedView != null && selectedView.getParent() == this) {
            selectedView.getFocusedRect(rect);
            offsetDescendantRectToMyCoords(selectedView, rect);
            return;
        }
        super.getFocusedRect(rect);
    }

    protected int getFooterViewsCount() {
        return 0;
    }

    protected int getHeaderViewsCount() {
        return 0;
    }

    protected float getHorizontalScrollFactor() {
        if (this.O2 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.hlv_listPreferredItemWidth, typedValue, true)) {
                this.O2 = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define hlv_listPreferredItemWidth.");
            }
        }
        return this.O2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public int getHorizontalScrollbarHeight() {
        return super.getHorizontalScrollbarHeight();
    }

    @Override // android.view.View
    protected float getLeftFadingEdgeStrength() {
        int childCount = getChildCount();
        float leftFadingEdgeStrength = super.getLeftFadingEdgeStrength();
        if (childCount == 0) {
            return leftFadingEdgeStrength;
        }
        if (this.f69427b > 0) {
            return 1.0f;
        }
        int left = getChildAt(0).getLeft();
        return left < getPaddingLeft() ? (-(left - getPaddingLeft())) / getHorizontalFadingEdgeLength() : leftFadingEdgeStrength;
    }

    public int getListPaddingBottom() {
        return this.F1.bottom;
    }

    public int getListPaddingLeft() {
        return this.F1.left;
    }

    public int getListPaddingRight() {
        return this.F1.right;
    }

    public int getListPaddingTop() {
        return this.F1.top;
    }

    @Override // android.view.View
    protected float getRightFadingEdgeStrength() {
        int childCount = getChildCount();
        float rightFadingEdgeStrength = super.getRightFadingEdgeStrength();
        if (childCount == 0) {
            return rightFadingEdgeStrength;
        }
        if ((this.f69427b + childCount) - 1 < this.f69445t - 1) {
            return 1.0f;
        }
        int right = getChildAt(childCount - 1).getRight();
        int width = getWidth();
        return right > width - getPaddingRight() ? ((right - width) + getPaddingRight()) / getHorizontalFadingEdgeLength() : rightFadingEdgeStrength;
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    @ViewDebug.ExportedProperty
    public View getSelectedView() {
        int i4;
        if (this.f69445t <= 0 || (i4 = this.f69442q) < 0) {
            return null;
        }
        return getChildAt(i4 - this.f69427b);
    }

    public Drawable getSelector() {
        return this.f69346p0;
    }

    @Override // android.view.View
    public int getSolidColor() {
        return this.f69344n2;
    }

    public int getTranscriptMode() {
        return this.f69343m2;
    }

    @TargetApi(11)
    protected void h0() {
        if (this.L.a() && (getParent() instanceof View)) {
            ((View) getParent()).invalidate();
        }
    }

    public void i0() {
        this.f69439n = true;
        r();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j0() {
        i iVar = this.f69331a2;
        if (iVar != null) {
            iVar.a(this, this.f69427b, getChildCount(), this.f69445t);
        }
        onScrollChanged(0, 0, 0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f69346p0;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean k0(int i4) {
        SparseArrayCompat<Boolean> sparseArrayCompat;
        if (this.M == 0 || (sparseArrayCompat = this.Q) == null) {
            return false;
        }
        return sparseArrayCompat.get(i4, Boolean.FALSE).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView
    public void l() {
        ListAdapter listAdapter;
        int i4 = this.f69445t;
        int i5 = this.M2;
        this.M2 = i4;
        if (this.M != 0 && (listAdapter = this.U) != null && listAdapter.hasStableIds()) {
            S();
        }
        this.A1.e();
        if (i4 > 0) {
            if (this.f69432g) {
                this.f69432g = false;
                this.N2 = null;
                int i6 = this.f69343m2;
                if (i6 == 2) {
                    this.S = 3;
                    return;
                }
                if (i6 == 1) {
                    if (this.F2) {
                        this.F2 = false;
                        this.S = 3;
                        return;
                    }
                    int childCount = getChildCount();
                    int width = getWidth() - getPaddingRight();
                    View childAt = getChildAt(childCount - 1);
                    int bottom = childAt != null ? childAt.getBottom() : width;
                    if (this.f69427b + childCount >= i5 && bottom <= width) {
                        this.S = 3;
                        return;
                    }
                    awakenScrollBars();
                }
                int i7 = this.f69433h;
                if (i7 != 0) {
                    if (i7 == 1) {
                        this.S = 5;
                        this.f69429d = Math.min(Math.max(0, this.f69429d), i4 - 1);
                        return;
                    }
                } else if (isInTouchMode()) {
                    this.S = 5;
                    this.f69429d = Math.min(Math.max(0, this.f69429d), i4 - 1);
                    return;
                } else {
                    int g4 = g();
                    if (g4 >= 0 && o(g4, true) == g4) {
                        this.f69429d = g4;
                        if (this.f69431f == getWidth()) {
                            this.S = 5;
                        } else {
                            this.S = 2;
                        }
                        setNextSelectedPositionInt(g4);
                        return;
                    }
                }
            }
            if (!isInTouchMode()) {
                int selectedItemPosition = getSelectedItemPosition();
                if (selectedItemPosition >= i4) {
                    selectedItemPosition = i4 - 1;
                }
                if (selectedItemPosition < 0) {
                    selectedItemPosition = 0;
                }
                int o4 = o(selectedItemPosition, true);
                if (o4 >= 0) {
                    setNextSelectedPositionInt(o4);
                    return;
                }
                int o5 = o(selectedItemPosition, false);
                if (o5 >= 0) {
                    setNextSelectedPositionInt(o5);
                    return;
                }
            } else if (this.f69334d2 >= 0) {
                return;
            }
        }
        this.S = this.X1 ? 3 : 1;
        this.f69442q = -1;
        this.f69443r = Long.MIN_VALUE;
        this.f69440o = -1;
        this.f69441p = Long.MIN_VALUE;
        this.f69432g = false;
        this.N2 = null;
        this.f69347p1 = -1;
        f();
    }

    @ViewDebug.ExportedProperty
    public boolean l0() {
        return this.Y1;
    }

    @ViewDebug.ExportedProperty
    public boolean m0() {
        return this.f69332b2;
    }

    public boolean n0() {
        return this.X1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o0() {
        if (isEnabled() && isClickable()) {
            Drawable drawable = this.f69346p0;
            Rect rect = this.f69354v1;
            if (drawable != null) {
                if ((isFocused() || U0()) && !rect.isEmpty()) {
                    View childAt = getChildAt(this.f69442q - this.f69427b);
                    if (childAt != null) {
                        if (childAt.hasFocusable()) {
                            return;
                        }
                        childAt.setPressed(true);
                    }
                    setPressed(true);
                    boolean isLongClickable = isLongClickable();
                    Drawable current = drawable.getCurrent();
                    if (current != null && (current instanceof TransitionDrawable)) {
                        if (isLongClickable) {
                            ((TransitionDrawable) current).startTransition(ViewConfiguration.getLongPressTimeout());
                        } else {
                            ((TransitionDrawable) current).resetTransition();
                        }
                    }
                    if (!isLongClickable || this.f69439n) {
                        return;
                    }
                    if (this.f69340j2 == null) {
                        this.f69340j2 = new d(this, null);
                    }
                    this.f69340j2.a();
                    postDelayed(this.f69340j2, ViewConfiguration.getLongPressTimeout());
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (this.U != null && this.T == null) {
            c cVar = new c();
            this.T = cVar;
            this.U.registerDataSetObserver(cVar);
            this.f69439n = true;
            this.f69446u = this.f69445t;
            this.f69445t = this.U.getCount();
        }
        this.L2 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"Override"})
    protected int[] onCreateDrawableState(int i4) {
        if (this.f69345o2) {
            return super.onCreateDrawableState(i4);
        }
        int i5 = ViewGroup.ENABLED_STATE_SET[0];
        int[] onCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        int length = onCreateDrawableState.length - 1;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            } else if (onCreateDrawableState[length] == i5) {
                break;
            } else {
                length--;
            }
        }
        if (length >= 0) {
            System.arraycopy(onCreateDrawableState, length + 1, onCreateDrawableState, length, (onCreateDrawableState.length - length) - 1);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        c cVar;
        super.onDetachedFromWindow();
        this.A1.d();
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        ListAdapter listAdapter = this.U;
        if (listAdapter != null && (cVar = this.T) != null) {
            listAdapter.unregisterDataSetObserver(cVar);
            this.T = null;
        }
        g gVar = this.U1;
        if (gVar != null) {
            removeCallbacks(gVar);
        }
        k kVar = this.V1;
        if (kVar != null) {
            kVar.f();
        }
        Runnable runnable = this.f69350r2;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        j jVar = this.f69341k2;
        if (jVar != null) {
            removeCallbacks(jVar);
        }
        Runnable runnable2 = this.f69342l2;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
            this.f69342l2 = null;
        }
        this.L2 = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onFocusChanged(boolean z4, int i4, Rect rect) {
        ListAdapter listAdapter;
        super.onFocusChanged(z4, i4, rect);
        if (!z4 || this.f69442q >= 0 || isInTouchMode()) {
            return;
        }
        if (!this.L2 && (listAdapter = this.U) != null) {
            this.f69439n = true;
            this.f69446u = this.f69445t;
            this.f69445t = listAdapter.getCount();
        }
        F0();
    }

    @Override // android.view.View
    @TargetApi(12)
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && this.Q1 == -1) {
            float axisValue = motionEvent.getAxisValue(10);
            if (axisValue != 0.0f) {
                int horizontalScrollFactor = (int) (axisValue * getHorizontalScrollFactor());
                if (!V0(horizontalScrollFactor, horizontalScrollFactor)) {
                    return true;
                }
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AbsHListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.View
    @SuppressLint({"Override"})
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AbsHListView.class.getName());
        if (isEnabled()) {
            if (getFirstVisiblePosition() > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (getLastVisiblePosition() < getCount() - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        k kVar = this.V1;
        if (kVar != null) {
            kVar.f();
        }
        if (this.L2) {
            int i4 = action & 255;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 6) {
                                s0(motionEvent);
                            }
                        }
                    } else if (this.Q1 == 0) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f69356x2);
                        if (findPointerIndex == -1) {
                            this.f69356x2 = motionEvent.getPointerId(0);
                            findPointerIndex = 0;
                        }
                        g0();
                        this.T1.addMovement(motionEvent);
                        if (T0((int) motionEvent.getX(findPointerIndex))) {
                            return true;
                        }
                    }
                }
                this.Q1 = -1;
                this.f69356x2 = -1;
                B0();
                C0(0);
            } else {
                int i5 = this.Q1;
                if (i5 != 6 && i5 != 5) {
                    int x4 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    this.f69356x2 = motionEvent.getPointerId(0);
                    int Z = Z(x4);
                    if (i5 != 4 && Z >= 0) {
                        this.M1 = getChildAt(Z - this.f69427b).getLeft();
                        this.O1 = x4;
                        this.P1 = y2;
                        this.L1 = Z;
                        this.Q1 = 0;
                        R();
                    }
                    this.R1 = Integer.MIN_VALUE;
                    f0();
                    this.T1.addMovement(motionEvent);
                    if (i5 == 4) {
                        return true;
                    }
                } else {
                    this.S1 = 0;
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i4, KeyEvent keyEvent) {
        int i5;
        ListAdapter listAdapter;
        if (i4 == 23 || i4 == 66) {
            if (!isEnabled()) {
                return true;
            }
            if (isClickable() && isPressed() && (i5 = this.f69442q) >= 0 && (listAdapter = this.U) != null && i5 < listAdapter.getCount()) {
                View childAt = getChildAt(this.f69442q - this.f69427b);
                if (childAt != null) {
                    q(childAt, this.f69442q, this.f69443r);
                    childAt.setPressed(false);
                }
                setPressed(false);
                return true;
            }
        }
        return super.onKeyUp(i4, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f69435j = true;
        if (z4) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                getChildAt(i8).forceLayout();
            }
            this.A1.j();
        }
        p0();
        this.f69435j = false;
        this.f69336f2 = (i6 - i4) / 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f69346p0 == null) {
            Z0();
        }
        Rect rect = this.F1;
        rect.left = this.B1 + getPaddingLeft();
        rect.top = this.C1 + getPaddingTop();
        rect.right = this.D1 + getPaddingRight();
        rect.bottom = this.E1 + getPaddingBottom();
        boolean z4 = true;
        if (this.f69343m2 == 1) {
            int childCount = getChildCount();
            int width = getWidth() - getPaddingRight();
            View childAt = getChildAt(childCount - 1);
            this.F2 = (this.f69427b + childCount < this.M2 || (childAt != null ? childAt.getRight() : width) > width) ? false : false;
        }
    }

    @Override // android.view.View
    protected void onOverScrolled(int i4, int i5, boolean z4, boolean z5) {
        if (getScrollX() != i4) {
            onScrollChanged(i4, getScrollY(), getScrollX(), getScrollY());
            this.L.c(i4);
            h0();
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object obj;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f69439n = true;
        this.f69431f = savedState.f69367f;
        long j4 = savedState.f69363b;
        if (j4 >= 0) {
            this.f69432g = true;
            this.N2 = savedState;
            this.f69430e = j4;
            this.f69429d = savedState.f69366e;
            this.f69428c = savedState.f69365d;
            this.f69433h = 0;
        } else if (savedState.f69364c >= 0) {
            setSelectedPositionInt(-1);
            setNextSelectedPositionInt(-1);
            this.f69347p1 = -1;
            this.f69432g = true;
            this.N2 = savedState;
            this.f69430e = savedState.f69364c;
            this.f69429d = savedState.f69366e;
            this.f69428c = savedState.f69365d;
            this.f69433h = 1;
        }
        SparseArrayCompat<Boolean> sparseArrayCompat = savedState.f69371j;
        if (sparseArrayCompat != null) {
            this.Q = sparseArrayCompat;
        }
        LongSparseArray<Integer> longSparseArray = savedState.f69372k;
        if (longSparseArray != null) {
            this.R = longSparseArray;
        }
        this.P = savedState.f69370i;
        if (Build.VERSION.SDK_INT >= 11 && savedState.f69369h && this.M == 3 && (obj = this.O) != null) {
            this.N = startActionMode((o3.b) obj);
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.N2;
        if (savedState2 != null) {
            savedState.f69363b = savedState2.f69363b;
            savedState.f69364c = savedState2.f69364c;
            savedState.f69365d = savedState2.f69365d;
            savedState.f69366e = savedState2.f69366e;
            savedState.f69367f = savedState2.f69367f;
            savedState.f69368g = savedState2.f69368g;
            savedState.f69369h = savedState2.f69369h;
            savedState.f69370i = savedState2.f69370i;
            savedState.f69371j = savedState2.f69371j;
            savedState.f69372k = savedState2.f69372k;
            return savedState;
        }
        boolean z4 = true;
        boolean z5 = getChildCount() > 0 && this.f69445t > 0;
        long selectedItemId = getSelectedItemId();
        savedState.f69363b = selectedItemId;
        savedState.f69367f = getWidth();
        if (selectedItemId >= 0) {
            savedState.f69365d = this.W1;
            savedState.f69366e = getSelectedItemPosition();
            savedState.f69364c = -1L;
        } else if (z5 && this.f69427b > 0) {
            savedState.f69365d = getChildAt(0).getLeft();
            int i4 = this.f69427b;
            int i5 = this.f69445t;
            if (i4 >= i5) {
                i4 = i5 - 1;
            }
            savedState.f69366e = i4;
            savedState.f69364c = this.U.getItemId(i4);
        } else {
            savedState.f69365d = 0;
            savedState.f69364c = -1L;
            savedState.f69366e = 0;
        }
        savedState.f69368g = null;
        savedState.f69369h = (Build.VERSION.SDK_INT < 11 || this.M != 3 || this.N == null) ? false : false;
        SparseArrayCompat<Boolean> sparseArrayCompat = this.Q;
        if (sparseArrayCompat != null) {
            try {
                savedState.f69371j = sparseArrayCompat.m2clone();
            } catch (NoSuchMethodError e5) {
                e5.printStackTrace();
                savedState.f69371j = new SparseArrayCompat<>();
            }
        }
        if (this.R != null) {
            LongSparseArray<Integer> longSparseArray = new LongSparseArray<>();
            int size = this.R.size();
            for (int i6 = 0; i6 < size; i6++) {
                longSparseArray.put(this.R.keyAt(i6), this.R.valueAt(i6));
            }
            savedState.f69372k = longSparseArray;
        }
        savedState.f69370i = this.P;
        return savedState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        if (getChildCount() > 0) {
            this.f69439n = true;
            r();
        }
    }

    @Override // android.view.View
    @SuppressLint({"Override"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable current;
        int i4;
        int i5 = 0;
        if (!isEnabled()) {
            return isClickable() || isLongClickable();
        }
        k kVar = this.V1;
        if (kVar != null) {
            kVar.f();
        }
        if (this.L2) {
            int action = motionEvent.getAction();
            g0();
            this.T1.addMovement(motionEvent);
            int i6 = action & 255;
            if (i6 == 0) {
                if (this.Q1 != 6) {
                    this.f69356x2 = motionEvent.getPointerId(0);
                    int x4 = (int) motionEvent.getX();
                    int y2 = (int) motionEvent.getY();
                    int w02 = w0(x4, y2);
                    if (!this.f69439n) {
                        if (this.Q1 != 4 && w02 >= 0 && getAdapter().isEnabled(w02)) {
                            this.Q1 = 0;
                            if (this.f69339i2 == null) {
                                this.f69339i2 = new f();
                            }
                            postDelayed(this.f69339i2, ViewConfiguration.getTapTimeout());
                        } else if (this.Q1 == 4) {
                            V();
                            this.Q1 = 3;
                            this.S1 = 0;
                            w02 = Z(x4);
                            this.U1.d();
                        }
                    }
                    if (w02 >= 0) {
                        this.M1 = getChildAt(w02 - this.f69427b).getLeft();
                    }
                    this.O1 = x4;
                    this.P1 = y2;
                    this.L1 = w02;
                    this.R1 = Integer.MIN_VALUE;
                } else {
                    this.U1.c();
                    k kVar2 = this.V1;
                    if (kVar2 != null) {
                        kVar2.f();
                    }
                    this.Q1 = 5;
                    this.P1 = (int) motionEvent.getY();
                    int x5 = (int) motionEvent.getX();
                    this.R1 = x5;
                    this.O1 = x5;
                    this.S1 = 0;
                    this.f69356x2 = motionEvent.getPointerId(0);
                    this.E2 = 0;
                }
                if (t0(motionEvent) && this.Q1 == 0) {
                    removeCallbacks(this.f69339i2);
                }
            } else if (i6 == 1) {
                int i7 = this.Q1;
                if (i7 == 0 || i7 == 1 || i7 == 2) {
                    int i8 = this.L1;
                    View childAt = getChildAt(i8 - this.f69427b);
                    float x6 = motionEvent.getX();
                    boolean z4 = x6 > ((float) this.F1.left) && x6 < ((float) (getWidth() - this.F1.right));
                    if (childAt != null && !childAt.hasFocusable() && z4) {
                        if (this.Q1 != 0) {
                            childAt.setPressed(false);
                        }
                        if (this.f69341k2 == null) {
                            this.f69341k2 = new j(this, null);
                        }
                        j jVar = this.f69341k2;
                        jVar.f69391d = i8;
                        jVar.a();
                        this.f69334d2 = i8;
                        int i9 = this.Q1;
                        if (i9 != 0 && i9 != 1) {
                            if (!this.f69439n && this.U.isEnabled(i8)) {
                                jVar.run();
                            }
                        } else {
                            Handler handler = getHandler();
                            if (handler != null) {
                                handler.removeCallbacks(this.Q1 == 0 ? this.f69339i2 : this.f69338h2);
                            }
                            this.S = 0;
                            if (!this.f69439n && this.U.isEnabled(i8)) {
                                this.Q1 = 1;
                                setSelectedPositionInt(this.L1);
                                p0();
                                childAt.setPressed(true);
                                y0(this.L1, childAt);
                                setPressed(true);
                                Drawable drawable = this.f69346p0;
                                if (drawable != null && (current = drawable.getCurrent()) != null && (current instanceof TransitionDrawable)) {
                                    ((TransitionDrawable) current).resetTransition();
                                }
                                Runnable runnable = this.f69342l2;
                                if (runnable != null) {
                                    removeCallbacks(runnable);
                                }
                                a aVar = new a(childAt, jVar);
                                this.f69342l2 = aVar;
                                postDelayed(aVar, ViewConfiguration.getPressedStateDuration());
                            } else {
                                this.Q1 = -1;
                                Y0();
                            }
                            return true;
                        }
                    }
                    this.Q1 = -1;
                    Y0();
                } else if (i7 == 3) {
                    int childCount = getChildCount();
                    if (childCount > 0) {
                        int left = getChildAt(0).getLeft();
                        int right = getChildAt(childCount - 1).getRight();
                        int i10 = this.F1.left;
                        int width = getWidth() - this.F1.right;
                        int i11 = this.f69427b;
                        if (i11 == 0 && left >= i10 && i11 + childCount < this.f69445t && right <= getWidth() - width) {
                            this.Q1 = -1;
                            C0(0);
                        } else {
                            VelocityTracker velocityTracker = this.T1;
                            velocityTracker.computeCurrentVelocity(1000, this.f69353u2);
                            int xVelocity = (int) (velocityTracker.getXVelocity(this.f69356x2) * this.v2);
                            if (Math.abs(xVelocity) > this.f69352t2 && (((i4 = this.f69427b) != 0 || left != i10 - this.y2) && (i4 + childCount != this.f69445t || right != width + this.y2))) {
                                if (this.U1 == null) {
                                    this.U1 = new g();
                                }
                                C0(2);
                                this.U1.e(-xVelocity);
                            } else {
                                this.Q1 = -1;
                                C0(0);
                                g gVar = this.U1;
                                if (gVar != null) {
                                    gVar.c();
                                }
                                k kVar3 = this.V1;
                                if (kVar3 != null) {
                                    kVar3.f();
                                }
                            }
                        }
                    } else {
                        this.Q1 = -1;
                        C0(0);
                    }
                } else if (i7 == 5) {
                    if (this.U1 == null) {
                        this.U1 = new g();
                    }
                    VelocityTracker velocityTracker2 = this.T1;
                    velocityTracker2.computeCurrentVelocity(1000, this.f69353u2);
                    int xVelocity2 = (int) velocityTracker2.getXVelocity(this.f69356x2);
                    C0(2);
                    if (Math.abs(xVelocity2) > this.f69352t2) {
                        this.U1.f(-xVelocity2);
                    } else {
                        this.U1.h();
                    }
                }
                setPressed(false);
                EdgeEffectCompat edgeEffectCompat = this.A2;
                if (edgeEffectCompat != null) {
                    edgeEffectCompat.onRelease();
                    this.B2.onRelease();
                }
                invalidate();
                Handler handler2 = getHandler();
                if (handler2 != null) {
                    handler2.removeCallbacks(this.f69338h2);
                }
                B0();
                this.f69356x2 = -1;
            } else if (i6 == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f69356x2);
                if (findPointerIndex == -1) {
                    this.f69356x2 = motionEvent.getPointerId(0);
                } else {
                    i5 = findPointerIndex;
                }
                int x7 = (int) motionEvent.getX(i5);
                if (this.f69439n) {
                    p0();
                }
                int i12 = this.Q1;
                if (i12 == 0 || i12 == 1 || i12 == 2) {
                    T0(x7);
                } else if (i12 == 3 || i12 == 5) {
                    I0(x7);
                }
            } else if (i6 == 3) {
                int i13 = this.Q1;
                if (i13 == 5) {
                    if (this.U1 == null) {
                        this.U1 = new g();
                    }
                    this.U1.h();
                } else if (i13 != 6) {
                    this.Q1 = -1;
                    setPressed(false);
                    View childAt2 = getChildAt(this.L1 - this.f69427b);
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                    R();
                    Handler handler3 = getHandler();
                    if (handler3 != null) {
                        handler3.removeCallbacks(this.f69338h2);
                    }
                    B0();
                }
                EdgeEffectCompat edgeEffectCompat2 = this.A2;
                if (edgeEffectCompat2 != null) {
                    edgeEffectCompat2.onRelease();
                    this.B2.onRelease();
                }
                this.f69356x2 = -1;
            } else if (i6 == 5) {
                int actionIndex = motionEvent.getActionIndex();
                int pointerId = motionEvent.getPointerId(actionIndex);
                int x8 = (int) motionEvent.getX(actionIndex);
                int y4 = (int) motionEvent.getY(actionIndex);
                this.S1 = 0;
                this.f69356x2 = pointerId;
                this.O1 = x8;
                this.P1 = y4;
                int w03 = w0(x8, y4);
                if (w03 >= 0) {
                    this.M1 = getChildAt(w03 - this.f69427b).getLeft();
                    this.L1 = w03;
                }
                this.R1 = x8;
            } else if (i6 == 6) {
                s0(motionEvent);
                int i14 = this.O1;
                int w04 = w0(i14, this.P1);
                if (w04 >= 0) {
                    this.M1 = getChildAt(w04 - this.f69427b).getLeft();
                    this.L1 = w04;
                }
                this.R1 = i14;
            }
            return true;
        }
        return false;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public void onTouchModeChanged(boolean z4) {
        if (z4) {
            d0();
            if (getWidth() > 0 && getChildCount() > 0) {
                p0();
            }
            Y0();
            return;
        }
        int i4 = this.Q1;
        if (i4 == 5 || i4 == 6) {
            g gVar = this.U1;
            if (gVar != null) {
                gVar.c();
            }
            k kVar = this.V1;
            if (kVar != null) {
                kVar.f();
            }
            if (getScrollX() != 0) {
                this.L.c(0);
                a0();
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        int i4 = !isInTouchMode();
        if (!z4) {
            setChildrenDrawingCacheEnabled(false);
            g gVar = this.U1;
            if (gVar != null) {
                removeCallbacks(gVar);
                this.U1.c();
                k kVar = this.V1;
                if (kVar != null) {
                    kVar.f();
                }
                if (getScrollX() != 0) {
                    this.L.c(0);
                    a0();
                    invalidate();
                }
            }
            if (i4 == 1) {
                this.f69334d2 = this.f69442q;
            }
        } else {
            int i5 = this.f69337g2;
            if (i4 != i5 && i5 != -1) {
                if (i4 == 1) {
                    F0();
                } else {
                    d0();
                    this.S = 0;
                    p0();
                }
            }
        }
        this.f69337g2 = i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p0() {
    }

    @Override // android.view.View
    @TargetApi(16)
    public boolean performAccessibilityAction(int i4, Bundle bundle) {
        if (super.performAccessibilityAction(i4, bundle)) {
            return true;
        }
        if (i4 != 4096) {
            if (i4 == 8192 && isEnabled() && this.f69427b > 0) {
                int width = getWidth();
                Rect rect = this.F1;
                M0(-((width - rect.left) - rect.right), 200);
                return true;
            }
            return false;
        } else if (!isEnabled() || getLastVisiblePosition() >= getCount() - 1) {
            return false;
        } else {
            int width2 = getWidth();
            Rect rect2 = this.F1;
            M0((width2 - rect2.left) - rect2.right, 200);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00da  */
    @Override // it.sephiroth.android.library.widget.AdapterView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(android.view.View r10, int r11, long r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.AbsHListView.q(android.view.View, int, long):boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @SuppressLint({"NewApi"})
    public View q0(int i4, boolean[] zArr) {
        View view;
        LayoutParams layoutParams;
        zArr[0] = false;
        View i5 = this.A1.i(i4);
        if (i5 != null) {
            return i5;
        }
        View h4 = this.A1.h(i4);
        if (h4 != null) {
            view = this.U.getView(i4, h4, this);
            if (Build.VERSION.SDK_INT >= 16 && view != 0 && view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            if (view != h4) {
                this.A1.c(h4, i4);
                int i6 = this.f69344n2;
                if (i6 != 0) {
                    view.setDrawingCacheBackgroundColor(i6);
                }
            } else {
                zArr[0] = true;
                view.onFinishTemporaryDetach();
            }
        } else {
            view = this.U.getView(i4, null, this);
            if (Build.VERSION.SDK_INT >= 16 && view != 0 && view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
            int i7 = this.f69344n2;
            if (i7 != 0) {
                view.setDrawingCacheBackgroundColor(i7);
            }
        }
        if (this.V) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams = (LayoutParams) generateDefaultLayoutParams();
            } else if (!checkLayoutParams(layoutParams2)) {
                layoutParams = (LayoutParams) generateLayoutParams(layoutParams2);
            } else {
                layoutParams = (LayoutParams) layoutParams2;
            }
            layoutParams.f69362e = this.U.getItemId(i4);
            view.setLayoutParams(layoutParams);
        }
        if (this.f69447v.isEnabled() && this.I2 == null) {
            this.I2 = new h();
        }
        return view;
    }

    public void r0(int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).offsetLeftAndRight(i4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        if (z4) {
            B0();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.B || this.f69435j) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEvent(int i4) {
        if (i4 == 4096) {
            int firstVisiblePosition = getFirstVisiblePosition();
            int lastVisiblePosition = getLastVisiblePosition();
            if (this.J2 == firstVisiblePosition && this.K2 == lastVisiblePosition) {
                return;
            }
            this.J2 = firstVisiblePosition;
            this.K2 = lastVisiblePosition;
        }
        super.sendAccessibilityEvent(i4);
    }

    public void setCacheColorHint(int i4) {
        if (i4 != this.f69344n2) {
            this.f69344n2 = i4;
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5).setDrawingCacheBackgroundColor(i4);
            }
            this.A1.o(i4);
        }
    }

    @TargetApi(11)
    public void setChoiceMode(int i4) {
        ListAdapter listAdapter;
        Object obj;
        this.M = i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 11 && (obj = this.N) != null) {
            if (i5 >= 11) {
                ((ActionMode) obj).finish();
            }
            this.N = null;
        }
        if (this.M != 0) {
            if (this.Q == null) {
                this.Q = new SparseArrayCompat<>();
            }
            if (this.R == null && (listAdapter = this.U) != null && listAdapter.hasStableIds()) {
                this.R = new LongSparseArray<>();
            }
            if (i5 < 11 || this.M != 3) {
                return;
            }
            Q();
            setLongClickable(true);
        }
    }

    public void setDrawSelectorOnTop(boolean z4) {
        this.W = z4;
    }

    public void setFriction(float f5) {
        if (this.U1 == null) {
            this.U1 = new g();
        }
        this.U1.f69382b.v(f5);
    }

    public void setItemChecked(int i4, boolean z4) {
        int i5 = this.M;
        if (i5 == 0) {
            return;
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 11 && z4 && i5 == 3 && this.N == null) {
            Object obj = this.O;
            if (obj != null && ((o3.b) obj).b()) {
                this.N = startActionMode((o3.b) this.O);
            } else {
                throw new IllegalStateException("AbsListView: attempted to start selection mode for CHOICE_MODE_MULTIPLE_MODAL but no choice mode callback was supplied. Call setMultiChoiceModeListener to set a callback.");
            }
        }
        int i7 = this.M;
        if (i7 != 2 && (i6 < 11 || i7 != 3)) {
            boolean z5 = this.R != null && this.U.hasStableIds();
            if (z4 || k0(i4)) {
                this.Q.clear();
                if (z5) {
                    this.R.clear();
                }
            }
            if (z4) {
                this.Q.put(i4, Boolean.TRUE);
                if (z5) {
                    this.R.put(this.U.getItemId(i4), Integer.valueOf(i4));
                }
                this.P = 1;
            } else if (this.Q.size() == 0 || !this.Q.valueAt(0).booleanValue()) {
                this.P = 0;
            }
        } else {
            boolean booleanValue = this.Q.get(i4, Boolean.FALSE).booleanValue();
            this.Q.put(i4, Boolean.valueOf(z4));
            if (this.R != null && this.U.hasStableIds()) {
                if (z4) {
                    this.R.put(this.U.getItemId(i4), Integer.valueOf(i4));
                } else {
                    this.R.delete(this.U.getItemId(i4));
                }
            }
            if (booleanValue != z4) {
                if (z4) {
                    this.P++;
                } else {
                    this.P--;
                }
            }
            if (this.N != null) {
                ((o3.b) this.O).a((ActionMode) this.N, i4, this.U.getItemId(i4), z4);
            }
        }
        if (this.f69435j || this.B) {
            return;
        }
        this.f69439n = true;
        r();
        requestLayout();
    }

    @TargetApi(11)
    public void setMultiChoiceModeListener(o3.a aVar) {
        if (Build.VERSION.SDK_INT >= 11) {
            if (this.O == null) {
                this.O = new o3.b(this);
            }
            ((o3.b) this.O).c(aVar);
        }
    }

    public void setOnScrollListener(i iVar) {
        this.f69331a2 = iVar;
        j0();
    }

    public void setOverScrollEffectPadding(int i4, int i5) {
        this.G2 = i4;
        this.H2 = i5;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i4) {
        if (i4 != 2) {
            if (this.A2 == null) {
                Context context = getContext();
                this.A2 = new EdgeEffectCompat(context);
                this.B2 = new EdgeEffectCompat(context);
            }
        } else {
            this.A2 = null;
            this.B2 = null;
        }
        super.setOverScrollMode(i4);
    }

    public void setRecyclerListener(m mVar) {
        this.A1.f69416a = mVar;
    }

    public void setScrollIndicators(View view, View view2) {
        this.H1 = view;
        this.I1 = view2;
    }

    public void setScrollingCacheEnabled(boolean z4) {
        if (this.Y1 && !z4) {
            R();
        }
        this.Y1 = z4;
    }

    public abstract void setSelectionInt(int i4);

    public void setSelector(int i4) {
        setSelector(getResources().getDrawable(i4));
    }

    public void setSmoothScrollbarEnabled(boolean z4) {
        this.f69332b2 = z4;
    }

    public void setStackFromRight(boolean z4) {
        if (this.X1 != z4) {
            this.X1 = z4;
            D0();
        }
    }

    public void setTranscriptMode(int i4) {
        this.f69343m2 = i4;
    }

    public void setVelocityScale(float f5) {
        this.v2 = f5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean showContextMenuForChild(View view) {
        int k4 = k(view);
        if (k4 >= 0) {
            long itemId = this.U.getItemId(k4);
            AdapterView.e eVar = this.f69438m;
            boolean a5 = eVar != null ? eVar.a(this, view, k4, itemId) : false;
            if (a5) {
                return a5;
            }
            this.f69335e2 = U(getChildAt(k4 - this.f69427b), k4, itemId);
            return super.showContextMenuForChild(view);
        }
        return false;
    }

    @TargetApi(14)
    protected boolean t0(MotionEvent motionEvent) {
        return Build.VERSION.SDK_INT >= 14 && (motionEvent.getButtonState() & 2) != 0 && L0(motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
    }

    boolean u0(View view, int i4, long j4) {
        if (Build.VERSION.SDK_INT >= 11 && this.M == 3) {
            if (this.N == null) {
                ActionMode startActionMode = startActionMode((o3.b) this.O);
                this.N = startActionMode;
                if (startActionMode != null) {
                    setItemChecked(i4, true);
                    performHapticFeedback(0);
                }
            }
            return true;
        }
        AdapterView.e eVar = this.f69438m;
        boolean a5 = eVar != null ? eVar.a(this, view, i4, j4) : false;
        if (!a5) {
            this.f69335e2 = U(view, i4, j4);
            a5 = super.showContextMenuForChild(this);
        }
        if (a5) {
            performHapticFeedback(0);
        }
        return a5;
    }

    public long v0(int i4, int i5) {
        int w02 = w0(i4, i5);
        if (w02 >= 0) {
            return this.U.getItemId(w02);
        }
        return Long.MIN_VALUE;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return this.f69346p0 == drawable || super.verifyDrawable(drawable);
    }

    public int w0(int i4, int i5) {
        Rect rect = this.f69333c2;
        if (rect == null) {
            rect = new Rect();
            this.f69333c2 = rect;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(i4, i5)) {
                    return this.f69427b + childCount;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void y0(int i4, View view) {
        if (i4 != -1) {
            this.f69347p1 = i4;
        }
        Rect rect = this.f69354v1;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (view instanceof n) {
            ((n) view).adjustListItemSelectionBounds(rect);
        }
        x0(rect.left, rect.top, rect.right, rect.bottom);
        boolean z4 = this.f69345o2;
        if (view.isEnabled() != z4) {
            this.f69345o2 = !z4;
            if (getSelectedItemPosition() != -1) {
                refreshDrawableState();
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void z0(List<View> list) {
        int childCount = getChildCount();
        m mVar = this.A1.f69416a;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams != null && this.A1.q(layoutParams.f69358a)) {
                list.add(childAt);
                if (Build.VERSION.SDK_INT >= 14) {
                    childAt.setAccessibilityDelegate(null);
                }
                if (mVar != null) {
                    mVar.a(childAt);
                }
            }
        }
        this.A1.l(list);
        removeAllViewsInLayout();
    }

    /* loaded from: classes6.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f69358a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f69359b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f69360c;

        /* renamed from: d  reason: collision with root package name */
        public int f69361d;

        /* renamed from: e  reason: collision with root package name */
        public long f69362e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f69362e = -1L;
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f69362e = -1L;
        }

        public LayoutParams(int i4, int i5, int i6) {
            super(i4, i5);
            this.f69362e = -1L;
            this.f69358a = i6;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f69362e = -1L;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        if (listAdapter != null) {
            boolean hasStableIds = this.U.hasStableIds();
            this.V = hasStableIds;
            if (this.M != 0 && hasStableIds && this.R == null) {
                this.R = new LongSparseArray<>();
            }
        }
        SparseArrayCompat<Boolean> sparseArrayCompat = this.Q;
        if (sparseArrayCompat != null) {
            sparseArrayCompat.clear();
        }
        LongSparseArray<Integer> longSparseArray = this.R;
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public void setSelector(Drawable drawable) {
        Drawable drawable2 = this.f69346p0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f69346p0);
        }
        this.f69346p0 = drawable;
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.B1 = rect.left;
        this.C1 = rect.top;
        this.D1 = rect.right;
        this.E1 = rect.bottom;
        drawable.setCallback(this);
        Y0();
    }

    public AbsHListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hlv_absHListViewStyle);
    }

    public AbsHListView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        int i5;
        boolean z4;
        boolean z5;
        int i6;
        int i7;
        boolean z6 = false;
        this.M = 0;
        this.S = 0;
        this.W = false;
        this.f69347p1 = -1;
        this.f69354v1 = new Rect();
        this.A1 = new l();
        this.B1 = 0;
        this.C1 = 0;
        this.D1 = 0;
        this.E1 = 0;
        this.F1 = new Rect();
        this.G1 = 0;
        this.Q1 = -1;
        this.W1 = 0;
        boolean z7 = true;
        this.f69332b2 = true;
        this.f69334d2 = -1;
        Drawable drawable = null;
        this.f69335e2 = null;
        this.f69337g2 = -1;
        this.f69348p2 = 0;
        this.v2 = 1.0f;
        this.f69355w2 = new boolean[1];
        this.f69356x2 = -1;
        this.E2 = 0;
        e0();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.AbsHListView, i4, 0);
        if (obtainStyledAttributes != null) {
            drawable = obtainStyledAttributes.getDrawable(0);
            boolean z8 = obtainStyledAttributes.getBoolean(1, false);
            z5 = obtainStyledAttributes.getBoolean(6, false);
            boolean z9 = obtainStyledAttributes.getBoolean(2, true);
            i6 = obtainStyledAttributes.getInt(7, 0);
            i7 = obtainStyledAttributes.getColor(3, 0);
            boolean z10 = obtainStyledAttributes.getBoolean(5, true);
            int i8 = obtainStyledAttributes.getInt(4, 0);
            obtainStyledAttributes.recycle();
            i5 = i8;
            z6 = z8;
            z4 = z10;
            z7 = z9;
        } else {
            i5 = 0;
            z4 = true;
            z5 = false;
            i6 = 0;
            i7 = 0;
        }
        if (drawable != null) {
            setSelector(drawable);
        }
        this.W = z6;
        setStackFromRight(z5);
        setScrollingCacheEnabled(z7);
        setTranscriptMode(i6);
        setCacheColorHint(i7);
        setSmoothScrollbarEnabled(z4);
        setChoiceMode(i5);
    }
}
