.class public Lcom/beizi/ad/lance/a/m;
.super Ljava/lang/Object;
.source "OaidAndGaidUtils.java"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const/4 v1, 0x0

    .line 1
    invoke-static {}, Lcom/beizi/ad/BeiZi;->getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 2
    invoke-static {}, Lcom/beizi/ad/BeiZi;->getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/BeiZiAdSdkController;->getDevOaid()Ljava/lang/String;

    move-result-object v1

    .line 3
    :cond_1
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    return-object v1

    .line 4
    :cond_2
    invoke-static {}, Lcom/beizi/ad/BeiZi;->getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {}, Lcom/beizi/ad/BeiZi;->isLimitPersonalAds()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {}, Lcom/beizi/ad/BeiZi;->getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/BeiZiAdSdkController;->isCanUseOaid()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    return-object v0

    :cond_4
    :goto_0
    const-string v1, "__OAID__"

    .line 5
    invoke-static {p0, v1}, Lcom/beizi/ad/internal/utilities/SPUtils;->getStringFromFusionSdk(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_5

    goto :goto_1

    :cond_5
    move-object v0, p0

    :goto_1
    return-object v0
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 1
    :cond_0
    invoke-static {}, Lcom/beizi/ad/BeiZi;->getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {}, Lcom/beizi/ad/BeiZi;->isLimitPersonalAds()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {}, Lcom/beizi/ad/BeiZi;->getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/BeiZiAdSdkController;->isCanUseGaid()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    const-string v1, "__GAID__"

    .line 2
    invoke-static {p0, v1}, Lcom/beizi/ad/internal/utilities/SPUtils;->getStringFromFusionSdk(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p0

    :goto_1
    return-object v0
.end method
