.class final Lcom/kwad/components/ad/reward/presenter/f/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/reward/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/f/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic wI:Lcom/kwad/components/ad/reward/presenter/f/h;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/f/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final fV()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/presenter/f/h;->a(Lcom/kwad/components/ad/reward/presenter/f/h;Z)Z

    return-void
.end method

.method public final fW()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/presenter/f/h;->a(Lcom/kwad/components/ad/reward/presenter/f/h;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f/h;->a(Lcom/kwad/components/ad/reward/presenter/f/h;)V

    return-void
.end method

.method public final fX()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/presenter/f/h;->a(Lcom/kwad/components/ad/reward/presenter/f/h;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f/h;->b(Lcom/kwad/components/ad/reward/presenter/f/h;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f/h;->b(Lcom/kwad/components/ad/reward/presenter/f/h;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->ta()V

    :cond_0
    return-void
.end method

.method public final fY()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/h$2;->wI:Lcom/kwad/components/ad/reward/presenter/f/h;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/reward/presenter/f/h;->a(Lcom/kwad/components/ad/reward/presenter/f/h;Z)Z

    return-void
.end method
