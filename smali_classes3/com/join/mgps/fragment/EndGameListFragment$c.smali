.class Lcom/join/mgps/fragment/EndGameListFragment$c;
.super Ljava/lang/Object;
.source "EndGameListFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameListFragment;->o0(Ljava/util/List;)V
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
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$c;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$c;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->X(Lcom/join/mgps/fragment/EndGameListFragment;)Lcom/join/android/app/component/video/c;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$c;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->b0(Lcom/join/mgps/fragment/EndGameListFragment;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$c;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->X(Lcom/join/mgps/fragment/EndGameListFragment;)Lcom/join/android/app/component/video/c;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment$c;->b:Lcom/join/mgps/fragment/EndGameListFragment;

    iget-object v1, v1, Lcom/join/mgps/fragment/EndGameListFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/video/c;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_0
    return-void
.end method
