.class Lcom/beizi/ad/alipay/RedPackageManager$3$1;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/alipay/sdk/app/OpenAuthTask$Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/RedPackageManager$3;->successCallback(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/beizi/ad/alipay/RedPackageManager$3;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/RedPackageManager$3;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$3$1;->this$1:Lcom/beizi/ad/alipay/RedPackageManager$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "i : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " , s : "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " , bundle : "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p3, :cond_2

    const-string p1, "auth_code"

    .line 2
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 3
    iget-object p2, p0, Lcom/beizi/ad/alipay/RedPackageManager$3$1;->this$1:Lcom/beizi/ad/alipay/RedPackageManager$3;

    iget-object p2, p2, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$map:Ljava/util/Map;

    if-eqz p2, :cond_0

    const-string v0, "app_user_id_key"

    invoke-interface {p2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 4
    iget-object p2, p0, Lcom/beizi/ad/alipay/RedPackageManager$3$1;->this$1:Lcom/beizi/ad/alipay/RedPackageManager$3;

    iget-object p2, p2, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$map:Ljava/util/Map;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string p2, ""

    .line 5
    :goto_0
    invoke-static {}, Lcom/beizi/ad/internal/g;->a()Lcom/beizi/ad/internal/g;

    move-result-object v0

    invoke-virtual {v0}, Lcom/beizi/ad/internal/g;->n()Lcom/beizi/ad/alipay/model/IncentiveConfig;

    move-result-object v0

    const-string v1, "aHR0cDovL3Nkay1hcGkuYWRuLXBsdXMuY29tLmNuL2FsaXBheS9hdXRoY29kZQ=="

    .line 6
    invoke-static {v1}, Lcom/beizi/ad/lance/a/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_1

    .line 7
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getAuthUrl()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 8
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getAuthUrl()Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/model/IncentiveConfig;->getMacro()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    const-string v0, "appId=__APPID__&packageName=__PACKAGENAME__&installTime=__INSTALLTIME__&updateTime=__UPDATETIME__&nowTime=__NOWTIME__&appVersion=__APPVERSION__&appVersionCode=__APPVERSIONCODE__&sdkVersion=__SDKVERSION__&OAID=__OAID__&GAID=__GAID__&sdkUID=__SDKUID__&SDKUIDORIG=__SDKUIDORIG__&idfa=__IDFA__&idfv=__IDFV__&os=__OS__&platform=__PLATFORM__&devType=__DEVTYPE__&brand=__BRAND__&model=__MODEL__&resolution=__RESOLUTION__&screenSize=__SCREENSIZE__&density=__DENSITY__&language=__LANGUAGE__&root=__ROOT__&net=__NET__&isp=__ISP__&battery=__BATTERY__&diskSpace=__DISKSPACE__&useSpace=__USESPACE__&developerMode=__DEVELOPERMODE__&appUserId=__APP_USERID__&appOrderId=__APP_ORDERID__&transAmount=__TRANS_AMOUNT__&incentiveConfigVersion=__INCENTIVECONFIGVERSION__&authCode=__AUTH_CODE__"

    .line 10
    :goto_1
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "authUrl : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    invoke-virtual {p3, p1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 12
    new-instance p3, Lcom/beizi/ad/alipay/model/AliPayEventBean;

    invoke-direct {p3}, Lcom/beizi/ad/alipay/model/AliPayEventBean;-><init>()V

    .line 13
    invoke-virtual {p3, p2}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setAppUserId(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p3, p1}, Lcom/beizi/ad/alipay/model/AliPayEventBean;->setAuthCode(Ljava/lang/String;)V

    .line 15
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "aliPayEventBean : "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    invoke-static {}, Lcom/beizi/ad/lance/a/c;->b()Lcom/beizi/ad/lance/a/c;

    move-result-object p1

    invoke-virtual {p1}, Lcom/beizi/ad/lance/a/c;->d()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    new-instance p2, Lcom/beizi/ad/alipay/RedPackageRequest;

    new-instance v2, Lcom/beizi/ad/alipay/RedPackageManager$3$1$1;

    invoke-direct {v2, p0}, Lcom/beizi/ad/alipay/RedPackageManager$3$1$1;-><init>(Lcom/beizi/ad/alipay/RedPackageManager$3$1;)V

    invoke-direct {p2, v1, v0, p3, v2}, Lcom/beizi/ad/alipay/RedPackageRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;Lcom/beizi/ad/alipay/inter/Callback;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    .line 17
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$3$1;->this$1:Lcom/beizi/ad/alipay/RedPackageManager$3;

    iget-object p1, p1, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz p1, :cond_3

    .line 18
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string p2, "authCode"

    const-string p3, "9001"

    .line 19
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    iget-object p2, p0, Lcom/beizi/ad/alipay/RedPackageManager$3$1;->this$1:Lcom/beizi/ad/alipay/RedPackageManager$3;

    iget-object p2, p2, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    invoke-interface {p2, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    :cond_3
    :goto_2
    return-void
.end method
