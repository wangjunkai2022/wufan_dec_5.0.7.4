.class public Lcom/join/mgps/fragment/FriendMsgRequestFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "FriendMsgRequestFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;
.implements Lcom/join/mgps/adapter/k0$a;


# annotations
.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c026d
.end annotation


# instance fields
.field b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/join/mgps/customview/XListView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroidx/constraintlayout/widget/Group;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:I

.field f:I

.field g:Lcom/join/mgps/rpc/j;

.field h:Lcom/join/mgps/adapter/k0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e:I

    const/4 v0, 0x0

    iput v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    return-void
.end method

.method public static synthetic V(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->b0()V

    return-void
.end method

.method public static synthetic W(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->a0()V

    return-void
.end method

.method private synthetic a0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->X()V

    return-void
.end method

.method private synthetic b0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c:Lcom/join/mgps/customview/XListView;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->q()V

    .line 3
    iget v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView;->setNoMore()V

    :cond_1
    return-void
.end method


# virtual methods
.method public E(Lcom/join/mgps/dto/FriendBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "0"

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->Friendsapplication:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBean;->getId()I

    move-result p1

    const-string v0, "ACCEPT"

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f0(ILjava/lang/String;)V

    return-void
.end method

.method public X()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->f()V

    :cond_0
    return-void
.end method

.method public Z()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->q()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method afterViews()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/h;->p()Lcom/join/mgps/rpc/impl/h;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->g:Lcom/join/mgps/rpc/j;

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->d0()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c:Lcom/join/mgps/customview/XListView;

    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/XListView;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 4
    new-instance v0, Lcom/join/mgps/adapter/k0;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/adapter/k0;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    .line 5
    invoke-virtual {v0, p0}, Lcom/join/mgps/adapter/k0;->k(Lcom/join/mgps/adapter/k0$a;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c:Lcom/join/mgps/customview/XListView;

    iget-object v1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->X()V

    return-void
.end method

.method c0(I)V
    .locals 6
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, -0x1

    .line 2
    :try_start_0
    iget v3, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    if-eq v3, p1, :cond_6

    if-ne v3, v2, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    invoke-static {v0}, Lcom/ta/utdid2/android/utils/f;->f(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 4
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 6
    iget-object v4, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->g:Lcom/join/mgps/rpc/j;

    const/16 v5, 0xa

    invoke-interface {v4, v3, v0, v5, p1}, Lcom/join/mgps/rpc/j;->e(Ljava/lang/String;Ljava/lang/String;II)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getError()I

    move-result v3

    if-nez v3, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {p0, v3, p1}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->j0(Ljava/util/List;I)V

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_5

    .line 10
    :cond_1
    iput v2, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getMsg()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_3
    const v0, 0x7f100204

    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/BaseFragment;->T(Ljava/lang/String;)V

    goto :goto_1

    :cond_4
    const v0, 0x7f100299

    .line 12
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/BaseFragment;->T(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :cond_5
    :goto_1
    iget v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    if-eq v0, v2, :cond_8

    goto :goto_3

    :cond_6
    :goto_2
    if-eq v3, v2, :cond_7

    .line 14
    iput p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e:I

    .line 15
    iput v1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    .line 16
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h0()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_4

    :catch_0
    move-exception v0

    .line 17
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    iget v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    if-eq v0, v2, :cond_8

    .line 19
    :goto_3
    iput p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e:I

    .line 20
    iput v1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    .line 21
    :cond_8
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h0()V

    return-void

    .line 22
    :goto_4
    iget v3, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    if-eq v3, v2, :cond_9

    .line 23
    iput p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e:I

    .line 24
    iput v1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    .line 25
    :cond_9
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h0()V

    .line 26
    throw v0
.end method

.method d0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 2
    invoke-virtual {v0, v1}, Lcom/join/mgps/ptr/PtrFrameLayout;->j(Z)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    new-instance v1, Lcom/join/mgps/fragment/FriendMsgRequestFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment$a;-><init>(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/ptr/PtrFrameLayout;->setPtrHandler(Lcom/join/mgps/ptr/b;)V

    return-void
.end method

.method e0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c:Lcom/join/mgps/customview/XListView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Lcom/join/mgps/customview/XListView;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f:I

    const/4 v0, 0x1

    .line 3
    iput v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e:I

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c0(I)V

    return-void
.end method

.method f0(ILjava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-static {v0}, Lcom/ta/utdid2/android/utils/f;->f(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 3
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 5
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v3, "uid"

    .line 6
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string/jumbo v1, "token"

    .line 7
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "id"

    .line 8
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "friendRequestType"

    .line 9
    invoke-interface {v2, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->g:Lcom/join/mgps/rpc/j;

    invoke-interface {v0, v2}, Lcom/join/mgps/rpc/j;->n(Ljava/util/Map;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getError()I

    move-result v1

    if-nez v1, :cond_0

    .line 12
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->g0(I)V

    .line 13
    new-instance p1, Lcom/join/mgps/event/q;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lcom/join/mgps/event/q;-><init>(I)V

    const-string v0, "ACCEPT"

    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/event/q;->k(Z)V

    .line 15
    invoke-static {}, Lorg/greenrobot/eventbus/c;->f()Lorg/greenrobot/eventbus/c;

    move-result-object p2

    invoke-virtual {p2, p1}, Lorg/greenrobot/eventbus/c;->o(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    .line 16
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getMsg()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const p1, 0x7f100348

    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/BaseFragment;->T(Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const p1, 0x7f100299

    .line 17
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/fragment/BaseFragment;->T(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 18
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method g0(I)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/adapter/k0;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 3
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/FriendBean;

    .line 5
    invoke-virtual {v1}, Lcom/join/mgps/dto/FriendBean;->getId()I

    move-result v1

    if-ne p1, v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 6
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method h0()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->i0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/BaseFragment;->mHandler:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/fragment/w0;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/w0;-><init>(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V

    const-wide/16 v2, 0xc8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public i0()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->b:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/ptr/PtrFrameLayout;->C()V

    :cond_0
    return-void
.end method

.method j0(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/FriendBean;",
            ">;I)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    invoke-virtual {p2}, Lcom/join/mgps/adapter/k0;->e()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->clear()V

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    if-eqz p2, :cond_1

    .line 3
    iget-object p2, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    invoke-virtual {p2}, Lcom/join/mgps/adapter/k0;->e()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->d:Landroidx/constraintlayout/widget/Group;

    if-eqz p1, :cond_3

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->h:Lcom/join/mgps/adapter/k0;

    invoke-virtual {p1}, Lcom/join/mgps/adapter/k0;->e()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-nez p1, :cond_2

    .line 7
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->d:Landroidx/constraintlayout/widget/Group;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    goto :goto_0

    .line 8
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->d:Landroidx/constraintlayout/widget/Group;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    :cond_3
    :goto_0
    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method public m(Lcom/join/mgps/dto/FriendBean;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/activity/FriendActivity;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/activity/FriendActivity;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBean;->getUid()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/activity/FriendActivity;->K(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onHiddenChanged(Z)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->onHiddenChanged(Z)V

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/fragment/BaseFragment;->mHandler:Landroid/os/Handler;

    new-instance v0, Lcom/join/mgps/fragment/x0;

    invoke-direct {v0, p0}, Lcom/join/mgps/fragment/x0;-><init>(Lcom/join/mgps/fragment/FriendMsgRequestFragment;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public onLoadMore()V
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->e:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->c0(I)V

    return-void
.end method

.method public u(Lcom/join/mgps/dto/FriendBean;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v1, "1"

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->Friendsapplication:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v1, v2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBean;->getId()I

    move-result p1

    const-string v0, "REJECT"

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/fragment/FriendMsgRequestFragment;->f0(ILjava/lang/String;)V

    return-void
.end method
