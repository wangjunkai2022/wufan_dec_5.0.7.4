.class public Lcom/kwad/sdk/core/adlog/b/d;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apM:Ljava/lang/String;

.field public apT:I

.field public aqM:I

.field public retryCount:I

.field public status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static BY()Lcom/kwad/sdk/core/adlog/b/d;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/b/d;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/b/d;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bV(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public final cA(I)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/d;->aqM:I

    return-object p0
.end method

.method public final cB(I)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/d;->retryCount:I

    return-object p0
.end method

.method public final cC(I)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public final cy(I)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/d;->status:I

    return-object p0
.end method

.method public final cz(I)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/d;->apT:I

    return-object p0
.end method

.method public final dj(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/b/d;->apM:Ljava/lang/String;

    return-object p0
.end method

.method public final dk(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/b/d;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public synthetic setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/adlog/b/d;->bV(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/adlog/b/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/adlog/b/d;->cC(I)Lcom/kwad/sdk/core/adlog/b/d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/adlog/b/d;->dk(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/b/d;

    move-result-object p1

    return-object p1
.end method
