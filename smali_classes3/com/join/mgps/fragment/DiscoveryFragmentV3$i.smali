.class Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DiscoveryFragmentV3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/DiscoveryFragmentV3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/DiscoveryFragmentV3;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    const p1, 0x7f0c03a0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;->c(Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {p2}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    invoke-static {p2}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "groupEnter"

    invoke-virtual {p2, v0, v1}, Lcom/papa/sim/statistic/p;->n2(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;->a:Lcom/join/mgps/fragment/DiscoveryFragmentV3;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;->getFid()I

    move-result p1

    const-string v1, "discovery"

    invoke-virtual {p2, v0, p1, v1}, Lcom/join/mgps/Util/IntentUtil;->goForumGroupActivity(Landroid/content/Context;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;)V
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

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;->getIcon_src()Ljava/lang/String;

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

    new-instance v0, Lcom/join/mgps/fragment/k;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/fragment/k;-><init>(Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;)V

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
    check-cast p2, Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryFragmentV3$i;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryMainDataBean$ForumListBean;)V

    return-void
.end method
