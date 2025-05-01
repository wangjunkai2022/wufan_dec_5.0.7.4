.class Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "EndGameDiscoveryFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/EndGameDiscoveryFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/EndGameBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/EndGameDiscoveryFragment;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    const p1, 0x7f0c039f

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->c(Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/Util/b;->isTourist()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/IntentUtil;->goLogin(Landroid/content/Context;)Z

    return-void

    .line 3
    :cond_0
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/activity/EndGameLaunchActivity_;->G0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->a(Lcom/join/mgps/dto/EndGameBean;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object p2

    const/16 v0, 0x10

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameLaunchActivity_$f;->d(I)Lcom/join/mgps/activity/EndGameLaunchActivity_$f;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 4
    :try_start_0
    new-instance p2, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p2}, Lcom/papa/sim/statistic/Ext;-><init>()V

    const-string v0, "1"

    .line 5
    invoke-virtual {p2, v0}, Lcom/papa/sim/statistic/Ext;->setPosition(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/papa/sim/statistic/Ext;->setEndId(Ljava/lang/String;)V

    .line 7
    new-instance v0, Lcom/papa/sim/statistic/Data;

    invoke-direct {v0}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 9
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v1, Lcom/papa/sim/statistic/Event;->gameStartVS:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p1, v1, p2, v0}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 10
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameBean;)V
    .locals 9
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallengeSucRateStr()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    const v0, 0x7f091537

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f091529

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallenge()I

    move-result v2

    if-gtz v2, :cond_0

    const-string v2, "0"

    goto :goto_1

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallenge()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_1
    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f091544

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallengeSucRate()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f09151e

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getGameName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "convert: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getGameName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getVideo()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x7f090154

    .line 9
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    const v2, 0x7f08016b

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 10
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getVideo()Ljava/lang/String;

    move-result-object v4

    .line 12
    new-instance v0, Lcom/join/android/app/component/video/c$l;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v3

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v7

    const-string v8, ""

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->a:Lcom/join/mgps/fragment/EndGameDiscoveryFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment;->W(Lcom/join/mgps/fragment/EndGameDiscoveryFragment;)Lcom/join/android/app/component/video/c;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v2

    const/4 v3, 0x0

    new-array v3, v3, [Z

    invoke-virtual {v1, v2, v0, v3}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V

    const v0, 0x7f091792

    .line 14
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c$a;-><init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameBean;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    const v0, 0x7f090214

    .line 15
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/fragment/q;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/fragment/q;-><init>(Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;Lcom/join/mgps/dto/EndGameBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameDiscoveryFragment$c;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameBean;)V

    return-void
.end method
