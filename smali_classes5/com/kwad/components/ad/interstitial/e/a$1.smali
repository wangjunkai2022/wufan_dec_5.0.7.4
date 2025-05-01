.class final Lcom/kwad/components/ad/interstitial/e/a$1;
.super Landroid/view/OrientationEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a;->a(Lcom/kwad/components/ad/interstitial/e/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic jI:Lcom/kwad/components/ad/interstitial/e/c;

.field final synthetic jJ:Lcom/kwad/components/ad/interstitial/e/a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/a;Landroid/content/Context;Lcom/kwad/components/ad/interstitial/e/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a$1;->jJ:Lcom/kwad/components/ad/interstitial/e/a;

    iput-object p3, p0, Lcom/kwad/components/ad/interstitial/e/a$1;->jI:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-direct {p0, p2}, Landroid/view/OrientationEventListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onOrientationChanged(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a$1;->jJ:Lcom/kwad/components/ad/interstitial/e/a;

    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a$1;->jI:Lcom/kwad/components/ad/interstitial/e/c;

    invoke-static {p1, v0}, Lcom/kwad/components/ad/interstitial/e/a;->a(Lcom/kwad/components/ad/interstitial/e/a;Lcom/kwad/components/ad/interstitial/e/c;)V

    return-void
.end method
