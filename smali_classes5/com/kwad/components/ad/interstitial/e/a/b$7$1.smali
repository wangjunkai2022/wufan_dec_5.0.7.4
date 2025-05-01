.class final Lcom/kwad/components/ad/interstitial/e/a/b$7$1;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/interstitial/e/a/b$7;->a(D)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic lo:Lcom/kwad/components/ad/interstitial/e/a/b$7;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/a/b$7;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/a/b$7$1;->lo:Lcom/kwad/components/ad/interstitial/e/a/b$7;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/interstitial/e/a/b$7$1;->lo:Lcom/kwad/components/ad/interstitial/e/a/b$7;

    iget-object v0, v0, Lcom/kwad/components/ad/interstitial/e/a/b$7;->li:Lcom/kwad/components/ad/interstitial/e/a/b;

    invoke-static {v0}, Lcom/kwad/components/ad/interstitial/e/a/b;->ac(Lcom/kwad/components/ad/interstitial/e/a/b;)Lcom/kwad/sdk/core/g/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/core/g/d;->Ge()V

    return-void
.end method
