.class final Lcom/kwad/components/ad/reward/presenter/f$7;
.super Lcom/kwad/components/ad/reward/h$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/reward/presenter/f;->a(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

.field final synthetic ou:Lcom/kwad/components/ad/reward/g;

.field final synthetic pO:Lcom/kwad/components/ad/reward/h$c;

.field final synthetic sj:Lorg/json/JSONObject;

.field final synthetic sk:Lcom/kwad/components/ad/reward/h$b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/reward/g;Lcom/kwad/components/ad/reward/h$c;Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/components/ad/reward/h$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    iput-object p2, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->pO:Lcom/kwad/components/ad/reward/h$c;

    iput-object p3, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object p4, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->sj:Lorg/json/JSONObject;

    iput-object p5, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->sk:Lcom/kwad/components/ad/reward/h$b;

    invoke-direct {p0}, Lcom/kwad/components/ad/reward/h$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    if-nez p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v1, 0x97

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->p(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->sk:Lcom/kwad/components/ad/reward/h$b;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/h$b;->F(Z)V

    :cond_1
    return-void
.end method

.method public final fS()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->pause()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    .line 4
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->pO:Lcom/kwad/components/ad/reward/h$c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/h$c;->getStyle()I

    move-result v0

    if-nez v0, :cond_1

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->sj:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->i(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v1, 0x95

    iget-object v2, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->sj:Lorg/json/JSONObject;

    invoke-static {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;)V

    return-void
.end method

.method public final fZ()V
    .locals 4

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/h$b;->fZ()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v1, 0x96

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->p(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    const/16 v3, 0x9c

    invoke-virtual {v0, v2, v1, v3, v2}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void
.end method

.method public final g(II)V
    .locals 3

    .line 1
    invoke-super {p0, p1, p2}, Lcom/kwad/components/ad/reward/h$b;->g(II)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    iget-object v1, v0, Lcom/kwad/components/core/l/a;->mContext:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1, p1, p2}, Lcom/kwad/components/ad/reward/g;->a(ILandroid/content/Context;II)V

    return-void
.end method

.method public final ga()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/kwad/components/ad/reward/h$b;->ga()V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    return-void
.end method

.method public final gb()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/reward/g;->D(Z)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->ou:Lcom/kwad/components/ad/reward/g;

    iget-object v0, v0, Lcom/kwad/components/ad/reward/g;->oK:Lcom/kwad/components/ad/reward/m/e;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/m/e;->resume()V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->pO:Lcom/kwad/components/ad/reward/h$c;

    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/h$c;->getStyle()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->pO:Lcom/kwad/components/ad/reward/h$c;

    .line 5
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/h$c;->getStyle()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->pO:Lcom/kwad/components/ad/reward/h$c;

    .line 6
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/h$c;->getStyle()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->pO:Lcom/kwad/components/ad/reward/h$c;

    .line 7
    invoke-virtual {v0}, Lcom/kwad/components/ad/reward/h$c;->getStyle()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    goto :goto_0

    .line 8
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->sj:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->j(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;)V

    return-void

    .line 9
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/presenter/f$7;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/16 v1, 0x96

    invoke-static {v0, v1}, Lcom/kwad/sdk/core/adlog/c;->p(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    return-void
.end method
