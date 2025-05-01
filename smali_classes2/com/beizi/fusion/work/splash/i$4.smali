.class Lcom/beizi/fusion/work/splash/i$4;
.super Landroid/os/CountDownTimer;
.source "InmobiSplashWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/splash/i;->aI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/beizi/fusion/work/splash/i;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/splash/i;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/splash/i$4;->a:Z

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->z(Lcom/beizi/fusion/work/splash/i;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->A(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/splash/i;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onTick(J)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/beizi/fusion/work/splash/i$4;->a:Z

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->o(Lcom/beizi/fusion/work/splash/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->n(Lcom/beizi/fusion/work/splash/i;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-static {v2}, Lcom/beizi/fusion/g/m;->a(Landroid/view/View;)Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/splash/i;->a(Lcom/beizi/fusion/work/splash/i;Ljava/util/List;)Ljava/util/List;

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->p(Lcom/beizi/fusion/work/splash/i;)V

    .line 5
    iput-boolean v1, p0, Lcom/beizi/fusion/work/splash/i$4;->a:Z

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->o(Lcom/beizi/fusion/work/splash/i;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->q(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v0, v3, v5

    if-lez v0, :cond_5

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->q(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->r(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v7

    cmp-long v0, v3, v7

    if-gtz v0, :cond_5

    .line 8
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->s(Lcom/beizi/fusion/work/splash/i;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->t(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v3

    cmp-long v0, v3, v5

    if-lez v0, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->t(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v3

    cmp-long v0, p1, v3

    if-lez v0, :cond_2

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0, v1}, Lcom/beizi/fusion/work/splash/i;->a(Lcom/beizi/fusion/work/splash/i;Z)Z

    .line 11
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v0

    const v3, 0x3e4ccccd    # 0.2f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0, v2}, Lcom/beizi/fusion/work/splash/i;->a(Lcom/beizi/fusion/work/splash/i;Z)Z

    .line 13
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 14
    :cond_3
    :goto_0
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->q(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->r(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_4

    .line 15
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_1

    .line 16
    :cond_4
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    :cond_5
    :goto_1
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    long-to-float v3, p1

    const/high16 v4, 0x447a0000    # 1000.0f

    div-float/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    invoke-static {v0, v3}, Lcom/beizi/fusion/work/splash/i;->b(Lcom/beizi/fusion/work/splash/i;I)V

    .line 18
    :cond_6
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->v(Lcom/beizi/fusion/work/splash/i;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 19
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->q(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v3

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->r(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v5

    cmp-long v0, v3, v5

    if-nez v0, :cond_7

    .line 20
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_2

    .line 21
    :cond_7
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    :cond_8
    :goto_2
    const-wide/16 v3, 0x5

    mul-long v3, v3, p1

    .line 22
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->r(Lcom/beizi/fusion/work/splash/i;)J

    move-result-wide v5

    div-long/2addr v3, v5

    long-to-int v0, v3

    .line 23
    iget-object v3, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v3}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object v3

    instance-of v3, v3, Lcom/beizi/fusion/widget/SkipView;

    if-eqz v3, :cond_9

    .line 24
    iget-object p1, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {p1}, Lcom/beizi/fusion/work/splash/i;->u(Lcom/beizi/fusion/work/splash/i;)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/beizi/fusion/widget/SkipView;

    new-array p2, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v2

    const-string v0, "\u8df3\u8fc7 %d"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    .line 25
    :cond_9
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->w(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->x(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_a

    .line 26
    iget-object v0, p0, Lcom/beizi/fusion/work/splash/i$4;->b:Lcom/beizi/fusion/work/splash/i;

    invoke-static {v0}, Lcom/beizi/fusion/work/splash/i;->y(Lcom/beizi/fusion/work/splash/i;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/beizi/fusion/d/e;->a(J)V

    :cond_a
    :goto_3
    return-void
.end method
