.class Lcom/beizi/fusion/work/splash/k$6;
.super Landroid/os/CountDownTimer;
.source "KsSplashWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/k;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/k;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/k;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k$6;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$6;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->C(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$6;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->D(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method

.method public onTick(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$6;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->z(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$6;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->A(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$6;->a:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->B(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_0
    return-void
.end method
