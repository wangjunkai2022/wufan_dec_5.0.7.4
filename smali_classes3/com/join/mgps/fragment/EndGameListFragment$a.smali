.class Lcom/join/mgps/fragment/EndGameListFragment$a;
.super Ljava/lang/Object;
.source "EndGameListFragment.java"

# interfaces
.implements Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameListFragment;->f0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/EndGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$a;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$a;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->W(Lcom/join/mgps/fragment/EndGameListFragment;)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$a;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->i0()V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$a;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/fragment/EndGameListFragment;->V(Lcom/join/mgps/fragment/EndGameListFragment;I)I

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$a;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->i0()V

    return-void
.end method
