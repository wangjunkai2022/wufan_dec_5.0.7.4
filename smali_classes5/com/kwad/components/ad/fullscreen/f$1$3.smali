.class final Lcom/kwad/components/ad/fullscreen/f$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/c/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/fullscreen/f$1;->a(Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cg:Ljava/util/List;

.field final synthetic gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field final synthetic gB:Ljava/util/List;

.field final synthetic gC:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

.field final synthetic gD:Z

.field final synthetic gz:Lcom/kwad/components/ad/fullscreen/f$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/fullscreen/f$1;Ljava/util/List;Lcom/kwad/sdk/api/KsFullScreenVideoAd;Lcom/kwad/sdk/core/response/model/AdTemplate;ZLjava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gz:Lcom/kwad/components/ad/fullscreen/f$1;

    iput-object p2, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gB:Ljava/util/List;

    iput-object p3, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gC:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    iput-object p4, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-boolean p5, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gD:Z

    iput-object p6, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->cg:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final V()V
    .locals 3

    const-string v0, "KsAdFullScreenLoadManager"

    const-string v1, "loadFullScreenVideoAd startCacheVideo onCacheTargetSuccess"

    .line 1
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gB:Ljava/util/List;

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gC:Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gz:Lcom/kwad/components/ad/fullscreen/f$1;

    iget-object v1, v1, Lcom/kwad/components/ad/fullscreen/f$1;->gx:Lcom/kwad/components/ad/fullscreen/e;

    iget-object v2, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gB:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/fullscreen/f;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/fullscreen/e;Ljava/util/List;)V

    return-void
.end method

.method public final W()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gD:Z

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gA:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->gz:Lcom/kwad/components/ad/fullscreen/f$1;

    iget-object v1, v1, Lcom/kwad/components/ad/fullscreen/f$1;->gx:Lcom/kwad/components/ad/fullscreen/e;

    iget-object v2, p0, Lcom/kwad/components/ad/fullscreen/f$1$3;->cg:Ljava/util/List;

    invoke-static {v0, v1, v2}, Lcom/kwad/components/ad/fullscreen/f;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/fullscreen/e;Ljava/util/List;)V

    :cond_0
    return-void
.end method
