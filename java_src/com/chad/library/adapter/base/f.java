package com.chad.library.adapter.base;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.loadState.b;
import com.chad.library.adapter.base.loadState.leading.DefaultLeadingLoadStateAdapter;
import com.chad.library.adapter.base.loadState.leading.LeadingLoadStateAdapter;
import com.chad.library.adapter.base.loadState.trailing.DefaultTrailingLoadStateAdapter;
import com.chad.library.adapter.base.loadState.trailing.TrailingLoadStateAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: QuickAdapterHelper.kt */
@SourceDebugExtension({"SMAP\nQuickAdapterHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,337:1\n1#2:338\n1855#3,2:339\n1855#3,2:341\n*S KotlinDebug\n*F\n+ 1 QuickAdapterHelper.kt\ncom/chad/library/adapter/base/QuickAdapterHelper\n*L\n155#1:339,2\n219#1:341,2\n*E\n"})
/* loaded from: classes2.dex */
public final class f {
    @NotNull

    /* renamed from: a  reason: collision with root package name */
    private final BaseQuickAdapter<?, ?> f9050a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    private final LeadingLoadStateAdapter<?> f9051b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final TrailingLoadStateAdapter<?> f9052c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<BaseQuickAdapter<?, ?>> f9053d;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    private final ArrayList<BaseQuickAdapter<?, ?>> f9054e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    private final ConcatAdapter f9055f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    private BaseQuickAdapter.f f9056g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    private BaseQuickAdapter.f f9057h;

    /* compiled from: QuickAdapterHelper.kt */
    /* loaded from: classes2.dex */
    public static final class a implements BaseQuickAdapter.f {
        a() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.f
        public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            f.this.l().h(holder.getBindingAdapterPosition());
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.f
        public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }
    }

    /* compiled from: QuickAdapterHelper.kt */
    /* loaded from: classes2.dex */
    public static final class b implements BaseQuickAdapter.f {
        b() {
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.f
        public void onViewAttachedToWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            TrailingLoadStateAdapter<?> n4 = f.this.n();
            RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter = holder.getBindingAdapter();
            n4.m(bindingAdapter != null ? bindingAdapter.getItemCount() : 0, holder.getBindingAdapterPosition());
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter.f
        public void onViewDetachedFromWindow(@NotNull RecyclerView.ViewHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }
    }

    /* compiled from: QuickAdapterHelper.kt */
    /* loaded from: classes2.dex */
    public static final class c {
        @NotNull

        /* renamed from: a  reason: collision with root package name */
        private final BaseQuickAdapter<?, ?> f9060a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        private LeadingLoadStateAdapter<?> f9061b;
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        private TrailingLoadStateAdapter<?> f9062c;
        @NotNull

        /* renamed from: d  reason: collision with root package name */
        private ConcatAdapter.Config f9063d;

        public c(@NotNull BaseQuickAdapter<?, ?> contentAdapter) {
            Intrinsics.checkNotNullParameter(contentAdapter, "contentAdapter");
            this.f9060a = contentAdapter;
            ConcatAdapter.Config DEFAULT = ConcatAdapter.Config.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(DEFAULT, "DEFAULT");
            this.f9063d = DEFAULT;
        }

        @NotNull
        public final f a() {
            return new f(this.f9060a, this.f9061b, this.f9062c, this.f9063d, null);
        }

        @NotNull
        public final c b(@NotNull ConcatAdapter.Config config) {
            Intrinsics.checkNotNullParameter(config, "config");
            this.f9063d = config;
            return this;
        }

        @NotNull
        public final c c(@Nullable LeadingLoadStateAdapter.a aVar) {
            DefaultLeadingLoadStateAdapter defaultLeadingLoadStateAdapter = new DefaultLeadingLoadStateAdapter();
            defaultLeadingLoadStateAdapter.p(aVar);
            return d(defaultLeadingLoadStateAdapter);
        }

        @NotNull
        public final c d(@Nullable LeadingLoadStateAdapter<?> leadingLoadStateAdapter) {
            this.f9061b = leadingLoadStateAdapter;
            return this;
        }

        @NotNull
        public final c e(@Nullable TrailingLoadStateAdapter.a aVar) {
            DefaultTrailingLoadStateAdapter defaultTrailingLoadStateAdapter = new DefaultTrailingLoadStateAdapter(false, 1, null);
            defaultTrailingLoadStateAdapter.x(aVar);
            return f(defaultTrailingLoadStateAdapter);
        }

        @NotNull
        public final c f(@Nullable TrailingLoadStateAdapter<?> trailingLoadStateAdapter) {
            this.f9062c = trailingLoadStateAdapter;
            return this;
        }
    }

    private f(BaseQuickAdapter<?, ?> baseQuickAdapter, LeadingLoadStateAdapter<?> leadingLoadStateAdapter, TrailingLoadStateAdapter<?> trailingLoadStateAdapter, ConcatAdapter.Config config) {
        this.f9050a = baseQuickAdapter;
        this.f9051b = leadingLoadStateAdapter;
        this.f9052c = trailingLoadStateAdapter;
        this.f9053d = new ArrayList<>(0);
        this.f9054e = new ArrayList<>(0);
        ConcatAdapter concatAdapter = new ConcatAdapter(config, new RecyclerView.Adapter[0]);
        this.f9055f = concatAdapter;
        if (leadingLoadStateAdapter != null) {
            concatAdapter.addAdapter(leadingLoadStateAdapter);
            a aVar = new a();
            baseQuickAdapter.addOnViewAttachStateChangeListener(aVar);
            this.f9056g = aVar;
        }
        concatAdapter.addAdapter(baseQuickAdapter);
        if (trailingLoadStateAdapter != null) {
            concatAdapter.addAdapter(trailingLoadStateAdapter);
            b bVar = new b();
            baseQuickAdapter.addOnViewAttachStateChangeListener(bVar);
            this.f9057h = bVar;
        }
    }

    public /* synthetic */ f(BaseQuickAdapter baseQuickAdapter, LeadingLoadStateAdapter leadingLoadStateAdapter, TrailingLoadStateAdapter trailingLoadStateAdapter, ConcatAdapter.Config config, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseQuickAdapter, leadingLoadStateAdapter, trailingLoadStateAdapter, config);
    }

    @NotNull
    public final f a(int i4, @NotNull BaseQuickAdapter<?, ?> adapter) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (i4 >= 0 && i4 <= this.f9054e.size()) {
            if (i4 == this.f9054e.size()) {
                b(adapter);
            } else {
                if (this.f9052c == null) {
                    size = this.f9055f.getAdapters().size();
                    size2 = this.f9054e.size();
                } else {
                    size = this.f9055f.getAdapters().size() - 1;
                    size2 = this.f9054e.size();
                }
                this.f9055f.addAdapter((size - size2) + i4, adapter);
                this.f9054e.add(adapter);
            }
            return this;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f9054e.size() + ". Given:" + i4);
    }

    @NotNull
    public final f b(@NotNull BaseQuickAdapter<?, ?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        BaseQuickAdapter.f fVar = this.f9057h;
        if (fVar != null) {
            if (this.f9054e.isEmpty()) {
                this.f9050a.removeOnViewAttachStateChangeListener(fVar);
            } else {
                ((BaseQuickAdapter) CollectionsKt.last((List<? extends Object>) this.f9054e)).removeOnViewAttachStateChangeListener(fVar);
            }
            adapter.addOnViewAttachStateChangeListener(fVar);
        }
        if (this.f9052c == null) {
            this.f9055f.addAdapter(adapter);
        } else {
            ConcatAdapter concatAdapter = this.f9055f;
            concatAdapter.addAdapter(concatAdapter.getAdapters().size() - 1, adapter);
        }
        this.f9054e.add(adapter);
        return this;
    }

    @NotNull
    public final f c(int i4, @NotNull BaseQuickAdapter<?, ?> adapter) {
        BaseQuickAdapter.f fVar;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (i4 >= 0 && i4 <= this.f9053d.size()) {
            if (i4 == 0 && (fVar = this.f9056g) != null) {
                if (this.f9053d.isEmpty()) {
                    this.f9050a.removeOnViewAttachStateChangeListener(fVar);
                } else {
                    ((BaseQuickAdapter) CollectionsKt.first((List<? extends Object>) this.f9053d)).removeOnViewAttachStateChangeListener(fVar);
                }
                adapter.addOnViewAttachStateChangeListener(fVar);
            }
            if (this.f9051b != null) {
                i4++;
            }
            this.f9055f.addAdapter(i4, adapter);
            this.f9053d.add(adapter);
            return this;
        }
        throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f9053d.size() + ". Given:" + i4);
    }

    @NotNull
    public final f d(@NotNull BaseQuickAdapter<?, ?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        c(this.f9053d.size(), adapter);
        return this;
    }

    @NotNull
    public final f e() {
        Iterator<T> it2 = this.f9054e.iterator();
        while (it2.hasNext()) {
            BaseQuickAdapter baseQuickAdapter = (BaseQuickAdapter) it2.next();
            this.f9055f.removeAdapter(baseQuickAdapter);
            BaseQuickAdapter.f fVar = this.f9057h;
            if (fVar != null) {
                baseQuickAdapter.removeOnViewAttachStateChangeListener(fVar);
            }
        }
        this.f9054e.clear();
        return this;
    }

    @NotNull
    public final f f() {
        Iterator<T> it2 = this.f9053d.iterator();
        while (it2.hasNext()) {
            BaseQuickAdapter baseQuickAdapter = (BaseQuickAdapter) it2.next();
            this.f9055f.removeAdapter(baseQuickAdapter);
            BaseQuickAdapter.f fVar = this.f9056g;
            if (fVar != null) {
                baseQuickAdapter.removeOnViewAttachStateChangeListener(fVar);
            }
        }
        this.f9053d.clear();
        return this;
    }

    @NotNull
    public final ConcatAdapter g() {
        return this.f9055f;
    }

    @NotNull
    public final List<BaseQuickAdapter<?, ?>> h() {
        return this.f9054e;
    }

    @NotNull
    public final List<BaseQuickAdapter<?, ?>> i() {
        return this.f9053d;
    }

    @NotNull
    public final BaseQuickAdapter<?, ?> j() {
        return this.f9050a;
    }

    @NotNull
    public final com.chad.library.adapter.base.loadState.b k() {
        com.chad.library.adapter.base.loadState.b b5;
        LeadingLoadStateAdapter<?> leadingLoadStateAdapter = this.f9051b;
        return (leadingLoadStateAdapter == null || (b5 = leadingLoadStateAdapter.b()) == null) ? new b.d(false) : b5;
    }

    @Nullable
    public final LeadingLoadStateAdapter<?> l() {
        return this.f9051b;
    }

    @NotNull
    public final com.chad.library.adapter.base.loadState.b m() {
        com.chad.library.adapter.base.loadState.b b5;
        TrailingLoadStateAdapter<?> trailingLoadStateAdapter = this.f9052c;
        return (trailingLoadStateAdapter == null || (b5 = trailingLoadStateAdapter.b()) == null) ? new b.d(false) : b5;
    }

    @Nullable
    public final TrailingLoadStateAdapter<?> n() {
        return this.f9052c;
    }

    @NotNull
    public final f o(@NotNull BaseQuickAdapter<?, ?> adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        if (!Intrinsics.areEqual(adapter, this.f9050a)) {
            this.f9055f.removeAdapter(adapter);
            this.f9053d.remove(adapter);
            this.f9054e.remove(adapter);
            BaseQuickAdapter.f fVar = this.f9056g;
            if (fVar != null) {
                adapter.removeOnViewAttachStateChangeListener(fVar);
                if (this.f9053d.isEmpty()) {
                    this.f9050a.addOnViewAttachStateChangeListener(fVar);
                } else {
                    ((BaseQuickAdapter) CollectionsKt.first((List<? extends Object>) this.f9053d)).addOnViewAttachStateChangeListener(fVar);
                }
            }
            BaseQuickAdapter.f fVar2 = this.f9057h;
            if (fVar2 != null) {
                adapter.removeOnViewAttachStateChangeListener(fVar2);
                if (this.f9054e.isEmpty()) {
                    this.f9050a.addOnViewAttachStateChangeListener(fVar2);
                } else {
                    ((BaseQuickAdapter) CollectionsKt.last((List<? extends Object>) this.f9054e)).addOnViewAttachStateChangeListener(fVar2);
                }
            }
        }
        return this;
    }

    public final void p(@NotNull com.chad.library.adapter.base.loadState.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        LeadingLoadStateAdapter<?> leadingLoadStateAdapter = this.f9051b;
        if (leadingLoadStateAdapter == null) {
            return;
        }
        leadingLoadStateAdapter.f(value);
    }

    public final void q(@NotNull com.chad.library.adapter.base.loadState.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        TrailingLoadStateAdapter<?> trailingLoadStateAdapter = this.f9052c;
        if (trailingLoadStateAdapter == null) {
            return;
        }
        trailingLoadStateAdapter.f(value);
    }
}
