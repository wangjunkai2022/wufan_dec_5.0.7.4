.class Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "EndGameDetailRankingFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/EndGameDetailRankingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;


# direct methods
.method public constructor <init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/join/mgps/fragment/EndGameDetailRankingFragment;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;->a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    const p1, 0x7f0c039e

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;->c(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;->a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    invoke-virtual {p2, p1}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->e0(Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V
    .locals 6
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
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getNickname()Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f091587

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v3, p0, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;->a:Lcom/join/mgps/fragment/EndGameDetailRankingFragment;

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getElapsedTime()I

    move-result v4

    invoke-static {v3, v4}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment;->Z(Lcom/join/mgps/fragment/EndGameDetailRankingFragment;I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f091561

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getChange()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f09154f

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->isPlayback()Z

    move-result v3

    const v4, 0x7f0908f7

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v3

    const/4 v5, 0x2

    if-gt v3, v5, :cond_0

    const-string v3, "#097BEC"

    goto :goto_0

    :cond_0
    const-string v3, "#363636"

    :goto_0
    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v2, 0x0

    .line 8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v3

    if-gt v3, v5, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v2, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 9
    invoke-virtual {p1, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/fragment/p;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/fragment/p;-><init>(Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0908d5

    .line 10
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;->getAvatar()Ljava/lang/String;

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
    check-cast p2, Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameDetailRankingFragment$c;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/EndGameDetailBean$RankingListBean;)V

    return-void
.end method
