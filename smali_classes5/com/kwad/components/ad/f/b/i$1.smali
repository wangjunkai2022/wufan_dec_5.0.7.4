.class final Lcom/kwad/components/ad/f/b/i$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b/i;->aj()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic nj:Lcom/kwad/components/ad/f/b/i;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b/i$1;->nj:Lcom/kwad/components/ad/f/b/i;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayStart()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/core/video/l;->onMediaPlayStart()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/i$1;->nj:Lcom/kwad/components/ad/f/b/i;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/i;->a(Lcom/kwad/components/ad/f/b/i;)Lcom/kwad/components/core/video/DetailVideoView;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/b/i$1;->nj:Lcom/kwad/components/ad/f/b/i;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
