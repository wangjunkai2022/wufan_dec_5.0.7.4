.class public Lcom/join/mgps/dto/GameBespeakBean;
.super Ljava/lang/Object;
.source "GameBespeakBean.java"


# instance fields
.field private bespeak:Z

.field private hint:Ljava/lang/String;

.field private pdInfo:Lcom/join/mgps/dto/DomainInfoBean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHint()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameBespeakBean;->hint:Ljava/lang/String;

    return-object v0
.end method

.method public getPdInfo()Lcom/join/mgps/dto/DomainInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/GameBespeakBean;->pdInfo:Lcom/join/mgps/dto/DomainInfoBean;

    return-object v0
.end method

.method public isBespeak()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/GameBespeakBean;->bespeak:Z

    return v0
.end method

.method public setBespeak(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/GameBespeakBean;->bespeak:Z

    return-void
.end method

.method public setHint(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameBespeakBean;->hint:Ljava/lang/String;

    return-void
.end method

.method public setPdInfo(Lcom/join/mgps/dto/DomainInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/GameBespeakBean;->pdInfo:Lcom/join/mgps/dto/DomainInfoBean;

    return-void
.end method
