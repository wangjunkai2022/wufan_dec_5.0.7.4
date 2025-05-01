.class public Lcom/join/mgps/activity/HomePopupAdActivity;
.super Lcom/BaseActivity;
.source "HomePopupAdActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/HomePopupAdActivity$b;,
        Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0342
.end annotation


# instance fields
.field b:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/join/android/app/component/photoviewer/MultiTouchViewPager;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lme/relex/circleindicator/CircleIndicator;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field f:Lcom/join/mgps/dto/EverdayLogin;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field g:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field h:Lcom/join/mgps/dto/PopupAdBean;

.field i:Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;

.field j:Z

.field k:Z

.field private l:Landroid/os/Handler;

.field m:Lcom/join/mgps/dto/EverdayLogin;

.field n:Landroid/content/Context;

.field private o:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/BaseActivity;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->g:Z

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->j:Z

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->k:Z

    .line 5
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->l:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->m:Lcom/join/mgps/dto/EverdayLogin;

    return-void
.end method

.method static synthetic g0(Lcom/join/mgps/activity/HomePopupAdActivity;)Landroid/webkit/WebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->o:Landroid/webkit/WebView;

    return-object p0
.end method

.method static synthetic h0(Lcom/join/mgps/activity/HomePopupAdActivity;Landroid/webkit/WebView;)Landroid/webkit/WebView;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->o:Landroid/webkit/WebView;

    return-object p1
.end method

.method static synthetic i0(Lcom/join/mgps/activity/HomePopupAdActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->l:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method afterViews()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    iput-object p0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->n:Landroid/content/Context;

    .line 2
    :try_start_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->e:Ljava/lang/String;

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/PopupAdBean;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/PopupAdBean;

    iput-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getAd_switch()Ljava/lang/String;

    move-result-object v0

    const-string v2, "1"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iput-boolean v1, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->j:Z

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->j:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->k:Z

    if-nez v0, :cond_1

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 7
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    iget-boolean v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->k:Z

    if-eqz v2, :cond_2

    .line 9
    iget-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->m:Lcom/join/mgps/dto/EverdayLogin;

    if-eqz v2, :cond_2

    .line 10
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 11
    :cond_2
    iget-boolean v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->j:Z

    if-eqz v2, :cond_3

    .line 12
    iget-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/PopupAdBean;->getBig_pic()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    .line 13
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 14
    :cond_3
    new-instance v2, Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;-><init>(Lcom/join/mgps/activity/HomePopupAdActivity;)V

    iput-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->i:Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;

    .line 15
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v1, :cond_4

    .line 16
    iget-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->d:Lme/relex/circleindicator/CircleIndicator;

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 17
    :cond_4
    iget-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->i:Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;

    invoke-virtual {v2, v0}, Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;->c(Ljava/util/List;)V

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->c:Lcom/join/android/app/component/photoviewer/MultiTouchViewPager;

    iget-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->i:Lcom/join/mgps/activity/HomePopupAdActivity$DraweePagerAdapter;

    invoke-virtual {v0, v2}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->d:Lme/relex/circleindicator/CircleIndicator;

    iget-object v2, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->c:Lcom/join/android/app/component/photoviewer/MultiTouchViewPager;

    invoke-virtual {v0, v2}, Lme/relex/circleindicator/CircleIndicator;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 20
    iget-boolean v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->j:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_7

    .line 21
    :try_start_1
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    sget-object v2, Lcom/facebook/drawee/drawable/r$c;->a:Lcom/facebook/drawee/drawable/r$c;

    invoke-virtual {v0, v2}, Lcom/facebook/drawee/generic/a;->x(Lcom/facebook/drawee/drawable/r$c;)V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getMore()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    .line 23
    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getMore()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_6

    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    .line 24
    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getMore()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/RecomDatabean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getAd_switch()I

    move-result v0

    if-ne v0, v1, :cond_6

    .line 25
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_5

    .line 26
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 27
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getMore()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/RecomDatabean;

    .line 28
    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    new-instance v2, Lcom/join/mgps/activity/HomePopupAdActivity$a;

    invoke-direct {v2, p0, v0}, Lcom/join/mgps/activity/HomePopupAdActivity$a;-><init>(Lcom/join/mgps/activity/HomePopupAdActivity;Lcom/join/mgps/dto/RecomDatabean;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 29
    invoke-virtual {v0}, Lcom/join/mgps/dto/RecomDatabean;->getMain()Lcom/join/mgps/dto/ModleBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ModleBean;->getPic_remote()Ljava/lang/String;

    move-result-object v0

    .line 30
    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 31
    :cond_6
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 32
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 33
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    :goto_0
    return-void
.end method

.method isHomePopupAdLocalCached(Ljava/lang/String;)Z
    .locals 2

    .line 1
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->n:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/v;->b(Landroid/content/Context;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1}, Lcom/join/mgps/Util/h0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    return p1
.end method

.method j0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/Receiver;
        actions = {
            "com.join.android.app.mgsim.wufun.broadcast.account_status_change"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->o:Landroid/webkit/WebView;

    if-eqz v0, :cond_0

    const-string v1, "javascript:reloadEveryDayReceive()"

    .line 2
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public k0(Landroid/content/Context;Lcom/join/mgps/dto/AppBeanMain;)V
    .locals 11

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getTag()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/HomePopupAdActivity;->h:Lcom/join/mgps/dto/PopupAdBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PopupAdBean;->getTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "SP_001"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {p1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "fingerClickAdPop"

    const-string v3, ""

    invoke-virtual {v0, v2, v3, v1}, Lcom/papa/sim/statistic/p;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    :cond_1
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/AppBeanMain;->getLink_type()I

    move-result v5

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/AppBeanMain;->getJump_type()I

    move-result v6

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/AppBeanMain;->getLink_type_val()Ljava/lang/String;

    move-result-object v7

    .line 7
    invoke-virtual {p2}, Lcom/join/mgps/dto/AppBeanMain;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v8

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/AppBeanMain;->getTpl_type()Ljava/lang/String;

    move-result-object v9

    const/4 v10, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lcom/join/mgps/Util/IntentDateBean;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    new-instance p2, Lcom/join/mgps/dto/ExtBean;

    const/16 v1, 0x3392

    invoke-direct {p2, v1}, Lcom/join/mgps/dto/ExtBean;-><init>(I)V

    invoke-virtual {v0, p2}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method l0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onBackPressed()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroidx/activity/ComponentActivity;->onBackPressed()V

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/BaseActivity;->onDestroy()V

    return-void
.end method
