.class public final Lcom/kwad/components/ad/f/b/c;
.super Lcom/kwad/components/ad/f/a/a;
.source "SourceFile"


# instance fields
.field private cB:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private volatile cC:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/f/b/c;->cC:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/c;J)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/ad/f/b/c;->c(J)V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/c;Z)Z
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/components/ad/f/b/c;->cC:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method

.method static synthetic c(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

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
    iget-object p2, p0, Lcom/kwad/components/ad/f/b/c;->cB:Ljava/util/List;

    if-eqz p2, :cond_2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 4
    :cond_0
    iget-object p2, p0, Lcom/kwad/components/ad/f/b/c;->cB:Ljava/util/List;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt p1, v1, :cond_1

    .line 6
    iget-object p2, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object p2, p2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x0

    invoke-static {p2, p1, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    .line 7
    iget-object p1, p0, Lcom/kwad/components/ad/f/b/c;->cB:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method

.method static synthetic e(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method

.method static synthetic f(Lcom/kwad/components/ad/f/b/c;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/f/b/c;->cC:Z

    return p0
.end method

.method static synthetic g(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method

.method static synthetic h(Lcom/kwad/components/ad/f/b/c;)Lcom/kwad/components/ad/f/a/b;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    return-object p0
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/f/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bn(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/f/b/c;->cB:Ljava/util/List;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/f/b/c$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/b/c$1;-><init>(Lcom/kwad/components/ad/f/b/c;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/a/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/f/a/b;->mO:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method
