.class public Lcom/join/mgps/activity/SplashActivity;
.super Landroid/app/Activity;
.source "SplashActivity.java"


# annotations
.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0761
.end annotation


# static fields
.field public static final X:Ljava/lang/String; = "SplashActivity"

.field private static final Y:Ljava/lang/String; = "\u70b9\u51fb\u8df3\u8fc7 %d"


# instance fields
.field private A:Lcom/join/mgps/adapter/LodingViewPagerAdapter;

.field private B:Lcom/join/mgps/dto/FirstIntentData;

.field C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

.field D:I

.field private E:Landroid/os/Handler;

.field private F:Z

.field private G:Z

.field private H:I

.field private I:Lcom/bytedance/sdk/openadsdk/TTAdNative;

.field private J:Ljava/lang/String;

.field private K:I

.field private L:I

.field private M:Lcom/join/mgps/shake/a;

.field private N:Landroid/os/Vibrator;

.field O:Lcom/join/mgps/shake/a$a;

.field P:Landroid/view/GestureDetector;

.field Q:Lcom/nineoldandroids/animation/q;

.field R:F

.field S:F

.field T:Lcom/join/mgps/dto/ShowViewDataBean;

.field U:Lcom/join/mgps/dto/SplashIntentBean;

.field private V:Lcom/beizi/fusion/SplashAd;

.field W:Lcom/aggmoread/sdk/client/splash/AMSplashAd;

.field b:Landroid/widget/FrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/join/android/app/component/video/EmptyControlVideoView;

.field d:Lcom/facebook/drawee/view/SimpleDraweeView;

.field e:Landroid/widget/RelativeLayout;

.field f:Landroid/widget/ImageView;

.field g:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field h:Landroid/widget/TextView;

.field i:Landroid/widget/TextView;

.field j:Landroid/view/View;

.field k:Lcom/join/mgps/dto/ThAdSwitchDataBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field l:Lcom/join/mgps/dto/PlayCfgBean;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field m:Landroid/widget/ImageView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f0912ec
    .end annotation
.end field

.field n:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
        value = 0x7f0912c2
    .end annotation
.end field

.field o:Landroid/widget/ImageView;

.field p:Landroid/widget/ImageView;

.field q:Landroid/widget/RelativeLayout;

.field r:Landroid/widget/LinearLayout;

.field s:Landroid/widget/LinearLayout;

.field t:Landroid/widget/TextView;

.field u:Landroid/widget/TextView;

.field v:Landroid/widget/RelativeLayout;

.field private w:I

.field private x:J

.field public y:Z

.field private z:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    const/16 v0, 0x7d0

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->w:I

    const-wide/16 v0, 0x0

    .line 3
    iput-wide v0, p0, Lcom/join/mgps/activity/SplashActivity;->x:J

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->z:Z

    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    const/4 v2, 0x4

    .line 7
    iput v2, p0, Lcom/join/mgps/activity/SplashActivity;->D:I

    .line 8
    new-instance v2, Lcom/join/mgps/activity/SplashActivity$i;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/SplashActivity$i;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    iput-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    .line 9
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->F:Z

    .line 10
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->G:Z

    const/4 v2, 0x1

    .line 11
    iput v2, p0, Lcom/join/mgps/activity/SplashActivity;->H:I

    const-string v2, ""

    .line 12
    iput-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->J:Ljava/lang/String;

    .line 13
    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->L:I

    .line 14
    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    .line 15
    new-instance v0, Lcom/join/mgps/activity/SplashActivity$k;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SplashActivity$k;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->O:Lcom/join/mgps/shake/a$a;

    .line 16
    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const/4 v0, 0x0

    .line 17
    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->R:F

    .line 18
    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->S:F

    return-void
.end method

.method private A(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/join/mgps/activity/SplashActivity;->u(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->init(Landroid/content/Context;Lcom/bytedance/sdk/openadsdk/TTAdConfig;)Z

    .line 2
    new-instance p2, Lcom/join/mgps/activity/SplashActivity$c;

    invoke-direct {p2, p0, p1}, Lcom/join/mgps/activity/SplashActivity$c;-><init>(Lcom/join/mgps/activity/SplashActivity;Landroid/content/Context;)V

    invoke-static {p2}, Lcom/bytedance/sdk/openadsdk/TTAdSdk;->start(Lcom/bytedance/sdk/openadsdk/TTAdSdk$Callback;)V

    return-void
.end method

.method private B()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method private C(Ljava/lang/String;Ljava/lang/String;J)Z
    .locals 15

    const/4 v1, 0x6

    new-array v0, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "Aspect"

    aput-object v3, v0, v2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v0, v5

    const/4 v4, 0x2

    const-string v6, "isInRange"

    aput-object v6, v0, v4

    const/4 v7, 0x3

    aput-object p1, v0, v7

    const/4 v8, 0x4

    aput-object p2, v0, v8

    const-string v9, "before"

    const/4 v10, 0x5

    aput-object v9, v0, v10

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v9, "after"

    if-nez v0, :cond_2

    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    :try_start_0
    invoke-static/range {p1 .. p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    const-wide/16 v13, 0x3e8

    mul-long v11, v11, v13

    cmp-long v0, p3, v11

    if-lez v0, :cond_1

    invoke-static/range {p2 .. p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v11

    mul-long v11, v11, v13

    cmp-long v0, p3, v11

    if-gez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-array v11, v1, [Ljava/lang/String;

    aput-object v3, v11, v2

    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v12

    aput-object v12, v11, v5

    aput-object v6, v11, v4

    aput-object p1, v11, v7

    aput-object p2, v11, v8

    aput-object v9, v11, v10

    invoke-static {v11}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/NumberFormatException;->printStackTrace()V

    new-array v0, v1, [Ljava/lang/String;

    aput-object v3, v0, v2

    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    aput-object v6, v0, v4

    aput-object p1, v0, v7

    aput-object p2, v0, v8

    aput-object v9, v0, v10

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    return v2

    :cond_2
    :goto_1
    new-array v0, v1, [Ljava/lang/String;

    aput-object v3, v0, v2

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v5

    aput-object v6, v0, v4

    aput-object p1, v0, v7

    aput-object p2, v0, v8

    aput-object v9, v0, v10

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    return v2
.end method

.method private D()Z
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "1"

    const/4 v2, 0x0

    .line 1
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "splash isShowSplash"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v3

    invoke-virtual {v3}, Lp1/b;->d()Ljava/util/List;

    move-result-object v3

    .line 3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    .line 5
    invoke-virtual {v5}, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;->getShowVieDatabean()Lcom/join/mgps/dto/ShowViewDataBean;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    const/4 v3, 0x0

    move-object v7, v3

    const/4 v8, 0x0

    .line 7
    :goto_1
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_3

    .line 8
    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/ShowViewDataBean;

    .line 9
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v10

    .line 10
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const/4 v12, 0x2

    const-wide/16 v13, 0x3e8

    if-eqz v11, :cond_1

    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v11

    if-eq v11, v12, :cond_1

    .line 11
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getBegin_times()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    mul-long v10, v10, v13

    .line 12
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getEnd_times()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v15

    mul-long v15, v15, v13

    cmp-long v12, v5, v10

    if-lez v12, :cond_2

    cmp-long v10, v5, v15

    if-gez v10, :cond_2

    move-object v3, v9

    goto :goto_2

    .line 13
    :cond_1
    invoke-virtual {v10, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    .line 14
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getBegin_times()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    mul-long v10, v10, v13

    .line 15
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getEnd_times()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v15

    mul-long v15, v15, v13

    cmp-long v13, v5, v10

    if-lez v13, :cond_2

    cmp-long v10, v5, v15

    if-gez v10, :cond_2

    .line 16
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    if-lez v10, :cond_2

    .line 17
    invoke-virtual {v9}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v10

    if-eq v10, v12, :cond_2

    move-object v7, v9

    :cond_2
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    if-eqz v3, :cond_4

    .line 18
    invoke-virtual {v0, v3}, Lcom/join/mgps/activity/SplashActivity;->W(Lcom/join/mgps/dto/ShowViewDataBean;)Z

    move-result v1

    return v1

    :cond_4
    if-eqz v7, :cond_5

    .line 19
    invoke-virtual {v0, v7}, Lcom/join/mgps/activity/SplashActivity;->W(Lcom/join/mgps/dto/ShowViewDataBean;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_5
    return v2
.end method

.method private synthetic E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->k:Lcom/join/mgps/dto/ThAdSwitchDataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getFx_sdk_key()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p0, v0}, Lcom/join/mgps/activity/SplashActivity;->A(Landroid/content/Context;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->k:Lcom/join/mgps/dto/ThAdSwitchDataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getFx_ad_id()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/SplashActivity;->M(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic F()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->l:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/SplashActivity;->K(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic G()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->l:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/PlayCfgBean;->getAd_id()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/SplashActivity;->L(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic H(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private synthetic I(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->P:Landroid/view/GestureDetector;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private J(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->P()V

    return-void
.end method

.method private K(Ljava/lang/String;)V
    .locals 10

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->AdscopeSdk_loading:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->e0()V

    .line 3
    new-instance v0, Lcom/beizi/fusion/SplashAd;

    new-instance v7, Lcom/join/mgps/activity/SplashActivity$e;

    invoke-direct {v7, p0}, Lcom/join/mgps/activity/SplashActivity$e;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    const/4 v5, 0x0

    const-wide/16 v8, 0xbb8

    move-object v3, v0

    move-object v4, p0

    move-object v6, p1

    invoke-direct/range {v3 .. v9}, Lcom/beizi/fusion/SplashAd;-><init>(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Lcom/beizi/fusion/AdListener;J)V

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->V:Lcom/beizi/fusion/SplashAd;

    .line 4
    invoke-static {p0}, Lcom/join/mgps/activity/login/AbScreenUtils;->getScreenWidth(Landroid/content/Context;)I

    move-result p1

    invoke-static {p0}, Lcom/join/mgps/activity/login/AbScreenUtils;->getScreenHeight(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {v0, p1, v1}, Lcom/beizi/fusion/SplashAd;->loadAd(II)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->V:Lcom/beizi/fusion/SplashAd;

    new-instance v0, Lcom/join/mgps/activity/SplashActivity$f;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SplashActivity$f;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/SplashAd;->setSplashClickEyeListener(Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;)V

    return-void
.end method

.method private L(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/Event;->AdRenerSdk_loading:Lcom/papa/sim/statistic/Event;

    new-instance v2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->e0()V

    .line 3
    new-instance v0, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    invoke-direct {v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;-><init>()V

    .line 4
    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setSlotId(Ljava/lang/String;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object p1

    const v0, 0x7f090dbd

    .line 5
    invoke-virtual {p0, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setAdContainer(Landroid/view/ViewGroup;)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object p1

    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setAdCount(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object p1

    const/16 v0, 0xbb8

    .line 7
    invoke-virtual {p1, v0}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->setFetchTimeOut(I)Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMAdLoadSlot$Builder;->build()Lcom/aggmoread/sdk/client/AMAdLoadSlot;

    move-result-object p1

    .line 8
    invoke-static {p1}, Lcom/aggmoread/sdk/client/AMSdk;->makeAdLoader(Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/client/AMAdLoader;

    move-result-object p1

    .line 9
    new-instance v0, Lcom/join/mgps/activity/SplashActivity$g;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SplashActivity$g;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    new-instance v1, Lcom/join/mgps/activity/SplashActivity$h;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SplashActivity$h;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-virtual {p1, p0, v0, v1}, Lcom/aggmoread/sdk/client/AMAdLoader;->loadAndShowSplashAd(Landroid/content/Context;Lcom/aggmoread/sdk/client/splash/AMSplashAdListener;Lcom/aggmoread/sdk/client/splash/AMSplashInteractionListener;)V

    return-void
.end method

.method private M(Ljava/lang/String;)V
    .locals 3

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setCodeId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    const/16 v0, 0x438

    const/16 v1, 0x780

    .line 3
    invoke-virtual {p1, v0, v1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->setImageAcceptedSize(II)Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lcom/bytedance/sdk/openadsdk/AdSlot$Builder;->build()Lcom/bytedance/sdk/openadsdk/AdSlot;

    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->I:Lcom/bytedance/sdk/openadsdk/TTAdNative;

    new-instance v1, Lcom/join/mgps/activity/SplashActivity$d;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SplashActivity$d;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    const/16 v2, 0xbb8

    invoke-interface {v0, p1, v1, v2}, Lcom/bytedance/sdk/openadsdk/TTAdNative;->loadSplashAd(Lcom/bytedance/sdk/openadsdk/AdSlot;Lcom/bytedance/sdk/openadsdk/TTAdNative$SplashAdListener;I)V

    return-void
.end method

.method private N()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->x()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    :goto_0
    return-void
.end method

.method private O(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;Ljava/lang/String;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    const-string v3, ""

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v2}, Lcom/join/mgps/dto/ShowViewDataBean;->setTag_show(I)V

    .line 4
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getShowVieDatabeanTable()Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    move-result-object v4

    invoke-virtual {v1, v4}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getId()I

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->D()Z

    move-result v1

    .line 7
    iget-object v4, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v4}, Lcom/join/mgps/pref/PrefDef_;->isShowSplash()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v4, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 8
    :cond_0
    new-instance v1, Lcom/papa/sim/statistic/e;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getJump_id()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v6, "spreadButton"

    invoke-direct {v1, v4, v6, v5, v3}, Lcom/papa/sim/statistic/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-direct {p0, v1, v3}, Lcom/join/mgps/activity/SplashActivity;->U(Lcom/papa/sim/statistic/e;Z)V

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getStrategy_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "_"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getJump_id()I

    move-result v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 10
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    sget-object v5, Lcom/papa/sim/statistic/Event;->onclickScreenAds:Lcom/papa/sim/statistic/Event;

    new-instance v6, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v6}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v6, v1}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 11
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v4

    sget-object v5, Lcom/papa/sim/statistic/Event;->expHomeTrigTab:Lcom/papa/sim/statistic/Event;

    new-instance v6, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v6}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v6, p3}, Lcom/papa/sim/statistic/Ext;->setRecPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p3, v6}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {p3, v1}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {p3, v1}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p3

    invoke-virtual {v4, v5, p3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 12
    invoke-virtual {p2, v2}, Lcom/join/mgps/dto/SplashIntentBean;->setTag_show(I)V

    .line 13
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getShowVieDatabeanTable()Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    move-result-object p1

    invoke-virtual {p2, p1}, Lp1/b;->m(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    iput-boolean v3, p0, Lcom/join/mgps/activity/SplashActivity;->F:Z

    .line 15
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->D()Z

    move-result p1

    .line 16
    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p2}, Lcom/join/mgps/pref/PrefDef_;->isShowSplash()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 17
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/SplashActivity;->b0(Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method

.method private Q()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->p:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/nineoldandroids/animation/q;->Y()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0711b8

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->R:F

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f071477

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->S:F

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->p:Landroid/widget/ImageView;

    const/high16 v2, 0x40800000    # 4.0f

    mul-float v0, v0, v2

    const/high16 v2, 0x40a00000    # 5.0f

    div-float/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setPivotX(F)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->p:Landroid/widget/ImageView;

    iget v1, p0, Lcom/join/mgps/activity/SplashActivity;->R:F

    const/high16 v3, 0x40000000    # 2.0f

    mul-float v1, v1, v3

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setPivotY(F)V

    .line 9
    new-instance v0, Lcom/nineoldandroids/animation/q;

    invoke-direct {v0}, Lcom/nineoldandroids/animation/q;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const/4 v1, 0x5

    new-array v1, v1, [F

    .line 10
    fill-array-data v1, :array_0

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->e0([F)V

    .line 11
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->i0(I)V

    .line 12
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->j0(I)V

    .line 13
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    new-instance v1, Landroid/view/animation/AccelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->l(Landroid/view/animation/Interpolator;)V

    .line 14
    new-instance v0, Lcom/join/mgps/activity/SplashActivity$l;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SplashActivity$l;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    iget-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->p:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/animation/a;->n(Ljava/lang/Object;)V

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    invoke-virtual {v1, v0}, Lcom/nineoldandroids/animation/q;->C(Lcom/nineoldandroids/animation/q$g;)V

    .line 17
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Lcom/nineoldandroids/animation/q;->c0(J)Lcom/nineoldandroids/animation/q;

    .line 18
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    invoke-virtual {v0}, Lcom/nineoldandroids/animation/q;->q()V

    :cond_1
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x41f00000    # 30.0f
        0x0
        0x42340000    # 45.0f
        0x0
    .end array-data
.end method

.method private R()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->o:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/nineoldandroids/animation/q;->Y()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    if-nez v0, :cond_1

    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0711ce

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lcom/join/mgps/activity/SplashActivity;->R:F

    .line 6
    new-instance v0, Lcom/nineoldandroids/animation/q;

    invoke-direct {v0}, Lcom/nineoldandroids/animation/q;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v2, 0x0

    .line 7
    iget v3, p0, Lcom/join/mgps/activity/SplashActivity;->R:F

    aput v3, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    aput v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->e0([F)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->i0(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    invoke-virtual {v0, v3}, Lcom/nineoldandroids/animation/q;->j0(I)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    invoke-virtual {v0, v1}, Lcom/nineoldandroids/animation/q;->l(Landroid/view/animation/Interpolator;)V

    .line 11
    new-instance v0, Lcom/join/mgps/activity/SplashActivity$n;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/SplashActivity$n;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    iget-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->o:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/animation/a;->n(Ljava/lang/Object;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    invoke-virtual {v1, v0}, Lcom/nineoldandroids/animation/q;->C(Lcom/nineoldandroids/animation/q$g;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    const-wide/16 v1, 0x5dc

    invoke-virtual {v0, v1, v2}, Lcom/nineoldandroids/animation/q;->c0(J)Lcom/nineoldandroids/animation/q;

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->Q:Lcom/nineoldandroids/animation/q;

    invoke-virtual {v0}, Lcom/nineoldandroids/animation/q;->q()V

    :cond_1
    return-void
.end method

.method private S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
    .locals 4

    .line 1
    new-instance v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-direct {v0, p0}, Lcom/facebook/drawee/view/SimpleDraweeView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {p3}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote_local()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 4
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 6
    invoke-static {v2}, Lcom/join/android/app/common/utils/MyImageLoader;->G(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p3}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p3}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object v1

    .line 9
    :goto_0
    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const v2, 0x7f08007a

    .line 10
    sget-object v3, Lcom/facebook/drawee/drawable/r$c;->a:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v0, v2, v1, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 11
    :cond_2
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    invoke-virtual {v1, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setThumbImageView(Landroid/view/View;)V

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    const/4 v1, 0x1

    const-string v2, " "

    invoke-virtual {v0, p1, v1, v2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUp(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    new-instance v0, Lcom/join/mgps/activity/SplashActivity$q;

    invoke-direct {v0, p0, p2, p3}, Lcom/join/mgps/activity/SplashActivity$q;-><init>(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    invoke-virtual {p1, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    invoke-virtual {p1, v1}, Lcom/join/android/app/component/video/EmptyControlVideoView;->setMute(Z)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    new-instance p2, Lcom/join/mgps/activity/SplashActivity$a;

    invoke-direct {p2, p0}, Lcom/join/mgps/activity/SplashActivity$a;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private T(Lcom/join/mgps/dto/ShowViewDataBean;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    new-instance v1, Lcom/join/mgps/activity/SplashActivity$o;

    invoke-direct {v1, p0, p1}, Lcom/join/mgps/activity/SplashActivity$o;-><init>(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private U(Lcom/papa/sim/statistic/e;Z)V
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/papa/sim/statistic/e;->j(Ljava/lang/String;)V

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/papa/sim/statistic/p;->w(Lcom/papa/sim/statistic/e;Z)V

    return-void
.end method

.method private Z()V
    .locals 5

    .line 1
    invoke-static {p0}, Lcom/papa/sim/statistic/pref/b;->k(Landroid/content/Context;)Lcom/papa/sim/statistic/pref/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/papa/sim/statistic/pref/b;->d()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    .line 4
    :cond_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c0760

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f091180

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->q:Landroid/widget/RelativeLayout;

    const v1, 0x7f091151

    .line 6
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->v:Landroid/widget/RelativeLayout;

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    if-eqz v1, :cond_6

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getAction()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->J:Ljava/lang/String;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getMode()Ljava/lang/String;

    move-result-object v1

    const-string v2, "shake_click"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "android.hardware.sensor.accelerometer"

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v3

    goto :goto_0

    :cond_1
    const/4 v3, 0x1

    :goto_0
    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eqz v3, :cond_3

    const v1, 0x7f090931

    .line 11
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->p:Landroid/widget/ImageView;

    const v1, 0x7f090cf8

    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->r:Landroid/widget/LinearLayout;

    const v1, 0x7f0915ee

    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->t:Landroid/widget/TextView;

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->r:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 15
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getTips()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->t:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getTips()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getShake_conf()Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/join/mgps/activity/SplashActivity;->y(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V

    const/4 v1, 0x2

    .line 18
    iput v1, p0, Lcom/join/mgps/activity/SplashActivity;->L:I

    goto :goto_1

    .line 19
    :cond_3
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getMode()Ljava/lang/String;

    move-result-object v1

    const-string v3, "slide_click"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const v1, 0x7f090932

    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->o:Landroid/widget/ImageView;

    const v1, 0x7f090cf9

    .line 21
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->s:Landroid/widget/LinearLayout;

    const v1, 0x7f0915ef

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->u:Landroid/widget/TextView;

    .line 23
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v4}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 24
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getTips()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 25
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->u:Landroid/widget/TextView;

    iget-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getTips()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    :cond_4
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->v:Landroid/widget/RelativeLayout;

    new-instance v2, Lcom/join/mgps/activity/c3;

    invoke-direct {v2, p0}, Lcom/join/mgps/activity/c3;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 27
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->z()V

    const/4 v1, 0x3

    .line 28
    iput v1, p0, Lcom/join/mgps/activity/SplashActivity;->L:I

    goto :goto_1

    .line 29
    :cond_5
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->q:Landroid/widget/RelativeLayout;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 30
    iput v2, p0, Lcom/join/mgps/activity/SplashActivity;->L:I

    :cond_6
    :goto_1
    const v1, 0x7f0917af

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f0903bb

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->h:Landroid/widget/TextView;

    const v1, 0x7f0903bd

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->i:Landroid/widget/TextView;

    const v1, 0x7f0903bc

    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->j:Landroid/view/View;

    const v1, 0x7f0901d4

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/RelativeLayout;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->e:Landroid/widget/RelativeLayout;

    const v1, 0x7f0907bf

    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->f:Landroid/widget/ImageView;

    const v1, 0x7f09179e

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/EmptyControlVideoView;

    iput-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    .line 38
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->b:Landroid/widget/FrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 39
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->j:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/activity/SplashActivity$j;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SplashActivity$j;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->f0()V

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splash afterview2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 42
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->w()V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/activity/SplashActivity;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->I(Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->F()V

    return-void
.end method

.method public static synthetic c(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->G()V

    return-void
.end method

.method public static synthetic d(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->E()V

    return-void
.end method

.method public static synthetic e(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/join/mgps/activity/SplashActivity;->H(Landroid/view/View;)V

    return-void
.end method

.method private e0()V
    .locals 5

    const-string v0, "adCount"

    .line 1
    new-instance v1, Lcom/papa91/wrapper/UserPrefs;

    invoke-direct {v1, p0}, Lcom/papa91/wrapper/UserPrefs;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v1}, Lcom/papa91/wrapper/UserPrefs;->getSspAdConfig()Ljava/lang/String;

    move-result-object v2

    .line 3
    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    .line 4
    :try_start_0
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 6
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v4, v0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    add-int/lit8 v4, v4, 0x1

    .line 8
    invoke-virtual {v1, v4}, Lcom/papa91/wrapper/UserPrefs;->setSspAdConfig(I)V

    return-void
.end method

.method static synthetic f(Lcom/join/mgps/activity/SplashActivity;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/join/mgps/activity/SplashActivity;->F:Z

    return p0
.end method

.method static synthetic g(Lcom/join/mgps/activity/SplashActivity;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    return-object p0
.end method

.method static synthetic h(Lcom/join/mgps/activity/SplashActivity;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->B()Z

    move-result p0

    return p0
.end method

.method static synthetic i(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->Z()V

    return-void
.end method

.method static synthetic j(Lcom/join/mgps/activity/SplashActivity;)Lcom/join/mgps/dto/FirstIntentData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SplashActivity;->B:Lcom/join/mgps/dto/FirstIntentData;

    return-object p0
.end method

.method static synthetic k(Lcom/join/mgps/activity/SplashActivity;)Landroid/os/Vibrator;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SplashActivity;->N:Landroid/os/Vibrator;

    return-object p0
.end method

.method static synthetic l(Lcom/join/mgps/activity/SplashActivity;)Lcom/join/mgps/shake/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    return-object p0
.end method

.method static synthetic m(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/activity/SplashActivity;->O(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic n(Lcom/join/mgps/activity/SplashActivity;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/join/mgps/activity/SplashActivity;->K:I

    return p0
.end method

.method static synthetic o(Lcom/join/mgps/activity/SplashActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->x()V

    return-void
.end method

.method static synthetic p(Lcom/join/mgps/activity/SplashActivity;Lcom/bytedance/sdk/openadsdk/TTAdNative;)Lcom/bytedance/sdk/openadsdk/TTAdNative;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->I:Lcom/bytedance/sdk/openadsdk/TTAdNative;

    return-object p1
.end method

.method static synthetic q(Lcom/join/mgps/activity/SplashActivity;)Lcom/beizi/fusion/SplashAd;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/activity/SplashActivity;->V:Lcom/beizi/fusion/SplashAd;

    return-object p0
.end method

.method private r()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->P:Landroid/view/GestureDetector;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Landroid/view/GestureDetector;

    new-instance v1, Lcom/join/mgps/activity/SplashActivity$m;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/SplashActivity$m;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-direct {v0, p0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->P:Landroid/view/GestureDetector;

    :cond_0
    return-void
.end method

.method private s(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/shake/a;

    invoke-direct {v0, p0}, Lcom/join/mgps/shake/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    .line 2
    invoke-virtual {v0, p1}, Lcom/join/mgps/shake/a;->c(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->O:Lcom/join/mgps/shake/a$a;

    invoke-virtual {p1, v0}, Lcom/join/mgps/shake/a;->b(Lcom/join/mgps/shake/a$a;)V

    const-string p1, "vibrator"

    .line 4
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->N:Landroid/os/Vibrator;

    return-void
.end method

.method private static u(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;-><init>()V

    .line 2
    invoke-virtual {v0, p0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->appId(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const-string v0, "\u609f\u996d\u6e38\u620f\u5385_android"

    .line 3
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->appName(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, 0x1

    .line 4
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->titleBarTheme(I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    .line 5
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->allowShowNotify(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    .line 6
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->debug(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    .line 7
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->directDownloadNetworkType([I)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->supportMultiProcess(Z)Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;

    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/bytedance/sdk/openadsdk/TTAdConfig$Builder;->build()Lcom/bytedance/sdk/openadsdk/TTAdConfig;

    move-result-object p0

    return-object p0

    :array_0
    .array-data 4
        0x4
        0x3
    .end array-data
.end method

.method private x()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    if-eqz v0, :cond_1

    const/16 v0, 0x2711

    .line 3
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    :goto_0
    return-void
.end method

.method private y(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->Q()V

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/SplashActivity;->s(Lcom/join/mgps/dto/FirstScreenAdInteractionBean$ShakeConfBean;)V

    return-void
.end method

.method private z()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->R()V

    .line 2
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->r()V

    return-void
.end method


# virtual methods
.method public P()V
    .locals 6

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/join/mgps/activity/SplashActivity;->x:J

    sub-long/2addr v0, v2

    .line 2
    iget v2, p0, Lcom/join/mgps/activity/SplashActivity;->w:I

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-lez v5, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    int-to-long v2, v2

    sub-long v0, v2, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    new-instance v3, Lcom/join/mgps/activity/SplashActivity$b;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/SplashActivity$b;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method V(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
    .locals 8

    const-string v0, ""

    const-string v1, "0"

    const-string v2, "_"

    .line 1
    :try_start_0
    iput-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->T:Lcom/join/mgps/dto/ShowViewDataBean;

    .line 2
    iput-object p2, p0, Lcom/join/mgps/activity/SplashActivity;->U:Lcom/join/mgps/dto/SplashIntentBean;

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getStrategy_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getJump_id()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 4
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->FullScreenAds:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v5, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 5
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expHomeFunTab:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v5, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget v5, p0, Lcom/join/mgps/activity/SplashActivity;->L:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/papa/sim/statistic/Ext;->setRecPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "splash setimageback"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->h:Landroid/widget/TextView;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->i:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->e:Landroid/widget/RelativeLayout;

    const/4 v3, -0x1

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    if-eqz v1, :cond_0

    const/4 v3, 0x2

    .line 13
    invoke-virtual {v1, v3}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 14
    :cond_0
    new-instance v1, Lcom/papa/sim/statistic/e;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v3

    const-string v4, "spreadButton"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getJump_id()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v3, v4, v5, v0}, Lcom/papa/sim/statistic/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1, v2}, Lcom/join/mgps/activity/SplashActivity;->U(Lcom/papa/sim/statistic/e;Z)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->v:Landroid/widget/RelativeLayout;

    new-instance v1, Lcom/join/mgps/activity/SplashActivity$p;

    invoke-direct {v1, p0, p1, p2}, Lcom/join/mgps/activity/SplashActivity$p;-><init>(Lcom/join/mgps/activity/SplashActivity;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->e:Landroid/widget/RelativeLayout;

    sget-object v0, Lcom/join/mgps/activity/b3;->b:Lcom/join/mgps/activity/b3;

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    const-wide/16 v1, 0xfa0

    .line 18
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 19
    :cond_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote_local()Ljava/lang/String;

    move-result-object p1

    .line 20
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, "http"

    const v2, 0x7f08007a

    if-eqz v0, :cond_4

    .line 21
    :try_start_1
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 22
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 23
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v0}, Lcom/join/android/app/common/utils/MyImageLoader;->G(Ljava/io/File;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {p1, v2, p2, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    goto :goto_0

    .line 24
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object p1

    .line 25
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 26
    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {p2, v2, p1}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    goto :goto_0

    .line 27
    :cond_3
    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {p1}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {p2, v2, p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    goto :goto_0

    .line 28
    :cond_4
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-static {p1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 30
    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    sget-object v0, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {p2, v2, p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    goto :goto_0

    .line 31
    :cond_5
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "file://"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 32
    iget-object p2, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {p1}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {p2, v2, p1, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 33
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "splash loadimage"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->a0()V

    :goto_1
    return-void
.end method

.method W(Lcom/join/mgps/dto/ShowViewDataBean;)Z
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splash setiamgeBackx"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SplashIntentBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote()Ljava/lang/String;

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->lastClickPageAD()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 5
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getId()I

    move-result p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    .line 6
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object p1

    .line 7
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/SplashIntentBean;

    .line 8
    invoke-virtual {v1}, Lcom/join/mgps/dto/SplashIntentBean;->getTag_show()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    return v2

    :cond_2
    return v0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    return v0
.end method

.method X(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V
    .locals 8

    const-string v0, ""

    const-string v1, "1"

    const-string v2, "_"

    .line 1
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/ShowViewDataBean;->getStrategy_id()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getJump_id()I

    move-result v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 2
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->FullScreenAds:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v5, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v5, v2}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 3
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v3

    sget-object v4, Lcom/papa/sim/statistic/Event;->expHomeFunTab:Lcom/papa/sim/statistic/Event;

    new-instance v5, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v5}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v5, v1}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    iget v5, p0, Lcom/join/mgps/activity/SplashActivity;->L:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/papa/sim/statistic/Ext;->setRecPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setNodeId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setReMarks(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {v3, v4, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Lcom/papa/gsyvideoplayer/utils/f;->l(I)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->h:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->i:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->f:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->e:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v3}, Landroid/widget/RelativeLayout;->setBackgroundColor(I)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    invoke-virtual {v1, v3}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 10
    new-instance v1, Lcom/papa/sim/statistic/e;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    const-string v4, "spreadButton"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getJump_id()I

    move-result v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v2, v4, v5, v0}, Lcom/papa/sim/statistic/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1, v3}, Lcom/join/mgps/activity/SplashActivity;->U(Lcom/papa/sim/statistic/e;Z)V

    .line 11
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url_local()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "https"

    const-string v3, "http"

    if-eqz v1, :cond_3

    .line 13
    :try_start_1
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 14
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    if-eqz v0, :cond_6

    .line 16
    invoke-static {v1}, Lcom/join/android/app/common/utils/MyImageLoader;->G(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v0

    .line 18
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 19
    :cond_1
    invoke-direct {p0, v0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    goto :goto_0

    .line 20
    :cond_2
    invoke-static {v0}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    goto :goto_0

    .line 21
    :cond_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 23
    :cond_4
    invoke-direct {p0, v0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    goto :goto_0

    .line 24
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file://"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/join/android/app/common/utils/MyImageLoader;->H(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, p1, p2}, Lcom/join/mgps/activity/SplashActivity;->S(Ljava/lang/String;Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    .line 26
    :cond_6
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "splash loadimage"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 28
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->a0()V

    :goto_1
    return-void
.end method

.method Y()V
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setnormal time ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirstRun()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->B:Lcom/join/mgps/dto/FirstIntentData;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/join/mgps/dto/FirstIntentData;->isCustomApk()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->B:Lcom/join/mgps/dto/FirstIntentData;

    invoke-virtual {v0}, Lcom/join/mgps/dto/FirstIntentData;->isAPKSplashImage()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirstRun()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const v1, 0x7f080e54

    :try_start_1
    const-string v2, ""

    .line 7
    invoke-virtual {v0, v2}, Landroid/content/res/AssetManager;->list(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 8
    :goto_0
    array-length v5, v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    const-string v6, "splash.jpg"

    const-string v7, "splash.png"

    const/4 v8, 0x1

    if-ge v3, v5, :cond_2

    .line 9
    :try_start_2
    aget-object v5, v0, v3

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    .line 10
    :cond_0
    aget-object v5, v0, v3

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v5, :cond_1

    const/4 v4, 0x1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v2, :cond_3

    .line 11
    :try_start_3
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 12
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 13
    iget-object v3, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v3, v2}, Lcom/facebook/drawee/view/DraweeView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 14
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_3
    if-eqz v4, :cond_4

    .line 15
    new-instance v0, Ljava/io/BufferedInputStream;

    invoke-virtual {p0}, Landroid/app/Activity;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v2

    invoke-virtual {v2, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    .line 16
    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 17
    iget-object v3, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v3, v2}, Lcom/facebook/drawee/view/DraweeView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 18
    invoke-virtual {v0}, Ljava/io/BufferedInputStream;->close()V

    goto :goto_3

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageResource(I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_3

    .line 20
    :goto_2
    :try_start_4
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_3

    :catch_1
    move-exception v0

    .line 21
    :try_start_5
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 22
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->d:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v1}, Lcom/facebook/drawee/view/SimpleDraweeView;->setImageResource(I)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 24
    :goto_3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    if-eqz v0, :cond_7

    const/4 v1, 0x3

    const-wide/16 v2, 0xfa0

    .line 25
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_4

    .line 26
    :cond_5
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isFirstRun()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 27
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->c0()V

    goto :goto_4

    .line 28
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->c0()V

    :cond_7
    :goto_4
    return-void
.end method

.method a0()V
    .locals 1

    const/16 v0, 0x2711

    .line 1
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method b0(Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 9

    const-string v0, "splash"

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setFrom(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/Util/IntentDateBean;->getJump_type()I

    move-result v0

    if-ne v0, v2, :cond_0

    goto/16 :goto_5

    .line 3
    :cond_0
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 4
    iget v3, p0, Lcom/join/mgps/activity/SplashActivity;->K:I

    if-ne v3, v2, :cond_1

    const/16 v3, 0x3391

    goto :goto_0

    :cond_1
    const/16 v3, 0x9d

    :goto_0
    invoke-virtual {v0, v3}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    if-eqz v3, :cond_6

    invoke-virtual {p1}, Lcom/join/mgps/Util/IntentDateBean;->getLink_type()I

    move-result v3

    if-ne v3, v2, :cond_6

    .line 6
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/Util/IntentDateBean;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/f;->F(Ljava/lang/String;)Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    const/4 v4, 0x0

    const-string v5, "detail_dl"

    if-eqz v3, :cond_2

    .line 7
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    const/16 v6, 0xb

    if-ne v3, v6, :cond_2

    .line 8
    iget-object v3, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v3, v5}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->setAction(Ljava/lang/String;)V

    const/4 v3, 0x0

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    .line 9
    :goto_1
    iget-object v6, p0, Lcom/join/mgps/activity/SplashActivity;->C:Lcom/join/mgps/dto/FirstScreenAdInteractionBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/FirstScreenAdInteractionBean;->getAction()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    const/4 v7, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_0

    :goto_2
    const/4 v4, -0x1

    goto :goto_3

    :sswitch_0
    const-string v4, "main_dl"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x2

    goto :goto_3

    :sswitch_1
    const-string v4, "tab_dl"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_2

    :cond_4
    const/4 v4, 0x1

    goto :goto_3

    :sswitch_2
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_2

    :cond_5
    :goto_3
    packed-switch v4, :pswitch_data_0

    goto :goto_4

    .line 10
    :pswitch_0
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v3}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 12
    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    const-string v1, "156"

    .line 13
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    goto :goto_4

    .line 14
    :pswitch_1
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v3}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    const-string v3, "2"

    .line 15
    invoke-virtual {p1, v3}, Lcom/join/mgps/Util/IntentDateBean;->setExt1(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 17
    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setJump_type(I)V

    const-string v1, "154"

    .line 18
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    goto :goto_4

    .line 19
    :pswitch_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/Util/IntentDateBean;->setObject(Ljava/lang/Object;)V

    .line 20
    invoke-virtual {p1, v2}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    const/16 v1, 0x9b

    .line 21
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 22
    :cond_6
    :goto_4
    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 23
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    :goto_5
    const/16 p1, 0x2711

    .line 24
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 25
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "startMainActivity  time ="

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x759ad4ca -> :sswitch_2
        -0x3488f28e -> :sswitch_1
        0x318864ce -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method c0()V
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startNow1  time ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    const/16 v0, 0x2711

    .line 2
    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "startNow2  time ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    return-void
.end method

.method d0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
        delay = 0x64L
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splashactivity  start finish time ="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method f0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/WifiUtils;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/WifiUtils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/WifiUtils;->isWifiEnable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->isWifiConnectedBefore()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 3
    :cond_0
    invoke-super {p0}, Landroid/app/Activity;->onBackPressed()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->firstNewSplashV2()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_1

    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Intent;->getFlags()I

    move-result p1

    const/high16 v0, 0x400000

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    invoke-static {p0}, Lcom/join/mgps/Util/c2;->s(Landroid/app/Activity;)V

    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/String;

    const/4 v0, 0x0

    const-string v1, "Aspect"

    aput-object v1, p1, v0

    const/4 v0, 0x1

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, p1, v0

    const/4 v0, 0x2

    const-string v1, "onCreate"

    aput-object v1, p1, v0

    invoke-static {p1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {p1}, Lcom/join/mgps/pref/PrefDef_;->firstNewSplashV2()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    const/16 p1, 0x2711

    .line 7
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    .line 8
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->release()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    if-eqz v0, :cond_1

    const/4 v1, 0x2

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->E:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 6
    :cond_1
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method protected onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onPause()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->G:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoPause()V

    :cond_0
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->G:Z

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/shake/a;->e()V

    :cond_1
    return-void
.end method

.method protected onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->G:Z

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->c:Lcom/join/android/app/component/video/EmptyControlVideoView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->onVideoResume(Z)V

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->N()V

    :cond_1
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->y:Z

    .line 8
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    if-eqz v0, :cond_2

    .line 9
    invoke-virtual {v0}, Lcom/join/mgps/shake/a;->d()V

    :cond_2
    return-void
.end method

.method protected onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Activity;->onStop()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->M:Lcom/join/mgps/shake/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/join/mgps/shake/a;->e()V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 13
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    const/4 v0, 0x4

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "Aspect"

    aput-object v3, v1, v2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v1, v5

    const/4 v4, 0x2

    const-string v6, "afterViews"

    aput-object v6, v1, v4

    const/4 v7, 0x3

    const-string v8, "before"

    aput-object v8, v1, v7

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->k:Lcom/join/mgps/dto/ThAdSwitchDataBean;

    const/4 v9, 0x5

    const/16 v10, 0x8

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getFx_ad_switch()I

    move-result v1

    if-ne v1, v5, :cond_4

    new-array v1, v9, [Ljava/lang/String;

    aput-object v3, v1, v2

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v5

    aput-object v6, v1, v4

    const-string v3, "111"

    aput-object v3, v1, v7

    aput-object v8, v1, v0

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->k:Lcom/join/mgps/dto/ThAdSwitchDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getType()I

    move-result v1

    iput v1, p0, Lcom/join/mgps/activity/SplashActivity;->H:I

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v7, :cond_1

    if-eq v1, v0, :cond_0

    goto/16 :goto_1

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->k:Lcom/join/mgps/dto/ThAdSwitchDataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getFx_ad_id()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/join/mgps/activity/SplashActivity;->J(Ljava/lang/String;)V

    goto/16 :goto_1

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 9
    :cond_3
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->k:Lcom/join/mgps/dto/ThAdSwitchDataBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/ThAdSwitchDataBean;->getFx_sdk_key()Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lcom/join/mgps/activity/f3;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/f3;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-static {v0, v1, v3}, Lcom/join/mgps/ad/adapter/e;->d(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V

    goto :goto_1

    .line 11
    :cond_4
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->l:Lcom/join/mgps/dto/PlayCfgBean;

    if-eqz v1, :cond_7

    .line 12
    invoke-virtual {v1}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_type()I

    move-result v1

    if-eq v1, v10, :cond_6

    const/16 v11, 0x9

    if-eq v1, v11, :cond_5

    goto :goto_0

    .line 13
    :cond_5
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v11, p0, Lcom/join/mgps/activity/SplashActivity;->l:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v11}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lcom/join/mgps/activity/e3;

    invoke-direct {v12, p0}, Lcom/join/mgps/activity/e3;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-static {v1, v11, v12}, Lcom/join/mgps/ad/adapter/d;->a(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V

    .line 14
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 15
    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v11, p0, Lcom/join/mgps/activity/SplashActivity;->l:Lcom/join/mgps/dto/PlayCfgBean;

    invoke-virtual {v11}, Lcom/join/mgps/dto/PlayCfgBean;->getSdk_key()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Lcom/join/mgps/activity/d3;

    invoke-direct {v12, p0}, Lcom/join/mgps/activity/d3;-><init>(Lcom/join/mgps/activity/SplashActivity;)V

    invoke-static {v1, v11, v12}, Lcom/join/mgps/ad/adapter/a;->a(Landroid/content/Context;Ljava/lang/String;Ls1/a;)V

    .line 16
    iget-object v1, p0, Lcom/join/mgps/activity/SplashActivity;->n:Landroid/widget/TextView;

    invoke-virtual {v1, v10}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    new-array v1, v9, [Ljava/lang/String;

    aput-object v3, v1, v2

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v5

    aput-object v6, v1, v4

    const-string v3, "222"

    aput-object v3, v1, v7

    aput-object v8, v1, v0

    invoke-static {v1}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    goto :goto_1

    .line 18
    :cond_7
    invoke-direct {p0}, Lcom/join/mgps/activity/SplashActivity;->Z()V

    .line 19
    :goto_1
    invoke-static {p0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lcom/papa/sim/statistic/p;->K2(ILjava/lang/String;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->plugHasUpdate()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 21
    sput-boolean v2, Lcom/join/mgps/service/CommonService;->W:Z

    .line 22
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "splash afterview3"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_2
    return-void
.end method

.method v()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/SplashActivity;->F:Z

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/SplashActivity;->a0()V

    return-void
.end method

.method w()V
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "333 - aaaa"

    const-string v2, "333 - bbb"

    const-string v3, "333 - ccc"

    const-string v4, "333 - ddd"

    const-string v5, "before"

    const-string v6, "getImageBitmap"

    const-string v7, "Aspect"

    const/4 v8, 0x4

    const/4 v9, 0x3

    const/4 v10, 0x5

    const/4 v11, 0x2

    const/4 v12, 0x0

    const/4 v13, 0x1

    :try_start_0
    new-array v14, v10, [Ljava/lang/String;

    aput-object v7, v14, v12

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v15

    aput-object v15, v14, v13

    aput-object v6, v14, v11

    const-string v15, "11"

    aput-object v15, v14, v9

    aput-object v5, v14, v8

    invoke-static {v14}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lb2/i0;->o()Lb2/i0;

    move-result-object v14

    invoke-virtual {v14}, Lb2/i0;->n()Ljava/util/List;

    move-result-object v14

    if-eqz v14, :cond_14

    .line 3
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_0

    goto/16 :goto_b

    :cond_0
    new-array v15, v10, [Ljava/lang/String;

    aput-object v7, v15, v12

    .line 4
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v16

    aput-object v16, v15, v13

    aput-object v6, v15, v11

    const-string v16, "222"

    aput-object v16, v15, v9

    aput-object v5, v15, v8

    invoke-static {v15}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 6
    iget-object v15, v1, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v15}, Lcom/join/mgps/pref/PrefDef_;->lastShowSplashImage()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v15

    const-string v13, ""

    invoke-virtual {v15, v13}, Lorg/androidannotations/api/sharedpreferences/p;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x0

    .line 7
    :goto_0
    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v10

    const/16 v18, 0x0

    if-ge v15, v10, :cond_c

    .line 8
    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;

    invoke-virtual {v10}, Lcom/join/mgps/db/tables/ShowViewDataBeanTable;->getShowVieDatabean()Lcom/join/mgps/dto/ShowViewDataBean;

    move-result-object v10

    .line 9
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v12

    if-eq v12, v11, :cond_a

    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getBegin_times()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getEnd_times()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v1, v12, v11, v8, v9}, Lcom/join/mgps/activity/SplashActivity;->C(Ljava/lang/String;Ljava/lang/String;J)Z

    move-result v11

    if-nez v11, :cond_1

    goto/16 :goto_5

    .line 10
    :cond_1
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_2

    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getIs_force()Ljava/lang/String;

    move-result-object v11

    const-string v12, "1"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 11
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x0

    invoke-interface {v8, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v18, v8

    check-cast v18, Lcom/join/mgps/dto/SplashIntentBean;

    move-object/from16 v9, v18

    const/4 v8, 0x1

    goto/16 :goto_7

    .line 12
    :cond_2
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_a

    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_3

    goto/16 :goto_5

    .line 13
    :cond_3
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    move-wide/from16 v19, v8

    const/4 v12, 0x5

    new-array v8, v12, [Ljava/lang/String;

    const/4 v9, 0x0

    aput-object v7, v8, v9

    .line 14
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x1

    aput-object v9, v8, v12

    const/4 v9, 0x2

    aput-object v6, v8, v9

    const-string v9, "222 - bbb"

    const/4 v12, 0x3

    aput-object v9, v8, v12

    const/4 v9, 0x4

    aput-object v5, v8, v9

    move v12, v15

    invoke-static {v8}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 15
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getJump_info()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object/from16 v9, v18

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v15, v17

    check-cast v15, Lcom/join/mgps/dto/SplashIntentBean;

    move-object/from16 v17, v8

    .line 16
    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getTag_show()I

    move-result v8

    move-object/from16 v21, v10

    const/4 v10, 0x2

    if-ne v8, v10, :cond_4

    goto :goto_2

    .line 17
    :cond_4
    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url_local()Ljava/lang/String;

    move-result-object v8

    invoke-static {v13, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_6

    invoke-virtual {v15}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote_local()Ljava/lang/String;

    move-result-object v8

    invoke-static {v13, v8}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    goto :goto_3

    .line 18
    :cond_5
    invoke-interface {v11, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    move-object/from16 v8, v17

    move-object/from16 v10, v21

    goto :goto_1

    :cond_6
    :goto_3
    move-object v9, v15

    goto :goto_2

    :cond_7
    move-object/from16 v21, v10

    .line 19
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_8

    if-eqz v9, :cond_8

    .line 20
    invoke-interface {v11, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    const/4 v8, 0x5

    new-array v9, v8, [Ljava/lang/String;

    const/4 v8, 0x0

    aput-object v7, v9, v8

    .line 21
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    const/4 v10, 0x1

    aput-object v8, v9, v10

    const/4 v8, 0x2

    aput-object v6, v9, v8

    const-string v8, "222 - ccc"

    const/4 v10, 0x3

    aput-object v8, v9, v10

    const/4 v8, 0x4

    aput-object v5, v9, v8

    invoke-static {v9}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 22
    invoke-interface {v11}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_b

    .line 23
    new-instance v8, Ljava/util/Random;

    invoke-direct {v8}, Ljava/util/Random;-><init>()V

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v9

    invoke-virtual {v8, v9}, Ljava/util/Random;->nextInt(I)I

    move-result v8

    .line 24
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/join/mgps/dto/SplashIntentBean;

    const/4 v10, 0x1

    add-int/2addr v8, v10

    .line 25
    invoke-virtual {v9, v8}, Lcom/join/mgps/dto/SplashIntentBean;->setShowPosition(I)V

    .line 26
    invoke-virtual {v9}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url_local()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_9

    .line 27
    iget-object v8, v1, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v8}, Lcom/join/mgps/pref/PrefDef_;->lastShowSplashImage()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v8

    invoke-virtual {v9}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url_local()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto :goto_4

    .line 28
    :cond_9
    iget-object v8, v1, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v8}, Lcom/join/mgps/pref/PrefDef_;->lastShowSplashImage()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v8

    invoke-virtual {v9}, Lcom/join/mgps/dto/SplashIntentBean;->getPic_remote_local()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    :goto_4
    move-object/from16 v10, v21

    goto :goto_6

    :cond_a
    :goto_5
    move-wide/from16 v19, v8

    move v12, v15

    :cond_b
    add-int/lit8 v8, v12, 0x1

    move v15, v8

    move-wide/from16 v8, v19

    const/4 v11, 0x2

    const/4 v12, 0x0

    goto/16 :goto_0

    :cond_c
    move-object/from16 v9, v18

    move-object v10, v9

    :goto_6
    const/4 v8, 0x0

    :goto_7
    const/4 v11, 0x5

    new-array v12, v11, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object v7, v12, v11

    .line 29
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v11

    const/4 v13, 0x1

    aput-object v11, v12, v13

    const/4 v11, 0x2

    aput-object v6, v12, v11

    const-string v11, "333"

    const/4 v13, 0x3

    aput-object v11, v12, v13

    const/4 v11, 0x4

    aput-object v5, v12, v11

    invoke-static {v12}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v11, "after"

    if-eqz v8, :cond_10

    if-nez v9, :cond_d

    return-void

    .line 30
    :cond_d
    :try_start_1
    invoke-virtual {v9}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_e

    const/4 v3, 0x5

    new-array v2, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    .line 31
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v6, v2, v3

    const/4 v3, 0x3

    aput-object v0, v2, v3

    const/4 v3, 0x4

    aput-object v5, v2, v3

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 32
    invoke-virtual {v1, v10, v9}, Lcom/join/mgps/activity/SplashActivity;->X(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    const/4 v2, 0x5

    new-array v3, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v3, v2

    .line 33
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v6, v3, v2

    const/4 v2, 0x3

    aput-object v0, v3, v2

    const/4 v2, 0x4

    aput-object v11, v3, v2

    invoke-static {v3}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    goto :goto_8

    :cond_e
    const/4 v3, 0x5

    new-array v0, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v7, v0, v3

    .line 34
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const/4 v3, 0x2

    aput-object v6, v0, v3

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v3, 0x4

    aput-object v5, v0, v3

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 35
    invoke-virtual {v1, v10, v9}, Lcom/join/mgps/activity/SplashActivity;->V(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    const/4 v3, 0x5

    new-array v0, v3, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v7, v0, v3

    .line 36
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const/4 v3, 0x2

    aput-object v6, v0, v3

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v2, 0x4

    aput-object v11, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 37
    :goto_8
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v0

    if-nez v0, :cond_f

    const/4 v2, 0x2

    .line 38
    invoke-virtual {v10, v2}, Lcom/join/mgps/dto/ShowViewDataBean;->setTag_show(I)V

    .line 39
    invoke-direct {v1, v10}, Lcom/join/mgps/activity/SplashActivity;->T(Lcom/join/mgps/dto/ShowViewDataBean;)V

    .line 40
    invoke-direct/range {p0 .. p0}, Lcom/join/mgps/activity/SplashActivity;->D()Z

    move-result v0

    .line 41
    iget-object v2, v1, Lcom/join/mgps/activity/SplashActivity;->g:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v2}, Lcom/join/mgps/pref/PrefDef_;->isShowSplash()Lorg/androidannotations/api/sharedpreferences/d;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    goto/16 :goto_a

    .line 42
    :cond_f
    invoke-virtual {v10}, Lcom/join/mgps/dto/ShowViewDataBean;->getTag_show()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_13

    .line 43
    invoke-direct {v1, v10}, Lcom/join/mgps/activity/SplashActivity;->T(Lcom/join/mgps/dto/ShowViewDataBean;)V

    goto/16 :goto_a

    :cond_10
    if-eqz v10, :cond_12

    .line 44
    invoke-virtual {v9}, Lcom/join/mgps/dto/SplashIntentBean;->getVedio_url()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_11

    const/4 v2, 0x5

    new-array v0, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 45
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v0, v4

    const/4 v2, 0x2

    aput-object v6, v0, v2

    const/4 v2, 0x3

    aput-object v3, v0, v2

    const/4 v2, 0x4

    aput-object v5, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 46
    invoke-virtual {v1, v10, v9}, Lcom/join/mgps/activity/SplashActivity;->X(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    const/4 v2, 0x5

    new-array v0, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 47
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v0, v4

    const/4 v2, 0x2

    aput-object v6, v0, v2

    const/4 v2, 0x3

    aput-object v3, v0, v2

    const/4 v2, 0x4

    aput-object v11, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    goto :goto_9

    :cond_11
    const/4 v2, 0x5

    new-array v0, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 48
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    aput-object v6, v0, v2

    const/4 v2, 0x3

    aput-object v4, v0, v2

    const/4 v2, 0x4

    aput-object v5, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 49
    invoke-virtual {v1, v10, v9}, Lcom/join/mgps/activity/SplashActivity;->V(Lcom/join/mgps/dto/ShowViewDataBean;Lcom/join/mgps/dto/SplashIntentBean;)V

    const/4 v2, 0x5

    new-array v0, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 50
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    aput-object v6, v0, v2

    const/4 v2, 0x3

    aput-object v4, v0, v2

    const/4 v2, 0x4

    aput-object v11, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    .line 51
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v9, v2, v3}, Lcom/join/mgps/dto/SplashIntentBean;->setShow_time(J)V

    .line 52
    invoke-direct {v1, v10}, Lcom/join/mgps/activity/SplashActivity;->T(Lcom/join/mgps/dto/ShowViewDataBean;)V

    goto :goto_a

    .line 53
    :cond_12
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V

    :cond_13
    :goto_a
    const/4 v2, 0x5

    new-array v0, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v7, v0, v2

    .line 54
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v0, v3

    const/4 v2, 0x2

    aput-object v6, v0, v2

    const-string v2, "444"

    const/4 v3, 0x3

    aput-object v2, v0, v3

    const/4 v2, 0x4

    aput-object v5, v0, v2

    invoke-static {v0}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    goto :goto_c

    .line 55
    :cond_14
    :goto_b
    invoke-virtual/range {p0 .. p0}, Landroid/app/Activity;->finish()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    const/4 v2, 0x6

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v7, v2, v3

    .line 57
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object v6, v2, v3

    const-string v3, "555"

    const/4 v4, 0x3

    aput-object v3, v2, v4

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x4

    aput-object v0, v2, v3

    const/4 v3, 0x5

    aput-object v5, v2, v3

    invoke-static {v2}, Lcom/join/mgps/Util/w0;->e([Ljava/lang/String;)V

    :goto_c
    return-void
.end method
