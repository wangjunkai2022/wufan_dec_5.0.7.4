.class public Lcom/join/mgps/dto/MessageDetailFeedBackBean;
.super Ljava/lang/Object;
.source "MessageDetailFeedBackBean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;,
        Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;
    }
.end annotation


# instance fields
.field private feedbackIssue:Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;

.field private feedbackReplies:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getFeedbackIssue()Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->feedbackIssue:Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;

    return-object v0
.end method

.method public getFeedbackReplies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->feedbackReplies:Ljava/util/List;

    return-object v0
.end method

.method public setFeedbackIssue(Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->feedbackIssue:Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;

    return-void
.end method

.method public setFeedbackReplies(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->feedbackReplies:Ljava/util/List;

    return-void
.end method
