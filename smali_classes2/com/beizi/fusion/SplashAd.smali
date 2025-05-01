.class public Lcom/beizi/fusion/SplashAd;
.super Ljava/lang/Object;
.source "SplashAd.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/fusion/SplashAd$SplashClickEye;,
        Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;
    }
.end annotation


# instance fields
.field private a:Lcom/beizi/fusion/d/t;

.field private b:Landroid/view/ViewGroup;

.field private c:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Lcom/beizi/fusion/AdListener;J)V
    .locals 9
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/beizi/fusion/SplashAd;->c:Z

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " request SplashAd adUnitId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    new-instance v0, Lcom/beizi/fusion/d/t;

    move-object v2, v0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p2

    move-object v6, p4

    move-wide v7, p5

    invoke-direct/range {v2 .. v8}, Lcom/beizi/fusion/d/t;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;Lcom/beizi/fusion/a;J)V

    iput-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    .line 5
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-direct {p2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/beizi/fusion/SplashAd;->b:Landroid/view/ViewGroup;

    .line 6
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 p3, -0x1

    invoke-direct {p1, p3, p3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public cancel(Landroid/content/Context;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->m()V

    :cond_0
    return-void
.end method

.method public getECPM()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/t;->B()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public loadAd()V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/beizi/fusion/SplashAd;->b:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    :cond_0
    return-void
.end method

.method public loadAd(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/beizi/fusion/SplashAd;->b:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/fusion/d/t;->b(I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/t;->c(I)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    iget-object p2, p0, Lcom/beizi/fusion/SplashAd;->b:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/beizi/fusion/d/e;->a(Landroid/view/ViewGroup;)V

    :cond_0
    return-void
.end method

.method public reportNotShow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/t;->C()V

    :cond_0
    return-void
.end method

.method public setSplashClickEyeListener(Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/fusion/d/g;->a()Lcom/beizi/fusion/d/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/beizi/fusion/d/g;->a(Lcom/beizi/fusion/SplashAd$SplashClickEyeListener;)V

    return-void
.end method

.method public setSupportRegionClick(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/beizi/fusion/d/e;->a(Z)V

    :cond_0
    return-void
.end method

.method public show(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/SplashAd;->c:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/beizi/fusion/SplashAd;->b:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/SplashAd;->a:Lcom/beizi/fusion/d/t;

    invoke-virtual {p1}, Lcom/beizi/fusion/d/t;->A()V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/beizi/fusion/SplashAd;->c:Z

    :cond_1
    return-void
.end method
