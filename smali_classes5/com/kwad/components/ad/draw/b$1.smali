.class final Lcom/kwad/components/ad/draw/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/draw/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic bW:Lcom/kwad/components/ad/draw/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/draw/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/draw/b$1;->bW:Lcom/kwad/components/ad/draw/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Lcom/kwad/components/core/e/d/a$a;

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b$1;->bW:Lcom/kwad/components/ad/draw/b;

    .line 2
    invoke-static {v0}, Lcom/kwad/components/ad/draw/b;->a(Lcom/kwad/components/ad/draw/b;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->mRootContainer:Lcom/kwad/sdk/core/view/AdBaseFrameLayout;

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/kwad/components/core/e/d/a$a;-><init>(Landroid/content/Context;)V

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b$1;->bW:Lcom/kwad/components/ad/draw/b;

    .line 3
    invoke-static {v0}, Lcom/kwad/components/ad/draw/b;->a(Lcom/kwad/components/ad/draw/b;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->ar(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/draw/b$1;->bW:Lcom/kwad/components/ad/draw/b;

    .line 4
    invoke-static {v0}, Lcom/kwad/components/ad/draw/b;->a(Lcom/kwad/components/ad/draw/b;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object v0

    iget-object v0, v0, Lcom/kwad/components/ad/draw/a/b;->mApkDownloadHelper:Lcom/kwad/components/core/e/d/c;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->b(Lcom/kwad/components/core/e/d/c;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->ao(Z)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    const/4 v0, 0x3

    .line 6
    invoke-virtual {p1, v0}, Lcom/kwad/components/core/e/d/a$a;->an(I)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    new-instance v1, Lcom/kwad/components/ad/draw/b$1$1;

    invoke-direct {v1, p0}, Lcom/kwad/components/ad/draw/b$1$1;-><init>(Lcom/kwad/components/ad/draw/b$1;)V

    .line 7
    invoke-virtual {p1, v1}, Lcom/kwad/components/core/e/d/a$a;->a(Lcom/kwad/components/core/e/d/a$b;)Lcom/kwad/components/core/e/d/a$a;

    move-result-object p1

    .line 8
    invoke-static {p1}, Lcom/kwad/components/core/e/d/a;->a(Lcom/kwad/components/core/e/d/a$a;)I

    .line 9
    iget-object p1, p0, Lcom/kwad/components/ad/draw/b$1;->bW:Lcom/kwad/components/ad/draw/b;

    .line 10
    invoke-static {p1}, Lcom/kwad/components/ad/draw/b;->a(Lcom/kwad/components/ad/draw/b;)Lcom/kwad/components/ad/draw/a/b;

    move-result-object p1

    iget-object p1, p1, Lcom/kwad/sdk/mvp/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p1

    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/a;->bw(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result p1

    if-ne v0, p1, :cond_0

    .line 11
    iget-object p1, p0, Lcom/kwad/components/ad/draw/b$1;->bW:Lcom/kwad/components/ad/draw/b;

    invoke-static {p1}, Lcom/kwad/components/ad/draw/b;->b(Lcom/kwad/components/ad/draw/b;)V

    :cond_0
    return-void
.end method
