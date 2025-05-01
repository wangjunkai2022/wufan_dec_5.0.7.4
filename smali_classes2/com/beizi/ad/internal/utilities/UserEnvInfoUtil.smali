.class public Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;
.super Ljava/lang/Object;
.source "UserEnvInfoUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getNetWorkType(Landroid/content/Context;)Lcom/beizi/ad/c/e$d;
    .locals 2

    if-nez p0, :cond_0

    .line 1
    sget-object p0, Lcom/beizi/ad/c/e$d;->f:Lcom/beizi/ad/c/e$d;

    return-object p0

    .line 2
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    if-eqz p0, :cond_4

    .line 3
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object p0

    if-eqz p0, :cond_4

    .line 4
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 5
    sget-object p0, Lcom/beizi/ad/c/e$d;->e:Lcom/beizi/ad/c/e$d;

    return-object p0

    :cond_1
    if-nez v0, :cond_4

    .line 6
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    .line 7
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object p0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-string v0, "TD-SCDMA"

    goto :goto_0

    .line 8
    :pswitch_1
    sget-object p0, Lcom/beizi/ad/c/e$d;->d:Lcom/beizi/ad/c/e$d;

    return-object p0

    .line 9
    :pswitch_2
    sget-object p0, Lcom/beizi/ad/c/e$d;->c:Lcom/beizi/ad/c/e$d;

    return-object p0

    .line 10
    :pswitch_3
    sget-object p0, Lcom/beizi/ad/c/e$d;->b:Lcom/beizi/ad/c/e$d;

    return-object p0

    .line 11
    :pswitch_4
    sget-object p0, Lcom/beizi/ad/c/e$d;->g:Lcom/beizi/ad/c/e$d;

    return-object p0

    .line 12
    :goto_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "WCDMA"

    .line 13
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "CDMA2000"

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    goto :goto_1

    .line 15
    :cond_2
    sget-object p0, Lcom/beizi/ad/c/e$d;->f:Lcom/beizi/ad/c/e$d;

    return-object p0

    .line 16
    :cond_3
    :goto_1
    sget-object p0, Lcom/beizi/ad/c/e$d;->b:Lcom/beizi/ad/c/e$d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    .line 17
    :cond_4
    sget-object p0, Lcom/beizi/ad/c/e$d;->f:Lcom/beizi/ad/c/e$d;

    return-object p0

    :catchall_0
    move-exception p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    sget-object p0, Lcom/beizi/ad/c/e$d;->f:Lcom/beizi/ad/c/e$d;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static getNetworkClass(Landroid/content/Context;)Lcom/beizi/ad/c/e$d;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;->getNetWorkType(Landroid/content/Context;)Lcom/beizi/ad/c/e$d;

    move-result-object p0

    return-object p0
.end method

.method private static getSubId()I
    .locals 3

    const/4 v0, -0x1

    .line 1
    :try_start_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    .line 2
    invoke-static {}, Landroid/telephony/SubscriptionManager;->getDefaultDataSubscriptionId()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return v0

    :catchall_0
    move-exception v1

    .line 3
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    return v0
.end method

.method public static getVersionName(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const-string p0, ""

    :goto_0
    return-object p0
.end method

.method private static isServiceStateFiveGAvailable(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "nrState=NOT_RESTRICTED"

    .line 2
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "nrState=CONNECTED"

    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static isUsingWifi(Landroid/content/Context;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "connectivity"

    .line 2
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/net/ConnectivityManager;

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object p0

    .line 4
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result p0

    return p0
.end method

.method public static refreshLocation(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    return-void
.end method

.method public static retrieveUserEnvInfo(Landroid/content/Context;)V
    .locals 4

    if-eqz p0, :cond_5

    .line 1
    invoke-static {}, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->getInstance()Lcom/beizi/ad/internal/utilities/UserEnvInfo;

    move-result-object v0

    .line 2
    :try_start_0
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;->getNetworkClass(Landroid/content/Context;)Lcom/beizi/ad/c/e$d;

    move-result-object v1

    iput-object v1, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->net:Lcom/beizi/ad/c/e$d;

    const-string v1, "phone"

    .line 3
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/telephony/TelephonyManager;

    if-eqz v1, :cond_4

    const/4 v2, 0x5

    .line 4
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 5
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    const-string v2, "46000"

    .line 6
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "46002"

    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "46007"

    .line 8
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "46001"

    .line 9
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 10
    sget-object v1, Lcom/beizi/ad/c/e$c;->c:Lcom/beizi/ad/c/e$c;

    iput-object v1, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->isp:Lcom/beizi/ad/c/e$c;

    goto :goto_1

    :cond_1
    const-string v2, "46003"

    .line 11
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 12
    sget-object v1, Lcom/beizi/ad/c/e$c;->d:Lcom/beizi/ad/c/e$c;

    iput-object v1, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->isp:Lcom/beizi/ad/c/e$c;

    goto :goto_1

    .line 13
    :cond_2
    :goto_0
    sget-object v1, Lcom/beizi/ad/c/e$c;->b:Lcom/beizi/ad/c/e$c;

    iput-object v1, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->isp:Lcom/beizi/ad/c/e$c;

    goto :goto_1

    .line 14
    :cond_3
    sget-object v1, Lcom/beizi/ad/c/e$c;->a:Lcom/beizi/ad/c/e$c;

    iput-object v1, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->isp:Lcom/beizi/ad/c/e$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    :goto_1
    const-string v1, "MC4wLjAuMA=="

    .line 16
    invoke-static {v1}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/beizi/ad/internal/utilities/UserEnvInfo;->ip:Ljava/lang/String;

    .line 17
    invoke-static {p0}, Lcom/beizi/ad/internal/utilities/UserEnvInfoUtil;->refreshLocation(Landroid/content/Context;)V

    :cond_5
    return-void
.end method
