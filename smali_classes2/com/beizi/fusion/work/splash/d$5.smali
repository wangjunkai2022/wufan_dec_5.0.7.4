.class Lcom/beizi/fusion/work/splash/d$5;
.super Landroid/os/CountDownTimer;
.source "CsjNSTWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/d;->aG()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/splash/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/d;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->w(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->x(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->y(Lcom/beizi/fusion/work/splash/d;)V

    return-void
.end method

.method public onTick(J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->r(Lcom/beizi/fusion/work/splash/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    long-to-float v1, p1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/d;->c(Lcom/beizi/fusion/work/splash/d;I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->t(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->u(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$5;->a:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->v(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_1
    return-void
.end method
