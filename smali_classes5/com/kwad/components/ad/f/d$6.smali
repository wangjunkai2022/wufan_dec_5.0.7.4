.class final Lcom/kwad/components/ad/f/d$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/widget/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/d;->a(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic kz:Landroid/view/ViewGroup;

.field final synthetic mx:Lcom/kwad/components/ad/f/d;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/d;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    iput-object p2, p0, Lcom/kwad/components/ad/f/d$6;->kz:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final er()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/ad/f/d$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/ad/f/d$a;->es()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->g(Lcom/kwad/components/ad/f/d;)V

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/f/d$6;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/d$6;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->v(II)Lcom/kwad/sdk/core/adlog/c/b;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/f/d;->d(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    new-instance v1, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    .line 8
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->h(Lcom/kwad/components/ad/f/d;)I

    move-result v2

    iput v2, v1, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStyle:I

    .line 9
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->i(Lcom/kwad/components/ad/f/d;)I

    move-result v2

    iput v2, v1, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStatus:I

    .line 10
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->b(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/b;

    .line 11
    :cond_1
    invoke-static {}, Lcom/kwad/components/core/s/b;->rC()Lcom/kwad/components/core/s/b;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/kwad/components/core/s/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z

    .line 12
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$6;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {v0}, Lcom/kwad/sdk/commercial/d/c;->bA(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-void
.end method
