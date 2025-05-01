.class public Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;
.super Ljava/lang/Object;
.source "AccountOnekeyLoginRequestBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Params"
.end annotation


# instance fields
.field private accessToken:Ljava/lang/String;

.field private token:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;->token:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;->accessToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getAccessToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;->accessToken:Ljava/lang/String;

    return-object v0
.end method

.method public getToken()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;->token:Ljava/lang/String;

    return-object v0
.end method

.method public setAccessToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;->accessToken:Ljava/lang/String;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/AccountOnekeyLoginRequestBean$Params;->token:Ljava/lang/String;

    return-void
.end method
