.class Lcom/join/mgps/activity/EndGameActivity$f;
.super Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;
.source "EndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameActivity;->afterviews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/EndGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-direct {p0}, Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/EndGameActivity;->p0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 2
    iget-object v2, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/EndGameActivity;->p0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/EndGameTypeBean;

    if-ne v1, p1, :cond_0

    const/4 v3, 0x1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/EndGameTypeBean;->setSelected(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->q0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$j;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->q0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$j;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/EndGameActivity;->p0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 5
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_4

    .line 6
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v1

    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstCompletelyVisibleItemPosition()I

    move-result v0

    if-lt p1, v0, :cond_3

    if-le p1, v1, :cond_4

    .line 8
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameActivity;->i:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    .line 9
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->r0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$k;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->r0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$k;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/join/mgps/activity/EndGameActivity$k;->b(Lcom/join/mgps/activity/EndGameActivity$k;I)Lcom/join/mgps/fragment/EndGameSelectFragment_;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->l0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/dto/EndGameNameListBean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$f;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->l0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/dto/EndGameNameListBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->d0(Ljava/lang/String;)V

    :cond_5
    return-void
.end method
