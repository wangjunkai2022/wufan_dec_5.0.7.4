.class final Lcom/kwad/components/ad/c/b$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/export/proxy/AdHttpResponseListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/components/ad/c/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ZLcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;Lcom/kwad/components/ad/c/a;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private bF:Z

.field final synthetic bG:J

.field final synthetic bH:Lcom/kwad/components/ad/c/a;

.field final synthetic bI:Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;


# direct methods
.method constructor <init>(JLcom/kwad/components/ad/c/a;Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/components/ad/c/b$1;->bG:J

    iput-object p3, p0, Lcom/kwad/components/ad/c/b$1;->bH:Lcom/kwad/components/ad/c/a;

    iput-object p4, p0, Lcom/kwad/components/ad/c/b$1;->bI:Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/c/b$1;->bF:Z

    return-void
.end method


# virtual methods
.method public final onReadProgress(JJ)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/kwad/components/ad/c/b$1;->bG:J

    const/4 v2, 0x0

    cmp-long v3, p1, v0

    if-gez v3, :cond_0

    cmp-long v0, p1, p3

    if-ltz v0, :cond_1

    :cond_0
    iget-boolean p1, p0, Lcom/kwad/components/ad/c/b$1;->bF:Z

    if-nez p1, :cond_1

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/kwad/components/ad/c/b$1;->bF:Z

    .line 3
    iget-object p2, p0, Lcom/kwad/components/ad/c/b$1;->bH:Lcom/kwad/components/ad/c/a;

    invoke-static {p2}, Lcom/kwad/components/ad/c/b;->b(Lcom/kwad/components/ad/c/a;)V

    .line 4
    iget-object p2, p0, Lcom/kwad/components/ad/c/b$1;->bI:Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;

    invoke-virtual {p2}, Lcom/kwad/sdk/core/response/model/AdVideoPreCacheConfig;->isContinueLoadingAll()Z

    move-result p2

    if-nez p2, :cond_1

    return p1

    :cond_1
    return v2
.end method

.method public final onResponseEnd()V
    .locals 0

    return-void
.end method

.method public final onResponseStart()V
    .locals 0

    return-void
.end method
