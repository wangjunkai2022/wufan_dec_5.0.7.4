.class Lcom/beizi/ad/alipay/RedPackageManager$4;
.super Ljava/lang/Object;
.source "RedPackageManager.java"

# interfaces
.implements Lcom/beizi/ad/alipay/inter/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/ad/alipay/RedPackageManager;->welfareAliPayWithParams(Ljava/util/Map;Lcom/beizi/ad/alipay/inter/WelfareListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/beizi/ad/alipay/RedPackageManager;

.field final synthetic val$listener:Lcom/beizi/ad/alipay/inter/WelfareListener;


# direct methods
.method constructor <init>(Lcom/beizi/ad/alipay/RedPackageManager;Lcom/beizi/ad/alipay/inter/WelfareListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/RedPackageManager$4;->this$0:Lcom/beizi/ad/alipay/RedPackageManager;

    iput-object p2, p0, Lcom/beizi/ad/alipay/RedPackageManager$4;->val$listener:Lcom/beizi/ad/alipay/inter/WelfareListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public failCallback(ILjava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$4;->val$listener:Lcom/beizi/ad/alipay/inter/WelfareListener;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0, p1, p2}, Lcom/beizi/ad/alipay/inter/BaseListener;->failCallback(ILjava/lang/String;)V

    .line 3
    :cond_0
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " failCallback3333 errorCode : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " , message : "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public successCallback(Lorg/json/JSONObject;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/beizi/ad/alipay/RedPackageManager;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "successCallback3333 resultStr \uff1a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "resultCode"

    .line 2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p1}, Lcom/beizi/ad/alipay/RedPackageUtil;->jsonToMap(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p1

    .line 4
    iget-object v0, p0, Lcom/beizi/ad/alipay/RedPackageManager$4;->val$listener:Lcom/beizi/ad/alipay/inter/WelfareListener;

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 5
    invoke-interface {v0, p1}, Lcom/beizi/ad/alipay/inter/BaseListener;->successCallBack(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
