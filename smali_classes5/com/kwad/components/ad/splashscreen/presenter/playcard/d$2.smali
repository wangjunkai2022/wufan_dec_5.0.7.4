.class final Lcom/kwad/components/ad/splashscreen/presenter/playcard/d$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/splashscreen/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic Fy:Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d$2;->Fy:Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final kx()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d$2;->Fy:Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;->c(Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d$2;->Fy:Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;->d(Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d$2;->Fy:Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;->d(Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sX()V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d$2;->Fy:Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;

    invoke-static {v0}, Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;->d(Lcom/kwad/components/ad/splashscreen/presenter/playcard/d;)Lcom/kwad/components/core/webview/jshandler/aw;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/webview/jshandler/aw;->sY()V

    :cond_0
    return-void
.end method
