.class public Lcom/join/mgps/dto/ExtBean;
.super Ljava/lang/Object;
.source "ExtBean.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private _from_type:I

.field private actType:Ljava/lang/String;

.field private dataFlag:Ljava/lang/String;

.field private down_from:I

.field private from:Ljava/lang/String;

.field private from_id:Ljava/lang/String;

.field private gameFlag:I

.field private isJoin:Ljava/lang/String;

.field private isOnlineGame:Z

.field private isResultPage:Ljava/lang/String;

.field private keepOrginFrom:Z

.field private keyword:Ljava/lang/String;

.field private location:Ljava/lang/String;

.field private nodeId:Ljava/lang/String;

.field private orginFrom:Ljava/lang/String;

.field private position:Ljava/lang/String;

.field private qkPosition:Ljava/lang/String;

.field private reMarks:Ljava/lang/String;

.field private recPosition:Ljava/lang/String;

.field private testAbNumber:Ljava/lang/String;

.field private volcanoOther:Ljava/lang/String;

.field private where:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/join/mgps/dto/ExtBean;->down_from:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/dto/ExtBean;->keepOrginFrom:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/join/mgps/dto/ExtBean;->down_from:I

    .line 6
    iput-boolean v0, p0, Lcom/join/mgps/dto/ExtBean;->keepOrginFrom:Z

    .line 7
    iput p1, p0, Lcom/join/mgps/dto/ExtBean;->_from_type:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput v0, p0, Lcom/join/mgps/dto/ExtBean;->down_from:I

    .line 10
    iput-boolean v0, p0, Lcom/join/mgps/dto/ExtBean;->keepOrginFrom:Z

    .line 11
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->from:Ljava/lang/String;

    .line 12
    iput-object p2, p0, Lcom/join/mgps/dto/ExtBean;->position:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 14
    iput v0, p0, Lcom/join/mgps/dto/ExtBean;->down_from:I

    .line 15
    iput-boolean v0, p0, Lcom/join/mgps/dto/ExtBean;->keepOrginFrom:Z

    .line 16
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->from:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/join/mgps/dto/ExtBean;->from_id:Ljava/lang/String;

    .line 18
    iput-object p3, p0, Lcom/join/mgps/dto/ExtBean;->position:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getActType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->actType:Ljava/lang/String;

    return-object v0
.end method

.method public getDataFlag()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->dataFlag:Ljava/lang/String;

    return-object v0
.end method

.method public getDown_from()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/ExtBean;->down_from:I

    return v0
.end method

.method public getFrom()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->from:Ljava/lang/String;

    return-object v0
.end method

.method public getFrom_id()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->from_id:Ljava/lang/String;

    return-object v0
.end method

.method public getGameFlag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/ExtBean;->gameFlag:I

    return v0
.end method

.method public getIsJoin()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->isJoin:Ljava/lang/String;

    return-object v0
.end method

.method public getIsResultPage()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->isResultPage:Ljava/lang/String;

    return-object v0
.end method

.method public getKeyword()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->keyword:Ljava/lang/String;

    return-object v0
.end method

.method public getLocation()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->location:Ljava/lang/String;

    return-object v0
.end method

.method public getNodeId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->nodeId:Ljava/lang/String;

    return-object v0
.end method

.method public getOrginFrom()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->orginFrom:Ljava/lang/String;

    return-object v0
.end method

.method public getPosition()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->position:Ljava/lang/String;

    return-object v0
.end method

.method public getQkPosition()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->qkPosition:Ljava/lang/String;

    return-object v0
.end method

.method public getReMarks()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->reMarks:Ljava/lang/String;

    return-object v0
.end method

.method public getRecPosition()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->recPosition:Ljava/lang/String;

    return-object v0
.end method

.method public getTestAbNumber()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->testAbNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getVolcanoOther()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->volcanoOther:Ljava/lang/String;

    return-object v0
.end method

.method public getWhere()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/ExtBean;->where:Ljava/lang/String;

    return-object v0
.end method

.method public get_from_type()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/ExtBean;->_from_type:I

    return v0
.end method

.method public isKeepOrginFrom()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ExtBean;->keepOrginFrom:Z

    return v0
.end method

.method public isOnlineGame()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/ExtBean;->isOnlineGame:Z

    return v0
.end method

.method public setActType(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->actType:Ljava/lang/String;

    return-void
.end method

.method public setDataFlag(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->dataFlag:Ljava/lang/String;

    return-object p0
.end method

.method public setDown_from(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/ExtBean;->down_from:I

    return-void
.end method

.method public setFrom(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->from:Ljava/lang/String;

    return-void
.end method

.method public setFrom_id(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->from_id:Ljava/lang/String;

    return-void
.end method

.method public setGameFlag(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/ExtBean;->gameFlag:I

    return-void
.end method

.method public setIsJoin(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->isJoin:Ljava/lang/String;

    return-void
.end method

.method public setIsResultPage(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->isResultPage:Ljava/lang/String;

    return-void
.end method

.method public setKeepOrginFrom(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ExtBean;->keepOrginFrom:Z

    return-void
.end method

.method public setKeyword(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->keyword:Ljava/lang/String;

    return-void
.end method

.method public setLocation(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->location:Ljava/lang/String;

    return-void
.end method

.method public setNodeId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->nodeId:Ljava/lang/String;

    return-void
.end method

.method public setOnlineGame(Z)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/ExtBean;->isOnlineGame:Z

    return-object p0
.end method

.method public setOrginFrom(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->orginFrom:Ljava/lang/String;

    return-void
.end method

.method public setPosition(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->position:Ljava/lang/String;

    return-void
.end method

.method public setQkPosition(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->qkPosition:Ljava/lang/String;

    return-object p0
.end method

.method public setReMarks(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->reMarks:Ljava/lang/String;

    return-object p0
.end method

.method public setRecPosition(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->recPosition:Ljava/lang/String;

    return-object p0
.end method

.method public setTestAbNumber(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->testAbNumber:Ljava/lang/String;

    return-void
.end method

.method public setVolcanoOther(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->volcanoOther:Ljava/lang/String;

    return-object p0
.end method

.method public setWhere(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/ExtBean;->where:Ljava/lang/String;

    return-void
.end method

.method public set_from_type(I)Lcom/join/mgps/dto/ExtBean;
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/ExtBean;->_from_type:I

    return-object p0
.end method
