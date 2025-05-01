.class public abstract Lcom/kwad/components/core/request/c;
.super Lcom/kwad/components/core/request/j;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/core/request/j;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a(ILjava/lang/String;Z)V
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation
.end method

.method public abstract a(Lcom/kwad/sdk/core/response/model/AdResultData;Z)V
    .param p1    # Lcom/kwad/sdk/core/response/model/AdResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation
.end method
