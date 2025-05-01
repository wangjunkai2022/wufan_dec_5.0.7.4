.class public Lcom/kwad/components/ad/reward/c/b;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation


# static fields
.field public static STATUS_NONE:I = 0x2

.field public static rn:I = 0x1

.field public static ro:I = 0x3


# instance fields
.field public rp:I

.field public rq:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    .line 2
    sget v0, Lcom/kwad/components/ad/reward/c/b;->STATUS_NONE:I

    iput v0, p0, Lcom/kwad/components/ad/reward/c/b;->rp:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    .line 4
    sget p1, Lcom/kwad/components/ad/reward/c/b;->STATUS_NONE:I

    iput p1, p0, Lcom/kwad/components/ad/reward/c/b;->rp:I

    const/4 p1, 0x1

    .line 5
    iput p1, p0, Lcom/kwad/components/ad/reward/c/b;->rp:I

    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/ad/reward/c/b;->rq:I

    return-void
.end method

.method public final gP()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/reward/c/b;->rq:I

    return v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/reward/c/b;->rp:I

    return v0
.end method
