.class public final Lcom/kwad/sdk/utils/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static aPM:Z

.field private static aPN:Z


# direct methods
.method public static LQ()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x2

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LR()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x4

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LS()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x800

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LT()Z
    .locals 1

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/h;->zh()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    sget-boolean v0, Lcom/kwad/sdk/utils/o;->aPM:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static LU()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    .line 2
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x10

    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LV()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x1000

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LW()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x1

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LX()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x80

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static LY()Z
    .locals 3

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/h;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/h;

    const-wide/16 v1, 0x80

    .line 2
    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/service/a/h;->ab(J)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    .line 3
    sget-boolean v1, Lcom/kwad/sdk/utils/o;->aPM:Z

    and-int/2addr v0, v1

    return v0
.end method

.method public static declared-synchronized bR(Z)V
    .locals 1

    const-class p0, Lcom/kwad/sdk/utils/o;

    monitor-enter p0

    .line 1
    :try_start_0
    sget-boolean v0, Lcom/kwad/sdk/utils/o;->aPN:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 2
    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 3
    :try_start_1
    sput-boolean v0, Lcom/kwad/sdk/utils/o;->aPN:Z

    .line 4
    sput-boolean v0, Lcom/kwad/sdk/utils/o;->aPM:Z

    .line 5
    const-class v0, Lcom/kwad/sdk/service/a/b;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/b;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/b;->yR()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 6
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
