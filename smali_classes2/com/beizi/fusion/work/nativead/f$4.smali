.class Lcom/beizi/fusion/work/nativead/f$4;
.super Ljava/lang/Object;
.source "CsjNativeAdWorker.java"

# interfaces
.implements Lcom/bytedance/sdk/openadsdk/TTAdDislike$DislikeInteractionCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/f;->b(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/fusion/work/nativead/f;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 0

    return-void
.end method

.method public onSelected(ILjava/lang/String;Z)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->q(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->r(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/fusion/d/e;->r()I

    move-result p1

    const/4 p2, 0x2

    if-eq p1, p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->t(Lcom/beizi/fusion/work/nativead/f;)Lcom/beizi/fusion/d/e;

    move-result-object p1

    iget-object p2, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-virtual {p2}, Lcom/beizi/fusion/work/nativead/f;->g()Ljava/lang/String;

    move-result-object p2

    iget-object p3, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p3}, Lcom/beizi/fusion/work/nativead/f;->s(Lcom/beizi/fusion/work/nativead/f;)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p1, p2, p3}, Lcom/beizi/fusion/d/e;->b(Ljava/lang/String;Landroid/view/View;)V

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/beizi/fusion/work/nativead/f$4;->a:Lcom/beizi/fusion/work/nativead/f;

    invoke-static {p1}, Lcom/beizi/fusion/work/nativead/f;->u(Lcom/beizi/fusion/work/nativead/f;)V

    return-void
.end method

.method public onShow()V
    .locals 0

    return-void
.end method
