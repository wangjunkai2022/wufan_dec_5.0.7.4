.class Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;
.super Ljava/lang/Object;
.source "JavaScriptInterface.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/js/JavaScriptInterface;->sendResultMessage(Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

.field final synthetic val$jsonObjStr:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/js/JavaScriptInterface;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    iput-object p2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;->val$jsonObjStr:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;->this$0:Lcom/beizi/ad/alipay/js/JavaScriptInterface;

    invoke-static {v0}, Lcom/beizi/ad/alipay/js/JavaScriptInterface;->access$300(Lcom/beizi/ad/alipay/js/JavaScriptInterface;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "javascript:handleMessageFromNative("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/beizi/ad/alipay/js/JavaScriptInterface$5;->val$jsonObjStr:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
