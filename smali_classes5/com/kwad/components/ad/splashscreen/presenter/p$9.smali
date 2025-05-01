.class final Lcom/kwad/components/ad/splashscreen/presenter/p$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/d/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/splashscreen/presenter/p;->lz()Lcom/kwad/components/core/webview/jshandler/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/p;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$9;->Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/kwad/sdk/core/webview/d/b/a;)V
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/sdk/c/a/a;->Bc()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/d/b/a;->HM()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$9;->Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/p;->h(Lcom/kwad/components/ad/splashscreen/presenter/p;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/h;->n(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/p$9;->Ei:Lcom/kwad/components/ad/splashscreen/presenter/p;

    const/4 v1, 0x0

    iget v2, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yn:I

    iget v3, p1, Lcom/kwad/sdk/core/webview/d/b/a;->kl:I

    iget-object p1, p1, Lcom/kwad/sdk/core/webview/d/b/a;->Yo:Lcom/kwad/sdk/core/webview/d/b/c;

    iget-object p1, p1, Lcom/kwad/sdk/core/webview/d/b/c;->Lh:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, p1}, Lcom/kwad/components/ad/splashscreen/presenter/p;->a(Lcom/kwad/components/ad/splashscreen/presenter/p;ZIILjava/lang/String;)V

    return-void
.end method
