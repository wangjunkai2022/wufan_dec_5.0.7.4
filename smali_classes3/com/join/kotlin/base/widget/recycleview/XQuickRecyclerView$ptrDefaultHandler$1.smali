.class public final Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;
.super Lcom/join/mgps/ptr/a;
.source "XQuickRecyclerView.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;


# direct methods
.method constructor <init>(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/ptr/a;-><init>()V

    return-void
.end method

.method private final setFooterDefault()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->access$getLoadingMoreEnabled$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->setLoadingMoreEnabled(Z)V

    return-void
.end method


# virtual methods
.method public checkCanDoRefresh(Lcom/join/mgps/ptr/PtrFrameLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 2
    .param p1    # Lcom/join/mgps/ptr/PtrFrameLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "header"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->access$getAppbarState$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    move-result-object v0

    sget-object v1, Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;->EXPANDED:Lcom/join/android/app/component/xrecyclerview/AppBarStateChangeListener$State;

    if-ne v0, v1, :cond_0

    invoke-static {p1, p2, p3}, Lcom/join/mgps/ptr/a;->checkContentCanBePulledDown(Lcom/join/mgps/ptr/PtrFrameLayout;Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public onRefreshBegin(Lcom/join/mgps/ptr/PtrFrameLayout;)V
    .locals 1
    .param p1    # Lcom/join/mgps/ptr/PtrFrameLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "frame"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;->setFooterDefault()V

    .line 2
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->access$getMLoadingListener$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$ptrDefaultHandler$1;->this$0:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-static {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->access$getMLoadingListener$p(Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;)Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {p1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;->onRefresh()V

    :cond_0
    return-void
.end method
