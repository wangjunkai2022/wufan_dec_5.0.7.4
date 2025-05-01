.class public abstract Lcom/kwad/sdk/core/h/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/h/c;


# instance fields
.field private MK:Z

.field private ML:Z

.field private aEV:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->aEV:Z

    .line 3
    iput-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->MK:Z

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->ML:Z

    return-void
.end method


# virtual methods
.method public final aM()V
    .locals 2

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->aEV:Z

    .line 2
    iget-boolean v1, p0, Lcom/kwad/sdk/core/h/b;->ML:Z

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/core/h/b;->ah()V

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->ML:Z

    :cond_0
    return-void
.end method

.method public final aN()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->aEV:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->MK:Z

    if-nez v0, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/core/h/b;->ai()V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/kwad/sdk/core/h/b;->MK:Z

    :cond_1
    return-void
.end method

.method protected abstract ah()V
.end method

.method protected abstract ai()V
.end method
