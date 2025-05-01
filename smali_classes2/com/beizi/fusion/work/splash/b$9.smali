.class Lcom/beizi/fusion/work/splash/b$9;
.super Ljava/lang/Object;
.source "BeiZiSplashWorker.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/b;->aM()Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/b$9;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/b$9;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/b$9;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/b;->a(Lcom/beizi/fusion/work/splash/b;)Lcom/beizi/ad/SplashAd;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/ad/SplashAd;->closeAd()V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/b$9;->a:Lcom/beizi/fusion/work/splash/b;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/b;->ac(Lcom/beizi/fusion/work/splash/b;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
