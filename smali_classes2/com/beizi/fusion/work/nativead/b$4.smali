.class Lcom/beizi/fusion/work/nativead/b$4;
.super Ljava/lang/Object;
.source "BaseBeiZiNativeWorker.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/b;->a(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/beizi/fusion/work/nativead/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/b;Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/b$4;->b:Lcom/beizi/fusion/work/nativead/b;

    iput-object p2, p0, Lcom/beizi/fusion/work/nativead/b$4;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$4;->b:Lcom/beizi/fusion/work/nativead/b;

    iget-object v1, v0, Lcom/beizi/fusion/work/nativead/b;->L:Lcom/beizi/ad/UnifiedCustomAd;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->w:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    invoke-virtual {v0}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getOptimizeSize()I

    move-result v0

    iget-object v2, p0, Lcom/beizi/fusion/work/nativead/b$4;->a:Landroid/view/View;

    iget-object v3, p0, Lcom/beizi/fusion/work/nativead/b$4;->b:Lcom/beizi/fusion/work/nativead/b;

    iget-object v4, v3, Lcom/beizi/fusion/work/nativead/b;->t:Landroid/view/ViewGroup;

    iget-object v3, v3, Lcom/beizi/fusion/work/nativead/b;->w:Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;

    .line 2
    invoke-virtual {v3}, Lcom/beizi/fusion/model/AdSpacesBean$RenderViewBean;->getDirection()Ljava/lang/String;

    move-result-object v3

    .line 3
    invoke-virtual {v1, v0, v2, v4, v3}, Lcom/beizi/ad/UnifiedCustomAd;->optimizeClickArea(ILandroid/view/View;Landroid/view/View;Ljava/lang/String;)V

    return-void
.end method
