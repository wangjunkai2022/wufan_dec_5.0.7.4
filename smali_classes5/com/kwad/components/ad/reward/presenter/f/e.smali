.class public final Lcom/kwad/components/ad/reward/presenter/f/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/g$a;


# instance fields
.field private wA:Lcom/kwad/components/core/webview/jshandler/aw;

.field private wB:Z

.field private wC:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private iZ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wC:Z

    if-eqz v1, :cond_1

    .line 2
    iget-boolean v1, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wB:Z

    if-nez v1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sV()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sW()V

    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wB:Z

    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sZ()V

    :cond_1
    return-void
.end method


# virtual methods
.method public final b(Lcom/kwad/components/core/webview/jshandler/aw;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    return-void
.end method

.method public final bF()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/e;->iZ()V

    return-void
.end method

.method public final fV()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wC:Z

    return-void
.end method

.method public final fW()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wC:Z

    .line 2
    invoke-direct {p0}, Lcom/kwad/components/ad/reward/presenter/f/e;->iZ()V

    return-void
.end method

.method public final fX()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wC:Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_0
    return-void
.end method

.method public final fY()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wC:Z

    return-void
.end method

.method public final ja()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_0
    return-void
.end method

.method public final y(Lcom/kwad/components/ad/reward/g;)V
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, Lcom/kwad/components/ad/reward/g;->a(Lcom/kwad/components/ad/reward/g$a;)V

    return-void
.end method

.method public final z(Lcom/kwad/components/ad/reward/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/e;->wA:Lcom/kwad/components/core/webview/jshandler/aw;

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    .line 4
    :cond_0
    invoke-virtual {p1, p0}, Lcom/kwad/components/ad/reward/g;->b(Lcom/kwad/components/ad/reward/g$a;)V

    return-void
.end method
