.class final Lcom/kwad/sdk/crash/report/request/b$2;
.super Lcom/kwad/sdk/core/network/o;
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
        "Lcom/kwad/sdk/core/network/o<",
        "Lcom/kwad/sdk/crash/report/request/a;",
        "Lcom/kwad/sdk/crash/report/request/CrashReportResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic aIB:Ljava/util/concurrent/CountDownLatch;

.field final synthetic aIC:Lcom/kwad/sdk/crash/report/request/b$a;

.field final synthetic aIz:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lcom/kwad/sdk/crash/report/request/b$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIz:Ljava/util/List;

    iput-object p2, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIB:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIC:Lcom/kwad/sdk/crash/report/request/b$a;

    invoke-direct {p0}, Lcom/kwad/sdk/core/network/o;-><init>()V

    return-void
.end method

.method private IL()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIB:Ljava/util/concurrent/CountDownLatch;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIC:Lcom/kwad/sdk/crash/report/request/b$a;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0}, Lcom/kwad/sdk/crash/report/request/b$a;->onSuccess()V

    :cond_1
    return-void
.end method

.method private u(ILjava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIB:Ljava/util/concurrent/CountDownLatch;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/sdk/crash/report/request/b$2;->aIC:Lcom/kwad/sdk/crash/report/request/b$a;

    if-eqz v0, :cond_1

    .line 4
    invoke-interface {v0, p1, p2}, Lcom/kwad/sdk/crash/report/request/b$a;->onError(ILjava/lang/String;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final synthetic onError(Lcom/kwad/sdk/core/network/f;ILjava/lang/String;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/network/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p2, p3}, Lcom/kwad/sdk/crash/report/request/b$2;->u(ILjava/lang/String;)V

    return-void
.end method

.method public final synthetic onSuccess(Lcom/kwad/sdk/core/network/f;Lcom/kwad/sdk/core/response/model/BaseResultData;)V
    .locals 0
    .param p1    # Lcom/kwad/sdk/core/network/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/kwad/sdk/core/response/model/BaseResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/crash/report/request/b$2;->IL()V

    return-void
.end method
