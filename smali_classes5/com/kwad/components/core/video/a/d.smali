.class public final Lcom/kwad/components/core/video/a/d;
.super Lcom/kwad/components/core/video/a/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/video/a/d$a;,
        Lcom/kwad/components/core/video/a/d$b;
    }
.end annotation


# instance fields
.field private VK:J

.field private VL:J

.field private VM:J

.field private VN:Ljava/lang/String;

.field private VO:Z

.field private VP:Z

.field private VQ:Z

.field private VR:J

.field private VS:J

.field private VT:J

.field private VU:J

.field private tW:Lcom/kwad/components/core/video/i;

.field private xM:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/video/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VO:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VP:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VQ:Z

    .line 5
    :try_start_0
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/components/core/video/a/d;->xM:Ljava/lang/String;

    .line 7
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dP(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VK:J

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VL:J

    .line 9
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->ch(Lcom/kwad/sdk/core/response/model/AdInfo;)J

    move-result-wide v1

    iput-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VM:J

    .line 10
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/components/core/video/a/d;->VN:Ljava/lang/String;

    .line 11
    new-instance p1, Lcom/kwad/components/core/video/i;

    invoke-direct {p1}, Lcom/kwad/components/core/video/i;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Lcom/kwad/components/core/video/a/a;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VO:Z

    .line 15
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VP:Z

    .line 16
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VQ:Z

    .line 17
    iput-object p1, p0, Lcom/kwad/components/core/video/a/d;->xM:Ljava/lang/String;

    .line 18
    new-instance p1, Lcom/kwad/components/core/video/i;

    invoke-direct {p1}, Lcom/kwad/components/core/video/i;-><init>()V

    iput-object p1, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    return-void
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/components/core/video/a/a;
    .locals 1

    .line 4
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atX:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/d;)Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p0, :cond_0

    .line 5
    new-instance p1, Lcom/kwad/components/core/video/a/d;

    invoke-direct {p1, p0}, Lcom/kwad/components/core/video/a/d;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object p1

    .line 6
    :cond_0
    new-instance p0, Lcom/kwad/components/core/video/a/d;

    if-nez p1, :cond_1

    invoke-direct {p0, p2}, Lcom/kwad/components/core/video/a/d;-><init>(Ljava/lang/String;)V

    return-object p0

    :cond_1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/video/a/d;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object p0

    .line 7
    :cond_2
    new-instance p0, Lcom/kwad/components/core/video/a/b;

    invoke-direct {p0}, Lcom/kwad/components/core/video/a/b;-><init>()V

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/core/video/a/d;II)Lcom/kwad/components/core/video/a/d$a;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/video/a/d;->o(II)Lcom/kwad/components/core/video/a/d$a;

    move-result-object p0

    return-object p0
.end method

.method private a(ZII)V
    .locals 7

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/core/video/a/d;->sC()Lcom/kwad/components/core/video/a/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/video/a/d$b;->sD()Lcom/kwad/components/core/video/a/d$b;

    move-result-object v4

    .line 3
    new-instance v0, Lcom/kwad/components/core/video/a/d$1;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v5, p2

    move v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/kwad/components/core/video/a/d$1;-><init>(Lcom/kwad/components/core/video/a/d;ZLcom/kwad/components/core/video/a/d$b;II)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public static az(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/video/a/a;
    .locals 1
    .param p0    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/kwad/sdk/core/config/c;->atX:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v0}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/video/a/d;

    invoke-direct {v0, p0}, Lcom/kwad/components/core/video/a/d;-><init>(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object v0

    :cond_0
    new-instance p0, Lcom/kwad/components/core/video/a/b;

    invoke-direct {p0}, Lcom/kwad/components/core/video/a/b;-><init>()V

    return-object p0
.end method

.method private b(ZII)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VQ:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sw()V

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VU:J

    .line 4
    invoke-direct {p0, p1, p2, p3}, Lcom/kwad/components/core/video/a/d;->a(ZII)V

    .line 5
    invoke-direct {p0}, Lcom/kwad/components/core/video/a/d;->reset()V

    :cond_0
    return-void
.end method

.method private o(II)Lcom/kwad/components/core/video/a/d$a;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/components/core/video/a/d$a;

    invoke-direct {v0}, Lcom/kwad/components/core/video/a/d$a;-><init>()V

    .line 2
    iput p1, v0, Lcom/kwad/components/core/video/a/d$a;->code:I

    .line 3
    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/kwad/components/core/video/a/d$a;->msg:Ljava/lang/String;

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/video/a/d;->xM:Ljava/lang/String;

    iput-object p1, v0, Lcom/kwad/components/core/video/a/d$a;->videoUrl:Ljava/lang/String;

    .line 5
    iget-wide p1, p0, Lcom/kwad/components/core/video/a/d;->VK:J

    iput-wide p1, v0, Lcom/kwad/components/core/video/a/d$a;->llsid:J

    .line 6
    iget-wide p1, p0, Lcom/kwad/components/core/video/a/d;->VL:J

    iput-wide p1, v0, Lcom/kwad/components/core/video/a/d$a;->creativeId:J

    .line 7
    iget-wide p1, p0, Lcom/kwad/components/core/video/a/d;->VM:J

    iput-wide p1, v0, Lcom/kwad/components/core/video/a/d$a;->SK:J

    .line 8
    iget-object p1, p0, Lcom/kwad/components/core/video/a/d;->VN:Ljava/lang/String;

    iput-object p1, v0, Lcom/kwad/components/core/video/a/d$a;->Wa:Ljava/lang/String;

    return-object v0
.end method

.method private reset()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->reset()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VR:J

    .line 3
    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VS:J

    .line 4
    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VU:J

    .line 5
    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VT:J

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VO:Z

    .line 7
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VP:Z

    .line 8
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VQ:Z

    return-void
.end method

.method private sC()Lcom/kwad/components/core/video/a/d$b;
    .locals 5

    .line 1
    new-instance v0, Lcom/kwad/components/core/video/a/d$b;

    invoke-direct {v0}, Lcom/kwad/components/core/video/a/d$b;-><init>()V

    .line 2
    iget-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VS:J

    iget-wide v3, p0, Lcom/kwad/components/core/video/a/d;->VR:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->Wb:J

    .line 3
    iget-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VT:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->Wc:J

    .line 4
    iget-object v1, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v1}, Lcom/kwad/components/core/video/i;->sy()Lcom/kwad/components/core/video/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/video/i$a;->sB()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->Wd:J

    .line 5
    iget-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VU:J

    iget-wide v3, p0, Lcom/kwad/components/core/video/a/d;->VR:J

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->videoDuration:J

    .line 6
    iget-object v1, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v1}, Lcom/kwad/components/core/video/i;->sy()Lcom/kwad/components/core/video/i$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/components/core/video/i$a;->sA()I

    move-result v1

    iput v1, v0, Lcom/kwad/components/core/video/a/d$b;->VI:I

    .line 7
    iget-object v1, p0, Lcom/kwad/components/core/video/a/d;->xM:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/components/core/video/a/d$b;->videoUrl:Ljava/lang/String;

    .line 8
    iget-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VK:J

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->llsid:J

    .line 9
    iget-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VL:J

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->creativeId:J

    .line 10
    iget-wide v1, p0, Lcom/kwad/components/core/video/a/d;->VM:J

    iput-wide v1, v0, Lcom/kwad/components/core/video/a/d$b;->SK:J

    .line 11
    iget-object v1, p0, Lcom/kwad/components/core/video/a/d;->VN:Ljava/lang/String;

    iput-object v1, v0, Lcom/kwad/components/core/video/a/d$b;->Wa:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final onMediaPlayError(II)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/video/l;->onMediaPlayError(II)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sw()V

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0, p1, p2}, Lcom/kwad/components/core/video/a/d;->b(ZII)V

    return-void
.end method

.method public final onMediaPlayPaused()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlayPaused()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sw()V

    return-void
.end method

.method public final onMediaPlayStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlayStart()V

    .line 2
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VP:Z

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VS:J

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VP:Z

    :cond_0
    return-void
.end method

.method public final onMediaPlaying()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlaying()V

    .line 2
    invoke-virtual {p0}, Lcom/kwad/components/core/video/a/d;->pc()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sw()V

    return-void
.end method

.method public final onRelease()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, v0, v1, v1}, Lcom/kwad/components/core/video/a/d;->b(ZII)V

    return-void
.end method

.method public final onReset()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, v0, v0}, Lcom/kwad/components/core/video/a/d;->b(ZII)V

    return-void
.end method

.method public final onStart()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VO:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VR:J

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VO:Z

    :cond_0
    return-void
.end method

.method public final onVideoPlayBufferingPaused()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onVideoPlayBufferingPaused()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sv()V

    return-void
.end method

.method public final onVideoPlayBufferingPlaying()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onVideoPlayBufferingPlaying()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/video/a/d;->tW:Lcom/kwad/components/core/video/i;

    invoke-virtual {v0}, Lcom/kwad/components/core/video/i;->sv()V

    return-void
.end method

.method public final pc()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VQ:Z

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/components/core/video/a/d;->VT:J

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/core/video/a/d;->VQ:Z

    :cond_0
    return-void
.end method
