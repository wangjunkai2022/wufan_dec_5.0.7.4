.class final Lcom/kwad/sdk/core/adlog/b$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/core/adlog/b;->a(Lcom/kwad/sdk/core/adlog/c/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aqr:Lcom/kwad/sdk/core/adlog/c/a;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/core/adlog/c/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/b$1;->aqr:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/a;

    iget-object v1, p0, Lcom/kwad/sdk/core/adlog/b$1;->aqr:Lcom/kwad/sdk/core/adlog/c/a;

    invoke-direct {v0, v1}, Lcom/kwad/sdk/core/adlog/a;-><init>(Lcom/kwad/sdk/core/adlog/c/a;)V

    .line 2
    invoke-virtual {v0}, Lcom/kwad/sdk/core/adlog/a;->getUrl()Ljava/lang/String;

    move-result-object v1

    .line 3
    invoke-virtual {v0}, Lcom/kwad/sdk/core/adlog/a;->getBody()Lorg/json/JSONObject;

    move-result-object v0

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/core/adlog/b$1;->aqr:Lcom/kwad/sdk/core/adlog/c/a;

    const/4 v3, 0x0

    invoke-static {v1, v0, v2, v3}, Lcom/kwad/sdk/core/adlog/b;->b(Ljava/lang/String;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/a;Lcom/kwad/sdk/core/adlog/a/a;)V

    return-void
.end method
