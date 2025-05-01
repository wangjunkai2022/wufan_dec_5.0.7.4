.class public Lcom/beizi/ad/alipay/js/JavaScriptInterface;
.super Ljava/lang/Object;
.source "JavaScriptInterface.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "JavaScriptInterface"


# instance fields
.field private webView:Landroid/webkit/WebView;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->webView:Landroid/webkit/WebView;

    return-void
.end method

.method static synthetic access$100(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->convertJsonObject(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->sendResultMessage(Lorg/json/JSONObject;)V

    return-void
.end method

.method static synthetic access$300(Lcom/beizi/ad/alipay/js/JavaScriptInterface;)Landroid/webkit/WebView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->webView:Landroid/webkit/WebView;

    return-object p0
.end method

.method private authAliPayWithParams(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "welfareAliPayWithParams : bean "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "handlerName"

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getData()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->convertJsonToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 7
    iget-object v2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->webView:Landroid/webkit/WebView;

    invoke-virtual {p0, v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->getActivityFromView(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 8
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v3

    new-instance v4, Lcom/beizi/ad/alipay/js/JavaScriptInterface$3;

    invoke-direct {v4, p0, v0}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$3;-><init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V

    invoke-virtual {v3, v2, p1, v4}, Lcom/beizi/ad/alipay/RedPackageManager;->authAliPayWithParams(Landroid/app/Activity;Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "authAliPayWithParams : exception "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method private authInfo(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "authInfo : bean "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "handlerName"

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getData()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->convertJsonToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 7
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v2

    new-instance v3, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;

    invoke-direct {v3, p0, v0}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;-><init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V

    invoke-virtual {v2, p1, v3}, Lcom/beizi/ad/alipay/RedPackageManager;->authInfo(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/UserInfoListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "authInfo : exception "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private convertJsonObject(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 1

    :try_start_0
    const-string v0, "code"

    .line 1
    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "msg"

    .line 2
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "data"

    .line 3
    invoke-virtual {p1, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 4
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-object p1
.end method

.method private rtaUser(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rtaUser : bean "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "handlerName"

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 5
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v2

    new-instance v3, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;

    invoke-direct {v3, p0, p1, v0}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;-><init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    invoke-virtual {v2, v3}, Lcom/beizi/ad/alipay/RedPackageManager;->rtaUser(Lcom/beizi/ad/alipay/inter/ResultListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rtaUser : exception "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private sendResultMessage(Lorg/json/JSONObject;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->webView:Landroid/webkit/WebView;

    new-instance v1, Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;

    invoke-direct {v1, p0, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;-><init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private welfareAliPayWithParams(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "welfareAliPayWithParams : bean "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "handlerName"

    .line 3
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 4
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getData()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-void

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getData()Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->convertJsonToMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 7
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->getInstance()Lcom/beizi/ad/alipay/RedPackageManager;

    move-result-object v2

    new-instance v3, Lcom/beizi/ad/alipay/js/JavaScriptInterface$4;

    invoke-direct {v3, p0, v0}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$4;-><init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V

    invoke-virtual {v2, p1, v3}, Lcom/beizi/ad/alipay/RedPackageManager;->welfareAliPayWithParams(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/WelfareListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "welfareAliPayWithParams : exception "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method public callNativeHandler(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "data"

    const-string v1, "handlerName"

    .line 1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "jsCode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "JavaScriptInterface"

    invoke-static {v3, v2}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    new-instance v2, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;-><init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;)V

    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 4
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 5
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 6
    invoke-virtual {v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->setHandlerName(Ljava/lang/String;)V

    .line 7
    :cond_0
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 8
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->setData(Ljava/lang/String;)V

    :cond_1
    const-string p1, "rtaUser"

    .line 9
    invoke-virtual {v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 10
    invoke-direct {p0, v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->rtaUser(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V

    goto :goto_0

    :cond_2
    const-string p1, "authInfo"

    .line 11
    invoke-virtual {v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 12
    invoke-direct {p0, v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->authInfo(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V

    goto :goto_0

    :cond_3
    const-string p1, "authAliPayWithParams"

    .line 13
    invoke-virtual {v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 14
    invoke-direct {p0, v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->authAliPayWithParams(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V

    goto :goto_0

    :cond_4
    const-string p1, "welfareAliPayWithParams"

    .line 15
    invoke-virtual {v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;->getHandlerName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 16
    invoke-direct {p0, v2}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->welfareAliPayWithParams(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 17
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_5
    :goto_0
    return-void
.end method

.method public getActivityFromView(Landroid/view/View;)Landroid/app/Activity;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    .line 2
    :goto_0
    instance-of v0, p1, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    .line 3
    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_0

    .line 4
    check-cast p1, Landroid/app/Activity;

    return-object p1

    .line 5
    :cond_0
    check-cast p1, Landroid/content/ContextWrapper;

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
