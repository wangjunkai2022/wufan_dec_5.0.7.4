.class final Lcom/kwad/components/ad/f/b/h$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/e/d/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/b/h;->eA()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic ni:Lcom/kwad/components/ad/f/b/h;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/b/h;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/b/h$2;->ni:Lcom/kwad/components/ad/f/b/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdClicked()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/b/h$2;->ni:Lcom/kwad/components/ad/f/b/h;

    invoke-static {v0}, Lcom/kwad/components/ad/f/b/h;->b(Lcom/kwad/components/ad/f/b/h;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/components/ad/f/b/h$2;->ni:Lcom/kwad/components/ad/f/b/h;

    .line 2
    invoke-static {v1}, Lcom/kwad/components/ad/f/b/h;->c(Lcom/kwad/components/ad/f/b/h;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v1

    iget-object v1, v1, Lcom/kwad/components/ad/f/a/b;->mI:Lcom/kwad/sdk/core/view/AdBasePvFrameLayout;

    invoke-virtual {v1}, Lcom/kwad/sdk/core/view/AdBaseFrameLayout;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v1

    const/4 v2, 0x2

    .line 3
    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILcom/kwad/sdk/utils/ac$a;)V

    return-void
.end method
