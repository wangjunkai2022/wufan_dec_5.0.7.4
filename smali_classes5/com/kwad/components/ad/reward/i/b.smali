.class public final Lcom/kwad/components/ad/reward/i/b;
.super Lcom/kwad/components/core/webview/jshandler/bf;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/webview/jshandler/bf$a;


# instance fields
.field private sb:Lcom/kwad/components/core/playable/PlayableSource;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/components/core/playable/PlayableSource;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/kwad/components/core/webview/jshandler/bf;-><init>(Landroid/content/Context;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 2
    iput-object p3, p0, Lcom/kwad/components/ad/reward/i/b;->sb:Lcom/kwad/components/core/playable/PlayableSource;

    .line 3
    invoke-virtual {p0, p0}, Lcom/kwad/components/core/webview/jshandler/bf;->a(Lcom/kwad/components/core/webview/jshandler/bf$a;)V

    return-void
.end method


# virtual methods
.method public final dL()Z
    .locals 4

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/reward/a;->eY()Lcom/kwad/components/ad/reward/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/reward/i/b;->sb:Lcom/kwad/components/core/playable/PlayableSource;

    new-instance v2, Lcom/kwad/components/ad/reward/i/a;

    iget-object v3, p0, Lcom/kwad/components/core/webview/jshandler/bf;->mContext:Landroid/content/Context;

    invoke-direct {v2, v3}, Lcom/kwad/components/ad/reward/i/a;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/kwad/components/ad/reward/a;->c(Lcom/kwad/components/core/playable/PlayableSource;Lcom/kwad/components/ad/reward/e/n;)V

    const/4 v0, 0x0

    return v0
.end method
