package com.join.mgps.customview;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.Adapter;
/* loaded from: classes4.dex */
public abstract class AdapterView<T extends Adapter> extends ViewGroup {
    public static final int B = -1;
    public static final int C = -2;
    static final int D = 0;
    static final int E = 1;
    static final int F = 100;
    public static final int G = -1;
    public static final long H = Long.MIN_VALUE;
    boolean A;
    @ViewDebug.ExportedProperty

    /* renamed from: b  reason: collision with root package name */
    int f46344b;

    /* renamed from: c  reason: collision with root package name */
    int f46345c;

    /* renamed from: d  reason: collision with root package name */
    int f46346d;

    /* renamed from: e  reason: collision with root package name */
    long f46347e;

    /* renamed from: f  reason: collision with root package name */
    long f46348f;

    /* renamed from: g  reason: collision with root package name */
    boolean f46349g;

    /* renamed from: h  reason: collision with root package name */
    int f46350h;

    /* renamed from: i  reason: collision with root package name */
    private int f46351i;

    /* renamed from: j  reason: collision with root package name */
    boolean f46352j;

    /* renamed from: k  reason: collision with root package name */
    f f46353k;

    /* renamed from: l  reason: collision with root package name */
    d f46354l;

    /* renamed from: m  reason: collision with root package name */
    e f46355m;

    /* renamed from: n  reason: collision with root package name */
    boolean f46356n;
    @ViewDebug.ExportedProperty

    /* renamed from: o  reason: collision with root package name */
    int f46357o;

    /* renamed from: p  reason: collision with root package name */
    long f46358p;
    @ViewDebug.ExportedProperty

    /* renamed from: q  reason: collision with root package name */
    int f46359q;

    /* renamed from: r  reason: collision with root package name */
    long f46360r;

    /* renamed from: s  reason: collision with root package name */
    View f46361s;
    @ViewDebug.ExportedProperty

    /* renamed from: t  reason: collision with root package name */
    int f46362t;

    /* renamed from: u  reason: collision with root package name */
    int f46363u;

    /* renamed from: v  reason: collision with root package name */
    int f46364v;

    /* renamed from: w  reason: collision with root package name */
    long f46365w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f46366x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f46367y;

    /* renamed from: z  reason: collision with root package name */
    private AdapterView<T>.g f46368z;

    /* loaded from: classes4.dex */
    public static class b implements ContextMenu.ContextMenuInfo {

        /* renamed from: a  reason: collision with root package name */
        public View f46369a;

        /* renamed from: b  reason: collision with root package name */
        public int f46370b;

        /* renamed from: c  reason: collision with root package name */
        public long f46371c;

        public b(View view, int i4, long j4) {
            this.f46369a = view;
            this.f46370b = i4;
            this.f46371c = j4;
        }
    }

    /* loaded from: classes4.dex */
    class c extends DataSetObserver {

        /* renamed from: a  reason: collision with root package name */
        private Parcelable f46372a = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c() {
        }

        public void a() {
            this.f46372a = null;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            Parcelable parcelable;
            AdapterView adapterView = AdapterView.this;
            adapterView.f46356n = true;
            adapterView.f46363u = adapterView.f46362t;
            adapterView.f46362t = adapterView.getAdapter().getCount();
            if (AdapterView.this.getAdapter().hasStableIds() && (parcelable = this.f46372a) != null) {
                AdapterView adapterView2 = AdapterView.this;
                if (adapterView2.f46363u == 0 && adapterView2.f46362t > 0) {
                    adapterView2.onRestoreInstanceState(parcelable);
                    this.f46372a = null;
                    AdapterView.this.d();
                    AdapterView.this.requestLayout();
                }
            }
            AdapterView.this.o();
            AdapterView.this.d();
            AdapterView.this.requestLayout();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AdapterView adapterView = AdapterView.this;
            adapterView.f46356n = true;
            if (adapterView.getAdapter().hasStableIds()) {
                this.f46372a = AdapterView.this.onSaveInstanceState();
            }
            AdapterView adapterView2 = AdapterView.this;
            adapterView2.f46363u = adapterView2.f46362t;
            adapterView2.f46362t = 0;
            adapterView2.f46359q = -1;
            adapterView2.f46360r = Long.MIN_VALUE;
            adapterView2.f46357o = -1;
            adapterView2.f46358p = Long.MIN_VALUE;
            adapterView2.f46349g = false;
            adapterView2.e();
            AdapterView.this.d();
            AdapterView.this.requestLayout();
        }
    }

    /* loaded from: classes4.dex */
    public interface d {
        void a(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* loaded from: classes4.dex */
    public interface e {
        boolean a(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* loaded from: classes4.dex */
    public interface f {
        void a(AdapterView<?> adapterView);

        void b(AdapterView<?> adapterView, View view, int i4, long j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class g extends Handler implements Runnable {
        private g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AdapterView adapterView = AdapterView.this;
            if (!adapterView.f46356n) {
                adapterView.g();
            } else {
                post(this);
            }
        }
    }

    public AdapterView(Context context) {
        super(context);
        this.f46344b = 0;
        this.f46347e = Long.MIN_VALUE;
        this.f46349g = false;
        this.f46352j = false;
        this.f46357o = -1;
        this.f46358p = Long.MIN_VALUE;
        this.f46359q = -1;
        this.f46360r = Long.MIN_VALUE;
        this.f46364v = -1;
        this.f46365w = Long.MIN_VALUE;
        this.A = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f46353k == null) {
            return;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition >= 0) {
            this.f46353k.b(this, getSelectedView(), selectedItemPosition, getAdapter().getItemId(selectedItemPosition));
            return;
        }
        this.f46353k.a(this);
    }

    private void q(boolean z4) {
        if (l()) {
            z4 = false;
        }
        if (z4) {
            View view = this.f46361s;
            if (view != null) {
                view.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.f46356n) {
                layout(getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        View view2 = this.f46361s;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        setVisibility(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    protected final boolean canAnimate() {
        return super.canAnimate() && this.f46362t > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        T adapter = getAdapter();
        boolean z4 = false;
        boolean z5 = !(adapter == null || adapter.getCount() == 0) || l();
        super.setFocusableInTouchMode(z5 && this.f46367y);
        super.setFocusable(z5 && this.f46366x);
        if (this.f46361s != null) {
            q((adapter == null || adapter.isEmpty()) ? true : true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (this.f46359q == this.f46364v && this.f46360r == this.f46365w) {
            return;
        }
        p();
        this.f46364v = this.f46359q;
        this.f46365w = this.f46360r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int f() {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f46362t
            r2 = -1
            if (r1 != 0) goto L8
            return r2
        L8:
            long r3 = r0.f46347e
            int r5 = r0.f46346d
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
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.AdapterView.f():int");
    }

    public abstract T getAdapter();

    public int getCount() {
        return this.f46362t;
    }

    public final View getEmptyView() {
        return this.f46361s;
    }

    public final int getFirstVisiblePosition() {
        return this.f46344b;
    }

    public final int getLastVisiblePosition() {
        return (this.f46344b + getChildCount()) - 1;
    }

    public final d getOnItemClickListener() {
        return this.f46354l;
    }

    public final e getOnItemLongClickListener() {
        return this.f46355m;
    }

    public final f getOnItemSelectedListener() {
        return this.f46353k;
    }

    public final Object getSelectedItem() {
        T adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        if (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) {
            return null;
        }
        return adapter.getItem(selectedItemPosition);
    }

    public final long getSelectedItemId() {
        return this.f46358p;
    }

    public final int getSelectedItemPosition() {
        return this.f46357o;
    }

    public abstract View getSelectedView();

    public Object h(int i4) {
        T adapter = getAdapter();
        if (adapter == null || i4 < 0) {
            return null;
        }
        return adapter.getItem(i4);
    }

    public long i(int i4) {
        T adapter = getAdapter();
        if (adapter == null || i4 < 0) {
            return Long.MIN_VALUE;
        }
        return adapter.getItemId(i4);
    }

    public final int j(View view) {
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
                return this.f46344b + i4;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k() {
        /*
            r5 = this;
            int r0 = r5.f46362t
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L40
            boolean r3 = r5.f46349g
            if (r3 == 0) goto L1d
            r5.f46349g = r2
            int r3 = r5.f()
            if (r3 < 0) goto L1d
            int r4 = r5.m(r3, r1)
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
            int r0 = r5.m(r4, r1)
            if (r0 >= 0) goto L35
            int r0 = r5.m(r4, r2)
        L35:
            if (r0 < 0) goto L3e
            r5.setNextSelectedPositionInt(r0)
            r5.e()
            goto L41
        L3e:
            r1 = r3
            goto L41
        L40:
            r1 = 0
        L41:
            if (r1 != 0) goto L53
            r0 = -1
            r5.f46359q = r0
            r3 = -9223372036854775808
            r5.f46360r = r3
            r5.f46357o = r0
            r5.f46358p = r3
            r5.f46349g = r2
            r5.e()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.AdapterView.k():void");
    }

    final boolean l() {
        return false;
    }

    final int m(int i4, boolean z4) {
        return i4;
    }

    public final boolean n(View view, int i4, long j4) {
        if (this.f46354l != null) {
            playSoundEffect(0);
            this.f46354l.a(this, view, i4, j4);
            return true;
        }
        return false;
    }

    final void o() {
        if (getChildCount() > 0) {
            this.f46349g = true;
            this.f46348f = this.f46351i;
            int i4 = this.f46359q;
            if (i4 >= 0) {
                View childAt = getChildAt(i4 - this.f46344b);
                this.f46347e = this.f46358p;
                this.f46346d = this.f46357o;
                if (childAt != null) {
                    this.f46345c = childAt.getTop();
                }
                this.f46350h = 0;
                return;
            }
            View childAt2 = getChildAt(0);
            T adapter = getAdapter();
            int i5 = this.f46344b;
            if (i5 >= 0 && i5 < adapter.getCount()) {
                this.f46347e = adapter.getItemId(this.f46344b);
            } else {
                this.f46347e = -1L;
            }
            this.f46346d = this.f46344b;
            if (childAt2 != null) {
                this.f46345c = childAt2.getTop();
            }
            this.f46350h = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        this.f46351i = getHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        if (this.f46353k != null) {
            if (!this.f46352j && !this.A) {
                g();
                return;
            }
            if (this.f46368z == null) {
                this.f46368z = new g();
            }
            AdapterView<T>.g gVar = this.f46368z;
            gVar.post(gVar);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i4) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(T t4);

    public final void setEmptyView(View view) {
        this.f46361s = view;
        T adapter = getAdapter();
        q(adapter == null || adapter.isEmpty());
    }

    @Override // android.view.View
    public final void setFocusable(boolean z4) {
        T adapter = getAdapter();
        boolean z5 = true;
        boolean z6 = adapter == null || adapter.getCount() == 0;
        this.f46366x = z4;
        if (!z4) {
            this.f46367y = false;
        }
        if (!z4 || (z6 && !l())) {
            z5 = false;
        }
        super.setFocusable(z5);
    }

    @Override // android.view.View
    public final void setFocusableInTouchMode(boolean z4) {
        T adapter = getAdapter();
        boolean z5 = false;
        boolean z6 = adapter == null || adapter.getCount() == 0;
        this.f46367y = z4;
        if (z4) {
            this.f46366x = true;
        }
        if (z4 && (!z6 || l())) {
            z5 = true;
        }
        super.setFocusableInTouchMode(z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setNextSelectedPositionInt(int i4) {
        this.f46357o = i4;
        long i5 = i(i4);
        this.f46358p = i5;
        if (this.f46349g && this.f46350h == 0 && i4 >= 0) {
            this.f46346d = i4;
            this.f46347e = i5;
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public final void setOnItemClickListener(d dVar) {
        this.f46354l = dVar;
    }

    public final void setOnItemLongClickListener(e eVar) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.f46355m = eVar;
    }

    public final void setOnItemSelectedListener(f fVar) {
        this.f46353k = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSelectedPositionInt(int i4) {
        this.f46359q = i4;
        this.f46360r = i(i4);
    }

    public abstract void setSelection(int i4);

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public AdapterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46344b = 0;
        this.f46347e = Long.MIN_VALUE;
        this.f46349g = false;
        this.f46352j = false;
        this.f46357o = -1;
        this.f46358p = Long.MIN_VALUE;
        this.f46359q = -1;
        this.f46360r = Long.MIN_VALUE;
        this.f46364v = -1;
        this.f46365w = Long.MIN_VALUE;
        this.A = false;
    }

    public AdapterView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f46344b = 0;
        this.f46347e = Long.MIN_VALUE;
        this.f46349g = false;
        this.f46352j = false;
        this.f46357o = -1;
        this.f46358p = Long.MIN_VALUE;
        this.f46359q = -1;
        this.f46360r = Long.MIN_VALUE;
        this.f46364v = -1;
        this.f46365w = Long.MIN_VALUE;
        this.A = false;
    }
}
