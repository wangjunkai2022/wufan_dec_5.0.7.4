.class Lcom/beizi/fusion/work/splash/l$4;
.super Ljava/lang/Object;
.source "MtgSplashWorker.java"

# interfaces
.implements Lcom/mbridge/msdk/out/MBSplashShowListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/l;->aG()V
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
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/mbridge/msdk/out/MBridgeIds;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->v(Lcom/beizi/fusion/work/splash/l;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->w(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->x(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->y(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/splash/l;->g()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->z(Lcom/beizi/fusion/work/splash/l;)V

    :cond_1
    return-void
.end method

.method public onAdTick(Lcom/mbridge/msdk/out/MBridgeIds;J)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onAdTick: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p2, " "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mbridge/msdk/out/MBridgeIds;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "BeiZis"

    invoke-static {p2, p1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onDismiss(Lcom/mbridge/msdk/out/MBridgeIds;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->A(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->B(Lcom/beizi/fusion/work/splash/l;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->D(Lcom/beizi/fusion/work/splash/l;)Landroid/os/Handler;

    move-result-object p1

    new-instance p2, Lcom/beizi/fusion/work/splash/l$4$1;

    invoke-direct {p2, p0}, Lcom/beizi/fusion/work/splash/l$4$1;-><init>(Lcom/beizi/fusion/work/splash/l$4;)V

    const-wide/16 v0, 0xc8

    invoke-virtual {p1, p2, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->E(Lcom/beizi/fusion/work/splash/l;)V

    return-void
.end method

.method public onShowFailed(Lcom/mbridge/msdk/out/MBridgeIds;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onShowFailed showMtgSplash onError:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    const/16 v0, 0x2794

    invoke-static {p1, p2, v0}, Lcom/beizi/fusion/work/splash/l;->b(Lcom/beizi/fusion/work/splash/l;Ljava/lang/String;I)V

    return-void
.end method

.method public onShowSuccessed(Lcom/mbridge/msdk/out/MBridgeIds;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    sget-object v0, Lcom/beizi/fusion/f/a;->c:Lcom/beizi/fusion/f/a;

    invoke-static {p1, v0}, Lcom/beizi/fusion/work/splash/l;->b(Lcom/beizi/fusion/work/splash/l;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->r(Lcom/beizi/fusion/work/splash/l;)V

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->s(Lcom/beizi/fusion/work/splash/l;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->t(Lcom/beizi/fusion/work/splash/l;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$4;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->u(Lcom/beizi/fusion/work/splash/l;)V

    return-void
.end method

.method public onZoomOutPlayFinish(Lcom/mbridge/msdk/out/MBridgeIds;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onZoomOutPlayFinish: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mbridge/msdk/out/MBridgeIds;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZis"

    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onZoomOutPlayStart(Lcom/mbridge/msdk/out/MBridgeIds;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onZoomOutPlayStart: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mbridge/msdk/out/MBridgeIds;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "BeiZis"

    invoke-static {v0, p1}, Lcom/beizi/fusion/g/af;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
