.class final Lcom/kwad/components/ad/reward/presenter/f/f$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/tachikoma/e/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/presenter/f/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic wD:Lcom/kwad/components/ad/reward/presenter/f/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/presenter/f/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f/f$1;->wD:Lcom/kwad/components/ad/reward/presenter/f/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final jb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f/f$1;->wD:Lcom/kwad/components/ad/reward/presenter/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/reward/presenter/f/f;->a(Lcom/kwad/components/ad/reward/presenter/f/f;)Lcom/kwad/components/core/webview/tachikoma/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/tachikoma/b/a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/tachikoma/b/a;-><init>()V

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/f$1;->wD:Lcom/kwad/components/ad/reward/presenter/f/f;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/f/f;->b(Lcom/kwad/components/ad/reward/presenter/f/f;)Lcom/kwad/components/ad/reward/g;

    move-result-object v1

    iget-boolean v1, v1, Lcom/kwad/components/ad/reward/g;->fP:Z

    iput v1, v0, Lcom/kwad/components/core/webview/tachikoma/b/a;->aaQ:I

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f/f$1;->wD:Lcom/kwad/components/ad/reward/presenter/f/f;

    invoke-static {v1}, Lcom/kwad/components/ad/reward/presenter/f/f;->a(Lcom/kwad/components/ad/reward/presenter/f/f;)Lcom/kwad/components/core/webview/tachikoma/e;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/kwad/components/core/webview/tachikoma/e;->b(Lcom/kwad/sdk/core/response/a/a;)V

    :cond_0
    return-void
.end method
