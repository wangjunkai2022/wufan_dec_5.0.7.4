.class public Lcom/kwad/sdk/commercial/j/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apL:Ljava/lang/String;

.field public apM:Ljava/lang/String;

.field public apT:I

.field public apU:I

.field public status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static BF()Lcom/kwad/sdk/commercial/j/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/commercial/j/b;

    invoke-direct {v0}, Lcom/kwad/sdk/commercial/j/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final bE(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public final cV(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/j/b;->apL:Ljava/lang/String;

    return-object p0
.end method

.method public final cW(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/j/b;->apM:Ljava/lang/String;

    return-object p0
.end method

.method public final cX(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public final cn(I)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/j/b;->status:I

    return-object p0
.end method

.method public final co(I)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/j/b;->apT:I

    return-object p0
.end method

.method public final cp(I)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/j/b;->apU:I

    return-object p0
.end method

.method public final cq(I)Lcom/kwad/sdk/commercial/j/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public synthetic setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/j/b;->bE(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/j/b;->cq(I)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic setErrorMsg(Ljava/lang/String;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/commercial/j/b;->cX(Ljava/lang/String;)Lcom/kwad/sdk/commercial/j/b;

    move-result-object p1

    return-object p1
.end method
