.class public final Lcom/kwad/components/ad/f/b/g;
.super Lcom/kwad/components/ad/f/a/a;
.source "SourceFile"


# instance fields
.field private ne:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/a/a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/components/ad/f/b/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/f/b/g;->ez()V

    return-void
.end method

.method private ez()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/g;->ne:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v1, v1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->W(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v2, v2, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/g;->ne:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final aj()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/f/a/a;->aj()V

    .line 2
    new-instance v0, Lcom/kwad/components/ad/f/b/g$1;

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/f/b/g$1;-><init>(Lcom/kwad/components/ad/f/b/g;)V

    iput-object v0, p0, Lcom/kwad/components/ad/f/a/a;->mVideoPlayStateListener:Lcom/kwad/components/core/video/k;

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/f/a/a;->mN:Lcom/kwad/components/ad/f/a/b;

    iget-object v1, v1, Lcom/kwad/components/ad/f/a/b;->mO:Lcom/kwad/components/ad/f/c/a;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/core/video/k;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/g;->ne:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    return-void
.end method

.method public final onCreate()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/mvp/Presenter;->onCreate()V

    .line 2
    sget v0, Lcom/kwad/sdk/R$id;->ksad_video_cover_image:I

    invoke-virtual {p0, v0}, Lcom/kwad/sdk/mvp/Presenter;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/kwad/components/ad/f/b/g;->ne:Landroid/widget/ImageView;

    return-void
.end method
