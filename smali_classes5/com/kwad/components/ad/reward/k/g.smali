.class public final Lcom/kwad/components/ad/reward/k/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# instance fields
.field private xk:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lcom/kwad/components/ad/reward/k/g;->xk:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 1
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    new-instance p1, Lcom/kwad/components/core/webview/tachikoma/b/f;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/tachikoma/b/f;-><init>()V

    .line 2
    iget v0, p0, Lcom/kwad/components/ad/reward/k/g;->xk:I

    iput v0, p1, Lcom/kwad/components/core/webview/tachikoma/b/f;->aaU:I

    .line 3
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "getCloseDelaySeconds"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
