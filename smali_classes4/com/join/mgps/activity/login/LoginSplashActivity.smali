.class public Lcom/join/mgps/activity/login/LoginSplashActivity;
.super Landroidx/appcompat/app/AppCompatActivity;
.source "LoginSplashActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c07cb
.end annotation


# instance fields
.field private TAG:Ljava/lang/String;

.field private alertDialog:Landroid/app/AlertDialog;

.field application:Lcom/MApplication;

.field close:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field context:Landroid/content/Context;

.field gameId:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field isBackFromOtherLogin:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field isForcedLogin:Z
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field login:Landroid/view/View;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field mActivity:Landroid/app/Activity;

.field prefDef:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

.field rpcAccountClient:Lcom/join/mgps/rpc/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/app/AppCompatActivity;-><init>()V

    const-string v0, "LoginSplashActivity"

    .line 2
    iput-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->TAG:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lcom/join/mgps/activity/login/LoginSplashActivity;Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->getExt(Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/join/mgps/activity/login/LoginSplashActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->originLogin()V

    return-void
.end method

.method public static synthetic e0(Lcom/join/mgps/activity/login/LoginSplashActivity;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/login/LoginSplashActivity;->lambda$gotoOneKeyLogin$1(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic f0(Lcom/join/mgps/activity/login/LoginSplashActivity;Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/login/LoginSplashActivity;->lambda$gotoOneKeyLogin$0(Landroid/content/Context;Landroid/view/View;)V

    return-void
.end method

.method private getExt(Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;
    .locals 0

    if-nez p1, :cond_0

    .line 1
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    :cond_0
    return-object p1
.end method

.method private synthetic lambda$gotoOneKeyLogin$0(Landroid/content/Context;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/activity/login/LoginMainActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->gameId:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;

    move-result-object p2

    iget-boolean v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->isForcedLogin:Z

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;->isForcedLogin(Z)Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 3
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object p2, Lcom/papa/sim/statistic/Event;->clickOtherLogin:Lcom/papa/sim/statistic/Event;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->getExt(Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    return-void
.end method

.method private synthetic lambda$gotoOneKeyLogin$1(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    return-void
.end method

.method private originLogin()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 2
    invoke-static {p0}, Lcom/join/mgps/activity/login/LoginMainActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->gameId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;->gameId(Ljava/lang/String;)Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;

    move-result-object v0

    iget-boolean v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->isForcedLogin:Z

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;->isForcedLogin(Z)Lcom/join/mgps/activity/login/LoginMainActivity_$IntentBuilder_;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 3
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    return-void
.end method


# virtual methods
.method afterview()V
    .locals 7
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v0

    check-cast v0, Lcom/MApplication;

    iput-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->application:Lcom/MApplication;

    .line 2
    invoke-virtual {v0, p0}, Lcom/MApplication;->e(Landroid/app/Activity;)V

    .line 3
    iput-object p0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->mActivity:Landroid/app/Activity;

    .line 4
    iput-object p0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    .line 5
    invoke-static {}, Lcom/MApplication;->n()Lcom/netease/nis/quicklogin/QuickLogin;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    .line 6
    invoke-static {}, Lcom/join/mgps/rpc/impl/a;->c0()Lcom/join/mgps/rpc/b;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->rpcAccountClient:Lcom/join/mgps/rpc/b;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->userLogin:Lcom/papa/sim/statistic/Event;

    const/4 v2, 0x0

    invoke-direct {p0, v2}, Lcom/join/mgps/activity/login/LoginSplashActivity;->getExt(Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 8
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->availableLoginMethod()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v2

    const-class v3, Ljava/util/ArrayList;

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Class;

    const/4 v5, 0x0

    const-class v6, Ljava/lang/String;

    aput-object v6, v4, v5

    invoke-virtual {v2, v3, v4}, Lcom/join/android/app/common/utils/JsonMapper;->createCollectionType(Ljava/lang/Class;[Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Lcom/fasterxml/jackson/databind/JavaType;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 9
    sget-boolean v1, Lcom/MApplication;->E1:Z

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    const-string v1, "ONE_CLICK"

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->gotoOneKeyLogin()V

    goto :goto_0

    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->isForcedLogin:Z

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->quitActivity()V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    goto :goto_0

    .line 15
    :cond_1
    invoke-direct {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->originLogin()V

    :goto_0
    return-void
.end method

.method public dismissLoadingDialog()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/AlertDialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    :cond_0
    return-void
.end method

.method error(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method public finish()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method

.method gotoOneKeyLogin()V
    .locals 12

    .line 1
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {v1, v2, v2}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071507

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    const/16 v2, 0xe

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const-string v1, "#408DFF"

    .line 6
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextColor(I)V

    const-string v2, "\u5176\u4ed6\u65b9\u5f0f\u767b\u5f55"

    .line 7
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f071220

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    invoke-static {v2}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 9
    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 10
    new-instance v4, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f071341

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    float-to-int v7, v7

    invoke-direct {v4, v5, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 11
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f0712d2    # 1.795435E38f

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    iput v5, v4, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 12
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    iput v5, v4, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 13
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v4, 0x7f080158

    .line 14
    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0711b1

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v4

    float-to-int v4, v4

    .line 16
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0714fc

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    .line 17
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    float-to-int v10, v10

    .line 18
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v11

    float-to-int v11, v11

    .line 19
    invoke-virtual {v2, v4, v8, v10, v11}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 20
    new-instance v4, Landroid/widget/ImageView;

    invoke-direct {v4, p0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 21
    new-instance v8, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    float-to-int v10, v10

    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    invoke-virtual {v11, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    float-to-int v6, v6

    invoke-direct {v8, v10, v6}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 22
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    float-to-int v6, v6

    iput v6, v8, Landroid/widget/RelativeLayout$LayoutParams;->topMargin:I

    .line 23
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    float-to-int v6, v6

    iput v6, v8, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 24
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060412

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setBackgroundColor(I)V

    .line 26
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v6

    float-to-int v6, v6

    .line 27
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    .line 28
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    .line 29
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    invoke-virtual {v10, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v9

    float-to-int v9, v9

    .line 30
    invoke-virtual {v4, v6, v8, v5, v9}, Landroid/widget/ImageView;->setPadding(IIII)V

    .line 31
    new-instance v5, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    invoke-direct {v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;-><init>()V

    .line 32
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setStatusBarColor(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    const/4 v6, 0x1

    .line 33
    invoke-virtual {v5, v6}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setStatusBarDarkColor(Z)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 34
    invoke-virtual {v5, v6}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setHideNavigation(Z)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 35
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0806f3

    const/4 v10, 0x0

    invoke-static {v8, v9, v10}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLogoIconDrawable(Landroid/graphics/drawable/Drawable;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 36
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0711cc

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLogoWidth(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 37
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLogoHeight(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 38
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f07129b

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLogoTopYOffset(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    const-string v8, "#333333"

    .line 39
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setMaskNumberColor(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 40
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f071357

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setMaskNumberDpSize(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 41
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f07136e

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setMaskNumberTopYOffset(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    const-string v8, "#929292"

    .line 42
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setSloganColor(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 43
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setSloganDpSize(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 44
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f0713bc

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setSloganTopYOffset(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    const-string v8, "\u4e00\u952e\u767b\u5f55"

    .line 45
    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnText(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 46
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    const v9, 0x7f071279

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v8

    float-to-int v8, v8

    invoke-static {v8}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v8

    invoke-virtual {v5, v8}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnTextDpSize(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 47
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnTextColor(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 48
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f07138c

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    float-to-int v7, v7

    invoke-static {v7}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnWidth(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 49
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f0714e6

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    float-to-int v7, v7

    invoke-static {v7}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnHeight(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    const-string v7, "shape_btn_onekey_login"

    .line 50
    invoke-virtual {v5, v7}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnBackgroundRes(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    .line 51
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v8, 0x7f071488

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v7

    float-to-int v7, v7

    invoke-static {v7}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v7

    invoke-virtual {v5, v7}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginBtnTopYOffset(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v5

    new-instance v7, Lcom/join/mgps/activity/login/b;

    invoke-direct {v7, p0}, Lcom/join/mgps/activity/login/b;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    const-string v8, "otherLogin"

    const/4 v9, 0x0

    .line 52
    invoke-virtual {v5, v0, v8, v9, v7}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->addCustomView(Landroid/view/View;Ljava/lang/String;ILcom/netease/nis/quicklogin/utils/LoginUiHelper$CustomViewListener;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 53
    invoke-virtual {v0, v9}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setHidePrivacyCheckBox(Z)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const/16 v5, 0x30

    .line 54
    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setCheckBoxGravity(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 55
    invoke-virtual {v0, v9}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyState(Z)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v5, "checkbox_round_blue_selected"

    .line 56
    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setCheckedImageName(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v5, "checkbox_round_blue_default"

    .line 57
    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setUnCheckedImageName(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 58
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f07124c

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    invoke-static {v5}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyCheckBoxHeight(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 59
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    invoke-static {v5}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyCheckBoxWidth(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 60
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f0713af

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    invoke-static {v5}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyTextMarginLeft(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 61
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v7, 0x7f0711a9

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    invoke-static {v5}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyBottomYOffset(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v5, "#494949"

    .line 62
    invoke-static {v5}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    invoke-virtual {v0, v5}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyTextColor(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 63
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyProtocolColor(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 64
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyDpSize(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 65
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f07106d

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyMarginLeft(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 66
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Lcom/join/android/app/component/optimizetext/a;->n(I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyMarginRight(I)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 67
    invoke-virtual {v0, v9}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyTextGravityCenter(Z)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v1, "\u5df2\u9605\u8bfb\u5e76\u540c\u610f"

    .line 68
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyTextStart(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v1, ""

    .line 69
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setPrivacyTextEnd(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v1, "\u300a\u7528\u6237\u534f\u8bae\u300b"

    .line 70
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setProtocolText(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/static/yhxkxy.html"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setProtocolLink(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    const-string v1, "\u300a\u9690\u79c1\u653f\u7b56\u300b"

    .line 72
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setProtocol2Text(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/rpc/h;->j:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/static/yszc.html"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 73
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setProtocol2Link(Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 74
    iget-boolean v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->isBackFromOtherLogin:Z

    if-eqz v1, :cond_0

    const-string v1, "anim_onekey_login_in2"

    goto :goto_0

    :cond_0
    const-string v1, "anim_onekey_login_in"

    :goto_0
    const-string v3, "anim_onekey_login_out"

    invoke-virtual {v0, v1, v3}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setActivityTranslateAnimation(Ljava/lang/String;Ljava/lang/String;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/login/LoginSplashActivity$2;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/login/LoginSplashActivity$2;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    .line 75
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setLoginListener(Lcom/netease/nis/quicklogin/listener/LoginListener;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->isForcedLogin:Z

    xor-int/2addr v1, v6

    .line 76
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setBackPressedAvailable(Z)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/activity/login/LoginSplashActivity$1;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/login/LoginSplashActivity$1;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    .line 77
    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->setClickEventListener(Lcom/netease/nis/quicklogin/listener/ClickEventListener;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    move-result-object v0

    .line 78
    iget-boolean v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->isForcedLogin:Z

    const-string v3, "ivBack"

    if-nez v1, :cond_1

    .line 79
    new-instance v1, Lcom/join/mgps/activity/login/a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/login/a;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    invoke-virtual {v0, v2, v3, v9, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->addCustomView(Landroid/view/View;Ljava/lang/String;ILcom/netease/nis/quicklogin/utils/LoginUiHelper$CustomViewListener;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    goto :goto_1

    .line 80
    :cond_1
    invoke-virtual {v0, v4, v3, v9, v10}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->addCustomView(Landroid/view/View;Ljava/lang/String;ILcom/netease/nis/quicklogin/utils/LoginUiHelper$CustomViewListener;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;

    .line 81
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/helper/UnifyUiConfig$Builder;->build(Landroid/content/Context;)Lcom/netease/nis/quicklogin/helper/UnifyUiConfig;

    move-result-object v0

    .line 82
    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    invoke-virtual {v1, v0}, Lcom/netease/nis/quicklogin/QuickLogin;->setUnifyUiConfig(Lcom/netease/nis/quicklogin/helper/UnifyUiConfig;)V

    .line 83
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    new-instance v1, Lcom/join/mgps/activity/login/LoginSplashActivity$3;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/login/LoginSplashActivity$3;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    invoke-virtual {v0, v1}, Lcom/netease/nis/quicklogin/QuickLogin;->onePass(Lcom/netease/nis/quicklogin/listener/QuickLoginTokenListener;)V

    .line 84
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->welcomePageShow:Lcom/papa/sim/statistic/Event;

    invoke-direct {p0, v10}, Lcom/join/mgps/activity/login/LoginSplashActivity;->getExt(Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method joinDevice()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    new-instance v0, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v0}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uid"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getToken()Ljava/lang/String;

    move-result-object v1

    const-string v2, "token"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->rpcAccountClient:Lcom/join/mgps/rpc/b;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/b;->S(Ljava/util/Map;)Lcom/join/mgps/dto/AccountResultMainBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getError()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/JPushJoinDeviceResult;

    invoke-virtual {v1}, Lcom/join/mgps/dto/JPushJoinDeviceResult;->isResult()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/AccountResultMainBean;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/JPushJoinDeviceResult;

    invoke-virtual {v0}, Lcom/join/mgps/dto/JPushJoinDeviceResult;->getMsg()Ljava/lang/String;

    :cond_0
    return-void
.end method

.method loginSuccess(Lcom/wufan/user/service/protobuf/n0;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->prefDef:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->singleGameShowDialog()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 2
    sget-object v0, Lcom/join/mgps/activity/CheckInviteDialogActivity;->N:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "clipboard"

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 4
    sget-object v2, Lcom/join/mgps/activity/CheckInviteDialogActivity;->N:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/content/ClipboardManager;->setText(Ljava/lang/CharSequence;)V

    .line 5
    sput-object v1, Lcom/join/mgps/activity/CheckInviteDialogActivity;->N:Ljava/lang/String;

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/join/mgps/Util/b;->saveAccountData(Lcom/wufan/user/service/protobuf/n0;Landroid/content/Context;)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/service/CommonService_;->S2(Landroid/content/Context;)Lcom/join/mgps/service/CommonService_$h2;

    move-result-object v0

    const-string v1, "accountloginSuccess"

    const-string v2, "xxx"

    invoke-virtual {v0, v1, v2}, Lorg/androidannotations/api/builder/e;->extra(Ljava/lang/String;Ljava/lang/String;)Lorg/androidannotations/api/builder/e;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/service/CommonService_$h2;

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/g;->a()Landroid/content/ComponentName;

    .line 8
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->joinDevice()V

    const/16 v0, 0x271b

    .line 9
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/login/LoginSplashActivity;->finish()V

    .line 11
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    iget-object v2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->gameId:Ljava/lang/String;

    const-string v3, "login"

    invoke-virtual {v0, v1, p1, v3, v2}, Lcom/join/mgps/Util/IntentUtil;->checkRealNameAndIntent(Landroid/content/Context;Lcom/wufan/user/service/protobuf/n0;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    iget-object p1, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->application:Lcom/MApplication;

    invoke-virtual {p1}, Lcom/MApplication;->f()V

    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 2
    invoke-super {p0, p1}, Landroidx/fragment/app/FragmentActivity;->onCreate(Landroid/os/Bundle;)V

    return-void
.end method

.method protected onDestroy()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    return-void
.end method

.method oneKeyLogin(Ljava/lang/String;Ljava/lang/String;Lcom/netease/nis/quicklogin/QuickLogin;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 2
    :try_start_0
    new-instance p3, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;

    invoke-direct {p3}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;-><init>()V

    const-string v0, ""

    .line 3
    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->setMobile(Ljava/lang/String;)V

    .line 4
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/n;->z()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->setVersion(Ljava/lang/String;)V

    .line 5
    invoke-static {p0}, Lcom/join/android/app/common/utils/n;->n(Landroid/content/Context;)Lcom/join/android/app/common/utils/n;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/n;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->setDeviceId(Ljava/lang/String;)V

    const-string v0, "YI_DUN"

    .line 6
    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->setProvider(Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;

    invoke-direct {v0, p1, p2}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->setParams(Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;)V

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/j;->b()Lcom/join/mgps/rpc/impl/j;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/rpc/impl/j;->a()Le2/j;

    move-result-object p1

    invoke-virtual {p3}, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->getParamsMap()Lorg/springframework/util/LinkedMultiValueMap;

    move-result-object p2

    invoke-interface {p1, p2}, Le2/j;->g(Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/join/mgps/activity/login/LoginSplashActivity$4;

    invoke-direct {p2, p0}, Lcom/join/mgps/activity/login/LoginSplashActivity$4;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string p2, "0"

    .line 11
    invoke-virtual {p1, p2}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 12
    iget-object p2, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object p3, Lcom/papa/sim/statistic/Event;->quickLoginResult:Lcom/papa/sim/statistic/Event;

    invoke-direct {p0, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->getExt(Lcom/papa/sim/statistic/Ext;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    goto :goto_0

    :cond_0
    const-string p1, "\u6ca1\u6709\u7f51\u7edc\uff0c\u8bf7\u5148\u68c0\u67e5\u7f51\u7edc\u3002"

    .line 13
    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/login/LoginSplashActivity;->error(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method quitActivity()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->quickLogin:Lcom/netease/nis/quicklogin/QuickLogin;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/netease/nis/quicklogin/QuickLogin;->quitActivity()V

    :cond_0
    return-void
.end method

.method public showLoadingDialog()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    .line 3
    invoke-virtual {v0}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    new-instance v2, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/ColorDrawable;-><init>()V

    invoke-virtual {v0, v2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCancelable(Z)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    new-instance v2, Lcom/join/mgps/activity/login/LoginSplashActivity$5;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/login/LoginSplashActivity$5;-><init>(Lcom/join/mgps/activity/login/LoginSplashActivity;)V

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    const v2, 0x7f0c0560

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog;->setContentView(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/login/LoginSplashActivity;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    return-void
.end method
