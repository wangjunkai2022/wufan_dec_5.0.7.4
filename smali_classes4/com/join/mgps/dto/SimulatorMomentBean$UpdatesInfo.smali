.class public Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;
.super Ljava/lang/Object;
.source "SimulatorMomentBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/SimulatorMomentBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "UpdatesInfo"
.end annotation


# instance fields
.field private achievements:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;",
            ">;"
        }
    .end annotation
.end field

.field private avatar:Ljava/lang/String;

.field private dateStr:Ljava/lang/String;

.field private describe:Ljava/lang/String;

.field private feDate:Ljava/lang/String;

.field private isExpand:Z

.field private nickname:Ljava/lang/String;

.field private praiseCount:I

.field private praiseId:Ljava/lang/String;

.field private praised:Z

.field private supportPraise:Z

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAchievements()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->achievements:Ljava/util/List;

    return-object v0
.end method

.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public getDateStr()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->dateStr:Ljava/lang/String;

    return-object v0
.end method

.method public getDescribe()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->describe:Ljava/lang/String;

    return-object v0
.end method

.method public getFeDate()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->feDate:Ljava/lang/String;

    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public getPraiseCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->praiseCount:I

    return v0
.end method

.method public getPraiseId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->praiseId:Ljava/lang/String;

    return-object v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public isExpand()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isExpand:Z

    return v0
.end method

.method public isPraised()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->praised:Z

    return v0
.end method

.method public isSupportPraise()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->supportPraise:Z

    return v0
.end method

.method public setAchievements(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/SimulatorMomentBean$Achievement;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->achievements:Ljava/util/List;

    return-void
.end method

.method public setAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->avatar:Ljava/lang/String;

    return-void
.end method

.method public setDateStr(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->dateStr:Ljava/lang/String;

    return-void
.end method

.method public setDescribe(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->describe:Ljava/lang/String;

    return-void
.end method

.method public setExpand(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->isExpand:Z

    return-void
.end method

.method public setFeDate(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->feDate:Ljava/lang/String;

    return-void
.end method

.method public setNickname(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->nickname:Ljava/lang/String;

    return-void
.end method

.method public setPraiseCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->praiseCount:I

    return-void
.end method

.method public setPraiseId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->praiseId:Ljava/lang/String;

    return-void
.end method

.method public setPraised(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->praised:Z

    return-void
.end method

.method public setSupportPraise(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->supportPraise:Z

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/SimulatorMomentBean$UpdatesInfo;->uid:Ljava/lang/String;

    return-void
.end method
