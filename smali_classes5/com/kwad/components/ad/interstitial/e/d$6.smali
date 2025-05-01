.class final Lcom/kwad/components/ad/interstitial/e/d$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/a$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/d;->dd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kB:I

.field final synthetic kC:Lcom/kwad/components/ad/interstitial/g/d;

.field final synthetic kw:Lcom/kwad/components/ad/interstitial/e/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/d;ILcom/kwad/components/ad/interstitial/g/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    iput p2, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kB:I

    iput-object p3, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bl()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/kwad/components/ad/interstitial/g/d;->c(ZZ)V

    return-void
.end method

.method public final bm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->b(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->a(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/components/ad/interstitial/e/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/d;->e(Lcom/kwad/components/ad/interstitial/e/d;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/e/c;->J(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/d;->eh()V

    :cond_0
    return-void
.end method

.method public final e(J)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n"
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kB:I

    const-wide/16 v1, 0x3e8

    div-long/2addr p1, v1

    long-to-int p2, p1

    sub-int/2addr v0, p2

    if-ltz v0, :cond_0

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/kwad/components/ad/interstitial/g/d;->w(Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/interstitial/g/d;->ef()V

    return-void
.end method

.method public final onVideoPlayStart()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$6;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/interstitial/g/d;->t(Z)V

    return-void
.end method
