.class final Lcom/kwad/components/core/webview/jshandler/al$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/webview/jshandler/al;->a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Yg:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field final synthetic Yh:Lcom/kwad/components/core/e/d/c;

.field final synthetic Yi:Lcom/kwad/components/core/webview/jshandler/al$a;

.field final synthetic Yj:Lcom/kwad/components/core/webview/jshandler/al;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/webview/jshandler/al;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/e/d/c;Lcom/kwad/components/core/webview/jshandler/al$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yj:Lcom/kwad/components/core/webview/jshandler/al;

    iput-object p2, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yg:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object p3, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yh:Lcom/kwad/components/core/e/d/c;

    iput-object p4, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yi:Lcom/kwad/components/core/webview/jshandler/al$a;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/components/core/e/d/a$a;

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yj:Lcom/kwad/components/core/webview/jshandler/al;

    .line 2
    invoke-static {v1}, Lcom/kwad/components/core/webview/jshandler/al;->a(Lcom/kwad/components/core/webview/jshandler/al;)Lcom/kwad/sdk/core/webview/b;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/b;->Ph:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yg:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yh:Lcom/kwad/components/core/e/d/c;

    .line 4
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yi:Lcom/kwad/components/core/webview/jshandler/al$a;

    iget v1, v1, Lcom/kwad/components/core/webview/jshandler/al$a;->Yn:I

    .line 5
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    iget-object v2, p0, Lcom/kwad/components/core/webview/jshandler/al$1;->Yi:Lcom/kwad/components/core/webview/jshandler/al$a;

    iget-object v2, v2, Lcom/kwad/components/core/webview/jshandler/al$a;->Yo:Lcom/kwad/sdk/core/webview/d/b/c;

    iget-object v2, v2, Lcom/kwad/sdk/core/webview/d/b/c;->Lh:Ljava/lang/String;

    .line 7
    invoke-virtual {v0, v2}, Lcom/kwad/components/core/e/d/a$a;->ah(Ljava/lang/String;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 8
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->aq(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/al$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/core/webview/jshandler/al$1$1;-><init>(Lcom/kwad/components/core/webview/jshandler/al$1;)V

    .line 9
    invoke-virtual {v0, v1}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v0

    .line 10
    invoke-static {v0}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method
