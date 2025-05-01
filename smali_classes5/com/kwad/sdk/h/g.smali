.class public final Lcom/kwad/sdk/h/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private aAB:Ljava/lang/String;

.field private aAC:Ljava/lang/String;

.field private aKs:Lorg/json/JSONObject;

.field private aKt:Z

.field private agA:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private appId:Ljava/lang/String;

.field private aqw:Lorg/json/JSONObject;

.field private aux:Ljava/lang/String;

.field private auy:Ljava/lang/String;

.field private azF:Ljava/lang/String;

.field private sdkVersion:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static JI()Lcom/kwad/sdk/h/g;
    .locals 1

    .line 1
    new-instance v0, Lcom/kwad/sdk/h/g;

    invoke-direct {v0}, Lcom/kwad/sdk/h/g;-><init>()V

    return-object v0
.end method


# virtual methods
.method public final JJ()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->aKs:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final JK()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/kwad/sdk/h/g;->aKt:Z

    return v0
.end method

.method public final JL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->azF:Ljava/lang/String;

    return-object v0
.end method

.method public final JM()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->aqw:Lorg/json/JSONObject;

    return-object v0
.end method

.method public final bE(Z)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/kwad/sdk/h/g;->aKt:Z

    return-object p0
.end method

.method public final ga(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->appId:Ljava/lang/String;

    return-object p0
.end method

.method public final gb(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->sdkVersion:Ljava/lang/String;

    return-object p0
.end method

.method public final gc(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->auy:Ljava/lang/String;

    return-object p0
.end method

.method public final gd(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->aAC:Ljava/lang/String;

    return-object p0
.end method

.method public final ge(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->aAB:Ljava/lang/String;

    return-object p0
.end method

.method public final getAndroidId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->aAB:Ljava/lang/String;

    return-object v0
.end method

.method public final getAppId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public final getDeviceId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->aAC:Ljava/lang/String;

    return-object v0
.end method

.method public final getImei()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->aux:Ljava/lang/String;

    return-object v0
.end method

.method public final getOaid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->auy:Ljava/lang/String;

    return-object v0
.end method

.method public final getRequestHeader()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->agA:Ljava/util/Map;

    return-object v0
.end method

.method public final getSdkVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/h/g;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final gf(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->aux:Ljava/lang/String;

    return-object p0
.end method

.method public final gg(Ljava/lang/String;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->azF:Ljava/lang/String;

    return-object p0
.end method

.method public final h(Ljava/util/Map;)Lcom/kwad/sdk/h/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/kwad/sdk/h/g;"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->agA:Ljava/util/Map;

    return-object p0
.end method

.method public final m(Lorg/json/JSONObject;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->aKs:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final n(Lorg/json/JSONObject;)Lcom/kwad/sdk/h/g;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/kwad/sdk/h/g;->aqw:Lorg/json/JSONObject;

    return-object p0
.end method
