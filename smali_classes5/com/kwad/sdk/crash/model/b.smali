.class public Lcom/kwad/sdk/crash/model/b;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# instance fields
.field public aHu:I

.field public aHv:Ljava/lang/String;

.field public aHw:Ljava/lang/String;

.field public aHx:Ljava/lang/String;

.field public aHy:Ljava/lang/String;

.field public aHz:Ljava/lang/String;

.field public sdkType:I

.field public version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/crash/model/b;->aHu:I

    const-string v0, "3.3.47"

    .line 3
    iput-object v0, p0, Lcom/kwad/sdk/crash/model/b;->aHv:Ljava/lang/String;

    const/4 v0, 0x1

    .line 4
    iput v0, p0, Lcom/kwad/sdk/crash/model/b;->sdkType:I

    return-void
.end method
