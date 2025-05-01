.class final Lcom/kwad/sdk/crash/report/request/b$1;
.super Lcom/kwad/sdk/core/network/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/crash/report/request/b;->a(Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lcom/kwad/sdk/crash/report/request/b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/core/network/l<",
        "Lcom/kwad/sdk/crash/report/request/a;",
        "Lcom/kwad/sdk/crash/report/request/CrashReportResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aIz:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/report/request/b$1;->aIz:Ljava/util/List;

    invoke-direct {p0}, Lcom/kwad/sdk/core/network/l;-><init>()V

    return-void
.end method

.method private IK()Lcom/kwad/sdk/crash/report/request/a;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/kwad/sdk/crash/report/request/b$1$1;

    iget-object v1, p0, Lcom/kwad/sdk/crash/report/request/b$1;->aIz:Ljava/util/List;

    invoke-direct {v0, p0, v1}, Lcom/kwad/sdk/crash/report/request/b$1$1;-><init>(Lcom/kwad/sdk/crash/report/request/b$1;Ljava/util/List;)V

    return-object v0
.end method

.method private static fQ(Ljava/lang/String;)Lcom/kwad/sdk/crash/report/request/CrashReportResult;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p0, Lcom/kwad/sdk/crash/report/request/CrashReportResult;

    invoke-direct {p0}, Lcom/kwad/sdk/crash/report/request/CrashReportResult;-><init>()V

    .line 3
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/crash/report/request/CrashReportResult;->parseJson(Lorg/json/JSONObject;)V

    return-object p0
.end method


# virtual methods
.method public final synthetic createRequest()Lcom/kwad/sdk/core/network/f;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/crash/report/request/b$1;->IK()Lcom/kwad/sdk/crash/report/request/a;

    move-result-object v0

    return-object v0
.end method

.method public final enableCrashReport()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final enableMonitorReport()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic parseData(Ljava/lang/String;)Lcom/kwad/sdk/core/response/model/BaseResultData;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-static {p1}, Lcom/kwad/sdk/crash/report/request/b$1;->fQ(Ljava/lang/String;)Lcom/kwad/sdk/crash/report/request/CrashReportResult;

    move-result-object p1

    return-object p1
.end method
