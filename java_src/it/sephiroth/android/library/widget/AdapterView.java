package it.sephiroth.android.library.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObserver;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Adapter;
/* loaded from: classes6.dex */
public abstract class AdapterView<T extends Adapter> extends ViewGroup {
    public static final String C = "AdapterView";
    public static final boolean D = false;
    public static final int E = -1;
    public static final int F = -2;
    static final int G = 0;
    static final int H = 1;
    static final int I = 100;
    public static final int J = -1;
    public static final long K = Long.MIN_VALUE;
    private AdapterView<T>.g A;
    protected boolean B;
    @ViewDebug.ExportedProperty(category = "scrolling")

    /* renamed from: b  reason: collision with root package name */
    protected int f69427b;

    /* renamed from: c  reason: collision with root package name */
    protected int f69428c;

    /* renamed from: d  reason: collision with root package name */
    protected int f69429d;

    /* renamed from: e  reason: collision with root package name */
    protected long f69430e;

    /* renamed from: f  reason: collision with root package name */
    protected long f69431f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f69432g;

    /* renamed from: h  reason: collision with root package name */
    int f69433h;

    /* renamed from: i  reason: collision with root package name */
    private int f69434i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f69435j;

    /* renamed from: k  reason: collision with root package name */
    f f69436k;

    /* renamed from: l  reason: collision with root package name */
    d f69437l;

    /* renamed from: m  reason: collision with root package name */
    e f69438m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f69439n;
    @ViewDebug.ExportedProperty(category = "list")

    /* renamed from: o  reason: collision with root package name */
    protected int f69440o;

    /* renamed from: p  reason: collision with root package name */
    protected long f69441p;
    @ViewDebug.ExportedProperty(category = "list")

    /* renamed from: q  reason: collision with root package name */
    protected int f69442q;

    /* renamed from: r  reason: collision with root package name */
    protected long f69443r;

    /* renamed from: s  reason: collision with root package name */
    private View f69444s;
    @ViewDebug.ExportedProperty(category = "list")

    /* renamed from: t  reason: collision with root package name */
    protected int f69445t;

    /* renamed from: u  reason: collision with root package name */
    protected int f69446u;

    /* renamed from: v  reason: collision with root package name */
    AccessibilityManager f69447v;

    /* renamed from: w  reason: collision with root package name */
    protected int f69448w;

    /* renamed from: x  reason: collision with root package name */
    protected long f69449x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f69450y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f69451z;

    /* loaded from: classes6.dex */
    public static class b implements ContextMenu.ContextMenuInfo {

        /* renamed from: a  reason: collision with root package name */
        public View f69452a;

        /* renamed from: b  reason: collision with root package name */
        public int f69453b;

        /* renamed from: c  reason: collision with root package name */
        public long f69454c;

        public b(View view, int i4, long j4) {
            this.f69452a = view;
            this.f69453b = i4;
            this.f69454c = j4;
        }
    }

    /* loaded from: classes6.dex */
    class c extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        private Parcelable f69455a = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c() {
        }

        public void a() {
            this.f69455a = null;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            Parcelable parcelable;
            AdapterView adapterView = AdapterView.this;
            adapterView.f69439n = true;
            adapterView.f69446u = adapterView.f69445t;
            adapterView.f69445t = adapterView.getAdapter().getCount();
            if (AdapterView.this.getAdapter().hasStableIds() && (parcelable = this.f69455a) != null) {
                AdapterView adapterView2 = AdapterView.this;
                if (adapterView2.f69446u == 0 && adapterView2.f69445t > 0) {
                    adapterView2.onRestoreInstanceState(parcelable);
                    this.f69455a = null;
                    AdapterView.this.e();
                    AdapterView.this.requestLayout();
                }
            }
            AdapterView.this.r();
            AdapterView.this.e();
            AdapterView.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AdapterView adapterView = AdapterView.this;
            adapterView.f69439n = true;
            if (adapterView.getAdapter().hasStableIds()) {
                this.f69455a = AdapterView.this.onSaveInstanceState();
            }
            AdapterView adapterView2 = AdapterView.this;
            adapterView2.f69446u = adapterView2.f69445t;
            adapterView2.f69445t = 0;
            adapterView2.f69442q = -1;
            adapterView2.f69443r = Long.MIN_VALUE;
            adapterView2.f69440o = -1;
            adapterView2.f69441p = Long.MIN_VALUE;
            adapterView2.f69432g = false;
            adapterView2.e();
            AdapterView.this.requestLayout();
        }
    }

    /* loaded from: classes6.dex */
    public interface d {
        void a(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* loaded from: classes6.dex */
    public interface e {
        boolean a(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* loaded from: classes6.dex */
    public interface f {
        void a(AdapterView<?> adapterView);

        void b(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class g implements Runnable {
        private g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdapterView adapterView = AdapterView.this;
            if (!adapterView.f69439n) {
                adapterView.h();
                AdapterView.this.p();
            } else if (adapterView.getAdapter() != null) {
                AdapterView.this.post(this);
            }
        }
    }

    public AdapterView(Context context) {
        super(context);
        this.f69427b = 0;
        this.f69430e = Long.MIN_VALUE;
        this.f69432g = false;
        this.f69435j = false;
        this.f69440o = -1;
        this.f69441p = Long.MIN_VALUE;
        this.f69442q = -1;
        this.f69443r = Long.MIN_VALUE;
        this.f69448w = -1;
        this.f69449x = Long.MIN_VALUE;
        this.B = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f69436k == null) {
            return;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            this.f69436k.b(this, getSelectedView(), selectedItemPosition, getAdapter().getItemId(selectedItemPosition));
            return;
        }
        this.f69436k.a(this);
    }

    private boolean n() {
        int count;
        T adapter = getAdapter();
        if (adapter == null || (count = adapter.getCount()) <= 0) {
            return false;
        }
        return getFirstVisiblePosition() > 0 || getLastVisiblePosition() < count - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.f69447v.isEnabled() && getSelectedItemPosition() >= 0) {
            sendAccessibilityEvent(4);
        }
    }

    @SuppressLint({"WrongCall"})
    private void t(boolean z4) {
        if (m()) {
            z4 = false;
        }
        if (z4) {
            View view = this.f69444s;
            if (view != null) {
                view.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f69439n) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        View view2 = this.f69444s;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean canAnimate() {
        return super.canAnimate() && this.f69445t > 0;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        return selectedView != null && selectedView.getVisibility() == 0 && selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        T adapter = getAdapter();
        boolean z4 = false;
        boolean z5 = !(adapter == null || adapter.getCount() == 0) || m();
        super.setFocusableInTouchMode(z5 && this.f69451z);
        super.setFocusable(z5 && this.f69450y);
        if (this.f69444s != null) {
            t((adapter == null || adapter.isEmpty()) ? true : true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void f() {
        if (this.f69442q == this.f69448w && this.f69443r == this.f69449x) {
            return;
        }
        s();
        this.f69448w = this.f69442q;
        this.f69449x = this.f69443r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f69445t
            r2 = -1
            if (r1 != 0) goto L8
            return r2
        L8:
            long r3 = r0.f69430e
            int r5 = r0.f69429d
            r6 = -9223372036854775808
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L13
            return r2
        L13:
            r6 = 0
            int r5 = java.lang.Math.max(r6, r5)
            r7 = 1
            int r1 = r1 - r7
            int r5 = java.lang.Math.min(r1, r5)
            long r8 = android.os.SystemClock.uptimeMillis()
            r10 = 100
            long r8 = r8 + r10
            android.widget.Adapter r10 = r17.getAdapter()
            if (r10 != 0) goto L2c
            return r2
        L2c:
            r11 = r5
            r12 = r11
        L2e:
            r13 = 0
        L2f:
            long r14 = android.os.SystemClock.uptimeMillis()
            int r16 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r16 > 0) goto L65
            long r14 = r10.getItemId(r5)
            int r16 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r16 != 0) goto L40
            return r5
        L40:
            if (r11 != r1) goto L44
            r14 = 1
            goto L45
        L44:
            r14 = 0
        L45:
            if (r12 != 0) goto L49
            r15 = 1
            goto L4a
        L49:
            r15 = 0
        L4a:
            if (r14 == 0) goto L4f
            if (r15 == 0) goto L4f
            goto L65
        L4f:
            if (r15 != 0) goto L61
            if (r13 == 0) goto L56
            if (r14 != 0) goto L56
            goto L61
        L56:
            if (r14 != 0) goto L5c
            if (r13 != 0) goto L2f
            if (r15 != 0) goto L2f
        L5c:
            int r12 = r12 + (-1)
            r5 = r12
            r13 = 1
            goto L2f
        L61:
            int r11 = r11 + 1
            r5 = r11
            goto L2e
        L65:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.AdapterView.g():int");
    }

    public abstract T getAdapter();

    @ViewDebug.CapturedViewProperty
    public int getCount() {
        return this.f69445t;
    }

    public View getEmptyView() {
        return this.f69444s;
    }

    public int getFirstVisiblePosition() {
        return this.f69427b;
    }

    public int getLastVisiblePosition() {
        return (this.f69427b + getChildCount()) - 1;
    }

    public final d getOnItemClickListener() {
        return this.f69437l;
    }

    public final e getOnItemLongClickListener() {
        return this.f69438m;
    }

    public final f getOnItemSelectedListener() {
        return this.f69436k;
    }

    public Object getSelectedItem() {
        T adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        if (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) {
            return null;
        }
        return adapter.getItem(selectedItemPosition);
    }

    @ViewDebug.CapturedViewProperty
    public long getSelectedItemId() {
        return this.f69441p;
    }

    @ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.f69440o;
    }

    public abstract View getSelectedView();

    public Object i(int i4) {
        T adapter = getAdapter();
        if (adapter == null || i4 < 0) {
            return null;
        }
        return adapter.getItem(i4);
    }

    public long j(int i4) {
        T adapter = getAdapter();
        if (adapter == null || i4 < 0) {
            return Long.MIN_VALUE;
        }
        return adapter.getItemId(i4);
    }

    public int k(View view) {
        while (true) {
            try {
                View view2 = (View) view.getParent();
                if (view2.equals(this)) {
                    break;
                }
                view = view2;
            } catch (ClassCastException unused) {
            }
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (getChildAt(i4).equals(view)) {
                return this.f69427b + i4;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void l() {
        /*
            r5 = this;
            int r0 = r5.f69445t
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L40
            boolean r3 = r5.f69432g
            if (r3 == 0) goto L1d
            r5.f69432g = r2
            int r3 = r5.g()
            if (r3 < 0) goto L1d
            int r4 = r5.o(r3, r1)
            if (r4 != r3) goto L1d
            r5.setNextSelectedPositionInt(r3)
            r3 = 1
            goto L1e
        L1d:
            r3 = 0
        L1e:
            if (r3 != 0) goto L3e
            int r4 = r5.getSelectedItemPosition()
            if (r4 < r0) goto L28
            int r4 = r0 + (-1)
        L28:
            if (r4 >= 0) goto L2b
            r4 = 0
        L2b:
            int r0 = r5.o(r4, r1)
            if (r0 >= 0) goto L35
            int r0 = r5.o(r4, r2)
        L35:
            if (r0 < 0) goto L3e
            r5.setNextSelectedPositionInt(r0)
            r5.f()
            goto L41
        L3e:
            r1 = r3
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 != 0) goto L53
            r0 = -1
            r5.f69442q = r0
            r3 = -9223372036854775808
            r5.f69443r = r3
            r5.f69440o = r0
            r5.f69441p = r3
            r5.f69432g = r2
            r5.f()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.AdapterView.l():void");
    }

    boolean m() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int o(int i4, boolean z4) {
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A);
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(AdapterView.class.getName());
        accessibilityEvent.setScrollable(n());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            accessibilityEvent.setEnabled(selectedView.isEnabled());
        }
        accessibilityEvent.setCurrentItemIndex(getSelectedItemPosition());
        accessibilityEvent.setFromIndex(getFirstVisiblePosition());
        accessibilityEvent.setToIndex(getLastVisiblePosition());
        accessibilityEvent.setItemCount(getCount());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(AdapterView.class.getName());
        accessibilityNodeInfo.setScrollable(n());
        View selectedView = getSelectedView();
        if (selectedView != null) {
            accessibilityNodeInfo.setEnabled(selectedView.isEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        this.f69434i = getWidth();
    }

    @Override // android.view.ViewGroup
    @TargetApi(14)
    public boolean onRequestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (super.onRequestSendAccessibilityEvent(view, accessibilityEvent)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            onInitializeAccessibilityEvent(obtain);
            view.dispatchPopulateAccessibilityEvent(obtain);
            accessibilityEvent.appendRecord(obtain);
            return true;
        }
        return false;
    }

    public boolean q(View view, int i4, long j4) {
        if (this.f69437l != null) {
            playSoundEffect(0);
            if (view != null) {
                view.sendAccessibilityEvent(1);
            }
            this.f69437l.a(this, view, i4, j4);
            return true;
        }
        return false;
    }

    public void r() {
        if (getChildCount() > 0) {
            this.f69432g = true;
            this.f69431f = this.f69434i;
            int i4 = this.f69442q;
            if (i4 >= 0) {
                View childAt = getChildAt(i4 - this.f69427b);
                this.f69430e = this.f69441p;
                this.f69429d = this.f69440o;
                if (childAt != null) {
                    this.f69428c = childAt.getLeft();
                }
                this.f69433h = 0;
                return;
            }
            View childAt2 = getChildAt(0);
            T adapter = getAdapter();
            int i5 = this.f69427b;
            if (i5 >= 0 && i5 < adapter.getCount()) {
                this.f69430e = adapter.getItemId(this.f69427b);
            } else {
                this.f69430e = -1L;
            }
            this.f69429d = this.f69427b;
            if (childAt2 != null) {
                this.f69428c = childAt2.getLeft();
            }
            this.f69433h = 1;
        }
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i4) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    void s() {
        if (this.f69436k != null || this.f69447v.isEnabled()) {
            if (!this.f69435j && !this.B) {
                h();
                p();
                return;
            }
            if (this.A == null) {
                this.A = new g();
            }
            post(this.A);
        }
    }

    public abstract void setAdapter(T t4);

    @TargetApi(16)
    public void setEmptyView(View view) {
        this.f69444s = view;
        boolean z4 = true;
        if (Build.VERSION.SDK_INT >= 16 && view != null && view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        T adapter = getAdapter();
        if (adapter != null && !adapter.isEmpty()) {
            z4 = false;
        }
        t(z4);
    }

    @Override // android.view.View
    public void setFocusable(boolean z4) {
        T adapter = getAdapter();
        boolean z5 = true;
        boolean z6 = adapter == null || adapter.getCount() == 0;
        this.f69450y = z4;
        if (!z4) {
            this.f69451z = false;
        }
        if (!z4 || (z6 && !m())) {
            z5 = false;
        }
        super.setFocusable(z5);
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean z4) {
        T adapter = getAdapter();
        boolean z5 = false;
        boolean z6 = adapter == null || adapter.getCount() == 0;
        this.f69451z = z4;
        if (z4) {
            this.f69450y = true;
        }
        if (z4 && (!z6 || m())) {
            z5 = true;
        }
        super.setFocusableInTouchMode(z5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setNextSelectedPositionInt(int i4) {
        this.f69440o = i4;
        long j4 = j(i4);
        this.f69441p = j4;
        if (this.f69432g && this.f69433h == 0 && i4 >= 0) {
            this.f69429d = i4;
            this.f69430e = j4;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(d dVar) {
        this.f69437l = dVar;
    }

    public void setOnItemLongClickListener(e eVar) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.f69438m = eVar;
    }

    public void setOnItemSelectedListener(f fVar) {
        this.f69436k = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSelectedPositionInt(int i4) {
        this.f69442q = i4;
        this.f69443r = j(i4);
    }

    public abstract void setSelection(int i4);

    @Override // android.view.ViewGroup
    public void addView(View view, int i4) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public AdapterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69427b = 0;
        this.f69430e = Long.MIN_VALUE;
        this.f69432g = false;
        this.f69435j = false;
        this.f69440o = -1;
        this.f69441p = Long.MIN_VALUE;
        this.f69442q = -1;
        this.f69443r = Long.MIN_VALUE;
        this.f69448w = -1;
        this.f69449x = Long.MIN_VALUE;
        this.B = false;
    }

    @TargetApi(16)
    public AdapterView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f69427b = 0;
        this.f69430e = Long.MIN_VALUE;
        this.f69432g = false;
        this.f69435j = false;
        this.f69440o = -1;
        this.f69441p = Long.MIN_VALUE;
        this.f69442q = -1;
        this.f69443r = Long.MIN_VALUE;
        this.f69448w = -1;
        this.f69449x = Long.MIN_VALUE;
        this.B = false;
        if (Build.VERSION.SDK_INT >= 16 && getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        if (isInEditMode()) {
            return;
        }
        this.f69447v = (AccessibilityManager) getContext().getSystemService("accessibility");
    }
}
