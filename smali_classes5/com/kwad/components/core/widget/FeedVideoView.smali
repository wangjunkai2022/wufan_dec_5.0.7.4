.class public Lcom/kwad/components/core/widget/FeedVideoView;
.super Lcom/kwad/components/core/widget/b;
.source "SourceFile"

# interfaces
.implements Landroidx/core/view/NestedScrollingChild;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/widget/FeedVideoView$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/components/core/widget/b<",
        "Lcom/kwad/sdk/core/response/model/AdResultData;",
        "Lcom/kwad/sdk/core/response/model/AdTemplate;",
        ">;",
        "Landroidx/core/view/NestedScrollingChild;"
    }
.end annotation


# instance fields
.field private QQ:Lcom/kwad/components/core/video/e;

.field private Qy:Landroidx/core/view/NestedScrollingChildHelper;

.field private acA:Landroid/widget/TextView;

.field private acB:Landroid/view/ViewGroup;

.field private acC:Landroid/view/ViewGroup;

.field private acD:I

.field private acE:Z

.field private acF:Z

.field private acG:J

.field private acH:Z

.field private acI:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

.field private acJ:Lcom/kwad/components/core/widget/FeedVideoView$a;

.field private acK:Landroid/view/View;

.field private acL:Z

.field private acM:Ljava/lang/Runnable;

.field private acN:Lcom/kwad/components/core/s/o;

.field private acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

.field private aco:Landroid/widget/TextView;

.field private acp:Landroid/widget/TextView;

.field private acq:Landroid/widget/TextView;

.field private acr:Landroid/view/View;

.field private acs:Lcom/kwad/components/core/widget/KSCornerImageView;

.field private act:Landroid/widget/TextView;

.field private acu:Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;

.field private acv:Landroid/widget/ImageView;

.field private acw:Landroid/widget/ImageView;

.field private acx:Landroid/widget/ImageView;

.field private acy:Landroid/view/ViewGroup;

.field private acz:Landroid/view/ViewGroup;

.field private bU:Landroid/view/View$OnClickListener;

.field private cB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private cx:Lcom/kwad/sdk/api/KsAppDownloadListener;

.field private eB:Landroid/widget/TextView;

.field private eM:Landroid/widget/ImageView;

.field private eN:Lcom/kwad/sdk/core/video/videoview/a;

.field private mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/widget/b;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x64

    .line 2
    iput p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    .line 3
    new-instance p1, Lcom/kwad/components/core/widget/FeedVideoView$5;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/widget/FeedVideoView$5;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    iput-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acM:Ljava/lang/Runnable;

    .line 4
    new-instance v0, Lcom/kwad/components/core/s/o;

    invoke-direct {v0, p1}, Lcom/kwad/components/core/s/o;-><init>(Ljava/lang/Runnable;)V

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

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

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x64

    .line 6
    iput p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    .line 7
    new-instance p1, Lcom/kwad/components/core/widget/FeedVideoView$5;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/widget/FeedVideoView$5;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    iput-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acM:Ljava/lang/Runnable;

    .line 8
    new-instance p2, Lcom/kwad/components/core/s/o;

    invoke-direct {p2, p1}, Lcom/kwad/components/core/s/o;-><init>(Ljava/lang/Runnable;)V

    iput-object p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

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

    .line 9
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/core/widget/b;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x64

    .line 10
    iput p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    .line 11
    new-instance p1, Lcom/kwad/components/core/widget/FeedVideoView$5;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/widget/FeedVideoView$5;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    iput-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acM:Ljava/lang/Runnable;

    .line 12
    new-instance p2, Lcom/kwad/components/core/s/o;

    invoke-direct {p2, p1}, Lcom/kwad/components/core/s/o;-><init>(Ljava/lang/Runnable;)V

    iput-object p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acq:Landroid/widget/TextView;

    return-object p0
.end method

.method private a(Lcom/kwad/components/core/video/a;Lcom/kwad/sdk/core/video/videoview/a;)V
    .locals 2

    .line 70
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    new-instance v1, Lcom/kwad/components/core/widget/FeedVideoView$6;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/widget/FeedVideoView$6;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    new-instance v0, Lcom/kwad/components/core/widget/FeedVideoView$7;

    invoke-direct {v0, p0, p2}, Lcom/kwad/components/core/widget/FeedVideoView$7;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;Lcom/kwad/sdk/core/video/videoview/a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/a;->setVideoPlayCallback(Lcom/kwad/components/core/video/a$c;)V

    .line 72
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    new-instance v0, Lcom/kwad/components/core/widget/FeedVideoView$8;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/widget/FeedVideoView$8;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/video/a;->setAdClickListener(Lcom/kwad/components/core/video/a$a;)V

    .line 73
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acu:Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;

    new-instance v0, Lcom/kwad/components/core/widget/FeedVideoView$9;

    invoke-direct {v0, p0, p2}, Lcom/kwad/components/core/widget/FeedVideoView$9;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;Lcom/kwad/sdk/core/video/videoview/a;)V

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->setOnSeekBarChangeListener(Lcom/kwad/sdk/core/view/ScaleAnimSeekBar$a;)V

    .line 74
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acv:Landroid/widget/ImageView;

    new-instance v0, Lcom/kwad/components/core/widget/FeedVideoView$10;

    invoke-direct {v0, p0, p2}, Lcom/kwad/components/core/widget/FeedVideoView$10;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;Lcom/kwad/sdk/core/video/videoview/a;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 75
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    new-instance p2, Lcom/kwad/components/core/widget/FeedVideoView$11;

    invoke-direct {p2, p0}, Lcom/kwad/components/core/widget/FeedVideoView$11;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 76
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acz:Landroid/view/ViewGroup;

    new-instance p2, Lcom/kwad/components/core/widget/FeedVideoView$2;

    invoke-direct {p2, p0}, Lcom/kwad/components/core/widget/FeedVideoView$2;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 77
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acw:Landroid/widget/ImageView;

    new-instance p2, Lcom/kwad/components/core/widget/FeedVideoView$3;

    invoke-direct {p2, p0}, Lcom/kwad/components/core/widget/FeedVideoView$3;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/widget/FeedVideoView;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/widget/FeedVideoView;->c(J)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/core/widget/FeedVideoView;Z)Z
    .locals 0

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acL:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/view/View$OnClickListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->bU:Landroid/view/View$OnClickListener;

    return-object p0
.end method

.method static synthetic b(Lcom/kwad/components/core/widget/FeedVideoView;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acH:Z

    return p1
.end method

.method static synthetic c(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/view/ViewGroup;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acy:Landroid/view/ViewGroup;

    return-object p0
.end method

.method private c(J)V
    .locals 2

    long-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    float-to-double p1, p1

    .line 2
    invoke-static {p1, p2}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p1

    double-to-int p1, p1

    .line 3
    iget-object p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cB:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cB:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 5
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 6
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 9
    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/core/widget/FeedVideoView;)Lcom/kwad/components/core/video/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/core/widget/FeedVideoView;)Lcom/kwad/sdk/core/video/videoview/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/components/core/widget/FeedVideoView;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acM:Ljava/lang/Runnable;

    return-object p0
.end method

.method private getAppDownloadListener()Lcom/kwad/sdk/api/KsAppDownloadListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cx:Lcom/kwad/sdk/api/KsAppDownloadListener;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/widget/FeedVideoView$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/widget/FeedVideoView$1;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cx:Lcom/kwad/sdk/api/KsAppDownloadListener;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cx:Lcom/kwad/sdk/api/KsAppDownloadListener;

    return-object v0
.end method

.method static synthetic h(Lcom/kwad/components/core/widget/FeedVideoView;)Lcom/kwad/components/core/s/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

    return-object p0
.end method

.method static synthetic i(Lcom/kwad/components/core/widget/FeedVideoView;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    return p0
.end method

.method static synthetic j(Lcom/kwad/components/core/widget/FeedVideoView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acH:Z

    return p0
.end method

.method static synthetic k(Lcom/kwad/components/core/widget/FeedVideoView;)Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acu:Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;

    return-object p0
.end method

.method static synthetic l(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acp:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic m(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->aco:Landroid/widget/TextView;

    return-object p0
.end method

.method static synthetic n(Lcom/kwad/components/core/widget/FeedVideoView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acL:Z

    return p0
.end method

.method static synthetic o(Lcom/kwad/components/core/widget/FeedVideoView;)Lcom/kwad/components/core/e/d/c;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    return-object p0
.end method

.method static synthetic p(Lcom/kwad/components/core/widget/FeedVideoView;)Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acv:Landroid/widget/ImageView;

    return-object p0
.end method

.method static synthetic q(Lcom/kwad/components/core/widget/FeedVideoView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->tT()V

    return-void
.end method

.method static synthetic r(Lcom/kwad/components/core/widget/FeedVideoView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->tS()V

    return-void
.end method

.method private tR()Z
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    .line 2
    iget-wide v2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acG:J

    sub-long v2, v0, v2

    const-wide/16 v4, 0x378

    cmp-long v6, v2, v4

    if-lez v6, :cond_0

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acG:J

    :cond_0
    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private tS()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acJ:Lcom/kwad/components/core/widget/FeedVideoView$a;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Lcom/kwad/components/core/widget/FeedVideoView$a;->pP()V

    .line 3
    :cond_0
    iget v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    const/16 v1, 0x64

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->tR()Z

    move-result v1

    and-int/2addr v0, v1

    if-eqz v0, :cond_6

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acz:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acA:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->adDescription:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->R(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v0

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->Q(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    if-le v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    .line 8
    :goto_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/aj;->cy(Landroid/content/Context;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acE:Z

    .line 9
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v1

    iput-boolean v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acF:Z

    if-nez v0, :cond_3

    .line 10
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/aj;->cA(Landroid/content/Context;)V

    goto :goto_2

    .line 11
    :cond_3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/aj;->cB(Landroid/content/Context;)V

    .line 12
    :goto_2
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 13
    iput-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acC:Landroid/view/ViewGroup;

    if-eqz v1, :cond_4

    .line 14
    iget-object v4, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 15
    new-instance v4, Landroid/view/View;

    iget-object v5, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v4, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acK:Landroid/view/View;

    .line 16
    new-instance v5, Landroid/view/ViewGroup$LayoutParams;

    iget-object v6, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v6}, Landroid/view/ViewGroup;->getWidth()I

    move-result v6

    iget-object v7, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    .line 17
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getHeight()I

    move-result v7

    invoke-direct {v5, v6, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 18
    invoke-virtual {v4, v5}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    iget-object v4, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acK:Landroid/view/View;

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 20
    :cond_4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Lcom/kwad/sdk/utils/aj;->b(Landroid/content/Context;Z)V

    .line 21
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/n/l;->dB(Landroid/content/Context;)Landroid/app/Activity;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 22
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    .line 23
    iget-object v3, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    new-instance v4, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v5

    .line 24
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v6

    invoke-direct {v4, v5, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 25
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    if-ne v0, v2, :cond_5

    .line 26
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    if-eqz v0, :cond_5

    .line 27
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    invoke-virtual {v0, v2, v3}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 28
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v0, 0x65

    .line 29
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/widget/FeedVideoView;->setUIWithStateAndMode(I)V

    :cond_6
    return-void
.end method

.method private tT()V
    .locals 5

    .line 1
    iget v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    const/4 v1, 0x1

    const/16 v2, 0x65

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->tR()Z

    move-result v2

    and-int/2addr v0, v2

    if-eqz v0, :cond_5

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acz:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-boolean v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acE:Z

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/aj;->cy(Landroid/content/Context;)Z

    goto :goto_1

    .line 5
    :cond_1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/aj;->cz(Landroid/content/Context;)V

    .line 6
    :goto_1
    iget-boolean v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acF:Z

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/aj;->cB(Landroid/content/Context;)V

    goto :goto_2

    .line 8
    :cond_2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/utils/aj;->cA(Landroid/content/Context;)V

    .line 9
    :goto_2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/kwad/sdk/utils/aj;->b(Landroid/content/Context;Z)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 12
    :cond_3
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    iget-object v2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acC:Landroid/view/ViewGroup;

    .line 13
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acC:Landroid/view/ViewGroup;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    const-wide v1, 0x3fe1eb8520000000L    # 0.5600000023841858

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 16
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acK:Landroid/view/View;

    if-eqz v0, :cond_4

    .line 17
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acC:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acK:Landroid/view/View;

    .line 19
    :cond_4
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acC:Landroid/view/ViewGroup;

    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v3, -0x1

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->requestLayout()V

    const/16 v0, 0x64

    .line 21
    invoke-virtual {p0, v0}, Lcom/kwad/components/core/widget/FeedVideoView;->setUIWithStateAndMode(I)V

    .line 22
    :cond_5
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acJ:Lcom/kwad/components/core/widget/FeedVideoView$a;

    if-eqz v0, :cond_6

    .line 23
    invoke-interface {v0}, Lcom/kwad/components/core/widget/FeedVideoView$a;->pQ()V

    :cond_6
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/widget/KSFrameLayout;->A(Landroid/view/View;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/api/KsAdVideoPlayConfig;Lcom/kwad/components/core/e/d/c;)V
    .locals 9
    .param p1    # Lcom/kwad/sdk/api/KsAdVideoPlayConfig;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 4
    iput-object p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    const/4 p2, 0x0

    .line 5
    iput-boolean p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acL:Z

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bs(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/b;

    move-result-object v0

    .line 7
    iput-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acI:Lcom/kwad/sdk/api/KsAdVideoPlayConfig;

    .line 8
    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/model/b;->getUrl()Ljava/lang/String;

    move-result-object v0

    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-nez v1, :cond_0

    .line 10
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eM:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eM:Landroid/widget/ImageView;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1, v0, v4}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 12
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eM:Landroid/widget/ImageView;

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eM:Landroid/widget/ImageView;

    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bn(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cB:Ljava/util/List;

    .line 15
    iget-object v0, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 17
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->getInstance()Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->eG(Ljava/lang/String;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 18
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->ap(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 19
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eB:Landroid/widget/TextView;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 20
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acr:Landroid/view/View;

    if-eqz v1, :cond_5

    .line 21
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 22
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acq:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v4}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->act:Landroid/widget/TextView;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v4}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acs:Lcom/kwad/components/core/widget/KSCornerImageView;

    iget-object v4, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v4}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v6, 0x4

    invoke-static {v1, v4, v5, v6}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadAppIcon(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 25
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    if-eqz v1, :cond_2

    .line 26
    invoke-direct {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->getAppDownloadListener()Lcom/kwad/sdk/api/KsAppDownloadListener;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/kwad/components/core/e/d/c;->b(Lcom/kwad/sdk/api/KsAppDownloadListener;)V

    .line 27
    :cond_2
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acq:Landroid/widget/TextView;

    new-instance v4, Lcom/kwad/components/core/widget/FeedVideoView$4;

    invoke-direct {v4, p0}, Lcom/kwad/components/core/widget/FeedVideoView$4;-><init>(Lcom/kwad/components/core/widget/FeedVideoView;)V

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 28
    :cond_3
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acr:Landroid/view/View;

    if-eqz v1, :cond_4

    .line 29
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    :cond_4
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eB:Landroid/widget/TextView;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    const/4 v4, 0x1

    if-nez v1, :cond_6

    .line 32
    new-instance v1, Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Lcom/kwad/sdk/core/video/videoview/a;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    .line 33
    iget-object v1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->aa(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    .line 34
    new-instance v1, Lcom/kwad/sdk/contentalliance/a/a/b$a;

    iget-object v5, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {v1, v5}, Lcom/kwad/sdk/contentalliance/a/a/b$a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    iget-object v5, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v5, v5, Lcom/kwad/sdk/core/response/model/AdTemplate;->mVideoPlayerStatus:Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;

    .line 35
    invoke-virtual {v1, v5}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->a(Lcom/kwad/sdk/core/response/model/VideoPlayerStatus;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v1

    iget-object v5, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 36
    invoke-static {v5}, Lcom/kwad/sdk/core/response/b/e;->dU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->da(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v1

    iget-object v5, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 37
    invoke-static {v5}, Lcom/kwad/sdk/core/response/b/e;->dT(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/PhotoInfo;

    move-result-object v5

    invoke-static {v5}, Lcom/kwad/sdk/core/response/b/h;->b(Lcom/kwad/sdk/core/response/model/PhotoInfo;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->db(Ljava/lang/String;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v1

    new-instance v5, Lcom/kwad/sdk/contentalliance/a/a/a;

    iget-object v6, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    invoke-direct {v5, v6, v7, v8}, Lcom/kwad/sdk/contentalliance/a/a/a;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    invoke-virtual {v1, v5}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->b(Lcom/kwad/sdk/contentalliance/a/a/a;)Lcom/kwad/sdk/contentalliance/a/a/b$a;

    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lcom/kwad/sdk/contentalliance/a/a/b$a;->BJ()Lcom/kwad/sdk/contentalliance/a/a/b;

    move-result-object v1

    .line 40
    iget-object v5, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v5, v1, v2}, Lcom/kwad/sdk/core/video/videoview/a;->a(Lcom/kwad/sdk/contentalliance/a/a/b;Ljava/util/Map;)V

    .line 41
    new-instance v1, Lcom/kwad/components/core/video/e;

    iget-object v5, p0, Lcom/kwad/components/core/widget/b;->mContext:Landroid/content/Context;

    iget-object v6, p0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v7, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-direct {v1, v5, v6, v7, p1}, Lcom/kwad/components/core/video/e;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/video/videoview/c;Lcom/kwad/sdk/api/KsAdVideoPlayConfig;)V

    iput-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    .line 42
    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isDataFlowAutoStart()Z

    move-result v5

    invoke-virtual {v1, v5}, Lcom/kwad/components/core/video/a;->setDataFlowAutoStart(Z)V

    .line 43
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    iget-object v5, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {v1, v5}, Lcom/kwad/sdk/core/video/videoview/a;->setController(Lcom/kwad/sdk/core/video/videoview/b;)V

    .line 44
    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {v1, p2}, Lcom/kwad/components/core/video/e;->setAutoRelease(Z)V

    .line 45
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Cd()I

    move-result v1

    const/4 v5, 0x2

    if-ne v1, v5, :cond_8

    .line 46
    invoke-static {}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->getInstance()Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;

    move-result-object v1

    iget-object v5, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v1, v0, v5}, Lcom/kwad/sdk/core/video/videoview/AdVideoPlayerViewCache;->a(Ljava/lang/String;Lcom/kwad/sdk/core/video/videoview/a;)V

    goto :goto_3

    .line 47
    :cond_6
    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    .line 48
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->cB:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 50
    :cond_7
    :goto_2
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/video/videoview/a;->getController()Lcom/kwad/sdk/core/video/videoview/b;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/video/e;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    .line 51
    invoke-virtual {v0, p2}, Lcom/kwad/components/core/video/e;->setAutoRelease(Z)V

    .line 52
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/a;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iput-boolean v4, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdWebVideoPageShowing:Z

    .line 53
    :cond_8
    :goto_3
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-interface {p1}, Lcom/kwad/sdk/api/KsAdVideoPlayConfig;->isVideoSoundEnable()Z

    move-result p1

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    .line 54
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_9

    .line 55
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    .line 56
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 57
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {p1}, Lcom/kwad/components/core/video/e;->sm()V

    .line 58
    :cond_9
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 59
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->removeView(Landroid/view/View;)V

    .line 60
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 61
    :cond_a
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 62
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 63
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acy:Landroid/view/ViewGroup;

    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 64
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    invoke-virtual {p1, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 65
    iget-object p1, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo;->adConversionInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;

    iget p1, p1, Lcom/kwad/sdk/core/response/model/AdInfo$AdConversionInfo;->h5Type:I

    if-ne p1, v4, :cond_b

    .line 66
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eB:Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_4

    .line 67
    :cond_b
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eB:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 68
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eB:Landroid/widget/TextView;

    iget-object p2, p0, Lcom/kwad/components/core/widget/b;->mAdInfo:Lcom/kwad/sdk/core/response/model/AdInfo;

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-object p2, p2, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->adDescription:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 69
    :goto_4
    iget-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    iget-object p2, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/widget/FeedVideoView;->a(Lcom/kwad/components/core/video/a;Lcom/kwad/sdk/core/video/videoview/a;)V

    return-void
.end method

.method public final aM()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->aM()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/video/videoview/a;->isPlaying()Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->qA()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/widget/b;->aN()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->rT()V

    .line 4
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acN:Lcom/kwad/components/core/s/o;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_0
    return-void
.end method

.method public final b(Lcom/kwad/sdk/core/response/model/AdResultData;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 3
    invoke-super {p0, p1}, Lcom/kwad/components/core/widget/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    return-void
.end method

.method protected final bc()V
    .locals 3

    .line 1
    new-instance v0, Landroidx/core/view/NestedScrollingChildHelper;

    invoke-direct {v0, p0}, Landroidx/core/view/NestedScrollingChildHelper;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/widget/RatioFrameLayout;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acn:Lcom/kwad/sdk/widget/RatioFrameLayout;

    const-wide v1, 0x3fe1eb8520000000L    # 0.5600000023841858

    .line 3
    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 4
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_first_frame_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eM:Landroid/widget/ImageView;

    .line 5
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_text_below:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eB:Landroid/widget/TextView;

    .line 6
    sget v0, Lcom/kwad/sdk/R$id;->ksad_web_video_seek_bar:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acu:Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;

    const/16 v1, 0x64

    .line 7
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->setMaxProgress(I)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acu:Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/view/ScaleAnimSeekBar;->setMinProgress(I)V

    .line 9
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_text_below_action_bar:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acq:Landroid/widget/TextView;

    .line 10
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_text_below_action_icon_layout:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acr:Landroid/view/View;

    .line 11
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_text_below_action_title:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->act:Landroid/widget/TextView;

    .line 12
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_text_below_action_icon:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/kwad/components/core/widget/KSCornerImageView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acs:Lcom/kwad/components/core/widget/KSCornerImageView;

    .line 13
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_play_total:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->aco:Landroid/widget/TextView;

    .line 14
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_play_duration:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acp:Landroid/widget/TextView;

    .line 15
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_play_button:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acv:Landroid/widget/ImageView;

    .line 16
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_play_status:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    .line 17
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_fullscreen:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acw:Landroid/widget/ImageView;

    .line 18
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acy:Landroid/view/ViewGroup;

    .line 19
    sget v0, Lcom/kwad/sdk/R$id;->ksad_feed_video_container:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acB:Landroid/view/ViewGroup;

    .line 20
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_fullscreen_container:I

    .line 21
    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acz:Landroid/view/ViewGroup;

    .line 22
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_control_fullscreen_title:I

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acA:Landroid/widget/TextView;

    return-void
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedFling(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedPreScroll(II[I[I)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/view/NestedScrollingChildHelper;->dispatchNestedScroll(IIII[I)Z

    move-result p1

    return p1
.end method

.method protected getLayoutId()I
    .locals 1

    .line 1
    sget v0, Lcom/kwad/sdk/R$layout;->ksad_feed_video:I

    return v0
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->hasNestedScrollingParent()Z

    move-result v0

    return v0
.end method

.method public final isComplete()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->eN:Lcom/kwad/sdk/core/video/videoview/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/video/videoview/a;->isCompleted()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->isNestedScrollingEnabled()Z

    move-result v0

    return v0
.end method

.method public final qA()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/e;->sp()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setAlpha(F)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acv:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_video_player_pause_btn:I

    .line 5
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_video_player_pause_center:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final qw()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/e;->sm()V

    return-void
.end method

.method public final rT()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/e;->so()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acx:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_video_play_176:I

    .line 4
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acv:Landroid/widget/ImageView;

    .line 7
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_video_player_play_btn:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final release()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->QQ:Lcom/kwad/components/core/video/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/video/a;->release()V

    :cond_0
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public setOnEndBtnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->bU:Landroid/view/View$OnClickListener;

    return-void
.end method

.method protected setUIWithStateAndMode(I)V
    .locals 3

    const/16 v0, 0x65

    if-ne p1, v0, :cond_0

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acw:Landroid/widget/ImageView;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_video_player_exit_fullscreen_btn:I

    .line 2
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acw:Landroid/widget/ImageView;

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/kwad/sdk/R$drawable;->ksad_video_player_fullscreen_btn:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 7
    :goto_0
    iput p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    return-void
.end method

.method public setWindowFullScreenListener(Lcom/kwad/components/core/widget/FeedVideoView$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acJ:Lcom/kwad/components/core/widget/FeedVideoView$a;

    return-void
.end method

.method public startNestedScroll(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0, p1}, Landroidx/core/view/NestedScrollingChildHelper;->startNestedScroll(I)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->Qy:Landroidx/core/view/NestedScrollingChildHelper;

    invoke-virtual {v0}, Landroidx/core/view/NestedScrollingChildHelper;->stopNestedScroll()V

    return-void
.end method

.method public final tU()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/components/core/widget/FeedVideoView;->acD:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/widget/FeedVideoView;->tT()V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
