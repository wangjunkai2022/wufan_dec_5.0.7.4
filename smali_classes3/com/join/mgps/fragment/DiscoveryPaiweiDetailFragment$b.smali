.class Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "DiscoveryPaiweiDetailFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;->a:Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment;

    const p1, 0x7f0c039a

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;)V
    .locals 9
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    const/4 v1, 0x1

    add-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f09154e

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-gt v3, v5, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const v6, 0x7f0908fc

    invoke-virtual {v0, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v3

    if-le v3, v5, :cond_1

    const/4 v4, 0x1

    :cond_1
    invoke-virtual {v0, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f091539

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getNickname()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f091560

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getCost_coin()I

    move-result v4

    const-string v7, ""

    if-lez v4, :cond_2

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getCost_coin()I

    move-result v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string/jumbo v8, "\u5e01 "

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v7

    :goto_1
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getUse_time()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f09150d

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getRole()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getRole_rank()I

    move-result v3

    if-lez v3, :cond_3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v4, "\u7b2c"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getRole_rank()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getRole()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    :cond_3
    invoke-virtual {v0, v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;->getAvatar()Ljava/lang/String;

    move-result-object p2

    const v2, 0x7f09012d

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v0, p2, v2}, Lcom/join/mgps/Util/UtilsMy;->v3(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/drawee/view/SimpleDraweeView;)V

    .line 8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p2

    const v0, 0x7f09012e

    if-nez p2, :cond_4

    const p2, 0x7f08063e

    .line 9
    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const p2, 0x7f080ddf

    .line 10
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 11
    :cond_4
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p2

    if-ne p2, v1, :cond_5

    const p2, 0x7f08063f

    .line 12
    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const p2, 0x7f080de0

    .line 13
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 14
    :cond_5
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p2

    if-ne p2, v5, :cond_6

    const p2, 0x7f080640

    .line 15
    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const p2, 0x7f080de1

    .line 16
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    :cond_6
    const p2, 0x7f0603ec

    .line 17
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    :goto_2
    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/DiscoveryPaiweiDetailFragment$b;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/DiscoveryPaiweiGameRankBean;)V

    return-void
.end method
