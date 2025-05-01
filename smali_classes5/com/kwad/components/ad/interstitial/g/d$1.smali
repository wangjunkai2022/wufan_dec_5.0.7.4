.class final Lcom/kwad/components/ad/interstitial/g/d$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/g/d;->s(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lY:Lcom/kwad/components/ad/interstitial/g/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/g/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d$1;->lY:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d$1;->lY:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/g/d;->a(Lcom/kwad/components/ad/interstitial/g/d;)Landroid/widget/ImageView;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d$1;->lY:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/g/d;->a(Lcom/kwad/components/ad/interstitial/g/d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d$1;->lY:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/g/d;->b(Lcom/kwad/components/ad/interstitial/g/d;)Lcom/kwad/components/ad/interstitial/g/e;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/g/d$1;->lY:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-static {p1}, Lcom/kwad/components/ad/interstitial/g/d;->b(Lcom/kwad/components/ad/interstitial/g/d;)Lcom/kwad/components/ad/interstitial/g/e;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/g/d$1;->lY:Lcom/kwad/components/ad/interstitial/g/d;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/g/d;->a(Lcom/kwad/components/ad/interstitial/g/d;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->isSelected()Z

    move-result v0

    invoke-interface {p1, v0}, Lcom/kwad/components/ad/interstitial/g/e;->o(Z)V

    :cond_0
    return-void
.end method
