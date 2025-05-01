.class final Lcom/kwad/components/ad/adbit/c$5;
.super Lcom/kwad/sdk/core/network/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/adbit/c;->a(Ljava/util/List;Lcom/kwad/components/ad/adbit/AdBitResultData;Lcom/kwad/components/core/request/model/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/core/network/o<",
        "Lcom/kwad/components/ad/a/b;",
        "Lcom/kwad/components/ad/adbit/AdBitResultData;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic bB:Lcom/kwad/components/core/request/model/a;

.field final synthetic bD:Lcom/kwad/components/ad/adbit/AdBitResultData;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/adbit/AdBitResultData;Lcom/kwad/components/core/request/model/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/adbit/c$5;->bD:Lcom/kwad/components/ad/adbit/AdBitResultData;

    iput-object p2, p0, Lcom/kwad/components/ad/adbit/c$5;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-direct {p0}, Lcom/kwad/sdk/core/network/o;-><init>()V

    return-void
.end method

.method private b(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$5;->bB:Lcom/kwad/components/core/request/model/a;

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;ILjava/lang/String;Z)V

    return-void
.end method

.method private c(Lcom/kwad/components/ad/adbit/AdBitResultData;)V
    .locals 4
    .param p1    # Lcom/kwad/components/ad/adbit/AdBitResultData;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$5;->bD:Lcom/kwad/components/ad/adbit/AdBitResultData;

    invoke-static {v0, p1}, Lcom/kwad/components/ad/adbit/c;->b(Lcom/kwad/components/ad/adbit/AdBitResultData;Lcom/kwad/components/ad/adbit/AdBitResultData;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/model/AdResultData;->setAdTemplateList(Ljava/util/List;)V

    const-string v0, "server_bid_two"

    .line 2
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/model/AdResultData;->setAdSource(Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/model/AdResultData;->isAdResultDataEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$5;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-static {v0, p1, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;Z)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/model/AdResultData;->getAdTemplateList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 6
    iget-object v2, p0, Lcom/kwad/components/ad/adbit/c$5;->bB:Lcom/kwad/components/core/request/model/a;

    iget-object v2, v2, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v2, v2, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    iget v2, v2, Lcom/kwad/sdk/internal/api/SceneImpl;->adStyle:I

    const/16 v3, 0x2710

    if-eq v2, v3, :cond_1

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/e;->dM(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    if-eq v2, v0, :cond_1

    .line 8
    iget-object p1, p0, Lcom/kwad/components/ad/adbit/c$5;->bB:Lcom/kwad/components/core/request/model/a;

    sget-object v0, Lcom/kwad/sdk/core/network/e;->awO:Lcom/kwad/sdk/core/network/e;

    iget v2, v0, Lcom/kwad/sdk/core/network/e;->errorCode:I

    iget-object v0, v0, Lcom/kwad/sdk/core/network/e;->msg:Ljava/lang/String;

    invoke-static {p1, v2, v0, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;ILjava/lang/String;Z)V

    return-void

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/adbit/c$5;->bB:Lcom/kwad/components/core/request/model/a;

    invoke-static {v0, p1, v1}, Lcom/kwad/components/core/request/model/a;->a(Lcom/kwad/components/core/request/model/a;Lcom/kwad/sdk/core/response/model/AdResultData;Z)V

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
    invoke-direct {p0, p2, p3}, Lcom/kwad/components/ad/adbit/c$5;->b(ILjava/lang/String;)V

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
    check-cast p2, Lcom/kwad/components/ad/adbit/AdBitResultData;

    invoke-direct {p0, p2}, Lcom/kwad/components/ad/adbit/c$5;->c(Lcom/kwad/components/ad/adbit/AdBitResultData;)V

    return-void
.end method
