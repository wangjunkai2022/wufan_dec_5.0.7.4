.class public final Lcom/join/kotlin/quark/SourceShareFragment$initView$4;
.super Ljava/lang/Object;
.source "SourceShareFragment.kt"

# interfaces
.implements Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/quark/SourceShareFragment;->initView(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/quark/SourceShareFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/quark/SourceShareFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/quark/SourceShareFragment$initView$4;->this$0:Lcom/join/kotlin/quark/SourceShareFragment;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareFragment$initView$4;->this$0:Lcom/join/kotlin/quark/SourceShareFragment;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/SourceShareFragment;->loadData(Z)V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/quark/SourceShareFragment$initView$4;->this$0:Lcom/join/kotlin/quark/SourceShareFragment;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/quark/SourceShareFragment;->loadData(Z)V

    return-void
.end method
