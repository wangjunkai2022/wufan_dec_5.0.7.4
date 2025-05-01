.class Lcom/beizi/fusion/work/nativead/e$5$1;
.super Ljava/lang/Object;
.source "BeiZiNativeWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/e$5;->onBitmapLoaded(Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/e$5;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/e$5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/e$5$1;->a:Lcom/beizi/fusion/work/nativead/e$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/e$5$1;->a:Lcom/beizi/fusion/work/nativead/e$5;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/e$5;->c:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/e;->a(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/ad/NativeAd;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/e$5$1;->a:Lcom/beizi/fusion/work/nativead/e$5;

    iget-object v1, v1, Lcom/beizi/fusion/work/nativead/e$5;->c:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/e;->g(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getOptimizeSize()I

    move-result v1

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/e$5$1;->a:Lcom/beizi/fusion/work/nativead/e$5;

    iget-object v3, v2, Lcom/beizi/fusion/work/nativead/e$5;->a:Landroid/widget/ImageView;

    iget-object v2, v2, Lcom/beizi/fusion/work/nativead/e$5;->c:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v2}, Lcom/beizi/fusion/work/nativead/e;->f(Lcom/beizi/fusion/work/nativead/e;)Landroid/view/ViewGroup;

    move-result-object v2

    iget-object v4, p0, Lcom/beizi/fusion/work/nativead/e$5$1;->a:Lcom/beizi/fusion/work/nativead/e$5;

    iget-object v4, v4, Lcom/beizi/fusion/work/nativead/e$5;->c:Lcom/beizi/fusion/work/nativead/e;

    invoke-static {v4}, Lcom/beizi/fusion/work/nativead/e;->g(Lcom/beizi/fusion/work/nativead/e;)Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getDirection()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v1, v3, v2, v4}, Lcom/beizi/ad/NativeAd;->optimizeClickArea(ILandroid/view/View;Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method
