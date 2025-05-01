.class public Lcom/kwad/sdk/core/request/model/d;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public aAS:Ljava/lang/String;

.field public aAT:Ljava/lang/String;

.field public aAU:I

.field public aAV:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    return-void
.end method

.method public static FM()Lcom/kwad/sdk/core/request/model/d;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/request/model/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/request/model/d;-><init>()V

    .line 2
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->Lw()Landroid/content/Context;

    move-result-object v1

    .line 3
    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cK(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/d;->aAS:Ljava/lang/String;

    .line 4
    const-class v2, Lcom/kwad/sdk/service/a/f;

    invoke-static {v2}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v2}, Lcom/kwad/sdk/service/a/f;->yZ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/sdk/core/request/model/d;->aAT:Ljava/lang/String;

    .line 5
    invoke-static {v1}, Lcom/kwad/sdk/utils/ah;->cx(Landroid/content/Context;)I

    move-result v2

    iput v2, v0, Lcom/kwad/sdk/core/request/model/d;->aAU:I

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/utils/aw;->cN(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lcom/kwad/sdk/utils/av;->Nc()Z

    move-result v3

    .line 7
    invoke-static {v1, v2, v3}, Lcom/kwad/sdk/utils/ah;->d(Landroid/content/Context;Ljava/lang/String;Z)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/request/model/d;->aAV:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 8
    invoke-static {v1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method public static FN()Lcom/kwad/sdk/core/request/model/d;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/request/model/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/request/model/d;-><init>()V

    .line 2
    invoke-static {}, Lcom/kwad/sdk/service/ServiceProvider;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/utils/ah;->cx(Landroid/content/Context;)I

    move-result v1

    iput v1, v0, Lcom/kwad/sdk/core/request/model/d;->aAU:I

    return-object v0
.end method
