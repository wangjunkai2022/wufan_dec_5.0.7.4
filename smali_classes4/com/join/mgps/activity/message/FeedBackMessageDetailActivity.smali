.class public Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;
.super Lcom/BaseFragmentActivity;
.source "FeedBackMessageDetailActivity.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EActivity;
    value = 0x7f0c0071
.end annotation


# instance fields
.field b:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field f:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/EditText;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field k:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field l:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field m:Ljava/lang/String;
    .annotation build Lorg/androidannotations/annotations/Extra;
    .end annotation
.end field

.field private n:Lcom/join/mgps/rpc/k;

.field private o:Z

.field private p:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/BaseFragmentActivity;-><init>()V

    return-void
.end method

.method private h0(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string p1, ""

    goto :goto_0

    :pswitch_0
    const-string p1, "\u5176\u4ed6\u95ee\u9898"

    goto :goto_0

    :pswitch_1
    const-string p1, "\u66b4\u529b\u6d89\u653f"

    goto :goto_0

    :pswitch_2
    const-string p1, "\u4fb5\u6743\u6284\u88ad"

    goto :goto_0

    :pswitch_3
    const-string p1, "\u6076\u610f\u6263\u8d39"

    goto :goto_0

    :pswitch_4
    const-string p1, "\u8272\u60c5\u5185\u5bb9"

    goto :goto_0

    :pswitch_5
    const-string p1, "\u643a\u5e26\u75c5\u6bd2"

    goto :goto_0

    :pswitch_6
    const-string p1, "\u7248\u672c\u592a\u65e7"

    goto :goto_0

    :pswitch_7
    const-string p1, "\u65e0\u6cd5\u5b89\u88c5"

    goto :goto_0

    :pswitch_8
    const-string p1, "\u65e0\u6cd5\u4e0b\u8f7d"

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method afterViews()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-static {}, Lcom/join/mgps/rpc/impl/i;->D0()Lcom/join/mgps/rpc/impl/i;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->n:Lcom/join/mgps/rpc/k;

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->b:Landroid/widget/TextView;

    const-string v1, "\u6295\u8bc9\u8be6\u60c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->getData()V

    return-void
.end method

.method back_image()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method f0(Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->p:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->h:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->p:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->addData(Ljava/lang/Object;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->h:Landroid/widget/EditText;

    invoke-static {p1}, Lo2/a;->b(Landroid/view/View;)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->p:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;

    invoke-virtual {v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_0
    return-void
.end method

.method g0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/TextChange;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->h:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->o:Z

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->i:Landroid/widget/TextView;

    const-string v1, "#F47500"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->o:Z

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->i:Landroid/widget/TextView;

    const-string v1, "#C8C9CB"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :goto_0
    return-void
.end method

.method getData()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showLoding()V

    .line 2
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    :try_start_0
    new-instance v0, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v0}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 4
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 5
    new-instance v1, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;

    invoke-direct {v1}, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;-><init>()V

    .line 6
    iget-object v2, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->m:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;->setIssueId(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->n:Lcom/join/mgps/rpc/k;

    invoke-virtual {v0}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/k;->Y(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    invoke-virtual {v0}, Lcom/join/mgps/dto/ResponseModel;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/MessageDetailFeedBackBean;

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->j0()V

    .line 13
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->l0(Lcom/join/mgps/dto/MessageDetailFeedBackBean;)V

    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 15
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showLodingFailed()V

    .line 16
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showLodingFailed()V

    const v0, 0x7f100299

    .line 18
    invoke-virtual {p0, v0}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showMessage(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method i0(Ljava/lang/String;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, "\u6dfb\u52a0\u8bc4\u8bba\u5931\u8d25"

    .line 1
    invoke-static {p0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 2
    :try_start_0
    new-instance v1, Lcom/join/mgps/dto/RequestModel;

    invoke-direct {v1}, Lcom/join/mgps/dto/RequestModel;-><init>()V

    .line 3
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 4
    new-instance v2, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;

    invoke-direct {v2}, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;-><init>()V

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->m:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;->setIssueId(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v2, p1}, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;->setContent(Ljava/lang/String;)V

    .line 7
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/join/mgps/dto/MessageDetailFeedBackArgs;->setUid(Ljava/lang/String;)V

    .line 8
    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/RequestModel;->setArgs(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v1, p0}, Lcom/join/mgps/dto/RequestModel;->setDefault(Landroid/content/Context;)Lcom/join/mgps/dto/RequestModel;

    .line 10
    iget-object v2, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->n:Lcom/join/mgps/rpc/k;

    invoke-virtual {v1}, Lcom/join/mgps/dto/RequestModel;->makeSign()Lcom/join/mgps/dto/RequestModel;

    move-result-object v1

    invoke-interface {v2, v1}, Lcom/join/mgps/rpc/k;->a0(Lcom/join/mgps/dto/RequestModel;)Lcom/join/mgps/dto/ResponseModel;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 11
    invoke-virtual {v1}, Lcom/join/mgps/dto/ResponseModel;->getCode()I

    move-result v1

    const/16 v2, 0xc8

    if-ne v1, v2, :cond_0

    .line 12
    new-instance v1, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;

    invoke-direct {v1}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;-><init>()V

    .line 13
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->setReplyUid(Ljava/lang/String;)V

    .line 14
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->setAvatar(Ljava/lang/String;)V

    .line 15
    invoke-static {p0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->setUsername(Ljava/lang/String;)V

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->setCreateTime(J)V

    .line 17
    invoke-virtual {v1, p1}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;->setReplyContent(Ljava/lang/String;)V

    .line 18
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->f0(Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackReplies;)V

    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showMessage(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showMessage(Ljava/lang/String;)V

    .line 21
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_1
    const p1, 0x7f100299

    .line 22
    invoke-virtual {p0, p1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->showMessage(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method j0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u4e3b\u754c\u9762main"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->j:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->l:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method k0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->o:Z

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->h:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->i0(Ljava/lang/String;)V

    return-void
.end method

.method l0(Lcom/join/mgps/dto/MessageDetailFeedBackBean;)V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->getFeedbackIssue()Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->getFeedbackIssue()Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->c:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;->getGameName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->d:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;->getIssueType()I

    move-result v2

    invoke-direct {p0, v2}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->h0(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->e:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;->getContent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/MessageDetailFeedBackBean$FeedbackIssue;->getCreateTime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/join/mgps/Util/y;->n(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 8
    new-instance v0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;

    invoke-virtual {p1}, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->getFeedbackReplies()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lcom/join/mgps/dto/MessageDetailFeedBackBean;->getFeedbackReplies()Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-direct {v0, p0, p1}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;-><init>(Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;Ljava/util/List;)V

    iput-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->p:Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity$a;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->g:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method relodingimag()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->getData()V

    return-void
.end method

.method setNetwork()V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const-string v0, "\u663e\u793a\u52a0\u8f7d\u4e2d"

    .line 1
    invoke-static {v0}, Lcom/join/mgps/Util/v0;->c(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->j:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->k:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->l:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->k:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->j:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 5
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/message/FeedBackMessageDetailActivity;->l:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method showMessage(Ljava/lang/String;)V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-static {p0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method
