.class final Lcom/kwad/components/ad/f/d$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/d/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/d;->a(Landroid/app/Activity;Landroid/view/View;Lcom/kwad/sdk/utils/ac$a;IZI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic eK:I

.field final synthetic ff:Landroid/view/View;

.field final synthetic mx:Lcom/kwad/components/ad/f/d;

.field final synthetic mz:Lcom/kwad/sdk/utils/ac$a;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/d;Lcom/kwad/sdk/utils/ac$a;ILandroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/d$4;->mx:Lcom/kwad/components/ad/f/d;

    iput-object p2, p0, Lcom/kwad/components/ad/f/d$4;->mz:Lcom/kwad/sdk/utils/ac$a;

    iput p3, p0, Lcom/kwad/components/ad/f/d$4;->eK:I

    iput-object p4, p0, Lcom/kwad/components/ad/f/d$4;->ff:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 3

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$4;->mz:Lcom/kwad/sdk/utils/ac$a;

    .line 2
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    iget v1, p0, Lcom/kwad/components/ad/f/d$4;->eK:I

    .line 3
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->cK(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/kwad/components/ad/f/d$4;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$4;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/ad/f/d$a;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$4;->ff:Landroid/view/View;

    invoke-interface {v0, v1}, Lcom/kwad/components/ad/f/d$a;->l(Landroid/view/View;)V

    return-void
.end method
