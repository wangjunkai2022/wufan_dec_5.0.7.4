package com.chad.library.adapter.base;

import android.animation.Animator;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.chad.library.adapter.base.viewholder.EmptyLayoutVH;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BaseQuickAdapter.kt */
@SourceDebugExtension({"SMAP\nBaseQuickAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseQuickAdapter.kt\ncom/chad/library/adapter/base/BaseQuickAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1855#2,2:749\n1855#2,2:751\n350#2,7:753\n1#3:760\n*S KotlinDebug\n*F\n+ 1 BaseQuickAdapter.kt\ncom/chad/library/adapter/base/BaseQuickAdapter\n*L\n264#1:749,2\n271#1:751,2\n418#1:753,7\n*E\n"})
/* loaded from: classes2.dex */
public abstract class BaseQuickAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    @NotNull
    public static final a Companion = new a(null);
    public static final int EMPTY_PAYLOAD = 0;
    public static final int EMPTY_VIEW = 268436821;
    @Nullable
    private RecyclerView _recyclerView;
    private boolean animationEnable;
    @Nullable
    private View emptyView;
    private boolean isAnimationFirstOnly;
    private boolean isEmptyViewEnable;
    @Nullable
    private com.chad.library.adapter.base.animation.b itemAnimation;
    @NotNull
    private List<? extends T> items;
    private int mLastPosition;
    @NotNull
    private final SparseArray<b<T>> mOnItemChildClickArray;
    @NotNull
    private final SparseArray<c<T>> mOnItemChildLongClickArray;
    @Nullable
    private d<T> mOnItemClickListener;
    @Nullable
    private e<T> mOnItemLongClickListener;
    @Nullable
    private List<f> onViewAttachStateChangeListeners;

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public enum AnimationType {
        AlphaIn,
        ScaleIn,
        SlideInBottom,
        SlideInLeft,
        SlideInRight
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(@NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull View view, int i4);
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public interface c<T> {
        boolean a(@NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull View view, int i4);
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public interface d<T> {
        void a(@NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull View view, int i4);
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public interface e<T> {
        boolean a(@NotNull BaseQuickAdapter<T, ?> baseQuickAdapter, @NotNull View view, int i4);
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public interface f {
        void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder viewHolder);

        void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder viewHolder);
    }

    /* compiled from: BaseQuickAdapter.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class g {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            try {
                iArr[AnimationType.AlphaIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationType.ScaleIn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationType.SlideInBottom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnimationType.SlideInLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnimationType.SlideInRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BaseQuickAdapter() {
        this(null, 1, null);
    }

    public /* synthetic */ BaseQuickAdapter(List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewClickListener$lambda$10$lambda$9(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v2) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        this$0.onItemChildClick(v2, bindingAdapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindViewClickListener$lambda$12$lambda$11(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v2) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        return this$0.onItemChildLongClick(v2, bindingAdapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindViewClickListener$lambda$6$lambda$5(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v2) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        this$0.onItemClick(v2, bindingAdapterPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindViewClickListener$lambda$8$lambda$7(RecyclerView.ViewHolder viewHolder, BaseQuickAdapter this$0, View v2) {
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(v2, "v");
        return this$0.onItemLongClick(v2, bindingAdapterPosition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean displayEmptyView$default(BaseQuickAdapter baseQuickAdapter, List list, int i4, Object obj) {
        if (obj == null) {
            if ((i4 & 1) != 0) {
                list = baseQuickAdapter.getItems();
            }
            return baseQuickAdapter.displayEmptyView(list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: displayEmptyView");
    }

    private final List<T> getMutableItems() {
        List<T> mutableList;
        List<T> items = getItems();
        if (items instanceof ArrayList) {
            List<T> items2 = getItems();
            Intrinsics.checkNotNull(items2, "null cannot be cast to non-null type java.util.ArrayList<T of com.chad.library.adapter.base.BaseQuickAdapter>");
            return (ArrayList) items2;
        } else if (TypeIntrinsics.isMutableList(items)) {
            List<T> items3 = getItems();
            Intrinsics.checkNotNull(items3, "null cannot be cast to non-null type kotlin.collections.MutableList<T of com.chad.library.adapter.base.BaseQuickAdapter>");
            return TypeIntrinsics.asMutableList(items3);
        } else {
            mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) getItems());
            setItems(mutableList);
            return mutableList;
        }
    }

    private final void runAnimator(RecyclerView.ViewHolder viewHolder) {
        if (this.animationEnable) {
            if (!this.isAnimationFirstOnly || viewHolder.getLayoutPosition() > this.mLastPosition) {
                com.chad.library.adapter.base.animation.b bVar = this.itemAnimation;
                if (bVar == null) {
                    bVar = new com.chad.library.adapter.base.animation.a(0L, 0.0f, 3, null);
                }
                View view = viewHolder.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
                startItemAnimator(bVar.a(view), viewHolder);
                this.mLastPosition = viewHolder.getLayoutPosition();
            }
        }
    }

    public void add(@IntRange(from = 0) int i4, T t4) {
        if (i4 <= getItems().size() && i4 >= 0) {
            if (displayEmptyView$default(this, null, 1, null)) {
                notifyItemRemoved(0);
            }
            getMutableItems().add(i4, t4);
            notifyItemInserted(i4);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    public void addAll(@IntRange(from = 0) int i4, @NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (i4 <= getItems().size() && i4 >= 0) {
            if (displayEmptyView$default(this, null, 1, null)) {
                notifyItemRemoved(0);
            }
            getMutableItems().addAll(i4, collection);
            notifyItemRangeInserted(i4, collection.size());
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> addOnItemChildClickListener(@IdRes int i4, @NotNull b<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemChildClickArray.put(i4, listener);
        return this;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> addOnItemChildLongClickListener(@IdRes int i4, @NotNull c<T> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemChildLongClickArray.put(i4, listener);
        return this;
    }

    public final void addOnViewAttachStateChangeListener(@NotNull f listener) {
        List<f> list;
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.onViewAttachStateChangeListeners == null) {
            this.onViewAttachStateChangeListeners = new ArrayList();
        }
        List<f> list2 = this.onViewAttachStateChangeListeners;
        boolean z4 = true;
        if (((list2 == null || !list2.contains(listener)) ? false : false) || (list = this.onViewAttachStateChangeListeners) == null) {
            return;
        }
        list.add(listener);
    }

    protected final void asStaggeredGridFullSpan(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).setFullSpan(true);
        }
    }

    protected void bindViewClickListener(@NotNull final VH viewHolder, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (this.mOnItemClickListener != null) {
            viewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseQuickAdapter.bindViewClickListener$lambda$6$lambda$5(RecyclerView.ViewHolder.this, this, view);
                }
            });
        }
        if (this.mOnItemLongClickListener != null) {
            viewHolder.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.e
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean bindViewClickListener$lambda$8$lambda$7;
                    bindViewClickListener$lambda$8$lambda$7 = BaseQuickAdapter.bindViewClickListener$lambda$8$lambda$7(RecyclerView.ViewHolder.this, this, view);
                    return bindViewClickListener$lambda$8$lambda$7;
                }
            });
        }
        int size = this.mOnItemChildClickArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            View findViewById = viewHolder.itemView.findViewById(this.mOnItemChildClickArray.keyAt(i5));
            if (findViewById != null) {
                findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.chad.library.adapter.base.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BaseQuickAdapter.bindViewClickListener$lambda$10$lambda$9(RecyclerView.ViewHolder.this, this, view);
                    }
                });
            }
        }
        int size2 = this.mOnItemChildLongClickArray.size();
        for (int i6 = 0; i6 < size2; i6++) {
            View findViewById2 = viewHolder.itemView.findViewById(this.mOnItemChildLongClickArray.keyAt(i6));
            if (findViewById2 != null) {
                findViewById2.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.chad.library.adapter.base.d
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        boolean bindViewClickListener$lambda$12$lambda$11;
                        bindViewClickListener$lambda$12$lambda$11 = BaseQuickAdapter.bindViewClickListener$lambda$12$lambda$11(RecyclerView.ViewHolder.this, this, view);
                        return bindViewClickListener$lambda$12$lambda$11;
                    }
                });
            }
        }
    }

    public final void clearOnViewAttachStateChangeListener() {
        List<f> list = this.onViewAttachStateChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public final boolean displayEmptyView(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (this.emptyView == null || !this.isEmptyViewEnable) {
            return false;
        }
        return list.isEmpty();
    }

    public final boolean getAnimationEnable() {
        return this.animationEnable;
    }

    @NotNull
    public final Context getContext() {
        Context context = getRecyclerView().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
        return context;
    }

    @Nullable
    public final View getEmptyView() {
        return this.emptyView;
    }

    @Nullable
    public final T getItem(@IntRange(from = 0) int i4) {
        return (T) CollectionsKt.getOrNull(getItems(), i4);
    }

    @Nullable
    public final com.chad.library.adapter.base.animation.b getItemAnimation() {
        return this.itemAnimation;
    }

    protected int getItemCount(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return items.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    public final int getItemPosition(@Nullable T t4) {
        int i4 = 0;
        for (T t5 : getItems()) {
            if (Intrinsics.areEqual(t4, t5)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i4) {
        return displayEmptyView$default(this, null, 1, null) ? EMPTY_VIEW : getItemViewType(i4, getItems());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getItemViewType(int i4, @NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return 0;
    }

    @NotNull
    public List<T> getItems() {
        return (List<? extends T>) this.items;
    }

    @Nullable
    public final d<T> getOnItemClickListener() {
        return this.mOnItemClickListener;
    }

    @Nullable
    public final e<T> getOnItemLongClickListener() {
        return this.mOnItemLongClickListener;
    }

    @NotNull
    public final RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this._recyclerView;
        if (recyclerView != null) {
            Intrinsics.checkNotNull(recyclerView);
            return recyclerView;
        }
        throw new IllegalStateException("Please get it after onAttachedToRecyclerView()".toString());
    }

    public final boolean isAnimationFirstOnly() {
        return this.isAnimationFirstOnly;
    }

    public final boolean isEmptyViewEnable() {
        return this.isEmptyViewEnable;
    }

    public final boolean isEmptyViewHolder(@NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "<this>");
        return viewHolder instanceof EmptyLayoutVH;
    }

    public boolean isFullSpanItem(int i4) {
        return i4 == 268436821;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this._recyclerView = recyclerView;
    }

    protected abstract void onBindViewHolder(@NotNull VH vh, int i4, @Nullable T t4);

    protected void onBindViewHolder(@NotNull VH holder, int i4, @Nullable T t4, @NotNull List<? extends Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        onBindViewHolder((BaseQuickAdapter<T, VH>) holder, i4, (int) t4);
    }

    @NotNull
    protected abstract VH onCreateViewHolder(@NotNull Context context, @NotNull ViewGroup viewGroup, int i4);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public final RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i4 == 268436821) {
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return new EmptyLayoutVH(frameLayout);
        }
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        VH onCreateViewHolder = onCreateViewHolder(context, parent, i4);
        bindViewClickListener(onCreateViewHolder, i4);
        return onCreateViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this._recyclerView = null;
    }

    protected void onItemChildClick(@NotNull View v2, int i4) {
        Intrinsics.checkNotNullParameter(v2, "v");
        b<T> bVar = this.mOnItemChildClickArray.get(v2.getId());
        if (bVar != null) {
            bVar.a(this, v2, i4);
        }
    }

    protected boolean onItemChildLongClick(@NotNull View v2, int i4) {
        Intrinsics.checkNotNullParameter(v2, "v");
        c<T> cVar = this.mOnItemChildLongClickArray.get(v2.getId());
        if (cVar != null) {
            return cVar.a(this, v2, i4);
        }
        return false;
    }

    protected void onItemClick(@NotNull View v2, int i4) {
        Intrinsics.checkNotNullParameter(v2, "v");
        d<T> dVar = this.mOnItemClickListener;
        if (dVar != null) {
            dVar.a(this, v2, i4);
        }
    }

    protected boolean onItemLongClick(@NotNull View v2, int i4) {
        Intrinsics.checkNotNullParameter(v2, "v");
        e<T> eVar = this.mOnItemLongClickListener;
        if (eVar != null) {
            return eVar.a(this, v2, i4);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow(holder);
        if (isFullSpanItem(getItemViewType(holder.getBindingAdapterPosition()))) {
            asStaggeredGridFullSpan(holder);
        } else {
            runAnimator(holder);
        }
        List<f> list = this.onViewAttachStateChangeListeners;
        if (list != null) {
            for (f fVar : list) {
                fVar.onViewAttachedToWindow(holder);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @CallSuper
    public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<f> list = this.onViewAttachStateChangeListeners;
        if (list != null) {
            for (f fVar : list) {
                fVar.onViewDetachedFromWindow(holder);
            }
        }
    }

    public void remove(T t4) {
        int indexOf = getItems().indexOf(t4);
        if (indexOf == -1) {
            return;
        }
        removeAt(indexOf);
    }

    public void removeAt(@IntRange(from = 0) int i4) {
        if (i4 < getItems().size()) {
            getMutableItems().remove(i4);
            notifyItemRemoved(i4);
            if (displayEmptyView$default(this, null, 1, null)) {
                notifyItemInserted(0);
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> removeOnItemChildClickListener(@IdRes int i4) {
        this.mOnItemChildClickArray.remove(i4);
        return this;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> removeOnItemChildLongClickListener(@IdRes int i4) {
        this.mOnItemChildLongClickArray.remove(i4);
        return this;
    }

    public final void removeOnViewAttachStateChangeListener(@NotNull f listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        List<f> list = this.onViewAttachStateChangeListeners;
        if (list != null) {
            list.remove(listener);
        }
    }

    public void set(@IntRange(from = 0) int i4, T t4) {
        if (i4 < getItems().size()) {
            getMutableItems().set(i4, t4);
            notifyItemChanged(i4);
            return;
        }
        throw new IndexOutOfBoundsException("position: " + i4 + ". size:" + getItems().size());
    }

    public final void setAnimationEnable(boolean z4) {
        this.animationEnable = z4;
    }

    public final void setAnimationFirstOnly(boolean z4) {
        this.isAnimationFirstOnly = z4;
    }

    public final void setEmptyView(@Nullable View view) {
        boolean displayEmptyView$default = displayEmptyView$default(this, null, 1, null);
        this.emptyView = view;
        boolean displayEmptyView$default2 = displayEmptyView$default(this, null, 1, null);
        if (displayEmptyView$default && !displayEmptyView$default2) {
            notifyItemRemoved(0);
        } else if (displayEmptyView$default2 && !displayEmptyView$default) {
            notifyItemInserted(0);
        } else if (displayEmptyView$default && displayEmptyView$default2) {
            notifyItemChanged(0, 0);
        }
    }

    public final void setEmptyViewEnable(boolean z4) {
        boolean displayEmptyView$default = displayEmptyView$default(this, null, 1, null);
        this.isEmptyViewEnable = z4;
        boolean displayEmptyView$default2 = displayEmptyView$default(this, null, 1, null);
        if (displayEmptyView$default && !displayEmptyView$default2) {
            notifyItemRemoved(0);
        } else if (displayEmptyView$default2 && !displayEmptyView$default) {
            notifyItemInserted(0);
        } else if (displayEmptyView$default && displayEmptyView$default2) {
            notifyItemChanged(0, 0);
        }
    }

    public final void setEmptyViewLayout(@NotNull Context context, @LayoutRes int i4) {
        Intrinsics.checkNotNullParameter(context, "context");
        setEmptyView(LayoutInflater.from(context).inflate(i4, (ViewGroup) new FrameLayout(context), false));
    }

    public final void setItemAnimation(@Nullable com.chad.library.adapter.base.animation.b bVar) {
        this.animationEnable = true;
        this.itemAnimation = bVar;
    }

    public void setItems(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.items = list;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> setOnItemClickListener(@Nullable d<T> dVar) {
        this.mOnItemClickListener = dVar;
        return this;
    }

    @NotNull
    public final BaseQuickAdapter<T, VH> setOnItemLongClickListener(@Nullable e<T> eVar) {
        this.mOnItemLongClickListener = eVar;
        return this;
    }

    protected void startItemAnimator(@NotNull Animator anim, @NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        Intrinsics.checkNotNullParameter(holder, "holder");
        anim.start();
    }

    public void submitList(@Nullable List<? extends T> list) {
        if (list == getItems()) {
            return;
        }
        this.mLastPosition = -1;
        if (list == null) {
            list = CollectionsKt__CollectionsKt.emptyList();
        }
        boolean displayEmptyView$default = displayEmptyView$default(this, null, 1, null);
        boolean displayEmptyView = displayEmptyView(list);
        if (displayEmptyView$default && !displayEmptyView) {
            setItems(list);
            notifyItemRemoved(0);
            notifyItemRangeInserted(0, list.size());
        } else if (displayEmptyView && !displayEmptyView$default) {
            notifyItemRangeRemoved(0, getItems().size());
            setItems(list);
            notifyItemInserted(0);
        } else if (displayEmptyView$default && displayEmptyView) {
            setItems(list);
            notifyItemChanged(0, 0);
        } else {
            setItems(list);
            notifyDataSetChanged();
        }
    }

    public void swap(int i4, int i5) {
        int size = getItems().size();
        boolean z4 = true;
        if (i4 >= 0 && i4 < size) {
            if ((i5 < 0 || i5 >= size) ? false : false) {
                Collections.swap(getItems(), i4, i5);
                notifyItemMoved(i4, i5);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (displayEmptyView$default(this, null, 1, null)) {
            return 1;
        }
        return getItemCount(getItems());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof EmptyLayoutVH) {
            ((EmptyLayoutVH) holder).a(this.emptyView);
        } else {
            onBindViewHolder((BaseQuickAdapter<T, VH>) holder, i4, (int) getItem(i4));
        }
    }

    public BaseQuickAdapter(@NotNull List<? extends T> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.mLastPosition = -1;
        this.mOnItemChildClickArray = new SparseArray<>(3);
        this.mOnItemChildLongClickArray = new SparseArray<>(3);
        this.isAnimationFirstOnly = true;
    }

    public final void setItemAnimation(@NotNull AnimationType animationType) {
        com.chad.library.adapter.base.animation.b aVar;
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i4 = g.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i4 == 1) {
            aVar = new com.chad.library.adapter.base.animation.a(0L, 0.0f, 3, null);
        } else if (i4 == 2) {
            aVar = new com.chad.library.adapter.base.animation.c(0L, 0.0f, 3, null);
        } else if (i4 == 3) {
            aVar = new com.chad.library.adapter.base.animation.d(0L, 1, null);
        } else if (i4 == 4) {
            aVar = new com.chad.library.adapter.base.animation.e(0L, 1, null);
        } else if (i4 != 5) {
            throw new NoWhenBranchMatchedException();
        } else {
            aVar = new com.chad.library.adapter.base.animation.f(0L, 1, null);
        }
        setItemAnimation(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int i4, @NotNull List<Object> payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (holder instanceof EmptyLayoutVH) {
            ((EmptyLayoutVH) holder).a(this.emptyView);
        } else if (payloads.isEmpty()) {
            onBindViewHolder((BaseQuickAdapter<T, VH>) holder, i4, (int) getItem(i4));
        } else {
            onBindViewHolder(holder, i4, getItem(i4), payloads);
        }
    }

    public void add(T t4) {
        if (displayEmptyView$default(this, null, 1, null)) {
            notifyItemRemoved(0);
        }
        getMutableItems().add(t4);
        notifyItemInserted(getItems().size() - 1);
    }

    public void addAll(@NotNull Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        if (displayEmptyView$default(this, null, 1, null)) {
            notifyItemRemoved(0);
        }
        int size = getItems().size();
        getMutableItems().addAll(collection);
        notifyItemRangeInserted(size, collection.size());
    }
}
