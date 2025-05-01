.class Lcom/beizi/fusion/work/splash/l$5;
.super Ljava/lang/Object;
.source "MtgSplashWorker.java"

# interfaces
.implements Lcom/mbridge/msdk/mbbid/out/BidListennning;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/l;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/l;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailed(Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bid onFailed showMtgSplash onError:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/work/a;->a(I)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->F(Lcom/beizi/fusion/work/splash/l;)V

    return-void
.end method

.method public onSuccessed(Lcom/mbridge/msdk/mbbid/out/BidResponsed;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/l;->a(Lcom/beizi/fusion/work/splash/l;Lcom/mbridge/msdk/mbbid/out/BidResponsed;)Lcom/mbridge/msdk/mbbid/out/BidResponsed;

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {p1}, Lcom/mbridge/msdk/mbbid/out/BidResponsed;->getBidToken()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/splash/l;->a(Lcom/beizi/fusion/work/splash/l;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onSuccessed: token "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/l;->G(Lcom/beizi/fusion/work/splash/l;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ",mbSplashHandler != null ? "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/l;->H(Lcom/beizi/fusion/work/splash/l;)Lcom/mbridge/msdk/out/MBSplashHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZis"

    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$5;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->I(Lcom/beizi/fusion/work/splash/l;)V

    return-void
.end method
