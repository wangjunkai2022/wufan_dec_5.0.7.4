.class Lcom/beizi/fusion/work/splash/k$2;
.super Ljava/lang/Object;
.source "KsSplashWorker.java"

# interfaces
.implements Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/k;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/k;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "showKsSplash onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0, p2, p1}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;Ljava/lang/String;I)V

    return-void
.end method

.method public onRequestResult(I)V
    .locals 0

    return-void
.end method

.method public onSplashScreenAdLoad(Lcom/kwad/sdk/api/KsSplashScreenAd;)V
    .locals 2
    .param p1    # Lcom/kwad/sdk/api/KsSplashScreenAd;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    sget-object v1, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;Lcom/kwad/sdk/api/KsSplashScreenAd;)Lcom/kwad/sdk/api/KsSplashScreenAd;

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->b(Lcom/beizi/fusion/work/splash/k;)Lcom/kwad/sdk/api/KsSplashScreenAd;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->b(Lcom/beizi/fusion/work/splash/k;)Lcom/kwad/sdk/api/KsSplashScreenAd;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsSplashScreenAd;->getECPM()I

    move-result v0

    int-to-double v0, v0

    invoke-static {p1, v0, v1}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;D)V

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->c(Lcom/beizi/fusion/work/splash/k;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 7
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->d(Lcom/beizi/fusion/work/splash/k;)V

    goto :goto_0

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/k$2;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/k;->e(Lcom/beizi/fusion/work/splash/k;)V

    :goto_0
    return-void
.end method
