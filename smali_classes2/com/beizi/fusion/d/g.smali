.class public Lcom/beizi/fusion/d/g;
.super Ljava/lang/Object;
.source "ClickEyeManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/d/g$a;
    }
.end annotation


# static fields
.field private static volatile a:Lcom/beizi/fusion/d/g;

.field private static c:Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;


# instance fields
.field private b:Landroid/content/Context;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/d/g;->d:Z

    return-void
.end method

.method public static a()Lcom/beizi/fusion/d/g;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/fusion/d/g;->a:Lcom/beizi/fusion/d/g;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/fusion/d/g;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/fusion/d/g;->a:Lcom/beizi/fusion/d/g;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/fusion/d/g;

    invoke-direct {v1}, Lcom/beizi/fusion/d/g;-><init>()V

    sput-object v1, Lcom/beizi/fusion/d/g;->a:Lcom/beizi/fusion/d/g;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/fusion/d/g;->a:Lcom/beizi/fusion/d/g;

    return-object v0
.end method

.method private a(Landroid/app/Activity;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 23
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/d/g;->b:Landroid/content/Context;

    .line 24
    invoke-static {v0}, Lcom/beizi/fusion/work/splash/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/work/splash/c;

    move-result-object v0

    .line 25
    invoke-virtual {p0}, Lcom/beizi/fusion/d/g;->b()Z

    move-result v1

    if-nez v1, :cond_1

    return-void

    .line 26
    :cond_1
    invoke-direct {p0, p1}, Lcom/beizi/fusion/d/g;->b(Landroid/app/Activity;)Landroid/view/View;

    move-result-object p1

    .line 27
    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/c;->b()Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    move-result-object v0

    .line 28
    new-instance v1, Lcom/beizi/fusion/d/g$a;

    iget-object v2, p0, Lcom/beizi/fusion/d/g;->b:Landroid/content/Context;

    invoke-direct {v1, v2, p1, v0}, Lcom/beizi/fusion/d/g$a;-><init>(Landroid/content/Context;Landroid/view/View;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;)V

    if-eqz v0, :cond_2

    .line 29
    invoke-interface {v0, v1}, Lcom/bytedance/sdk/openadsdk/CSJSplashAd;->setSplashClickEyeListener(Lcom/bytedance/sdk/openadsdk/CSJSplashAd$SplashClickEyeListener;)V

    :cond_2
    return-void
.end method

.method private b(Landroid/app/Activity;)Landroid/view/View;
    .locals 5

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/d/g;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/c;->a(Landroid/content/Context;)Lcom/beizi/fusion/work/splash/c;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/c;->b()Lcom/bytedance/sdk/openadsdk/CSJSplashAd;

    move-result-object v1

    .line 4
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    const v3, 0x1020002

    .line 5
    invoke-virtual {p1, v3}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    new-instance v4, Lcom/beizi/fusion/d/g$1;

    invoke-direct {v4, p0, v1, p1, v0}, Lcom/beizi/fusion/d/g$1;-><init>(Lcom/beizi/fusion/d/g;Lcom/bytedance/sdk/openadsdk/CSJSplashAd;Landroid/app/Activity;Lcom/beizi/fusion/work/splash/c;)V

    .line 6
    invoke-virtual {v0, v2, v3, v4}, Lcom/beizi/fusion/work/splash/c;->a(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Lcom/beizi/fusion/work/splash/c$a;)Landroid/view/ViewGroup;

    move-result-object p1

    return-object p1
.end method

.method static synthetic c()Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/d/g;->c:Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/beizi/fusion/d/g;->b:Landroid/content/Context;

    const-string v1, "2"

    .line 12
    invoke-static {v0, p2, v1}, Lcom/beizi/fusion/c/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 13
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean;->getComponent()Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;

    move-result-object v1

    .line 14
    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean;->getBuyer()Ljava/util/List;

    move-result-object v0

    .line 15
    invoke-static {v1, v0, p2}, Lcom/beizi/fusion/f/b;->a(Lcom/beizi/fusion/model/AdSpacesBean$ComponentBean;Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    .line 16
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_2

    const/4 v1, 0x0

    .line 17
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2

    .line 18
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;

    .line 19
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getBuyerId()Ljava/lang/String;

    move-result-object v3

    .line 20
    invoke-virtual {v2}, Lcom/beizi/fusion/model/AdSpacesBean$ForwardBean;->getBuyerSpaceUuId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v0, v2}, Lcom/beizi/fusion/f/b;->a(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v2, "CSJ"

    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 22
    invoke-direct {p0, p1}, Lcom/beizi/fusion/d/g;->a(Landroid/app/Activity;)V

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public a(Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;)V
    .locals 0

    .line 7
    sput-object p1, Lcom/beizi/fusion/d/g;->c:Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;

    return-void
.end method

.method public a(Ljava/lang/String;ZZ)V
    .locals 0

    .line 8
    iput-boolean p2, p0, Lcom/beizi/fusion/d/g;->d:Z

    .line 9
    sget-object p1, Lcom/beizi/fusion/d/g;->c:Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    .line 10
    invoke-interface {p1, p2}, Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;->isSupportSplashClickEye(Z)V

    :cond_0
    return-void
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/d/g;->d:Z

    return v0
.end method
