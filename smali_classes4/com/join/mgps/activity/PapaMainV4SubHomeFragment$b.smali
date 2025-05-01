.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;
.super Ljava/lang/Object;
.source "PapaMainV4SubHomeFragment.java"

# interfaces
.implements Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView$LoadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->Z(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w0(I)V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v0}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->reset()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$b;->a:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->Z(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->w0(I)V

    return-void
.end method
