.class public Lcom/kwad/sdk/core/adlog/b/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public apT:I

.field public aqA:Ljava/lang/String;

.field public aqJ:I

.field public aqK:I

.field public aqL:J

.field public aqz:I

.field public retryCount:I

.field public status:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method

.method public static BX()Lcom/kwad/sdk/core/adlog/b/b;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/b/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/b/b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final al(J)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->aqL:J

    return-object p0
.end method

.method public final bU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/commercial/c/a;->setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;

    return-object p0
.end method

.method public final cs(I)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->status:I

    return-object p0
.end method

.method public final ct(I)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->apT:I

    return-object p0
.end method

.method public final cu(I)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->retryCount:I

    return-object p0
.end method

.method public final cv(I)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->aqz:I

    return-object p0
.end method

.method public final cw(I)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->aqJ:I

    return-object p0
.end method

.method public final cx(I)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->aqK:I

    return-object p0
.end method

.method public final di(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/b/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/core/adlog/b/b;->aqA:Ljava/lang/String;

    return-object p0
.end method

.method public synthetic setAdTemplate(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/adlog/b/b;->bU(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/adlog/b/b;

    move-result-object p1

    return-object p1
.end method
