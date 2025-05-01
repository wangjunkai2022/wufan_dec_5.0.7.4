.class Lcom/beizi/fusion/work/h/b$3;
.super Ljava/lang/Object;
.source "BeiZiUnifiedCustomWorker.java"

# interfaces
.implements Lcom/beizi/ad/internal/utilities/ImageManager$BitmapLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/b;->aX()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/h/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/b$3;->a:Lcom/beizi/fusion/work/h/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBitmapLoadFailed()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/b$3;->a:Lcom/beizi/fusion/work/h/b;

    const-string v1, "sdk custom error "

    const-string v2, "onBitmapLoadFailed"

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v2, 0x18697

    invoke-static {v0, v1, v2}, Lcom/beizi/fusion/work/h/b;->b(Lcom/beizi/fusion/work/h/b;Ljava/lang/String;I)V

    return-void
.end method

.method public onBitmapLoaded(Landroid/graphics/Bitmap;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/b$3;->a:Lcom/beizi/fusion/work/h/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/h/a;->N:Landroid/content/Context;

    invoke-static {v0}, Lcom/beizi/fusion/work/h/b;->c(Lcom/beizi/fusion/work/h/b;)Lcom/beizi/ad/NativeAdResponse;

    move-result-object v2

    invoke-static {v1, p1, v2}, Lcom/beizi/ad/internal/nativead/NativeAdUtil;->getCustomRenderView(Landroid/content/Context;Landroid/graphics/Bitmap;Lcom/beizi/ad/NativeAdResponse;)Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/fusion/work/h/b;->a(Lcom/beizi/fusion/work/h/b;Landroid/widget/FrameLayout;)Landroid/widget/FrameLayout;

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/h/b$3;->a:Lcom/beizi/fusion/work/h/b;

    invoke-virtual {p1}, Lcom/beizi/fusion/work/h/a;->aN()V

    return-void
.end method
