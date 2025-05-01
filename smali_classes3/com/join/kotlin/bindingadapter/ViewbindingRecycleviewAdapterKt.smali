.class public final Lcom/join/kotlin/bindingadapter/ViewbindingRecycleviewAdapterKt;
.super Ljava/lang/Object;
.source "ViewbindingRecycleviewAdapter.kt"


# direct methods
.method public static final recycleviewdataBinding(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V
    .locals 1
    .param p0    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/databinding/BindingAdapter;
        requireAll = false
        value = {
            "submitList"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "recyclerView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object p0

    const-string v0, "null cannot be cast to non-null type com.join.kotlin.domain.adapter.BaseDataBindingAdapter<kotlin.Any, androidx.databinding.ViewDataBinding>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;

    .line 3
    invoke-virtual {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->submitList(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method public static final xrecycleviewadapterBinding(Lcom/join/android/app/component/xrecyclerview/XRecyclerView;Ljava/util/List;Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;Ljava/lang/Integer;Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V
    .locals 1
    .param p0    # Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/databinding/BindingAdapter;
        requireAll = false
        value = {
            "xsubmitList",
            "xadapter",
            "showStatus",
            "listener"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/android/app/component/xrecyclerview/XRecyclerView;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
            "Ljava/lang/Object;",
            "Landroidx/databinding/ViewDataBinding;",
            ">;",
            "Ljava/lang/Integer;",
            "Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;",
            ")V"
        }
    .end annotation

    const-string v0, "recyclerView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "xsubmitList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "xadapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    invoke-virtual {p0, p2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 3
    :cond_0
    invoke-virtual {p2, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;->submitList(Ljava/util/List;)V

    const/4 p1, 0x1

    if-eqz p4, :cond_1

    .line 4
    invoke-virtual {p0, p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 5
    invoke-virtual {p0, p4}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    :cond_1
    if-nez p3, :cond_2

    goto :goto_0

    .line 6
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, p1, :cond_3

    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->reset()V

    goto :goto_4

    :cond_3
    :goto_0
    const/4 p1, 0x3

    if-nez p3, :cond_4

    goto :goto_1

    .line 7
    :cond_4
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, p1, :cond_5

    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->refreshComplete()V

    goto :goto_4

    :cond_5
    :goto_1
    const/4 p1, 0x4

    if-nez p3, :cond_6

    goto :goto_2

    .line 8
    :cond_6
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, p1, :cond_7

    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    goto :goto_4

    :cond_7
    :goto_2
    const/4 p1, 0x2

    if-nez p3, :cond_8

    goto :goto_3

    .line 9
    :cond_8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p2

    if-ne p2, p1, :cond_9

    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    goto :goto_4

    .line 10
    :cond_9
    :goto_3
    invoke-virtual {p0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->reset()V

    :goto_4
    return-void
.end method
