.class public Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;
.super Ljava/lang/Object;
.source "MessageDetailFeedBackBean.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/dto/MessageDetailFeedBackBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FeedbackReplies"
.end annotation


# instance fields
.field private avatar:Ljava/lang/String;

.field private createTime:J

.field private replyContent:Ljava/lang/String;

.field private replyUid:Ljava/lang/String;

.field private username:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAvatar()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->avatar:Ljava/lang/String;

    return-object v0
.end method

.method public getCreateTime()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->createTime:J

    return-wide v0
.end method

.method public getReplyContent()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->replyContent:Ljava/lang/String;

    return-object v0
.end method

.method public getReplyUid()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->replyUid:Ljava/lang/String;

    return-object v0
.end method

.method public getUsername()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->username:Ljava/lang/String;

    return-object v0
.end method

.method public setAvatar(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->avatar:Ljava/lang/String;

    return-void
.end method

.method public setCreateTime(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->createTime:J

    return-void
.end method

.method public setReplyContent(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->replyContent:Ljava/lang/String;

    return-void
.end method

.method public setReplyUid(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->replyUid:Ljava/lang/String;

    return-void
.end method

.method public setUsername(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->username:Ljava/lang/String;

    return-void
.end method
