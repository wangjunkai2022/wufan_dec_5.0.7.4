.class final Lcom/kwad/components/ad/f/b/d$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b/d;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mY:Lcom/kwad/components/ad/f/b/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b/d$1;->mY:Lcom/kwad/components/ad/f/b/d;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayStart()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlayStart()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/d$1;->mY:Lcom/kwad/components/ad/f/b/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/d;->a(Lcom/kwad/components/ad/f/b/d;)V

    return-void
.end method

.method public final onMediaPlaying()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlaying()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/d$1;->mY:Lcom/kwad/components/ad/f/b/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/d;->a(Lcom/kwad/components/ad/f/b/d;)V

    return-void
.end method
