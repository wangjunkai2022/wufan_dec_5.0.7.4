.class final Lcom/kwad/components/ad/interstitial/e/c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/d/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/c;->a(Landroid/content/Context;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gq:Landroid/content/Context;

.field final synthetic kb:Lcom/kwad/components/ad/interstitial/e/c;

.field final synthetic kd:I

.field final synthetic ke:I


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/c;IILandroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    iput p2, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->kd:I

    iput p3, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->ke:I

    iput-object p4, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->gq:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->kb:Lcom/kwad/components/ad/interstitial/e/c;

    iget v1, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->kd:I

    iget v2, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->ke:I

    iget-object v3, p0, Lcom/kwad/components/ad/interstitial/e/c$2;->gq:Landroid/content/Context;

    int-to-long v6, v2

    const-wide/16 v4, 0x6

    invoke-static/range {v0 .. v7}, Lcom/kwad/components/ad/interstitial/e/c;->a(Lcom/kwad/components/ad/interstitial/e/c;IILandroid/content/Context;JJ)V

    return-void
.end method
