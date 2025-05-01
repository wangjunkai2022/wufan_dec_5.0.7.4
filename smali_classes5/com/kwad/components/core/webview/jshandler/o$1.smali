.class final Lcom/kwad/components/core/webview/jshandler/o$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/core/webview/jshandler/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic WS:Lcom/kwad/components/core/webview/jshandler/o;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/o$1;->WS:Lcom/kwad/components/core/webview/jshandler/o;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    const-string p1, "data"

    .line 1
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    .line 3
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/o$a;

    invoke-direct {p2}, Lcom/kwad/components/core/webview/jshandler/o$a;-><init>()V

    .line 4
    iput-object p1, p2, Lcom/kwad/components/core/webview/jshandler/o$a;->message:Ljava/lang/String;

    .line 5
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/o$1;->WS:Lcom/kwad/components/core/webview/jshandler/o;

    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/o;->a(Lcom/kwad/components/core/webview/jshandler/o;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object p1

    invoke-interface {p1, p2}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_0
    return-void
.end method
