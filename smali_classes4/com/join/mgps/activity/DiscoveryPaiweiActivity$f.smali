.class Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DiscoveryPaiweiActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/DiscoveryPaiweiActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->b:Lcom/join/mgps/activity/DiscoveryPaiweiActivity;

    .line 2
    invoke-static {p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity;->j0(Lcom/join/mgps/activity/DiscoveryPaiweiActivity;)Ljava/util/List;

    move-result-object p1

    const v0, 0x7f0c0399

    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->a:I

    return-void
.end method

.method static synthetic a(Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->c(I)V

    return-void
.end method

.method private c(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->a:I

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;)V
    .locals 4
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    const v0, 0x7f090793

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->getIcon()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v1, 0x7f090794

    .line 2
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;->getIcon()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p2

    iget v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->a:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p2

    const v0, 0x7f0905a2

    .line 4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    iget v1, p0, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->a:I

    if-eq p1, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {p2, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/DiscoveryPaiweiActivity$f;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryPaiweiGameIndexBean;)V

    return-void
.end method
