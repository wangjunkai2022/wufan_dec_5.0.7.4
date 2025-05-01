.class final Lcom/kwad/components/ad/feed/b/m$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/feed/b/m;->getVideoPlayCallback()Lcom/kwad/components/core/video/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private cC:Z

.field final synthetic gb:Lcom/kwad/components/ad/feed/b/m;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/feed/b/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/feed/b/m$7;->cC:Z

    return-void
.end method


# virtual methods
.method public final bl()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->cC:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->cC:Z

    .line 3
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/m;->aC(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/kwad/components/core/o/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;JI)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->p(Lcom/kwad/components/ad/feed/b/m;)Z

    move-result v2

    invoke-static {v1, v2}, Lcom/kwad/components/ad/feed/b/m;->c(Lcom/kwad/components/ad/feed/b/m;Z)Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/video/videoview/a;->setVideoSoundEnable(Z)V

    return-void
.end method

.method public final bm()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->aD(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bN(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->d(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ba;

    move-result-object v0

    const/16 v1, 0x9

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ba;->aQ(I)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->i(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/widget/KSRelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 5
    invoke-static {}, Lcom/kwad/components/ad/feed/a/b;->aW()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 6
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->ax(Lcom/kwad/components/ad/feed/b/m;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    new-instance v1, Lcom/kwad/components/ad/feed/b/d;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/m;->aE(Lcom/kwad/components/ad/feed/b/m;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/components/ad/feed/b/d;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/ad/feed/b/d;)Lcom/kwad/components/ad/feed/b/d;

    .line 8
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 9
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/feed/b/d;->bn()V

    :cond_0
    return-void
.end method

.method public final e(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0, p1, p2}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;J)V

    return-void
.end method

.method public final onVideoPlayError(II)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->aF(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->aG(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide p1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->as(Lcom/kwad/components/ad/feed/b/m;)J

    move-result-wide v2

    sub-long v6, p1, v2

    const/4 v2, 0x2

    const/4 v3, 0x1

    .line 4
    invoke-static/range {v1 .. v7}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V

    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 9

    .line 1
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->ak(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->aq(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->ar(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->K(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v4

    .line 4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 5
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->as(Lcom/kwad/components/ad/feed/b/m;)J

    move-result-wide v5

    sub-long v7, v2, v5

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v5, 0x0

    move-wide v6, v7

    .line 6
    invoke-static/range {v1 .. v7}, Lcom/kwad/components/ad/feed/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IILjava/lang/String;Ljava/lang/String;J)V

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->at(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bM(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->d(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/core/webview/jshandler/ba;

    move-result-object v0

    const/4 v1, 0x3

    .line 9
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ba;->aQ(I)V

    .line 10
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 11
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    instance-of v0, v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 13
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 14
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->au(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/feed/b/d;->bo()V

    .line 15
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/ad/feed/b/d;)Lcom/kwad/components/ad/feed/b/d;

    .line 16
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->av(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/e;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->aw(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/b;->cL(Lcom/kwad/sdk/core/response/model/AdTemplate;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    .line 17
    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->ax(Lcom/kwad/components/ad/feed/b/m;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 18
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    new-instance v1, Lcom/kwad/components/ad/feed/b/e;

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/m;->ay(Lcom/kwad/components/ad/feed/b/m;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/kwad/components/ad/feed/b/e;-><init>(Landroid/content/Context;)V

    invoke-static {v0, v1}, Lcom/kwad/components/ad/feed/b/m;->a(Lcom/kwad/components/ad/feed/b/m;Lcom/kwad/components/ad/feed/b/e;)Lcom/kwad/components/ad/feed/b/e;

    .line 19
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 20
    iget-object v1, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v1}, Lcom/kwad/components/ad/feed/b/m;->i(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/sdk/widget/KSRelativeLayout;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v2}, Lcom/kwad/components/ad/feed/b/m;->av(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/e;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/widget/RelativeLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->av(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/e;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$7$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$7$1;-><init>(Lcom/kwad/components/ad/feed/b/m$7;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/b/e;->setOnViewEventListener(Lcom/kwad/sdk/widget/c;)V

    .line 22
    iget-object v0, p0, Lcom/kwad/components/ad/feed/b/m$7;->gb:Lcom/kwad/components/ad/feed/b/m;

    invoke-static {v0}, Lcom/kwad/components/ad/feed/b/m;->av(Lcom/kwad/components/ad/feed/b/m;)Lcom/kwad/components/ad/feed/b/e;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/feed/b/m$7$2;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/feed/b/m$7$2;-><init>(Lcom/kwad/components/ad/feed/b/m$7;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/feed/b/e;->a(Landroid/animation/AnimatorListenerAdapter;)V

    :cond_1
    return-void
.end method
