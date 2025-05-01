package com.papa91.arc.widget.listview;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Build;
import android.util.AttributeSet;
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
/* loaded from: classes5.dex */
public class GridViewSupport extends GridView {
    private ArrayList<FixedViewInfo> mFooterViewInfos;
    private ArrayList<FixedViewInfo> mHeaderViewInfos;
    private ItemClickHandler mItemClickHandler;
    private int mNumColumns;
    private AdapterView.OnItemClickListener mOnItemClickListener;
    private AdapterView.OnItemLongClickListener mOnItemLongClickListener;
    private AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private ArrayList<AdapterView.OnItemSelectedListener> mOnItemSelectedListenerList;
    private AbsListView.OnScrollListener mOnScrollListener;
    private ArrayList<AbsListView.OnScrollListener> mOnScrollListenerList;
    private ListAdapter mOriginalAdapter;
    private int mRowHeight;
    private View mViewForMeasureRowHeight;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class FixedViewInfo {
        public Object data;
        public boolean isSelectable;
        public View view;
        public ViewGroup viewContainer;

        private FixedViewInfo() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class FullWidthFixedViewLayout extends FrameLayout {
        public FullWidthFixedViewLayout(Context context) {
            super(context);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
            int paddingLeft = GridViewSupport.this.getPaddingLeft() + getPaddingLeft();
            if (paddingLeft != i4) {
                offsetLeftAndRight(paddingLeft - i4);
            }
            super.onLayout(z4, i4, i5, i6, i7);
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i4, int i5) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((GridViewSupport.this.getMeasuredWidth() - GridViewSupport.this.getPaddingLeft()) - GridViewSupport.this.getPaddingRight(), View.MeasureSpec.getMode(i4)), i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class HeaderViewGridAdapter implements WrapperListAdapter, Filterable {
        static final ArrayList<FixedViewInfo> EMPTY_INFO_LIST = new ArrayList<>();
        private final ListAdapter mAdapter;
        boolean mAreAllFixedViewsSelectable;
        ArrayList<FixedViewInfo> mFooterViewInfos;
        ArrayList<FixedViewInfo> mHeaderViewInfos;
        private final boolean mIsFilterable;
        private final DataSetObservable mDataSetObservable = new DataSetObservable();
        private int mNumColumns = 1;
        private int mRowHeight = -1;
        private boolean mCachePlaceHoldView = true;
        private boolean mCacheFirstHeaderView = false;

        public HeaderViewGridAdapter(ArrayList<FixedViewInfo> arrayList, ArrayList<FixedViewInfo> arrayList2, ListAdapter listAdapter) {
            boolean z4 = true;
            this.mAdapter = listAdapter;
            this.mIsFilterable = listAdapter instanceof Filterable;
            if (arrayList == null) {
                this.mHeaderViewInfos = EMPTY_INFO_LIST;
            } else {
                this.mHeaderViewInfos = arrayList;
            }
            if (arrayList2 == null) {
                this.mFooterViewInfos = EMPTY_INFO_LIST;
            } else {
                this.mFooterViewInfos = arrayList2;
            }
            this.mAreAllFixedViewsSelectable = (areAllListInfosSelectable(this.mHeaderViewInfos) && areAllListInfosSelectable(this.mFooterViewInfos)) ? false : false;
        }

        private boolean areAllListInfosSelectable(ArrayList<FixedViewInfo> arrayList) {
            if (arrayList != null) {
                Iterator<FixedViewInfo> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (!it2.next().isSelectable) {
                        return false;
                    }
                }
                return true;
            }
            return true;
        }

        private int getAdapterAndPlaceHolderCount() {
            double ceil = Math.ceil((this.mAdapter.getCount() * 1.0f) / this.mNumColumns);
            double d5 = this.mNumColumns;
            Double.isNaN(d5);
            return (int) (ceil * d5);
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.mAdapter;
            return listAdapter == null || (this.mAreAllFixedViewsSelectable && listAdapter.areAllItemsEnabled());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.mAdapter != null) {
                return ((getFootersCount() + getHeadersCount()) * this.mNumColumns) + getAdapterAndPlaceHolderCount();
            }
            return (getFootersCount() + getHeadersCount()) * this.mNumColumns;
        }

        @Override // android.widget.Filterable
        public Filter getFilter() {
            if (this.mIsFilterable) {
                return ((Filterable) this.mAdapter).getFilter();
            }
            return null;
        }

        public int getFootersCount() {
            return this.mFooterViewInfos.size();
        }

        public int getHeadersCount() {
            return this.mHeaderViewInfos.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            int headersCount = getHeadersCount();
            int i5 = this.mNumColumns;
            int i6 = headersCount * i5;
            if (i4 < i6) {
                if (i4 % i5 == 0) {
                    return this.mHeaderViewInfos.get(i4 / i5).data;
                }
                return null;
            }
            int i7 = i4 - i6;
            int i8 = 0;
            if (this.mAdapter != null && i7 < (i8 = getAdapterAndPlaceHolderCount())) {
                if (i7 < this.mAdapter.getCount()) {
                    return this.mAdapter.getItem(i7);
                }
                return null;
            }
            int i9 = i7 - i8;
            if (i9 % this.mNumColumns == 0) {
                return this.mFooterViewInfos.get(i9).data;
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            int i5;
            int headersCount = getHeadersCount() * this.mNumColumns;
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter == null || i4 < headersCount || (i5 = i4 - headersCount) >= listAdapter.getCount()) {
                return -1L;
            }
            return this.mAdapter.getItemId(i5);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i4) {
            int i5;
            int headersCount = getHeadersCount() * this.mNumColumns;
            ListAdapter listAdapter = this.mAdapter;
            int i6 = 0;
            int viewTypeCount = listAdapter == null ? 0 : listAdapter.getViewTypeCount() - 1;
            int i7 = -2;
            if (this.mCachePlaceHoldView && i4 < headersCount) {
                if (i4 == 0 && this.mCacheFirstHeaderView) {
                    i7 = this.mHeaderViewInfos.size() + viewTypeCount + this.mFooterViewInfos.size() + 1 + 1;
                }
                int i8 = this.mNumColumns;
                if (i4 % i8 != 0) {
                    i7 = (i4 / i8) + 1 + viewTypeCount;
                }
            }
            int i9 = i4 - headersCount;
            if (this.mAdapter != null) {
                i6 = getAdapterAndPlaceHolderCount();
                if (i9 >= 0 && i9 < i6) {
                    if (i9 < this.mAdapter.getCount()) {
                        i7 = this.mAdapter.getItemViewType(i9);
                    } else if (this.mCachePlaceHoldView) {
                        i7 = this.mHeaderViewInfos.size() + viewTypeCount + 1;
                    }
                }
            }
            return (!this.mCachePlaceHoldView || (i5 = i9 - i6) < 0 || i5 >= getCount() || i5 % this.mNumColumns == 0) ? i7 : viewTypeCount + this.mHeaderViewInfos.size() + 1 + (i5 / this.mNumColumns) + 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            int headersCount = getHeadersCount();
            int i5 = this.mNumColumns;
            int i6 = headersCount * i5;
            if (i4 < i6) {
                ViewGroup viewGroup2 = this.mHeaderViewInfos.get(i4 / i5).viewContainer;
                if (i4 % this.mNumColumns == 0) {
                    return viewGroup2;
                }
                if (view == null) {
                    view = new View(viewGroup.getContext());
                }
                view.setVisibility(4);
                view.setMinimumHeight(viewGroup2.getHeight());
                return view;
            }
            int i7 = i4 - i6;
            int i8 = 0;
            if (this.mAdapter != null && i7 < (i8 = getAdapterAndPlaceHolderCount())) {
                if (i7 < this.mAdapter.getCount()) {
                    return this.mAdapter.getView(i7, view, viewGroup);
                }
                if (view == null) {
                    view = new View(viewGroup.getContext());
                }
                view.setVisibility(4);
                view.setMinimumHeight(this.mRowHeight);
                return view;
            }
            int i9 = i7 - i8;
            if (i9 < getCount()) {
                ViewGroup viewGroup3 = this.mFooterViewInfos.get(i9 / this.mNumColumns).viewContainer;
                if (i4 % this.mNumColumns == 0) {
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
            ListAdapter listAdapter = this.mAdapter;
            int viewTypeCount = listAdapter == null ? 1 : listAdapter.getViewTypeCount();
            if (this.mCachePlaceHoldView) {
                int size = this.mHeaderViewInfos.size() + 1 + this.mFooterViewInfos.size();
                if (this.mCacheFirstHeaderView) {
                    size++;
                }
                return viewTypeCount + size;
            }
            return viewTypeCount;
        }

        @Override // android.widget.WrapperListAdapter
        public ListAdapter getWrappedAdapter() {
            return this.mAdapter;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            ListAdapter listAdapter = this.mAdapter;
            return listAdapter != null && listAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            ListAdapter listAdapter = this.mAdapter;
            return listAdapter == null || listAdapter.isEmpty();
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i4) {
            int i5;
            int headersCount = getHeadersCount();
            int i6 = this.mNumColumns;
            int i7 = headersCount * i6;
            if (i4 < i7) {
                return i4 % i6 == 0 && this.mHeaderViewInfos.get(i4 / i6).isSelectable;
            }
            int i8 = i4 - i7;
            if (this.mAdapter != null) {
                i5 = getAdapterAndPlaceHolderCount();
                if (i8 < i5) {
                    return i8 < this.mAdapter.getCount() && this.mAdapter.isEnabled(i8);
                }
            } else {
                i5 = 0;
            }
            int i9 = i8 - i5;
            int i10 = this.mNumColumns;
            return i9 % i10 == 0 && this.mFooterViewInfos.get(i9 / i10).isSelectable;
        }

        public void notifyDataSetChanged() {
            this.mDataSetObservable.notifyChanged();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.mDataSetObservable.registerObserver(dataSetObserver);
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                listAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public boolean removeFooter(View view) {
            boolean z4 = false;
            for (int i4 = 0; i4 < this.mFooterViewInfos.size(); i4++) {
                if (this.mFooterViewInfos.get(i4).view == view) {
                    this.mFooterViewInfos.remove(i4);
                    if (areAllListInfosSelectable(this.mHeaderViewInfos) && areAllListInfosSelectable(this.mFooterViewInfos)) {
                        z4 = true;
                    }
                    this.mAreAllFixedViewsSelectable = z4;
                    this.mDataSetObservable.notifyChanged();
                    return true;
                }
            }
            return false;
        }

        public boolean removeHeader(View view) {
            boolean z4 = false;
            for (int i4 = 0; i4 < this.mHeaderViewInfos.size(); i4++) {
                if (this.mHeaderViewInfos.get(i4).view == view) {
                    this.mHeaderViewInfos.remove(i4);
                    if (areAllListInfosSelectable(this.mHeaderViewInfos) && areAllListInfosSelectable(this.mFooterViewInfos)) {
                        z4 = true;
                    }
                    this.mAreAllFixedViewsSelectable = z4;
                    this.mDataSetObservable.notifyChanged();
                    return true;
                }
            }
            return false;
        }

        public void setNumColumns(int i4) {
            if (i4 >= 1 && this.mNumColumns != i4) {
                this.mNumColumns = i4;
                notifyDataSetChanged();
            }
        }

        public void setRowHeight(int i4) {
            this.mRowHeight = i4;
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.mDataSetObservable.unregisterObserver(dataSetObserver);
            ListAdapter listAdapter = this.mAdapter;
            if (listAdapter != null) {
                listAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class ItemClickHandler implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {
        private ItemClickHandler() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int headerViewCount;
            if (GridViewSupport.this.mOnItemClickListener == null || (headerViewCount = i4 - (GridViewSupport.this.getHeaderViewCount() * GridViewSupport.this.getNumColumnsCompatible())) < 0) {
                return;
            }
            GridViewSupport.this.mOnItemClickListener.onItemClick(adapterView, view, headerViewCount, j4);
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            int headerViewCount;
            if (GridViewSupport.this.mOnItemLongClickListener == null || (headerViewCount = i4 - (GridViewSupport.this.getHeaderViewCount() * GridViewSupport.this.getNumColumnsCompatible())) < 0) {
                return true;
            }
            GridViewSupport.this.mOnItemLongClickListener.onItemLongClick(adapterView, view, headerViewCount, j4);
            return true;
        }
    }

    public GridViewSupport(Context context) {
        super(context);
        this.mNumColumns = -1;
        this.mViewForMeasureRowHeight = null;
        this.mRowHeight = -1;
        this.mHeaderViewInfos = new ArrayList<>();
        this.mFooterViewInfos = new ArrayList<>();
        this.mOnScrollListenerList = new ArrayList<>();
        this.mOnItemSelectedListenerList = new ArrayList<>();
        this.mOnScrollListener = new AbsListView.OnScrollListener() { // from class: com.papa91.arc.widget.listview.GridViewSupport.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
                Iterator it2 = GridViewSupport.this.mOnScrollListenerList.iterator();
                while (it2.hasNext()) {
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) it2.next();
                    if (onScrollListener != null) {
                        onScrollListener.onScroll(absListView, i4, i5, i6);
                    }
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i4) {
                Iterator it2 = GridViewSupport.this.mOnScrollListenerList.iterator();
                while (it2.hasNext()) {
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) it2.next();
                    if (onScrollListener != null) {
                        onScrollListener.onScrollStateChanged(absListView, i4);
                    }
                }
            }
        };
        this.mOnItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: com.papa91.arc.widget.listview.GridViewSupport.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
                Iterator it2 = GridViewSupport.this.mOnItemSelectedListenerList.iterator();
                while (it2.hasNext()) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = (AdapterView.OnItemSelectedListener) it2.next();
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onItemSelected(adapterView, view, i4, j4);
                    }
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                Iterator it2 = GridViewSupport.this.mOnItemSelectedListenerList.iterator();
                while (it2.hasNext()) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = (AdapterView.OnItemSelectedListener) it2.next();
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onNothingSelected(adapterView);
                    }
                }
            }
        };
        initHeaderGridView();
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

    private ItemClickHandler getItemClickHandler() {
        if (this.mItemClickHandler == null) {
            this.mItemClickHandler = new ItemClickHandler();
        }
        return this.mItemClickHandler;
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
            int i4 = this.mNumColumns;
            if (i4 != -1) {
                return i4;
            }
            throw new RuntimeException("Can not determine the mNumColumns for this API platform, please call setNumColumns to set it.");
        }
    }

    private void initHeaderGridView() {
        setOnScrollListener(this.mOnScrollListener);
        setOnItemSelectedListener(this.mOnItemSelectedListener);
    }

    private void removeFixedViewInfo(View view, ArrayList<FixedViewInfo> arrayList) {
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (arrayList.get(i4).view == view) {
                arrayList.remove(i4);
                return;
            }
        }
    }

    public void addFooterView(View view) {
        addFooterView(view, null, true);
    }

    public void addHeaderView(View view) {
        addHeaderView(view, null, true);
    }

    public void addOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener == null || this.mOnItemSelectedListenerList.contains(onItemSelectedListener)) {
            return;
        }
        this.mOnItemSelectedListenerList.add(onItemSelectedListener);
    }

    public void addOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener == null || this.mOnScrollListenerList.contains(onScrollListener)) {
            return;
        }
        this.mOnScrollListenerList.add(onScrollListener);
    }

    public int getFooterViewCount() {
        return this.mFooterViewInfos.size();
    }

    public int getHeaderHeight(int i4) {
        if (i4 >= 0) {
            return this.mHeaderViewInfos.get(i4).view.getMeasuredHeight();
        }
        return 0;
    }

    public int getHeaderViewCount() {
        return this.mHeaderViewInfos.size();
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
        return this.mOriginalAdapter;
    }

    public int getRowHeight() {
        int i4 = this.mRowHeight;
        if (i4 > 0) {
            return i4;
        }
        ListAdapter adapter = getAdapter();
        int numColumnsCompatible = getNumColumnsCompatible();
        if (adapter == null || adapter.getCount() <= (this.mHeaderViewInfos.size() + this.mFooterViewInfos.size()) * numColumnsCompatible) {
            return -1;
        }
        int columnWidthCompatible = getColumnWidthCompatible();
        View view = getAdapter().getView(numColumnsCompatible * this.mHeaderViewInfos.size(), this.mViewForMeasureRowHeight, this);
        AbsListView.LayoutParams layoutParams = (AbsListView.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new AbsListView.LayoutParams(-1, -2, 0);
            view.setLayoutParams(layoutParams);
        }
        view.measure(GridView.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(columnWidthCompatible, 1073741824), 0, layoutParams.width), GridView.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(0, 0), 0, layoutParams.height));
        this.mViewForMeasureRowHeight = view;
        int measuredHeight = view.getMeasuredHeight();
        this.mRowHeight = measuredHeight;
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

    public void invalidateRowHeight() {
        this.mRowHeight = -1;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mViewForMeasureRowHeight = null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        ListAdapter adapter = getAdapter();
        if (adapter == null || !(adapter instanceof HeaderViewGridAdapter)) {
            return;
        }
        HeaderViewGridAdapter headerViewGridAdapter = (HeaderViewGridAdapter) adapter;
        headerViewGridAdapter.setNumColumns(getNumColumnsCompatible());
        headerViewGridAdapter.setRowHeight(getRowHeight());
    }

    public boolean removeFooterView(View view) {
        boolean z4 = false;
        if (this.mFooterViewInfos.size() > 0) {
            ListAdapter adapter = getAdapter();
            if (adapter != null && ((HeaderViewGridAdapter) adapter).removeFooter(view)) {
                z4 = true;
            }
            removeFixedViewInfo(view, this.mFooterViewInfos);
        }
        return z4;
    }

    public boolean removeHeaderView(View view) {
        boolean z4 = false;
        if (this.mHeaderViewInfos.size() > 0) {
            ListAdapter adapter = getAdapter();
            if (adapter != null && ((HeaderViewGridAdapter) adapter).removeHeader(view)) {
                z4 = true;
            }
            removeFixedViewInfo(view, this.mHeaderViewInfos);
        }
        return z4;
    }

    public void removeOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        if (onItemSelectedListener != null) {
            this.mOnItemSelectedListenerList.remove(onItemSelectedListener);
        }
    }

    public void removeOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        if (onScrollListener != null) {
            this.mOnScrollListenerList.remove(onScrollListener);
        }
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
        this.mNumColumns = i4;
        ListAdapter adapter = getAdapter();
        if (adapter == null || !(adapter instanceof HeaderViewGridAdapter)) {
            return;
        }
        ((HeaderViewGridAdapter) adapter).setNumColumns(i4);
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
        super.setOnItemClickListener(getItemClickHandler());
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.mOnItemLongClickListener = onItemLongClickListener;
        super.setOnItemLongClickListener(getItemClickHandler());
    }

    @Override // android.widget.AdapterView
    @Deprecated
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
    }

    @Override // android.widget.AbsListView
    @Deprecated
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        super.setOnScrollListener(onScrollListener);
    }

    @TargetApi(11)
    public void tryToScrollToBottomSmoothly() {
        int count = getAdapter().getCount() - 1;
        if (Build.VERSION.SDK_INT >= 11) {
            smoothScrollToPositionFromTop(count, 0);
        } else {
            setSelection(count);
        }
    }

    public void addFooterView(View view, Object obj, boolean z4) {
        ListAdapter adapter = getAdapter();
        if (adapter != null && !(adapter instanceof HeaderViewGridAdapter)) {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FixedViewInfo fixedViewInfo = new FixedViewInfo();
        FullWidthFixedViewLayout fullWidthFixedViewLayout = new FullWidthFixedViewLayout(getContext());
        if (layoutParams != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height));
            fullWidthFixedViewLayout.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
        }
        fullWidthFixedViewLayout.addView(view);
        fixedViewInfo.view = view;
        fixedViewInfo.viewContainer = fullWidthFixedViewLayout;
        fixedViewInfo.data = obj;
        fixedViewInfo.isSelectable = z4;
        this.mFooterViewInfos.add(fixedViewInfo);
        if (adapter != null) {
            ((HeaderViewGridAdapter) adapter).notifyDataSetChanged();
        }
    }

    public void addHeaderView(View view, Object obj, boolean z4) {
        ListAdapter adapter = getAdapter();
        if (adapter != null && !(adapter instanceof HeaderViewGridAdapter)) {
            throw new IllegalStateException("Cannot add header view to grid -- setAdapter has already been called.");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        FixedViewInfo fixedViewInfo = new FixedViewInfo();
        FullWidthFixedViewLayout fullWidthFixedViewLayout = new FullWidthFixedViewLayout(getContext());
        if (layoutParams != null) {
            view.setLayoutParams(new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height));
            fullWidthFixedViewLayout.setLayoutParams(new AbsListView.LayoutParams(layoutParams.width, layoutParams.height));
        }
        fullWidthFixedViewLayout.addView(view);
        fixedViewInfo.view = view;
        fixedViewInfo.viewContainer = fullWidthFixedViewLayout;
        fixedViewInfo.data = obj;
        fixedViewInfo.isSelectable = z4;
        this.mHeaderViewInfos.add(fixedViewInfo);
        if (adapter != null) {
            ((HeaderViewGridAdapter) adapter).notifyDataSetChanged();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        this.mOriginalAdapter = listAdapter;
        if (this.mHeaderViewInfos.size() <= 0 && this.mFooterViewInfos.size() <= 0) {
            super.setAdapter(listAdapter);
            return;
        }
        HeaderViewGridAdapter headerViewGridAdapter = new HeaderViewGridAdapter(this.mHeaderViewInfos, this.mFooterViewInfos, listAdapter);
        int numColumnsCompatible = getNumColumnsCompatible();
        if (numColumnsCompatible > 1) {
            headerViewGridAdapter.setNumColumns(numColumnsCompatible);
        }
        headerViewGridAdapter.setRowHeight(getRowHeight());
        super.setAdapter((ListAdapter) headerViewGridAdapter);
    }

    @TargetApi(11)
    public void tryToScrollToBottomSmoothly(int i4) {
        int count = getAdapter().getCount() - 1;
        if (Build.VERSION.SDK_INT >= 11) {
            smoothScrollToPositionFromTop(count, 0, i4);
        } else {
            setSelection(count);
        }
    }

    public GridViewSupport(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mNumColumns = -1;
        this.mViewForMeasureRowHeight = null;
        this.mRowHeight = -1;
        this.mHeaderViewInfos = new ArrayList<>();
        this.mFooterViewInfos = new ArrayList<>();
        this.mOnScrollListenerList = new ArrayList<>();
        this.mOnItemSelectedListenerList = new ArrayList<>();
        this.mOnScrollListener = new AbsListView.OnScrollListener() { // from class: com.papa91.arc.widget.listview.GridViewSupport.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
                Iterator it2 = GridViewSupport.this.mOnScrollListenerList.iterator();
                while (it2.hasNext()) {
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) it2.next();
                    if (onScrollListener != null) {
                        onScrollListener.onScroll(absListView, i4, i5, i6);
                    }
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i4) {
                Iterator it2 = GridViewSupport.this.mOnScrollListenerList.iterator();
                while (it2.hasNext()) {
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) it2.next();
                    if (onScrollListener != null) {
                        onScrollListener.onScrollStateChanged(absListView, i4);
                    }
                }
            }
        };
        this.mOnItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: com.papa91.arc.widget.listview.GridViewSupport.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
                Iterator it2 = GridViewSupport.this.mOnItemSelectedListenerList.iterator();
                while (it2.hasNext()) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = (AdapterView.OnItemSelectedListener) it2.next();
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onItemSelected(adapterView, view, i4, j4);
                    }
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                Iterator it2 = GridViewSupport.this.mOnItemSelectedListenerList.iterator();
                while (it2.hasNext()) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = (AdapterView.OnItemSelectedListener) it2.next();
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onNothingSelected(adapterView);
                    }
                }
            }
        };
        initHeaderGridView();
    }

    public GridViewSupport(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.mNumColumns = -1;
        this.mViewForMeasureRowHeight = null;
        this.mRowHeight = -1;
        this.mHeaderViewInfos = new ArrayList<>();
        this.mFooterViewInfos = new ArrayList<>();
        this.mOnScrollListenerList = new ArrayList<>();
        this.mOnItemSelectedListenerList = new ArrayList<>();
        this.mOnScrollListener = new AbsListView.OnScrollListener() { // from class: com.papa91.arc.widget.listview.GridViewSupport.1
            @Override // android.widget.AbsListView.OnScrollListener
            public void onScroll(AbsListView absListView, int i42, int i5, int i6) {
                Iterator it2 = GridViewSupport.this.mOnScrollListenerList.iterator();
                while (it2.hasNext()) {
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) it2.next();
                    if (onScrollListener != null) {
                        onScrollListener.onScroll(absListView, i42, i5, i6);
                    }
                }
            }

            @Override // android.widget.AbsListView.OnScrollListener
            public void onScrollStateChanged(AbsListView absListView, int i42) {
                Iterator it2 = GridViewSupport.this.mOnScrollListenerList.iterator();
                while (it2.hasNext()) {
                    AbsListView.OnScrollListener onScrollListener = (AbsListView.OnScrollListener) it2.next();
                    if (onScrollListener != null) {
                        onScrollListener.onScrollStateChanged(absListView, i42);
                    }
                }
            }
        };
        this.mOnItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: com.papa91.arc.widget.listview.GridViewSupport.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i42, long j4) {
                Iterator it2 = GridViewSupport.this.mOnItemSelectedListenerList.iterator();
                while (it2.hasNext()) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = (AdapterView.OnItemSelectedListener) it2.next();
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onItemSelected(adapterView, view, i42, j4);
                    }
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
                Iterator it2 = GridViewSupport.this.mOnItemSelectedListenerList.iterator();
                while (it2.hasNext()) {
                    AdapterView.OnItemSelectedListener onItemSelectedListener = (AdapterView.OnItemSelectedListener) it2.next();
                    if (onItemSelectedListener != null) {
                        onItemSelectedListener.onNothingSelected(adapterView);
                    }
                }
            }
        };
        initHeaderGridView();
    }
}
