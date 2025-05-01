.class final Lcom/kwad/components/ad/l/a$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/KsAdWebView$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/l/a;->mH()Lcom/kwad/sdk/core/webview/KsAdWebView$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ij:Lcom/kwad/components/ad/l/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/l/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailed()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/l/a;->c(Lcom/kwad/components/ad/l/a;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a;)Lcom/kwad/components/ad/l/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a;)Lcom/kwad/components/ad/l/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v1}, Lcom/kwad/components/ad/l/a;->b(Lcom/kwad/components/ad/l/a;)Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/l/a$a;->R(Z)V

    :cond_0
    return-void
.end method

.method public final onSuccess()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/kwad/components/ad/l/a;->c(Lcom/kwad/components/ad/l/a;Z)Z

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a;)Lcom/kwad/components/ad/l/a$a;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v0}, Lcom/kwad/components/ad/l/a;->a(Lcom/kwad/components/ad/l/a;)Lcom/kwad/components/ad/l/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/l/a$4;->Ij:Lcom/kwad/components/ad/l/a;

    invoke-static {v1}, Lcom/kwad/components/ad/l/a;->b(Lcom/kwad/components/ad/l/a;)Z

    move-result v1

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/l/a$a;->R(Z)V

    :cond_0
    return-void
.end method
