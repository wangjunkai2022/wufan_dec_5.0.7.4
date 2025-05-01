.class Lcom/beizi/ad/internal/utilities/ImageManager$1$1;
.super Ljava/lang/Object;
.source "ImageManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/internal/utilities/ImageManager$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/beizi/ad/internal/utilities/ImageManager$1;

.field final synthetic val$bm:Landroid/graphics/Bitmap;


# direct methods
.method constructor <init>(Lcom/beizi/ad/internal/utilities/ImageManager$1;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$1$1;->this$1:Lcom/beizi/ad/internal/utilities/ImageManager$1;

    iput-object p2, p0, Lcom/beizi/ad/internal/utilities/ImageManager$1$1;->val$bm:Landroid/graphics/Bitmap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/utilities/ImageManager$1$1;->this$1:Lcom/beizi/ad/internal/utilities/ImageManager$1;

    iget-object v0, v0, Lcom/beizi/ad/internal/utilities/ImageManager$1;->val$listener:Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;

    iget-object v1, p0, Lcom/beizi/ad/internal/utilities/ImageManager$1$1;->val$bm:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;->onBitmapLoaded(Landroid/graphics/Bitmap;)V

    return-void
.end method
