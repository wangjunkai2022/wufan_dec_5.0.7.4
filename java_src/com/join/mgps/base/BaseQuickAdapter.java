package com.join.mgps.base;

import android.animation.Animator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.join.mgps.base.BaseViewHolder;
import com.join.mgps.base.diff.BaseQuickAdapterListUpdateCallback;
import com.join.mgps.base.diff.BaseQuickDiffCallback;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes4.dex */
public abstract class BaseQuickAdapter<T, K extends BaseViewHolder> extends RecyclerView.Adapter<K> {
    public static final int ALPHAIN = 1;
    public static final int EMPTY_VIEW = 1365;
    public static final int FOOTER_VIEW = 819;
    public static final int HEADER_VIEW = 273;
    public static final int LOADING_VIEW = 546;
    public static final int SCALEIN = 2;
    public static final int SLIDEIN_BOTTOM = 3;
    public static final int SLIDEIN_LEFT = 4;
    public static final int SLIDEIN_RIGHT = 5;
    protected static final String TAG = "BaseQuickAdapter";
    private boolean footerViewAsFlow;
    private boolean headerViewAsFlow;
    protected Context mContext;
    private t1.b mCustomAnimation;
    protected List<T> mData;
    private int mDuration;
    private FrameLayout mEmptyLayout;
    private boolean mEnableLoadMoreEndClick;
    private boolean mFirstOnlyEnable;
    private boolean mFootAndEmptyEnable;
    private LinearLayout mFooterLayout;
    private boolean mHeadAndEmptyEnable;
    private LinearLayout mHeaderLayout;
    private Interpolator mInterpolator;
    private boolean mIsUseEmpty;
    private int mLastPosition;
    protected LayoutInflater mLayoutInflater;
    protected int mLayoutResId;
    private boolean mLoadMoreEnable;
    private com.join.mgps.base.a mLoadMoreView;
    private boolean mLoading;
    private boolean mNextLoadEnable;
    private h mOnItemChildClickListener;
    private i mOnItemChildLongClickListener;
    private j mOnItemClickListener;
    private k mOnItemLongClickListener;
    private boolean mOpenAnimationEnable;
    private int mPreLoadNumber;
    private RecyclerView mRecyclerView;
    private l mRequestLoadMoreListener;
    private t1.b mSelectAnimation;
    private m mSpanSizeLookup;
    private int mStartUpFetchPosition;
    private boolean mUpFetchEnable;
    private n mUpFetchListener;
    private boolean mUpFetching;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AnimationType {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f46203b;

        a(LinearLayoutManager linearLayoutManager) {
            this.f46203b = linearLayoutManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseQuickAdapter.this.isFullScreen(this.f46203b)) {
                BaseQuickAdapter.this.setEnableLoadMore(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ StaggeredGridLayoutManager f46205b;

        b(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f46205b = staggeredGridLayoutManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] iArr = new int[this.f46205b.getSpanCount()];
            this.f46205b.findLastCompletelyVisibleItemPositions(iArr);
            if (BaseQuickAdapter.this.getTheBiggestNumber(iArr) + 1 != BaseQuickAdapter.this.getItemCount()) {
                BaseQuickAdapter.this.setEnableLoadMore(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (BaseQuickAdapter.this.mLoadMoreView.e() == 3) {
                BaseQuickAdapter.this.notifyLoadMoreToLoading();
            }
            if (BaseQuickAdapter.this.mEnableLoadMoreEndClick && BaseQuickAdapter.this.mLoadMoreView.e() == 4) {
                BaseQuickAdapter.this.notifyLoadMoreToLoading();
            }
        }
    }

    /* loaded from: classes4.dex */
    class d extends GridLayoutManager.SpanSizeLookup {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager f46208a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ GridLayoutManager.SpanSizeLookup f46209b;

        d(GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
            this.f46208a = gridLayoutManager;
            this.f46209b = spanSizeLookup;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i4) {
            int itemViewType = BaseQuickAdapter.this.getItemViewType(i4);
            if (itemViewType == 273 && BaseQuickAdapter.this.isHeaderViewAsFlow()) {
                return 1;
            }
            if (itemViewType == 819 && BaseQuickAdapter.this.isFooterViewAsFlow()) {
                return 1;
            }
            return BaseQuickAdapter.this.mSpanSizeLookup == null ? BaseQuickAdapter.this.isFixedViewType(itemViewType) ? this.f46208a.getSpanCount() : this.f46209b.getSpanSize(i4) : BaseQuickAdapter.this.isFixedViewType(itemViewType) ? this.f46208a.getSpanCount() : BaseQuickAdapter.this.mSpanSizeLookup.a(this.f46208a, i4 - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class e implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseViewHolder f46211b;

        e(BaseViewHolder baseViewHolder) {
            this.f46211b = baseViewHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int adapterPosition = this.f46211b.getAdapterPosition();
            if (adapterPosition == -1) {
                return;
            }
            BaseQuickAdapter.this.setOnItemClick(view, adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class f implements View.OnLongClickListener {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseViewHolder f46213b;

        f(BaseViewHolder baseViewHolder) {
            this.f46213b = baseViewHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int adapterPosition = this.f46213b.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            return BaseQuickAdapter.this.setOnItemLongClick(view, adapterPosition - BaseQuickAdapter.this.getHeaderLayoutCount());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseQuickAdapter.this.mRequestLoadMoreListener.onLoadMoreRequested();
        }
    }

    /* loaded from: classes4.dex */
    public interface h {
        void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i4);
    }

    /* loaded from: classes4.dex */
    public interface i {
        boolean a(BaseQuickAdapter baseQuickAdapter, View view, int i4);
    }

    /* loaded from: classes4.dex */
    public interface j {
        void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i4);
    }

    /* loaded from: classes4.dex */
    public interface k {
        boolean a(BaseQuickAdapter baseQuickAdapter, View view, int i4);
    }

    /* loaded from: classes4.dex */
    public interface l {
        void onLoadMoreRequested();
    }

    /* loaded from: classes4.dex */
    public interface m {
        int a(GridLayoutManager gridLayoutManager, int i4);
    }

    /* loaded from: classes4.dex */
    public interface n {
        void a();
    }

    public BaseQuickAdapter(@LayoutRes int i4, @Nullable List<T> list) {
        this.mNextLoadEnable = false;
        this.mLoadMoreEnable = false;
        this.mLoading = false;
        this.mLoadMoreView = new com.join.mgps.base.b();
        this.mEnableLoadMoreEndClick = false;
        this.mFirstOnlyEnable = true;
        this.mOpenAnimationEnable = false;
        this.mInterpolator = new LinearInterpolator();
        this.mDuration = 300;
        this.mLastPosition = -1;
        this.mSelectAnimation = new t1.a();
        this.mIsUseEmpty = true;
        this.mPreLoadNumber = 1;
        this.mStartUpFetchPosition = 1;
        this.mData = list == null ? new ArrayList<>() : list;
        if (i4 != 0) {
            this.mLayoutResId = i4;
        }
    }

    private void addAnimation(RecyclerView.ViewHolder viewHolder) {
        if (this.mOpenAnimationEnable) {
            if (!this.mFirstOnlyEnable || viewHolder.getLayoutPosition() > this.mLastPosition) {
                t1.b bVar = this.mCustomAnimation;
                if (bVar == null) {
                    bVar = this.mSelectAnimation;
                }
                for (Animator animator : bVar.a(viewHolder.itemView)) {
                    startAnim(animator, viewHolder.getLayoutPosition());
                }
                this.mLastPosition = viewHolder.getLayoutPosition();
            }
        }
    }

    private void autoLoadMore(int i4) {
        if (getLoadMoreViewCount() != 0 && i4 >= getItemCount() - this.mPreLoadNumber && this.mLoadMoreView.e() == 1) {
            this.mLoadMoreView.j(2);
            if (this.mLoading) {
                return;
            }
            this.mLoading = true;
            if (getRecyclerView() != null) {
                getRecyclerView().post(new g());
            } else {
                this.mRequestLoadMoreListener.onLoadMoreRequested();
            }
        }
    }

    private void autoUpFetch(int i4) {
        n nVar;
        if (!isUpFetchEnable() || isUpFetching() || i4 > this.mStartUpFetchPosition || (nVar = this.mUpFetchListener) == null) {
            return;
        }
        nVar.a();
    }

    private void checkNotNull() {
        if (getRecyclerView() == null) {
            throw new IllegalStateException("please bind recyclerView first!");
        }
    }

    private void compatibilityDataSizeChanged(int i4) {
        List<T> list = this.mData;
        if ((list == null ? 0 : list.size()) == i4) {
            notifyDataSetChanged();
        }
    }

    private K createGenericKInstance(Class cls, View view) {
        try {
            if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers())) {
                Constructor<T> declaredConstructor = cls.getDeclaredConstructor(getClass(), View.class);
                declaredConstructor.setAccessible(true);
                return (K) declaredConstructor.newInstance(this, view);
            }
            Constructor<T> declaredConstructor2 = cls.getDeclaredConstructor(View.class);
            declaredConstructor2.setAccessible(true);
            return (K) declaredConstructor2.newInstance(view);
        } catch (IllegalAccessException e5) {
            e5.printStackTrace();
            return null;
        } catch (InstantiationException e6) {
            e6.printStackTrace();
            return null;
        } catch (NoSuchMethodException e7) {
            e7.printStackTrace();
            return null;
        } catch (InvocationTargetException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private u1.a getExpandableItem(int i4) {
        T item = getItem(i4);
        if (isExpandable(item)) {
            return (u1.a) item;
        }
        return null;
    }

    private int getFooterViewPosition() {
        int i4 = 1;
        if (getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                i4 = 2;
            }
            if (this.mFootAndEmptyEnable) {
                return i4;
            }
            return -1;
        }
        return getHeaderLayoutCount() + this.mData.size();
    }

    private int getHeaderViewPosition() {
        return (getEmptyViewCount() != 1 || this.mHeadAndEmptyEnable) ? 0 : -1;
    }

    private Class getInstancedGenericKClass(Class cls) {
        Type[] actualTypeArguments;
        Type genericSuperclass = cls.getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            for (Type type : ((ParameterizedType) genericSuperclass).getActualTypeArguments()) {
                if (type instanceof Class) {
                    Class cls2 = (Class) type;
                    if (BaseViewHolder.class.isAssignableFrom(cls2)) {
                        return cls2;
                    }
                } else if (type instanceof ParameterizedType) {
                    Type rawType = ((ParameterizedType) type).getRawType();
                    if (rawType instanceof Class) {
                        Class cls3 = (Class) rawType;
                        if (BaseViewHolder.class.isAssignableFrom(cls3)) {
                            return cls3;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            return null;
        }
        return null;
    }

    private int getItemPosition(T t4) {
        List<T> list;
        if (t4 == null || (list = this.mData) == null || list.isEmpty()) {
            return -1;
        }
        return this.mData.indexOf(t4);
    }

    private K getLoadingView(ViewGroup viewGroup) {
        K createBaseViewHolder = createBaseViewHolder(getItemView(this.mLoadMoreView.b(), viewGroup));
        createBaseViewHolder.itemView.setOnClickListener(new c());
        return createBaseViewHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getTheBiggestNumber(int[] iArr) {
        int i4 = -1;
        if (iArr != null && iArr.length != 0) {
            for (int i5 : iArr) {
                if (i5 > i4) {
                    i4 = i5;
                }
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isFullScreen(LinearLayoutManager linearLayoutManager) {
        return (linearLayoutManager.findLastCompletelyVisibleItemPosition() + 1 == getItemCount() && linearLayoutManager.findFirstCompletelyVisibleItemPosition() == 0) ? false : true;
    }

    private void openLoadMore(l lVar) {
        this.mRequestLoadMoreListener = lVar;
        this.mNextLoadEnable = true;
        this.mLoadMoreEnable = true;
        this.mLoading = false;
    }

    private int recursiveCollapse(@IntRange(from = 0) int i4) {
        T item = getItem(i4);
        if (item == null || !isExpandable(item)) {
            return 0;
        }
        u1.a aVar = (u1.a) item;
        if (aVar.isExpanded()) {
            ArrayList arrayList = new ArrayList();
            int i5 = aVar.i();
            int size = this.mData.size();
            for (int i6 = i4 + 1; i6 < size; i6++) {
                T t4 = this.mData.get(i6);
                if ((t4 instanceof u1.a) && ((u1.a) t4).i() <= i5) {
                    break;
                }
                arrayList.add(t4);
            }
            this.mData.removeAll(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    private int recursiveExpand(int i4, @NonNull List list) {
        int size = list.size();
        int size2 = (i4 + list.size()) - 1;
        int size3 = list.size() - 1;
        while (size3 >= 0) {
            if (list.get(size3) instanceof u1.a) {
                u1.a aVar = (u1.a) list.get(size3);
                if (aVar.isExpanded() && hasSubItems(aVar)) {
                    List<T> a5 = aVar.a();
                    int i5 = size2 + 1;
                    this.mData.addAll(i5, a5);
                    size += recursiveExpand(i5, a5);
                }
            }
            size3--;
            size2--;
        }
        return size;
    }

    private void setRecyclerView(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
    }

    @Deprecated
    public void add(@IntRange(from = 0) int i4, @NonNull T t4) {
        addData(i4, (int) t4);
    }

    public void addData(@IntRange(from = 0) int i4, @NonNull T t4) {
        this.mData.add(i4, t4);
        notifyItemInserted(i4 + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public int addFooterView(View view) {
        return addFooterView(view, -1, 1);
    }

    public int addHeaderView(View view) {
        return addHeaderView(view, -1);
    }

    public void bindToRecyclerView(RecyclerView recyclerView) {
        if (getRecyclerView() != recyclerView) {
            setRecyclerView(recyclerView);
            getRecyclerView().setAdapter(this);
            return;
        }
        throw new IllegalStateException("Don't bind twice");
    }

    protected void bindViewClickListener(K k4) {
        if (k4 == null) {
            return;
        }
        View view = k4.itemView;
        if (getOnItemClickListener() != null) {
            view.setOnClickListener(new e(k4));
        }
        if (getOnItemLongClickListener() != null) {
            view.setOnLongClickListener(new f(k4));
        }
    }

    public void closeLoadAnimation() {
        this.mOpenAnimationEnable = false;
    }

    public int collapse(@IntRange(from = 0) int i4, boolean z4, boolean z5) {
        int headerLayoutCount = i4 - getHeaderLayoutCount();
        u1.a expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        int recursiveCollapse = recursiveCollapse(headerLayoutCount);
        expandableItem.setExpanded(false);
        int headerLayoutCount2 = headerLayoutCount + getHeaderLayoutCount();
        if (z5) {
            if (z4) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeRemoved(headerLayoutCount2 + 1, recursiveCollapse);
            } else {
                notifyDataSetChanged();
            }
        }
        return recursiveCollapse;
    }

    protected abstract void convert(@NonNull K k4, T t4);

    protected void convertPayloads(@NonNull K k4, T t4, @NonNull List<Object> list) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public K createBaseViewHolder(ViewGroup viewGroup, int i4) {
        return createBaseViewHolder(getItemView(i4, viewGroup));
    }

    public void disableLoadMoreIfNotFullPage() {
        checkNotNull();
        disableLoadMoreIfNotFullPage(getRecyclerView());
    }

    public void enableLoadMoreEndClick(boolean z4) {
        this.mEnableLoadMoreEndClick = z4;
    }

    public int expand(@IntRange(from = 0) int i4, boolean z4, boolean z5) {
        int headerLayoutCount = i4 - getHeaderLayoutCount();
        u1.a expandableItem = getExpandableItem(headerLayoutCount);
        int i5 = 0;
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.setExpanded(true);
            notifyItemChanged(headerLayoutCount);
            return 0;
        }
        if (!expandableItem.isExpanded()) {
            List<T> a5 = expandableItem.a();
            int i6 = headerLayoutCount + 1;
            this.mData.addAll(i6, a5);
            i5 = 0 + recursiveExpand(i6, a5);
            expandableItem.setExpanded(true);
        }
        int headerLayoutCount2 = headerLayoutCount + getHeaderLayoutCount();
        if (z5) {
            if (z4) {
                notifyItemChanged(headerLayoutCount2);
                notifyItemRangeInserted(headerLayoutCount2 + 1, i5);
            } else {
                notifyDataSetChanged();
            }
        }
        return i5;
    }

    public int expandAll(int i4, boolean z4, boolean z5) {
        T item;
        int headerLayoutCount = i4 - getHeaderLayoutCount();
        int i5 = headerLayoutCount + 1;
        T item2 = i5 < this.mData.size() ? getItem(i5) : null;
        u1.a expandableItem = getExpandableItem(headerLayoutCount);
        if (expandableItem == null) {
            return 0;
        }
        if (!hasSubItems(expandableItem)) {
            expandableItem.setExpanded(true);
            notifyItemChanged(headerLayoutCount);
            return 0;
        }
        int expand = expand(getHeaderLayoutCount() + headerLayoutCount, false, false);
        while (i5 < this.mData.size() && ((item = getItem(i5)) == null || !item.equals(item2))) {
            if (isExpandable(item)) {
                expand += expand(getHeaderLayoutCount() + i5, false, false);
            }
            i5++;
        }
        if (z5) {
            if (z4) {
                notifyItemRangeInserted(headerLayoutCount + getHeaderLayoutCount() + 1, expand);
            } else {
                notifyDataSetChanged();
            }
        }
        return expand;
    }

    @NonNull
    public List<T> getData() {
        return this.mData;
    }

    protected int getDefItemViewType(int i4) {
        return super.getItemViewType(i4);
    }

    public View getEmptyView() {
        return this.mEmptyLayout;
    }

    public int getEmptyViewCount() {
        FrameLayout frameLayout = this.mEmptyLayout;
        return (frameLayout == null || frameLayout.getChildCount() == 0 || !this.mIsUseEmpty || this.mData.size() != 0) ? 0 : 1;
    }

    public LinearLayout getFooterLayout() {
        return this.mFooterLayout;
    }

    public int getFooterLayoutCount() {
        LinearLayout linearLayout = this.mFooterLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getFooterViewsCount() {
        return getFooterLayoutCount();
    }

    public LinearLayout getHeaderLayout() {
        return this.mHeaderLayout;
    }

    public int getHeaderLayoutCount() {
        LinearLayout linearLayout = this.mHeaderLayout;
        return (linearLayout == null || linearLayout.getChildCount() == 0) ? 0 : 1;
    }

    @Deprecated
    public int getHeaderViewsCount() {
        return getHeaderLayoutCount();
    }

    @Nullable
    public T getItem(@IntRange(from = 0) int i4) {
        if (i4 < 0 || i4 >= this.mData.size()) {
            return null;
        }
        return this.mData.get(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i4 = 1;
        if (1 != getEmptyViewCount()) {
            return getLoadMoreViewCount() + getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount();
        }
        if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
            i4 = 2;
        }
        return (!this.mFootAndEmptyEnable || getFooterLayoutCount() == 0) ? i4 : i4 + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    protected View getItemView(@LayoutRes int i4, ViewGroup viewGroup) {
        return this.mLayoutInflater.inflate(i4, viewGroup, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i4) {
        if (getEmptyViewCount() == 1) {
            boolean z4 = this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0;
            if (i4 != 0) {
                return i4 != 1 ? i4 != 2 ? EMPTY_VIEW : FOOTER_VIEW : z4 ? EMPTY_VIEW : FOOTER_VIEW;
            } else if (z4) {
                return 273;
            } else {
                return EMPTY_VIEW;
            }
        }
        int headerLayoutCount = getHeaderLayoutCount();
        if (i4 < headerLayoutCount) {
            return 273;
        }
        int i5 = i4 - headerLayoutCount;
        int size = this.mData.size();
        if (i5 < size) {
            return getDefItemViewType(i5);
        }
        return i5 - size < getFooterLayoutCount() ? FOOTER_VIEW : LOADING_VIEW;
    }

    public int getLoadMoreViewCount() {
        if (this.mRequestLoadMoreListener == null || !this.mLoadMoreEnable) {
            return 0;
        }
        return ((this.mNextLoadEnable || !this.mLoadMoreView.h()) && this.mData.size() != 0) ? 1 : 0;
    }

    public int getLoadMoreViewPosition() {
        return getHeaderLayoutCount() + this.mData.size() + getFooterLayoutCount();
    }

    @Nullable
    public final h getOnItemChildClickListener() {
        return this.mOnItemChildClickListener;
    }

    @Nullable
    public final i getOnItemChildLongClickListener() {
        return this.mOnItemChildLongClickListener;
    }

    public final j getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    public final k getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    public int getParentPosition(@NonNull T t4) {
        int itemPosition = getItemPosition(t4);
        if (itemPosition == -1) {
            return -1;
        }
        int i4 = t4 instanceof u1.a ? ((u1.a) t4).i() : Integer.MAX_VALUE;
        if (i4 == 0) {
            return itemPosition;
        }
        if (i4 == -1) {
            return -1;
        }
        while (itemPosition >= 0) {
            T t5 = this.mData.get(itemPosition);
            if (t5 instanceof u1.a) {
                u1.a aVar = (u1.a) t5;
                if (aVar.i() >= 0 && aVar.i() < i4) {
                    return itemPosition;
                }
            }
            itemPosition--;
        }
        return -1;
    }

    protected RecyclerView getRecyclerView() {
        return this.mRecyclerView;
    }

    @Nullable
    public View getViewByPosition(int i4, @IdRes int i5) {
        checkNotNull();
        return getViewByPosition(getRecyclerView(), i4, i5);
    }

    public boolean hasSubItems(u1.a aVar) {
        List<T> a5;
        return (aVar == null || (a5 = aVar.a()) == null || a5.size() <= 0) ? false : true;
    }

    public boolean isExpandable(T t4) {
        return t4 != null && (t4 instanceof u1.a);
    }

    public void isFirstOnly(boolean z4) {
        this.mFirstOnlyEnable = z4;
    }

    protected boolean isFixedViewType(int i4) {
        return i4 == 1365 || i4 == 273 || i4 == 819 || i4 == 546;
    }

    public boolean isFooterViewAsFlow() {
        return this.footerViewAsFlow;
    }

    public boolean isHeaderViewAsFlow() {
        return this.headerViewAsFlow;
    }

    public boolean isLoadMoreEnable() {
        return this.mLoadMoreEnable;
    }

    public boolean isLoading() {
        return this.mLoading;
    }

    public boolean isUpFetchEnable() {
        return this.mUpFetchEnable;
    }

    public boolean isUpFetching() {
        return this.mUpFetching;
    }

    public void isUseEmpty(boolean z4) {
        this.mIsUseEmpty = z4;
    }

    public void loadMoreComplete() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = true;
        this.mLoadMoreView.j(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void loadMoreEnd() {
        loadMoreEnd(false);
    }

    public void loadMoreFail() {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mLoadMoreView.j(3);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    public void notifyLoadMoreToLoading() {
        if (this.mLoadMoreView.e() == 2) {
            return;
        }
        this.mLoadMoreView.j(1);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.setSpanSizeLookup(new d(gridLayoutManager, gridLayoutManager.getSpanSizeLookup()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4) {
        onBindViewHolder((BaseQuickAdapter<T, K>) ((BaseViewHolder) viewHolder), i4);
    }

    protected K onCreateDefViewHolder(ViewGroup viewGroup, int i4) {
        return createBaseViewHolder(viewGroup, this.mLayoutResId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        onViewAttachedToWindow((BaseQuickAdapter<T, K>) ((BaseViewHolder) viewHolder));
    }

    public void openLoadAnimation(int i4) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = null;
        if (i4 == 1) {
            this.mSelectAnimation = new t1.a();
        } else if (i4 == 2) {
            this.mSelectAnimation = new t1.c();
        } else if (i4 == 3) {
            this.mSelectAnimation = new t1.d();
        } else if (i4 == 4) {
            this.mSelectAnimation = new t1.e();
        } else if (i4 != 5) {
        } else {
            this.mSelectAnimation = new t1.f();
        }
    }

    public final void refreshNotifyItemChanged(int i4) {
        notifyItemChanged(i4 + getHeaderLayoutCount());
    }

    public void remove(@IntRange(from = 0) int i4) {
        this.mData.remove(i4);
        int headerLayoutCount = i4 + getHeaderLayoutCount();
        notifyItemRemoved(headerLayoutCount);
        compatibilityDataSizeChanged(0);
        notifyItemRangeChanged(headerLayoutCount, this.mData.size() - headerLayoutCount);
    }

    public void removeAllFooterView() {
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.mFooterLayout.removeAllViews();
        int footerViewPosition = getFooterViewPosition();
        if (footerViewPosition != -1) {
            notifyItemRemoved(footerViewPosition);
        }
    }

    public void removeAllHeaderView() {
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.mHeaderLayout.removeAllViews();
        int headerViewPosition = getHeaderViewPosition();
        if (headerViewPosition != -1) {
            notifyItemRemoved(headerViewPosition);
        }
    }

    public void removeFooterView(View view) {
        int footerViewPosition;
        if (getFooterLayoutCount() == 0) {
            return;
        }
        this.mFooterLayout.removeView(view);
        if (this.mFooterLayout.getChildCount() != 0 || (footerViewPosition = getFooterViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(footerViewPosition);
    }

    public void removeHeaderView(View view) {
        int headerViewPosition;
        if (getHeaderLayoutCount() == 0) {
            return;
        }
        this.mHeaderLayout.removeView(view);
        if (this.mHeaderLayout.getChildCount() != 0 || (headerViewPosition = getHeaderViewPosition()) == -1) {
            return;
        }
        notifyItemRemoved(headerViewPosition);
    }

    public void replaceData(@NonNull Collection<? extends T> collection) {
        List<T> list = this.mData;
        if (collection != list) {
            list.clear();
            this.mData.addAll(collection);
        }
        notifyDataSetChanged();
    }

    @Deprecated
    public void setAutoLoadMoreSize(int i4) {
        setPreLoadNumber(i4);
    }

    public void setData(@IntRange(from = 0) int i4, @NonNull T t4) {
        this.mData.set(i4, t4);
        notifyItemChanged(i4 + getHeaderLayoutCount());
    }

    public void setDuration(int i4) {
        this.mDuration = i4;
    }

    public void setEmptyView(int i4, ViewGroup viewGroup) {
        setEmptyView(LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false));
    }

    public void setEnableLoadMore(boolean z4) {
        int loadMoreViewCount = getLoadMoreViewCount();
        this.mLoadMoreEnable = z4;
        int loadMoreViewCount2 = getLoadMoreViewCount();
        if (loadMoreViewCount == 1) {
            if (loadMoreViewCount2 == 0) {
                notifyItemRemoved(getLoadMoreViewPosition());
            }
        } else if (loadMoreViewCount2 == 1) {
            this.mLoadMoreView.j(1);
            notifyItemInserted(getLoadMoreViewPosition());
        }
    }

    public int setFooterView(View view) {
        return setFooterView(view, 0, 1);
    }

    public void setFooterViewAsFlow(boolean z4) {
        this.footerViewAsFlow = z4;
    }

    protected void setFullSpan(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.itemView.getLayoutParams() instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) viewHolder.itemView.getLayoutParams()).setFullSpan(true);
        }
    }

    public void setHeaderAndEmpty(boolean z4) {
        setHeaderFooterEmpty(z4, false);
    }

    public void setHeaderFooterEmpty(boolean z4, boolean z5) {
        this.mHeadAndEmptyEnable = z4;
        this.mFootAndEmptyEnable = z5;
    }

    public int setHeaderView(View view) {
        return setHeaderView(view, 0, 1);
    }

    public void setHeaderViewAsFlow(boolean z4) {
        this.headerViewAsFlow = z4;
    }

    public void setLoadMoreView(com.join.mgps.base.a aVar) {
        this.mLoadMoreView = aVar;
    }

    public void setNewData(@Nullable List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mData = list;
        if (this.mRequestLoadMoreListener != null) {
            this.mNextLoadEnable = true;
            this.mLoadMoreEnable = true;
            this.mLoading = false;
            this.mLoadMoreView.j(1);
        }
        this.mLastPosition = -1;
        notifyDataSetChanged();
    }

    public void setNewDiffData(@NonNull BaseQuickDiffCallback<T> baseQuickDiffCallback) {
        setNewDiffData((BaseQuickDiffCallback) baseQuickDiffCallback, false);
    }

    public void setNotDoAnimationCount(int i4) {
        this.mLastPosition = i4;
    }

    public void setOnItemChildClickListener(h hVar) {
        this.mOnItemChildClickListener = hVar;
    }

    public void setOnItemChildLongClickListener(i iVar) {
        this.mOnItemChildLongClickListener = iVar;
    }

    public void setOnItemClick(View view, int i4) {
        getOnItemClickListener().onItemClick(this, view, i4);
    }

    public void setOnItemClickListener(@Nullable j jVar) {
        this.mOnItemClickListener = jVar;
    }

    public boolean setOnItemLongClick(View view, int i4) {
        return getOnItemLongClickListener().a(this, view, i4);
    }

    public void setOnItemLongClickListener(k kVar) {
        this.mOnItemLongClickListener = kVar;
    }

    public void setOnLoadMoreListener(l lVar, RecyclerView recyclerView) {
        openLoadMore(lVar);
        if (getRecyclerView() == null) {
            setRecyclerView(recyclerView);
        }
    }

    public void setPreLoadNumber(int i4) {
        if (i4 > 1) {
            this.mPreLoadNumber = i4;
        }
    }

    public void setSpanSizeLookup(m mVar) {
        this.mSpanSizeLookup = mVar;
    }

    public void setStartUpFetchPosition(int i4) {
        this.mStartUpFetchPosition = i4;
    }

    public void setUpFetchEnable(boolean z4) {
        this.mUpFetchEnable = z4;
    }

    public void setUpFetchListener(n nVar) {
        this.mUpFetchListener = nVar;
    }

    public void setUpFetching(boolean z4) {
        this.mUpFetching = z4;
    }

    protected void startAnim(Animator animator, int i4) {
        animator.setDuration(this.mDuration).start();
        animator.setInterpolator(this.mInterpolator);
    }

    public int addFooterView(View view, int i4) {
        return addFooterView(view, i4, 1);
    }

    public int addHeaderView(View view, int i4) {
        return addHeaderView(view, i4, 1);
    }

    protected K createBaseViewHolder(View view) {
        K createGenericKInstance;
        Class cls = null;
        for (Class<?> cls2 = getClass(); cls == null && cls2 != null; cls2 = cls2.getSuperclass()) {
            cls = getInstancedGenericKClass(cls2);
        }
        if (cls == null) {
            createGenericKInstance = (K) new BaseViewHolder(view);
        } else {
            createGenericKInstance = createGenericKInstance(cls, view);
        }
        return createGenericKInstance != null ? createGenericKInstance : (K) new BaseViewHolder(view);
    }

    public void loadMoreEnd(boolean z4) {
        if (getLoadMoreViewCount() == 0) {
            return;
        }
        this.mLoading = false;
        this.mNextLoadEnable = false;
        this.mLoadMoreView.i(z4);
        if (z4) {
            notifyItemRemoved(getLoadMoreViewPosition());
            return;
        }
        this.mLoadMoreView.j(4);
        notifyItemChanged(getLoadMoreViewPosition());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i4, @NonNull List list) {
        onBindViewHolder((BaseQuickAdapter<T, K>) ((BaseViewHolder) viewHolder), i4, (List<Object>) list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    public K onCreateViewHolder(@NonNull ViewGroup viewGroup, int i4) {
        K createBaseViewHolder;
        Context context = viewGroup.getContext();
        this.mContext = context;
        this.mLayoutInflater = LayoutInflater.from(context);
        if (i4 == 273) {
            ViewParent parent = this.mHeaderLayout.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.mHeaderLayout);
            }
            createBaseViewHolder = createBaseViewHolder(this.mHeaderLayout);
        } else if (i4 == 546) {
            createBaseViewHolder = getLoadingView(viewGroup);
        } else if (i4 == 819) {
            ViewParent parent2 = this.mFooterLayout.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.mFooterLayout);
            }
            createBaseViewHolder = createBaseViewHolder(this.mFooterLayout);
        } else if (i4 != 1365) {
            createBaseViewHolder = onCreateDefViewHolder(viewGroup, i4);
            bindViewClickListener(createBaseViewHolder);
        } else {
            ViewParent parent3 = this.mEmptyLayout.getParent();
            if (parent3 instanceof ViewGroup) {
                ((ViewGroup) parent3).removeView(this.mEmptyLayout);
            }
            createBaseViewHolder = createBaseViewHolder(this.mEmptyLayout);
        }
        createBaseViewHolder.setAdapter(this);
        return createBaseViewHolder;
    }

    public void onViewAttachedToWindow(@NonNull K k4) {
        super.onViewAttachedToWindow((BaseQuickAdapter<T, K>) k4);
        int itemViewType = k4.getItemViewType();
        if (itemViewType != 1365 && itemViewType != 273 && itemViewType != 819 && itemViewType != 546) {
            addAnimation(k4);
        } else {
            setFullSpan(k4);
        }
    }

    public final void refreshNotifyItemChanged(int i4, @Nullable Object obj) {
        notifyItemChanged(i4 + getHeaderLayoutCount(), obj);
    }

    public int setFooterView(View view, int i4) {
        return setFooterView(view, i4, 1);
    }

    public int setHeaderView(View view, int i4) {
        return setHeaderView(view, i4, 1);
    }

    public void setNewDiffData(@NonNull BaseQuickDiffCallback<T> baseQuickDiffCallback, boolean z4) {
        if (getEmptyViewCount() == 1) {
            setNewData(baseQuickDiffCallback.d());
            return;
        }
        baseQuickDiffCallback.f(getData());
        DiffUtil.calculateDiff(baseQuickDiffCallback, z4).dispatchUpdatesTo(new BaseQuickAdapterListUpdateCallback(this));
        this.mData = baseQuickDiffCallback.d();
    }

    public int addFooterView(View view, int i4, int i5) {
        int footerViewPosition;
        if (this.mFooterLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mFooterLayout = linearLayout;
            if (i5 == 1) {
                linearLayout.setOrientation(1);
                this.mFooterLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mFooterLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
        }
        int childCount = this.mFooterLayout.getChildCount();
        if (i4 < 0 || i4 > childCount) {
            i4 = childCount;
        }
        this.mFooterLayout.addView(view, i4);
        if (this.mFooterLayout.getChildCount() == 1 && (footerViewPosition = getFooterViewPosition()) != -1) {
            notifyItemInserted(footerViewPosition);
        }
        return i4;
    }

    public int addHeaderView(View view, int i4, int i5) {
        int headerViewPosition;
        if (this.mHeaderLayout == null) {
            LinearLayout linearLayout = new LinearLayout(view.getContext());
            this.mHeaderLayout = linearLayout;
            if (i5 == 1) {
                linearLayout.setOrientation(1);
                this.mHeaderLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            } else {
                linearLayout.setOrientation(0);
                this.mHeaderLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
            }
        }
        int childCount = this.mHeaderLayout.getChildCount();
        if (i4 < 0 || i4 > childCount) {
            i4 = childCount;
        }
        this.mHeaderLayout.addView(view, i4);
        if (this.mHeaderLayout.getChildCount() == 1 && (headerViewPosition = getHeaderViewPosition()) != -1) {
            notifyItemInserted(headerViewPosition);
        }
        return i4;
    }

    public void disableLoadMoreIfNotFullPage(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager;
        setEnableLoadMore(false);
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            recyclerView.postDelayed(new a((LinearLayoutManager) layoutManager), 50L);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            recyclerView.postDelayed(new b((StaggeredGridLayoutManager) layoutManager), 50L);
        }
    }

    @Nullable
    public View getViewByPosition(RecyclerView recyclerView, int i4, @IdRes int i5) {
        BaseViewHolder baseViewHolder;
        if (recyclerView == null || (baseViewHolder = (BaseViewHolder) recyclerView.findViewHolderForLayoutPosition(i4)) == null) {
            return null;
        }
        return baseViewHolder.getView(i5);
    }

    public void onBindViewHolder(@NonNull K k4, int i4) {
        autoUpFetch(i4);
        autoLoadMore(i4);
        int itemViewType = k4.getItemViewType();
        if (itemViewType == 0) {
            convert(k4, getItem(i4 - getHeaderLayoutCount()));
        } else if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.a(k4);
            } else if (itemViewType == 819 || itemViewType == 1365) {
            } else {
                convert(k4, getItem(i4 - getHeaderLayoutCount()));
            }
        }
    }

    @Deprecated
    public void setEmptyView(int i4) {
        checkNotNull();
        setEmptyView(i4, getRecyclerView());
    }

    public int setFooterView(View view, int i4, int i5) {
        LinearLayout linearLayout = this.mFooterLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i4) {
            this.mFooterLayout.removeViewAt(i4);
            this.mFooterLayout.addView(view, i4);
            return i4;
        }
        return addFooterView(view, i4, i5);
    }

    public int setHeaderView(View view, int i4, int i5) {
        LinearLayout linearLayout = this.mHeaderLayout;
        if (linearLayout != null && linearLayout.getChildCount() > i4) {
            this.mHeaderLayout.removeViewAt(i4);
            this.mHeaderLayout.addView(view, i4);
            return i4;
        }
        return addHeaderView(view, i4, i5);
    }

    public void addData(@NonNull T t4) {
        this.mData.add(t4);
        notifyItemInserted(this.mData.size() + getHeaderLayoutCount());
        compatibilityDataSizeChanged(1);
    }

    public void setEmptyView(View view) {
        boolean z4;
        int itemCount = getItemCount();
        int i4 = 0;
        if (this.mEmptyLayout == null) {
            this.mEmptyLayout = new FrameLayout(view.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams.width = layoutParams2.width;
                layoutParams.height = layoutParams2.height;
            }
            this.mEmptyLayout.setLayoutParams(layoutParams);
            z4 = true;
        } else {
            z4 = false;
        }
        this.mEmptyLayout.removeAllViews();
        this.mEmptyLayout.addView(view);
        this.mIsUseEmpty = true;
        if (z4 && getEmptyViewCount() == 1) {
            if (this.mHeadAndEmptyEnable && getHeaderLayoutCount() != 0) {
                i4 = 1;
            }
            if (getItemCount() > itemCount) {
                notifyItemInserted(i4);
            } else {
                notifyDataSetChanged();
            }
        }
    }

    public void addData(@IntRange(from = 0) int i4, @NonNull Collection<? extends T> collection) {
        this.mData.addAll(i4, collection);
        notifyItemRangeInserted(i4 + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public void openLoadAnimation(t1.b bVar) {
        this.mOpenAnimationEnable = true;
        this.mCustomAnimation = bVar;
    }

    public void setNewDiffData(@NonNull DiffUtil.DiffResult diffResult, @NonNull List<T> list) {
        if (getEmptyViewCount() == 1) {
            setNewData(list);
            return;
        }
        diffResult.dispatchUpdatesTo(new BaseQuickAdapterListUpdateCallback(this));
        this.mData = list;
    }

    public int collapse(@IntRange(from = 0) int i4) {
        return collapse(i4, true, true);
    }

    public void onBindViewHolder(@NonNull K k4, int i4, @NonNull List<Object> list) {
        if (list.isEmpty()) {
            onBindViewHolder((BaseQuickAdapter<T, K>) k4, i4);
            return;
        }
        autoUpFetch(i4);
        autoLoadMore(i4);
        int itemViewType = k4.getItemViewType();
        if (itemViewType == 0) {
            convertPayloads(k4, getItem(i4 - getHeaderLayoutCount()), list);
        } else if (itemViewType != 273) {
            if (itemViewType == 546) {
                this.mLoadMoreView.a(k4);
            } else if (itemViewType == 819 || itemViewType == 1365) {
            } else {
                convertPayloads(k4, getItem(i4 - getHeaderLayoutCount()), list);
            }
        }
    }

    public void addData(@NonNull Collection<? extends T> collection) {
        this.mData.addAll(collection);
        notifyItemRangeInserted((this.mData.size() - collection.size()) + getHeaderLayoutCount(), collection.size());
        compatibilityDataSizeChanged(collection.size());
    }

    public int collapse(@IntRange(from = 0) int i4, boolean z4) {
        return collapse(i4, z4, true);
    }

    public void openLoadAnimation() {
        this.mOpenAnimationEnable = true;
    }

    public int expand(@IntRange(from = 0) int i4, boolean z4) {
        return expand(i4, z4, true);
    }

    public int expand(@IntRange(from = 0) int i4) {
        return expand(i4, true, true);
    }

    public int expandAll(int i4, boolean z4) {
        return expandAll(i4, true, !z4);
    }

    public void expandAll() {
        for (int size = (this.mData.size() - 1) + getHeaderLayoutCount(); size >= getHeaderLayoutCount(); size--) {
            expandAll(size, false, false);
        }
    }

    public BaseQuickAdapter(@Nullable List<T> list) {
        this(0, list);
    }

    public BaseQuickAdapter(@LayoutRes int i4) {
        this(i4, null);
    }
}
