.class public final Lcom/kwad/sdk/crash/online/monitor/block/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aHY:Lcom/kwad/sdk/crash/online/monitor/a/a;


# direct methods
.method public static IB()Lcom/kwad/sdk/crash/online/monitor/a/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/e;->aHY:Lcom/kwad/sdk/crash/online/monitor/a/a;

    return-object v0
.end method

.method public static IC()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/kwad/sdk/crash/online/monitor/block/e;->aHY:Lcom/kwad/sdk/crash/online/monitor/a/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/kwad/sdk/crash/online/monitor/a/a;->IF()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Lcom/kwad/sdk/crash/online/monitor/a/a;)V
    .locals 7

    if-nez p0, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/kwad/sdk/crash/online/monitor/a/a;->II()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "perfMonitor.BlockManager"

    if-eqz v0, :cond_1

    :try_start_1
    const-string p0, "allFuncDisable"

    .line 2
    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 3
    :cond_1
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/a;->Iz()Z

    move-result v0

    if-nez v0, :cond_2

    const-string p0, "!hasBlockMonitor"

    .line 4
    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 5
    :cond_2
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/a;->a(Lcom/kwad/sdk/crash/online/monitor/a/a;)V

    .line 6
    sput-object p0, Lcom/kwad/sdk/crash/online/monitor/block/e;->aHY:Lcom/kwad/sdk/crash/online/monitor/a/a;

    const/4 v0, 0x1

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/crash/online/monitor/block/a;->bA(Z)Z

    move-result v0

    .line 8
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "hasTenBlockHook:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F

    move-result v2

    float-to-double v2, v2

    .line 10
    iget-wide v4, p0, Lcom/kwad/sdk/crash/online/monitor/a/a;->apu:D

    cmpg-double v6, v4, v2

    if-gez v6, :cond_3

    return-void

    .line 11
    :cond_3
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/b;->a(Lcom/kwad/sdk/crash/online/monitor/a/a;)V

    .line 12
    invoke-virtual {p0}, Lcom/kwad/sdk/crash/online/monitor/a/a;->IG()Z

    move-result v2

    if-eqz v2, :cond_4

    if-eqz v0, :cond_4

    .line 13
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/c;->b(Lcom/kwad/sdk/crash/online/monitor/a/a;)V

    .line 14
    :cond_4
    invoke-virtual {p0}, Lcom/kwad/sdk/crash/online/monitor/a/a;->IH()Z

    move-result p0

    if-eqz p0, :cond_5

    const/4 p0, 0x0

    .line 15
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/a;->bB(Z)Z

    move-result p0

    .line 16
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "hasOtherBlockMonitor:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    return-void

    :catchall_0
    move-exception p0

    .line 17
    :try_start_2
    invoke-static {p0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    return-void
.end method
