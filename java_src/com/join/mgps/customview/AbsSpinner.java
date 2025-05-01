package com.join.mgps.customview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import com.join.mgps.customview.AdapterView;
/* loaded from: classes4.dex */
public abstract class AbsSpinner extends AdapterView<SpinnerAdapter> {
    SpinnerAdapter I;
    int J;
    int K;
    boolean L;
    int M;
    int N;
    int O;
    int P;
    Rect Q;
    View R;
    Interpolator S;
    b T;
    private DataSetObserver U;
    private Rect V;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        long f46322b;

        /* renamed from: c  reason: collision with root package name */
        int f46323c;

        /* loaded from: classes4.dex */
        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i4) {
                return new SavedState[i4];
            }
        }

        public String toString() {
            return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.f46322b + " position=" + this.f46323c + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeLong(this.f46322b);
            parcel.writeInt(this.f46323c);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f46322b = parcel.readLong();
            this.f46323c = parcel.readInt();
        }
    }

    /* loaded from: classes4.dex */
    class b {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<View> f46324a = new SparseArray<>();

        b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a() {
            SparseArray<View> sparseArray = this.f46324a;
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                View valueAt = sparseArray.valueAt(i4);
                if (valueAt != null) {
                    AbsSpinner.this.removeDetachedView(valueAt, true);
                }
            }
            sparseArray.clear();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public View b(int i4) {
            View view = this.f46324a.get(i4);
            if (view != null) {
                this.f46324a.delete(i4);
            }
            return view;
        }

        View c(int i4) {
            return this.f46324a.get(i4);
        }

        public void d(int i4, View view) {
            this.f46324a.put(i4, view);
        }
    }

    public AbsSpinner(Context context) {
        super(context);
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = new Rect();
        this.R = null;
        this.T = new b();
        u();
    }

    private void u() {
        setFocusable(true);
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override // com.join.mgps.customview.AdapterView
    public final int getCount() {
        return this.f46362t;
    }

    @Override // com.join.mgps.customview.AdapterView
    public final View getSelectedView() {
        int i4;
        if (this.f46362t <= 0 || (i4 = this.f46359q) < 0) {
            return null;
        }
        return getChildAt(i4 - this.f46344b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.join.mgps.customview.AdapterView
    public final void k() {
        super.k();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            android.graphics.Rect r1 = r6.Q
            int r2 = r6.getPaddingLeft()
            int r3 = r6.M
            if (r2 <= r3) goto L12
            int r3 = r6.getPaddingLeft()
        L12:
            r1.left = r3
            android.graphics.Rect r1 = r6.Q
            int r2 = r6.getPaddingTop()
            int r3 = r6.N
            if (r2 <= r3) goto L22
            int r3 = r6.getPaddingTop()
        L22:
            r1.top = r3
            android.graphics.Rect r1 = r6.Q
            int r2 = r6.getPaddingRight()
            int r3 = r6.O
            if (r2 <= r3) goto L32
            int r3 = r6.getPaddingRight()
        L32:
            r1.right = r3
            android.graphics.Rect r1 = r6.Q
            int r2 = r6.getPaddingBottom()
            int r3 = r6.P
            if (r2 <= r3) goto L42
            int r3 = r6.getPaddingBottom()
        L42:
            r1.bottom = r3
            boolean r1 = r6.f46356n
            if (r1 == 0) goto L4b
            r6.k()
        L4b:
            int r1 = r6.getSelectedItemPosition()
            r2 = 1
            r3 = 0
            if (r1 < 0) goto L9f
            android.widget.SpinnerAdapter r4 = r6.I
            if (r4 == 0) goto L9f
            com.join.mgps.customview.AbsSpinner$b r4 = r6.T
            android.view.View r4 = r4.b(r1)
            if (r4 != 0) goto L66
            android.widget.SpinnerAdapter r4 = r6.I
            r5 = 0
            android.view.View r4 = r4.getView(r1, r5, r6)
        L66:
            if (r4 == 0) goto L6d
            com.join.mgps.customview.AbsSpinner$b r5 = r6.T
            r5.d(r1, r4)
        L6d:
            if (r4 == 0) goto L9f
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            if (r1 != 0) goto L80
            r6.L = r2
            android.view.ViewGroup$LayoutParams r1 = r6.generateDefaultLayoutParams()
            r4.setLayoutParams(r1)
            r6.L = r3
        L80:
            r6.measureChild(r4, r7, r8)
            int r1 = r6.s(r4)
            android.graphics.Rect r2 = r6.Q
            int r5 = r2.top
            int r1 = r1 + r5
            int r2 = r2.bottom
            int r1 = r1 + r2
            int r2 = r6.t(r4)
            android.graphics.Rect r4 = r6.Q
            int r5 = r4.left
            int r2 = r2 + r5
            int r4 = r4.right
            int r2 = r2 + r4
            r3 = r1
            r1 = r2
            r2 = 0
            goto La0
        L9f:
            r1 = 0
        La0:
            if (r2 == 0) goto Lb0
            android.graphics.Rect r2 = r6.Q
            int r3 = r2.top
            int r4 = r2.bottom
            int r3 = r3 + r4
            if (r0 != 0) goto Lb0
            int r0 = r2.left
            int r1 = r2.right
            int r1 = r1 + r0
        Lb0:
            int r0 = r6.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            int r2 = r6.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r1, r2)
            int r0 = android.view.ViewGroup.resolveSize(r0, r8)
            int r1 = android.view.ViewGroup.resolveSize(r1, r7)
            r6.setMeasuredDimension(r1, r0)
            r6.J = r8
            r6.K = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.join.mgps.customview.AbsSpinner.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        long j4 = savedState.f46322b;
        if (j4 >= 0) {
            this.f46356n = true;
            this.f46349g = true;
            this.f46347e = j4;
            this.f46346d = savedState.f46323c;
            this.f46350h = 0;
            requestLayout();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        long selectedItemId = getSelectedItemId();
        savedState.f46322b = selectedItemId;
        if (selectedItemId >= 0) {
            savedState.f46323c = getSelectedItemPosition();
        } else {
            savedState.f46323c = -1;
        }
        return savedState;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.L) {
            return;
        }
        super.requestLayout();
    }

    final int s(View view) {
        return view.getMeasuredHeight();
    }

    public final void setSelection(int i4, boolean z4) {
        int i5;
        boolean z5 = true;
        z(i4, (!z4 || (i5 = this.f46344b) > i4 || i4 > (i5 + getChildCount()) - 1) ? false : false);
    }

    final int t(View view) {
        return view.getMeasuredWidth();
    }

    abstract void v(int i4, boolean z4);

    public final int w(int i4, int i5) {
        Rect rect = this.V;
        if (rect == null) {
            rect = new Rect();
            this.V = rect;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getHitRect(rect);
                if (rect.contains(i4, i5)) {
                    return this.f46344b + childCount;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        int childCount = getChildCount();
        b bVar = this.T;
        for (int i4 = 0; i4 < childCount; i4++) {
            bVar.d(this.f46344b + i4, getChildAt(i4));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        this.f46356n = false;
        this.f46349g = false;
        removeAllViewsInLayout();
        this.f46364v = -1;
        this.f46365w = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        invalidate();
    }

    final void z(int i4, boolean z4) {
        if (i4 != this.f46364v) {
            this.L = true;
            setNextSelectedPositionInt(i4);
            v(i4 - this.f46359q, z4);
            this.L = false;
        }
    }

    @Override // com.join.mgps.customview.AdapterView
    public final SpinnerAdapter getAdapter() {
        return this.I;
    }

    @Override // com.join.mgps.customview.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        SpinnerAdapter spinnerAdapter2 = this.I;
        if (spinnerAdapter2 != null) {
            spinnerAdapter2.unregisterDataSetObserver(this.U);
            y();
        }
        this.I = spinnerAdapter;
        this.f46364v = -1;
        this.f46365w = Long.MIN_VALUE;
        if (spinnerAdapter != null) {
            this.f46363u = this.f46362t;
            this.f46362t = spinnerAdapter.getCount();
            d();
            AdapterView.c cVar = new AdapterView.c();
            this.U = cVar;
            this.I.registerDataSetObserver(cVar);
            int i4 = this.f46362t > 0 ? 0 : -1;
            setSelectedPositionInt(i4);
            setNextSelectedPositionInt(i4);
            if (this.f46362t == 0) {
                e();
            }
        } else {
            d();
            y();
            e();
        }
        requestLayout();
    }

    @Override // com.join.mgps.customview.AdapterView
    public final void setSelection(int i4) {
        setNextSelectedPositionInt(i4);
        requestLayout();
        invalidate();
    }

    public AbsSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsSpinner(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = new Rect();
        this.R = null;
        this.T = new b();
        u();
    }
}
