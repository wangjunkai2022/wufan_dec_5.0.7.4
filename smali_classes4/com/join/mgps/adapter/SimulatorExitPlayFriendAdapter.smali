.class public Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "SimulatorExitPlayFriendAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$b;,
        Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/dto/SimulatorExitListBean<",
        "TT;>;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final g:I = 0x1

.field public static final h:I = 0x2

.field public static final i:I = 0x3

.field public static final j:I = 0x4

.field public static final k:I = 0x5


# instance fields
.field d:Landroid/content/Context;

.field private e:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;

.field private f:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->f:Ljava/util/HashMap;

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->d:Landroid/content/Context;

    const/4 p1, 0x1

    const v0, 0x7f0c0756

    .line 4
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x2

    const v0, 0x7f0c0755

    .line 5
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x3

    const v0, 0x7f0c03d3

    .line 6
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x4

    const v0, 0x7f0c03d4

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x5

    const v0, 0x7f0c0754

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->n(Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->o(Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/join/mgps/dto/GamedetialModleFourBean;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->q(Lcom/join/mgps/dto/GamedetialModleFourBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->p(Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V

    return-void
.end method

.method private synthetic n(Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    const-string v1, "simulato_game_out"

    invoke-static {p2, v0, v1}, Lcom/join/mgps/Util/UtilsMy;->h4(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->d:Landroid/content/Context;

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    sget-object v0, Lcom/papa/sim/statistic/Event;->pdSimulatorOutClick:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getGameId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setGameId(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    return-void
.end method

.method private synthetic o(Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->e:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getUid()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;->e(I)V

    :cond_0
    return-void
.end method

.method private synthetic p(Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->e:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getUid()I

    move-result p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;->f(I)V

    :cond_0
    return-void
.end method

.method private static synthetic q(Lcom/join/mgps/dto/GamedetialModleFourBean;Landroid/view/View;)V
    .locals 6

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getSp_tpl_two_position()I

    move-result v4

    const/16 v5, 0x332d

    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method private r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/base/BaseViewHolder;",
            "Lcom/join/mgps/dto/SimulatorExitListBean<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorExitListBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/DomainInfoBean;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f090810

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/adapter/q5;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/q5;-><init>(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/base/BaseViewHolder;",
            "Lcom/join/mgps/dto/SimulatorExitListBean<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorExitListBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    const v1, 0x7f090e6c

    const v2, 0x7f09044b

    const v3, 0x7f090e2e

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v0, :cond_0

    .line 3
    invoke-virtual {p1, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-virtual {p0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v6

    sub-int/2addr v6, v5

    if-ne v0, v6, :cond_1

    .line 7
    invoke-virtual {p1, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 8
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 9
    invoke-virtual {p1, v1, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p1, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 13
    :goto_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getLevel()I

    move-result v0

    const v1, 0x7f09077f

    .line 14
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f09077e

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v2, v0}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->y(Landroid/view/View;Landroid/widget/ImageView;I)V

    const v0, 0x7f09012d

    .line 15
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getAvatar()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->x(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v0, 0x7f090ea1

    .line 16
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getNickName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getLevelName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090bfb

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f0917ca

    .line 18
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->isVip()Z

    move-result v2

    invoke-virtual {p1, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 19
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getMemberTitle()Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 20
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getMemberTitle()Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;->getBattleColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 21
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getMemberTitle()Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;->getBattleColor()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    :cond_2
    const-string v0, "#FFFFB543"

    .line 22
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 24
    :goto_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->getMemberTitle()Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/FriendBackGameRspBean$MemberTitle;->getBattleTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    :cond_3
    const v0, 0x7f0901fc

    .line 25
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 26
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->isAddFriendStatus()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_4

    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->isSendFriendRequestStatus()Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v1, 0x4

    .line 27
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 28
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 29
    :cond_4
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->isSendFriendRequestStatus()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setSelected(Z)V

    .line 30
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->isSendFriendRequestStatus()Z

    move-result v1

    if-eqz v1, :cond_5

    const-string v1, "\u5df2\u53d1\u9001"

    .line 31
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_5
    const-string v1, "\u6dfb\u52a0\u597d\u53cb"

    .line 33
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    new-instance v1, Lcom/join/mgps/adapter/r5;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/r5;-><init>(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    const v0, 0x7f090c67

    .line 35
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 36
    invoke-virtual {p2}, Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;->isLikeStatus()Z

    move-result v0

    if-eqz v0, :cond_6

    const v0, 0x7f08092a

    .line 37
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 38
    new-instance v0, Lcom/join/mgps/adapter/s5;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/s5;-><init>(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;Lcom/join/mgps/dto/FriendBackGameRspBean$FriendInfo;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_6
    const p2, 0x7f08092b

    .line 39
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 40
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    return-void
.end method

.method private t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/base/BaseViewHolder;",
            "Lcom/join/mgps/dto/SimulatorExitListBean<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorExitListBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/qq/e/ads/nativ/NativeExpressADView;

    const v0, 0x7f090527

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->f:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 5
    invoke-virtual {p2}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p2}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 7
    :cond_0
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const p1, 0x7f08018a

    .line 8
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/base/BaseViewHolder;",
            "Lcom/join/mgps/dto/SimulatorExitListBean<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorExitListBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/GamedetialModleFourBean;

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRecommend_game_big_gif()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x2

    const v3, 0x7f090810

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRecommend_game_big_gif()Ljava/lang/String;

    move-result-object v1

    .line 5
    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v3, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRecommend_game_big_pic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const v6, 0x7f080983

    if-nez v1, :cond_2

    if-eqz v0, :cond_1

    if-eq v0, v4, :cond_1

    if-eq v0, v2, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 7
    :cond_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getRecommend_game_big_pic()Ljava/lang/String;

    move-result-object v1

    .line 8
    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    sget-object v7, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v3, v6, v1, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    goto :goto_0

    .line 9
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DetialShowImageBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShowImageBean;->getRemote()Lcom/join/mgps/dto/DetialShowImageSingBean;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 10
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getPic_info()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/dto/DetialShowImageBean;

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShowImageBean;->getRemote()Lcom/join/mgps/dto/DetialShowImageSingBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/DetialShowImageSingBean;->getPath()Ljava/lang/String;

    move-result-object v1

    .line 11
    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    sget-object v7, Lcom/facebook/drawee/drawable/r$c;->g:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v3, v6, v1, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->e(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    :cond_3
    :goto_0
    const v1, 0x7f090ea1

    .line 12
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getGame_name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f0911ee

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getScore()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f0910e6

    .line 14
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    .line 15
    new-instance v3, Lcom/join/mgps/adapter/t5;

    invoke-direct {v3, p2}, Lcom/join/mgps/adapter/t5;-><init>(Lcom/join/mgps/dto/GamedetialModleFourBean;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f09136c

    .line 16
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    .line 17
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 18
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_5

    const/4 v3, 0x0

    .line 19
    :goto_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_5

    if-le v3, v2, :cond_4

    goto :goto_2

    .line 20
    :cond_4
    invoke-virtual {p2}, Lcom/join/mgps/dto/GamedetialModleFourBean;->getTag_info()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/join/mgps/dto/TipBean;

    invoke-virtual {v6}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0, v6}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->A(Ljava/lang/String;)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    :goto_2
    const p2, 0x7f090e6c

    const v1, 0x7f09044b

    const v2, 0x7f090e2e

    if-nez v0, :cond_6

    .line 21
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 22
    invoke-virtual {p1, v1, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 23
    invoke-virtual {p1, p2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 24
    :cond_6
    invoke-virtual {p0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v3

    sub-int/2addr v3, v4

    if-ne v0, v3, :cond_7

    .line 25
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 26
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 27
    invoke-virtual {p1, p2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 28
    :cond_7
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 29
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 30
    invoke-virtual {p1, p2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_3
    return-void
.end method

.method private v(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/base/BaseViewHolder;",
            "Lcom/join/mgps/dto/SimulatorExitListBean<",
            "TT;>;)V"
        }
    .end annotation

    const v0, 0x7f090527

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    .line 2
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorExitListBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/View;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->f:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 6
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 7
    :cond_0
    invoke-virtual {v0, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    const p1, 0x7f08018a

    .line 8
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->setBackgroundResource(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 9
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method A(Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    new-instance v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->d:Landroid/content/Context;

    invoke-direct {v0, v1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    const-string p1, "#FFA8A8A8"

    .line 4
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 5
    iget-object p1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0711f4

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 6
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v2, -0x2

    invoke-direct {p1, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 7
    iget-object v2, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07106c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    invoke-virtual {p1, v1, v1, v2, v1}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 8
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/SimulatorExitListBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->l(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V

    return-void
.end method

.method public getItemViewType(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/SimulatorExitListBean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/join/mgps/dto/SimulatorExitListBean;->getItemType()I

    move-result p1

    return p1

    .line 3
    :cond_0
    invoke-super {p0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemViewType(I)I

    move-result p1

    return p1
.end method

.method protected l(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/join/mgps/base/BaseViewHolder;",
            "Lcom/join/mgps/dto/SimulatorExitListBean<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/SimulatorExitListBean;->getItemType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->v(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V

    goto :goto_0

    .line 4
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V

    goto :goto_0

    .line 5
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V

    goto :goto_0

    .line 6
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/SimulatorExitListBean;)V

    :goto_0
    return-void
.end method

.method public m()Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->e:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;

    return-object v0
.end method

.method public w(Lcom/qq/e/ads/nativ/NativeExpressADView;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->f:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->remove(I)V

    .line 3
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    if-eqz p1, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/qq/e/ads/nativ/NativeExpressADView;->destroy()V

    :cond_0
    return-void
.end method

.method public x(Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->f:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->getExpressAdView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->remove(I)V

    .line 3
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemRemoved(I)V

    .line 4
    invoke-interface {p1}, Lcom/bytedance/sdk/openadsdk/TTNativeExpressAd;->destroy()V

    return-void
.end method

.method y(Landroid/view/View;Landroid/widget/ImageView;I)V
    .locals 2

    const/16 v0, 0x8

    if-lez p3, :cond_0

    const/4 v1, 0x7

    if-ge p3, v1, :cond_0

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 2
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    packed-switch p3, :pswitch_data_0

    .line 5
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :pswitch_0
    const p3, 0x7f0809d6

    .line 7
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    const p2, 0x7f0809d7

    .line 8
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :pswitch_1
    const p3, 0x7f0809d0

    .line 9
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    const p2, 0x7f0809d1

    .line 10
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :pswitch_2
    const p3, 0x7f0809d2

    .line 11
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    const p2, 0x7f0809d3

    .line 12
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :pswitch_3
    const p3, 0x7f0809ce

    .line 13
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    const p2, 0x7f0809cf

    .line 14
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :pswitch_4
    const p3, 0x7f0809d4

    .line 15
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    const p2, 0x7f0809d5

    .line 16
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :pswitch_5
    const p3, 0x7f0809d8

    .line 17
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    const p2, 0x7f08019b

    .line 18
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public z(Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter;->e:Lcom/join/mgps/adapter/SimulatorExitPlayFriendAdapter$a;

    return-void
.end method
