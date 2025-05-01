.class public Lcom/kwad/sdk/core/adlog/a/c;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public aqF:Z

.field public aqG:I

.field public aqH:J

.field public aqI:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/adlog/a/c;->aqG:I

    const-wide/16 v0, 0x258

    .line 3
    iput-wide v0, p0, Lcom/kwad/sdk/core/adlog/a/c;->aqH:J

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/adlog/a/c;->aqI:I

    return-void
.end method
