.class public Lcom/kwad/components/core/webview/jshandler/ak;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/ak$a;,
        Lcom/kwad/components/core/webview/jshandler/ak$b;
    }
.end annotation


# instance fields
.field private final WQ:Lcom/kwad/sdk/core/webview/b;

.field private Yc:I

.field private Yd:Lcom/kwad/components/core/webview/jshandler/ak$a;


# direct methods
.method public constructor <init>(Lcom/kwad/sdk/core/webview/b;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/components/core/webview/jshandler/ak;->Yc:I

    .line 3
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    return-void
.end method

.method private c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;
    .locals 1
    .param p1    # Lcom/kwad/components/core/webview/jshandler/ak$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->f(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->f(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->h(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/webview/b;->de(Ljava/lang/String;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final a(Lcom/kwad/components/core/webview/jshandler/ak$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ak;->Yd:Lcom/kwad/components/core/webview/jshandler/ak$a;

    return-void
.end method

.method protected a(Lcom/kwad/components/core/webview/jshandler/ak$b;)V
    .locals 7
    .param p1    # Lcom/kwad/components/core/webview/jshandler/ak$b;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SwitchIntDef"
        }
    .end annotation

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "handleH5Log actionType actionType"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WebCardLogHandler"

    invoke-static {v1, v0}, Lcom/kwad/sdk/core/e/c;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    .line 12
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 13
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/adlog/c/b;->dm(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 14
    iget-object v2, p0, Lcom/kwad/components/core/webview/jshandler/ak;->Yd:Lcom/kwad/components/core/webview/jshandler/ak$a;

    if-eqz v2, :cond_0

    .line 15
    invoke-interface {v2}, Lcom/kwad/components/core/webview/jshandler/ak$a;->onAdShow()V

    .line 16
    :cond_0
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->f(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 17
    iget v2, p0, Lcom/kwad/components/core/webview/jshandler/ak;->Yc:I

    invoke-virtual {v0, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cO(I)Lcom/kwad/sdk/core/adlog/c/b;

    .line 18
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->f(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v3, v0}, Lcom/kwad/components/core/webview/jshandler/ak;->b(ZLcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    goto/16 :goto_0

    .line 19
    :cond_1
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->nm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/kwad/sdk/utils/bh;->isNullString(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 20
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    invoke-virtual {p1}, Lcom/kwad/sdk/core/webview/b;->getAdTemplate()Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v3, v0}, Lcom/kwad/components/core/webview/jshandler/ak;->b(ZLcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    goto/16 :goto_0

    .line 21
    :cond_2
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    invoke-virtual {v1}, Lcom/kwad/sdk/core/webview/b;->Hw()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 22
    invoke-virtual {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->nm()Ljava/lang/String;

    move-result-object v4

    .line 23
    invoke-static {v2}, Lcom/kwad/sdk/core/response/b/e;->ec(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v5

    .line 24
    invoke-static {v4, v5}, Lcom/kwad/sdk/utils/bh;->isEquals(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 p1, 0x0

    .line 25
    invoke-virtual {p0, p1, v2, v3, v0}, Lcom/kwad/components/core/webview/jshandler/ak;->b(ZLcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    goto/16 :goto_0

    :cond_4
    return-void

    .line 26
    :cond_5
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_7

    .line 27
    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v0, v0, Lcom/kwad/sdk/core/webview/b;->aEW:Lcom/kwad/sdk/widget/e;

    .line 28
    new-instance v1, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v1}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    iget v2, p0, Lcom/kwad/components/core/webview/jshandler/ak;->Yc:I

    .line 29
    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->cO(I)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    .line 30
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kwad/sdk/core/adlog/c/b;->dm(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v1

    if-eqz v0, :cond_6

    .line 31
    invoke-interface {v0}, Lcom/kwad/sdk/widget/e;->getTouchCoords()Lcom/kwad/sdk/utils/ac$a;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/core/adlog/c/b;->f(Lcom/kwad/sdk/utils/ac$a;)Lcom/kwad/sdk/core/adlog/c/b;

    .line 32
    :cond_6
    invoke-virtual {p0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;->a(Lcom/kwad/sdk/core/adlog/c/b;)V

    .line 33
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iget-object v0, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v0, v0, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lcom/kwad/sdk/core/adlog/c/b;Lorg/json/JSONObject;)V

    return-void

    .line 34
    :cond_7
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v0

    const/16 v1, 0x2ee6

    if-ne v0, v1, :cond_8

    .line 35
    invoke-static {}, Lcom/kwad/components/core/o/a;->qI()Lcom/kwad/components/core/o/a;

    move-result-object v0

    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v1

    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->g(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result p1

    iget v2, p0, Lcom/kwad/components/core/webview/jshandler/ak;->Yc:I

    invoke-virtual {v0, v1, p1, v2}, Lcom/kwad/components/core/o/a;->b(Lcom/kwad/sdk/core/response/model/AdTemplate;II)V

    return-void

    .line 36
    :cond_8
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v0

    const/16 v1, 0x8c

    if-ne v0, v1, :cond_9

    .line 37
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 38
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->dm(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 39
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/core/adlog/c;->d(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    return-void

    .line 40
    :cond_9
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v0

    const/16 v1, 0x8d

    if-ne v0, v1, :cond_a

    .line 41
    new-instance v0, Lcom/kwad/sdk/core/adlog/c/b;

    invoke-direct {v0}, Lcom/kwad/sdk/core/adlog/c/b;-><init>()V

    .line 42
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/adlog/c/b;->dm(Ljava/lang/String;)Lcom/kwad/sdk/core/adlog/c/b;

    move-result-object v0

    .line 43
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v1, v1, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/core/adlog/c;->e(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V

    return-void

    .line 44
    :cond_a
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/ak;->c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object v0

    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->d(Lcom/kwad/components/core/webview/jshandler/ak$b;)I

    move-result v1

    iget-object v2, p0, Lcom/kwad/components/core/webview/jshandler/ak;->WQ:Lcom/kwad/sdk/core/webview/b;

    iget-object v2, v2, Lcom/kwad/sdk/core/webview/b;->mReportExtData:Lorg/json/JSONObject;

    .line 45
    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object v3

    .line 46
    invoke-static {v0, v1, v2, v3}, Lcom/kwad/sdk/core/adlog/c;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;ILorg/json/JSONObject;Ljava/lang/String;)V

    .line 47
    invoke-static {}, Lcom/kwad/components/core/webview/tachikoma/d/a;->tC()Lcom/kwad/components/core/webview/tachikoma/d/a;

    move-result-object v0

    invoke-static {p1}, Lcom/kwad/components/core/webview/jshandler/ak$b;->e(Lcom/kwad/components/core/webview/jshandler/ak$b;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/components/core/webview/tachikoma/d/a;->aZ(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected a(Lcom/kwad/sdk/core/adlog/c/b;)V
    .locals 0

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 3
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, -0x1

    .line 2
    :try_start_0
    new-instance v1, Lcom/kwad/components/core/webview/jshandler/ak$b;

    invoke-direct {v1}, Lcom/kwad/components/core/webview/jshandler/ak$b;-><init>()V

    .line 3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/kwad/components/core/webview/jshandler/ak$b;->parseJson(Lorg/json/JSONObject;)V

    .line 4
    invoke-direct {p0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;->c(Lcom/kwad/components/core/webview/jshandler/ak$b;)Lcom/kwad/sdk/core/response/model/AdTemplate;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, "native adTemplate is null"

    .line 5
    invoke-interface {p2, v0, p1}, Lcom/kwad/sdk/core/webview/c/c;->onError(ILjava/lang/String;)V

    .line 6
    :cond_0
    invoke-virtual {p0, v1}, Lcom/kwad/components/core/webview/jshandler/ak;->a(Lcom/kwad/components/core/webview/jshandler/ak$b;)V

    const/4 p1, 0x0

    .line 7
    invoke-interface {p2, p1}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 8
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    .line 9
    invoke-virtual {p1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lcom/kwad/sdk/core/webview/c/c;->onError(ILjava/lang/String;)V

    return-void
.end method

.method protected b(ZLcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)V
    .locals 0
    .param p3    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/kwad/sdk/core/adlog/c/b;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-static {}, Lcom/kwad/components/core/s/b;->rC()Lcom/kwad/components/core/s/b;

    move-result-object p1

    const/4 p3, 0x0

    invoke-virtual {p1, p2, p3, p4}, Lcom/kwad/components/core/s/b;->a(Lcom/kwad/sdk/core/response/model/AdTemplate;Lorg/json/JSONObject;Lcom/kwad/sdk/core/adlog/c/b;)Z

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "log"

    return-object v0
.end method

.method public final onDestroy()V
    .locals 0

    return-void
.end method
