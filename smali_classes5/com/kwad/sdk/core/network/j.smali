.class public Lcom/kwad/sdk/core/network/j;
.super Lcom/kwad/sdk/core/network/i;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public axA:I

.field public axB:I

.field public axC:I

.field public axd:J

.field public axe:J

.field public axf:J

.field public axg:I

.field public axh:J

.field public axi:J

.field public axj:J

.field public axk:J

.field public axl:J

.field public axm:J

.field public axn:J

.field public axo:J

.field public axp:J

.field public axq:J

.field public axr:J

.field public axs:J

.field public axt:J

.field public axu:I

.field public axv:Ljava/lang/String;

.field public axw:I

.field public axx:J

.field public axy:Ljava/lang/String;

.field public axz:I

.field public result:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/network/i;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axd:J

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axe:J

    .line 4
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axf:J

    .line 5
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axh:J

    .line 6
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axi:J

    .line 7
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axj:J

    .line 8
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axk:J

    .line 9
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axl:J

    .line 10
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axm:J

    .line 11
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axn:J

    .line 12
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axo:J

    .line 13
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axp:J

    .line 14
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axq:J

    .line 15
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axr:J

    .line 16
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axs:J

    .line 17
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axt:J

    const-string v2, ""

    .line 18
    iput-object v2, p0, Lcom/kwad/sdk/core/network/j;->axv:Ljava/lang/String;

    .line 19
    iput-wide v0, p0, Lcom/kwad/sdk/core/network/j;->axx:J

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
