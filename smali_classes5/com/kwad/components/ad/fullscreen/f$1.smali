.class final Lcom/kwad/components/ad/fullscreen/f$1;
.super Lcom/kwad/components/core/request/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/fullscreen/f;->a(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/components/ad/fullscreen/e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic em:Lcom/kwad/sdk/internal/api/SceneImpl;

.field final synthetic gx:Lcom/kwad/components/ad/fullscreen/e;

.field final synthetic gy:J


# direct methods
.method constructor <init>(Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/components/ad/fullscreen/e;J)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/fullscreen/f$1;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    iput-object p2, p0, Lcom/kwad/components/ad/fullscreen/f$1;->gx:Lcom/kwad/components/ad/fullscreen/e;

    iput-wide p3, p0, Lcom/kwad/components/ad/fullscreen/f$1;->gy:J

    invoke-direct {p0}, Lcom/kwad/components/core/request/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
    .locals 19
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    .line 1
    const-class v1, Lcom/kwad/components/core/n/a/b/a;

    iget-object v2, v7, Lcom/kwad/components/ad/fullscreen/f$1;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    iget-wide v2, v2, Lcom/kwad/sdk/internal/api/SceneImpl;->posId:J

    const/4 v8, 0x0

    invoke-static {v8, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->c(ZJ)V

    .line 2
    invoke-virtual/range {p1 .. p1}, Lcom/kwad/sdk/core/response/model/AdResultData;->getAdTemplateList()Ljava/util/List;

    move-result-object v2

    .line 3
    iget-object v3, v7, Lcom/kwad/components/ad/fullscreen/f$1;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-static {v3, v2}, Lcom/kwad/components/ad/fullscreen/f;->b(Lcom/kwad/sdk/internal/api/SceneImpl;Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    .line 4
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const-string v10, "onFullScreenVideoAdCacheFailed"

    const-string v11, "fullAd_"

    if-eqz v2, :cond_1

    .line 5
    sget-object v1, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget v1, v1, Lcom/kwad/sdk/core/network/e;->errorCode:I

    .line 6
    iget-object v2, v0, Lcom/kwad/sdk/core/response/model/BaseResultData;->testErrorMsg:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v0, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget-object v0, v0, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    goto :goto_0

    .line 7
    :cond_0
    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/BaseResultData;->testErrorMsg:Ljava/lang/String;

    .line 8
    :goto_0
    invoke-virtual {v7, v1, v0}, Lcom/kwad/components/ad/fullscreen/f$1;->onError(ILjava/lang/String;)V

    .line 9
    invoke-static {v11, v10}, Lcom/kwad/sdk/utils/i;->ao(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 10
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->zA()I

    move-result v2

    .line 11
    invoke-static {v0, v2}, Lcom/kwad/sdk/core/response/model/AdResultData;->obtainVideoPreCacheConfig(Lcom/kwad/sdk/core/response/model/AdResultData;I)Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;

    move-result-object v12

    .line 12
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 13
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 14
    invoke-static {v0, v3}, Lcom/kwad/sdk/core/response/b/c;->a(Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdResultData;

    move-result-object v4

    .line 15
    new-instance v5, Lcom/kwad/components/ad/fullscreen/g;

    invoke-direct {v5, v4}, Lcom/kwad/components/ad/fullscreen/g;-><init>(Lcom/kwad/sdk/core/response/model/AdResultData;)V

    invoke-interface {v13, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move/from16 v4, p2

    .line 16
    invoke-static {v3, v4, v12}, Lcom/kwad/components/ad/reward/monitor/d;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;)V

    goto :goto_1

    .line 17
    :cond_2
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 18
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v0

    iget-wide v2, v7, Lcom/kwad/components/ad/fullscreen/f$1;->gy:J

    invoke-static {v8, v14, v0, v2, v3}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZLcom/kwad/sdk/core/response/model/AdTemplate;IJ)V

    .line 19
    iget-object v0, v7, Lcom/kwad/components/ad/fullscreen/f$1;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v2

    invoke-static {v0, v2}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;I)V

    .line 20
    new-instance v0, Lcom/kwad/components/ad/fullscreen/f$1$2;

    invoke-direct {v0, v7, v14, v13}, Lcom/kwad/components/ad/fullscreen/f$1$2;-><init>(Lcom/kwad/components/ad/fullscreen/f$1;Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/util/List;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 21
    :try_start_0
    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 22
    invoke-static {v1}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 23
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 25
    :catch_0
    :cond_3
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 26
    invoke-static {v8, v14}, Lcom/kwad/components/ad/reward/monitor/c;->d(ZLcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 27
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dp()Z

    move-result v16

    .line 28
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_2
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/kwad/sdk/api/KsFullScreenVideoAd;

    .line 29
    move-object v0, v3

    check-cast v0, Lcom/kwad/components/ad/fullscreen/g;

    .line 30
    invoke-virtual {v0}, Lcom/kwad/components/ad/fullscreen/g;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v6

    .line 31
    invoke-static {v6}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 32
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->bc(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 33
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    .line 34
    :cond_4
    new-instance v5, Lcom/kwad/components/ad/fullscreen/f$1$3;

    move-object v0, v5

    move-object/from16 v1, p0

    move-object v2, v15

    move-object v4, v14

    move-object v8, v5

    move/from16 v5, v16

    move-object/from16 v18, v9

    move-object v9, v6

    move-object v6, v13

    invoke-direct/range {v0 .. v6}, Lcom/kwad/components/ad/fullscreen/f$1$3;-><init>(Lcom/kwad/components/ad/fullscreen/f$1;Ljava/util/List;Lcom/kwad/sdk/api/KsFullScreenVideoAd;Lcom/kwad/sdk/core/response/model/AdTemplate;ZLjava/util/List;)V

    const/4 v0, 0x0

    invoke-static {v9, v0, v12, v8}, Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;Lcom/kwad/components/ad/c/a;)Z

    goto :goto_4

    :cond_5
    :goto_3
    move-object/from16 v18, v9

    .line 35
    invoke-interface {v15, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    iget-object v0, v7, Lcom/kwad/components/ad/fullscreen/f$1;->gx:Lcom/kwad/components/ad/fullscreen/e;

    invoke-static {v14, v0, v15}, Lcom/kwad/components/ad/fullscreen/f;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/fullscreen/e;Ljava/util/List;)V

    :goto_4
    move-object/from16 v9, v18

    const/4 v8, 0x0

    goto :goto_2

    :cond_6
    move-object/from16 v18, v9

    const-string v0, "KsAdFullScreenLoadManager"

    const-string v1, "loadFullScreenVideoAd after cache"

    .line 37
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v16, :cond_7

    .line 38
    invoke-interface {v15}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 39
    sget-object v0, Lcom/kwad/sdk/core/network/e;->awL:Lcom/kwad/sdk/core/network/e;

    iget v1, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    iget-object v0, v0, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    invoke-virtual {v7, v1, v0}, Lcom/kwad/components/ad/fullscreen/f$1;->onError(ILjava/lang/String;)V

    .line 40
    invoke-static {v11, v10}, Lcom/kwad/sdk/utils/i;->ao(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_7
    move-object/from16 v0, v18

    const/4 v1, 0x0

    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-wide v3, v7, Lcom/kwad/components/ad/fullscreen/f$1;->gy:J

    invoke-static {v1, v2, v0, v3, v4}, Lcom/kwad/components/ad/reward/monitor/c;->b(ZLcom/kwad/sdk/core/response/model/AdTemplate;IJ)V

    return-void
.end method

.method public final onError(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/fullscreen/f$1;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    const/4 v2, 0x0

    invoke-static {v2, p1, p2, v0, v1}, Lcom/kwad/components/ad/reward/monitor/c;->a(ZILjava/lang/String;J)V

    .line 2
    sget-object v0, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget v0, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    if-eq p1, v0, :cond_0

    sget-object v0, Lcom/kwad/sdk/core/network/e;->awF:Lcom/kwad/sdk/core/network/e;

    iget v0, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    if-eq p1, v0, :cond_0

    .line 3
    invoke-static {v2, p1}, Lcom/kwad/components/ad/reward/monitor/b;->c(ZI)V

    .line 4
    :cond_0
    new-instance v0, Lcom/kwad/components/ad/fullscreen/f$1$1;

    invoke-direct {v0, p0, p1, p2}, Lcom/kwad/components/ad/fullscreen/f$1$1;-><init>(Lcom/kwad/components/ad/fullscreen/f$1;ILjava/lang/String;)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
