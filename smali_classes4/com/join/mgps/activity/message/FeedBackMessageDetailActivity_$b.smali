.class Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;
.super Ljava/lang/Object;
.source "FeedBackMessageDetailActivity_.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->f0(Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;

.field final synthetic c:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;->c:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;

    iput-object p2, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;->b:Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;->c:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;

    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_$b;->b:Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;->r0(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity_;Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V

    return-void
.end method
