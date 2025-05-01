.class public final Lcom/kwad/components/core/webview/jshandler/am;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/am$b;,
        Lcom/kwad/components/core/webview/jshandler/am$a;,
        Lcom/kwad/components/core/webview/jshandler/am$c;
    }
.end annotation


# instance fields
.field private mHolders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/components/core/webview/jshandler/am$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kwad/sdk/core/response/model/AdTemplate;",
            ">;",
            "Ljava/util/List<",
            "Lcom/kwad/components/core/e/d/c;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/am;->mHolders:Ljava/util/List;

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_1

    .line 3
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 4
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 5
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwad/components/core/e/d/c;

    .line 6
    new-instance v4, Lcom/kwad/components/core/webview/jshandler/am$c;

    invoke-direct {v4, v3, v2}, Lcom/kwad/components/core/webview/jshandler/am$c;-><init>(Lcom/kwad/components/core/e/d/c;Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    .line 7
    iget-object v2, p0, Lcom/kwad/components/core/webview/jshandler/am;->mHolders:Ljava/util/List;

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private K(J)Lcom/kwad/components/core/webview/jshandler/am$c;
    .locals 6

    const/4 v0, 0x0

    const-wide/16 v1, -0x1

    cmp-long v3, p1, v1

    if-nez v3, :cond_0

    return-object v0

    .line 1
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/am;->mHolders:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/components/core/webview/jshandler/am$c;

    .line 2
    invoke-virtual {v2}, Lcom/kwad/components/core/webview/jshandler/am$c;->getCreativeId()J

    move-result-wide v3

    cmp-long v5, v3, p1

    if-nez v5, :cond_1

    return-object v2

    :cond_2
    return-object v0
.end method

.method private static a(Lcom/kwad/components/core/webview/jshandler/am$c;IF)V
    .locals 2

    if-eqz p0, :cond_1

    .line 9
    invoke-static {p0}, Lcom/kwad/components/core/webview/jshandler/am$c;->a(Lcom/kwad/components/core/webview/jshandler/am$c;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "notifyDownloadProgress: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/kwad/components/core/webview/jshandler/am$c;->a(Lcom/kwad/components/core/webview/jshandler/am$c;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MultiProgressListener"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {p0}, Lcom/kwad/components/core/webview/jshandler/am$c;->a(Lcom/kwad/components/core/webview/jshandler/am$c;)Lcom/kwad/sdk/core/webview/c/c;

    move-result-object v0

    .line 12
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/az$a;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/az$a;-><init>()V

    .line 13
    iput p2, v1, Lcom/kwad/components/core/webview/jshandler/az$a;->YL:F

    .line 14
    iput p1, v1, Lcom/kwad/components/core/webview/jshandler/az$a;->status:I

    .line 15
    invoke-virtual {p0}, Lcom/kwad/components/core/webview/jshandler/am$c;->getCreativeId()J

    move-result-wide p1

    iput-wide p1, v1, Lcom/kwad/components/core/webview/jshandler/az$a;->creativeId:J

    .line 16
    invoke-static {p0}, Lcom/kwad/components/core/webview/jshandler/am$c;->b(Lcom/kwad/components/core/webview/jshandler/am$c;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    iget-wide p0, p0, Lcom/kwad/sdk/core/response/model/AdInfo;->totalBytes:J

    iput-wide p0, v1, Lcom/kwad/components/core/webview/jshandler/az$a;->totalBytes:J

    .line 17
    invoke-interface {v0, v1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic b(Lcom/kwad/components/core/webview/jshandler/am$c;IF)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/kwad/components/core/webview/jshandler/am;->a(Lcom/kwad/components/core/webview/jshandler/am$c;IF)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 2
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/kwad/components/core/webview/jshandler/am$b;

    invoke-direct {p1}, Lcom/kwad/components/core/webview/jshandler/am$b;-><init>()V

    .line 3
    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 4
    iget-wide v0, p1, Lcom/kwad/components/core/webview/jshandler/am$b;->creativeId:J

    .line 5
    invoke-direct {p0, v0, v1}, Lcom/kwad/components/core/webview/jshandler/am;->K(J)Lcom/kwad/components/core/webview/jshandler/am$c;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    invoke-static {p1, p2}, Lcom/kwad/components/core/webview/jshandler/am$c;->a(Lcom/kwad/components/core/webview/jshandler/am$c;Lcom/kwad/sdk/core/webview/c/c;)Lcom/kwad/sdk/core/webview/c/c;

    .line 7
    new-instance p2, Lcom/kwad/components/core/webview/jshandler/am$a;

    invoke-direct {p2, p1}, Lcom/kwad/components/core/webview/jshandler/am$a;-><init>(Lcom/kwad/components/core/webview/jshandler/am$c;)V

    .line 8
    invoke-virtual {p1, p2}, Lcom/kwad/components/core/webview/jshandler/am$c;->a(Lcom/kwad/components/core/webview/jshandler/am$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerMultiProgressListener"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/am;->mHolders:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kwad/components/core/webview/jshandler/am$c;

    .line 2
    invoke-virtual {v1}, Lcom/kwad/components/core/webview/jshandler/am$c;->destroy()V

    goto :goto_0

    :cond_0
    return-void
.end method
