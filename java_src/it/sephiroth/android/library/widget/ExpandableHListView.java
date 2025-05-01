package it.sephiroth.android.library.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ExpandableListAdapter;
import android.widget.ListAdapter;
import com.join.android.app.mgsim.wufun.R;
import it.sephiroth.android.library.widget.AdapterView;
import it.sephiroth.android.library.widget.ExpandableHListConnector;
import java.util.ArrayList;
/* loaded from: classes6.dex */
public class ExpandableHListView extends HListView {
    public static final int h4 = 0;
    public static final int i4 = 1;
    public static final int j4 = 2;
    public static final long k4 = 4294967295L;
    private static final long l4 = 4294967295L;
    private static final long m4 = 9223372032559808512L;
    private static final long n4 = Long.MIN_VALUE;
    private static final long o4 = 32;
    private static final long p4 = 63;
    private static final long q4 = -1;
    private static final long r4 = 2147483647L;
    public static final int s4 = -1;
    private static final int t4 = -2;
    private static final int[] u4;
    private static final int[] v4;
    private static final int[] w4;
    private static final int[] x4;
    private static final int[][] y4;
    private static final int[] z4 = {16842918};
    private ExpandableHListConnector M3;
    private ExpandableListAdapter N3;
    private int O3;
    private int P3;
    private int Q3;
    private int R3;
    private int S3;
    private int T3;
    private Drawable U3;
    private Drawable V3;
    private Drawable W3;
    private final Rect X3;
    private final Rect Y3;
    private int Z3;

    /* renamed from: a4  reason: collision with root package name */
    private int f69474a4;

    /* renamed from: b4  reason: collision with root package name */
    private int f69475b4;

    /* renamed from: c4  reason: collision with root package name */
    private int f69476c4;

    /* renamed from: d4  reason: collision with root package name */
    private e f69477d4;

    /* renamed from: e4  reason: collision with root package name */
    private f f69478e4;

    /* renamed from: f4  reason: collision with root package name */
    private d f69479f4;
    private c g4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<ExpandableHListConnector.GroupMetadata> f69480b;

        /* loaded from: classes6.dex */
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

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeList(this.f69480b);
        }

        SavedState(Parcelable parcelable, ArrayList<ExpandableHListConnector.GroupMetadata> arrayList) {
            super(parcelable);
            this.f69480b = arrayList;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            ArrayList<ExpandableHListConnector.GroupMetadata> arrayList = new ArrayList<>();
            this.f69480b = arrayList;
            parcel.readList(arrayList, ExpandableHListConnector.class.getClassLoader());
        }
    }

    /* loaded from: classes6.dex */
    public static class b implements ContextMenu.ContextMenuInfo {

        /* renamed from: a  reason: collision with root package name */
        public View f69481a;

        /* renamed from: b  reason: collision with root package name */
        public long f69482b;

        /* renamed from: c  reason: collision with root package name */
        public long f69483c;

        public b(View view, long j4, long j5) {
            this.f69481a = view;
            this.f69482b = j4;
            this.f69483c = j5;
        }
    }

    /* loaded from: classes6.dex */
    public interface c {
        boolean a(ExpandableHListView expandableHListView, View view, int i4, int i5, long j4);
    }

    /* loaded from: classes6.dex */
    public interface d {
        boolean a(ExpandableHListView expandableHListView, View view, int i4, long j4);
    }

    /* loaded from: classes6.dex */
    public interface e {
        void a(int i4);
    }

    /* loaded from: classes6.dex */
    public interface f {
        void onGroupExpand(int i4);
    }

    static {
        int[] iArr = new int[0];
        u4 = iArr;
        int[] iArr2 = {16842920};
        v4 = iArr2;
        int[] iArr3 = {16842921};
        w4 = iArr3;
        int[] iArr4 = {16842920, 16842921};
        x4 = iArr4;
        y4 = new int[][]{iArr, iArr2, iArr3, iArr4};
    }

    public ExpandableHListView(Context context) {
        this(context, null);
    }

    private int g2(int i5) {
        return i5 + getHeaderViewsCount();
    }

    private long h2(it.sephiroth.android.library.widget.a aVar) {
        if (aVar.f69510d == 1) {
            return this.N3.getChildId(aVar.f69507a, aVar.f69508b);
        }
        return this.N3.getGroupId(aVar.f69507a);
    }

    private int k2(int i5) {
        return i5 - getHeaderViewsCount();
    }

    private Drawable l2(ExpandableHListConnector.b bVar) {
        Drawable drawable;
        if (bVar.f69471a.f69510d == 2) {
            drawable = this.U3;
            if (drawable != null && drawable.isStateful()) {
                ExpandableHListConnector.GroupMetadata groupMetadata = bVar.f69472b;
                drawable.setState(y4[bVar.b() | (groupMetadata == null || groupMetadata.f69465c == groupMetadata.f69464b ? (char) 2 : (char) 0)]);
            }
        } else {
            drawable = this.V3;
            if (drawable != null && drawable.isStateful()) {
                drawable.setState(bVar.f69471a.f69509c == bVar.f69472b.f69465c ? z4 : u4);
            }
        }
        return drawable;
    }

    public static int m2(long j5) {
        if (j5 != 4294967295L && (j5 & Long.MIN_VALUE) == Long.MIN_VALUE) {
            return (int) (j5 & 4294967295L);
        }
        return -1;
    }

    public static long n2(int i5, int i6) {
        return (i6 & (-1)) | ((i5 & r4) << 32) | Long.MIN_VALUE;
    }

    public static long o2(int i5) {
        return (i5 & r4) << 32;
    }

    public static int p2(long j5) {
        if (j5 == 4294967295L) {
            return -1;
        }
        return (int) ((j5 & m4) >> 32);
    }

    public static int q2(long j5) {
        if (j5 == 4294967295L) {
            return 2;
        }
        return (j5 & Long.MIN_VALUE) == Long.MIN_VALUE ? 1 : 0;
    }

    private boolean t2(int i5) {
        return i5 < getHeaderViewsCount() || i5 >= this.f69445t - getFooterViewsCount();
    }

    private void u2() {
        Drawable drawable = this.V3;
        if (drawable != null) {
            this.f69475b4 = drawable.getIntrinsicWidth();
            this.f69476c4 = this.V3.getIntrinsicHeight();
            return;
        }
        this.f69475b4 = 0;
        this.f69476c4 = 0;
    }

    private void v2() {
        Drawable drawable = this.U3;
        if (drawable != null) {
            this.Z3 = drawable.getIntrinsicWidth();
            this.f69474a4 = this.U3.getIntrinsicHeight();
            return;
        }
        this.Z3 = 0;
        this.f69474a4 = 0;
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView
    ContextMenu.ContextMenuInfo U(View view, int i5, long j5) {
        if (t2(i5)) {
            return new AdapterView.b(view, i5, j5);
        }
        ExpandableHListConnector.b j6 = this.M3.j(k2(i5));
        it.sephiroth.android.library.widget.a aVar = j6.f69471a;
        long h22 = h2(aVar);
        long a5 = aVar.a();
        j6.d();
        return new b(view, a5, h22);
    }

    public boolean d2(int i5) {
        boolean b5 = this.M3.b(i5);
        e eVar = this.f69477d4;
        if (eVar != null) {
            eVar.a(i5);
        }
        return b5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.V3 == null && this.U3 == null) {
            return;
        }
        int headerViewsCount = getHeaderViewsCount();
        int footerViewsCount = ((this.f69445t - getFooterViewsCount()) - headerViewsCount) - 1;
        int right = getRight();
        int i5 = -4;
        Rect rect = this.X3;
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = this.f69427b - headerViewsCount;
        while (i6 < childCount) {
            if (i7 >= 0) {
                if (i7 > footerViewsCount) {
                    return;
                }
                View childAt = getChildAt(i6);
                int left = childAt.getLeft();
                int right2 = childAt.getRight();
                if (right2 >= 0 && left <= right) {
                    ExpandableHListConnector.b j5 = this.M3.j(i7);
                    int i8 = j5.f69471a.f69510d;
                    if (i8 != i5) {
                        if (i8 == 1) {
                            rect.top = childAt.getTop() + this.S3;
                            rect.bottom = childAt.getBottom() + this.S3;
                        } else {
                            rect.top = childAt.getTop() + this.O3;
                            rect.bottom = childAt.getBottom() + this.O3;
                        }
                        i5 = j5.f69471a.f69510d;
                    }
                    if (rect.top != rect.bottom) {
                        if (j5.f69471a.f69510d == 1) {
                            int i9 = this.T3;
                            rect.left = left + i9;
                            rect.right = right2 + i9;
                        } else {
                            int i10 = this.P3;
                            rect.left = left + i10;
                            rect.right = right2 + i10;
                        }
                        Drawable l22 = l2(j5);
                        if (l22 != null) {
                            if (j5.f69471a.f69510d == 1) {
                                Gravity.apply(this.R3, this.f69475b4, this.f69476c4, rect, this.Y3);
                            } else {
                                Gravity.apply(this.Q3, this.Z3, this.f69474a4, rect, this.Y3);
                            }
                            l22.setBounds(this.Y3);
                            l22.draw(canvas);
                        }
                    }
                    j5.d();
                }
            }
            i6++;
            i7++;
        }
    }

    public boolean e2(int i5) {
        return f2(i5, false);
    }

    public boolean f2(int i5, boolean z5) {
        it.sephiroth.android.library.widget.a c5 = it.sephiroth.android.library.widget.a.c(2, i5, -1, -1);
        ExpandableHListConnector.b i6 = this.M3.i(c5);
        c5.g();
        boolean e5 = this.M3.e(i6);
        f fVar = this.f69478e4;
        if (fVar != null) {
            fVar.onGroupExpand(i5);
        }
        if (z5) {
            int headerViewsCount = i6.f69471a.f69509c + getHeaderViewsCount();
            Q0(this.N3.getChildrenCount(i5) + headerViewsCount, headerViewsCount);
        }
        i6.d();
        return e5;
    }

    public ExpandableListAdapter getExpandableListAdapter() {
        return this.N3;
    }

    public long getSelectedId() {
        long selectedPosition = getSelectedPosition();
        if (selectedPosition == 4294967295L) {
            return -1L;
        }
        int p22 = p2(selectedPosition);
        if (q2(selectedPosition) == 0) {
            return this.N3.getGroupId(p22);
        }
        return this.N3.getChildId(p22, m2(selectedPosition));
    }

    public long getSelectedPosition() {
        return i2(getSelectedItemPosition());
    }

    public long i2(int i5) {
        if (t2(i5)) {
            return 4294967295L;
        }
        ExpandableHListConnector.b j5 = this.M3.j(k2(i5));
        long a5 = j5.f69471a.a();
        j5.d();
        return a5;
    }

    public int j2(long j5) {
        it.sephiroth.android.library.widget.a f5 = it.sephiroth.android.library.widget.a.f(j5);
        ExpandableHListConnector.b i5 = this.M3.i(f5);
        f5.g();
        int i6 = i5.f69471a.f69509c;
        i5.d();
        return g2(i6);
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ExpandableHListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView, android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ExpandableHListView.class.getName());
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ArrayList<ExpandableHListConnector.GroupMetadata> arrayList;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ExpandableHListConnector expandableHListConnector = this.M3;
        if (expandableHListConnector == null || (arrayList = savedState.f69480b) == null) {
            return;
        }
        expandableHListConnector.n(arrayList);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i5) {
        v2();
        u2();
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        ExpandableHListConnector expandableHListConnector = this.M3;
        return new SavedState(onSaveInstanceState, expandableHListConnector != null ? expandableHListConnector.h() : null);
    }

    @Override // it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView
    public boolean q(View view, int i5, long j5) {
        if (t2(i5)) {
            return super.q(view, i5, j5);
        }
        return r2(view, k2(i5), j5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r1.f69465c != r1.f69464b) goto L10;
     */
    @Override // it.sephiroth.android.library.widget.HListView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r1(android.graphics.Canvas r4, android.graphics.Rect r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.f69427b
            int r6 = r6 + r0
            if (r6 < 0) goto L35
            int r0 = r3.k2(r6)
            it.sephiroth.android.library.widget.ExpandableHListConnector r1 = r3.M3
            it.sephiroth.android.library.widget.ExpandableHListConnector$b r0 = r1.j(r0)
            it.sephiroth.android.library.widget.a r1 = r0.f69471a
            int r1 = r1.f69510d
            r2 = 1
            if (r1 == r2) goto L29
            boolean r1 = r0.b()
            if (r1 == 0) goto L25
            it.sephiroth.android.library.widget.ExpandableHListConnector$GroupMetadata r1 = r0.f69472b
            int r2 = r1.f69465c
            int r1 = r1.f69464b
            if (r2 == r1) goto L25
            goto L29
        L25:
            r0.d()
            goto L35
        L29:
            android.graphics.drawable.Drawable r6 = r3.W3
            r6.setBounds(r5)
            r6.draw(r4)
            r0.d()
            return
        L35:
            super.r1(r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.ExpandableHListView.r1(android.graphics.Canvas, android.graphics.Rect, int):void");
    }

    boolean r2(View view, int i5, long j5) {
        ExpandableHListConnector.b j6 = this.M3.j(i5);
        long h22 = h2(j6.f69471a);
        it.sephiroth.android.library.widget.a aVar = j6.f69471a;
        boolean z5 = true;
        if (aVar.f69510d == 2) {
            d dVar = this.f69479f4;
            if (dVar != null && dVar.a(this, view, aVar.f69507a, h22)) {
                j6.d();
                return true;
            } else if (j6.b()) {
                this.M3.c(j6);
                playSoundEffect(0);
                e eVar = this.f69477d4;
                if (eVar != null) {
                    eVar.a(j6.f69471a.f69507a);
                }
            } else {
                this.M3.e(j6);
                playSoundEffect(0);
                f fVar = this.f69478e4;
                if (fVar != null) {
                    fVar.onGroupExpand(j6.f69471a.f69507a);
                }
                it.sephiroth.android.library.widget.a aVar2 = j6.f69471a;
                int i6 = aVar2.f69507a;
                int headerViewsCount = aVar2.f69509c + getHeaderViewsCount();
                Q0(this.N3.getChildrenCount(i6) + headerViewsCount, headerViewsCount);
            }
        } else if (this.g4 != null) {
            playSoundEffect(0);
            c cVar = this.g4;
            it.sephiroth.android.library.widget.a aVar3 = j6.f69471a;
            return cVar.a(this, view, aVar3.f69507a, aVar3.f69508b, h22);
        } else {
            z5 = false;
        }
        j6.d();
        return z5;
    }

    public boolean s2(int i5) {
        return this.M3.k(i5);
    }

    public void setChildDivider(Drawable drawable) {
        this.W3 = drawable;
    }

    public void setChildIndicator(Drawable drawable) {
        this.V3 = drawable;
        u2();
    }

    public void setGroupIndicator(Drawable drawable) {
        this.U3 = drawable;
        v2();
    }

    public void setOnChildClickListener(c cVar) {
        this.g4 = cVar;
    }

    public void setOnGroupClickListener(d dVar) {
        this.f69479f4 = dVar;
    }

    public void setOnGroupCollapseListener(e eVar) {
        this.f69477d4 = eVar;
    }

    public void setOnGroupExpandListener(f fVar) {
        this.f69478e4 = fVar;
    }

    @Override // it.sephiroth.android.library.widget.AdapterView
    public void setOnItemClickListener(AdapterView.d dVar) {
        super.setOnItemClickListener(dVar);
    }

    public void setSelectedGroup(int i5) {
        it.sephiroth.android.library.widget.a e5 = it.sephiroth.android.library.widget.a.e(i5);
        ExpandableHListConnector.b i6 = this.M3.i(e5);
        e5.g();
        super.setSelection(g2(i6.f69471a.f69509c));
        i6.d();
    }

    public boolean w2(int i5, int i6, boolean z5) {
        it.sephiroth.android.library.widget.a d5 = it.sephiroth.android.library.widget.a.d(i5, i6);
        ExpandableHListConnector.b i7 = this.M3.i(d5);
        if (i7 == null) {
            if (!z5) {
                return false;
            }
            e2(i5);
            i7 = this.M3.i(d5);
            if (i7 == null) {
                throw new IllegalStateException("Could not find child");
            }
        }
        super.setSelection(g2(i7.f69471a.f69509c));
        d5.g();
        i7.d();
        return true;
    }

    public ExpandableHListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.hlv_expandableListViewStyle);
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AdapterView
    public ListAdapter getAdapter() {
        return super.getAdapter();
    }

    @Override // it.sephiroth.android.library.widget.HListView, it.sephiroth.android.library.widget.AbsHListView, it.sephiroth.android.library.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        throw new RuntimeException("For ExpandableListView, use setAdapter(ExpandableListAdapter) instead of setAdapter(ListAdapter)");
    }

    public ExpandableHListView(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.X3 = new Rect();
        this.Y3 = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ExpandableHListView, i5, 0);
        setGroupIndicator(obtainStyledAttributes.getDrawable(5));
        setChildIndicator(obtainStyledAttributes.getDrawable(1));
        this.P3 = obtainStyledAttributes.getDimensionPixelSize(7, 0);
        this.O3 = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.Q3 = obtainStyledAttributes.getInt(6, 0);
        this.R3 = obtainStyledAttributes.getInt(2, 0);
        this.T3 = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.S3 = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.W3 = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public void setAdapter(ExpandableListAdapter expandableListAdapter) {
        this.N3 = expandableListAdapter;
        if (expandableListAdapter != null) {
            this.M3 = new ExpandableHListConnector(expandableListAdapter);
        } else {
            this.M3 = null;
        }
        super.setAdapter((ListAdapter) this.M3);
    }
}
