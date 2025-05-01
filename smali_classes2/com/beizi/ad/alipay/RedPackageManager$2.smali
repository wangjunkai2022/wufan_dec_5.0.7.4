.class Lcom/beizi/ad/alipay/RedPackageManager$2;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/RedPackageManager;->authInfo(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/alipay/RedPackageManager;

.field final synthetic val$finalAppId:Ljava/lang/String;

.field final synthetic val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/RedPackageManager;Ljava/lang/String;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->this$0:Lcom/beizi/ad/alipay/RedPackageManager;

    iput-object p2, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$finalAppId:Ljava/lang/String;

    iput-object p3, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failCallback(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

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
    .locals 4

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

    if-eqz v1, :cond_2

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "200"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v3, "authCode"

    if-eqz v1, :cond_0

    const-string v0, "userInfo"

    .line 4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->stringToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 6
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$finalAppId:Ljava/lang/String;

    const-string v1, "appId"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    invoke-interface {p1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_3

    .line 9
    invoke-interface {v0, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "4001"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 12
    invoke-interface {p1, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_3

    .line 14
    invoke-interface {v0, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    goto :goto_0

    .line 15
    :cond_1
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz v0, :cond_3

    .line 16
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->jsonToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    invoke-interface {v0, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    goto :goto_0

    .line 18
    :cond_2
    iget-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$2;->val$listener:Lcom/beizi/ad/alipay/inter/UserInfoListener;

    if-eqz p1, :cond_3

    .line 19
    sget-object v0, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_GET_USER_INFO_FAIL:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v0}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v1

    .line 20
    invoke-virtual {v0}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-interface {p1, v1, v0}, Lcom/beizi/ad/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method
