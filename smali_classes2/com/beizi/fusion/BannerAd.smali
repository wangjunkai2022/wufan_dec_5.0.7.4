.class public Lcom/beizi/fusion/BannerAd;
.super Ljava/lang/Object;
.source "BannerAd.java"


# instance fields
.field private a:Lcom/beizi/fusion/d/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/BannerAdListener;J)V
    .locals 8

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " request BannerAd adUnitId:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3
    new-instance v0, Lcom/beizi/fusion/d/d;

    move-object v2, v0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v6, p4

    invoke-direct/range {v2 .. v7}, Lcom/beizi/fusion/d/d;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/fusion/a;J)V

    iput-object v0, p0, Lcom/beizi/fusion/BannerAd;->a:Lcom/beizi/fusion/d/d;

    return-void
.end method


# virtual methods
.method public destroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/BannerAd;->a:Lcom/beizi/fusion/d/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/d;->c()V

    :cond_0
    return-void
.end method

.method public getECPM()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/BannerAd;->a:Lcom/beizi/fusion/d/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/beizi/fusion/d/d;->b()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x1

    return v0
.end method

.method public loadAd(FFLandroid/view/ViewGroup;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/BannerAd;->a:Lcom/beizi/fusion/d/d;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Lcom/beizi/fusion/d/d;->a(FFLandroid/view/ViewGroup;)V

    :cond_0
    return-void
.end method
