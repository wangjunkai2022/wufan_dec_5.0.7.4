.class public Lcom/kwad/components/ad/reward/h$c;
.super Lcom/kwad/sdk/core/response/a/a;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/components/ad/reward/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public pX:Ljava/lang/String;

.field public pY:Ljava/lang/String;

.field public pZ:Ljava/lang/String;

.field public pr:Lcom/kwad/components/ad/reward/l/b/a;

.field public ps:Lcom/kwad/components/ad/reward/l/a/a;

.field public qa:Ljava/lang/String;

.field public qb:Ljava/lang/String;

.field public qc:Ljava/lang/String;

.field public qd:Ljava/lang/String;

.field public qe:Ljava/lang/String;

.field public style:I

.field public title:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/a/a;-><init>()V

    return-void
.end method

.method public static A(Ljava/lang/String;)Lcom/kwad/components/ad/reward/h$c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    .line 2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method private B(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/components/ad/reward/h$c;->qe:Ljava/lang/String;

    return-void
.end method

.method static a(Lcom/kwad/components/ad/reward/l/a/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/components/ad/reward/h$c;
    .locals 2

    .line 7
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x2

    .line 8
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 9
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    .line 10
    iput-object p2, v0, Lcom/kwad/components/ad/reward/h$c;->qa:Ljava/lang/String;

    .line 11
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    .line 12
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    return-object v0
.end method

.method static a(Lcom/kwad/components/ad/reward/l/b/a;Lcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)Lcom/kwad/components/ad/reward/h$c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x1

    .line 2
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 3
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    .line 4
    iput-object p2, v0, Lcom/kwad/components/ad/reward/h$c;->qa:Ljava/lang/String;

    .line 5
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    .line 6
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Lcom/kwad/sdk/core/response/model/AdInfo;J)Lcom/kwad/components/ad/reward/h$c;
    .locals 3

    .line 13
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x5

    .line 14
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 15
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->cQ(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdProductInfo;

    move-result-object v1

    .line 16
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/components/ad/reward/h$c;->qc:Ljava/lang/String;

    .line 17
    invoke-virtual {v1}, Lcom/kwad/sdk/core/response/model/AdProductInfo;->getName()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    .line 18
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 19
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->aw(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    .line 20
    :cond_0
    invoke-virtual {v1}, Lcom/kwad/sdk/core/response/model/AdProductInfo;->getIcon()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    const-wide/16 v1, 0x0

    cmp-long p0, p1, v1

    if-lez p0, :cond_1

    .line 21
    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/h$c;->B(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    .line 22
    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/h$c;->B(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method static b(Lcom/kwad/sdk/core/response/model/AdTemplate;J)Lcom/kwad/components/ad/reward/h$c;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/16 v2, 0x8

    .line 3
    iput v2, v1, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 4
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cg(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v2, p2

    const-string p1, "\u518d\u770b%s\u79d2\uff0c\u53ef\u83b7\u5f97\u5956\u52b1"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 6
    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    .line 7
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->cd(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->qc:Ljava/lang/String;

    .line 8
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->qd:Ljava/lang/String;

    const-string p1, "\u653e\u5f03\u5956\u52b1"

    .line 9
    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    const-string p1, "\u7ee7\u7eed\u89c2\u770b"

    .line 10
    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    .line 11
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/kwad/components/ad/reward/h$c;->pZ:Ljava/lang/String;

    return-object v1
.end method

.method static c(Lcom/kwad/sdk/core/response/model/AdTemplate;J)Lcom/kwad/components/ad/reward/h$c;
    .locals 3

    .line 1
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/b;->dd(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MerchantLiveReservationInfo;

    move-result-object v0

    .line 2
    new-instance v1, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/16 v2, 0x8

    .line 3
    iput v2, v1, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 4
    iget-object v2, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MerchantLiveReservationInfo;->userHeadUrl:Ljava/lang/String;

    iput-object v2, v1, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    .line 5
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v2, p2

    const-string p1, "\u518d\u770b%s\u79d2\uff0c\u53ef\u83b7\u5f97\u5956\u52b1"

    invoke-static {p1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 6
    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    .line 7
    iget-object p1, v0, Lcom/kwad/sdk/core/response/model/AdMatrixInfo$MerchantLiveReservationInfo;->title:Ljava/lang/String;

    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->qc:Ljava/lang/String;

    const-string p1, "\u653e\u5f03\u5956\u52b1"

    .line 8
    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    const-string p1, "\u7ee7\u7eed\u89c2\u770b"

    .line 9
    iput-object p1, v1, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    .line 10
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object p0

    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->aD(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/kwad/components/ad/reward/h$c;->pZ:Ljava/lang/String;

    return-object v1
.end method

.method static h(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/components/ad/reward/h$c;
    .locals 2

    .line 7
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x4

    .line 8
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 9
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->cQ(Lcom/kwad/sdk/core/response/model/AdInfo;)Lcom/kwad/sdk/core/response/model/AdProductInfo;

    move-result-object v1

    .line 10
    invoke-static {p0}, Lcom/kwad/sdk/core/response/b/a;->at(Lcom/kwad/sdk/core/response/model/AdInfo;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    .line 11
    invoke-virtual {v1}, Lcom/kwad/sdk/core/response/model/AdProductInfo;->getIcon()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    return-object v0
.end method

.method public static h(Ljava/lang/String;I)Lcom/kwad/components/ad/reward/h$c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x6

    .line 2
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 3
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    const-string p0, "\u6b8b\u5fcd\u79bb\u5f00"

    .line 4
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    const-string p0, "\u7559\u4e0b\u770b\u770b"

    .line 5
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    if-lez p1, :cond_0

    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->qe:Ljava/lang/String;

    :cond_0
    return-object v0
.end method

.method static j(J)Lcom/kwad/components/ad/reward/h$c;
    .locals 4

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x6

    .line 2
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    const-string v1, "\u6b8b\u5fcd\u79bb\u5f00"

    .line 3
    iput-object v1, v0, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    const-string v1, "\u7559\u4e0b\u770b\u770b"

    .line 4
    iput-object v1, v0, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    const-wide/16 v1, 0x0

    cmp-long v3, p0, v1

    if-lez v3, :cond_0

    .line 5
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/h$c;->B(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 6
    invoke-direct {v0, p0}, Lcom/kwad/components/ad/reward/h$c;->B(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method static z(Ljava/lang/String;)Lcom/kwad/components/ad/reward/h$c;
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/components/ad/reward/h$c;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/h$c;-><init>()V

    const/4 v1, 0x0

    .line 2
    iput v1, v0, Lcom/kwad/components/ad/reward/h$c;->style:I

    .line 3
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    const-string p0, "\u5173\u95ed\u5e7f\u544a"

    .line 4
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    const-string p0, "\u7ee7\u7eed\u89c2\u770b"

    .line 5
    iput-object p0, v0, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public afterParseJson(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->afterParseJson(Lorg/json/JSONObject;)V

    const-string v0, "mLaunchAppTask"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 3
    iget-object v1, p0, Lcom/kwad/components/ad/reward/h$c;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/kwad/components/ad/reward/l/b/a;

    invoke-direct {v1}, Lcom/kwad/components/ad/reward/l/b/a;-><init>()V

    iput-object v1, p0, Lcom/kwad/components/ad/reward/h$c;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    .line 5
    :cond_0
    iget-object v1, p0, Lcom/kwad/components/ad/reward/h$c;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    invoke-virtual {v1, v0}, Lcom/kwad/components/ad/reward/l/b/a;->parseJson(Lorg/json/JSONObject;)V

    :cond_1
    const-string v0, "mLandPageOpenTask"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 7
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    if-nez v0, :cond_2

    .line 8
    new-instance v0, Lcom/kwad/components/ad/reward/l/a/a;

    invoke-direct {v0}, Lcom/kwad/components/ad/reward/l/a/a;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    invoke-virtual {v0, p1}, Lcom/kwad/components/ad/reward/l/a/a;->parseJson(Lorg/json/JSONObject;)V

    :cond_3
    return-void
.end method

.method public afterToJson(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/a/a;->afterToJson(Lorg/json/JSONObject;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    if-eqz v0, :cond_0

    const-string v1, "mLaunchAppTask"

    .line 3
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    if-eqz v0, :cond_1

    const-string v1, "mLandPageOpenTask"

    .line 5
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    :cond_1
    return-void
.end method

.method public final gc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u5173\u95ed\u5e7f\u544a"

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->pX:Ljava/lang/String;

    return-object v0
.end method

.method public final gd()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u7ee7\u7eed\u89c2\u770b"

    return-object v0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->pY:Ljava/lang/String;

    return-object v0
.end method

.method public final ge()Lcom/kwad/components/ad/reward/l/b/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->pr:Lcom/kwad/components/ad/reward/l/b/a;

    return-object v0
.end method

.method public final getStyle()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/kwad/components/ad/reward/h$c;->style:I

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final gf()Lcom/kwad/components/ad/reward/l/a/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->ps:Lcom/kwad/components/ad/reward/l/a/a;

    return-object v0
.end method

.method public final gg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->qb:Ljava/lang/String;

    return-object v0
.end method

.method public final gh()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->qc:Ljava/lang/String;

    return-object v0
.end method

.method public final gi()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->qd:Ljava/lang/String;

    return-object v0
.end method

.method public final gj()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/kwad/components/ad/reward/h$c;->qe:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 2
    iget-object v2, p0, Lcom/kwad/components/ad/reward/h$c;->qe:Ljava/lang/String;

    aput-object v2, v0, v1

    const-string v1, "\u518d\u770b%s\u79d2\uff0c\u53ef\u83b7\u5f97\u4f18\u60e0"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
