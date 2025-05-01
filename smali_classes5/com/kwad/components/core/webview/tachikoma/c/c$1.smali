.class final Lcom/kwad/components/core/webview/tachikoma/c/c$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/tachikoma/c/c;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic abt:Lcom/kwad/components/core/webview/tachikoma/c/c;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/tachikoma/c/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/tachikoma/c/c$1;->abt:Lcom/kwad/components/core/webview/tachikoma/c/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final callTKBridge(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/tachikoma/c/c$1;->abt:Lcom/kwad/components/core/webview/tachikoma/c/c;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/a;->abk:Lcom/kwad/components/core/webview/tachikoma/c/b;

    iget-object v0, v0, Lcom/kwad/components/core/webview/tachikoma/c/b;->abm:Lcom/kwad/sdk/components/k;

    invoke-interface {v0, p1}, Lcom/kwad/sdk/components/k;->callTKBridge(Ljava/lang/String;)V

    return-void
.end method
