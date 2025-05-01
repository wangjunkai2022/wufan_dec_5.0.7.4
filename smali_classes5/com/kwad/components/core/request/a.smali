.class public Lcom/kwad/components/core/request/a;
.super Lcom/kwad/sdk/core/network/d;
.source "SourceFile"


# static fields
.field private static RV:Z = true


# instance fields
.field MX:Lcom/kwad/components/core/request/model/ImpInfo;

.field private RU:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/kwad/components/core/request/model/ImpInfo;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/kwad/components/core/request/a;-><init>(Lcom/kwad/components/core/request/model/ImpInfo;Lcom/kwad/components/core/request/model/c;)V

    return-void
.end method

.method private constructor <init>(Lcom/kwad/components/core/request/model/ImpInfo;Lcom/kwad/components/core/request/model/c;)V
    .locals 1

    const/4 p2, 0x0

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0, p2}, Lcom/kwad/components/core/request/a;-><init>(Lcom/kwad/components/core/request/model/ImpInfo;Ljava/util/List;ZLcom/kwad/components/core/request/model/c;)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/components/core/request/model/ImpInfo;Ljava/util/List;ZLcom/kwad/components/core/request/model/c;)V
    .locals 4
    .param p2    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kwad/components/core/request/model/ImpInfo;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z",
            "Lcom/kwad/components/core/request/model/c;",
            ")V"
        }
    .end annotation

    .line 5
    const-class v0, Lcom/kwad/sdk/components/DevelopMangerComponents;

    invoke-static {p1}, Lcom/kwad/components/core/request/a;->c(Lcom/kwad/components/core/request/model/ImpInfo;)I

    move-result v1

    iget-object v2, p1, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-direct {p0, v1, v2}, Lcom/kwad/sdk/core/network/d;-><init>(ILcom/kwad/sdk/internal/api/SceneImpl;)V

    .line 6
    iput-object p1, p0, Lcom/kwad/components/core/request/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    .line 7
    invoke-virtual {p1}, Lcom/kwad/components/core/request/model/ImpInfo;->getAdLabelFromAdScene()Lcom/kwad/sdk/internal/api/AdLabelImpl;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 8
    invoke-virtual {v1}, Lcom/kwad/sdk/internal/api/AdLabelImpl;->isAdLabelAppInfoInValid()Z

    move-result v2

    if-nez v2, :cond_0

    .line 9
    invoke-static {}, Lcom/kwad/sdk/core/request/model/a;->FI()Lorg/json/JSONObject;

    move-result-object v2

    .line 10
    invoke-direct {p0, v2, v1}, Lcom/kwad/components/core/request/a;->a(Lorg/json/JSONObject;Lcom/kwad/sdk/internal/api/AdLabelImpl;)V

    .line 11
    :cond_0
    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    .line 12
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/a/a;->toJson()Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONArray;Lorg/json/JSONObject;)Lorg/json/JSONArray;

    const-string v3, "impInfo"

    .line 13
    invoke-virtual {p0, v3, v2}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Lorg/json/JSONArray;)V

    const-string v2, "universePhotoInfo"

    .line 14
    invoke-virtual {p0, v2, p4}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 15
    iget p4, p0, Lcom/kwad/components/core/request/a;->RU:I

    if-lez p4, :cond_1

    const-string v2, "calledUnionType"

    .line 16
    invoke-virtual {p0, v2, p4}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;I)V

    :cond_1
    const-string p4, ""

    .line 17
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 18
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 19
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    move-result-object p4

    check-cast p4, Lcom/kwad/sdk/components/DevelopMangerComponents;

    invoke-interface {p4}, Lcom/kwad/sdk/components/DevelopMangerComponents;->BG()Ljava/lang/String;

    move-result-object p4

    .line 20
    :cond_2
    invoke-static {p4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "universeDebugParam"

    .line 21
    invoke-virtual {p0, v2, p4}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    :cond_3
    invoke-static {p1}, Lcom/kwad/components/core/request/a;->d(Lcom/kwad/components/core/request/model/ImpInfo;)Ljava/lang/String;

    move-result-object p1

    .line 23
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-nez p4, :cond_4

    const-string p4, "sdkDebugReqInfo"

    .line 24
    invoke-virtual {p0, p4, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    :cond_4
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    if-eqz p2, :cond_5

    .line 26
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1, p2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    const-string p2, "preloadIdList"

    .line 27
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Lorg/json/JSONArray;)V

    const-string p1, "preloadCheck"

    .line 28
    invoke-virtual {p0, p1, p3}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Z)V

    .line 29
    :cond_5
    invoke-static {}, Lcom/kwad/sdk/utils/y;->Ms()Ljava/lang/String;

    move-result-object p1

    const-string p2, "appTag"

    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    invoke-static {v0}, Lcom/kwad/sdk/components/c;->f(Ljava/lang/Class;)Lcom/kwad/sdk/components/a;

    .line 31
    iget-object p1, p0, Lcom/kwad/components/core/request/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    const-string p2, "thirdUserId"

    invoke-virtual {p1, p2}, Lcom/kwad/components/core/request/model/ImpInfo;->getRewardCallbackExtraByKey(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 32
    invoke-static {}, Lcom/kwad/sdk/core/request/model/g;->FP()Lcom/kwad/sdk/core/request/model/g;

    move-result-object p2

    if-eqz p1, :cond_6

    .line 33
    invoke-virtual {p2, p1}, Lcom/kwad/sdk/core/request/model/g;->ey(Ljava/lang/String;)Lcom/kwad/sdk/core/request/model/g;

    :cond_6
    if-eqz v1, :cond_7

    .line 34
    invoke-virtual {v1}, Lcom/kwad/sdk/internal/api/AdLabelImpl;->isUserInfoVaild()Z

    move-result p1

    if-nez p1, :cond_7

    .line 35
    invoke-static {p2, v1}, Lcom/kwad/components/core/request/a;->a(Lcom/kwad/sdk/core/request/model/g;Lcom/kwad/sdk/internal/api/AdLabelImpl;)V

    :cond_7
    const-string p1, "userInfo"

    .line 36
    invoke-virtual {p0, p1, p2}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    return-void
.end method

.method public constructor <init>(Lcom/kwad/components/core/request/model/a;)V
    .locals 4

    .line 3
    iget-object v0, p1, Lcom/kwad/components/core/request/model/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v1, p1, Lcom/kwad/components/core/request/model/a;->Sd:Ljava/util/List;

    iget-boolean v2, p1, Lcom/kwad/components/core/request/model/a;->Se:Z

    iget-object v3, p1, Lcom/kwad/components/core/request/model/a;->Sg:Lcom/kwad/components/core/request/model/c;

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/kwad/components/core/request/a;-><init>(Lcom/kwad/components/core/request/model/ImpInfo;Ljava/util/List;ZLcom/kwad/components/core/request/model/c;)V

    .line 4
    iget-boolean p1, p1, Lcom/kwad/components/core/request/model/a;->Sf:Z

    iput p1, p0, Lcom/kwad/components/core/request/a;->RU:I

    return-void
.end method

.method private static a(Lcom/kwad/sdk/core/request/model/g;Lcom/kwad/sdk/internal/api/AdLabelImpl;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/kwad/sdk/internal/api/AdLabelImpl;->thirdAge:I

    if-eqz v0, :cond_0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/request/model/g;->thirdAge:I

    .line 3
    :cond_0
    iget v0, p1, Lcom/kwad/sdk/internal/api/AdLabelImpl;->thirdGender:I

    if-eqz v0, :cond_1

    .line 4
    iput v0, p0, Lcom/kwad/sdk/core/request/model/g;->thirdGender:I

    .line 5
    :cond_1
    iget-object v0, p1, Lcom/kwad/sdk/internal/api/AdLabelImpl;->thirdInterest:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 6
    iget-object p1, p1, Lcom/kwad/sdk/internal/api/AdLabelImpl;->thirdInterest:Ljava/lang/String;

    iput-object p1, p0, Lcom/kwad/sdk/core/request/model/g;->thirdInterest:Ljava/lang/String;

    :cond_2
    return-void
.end method

.method private a(Lorg/json/JSONObject;Lcom/kwad/sdk/internal/api/AdLabelImpl;)V
    .locals 3

    .line 7
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 8
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->prevTitle:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 9
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->prevTitle:Ljava/lang/String;

    const-string v2, "prevTitle"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :cond_0
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->postTitle:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 11
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->postTitle:Ljava/lang/String;

    const-string v2, "postTitle"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :cond_1
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->historyTitle:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 13
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->historyTitle:Ljava/lang/String;

    const-string v2, "historyTitle"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    :cond_2
    iget-object v1, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->channel:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 15
    iget-object p2, p2, Lcom/kwad/sdk/internal/api/AdLabelImpl;->channel:Ljava/lang/String;

    const-string v1, "channel"

    invoke-static {v0, v1, p2}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    const-string p2, "content"

    .line 16
    invoke-static {p1, p2, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

    const-string p2, "appInfo"

    .line 17
    invoke-virtual {p0, p2, p1}, Lcom/kwad/sdk/core/network/b;->putBody(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method

.method private static c(Lcom/kwad/components/core/request/model/ImpInfo;)I
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getScreenOrientation()I

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static d(Lcom/kwad/components/core/request/model/ImpInfo;)Ljava/lang/String;
    .locals 8

    .line 1
    sget-boolean v0, Lcom/kwad/components/core/request/a;->RV:Z

    const-string v1, ""

    if-nez v0, :cond_0

    return-object v1

    .line 2
    :cond_0
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "com.kwad.devTools.PosConfigFetcher"

    .line 3
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 4
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "getConfigParamByPosId"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    .line 5
    iget-object p0, p0, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 6
    invoke-virtual {p0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    aput-object p0, v5, v2

    const/4 p0, 0x1

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getContext()Landroid/content/Context;

    move-result-object v0

    aput-object v0, v5, p0

    .line 7
    invoke-static {v3, v4, v5}, Lcom/kwad/sdk/utils/s;->f(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    .line 8
    :catch_0
    sput-boolean v2, Lcom/kwad/components/core/request/a;->RV:Z

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final aF(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/kwad/components/core/request/a;->RU:I

    return-void
.end method

.method public final getAdNum()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/request/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    iget-object v0, v0, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdNum()I

    move-result v0

    return v0
.end method

.method public getScene()Lcom/kwad/sdk/internal/api/SceneImpl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/components/core/request/a;->MX:Lcom/kwad/components/core/request/model/ImpInfo;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/kwad/components/core/request/model/ImpInfo;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getUrl()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/h;->yB()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public needAppList()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onCreate()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-static {v0}, Lcom/kwad/sdk/utils/o;->bR(Z)V

    .line 2
    invoke-static {}, Lcom/kwad/components/core/request/b;->qN()Lcom/kwad/components/core/request/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/kwad/components/core/request/b;->qO()V

    .line 3
    invoke-super {p0}, Lcom/kwad/sdk/core/network/b;->onCreate()V

    return-void
.end method
