.class final Lcom/kwad/components/ad/draw/b/a/a$2;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/draw/b/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cE:Lcom/kwad/components/ad/draw/b/a/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/draw/b/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayCompleted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bN(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->f(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->g(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;->onVideoPlayEnd()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onMediaPlayError(II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/video/l;->onMediaPlayError(II)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {p1}, Lcom/kwad/components/ad/draw/b/a/a;->n(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    if-eqz p1, :cond_0

    .line 3
    :try_start_0
    iget-object p1, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {p1}, Lcom/kwad/components/ad/draw/b/a/a;->o(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-interface {p1}, Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;->onVideoPlayError()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 4
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final onMediaPlayPaused()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlayPaused()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->l(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->m(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;->onVideoPlayPause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 5
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/draw/b/a/a;->b(Lcom/kwad/components/ad/draw/b/a/a;Z)Z

    return-void
.end method

.method public final onMediaPlayProgress(JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {p1, p3, p4}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;J)V

    return-void
.end method

.method public final onMediaPlayStart()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->b(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->c(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;->onAdShow()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->d(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    if-eqz v0, :cond_1

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->e(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;->onVideoPlayStart()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 7
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0, v1}, Lcom/kwad/components/ad/draw/b/a/a;->b(Lcom/kwad/components/ad/draw/b/a/a;Z)Z

    .line 8
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/s/b;->rC()Lcom/kwad/components/core/s/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v1}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/kwad/components/core/s/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z

    .line 9
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bM(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method

.method public final onMediaPlaying()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlaying()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->h(Lcom/kwad/components/ad/draw/b/a/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/draw/b/a/a;->b(Lcom/kwad/components/ad/draw/b/a/a;Z)Z

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->i(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    if-eqz v0, :cond_1

    .line 5
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->j(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->bN:Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsDrawAd$AdInteractionListener;->onVideoPlayResume()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 6
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/a/a;->k(Lcom/kwad/components/ad/draw/b/a/a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;Z)Z

    .line 9
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/ad/draw/b/a/a$2;->cE:Lcom/kwad/components/ad/draw/b/a/a;

    invoke-static {v2}, Lcom/kwad/components/ad/draw/b/a/a;->a(Lcom/kwad/components/ad/draw/b/a/a;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4, v1}, Lcom/kwad/components/core/o/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;JI)V

    :cond_1
    return-void
.end method
