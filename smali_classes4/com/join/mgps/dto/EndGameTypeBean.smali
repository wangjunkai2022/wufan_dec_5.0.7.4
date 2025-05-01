.class public Lcom/join/mgps/dto/EndGameTypeBean;
.super Ljava/lang/Object;
.source "EndGameTypeBean.java"


# instance fields
.field private isSelected:Z

.field private modelType:I

.field private typeName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getModelType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/EndGameTypeBean;->modelType:I

    return v0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameTypeBean;->typeName:Ljava/lang/String;

    return-object v0
.end method

.method public isSelected()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/EndGameTypeBean;->isSelected:Z

    return v0
.end method

.method public setModelType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/EndGameTypeBean;->modelType:I

    return-void
.end method

.method public setSelected(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/EndGameTypeBean;->isSelected:Z

    return-void
.end method

.method public setTypeName(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameTypeBean;->typeName:Ljava/lang/String;

    return-void
.end method
