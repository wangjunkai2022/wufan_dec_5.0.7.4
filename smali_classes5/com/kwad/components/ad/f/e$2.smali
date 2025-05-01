.class final Lcom/kwad/components/ad/f/e$2;
.super Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/f/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mK:Lcom/kwad/components/ad/f/e;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-direct {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLivePlayCompleted()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePlayCompleted()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;->onVideoPlayComplete()V

    :cond_0
    return-void
.end method

.method public final onLivePlayEnd()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePlayEnd()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;->onVideoPlayComplete()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->i(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bf(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 6
    const-class v1, Lcom/kwad/components/core/n/a/a/a;

    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/n/a/a/a;

    if-eqz v1, :cond_1

    .line 7
    iget-object v2, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-interface {v1, v0}, Lcom/kwad/components/core/n/a/a/a;->getAdLiveEndRequest(Ljava/lang/String;)Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;)Lcom/kwad/components/offline/api/core/adlive/IAdLiveEndRequest;

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->n(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/core/network/l;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/ad/f/e$2$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/f/e$2$1;-><init>(Lcom/kwad/components/ad/f/e$2;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/network/l;->request(Lcom/kwad/sdk/core/network/g;)V

    :cond_2
    return-void
.end method

.method public final onLivePlayPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePlayPause()V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;->onVideoPlayPause()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 3
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onLivePlayProgress(J)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePlayProgress(J)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0, p1, p2}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;J)V

    return-void
.end method

.method public final onLivePlayResume()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePlayResume()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v1}, Lcom/kwad/components/ad/f/e;->o(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    iget-object v1, v0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->p(Lcom/kwad/components/ad/f/e;)Z

    move-result v2

    invoke-static {v0, v2}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;Z)Z

    move-result v0

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    .line 4
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;->onVideoPlayResume()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final onLivePlayStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePlayStart()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v1}, Lcom/kwad/components/ad/f/e;->o(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    iget-object v1, v0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->p(Lcom/kwad/components/ad/f/e;)Z

    move-result v2

    invoke-static {v0, v2}, Lcom/kwad/components/ad/f/e;->a(Lcom/kwad/components/ad/f/e;Z)Z

    move-result v0

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;->onVideoPlayStart()V

    :cond_0
    return-void
.end method

.method public final onLivePrepared()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/offline/api/core/adlive/listener/AdLivePlayStateListenerAdapter;->onLivePrepared()V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/j/a;->pf()Lcom/kwad/components/core/j/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v1}, Lcom/kwad/components/ad/f/e;->o(Lcom/kwad/components/ad/f/e;)Lcom/kwad/components/core/j/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/j/a;->a(Lcom/kwad/components/core/j/a$b;)V

    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    invoke-static {v0}, Lcom/kwad/components/ad/f/e;->m(Lcom/kwad/components/ad/f/e;)Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsNativeAd$VideoPlayListener;->onVideoPlayReady()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/e$2;->mK:Lcom/kwad/components/ad/f/e;

    iget-object v0, v0, Lcom/kwad/components/ad/f/e;->eV:Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1, v1}, Lcom/kwad/components/offline/api/core/adlive/IAdLivePlayModule;->setAudioEnabled(ZZ)V

    :cond_0
    return-void
.end method
