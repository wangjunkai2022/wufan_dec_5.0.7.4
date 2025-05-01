.class final Lcom/kwad/sdk/utils/d$1;
.super Lcom/kwad/sdk/core/download/a/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kwad/sdk/utils/d;->a(Landroid/content/Context;Ljava/lang/String;Lcom/kwad/sdk/core/response/model/AdTemplate;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic aPi:Ljava/lang/String;

.field final synthetic gE:Lcom/kwad/sdk/core/response/model/AdTemplate;


# direct methods
.method constructor <init>(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/utils/d$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iput-object p2, p0, Lcom/kwad/sdk/utils/d$1;->aPi:Ljava/lang/String;

    invoke-direct {p0}, Lcom/kwad/sdk/core/download/a/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final onError(Ljava/lang/Throwable;)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/download/a/b$b;->onError(Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/utils/d$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/sdk/utils/d$1;->aPi:Ljava/lang/String;

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/utils/bo;->t(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v5

    const-string v2, "com.xiaomi.market"

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 4
    invoke-static/range {v0 .. v5}, Lcom/kwad/sdk/commercial/b/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V

    return-void
.end method

.method public final onStart()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/core/download/a/b$b;->onStart()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/utils/d$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    iget-object v1, p0, Lcom/kwad/sdk/utils/d$1;->aPi:Ljava/lang/String;

    const-string v2, "com.xiaomi.market"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v1, v2, v3, v4}, Lcom/kwad/sdk/commercial/b/a;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public final onSuccess()V
    .locals 5

    .line 1
    invoke-super {p0}, Lcom/kwad/sdk/core/download/a/b$b;->onSuccess()V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/utils/d$1;->gE:Lcom/kwad/sdk/core/response/model/AdTemplate;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mXiaomiAppStoreDetailViewOpen:Z

    .line 3
    iput-boolean v1, v0, Lcom/kwad/sdk/core/response/model/AdTemplate;->mClickOpenAppStore:Z

    .line 4
    iget-object v2, p0, Lcom/kwad/sdk/utils/d$1;->aPi:Ljava/lang/String;

    const-string v3, "com.xiaomi.market"

    const/4 v4, 0x0

    invoke-static {v0, v2, v3, v4, v1}, Lcom/kwad/sdk/commercial/b/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method
