.class public Lcom/join/mgps/fragment/EndGameSelectFragment;
.super Landroidx/fragment/app/Fragment;
.source "EndGameSelectFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/EndGameSelectFragment$c;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0264
.end annotation


# instance fields
.field b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:I
    .annotation build Lorg/androidannotations/annotations/FragmentArg;
    .end annotation
.end field

.field private f:I

.field private g:Landroid/content/Context;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->f:I

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/fragment/EndGameSelectFragment;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->f:I

    return p0
.end method

.method static synthetic W(Lcom/join/mgps/fragment/EndGameSelectFragment;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->f:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->f:I

    return v0
.end method

.method static synthetic X(Lcom/join/mgps/fragment/EndGameSelectFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    return-object p0
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/EndGameSelectFragment;)Lcom/join/mgps/fragment/EndGameSelectFragment$c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    return-object p0
.end method


# virtual methods
.method a0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->g:Landroid/content/Context;

    .line 2
    new-instance v0, Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/fragment/EndGameSelectFragment$c;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    new-instance v1, Lcom/join/mgps/fragment/EndGameSelectFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameSelectFragment$a;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment;)V

    iget-object v2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnLoadMoreListener(Lcom/join/mgps/base/BaseQuickAdapter$l;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    new-instance v1, Lcom/join/mgps/fragment/EndGameSelectFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/EndGameSelectFragment$b;-><init>(Lcom/join/mgps/fragment/EndGameSelectFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->showLoding()V

    .line 8
    iget v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->f:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->b0(I)V

    return-void
.end method

.method b0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->g:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2
    new-instance v0, Lcom/join/mgps/dto/RequestEndGameTypeArgs;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->g:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;->setUid(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, p1}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;->setPage(I)V

    .line 5
    iget v1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->e:I

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestEndGameTypeArgs;->setModelType(I)V

    .line 6
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 7
    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->g:Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 9
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/rpc/impl/i;->I(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameListBean;->getGameList()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameListBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameListBean;->getGameList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-gtz v1, :cond_0

    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameListBean;

    invoke-virtual {p0, v0, p1}, Lcom/join/mgps/fragment/EndGameSelectFragment;->e0(Lcom/join/mgps/dto/EndGameListBean;I)V

    goto :goto_1

    .line 13
    :cond_1
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->c0()V

    :cond_2
    :goto_1
    return-void
.end method

.method c0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreEnd(Z)V

    return-void
.end method

.method public d0(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/EndGameNameListBean;

    .line 3
    invoke-virtual {v1}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/EndGameNameListBean;->setSelected(Z)V

    goto :goto_0

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    :goto_1
    return-void
.end method

.method e0(Lcom/join/mgps/dto/EndGameListBean;I)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->showMain()V

    .line 2
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    if-nez p2, :cond_0

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameListBean;->getGameList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    if-eqz p1, :cond_1

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/base/BaseQuickAdapter;->loadMoreComplete()V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->i:Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->h:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public setMenuVisibility(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setMenuVisibility(Z)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->d:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->c:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showMain()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showTost(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
