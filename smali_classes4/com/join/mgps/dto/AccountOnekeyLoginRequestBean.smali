.class public Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;
.super Ljava/lang/Object;
.source "AccountOnekeyLoginRequestBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;
    }
.end annotation


# instance fields
.field private deviceId:Ljava/lang/String;

.field private mobile:Ljava/lang/String;

.field private params:Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;

.field private provider:Ljava/lang/String;

.field private version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDeviceId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->deviceId:Ljava/lang/String;

    return-object v0
.end method

.method public getMobile()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->mobile:Ljava/lang/String;

    return-object v0
.end method

.method public getParams()Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->params:Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;

    return-object v0
.end method

.method public getParamsMap()Lorg/springframework/util/LinkedMultiValueMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/springframework/util/LinkedMultiValueMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lorg/springframework/util/LinkedMultiValueMap;

    invoke-direct {v0}, Lorg/springframework/util/LinkedMultiValueMap;-><init>()V

    .line 2
    iget-object v1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->deviceId:Ljava/lang/String;

    const-string v2, "deviceId"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 3
    iget-object v1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->mobile:Ljava/lang/String;

    const-string v2, "mobile"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->provider:Ljava/lang/String;

    const-string v2, "provider"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->version:Ljava/lang/String;

    const-string v2, "version"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->params:Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;

    const-string v2, "params"

    invoke-virtual {v0, v2, v1}, Lorg/springframework/util/LinkedMultiValueMap;->add(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public getProvider()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->provider:Ljava/lang/String;

    return-object v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->version:Ljava/lang/String;

    return-object v0
.end method

.method public setDeviceId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->deviceId:Ljava/lang/String;

    return-void
.end method

.method public setMobile(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->mobile:Ljava/lang/String;

    return-void
.end method

.method public setParams(Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->params:Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;

    return-void
.end method

.method public setProvider(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->provider:Ljava/lang/String;

    return-void
.end method

.method public setVersion(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;->version:Ljava/lang/String;

    return-void
.end method
