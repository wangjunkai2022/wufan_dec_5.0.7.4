.class public final Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;
.super Lcom/chad/library/adapter/base/BaseQuickAdapter;
.source "GameDetailCommentAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/chad/library/adapter/base/BaseQuickAdapter<",
        "Lcom/join/kotlin/discount/model/bean/CommentDetailBean;",
        "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameDetailCommentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCommentAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailCommentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameDetailCommentAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameDetailCommentAdapter.kt\ncom/join/kotlin/discount/adapter/GameDetailCommentAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"
    }
.end annotation


# instance fields
.field private click:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method


# virtual methods
.method public final getClick()Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;->click:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;->onBindViewHolder(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/CommentDetailBean;)V

    return-void
.end method

.method protected onBindViewHolder(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/CommentDetailBean;)V
    .locals 8
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/CommentDetailBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;",
            ">;I",
            "Lcom/join/kotlin/discount/model/bean/CommentDetailBean;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->h(Lcom/join/kotlin/discount/model/bean/CommentDetailBean;)V

    .line 3
    :goto_0
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;->click:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    invoke-virtual {p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->g(Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;)V

    .line 4
    :goto_1
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    const/16 v0, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz p2, :cond_8

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->i:Landroid/widget/TextView;

    if-eqz p2, :cond_8

    if-eqz p3, :cond_6

    .line 5
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getTags()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_6

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/discount/model/bean/CommentTagBean;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/CommentTagBean;->getType()Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v1, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v6, 0x0

    :goto_3
    if-eqz v6, :cond_2

    goto :goto_4

    :cond_5
    move-object v5, v2

    :goto_4
    check-cast v5, Lcom/join/kotlin/discount/model/bean/CommentTagBean;

    goto :goto_5

    :cond_6
    move-object v5, v2

    :goto_5
    if-eqz v5, :cond_7

    .line 6
    invoke-virtual {v5}, Lcom/join/kotlin/discount/model/bean/CommentTagBean;->getText()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    invoke-virtual {p2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_6

    .line 8
    :cond_7
    invoke-virtual {p2, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9
    :cond_8
    :goto_6
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    if-eqz p2, :cond_f

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->g:Landroid/widget/ImageView;

    if-eqz p2, :cond_f

    if-eqz p3, :cond_d

    .line 10
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getTags()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/join/kotlin/discount/model/bean/CommentTagBean;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lcom/join/kotlin/discount/model/bean/CommentTagBean;->getType()Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x2

    if-nez v6, :cond_a

    goto :goto_7

    :cond_a
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-ne v6, v7, :cond_b

    const/4 v6, 0x1

    goto :goto_8

    :cond_b
    :goto_7
    const/4 v6, 0x0

    :goto_8
    if-eqz v6, :cond_9

    goto :goto_9

    :cond_c
    move-object v5, v2

    :goto_9
    check-cast v5, Lcom/join/kotlin/discount/model/bean/CommentTagBean;

    goto :goto_a

    :cond_d
    move-object v5, v2

    :goto_a
    if-eqz v5, :cond_e

    .line 11
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_b

    .line 12
    :cond_e
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 13
    :cond_f
    :goto_b
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    if-eqz p2, :cond_16

    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->h:Landroid/widget/ImageView;

    if-eqz p2, :cond_16

    if-eqz p3, :cond_14

    .line 14
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getTags()Ljava/util/List;

    move-result-object p3

    if-eqz p3, :cond_14

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_10
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/join/kotlin/discount/model/bean/CommentTagBean;

    if-eqz v5, :cond_12

    invoke-virtual {v5}, Lcom/join/kotlin/discount/model/bean/CommentTagBean;->getType()Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x3

    if-nez v5, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v6, :cond_12

    const/4 v5, 0x1

    goto :goto_d

    :cond_12
    :goto_c
    const/4 v5, 0x0

    :goto_d
    if-eqz v5, :cond_10

    goto :goto_e

    :cond_13
    move-object v4, v2

    :goto_e
    check-cast v4, Lcom/join/kotlin/discount/model/bean/CommentTagBean;

    goto :goto_f

    :cond_14
    move-object v4, v2

    :goto_f
    if-eqz v4, :cond_15

    .line 15
    invoke-virtual {p2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_10

    .line 16
    :cond_15
    invoke-virtual {p2, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 17
    :cond_16
    :goto_10
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p2

    invoke-virtual {p0}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->getItemCount()I

    move-result p3

    sub-int/2addr p3, v1

    if-lt p2, p3, :cond_19

    .line 18
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    if-eqz p1, :cond_17

    iget-object v2, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->d:Landroid/view/View;

    :cond_17
    if-nez v2, :cond_18

    goto :goto_11

    :cond_18
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_11

    .line 19
    :cond_19
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;

    if-eqz p1, :cond_1a

    iget-object v2, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->d:Landroid/view/View;

    :cond_1a
    if-nez v2, :cond_1b

    goto :goto_11

    :cond_1b
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_11
    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;->onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method protected onCreateViewHolder(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/view/ViewGroup;",
            "I)",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "parent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    const p3, 0x7f0c03b5

    invoke-direct {p1, p3, p2}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;-><init>(ILandroid/view/ViewGroup;)V

    return-object p1
.end method

.method public final setClick(Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/kotlin/discount/adapter/GameDetailCommentAdapter;->click:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    return-void
.end method
