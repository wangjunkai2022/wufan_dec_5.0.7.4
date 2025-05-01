.class public Lcom/beizi/ad/alipay/RedPackageRequest;
.super Ljava/lang/Object;
.source "RedPackageRequest.java"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final TAG:Ljava/lang/String; = "RedPackageRequest"


# instance fields
.field private aliPayEventBean:Lcom/beizi/ad/alipay/model/AliPayEventBean;

.field private callback:Lcom/beizi/ad/alipay/inter/Callback;

.field private macroStr:Ljava/lang/String;

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;Lcom/beizi/ad/alipay/inter/Callback;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->url:Ljava/lang/String;

    .line 3
    iput-object p3, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->aliPayEventBean:Lcom/beizi/ad/alipay/model/AliPayEventBean;

    .line 4
    iput-object p4, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    .line 5
    iput-object p2, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->macroStr:Ljava/lang/String;

    return-void
.end method

.method private doRequest()V
    .locals 6

    const-string v0, "e : "

    const-string v1, "data"

    const-string v2, "RedPackageRequest"

    .line 1
    :try_start_0
    iget-object v3, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->url:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 2
    iget-object v3, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->macroStr:Ljava/lang/String;

    iget-object v4, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->aliPayEventBean:Lcom/beizi/ad/alipay/model/AliPayEventBean;

    invoke-static {v3, v4}, Lcom/beizi/ad/internal/utilities/StringUtil;->replaceALiPay(Ljava/lang/String;Lcom/beizi/ad/alipay/model/AliPayEventBean;)Ljava/lang/String;

    move-result-object v3

    .line 3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "url : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->url:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " , replaceG : "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {v3}, Lcom/beizi/ad/internal/utilities/GzipUtil;->compressForGzip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-static {}, Lcom/beizi/ad/lance/a/k;->a()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/beizi/ad/lance/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 6
    iget-object v4, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->url:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    invoke-static {v4, v3}, Lcom/beizi/ad/internal/utilities/HttpUtil;->doPost(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v3

    .line 7
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v4, :cond_2

    .line 8
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "code"

    .line 9
    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v3

    const/16 v5, 0xc8

    if-ne v3, v5, :cond_0

    .line 10
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 11
    invoke-virtual {v4, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    invoke-static {}, Lcom/beizi/ad/lance/a/k;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lcom/beizi/ad/lance/a/a;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 13
    invoke-static {v1}, Lcom/beizi/ad/internal/utilities/GzipUtil;->decompressForGzip(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 14
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "decrypt : "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/beizi/ad/lance/a/l;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 15
    iget-object v3, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    if-eqz v3, :cond_4

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 16
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 17
    iget-object v1, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    invoke-interface {v1, v3}, Lcom/beizi/ad/alipay/inter/Callback;->successCallback(Lorg/json/JSONObject;)V

    goto :goto_0

    .line 18
    :cond_0
    iget-object v1, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    if-eqz v1, :cond_4

    .line 19
    sget-object v3, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_PARSE_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v3}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v4

    invoke-virtual {v3}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Lcom/beizi/ad/alipay/inter/Callback;->failCallback(ILjava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v1

    .line 20
    :try_start_2
    iget-object v3, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    if-eqz v3, :cond_1

    .line 21
    sget-object v4, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_PARSE_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v4}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v5

    invoke-virtual {v4}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v4}, Lcom/beizi/ad/alipay/inter/Callback;->failCallback(ILjava/lang/String;)V

    .line 22
    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 23
    :cond_2
    iget-object v1, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    if-eqz v1, :cond_4

    .line 24
    sget-object v3, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_REQUEST_PARAM_ERROR:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v3}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v4

    invoke-virtual {v3}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Lcom/beizi/ad/alipay/inter/Callback;->failCallback(ILjava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    move-exception v1

    .line 25
    iget-object v3, p0, Lcom/beizi/ad/alipay/RedPackageRequest;->callback:Lcom/beizi/ad/alipay/inter/Callback;

    if-eqz v3, :cond_3

    .line 26
    sget-object v4, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->ERROR_REQUEST_EXCEPTION:Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;

    invoke-virtual {v4}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getCode()I

    move-result v5

    invoke-virtual {v4}, Lcom/beizi/ad/alipay/RedPackageEnum$RedPackageError;->getMsg()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v5, v4}, Lcom/beizi/ad/alipay/inter/Callback;->failCallback(ILjava/lang/String;)V

    .line 27
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/beizi/ad/lance/a/l;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/beizi/ad/alipay/RedPackageRequest;->doRequest()V

    return-void
.end method
