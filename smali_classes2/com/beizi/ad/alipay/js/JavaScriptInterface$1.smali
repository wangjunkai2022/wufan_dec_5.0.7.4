.class Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;
.super Ljava/lang/Object;
.source "JavaScriptInterface.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/ResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/js/JavaScriptInterface;->rtaUser(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

.field final synthetic val$jsonObject:Lorg/json/JSONObject;

.field final synthetic val$jsonObjectData:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iput-object p2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->val$jsonObjectData:Lorg/json/JSONObject;

    iput-object p3, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->val$jsonObject:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFail(ILjava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rtaUser onFail errorCode : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " , msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iget-object v2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->val$jsonObject:Lorg/json/JSONObject;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ""

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v2, v3, p2, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$100(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "rtaUser onFail jsonObjectResult : "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    invoke-static {p2, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$200(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V

    return-void
.end method

.method public onSuccess(Z)V
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rtaUser successCallBack map : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->val$jsonObjectData:Lorg/json/JSONObject;

    const-string v2, "requiredFlow"

    invoke-virtual {v0, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 3
    iget-object p1, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->val$jsonObject:Lorg/json/JSONObject;

    const-string v2, "200"

    const-string v3, "success call"

    iget-object v4, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->val$jsonObjectData:Lorg/json/JSONObject;

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v0, v2, v3, v4}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$100(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "rtaUser successCallBack jsonObjectResult : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$1;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    invoke-static {v0, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$200(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
