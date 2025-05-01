.class public final Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;
.super Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;
.source "EmusArchiveAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter<",
        "Lcom/join/mgps/dto/CloudListDataBean;",
        "Landroidx/databinding/ViewDataBinding;",
        ">;"
    }
.end annotation


# instance fields
.field private context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final defaultDisplay:Landroid/view/Display;

.field private final height:I

.field private listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final ratio:F

.field private final width:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/domain/adapter/BaseDataBindingAdapter;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->context:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;

    const-string p2, "null cannot be cast to non-null type android.app.Activity"

    .line 4
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1

    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->defaultDisplay:Landroid/view/Display;

    .line 5
    invoke-virtual {p1}, Landroid/view/Display;->getWidth()I

    move-result p2

    iput p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->width:I

    .line 6
    invoke-virtual {p1}, Landroid/view/Display;->getHeight()I

    move-result p1

    iput p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->height:I

    if-le p2, p1, :cond_0

    int-to-float p2, p2

    int-to-float p1, p1

    div-float/2addr p2, p1

    goto :goto_0

    :cond_0
    int-to-float p1, p1

    int-to-float p2, p2

    div-float p2, p1, p2

    .line 7
    :goto_0
    iput p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->ratio:F

    return-void
.end method


# virtual methods
.method public final getContext()Landroid/content/Context;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final getDefaultDisplay()Landroid/view/Display;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->defaultDisplay:Landroid/view/Display;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->height:I

    return v0
.end method

.method protected getLayoutResId(I)I
    .locals 0

    const p1, 0x7f0c0226

    return p1
.end method

.method public final getListener()Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;

    return-object v0
.end method

.method public final getRatio()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->ratio:F

    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->width:I

    return v0
.end method

.method protected onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/CloudListDataBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/CloudListDataBean;
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
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;

    if-eqz p3, :cond_0

    .line 3
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;->h(Lcom/join/mgps/dto/CloudListDataBean;)V

    .line 4
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onBindItem(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->onBindItem(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/CloudListDataBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method protected onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/CloudListDataBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/databinding/ViewDataBinding;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/mgps/dto/CloudListDataBean;
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
    instance-of p3, p1, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;

    if-eqz p3, :cond_0

    .line 3
    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;->h(Lcom/join/mgps/dto/CloudListDataBean;)V

    .line 4
    iget-object p2, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;

    invoke-virtual {p1, p2}, Lcom/join/android/app/mgsim/wufun/databinding/EmusArchiveGameDetailListItemBinding;->g(Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Ljava/lang/Object;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/join/mgps/dto/CloudListDataBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->onBindItemPayloads(Landroidx/databinding/ViewDataBinding;Lcom/join/mgps/dto/CloudListDataBean;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

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
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->context:Landroid/content/Context;

    return-void
.end method

.method public final setListener(Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;)V
    .locals 1
    .param p1    # Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/ui/cloudarchive/adapter/EmusArchiveAdapter;->listener:Lcom/join/kotlin/ui/cloudarchive/adapter/OnEmusClickArchiveListener;

    return-void
.end method
