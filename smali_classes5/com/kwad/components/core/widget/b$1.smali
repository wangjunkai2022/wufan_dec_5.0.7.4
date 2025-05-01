.class final Lcom/kwad/components/core/widget/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/components/core/widget/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/core/widget/b;->a(Landroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aca:Lcom/kwad/components/core/widget/b;


# direct methods
.method constructor <init>(Lcom/kwad/components/core/widget/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ac()V
    .locals 0

    return-void
.end method

.method public final ad()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-object v0, v0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-boolean v1, v0, Lcom/kwad/components/core/widget/b;->ms:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/b;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bn;->Oc()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    invoke-static {v2, v0, v1}, Lcom/kwad/components/core/widget/b;->a(Lcom/kwad/components/core/widget/b;J)J

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-object v2, v2, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JLorg/json/JSONObject;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/kwad/components/core/widget/b;->ms:Z

    :cond_0
    return-void
.end method

.method public final eq()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-object v0, v0, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean v0, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-boolean v1, v0, Lcom/kwad/components/core/widget/b;->ms:Z

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/kwad/components/core/widget/b;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/sdk/utils/bn;->Oc()J

    move-result-wide v0

    .line 3
    iget-object v2, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    invoke-static {v2, v0, v1}, Lcom/kwad/components/core/widget/b;->a(Lcom/kwad/components/core/widget/b;J)J

    .line 4
    iget-object v2, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-object v2, v2, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v3, 0x0

    invoke-static {v2, v0, v1, v3}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;JLorg/json/JSONObject;)V

    .line 5
    iget-object v0, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/kwad/components/core/widget/b;->ms:Z

    :cond_0
    return-void
.end method

.method public final k(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-object p1, p1, Lcom/kwad/components/core/widget/b;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-boolean p1, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPvReported:Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-object v1, p1, Lcom/kwad/components/core/widget/b;->abY:Lcom/kwad/components/core/widget/b$a;

    if-eqz v1, :cond_0

    .line 2
    iput-boolean v0, p1, Lcom/kwad/components/core/widget/b;->ms:Z

    .line 3
    invoke-virtual {p1}, Lcom/kwad/components/core/widget/b;->bv()V

    .line 4
    iget-object p1, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    invoke-virtual {p1}, Lcom/kwad/components/core/widget/b;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/sdk/utils/bn;->startTiming()V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iget-boolean v1, p1, Lcom/kwad/components/core/widget/b;->ms:Z

    if-nez v1, :cond_1

    .line 6
    invoke-virtual {p1}, Lcom/kwad/components/core/widget/b;->getTimerHelper()Lcom/kwad/sdk/utils/bn;

    move-result-object p1

    invoke-virtual {p1}, Lcom/kwad/sdk/utils/bn;->startTiming()V

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/kwad/components/core/widget/b$1;->aca:Lcom/kwad/components/core/widget/b;

    iput-boolean v0, p1, Lcom/kwad/components/core/widget/b;->ms:Z

    return-void
.end method
