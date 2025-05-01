.class public final Lcom/kwad/components/ad/interstitial/e/e;
.super Lcom/kwad/components/ad/interstitial/e/b;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/a$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/interstitial/e/e$a;
    }
.end annotation


# static fields
.field private static kD:J = 0x3e8L


# instance fields
.field private jK:Lcom/kwad/components/ad/interstitial/e/c;

.field private kE:Lcom/kwad/components/ad/interstitial/e/e$a;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private kF:I

.field private mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/b;-><init>()V

    return-void
.end method

.method private D(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v2, 0x1

    if-nez p1, :cond_1

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->cU()Z

    move-result p1

    if-nez p1, :cond_2

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->b(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/e;->du()V

    .line 5
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    const/4 v0, -0x1

    iget-object v1, p1, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v2, v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->a(ZILcom/kwad/sdk/core/video/videoview/a;)V

    return-void

    .line 6
    :cond_1
    invoke-virtual {v1, v2, p1}, Lcom/kwad/components/ad/interstitial/g/d;->b(ZI)V

    :cond_2
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/e;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kF:I

    return p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/e;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/e/e;->D(I)V

    return-void
.end method

.method private du()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/video/videoview/a;->release()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/d;->dismiss()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->cR()V

    return-void
.end method

.method static synthetic dv()J
    .locals 2

    .line 1
    sget-wide v0, Lcom/kwad/components/ad/interstitial/e/e;->kD:J

    return-wide v0
.end method


# virtual methods
.method public final aj()V
    .locals 6

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/b;->aj()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " onBind"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InterstitialPlayablePresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->Kf()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/ad/interstitial/e/c;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    .line 4
    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 6
    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adInsertScreenInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdInsertScreenInfo;->autoCloseTime:I

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    .line 7
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/b/b;->b(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iput v2, p0, Lcom/kwad/components/ad/interstitial/e/e;->kF:I

    goto :goto_0

    .line 8
    :cond_0
    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/b/b;->b(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    iput v1, p0, Lcom/kwad/components/ad/interstitial/e/e;->kF:I

    .line 9
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    iget-object v1, v1, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    .line 10
    iget v3, p0, Lcom/kwad/components/ad/interstitial/e/e;->kF:I

    invoke-virtual {v1, v2, v3}, Lcom/kwad/components/ad/interstitial/g/d;->b(ZI)V

    .line 11
    :cond_1
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bb(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 12
    iput-object v1, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/core/video/a$c;)V

    return-void

    .line 14
    :cond_2
    new-instance v0, Lcom/kwad/components/ad/interstitial/e/e$a;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Lcom/kwad/components/ad/interstitial/e/e$a;-><init>(Lcom/kwad/components/ad/interstitial/e/e;B)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    const-wide/16 v2, 0x3e8

    .line 15
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/utils/bo;->a(Ljava/lang/Runnable;Ljava/lang/Object;J)V

    return-void
.end method

.method public final bl()V
    .locals 0

    return-void
.end method

.method public final bm()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/e/c;->cU()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {p0}, Lcom/kwad/sdk/mvp/Presenter;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/e;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/interstitial/e/c;->b(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 3
    invoke-direct {p0}, Lcom/kwad/components/ad/interstitial/e/e;->du()V

    :cond_0
    return-void
.end method

.method public final cP()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/b;->cP()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/e$a;->r(Z)V

    :cond_0
    return-void
.end method

.method public final cQ()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/interstitial/e/b;->cQ()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/e$a;->r(Z)V

    :cond_0
    return-void
.end method

.method public final e(J)V
    .locals 2

    const-wide/16 v0, 0x3e8

    .line 1
    div-long/2addr p1, v0

    long-to-int p2, p1

    .line 2
    iget p1, p0, Lcom/kwad/components/ad/interstitial/e/e;->kF:I

    sub-int/2addr p1, p2

    .line 3
    invoke-direct {p0, p1}, Lcom/kwad/components/ad/interstitial/e/e;->D(I)V

    return-void
.end method

.method public final onCreate()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    return-void
.end method

.method public final onUnbind()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onUnbind()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " onUnbind"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InterstitialPlayablePresenter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->jK:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-virtual {v0, p0}, Lcom/kwad/components/ad/interstitial/e/c;->b(Lcom/kwad/components/core/video/a$c;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/e$a;->q(Z)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->c(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/e;->kE:Lcom/kwad/components/ad/interstitial/e/e$a;

    :cond_0
    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 0

    return-void
.end method
