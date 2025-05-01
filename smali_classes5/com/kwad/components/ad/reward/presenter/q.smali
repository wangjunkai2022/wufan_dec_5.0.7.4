.class public final Lcom/kwad/components/ad/reward/presenter/q;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"


# instance fields
.field private mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

.field private sD:F

.field private sF:Lcom/kwad/components/ad/reward/presenter/r;

.field private sG:Z

.field private sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

.field private sN:Z

.field private sO:Z

.field private sP:Ljava/lang/Runnable;

.field private sQ:Z


# direct methods
.method public constructor <init>(Lcom/kwad/components/ad/reward/presenter/r;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sN:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sO:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sQ:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sG:Z

    .line 6
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/q$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/q$1;-><init>(Lcom/kwad/components/ad/reward/presenter/q;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    .line 7
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/q;->sF:Lcom/kwad/components/ad/reward/presenter/r;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/q;)Lcom/kwad/components/ad/reward/widget/KsToastView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/q;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/presenter/q;->sQ:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/presenter/q;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sQ:Z

    return p0
.end method

.method private hD()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/q$3;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/q$3;-><init>(Lcom/kwad/components/ad/reward/presenter/q;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sP:Ljava/lang/Runnable;

    return-void
.end method

.method private hE()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sP:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sP:Ljava/lang/Runnable;

    return-void
.end method

.method private declared-synchronized hy()V
    .locals 5

    monitor-enter p0

    .line 1
    :try_start_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sG:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    .line 3
    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    new-instance v2, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v2}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    const/16 v3, 0xc0

    .line 4
    invoke-virtual {v2, v3}, Lcom/kwad/sdk/core/adlog/c/b;->cM(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v3, v3, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    .line 5
    invoke-virtual {v3}, Lcom/kwad/components/ad/reward/m/e;->getPlayDuration()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/kwad/sdk/core/adlog/c/b;->ao(J)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v2

    .line 6
    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sG:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

    if-nez v0, :cond_0

    .line 3
    sget v0, Lcom/kwad/sdk/R$id;->ksad_toast_view:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/reward/widget/KsToastView;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

    .line 4
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/q$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/presenter/q$2;-><init>(Lcom/kwad/components/ad/reward/presenter/q;)V

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/q;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    return-void
.end method

.method public final hB()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sO:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/q;->hy()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sO:Z

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/widget/KsToastView;->U(I)V

    .line 6
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/q;->hD()V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sP:Ljava/lang/Runnable;

    const/4 v1, 0x0

    const-wide/16 v2, 0xbb8

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->a(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method public final hC()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sO:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sM:Lcom/kwad/components/ad/reward/widget/KsToastView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gw()F

    move-result v0

    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sD:F

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gx()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gy()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/q;->sN:Z

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/q;->hE()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/q;->mPlayEndPageListener:Lcom/kwad/components/ad/reward/e/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    return-void
.end method
