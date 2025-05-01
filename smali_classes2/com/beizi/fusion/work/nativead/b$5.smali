.class Lcom/beizi/fusion/work/nativead/b$5;
.super Ljava/lang/Object;
.source "BaseBeiZiNativeWorker.java"

# interfaces
.implements Lcom/beizi/ad/internal/nativead/NativeAdEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/nativead/b;->aH()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:Z

.field final synthetic b:Lcom/beizi/fusion/work/nativead/b;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/nativead/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/beizi/fusion/work/nativead/b$5;->a:Z

    return-void
.end method


# virtual methods
.method public onAdWasClicked()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    iget-boolean v1, v0, Lcom/beizi/fusion/work/nativead/b;->P:Z

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->b(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->d(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/b/b;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v1}, Lcom/beizi/fusion/work/nativead/b;->c(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/fusion/model/AdSpacesBean$BuyerBean;->getCallBackStrategyUuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/b/b;->P(Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->e(Lcom/beizi/fusion/work/nativead/b;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->f(Lcom/beizi/fusion/work/nativead/b;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    iget-boolean v1, v0, Lcom/beizi/fusion/work/nativead/b;->P:Z

    if-eqz v1, :cond_1

    iget-boolean v1, v0, Lcom/beizi/fusion/work/nativead/b;->Q:Z

    if-nez v1, :cond_1

    return-void

    .line 6
    :cond_1
    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->g(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->h(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/fusion/d/e;->r()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    .line 7
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->i(Lcom/beizi/fusion/work/nativead/b;)Lcom/beizi/fusion/d/e;

    move-result-object v0

    iget-object v1, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-virtual {v1}, Lcom/beizi/fusion/work/nativead/b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/beizi/fusion/d/e;->d(Ljava/lang/String;)V

    .line 8
    :cond_2
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->j(Lcom/beizi/fusion/work/nativead/b;)V

    .line 9
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    invoke-static {v0}, Lcom/beizi/fusion/work/nativead/b;->k(Lcom/beizi/fusion/work/nativead/b;)V

    .line 10
    iget-object v0, p0, Lcom/beizi/fusion/work/nativead/b$5;->b:Lcom/beizi/fusion/work/nativead/b;

    iget-object v0, v0, Lcom/beizi/fusion/work/nativead/b;->L:Lcom/beizi/ad/UnifiedCustomAd;

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Lcom/beizi/ad/UnifiedCustomAd;->setTouchAreaNormal()V

    :cond_3
    return-void
.end method

.method public onAdWillLeaveApplication()V
    .locals 0

    return-void
.end method
