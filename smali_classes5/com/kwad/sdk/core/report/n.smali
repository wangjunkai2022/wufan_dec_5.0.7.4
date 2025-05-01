.class public Lcom/kwad/sdk/core/report/n;
.super Lcom/kwad/sdk/core/report/e;
.source "SourceFile"


# annotations
.annotation build Lcom/ksad/json/annotation/KsJson;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/report/n$b;,
        Lcom/kwad/sdk/core/report/n$a;
    }
.end annotation


# instance fields
.field public Jd:Ljava/lang/String;

.field public Je:Ljava/lang/String;

.field public Jg:J

.field public Lh:Ljava/lang/String;

.field public RH:Ljava/lang/String;

.field public RO:J

.field public RP:J

.field public RQ:J

.field public SK:J

.field public WF:J

.field public XB:Ljava/lang/String;

.field public Ye:I

.field public aAa:Ljava/lang/String;

.field public aAb:J

.field public aAc:J

.field public aAd:Ljava/lang/String;

.field public actionType:J

.field public transient adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

.field public adStyle:I

.field public are:I

.field public avo:J

.field public ayV:J

.field public ayW:Lorg/json/JSONObject;

.field public ayX:Lorg/json/JSONObject;

.field public ayY:J

.field public ayZ:J

.field public azA:Ljava/lang/String;

.field public azB:I

.field public azC:I

.field public azD:J

.field public azE:I

.field public azF:Ljava/lang/String;

.field public azG:J

.field public azH:J

.field public azI:J

.field public azJ:J

.field public azK:Ljava/lang/String;

.field public azL:I

.field public azM:Lorg/json/JSONArray;

.field public azN:J

.field public azO:J

.field public azP:Lorg/json/JSONArray;

.field public azQ:Ljava/lang/String;

.field public azR:Ljava/lang/String;

.field public azS:Ljava/lang/String;

.field public azT:Ljava/lang/String;

.field public azU:Ljava/lang/String;

.field public azV:I

.field public azW:Ljava/lang/String;

.field public azX:Ljava/lang/String;

.field public azY:I

.field public azZ:I

.field public aza:J

.field public azb:J

.field public azc:J

.field public azd:J

.field public aze:J

.field public azf:Lcom/kwad/sdk/core/scene/URLPackage;

.field public azg:Ljava/lang/String;

.field public azh:Lorg/json/JSONArray;

.field public azi:Lorg/json/JSONArray;

.field public azj:Lcom/kwad/sdk/core/report/n$a;

.field public azk:I

.field public azl:I

.field public azm:I

.field public azn:I

.field public azo:Ljava/lang/String;

.field public azp:I

.field public azq:I

.field public azr:Ljava/lang/String;

.field public azs:Lorg/json/JSONObject;

.field public azt:Lorg/json/JSONArray;

.field public azu:I

.field public azv:I

.field public azw:I

.field public azx:J

.field public azy:Lorg/json/JSONArray;

.field public azz:Z

.field public blockDuration:J

.field public clickTime:J

.field public contentSourceType:I

.field public contentType:I

.field public creativeId:J

.field public downloadDuration:J

.field public entryPageSource:Ljava/lang/String;

.field public errorCode:I

.field public errorMsg:Ljava/lang/String;

.field public llsid:J

.field public transient mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field public pageType:I

.field public photoId:J

.field public posId:J

.field public position:J

.field public realShowType:I

.field public sdkType:I

.field public sdkVersion:Ljava/lang/String;

.field public sessionId:Ljava/lang/String;

.field public timestamp:J

.field public trace:Ljava/lang/String;

.field public urlPackage:Lcom/kwad/sdk/core/scene/URLPackage;


# direct methods
.method public constructor <init>(J)V
    .locals 5

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-direct {p0}, Lcom/kwad/sdk/core/report/e;-><init>()V

    const/4 v1, -0x1

    .line 2
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    const/4 v2, 0x0

    .line 3
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    .line 4
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    const-wide/16 v3, -0x1

    .line 5
    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->azd:J

    .line 6
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->are:I

    const-wide/16 v3, 0x0

    .line 7
    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->azx:J

    .line 8
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    .line 9
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azC:I

    .line 10
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->azV:I

    const v1, 0x2e548c

    .line 11
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azZ:I

    const-string v1, "3.3.63"

    .line 12
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    .line 13
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    .line 14
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 15
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    const/4 v0, 0x1

    .line 16
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->sdkType:I

    .line 17
    iput-object v2, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    .line 18
    iput-wide p1, p0, Lcom/kwad/sdk/core/report/n;->actionType:J

    return-void
.end method

.method public constructor <init>(JLcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 5
    .param p3    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 19
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-direct {p0}, Lcom/kwad/sdk/core/report/e;-><init>()V

    const/4 v1, -0x1

    .line 20
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    const/4 v2, 0x0

    .line 21
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    .line 22
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    const-wide/16 v3, -0x1

    .line 23
    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->azd:J

    .line 24
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->are:I

    const-wide/16 v3, 0x0

    .line 25
    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->azx:J

    .line 26
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    .line 27
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azC:I

    .line 28
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->azV:I

    const v1, 0x2e548c

    .line 29
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azZ:I

    const-string v1, "3.3.63"

    .line 30
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    .line 31
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    .line 32
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 33
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    const/4 v0, 0x1

    .line 34
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->sdkType:I

    .line 35
    iput-object v2, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    .line 36
    iput-wide p1, p0, Lcom/kwad/sdk/core/report/n;->actionType:J

    .line 37
    iput-object p3, p0, Lcom/kwad/sdk/core/report/n;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    return-void
.end method

.method public constructor <init>(JLcom/kwad/sdk/core/response/model/AdTemplate;Ljava/lang/String;)V
    .locals 5
    .param p3    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 38
    const-class v0, Lcom/kwad/sdk/service/a/f;

    invoke-direct {p0}, Lcom/kwad/sdk/core/report/e;-><init>()V

    const/4 v1, -0x1

    .line 39
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    const/4 v2, 0x0

    .line 40
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    .line 41
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    const-wide/16 v3, -0x1

    .line 42
    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->azd:J

    .line 43
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->are:I

    const-wide/16 v3, 0x0

    .line 44
    iput-wide v3, p0, Lcom/kwad/sdk/core/report/n;->azx:J

    .line 45
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    .line 46
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azC:I

    .line 47
    iput v2, p0, Lcom/kwad/sdk/core/report/n;->azV:I

    const v1, 0x2e548c

    .line 48
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azZ:I

    const-string v1, "3.3.63"

    .line 49
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    .line 50
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    .line 51
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, ""

    if-nez v1, :cond_0

    move-object v0, v2

    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/f;

    invoke-interface {v0}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    const/4 v0, 0x1

    .line 53
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->sdkType:I

    .line 54
    iput-object v2, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    .line 55
    iput-wide p1, p0, Lcom/kwad/sdk/core/report/n;->actionType:J

    .line 56
    iput-object p3, p0, Lcom/kwad/sdk/core/report/n;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    .line 57
    iput-object p4, p0, Lcom/kwad/sdk/core/report/n;->Lh:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 4

    .line 58
    const-class p3, Lcom/kwad/sdk/service/a/f;

    invoke-direct {p0}, Lcom/kwad/sdk/core/report/e;-><init>()V

    const/4 v0, -0x1

    .line 59
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    const/4 v1, 0x0

    .line 60
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    .line 61
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    const-wide/16 v2, -0x1

    .line 62
    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azd:J

    .line 63
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->are:I

    const-wide/16 v2, 0x0

    .line 64
    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azx:J

    .line 65
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    .line 66
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azC:I

    .line 67
    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azV:I

    const v0, 0x2e548c

    .line 68
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azZ:I

    const-string v0, "3.3.63"

    .line 69
    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->sdkVersion:Ljava/lang/String;

    .line 70
    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->aAa:Ljava/lang/String;

    .line 71
    invoke-static {p3}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object p3, v1

    goto :goto_0

    .line 72
    :cond_0
    invoke-static {p3}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/kwad/sdk/service/a/f;

    invoke-interface {p3}, Lcom/kwad/sdk/service/a/f;->getApiVersion()Ljava/lang/String;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Lcom/kwad/sdk/core/report/n;->XB:Ljava/lang/String;

    const/4 p3, 0x1

    .line 73
    iput p3, p0, Lcom/kwad/sdk/core/report/n;->sdkType:I

    .line 74
    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    .line 75
    iput-object p1, p0, Lcom/kwad/sdk/core/report/e;->actionId:Ljava/lang/String;

    .line 76
    iput-object p2, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    return-void
.end method

.method private bZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V
    .locals 3
    .param p1    # Lcom/kwad/sdk/core/response/model/AdTemplate;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x3

    .line 1
    :try_start_0
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azl:I

    .line 2
    const-class v0, Lcom/kwad/sdk/core/report/s;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/report/s;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/core/report/s;->ue()I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azB:I

    .line 4
    :cond_0
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/e;->actionId:Ljava/lang/String;

    .line 5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->timestamp:J

    .line 6
    invoke-static {}, Lcom/kwad/sdk/core/report/t;->FD()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->sessionId:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    .line 7
    :try_start_1
    invoke-static {}, Lcom/kwad/sdk/core/report/t;->FE()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->Jg:J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 8
    :try_start_2
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 9
    :goto_0
    invoke-static {}, Lcom/kwad/sdk/core/report/t;->FF()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->ayV:J

    .line 10
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-eqz v0, :cond_1

    .line 11
    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->posId:J

    .line 12
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getUrlPackage()Lcom/kwad/sdk/core/scene/URLPackage;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->urlPackage:Lcom/kwad/sdk/core/scene/URLPackage;

    .line 13
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdStyle()I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 14
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-eqz v0, :cond_2

    .line 15
    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 16
    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->posId:J

    .line 17
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getUrlPackage()Lcom/kwad/sdk/core/scene/URLPackage;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->urlPackage:Lcom/kwad/sdk/core/scene/URLPackage;

    .line 18
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {v0}, Lcom/kwad/sdk/internal/api/SceneImpl;->getAdStyle()I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    :cond_2
    :goto_1
    if-eqz p1, :cond_7

    .line 19
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getShowPosition()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->position:J

    .line 20
    invoke-virtual {p1}, Lcom/kwad/sdk/core/response/model/AdTemplate;->getServerPosition()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    int-to-long v0, v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->ayY:J

    .line 21
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dP(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->llsid:J

    .line 22
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dQ(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    if-nez v1, :cond_3

    .line 24
    :try_start_3
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->ayW:Lorg/json/JSONObject;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 25
    :try_start_4
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 26
    :cond_3
    :goto_2
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dR(Lcom/kwad/sdk/core/response/model/AdTemplate;)Ljava/lang/String;

    move-result-object v0

    .line 27
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    if-nez v1, :cond_4

    .line 28
    :try_start_5
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/kwad/sdk/core/report/n;->ayX:Lorg/json/JSONObject;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    .line 29
    :try_start_6
    invoke-static {v0}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    .line 30
    :cond_4
    :goto_3
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dL(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->posId:J

    .line 31
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dO(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->contentType:I

    .line 32
    iget v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->realShowType:I

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    .line 33
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dY(Lcom/kwad/sdk/core/response/model/AdTemplate;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->photoId:J

    .line 34
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->realShowType:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_5

    .line 35
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dS(Lcom/kwad/sdk/core/response/model/AdTemplate;)Lcom/kwad/sdk/core/response/model/AdInfo;

    move-result-object v0

    .line 36
    iget-object v1, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->adBaseInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;

    iget-wide v1, v1, Lcom/kwad/sdk/core/response/model/AdInfo$AdBaseInfo;->creativeId:J

    iput-wide v1, p0, Lcom/kwad/sdk/core/report/n;->creativeId:J

    .line 37
    invoke-static {v0}, Lcom/kwad/sdk/core/response/b/a;->L(Lcom/kwad/sdk/core/response/model/AdInfo;)I

    move-result v1

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    iput-wide v1, p0, Lcom/kwad/sdk/core/report/n;->ayZ:J

    .line 38
    iget-object v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo;->advertiserInfo:Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;

    iget-wide v0, v0, Lcom/kwad/sdk/core/response/model/AdInfo$AdvertiserInfo;->userId:J

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->SK:J

    .line 39
    :cond_5
    iget v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mMediaPlayerType:I

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azk:I

    .line 40
    iget v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mIsLeftSlipStatus:I

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azm:I

    .line 41
    iget v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPhotoResponseType:I

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azn:I

    .line 42
    iget-object v0, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mPageInfo:Lcom/kwad/sdk/core/response/model/PageInfo;

    if-eqz v0, :cond_6

    .line 43
    iget v0, v0, Lcom/kwad/sdk/core/response/model/PageInfo;->pageType:I

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->pageType:I

    .line 44
    :cond_6
    invoke-static {p1}, Lcom/kwad/sdk/core/response/b/e;->dZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->contentSourceType:I

    .line 45
    :cond_7
    invoke-static {}, Lcom/kwad/sdk/core/report/n$a;->Fy()Lcom/kwad/sdk/core/report/n$a;

    move-result-object v0

    iput-object v0, p0, Lcom/kwad/sdk/core/report/n;->azj:Lcom/kwad/sdk/core/report/n$a;

    .line 46
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-nez v0, :cond_8

    if-eqz p1, :cond_8

    .line 47
    iget-object p1, p1, Lcom/kwad/sdk/core/response/model/AdTemplate;->mAdScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    iput-object p1, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    .line 48
    :cond_8
    iget-object p1, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    if-eqz p1, :cond_9

    .line 49
    invoke-virtual {p1}, Lcom/kwad/sdk/internal/api/SceneImpl;->getPosId()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/report/n;->posId:J

    .line 50
    iget-object p1, p0, Lcom/kwad/sdk/core/report/n;->adScene:Lcom/kwad/sdk/internal/api/SceneImpl;

    invoke-virtual {p1}, Lcom/kwad/sdk/internal/api/SceneImpl;->getUrlPackage()Lcom/kwad/sdk/core/scene/URLPackage;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/report/n;->urlPackage:Lcom/kwad/sdk/core/scene/URLPackage;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    :cond_9
    return-void

    :catch_3
    move-exception p1

    .line 51
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final Fw()Lcom/kwad/sdk/core/report/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->mAdTemplate:Lcom/kwad/sdk/core/response/model/AdTemplate;

    invoke-direct {p0, v0}, Lcom/kwad/sdk/core/report/n;->bZ(Lcom/kwad/sdk/core/response/model/AdTemplate;)V

    return-object p0
.end method

.method public final Fx()V
    .locals 2

    .line 1
    const-class v0, Lcom/kwad/sdk/service/a/j;

    invoke-static {v0}, Lcom/kwad/sdk/service/ServiceProvider;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/service/a/j;

    .line 2
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/j;->rd()Z

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azu:I

    .line 3
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/j;->re()I

    move-result v1

    iput v1, p0, Lcom/kwad/sdk/core/report/n;->azv:I

    .line 4
    invoke-interface {v0}, Lcom/kwad/sdk/service/a/j;->rf()I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azw:I

    return-void
.end method

.method public afterParseJson(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/report/e;->afterParseJson(Lorg/json/JSONObject;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azl:I

    const-string v0, "adStyle"

    const/4 v1, -0x1

    .line 3
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    const-string v0, "num"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azq:I

    const-string v0, "state"

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azp:I

    const-string v0, "timeSpend"

    .line 6
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azx:J

    const-string v0, "loadingDuration"

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azN:J

    const-string v0, "loadingDurationLimt"

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/kwad/sdk/core/report/n;->azO:J

    const-string v0, "playerTypeInfo"

    .line 9
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/kwad/sdk/core/report/n;->azC:I

    const-string v0, "actionId"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/report/e;->actionId:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public afterToJson(Lorg/json/JSONObject;)V
    .locals 5

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/report/e;->afterToJson(Lorg/json/JSONObject;)V

    .line 2
    iget-object v0, p0, Lcom/kwad/sdk/core/report/e;->actionId:Ljava/lang/String;

    const-string v1, "actionId"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->adStyle:I

    if-lez v0, :cond_0

    const-string v1, "adStyle"

    .line 4
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 5
    :cond_0
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azq:I

    if-lez v0, :cond_1

    const-string v1, "num"

    .line 6
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 7
    :cond_1
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azp:I

    if-eqz v0, :cond_2

    const-string v1, "state"

    .line 8
    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    .line 9
    :cond_2
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/n;->azx:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    const-string v4, "timeSpend"

    .line 10
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 11
    :cond_3
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/n;->azN:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_4

    const-string v4, "loadingDuration"

    .line 12
    invoke-static {p1, v4, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 13
    :cond_4
    iget-wide v0, p0, Lcom/kwad/sdk/core/report/n;->azO:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_5

    const-string v2, "loadingDurationLimt"

    .line 14
    invoke-static {p1, v2, v0, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;J)V

    .line 15
    :cond_5
    iget v0, p0, Lcom/kwad/sdk/core/report/n;->azC:I

    const-string v1, "playerTypeInfo"

    invoke-static {p1, v1, v0}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0}, Lcom/kwad/sdk/core/response/a/a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ReportAction{actionJSONString="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/kwad/sdk/core/report/n;->aAd:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
