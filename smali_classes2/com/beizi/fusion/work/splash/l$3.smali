.class Lcom/beizi/fusion/work/splash/l$3;
.super Ljava/lang/Object;
.source "MtgSplashWorker.java"

# interfaces
.implements Lcom/mbridge/msdk/out/MBSplashLoadListener;


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
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isSupportZoomOut(Lcom/mbridge/msdk/out/MBridgeIds;Z)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "isSupportZoomOut: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p2, " ids"

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

.method public onLoadFailed(Lcom/mbridge/msdk/out/MBridgeIds;Ljava/lang/String;I)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "onLoadFailed showMtgSplash onError:"

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    const/16 p3, 0x2794

    invoke-static {p1, p2, p3}, Lcom/beizi/fusion/work/splash/l;->a(Lcom/beizi/fusion/work/splash/l;Ljava/lang/String;I)V

    return-void
.end method

.method public onLoadSuccessed(Lcom/mbridge/msdk/out/MBridgeIds;I)V
    .locals 4

    .line 1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "showMtgSplash req to load time = "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-object p2, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p2}, Lcom/beizi/fusion/work/splash/l;->l(Lcom/beizi/fusion/work/splash/l;)J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "BeiZis"

    invoke-static {p2, p1}, Lcom/beizi/fusion/g/af;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    sget-object p2, Lcom/beizi/fusion/f/a;->b:Lcom/beizi/fusion/f/a;

    invoke-static {p1, p2}, Lcom/beizi/fusion/work/splash/l;->a(Lcom/beizi/fusion/work/splash/l;Lcom/beizi/fusion/f/a;)Lcom/beizi/fusion/f/a;

    .line 3
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->m(Lcom/beizi/fusion/work/splash/l;)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->n(Lcom/beizi/fusion/work/splash/l;)V

    .line 5
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->o(Lcom/beizi/fusion/work/splash/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->p(Lcom/beizi/fusion/work/splash/l;)V

    goto :goto_0

    .line 7
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/l$3;->a:Lcom/beizi/fusion/work/splash/l;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/l;->q(Lcom/beizi/fusion/work/splash/l;)V

    :goto_0
    return-void
.end method
