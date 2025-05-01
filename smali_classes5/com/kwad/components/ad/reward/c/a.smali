.class public Lcom/kwad/components/ad/reward/c/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile ri:Lcom/kwad/components/ad/reward/c/a;


# instance fields
.field private qp:Lcom/kwad/components/ad/reward/g;

.field private rj:Lcom/kwad/components/ad/reward/c/b;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private volatile rk:Z

.field private volatile rl:Z

.field private rm:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/kwad/components/core/webview/jshandler/h;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/c/a;->rk:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/c/a;->rl:Z

    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rm:Ljava/util/List;

    return-void
.end method

.method public static gM()Lcom/kwad/components/ad/reward/c/a;
    .locals 2

    .line 1
    sget-object v0, Lcom/kwad/components/ad/reward/c/a;->ri:Lcom/kwad/components/ad/reward/c/a;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/kwad/components/ad/reward/c/a;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/kwad/components/ad/reward/c/a;->ri:Lcom/kwad/components/ad/reward/c/a;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/ad/reward/c/a;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/c/a;-><init>()V

    sput-object v1, Lcom/kwad/components/ad/reward/c/a;->ri:Lcom/kwad/components/ad/reward/c/a;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/kwad/components/ad/reward/c/a;->ri:Lcom/kwad/components/ad/reward/c/a;

    return-object v0
.end method

.method private declared-synchronized gO()Z
    .locals 2

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/kwad/components/ad/reward/c/b;->rq:I

    sget v1, Lcom/kwad/components/ad/reward/c/b;->rn:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    monitor-exit p0

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw v0

    :goto_2
    goto :goto_1
.end method

.method private isNeoScan()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->qp:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->mAdResultData:Lcom/kwad/sdk/core/response/model/AdResultData;

    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdResultData;->adGlobalConfigInfo:Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;

    if-eqz v0, :cond_0

    iget v0, v0, Lcom/kwad/sdk/core/response/model/AdGlobalConfigInfo;->neoPageType:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final M(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/c/a;->gO()Z

    move-result v0

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "checkStatusAndToast isCurrentHadExtra: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", hadToast: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/kwad/components/ad/reward/c/a;->rl:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "CurrentExtraRewardHolder"

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/c/a;->rl:Z

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/c/a;->rl:Z

    const-string v0, "\u606d\u559c\u83b7\u5f97\u7b2c2\u4efd\u5956\u52b1"

    .line 5
    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/v;->P(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Lcom/kwad/components/core/webview/jshandler/h;)V
    .locals 2

    .line 18
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "addGetNativeHandler: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "CurrentExtraRewardHolder"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 19
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rm:Ljava/util/List;

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final declared-synchronized a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/reward/c/b;)V
    .locals 4

    monitor-enter p0

    if-nez p1, :cond_0

    .line 1
    monitor-exit p0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "CurrentExtraRewardHolder"

    .line 2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "updateExtraReward: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iput-object p2, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    .line 4
    iget p2, p2, Lcom/kwad/components/ad/reward/c/b;->rq:I

    sget v0, Lcom/kwad/components/ad/reward/c/b;->rn:I

    if-ne p2, v0, :cond_1

    iget-boolean p2, p0, Lcom/kwad/components/ad/reward/c/a;->rk:Z

    if-nez p2, :cond_1

    const/4 p2, 0x1

    .line 5
    iput-boolean p2, p0, Lcom/kwad/components/ad/reward/c/a;->rk:Z

    .line 6
    iget-object p2, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    .line 7
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getUniqueId()Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-static {v0}, Lcom/kwad/components/ad/reward/e/f;->H(Ljava/lang/String;)Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;

    move-result-object v0

    .line 9
    invoke-static {p2, v0}, Lcom/kwad/components/ad/reward/c/c;->a(Lcom/kwad/components/ad/reward/c/b;Lcom/kwad/sdk/api/KsRewardVideoAd$RewardAdInteractionListener;)V

    .line 10
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/c/a;->isNeoScan()Z

    move-result p2

    invoke-static {p1, p2}, Lcom/kwad/sdk/core/adlog/c;->j(Lcom/kwad/sdk/core/response/model/AdTemplate;Z)V

    .line 11
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/ad/reward/c/a;->rm:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/ref/WeakReference;

    .line 12
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rm:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 14
    :cond_2
    invoke-virtual {p0}, Lcom/kwad/components/ad/reward/c/a;->gN()Lcom/kwad/components/ad/reward/c/b;

    move-result-object v0

    const-string v1, "CurrentExtraRewardHolder"

    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "GetNativeDataHandler callback: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/kwad/components/core/webview/jshandler/h;

    invoke-virtual {p2, v0}, Lcom/kwad/components/core/webview/jshandler/h;->a(Lcom/kwad/sdk/core/response/a/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 17
    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method public final declared-synchronized c(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "CurrentExtraRewardHolder"

    .line 1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "updateExtraReward: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->qp:Lcom/kwad/components/ad/reward/g;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/g;->fO()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/kwad/components/ad/reward/c/b;->STATUS_NONE:I

    if-ne p2, v0, :cond_0

    const-string p1, "CurrentExtraRewardHolder"

    const-string p2, "updateExtraReward: cant update to status 2"

    .line 4
    invoke-static {p1, p2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    .line 6
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/c/a;->gN()Lcom/kwad/components/ad/reward/c/b;

    move-result-object v0

    .line 7
    invoke-virtual {v0, p2}, Lcom/kwad/components/ad/reward/c/b;->M(I)V

    .line 8
    invoke-static {}, Lcom/kwad/components/ad/reward/c/a;->gM()Lcom/kwad/components/ad/reward/c/a;

    move-result-object p2

    invoke-virtual {p2, p1, v0}, Lcom/kwad/components/ad/reward/c/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/ad/reward/c/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final declared-synchronized gN()Lcom/kwad/components/ad/reward/c/b;
    .locals 3
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/kwad/components/ad/reward/c/c;->gQ()Lcom/kwad/components/ad/reward/c/b;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    const/4 v1, 0x0

    .line 3
    iput v1, v0, Lcom/kwad/components/ad/reward/c/b;->rq:I

    :cond_0
    const-string v0, "CurrentExtraRewardHolder"

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "getCurrentExtraReward: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    iget v2, v2, Lcom/kwad/components/ad/reward/c/b;->rq:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized reset()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 1
    :try_start_0
    iput-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->rj:Lcom/kwad/components/ad/reward/c/b;

    const/4 v1, 0x0

    .line 2
    iput-boolean v1, p0, Lcom/kwad/components/ad/reward/c/a;->rl:Z

    .line 3
    iput-boolean v1, p0, Lcom/kwad/components/ad/reward/c/a;->rk:Z

    .line 4
    iput-object v0, p0, Lcom/kwad/components/ad/reward/c/a;->qp:Lcom/kwad/components/ad/reward/g;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final setCallerContext(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/c/a;->qp:Lcom/kwad/components/ad/reward/g;

    return-void
.end method
