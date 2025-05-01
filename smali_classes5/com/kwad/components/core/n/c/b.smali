.class public Lcom/kwad/components/core/n/c/b;
.super Lcom/kwad/sdk/commercial/c/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public Ot:Ljava/lang/String;

.field public Ou:J

.field public Ov:J

.field public Ow:J

.field public Ox:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/commercial/c/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(J)Lcom/kwad/components/core/n/c/b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/n/c/b;->Ou:J

    return-object p0
.end method

.method public final B(J)Lcom/kwad/components/core/n/c/b;
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/core/n/c/b;->Ov:J

    return-object p0
.end method

.method public final an(Ljava/lang/String;)Lcom/kwad/components/core/n/c/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/c/b;->Ot:Ljava/lang/String;

    return-object p0
.end method

.method public final ao(Ljava/lang/String;)Lcom/kwad/components/core/n/c/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/commercial/c/a;->errorMsg:Ljava/lang/String;

    return-object p0
.end method

.method public final ap(Ljava/lang/String;)Lcom/kwad/components/core/n/c/b;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/n/c/b;->Ox:Ljava/lang/String;

    return-object p0
.end method

.method public final aw(I)Lcom/kwad/components/core/n/c/b;
    .locals 2

    int-to-long v0, p1

    .line 1
    iput-wide v0, p0, Lcom/kwad/components/core/n/c/b;->Ow:J

    return-object p0
.end method

.method public final ax(I)Lcom/kwad/components/core/n/c/b;
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/sdk/commercial/c/a;->errorCode:I

    return-object p0
.end method

.method public synthetic setErrorCode(I)Lcom/kwad/sdk/commercial/c/a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/kwad/components/core/n/c/b;->ax(I)Lcom/kwad/components/core/n/c/b;

    move-result-object p1

    return-object p1
.end method
