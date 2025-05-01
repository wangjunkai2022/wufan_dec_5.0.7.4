.class final Lcom/kwad/components/ad/f/f$2;
.super Lcom/kwad/sdk/utils/az;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/f/f;->ad()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic mQ:Lcom/kwad/components/ad/f/f;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/f/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-direct {p0}, Lcom/kwad/sdk/utils/az;-><init>()V

    return-void
.end method


# virtual methods
.method public final doTask()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/f;->b(Lcom/kwad/components/ad/f/f;)Lcom/kwad/components/core/widget/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/f;->b(Lcom/kwad/components/ad/f/f;)Lcom/kwad/components/core/widget/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/widget/a/a;->release()V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    iget-object v0, v0, Lcom/kwad/components/ad/f/f;->mO:Lcom/kwad/components/ad/f/c/a;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Lcom/kwad/components/ad/f/c/a;->aK()V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/f;->c(Lcom/kwad/components/ad/f/f;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 6
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/f;->c(Lcom/kwad/components/ad/f/f;)Lcom/kwad/components/ad/f/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/ad/f/a/b;->release()V

    .line 7
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/f;->d(Lcom/kwad/components/ad/f/f;)Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8
    iget-object v0, p0, Lcom/kwad/components/ad/f/f$2;->mQ:Lcom/kwad/components/ad/f/f;

    invoke-static {v0}, Lcom/kwad/components/ad/f/f;->d(Lcom/kwad/components/ad/f/f;)Lcom/kwad/sdk/mvp/Presenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/mvp/Presenter;->destroy()V

    :cond_3
    return-void
.end method
