.class public final Lcom/kwad/sdk/core/download/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private volatile avK:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/download/e;->avK:Z

    return-void
.end method


# virtual methods
.method public final DR()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/sdk/core/download/e;->avK:Z

    return-void
.end method

.method public final DS()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/download/e;->avK:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
