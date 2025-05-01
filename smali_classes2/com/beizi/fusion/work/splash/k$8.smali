.class Lcom/beizi/fusion/work/splash/k$8;
.super Landroid/os/CountDownTimer;
.source "KsSplashWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/k;->aL()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:J

.field final synthetic c:Lcom/beizi/fusion/work/splash/k;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/k;JJJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    iput-wide p6, p0, Lcom/beizi/fusion/work/splash/k$8;->b:J

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/k$8;->a:Z

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->N(Lcom/beizi/fusion/work/splash/k;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->O(Lcom/beizi/fusion/work/splash/k;)V

    return-void
.end method

.method public onTick(J)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/k$8;->a:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->E(Lcom/beizi/fusion/work/splash/k;)V

    .line 3
    iput-boolean v1, p0, Lcom/beizi/fusion/work/splash/k$8;->a:Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->F(Lcom/beizi/fusion/work/splash/k;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_4

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->F(Lcom/beizi/fusion/work/splash/k;)J

    move-result-wide v2

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->G(Lcom/beizi/fusion/work/splash/k;)J

    move-result-wide v6

    cmp-long v0, v2, v6

    if-gtz v0, :cond_4

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->H(Lcom/beizi/fusion/work/splash/k;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    .line 6
    iget-wide v6, p0, Lcom/beizi/fusion/work/splash/k$8;->b:J

    cmp-long v0, v6, v4

    if-lez v0, :cond_1

    cmp-long v0, p1, v6

    if-lez v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;Z)Z

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->I(Lcom/beizi/fusion/work/splash/k;)Landroid/view/View;

    move-result-object v0

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/splash/k;->a(Lcom/beizi/fusion/work/splash/k;Z)Z

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->I(Lcom/beizi/fusion/work/splash/k;)Landroid/view/View;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 11
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->F(Lcom/beizi/fusion/work/splash/k;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->G(Lcom/beizi/fusion/work/splash/k;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_3

    .line 12
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->I(Lcom/beizi/fusion/work/splash/k;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 13
    :cond_3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->I(Lcom/beizi/fusion/work/splash/k;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14
    :cond_4
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->J(Lcom/beizi/fusion/work/splash/k;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->I(Lcom/beizi/fusion/work/splash/k;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    long-to-float v1, p1

    const/high16 v2, 0x447a0000    # 1000.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/k;->b(Lcom/beizi/fusion/work/splash/k;I)V

    .line 16
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->K(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->L(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/k$8;->c:Lcom/beizi/fusion/work/splash/k;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/k;->M(Lcom/beizi/fusion/work/splash/k;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_6
    return-void
.end method
