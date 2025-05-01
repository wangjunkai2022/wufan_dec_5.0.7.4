.class public Lcom/beizi/ad/BeiZi;
.super Ljava/lang/Object;
.source "BeiZi.java"


# static fields
.field private static a:Lcom/beizi/ad/BeiZiAdSdkController;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getCustomController()Lcom/beizi/ad/BeiZiAdSdkController;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/BeiZi;->a:Lcom/beizi/ad/BeiZiAdSdkController;

    return-object v0
.end method

.method public static getLocationDecimalDigits()I
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getLocationDecimalDigits()I

    move-result v0

    return v0
.end method

.method public static getLocationEnabled()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    move-result-object v0

    iget-boolean v0, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->locationEnabled:Z

    return v0
.end method

.method public static getRewardedVideoAdInstance(Landroid/content/Context;)Lcom/beizi/ad/RewardedVideoAd;
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/g;->a(Landroid/content/Context;)Lcom/beizi/ad/RewardedVideoAd;

    move-result-object p0

    return-object p0
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/beizi/ad/internal/g;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static init(Landroid/content/Context;Ljava/lang/String;Lcom/beizi/ad/BeiZiAdSdkController;)V
    .locals 0
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 2
    sput-object p2, Lcom/beizi/ad/BeiZi;->a:Lcom/beizi/ad/BeiZiAdSdkController;

    .line 3
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Lcom/beizi/ad/internal/g;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static initWithDomain(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation build Landroidx/annotation/RequiresPermission;
        value = "android.permission.INTERNET"
    .end annotation

    .line 1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/beizi/ad/internal/g;->a(Ljava/lang/String;)Lcom/beizi/ad/internal/g;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Lcom/beizi/ad/internal/g;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p2

    invoke-virtual {p2, p0, p1}, Lcom/beizi/ad/internal/g;->a(Landroid/content/Context;Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method public static isHttpsEnabled()Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    iget-boolean v0, v0, Lcom/beizi/ad/internal/g;->a:Z

    return v0
.end method

.method public static isLimitPersonalAds()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/beizi/ad/BeiZi;->b:Z

    return v0
.end method

.method public static logTagInfo(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lcom/beizi/ad/internal/g;->a(Ljava/lang/String;Z)V

    return-void
.end method

.method public static setAdRequestUrl(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/g;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static setAppMuted(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/g;->a(Z)V

    return-void
.end method

.method public static setAppVolume(F)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/g;->a(F)V

    return-void
.end method

.method public static setIncentiveConfig(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/g;->a(Ljava/util/Map;)V

    return-void
.end method

.method public static setLimitPersonalAds(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/beizi/ad/BeiZi;->b:Z

    return-void
.end method

.method public static setLocationDecimalDigits(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->setLocationDecimalDigits(I)V

    return-void
.end method

.method public static setLocationEnabled(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    move-result-object v0

    iput-boolean p0, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->locationEnabled:Z

    return-void
.end method

.method public static startActivity(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/beizi/ad/AdActivity;->a()Ljava/lang/Class;

    move-result-object v0

    .line 2
    :try_start_0
    new-instance v1, Landroid/webkit/WebView;

    invoke-direct {v1, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 3
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/WebviewUtil;->setWebViewSettings(Landroid/webkit/WebView;)V

    .line 4
    invoke-static {}, Lcom/beizi/ad/lance/a/i;->a()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;Ljava/util/Map;)V

    .line 5
    sget-object p1, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {p1, v1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 7
    invoke-virtual {p1, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string v1, "ACTIVITY_TYPE"

    const-string v2, "DOWNLOADBROWSER"

    .line 8
    invoke-virtual {p1, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 10
    sget-object p1, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Exception initializing the redirect webview: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 11
    :catch_1
    sget-object p0, Lcom/beizi/ad/internal/utilities/HaoboLog;->baseLogTag:Ljava/lang/String;

    sget p1, Lcom/beizi/ad/R$string;->adactivity_missing:I

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/beizi/ad/internal/utilities/HaoboLog;->getString(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/beizi/ad/internal/utilities/HaoboLog;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    sget-object p0, Lcom/beizi/ad/internal/activity/a;->a:Ljava/util/LinkedList;

    invoke-virtual {p0}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public static useHttps(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    iput-boolean p0, v0, Lcom/beizi/ad/internal/g;->a:Z

    return-void
.end method
