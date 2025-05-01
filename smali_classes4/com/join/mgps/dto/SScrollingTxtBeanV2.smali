.class public Lcom/join/mgps/dto/SScrollingTxtBeanV2;
.super Ljava/lang/Object;
.source "SScrollingTxtBeanV2.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private hasExposure:Z

.field private jumpModelDto:Lcom/join/mgps/dto/CommonGameInfoBean;

.field private word:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getJumpModelDto()Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->jumpModelDto:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object v0
.end method

.method public getWord()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->word:Ljava/lang/String;

    return-object v0
.end method

.method public isHasExposure()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->hasExposure:Z

    return v0
.end method

.method public setHasExposure(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->hasExposure:Z

    return-void
.end method

.method public setJumpModelDto(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->jumpModelDto:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public setWord(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SScrollingTxtBeanV2;->word:Ljava/lang/String;

    return-void
.end method
