.class public final Lcom/kwad/components/ad/reward/presenter/r;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/e/g;
.implements Lcom/kwad/components/ad/reward/e/j;
.implements Lcom/kwad/components/core/webview/jshandler/aq$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/presenter/r$a;
    }
.end annotation


# instance fields
.field private gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

.field private sD:F

.field private sS:Z

.field private sT:Lcom/kwad/components/ad/reward/presenter/r$a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private sU:Lcom/kwad/components/ad/reward/presenter/q;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private sV:Lcom/kwad/components/ad/reward/presenter/o;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private sW:Lcom/kwad/components/ad/reward/presenter/p;

.field private sX:I

.field private sY:Z

.field private sZ:Z

.field private ta:Z


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1

    const/4 v0, 0x1

    .line 12
    invoke-direct {p0, p1, v0, v0}, Lcom/kwad/components/ad/reward/presenter/r;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;ZZ)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;ZZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sX:I

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sY:Z

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sZ:Z

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->ta:Z

    .line 6
    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/presenter/r;->sZ:Z

    .line 7
    iput-boolean p3, p0, Lcom/kwad/components/ad/reward/presenter/r;->ta:Z

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 9
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 10
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/p;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/p;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sW:Lcom/kwad/components/ad/reward/presenter/p;

    .line 11
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :cond_0
    return-void
.end method

.method private a(Lcom/kwad/components/ad/reward/e/g;)I
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/presenter/r;->getPriority()I

    move-result v0

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/g;->getPriority()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private a(JJZ)V
    .locals 4

    .line 8
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/r;->hG()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    const-wide/16 v2, 0x2710

    cmp-long v0, p3, v2

    if-ltz v0, :cond_0

    long-to-float p3, p3

    long-to-float p1, p1

    iget p2, p0, Lcom/kwad/components/ad/reward/presenter/r;->sD:F

    mul-float p1, p1, p2

    cmpl-float p1, p3, p1

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-nez p1, :cond_1

    return-void

    .line 9
    :cond_1
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gy()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    iget-boolean p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sY:Z

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sU:Lcom/kwad/components/ad/reward/presenter/q;

    if-eqz p1, :cond_3

    .line 11
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/presenter/q;->hB()V

    .line 12
    iput v1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sX:I

    .line 13
    iput-boolean v1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sY:Z

    return-void

    .line 14
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sV:Lcom/kwad/components/ad/reward/presenter/o;

    if-eqz p1, :cond_3

    xor-int/lit8 p2, p5, 0x1

    .line 15
    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/reward/presenter/o;->H(Z)V

    const/4 p1, 0x2

    .line 16
    iput p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sX:I

    :cond_3
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/r;->hF()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/presenter/r;JJZ)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    .line 2
    invoke-direct/range {v0 .. v5}, Lcom/kwad/components/ad/reward/presenter/r;->a(JJZ)V

    return-void
.end method

.method private bV()Lcom/kwad/components/core/webview/tachikoma/e/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/r$2;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/r$2;-><init>(Lcom/kwad/components/ad/reward/presenter/r;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    return-object v0
.end method

.method private hF()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->ta:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/q;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/q;-><init>(Lcom/kwad/components/ad/reward/presenter/r;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sU:Lcom/kwad/components/ad/reward/presenter/q;

    .line 3
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 4
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sZ:Z

    if-eqz v0, :cond_1

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/o;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/o;-><init>(Lcom/kwad/components/ad/reward/presenter/r;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sV:Lcom/kwad/components/ad/reward/presenter/o;

    .line 6
    invoke-virtual {p0, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    :cond_1
    return-void
.end method

.method private hG()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sS:Z

    return v0
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/playable/PlayableSource;Lcom/kwad/components/ad/reward/e/n;)V
    .locals 0
    .param p2    # Lcom/kwad/components/ad/reward/e/n;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 17
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/reward/g;->z(Z)V

    .line 18
    iget p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sX:I

    if-ne p1, p2, :cond_0

    iget-object p2, p0, Lcom/kwad/components/ad/reward/presenter/r;->sU:Lcom/kwad/components/ad/reward/presenter/q;

    if-eqz p2, :cond_0

    .line 19
    invoke-virtual {p2}, Lcom/kwad/components/ad/reward/presenter/q;->hC()V

    return-void

    :cond_0
    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    .line 20
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sV:Lcom/kwad/components/ad/reward/presenter/o;

    if-eqz p1, :cond_1

    .line 21
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/presenter/o;->hide()V

    :cond_1
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/aq$a;)V
    .locals 6

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/aq$a;->isSuccess()Z

    move-result p1

    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sS:Z

    if-eqz p1, :cond_0

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sT:Lcom/kwad/components/ad/reward/presenter/r$a;

    if-eqz p1, :cond_0

    .line 5
    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/r$a;->a(Lcom/kwad/components/ad/reward/presenter/r$a;)J

    move-result-wide v1

    iget-object p1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sT:Lcom/kwad/components/ad/reward/presenter/r$a;

    .line 6
    invoke-static {p1}, Lcom/kwad/components/ad/reward/presenter/r$a;->b(Lcom/kwad/components/ad/reward/presenter/r$a;)J

    move-result-wide v3

    const/4 v5, 0x0

    move-object v0, p0

    .line 7
    invoke-direct/range {v0 .. v5}, Lcom/kwad/components/ad/reward/presenter/r;->a(JJZ)V

    :cond_0
    return-void
.end method

.method public final aj()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-boolean v0, v0, Lcom/kwad/components/ad/reward/g;->pa:Z

    if-nez v0, :cond_0

    .line 5
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/r$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/presenter/r$1;-><init>(Lcom/kwad/components/ad/reward/presenter/r;)V

    const-wide/16 v1, 0x64

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/r;->bV()Lcom/kwad/components/core/webview/tachikoma/e/e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bL(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 8
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/o/a;->aw(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 9
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oM:Lcom/kwad/components/core/playable/a;

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/playable/a;->a(Lcom/kwad/components/core/webview/jshandler/aq$b;)V

    .line 12
    :cond_3
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gx()Z

    move-result v0

    .line 13
    invoke-static {}, Lcom/kwad/components/ad/reward/a/b;->gw()F

    move-result v1

    iput v1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sD:F

    if-eqz v0, :cond_4

    .line 14
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/r$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/kwad/components/ad/reward/presenter/r$a;-><init>(Lcom/kwad/components/ad/reward/presenter/r;B)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sT:Lcom/kwad/components/ad/reward/presenter/r$a;

    .line 15
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v1, :cond_4

    .line 16
    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/reward/m/e;->a(Lcom/kwad/components/core/video/l;)V

    .line 17
    :cond_4
    invoke-static {}, Lcom/kwad/components/ad/reward/a;->eY()Lcom/kwad/components/ad/reward/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/a;->a(Lcom/kwad/components/ad/reward/e/j;)V

    return-void
.end method

.method public final bL()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oN:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;->ih()Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$ShowActionBarResult;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v1, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$ShowActionBarResult;->SHOW_NATIVE_PLAYABLE_PORTRAIT:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl$ShowActionBarResult;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sW:Lcom/kwad/components/ad/reward/presenter/p;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fI()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 6
    :cond_1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/r;->hG()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sW:Lcom/kwad/components/ad/reward/presenter/p;

    sget-object v1, Lcom/kwad/components/core/playable/PlayableSource;->PLAY_FINISHED_NORMAL:Lcom/kwad/components/core/playable/PlayableSource;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/presenter/p;->e(Lcom/kwad/components/core/playable/PlayableSource;)V

    return-void

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sW:Lcom/kwad/components/ad/reward/presenter/p;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/p;->hA()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final bY()V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->z(Z)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sT:Lcom/kwad/components/ad/reward/presenter/r$a;

    if-eqz v0, :cond_0

    iget v1, p0, Lcom/kwad/components/ad/reward/presenter/r;->sX:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/r$a;->a(Lcom/kwad/components/ad/reward/presenter/r$a;)J

    move-result-wide v4

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sT:Lcom/kwad/components/ad/reward/presenter/r$a;

    .line 4
    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/r$a;->b(Lcom/kwad/components/ad/reward/presenter/r$a;)J

    move-result-wide v6

    const/4 v8, 0x1

    move-object v3, p0

    .line 5
    invoke-direct/range {v3 .. v8}, Lcom/kwad/components/ad/reward/presenter/r;->a(JJZ)V

    :cond_0
    return-void
.end method

.method public final bZ()V
    .locals 0

    return-void
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/reward/e/g;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/presenter/r;->a(Lcom/kwad/components/ad/reward/e/g;)I

    move-result p1

    return p1
.end method

.method public final getPriority()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onBackPressed()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fM()Z

    move-result v0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/g;->fy()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    if-eqz v0, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/reward/a;->eY()Lcom/kwad/components/ad/reward/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/a;->eZ()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, v2}, Lcom/kwad/components/ad/reward/g;->z(Z)V

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oM:Lcom/kwad/components/core/playable/a;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0, p0}, Lcom/kwad/components/core/playable/a;->b(Lcom/kwad/components/core/webview/jshandler/aq$b;)V

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/r;->sT:Lcom/kwad/components/ad/reward/presenter/r$a;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/b;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/reward/m/e;->b(Lcom/kwad/components/core/video/l;)V

    .line 7
    :cond_1
    invoke-static {}, Lcom/kwad/components/ad/reward/a;->eY()Lcom/kwad/components/ad/reward/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/a;->b(Lcom/kwad/components/ad/reward/e/j;)V

    .line 8
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/r;->gX:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->b(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    return-void
.end method
