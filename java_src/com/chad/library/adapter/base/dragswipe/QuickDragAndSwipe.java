package com.chad.library.adapter.base.dragswipe;

import android.graphics.Canvas;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.viewholder.EmptyLayoutVH;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a;
import w.b;
import w.c;
/* compiled from: QuickDragAndSwipe.kt */
/* loaded from: classes2.dex */
public class QuickDragAndSwipe extends ItemTouchHelper.Callback {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f9037a;
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    private final ItemTouchHelper f9038b = new ItemTouchHelper(this);

    /* renamed from: c  reason: collision with root package name */
    private boolean f9039c = true;

    /* renamed from: d  reason: collision with root package name */
    private boolean f9040d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f9041e;

    /* renamed from: f  reason: collision with root package name */
    private int f9042f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private b f9043g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private c f9044h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    private a f9045i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f9046j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f9047k;

    private final int g(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null) {
            return viewHolder.getBindingAdapterPosition();
        }
        return -1;
    }

    private final boolean h(RecyclerView.ViewHolder viewHolder) {
        return viewHolder instanceof EmptyLayoutVH;
    }

    @NotNull
    public QuickDragAndSwipe a(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (Intrinsics.areEqual(this.f9037a, recyclerView)) {
            return this;
        }
        this.f9037a = recyclerView;
        this.f9038b.attachToRecyclerView(recyclerView);
        return this;
    }

    @NotNull
    public final a b() {
        a aVar = this.f9045i;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            return aVar;
        }
        throw new IllegalStateException("Please set _adapterImpl".toString());
    }

    public final int c() {
        return this.f9041e;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void clearView(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.clearView(recyclerView, viewHolder);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (this.f9047k) {
            c cVar = this.f9044h;
            if (cVar != null) {
                cVar.c(viewHolder, bindingAdapterPosition);
            }
            this.f9047k = false;
        }
        if (this.f9046j) {
            b bVar = this.f9043g;
            if (bVar != null) {
                bVar.a(viewHolder, bindingAdapterPosition);
            }
            this.f9046j = false;
        }
    }

    @NotNull
    public final ItemTouchHelper d() {
        return this.f9038b;
    }

    @Nullable
    protected final RecyclerView e() {
        return this.f9037a;
    }

    public final int f() {
        return this.f9042f;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public int getMovementFlags(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (h(viewHolder)) {
            return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
        }
        return ItemTouchHelper.Callback.makeMovementFlags(this.f9041e, this.f9042f);
    }

    @NotNull
    public final QuickDragAndSwipe i(@NotNull a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f9045i = callback;
        return this;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isItemViewSwipeEnabled() {
        return this.f9040d;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean isLongPressDragEnabled() {
        return this.f9039c;
    }

    @NotNull
    public final QuickDragAndSwipe j(int i4) {
        this.f9041e = i4;
        return this;
    }

    @NotNull
    public final QuickDragAndSwipe k(@Nullable b bVar) {
        this.f9043g = bVar;
        return this;
    }

    @NotNull
    public final QuickDragAndSwipe l(@Nullable c cVar) {
        this.f9044h = cVar;
        return this;
    }

    @NotNull
    public final QuickDragAndSwipe m(boolean z4) {
        this.f9040d = z4;
        return this;
    }

    @NotNull
    public final QuickDragAndSwipe n(boolean z4) {
        this.f9039c = z4;
        return this;
    }

    protected final void o(@Nullable RecyclerView recyclerView) {
        this.f9037a = recyclerView;
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onChildDraw(@NotNull Canvas c5, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, float f5, float f6, int i4, boolean z4) {
        c cVar;
        Intrinsics.checkNotNullParameter(c5, "c");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        super.onChildDraw(c5, recyclerView, viewHolder, f5, f6, i4, z4);
        if (i4 != 1 || (cVar = this.f9044h) == null) {
            return;
        }
        cVar.d(c5, viewHolder, f5, f6, z4);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public boolean onMove(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, @NotNull RecyclerView.ViewHolder target) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        return viewHolder.getItemViewType() == target.getItemViewType();
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onMoved(@NotNull RecyclerView recyclerView, @NotNull RecyclerView.ViewHolder viewHolder, int i4, @NotNull RecyclerView.ViewHolder target, int i5, int i6, int i7) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        Intrinsics.checkNotNullParameter(target, "target");
        super.onMoved(recyclerView, viewHolder, i4, target, i5, i6, i7);
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        int bindingAdapterPosition2 = target.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || bindingAdapterPosition2 == -1) {
            return;
        }
        a aVar = this.f9045i;
        if (aVar != null) {
            aVar.b(bindingAdapterPosition, bindingAdapterPosition2);
        }
        b bVar = this.f9043g;
        if (bVar != null) {
            bVar.b(viewHolder, bindingAdapterPosition, target, bindingAdapterPosition2);
        }
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSelectedChanged(@Nullable RecyclerView.ViewHolder viewHolder, int i4) {
        if (i4 == 1) {
            this.f9047k = true;
            c cVar = this.f9044h;
            if (cVar != null) {
                cVar.a(viewHolder, g(viewHolder));
            }
        } else if (i4 == 2) {
            this.f9046j = true;
            b bVar = this.f9043g;
            if (bVar != null) {
                bVar.c(viewHolder, g(viewHolder));
            }
        }
        super.onSelectedChanged(viewHolder, i4);
    }

    @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
    public void onSwiped(@NotNull RecyclerView.ViewHolder viewHolder, int i4) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        int bindingAdapterPosition = viewHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return;
        }
        a aVar = this.f9045i;
        if (aVar != null) {
            aVar.a(bindingAdapterPosition);
        }
        c cVar = this.f9044h;
        if (cVar != null) {
            cVar.b(viewHolder, i4, bindingAdapterPosition);
        }
    }

    @NotNull
    public final QuickDragAndSwipe p(int i4) {
        this.f9042f = i4;
        return this;
    }

    @NotNull
    public QuickDragAndSwipe q(int i4) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        RecyclerView recyclerView = this.f9037a;
        if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i4)) != null) {
            Intrinsics.checkNotNullExpressionValue(findViewHolderForAdapterPosition, "recyclerView?.findViewHo…(position) ?: return this");
            this.f9038b.startDrag(findViewHolderForAdapterPosition);
        }
        return this;
    }

    @NotNull
    public QuickDragAndSwipe r(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f9038b.startDrag(holder);
        return this;
    }

    @NotNull
    public QuickDragAndSwipe s(int i4) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        RecyclerView recyclerView = this.f9037a;
        if (recyclerView != null && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i4)) != null) {
            Intrinsics.checkNotNullExpressionValue(findViewHolderForAdapterPosition, "recyclerView?.findViewHo…(position) ?: return this");
            this.f9038b.startSwipe(findViewHolderForAdapterPosition);
        }
        return this;
    }

    @NotNull
    public QuickDragAndSwipe t(@NotNull RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f9038b.startSwipe(holder);
        return this;
    }
}
