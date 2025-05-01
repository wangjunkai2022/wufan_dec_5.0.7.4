.class Lcom/join/mgps/fragment/EndGameListFragment$b;
.super Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;
.source "EndGameListFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameListFragment;->f0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$b;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;->onScrollStateChanged(Landroidx/recyclerview/widget/RecyclerView;I)V

    if-nez p2, :cond_0

    .line 2
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$b;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameListFragment;->X(Lcom/join/mgps/fragment/EndGameListFragment;)Lcom/join/android/app/component/video/c;

    move-result-object p2

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$b;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameListFragment;->b0(Lcom/join/mgps/fragment/EndGameListFragment;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 3
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$b;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameListFragment;->X(Lcom/join/mgps/fragment/EndGameListFragment;)Lcom/join/android/app/component/video/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/join/android/app/component/video/c;->o(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_0
    return-void
.end method
