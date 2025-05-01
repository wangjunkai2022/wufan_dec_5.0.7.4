.class final Lcom/kwad/components/core/webview/jshandler/ai$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/ai;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic XX:Lcom/kwad/components/core/webview/jshandler/ai;

.field final synthetic lm:Lcom/kwad/components/core/webview/jshandler/ai$a;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/ai;Lcom/kwad/components/core/webview/jshandler/ai$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ai$1;->XX:Lcom/kwad/components/core/webview/jshandler/ai;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/ai$1;->lm:Lcom/kwad/components/core/webview/jshandler/ai$a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ai$1;->XX:Lcom/kwad/components/core/webview/jshandler/ai;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/ai;->a(Lcom/kwad/components/core/webview/jshandler/ai;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ai$1;->XX:Lcom/kwad/components/core/webview/jshandler/ai;

    invoke-static {v0}, Lcom/kwad/components/core/webview/jshandler/ai;->a(Lcom/kwad/components/core/webview/jshandler/ai;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ai$1;->XX:Lcom/kwad/components/core/webview/jshandler/ai;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ai$1;->lm:Lcom/kwad/components/core/webview/jshandler/ai$a;

    invoke-static {v0, v1}, Lcom/kwad/components/core/webview/jshandler/ai;->a(Lcom/kwad/components/core/webview/jshandler/ai;Lcom/kwad/components/core/webview/jshandler/ai$a;)V

    return-void
.end method
