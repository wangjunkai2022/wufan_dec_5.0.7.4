.class public Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;
.super Lcom/kwad/sdk/widget/KSFrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;
    }
.end annotation


# instance fields
.field private Bi:Ljava/lang/String;

.field private Bj:Ljava/lang/String;

.field private Bk:Landroid/widget/ProgressBar;

.field private Bl:Landroid/widget/TextView;

.field private Bm:Landroid/widget/ImageView;

.field private Bn:J

.field private Bo:J

.field private Bp:Z

.field private Bq:Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;

.field private sB:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;)V

    const-string p1, " \u79d2\u540e\u5373\u53ef\u83b7\u5f97\u5956\u52b1"

    .line 2
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bi:Ljava/lang/String;

    const-string p1, "\u606d\u559c\u4f60\u83b7\u5f97\u5956\u52b1"

    .line 3
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bj:Ljava/lang/String;

    const-wide/16 v0, -0x1

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bn:J

    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, " \u79d2\u540e\u5373\u53ef\u83b7\u5f97\u5956\u52b1"

    .line 7
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bi:Ljava/lang/String;

    const-string p1, "\u606d\u559c\u4f60\u83b7\u5f97\u5956\u52b1"

    .line 8
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bj:Ljava/lang/String;

    const-wide/16 p1, -0x1

    .line 9
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bn:J

    const/4 p1, 0x0

    .line 10
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 11
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/sdk/widget/KSFrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const-string p1, " \u79d2\u540e\u5373\u53ef\u83b7\u5f97\u5956\u52b1"

    .line 12
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bi:Ljava/lang/String;

    const-string p1, "\u606d\u559c\u4f60\u83b7\u5f97\u5956\u52b1"

    .line 13
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bj:Ljava/lang/String;

    const-wide/16 p1, -0x1

    .line 14
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bn:J

    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    return-void
.end method

.method private e(JJ)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bk:Landroid/widget/ProgressBar;

    sub-long/2addr p3, p1

    long-to-int p1, p3

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void
.end method

.method private e(ZZ)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    iget-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    const/4 p2, 0x0

    if-nez p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->sB:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bl:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bj:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bq:Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;

    if-eqz p1, :cond_1

    .line 5
    invoke-interface {p1, p2}, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;->G(Z)V

    goto :goto_0

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->sB:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    return-void
.end method


# virtual methods
.method public final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/sdk/widget/KSFrameLayout;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lcom/kwad/sdk/R$layout;->ksad_activity_preview_topbar:I

    invoke-static {p1, p2, p0}, Landroid/widget/FrameLayout;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 3
    sget p1, Lcom/kwad/sdk/R$id;->ksad_preview_topbar_progress:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bk:Landroid/widget/ProgressBar;

    .line 4
    sget p1, Lcom/kwad/sdk/R$id;->ksad_preview_topbar_reward_tips:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->sB:Landroid/widget/TextView;

    .line 5
    sget p1, Lcom/kwad/sdk/R$id;->ksad_preview_topbar_reward_count:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bl:Landroid/widget/TextView;

    .line 6
    sget p1, Lcom/kwad/sdk/R$id;->ksad_preview_topbar_close:I

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bm:Landroid/widget/ImageView;

    const/16 p2, 0x8

    .line 7
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bm:Landroid/widget/ImageView;

    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final kf()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    return v0
.end method

.method public final n(J)V
    .locals 5
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    long-to-float v0, p1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr v0, v1

    float-to-double v0, v0

    .line 1
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bl:Landroid/widget/TextView;

    if-eqz v1, :cond_0

    .line 3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bi:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    :cond_0
    iget-wide v1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bn:J

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->e(JJ)V

    .line 5
    iget-wide v1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bn:J

    sub-long/2addr v1, p1

    .line 6
    iget-wide p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bo:J

    const/4 v3, 0x0

    cmp-long v4, v1, p1

    if-ltz v4, :cond_1

    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bm:Landroid/widget/ImageView;

    .line 7
    invoke-virtual {p1}, Landroid/widget/ImageView;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bm:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    if-gtz v0, :cond_2

    const/4 p1, 0x1

    .line 9
    invoke-direct {p0, p1, v3}, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->e(ZZ)V

    :cond_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bm:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bq:Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;

    if-eqz p1, :cond_0

    .line 3
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bp:Z

    invoke-interface {p1, v0}, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;->F(Z)V

    :cond_0
    return-void
.end method

.method public setCloseBtnDelayShowDuration(J)V
    .locals 3
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bo:J

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bm:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public setRewardTips(Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->sB:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public setTopBarListener(Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bq:Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView$a;

    return-void
.end method

.method public setTotalCountDuration(J)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bn:J

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/widget/RewardPreviewTopBarView;->Bk:Landroid/widget/ProgressBar;

    long-to-int p2, p1

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void
.end method
