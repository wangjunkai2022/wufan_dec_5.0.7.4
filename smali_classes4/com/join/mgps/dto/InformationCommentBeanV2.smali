.class public Lcom/join/mgps/dto/InformationCommentBeanV2;
.super Ljava/lang/Object;
.source "InformationCommentBeanV2.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private avatar:Ljava/lang/String;

.field private commentId:Ljava/lang/String;

.field private createTime:Ljava/lang/String;

.field private id:Ljava/lang/String;

.field private like:I

.field private msg:Ljava/lang/String;

.field private nickname:Ljava/lang/String;

.field private pid:Ljava/lang/String;

.field private postCid:Ljava/lang/String;

.field private praise:Ljava/lang/Boolean;

.field private ravatar:Ljava/lang/String;

.field private replies:I

.field private reply:I

.field private replyList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;"
        }
    .end annotation
.end field

.field private rnickname:Ljava/lang/String;

.field private ruid:Ljava/lang/String;

.field private status:I

.field private uid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getAvatar()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->avatar:Ljava/lang/String;

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCommentId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->commentId:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getCreateTime()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->createTime:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->id:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getLike()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->like:I

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getMsg()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->msg:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getNickname()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->nickname:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->pid:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPostCid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->postCid:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getPraise()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->praise:Ljava/lang/Boolean;

    .line 13
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getRavatar()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->ravatar:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplies()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replies:I

    .line 15
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReply()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->reply:I

    .line 16
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getRnickname()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->rnickname:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getRuid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->ruid:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getStatus()I

    move-result v0

    iput v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->status:I

    .line 19
    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getUid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->uid:Ljava/lang/String;

    .line 20
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replyList:Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replyList:Ljava/util/List;

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replyList:Ljava/util/List;

    invoke-virtual {p1}, Lcom/join/mgps/dto/InformationCommentBeanV2;->getReplyList()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public getCommentId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->commentId:Ljava/lang/String;

    return-object v0
.end method

.method public getCreateTime()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->createTime:Ljava/lang/String;

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->id:Ljava/lang/String;

    return-object v0
.end method

.method public getLike()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->like:I

    return v0
.end method

.method public getMsg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->nickname:Ljava/lang/String;

    return-object v0
.end method

.method public getPid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->pid:Ljava/lang/String;

    return-object v0
.end method

.method public getPostCid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->postCid:Ljava/lang/String;

    return-object v0
.end method

.method public getPraise()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->praise:Ljava/lang/Boolean;

    return-object v0
.end method

.method public getRavatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->ravatar:Ljava/lang/String;

    return-object v0
.end method

.method public getReplies()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replies:I

    return v0
.end method

.method public getReply()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->reply:I

    return v0
.end method

.method public getReplyList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replyList:Ljava/util/List;

    return-object v0
.end method

.method public getRnickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->rnickname:Ljava/lang/String;

    return-object v0
.end method

.method public getRuid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->ruid:Ljava/lang/String;

    return-object v0
.end method

.method public getStatus()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->status:I

    return v0
.end method

.method public getUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->uid:Ljava/lang/String;

    return-object v0
.end method

.method public setAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->avatar:Ljava/lang/String;

    return-void
.end method

.method public setCommentId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->commentId:Ljava/lang/String;

    return-void
.end method

.method public setCreateTime(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->createTime:Ljava/lang/String;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->id:Ljava/lang/String;

    return-void
.end method

.method public setLike(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->like:I

    return-void
.end method

.method public setMsg(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->msg:Ljava/lang/String;

    return-void
.end method

.method public setNickname(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->nickname:Ljava/lang/String;

    return-void
.end method

.method public setPid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->pid:Ljava/lang/String;

    return-void
.end method

.method public setPostCid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->postCid:Ljava/lang/String;

    return-void
.end method

.method public setPraise(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->praise:Ljava/lang/Boolean;

    return-void
.end method

.method public setRavatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->ravatar:Ljava/lang/String;

    return-void
.end method

.method public setReplies(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replies:I

    return-void
.end method

.method public setReply(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->reply:I

    return-void
.end method

.method public setReplyList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/InformationCommentBeanV2;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->replyList:Ljava/util/List;

    return-void
.end method

.method public setRnickname(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->rnickname:Ljava/lang/String;

    return-void
.end method

.method public setRuid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->ruid:Ljava/lang/String;

    return-void
.end method

.method public setStatus(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->status:I

    return-void
.end method

.method public setUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/InformationCommentBeanV2;->uid:Ljava/lang/String;

    return-void
.end method
