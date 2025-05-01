.class public final Lcom/aggmoread/sdk/b/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    invoke-direct {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;
    .locals 3

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Landroid/app/Activity;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Landroid/content/Context;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/b/e;->a(Lcom/aggmoread/sdk/client/AMAdType;)Lcom/aggmoread/sdk/z/c/a/a/c/i;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/i;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object v0, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adSize:Lcom/aggmoread/sdk/client/AMAdSize;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/h;

    iget-object v1, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adSize:Lcom/aggmoread/sdk/client/AMAdSize;

    iget v2, v1, Lcom/aggmoread/sdk/client/AMAdSize;->adWidth:I

    iget v1, v1, Lcom/aggmoread/sdk/client/AMAdSize;->adHeight:I

    invoke-direct {v0, v2, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/h;-><init>(II)V

    invoke-interface {p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/h;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    :cond_1
    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->EXPRESS_INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

    if-ne p2, v0, :cond_2

    const-string p2, "1"

    :goto_1
    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    goto :goto_2

    :cond_2
    sget-object v0, Lcom/aggmoread/sdk/client/AMAdType;->INFORMATION_FLOW:Lcom/aggmoread/sdk/client/AMAdType;

    if-ne p2, v0, :cond_3

    const-string p2, "2"

    goto :goto_1

    :cond_3
    :goto_2
    iget-object p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->bidToken:Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->c(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adSlotId:Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->b(Ljava/lang/String;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adCount:I

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->b(I)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->adContainer:Landroid/view/ViewGroup;

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Landroid/view/ViewGroup;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->videoConfigs:Lcom/aggmoread/sdk/client/AMVideoConfigs;

    if-eqz p2, :cond_4

    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/b/e;->a(Lcom/aggmoread/sdk/client/AMVideoConfigs;)Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/t/b;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    :cond_4
    iget-object p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->rewardAdConfig:Lcom/aggmoread/sdk/client/AMRewardAdConfig;

    if-eqz p2, :cond_5

    invoke-direct {p0, p2}, Lcom/aggmoread/sdk/b/e;->a(Lcom/aggmoread/sdk/client/AMRewardAdConfig;)Lcom/aggmoread/sdk/z/c/a/a/c/r/c;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/r/c;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    :cond_5
    iget p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->fetchTimeOut:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_6

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(I)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    :cond_6
    iget p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->refreshTime:I

    if-eq p2, v0, :cond_7

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->d(I)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    :cond_7
    iget p2, p3, Lcom/aggmoread/sdk/client/AMAdLoadSlot;->limitTime:I

    if-eq p2, v0, :cond_8

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->c(I)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    :cond_8
    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/b/e;Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/aggmoread/sdk/b/e;->a(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    move-result-object p0

    return-object p0
.end method

.method private a(Lcom/aggmoread/sdk/client/AMAdType;)Lcom/aggmoread/sdk/z/c/a/a/c/i;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/b/e$d;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->c:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_0
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->i:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_1
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->d:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_2
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->j:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_3
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->f:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_4
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->h:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_5
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->e:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    :pswitch_6
    sget-object p1, Lcom/aggmoread/sdk/z/c/a/a/c/i;->g:Lcom/aggmoread/sdk/z/c/a/a/c/i;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/aggmoread/sdk/client/AMRewardAdConfig;)Lcom/aggmoread/sdk/z/c/a/a/c/r/c;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;-><init>()V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->getRewardName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->getRewardAmount()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->a(I)V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->getUserID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMRewardAdConfig;->getCustomData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->a(Ljava/lang/String;)V

    new-instance v1, Lcom/aggmoread/sdk/b/e$c;

    invoke-direct {v1, p0, p1}, Lcom/aggmoread/sdk/b/e$c;-><init>(Lcom/aggmoread/sdk/b/e;Lcom/aggmoread/sdk/client/AMRewardAdConfig;)V

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->a(Lcom/aggmoread/sdk/z/c/a/a/c/b;)V

    return-object v0
.end method

.method private a(Lcom/aggmoread/sdk/client/AMVideoConfigs;)Lcom/aggmoread/sdk/z/c/a/a/c/t/b;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;-><init>()V

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isDetailPageMuted()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->b(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isAutoPlayMuted()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->getAutoPlayPolicy()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a(I)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isEnableUserControl()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->d(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isNeedCoverImage()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->e(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isNeedProgressBar()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->f(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {p1}, Lcom/aggmoread/sdk/client/AMVideoConfigs;->isEnableDetailPage()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->c(Z)Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/c/t/b$b;->a()Lcom/aggmoread/sdk/z/c/a/a/c/t/b;

    move-result-object p1

    return-object p1
.end method

.method static synthetic a(Lcom/aggmoread/sdk/b/e;)Lcom/aggmoread/sdk/z/c/a/a/d/b/g;
    .locals 0

    iget-object p0, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    return-object p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/aggmoread/sdk/client/AMAdType;",
            "Lcom/aggmoread/sdk/client/AMAdLoadSlot;",
            "Lcom/aggmoread/sdk/client/IAMAdLoadListener<",
            "*>;)V"
        }
    .end annotation

    if-nez p3, :cond_1

    if-eqz p4, :cond_0

    new-instance p1, Lcom/aggmoread/sdk/client/AMError;

    const/16 p2, 0x2710

    const-string p3, "\u5e7f\u544a\u8bf7\u6c42\u914d\u7f6e\u4e3a\u7a7a\uff0c\u5e7f\u544a\u8bf7\u6c42\u5931\u8d25!"

    invoke-direct {p1, p2, p3}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {p4, p1}, Lcom/aggmoread/sdk/client/IAMAdLoadListener;->onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/aggmoread/sdk/b/e;->a(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    move-result-object p1

    new-instance p3, Lcom/aggmoread/sdk/b/d;

    invoke-direct {p3, p2}, Lcom/aggmoread/sdk/b/d;-><init>(Lcom/aggmoread/sdk/client/AMAdType;)V

    invoke-virtual {p3, p4}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    invoke-virtual {p3}, Lcom/aggmoread/sdk/b/d;->a()Lcom/aggmoread/sdk/z/c/a/a/c/f;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/f;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object p2, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a()Lcom/aggmoread/sdk/z/c/a/a/c/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/c/g;)V

    return-void
.end method

.method public a(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;Lcom/aggmoread/sdk/client/IAMAdLoadListener;Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/aggmoread/sdk/client/AMAdType;",
            "Lcom/aggmoread/sdk/client/AMAdLoadSlot;",
            "Lcom/aggmoread/sdk/client/IAMAdLoadListener<",
            "*>;",
            "Lcom/aggmoread/sdk/client/IAMAdInteractionListener;",
            ")V"
        }
    .end annotation

    if-nez p3, :cond_1

    if-eqz p4, :cond_0

    new-instance p1, Lcom/aggmoread/sdk/client/AMError;

    const/16 p2, 0x2710

    const-string p3, "\u5e7f\u544a\u8bf7\u6c42\u914d\u7f6e\u4e3a\u7a7a\uff0c\u5e7f\u544a\u8bf7\u6c42\u5931\u8d25!"

    invoke-direct {p1, p2, p3}, Lcom/aggmoread/sdk/client/AMError;-><init>(ILjava/lang/String;)V

    invoke-interface {p4, p1}, Lcom/aggmoread/sdk/client/IAMAdLoadListener;->onAdLoadFail(Lcom/aggmoread/sdk/client/AMError;)V

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/aggmoread/sdk/b/e;->a(Landroid/content/Context;Lcom/aggmoread/sdk/client/AMAdType;Lcom/aggmoread/sdk/client/AMAdLoadSlot;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    move-result-object p1

    new-instance p3, Lcom/aggmoread/sdk/b/d;

    invoke-direct {p3, p2}, Lcom/aggmoread/sdk/b/d;-><init>(Lcom/aggmoread/sdk/client/AMAdType;)V

    const/4 p2, 0x0

    invoke-virtual {p3, p2}, Lcom/aggmoread/sdk/b/d;->a(Z)V

    invoke-virtual {p3, p4}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/client/IAMAdLoadListener;)V

    invoke-virtual {p3, p5}, Lcom/aggmoread/sdk/b/d;->a(Lcom/aggmoread/sdk/client/IAMAdInteractionListener;)V

    invoke-virtual {p3}, Lcom/aggmoread/sdk/b/d;->a()Lcom/aggmoread/sdk/z/c/a/a/c/f;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a(Lcom/aggmoread/sdk/z/c/a/a/c/f;)Lcom/aggmoread/sdk/z/c/a/a/c/g$a;

    iget-object p2, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/c/a/a/c/g$a;->a()Lcom/aggmoread/sdk/z/c/a/a/c/g;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Lcom/aggmoread/sdk/z/c/a/a/c/g;)V

    return-void
.end method

.method public a(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/aggmoread/sdk/client/AMChannelIdInfo;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_1

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/aggmoread/sdk/b/e$b;

    invoke-direct {v0, p0, p2, p1}, Lcom/aggmoread/sdk/b/e$b;-><init>(Lcom/aggmoread/sdk/b/e;Ljava/util/List;Landroid/content/Context;)V

    invoke-static {v0}, Lcom/aggmoread/sdk/z/c/a/a/e/n;->b(Ljava/lang/Runnable;)Z

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/client/AMAdConfig;)V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;-><init>()V

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/aggmoread/sdk/client/AMAdConfig;->getCustomController()Lcom/aggmoread/sdk/client/AMCustomController;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/aggmoread/sdk/b/e$a;

    invoke-direct {v2, p0, v1}, Lcom/aggmoread/sdk/b/e$a;-><init>(Lcom/aggmoread/sdk/b/e;Lcom/aggmoread/sdk/client/AMCustomController;)V

    invoke-virtual {v0, v2}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->a(Lcom/aggmoread/sdk/z/c/a/a/c/j;)Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;

    :cond_0
    iget-object v1, p0, Lcom/aggmoread/sdk/b/e;->a:Lcom/aggmoread/sdk/z/c/a/a/d/b/g;

    invoke-virtual {v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->a()Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    move-result-object v0

    invoke-virtual {v1, p1, v0}, Lcom/aggmoread/sdk/z/c/a/a/d/b/g;->a(Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/z/c/a/a/d/b/h;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreePrivacyRecommend()I

    move-result p1

    sget-object v0, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ap = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/a/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p1, v0, :cond_2

    if-ne p1, v1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/n;->a(Z)V

    :cond_2
    invoke-virtual {p2}, Lcom/aggmoread/sdk/client/AMAdConfig;->isAgreeShake()I

    move-result p1

    sget-object p2, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "as = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lcom/aggmoread/sdk/z/a/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eq p1, v0, :cond_5

    if-eqz p1, :cond_4

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/aggmoread/sdk/t;->SDK_TAG:Ljava/lang/String;

    const-string p2, "shakable not valid,only 0 Or 1"

    invoke-static {p1, p2}, Lcom/aggmoread/sdk/z/a/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    :goto_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/aggmoread/sdk/z/c/a/a/d/a/d/n;->a(Ljava/lang/String;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public a(Lcom/aggmoread/sdk/client/AMAdConfig;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/aggmoread/sdk/b/e;->a(Landroid/os/Handler$Callback;Lcom/aggmoread/sdk/client/AMAdConfig;)V

    return-void
.end method
