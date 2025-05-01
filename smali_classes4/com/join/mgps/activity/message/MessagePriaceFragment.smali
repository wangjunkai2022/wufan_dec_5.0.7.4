.class public Lcom/join/mgps/activity/message/MessagePriaceFragment;
.super Landroidx/fragment/app/Fragment;
.source "MessagePriaceFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/activity/message/MessagePriaceFragment$f;,
        Lcom/join/mgps/activity/message/MessagePriaceFragment$g;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c025c
.end annotation


# instance fields
.field b:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Lcom/join/mgps/customview/XListView2;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

.field f:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field g:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field h:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field i:Landroid/widget/TextView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field j:Lcom/join/mgps/rpc/e;

.field k:Lcom/join/mgps/rpc/f;

.field l:Landroid/content/Context;

.field m:I

.field n:Lcom/join/mgps/pref/PrefDef_;
    .annotation build Lorg/androidannotations/annotations/sharedpreferences/Pref;
    .end annotation
.end field

.field o:Landroid/widget/Button;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field p:Z

.field private q:Lcom/wufan/user/service/protobuf/n0;

.field r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/MessagePriaceFragment$g;",
            ">;"
        }
    .end annotation
.end field

.field s:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;",
            ">;"
        }
    .end annotation
.end field

.field t:Z

.field u:Landroid/widget/PopupWindow;

.field v:[Landroid/text/InputFilter;

.field w:Z

.field x:Landroid/view/View;

.field y:Landroid/view/View;

.field z:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->p:Z

    const/4 v0, 0x0

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->t:Z

    .line 5
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->w:Z

    return-void
.end method

.method private j0(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->u:Landroid/widget/PopupWindow;

    const/16 v1, 0x51

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, v2, v2}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    return-void
.end method


# virtual methods
.method V()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 3
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method W(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/MessagePriaceFragment$g;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->e:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    :cond_0
    return-void
.end method

.method public X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/join/mgps/dto/CommentCreateArgs;
    .locals 18

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->n:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/String;

    .line 2
    iget-object v1, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v1

    iput-object v1, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    const-string v2, ""

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {v1}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v1

    .line 4
    iget-object v2, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v2}, Lcom/wufan/user/service/protobuf/n0;->getNickname()Ljava/lang/String;

    move-result-object v2

    .line 5
    iget-object v3, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v3}, Lcom/wufan/user/service/protobuf/n0;->d0()Ljava/lang/String;

    move-result-object v3

    .line 6
    iget-object v4, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v4}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v4

    move v13, v1

    move-object v10, v2

    move-object v11, v3

    move-object v12, v4

    goto :goto_0

    :cond_0
    const/4 v1, -0x1

    move-object v10, v2

    move-object v11, v10

    move-object v12, v11

    const/4 v13, -0x1

    .line 7
    :goto_0
    iget-object v1, v0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v8, 0x2

    move-object/from16 v3, p1

    move-object/from16 v5, p3

    move-object/from16 v7, p4

    move-object/from16 v9, p2

    move-object/from16 v14, p5

    move-object/from16 v15, p6

    move-object/from16 v16, p7

    move/from16 v17, p8

    invoke-virtual/range {v2 .. v17}, Lcom/join/mgps/Util/RequestBeanUtil;->getReplyCreateCommentBean(Ljava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/join/mgps/dto/CommentCreateArgs;

    move-result-object v1

    return-object v1
.end method

.method Z()V
    .locals 4
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v0, v2}, Lcom/join/mgps/Util/RequestBeanUtil;->getTokenRequestBean(Ljava/lang/String;Ljava/lang/String;)Lcom/join/mgps/dto/CommentRequest;

    move-result-object v0

    .line 4
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->k:Lcom/join/mgps/rpc/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/f;->c(Lcom/join/mgps/dto/CommentRequest;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v1

    if-nez v1, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 7
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommentTokenBean;->getToken()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommentTokenBean;->getToken()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentTokenBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentTokenBean;->getTimes()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AESUtils;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 9
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->n:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->commentToken()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V

    .line 10
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->n:Lcom/join/mgps/pref/PrefDef_;

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->lastCheckInTime()Lorg/androidannotations/api/sharedpreferences/k;

    move-result-object v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/androidannotations/api/sharedpreferences/b;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method a0()V
    .locals 8
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v0, ""

    .line 1
    :try_start_0
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v1

    const/4 v2, 0x2

    if-eqz v1, :cond_8

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    iget-object v3, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/mgps/Util/RequestBeanUtil;->getInstance(Landroid/content/Context;)Lcom/join/mgps/Util/RequestBeanUtil;

    move-result-object v3

    iget v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    iget-object v5, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v5}, Lcom/wufan/user/service/protobuf/n0;->getUid()I

    move-result v5

    iget-object v6, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    invoke-virtual {v6}, Lcom/wufan/user/service/protobuf/n0;->getToken()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v4, v5, v6}, Lcom/join/mgps/Util/RequestBeanUtil;->getGameReplyMessageRequestBean(IILjava/lang/String;)Lcom/join/mgps/dto/CommonRequestBean;

    move-result-object v3

    .line 4
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->j:Lcom/join/mgps/rpc/e;

    invoke-interface {v4, v3}, Lcom/join/mgps/rpc/e;->b0(Lcom/join/mgps/dto/CommonRequestBean;)Lcom/join/mgps/dto/GameReplyMessageListBean;

    move-result-object v3

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->o0()V

    if-eqz v3, :cond_9

    .line 6
    invoke-virtual {v3}, Lcom/join/mgps/dto/GameReplyMessageListBean;->getMessages()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;

    move-result-object v4

    const/4 v5, 0x1

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameReplyMessageListBean;->getMessages()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;->getData()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameReplyMessageListBean;->getMessages()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;->getData()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_6

    .line 7
    invoke-virtual {v3}, Lcom/join/mgps/dto/GameReplyMessageListBean;->getMessages()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean;->getData()Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    .line 8
    iget v3, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    if-ne v3, v2, :cond_0

    .line 9
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 10
    iget-object v3, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->r:Ljava/util/List;

    invoke-virtual {p0, v3}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->W(Ljava/util/List;)V

    :cond_0
    const/4 v3, 0x0

    .line 11
    :goto_0
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 12
    new-instance v4, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;

    invoke-direct {v4, p0, v0, v5}, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Ljava/lang/Object;I)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 13
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_text()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_text()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 14
    new-instance v4, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;

    iget-object v6, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-direct {v4, p0, v6, v2}, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Ljava/lang/Object;I)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 15
    :cond_1
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getReply_sub()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean$ReplySubBean;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 16
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getReply_sub()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean$ReplySubBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean$ReplySubBean;->getReply_text()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getReply_sub()Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean$ReplySubBean;

    move-result-object v4

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean$ReplySubBean;->getReply_text()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 17
    new-instance v4, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;

    iget-object v6, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x3

    invoke-direct {v4, p0, v6, v7}, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Ljava/lang/Object;I)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    :cond_2
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_text()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_text()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 19
    new-instance v4, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;

    iget-object v6, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x4

    invoke-direct {v4, p0, v6, v7}, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Ljava/lang/Object;I)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20
    :cond_3
    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getOriginal_text()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getOriginal_text()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    .line 21
    new-instance v4, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;

    iget-object v6, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v6, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x5

    invoke-direct {v4, p0, v6, v7}, Lcom/join/mgps/activity/message/MessagePriaceFragment$g;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Ljava/lang/Object;I)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 22
    :cond_5
    invoke-virtual {p0, v1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d0(Ljava/util/List;)V

    .line 23
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b0()V

    .line 24
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_9

    .line 25
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g0()V

    goto :goto_1

    .line 26
    :cond_6
    iget v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    if-ne v0, v2, :cond_7

    .line 27
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b0()V

    .line 28
    invoke-virtual {p0, v5}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i0(I)V

    .line 29
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g0()V

    goto :goto_1

    .line 30
    :cond_7
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g0()V

    goto :goto_1

    .line 31
    :cond_8
    invoke-virtual {p0, v2}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i0(I)V

    .line 32
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b0()V

    .line 33
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->showLodingFailed()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 35
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b0()V

    .line 36
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->showLodingFailed()V

    :cond_9
    :goto_1
    return-void
.end method

.method afterViews()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->r:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->s:Ljava/util/List;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 5
    new-instance v0, Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/join/mgps/activity/message/MessagePriaceFragment$f;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->e:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v1, v0}, Lcom/join/mgps/customview/XListView2;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 7
    invoke-static {}, Lcom/join/mgps/rpc/impl/d;->P1()Lcom/join/mgps/rpc/impl/d;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->j:Lcom/join/mgps/rpc/e;

    .line 8
    invoke-static {}, Lcom/join/mgps/rpc/impl/e;->m()Lcom/join/mgps/rpc/impl/e;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->k:Lcom/join/mgps/rpc/f;

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getAccountData()Lcom/wufan/user/service/protobuf/n0;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->q:Lcom/wufan/user/service/protobuf/n0;

    .line 10
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->showLoding()V

    .line 11
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->a0()V

    .line 12
    sget-object v0, Lcom/MApplication;->M:Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;->getPraise_surplus_number()I

    move-result v0

    if-lez v0, :cond_0

    .line 13
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m0()V

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/message/MessagePriaceFragment$a;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment$a;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullLoadEnable(Lcom/join/mgps/customview/f;)V

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    new-instance v1, Lcom/join/mgps/activity/message/MessagePriaceFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment$b;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;)V

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/XListView2;->setPullRefreshEnable(Lcom/join/mgps/customview/g;)V

    .line 16
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->l()V

    return-void
.end method

.method b0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    :try_start_0
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method c0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/16 v1, 0x8

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method d0(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/message/MessagePriaceFragment$g;",
            ">;)V"
        }
    .end annotation

    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->r:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->e:Lcom/join/mgps/activity/message/MessagePriaceFragment$f;

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method e0(Lcom/join/mgps/dto/CommentResponse;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v0

    const/16 v1, 0x321

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->Z()V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string v0, "\u6570\u636e\u8bbf\u95ee\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u518d\u8bd5\uff01"

    invoke-virtual {p1, v0}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommentResponse;->getMsg()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    :goto_0
    return-void
.end method

.method f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V
    .locals 0
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {p2}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void
.end method

.method g0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->setNoMore()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V

    :cond_0
    return-void
.end method

.method h0(Ljava/lang/String;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 12
    .annotation build Lorg/androidannotations/annotations/Background;
    .end annotation

    const-string v1, ""

    .line 1
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u4e0d\u80fd\u56de\u590d\u7a7a\u5b57\u7b26\u4e32"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v2, 0x4

    .line 3
    invoke-static {p1, v2}, Lcom/join/mgps/Util/f2;->d(Ljava/lang/String;I)Z

    move-result v2

    if-nez v2, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object v0

    const-string v1, "\u8d85\u8fc73\u4e2a\u5b57\u624d\u80fd\u56de\u590d"

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    iget-object v2, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v2

    const/4 v10, 0x0

    const/4 v11, 0x0

    if-eqz v2, :cond_5

    .line 6
    :try_start_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_text_id()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 7
    invoke-virtual {p2}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_title()Ljava/lang/String;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    aget-object v7, v2, v11

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getGame_id()Ljava/lang/String;

    move-result-object v2

    sget-object v5, Landroid/os/Build;->MODEL:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    invoke-virtual {p2}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_text_uid()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget v9, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    move-object v1, p0

    move-object v3, v8

    move-object v4, p1

    .line 10
    invoke-virtual/range {v1 .. v9}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->X(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/join/mgps/dto/CommentCreateArgs;

    move-result-object v0

    .line 11
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->k:Lcom/join/mgps/rpc/f;

    invoke-interface {v1, v0}, Lcom/join/mgps/rpc/f;->d(Lcom/join/mgps/dto/CommentCreateArgs;)Lcom/join/mgps/dto/CommentResponse;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v1

    if-eqz v1, :cond_3

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getCode()I

    move-result v1

    const/16 v2, 0x321

    if-ne v1, v2, :cond_2

    .line 14
    invoke-virtual {p0, v0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->e0(Lcom/join/mgps/dto/CommentResponse;)V

    goto :goto_0

    .line 15
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getMsg()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, v10, v11}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V

    goto :goto_0

    .line 16
    :cond_3
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/CommentCreateBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommentCreateBean;->getInfo()Lcom/join/mgps/dto/CommentCreateBean$InfoBean;

    move-result-object v1

    if-eqz v1, :cond_6

    const-string v1, "\u56de\u590d\u6210\u529f\uff0c\u5185\u5bb9\u5c06\u5728\u5ba1\u6838\u540e\u663e\u793a"

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentResponse;->getData_info()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommentCreateBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommentCreateBean;->getInfo()Lcom/join/mgps/dto/CommentCreateBean$InfoBean;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {p0, v1, v0, v2}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V

    goto :goto_0

    :cond_4
    const-string v0, "\u56de\u590d\u5931\u8d25\uff0c\u8bf7\u7a0d\u5019\u518d\u8bd5~"

    .line 18
    invoke-virtual {p0, v0, v10, v11}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v10, v11}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V

    .line 20
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :cond_5
    const-string v0, "\u7f51\u7edc\u8fde\u63a5\u5931\u8d25\uff0c\u518d\u8bd5\u8bd5\u5427~"

    .line 21
    invoke-virtual {p0, v0, v10, v11}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f0(Ljava/lang/String;Lcom/join/mgps/dto/CommentCreateBean$InfoBean;Z)V

    :cond_6
    :goto_0
    return-void
.end method

.method i0(I)V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->c:Lcom/join/mgps/ptr/PtrClassicFrameLayout;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->h:Landroid/widget/LinearLayout;

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    const/16 v2, 0x8

    if-ne p1, v1, :cond_0

    .line 2
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->h:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {p1, v2}, Landroid/widget/ListView;->setVisibility(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method k0(Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V
    .locals 13
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    const/4 v0, 0x0

    .line 1
    iput-boolean v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->p:Z

    .line 2
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->x:Landroid/view/View;

    const/16 v2, 0x21

    const/16 v3, 0xf

    const-string v4, ":"

    const-string v5, " "

    const-string v6, "@ "

    const/4 v7, 0x2

    const-string v8, "input_method"

    const/4 v9, 0x1

    if-nez v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v10, 0x7f0c00c1

    const/4 v11, 0x0

    invoke-virtual {v1, v10, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->x:Landroid/view/View;

    .line 4
    new-instance v1, Landroid/widget/PopupWindow;

    iget-object v10, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->x:Landroid/view/View;

    const/4 v12, -0x1

    invoke-direct {v1, v10, v12, v12, v9}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->u:Landroid/widget/PopupWindow;

    .line 5
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->x:Landroid/view/View;

    const v10, 0x7f0904bc

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    .line 6
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->x:Landroid/view/View;

    const v10, 0x7f090ce7

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 7
    new-instance v10, Lcom/join/mgps/activity/message/MessagePriaceFragment$c;

    invoke-direct {v10, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment$c;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;)V

    invoke-virtual {v1, v10}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    new-instance v1, Landroid/text/SpannableString;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_title()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    aget-object v5, v5, v0

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v1, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 9
    new-instance v4, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {v4, v3, v9}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 10
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v3

    invoke-virtual {v1, v4, v0, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 11
    iget-object v2, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    new-instance v3, Landroid/text/SpannedString;

    invoke-direct {v3, v1}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->x:Landroid/view/View;

    const v2, 0x7f09023f

    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    .line 13
    iget-object v2, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    new-instance v3, Lcom/join/mgps/activity/message/MessagePriaceFragment$d;

    invoke-direct {v3, p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment$d;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;)V

    invoke-virtual {v2, v3}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 14
    new-instance v2, Lcom/join/mgps/activity/message/MessagePriaceFragment$e;

    invoke-direct {v2, p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment$e;-><init>(Lcom/join/mgps/activity/message/MessagePriaceFragment;Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;)V

    invoke-virtual {v1, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    invoke-virtual {p1, v9}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 16
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->u:Landroid/widget/PopupWindow;

    invoke-virtual {p1, v9}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 17
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    invoke-virtual {p1, v9}, Landroid/widget/EditText;->setFocusableInTouchMode(Z)V

    .line 18
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    invoke-virtual {p1, v9}, Landroid/widget/EditText;->setFocusable(Z)V

    .line 19
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->requestFocus()Z

    .line 20
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-virtual {p1, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 21
    invoke-virtual {p1, v0, v7}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 22
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c025c

    invoke-virtual {p1, v0, v11}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->y:Landroid/view/View;

    .line 23
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->j0(Landroid/view/View;)V

    goto :goto_0

    .line 24
    :cond_0
    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-virtual {v1, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/inputmethod/InputMethodManager;

    .line 25
    invoke-virtual {v1, v0, v7}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 26
    new-instance v1, Landroid/text/SpannableString;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GameReplyMessageListBean$MessagesBean$DataBean;->getCurrent_reply_title()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v0

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 27
    new-instance p1, Landroid/text/style/AbsoluteSizeSpan;

    invoke-direct {p1, v3, v9}, Landroid/text/style/AbsoluteSizeSpan;-><init>(IZ)V

    .line 28
    invoke-virtual {v1}, Landroid/text/SpannableString;->length()I

    move-result v3

    invoke-virtual {v1, p1, v0, v3, v2}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 29
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->z:Landroid/widget/EditText;

    new-instance v2, Landroid/text/SpannedString;

    invoke-direct {v2, v1}, Landroid/text/SpannedString;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v2}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 30
    iget-object p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->u:Landroid/widget/PopupWindow;

    iget-object v1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->y:Landroid/view/View;

    const/16 v2, 0x51

    invoke-virtual {p1, v1, v2, v0, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    :goto_0
    return-void
.end method

.method l0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->b:Landroid/widget/LinearLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    return-void
.end method

.method m0()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->i:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method n0()V
    .locals 3
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->c0()V

    .line 2
    sget-object v0, Lcom/MApplication;->M:Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/MessageRedPointBean$MessagesBean$DataBean;->setPraise_surplus_number(I)V

    .line 4
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    const-class v2, Lcom/join/mgps/activity/GivePraiceActivity_;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/4 v1, 0x2

    const-string v2, "praice"

    .line 5
    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 6
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method o0()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    if-eqz v0, :cond_0

    .line 2
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->d:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->v()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method setNetwork()V
    .locals 1
    .annotation build Lorg/androidannotations/annotations/Click;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->w3(Landroid/content/Context;)V

    return-void
.end method

.method public setUserVisibleHint(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    if-eqz p1, :cond_0

    .line 2
    iget-boolean p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->t:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->t:Z

    const/4 p1, 0x1

    .line 4
    iput p1, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->m:I

    .line 5
    invoke-virtual {p0}, Lcom/join/mgps/activity/message/MessagePriaceFragment;->a0()V

    :cond_0
    return-void
.end method

.method showLoding()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method

.method showLodingFailed()V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->g:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->f:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    const/16 v1, 0x8

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method showToast(Ljava/lang/String;)V
    .locals 2
    .annotation build Lorg/androidannotations/annotations/UiThread;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/message/MessagePriaceFragment;->l:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method
