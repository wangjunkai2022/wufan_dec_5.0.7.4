.class final Lcom/kwad/components/ad/splashscreen/b$3;
.super Lcom/kwad/components/core/request/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/b;->loadSplashScreenAd(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic BT:Lcom/kwad/components/ad/splashscreen/b$b;

.field final synthetic BU:Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;

.field final synthetic BV:Ljava/lang/Runnable;

.field final synthetic BW:Lcom/kwad/components/ad/splashscreen/b$a;

.field final synthetic BX:J

.field final synthetic em:Lcom/kwad/sdk/internal/api/SceneImpl;

.field final synthetic gy:J


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/b$b;Ljava/lang/Runnable;Lcom/kwad/components/ad/splashscreen/b$a;Lcom/kwad/sdk/internal/api/SceneImpl;Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    iput-object p2, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    iput-object p3, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BW:Lcom/kwad/components/ad/splashscreen/b$a;

    iput-object p4, p0, Lcom/kwad/components/ad/splashscreen/b$3;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    iput-object p5, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BU:Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;

    iput-wide p6, p0, Lcom/kwad/components/ad/splashscreen/b$3;->gy:J

    iput-wide p8, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    invoke-direct {p0}, Lcom/kwad/components/core/request/d;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/b$b;->a(Lcom/kwad/components/ad/splashscreen/b$b;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "loadSplashAd onError isTimeOut return "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const-string p1, "code:%s__msg:%s"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "KsAdSplashScreenLoadManager"

    .line 4
    invoke-static {p2, p1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_0
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/b;->kp()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/b$3;->BW:Lcom/kwad/components/ad/splashscreen/b$a;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/b$a;->a(Lcom/kwad/components/ad/splashscreen/b$a;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 7
    sget-object v0, Lcom/kwad/sdk/core/network/e;->awK:Lcom/kwad/sdk/core/network/e;

    iget v0, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    if-eq p1, v0, :cond_1

    .line 8
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/b$3;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 9
    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    invoke-static {p3, p1, p2, v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/b;->b(ZILjava/lang/String;J)V

    .line 10
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/b$3;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 11
    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    invoke-static {p3, p1, p2, v0, v1}, Lcom/kwad/components/ad/splashscreen/monitor/b;->c(ZILjava/lang/String;J)V

    .line 12
    :cond_1
    new-instance p3, Lcom/kwad/components/ad/splashscreen/b$3$1;

    invoke-direct {p3, p0, p1, p2}, Lcom/kwad/components/ad/splashscreen/b$3$1;-><init>(Lcom/kwad/components/ad/splashscreen/b$3;ILjava/lang/String;)V

    invoke-static {p3}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final a(Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
    .locals 18
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    move-object/from16 v7, p0

    move-object/from16 v0, p1

    move/from16 v8, p2

    .line 13
    new-instance v1, Lcom/kwad/components/ad/splashscreen/b$3$2;

    invoke-direct {v1, v7, v0}, Lcom/kwad/components/ad/splashscreen/b$3$2;-><init>(Lcom/kwad/components/ad/splashscreen/b$3;Lcom/kwad/sdk/core/response/model/AdResultData;)V

    invoke-static {v1}, Lcom/kwad/sdk/utils/bo;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 14
    :try_start_0
    iget-object v2, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BW:Lcom/kwad/components/ad/splashscreen/b$a;

    iget-object v1, v7, Lcom/kwad/components/ad/splashscreen/b$3;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    iget-wide v5, v1, Lcom/kwad/sdk/internal/api/SceneImpl;->posId:J

    move-object/from16 v1, p1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/sdk/core/response/model/AdResultData;Lcom/kwad/components/ad/splashscreen/b$a;Lcom/kwad/components/core/request/d;ZJ)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 15
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/kwad/sdk/core/response/model/AdResultData;->getAdTemplateList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 16
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, v7, Lcom/kwad/components/ad/splashscreen/b$3;->gy:J

    sub-long/2addr v2, v4

    iput-wide v2, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->loadDataTime:J

    .line 17
    iput-boolean v8, v1, Lcom/kwad/sdk/core/response/model/AdTemplate;->notNetworkRequest:Z

    .line 18
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    iget-wide v2, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    .line 19
    invoke-static {v1, v2, v3}, Lcom/kwad/components/ad/splashscreen/monitor/b;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;J)V

    .line 20
    iget-object v2, v7, Lcom/kwad/components/ad/splashscreen/b$3;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    const/4 v3, 0x1

    invoke-static {v2, v3}, Lcom/kwad/sdk/commercial/d/d;->a(Lcom/kwad/sdk/internal/api/SceneImpl;I)V

    .line 21
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    .line 22
    new-instance v2, Lcom/kwad/components/ad/splashscreen/KsSplashScreenAdControl;

    iget-object v6, v7, Lcom/kwad/components/ad/splashscreen/b$3;->em:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-direct {v2, v6, v0}, Lcom/kwad/components/ad/splashscreen/KsSplashScreenAdControl;-><init>(Lcom/kwad/sdk/api/KsScene;Lcom/kwad/sdk/core/response/model/AdResultData;)V

    .line 23
    sget-object v6, Lcom/kwad/components/ad/splashscreen/b/a;->CS:Lcom/kwad/sdk/core/config/item/d;

    invoke-static {v6}, Lcom/kwad/sdk/core/config/d;->a(Lcom/kwad/sdk/core/config/item/d;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/4 v15, 0x2

    const-string v13, "loadSplashAd cache returned"

    const-string v14, "KsAdSplashScreenLoadManager"

    if-eqz v6, :cond_4

    .line 24
    :try_start_1
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    invoke-static/range {p1 .. p1}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->f(Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 25
    iget-object v9, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    iget-wide v11, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    iget-object v6, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    move-object v10, v1

    move-wide/from16 v16, v11

    move-wide v11, v4

    move-object v3, v13

    move-object v8, v14

    move-wide/from16 v13, v16

    move-object v15, v6

    invoke-static/range {v9 .. v15}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/components/ad/splashscreen/b$b;Lcom/kwad/sdk/core/response/model/AdTemplate;JJLjava/lang/Runnable;)Z

    move-result v6

    if-eqz v6, :cond_1

    return-void

    .line 26
    :cond_1
    iget-object v6, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BU:Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;

    invoke-static {v6, v2, v1}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;Lcom/kwad/sdk/api/KsSplashScreenAd;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 27
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->e(Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 28
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x2

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 29
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    .line 30
    invoke-static {v8, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    const/4 v1, 0x1

    .line 32
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/o/a;->aD(I)V

    return-void

    .line 33
    :cond_2
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v0, v3}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->b(Lcom/kwad/sdk/core/response/model/AdResultData;Z)I

    move-result v0

    if-lez v0, :cond_3

    .line 34
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x3

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 35
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    .line 36
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    const/4 v6, 0x2

    .line 37
    invoke-virtual {v0, v6}, Lcom/kwad/components/core/o/a;->aD(I)V

    return-void

    .line 38
    :cond_3
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x4

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 39
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    return-void

    :cond_4
    move-object v3, v13

    move-object v8, v14

    const/4 v6, 0x2

    .line 40
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    invoke-static/range {p1 .. p1}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->f(Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result v9

    if-nez v9, :cond_7

    .line 41
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    invoke-static/range {p1 .. p1}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->g(Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_0

    .line 42
    :cond_5
    iget-object v9, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    iget-object v15, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    move-object v10, v1

    move-wide v11, v4

    invoke-static/range {v9 .. v15}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/components/ad/splashscreen/b$b;Lcom/kwad/sdk/core/response/model/AdTemplate;JJLjava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_6

    return-void

    .line 43
    :cond_6
    iget-object v0, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BU:Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;

    invoke-static {v0, v2, v1}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;Lcom/kwad/sdk/api/KsSplashScreenAd;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 44
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/16 v10, 0x8

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 45
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    const-string v0, "loadSplashAd live no cache returned"

    .line 46
    invoke-static {v8, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    const/4 v1, 0x5

    .line 48
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/o/a;->aD(I)V

    goto/16 :goto_1

    .line 49
    :cond_7
    :goto_0
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    move-result-object v9

    invoke-virtual {v9, v0}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->e(Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result v9

    .line 50
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "loadSplashAd onSuccess "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v9, :cond_9

    .line 51
    iget-object v9, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    iget-object v15, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    move-object v10, v1

    move-wide v11, v4

    invoke-static/range {v9 .. v15}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/components/ad/splashscreen/b$b;Lcom/kwad/sdk/core/response/model/AdTemplate;JJLjava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_8

    return-void

    .line 52
    :cond_8
    iget-object v0, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BU:Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;

    invoke-static {v0, v2, v1}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;Lcom/kwad/sdk/api/KsSplashScreenAd;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 53
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x2

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 54
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    .line 55
    invoke-static {v8, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    const/4 v1, 0x1

    .line 57
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/o/a;->aD(I)V

    goto :goto_1

    .line 58
    :cond_9
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    invoke-static/range {p1 .. p1}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->f(Lcom/kwad/sdk/core/response/model/AdResultData;)Z

    move-result v3

    if-eqz v3, :cond_c

    const-string v3, "loadSplashAd image returned"

    .line 59
    invoke-static {v8, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->kz()Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;

    move-result-object v3

    const/4 v8, 0x1

    invoke-virtual {v3, v0, v8}, Lcom/kwad/components/ad/splashscreen/SplashPreloadManager;->b(Lcom/kwad/sdk/core/response/model/AdResultData;Z)I

    move-result v0

    .line 61
    iget-object v9, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    iget-object v15, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    move-object v10, v1

    move-wide v11, v4

    invoke-static/range {v9 .. v15}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/components/ad/splashscreen/b$b;Lcom/kwad/sdk/core/response/model/AdTemplate;JJLjava/lang/Runnable;)Z

    move-result v3

    if-eqz v3, :cond_a

    return-void

    :cond_a
    if-lez v0, :cond_b

    .line 62
    iget-object v0, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BU:Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;

    invoke-static {v0, v2, v1}, Lcom/kwad/components/ad/splashscreen/b;->b(Lcom/kwad/sdk/api/KsLoadManager$SplashScreenAdListener;Lcom/kwad/sdk/api/KsSplashScreenAd;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 63
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x3

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 64
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    .line 65
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    .line 66
    invoke-virtual {v0, v6}, Lcom/kwad/components/core/o/a;->aD(I)V

    goto/16 :goto_3

    .line 67
    :cond_b
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x4

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 68
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    .line 69
    iget-object v0, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BW:Lcom/kwad/components/ad/splashscreen/b$a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/splashscreen/b$a;->a(Lcom/kwad/components/ad/splashscreen/b$a;Z)Z

    .line 70
    sget-object v0, Lcom/kwad/sdk/core/network/e;->awN:Lcom/kwad/sdk/core/network/e;

    iget v1, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    iget-object v0, v0, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v2, p2

    :try_start_2
    invoke-virtual {v7, v1, v0, v2}, Lcom/kwad/components/ad/splashscreen/b$3;->a(ILjava/lang/String;Z)V

    :goto_1
    return-void

    :cond_c
    move/from16 v2, p2

    move-object v0, v8

    .line 71
    iget-object v3, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BT:Lcom/kwad/components/ad/splashscreen/b$b;

    invoke-static {v3}, Lcom/kwad/components/ad/splashscreen/b$b;->a(Lcom/kwad/components/ad/splashscreen/b$b;)Z

    move-result v3

    if-eqz v3, :cond_d

    const-string v1, "loadSplashAd isTimeOut return "

    .line 72
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 73
    :cond_d
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/b;->kp()Landroid/os/Handler;

    move-result-object v3

    iget-object v6, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BV:Ljava/lang/Runnable;

    invoke-virtual {v3, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 74
    invoke-static {}, Lcom/kwad/components/ad/splashscreen/monitor/b;->kW()Lcom/kwad/components/ad/splashscreen/monitor/b;

    const/4 v10, 0x5

    iget-wide v13, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BX:J

    move-object v9, v1

    move-wide v11, v4

    .line 75
    invoke-static/range {v9 .. v14}, Lcom/kwad/components/ad/splashscreen/monitor/b;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;IJJ)V

    .line 76
    iget-object v1, v7, Lcom/kwad/components/ad/splashscreen/b$3;->BW:Lcom/kwad/components/ad/splashscreen/b$a;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lcom/kwad/components/ad/splashscreen/b$a;->a(Lcom/kwad/components/ad/splashscreen/b$a;Z)Z

    .line 77
    sget-object v1, Lcom/kwad/sdk/core/network/e;->awL:Lcom/kwad/sdk/core/network/e;

    iget v1, v1, Lcom/kwad/sdk/core/network/e;->errorCode:I

    const-string v3, "\u8bf7\u6c42\u6210\u529f\uff0c\u4f46\u7f13\u5b58\u672a\u547d\u4e2d"

    invoke-virtual {v7, v1, v3, v2}, Lcom/kwad/components/ad/splashscreen/b$3;->a(ILjava/lang/String;Z)V

    const-string v1, "loadSplashAd no cache returned"

    .line 78
    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    const/4 v1, 0x3

    .line 80
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/o/a;->aD(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move/from16 v2, p2

    goto :goto_2

    :catchall_2
    move-exception v0

    move v2, v8

    .line 81
    :goto_2
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    .line 82
    sget-object v0, Lcom/kwad/sdk/core/network/e;->awP:Lcom/kwad/sdk/core/network/e;

    iget v1, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    iget-object v0, v0, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    invoke-virtual {v7, v1, v0, v2}, Lcom/kwad/components/ad/splashscreen/b$3;->a(ILjava/lang/String;Z)V

    :goto_3
    return-void
.end method
