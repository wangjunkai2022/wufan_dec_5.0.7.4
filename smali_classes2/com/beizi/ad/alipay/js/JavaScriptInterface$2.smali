.class Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;
.super Ljava/lang/Object;
.source "JavaScriptInterface.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/UserInfoListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/js/JavaScriptInterface;->authInfo(Lcom/beizi/ad/alipay/js/JavaScriptInterface$JsInnerInterfaceBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

.field final synthetic val$jsonObject:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iput-object p2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->val$jsonObject:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failCallback(ILjava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "authInfo failCallback code : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " ,msg : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iget-object v2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->val$jsonObject:Lorg/json/JSONObject;

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

    const-string v0, "authInfo failCallback jsonObjectResult : "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    iget-object p2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    invoke-static {p2, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$200(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V

    return-void
.end method

.method public successCallBack(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "authInfo successCallBack map : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "JavaScriptInterface"

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->convertMapToJson(Ljava/util/Map;)Ljava/lang/String;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iget-object v2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->val$jsonObject:Lorg/json/JSONObject;

    const-string v3, "200"

    const-string v4, "success call"

    invoke-static {v0, v2, v3, v4, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$100(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p1

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "authInfo successCallBack jsonObjectResult : "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$2;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    invoke-static {v0, p1}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$200(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Lorg/json/JSONObject;)V

    return-void
.end method
