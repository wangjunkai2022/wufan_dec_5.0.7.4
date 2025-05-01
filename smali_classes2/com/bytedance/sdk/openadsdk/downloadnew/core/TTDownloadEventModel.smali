.class public Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;
.super Ljava/lang/Object;


# instance fields
.field private i:Lorg/json/JSONObject;

.field private m:Ljava/lang/String;

.field private p:Lorg/json/JSONObject;

.field private vv:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;
    .locals 1

    .line 1
    new-instance v0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;

    invoke-direct {v0}, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;-><init>()V

    return-object v0
.end method


# virtual methods
.method public getExtJson()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->p:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getLabel()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->m:Ljava/lang/String;

    return-object v0
.end method

.method public getMaterialMeta()Lorg/json/JSONObject;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->i:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getTag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->vv:Ljava/lang/String;

    return-object v0
.end method

.method public setExtJson(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->p:Lorg/json/JSONObject;

    return-object p0
.end method

.method public setLabel(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->m:Ljava/lang/String;

    return-object p0
.end method

.method public setMaterialMeta(Lorg/json/JSONObject;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->i:Lorg/json/JSONObject;

    return-object p0
.end method

.method public setTag(Ljava/lang/String;)Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/bytedance/sdk/openadsdk/downloadnew/core/TTDownloadEventModel;->vv:Ljava/lang/String;

    return-object p0
.end method
