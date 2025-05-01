.class public Lcom/kwad/components/core/n/c/d;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public Ot:Ljava/lang/String;

.field public Ou:J

.field public Ov:J

.field public Ox:Ljava/lang/String;

.field public Oy:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final C(J)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/n/c/d;->Ou:J

    return-object p0
.end method

.method public final D(J)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/n/c/d;->Ov:J

    return-object p0
.end method

.method public final E(J)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/n/c/d;->Oy:J

    return-object p0
.end method

.method public final aq(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/c/d;->Ot:Ljava/lang/String;

    return-object p0
.end method

.method public final ar(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c/a;->errorMsg:Ljava/lang/String;

    return-object p0
.end method

.method public final as(Ljava/lang/String;)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/c/d;->Ox:Ljava/lang/String;

    return-object p0
.end method

.method public final ay(I)Lcom/kwad/components/core/n/c/d;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/c/a;->errorCode:I

    return-object p0
.end method

.method public synthetic setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/n/c/d;->ay(I)Lcom/kwad/components/core/n/c/d;

    move-result-object p1

    return-object p1
.end method
