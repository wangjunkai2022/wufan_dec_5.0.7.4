.class Lcom/beizi/fusion/work/splash/d$10;
.super Landroid/os/CountDownTimer;
.source "CsjNSTWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/d;->aL()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:J

.field final synthetic c:Lcom/beizi/fusion/work/splash/d;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/d;JJJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    iput-wide p6, p0, Lcom/beizi/fusion/work/splash/d$10;->b:J

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/d$10;->a:Z

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->N(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->O(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/d;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onTick(J)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/d$10;->a:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->G(Lcom/beizi/fusion/work/splash/d;)V

    .line 3
    iput-boolean v1, p0, Lcom/beizi/fusion/work/splash/d$10;->a:Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->H(Lcom/beizi/fusion/work/splash/d;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    const/4 v0, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_4

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->H(Lcom/beizi/fusion/work/splash/d;)J

    move-result-wide v2

    iget-object v6, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v6}, Lcom/beizi/fusion/work/splash/d;->I(Lcom/beizi/fusion/work/splash/d;)J

    move-result-wide v6

    cmp-long v8, v2, v6

    if-gtz v8, :cond_4

    .line 5
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->J(Lcom/beizi/fusion/work/splash/d;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 6
    iget-wide v2, p0, Lcom/beizi/fusion/work/splash/d$10;->b:J

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    cmp-long v4, p1, v2

    if-lez v4, :cond_1

    .line 7
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2, v1}, Lcom/beizi/fusion/work/splash/d;->a(Lcom/beizi/fusion/work/splash/d;Z)Z

    .line 8
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v2

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 9
    :cond_1
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2, v0}, Lcom/beizi/fusion/work/splash/d;->a(Lcom/beizi/fusion/work/splash/d;Z)Z

    .line 10
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v2, v3}, Landroid/view/View;->setAlpha(F)V

    .line 11
    :cond_2
    :goto_0
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->H(Lcom/beizi/fusion/work/splash/d;)J

    move-result-wide v2

    iget-object v4, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v4}, Lcom/beizi/fusion/work/splash/d;->I(Lcom/beizi/fusion/work/splash/d;)J

    move-result-wide v4

    cmp-long v6, v2, v4

    if-nez v6, :cond_3

    .line 12
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 13
    :cond_3
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 14
    :cond_4
    :goto_1
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->r(Lcom/beizi/fusion/work/splash/d;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_5

    .line 15
    iget-object v2, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v2}, Lcom/beizi/fusion/work/splash/d;->s(Lcom/beizi/fusion/work/splash/d;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/beizi/fusion/widget/SkipView;

    new-array v1, v1, [Ljava/lang/Object;

    long-to-float v3, p1

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v0

    const-string v0, "\u8df3\u8fc7 %d"

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    :cond_5
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->K(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->L(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    .line 17
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/d$10;->c:Lcom/beizi/fusion/work/splash/d;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/d;->M(Lcom/beizi/fusion/work/splash/d;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_6
    return-void
.end method
