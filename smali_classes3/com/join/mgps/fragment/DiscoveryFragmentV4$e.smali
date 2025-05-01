.class Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DiscoveryFragmentV4.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/DiscoveryFragmentV4;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/DiscoveryFragmentV4;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV4;

    const p1, 0x7f0c03a0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->c(Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV4;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV4;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "gameEnter"

    invoke-virtual {p2, v0, v1}, Lcom/papa/sim/statistic/p;->n2(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    new-instance p2, Lcom/join/mgps/dto/GameInfoBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/GameInfoBean;-><init>()V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;->getGame_name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/GameInfoBean;->setGame_name(Ljava/lang/String;)V

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;->getGame_ico()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/GameInfoBean;->setGame_ico(Ljava/lang/String;)V

    .line 5
    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;->getGame_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/join/mgps/dto/GameInfoBean;->setGame_id(Ljava/lang/String;)V

    .line 6
    iget-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV4;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/arena/GameRoomListActivity_;->W3(Landroid/content/Context;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;->c(Lcom/join/mgps/dto/GameInfoBean;)Lcom/join/mgps/activity/arena/GameRoomListActivity_$p0;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f0908e9

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;->getGame_ico()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v0, 0x7f091253

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/fragment/m;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/fragment/m;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;)V

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
    check-cast p2, Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV4$e;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryMainDataBean$BattleGameBean;)V

    return-void
.end method
