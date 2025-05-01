.class final Lcom/kwad/components/core/webview/jshandler/ah$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/ah;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic XP:Lcom/kwad/components/core/webview/jshandler/ah;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/ah;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ah$1;->XP:Lcom/kwad/components/core/webview/jshandler/ah;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/d/a$a;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ah$1;->XP:Lcom/kwad/components/core/webview/jshandler/ah;

    .line 2
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/ah;->c(Lcom/kwad/components/core/webview/jshandler/ah;)Lcom/kwad/sdk/core/webview/b;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ah$1;->XP:Lcom/kwad/components/core/webview/jshandler/ah;

    .line 3
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/ah;->b(Lcom/kwad/components/core/webview/jshandler/ah;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ah$1;->XP:Lcom/kwad/components/core/webview/jshandler/ah;

    .line 4
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/ah;->a(Lcom/kwad/components/core/webview/jshandler/ah;)Lcom/kwad/components/core/e/d/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ah$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/jshandler/ah$1$1;-><init>(Lcom/kwad/components/core/webview/jshandler/ah$1;)V

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method
