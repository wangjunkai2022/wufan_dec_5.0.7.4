.class Lcom/beizi/ad/alipay/RedPackageManager$3;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/RedPackageManager;->authAliPayWithParams(Landroid/app/Activity;Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/alipay/RedPackageManager;

.field final synthetic val$context:Landroid/app/Activity;

.field final synthetic val$finalAppId:Ljava/lang/String;

.field final synthetic val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

.field final synthetic val$map:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/RedPackageManager;Ljava/lang/String;Lcom/beizi/ad/alipay/inter/UserInfoListener;Landroid/app/Activity;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->this$0:Lcom/beizi/ad/alipay/RedPackageManager;

    iput-object p2, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$finalAppId:Ljava/lang/String;

    iput-object p3, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    iput-object p4, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$context:Landroid/app/Activity;

    iput-object p5, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$map:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failCallback(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/beizi/ad/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    .line 3
    :cond_0
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "failCallback1111 errorCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " message : "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public successCallback(Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "successCallback1111 : resultStr \uff1a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "resultCode"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "200"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "userInfo"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$finalAppId:Ljava/lang/String;

    const-string v1, "appId"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_5

    .line 8
    invoke-interface {v0, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    goto/16 :goto_0

    .line 9
    :cond_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "4001"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "authUrl"

    .line 10
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    const-string v1, "com.alipay.sdk.app.OpenAuthTask"

    .line 11
    invoke-static {v1}, Lcom/beizi/ad/lance/a/p;->a(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 12
    iget-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz p1, :cond_1

    .line 13
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_ALIPAY_SDK_NOT_EXIST:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v0}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v1

    .line 14
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v0

    .line 15
    invoke-interface {p1, v1, v0}, Lcom/beizi/ad/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    :cond_1
    return-void

    .line 16
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    const-string v0, "url"

    .line 18
    invoke-interface {v3, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    new-instance v0, Lcom/alipay/sdk/app/OpenAuthTask;

    iget-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$context:Landroid/app/Activity;

    invoke-direct {v0, p1}, Lcom/alipay/sdk/app/OpenAuthTask;-><init>(Landroid/app/Activity;)V

    .line 20
    sget-object v2, Lcom/alipay/sdk/app/OpenAuthTask$BizType;->AccountAuth:Lcom/alipay/sdk/app/OpenAuthTask$BizType;

    new-instance v4, Lcom/beizi/ad/alipay/RedPackageManager$3$1;

    invoke-direct {v4, p0}, Lcom/beizi/ad/alipay/RedPackageManager$3$1;-><init>(Lcom/beizi/ad/alipay/RedPackageManager$3;)V

    const/4 v5, 0x1

    const-string v1, ""

    invoke-virtual/range {v0 .. v5}, Lcom/alipay/sdk/app/OpenAuthTask;->execute(Ljava/lang/String;Lcom/alipay/sdk/app/OpenAuthTask$BizType;Ljava/util/Map;Lcom/alipay/sdk/app/OpenAuthTask$Callback;Z)V

    goto :goto_0

    .line 21
    :cond_3
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_5

    .line 22
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->jsonToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    .line 23
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    invoke-interface {v0, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    goto :goto_0

    .line 24
    :cond_4
    iget-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$3;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz p1, :cond_5

    .line 25
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_AUTH_INFO_FAIL:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v0}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v1

    invoke-virtual {v0}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Lcom/beizi/ad/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    :cond_5
    :goto_0
    return-void
.end method
