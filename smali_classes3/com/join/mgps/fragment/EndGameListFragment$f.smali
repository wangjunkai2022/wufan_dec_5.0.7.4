.class Lcom/join/mgps/fragment/EndGameListFragment$f;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "EndGameListFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/fragment/EndGameListFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/join/mgps/fragment/EndGameListFragment$g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/fragment/EndGameListFragment$g;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameListFragment$f;->d(Lcom/join/mgps/fragment/EndGameListFragment$g;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameListFragment$f;->c(Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V

    return-void
.end method

.method private synthetic c(Lcom/join/mgps/dto/EndGameBean;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameListFragment;->c0(Lcom/join/mgps/fragment/EndGameListFragment;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/activity/EndGameDetailActivity_;->C0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->a(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/EndGameListFragment;->h:Ljava/lang/String;

    invoke-virtual {p2, v0}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->d(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p2

    invoke-virtual {p2}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 2
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-virtual {p1}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->Z(Lcom/join/mgps/fragment/EndGameListFragment;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic d(Lcom/join/mgps/fragment/EndGameListFragment$g;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameListFragment;->d0(Lcom/join/mgps/fragment/EndGameListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/EndGameBean;

    invoke-static {p2, p1}, Lcom/join/mgps/fragment/EndGameListFragment;->a0(Lcom/join/mgps/fragment/EndGameListFragment;Lcom/join/mgps/dto/EndGameBean;)V

    return-void
.end method


# virtual methods
.method public e(Lcom/join/mgps/fragment/EndGameListFragment$g;I)V
    .locals 11
    .param p1    # Lcom/join/mgps/fragment/EndGameListFragment$g;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->d0(Lcom/join/mgps/fragment/EndGameListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/EndGameBean;

    const-wide/16 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallengeSucRateStr()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 3
    invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V

    move-wide v2, v0

    .line 4
    :goto_0
    iget-object v4, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->m:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getGameName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v4, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->l:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getGameIcon()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 6
    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameListFragment$g;->b(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameListFragment$g;->c(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;

    move-result-object v4

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallenge()I

    move-result v5

    if-gtz v5, :cond_0

    const-string/jumbo v5, "\u8fd8\u6ca1\u6709\u4eba\u6311\u6218\u8fc7"

    goto :goto_1

    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallenge()I

    move-result v7

    invoke-static {v6, v7}, Lcom/join/mgps/fragment/EndGameListFragment;->e0(Lcom/join/mgps/fragment/EndGameListFragment;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v6, "\u4eba\u6311\u6218\u8fc7"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :goto_1
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 8
    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameListFragment$g;->d(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;

    move-result-object v4

    cmpl-double v5, v2, v0

    if-lez v5, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v1, "\u901a\u8fc7\u7387 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getChallengeSucRate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_1
    const-string/jumbo v0, "\u7b49\u4f60\u6311\u6218"

    :goto_2
    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameListFragment$g;->e(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getWin()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v1, v2, :cond_2

    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    const/16 v1, 0x8

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 10
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->i:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getStar()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/customview/MStarBar;->setStarCount(I)V

    .line 11
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->j:Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getStar()I

    move-result v1

    const/4 v2, 0x4

    if-gtz v1, :cond_3

    const/4 v1, 0x4

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    :goto_4
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->i:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getStar()I

    move-result v1

    if-gtz v1, :cond_4

    const/4 v1, 0x4

    goto :goto_5

    :cond_4
    const/4 v1, 0x0

    :goto_5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->k:Landroid/view/View;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getStar()I

    move-result v1

    if-gtz v1, :cond_5

    goto :goto_6

    :cond_5
    const/4 v2, 0x0

    :goto_6
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->i:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 15
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->i:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->i:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {v0, v3}, Landroid/view/View;->setClickable(Z)V

    .line 17
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getVideo()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 18
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v1, 0x7f08016b

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 19
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 20
    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getVideo()Ljava/lang/String;

    move-result-object v6

    .line 21
    new-instance v0, Lcom/join/android/app/component/video/c$l;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getCover()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getGameId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v9

    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    iget-object v10, v1, Lcom/join/mgps/fragment/EndGameListFragment;->h:Ljava/lang/String;

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    iget-object v1, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/EndGameListFragment;->X(Lcom/join/mgps/fragment/EndGameListFragment;)Lcom/join/android/app/component/video/c;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v2

    new-array v3, v3, [Z

    invoke-virtual {v1, v2, v0, v3}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V

    .line 23
    iget-object v0, p1, Lcom/join/mgps/fragment/EndGameListFragment$g;->h:Landroid/widget/FrameLayout;

    new-instance v1, Lcom/join/mgps/fragment/EndGameListFragment$f$a;

    invoke-direct {v1, p0, p1, p2}, Lcom/join/mgps/fragment/EndGameListFragment$f$a;-><init>(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/fragment/EndGameListFragment$g;Lcom/join/mgps/dto/EndGameBean;)V

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_6
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/fragment/r;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/fragment/r;-><init>(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/dto/EndGameBean;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameListFragment$g;->a(Lcom/join/mgps/fragment/EndGameListFragment$g;)Landroid/widget/TextView;

    move-result-object p2

    new-instance v0, Lcom/join/mgps/fragment/s;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/fragment/s;-><init>(Lcom/join/mgps/fragment/EndGameListFragment$f;Lcom/join/mgps/fragment/EndGameListFragment$g;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public f(Landroid/view/ViewGroup;I)Lcom/join/mgps/fragment/EndGameListFragment$g;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameListFragment;->c0(Lcom/join/mgps/fragment/EndGameListFragment;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c03a1

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/join/mgps/fragment/EndGameListFragment$g;

    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/fragment/EndGameListFragment$g;-><init>(Lcom/join/mgps/fragment/EndGameListFragment;Landroid/view/View;)V

    return-object p2
.end method

.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameListFragment$f;->a:Lcom/join/mgps/fragment/EndGameListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameListFragment;->d0(Lcom/join/mgps/fragment/EndGameListFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/join/mgps/fragment/EndGameListFragment$g;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameListFragment$f;->e(Lcom/join/mgps/fragment/EndGameListFragment$g;I)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/fragment/EndGameListFragment$f;->f(Landroid/view/ViewGroup;I)Lcom/join/mgps/fragment/EndGameListFragment$g;

    move-result-object p1

    return-object p1
.end method
