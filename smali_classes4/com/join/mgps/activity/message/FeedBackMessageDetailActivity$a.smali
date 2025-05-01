.class Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "FeedBackMessageDetailActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;->a:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;

    const p1, 0x7f0c03dd

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V
    .locals 5
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->getUsername()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f091586

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->getCreateTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v1, v2}, Lcom/join/mgps/Util/y;->x(J)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09156e

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->getReplyContent()Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f09150d

    invoke-virtual {v0, v2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09012d

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->getAvatar()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V

    return-void
.end method
