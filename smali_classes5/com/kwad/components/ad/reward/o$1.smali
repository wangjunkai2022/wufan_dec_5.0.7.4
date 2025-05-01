.class final Lcom/kwad/components/ad/reward/o$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/o;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/response/model/AdInfo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field final synthetic qs:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/o$1;->qs:Ljava/lang/String;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/o$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private E(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/o$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, p1}, Lcom/kwad/components/core/o/a;->g(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    return-void
.end method

.method private gp()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/o$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v2, 0x0

    const-string v3, "success"

    invoke-virtual {v0, v1, v2, v3}, Lcom/kwad/components/core/o/a;->g(Lcom/kwad/sdk/core/response/model/AdTemplate;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    :try_start_0
    invoke-static {}, Lcom/kwad/sdk/g;->yy()Lcom/kwad/sdk/export/proxy/AdHttpProxy;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/o$1;->qs:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/kwad/sdk/export/proxy/AdHttpProxy;->doGet(Ljava/lang/String;Ljava/util/Map;)Lcom/kwad/sdk/core/network/c;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "Network Error: url invalid"

    .line 2
    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/o$1;->E(Ljava/lang/String;)V

    goto :goto_1

    .line 3
    :cond_0
    iget v1, v0, Lcom/kwad/sdk/core/network/c;->code:I

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_2

    .line 4
    iget-object v0, v0, Lcom/kwad/sdk/core/network/c;->awE:Ljava/lang/String;

    .line 5
    new-instance v1, Lcom/kwad/components/ad/reward/o$a;

    invoke-direct {v1, v0}, Lcom/kwad/components/ad/reward/o$a;-><init>(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v1}, Lcom/kwad/components/ad/reward/o$a;->isValid()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/o$1;->gp()V

    goto :goto_0

    .line 8
    :cond_1
    invoke-static {v1}, Lcom/kwad/components/ad/reward/o$a;->a(Lcom/kwad/components/ad/reward/o$a;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/o$1;->E(Ljava/lang/String;)V

    goto :goto_1

    .line 9
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Network Error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/kwad/sdk/core/network/c;->awE:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/o$1;->E(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-void

    :catchall_0
    move-exception v0

    .line 10
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Request Error: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/kwad/components/ad/reward/o$1;->E(Ljava/lang/String;)V

    :goto_1
    return-void
.end method
