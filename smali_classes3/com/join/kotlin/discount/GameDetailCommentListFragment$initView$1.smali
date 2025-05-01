.class final Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;
.super Lkotlin/jvm/internal/Lambda;
.source "GameDetailCommentListFragment.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/GameDetailCommentListFragment;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    invoke-static {v0}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->access$getLoadSir$p(Lcom/join/kotlin/discount/GameDetailCommentListFragment;)Lcom/kingja/loadsir/core/b;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "loadSir"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-static {v0}, Lcom/join/kotlin/base/ext/CustomViewExtKt;->showLoading(Lcom/kingja/loadsir/core/b;)V

    .line 3
    iget-object v0, p0, Lcom/join/kotlin/discount/GameDetailCommentListFragment$initView$1;->this$0:Lcom/join/kotlin/discount/GameDetailCommentListFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/discount/GameDetailCommentListFragment;->loadData(Z)V

    return-void
.end method
