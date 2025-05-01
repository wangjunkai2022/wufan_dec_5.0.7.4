.class public final Lcom/kwad/components/ad/reward/m;
.super Lcom/kwad/components/ad/reward/presenter/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/e/g;
.implements Lcom/kwad/components/core/e/e/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/m$a;
    }
.end annotation


# instance fields
.field private gS:Landroid/view/ViewGroup;

.field private gT:Lcom/kwad/components/core/l/b;

.field private gU:Lcom/kwad/components/ad/reward/presenter/r;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private gV:Landroid/widget/FrameLayout;

.field private gW:Lcom/kwad/components/ad/reward/presenter/f/b;

.field private gY:Lcom/kwad/components/ad/reward/presenter/e/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private gZ:Lcom/kwad/components/ad/reward/presenter/f/f;

.field private ha:Z

.field private jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

.field private mContext:Landroid/content/Context;

.field private mModel:Lcom/kwad/components/ad/reward/model/c;

.field private qp:Lcom/kwad/components/ad/reward/g;

.field private qq:Lcom/kwad/components/ad/reward/m$a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/l/b;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/kwad/components/ad/reward/model/c;Lcom/kwad/components/ad/reward/g;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/b;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/m;->ha:Z

    .line 3
    new-instance v1, Lcom/kwad/components/ad/reward/m$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/m$1;-><init>(Lcom/kwad/components/ad/reward/m;)V

    iput-object v1, p0, Lcom/kwad/components/ad/reward/m;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    .line 4
    iput-object p2, p0, Lcom/kwad/components/ad/reward/m;->mContext:Landroid/content/Context;

    .line 5
    iput-object p3, p0, Lcom/kwad/components/ad/reward/m;->gS:Landroid/view/ViewGroup;

    .line 6
    iput-object p4, p0, Lcom/kwad/components/ad/reward/m;->mModel:Lcom/kwad/components/ad/reward/model/c;

    .line 7
    iput-object p5, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    .line 8
    iput-object p1, p0, Lcom/kwad/components/ad/reward/m;->gT:Lcom/kwad/components/core/l/b;

    .line 9
    invoke-direct {p0, p4}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/model/c;)V

    .line 10
    invoke-virtual {p4}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p2

    .line 11
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/b;->ec(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p3

    .line 12
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v1, Lcom/kwad/components/ad/reward/g;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdResultData;->adGlobalConfigInfo:Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 13
    :cond_0
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->bc(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 14
    invoke-virtual {p4}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/ad/reward/g;->G(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 15
    :goto_1
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->cX(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p2, p2, Lcom/kwad/components/ad/reward/g;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdResultData;->adGlobalConfigInfo:Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    invoke-static {p2}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;)Z

    move-result p2

    if-eqz p2, :cond_3

    const/4 v0, 0x1

    .line 16
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "notFullTk: "

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", mLoadStrategy: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v2, v2, Lcom/kwad/components/ad/reward/g;->pC:Lcom/kwad/components/ad/reward/LoadStrategy;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v2, "RewardPresenter"

    invoke-static {v2, p2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_4

    .line 17
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/reward/m;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 18
    sget-object p1, Lcom/kwad/components/ad/reward/RewardRenderResult;->LIVE_TK:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {p5, p1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 19
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m;->bR()V

    return-void

    :cond_4
    if-eqz p3, :cond_5

    .line 20
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/reward/m;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 21
    sget-object p1, Lcom/kwad/components/ad/reward/RewardRenderResult;->TK_IMAGE:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {p5, p1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 22
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m;->bS()V

    return-void

    :cond_5
    if-nez v1, :cond_6

    .line 23
    iget-object p2, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object p2, p2, Lcom/kwad/components/ad/reward/g;->pC:Lcom/kwad/components/ad/reward/LoadStrategy;

    sget-object p3, Lcom/kwad/components/ad/reward/LoadStrategy;->FULL_TK:Lcom/kwad/components/ad/reward/LoadStrategy;

    .line 24
    invoke-virtual {p2, p3}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 25
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/components/ad/reward/m;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/tachikoma/d/b;->a(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    .line 26
    sget-object p1, Lcom/kwad/components/ad/reward/RewardRenderResult;->NEO_TK:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {p5, p1}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 27
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m;->gn()V

    return-void

    .line 28
    :cond_6
    sget-object p2, Lcom/kwad/components/ad/reward/RewardRenderResult;->DEFAULT:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {p5, p2}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V

    .line 29
    invoke-direct {p0, p1, p4}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/core/l/b;Lcom/kwad/components/ad/reward/model/c;)V

    return-void
.end method

.method private a(Lcom/kwad/components/ad/reward/e/g;)I
    .locals 1

    .line 61
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/m;->getPriority()I

    move-result v0

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/g;->getPriority()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method private a(Lcom/kwad/components/ad/reward/m;)V
    .locals 2

    .line 4
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/m;->ha:Z

    if-eqz v0, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/a;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-direct {v0, v1}, Lcom/kwad/components/ad/reward/presenter/a;-><init>(Lcom/kwad/components/ad/reward/g;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 6
    iput-boolean v1, p0, Lcom/kwad/components/ad/reward/m;->ha:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/m;Lcom/kwad/components/ad/reward/m;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/m;Lcom/kwad/components/core/l/b;Lcom/kwad/components/ad/reward/model/c;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/core/l/b;Lcom/kwad/components/ad/reward/model/c;)V

    return-void
.end method

.method private a(Lcom/kwad/components/ad/reward/model/c;)V
    .locals 1

    .line 47
    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 48
    iget-boolean p1, p1, Lcom/kwad/components/ad/reward/model/c;->gt:Z

    if-nez p1, :cond_0

    .line 49
    invoke-direct {p0, p0}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;)V

    .line 50
    :cond_0
    invoke-static {v0}, Lcom/kwad/components/ad/reward/g;->g(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 51
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/g;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/g;-><init>()V

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 52
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aN(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 53
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/h/a;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/h/a;-><init>()V

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 54
    :cond_2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dn(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 55
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/f/h;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/f/h;-><init>()V

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    .line 56
    :cond_3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dZ(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 57
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 58
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/e/a;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/e/a;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/m;->gY:Lcom/kwad/components/ad/reward/presenter/e/a;

    .line 59
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    :cond_4
    return-void
.end method

.method private a(Lcom/kwad/components/core/l/b;Lcom/kwad/components/ad/reward/model/c;)V
    .locals 4

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m;->mModel:Lcom/kwad/components/ad/reward/model/c;

    if-nez p1, :cond_0

    return-void

    .line 8
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/kwad/components/core/e/e/g;->a(Lcom/kwad/components/core/e/e/f;)V

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/reward/m;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {p1}, Lcom/kwad/components/ad/reward/model/c;->bH()Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->mModel:Lcom/kwad/components/ad/reward/model/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/model/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    .line 11
    iget-boolean v1, p2, Lcom/kwad/components/ad/reward/model/c;->gt:Z

    if-eqz v1, :cond_1

    .line 12
    invoke-direct {p0, p0}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/m;)V

    .line 13
    :cond_1
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/v;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/presenter/v;-><init>()V

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 14
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aO(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 15
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/d;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/presenter/d;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 16
    :cond_2
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/m;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/presenter/m;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 17
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/h;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/presenter/h;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 18
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/platdetail/c;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/presenter/platdetail/c;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 19
    new-instance v1, Lcom/kwad/components/ad/reward/presenter/platdetail/a/e;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/presenter/platdetail/a/e;-><init>()V

    invoke-virtual {p0, v1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 20
    invoke-virtual {p2}, Lcom/kwad/components/ad/reward/model/c;->hj()Z

    move-result v1

    .line 21
    invoke-virtual {p2}, Lcom/kwad/components/ad/reward/model/c;->hk()Z

    move-result v3

    .line 22
    invoke-virtual {p2}, Lcom/kwad/components/ad/reward/model/c;->bI()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->isOrientationPortrait()Z

    move-result p2

    if-nez p2, :cond_3

    const/4 p2, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, 0x0

    :goto_0
    if-nez v1, :cond_4

    if-nez v3, :cond_4

    if-nez p2, :cond_4

    .line 23
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/c;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/c;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 24
    :cond_4
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/n;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/n;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 25
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/c;

    invoke-direct {p2, p1}, Lcom/kwad/components/ad/reward/presenter/c;-><init>(Lcom/kwad/sdk/core/response/model/AdInfo;)V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 26
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/d/b;

    invoke-direct {p2, v0, v2}, Lcom/kwad/components/ad/reward/presenter/d/b;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 27
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/c/a;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/c/a;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 28
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/u;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/u;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 29
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/e;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m;->gS:Landroid/view/ViewGroup;

    invoke-direct {p2, p1, v1}, Lcom/kwad/components/ad/reward/presenter/e;-><init>(Lcom/kwad/sdk/core/response/model/AdInfo;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 30
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/r;

    invoke-direct {p2, v0}, Lcom/kwad/components/ad/reward/presenter/r;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iput-object p2, p0, Lcom/kwad/components/ad/reward/m;->gU:Lcom/kwad/components/ad/reward/presenter/r;

    .line 31
    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 32
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/l;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/l;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 33
    iget-object p2, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    iget-boolean v1, p2, Lcom/kwad/components/ad/reward/g;->oZ:Z

    if-eqz v1, :cond_5

    iget-object p2, p2, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    .line 34
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    .line 35
    invoke-static {p2, v1}, Lcom/kwad/components/ad/reward/d/a;->b(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p2

    if-eqz p2, :cond_5

    .line 36
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/a/a;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/a/a;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 37
    :cond_5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->dj(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p2

    if-eqz p2, :cond_6

    .line 38
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/t;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/t;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 39
    :cond_6
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bc(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p2

    if-eqz p2, :cond_7

    .line 40
    new-instance p2, Lcom/kwad/components/ad/reward/presenter/platdetail/b;

    invoke-direct {p2}, Lcom/kwad/components/ad/reward/presenter/platdetail/b;-><init>()V

    invoke-virtual {p0, p2, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 41
    :cond_7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    if-eqz p1, :cond_8

    .line 42
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/b/c;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/b/c;-><init>()V

    invoke-virtual {p0, p1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 43
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/b/a;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/b/a;-><init>()V

    invoke-virtual {p0, p1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 44
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/b/b;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/b/b;-><init>()V

    invoke-virtual {p0, p1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 45
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/k;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/k;-><init>()V

    invoke-virtual {p0, p1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    .line 46
    :cond_8
    new-instance p1, Lcom/kwad/components/ad/reward/presenter/j;

    invoke-direct {p1}, Lcom/kwad/components/ad/reward/presenter/j;-><init>()V

    invoke-virtual {p0, p1, v2}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;Z)V

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;)Z
    .locals 1

    const/4 v0, 0x1

    if-eqz p0, :cond_1

    .line 3
    iget p0, p0, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;->neoPageType:I

    if-eq p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method

.method static synthetic b(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/g;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    return-object p0
.end method

.method private bR()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/b;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/f/b;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m;->gW:Lcom/kwad/components/ad/reward/presenter/f/b;

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method

.method private bS()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/f/c;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m;->gZ:Lcom/kwad/components/ad/reward/presenter/f/f;

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method

.method private bW()Landroid/widget/FrameLayout;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gV:Landroid/widget/FrameLayout;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gS:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_play_layout:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m;->gV:Landroid/widget/FrameLayout;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gV:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/m;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object p0

    return-object p0
.end method

.method static synthetic d(Lcom/kwad/components/ad/reward/m;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/m;->bW()Landroid/widget/FrameLayout;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/core/l/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/m;->gT:Lcom/kwad/components/core/l/b;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/reward/m;)Lcom/kwad/components/ad/reward/model/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/reward/m;->mModel:Lcom/kwad/components/ad/reward/model/c;

    return-object p0
.end method

.method private gn()V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/presenter/f/f;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/presenter/f/f;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m;->gZ:Lcom/kwad/components/ad/reward/presenter/f/f;

    .line 2
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->a(Lcom/kwad/sdk/mvp/Presenter;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/components/ad/reward/m$a;)V
    .locals 0
    .param p1    # Lcom/kwad/components/ad/reward/m$a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 60
    iput-object p1, p0, Lcom/kwad/components/ad/reward/m;->qq:Lcom/kwad/components/ad/reward/m$a;

    return-void
.end method

.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/presenter/b;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/e/g;)V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/c/a;->setCallerContext(Lcom/kwad/components/ad/reward/g;)V

    return-void
.end method

.method public final bL()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->C(Z)V

    return-void
.end method

.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lcom/kwad/components/ad/reward/e/g;

    invoke-direct {p0, p1}, Lcom/kwad/components/ad/reward/m;->a(Lcom/kwad/components/ad/reward/e/g;)I

    move-result p1

    return p1
.end method

.method public final dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fv()V

    return-void
.end method

.method public final getPriority()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gU:Lcom/kwad/components/ad/reward/presenter/r;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/r;->onBackPressed()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-object v0, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->HANDLED:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    return-object v0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gY:Lcom/kwad/components/ad/reward/presenter/e/a;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/e/a;->go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    move-result-object v0

    .line 6
    sget-object v1, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->HANDLED:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    if-ne v0, v1, :cond_1

    return-object v1

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gW:Lcom/kwad/components/ad/reward/presenter/f/b;

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/f/b;->go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    move-result-object v0

    return-object v0

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gZ:Lcom/kwad/components/ad/reward/presenter/f/f;

    if-eqz v0, :cond_3

    .line 10
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/presenter/f/f;->go()Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    move-result-object v0

    return-object v0

    .line 11
    :cond_3
    sget-object v0, Lcom/kwad/components/ad/reward/page/BackPressHandleResult;->NOT_HANDLED:Lcom/kwad/components/ad/reward/page/BackPressHandleResult;

    return-object v0
.end method

.method public final onCreate()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->gS:Landroid/view/ViewGroup;

    sget v1, Lcom/kwad/sdk/R$id;->ksad_reward_play_layout:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p0, Lcom/kwad/components/ad/reward/m;->gV:Landroid/widget/FrameLayout;

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onDestroy()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/kwad/components/ad/reward/m;->gT:Lcom/kwad/components/core/l/b;

    .line 3
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/b;->tG()Lcom/kwad/components/core/webview/tachikoma/d/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/m;->jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/d/b;->b(Lcom/kwad/components/core/webview/tachikoma/e/e;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/e/g;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qq:Lcom/kwad/components/ad/reward/m$a;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/kwad/components/ad/reward/m$a;->onUnbind()V

    .line 5
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/e/e/g;->oQ()Lcom/kwad/components/core/e/e/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/components/core/e/e/g;->b(Lcom/kwad/components/core/e/e/f;)V

    .line 6
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/c/a;->reset()V

    return-void
.end method

.method public final show()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fw()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/m;->qp:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    return-void
.end method
