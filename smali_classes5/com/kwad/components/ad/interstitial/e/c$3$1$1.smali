.class final Lcom/kwad/components/ad/interstitial/e/c$3$1$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/c$3$1;->doTask()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kh:Landroidx/core/graphics/drawable/RoundedBitmapDrawable;

.field final synthetic ki:Lcom/kwad/components/ad/interstitial/e/c$3$1;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/c$3$1;Landroidx/core/graphics/drawable/RoundedBitmapDrawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c$3$1$1;->ki:Lcom/kwad/components/ad/interstitial/e/c$3$1;

    iput-object p2, p0, Lcom/kwad/components/ad/interstitial/e/c$3$1$1;->kh:Landroidx/core/graphics/drawable/RoundedBitmapDrawable;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$3$1$1;->ki:Lcom/kwad/components/ad/interstitial/e/c$3$1;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c$3$1;->kg:Lcom/kwad/components/ad/interstitial/e/c$3;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/c$3;->fo:Landroid/view/View;

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/c$3$1$1;->kh:Landroidx/core/graphics/drawable/RoundedBitmapDrawable;

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
