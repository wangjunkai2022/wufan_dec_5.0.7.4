.class final Lcom/kwad/components/ad/draw/b/c/a$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/draw/b/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic cZ:Lcom/kwad/components/ad/draw/b/c/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/draw/b/c/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b/c/a$1;->cZ:Lcom/kwad/components/ad/draw/b/c/a;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayCompleted()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlayCompleted()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a$1;->cZ:Lcom/kwad/components/ad/draw/b/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/c/a;->a(Lcom/kwad/components/ad/draw/b/c/a;)Lcom/kwad/components/ad/l/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a$1;->cZ:Lcom/kwad/components/ad/draw/b/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/c/a;->a(Lcom/kwad/components/ad/draw/b/c/a;)Lcom/kwad/components/ad/l/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/l/b;->ar()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a$1;->cZ:Lcom/kwad/components/ad/draw/b/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/c/a;->b(Lcom/kwad/components/ad/draw/b/c/a;)Lcom/kwad/components/ad/draw/view/playend/DrawVideoTailFrame;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/draw/b/c/a$1;->cZ:Lcom/kwad/components/ad/draw/b/c/a;

    invoke-static {v0}, Lcom/kwad/components/ad/draw/b/c/a;->c(Lcom/kwad/components/ad/draw/b/c/a;)V

    return-void
.end method
