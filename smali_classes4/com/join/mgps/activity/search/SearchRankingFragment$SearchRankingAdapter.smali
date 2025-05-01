.class Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SearchRankingFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/search/SearchRankingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SearchRankingAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/search/SearchRankingFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->onBindViewHolder(Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;I)V
    .locals 10
    .param p1    # Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/GameInfoBean;

    const-string v1, "#FF7039"

    const v2, 0x7f080372

    const-string v3, "\u70ed"

    const/16 v4, 0x8

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v0, :cond_9

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameInfoBean;

    if-eqz p2, :cond_5

    .line 4
    iget-object v7, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget v7, v7, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdPosition:I

    if-le p2, v7, :cond_0

    if-ne p2, v6, :cond_0

    goto :goto_2

    :cond_0
    if-eq p2, v6, :cond_4

    const/4 v8, 0x2

    if-le p2, v7, :cond_1

    if-ne p2, v8, :cond_1

    goto :goto_1

    :cond_1
    if-eq p2, v8, :cond_3

    if-le p2, v7, :cond_2

    const/4 v7, 0x3

    if-ne p2, v7, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->rankingNumberBack:Landroid/widget/TextView;

    const v8, 0x7f080cb6

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_3

    .line 6
    :cond_3
    :goto_0
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->rankingNumberBack:Landroid/widget/TextView;

    const v8, 0x7f080cb8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_3

    .line 7
    :cond_4
    :goto_1
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->rankingNumberBack:Landroid/widget/TextView;

    const v8, 0x7f080cb7

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundResource(I)V

    goto :goto_3

    .line 8
    :cond_5
    :goto_2
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->rankingNumberBack:Landroid/widget/TextView;

    const v8, 0x7f080cb5

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 9
    :goto_3
    iget-object v7, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v7, v7, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v6

    if-ne p2, v7, :cond_6

    .line 10
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->line:Landroid/view/View;

    invoke-virtual {v7, v4}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :cond_6
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->appName:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->getGame_name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->icon:Lcom/facebook/drawee/view/SimpleDraweeView;

    const v8, 0x7f080983

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->getGame_ico()Ljava/lang/String;

    move-result-object v9

    invoke-static {v7, v8, v9}, Lcom/join/android/app/common/utils/MyImageLoader;->d(Lcom/facebook/drawee/view/SimpleDraweeView;ILjava/lang/String;)V

    .line 13
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->rankingNumber:Landroid/widget/TextView;

    iget-object v8, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget v8, v8, Lcom/join/mgps/activity/search/SearchRankingFragment;->hotAdPosition:I

    const-string v9, ""

    if-le p2, v8, :cond_7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    goto :goto_4

    :cond_7
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr p2, v6

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_4
    invoke-virtual {v7, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->main:Landroid/view/View;

    new-instance v6, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$1;

    invoke-direct {v6, p0, v0}, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$1;-><init>(Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;Lcom/join/mgps/dto/GameInfoBean;)V

    invoke-virtual {p2, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 16
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->isThe_hot()Z

    move-result p2

    if-eqz p2, :cond_8

    .line 17
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 18
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 20
    iget-object p1, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto/16 :goto_5

    .line 21
    :cond_8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameInfoBean;->isThe_new()Z

    move-result p2

    if-eqz p2, :cond_b

    .line 22
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 23
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    const-string v0, "\u65b0"

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    const v0, 0x7f080375

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 25
    iget-object p1, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    const-string p2, "#FF911A"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_5

    .line 26
    :cond_9
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v0, :cond_b

    .line 27
    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v0, v0, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 28
    iget-object v7, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->rankingNumberBack:Landroid/widget/TextView;

    const v8, 0x7f080712

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 29
    iget-object v7, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object v7, v7, Lcom/join/mgps/activity/search/SearchRankingFragment;->listDatas:Ljava/util/List;

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v6

    if-ne p2, v7, :cond_a

    .line 30
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->line:Landroid/view/View;

    invoke-virtual {p2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 31
    :cond_a
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->appName:Landroid/widget/TextView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->main:Landroid/view/View;

    new-instance v4, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;

    invoke-direct {v4, p0, v0}, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter$2;-><init>(Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {p2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 33
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 34
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    iget-object p2, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-virtual {p2, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 36
    iget-object p1, p1, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;->tag:Landroid/widget/TextView;

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_b
    :goto_5
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
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 2
    iget-object p2, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    iget-object p2, p2, Lcom/join/mgps/activity/search/SearchRankingFragment;->activity:Lcom/join/mgps/activity/SearchHintActivity;

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v0, 0x7f0c0738

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 3
    new-instance p2, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;

    iget-object v0, p0, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingAdapter;->this$0:Lcom/join/mgps/activity/search/SearchRankingFragment;

    invoke-direct {p2, v0, p1}, Lcom/join/mgps/activity/search/SearchRankingFragment$SearchRankingHolder;-><init>(Lcom/join/mgps/activity/search/SearchRankingFragment;Landroid/view/View;)V

    return-object p2
.end method
