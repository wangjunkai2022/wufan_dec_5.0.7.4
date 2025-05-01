.class public final Lcom/kwad/components/core/widget/a;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/utils/bs$a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ViewConstructor"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/widget/a$a;
    }
.end annotation


# instance fields
.field private final Vt:Landroid/view/View;

.field private abP:Lcom/kwad/components/core/widget/a$a;

.field private abQ:Z

.field private abR:Z

.field private abS:I

.field private abT:Z

.field private abU:J

.field private abV:Z

.field private final abW:F

.field private final abX:I

.field private final hh:Lcom/kwad/sdk/utils/bs;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/view/View;)V

    .line 2
    new-instance p1, Lcom/kwad/sdk/utils/bs;

    invoke-direct {p1, p0}, Lcom/kwad/sdk/utils/bs;-><init>(Lcom/kwad/sdk/utils/bs$a;)V

    iput-object p1, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 p1, 0x5

    .line 3
    iput p1, p0, Lcom/kwad/components/core/widget/a;->abS:I

    .line 4
    iput-object p2, p0, Lcom/kwad/components/core/widget/a;->Vt:Landroid/view/View;

    .line 5
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    const/4 p2, 0x1

    invoke-direct {p1, p2, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CV()F

    move-result p1

    iput p1, p0, Lcom/kwad/components/core/widget/a;->abW:F

    .line 7
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;->setVisiblePercent(F)V

    .line 8
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->CW()F

    move-result p1

    const/4 p2, 0x0

    cmpg-float p2, p1, p2

    if-gez p2, :cond_0

    const/high16 p1, 0x3f800000    # 1.0f

    :cond_0
    const/high16 p2, 0x447a0000    # 1000.0f

    mul-float p1, p1, p2

    float-to-int p1, p1

    .line 9
    iput p1, p0, Lcom/kwad/components/core/widget/a;->abX:I

    return-void
.end method

.method private tJ()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/kwad/components/core/widget/a;->abX:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz v0, :cond_0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/core/widget/a;->Vt:Landroid/view/View;

    invoke-interface {v0, v1}, Lcom/kwad/components/core/widget/a$a;->k(Landroid/view/View;)V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    const/4 v1, 0x2

    .line 4
    iput v1, v0, Landroid/os/Message;->what:I

    .line 5
    iget-object v1, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    iget v2, p0, Lcom/kwad/components/core/widget/a;->abX:I

    int-to-long v2, v2

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    return-void
.end method

.method private tK()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abR:Z

    return-void
.end method

.method private tL()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abR:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abR:Z

    .line 3
    iget-object v1, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_0
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/View;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;->A(Landroid/view/View;)V

    .line 2
    iget v0, p0, Lcom/kwad/components/core/widget/a;->abX:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p1}, Lcom/kwad/components/core/widget/a$a;->k(Landroid/view/View;)V

    return-void

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abT:Z

    if-nez v0, :cond_1

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/kwad/components/core/widget/a;->abT:Z

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/widget/a;->abU:J

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tK()V

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tJ()V

    return-void

    .line 9
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/kwad/components/core/widget/a;->abU:J

    sub-long/2addr v0, v2

    iget v2, p0, Lcom/kwad/components/core/widget/a;->abX:I

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_2

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz v0, :cond_2

    .line 11
    invoke-interface {v0, p1}, Lcom/kwad/components/core/widget/a$a;->k(Landroid/view/View;)V

    .line 12
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tK()V

    :cond_2
    return-void
.end method

.method public final a(Landroid/os/Message;)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abQ:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget p1, p1, Landroid/os/Message;->what:I

    const/high16 v0, 0x42c80000    # 100.0f

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p1, v2, :cond_4

    const/4 v3, 0x2

    if-eq p1, v3, :cond_1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->Vt:Landroid/view/View;

    iget v3, p0, Lcom/kwad/components/core/widget/a;->abW:F

    mul-float v3, v3, v0

    float-to-int v0, v3

    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/utils/br;->a(Landroid/view/View;IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz p1, :cond_3

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->Vt:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/kwad/components/core/widget/a$a;->k(Landroid/view/View;)V

    return-void

    :cond_2
    const/4 p1, 0x5

    .line 6
    iput p1, p0, Lcom/kwad/components/core/widget/a;->abS:I

    .line 7
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    invoke-virtual {p1, v2}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    :cond_3
    :goto_0
    return-void

    .line 8
    :cond_4
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->Vt:Landroid/view/View;

    iget v3, p0, Lcom/kwad/components/core/widget/a;->abW:F

    mul-float v3, v3, v0

    float-to-int v0, v3

    invoke-static {p1, v0, v1}, Lcom/kwad/sdk/utils/br;->a(Landroid/view/View;IZ)Z

    move-result p1

    const-wide/16 v3, 0x64

    const-wide/16 v5, 0x1f4

    if-eqz p1, :cond_8

    .line 9
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tK()V

    .line 10
    iget-boolean p1, p0, Lcom/kwad/components/core/widget/a;->abT:Z

    if-eqz p1, :cond_5

    .line 11
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz p1, :cond_6

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->Vt:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/kwad/components/core/widget/a$a;->k(Landroid/view/View;)V

    goto :goto_1

    .line 13
    :cond_5
    iput-boolean v2, p0, Lcom/kwad/components/core/widget/a;->abT:Z

    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iput-wide v7, p0, Lcom/kwad/components/core/widget/a;->abU:J

    .line 15
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tJ()V

    .line 16
    :cond_6
    :goto_1
    iput-boolean v1, p0, Lcom/kwad/components/core/widget/a;->abV:Z

    .line 17
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    .line 18
    iget v0, p0, Lcom/kwad/components/core/widget/a;->abS:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/core/widget/a;->abS:I

    if-lez v0, :cond_7

    goto :goto_2

    :cond_7
    move-wide v3, v5

    .line 19
    :goto_2
    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void

    .line 20
    :cond_8
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz p1, :cond_9

    iget-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abV:Z

    if-nez v0, :cond_9

    .line 21
    invoke-interface {p1}, Lcom/kwad/components/core/widget/a$a;->eq()V

    .line 22
    :cond_9
    iput-boolean v2, p0, Lcom/kwad/components/core/widget/a;->abV:Z

    .line 23
    iget-object p1, p0, Lcom/kwad/components/core/widget/a;->hh:Lcom/kwad/sdk/utils/bs;

    .line 24
    iget v0, p0, Lcom/kwad/components/core/widget/a;->abS:I

    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Lcom/kwad/components/core/widget/a;->abS:I

    if-lez v0, :cond_a

    goto :goto_3

    :cond_a
    move-wide v3, v5

    .line 25
    :goto_3
    invoke-virtual {p1, v2, v3, v4}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public final ac()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ac()V

    const/4 v0, 0x5

    .line 2
    iput v0, p0, Lcom/kwad/components/core/widget/a;->abS:I

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abQ:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abT:Z

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tL()V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {v0}, Lcom/kwad/components/core/widget/a$a;->ac()V

    :cond_0
    return-void
.end method

.method public final ad()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/widget/KSFrameLayout;->ad()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tK()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/kwad/components/core/widget/a;->abS:I

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/core/widget/a;->abU:J

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/core/widget/a;->abQ:Z

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    if-eqz v0, :cond_0

    .line 7
    invoke-interface {v0}, Lcom/kwad/components/core/widget/a$a;->ad()V

    :cond_0
    return-void
.end method

.method public final onWindowFocusChanged(Z)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;->onWindowFocusChanged(Z)V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "onWindowFocusChanged hasWindowFocus:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "AdExposureView"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final setViewCallback(Lcom/kwad/components/core/widget/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/a;->abP:Lcom/kwad/components/core/widget/a$a;

    return-void
.end method

.method public final tM()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/widget/a;->tL()V

    return-void
.end method
