.class Lcom/beizi/ad/internal/nativead/b$a$1;
.super Ljava/lang/Object;
.source "NativeAdRequestImpl.java"

# interfaces
.implements Lcom/beizi/ad/internal/utilities/ImageService$ImageReceiver;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/nativead/b$a;->a(Lcom/beizi/ad/internal/network/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/NativeAdResponse;

.field final synthetic b:Lcom/beizi/ad/internal/nativead/b$a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/nativead/b$a;Lcom/beizi/ad/NativeAdResponse;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/nativead/b$a$1;->b:Lcom/beizi/ad/internal/nativead/b$a;

    iput-object p2, p0, Lcom/beizi/ad/internal/nativead/b$a$1;->a:Lcom/beizi/ad/NativeAdResponse;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail()V
    .locals 3

    .line 1
    sget-object v0, Lcom/beizi/ad/internal/utilities/HaoboLog;->httpRespLogTag:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Image downloading logFailed for url "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/ad/internal/nativead/b$a$1;->a:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v2}, Lcom/beizi/ad/NativeAdResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onReceiveImage(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/nativead/b$a$1;->a:Lcom/beizi/ad/NativeAdResponse;

    invoke-interface {v0, p1}, Lcom/beizi/ad/NativeAdResponse;->setImage(Landroid/graphics/Bitmap;)V

    return-void
.end method
