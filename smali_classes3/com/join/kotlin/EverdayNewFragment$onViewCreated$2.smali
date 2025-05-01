.class public final Lcom/join/kotlin/EverdayNewFragment$onViewCreated$2;
.super Ljava/lang/Object;
.source "EverdayNewFragment.kt"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/EverdayNewFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/kotlin/EverdayNewFragment;


# direct methods
.method constructor <init>(Lcom/join/kotlin/EverdayNewFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/EverdayNewFragment$onViewCreated$2;->this$0:Lcom/join/kotlin/EverdayNewFragment;

    invoke-virtual {v0}, Lcom/join/kotlin/EverdayNewFragment;->getPageCount()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/kotlin/EverdayNewFragment;->loadData(I)V

    return-void
.end method

.method public onRefresh()V
    .locals 0

    return-void
.end method
