.class public final Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;
.super Ljava/lang/Object;
.source "GameDetailCommentListFragment.kt"

# interfaces
.implements Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailCommentListFragment;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadData(Z)V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$3;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadData(Z)V

    return-void
.end method
