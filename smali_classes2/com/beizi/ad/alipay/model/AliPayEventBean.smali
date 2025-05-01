.class public Lcom/beizi/ad/alipay/model/AliPayEventBean;
.super Ljava/lang/Object;
.source "AliPayEventBean.java"


# instance fields
.field private appOrderId:Ljava/lang/String;

.field private appUserId:Ljava/lang/String;

.field private authCode:Ljava/lang/String;

.field private incentiveConfigVersion:Ljava/lang/String;

.field private transAmount:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appUserId:Ljava/lang/String;

    .line 3
    iput-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appOrderId:Ljava/lang/String;

    .line 4
    iput-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->transAmount:Ljava/lang/String;

    .line 5
    iput-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->incentiveConfigVersion:Ljava/lang/String;

    .line 6
    iput-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->authCode:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAppOrderId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appOrderId:Ljava/lang/String;

    return-object v0
.end method

.method public getAppUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appUserId:Ljava/lang/String;

    return-object v0
.end method

.method public getAuthCode()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->authCode:Ljava/lang/String;

    return-object v0
.end method

.method public getIncentiveConfigVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->incentiveConfigVersion:Ljava/lang/String;

    return-object v0
.end method

.method public getTransAmount()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->transAmount:Ljava/lang/String;

    return-object v0
.end method

.method public setAppOrderId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appOrderId:Ljava/lang/String;

    return-void
.end method

.method public setAppUserId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appUserId:Ljava/lang/String;

    return-void
.end method

.method public setAuthCode(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->authCode:Ljava/lang/String;

    return-void
.end method

.method public setIncentiveConfigVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->incentiveConfigVersion:Ljava/lang/String;

    return-void
.end method

.method public setTransAmount(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->transAmount:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{\"appUserId\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appUserId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", \"appOrderId\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->appOrderId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", \"transAmount\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->transAmount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", \"incentiveConfigVersion\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->incentiveConfigVersion:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\", \"authCode\":\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/beizi/ad/alipay/model/AliPayEventBean;->authCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
