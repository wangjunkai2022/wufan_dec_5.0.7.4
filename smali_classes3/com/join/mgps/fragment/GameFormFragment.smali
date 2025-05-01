.class public Lcom/join/mgps/fragment/GameFormFragment;
.super Landroidx/fragment/app/Fragment;
.source "GameFormFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/GameFormFragment$c;,
        Lcom/join/mgps/fragment/GameFormFragment$e;,
        Lcom/join/mgps/fragment/GameFormFragment$d;,
        Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;,
        Lcom/join/mgps/fragment/GameFormFragment$f;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c0272
.end annotation


# instance fields
.field b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

.field e:Landroid/content/Context;

.field f:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Lcom/join/mgps/rpc/b;

.field j:I

.field k:Ljava/lang/String;

.field l:Ljava/lang/String;

.field m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/fragment/GameFormFragment$f;",
            ">;"
        }
    .end annotation
.end field

.field n:Z

.field o:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:I

.field q:Z

.field private r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameFromPopoWinBeanV2$FamousBean;",
            ">;"
        }
    .end annotation
.end field

.field s:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    const/4 v1, 0x0

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->n:Z

    .line 4
    iput v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->p:I

    .line 5
    iput-boolean v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->q:Z

    .line 6
    iput-boolean v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->s:Z

    return-void
.end method

.method private W(Ljava/lang/String;I)V
    .locals 3

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/join/mgps/activity/GameDetailActivity_;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "fromid"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "_from"

    const/16 v1, 0x2b5f

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "groupuid"

    .line 4
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment;->l:Ljava/lang/String;

    const-string p2, "gameid"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment;->k:Ljava/lang/String;

    const-string p2, "company_id"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method static synthetic Z(Lcom/join/mgps/fragment/GameFormFragment;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/GameFormFragment;->f0(II)V

    return-void
.end method

.method static synthetic a0(Lcom/join/mgps/fragment/GameFormFragment;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/fragment/GameFormFragment;->r:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b0(Lcom/join/mgps/fragment/GameFormFragment;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/GameFormFragment;->W(Ljava/lang/String;I)V

    return-void
.end method

.method private f0(II)V
    .locals 3

    .line 1
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 3
    new-instance v1, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;

    invoke-direct {v1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;-><init>()V

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setUid(I)V

    .line 5
    invoke-virtual {v1, p2}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setPage(I)V

    .line 6
    invoke-virtual {v1, p1}, Lcom/join/mgps/activity/vipzone/bean/LuckHistoryrequest;->setType(I)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/rpc/impl/i;->B0()Le2/i;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object p2

    invoke-interface {p1, p2}, Le2/i;->S0(Lcom/join/mgps/dto/RequestModel;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/fragment/GameFormFragment$b;

    invoke-direct {p2, p0}, Lcom/join/mgps/fragment/GameFormFragment$b;-><init>(Lcom/join/mgps/fragment/GameFormFragment;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V

    return-void
.end method

.method public static g0(I)Lcom/join/mgps/fragment/GameFormFragment;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "isRanking"

    const/4 v2, 0x1

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v1, "rankingType"

    .line 3
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 4
    new-instance p0, Lcom/join/mgps/fragment/GameFormFragment_;

    invoke-direct {p0}, Lcom/join/mgps/fragment/GameFormFragment_;-><init>()V

    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object p0
.end method

.method public static h0(Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/fragment/GameFormFragment;
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "company_id"

    .line 2
    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "gameid"

    .line 3
    invoke-virtual {v0, p0, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    new-instance p0, Lcom/join/mgps/fragment/GameFormFragment_;

    invoke-direct {p0}, Lcom/join/mgps/fragment/GameFormFragment_;-><init>()V

    .line 5
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    return-object p0
.end method


# virtual methods
.method V()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->m:Ljava/util/List;

    .line 3
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->i:Lcom/join/mgps/rpc/b;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    .line 5
    new-instance v1, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;-><init>(Lcom/join/mgps/fragment/GameFormFragment;)V

    iput-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->d:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    invoke-direct {v2, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    iget-object v2, p0, Lcom/join/mgps/fragment/GameFormFragment;->d:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    invoke-virtual {v1, v2}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setVerticalScrollBarEnabled(Z)V

    const-string v1, "company_id"

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->k:Ljava/lang/String;

    const-string v1, "gameid"

    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->l:Ljava/lang/String;

    const-string v1, ""

    if-nez v0, :cond_0

    .line 11
    iput-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->l:Ljava/lang/String;

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->k:Ljava/lang/String;

    if-nez v0, :cond_1

    iput-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->k:Ljava/lang/String;

    .line 13
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingMoreEnabled(Z)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setPreLoadCount(I)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/GameFormFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/GameFormFragment$a;-><init>(Lcom/join/mgps/fragment/GameFormFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setLoadingListener(Lcom/join/android/app/component/xrecyclerview/XRecyclerView$f;)V

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "isRanking"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->q:Z

    if-eqz v0, :cond_2

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "rankingType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->p:I

    .line 18
    iget v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/fragment/GameFormFragment;->f0(II)V

    goto :goto_0

    .line 19
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->d0()V

    :goto_0
    return-void
.end method

.method X()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->c:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->e0()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method c0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->d:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_1
    return-void
.end method

.method d0()V
    .locals 12
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 2
    iget v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->showLoding()V

    :cond_0
    const-string v0, ""

    .line 4
    iget-object v2, p0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    invoke-static {}, Lcom/join/mgps/Util/RequestBeanUtil;->getVersionAndVersionName()Ljava/lang/String;

    move-result-object v2

    .line 5
    new-instance v3, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v3}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    const-string v4, "page"

    .line 6
    iget v5, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    add-int/lit8 v6, v5, 0x1

    iput v6, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v4, "company_id"

    .line 7
    iget-object v5, p0, Lcom/join/mgps/fragment/GameFormFragment;->k:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v4, "game_id"

    .line 8
    iget-object v5, p0, Lcom/join/mgps/fragment/GameFormFragment;->l:Ljava/lang/String;

    invoke-virtual {v3, v4, v5}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v4, "device_id"

    .line 9
    invoke-virtual {v3, v4, v0}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string/jumbo v0, "version"

    .line 10
    invoke-virtual {v3, v0, v2}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    iget-object v2, p0, Lcom/join/mgps/fragment/GameFormFragment;->i:Lcom/join/mgps/rpc/b;

    invoke-interface {v2, v3}, Lcom/join/mgps/rpc/b;->J(Ljava/util/Map;)Lcom/join/mgps/dto/GameFromPopoWinBeanV2;

    move-result-object v2

    const/4 v3, 0x2

    if-eqz v2, :cond_5

    .line 13
    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2;->getError()I

    move-result v4

    if-nez v4, :cond_5

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2;->getData()Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2;->getData()Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;->getFav_list()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2;->getData()Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;->getFav_list()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_5

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->e0()V

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->k0()V

    .line 16
    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2;->getData()Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;->getFav_list()Ljava/util/List;

    move-result-object v4

    .line 17
    iget v5, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    if-ne v5, v3, :cond_1

    .line 18
    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2;->getData()Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$ResultDataBean;->getFamous_list()Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Lcom/join/mgps/fragment/GameFormFragment;->r:Ljava/util/List;

    .line 19
    :cond_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    const/16 v5, 0xa

    if-ge v2, v5, :cond_2

    .line 20
    iput-boolean v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->s:Z

    :cond_2
    const/4 v1, 0x0

    .line 21
    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_4

    .line 22
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;

    .line 23
    new-instance v11, Lcom/join/mgps/fragment/GameFormFragment$f;

    const/4 v8, 0x1

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getUid()I

    move-result v10

    move-object v5, v11

    move-object v6, p0

    move-object v7, v2

    invoke-direct/range {v5 .. v10}, Lcom/join/mgps/fragment/GameFormFragment$f;-><init>(Lcom/join/mgps/fragment/GameFormFragment;Ljava/lang/Object;ILjava/lang/String;I)V

    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-nez v1, :cond_3

    .line 24
    iget-object v5, p0, Lcom/join/mgps/fragment/GameFormFragment;->r:Ljava/util/List;

    if-eqz v5, :cond_3

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_3

    .line 25
    iget v5, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    if-ne v5, v3, :cond_3

    .line 26
    new-instance v5, Lcom/join/mgps/fragment/GameFormFragment$f;

    iget-object v8, p0, Lcom/join/mgps/fragment/GameFormFragment;->r:Ljava/util/List;

    const/4 v9, 0x2

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBeanV2$DataBean;->getUid()I

    move-result v11

    move-object v6, v5

    move-object v7, p0

    invoke-direct/range {v6 .. v11}, Lcom/join/mgps/fragment/GameFormFragment$f;-><init>(Lcom/join/mgps/fragment/GameFormFragment;Ljava/lang/Object;ILjava/lang/String;I)V

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 27
    :cond_4
    invoke-virtual {p0, v0}, Lcom/join/mgps/fragment/GameFormFragment;->j0(Ljava/util/List;)V

    goto :goto_1

    .line 28
    :cond_5
    iget v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    if-ne v0, v3, :cond_6

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->X()V

    goto :goto_1

    .line 30
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->i0()V

    goto :goto_1

    .line 31
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->showLodingFailed()V

    .line 33
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method e0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_0

    const/16 v1, 0x8

    .line 2
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method i0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->setNoMore()V

    :cond_0
    return-void
.end method

.method j0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/fragment/GameFormFragment$f;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->m:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->e0()V

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->k0()V

    .line 4
    iget v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->m:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;->loadMoreComplete()V

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/GameFormFragment;->d:Lcom/join/mgps/fragment/GameFormFragment$GameListAdapter;

    if-eqz p1, :cond_2

    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 10
    :cond_2
    iget-boolean p1, p0, Lcom/join/mgps/fragment/GameFormFragment;->s:Z

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->i0()V

    .line 12
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->m:Ljava/util/List;

    invoke-static {v0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method k0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method relodingimag()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->q:Z

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->showLoding()V

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "rankingType"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->p:I

    .line 5
    iget v1, p0, Lcom/join/mgps/fragment/GameFormFragment;->j:I

    invoke-direct {p0, v0, v1}, Lcom/join/mgps/fragment/GameFormFragment;->f0(II)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/fragment/GameFormFragment;->d0()V

    :goto_0
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->b:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/GameFormFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    return-void
.end method
