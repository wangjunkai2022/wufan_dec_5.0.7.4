.class Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kwad/sdk/core/b;
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/collector/AppStatusRules;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "AppStatusInfo"
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x215b77974a3707aaL


# instance fields
.field private namedStrategy:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kwad/sdk/collector/AppStatusRules$Strategy;",
            ">;"
        }
    .end annotation
.end field

.field private strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

.field private target:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kwad/sdk/collector/model/d;",
            ">;"
        }
    .end annotation
.end field

.field private uploadConfig:Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;

.field private uploadTarget:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kwad/sdk/collector/model/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    invoke-direct {v0}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->target:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->namedStrategy:Ljava/util/ArrayList;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadTarget:Ljava/util/ArrayList;

    .line 6
    new-instance v0, Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;

    invoke-direct {v0}, Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;-><init>()V

    iput-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadConfig:Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;

    return-void
.end method

.method synthetic constructor <init>(Lcom/kwad/sdk/collector/AppStatusRules$1;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;)Lcom/kwad/sdk/collector/AppStatusRules$Strategy;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    return-object p0
.end method

.method static synthetic access$200(Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->namedStrategy:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$300(Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->target:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$400(Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadTarget:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$500(Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;)Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadConfig:Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;

    return-object p0
.end method

.method private duplicateTarget()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    invoke-virtual {v0}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;->getTargetPackages()Ljava/util/Set;

    move-result-object v0

    .line 2
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 3
    iget-object v2, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->namedStrategy:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    .line 4
    invoke-virtual {v3}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;->getTargetPackages()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 5
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;->removeTargetsByPackage(Ljava/util/Collection;)V

    return-void
.end method


# virtual methods
.method public getStrategy()Lcom/kwad/sdk/collector/AppStatusRules$Strategy;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    return-object v0
.end method

.method public parseJson(Lorg/json/JSONObject;)V
    .locals 4
    .param p1    # Lorg/json/JSONObject;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, "uploadConfig"

    const-string v1, "uploadTarget"

    const-string v2, "namedStrategy"

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 2
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 3
    invoke-static {v2}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;->createFromJSONArray(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v2

    iput-object v2, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->namedStrategy:Ljava/util/ArrayList;

    .line 4
    :cond_1
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 5
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 6
    invoke-static {v1}, Lcom/kwad/sdk/collector/model/c;->d(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v1

    iput-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadTarget:Ljava/util/ArrayList;

    .line 7
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 8
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadConfig:Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;->parseJson(Lorg/json/JSONObject;)V

    :cond_3
    const-string v0, "strategy"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "target"

    .line 11
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    .line 12
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    invoke-virtual {v1, v0}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;->parseJson(Lorg/json/JSONObject;)V

    .line 13
    invoke-static {p1}, Lcom/kwad/sdk/collector/model/c;->d(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->target:Ljava/util/ArrayList;

    .line 14
    iget-object v0, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/collector/AppStatusRules$Strategy;->setTarget(Ljava/util/ArrayList;)V

    .line 15
    invoke-direct {p0}, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->duplicateTarget()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 16
    invoke-static {p1}, Lcom/kwad/sdk/core/e/c;->printStackTrace(Ljava/lang/Throwable;)V

    return-void
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->strategy:Lcom/kwad/sdk/collector/AppStatusRules$Strategy;

    const-string v2, "strategy"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    .line 3
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->target:Ljava/util/ArrayList;

    const-string v2, "target"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    .line 4
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->namedStrategy:Ljava/util/ArrayList;

    const-string v2, "namedStrategy"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    .line 5
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadTarget:Ljava/util/ArrayList;

    const-string v2, "uploadTarget"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->putValue(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    .line 6
    iget-object v1, p0, Lcom/kwad/sdk/collector/AppStatusRules$AppStatusInfo;->uploadConfig:Lcom/kwad/sdk/collector/AppStatusRules$UploadConfig;

    const-string v2, "uploadConfig"

    invoke-static {v0, v2, v1}, Lcom/kwad/sdk/utils/t;->a(Lorg/json/JSONObject;Ljava/lang/String;Lcom/kwad/sdk/core/b;)V

    return-object v0
.end method
