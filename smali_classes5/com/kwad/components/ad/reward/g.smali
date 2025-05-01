.class public final Lcom/kwad/components/ad/reward/g;
.super Lcom/kwad/components/core/l/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/reward/g$b;,
        Lcom/kwad/components/ad/reward/g$a;
    }
.end annotation


# instance fields
.field public fP:Z

.field private fS:Landroid/os/Handler;

.field public gt:Z

.field public jY:Z

.field public mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field public mAdRewardStepListener:Lcom/kwad/components/ad/reward/e/d;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public mCheckExposureResult:Z

.field public mPageEnterTime:J

.field public mReportExtData:Lorg/json/JSONObject;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private mRewardVerifyCalled:Z

.field public mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public mScreenOrientation:I

.field public mTimerHelper:Lcom/kwad/sdk/utils/bn;

.field public mVideoPlayConfig:Lcom/kwad/sdk/api/KsVideoPlayConfig;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public oI:Z

.field public oJ:Lcom/kwad/components/ad/reward/e/b;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public oK:Lcom/kwad/components/ad/reward/m/e;

.field public oL:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public oM:Lcom/kwad/components/core/playable/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public oN:Lcom/kwad/components/ad/reward/presenter/platdetail/actionbar/RewardActionBarControl;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public oO:Lcom/kwad/components/ad/reward/j;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public oP:Lcom/kwad/components/ad/l/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public oQ:Lcom/kwad/components/ad/reward/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final oR:Ljava/util/PriorityQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/PriorityQueue<",
            "Lcom/kwad/components/ad/reward/e/g;",
            ">;"
        }
    .end annotation
.end field

.field public final oS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/reward/k/a;",
            ">;"
        }
    .end annotation
.end field

.field private final oT:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/reward/k/r;",
            ">;"
        }
    .end annotation
.end field

.field private final oU:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/reward/m/c;",
            ">;"
        }
    .end annotation
.end field

.field public oV:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/kwad/components/ad/reward/e/e;",
            ">;"
        }
    .end annotation
.end field

.field private oW:Lcom/kwad/components/core/webview/tachikoma/e/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private oX:Z

.field private oY:Z

.field public oZ:Z

.field public pA:Z

.field public pB:Z

.field public pC:Lcom/kwad/components/ad/reward/LoadStrategy;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private pD:Lcom/kwad/components/ad/reward/RewardRenderResult;

.field private pE:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/reward/g$a;",
            ">;"
        }
    .end annotation
.end field

.field private pF:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/reward/g$b;",
            ">;"
        }
    .end annotation
.end field

.field private pG:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/i/a$a;",
            ">;"
        }
    .end annotation
.end field

.field public pa:Z

.field public pb:Z

.field public pc:Z

.field private pd:Z

.field public pe:Z

.field public pf:Z

.field public pg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public ph:I

.field public pi:Z

.field public pj:Lcom/kwad/components/ad/reward/n/p;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public pk:Z

.field private pl:Lcom/kwad/components/core/playable/PlayableSource;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private pm:Z

.field public pn:J

.field private po:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/content/DialogInterface$OnDismissListener;",
            ">;"
        }
    .end annotation
.end field

.field public pp:Lcom/kwad/components/ad/reward/e/o;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public pq:Z

.field public pr:Lcom/kwad/components/ad/reward/l/b/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public ps:Lcom/kwad/components/ad/reward/l/a/a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public pt:I

.field private pu:I

.field public pv:J

.field public pw:J

.field public px:Z

.field private py:Z

.field private pz:Z


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/l/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/components/core/l/b<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/l/a;-><init>(Lcom/kwad/components/core/l/b;)V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->oI:Z

    .line 3
    new-instance v0, Ljava/util/PriorityQueue;

    invoke-direct {v0}, Ljava/util/PriorityQueue;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->oR:Ljava/util/PriorityQueue;

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->oS:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->oT:Ljava/util/List;

    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->oU:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->oV:Ljava/util/Set;

    .line 8
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->oX:Z

    .line 9
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->oY:Z

    .line 10
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pa:Z

    .line 11
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pb:Z

    .line 12
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pc:Z

    .line 13
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pd:Z

    .line 14
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pe:Z

    .line 15
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->mRewardVerifyCalled:Z

    .line 16
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pf:Z

    .line 17
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->pg:Ljava/util/List;

    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->mCheckExposureResult:Z

    .line 19
    iput p1, p0, Lcom/kwad/components/ad/reward/g;->ph:I

    .line 20
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pi:Z

    .line 21
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pk:Z

    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->pl:Lcom/kwad/components/core/playable/PlayableSource;

    .line 23
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pm:Z

    .line 24
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->gt:Z

    .line 25
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->po:Ljava/util/List;

    .line 26
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/g;->fS:Landroid/os/Handler;

    .line 27
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pq:Z

    const/4 v0, 0x2

    .line 28
    iput v0, p0, Lcom/kwad/components/ad/reward/g;->pu:I

    .line 29
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->py:Z

    .line 30
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pz:Z

    .line 31
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pA:Z

    .line 32
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pB:Z

    .line 33
    sget-object p1, Lcom/kwad/components/ad/reward/LoadStrategy;->FULL_TK:Lcom/kwad/components/ad/reward/LoadStrategy;

    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pC:Lcom/kwad/components/ad/reward/LoadStrategy;

    .line 34
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    .line 35
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pF:Ljava/util/List;

    .line 36
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pG:Ljava/util/List;

    .line 37
    iget-object p1, p0, Lcom/kwad/components/core/l/a;->MU:Ljava/util/List;

    new-instance v0, Lcom/kwad/components/ad/reward/g$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/g$1;-><init>(Lcom/kwad/components/ad/reward/g;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static E(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 1

    .line 4
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    .line 5
    invoke-static {p0, v0}, Lcom/kwad/sdk/core/response/b/e;->k(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)Z

    move-result p0

    return p0
.end method

.method public static F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p0

    return p0
.end method

.method public static G(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cS(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 2
    :cond_0
    invoke-static {p0}, Lcom/kwad/components/ad/reward/g;->E(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p0}, Lcom/kwad/components/ad/reward/g;->F(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    return v1

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static a(JLcom/kwad/sdk/core/response/model/AdInfo;)J
    .locals 2

    .line 58
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->af(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v0

    .line 59
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static a(Ljava/util/List;J)Lcom/kwad/components/core/i/c;
    .locals 5
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/components/core/i/c;",
            ">;J)",
            "Lcom/kwad/components/core/i/c;"
        }
    .end annotation

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_2

    if-nez p0, :cond_0

    goto :goto_0

    .line 39
    :cond_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/i/c;

    .line 40
    invoke-virtual {v1}, Lcom/kwad/components/core/i/c;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v2

    cmp-long v4, v2, p1

    if-nez v4, :cond_1

    return-object v1

    :cond_2
    :goto_0
    return-object v0
.end method

.method private a(ILcom/kwad/sdk/core/adlog/c/b;)V
    .locals 2

    if-nez p2, :cond_0

    .line 25
    new-instance p2, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {p2}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 26
    :cond_0
    invoke-virtual {p2, p1}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 27
    iget-object p1, p0, Lcom/kwad/components/ad/reward/g;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    .line 28
    iget-object p1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, p2, v0}, Lcom/kwad/components/ad/reward/j/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 29
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object p1

    iget-object p2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    sget v0, Lcom/kwad/components/ad/reward/c/b;->STATUS_NONE:I

    invoke-virtual {p1, p2, v0}, Lcom/kwad/components/ad/reward/c/a;->c(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 30
    iget-object p1, p0, Lcom/kwad/components/ad/reward/g;->oJ:Lcom/kwad/components/ad/reward/e/b;

    invoke-interface {p1}, Lcom/kwad/components/ad/reward/e/b;->bJ()V

    return-void
.end method

.method public static a(Landroid/app/Activity;Lcom/kwad/components/ad/reward/g;)V
    .locals 7

    const-string v0, "RewardCallerContext"

    const-string v1, "showExtraDialog"

    .line 70
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    iget-object v0, p1, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    .line 72
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->getPlayDuration()J

    move-result-wide v3

    new-instance v5, Lcom/kwad/components/ad/reward/g$3;

    invoke-direct {v5, p1}, Lcom/kwad/components/ad/reward/g$3;-><init>(Lcom/kwad/components/ad/reward/g;)V

    new-instance v6, Lcom/kwad/components/ad/reward/g$4;

    invoke-direct {v6, p1}, Lcom/kwad/components/ad/reward/g$4;-><init>(Lcom/kwad/components/ad/reward/g;)V

    move-object v1, p1

    move-object v2, p0

    .line 73
    invoke-static/range {v1 .. v6}, Lcom/kwad/components/ad/reward/k/a/b;->a(Lcom/kwad/components/ad/reward/g;Landroid/app/Activity;JLandroid/content/DialogInterface$OnDismissListener;Lcom/kwad/components/core/webview/tachikoma/e/c;)Lcom/kwad/components/ad/reward/k/a/b;

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/kwad/components/ad/reward/g;Landroid/view/ViewGroup;)V
    .locals 9

    .line 42
    iget-object v0, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 43
    const-class v1, Lcom/kwad/components/core/n/a/a/a;

    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/kwad/components/core/n/a/a/a;

    if-eqz v2, :cond_1

    .line 44
    invoke-interface {v2}, Lcom/kwad/components/core/n/a/a/a;->pj()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 45
    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 46
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->be(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    const/16 v3, 0x8

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, 0x0

    .line 47
    :try_start_0
    invoke-static {v2, p0, v1}, Lcom/kwad/components/ad/j/b;->a(Lcom/kwad/components/core/n/a/a/a;Landroid/content/Context;I)Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v3, p0

    goto :goto_1

    :catchall_0
    nop

    :goto_1
    if-eqz v3, :cond_1

    .line 48
    invoke-interface {v3}, Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;->getView()Landroid/view/View;

    move-result-object p0

    .line 49
    iput-object v3, p1, Lcom/kwad/components/ad/reward/g;->oL:Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;

    .line 50
    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 51
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getAppId()Ljava/lang/String;

    move-result-object v4

    .line 52
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ch(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 53
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ci(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v6

    .line 54
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cj(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v7

    .line 55
    invoke-interface/range {v2 .. v8}, Lcom/kwad/components/core/n/a/a/a;->getAdLivePlayModule(Lcom/kwad/components/offline/api/core/adlive/IAdLiveOfflineView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    move-result-object p0

    .line 56
    new-instance p2, Lcom/kwad/components/ad/reward/f/a;

    iget-object v0, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p2, v0, p0}, Lcom/kwad/components/ad/reward/f/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;)V

    .line 57
    iget-object p0, p1, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    const/4 p1, 0x2

    invoke-virtual {p0, p1, p2}, Lcom/kwad/components/ad/reward/m/e;->a(ILcom/kwad/components/ad/k/a;)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/reward/g;ILcom/kwad/sdk/core/adlog/c/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/reward/g;->a(ILcom/kwad/sdk/core/adlog/c/b;)V

    return-void
.end method

.method public static a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V
    .locals 8

    .line 60
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jN()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    .line 61
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 62
    invoke-static {v0}, Lcom/kwad/components/ad/reward/a/b;->j(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 63
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cc(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    .line 64
    invoke-static {p0}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/components/ad/reward/k/a/b;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    .line 65
    invoke-static {p0}, Lcom/kwad/components/ad/reward/g;->d(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/components/ad/reward/k/a/b;

    move-result-object v1

    :cond_3
    move-object v2, v1

    if-eqz v2, :cond_4

    .line 66
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->getActivity()Landroid/app/Activity;

    move-result-object v3

    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    .line 67
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->getPlayDuration()J

    move-result-wide v4

    new-instance v7, Lcom/kwad/components/ad/reward/g$12;

    invoke-direct {v7, p0, p1, p2}, Lcom/kwad/components/ad/reward/g$12;-><init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V

    move-object v6, p2

    .line 68
    invoke-static/range {v2 .. v7}, Lcom/kwad/components/ad/reward/k/a/b;->a(Lcom/kwad/components/ad/reward/k/a/b;Landroid/app/Activity;JLcom/kwad/components/core/webview/tachikoma/e/c;Lcom/kwad/components/core/webview/tachikoma/c/e$a;)Lcom/kwad/components/ad/reward/k/a/b;

    return-void

    .line 69
    :cond_4
    invoke-static {p0, p1, p2}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V

    return-void
.end method

.method public static a(Ljava/util/List;Lcom/kwad/sdk/f/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TT;>;",
            "Lcom/kwad/sdk/f/a<",
            "TT;>;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 7
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 8
    invoke-interface {p1, v0}, Lcom/kwad/sdk/f/a;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static b(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V
    .locals 3

    .line 16
    invoke-static {p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/g;)Z

    move-result v0

    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "showNativeCloseDialog isCloseDialogShowing: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RewardCallerContext"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_0

    return-void

    .line 18
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iget-object p0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, p0, p1, p2}, Lcom/kwad/components/ad/reward/h;->a(Landroid/app/Activity;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)Lcom/kwad/components/ad/reward/h;

    return-void
.end method

.method public static b(Lcom/kwad/components/ad/reward/g;)Z
    .locals 0

    .line 15
    iget-boolean p0, p0, Lcom/kwad/components/ad/reward/g;->oX:Z

    return p0
.end method

.method private static c(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/components/ad/reward/k/a/b;
    .locals 2

    .line 3
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/c/e$b;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;-><init>()V

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/g;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->d(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/b;->dw(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->aX(Ljava/lang/String;)V

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->aW(Z)V

    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/tachikoma/c/e$b;->aX(Z)V

    .line 8
    invoke-static {p0, v0}, Lcom/kwad/components/ad/reward/k/a/b;->a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/core/webview/tachikoma/c/e$b;)Lcom/kwad/components/ad/reward/k/a/b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/components/ad/reward/h$a;)V

    return-void
.end method

.method private static d(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/components/ad/reward/k/a/b;
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cc(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cc(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return-object p0

    .line 10
    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/kwad/components/ad/reward/g;->c(Lcom/kwad/components/ad/reward/g;)Lcom/kwad/components/ad/reward/k/a/b;

    move-result-object p0

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/g;->fu()V

    return-void
.end method

.method static synthetic f(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/g;->fx()V

    return-void
.end method

.method private fB()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oR:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->clear()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/e/d/c;->clear()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oO:Lcom/kwad/components/ad/reward/j;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->release()V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oQ:Lcom/kwad/components/ad/reward/d;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->release()V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oV:Ljava/util/Set;

    if-eqz v0, :cond_3

    .line 9
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    :cond_3
    return-void
.end method

.method private fD()V
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oR:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/PriorityQueue;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 2
    iget-object v2, p0, Lcom/kwad/components/ad/reward/g;->oR:Ljava/util/PriorityQueue;

    invoke-virtual {v2}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/ad/reward/e/g;

    if-eqz v2, :cond_0

    .line 3
    invoke-interface {v2}, Lcom/kwad/components/ad/reward/e/g;->bL()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method private fu()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/reward/g$a;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/ad/reward/g$a;->fV()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private fx()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/reward/g$a;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/ad/reward/g$a;->fY()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/g;->fD()V

    return-void
.end method

.method public static g(Lcom/kwad/sdk/core/response/model/AdInfo;)Z
    .locals 1

    .line 2
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/b;->g(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p0}, Lcom/kwad/components/ad/reward/a/b;->k(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static isMainThread()Z
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final A(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pz:Z

    return-void
.end method

.method public final B(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->pm:Z

    return-void
.end method

.method public final C(Z)V
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->py:Z

    return-void
.end method

.method public final D(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->oX:Z

    return-void
.end method

.method public final E(Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->mRewardVerifyCalled:Z

    if-eq p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oT:Ljava/util/List;

    new-instance v1, Lcom/kwad/components/ad/reward/g$11;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/ad/reward/g$11;-><init>(Lcom/kwad/components/ad/reward/g;Z)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Ljava/util/List;Lcom/kwad/sdk/f/a;)V

    .line 3
    :cond_0
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->mRewardVerifyCalled:Z

    return-void
.end method

.method public final L(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/reward/g;->pu:I

    return-void
.end method

.method public final a(ILandroid/content/Context;II)V
    .locals 0

    .line 11
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kwad/components/ad/reward/g;->b(ILandroid/content/Context;II)V

    return-void
.end method

.method public final a(ILandroid/content/Context;IIJ)V
    .locals 9

    const/4 v1, 0x1

    const/16 v3, 0x28

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p2

    move-wide v5, p5

    .line 12
    invoke-virtual/range {v0 .. v8}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;IIJZLcom/kwad/sdk/core/adlog/c/b;)V

    return-void
.end method

.method public final a(ILandroid/content/Context;IIJZLcom/kwad/sdk/core/adlog/c/b;)V
    .locals 0

    .line 13
    new-instance p7, Lcom/kwad/components/core/e/d/a$a;

    invoke-direct {p7, p2}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object p2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 14
    invoke-virtual {p7, p2}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    iget-object p7, p0, Lcom/kwad/components/ad/reward/g;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 15
    invoke-virtual {p2, p7}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    const/4 p7, 0x0

    .line 16
    invoke-virtual {p2, p7}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    .line 17
    invoke-virtual {p2, p4}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    .line 18
    invoke-virtual {p2, p5, p6}, Lcom/kwad/components/core/e/d/a$a;->v(J)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    .line 19
    invoke-virtual {p2, p3}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    .line 20
    invoke-virtual {p2, p1}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 21
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fA()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/e/d/a$a;->ag(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance p2, Lcom/kwad/components/ad/reward/g$8;

    invoke-direct {p2, p0}, Lcom/kwad/components/ad/reward/g$8;-><init>(Lcom/kwad/components/ad/reward/g;)V

    .line 22
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/e/d/a$a;->a(Ljava/util/concurrent/Callable;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance p2, Lcom/kwad/components/ad/reward/g$7;

    invoke-direct {p2, p0, p3, p8}, Lcom/kwad/components/ad/reward/g$7;-><init>(Lcom/kwad/components/ad/reward/g;ILcom/kwad/sdk/core/adlog/c/b;)V

    .line 23
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 24
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method

.method public final a(JJI)V
    .locals 0

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/reward/g;->oV:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/kwad/components/ad/reward/e/e;

    .line 10
    invoke-interface {p2}, Lcom/kwad/components/ad/reward/e/e;->ce()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->po:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/RewardRenderResult;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pD:Lcom/kwad/components/ad/reward/RewardRenderResult;

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/e/o;)V
    .locals 0
    .param p1    # Lcom/kwad/components/ad/reward/e/o;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pp:Lcom/kwad/components/ad/reward/e/o;

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/g$a;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/g$b;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pF:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/k/a;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oS:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/k/r;)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oT:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/reward/m/c;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oU:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/i/a$a;)V
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pG:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 38
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/i/c;)V
    .locals 2

    .line 34
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 35
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/e/f;->J(Ljava/lang/String;)Lcom/kwad/components/core/i/d;

    move-result-object v0

    .line 36
    new-instance v1, Lcom/kwad/components/ad/reward/g$9;

    invoke-direct {v1, p0, v0, p1}, Lcom/kwad/components/ad/reward/g$9;-><init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/core/i/d;Lcom/kwad/components/core/i/c;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/tachikoma/e/a;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->oW:Lcom/kwad/components/core/webview/tachikoma/e/a;

    return-void
.end method

.method public final b(ILandroid/content/Context;II)V
    .locals 9

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 7
    invoke-virtual/range {v0 .. v8}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;IIJZLcom/kwad/sdk/core/adlog/c/b;)V

    return-void
.end method

.method public final b(Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->po:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/c/b;)V
    .locals 2

    .line 9
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1, p1}, Lcom/kwad/components/ad/reward/c/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/reward/c/b;)V

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/e/g;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oR:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->offer(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/g$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/g$b;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pF:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/k/a;)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oS:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/k/r;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oT:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/reward/m/c;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oU:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b(Lcom/kwad/components/core/i/a$a;)V
    .locals 1

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pG:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 14
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final b(Lcom/kwad/components/core/i/c;)V
    .locals 2

    .line 10
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 11
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/reward/e/f;->J(Ljava/lang/String;)Lcom/kwad/components/core/i/d;

    move-result-object v0

    .line 12
    new-instance v1, Lcom/kwad/components/ad/reward/g$10;

    invoke-direct {v1, p0, v0, p1}, Lcom/kwad/components/ad/reward/g$10;-><init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/core/i/d;Lcom/kwad/components/core/i/c;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c(Lcom/kwad/components/ad/reward/e/g;)V
    .locals 1
    .annotation build Landroidx/annotation/MainThread;
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oR:Ljava/util/PriorityQueue;

    invoke-virtual {v0, p1}, Ljava/util/PriorityQueue;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final d(Landroid/content/DialogInterface;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->po:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/DialogInterface$OnDismissListener;

    .line 4
    invoke-interface {v1, p1}, Landroid/content/DialogInterface$OnDismissListener;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lcom/kwad/components/core/playable/PlayableSource;)V
    .locals 0
    .param p1    # Lcom/kwad/components/core/playable/PlayableSource;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 5
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->pl:Lcom/kwad/components/core/playable/PlayableSource;

    return-void
.end method

.method public final d(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/g;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method public final d(ZZ)V
    .locals 1

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->jN()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 7
    new-instance v0, Lcom/kwad/components/ad/reward/g$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/components/ad/reward/g$2;-><init>(Lcom/kwad/components/ad/reward/g;ZZ)V

    const-wide/16 p1, 0x1f4

    invoke-static {v0, p1, p2}, Lcom/kwad/sdk/utils/bo;->runOnUiThreadDelay(Ljava/lang/Runnable;J)V

    :cond_0
    return-void
.end method

.method public final fA()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->tkLiveShopItemInfo:Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/TKAdLiveShopItemInfo;->itemId:Ljava/lang/String;

    return-object v0
.end method

.method public final fC()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/reward/g;->isMainThread()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/g;->fD()V

    return-void

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->fS:Landroid/os/Handler;

    new-instance v1, Lcom/kwad/components/ad/reward/g$6;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/g$6;-><init>(Lcom/kwad/components/ad/reward/g;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final fE()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pz:Z

    return v0
.end method

.method public final fF()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oW:Lcom/kwad/components/core/webview/tachikoma/e/a;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-interface {v0}, Lcom/kwad/components/core/webview/tachikoma/e/a;->jb()V

    return-void
.end method

.method public final fG()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pd:Z

    return v0
.end method

.method public final fH()Lcom/kwad/components/core/playable/PlayableSource;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pl:Lcom/kwad/components/core/playable/PlayableSource;

    return-object v0
.end method

.method public final fI()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->pm:Z

    return v0
.end method

.method public final fJ()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/kwad/components/core/i/a$a;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pG:Ljava/util/List;

    return-object v0
.end method

.method public final fK()Lcom/kwad/components/ad/reward/RewardRenderResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pD:Lcom/kwad/components/ad/reward/RewardRenderResult;

    return-object v0
.end method

.method public final fL()Z
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/ad/reward/RewardRenderResult;->NEO_TK:Lcom/kwad/components/ad/reward/RewardRenderResult;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/g;->pD:Lcom/kwad/components/ad/reward/RewardRenderResult;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final fM()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->py:Z

    return v0
.end method

.method public final fN()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->oX:Z

    return v0
.end method

.method public final fO()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->mRewardVerifyCalled:Z

    return v0
.end method

.method public final fP()V
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/reward/g;->pw:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v2, 0x3e8

    .line 2
    div-long/2addr v0, v2

    long-to-int v1, v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 3
    :goto_0
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->ad(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v2

    .line 5
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    return-void
.end method

.method public final fv()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->oY:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->oX:Z

    if-nez v0, :cond_3

    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->py:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/kwad/components/ad/reward/g;->pF:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/ad/reward/g$b;

    .line 3
    invoke-interface {v2}, Lcom/kwad/components/ad/reward/g$b;->interceptPlayCardResume()Z

    move-result v2

    or-int/2addr v0, v2

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    return-void

    .line 4
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/reward/g$a;

    .line 5
    invoke-interface {v1}, Lcom/kwad/components/ad/reward/g$a;->fW()V

    goto :goto_1

    :cond_3
    :goto_2
    return-void
.end method

.method public final fw()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->pE:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/reward/g$a;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/ad/reward/g$a;->fX()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final fy()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/reward/g;->oY:Z

    return v0
.end method

.method public final fz()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oU:Ljava/util/List;

    new-instance v1, Lcom/kwad/components/ad/reward/g$5;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/reward/g$5;-><init>(Lcom/kwad/components/ad/reward/g;)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/g;->a(Ljava/util/List;Lcom/kwad/sdk/f/a;)V

    return-void
.end method

.method public final release()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/g;->fB()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->release()V

    :cond_0
    return-void
.end method

.method public final y(Ljava/lang/String;)V
    .locals 4

    const/4 v0, -0x1

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zz()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/l/a;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/components/ad/reward/j/a;->a(Landroid/app/Activity;)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 4
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    iget-object v2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v3, p0, Lcom/kwad/components/ad/reward/g;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {v1, v2, p1, v0, v3}, Lcom/kwad/components/ad/reward/j/b;->a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;ILorg/json/JSONObject;)V

    return-void
.end method

.method public final z(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/components/ad/reward/g;->oY:Z

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fw()V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/g;->fv()V

    return-void
.end method
