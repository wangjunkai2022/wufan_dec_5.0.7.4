.class public final Lcom/kwad/components/ad/f/b/e;
.super Lcom/kwad/components/ad/f/a/a;
.source "SourceFile"


# instance fields
.field private bR:Z

.field private mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/f/b/e;->bR:Z

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/components/ad/f/b/e;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/e;Z)Z
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/f/b/e;->bR:Z

    return p1
.end method

.method static synthetic b(Lcom/kwad/components/ad/f/b/e;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/kwad/components/ad/f/b/e;->bR:Z

    return p0
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/f/a/a;->aj()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v0, v0, Lcom/kwad/components/ad/f/a/b;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    iput-object v0, p0, Lcom/kwad/components/ad/f/b/e;->mr:Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    .line 3
    new-instance v0, Lcom/kwad/components/ad/f/b/e$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/b/e$1;-><init>(Lcom/kwad/components/ad/f/b/e;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/a/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/f/a/b;->mO:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    return-void
.end method

.method public final onUnbind()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/f/a/a;->onUnbind()V

    return-void
.end method
