.class public Lcom/kwad/sdk/commercial/e/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apD:Ljava/lang/String;

.field public apE:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static Bv()Lcom/kwad/sdk/commercial/e/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/e/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/e/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bC(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/e/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public final cG(Ljava/lang/String;)Lcom/kwad/sdk/commercial/e/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/e/b;->apD:Ljava/lang/String;

    return-object p0
.end method

.method public final cH(Ljava/lang/String;)Lcom/kwad/sdk/commercial/e/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/e/b;->apE:Ljava/lang/String;

    return-object p0
.end method

.method public synthetic setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/e/b;->bC(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/e/b;

    move-result-object p1

    return-object p1
.end method
