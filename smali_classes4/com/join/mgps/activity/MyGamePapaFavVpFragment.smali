.class public Lcom/join/mgps/activity/MyGamePapaFavVpFragment;
.super Lcom/join/mgps/fragment/BaseFragment;
.source "MyGamePapaFavVpFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;,
        Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c028a
.end annotation


# instance fields
.field b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroidx/viewpager2/widget/ViewPager2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field private d:Landroid/content/Context;

.field e:I

.field private f:Lcom/wufan/user/service/protobuf/n0;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field i:Lcom/join/mgps/rpc/b;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

.field private l:Z

.field private m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

.field private n:Z

.field private o:I

.field private p:Z

.field private q:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/fragment/BaseFragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->e:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->l:Z

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->o:I

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->q:Z

    return-void
.end method

.method static synthetic V(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->l:Z

    return p0
.end method

.method static synthetic W(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->k:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    return-object p0
.end method

.method private b0()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    const-string v1, "backup"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->n:Z

    return v0
.end method


# virtual methods
.method X()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->p:Z

    :cond_0
    const-string v0, ""

    .line 5
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->g:Ljava/lang/String;

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    invoke-static {}, Lcom/join/mgps/Util/RequestBeanUtil;->getVersionAndVersionName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->h:Ljava/lang/String;

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->i:Lcom/join/mgps/rpc/b;

    .line 8
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    .line 9
    new-instance v0, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;-><init>()V

    const-string v1, "\u5168\u90e8"

    .line 10
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setTitle(Ljava/lang/String;)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b0()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 13
    new-instance v0, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;-><init>()V

    const-string v1, "\u5b58\u6863"

    .line 14
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setTitle(Ljava/lang/String;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 17
    new-instance v0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;-><init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->k:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    .line 18
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$a;-><init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->k:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$b;-><init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 21
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c:Landroidx/viewpager2/widget/ViewPager2;

    new-instance v1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$c;-><init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;)V

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 22
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->a0()V

    return-void
.end method

.method Z(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    .line 2
    iget-boolean v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->n:Z

    if-eqz v0, :cond_4

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result p1

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v2

    if-ne p1, v2, :cond_1

    sget-boolean p1, Lcom/MApplication;->I1:Z

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b0()Z

    move-result p1

    if-eq p1, v1, :cond_4

    .line 5
    :cond_1
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 7
    new-instance p1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-direct {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;-><init>()V

    const-string v0, "\u5168\u90e8"

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setTitle(Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 10
    invoke-direct {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->b0()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 11
    new-instance p1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-direct {p1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;-><init>()V

    const-string v0, "\u5b58\u6863"

    .line 12
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setTitle(Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->k:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_3
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->l:Z

    .line 16
    iput p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->e:I

    .line 17
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->a0()V

    const/4 p1, 0x0

    .line 18
    sput-boolean p1, Lcom/MApplication;->I1:Z

    :cond_4
    :goto_0
    return-void
.end method

.method a0()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const/4 v0, 0x1

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_6

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_2

    .line 2
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 3
    new-instance v1, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v1}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    const-string v3, "uid"

    .line 4
    iget-object v4, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->f:Lcom/wufan/user/service/protobuf/n0;

    if-nez v4, :cond_1

    const/4 v4, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v4

    :goto_0
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "page"

    .line 5
    iget v4, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->e:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "type"

    .line 6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "device_id"

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->g:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v3, "version"

    .line 8
    iget-object v4, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->h:Ljava/lang/String;

    invoke-virtual {v1, v3, v4}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    iget-object v3, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->i:Lcom/join/mgps/rpc/b;

    invoke-interface {v3, v1}, Lcom/join/mgps/rpc/b;->r(Ljava/util/Map;)Lcom/join/mgps/dto/GameFromPopoWinBean;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 10
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBean;->getError()I

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBean;->getData()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBean;->getData()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eqz v3, :cond_4

    .line 11
    iget-object v3, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBean;->getData()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 12
    iget v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->e:I

    if-ne v1, v0, :cond_3

    .line 13
    iget v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->o:I

    iget-object v3, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    iget v2, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->o:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setSelected(Z)V

    goto :goto_1

    .line 15
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-virtual {v1, v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setSelected(Z)V

    .line 16
    :cond_3
    :goto_1
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c0(Z)V

    goto :goto_3

    .line 17
    :cond_4
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->h0()V

    .line 18
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c0(Z)V

    goto :goto_3

    .line 19
    :cond_5
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->h0()V

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c0(Z)V

    goto :goto_3

    .line 21
    :cond_6
    :goto_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->h0()V

    .line 22
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c0(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    .line 24
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c0(Z)V

    :goto_3
    return-void
.end method

.method c0(Z)V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    .line 4
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    .line 5
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    .line 6
    invoke-virtual {v4}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 9
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 10
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    .line 11
    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getGame_count()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getGame_count()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-gtz v2, :cond_3

    .line 12
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 13
    :cond_4
    iput-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->k:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$e;

    if-eqz v1, :cond_5

    .line 15
    invoke-virtual {v1, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 16
    :cond_5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    const/4 v1, 0x1

    if-nez v0, :cond_6

    .line 18
    new-instance p1, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-direct {p1, p0, p0, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;-><init>(Lcom/join/mgps/activity/MyGamePapaFavVpFragment;Landroidx/fragment/app/Fragment;Ljava/util/List;)V

    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    invoke-virtual {p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto :goto_2

    .line 21
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v1

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/viewpager2/widget/ViewPager2;->setOffscreenPageLimit(I)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    iget-object v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;->a(Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;Ljava/util/List;Z)V

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_7
    :goto_2
    return-void
.end method

.method d0(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->m:Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;

    if-eqz v0, :cond_0

    .line 2
    invoke-static {v0, p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;->b(Lcom/join/mgps/activity/MyGamePapaFavVpFragment$d;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method e0(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_1

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

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

    check-cast v1, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    .line 5
    invoke-virtual {v1}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->c0(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public f0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->q:Z

    return-void
.end method

.method g0(I)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 2
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 3
    iget-object v2, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->j:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    if-ne v1, p1, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->setSelected(Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_2
    iput p1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->o:I

    :cond_3
    :goto_2
    return-void
.end method

.method h0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->l:Z

    return-void
.end method

.method protected lazyLoad()V
    .locals 0

    return-void
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->p:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 3
    iput-boolean v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->p:Z

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->q:Z

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->Z(Z)V

    .line 5
    iput-boolean v1, p0, Lcom/join/mgps/activity/MyGamePapaFavVpFragment;->q:Z

    return-void
.end method
