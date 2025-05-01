package in.srain.cube.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.WrapperListAdapter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes6.dex */
public class GridViewWithHeaderAndFooter extends GridView {

    /* renamed from: o  reason: collision with root package name */
    public static boolean f69153o = false;

    /* renamed from: p  reason: collision with root package name */
    private static final String f69154p = "GridViewHeaderAndFooter";

    /* renamed from: b  reason: collision with root package name */
    private AdapterView.OnItemClickListener f69155b;

    /* renamed from: c  reason: collision with root package name */
    private AdapterView.OnItemLongClickListener f69156c;

    /* renamed from: d  reason: collision with root package name */
    private int f69157d;

    /* renamed from: e  reason: collision with root package name */
    private View f69158e;

    /* renamed from: f  reason: collision with root package name */
    private int f69159f;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<b> f69160g;

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<b> f69161h;

    /* renamed from: i  reason: collision with root package name */
    private ListAdapter f69162i;

    /* renamed from: j  reason: collision with root package name */
    private e f69163j;

    /* renamed from: k  reason: collision with root package name */
    private float f69164k;

    /* renamed from: l  reason: collision with root package name */
    private float f69165l;

    /* renamed from: m  reason: collision with root package name */
    private float f69166m;

    /* renamed from: n  reason: collision with root package name */
    private float f69167n;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f69168a;

        /* renamed from: b  reason: collision with root package name */
        public ViewGroup f69169b;

        /* renamed from: c  reason: collision with root package name */
        public Object f69170c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f69171d;

        private b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class c extends FrameLayout {
        public c(Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            int paddingLeft = GridViewWithHeaderAndFooter.this.getPaddingLeft() + getPaddingLeft();
            if (paddingLeft != i4) {
                offsetLeftAndRight(paddingLeft - i4);
            }
            super.onLayout(z4, i4, i5, i6, i7);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i4, int i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((GridViewWithHeaderAndFooter.this.getMeasuredWidth() - GridViewWithHeaderAndFooter.this.getPaddingLeft()) - GridViewWithHeaderAndFooter.this.getPaddingRight(), View.MeasureSpec.getMode(i4)), i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static class d implements WrapperListAdapter, Filterable {

        /* renamed from: l  reason: collision with root package name */
        static final ArrayList<b> f69173l = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private final ListAdapter f69175c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<b> f69176d;

        /* renamed from: e  reason: collision with root package name */
        ArrayList<b> f69177e;

        /* renamed from: h  reason: collision with root package name */
        boolean f69180h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f69181i;

        /* renamed from: b  reason: collision with root package name */
        private final DataSetObservable f69174b = new DataSetObservable();

        /* renamed from: f  reason: collision with root package name */
        private int f69178f = 1;

        /* renamed from: g  reason: collision with root package name */
        private int f69179g = -1;

        /* renamed from: j  reason: collision with root package name */
        private boolean f69182j = true;

        /* renamed from: k  reason: collision with root package name */
        private boolean f69183k = false;

        public d(ArrayList<b> arrayList, ArrayList<b> arrayList2, ListAdapter listAdapter) {
            boolean z4 = true;
            this.f69175c = listAdapter;
            this.f69181i = listAdapter instanceof Filterable;
            if (arrayList == null) {
                this.f69176d = f69173l;
            } else {
                this.f69176d = arrayList;
            }
            if (arrayList2 == null) {
                this.f69177e = f69173l;
            } else {
                this.f69177e = arrayList2;
            }
            this.f69180h = (a(this.f69176d) && a(this.f69177e)) ? false : false;
        }

        private boolean a(ArrayList<b> arrayList) {
            if (arrayList != null) {
                Iterator<b> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().f69171d) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }

        private int b() {
            double ceil = Math.ceil((this.f69175c.getCount() * 1.0f) / this.f69178f);
            double d5 = this.f69178f;
            Double.isNaN(d5);
            return (int) (ceil * d5);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f69175c;
            return listAdapter == null || (this.f69180h && listAdapter.areAllItemsEnabled());
        }

        public int c() {
            return this.f69177e.size();
        }

        public int d() {
            return this.f69176d.size();
        }

        public void e() {
            this.f69174b.notifyChanged();
        }

        public boolean f(View view) {
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f69177e.size(); i4++) {
                if (this.f69177e.get(i4).f69168a == view) {
                    this.f69177e.remove(i4);
                    if (a(this.f69176d) && a(this.f69177e)) {
                        z4 = true;
                    }
                    this.f69180h = z4;
                    this.f69174b.notifyChanged();
                    return true;
                }
            }
            return false;
        }

        public boolean g(View view) {
            boolean z4 = false;
            for (int i4 = 0; i4 < this.f69176d.size(); i4++) {
                if (this.f69176d.get(i4).f69168a == view) {
                    this.f69176d.remove(i4);
                    if (a(this.f69176d) && a(this.f69177e)) {
                        z4 = true;
                    }
                    this.f69180h = z4;
                    this.f69174b.notifyChanged();
                    return true;
                }
            }
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f69175c != null) {
                return ((c() + d()) * this.f69178f) + b();
            }
            return (c() + d()) * this.f69178f;
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            if (this.f69181i) {
                return ((Filterable) this.f69175c).getFilter();
            }
            return null;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            int d5 = d();
            int i5 = this.f69178f;
            int i6 = d5 * i5;
            if (i4 < i6) {
                if (i4 % i5 == 0) {
                    return this.f69176d.get(i4 / i5).f69170c;
                }
                return null;
            }
            int i7 = i4 - i6;
            int i8 = 0;
            if (this.f69175c != null && i7 < (i8 = b())) {
                if (i7 < this.f69175c.getCount()) {
                    return this.f69175c.getItem(i7);
                }
                return null;
            }
            int i9 = i7 - i8;
            if (i9 % this.f69178f == 0) {
                return this.f69177e.get(i9).f69170c;
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            int i5;
            int d5 = d() * this.f69178f;
            ListAdapter listAdapter = this.f69175c;
            if (listAdapter == null || i4 < d5 || (i5 = i4 - d5) >= listAdapter.getCount()) {
                return -1L;
            }
            return this.f69175c.getItemId(i5);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i4) {
            int i5;
            int i6;
            int d5 = d() * this.f69178f;
            ListAdapter listAdapter = this.f69175c;
            int viewTypeCount = listAdapter == null ? 0 : listAdapter.getViewTypeCount() - 1;
            int i7 = -2;
            if (this.f69182j && i4 < d5) {
                if (i4 == 0 && this.f69183k) {
                    i7 = this.f69176d.size() + viewTypeCount + this.f69177e.size() + 1 + 1;
                }
                int i8 = this.f69178f;
                if (i4 % i8 != 0) {
                    i7 = (i4 / i8) + 1 + viewTypeCount;
                }
            }
            int i9 = i4 - d5;
            if (this.f69175c != null) {
                i5 = b();
                if (i9 >= 0 && i9 < i5) {
                    if (i9 < this.f69175c.getCount()) {
                        i7 = this.f69175c.getItemViewType(i9);
                    } else if (this.f69182j) {
                        i7 = this.f69176d.size() + viewTypeCount + 1;
                    }
                }
            } else {
                i5 = 0;
            }
            if (this.f69182j && (i6 = i9 - i5) >= 0 && i6 < getCount() && i6 % this.f69178f != 0) {
                i7 = viewTypeCount + this.f69176d.size() + 1 + (i6 / this.f69178f) + 1;
            }
            if (GridViewWithHeaderAndFooter.f69153o) {
                String.format("getItemViewType: pos: %s, result: %s", Integer.valueOf(i4), Integer.valueOf(i7), Boolean.valueOf(this.f69182j), Boolean.valueOf(this.f69183k));
            }
            return i7;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int i5 = 0;
            if (GridViewWithHeaderAndFooter.f69153o) {
                Object[] objArr = new Object[2];
                objArr[0] = Integer.valueOf(i4);
                objArr[1] = Boolean.valueOf(view == null);
                String.format("getView: %s, reused: %s", objArr);
            }
            int d5 = d();
            int i6 = this.f69178f;
            int i7 = d5 * i6;
            if (i4 < i7) {
                ViewGroup viewGroup2 = this.f69176d.get(i4 / i6).f69169b;
                if (i4 % this.f69178f == 0) {
                    return viewGroup2;
                }
                if (view == null) {
                    view = new View(viewGroup.getContext());
                }
                view.setVisibility(4);
                view.setMinimumHeight(viewGroup2.getHeight());
                return view;
            }
            int i8 = i4 - i7;
            if (this.f69175c != null && i8 < (i5 = b())) {
                if (i8 < this.f69175c.getCount()) {
                    return this.f69175c.getView(i8, view, viewGroup);
                }
                if (view == null) {
                    view = new View(viewGroup.getContext());
                }
                view.setVisibility(4);
                view.setMinimumHeight(this.f69179g);
                return view;
            }
            int i9 = i8 - i5;
            if (i9 < getCount()) {
                ViewGroup viewGroup3 = this.f69177e.get(i9 / this.f69178f).f69169b;
                if (i4 % this.f69178f == 0) {
                    return viewGroup3;
                }
                if (view == null) {
                    view = new View(viewGroup.getContext());
                }
                view.setVisibility(4);
                view.setMinimumHeight(viewGroup3.getHeight());
                return view;
            }
            throw new ArrayIndexOutOfBoundsException(i4);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            ListAdapter listAdapter = this.f69175c;
            int viewTypeCount = listAdapter == null ? 1 : listAdapter.getViewTypeCount();
            if (this.f69182j) {
                int size = this.f69176d.size() + 1 + this.f69177e.size();
                if (this.f69183k) {
                    size++;
                }
                viewTypeCount += size;
            }
            if (GridViewWithHeaderAndFooter.f69153o) {
                String.format("getViewTypeCount: %s", Integer.valueOf(viewTypeCount));
            }
            return viewTypeCount;
        }

        @Override // android.widget.WrapperListAdapter
        public ListAdapter getWrappedAdapter() {
            return this.f69175c;
        }

        public void h(int i4) {
            if (i4 >= 1 && this.f69178f != i4) {
                this.f69178f = i4;
                e();
            }
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            ListAdapter listAdapter = this.f69175c;
            return listAdapter != null && listAdapter.hasStableIds();
        }

        public void i(int i4) {
            this.f69179g = i4;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            ListAdapter listAdapter = this.f69175c;
            return listAdapter == null || listAdapter.isEmpty();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i4) {
            int i5;
            int d5 = d();
            int i6 = this.f69178f;
            int i7 = d5 * i6;
            if (i4 < i7) {
                return i4 % i6 == 0 && this.f69176d.get(i4 / i6).f69171d;
            }
            int i8 = i4 - i7;
            if (this.f69175c != null) {
                i5 = b();
                if (i8 < i5) {
                    return i8 < this.f69175c.getCount() && this.f69175c.isEnabled(i8);
                }
            } else {
                i5 = 0;
            }
            int i9 = i8 - i5;
            int i10 = this.f69178f;
            return i9 % i10 == 0 && this.f69177e.get(i9 / i10).f69171d;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f69174b.registerObserver(dataSetObserver);
            ListAdapter listAdapter = this.f69175c;
            if (listAdapter != null) {
                listAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f69174b.unregisterObserver(dataSetObserver);
            ListAdapter listAdapter = this.f69175c;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public class e implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
        private e() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int headerViewCount;
            if (GridViewWithHeaderAndFooter.this.f69155b == null || (headerViewCount = i4 - (GridViewWithHeaderAndFooter.this.getHeaderViewCount() * GridViewWithHeaderAndFooter.this.getNumColumnsCompatible())) < 0) {
                return;
            }
            GridViewWithHeaderAndFooter.this.f69155b.onItemClick(adapterView, view, headerViewCount, j4);
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int headerViewCount;
            if (GridViewWithHeaderAndFooter.this.f69156c == null || (headerViewCount = i4 - (GridViewWithHeaderAndFooter.this.getHeaderViewCount() * GridViewWithHeaderAndFooter.this.getNumColumnsCompatible())) < 0) {
                return true;
            }
            GridViewWithHeaderAndFooter.this.f69156c.onItemLongClick(adapterView, view, headerViewCount, j4);
            return true;
        }
    }

    public GridViewWithHeaderAndFooter(Context context) {
        super(context);
        this.f69157d = -1;
        this.f69158e = null;
        this.f69159f = -1;
        this.f69160g = new ArrayList<>();
        this.f69161h = new ArrayList<>();
        i();
    }

    @TargetApi(16)
    private int getColumnWidthCompatible() {
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getColumnWidth();
        }
        try {
            Field declaredField = GridView.class.getDeclaredField("mColumnWidth");
            declaredField.setAccessible(true);
            return declaredField.getInt(this);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (NoSuchFieldException e6) {
            throw new RuntimeException(e6);
        }
    }

    private e getItemClickHandler() {
        if (this.f69163j == null) {
            this.f69163j = new e();
        }
        return this.f69163j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(11)
    public int getNumColumnsCompatible() {
        if (Build.VERSION.SDK_INT >= 11) {
            return super.getNumColumns();
        }
        try {
            Field declaredField = GridView.class.getDeclaredField("mNumColumns");
            declaredField.setAccessible(true);
            return declaredField.getInt(this);
        } catch (Exception unused) {
            int i4 = this.f69157d;
            if (i4 != -1) {
                return i4;
            }
            throw new RuntimeException("Can not determine the mNumColumns for this API platform, please call setNumColumns to set it.");
        }
    }

    private void i() {
    }

    private void k(View view, ArrayList<b> arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList.get(i4).f69168a == view) {
                arrayList.remove(i4);
                return;
            }
        }
    }

    public void d(View view) {
        e(view, null, true);
    }

    public void e(View view, Object obj, boolean z4) {
        ListAdapter adapter = getAdapter();
        if (adapter != null && !(adapter instanceof d)) {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        b bVar = new b();
        c cVar = new c(getContext());
        if (layoutParams != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height));
            cVar.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
        }
        cVar.addView(view);
        bVar.f69168a = view;
        bVar.f69169b = cVar;
        bVar.f69170c = obj;
        bVar.f69171d = z4;
        this.f69161h.add(bVar);
        if (adapter != null) {
            ((d) adapter).e();
        }
    }

    public void f(View view) {
        g(view, null, true);
    }

    public void g(View view, Object obj, boolean z4) {
        ListAdapter adapter = getAdapter();
        if (adapter != null && !(adapter instanceof d)) {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        b bVar = new b();
        c cVar = new c(getContext());
        if (layoutParams != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height));
            cVar.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
        }
        cVar.addView(view);
        bVar.f69168a = view;
        bVar.f69169b = cVar;
        bVar.f69170c = obj;
        bVar.f69171d = z4;
        this.f69160g.add(bVar);
        if (adapter != null) {
            ((d) adapter).e();
        }
    }

    public int getFooterViewCount() {
        return this.f69161h.size();
    }

    public int getHeaderViewCount() {
        return this.f69160g.size();
    }

    @Override // android.widget.GridView
    @TargetApi(16)
    public int getHorizontalSpacing() {
        int horizontalSpacing;
        try {
            if (Build.VERSION.SDK_INT < 16) {
                Field declaredField = GridView.class.getDeclaredField("mHorizontalSpacing");
                declaredField.setAccessible(true);
                horizontalSpacing = declaredField.getInt(this);
            } else {
                horizontalSpacing = super.getHorizontalSpacing();
            }
            return horizontalSpacing;
        } catch (Exception unused) {
            return 0;
        }
    }

    public ListAdapter getOriginalAdapter() {
        return this.f69162i;
    }

    public int getRowHeight() {
        int i4 = this.f69159f;
        if (i4 > 0) {
            return i4;
        }
        ListAdapter adapter = getAdapter();
        int numColumnsCompatible = getNumColumnsCompatible();
        if (adapter == null || adapter.getCount() <= (this.f69160g.size() + this.f69161h.size()) * numColumnsCompatible) {
            return -1;
        }
        int columnWidthCompatible = getColumnWidthCompatible();
        View view = getAdapter().getView(numColumnsCompatible * this.f69160g.size(), this.f69158e, this);
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(layoutParams);
        }
        view.measure(GridView.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(columnWidthCompatible, 1073741824), 0, layoutParams.width), GridView.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), 0, layoutParams.height));
        this.f69158e = view;
        int measuredHeight = view.getMeasuredHeight();
        this.f69159f = measuredHeight;
        return measuredHeight;
    }

    @Override // android.widget.GridView
    @TargetApi(16)
    public int getVerticalSpacing() {
        int verticalSpacing;
        try {
            if (Build.VERSION.SDK_INT < 16) {
                Field declaredField = GridView.class.getDeclaredField("mVerticalSpacing");
                declaredField.setAccessible(true);
                verticalSpacing = declaredField.getInt(this);
            } else {
                verticalSpacing = super.getVerticalSpacing();
            }
            return verticalSpacing;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int h(int i4) {
        if (i4 >= 0) {
            return this.f69160g.get(i4).f69168a.getMeasuredHeight();
        }
        return 0;
    }

    public void j() {
        this.f69159f = -1;
    }

    public boolean l(View view) {
        boolean z4 = false;
        if (this.f69161h.size() > 0) {
            ListAdapter adapter = getAdapter();
            if (adapter != null && ((d) adapter).f(view)) {
                z4 = true;
            }
            k(view, this.f69161h);
        }
        return z4;
    }

    public boolean m(View view) {
        boolean z4 = false;
        if (this.f69160g.size() > 0) {
            ListAdapter adapter = getAdapter();
            if (adapter != null && ((d) adapter).g(view)) {
                z4 = true;
            }
            k(view, this.f69160g);
        }
        return z4;
    }

    @TargetApi(11)
    public void n() {
        int count = getAdapter().getCount() - 1;
        if (Build.VERSION.SDK_INT >= 11) {
            smoothScrollToPositionFromTop(count, 0);
        } else {
            setSelection(count);
        }
    }

    @TargetApi(11)
    public void o(int i4) {
        int count = getAdapter().getCount() - 1;
        if (Build.VERSION.SDK_INT >= 11) {
            smoothScrollToPositionFromTop(count, 0, i4);
        } else {
            setSelection(count);
        }
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f69158e = null;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f69165l = 0.0f;
            this.f69164k = 0.0f;
            this.f69166m = motionEvent.getX();
            this.f69167n = motionEvent.getY();
        } else if (action == 2) {
            float x4 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f69164k += Math.abs(x4 - this.f69166m);
            float abs = this.f69165l + Math.abs(y2 - this.f69167n);
            this.f69165l = abs;
            this.f69166m = x4;
            this.f69167n = y2;
            if (this.f69164k > abs) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        ListAdapter adapter = getAdapter();
        if (adapter == null || !(adapter instanceof d)) {
            return;
        }
        d dVar = (d) adapter;
        dVar.h(getNumColumnsCompatible());
        dVar.i(getRowHeight());
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z4) {
    }

    public void setClipChildrenSupper(boolean z4) {
        super.setClipChildren(false);
    }

    @Override // android.widget.GridView
    public void setNumColumns(int i4) {
        super.setNumColumns(i4);
        this.f69157d = i4;
        ListAdapter adapter = getAdapter();
        if (adapter == null || !(adapter instanceof d)) {
            return;
        }
        ((d) adapter).h(i4);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f69155b = onItemClickListener;
        super.setOnItemClickListener(getItemClickHandler());
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f69156c = onItemLongClickListener;
        super.setOnItemLongClickListener(getItemClickHandler());
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        this.f69162i = listAdapter;
        if (this.f69160g.size() <= 0 && this.f69161h.size() <= 0) {
            super.setAdapter(listAdapter);
            return;
        }
        d dVar = new d(this.f69160g, this.f69161h, listAdapter);
        int numColumnsCompatible = getNumColumnsCompatible();
        if (numColumnsCompatible > 1) {
            dVar.h(numColumnsCompatible);
        }
        dVar.i(getRowHeight());
        super.setAdapter((ListAdapter) dVar);
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69157d = -1;
        this.f69158e = null;
        this.f69159f = -1;
        this.f69160g = new ArrayList<>();
        this.f69161h = new ArrayList<>();
        i();
    }

    public GridViewWithHeaderAndFooter(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f69157d = -1;
        this.f69158e = null;
        this.f69159f = -1;
        this.f69160g = new ArrayList<>();
        this.f69161h = new ArrayList<>();
        i();
    }
}
