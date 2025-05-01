.class public Lcom/beizi/ad/alipay/RedPackageManager;
.super Ljava/lang/Object;
.source "RedPackageManager.java"


# static fields
.field public static final APP_ORDER_ID_KEY:Ljava/lang/String; = "app_order_id_key"

.field public static final APP_USERID_KEY:Ljava/lang/String; = "app_user_id_key"

.field public static final AUTH_CODE_KEY:Ljava/lang/String; = "auth_code"

.field private static final MACRO_DEFAULT:Ljava/lang/String; = "appId=__APPID__&packageName=__PACKAGENAME__&installTime=__INSTALLTIME__&updateTime=__UPDATETIME__&nowTime=__NOWTIME__&appVersion=__APPVERSION__&appVersionCode=__APPVERSIONCODE__&sdkVersion=__SDKVERSION__&OAID=__OAID__&GAID=__GAID__&sdkUID=__SDKUID__&SDKUIDORIG=__SDKUIDORIG__&idfa=__IDFA__&idfv=__IDFV__&os=__OS__&platform=__PLATFORM__&devType=__DEVTYPE__&brand=__BRAND__&model=__MODEL__&resolution=__RESOLUTION__&screenSize=__SCREENSIZE__&density=__DENSITY__&language=__LANGUAGE__&root=__ROOT__&net=__NET__&isp=__ISP__&battery=__BATTERY__&diskSpace=__DISKSPACE__&useSpace=__USESPACE__&developerMode=__DEVELOPERMODE__&appUserId=__APP_USERID__&appOrderId=__APP_ORDERID__&transAmount=__TRANS_AMOUNT__&incentiveConfigVersion=__INCENTIVECONFIGVERSION__&authCode=__AUTH_CODE__"

.field private static TAG:Ljava/lang/String; = "RedPackageManager"

.field private static final TEST_APPID:Ljava/lang/String; = ""

.field public static final TRANS_AMOUNT_KEY:Ljava/lang/String; = "trans_amount_key"

.field private static instance:Lcom/beizi/ad/alipay/RedPackageManager;


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

.method static synthetic access$000()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    return-object v0
.end method

.method public static getInstance()Lcom/beizi/ad/alipay/RedPackageManager;
    .locals 2

    .line 1
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageManager;->instance:Lcom/beizi/ad/alipay/RedPackageManager;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/beizi/ad/alipay/RedPackageManager;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/beizi/ad/alipay/RedPackageManager;->instance:Lcom/beizi/ad/alipay/RedPackageManager;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/beizi/ad/alipay/RedPackageManager;

    invoke-direct {v1}, Lcom/beizi/ad/alipay/RedPackageManager;-><init>()V

    sput-object v1, Lcom/beizi/ad/alipay/RedPackageManager;->instance:Lcom/beizi/ad/alipay/RedPackageManager;

    .line 5
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_0
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageManager;->instance:Lcom/beizi/ad/alipay/RedPackageManager;

    return-object v0
.end method


# virtual methods
.method public authAliPayWithParams(Landroid/app/Activity;Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/ad/alipay/inter/UserInfoListener;",
            ")V"
        }
    .end annotation

    const-string v0, "app_user_id_key"

    .line 1
    :try_start_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/g;->n()Lcom/beizi/ad/alipay/model/IncentiveConfig;

    move-result-object v1

    const-string v2, "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FsaXBheS91c2VyaW5mbw=="

    .line 2
    invoke-static {v2}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "appId=__APPID__&packageName=__PACKAGENAME__&installTime=__INSTALLTIME__&updateTime=__UPDATETIME__&nowTime=__NOWTIME__&appVersion=__APPVERSION__&appVersionCode=__APPVERSIONCODE__&sdkVersion=__SDKVERSION__&OAID=__OAID__&GAID=__GAID__&sdkUID=__SDKUID__&SDKUIDORIG=__SDKUIDORIG__&idfa=__IDFA__&idfv=__IDFV__&os=__OS__&platform=__PLATFORM__&devType=__DEVTYPE__&brand=__BRAND__&model=__MODEL__&resolution=__RESOLUTION__&screenSize=__SCREENSIZE__&density=__DENSITY__&language=__LANGUAGE__&root=__ROOT__&net=__NET__&isp=__ISP__&battery=__BATTERY__&diskSpace=__DISKSPACE__&useSpace=__USESPACE__&developerMode=__DEVELOPERMODE__&appUserId=__APP_USERID__&appOrderId=__APP_ORDERID__&transAmount=__TRANS_AMOUNT__&incentiveConfigVersion=__INCENTIVECONFIGVERSION__&authCode=__AUTH_CODE__"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, ""

    if-eqz v1, :cond_0

    .line 3
    :try_start_1
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getUserInfoUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getUserInfoUrl()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getMacro()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getAppId()Ljava/lang/String;

    move-result-object v1

    move-object v6, v2

    move-object v7, v3

    move-object v2, v1

    goto :goto_0

    :cond_0
    move-object v6, v2

    move-object v7, v3

    move-object v2, v4

    .line 7
    :goto_0
    sget-object v1, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "authAliPayWithParams userInfoUrl : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " , appId : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    sget-object v1, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "authAliPayWithParams macroStr : "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_1

    .line 9
    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 10
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 11
    :cond_1
    new-instance v8, Lcom/beizi/ad/alipay/model/AliPayEventBean;

    invoke-direct {v8}, Lcom/beizi/ad/alipay/model/AliPayEventBean;-><init>()V

    .line 12
    invoke-virtual {v8, v4}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setAppUserId(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v9

    new-instance v10, Lcom/beizi/ad/alipay/RedPackageRequest;

    new-instance v11, Lcom/beizi/ad/alipay/RedPackageManager$3;

    move-object v0, v11

    move-object v1, p0

    move-object v3, p3

    move-object v4, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/beizi/ad/alipay/RedPackageManager$3;-><init>(Lcom/beizi/ad/alipay/RedPackageManager;Ljava/lang/String;Lcom/beizi/ad/alipay/inter/UserInfoListener;Landroid/app/Activity;Ljava/util/Map;)V

    invoke-direct {v10, v6, v7, v8, v11}, Lcom/beizi/ad/alipay/RedPackageRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;Lcom/beizi/ad/alipay/inter/Callback;)V

    invoke-interface {v9, v10}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public authInfo(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/ad/alipay/inter/UserInfoListener;",
            ")V"
        }
    .end annotation

    const-string v0, "app_user_id_key"

    .line 1
    :try_start_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/internal/g;->n()Lcom/beizi/ad/alipay/model/IncentiveConfig;

    move-result-object v1

    const-string v2, "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FsaXBheS91c2VyaW5mbw=="

    .line 2
    invoke-static {v2}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "appId=__APPID__&packageName=__PACKAGENAME__&installTime=__INSTALLTIME__&updateTime=__UPDATETIME__&nowTime=__NOWTIME__&appVersion=__APPVERSION__&appVersionCode=__APPVERSIONCODE__&sdkVersion=__SDKVERSION__&OAID=__OAID__&GAID=__GAID__&sdkUID=__SDKUID__&SDKUIDORIG=__SDKUIDORIG__&idfa=__IDFA__&idfv=__IDFV__&os=__OS__&platform=__PLATFORM__&devType=__DEVTYPE__&brand=__BRAND__&model=__MODEL__&resolution=__RESOLUTION__&screenSize=__SCREENSIZE__&density=__DENSITY__&language=__LANGUAGE__&root=__ROOT__&net=__NET__&isp=__ISP__&battery=__BATTERY__&diskSpace=__DISKSPACE__&useSpace=__USESPACE__&developerMode=__DEVELOPERMODE__&appUserId=__APP_USERID__&appOrderId=__APP_ORDERID__&transAmount=__TRANS_AMOUNT__&incentiveConfigVersion=__INCENTIVECONFIGVERSION__&authCode=__AUTH_CODE__"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, ""

    if-eqz v1, :cond_0

    .line 3
    :try_start_1
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getUserInfoUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getUserInfoUrl()Ljava/lang/String;

    move-result-object v2

    .line 5
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getMacro()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {v1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getAppId()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v4

    .line 7
    :goto_0
    sget-object v5, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "userInfoUrl : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " , appId : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    sget-object v5, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "macroStr : "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    .line 9
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 10
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    .line 11
    :cond_1
    new-instance p1, Lcom/beizi/ad/alipay/model/AliPayEventBean;

    invoke-direct {p1}, Lcom/beizi/ad/alipay/model/AliPayEventBean;-><init>()V

    .line 12
    invoke-virtual {p1, v4}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setAppUserId(Ljava/lang/String;)V

    .line 13
    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v4, Lcom/beizi/ad/alipay/RedPackageRequest;

    new-instance v5, Lcom/beizi/ad/alipay/RedPackageManager$2;

    invoke-direct {v5, p0, v1, p2}, Lcom/beizi/ad/alipay/RedPackageManager$2;-><init>(Lcom/beizi/ad/alipay/RedPackageManager;Ljava/lang/String;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V

    invoke-direct {v4, v2, v3, p1, v5}, Lcom/beizi/ad/alipay/RedPackageRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;Lcom/beizi/ad/alipay/inter/Callback;)V

    invoke-interface {v0, v4}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method public rtaUser(Lcom/beizi/ad/alipay/inter/ResultListener;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->n()Lcom/beizi/ad/alipay/model/IncentiveConfig;

    move-result-object v0

    const-string v1, "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FsaXBheS9ydGE="

    .line 2
    invoke-static {v1}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "appId=__APPID__&packageName=__PACKAGENAME__&installTime=__INSTALLTIME__&updateTime=__UPDATETIME__&nowTime=__NOWTIME__&appVersion=__APPVERSION__&appVersionCode=__APPVERSIONCODE__&sdkVersion=__SDKVERSION__&OAID=__OAID__&GAID=__GAID__&sdkUID=__SDKUID__&SDKUIDORIG=__SDKUIDORIG__&idfa=__IDFA__&idfv=__IDFV__&os=__OS__&platform=__PLATFORM__&devType=__DEVTYPE__&brand=__BRAND__&model=__MODEL__&resolution=__RESOLUTION__&screenSize=__SCREENSIZE__&density=__DENSITY__&language=__LANGUAGE__&root=__ROOT__&net=__NET__&isp=__ISP__&battery=__BATTERY__&diskSpace=__DISKSPACE__&useSpace=__USESPACE__&developerMode=__DEVELOPERMODE__&appUserId=__APP_USERID__&appOrderId=__APP_ORDERID__&transAmount=__TRANS_AMOUNT__&incentiveConfigVersion=__INCENTIVECONFIGVERSION__&authCode=__AUTH_CODE__"

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getRtaUrl()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 4
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getRtaUrl()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getMacro()Ljava/lang/String;

    move-result-object v2

    .line 6
    :cond_0
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "rtaUrl : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "macroStr : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v3, Lcom/beizi/ad/alipay/RedPackageRequest;

    const/4 v4, 0x0

    new-instance v5, Lcom/beizi/ad/alipay/RedPackageManager$1;

    invoke-direct {v5, p0, p1}, Lcom/beizi/ad/alipay/RedPackageManager$1;-><init>(Lcom/beizi/ad/alipay/RedPackageManager;Lcom/beizi/ad/alipay/inter/ResultListener;)V

    invoke-direct {v3, v1, v2, v4, v5}, Lcom/beizi/ad/alipay/RedPackageRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;Lcom/beizi/ad/alipay/inter/Callback;)V

    invoke-interface {v0, v3}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method public welfareAliPayWithParams(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/WelfareListener;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/beizi/ad/alipay/inter/WelfareListener;",
            ")V"
        }
    .end annotation

    const-string v0, "trans_amount_key"

    const-string v1, "app_order_id_key"

    const-string v2, "app_user_id_key"

    const-string v3, ""

    if-eqz p1, :cond_0

    .line 1
    :try_start_0
    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 2
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :catch_0
    move-exception p1

    goto/16 :goto_2

    :cond_0
    move-object v2, v3

    :goto_0
    if-eqz p1, :cond_1

    .line 3
    invoke-interface {p1, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 4
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz p1, :cond_2

    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 6
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/lang/String;

    .line 7
    :cond_2
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/ad/internal/g;->n()Lcom/beizi/ad/alipay/model/IncentiveConfig;

    move-result-object p1

    const-string v0, "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FsaXBheS90cmFuc2Zlci9tb25leQ=="

    .line 8
    invoke-static {v0}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v4, "appId=__APPID__&packageName=__PACKAGENAME__&installTime=__INSTALLTIME__&updateTime=__UPDATETIME__&nowTime=__NOWTIME__&appVersion=__APPVERSION__&appVersionCode=__APPVERSIONCODE__&sdkVersion=__SDKVERSION__&OAID=__OAID__&GAID=__GAID__&sdkUID=__SDKUID__&SDKUIDORIG=__SDKUIDORIG__&idfa=__IDFA__&idfv=__IDFV__&os=__OS__&platform=__PLATFORM__&devType=__DEVTYPE__&brand=__BRAND__&model=__MODEL__&resolution=__RESOLUTION__&screenSize=__SCREENSIZE__&density=__DENSITY__&language=__LANGUAGE__&root=__ROOT__&net=__NET__&isp=__ISP__&battery=__BATTERY__&diskSpace=__DISKSPACE__&useSpace=__USESPACE__&developerMode=__DEVELOPERMODE__&appUserId=__APP_USERID__&appOrderId=__APP_ORDERID__&transAmount=__TRANS_AMOUNT__&incentiveConfigVersion=__INCENTIVECONFIGVERSION__&authCode=__AUTH_CODE__"

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getTransferUrl()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 10
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getTransferUrl()Ljava/lang/String;

    move-result-object v0

    .line 11
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getMacro()Ljava/lang/String;

    move-result-object v4

    .line 12
    :cond_3
    sget-object p1, Lcom/beizi/ad/alipay/RedPackageManager;->TAG:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "transferUrl : "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {p1, v5}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    new-instance p1, Lcom/beizi/ad/alipay/model/AliPayEventBean;

    invoke-direct {p1}, Lcom/beizi/ad/alipay/model/AliPayEventBean;-><init>()V

    .line 14
    invoke-virtual {p1, v2}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setAppUserId(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p1, v1}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setAppOrderId(Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1, v3}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setTransAmount(Ljava/lang/String;)V

    .line 17
    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object v1

    invoke-virtual {v1}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    new-instance v2, Lcom/beizi/ad/alipay/RedPackageRequest;

    new-instance v3, Lcom/beizi/ad/alipay/RedPackageManager$4;

    invoke-direct {v3, p0, p2}, Lcom/beizi/ad/alipay/RedPackageManager$4;-><init>(Lcom/beizi/ad/alipay/RedPackageManager;Lcom/beizi/ad/alipay/inter/WelfareListener;)V

    invoke-direct {v2, v0, v4, p1, v3}, Lcom/beizi/ad/alipay/RedPackageRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;Lcom/beizi/ad/alipay/inter/Callback;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 18
    :goto_2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_3
    return-void
.end method
