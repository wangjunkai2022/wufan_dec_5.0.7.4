.class public final Lcom/join/kotlin/ui/notice/NoticeListAdapter;
.super Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
.source "NoticeListAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
        "Lcom/join/mgps/dto/BTActivityBean;",
        "Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;",
        ">;"
    }
.end annotation


# instance fields
.field private clickProxy:Lcom/join/kotlin/ui/notice/ClickProxy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/kotlin/ui/notice/ClickProxy;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/ui/notice/ClickProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clickProxy"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->clickProxy:Lcom/join/kotlin/ui/notice/ClickProxy;

    return-void
.end method


# virtual methods
.method public final getClickProxy()Lcom/join/kotlin/ui/notice/ClickProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->clickProxy:Lcom/join/kotlin/ui/notice/ClickProxy;

    return-object v0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method protected getLayoutResId(I)I
    .locals 0

    const p1, 0x7f0c069a

    return p1
.end method

.method public bridge synthetic onBindItem(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;

    check-cast p2, Lcom/join/mgps/dto/BTActivityBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->onBindItem(Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;Lcom/join/mgps/dto/BTActivityBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItem(Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;Lcom/join/mgps/dto/BTActivityBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/BTActivityBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;->g(Lcom/join/mgps/dto/BTActivityBean;)V

    .line 3
    iget-object p2, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->clickProxy:Lcom/join/kotlin/ui/notice/ClickProxy;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;->h(Lcom/join/kotlin/ui/notice/ClickProxy;)V

    return-void
.end method

.method public bridge synthetic onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;

    check-cast p2, Lcom/join/mgps/dto/BTActivityBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->onBindItemPayloads(Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;Lcom/join/mgps/dto/BTActivityBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItemPayloads(Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;Lcom/join/mgps/dto/BTActivityBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/BTActivityBean;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const-string p3, "binding"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;->g(Lcom/join/mgps/dto/BTActivityBean;)V

    .line 3
    iget-object p2, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->clickProxy:Lcom/join/kotlin/ui/notice/ClickProxy;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/NoticeItemItemBinding;->h(Lcom/join/kotlin/ui/notice/ClickProxy;)V

    return-void
.end method

.method public final setClickProxy(Lcom/join/kotlin/ui/notice/ClickProxy;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/notice/ClickProxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->clickProxy:Lcom/join/kotlin/ui/notice/ClickProxy;

    return-void
.end method

.method public final setContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/notice/NoticeListAdapter;->context:Landroid/content/Context;

    return-void
.end method
