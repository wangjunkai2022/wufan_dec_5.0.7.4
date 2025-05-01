.class final Lcom/kwad/components/ad/interstitial/e/f$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/video/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/interstitial/e/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kO:Lcom/kwad/components/ad/interstitial/e/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/interstitial/e/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/interstitial/e/f$3;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILcom/kwad/sdk/utils/ac$a;)V
    .locals 10

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v1, :cond_2

    if-eq p1, v0, :cond_1

    const/4 v3, 0x3

    if-eq p1, v3, :cond_0

    const/16 p1, 0x6c

    goto :goto_0

    :cond_0
    const/16 p1, 0x53

    const/4 v2, 0x1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/16 p1, 0x52

    goto :goto_0

    :cond_2
    const/16 p1, 0xd

    :goto_0
    const/4 v3, 0x2

    .line 1
    :goto_1
    iget-object v4, p0, Lcom/kwad/components/ad/interstitial/e/f$3;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v4}, Lcom/kwad/components/ad/interstitial/e/f;->d(Lcom/kwad/components/ad/interstitial/e/f;)Landroid/content/Context;

    invoke-static {}, Lcom/kwad/sdk/utils/aj;->ML()Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x1

    .line 2
    :goto_2
    invoke-static {}, Lcom/kwad/components/ad/interstitial/report/a;->dN()Lcom/kwad/components/ad/interstitial/report/a;

    move-result-object v4

    iget-object v5, p0, Lcom/kwad/components/ad/interstitial/e/f$3;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    invoke-static {v5}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v5

    const-wide/16 v6, 0x1

    int-to-long v8, p1

    invoke-virtual/range {v4 .. v9}, Lcom/kwad/components/ad/interstitial/report/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JJ)V

    .line 3
    new-instance v4, Lcom/kwad/components/core/e/d/a$a;

    iget-object v5, p0, Lcom/kwad/components/ad/interstitial/e/f$3;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    .line 4
    invoke-static {v5}, Lcom/kwad/components/ad/interstitial/e/f;->f(Lcom/kwad/components/ad/interstitial/e/f;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v5, p0, Lcom/kwad/components/ad/interstitial/e/f$3;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    .line 5
    invoke-static {v5}, Lcom/kwad/components/ad/interstitial/e/f;->b(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v4

    iget-object v5, p0, Lcom/kwad/components/ad/interstitial/e/f$3;->kO:Lcom/kwad/components/ad/interstitial/e/f;

    .line 6
    invoke-static {v5}, Lcom/kwad/components/ad/interstitial/e/f;->e(Lcom/kwad/components/ad/interstitial/e/f;)Lcom/kwad/components/core/e/d/c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v4

    .line 7
    invoke-virtual {v4, v3}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v3

    .line 8
    invoke-virtual {v3, v2}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v2

    .line 9
    invoke-virtual {v2, v1}, Lcom/kwad/components/core/e/d/a$a;->aq(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v1

    .line 10
    invoke-virtual {v1, p1}, Lcom/kwad/components/core/e/d/a$a;->am(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object v1

    .line 11
    invoke-virtual {v1, p2}, Lcom/kwad/components/core/e/d/a$a;->d(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    .line 12
    invoke-virtual {p2, v0}, Lcom/kwad/components/core/e/d/a$a;->ao(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p2

    new-instance v0, Lcom/kwad/components/ad/interstitial/e/f$3$1;

    invoke-direct {v0, p0, p1}, Lcom/kwad/components/ad/interstitial/e/f$3$1;-><init>(Lcom/kwad/components/ad/interstitial/e/f$3;I)V

    .line 13
    invoke-virtual {p2, v0}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 14
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    return-void
.end method
