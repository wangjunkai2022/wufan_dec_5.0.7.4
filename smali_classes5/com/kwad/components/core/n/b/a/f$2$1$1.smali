.class final Lcom/kwad/components/core/n/b/a/f$2$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/n/b/a/f$2$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ni:Landroid/graphics/Bitmap;

.field final synthetic Nj:Lcom/kwad/components/core/n/b/a/f$2$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/n/b/a/f$2$1;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/b/a/f$2$1$1;->Nj:Lcom/kwad/components/core/n/b/a/f$2$1;

    iput-object p2, p0, Lcom/kwad/components/core/n/b/a/f$2$1$1;->Ni:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/f$2$1$1;->Nj:Lcom/kwad/components/core/n/b/a/f$2$1;

    iget-object v0, v0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nh:Lcom/kwad/components/core/n/b/a/f$2;

    iget-object v0, v0, Lcom/kwad/components/core/n/b/a/f$2;->Dw:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/kwad/components/core/n/b/a/f$2$1$1;->Ni:Landroid/graphics/Bitmap;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/n/b/a/f$2$1$1;->Nj:Lcom/kwad/components/core/n/b/a/f$2$1;

    iget-object v1, v0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nh:Lcom/kwad/components/core/n/b/a/f$2;

    iget-object v1, v1, Lcom/kwad/components/core/n/b/a/f$2;->Nc:Lcom/kwad/components/offline/api/core/api/IImageLoader$ImageLoadingListener;

    iget-object v2, v0, Lcom/kwad/components/core/n/b/a/f$2$1;->Ng:Ljava/lang/String;

    iget-object v3, v0, Lcom/kwad/components/core/n/b/a/f$2$1;->ff:Landroid/view/View;

    .line 3
    iget-object v0, v0, Lcom/kwad/components/core/n/b/a/f$2$1;->Nf:Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lcom/kwad/components/core/n/b/a/f$2$1$1;->Ni:Landroid/graphics/Bitmap;

    if-nez v4, :cond_1

    iget-object v0, v0, Lcom/kwad/sdk/core/imageloader/core/decode/DecodedResult;->mBitmap:Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_1
    move-object v0, v4

    .line 4
    :goto_0
    invoke-interface {v1, v2, v3, v0}, Lcom/kwad/components/offline/api/core/api/IImageLoader$ImageLoadingListener;->onLoadingComplete(Ljava/lang/String;Landroid/view/View;Landroid/graphics/Bitmap;)V

    return-void
.end method
