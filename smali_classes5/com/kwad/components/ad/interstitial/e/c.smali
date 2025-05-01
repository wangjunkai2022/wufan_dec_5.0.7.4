.class public final Lcom/kwad/components/ad/interstitial/e/c;
.super Lcom/kwad/sdk/mvp/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/ad/interstitial/e/c$b;,
        Lcom/kwad/components/ad/interstitial/e/c$c;,
        Lcom/kwad/components/ad/interstitial/e/c$d;,
        Lcom/kwad/components/ad/interstitial/e/c$a;
    }
.end annotation


# instance fields
.field public dU:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public eN:Lcom/kwad/sdk/core/video/videoview/a;

.field private fS:Landroid/os/Handler;

.field public ib:Lcom/kwad/components/ad/interstitial/f/b;

.field public ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

.field public io:Lcom/kwad/components/ad/interstitial/d;

.field public jL:Lcom/kwad/components/ad/interstitial/g/d;

.field public jM:Z

.field public jN:Z

.field public jO:Z

.field public jP:Lcom/kwad/components/ad/interstitial/e/c$a;

.field public jQ:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/interstitial/e/c$a;",
            ">;"
        }
    .end annotation
.end field

.field public jR:Lcom/kwad/components/core/webview/tachikoma/e/e;

.field public jS:Lcom/kwad/sdk/widget/KSFrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field public jT:Lcom/kwad/components/ad/interstitial/e/c$d;

.field public jU:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/ad/interstitial/e/c$c;",
            ">;"
        }
    .end annotation
.end field

.field public jV:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/video/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public volatile jW:Z

.field public jX:Z

.field public jY:Z

.field public jZ:I

.field public mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

.field public mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/mvp/a;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jQ:Ljava/util/List;

    .line 3
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->fS:Landroid/os/Handler;

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jW:Z

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jZ:I

    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    .line 7
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jU:Ljava/util/List;

    return-void
.end method

.method private static a(JLcom/kwad/sdk/core/response/model/AdTemplate;)I
    .locals 4
    .param p2    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, -0x1

    const-wide/16 v1, -0x1

    cmp-long v3, p0, v1

    if-nez v3, :cond_0

    return v0

    .line 55
    :cond_0
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p2

    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->M(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v1

    long-to-float p2, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p2, v1

    const/4 v1, 0x0

    cmpl-float v1, p2, v1

    if-eqz v1, :cond_1

    long-to-float p0, p0

    div-float/2addr p0, p2

    const/high16 p1, 0x42c80000    # 100.0f

    mul-float p0, p0, p1

    .line 56
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :cond_1
    return v0
.end method

.method private static a(Lcom/kwad/sdk/core/video/videoview/a;)J
    .locals 2
    .param p0    # Lcom/kwad/sdk/core/video/videoview/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p0, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    .line 54
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->getCurrentPosition()J

    move-result-wide v0

    return-wide v0
.end method

.method private a(IILandroid/content/Context;JJ)V
    .locals 1

    .line 29
    iget-object p3, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 30
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/adlog/c/b;->cR(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object p1

    .line 31
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object p1

    .line 32
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p2

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    const/4 p2, 0x2

    goto :goto_0

    :cond_0
    const/4 p2, 0x1

    :goto_0
    invoke-virtual {p1, p2}, Lcom/kwad/sdk/core/adlog/c/b;->cY(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lcom/kwad/sdk/core/adlog/c/b;->Ca()Lcom/kwad/sdk/core/adlog/c/a;

    move-result-object p1

    const/4 p2, 0x0

    .line 34
    invoke-static {p3, p1, p2}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/a;Lorg/json/JSONObject;)V

    .line 35
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jM:Z

    .line 36
    iget-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez p1, :cond_1

    .line 37
    invoke-virtual {p0, p4, p5, p6, p7}, Lcom/kwad/components/ad/interstitial/e/c;->b(JJ)V

    :cond_1
    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/interstitial/e/c;IILandroid/content/Context;JJ)V
    .locals 8

    const-wide/16 v4, 0x6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-wide v6, p6

    .line 1
    invoke-direct/range {v0 .. v7}, Lcom/kwad/components/ad/interstitial/e/c;->a(IILandroid/content/Context;JJ)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;)Z
    .locals 0

    .line 39
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->aV(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 40
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static b(Lcom/kwad/sdk/core/video/videoview/a;)I
    .locals 7
    .param p0    # Lcom/kwad/sdk/core/video/videoview/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, -0x1

    if-nez p0, :cond_0

    return v0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->getDuration()J

    move-result-wide v1

    .line 31
    invoke-virtual {p0}, Lcom/kwad/sdk/core/video/videoview/a;->getCurrentPosition()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long p0, v1, v5

    if-eqz p0, :cond_1

    long-to-float p0, v3

    long-to-float v0, v1

    div-float/2addr p0, v0

    const/high16 v0, 0x42c80000    # 100.0f

    mul-float p0, p0, v0

    .line 32
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result v0

    :cond_1
    return v0
.end method

.method static synthetic c(Lcom/kwad/components/ad/interstitial/e/c;)Landroid/os/Handler;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/interstitial/e/c;->fS:Landroid/os/Handler;

    return-object p0
.end method


# virtual methods
.method public final J(Landroid/content/Context;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bI(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result p1

    return p1

    .line 4
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "isPlayable illegal params: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", context: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "InterstitialCallerContext"

    invoke-static {v0, p1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method

.method public final a(Landroid/content/Context;III)V
    .locals 6

    .line 19
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/a;->dN()Lcom/kwad/components/ad/interstitial/report/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    int-to-long v4, p2

    const-wide/16 v2, 0x6

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/interstitial/report/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JJ)V

    .line 20
    new-instance p3, Lcom/kwad/components/core/e/d/a$a;

    invoke-direct {p3, p1}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object p4, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 21
    invoke-virtual {p3, p4}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p3

    iget-object p4, p0, Lcom/kwad/components/ad/interstitial/e/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 22
    invoke-virtual {p3, p4}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p3

    const/4 p4, 0x0

    .line 23
    invoke-virtual {p3, p4}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p3

    const/4 p4, 0x2

    .line 24
    invoke-virtual {p3, p4}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p3

    const/4 p4, 0x6

    .line 25
    invoke-virtual {p3, p4}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p3

    .line 26
    invoke-virtual {p3, p2}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p3

    new-instance p4, Lcom/kwad/components/ad/interstitial/e/c$2;

    const/16 v0, 0x9

    invoke-direct {p4, p0, v0, p2, p1}, Lcom/kwad/components/ad/interstitial/e/c$2;-><init>(Lcom/kwad/components/ad/interstitial/e/c;IILandroid/content/Context;)V

    .line 27
    invoke-virtual {p3, p4}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 28
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method

.method public final a(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdInfo;Lcom/kwad/sdk/core/response/model/AdTemplate;Landroid/view/View;)V
    .locals 2
    .param p4    # Landroid/view/View;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    if-nez p4, :cond_0

    return-void

    .line 41
    :cond_0
    invoke-static {p2}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object p2

    .line 42
    invoke-virtual {p2}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object p2

    .line 43
    invoke-static {p2}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 44
    :cond_1
    sget-object v0, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->IMGOPTION_NORMAL:Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/c$3;

    invoke-direct {v1, p0, p1, p4}, Lcom/kwad/components/ad/interstitial/e/c$3;-><init>(Lcom/kwad/components/ad/interstitial/e/c;Landroid/content/Context;Landroid/view/View;)V

    invoke-static {p2, p3, v0, v1}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/imageloader/core/DisplayImageOptionsCompat;Lcom/kwad/sdk/core/imageloader/core/listener/ImageLoadingListener;)V

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/interstitial/e/c$a;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 38
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jQ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/kwad/components/ad/interstitial/e/c$b;)V
    .locals 6

    .line 4
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/a;->dN()Lcom/kwad/components/ad/interstitial/report/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->c(Lcom/kwad/components/ad/interstitial/e/c$b;)I

    move-result v2

    int-to-long v4, v2

    const-wide/16 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/interstitial/report/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JJ)V

    .line 5
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->cV()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-static {}, Lcom/kwad/components/ad/interstitial/b/b;->cH()Z

    move-result v2

    if-nez v2, :cond_1

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->cX()Z

    move-result v2

    if-nez v2, :cond_1

    iget-boolean v2, p1, Lcom/kwad/components/ad/interstitial/e/c$b;->kp:Z

    if-eqz v2, :cond_2

    .line 8
    :cond_1
    new-instance v2, Lcom/kwad/components/core/e/d/a$a;

    .line 9
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v3, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 10
    invoke-virtual {v2, v3}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/c;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    .line 11
    invoke-virtual {v2, v3}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v2

    .line 12
    invoke-virtual {v2, v0}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 13
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->al(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 14
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->c(Lcom/kwad/components/ad/interstitial/e/c$b;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 15
    invoke-virtual {v1}, Lcom/kwad/sdk/core/video/videoview/a;->getCurrentPosition()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/core/e/d/a$a;->v(J)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 16
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->cV()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/interstitial/e/c$1;

    invoke-direct {v1, p0, p1}, Lcom/kwad/components/ad/interstitial/e/c$1;-><init>(Lcom/kwad/components/ad/interstitial/e/c;Lcom/kwad/components/ad/interstitial/e/c$b;)V

    .line 17
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 18
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    :cond_2
    return-void
.end method

.method public final a(Lcom/kwad/components/core/video/a$c;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final a(ZILcom/kwad/sdk/core/video/videoview/a;)V
    .locals 12
    .param p3    # Lcom/kwad/sdk/core/video/videoview/a;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 45
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/a;->dN()Lcom/kwad/components/ad/interstitial/report/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v2, p0, Lcom/kwad/components/ad/interstitial/e/c;->jS:Lcom/kwad/sdk/widget/KSFrameLayout;

    const/4 v3, 0x1

    .line 46
    invoke-static {v2, v3}, Lcom/kwad/sdk/utils/br;->k(Landroid/view/View;Z)D

    move-result-wide v4

    .line 47
    invoke-virtual {v0, v1, v4, v5}, Lcom/kwad/components/ad/interstitial/report/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;D)V

    if-eqz p3, :cond_0

    .line 48
    invoke-static {p3}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/sdk/core/video/videoview/a;)J

    move-result-wide v0

    .line 49
    invoke-static {p3}, Lcom/kwad/components/ad/interstitial/e/c;->b(Lcom/kwad/sdk/core/video/videoview/a;)I

    move-result p2

    goto :goto_0

    :cond_0
    int-to-long v0, p2

    .line 50
    iget-object p2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v1, p2}, Lcom/kwad/components/ad/interstitial/e/c;->a(JLcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result p2

    :goto_0
    move v8, p2

    move-wide v6, v0

    if-eqz p1, :cond_1

    const/16 v3, 0xe

    const/16 v5, 0xe

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    .line 51
    :goto_1
    iget-object v4, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c;->io:Lcom/kwad/components/ad/interstitial/d;

    .line 52
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/d;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/sdk/utils/bn;->getTime()J

    move-result-wide v9

    const/4 v11, 0x0

    .line 53
    invoke-static/range {v4 .. v11}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJIJLorg/json/JSONObject;)V

    return-void
.end method

.method public final b(JJ)V
    .locals 2

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jQ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/interstitial/e/c$a;

    .line 22
    invoke-interface {v1, p1, p2, p3, p4}, Lcom/kwad/components/ad/interstitial/e/c$a;->b(JJ)V

    goto :goto_0

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jP:Lcom/kwad/components/ad/interstitial/e/c$a;

    if-eqz v0, :cond_1

    .line 24
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/kwad/components/ad/interstitial/e/c$a;->b(JJ)V

    .line 25
    :cond_1
    iget-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz p1, :cond_2

    .line 26
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onAdClicked()V

    :cond_2
    return-void
.end method

.method public final b(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 1

    .line 27
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jW:Z

    if-eqz v0, :cond_0

    return-void

    .line 28
    :cond_0
    invoke-static {p1, p2}, Lcom/kwad/components/core/page/a;->launch(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    const/4 p1, 0x1

    .line 29
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/c;->jW:Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/interstitial/e/c$a;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jQ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lcom/kwad/components/ad/interstitial/e/c$b;)V
    .locals 6

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    .line 4
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->cW()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->d(Lcom/kwad/components/ad/interstitial/e/c$b;)Z

    move-result v1

    if-nez v1, :cond_0

    const/16 v1, 0x99

    .line 5
    invoke-virtual {p1, v1}, Lcom/kwad/components/ad/interstitial/e/c$b;->A(I)Lcom/kwad/components/ad/interstitial/e/c$b;

    .line 6
    :cond_0
    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 7
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->cY()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 8
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 9
    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    const/4 v2, 0x2

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    :goto_0
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cY(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 10
    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->cZ()D

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Lcom/kwad/sdk/core/adlog/c/b;->l(D)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 11
    iget-object v2, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v4, 0x0

    invoke-static {v2, v1, v4}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 12
    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz v1, :cond_2

    .line 13
    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/sdk/core/video/videoview/a;)J

    move-result-wide v1

    .line 14
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/c;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-static {v4}, Lcom/kwad/components/ad/interstitial/e/c;->b(Lcom/kwad/sdk/core/video/videoview/a;)I

    move-result v4

    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->ao(J)Lcom/kwad/sdk/core/adlog/c/b;

    .line 16
    invoke-virtual {v0, v4}, Lcom/kwad/sdk/core/adlog/c/b;->cS(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 17
    :cond_2
    iput-boolean v3, p0, Lcom/kwad/components/ad/interstitial/e/c;->jM:Z

    .line 18
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v0, :cond_3

    const-wide/16 v0, 0x1

    .line 19
    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/e/c$b;->c(Lcom/kwad/components/ad/interstitial/e/c$b;)I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {p0, v0, v1, v2, v3}, Lcom/kwad/components/ad/interstitial/e/c;->b(JJ)V

    :cond_3
    return-void
.end method

.method public final b(Lcom/kwad/components/core/video/a$c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final cR()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onAdClosed()V

    :cond_0
    return-void
.end method

.method public final cS()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jT:Lcom/kwad/components/ad/interstitial/e/c$d;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/ad/interstitial/e/c$d;->db()V

    :cond_0
    return-void
.end method

.method public final cT()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/ad/interstitial/e/c$c;

    .line 2
    invoke-interface {v1}, Lcom/kwad/components/ad/interstitial/e/c$c;->da()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final cU()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jL:Lcom/kwad/components/ad/interstitial/g/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 2
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isH5Interstitial :"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "InterstitialCallerContext"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return v0
.end method

.method public final d(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    .line 2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/c;->n(Lcom/kwad/sdk/core/response/model/AdResultData;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method public final release()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->fS:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->jU:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c;->ib:Lcom/kwad/components/ad/interstitial/f/b;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->ub()V

    :cond_0
    return-void
.end method
