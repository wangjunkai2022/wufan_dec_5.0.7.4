.class final Lcom/kwad/components/ad/interstitial/e/d$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/interstitial/e/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/d;->dd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kC:Lcom/kwad/components/ad/interstitial/g/d;

.field final synthetic kw:Lcom/kwad/components/ad/interstitial/e/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/d;Lcom/kwad/components/ad/interstitial/g/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$7;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/e/d$7;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final da()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$7;->kC:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/interstitial/g/d;->ei()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/d$7;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/d;->b(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/video/videoview/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    return-void
.end method
