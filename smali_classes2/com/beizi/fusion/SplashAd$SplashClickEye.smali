.class public Lcom/beizi/fusion/SplashAd$SplashClickEye;
.super Ljava/lang/Object;
.source "SplashAd.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/fusion/SplashAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SplashClickEye"
.end annotation


# direct methods
.method public constructor <init>(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {}, Lcom/beizi/fusion/d/g;->a()Lcom/beizi/fusion/d/g;

    move-result-object v0

    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/g;->a(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method
