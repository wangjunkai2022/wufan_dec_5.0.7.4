.class final Lcom/kwad/components/ad/interstitial/e/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/f;->dw()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private cC:Z

.field final synthetic kN:J

.field final synthetic kO:Lcom/kwad/components/ad/interstitial/e/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/f;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    iput-wide p2, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kN:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->cC:Z

    return-void
.end method


# virtual methods
.method public final bl()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->cC:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->cC:Z

    .line 3
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/kwad/components/core/o/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;JI)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/video/a$c;

    .line 5
    invoke-interface {v1}, Lcom/kwad/components/core/video/a$c;->bl()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final bm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bN(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onVideoPlayEnd()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/video/a$c;

    .line 5
    invoke-interface {v1}, Lcom/kwad/components/core/video/a$c;->bm()V

    goto :goto_0

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jX:Z

    return-void
.end method

.method public final e(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0, p1, p2}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;J)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/video/a$c;

    .line 3
    invoke-interface {v1, p1, p2}, Lcom/kwad/components/core/video/a$c;->e(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final onVideoPlayError(II)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/d;->dT()Lcom/kwad/components/ad/interstitial/report/d;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/kwad/components/ad/interstitial/report/d;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onVideoPlayError(II)V

    :cond_0
    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/core/adlog/c;->bM(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/d;->dT()Lcom/kwad/components/ad/interstitial/report/d;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kN:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v1, v2, v3}, Lcom/kwad/components/ad/interstitial/report/d;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    .line 3
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/b;->dP()Lcom/kwad/components/ad/interstitial/report/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/report/b;->o(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jO:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    if-eqz v0, :cond_0

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->ie:Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;

    invoke-interface {v0}, Lcom/kwad/sdk/api/KsInterstitialAd$AdInteractionListener;->onVideoPlayStart()V

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c;->jV:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/video/a$c;

    .line 7
    invoke-interface {v1}, Lcom/kwad/components/core/video/a$c;->onVideoPlayStart()V

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/f$1;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/f;->a(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/kwad/components/ad/interstitial/e/c;->jX:Z

    return-void
.end method
