.class public final Lcom/kwad/components/core/webview/tachikoma/a/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# instance fields
.field private aat:Lcom/kwad/components/core/webview/tachikoma/b/k;


# direct methods
.method public constructor <init>(Lcom/kwad/components/core/webview/tachikoma/b/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/a/g;->aat:Lcom/kwad/components/core/webview/tachikoma/b/k;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 0
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/a/g;->aat:Lcom/kwad/components/core/webview/tachikoma/b/k;

    if-eqz p1, :cond_0

    .line 2
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_0
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "getKsAdExtraData"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
