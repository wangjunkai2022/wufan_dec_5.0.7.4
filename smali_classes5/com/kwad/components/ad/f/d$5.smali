.class final Lcom/kwad/components/ad/f/d$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/widget/a$a;


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
    iput-object p1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    iput-object p2, p0, Lcom/kwad/components/ad/f/d$5;->kz:Landroid/view/ViewGroup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ac()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/kwad/components/ad/i/b;->eJ()Lcom/kwad/components/ad/i/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/i/b;->a(Lcom/kwad/components/core/internal/api/a;)V

    return-void
.end method

.method public final ad()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {v0}, Lcom/kwad/components/ad/f/d;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bn;->Oc()J

    move-result-wide v0

    .line 2
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    iget-boolean v2, v2, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->c(Lcom/kwad/components/ad/f/d;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JLorg/json/JSONObject;)V

    .line 4
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Z)Z

    .line 5
    :cond_0
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->d(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/a;->cN(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 6
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    long-to-int v1, v0

    div-int/lit16 v1, v1, 0x3e8

    invoke-static {v2, v1}, Lcom/kwad/sdk/core/adlog/c;->m(Lcom/kwad/sdk/core/response/model/AdTemplate;I)V

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->e(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/core/internal/api/c;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/internal/api/c;->i(Lcom/kwad/components/core/internal/api/a;)V

    .line 8
    invoke-static {}, Lcom/kwad/components/ad/f/b;->em()Lcom/kwad/components/ad/f/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/f/d;->f(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/ad/f/b$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/f/b;->a(Lcom/kwad/components/ad/f/b$c;)V

    .line 9
    invoke-static {}, Lcom/kwad/components/ad/i/b;->eJ()Lcom/kwad/components/ad/i/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/i/b;->b(Lcom/kwad/components/core/internal/api/a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final eq()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->c(Lcom/kwad/components/ad/f/d;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {v1}, Lcom/kwad/components/ad/f/d;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/kwad/sdk/utils/bn;->Oc()J

    move-result-wide v1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JLorg/json/JSONObject;)V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Z)Z

    .line 4
    invoke-static {}, Lcom/kwad/components/ad/f/b;->em()Lcom/kwad/components/ad/f/b;

    move-result-object v0

    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/f/d;->f(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/ad/f/b$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/components/ad/f/b;->a(Lcom/kwad/components/ad/f/b$c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    .line 5
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->reportSdkCaughtException(Ljava/lang/Throwable;)V

    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/ad/f/d$a;

    move-result-object v0

    invoke-interface {v0}, Lcom/kwad/components/ad/f/d$a;->es()V

    .line 3
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->g(Lcom/kwad/components/ad/f/d;)V

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 5
    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->kz:Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getWidth()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->v(II)Lcom/kwad/sdk/core/adlog/c/b;

    .line 6
    iget-object v1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v1}, Lcom/kwad/components/ad/f/d;->d(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v1

    invoke-static {v1}, Lcom/kwad/sdk/core/response/b/a;->cM(Lcom/kwad/sdk/core/response/model/AdInfo;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    new-instance v1, Lcom/kwad/sdk/core/adlog/a$a;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/a$a;-><init>()V

    .line 8
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->h(Lcom/kwad/components/ad/f/d;)I

    move-result v2

    iput v2, v1, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStyle:I

    .line 9
    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->i(Lcom/kwad/components/ad/f/d;)I

    move-result v2

    iput v2, v1, Lcom/kwad/sdk/core/adlog/a$a;->showLiveStatus:I

    .line 10
    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->b(Lcom/kwad/sdk/core/adlog/a$a;)Lcom/kwad/sdk/core/adlog/c/b;

    .line 11
    :cond_0
    invoke-static {}, Lcom/kwad/components/core/s/b;->rC()Lcom/kwad/components/core/s/b;

    move-result-object v1

    iget-object v2, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v2}, Lcom/kwad/components/ad/f/d;->b(Lcom/kwad/components/ad/f/d;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Lcom/kwad/components/core/s/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z

    .line 12
    :cond_1
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0}, Lcom/kwad/components/ad/f/d;->c(Lcom/kwad/components/ad/f/d;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 13
    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {v0, p1}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Landroid/view/View;)V

    .line 14
    iget-object p1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {p1}, Lcom/kwad/components/ad/f/d;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/sdk/utils/bn;->startTiming()V

    .line 15
    iget-object p1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-static {p1}, Lcom/kwad/components/ad/f/d;->e(Lcom/kwad/components/ad/f/d;)Lcom/kwad/components/core/internal/api/c;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    invoke-virtual {p1, v0}, Lcom/kwad/components/core/internal/api/c;->h(Lcom/kwad/components/core/internal/api/a;)V

    .line 16
    :cond_2
    iget-object p1, p0, Lcom/kwad/components/ad/f/d$5;->mx:Lcom/kwad/components/ad/f/d;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/kwad/components/ad/f/d;->a(Lcom/kwad/components/ad/f/d;Z)Z

    return-void
.end method
