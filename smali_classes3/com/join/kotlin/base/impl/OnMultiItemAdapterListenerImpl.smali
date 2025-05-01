.class public abstract Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;
.super Ljava/lang/Object;
.source "OnMultiItemAdapterListenerImpl.kt"

# interfaces
.implements Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "V:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b<",
        "TT;",
        "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
        "TV;>;>;"
    }
.end annotation


# instance fields
.field private final layoutId:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;->layoutId:I

    return-void
.end method


# virtual methods
.method public final getLayoutId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;->layoutId:I

    return v0
.end method

.method public isFullSpanItem(I)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->a(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILjava/lang/Object;Ljava/util/List;)V

    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILjava/lang/Object;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "TV;>;ITT;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->b(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;->onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "TV;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "parent"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget p3, p0, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;->layoutId:I

    .line 3
    invoke-static {p1, p3, p2}, Lcom/join/kotlin/base/ext/ViewBindUtilKt;->generateDataBindingHolder(Landroid/content/Context;ILandroid/view/ViewGroup;)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method public onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->c(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z

    move-result p1

    return p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->d(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->e(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->f(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method
