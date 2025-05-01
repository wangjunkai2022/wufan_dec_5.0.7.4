.class Lcom/join/mgps/fragment/SearchGameListFragment$c;
.super Ljava/lang/Object;
.source "SearchGameListFragment.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XQuickRecyclerView$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SearchGameListFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/SearchGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SearchGameListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->a0(Lcom/join/mgps/fragment/SearchGameListFragment;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    iput v1, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    const/4 v2, 0x0

    .line 3
    invoke-static {v0, v2}, Lcom/join/mgps/fragment/SearchGameListFragment;->b0(Lcom/join/mgps/fragment/SearchGameListFragment;Z)Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->c0(Lcom/join/mgps/fragment/SearchGameListFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    iget v2, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->s:I

    add-int/2addr v2, v1

    iput v2, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->s:I

    .line 6
    invoke-virtual {v0, v2}, Lcom/join/mgps/fragment/SearchGameListFragment;->i0(I)V

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    iget v2, v0, Lcom/join/mgps/fragment/SearchGameListFragment;->p:I

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Lcom/join/mgps/fragment/SearchGameListFragment;->i0(I)V

    :goto_0
    return-void
.end method

.method public onRefresh()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SearchGameListFragment$c;->a:Lcom/join/mgps/fragment/SearchGameListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/SearchGameListFragment;->R()V

    return-void
.end method
