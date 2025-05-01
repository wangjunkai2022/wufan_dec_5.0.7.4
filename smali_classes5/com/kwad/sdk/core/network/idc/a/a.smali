.class public final Lcom/kwad/sdk/core/network/idc/a/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final axX:J

.field private volatile axY:Z


# direct methods
.method public constructor <init>(JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/kwad/sdk/core/network/idc/a/a;->axX:J

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/kwad/sdk/core/network/idc/a/a;->axY:Z

    return-void
.end method


# virtual methods
.method public final EI()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/network/idc/a/a;->axY:Z

    return v0
.end method

.method public final EJ()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/core/network/idc/a/a;->axX:J

    return-wide v0
.end method

.method public final bm(Z)Lcom/kwad/sdk/core/network/idc/a/a;
    .locals 0

    const/4 p1, 0x1

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/core/network/idc/a/a;->axY:Z

    return-object p0
.end method
