.class Lcom/beizi/fusion/work/splash/e$5;
.super Landroid/os/CountDownTimer;
.source "CsjSplashWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/e;->aG()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/e;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/e;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/e$5;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$5;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->z(Lcom/beizi/fusion/work/splash/e;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$5;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->A(Lcom/beizi/fusion/work/splash/e;)V

    return-void
.end method

.method public onTick(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$5;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->w(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$5;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->x(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/e$5;->a:Lcom/beizi/fusion/work/splash/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/e;->y(Lcom/beizi/fusion/work/splash/e;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_0
    return-void
.end method
