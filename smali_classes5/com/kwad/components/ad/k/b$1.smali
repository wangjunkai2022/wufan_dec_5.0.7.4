.class final Lcom/kwad/components/ad/k/b$1;
.super Lcom/kwad/components/core/video/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/k/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic HX:Lcom/kwad/components/ad/k/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/ad/k/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/k/b$1;->HX:Lcom/kwad/components/ad/k/b;

    invoke-direct {p0}, Lcom/kwad/components/core/video/l;-><init>()V

    return-void
.end method


# virtual methods
.method public final onMediaPlayCompleted()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/k/b$1;->HX:Lcom/kwad/components/ad/k/b;

    iget-object v0, v0, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const-wide/16 v1, -0x1

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setmCurPlayTime(J)V

    return-void
.end method

.method public final onMediaPlayError(II)V
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2}, Lcom/kwad/components/core/video/l;->onMediaPlayError(II)V

    .line 2
    iget-object p1, p0, Lcom/kwad/components/ad/k/b$1;->HX:Lcom/kwad/components/ad/k/b;

    invoke-static {p1}, Lcom/kwad/components/ad/k/b;->a(Lcom/kwad/components/ad/k/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-static {}, Lcom/kwad/sdk/core/config/d;->Dh()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 4
    iget-object p1, p0, Lcom/kwad/components/ad/k/b$1;->HX:Lcom/kwad/components/ad/k/b;

    invoke-static {p1}, Lcom/kwad/components/ad/k/b;->b(Lcom/kwad/components/ad/k/b;)V

    goto :goto_0

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/ad/k/b$1;->HX:Lcom/kwad/components/ad/k/b;

    invoke-static {p1}, Lcom/kwad/components/ad/k/b;->b(Lcom/kwad/components/ad/k/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 6
    invoke-static {p1}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final onMediaPlayProgress(JJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/kwad/components/ad/k/b$1;->HX:Lcom/kwad/components/ad/k/b;

    iget-object p1, p1, Lcom/kwad/components/ad/k/a;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-virtual {p1, p3, p4}, Lcom/kwad/sdk/core/response/model/AdTemplate;->setmCurPlayTime(J)V

    return-void
.end method
