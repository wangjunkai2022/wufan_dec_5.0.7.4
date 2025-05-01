.class final Lcom/kwad/components/ad/interstitial/e/d$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/ad/interstitial/e/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/d;->dc()Lcom/kwad/components/ad/interstitial/e/c$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kw:Lcom/kwad/components/ad/interstitial/e/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/d$4;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(JJ)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/a;->dN()Lcom/kwad/components/ad/interstitial/report/a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/interstitial/e/d$4;->kw:Lcom/kwad/components/ad/interstitial/e/d;

    invoke-static {v1}, Lcom/kwad/components/ad/interstitial/e/d;->c(Lcom/kwad/components/ad/interstitial/e/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    move-wide v2, p1

    move-wide v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/kwad/components/ad/interstitial/report/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;JJ)V

    return-void
.end method
