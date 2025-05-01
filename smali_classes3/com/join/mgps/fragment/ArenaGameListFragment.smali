.class public Lcom/join/mgps/fragment/ArenaGameListFragment;
.super Lcom/join/mgps/basefragment/BaseLoadingFragment;
.source "ArenaGameListFragment.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0273
.end annotation


# static fields
.field private static final m:I = 0xa


# instance fields
.field c:Lcom/join/mgps/rpc/l;

.field d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:I

.field private h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;"
        }
    .end annotation
.end field

.field private j:Landroid/app/Activity;

.field private k:I

.field private l:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/fragment/ArenaGameListFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->k:I

    return p0
.end method

.method static synthetic g0(Lcom/join/mgps/fragment/ArenaGameListFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    return-object p0
.end method

.method static synthetic h0(Lcom/join/mgps/fragment/ArenaGameListFragment;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic i0(Lcom/join/mgps/fragment/ArenaGameListFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    return p0
.end method


# virtual methods
.method protected W()I
    .locals 1

    const v0, 0x7f0c0273

    return v0
.end method

.method protected X()I
    .locals 1

    const v0, 0x7f090619

    return v0
.end method

.method afterViews()V
    .locals 10
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/l;->n0()Lcom/join/mgps/rpc/impl/l;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->c:Lcom/join/mgps/rpc/l;

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    .line 4
    :cond_0
    new-instance v0, Lcom/join/mgps/adapter/GameInfoAdapterV2;

    iget-object v1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/GameInfoAdapterV2;-><init>(Landroid/content/Context;Z)V

    iput-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPreLoadCount(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    iget-object v3, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v4

    invoke-static {v4}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    invoke-virtual {v4, v5}, Lcom/join/android/app/common/utils/n;->j(Landroid/app/Activity;)F

    move-result v4

    float-to-double v4, v4

    const-wide v6, 0x3ffe666666666666L    # 1.9

    const/4 v8, 0x2

    cmpl-double v9, v4, v6

    if-ltz v9, :cond_1

    const/4 v4, 0x3

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    invoke-direct {v1, v3, v4}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

    new-instance v1, Lcom/join/mgps/fragment/ArenaGameListFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/ArenaGameListFragment$a;-><init>(Lcom/join/mgps/fragment/ArenaGameListFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/adapter/GameInfoAdapterV2;->f(Lcom/join/mgps/adapter/GameInfoAdapterV2$e;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPullRefreshEnabled(Z)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v3, Lcom/join/mgps/fragment/ArenaGameListFragment$b;

    invoke-direct {v3, p0}, Lcom/join/mgps/fragment/ArenaGameListFragment$b;-><init>(Lcom/join/mgps/fragment/ArenaGameListFragment;)V

    invoke-virtual {v0, v3}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 12
    iget v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    if-ne v0, v8, :cond_3

    .line 13
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v3, 0xa

    if-lt v0, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iput-boolean v1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    if-nez v1, :cond_4

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    goto :goto_2

    .line 15
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;->d0()V

    .line 16
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->loadData()V

    .line 17
    :cond_4
    :goto_2
    iget-object v0, p0, Lcom/join/mgps/basefragment/BaseLoadingFragment;->b:Lcom/join/mgps/customview/LoadingLayout;

    invoke-virtual {v0, v2}, Lcom/join/mgps/customview/LoadingLayout;->setLoadingLayoutBGColor(I)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public j0(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->f:I

    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->loadData()V

    return-void
.end method

.method k0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const v1, 0x7f100299

    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method l0(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameInfoBean;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    if-eqz p1, :cond_2

    .line 3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ltz v0, :cond_2

    .line 4
    iget v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 7
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-virtual {p1, v0}, Lcom/join/mgps/adapter/GameInfoAdapterV2;->e(Ljava/util/List;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopLoadMore()V

    .line 9
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->stopRefresh()V

    .line 10
    iget-boolean p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    if-nez p1, :cond_3

    .line 11
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-gtz p1, :cond_3

    .line 13
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    return-void

    .line 14
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->h:Lcom/join/mgps/adapter/GameInfoAdapterV2;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method protected loadData()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_8

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->c:Lcom/join/mgps/rpc/l;

    iget v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->f:I

    iget v3, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->e:I

    iget v4, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    invoke-interface {v0, v2, v3, v4}, Lcom/join/mgps/rpc/l;->w(III)Lcom/join/mgps/dto/ResultResMainBean;

    move-result-object v0

    .line 3
    iget-object v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    move-result v2

    if-nez v2, :cond_7

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v2, v3, :cond_0

    iget-object v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->isDestroyed()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :cond_0
    if-eqz v0, :cond_6

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultResMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/NewArenaGameListBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/NewArenaGameListBean;->getGame_list()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_3

    .line 7
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0xa

    if-lt v3, v4, :cond_2

    const/4 v2, 0x1

    .line 8
    :cond_2
    iput-boolean v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    goto :goto_0

    .line 9
    :cond_3
    iput-boolean v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    .line 10
    :goto_0
    iget v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    if-gt v2, v1, :cond_4

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;->a0()V

    .line 12
    :cond_4
    iget-boolean v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->l:Z

    if-eqz v2, :cond_5

    iget v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    .line 13
    :cond_5
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->l0(Ljava/util/List;)V

    goto :goto_3

    .line 14
    :cond_6
    :goto_1
    iget v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    if-gt v0, v1, :cond_9

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_7
    :goto_2
    return-void

    :catch_0
    nop

    .line 16
    iget v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    if-gt v0, v1, :cond_9

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->showLodingFailed()V

    goto :goto_3

    .line 18
    :cond_8
    iget v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    if-gt v0, v1, :cond_9

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->showLodingFailed()V

    .line 20
    invoke-virtual {p0}, Lcom/join/mgps/fragment/ArenaGameListFragment;->k0()V

    :cond_9
    :goto_3
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onAttach(Landroid/content/Context;)V

    .line 2
    check-cast p1, Landroid/app/Activity;

    iput-object p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "game_type"

    .line 3
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->e:I

    const-string v0, "room_type"

    .line 4
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->f:I

    const-string v0, "from"

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->k:I

    const-string v0, "pn"

    .line 6
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    const-string v0, "datas"

    .line 7
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    .line 8
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 10
    iput p1, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->g:I

    :cond_2
    :goto_1
    return-void
.end method

.method public onDetach()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->j:Landroid/app/Activity;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/ArenaGameListFragment;->i:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_2

    .line 4
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/basefragment/BaseLoadingFragment;->c0()V

    :cond_2
    return-void
.end method
