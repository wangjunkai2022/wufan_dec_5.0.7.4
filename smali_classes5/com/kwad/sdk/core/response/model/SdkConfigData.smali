.class public Lcom/kwad/sdk/core/response/model/SdkConfigData;
.super Lcom/kwad/sdk/core/response/model/BaseResultData;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;,
        Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;
    }
.end annotation


# static fields
.field public static final DEFAULT_CAN_USE_THRESHOLD:I = 0x12c

.field public static final DEFAULT_GOOD_IDC_THRESHOLD:I = 0xc8

.field public static final DEFAULT_REQUEST_INTERVAL:I = 0xe10

.field private static final serialVersionUID:J = -0x6c33ee185307055fL


# instance fields
.field private abConfig:Lorg/json/JSONObject;

.field private adxConfig:Lorg/json/JSONObject;

.field private appConfig:Lorg/json/JSONObject;

.field public canUseThresholdMs:I

.field public couponActiveConfig:Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;

.field public goodIdcThresholdMs:I

.field public h5PreloadConfigs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kwad/sdk/g/a/a;",
            ">;"
        }
    .end annotation
.end field

.field public httpDnsInfo:Lcom/kwad/sdk/core/response/model/HttpDnsInfo;

.field private mDataJsonObj:Lorg/json/JSONObject;

.field public requestInterval:J

.field public templateConfig:Lcom/kwad/sdk/core/response/model/TemplateConfig;

.field public templateConfigMap:Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/core/response/model/BaseResultData;-><init>()V

    const-wide/16 v0, 0xe10

    .line 2
    iput-wide v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->requestInterval:J

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->h5PreloadConfigs:Ljava/util/List;

    .line 4
    new-instance v0, Lcom/kwad/sdk/core/response/model/TemplateConfig;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/TemplateConfig;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->templateConfig:Lcom/kwad/sdk/core/response/model/TemplateConfig;

    .line 5
    new-instance v0, Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->templateConfigMap:Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;

    .line 6
    new-instance v0, Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->couponActiveConfig:Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;

    .line 7
    new-instance v0, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;

    invoke-direct {v0}, Lcom/kwad/sdk/core/response/model/HttpDnsInfo;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->httpDnsInfo:Lcom/kwad/sdk/core/response/model/HttpDnsInfo;

    const/16 v0, 0xc8

    .line 8
    iput v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->goodIdcThresholdMs:I

    const/16 v0, 0x12c

    .line 9
    iput v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->canUseThresholdMs:I

    return-void
.end method


# virtual methods
.method public getAppConfigData(Ljava/lang/Object;Lcom/kwad/sdk/f/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Lcom/kwad/sdk/f/b<",
            "Lorg/json/JSONObject;",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->appConfig:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2, v0}, Lcom/kwad/sdk/f/b;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public isDataEmpty()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public parseJson(Lorg/json/JSONObject;)V
    .locals 2
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lcom/kwad/sdk/core/response/model/BaseResultData;->parseJson(Lorg/json/JSONObject;)V

    if-nez p1, :cond_0

    return-void

    :cond_0
    :try_start_0
    const-string v0, "data"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 3
    invoke-static {p1}, Lcom/kwad/sdk/core/a/d;->getResponseData(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string p1, "requestInterval"

    .line 5
    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->requestInterval:J

    .line 6
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v0, "goodIdcThresholdMs"

    const/16 v1, 0xc8

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->goodIdcThresholdMs:I

    .line 7
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v0, "canUseThresholdMs"

    const/16 v1, 0x12c

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->canUseThresholdMs:I

    .line 8
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/kwad/sdk/core/config/b;->j(Lorg/json/JSONObject;)V

    .line 9
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v0, "abConfig"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->abConfig:Lorg/json/JSONObject;

    .line 10
    invoke-static {p1}, Lcom/kwad/sdk/core/config/b;->j(Lorg/json/JSONObject;)V

    .line 11
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v0, "adxConfig"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->adxConfig:Lorg/json/JSONObject;

    .line 12
    invoke-static {p1}, Lcom/kwad/sdk/core/config/b;->j(Lorg/json/JSONObject;)V

    .line 13
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v0, "appConfig"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->appConfig:Lorg/json/JSONObject;

    .line 14
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v0, "h5PreloadConfigs"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Lcom/kwad/sdk/core/response/model/SdkConfigData$1;

    invoke-direct {v0, p0}, Lcom/kwad/sdk/core/response/model/SdkConfigData$1;-><init>(Lcom/kwad/sdk/core/response/model/SdkConfigData;)V

    invoke-static {p1, v0}, Lcom/kwad/sdk/utils/t;->a(Ljava/lang/String;Lcom/kwad/sdk/core/c;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->h5PreloadConfigs:Ljava/util/List;

    .line 15
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->appConfig:Lorg/json/JSONObject;

    invoke-static {p1}, Lcom/kwad/sdk/core/config/b;->j(Lorg/json/JSONObject;)V

    .line 16
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->templateConfig:Lcom/kwad/sdk/core/response/model/TemplateConfig;

    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v1, "templateConfig"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 17
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->templateConfigMap:Lcom/kwad/sdk/core/response/model/SdkConfigData$TemplateConfigMap;

    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v1, "templateConfigMap"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 18
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->couponActiveConfig:Lcom/kwad/sdk/core/response/model/SdkConfigData$CouponActiveConfig;

    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v1, "couponActiveConfig"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V

    .line 19
    iget-object p1, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->httpDnsInfo:Lcom/kwad/sdk/core/response/model/HttpDnsInfo;

    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    const-string v1, "httpDnsInfo"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/kwad/sdk/core/response/a/a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 20
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTraceOnly(Ljava/lang/Throwable;)V

    return-void
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/core/response/model/SdkConfigData;->mDataJsonObj:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    return-object v0
.end method
