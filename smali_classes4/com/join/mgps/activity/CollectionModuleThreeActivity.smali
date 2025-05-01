.class public Lcom/join/mgps/activity/CollectionModuleThreeActivity;
.super Lcom/BaseFragmentActivity;
.source "CollectionModuleThreeActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c013e
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroidx/fragment/app/FragmentManager;

.field private d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/fragment/app/Fragment;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/join/mgps/customview/NavigationAdapter;

.field f:Lcom/join/mgps/customview/MViewpagerV4;
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

.field i:Landroid/widget/RelativeLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field n:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field o:Lcom/join/mgps/rpc/e;

.field private p:I

.field private q:I

.field r:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field s:Lcom/join/mgps/dto/ExtBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseFragmentActivity;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->p:I

    return-void
.end method

.method static synthetic f0(Lcom/join/mgps/activity/CollectionModuleThreeActivity;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->t:Ljava/util/List;

    return-object p0
.end method

.method static synthetic g0(Lcom/join/mgps/activity/CollectionModuleThreeActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->q:I

    return p0
.end method


# virtual methods
.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->o:Lcom/join/mgps/rpc/e;

    .line 2
    :try_start_0
    iput-object p0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->b:Landroid/content/Context;

    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->c:Landroidx/fragment/app/FragmentManager;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->t:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->d:Ljava/util/ArrayList;

    .line 6
    new-instance v1, Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->c:Landroidx/fragment/app/FragmentManager;

    iget-object v3, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->t:Ljava/util/List;

    invoke-direct {v1, v2, v0, v3}, Lcom/join/mgps/customview/NavigationAdapter;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    iput-object v1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->e:Lcom/join/mgps/customview/NavigationAdapter;

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLoding()V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->r:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 9
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->h0(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLodingFailed()V

    .line 11
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/MViewpagerV4;->setIntercept(Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method h0(Ljava/lang/String;)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 2
    :try_start_0
    iget v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->p:I

    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->i0(Ljava/lang/String;I)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->o:Lcom/join/mgps/rpc/e;

    invoke-interface {v0, p1}, Lcom/join/mgps/rpc/e;->c1(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/CollectionModuleBean;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionModuleBean;->getMessages()Lcom/join/mgps/dto/CollectionModuleMessageBean;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleMessageBean;->getData()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v1, 0x0

    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionModuleDataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleDataBean;->getInfo()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionModuleDataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleDataBean;->getInfo()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 10
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionModuleDataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleDataBean;->getInfo()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CollectionModuleDataBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionModuleDataBean;->getInfo()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_0

    .line 12
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CollectionModuleDataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionModuleDataBean;->getInfo()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->q:I

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionModuleBean;->getMessages()Lcom/join/mgps/dto/CollectionModuleMessageBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionModuleMessageBean;->getData()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CollectionModuleDataBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionModuleDataBean;->getInfo()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->k0(Ljava/util/List;)V

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLodingFailed()V

    goto :goto_0

    .line 15
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLodingFailed()V

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 18
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLodingFailed()V

    goto :goto_0

    .line 19
    :cond_3
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLodingFailed()V

    :goto_0
    return-void
.end method

.method public i0(Ljava/lang/String;I)Lcom/join/mgps/dto/CommonRequestBean;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    iget-object v7, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->s:Lcom/join/mgps/dto/ExtBean;

    const/16 v4, 0x64

    const-string v5, ""

    const-string v6, ""

    move-object v2, p1

    move v3, p2

    invoke-virtual/range {v1 .. v7}, Lcom/join/mgps/Util/RequestBeanUtil;->getCollectionRequestBean(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/dto/ExtBean;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object p1

    return-object p1
.end method

.method j0()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method k0(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionDataBeanInfo;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->h:Landroid/widget/LinearLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->q:I

    if-lez v0, :cond_4

    .line 6
    :goto_0
    iget v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->q:I

    if-ge v1, v0, :cond_3

    .line 7
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CollectionDataBeanInfo;

    .line 8
    iget-object v2, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->t:Ljava/util/List;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionDataBeanInfo;->getMain()Lcom/join/mgps/dto/BreakBeanMain;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/BreakBeanMain;->getCollection_title()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    new-instance v2, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;

    invoke-direct {v2}, Lcom/join/mgps/fragment/CollectionThreeSubFragment_;-><init>()V

    .line 10
    invoke-virtual {v2, v0}, Lcom/join/mgps/fragment/CollectionThreeSubFragment;->X(Lcom/join/mgps/dto/CollectionDataBeanInfo;)V

    .line 11
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionDataBeanInfo;->getSub()Ljava/util/List;

    move-result-object v0

    .line 12
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :catch_0
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CollectionBeanSub;

    .line 13
    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->s:Lcom/join/mgps/dto/ExtBean;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->isKeepOrginFrom()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->s:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getOrginFrom()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v4, :cond_0

    .line 14
    :try_start_1
    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->s:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getOrginFrom()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 15
    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->s:Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->getOrginFrom()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    .line 16
    :cond_0
    :try_start_2
    iget-object v4, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->s:Lcom/join/mgps/dto/ExtBean;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/join/mgps/dto/ExtBean;->get_from_type()I

    move-result v4

    const/16 v5, 0x86

    if-ne v4, v5, :cond_1

    const/16 v4, 0x3459

    .line 17
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 18
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    goto :goto_1

    :cond_1
    const/16 v4, 0x6f

    .line 19
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    const/16 v4, 0x79

    .line 20
    invoke-virtual {v3, v4}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 22
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 23
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->e:Lcom/join/mgps/customview/NavigationAdapter;

    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->d:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->t:Ljava/util/List;

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/customview/NavigationAdapter;->d(Ljava/util/List;Ljava/util/List;)V

    .line 24
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->e:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {p1}, Landroidx/viewpager/widget/PagerAdapter;->notifyDataSetChanged()V

    .line 25
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->e:Lcom/join/mgps/customview/NavigationAdapter;

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 26
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 27
    iget-object p1, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    new-instance v0, Lcom/join/mgps/activity/CollectionModuleThreeActivity$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity$a;-><init>(Lcom/join/mgps/activity/CollectionModuleThreeActivity;)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    :cond_4
    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseFragmentActivity;->onDestroy()V

    return-void
.end method

.method relodingimag()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    iput v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->p:I

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->showLoding()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->r:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->h0(Ljava/lang/String;)V

    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->g:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->h:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method showLodingFailed()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->f:Lcom/join/mgps/customview/MViewpagerV4;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->i:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->h:Landroid/widget/LinearLayout;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/CollectionModuleThreeActivity;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method
