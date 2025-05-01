.class Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;
.super Ljava/lang/Object;
.source "PapaMainV4SubHomeFragment.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->i0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirstCommendVersion()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirst35()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object v1, v0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    if-eqz v1, :cond_2

    .line 4
    invoke-virtual {v1}, Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;->getLastCompletelyVisiblePosition()I

    move-result v1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->e0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;I)I

    :cond_2
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->j0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_7

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->d0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)I

    move-result v2

    if-gt v1, v2, :cond_6

    .line 7
    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->j0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonMultiItemBean;

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->isExposure()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_4

    .line 9
    :cond_3
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getItemType()I

    move-result v3

    const/4 v4, 0x5

    if-eq v3, v4, :cond_4

    const/4 v4, 0x7

    if-eq v3, v4, :cond_4

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    .line 10
    :pswitch_0
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Ljava/util/List;

    if-eqz v3, :cond_5

    .line 11
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_5

    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_5

    .line 13
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object v4, v4, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 14
    instance-of v5, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_5

    .line 15
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    const v5, 0x7f0910e8

    .line 16
    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v4, :cond_5

    .line 18
    invoke-virtual {v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastCompletelyVisibleItemPosition()I

    move-result v4

    const/4 v5, 0x0

    :goto_1
    if-gt v5, v4, :cond_5

    .line 19
    iget-object v6, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    invoke-static {v6, v7, v5}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->l0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 20
    :pswitch_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/dto/HomeRankingListBean;

    if-eqz v3, :cond_5

    .line 21
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/HomeRankingListBean;

    if-eqz v3, :cond_5

    .line 22
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    .line 23
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    iget-object v4, v4, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->b:Lcom/join/kotlin/base/widget/recycleview/XQuickRecyclerView;

    invoke-virtual {v4, v1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    move-result-object v4

    .line 24
    instance-of v5, v4, Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v5, :cond_5

    .line 25
    check-cast v4, Lcom/join/mgps/base/BaseViewHolder;

    const v5, 0x7f0917c8

    .line 26
    invoke-virtual {v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/viewpager2/widget/ViewPager2;

    .line 27
    invoke-virtual {v3}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v4}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result v4

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 28
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 29
    iget-object v5, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v5, v4}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    goto :goto_2

    .line 30
    :cond_4
    :pswitch_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    instance-of v3, v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v3, :cond_5

    .line 31
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 32
    iget-object v4, p0, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment$d;->b:Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;

    invoke-static {v4, v3}, Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;->k0(Lcom/join/mgps/activity/PapaMainV4SubHomeFragment;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_5
    :goto_3
    const/4 v3, 0x1

    .line 33
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/CommonMultiItemBean;->setExposure(Z)V

    :cond_6
    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    :cond_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method
