.class public Lcom/join/mgps/dto/EndGameNameBean;
.super Ljava/lang/Object;
.source "EndGameNameBean.java"


# instance fields
.field private gameList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;"
        }
    .end annotation
.end field

.field private post:I

.field private room:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getGameList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/EndGameNameBean;->gameList:Ljava/util/List;

    return-object v0
.end method

.method public getPost()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/EndGameNameBean;->post:I

    return v0
.end method

.method public getRoom()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/EndGameNameBean;->room:I

    return v0
.end method

.method public setGameList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameNameListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/EndGameNameBean;->gameList:Ljava/util/List;

    return-void
.end method

.method public setPost(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/EndGameNameBean;->post:I

    return-void
.end method

.method public setRoom(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/EndGameNameBean;->room:I

    return-void
.end method
