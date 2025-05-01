.class public final Lcom/kwad/sdk/crash/online/monitor/block/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic An()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/f;->ID()I

    move-result v0

    return v0
.end method

.method private static Fk()Z
    .locals 6

    .line 1
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/f;->ID()I

    move-result v0

    .line 2
    const-class v1, Lcom/kwad/sdk/service/a/f;

    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v1}, Lcom/kwad/sdk/service/a/f;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    .line 3
    :cond_0
    invoke-static {v1}, Lcom/kwad/sdk/crash/online/monitor/block/report/a;->bJ(Landroid/content/Context;)Lcom/kwad/sdk/crash/online/monitor/block/report/a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/core/report/d;->size()J

    move-result-wide v3

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v5, "size:"

    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v5, " limit:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v5, "perfMonitor.Reporter"

    invoke-static {v5, v1}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    int-to-long v0, v0

    cmp-long v5, v3, v0

    if-ltz v5, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method private static ID()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/e;->IB()Lcom/kwad/sdk/crash/online/monitor/a/a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget v0, v0, Lcom/kwad/sdk/crash/online/monitor/a/a;->aIk:I

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    :goto_0
    return v0
.end method

.method static synthetic IE()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/f;->Fk()Z

    move-result v0

    return v0
.end method

.method public static a(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    :try_start_0
    invoke-static/range {p0 .. p6}, Lcom/kwad/sdk/crash/online/monitor/block/f;->b(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    .line 2
    invoke-static {p0, p1}, Lcom/kwad/sdk/crash/online/monitor/block/f;->h(Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method

.method private static b(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 9
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    :try_start_0
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v1, ""

    if-eqz v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    :try_start_1
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/b;->fH(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 3
    invoke-static {p0}, Lcom/kwad/sdk/crash/online/monitor/block/f;->fJ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_2

    const-wide/16 p3, 0x7d0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-static {v0}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "perfMonitor.Reporter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    move-object v2, p0

    move-wide v5, p3

    move-wide v3, p1

    move-object v7, p5

    move-object v8, p6

    .line 6
    invoke-static/range {v2 .. v8}, Lcom/kwad/sdk/crash/online/monitor/block/f;->c(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;

    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;)Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;-><init>()V

    .line 2
    iput-wide p3, v0, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;->blockDuration:J

    .line 3
    iput-object p5, v0, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;->currentActivity:Ljava/lang/String;

    .line 4
    iput-object p6, v0, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;->processName:Ljava/lang/String;

    .line 5
    new-instance p5, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent$a;

    invoke-direct {p5}, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent$a;-><init>()V

    .line 6
    iput-object p0, p5, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent$a;->aHP:Ljava/lang/String;

    const-wide/16 v1, 0x0

    cmp-long p0, p1, v1

    if-nez p0, :cond_0

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 8
    :cond_0
    iput-wide p1, p5, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent$a;->aHN:J

    .line 9
    iget-wide p0, v0, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;->blockLoopInterval:J

    div-long/2addr p3, p0

    long-to-int p0, p3

    iput p0, p5, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent$a;->repeatCount:I

    .line 10
    iget-object p0, v0, Lcom/kwad/sdk/crash/online/monitor/block/BlockEvent;->stackTraceSample:Ljava/util/List;

    invoke-interface {p0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method private static fJ(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, "perfMonitor.Reporter"

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_0

    return-object v2

    :cond_0
    :try_start_0
    const-string v1, " \n"

    .line 2
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    .line 3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "oldVersion:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "at "

    const-string v4, "\n"

    if-eqz v1, :cond_2

    .line 4
    :try_start_1
    invoke-virtual {p0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p0, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    :cond_1
    const-string v1, ":"

    const-string v5, "\\."

    .line 6
    invoke-virtual {p0, v1, v5}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 8
    :cond_2
    invoke-virtual {p0, v3, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, " "

    .line 9
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 10
    invoke-virtual {p0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v2, "\n\tat "

    if-eqz v1, :cond_3

    .line 11
    :try_start_2
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 12
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "_"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "\n\tat _"

    .line 13
    invoke-virtual {p0, v1, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catch_0
    move-exception v1

    .line 15
    invoke-static {v1}, Landroid/util/Log;->getStackTraceString(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method

.method public static fK(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "reportPrinterName:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "perfMonitor.Reporter"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/e;->IC()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Lcom/kwad/sdk/crash/online/monitor/block/d;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/online/monitor/block/d;-><init>()V

    .line 5
    iput-object p0, v0, Lcom/kwad/sdk/crash/online/monitor/block/d;->aHV:Ljava/lang/String;

    .line 6
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/a;->IA()Z

    move-result p0

    iput-boolean p0, v0, Lcom/kwad/sdk/crash/online/monitor/block/d;->aHX:Z

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/commercial/b;->o(Lcom/kwad/sdk/commercial/c/a;)V

    :cond_1
    return-void
.end method

.method public static fL(Ljava/lang/String;)V
    .locals 2

    .line 1
    :try_start_0
    new-instance v0, Lcom/kwad/sdk/crash/online/monitor/block/d;

    invoke-direct {v0}, Lcom/kwad/sdk/crash/online/monitor/block/d;-><init>()V

    .line 2
    iput-object p0, v0, Lcom/kwad/sdk/crash/online/monitor/block/d;->errorMsg:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/kwad/sdk/crash/online/monitor/block/a;->IA()Z

    move-result v1

    iput-boolean v1, v0, Lcom/kwad/sdk/crash/online/monitor/block/d;->aHX:Z

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/commercial/b;->o(Lcom/kwad/sdk/commercial/c/a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const-string v0, "perfMonitor.Reporter"

    .line 5
    invoke-static {v0, p0}, Lcom/kwad/sdk/core/e/c;->w(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static h(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/crash/online/monitor/block/f$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/sdk/crash/online/monitor/block/f$1;-><init>(Ljava/lang/String;Z)V

    invoke-static {v0}, Lcom/kwad/sdk/utils/g;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
