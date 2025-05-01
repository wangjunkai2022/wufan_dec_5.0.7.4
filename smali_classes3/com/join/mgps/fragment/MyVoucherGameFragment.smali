.class public Lcom/join/mgps/fragment/MyVoucherGameFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "MyVoucherGameFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c04fe
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field c:Lcom/join/mgps/customview/XListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Lcom/join/mgps/rpc/b;

.field private g:I

.field private h:Lcom/join/mgps/adapter/y2;

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/AccountVoucherGame;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->g:I

    return-void
.end method


# virtual methods
.method V()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->setNoMore()V

    return-void
.end method

.method W()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->q()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->r()V

    return-void
.end method

.method X()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->c:Lcom/join/mgps/customview/XListView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->h:Lcom/join/mgps/adapter/y2;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method afterViews()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->f:Lcom/join/mgps/rpc/b;

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->b:Landroid/content/Context;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    .line 4
    new-instance v1, Lcom/join/mgps/dto/AccountVoucherGame;

    invoke-direct {v1}, Lcom/join/mgps/dto/AccountVoucherGame;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/AccountVoucherGame;

    invoke-direct {v1}, Lcom/join/mgps/dto/AccountVoucherGame;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/AccountVoucherGame;

    invoke-direct {v1}, Lcom/join/mgps/dto/AccountVoucherGame;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    new-instance v1, Lcom/join/mgps/dto/AccountVoucherGame;

    invoke-direct {v1}, Lcom/join/mgps/dto/AccountVoucherGame;-><init>()V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v0, Lcom/join/mgps/adapter/y2;

    iget-object v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    iget-object v2, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->b:Landroid/content/Context;

    invoke-direct {v0, v1, v2}, Lcom/join/mgps/adapter/y2;-><init>(Ljava/util/List;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->h:Lcom/join/mgps/adapter/y2;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->X()V

    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method loadData()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 2
    :try_start_0
    new-instance v0, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v0}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->f:Lcom/join/mgps/rpc/b;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/b;->f(Ljava/util/Map;)Lcom/join/mgps/dto/ResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getFlag()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMainBean;->getMessages()Lcom/join/mgps/dto/ResultMessageBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResultMessageBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 7
    iget v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->g:I

    if-ne v1, v2, :cond_0

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 10
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 11
    :goto_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->X()V

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->V()V

    goto :goto_1

    .line 13
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->W()V

    goto :goto_1

    .line 14
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->V()V

    goto :goto_1

    .line 15
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->showLodingFailed()V

    goto :goto_1

    .line 18
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->W()V

    .line 19
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->showLodingFailed()V

    :goto_1
    return-void
.end method

.method public onLoadMore()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->g:I

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->loadData()V

    return-void
.end method

.method public onRefresh()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->g:I

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->loadData()V

    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->g:I

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->showLoding()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/MyVoucherGameFragment;->loadData()V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->d:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->e:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->i:Ljava/util/List;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->e:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->d:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/MyVoucherGameFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    :cond_1
    return-void
.end method
