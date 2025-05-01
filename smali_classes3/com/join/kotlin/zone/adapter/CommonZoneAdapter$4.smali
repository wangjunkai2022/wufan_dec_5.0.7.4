.class public final Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;
.super Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;
.source "CommonZoneAdapter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;-><init>(Lcom/join/android/app/component/video/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl<",
        "Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;",
        "Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic $videoHelper:Lcom/join/android/app/component/video/g;

.field final synthetic this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/video/g;Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;)V
    .locals 0

    iput-object p1, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;->$videoHelper:Lcom/join/android/app/component/video/g;

    iput-object p2, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    const p1, 0x7f0c0380

    .line 1
    invoke-direct {p0, p1}, Lcom/join/kotlin/base/impl/OnMultiItemAdapterListenerImpl;-><init>(I)V

    return-void
.end method


# virtual methods
.method public isFullSpanItem(I)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public bridge synthetic onBind(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;

    check-cast p3, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;

    invoke-virtual {p0, p1, p2, p3}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;->onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V

    return-void
.end method

.method public onBind(Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;ILcom/join/kotlin/zone/model/bean/ZoneMultiEntry;)V
    .locals 9
    .param p1    # Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/chad/library/adapter/base/viewholder/DataBindingHolder<",
            "Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;",
            ">;I",
            "Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;",
            ")V"
        }
    .end annotation

    const-string p2, "holder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p2

    check-cast p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;

    if-eqz p2, :cond_3

    iget-object v0, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;->$videoHelper:Lcom/join/android/app/component/video/g;

    iget-object v1, p0, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4;->this$0:Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;

    const/4 v2, 0x0

    if-eqz p3, :cond_0

    .line 3
    invoke-virtual {p3}, Lcom/join/kotlin/zone/model/bean/ZoneMultiEntry;->dataVal()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/join/mgps/dto/CommonGameInfoBean;

    goto :goto_0

    :cond_0
    move-object p3, v2

    :goto_0
    invoke-virtual {p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;->f(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 4
    invoke-virtual {p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;->c()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p3

    if-eqz p3, :cond_3

    .line 5
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_1

    const-string v4, "g_info"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object p2, p2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;->b:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v3

    invoke-virtual {v1, p2, v4, v3}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;->addTags(Landroid/widget/LinearLayout;Ljava/util/List;Lcom/join/mgps/dto/TipNew;)V

    .line 7
    :cond_1
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 8
    invoke-virtual {p1}, Lcom/chad/library/adapter/base/viewholder/DataBindingHolder;->a()Landroidx/databinding/ViewDataBinding;

    move-result-object p1

    check-cast p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;

    iget-object p1, p1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommonZoneGameInfoBottomCardVideoBinding;->f:Lcom/join/android/app/component/video/MultiStandVideo;

    const-string p2, "holder.binding.wfVideo"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {v0}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object v2

    :cond_2
    invoke-virtual {p1, v2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 11
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->hashCode()I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 12
    invoke-virtual {p3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, ""

    move-object v3, p1

    invoke-virtual/range {v3 .. v8}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    const/4 p2, 0x0

    .line 13
    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    const/4 v0, 0x1

    .line 14
    invoke-virtual {p1, v0}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 15
    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 16
    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 17
    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 18
    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    .line 19
    new-instance p2, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;

    invoke-direct {p2, v1, p3}, Lcom/join/kotlin/zone/adapter/CommonZoneAdapter$4$onBind$1$1$2;-><init>(Lcom/join/kotlin/zone/adapter/CommonZoneAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {p1, p2}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    :cond_3
    return-void
.end method
