.class public final Lcom/kwad/sdk/core/config/item/TipsConfigItem;
.super Lcom/kwad/sdk/core/config/item/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kwad/sdk/core/config/item/b<",
        "Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    invoke-direct {v0}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;-><init>()V

    const-string v1, "tipConfig"

    invoke-direct {p0, v1, v0}, Lcom/kwad/sdk/core/config/item/b;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/SharedPreferences;)V
    .locals 3
    .param p1    # Landroid/content/SharedPreferences;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/config/item/b;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    invoke-direct {v0}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;-><init>()V

    :cond_0
    const/4 v1, 0x0

    const-string v2, "tipsSwitch"

    .line 3
    invoke-interface {p1, v2, v1}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;->setTipShowSwitch(I)V

    const-string v1, "tipsInfo"

    const-string v2, ""

    .line 4
    invoke-interface {p1, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;->setTipInfoData(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/config/item/b;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final b(Landroid/content/SharedPreferences$Editor;)V
    .locals 2
    .param p1    # Landroid/content/SharedPreferences$Editor;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/config/item/b;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;->getTipShowSwitch()I

    move-result v0

    const-string v1, "tipsSwitch"

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 2
    invoke-virtual {p0}, Lcom/kwad/sdk/core/config/item/b;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;->getTipInfoData()Ljava/lang/String;

    move-result-object v0

    const-string v1, "tipsInfo"

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {p0}, Lcom/kwad/sdk/core/config/item/b;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    invoke-virtual {v0}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;->getTipInfoData()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void

    :cond_0
    const-string v0, ""

    .line 4
    invoke-interface {p1, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    return-void
.end method

.method public final k(Lorg/json/JSONObject;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-virtual {p0}, Lcom/kwad/sdk/core/config/item/b;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;

    invoke-direct {v0}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;-><init>()V

    .line 3
    invoke-virtual {v0, p1}, Lcom/kwad/sdk/core/config/item/TipsConfigItem$TipConfigData;->parseJson(Lorg/json/JSONObject;)V

    .line 4
    invoke-virtual {p0, v0}, Lcom/kwad/sdk/core/config/item/b;->setValue(Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_0
    invoke-virtual {p0}, Lcom/kwad/sdk/core/config/item/b;->Dr()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kwad/sdk/core/config/item/b;->setValue(Ljava/lang/Object;)V

    return-void
.end method
