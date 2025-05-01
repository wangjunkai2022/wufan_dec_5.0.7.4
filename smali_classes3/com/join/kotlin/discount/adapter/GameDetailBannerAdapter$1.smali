.class public final Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$1;
.super Ljava/lang/Object;
.source "GameDetailBannerAdapter.kt"

# interfaces
.implements Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b<",
        "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
        "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isFullSpanItem(I)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->a(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;I)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$1;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;)V

    return-void
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V
    .locals 0

    .line 2
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$1;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;Ljava/util/List;)V

    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;)V
    .locals 6
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;",
            ">;I",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    if-eqz p3, :cond_0

    .line 4
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;->getData()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    instance-of v0, v0, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    if-eqz v0, :cond_b

    .line 5
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;

    if-eqz p1, :cond_1

    iget-object p2, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;->b:Lcom/join/android/app/component/video/MultiStandVideo;

    .line 6
    :cond_1
    invoke-virtual {p3}, Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;->getData()Ljava/lang/Object;

    move-result-object p1

    const-string p3, "null cannot be cast to non-null type com.join.kotlin.discount.model.bean.GameDetailPicAndVideoInfoBean"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    const-string p3, "detailBanner"

    .line 7
    invoke-virtual {p2, p3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    :goto_1
    if-eqz p2, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getVideo_cover()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    :cond_3
    if-eqz p2, :cond_4

    .line 9
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/GameDetailPicAndVideoInfoBean;->getVideo_url()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, ""

    move-object v0, p2

    .line 10
    invoke-virtual/range {v0 .. v5}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    :cond_4
    const/4 p1, 0x0

    if-eqz p2, :cond_5

    .line 11
    invoke-virtual {p2, p1}, Lcom/join/android/app/component/video/MultiStandVideo;->setMute(Z)V

    :cond_5
    if-nez p2, :cond_6

    goto :goto_2

    .line 12
    :cond_6
    invoke-virtual {p2, p1}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    :goto_2
    if-nez p2, :cond_7

    goto :goto_3

    :cond_7
    const/4 p3, 0x1

    .line 13
    invoke-virtual {p2, p3}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    :goto_3
    if-nez p2, :cond_8

    goto :goto_4

    .line 14
    :cond_8
    invoke-virtual {p2, p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    :goto_4
    if-eqz p2, :cond_9

    .line 15
    invoke-virtual {p2, p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    :cond_9
    if-nez p2, :cond_a

    goto :goto_5

    .line 16
    :cond_a
    invoke-virtual {p2, p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    :cond_b
    :goto_5
    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;Ljava/util/List;)V
    .locals 0
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;",
            ">;I",
            "Lcom/join/kotlin/discount/model/bean/GameDetailBannerEntityBean;",
            "Ljava/util/List<",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 3
    invoke-static {p0, p1, p2, p3, p4}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->b(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/discount/adapter/GameDetailBannerAdapter$1;->onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreate(Landroid/content/Context;Landroid/view/ViewGroup;I)Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
    .locals 1
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
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string p3, "context"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "parent"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p3, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x0

    .line 4
    invoke-static {p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerVideoBinding;

    move-result-object p1

    .line 5
    invoke-direct {p3, p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;-><init>(Landroidx/databinding/ViewDataBinding;)V

    return-object p3
.end method

.method public onFailedToRecycleView(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->c(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)Z

    move-result p1

    return p1
.end method

.method public onViewAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->d(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->e(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method

.method public onViewRecycled(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p0, p1}, Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b$a;->f(Lcom/chad/library/adapter/base/BaseMultiItemAdapter$b;Landroidx/recyclerview/widget/RecyclerView$ViewHolder;)V

    return-void
.end method
