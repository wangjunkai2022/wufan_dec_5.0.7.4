.class final Lcom/kwad/components/core/n/b/a/f$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/a/f$2;->onLoadingComplete(Ljava/lang/String;Landroid/view/View;Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Nf:Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;

.field final synthetic Ng:Ljava/lang/String;

.field final synthetic Nh:Lcom/kwad/components/core/n/b/a/f$2;

.field final synthetic ff:Landroid/view/View;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/n/b/a/f$2;Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nh:Lcom/kwad/components/core/n/b/a/f$2;

    iput-object p2, p0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nf:Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;

    iput-object p3, p0, Lcom/kwad/components/core/n/b/a/f$2$1;->Ng:Ljava/lang/String;

    iput-object p4, p0, Lcom/kwad/components/core/n/b/a/f$2$1;->ff:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nf:Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;

    iget-object v0, v0, Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;->mBitmap:Landroid/graphics/Bitmap;

    iget-object v1, p0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nh:Lcom/kwad/components/core/n/b/a/f$2;

    iget-object v1, v1, Lcom/kwad/components/core/n/b/a/f$2;->Ne:Lcom/kwad/components/offline/api/core/api/IImageLoader$DisplayImageOptionsCompat;

    invoke-virtual {v1}, Lcom/kwad/components/offline/api/core/api/IImageLoader$DisplayImageOptionsCompat;->getBlurRadius()I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/imageloader/utils/BlurUtils;->stackBlur(Landroid/graphics/Bitmap;IZ)Landroid/graphics/Bitmap;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/core/n/b/a/f$2$1$1;

    invoke-direct {v1, p0, v0}, Lcom/kwad/components/core/n/b/a/f$2$1$1;-><init>(Lcom/kwad/components/core/n/b/a/f$2$1;Landroid/graphics/Bitmap;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
