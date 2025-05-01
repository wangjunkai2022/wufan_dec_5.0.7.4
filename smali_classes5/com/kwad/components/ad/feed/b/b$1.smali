.class final Lcom/kwad/components/ad/feed/b/b$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/b/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic eJ:Lcom/kwad/components/ad/feed/b/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/b;->a(Lcom/kwad/components/ad/feed/b/b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aT(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    move-result-object v1

    iget v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;->height:I

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aT(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;

    move-result-object v0

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdMaterialInfo$MaterialFeature;->width:I

    if-le v1, v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    iget-object v0, v0, Lcom/kwad/components/ad/feed/b/b;->eE:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    invoke-virtual {v1}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v1

    div-int/lit8 v1, v1, 0x2

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    iget-object v1, v1, Lcom/kwad/components/ad/feed/b/b;->eE:Lcom/kwad/sdk/widget/RatioFrameLayout;

    const-wide v2, 0x3ffc924920000000L    # 1.7857142686843872

    invoke-virtual {v1, v2, v3}, Lcom/kwad/sdk/widget/RatioFrameLayout;->setRatio(D)V

    .line 7
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    iget-object v1, v1, Lcom/kwad/components/ad/feed/b/b;->eE:Lcom/kwad/sdk/widget/RatioFrameLayout;

    invoke-virtual {v1, v0}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/b;->b(Lcom/kwad/components/ad/feed/b/b;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->aZ(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/util/List;

    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_1

    .line 10
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    iget-object v1, v1, Lcom/kwad/components/ad/feed/b/b;->eC:Landroid/widget/ImageView;

    const/4 v2, 0x0

    .line 11
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/b;->c(Lcom/kwad/components/ad/feed/b/b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    iget-object v3, p0, Lcom/kwad/components/ad/feed/b/b$1;->eJ:Lcom/kwad/components/ad/feed/b/b;

    iget-object v3, v3, Lcom/kwad/components/ad/feed/b/a;->ez:Lcom/kwad/sdk/core/imageloader/core/listener/SimpleImageLoadingListener;

    invoke-static {v1, v0, v2, v3}, Lcom/kwad/sdk/core/imageloader/KSImageLoader;->loadFeeImage(Landroid/widget/ImageView;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/imageloader/core/listener/ImageLoadingListener;)V

    return-void

    :cond_1
    const-string v0, "BaseFeedTextImageView"

    const-string v1, "getImageUrlList size less than one"

    .line 12
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
