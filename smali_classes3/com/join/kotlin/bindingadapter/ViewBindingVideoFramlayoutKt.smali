.class public final Lcom/join/kotlin/bindingadapter/ViewBindingVideoFramlayoutKt;
.super Ljava/lang/Object;
.source "ViewBindingVideoFramlayout.kt"


# direct methods
.method public static synthetic a(Lcom/join/android/app/component/video/c;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/bindingadapter/ViewBindingVideoFramlayoutKt;->loadVideoUrl$lambda$0(Lcom/join/android/app/component/video/c;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/join/mgps/Util/IntentDateBean;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/join/kotlin/bindingadapter/ViewBindingVideoFramlayoutKt;->setvideoTag$lambda$1(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/join/mgps/Util/IntentDateBean;Landroid/view/View;)V

    return-void
.end method

.method public static final loadVideoUrl(Landroid/widget/FrameLayout;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;Lcom/join/android/app/component/video/c;Lcom/join/mgps/Util/IntentDateBean;)V
    .locals 5
    .param p0    # Landroid/widget/FrameLayout;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Lcom/join/kotlin/ui/modleregin/modle/VideoModle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/android/app/component/video/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/Util/IntentDateBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/databinding/BindingAdapter;
        requireAll = false
        value = {
            "videoData",
            "videoHelper",
            "intentData"
        }
    .end annotation

    const-string v0, "frameLayout"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "videoData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "videoHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getVideoUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    return-void

    .line 2
    :cond_2
    new-instance v0, Lcom/join/android/app/component/video/c$l;

    .line 3
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getPosition()I

    move-result v2

    .line 4
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getVideoUrl()Ljava/lang/String;

    move-result-object v3

    .line 5
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getVideoCover()Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-direct {v0, v2, v3, v4, p3}, Lcom/join/android/app/component/video/c$l;-><init>(ILjava/lang/String;Ljava/lang/String;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 7
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getPosition()I

    move-result v2

    new-array v1, v1, [Z

    invoke-virtual {p2, v2, v0, v1}, Lcom/join/android/app/component/video/c;->e(ILcom/join/android/app/component/video/c$l;[Z)V

    .line 8
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getPosition()I

    move-result v0

    invoke-virtual {p2, v0, p0}, Lcom/join/android/app/component/video/c;->R(ILandroid/widget/FrameLayout;)V

    if-nez p3, :cond_3

    .line 9
    new-instance p3, Lq1/b;

    invoke-direct {p3, p2, p1}, Lq1/b;-><init>(Lcom/join/android/app/component/video/c;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;)V

    invoke-virtual {p0, p3}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    :cond_3
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "loadVideoUrl position= "

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "MyListViewVideoHelper"

    invoke-static {p1, p0}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static final loadVideoUrl$lambda$0(Lcom/join/android/app/component/video/c;Lcom/join/kotlin/ui/modleregin/modle/VideoModle;Landroid/view/View;)V
    .locals 0

    const-string p2, "$videoHelper"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$videoData"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p1}, Lcom/join/kotlin/ui/modleregin/modle/VideoModle;->getPosition()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/join/android/app/component/video/c;->F(I)V

    return-void
.end method

.method public static final setvideoTag(Lcom/facebook/drawee/view/SimpleDraweeView;ILcom/join/android/app/component/video/c;Lcom/join/mgps/Util/IntentDateBean;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/facebook/drawee/view/SimpleDraweeView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/join/android/app/component/video/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/join/mgps/Util/IntentDateBean;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Landroidx/databinding/BindingAdapter;
        requireAll = false
        value = {
            "setVideoTag",
            "videoHelper",
            "intentData",
            "loadCover"
        }
    .end annotation

    const-string v0, "simpleDraweeView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lcom/facebook/drawee/view/DraweeView;->getHierarchy()Lo0/b;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/generic/a;

    invoke-virtual {v0}, Lcom/facebook/drawee/generic/a;->l()Lcom/facebook/drawee/drawable/r$c;

    move-result-object v0

    .line 2
    invoke-static {p0, p4, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->i(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    .line 3
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "setvideoTag setVideoTag= "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    const-string v0, "MyListViewVideoHelper"

    invoke-static {v0, p4}, Lcom/join/mgps/Util/v0;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p0, p4}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    if-eqz p2, :cond_0

    .line 5
    invoke-virtual {p2, p1, p0}, Lcom/join/android/app/component/video/c;->S(ILcom/facebook/drawee/view/SimpleDraweeView;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 6
    new-instance p1, Lq1/a;

    invoke-direct {p1, p0, p3}, Lq1/a;-><init>(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/join/mgps/Util/IntentDateBean;)V

    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    return-void
.end method

.method private static final setvideoTag$lambda$1(Lcom/facebook/drawee/view/SimpleDraweeView;Lcom/join/mgps/Util/IntentDateBean;Landroid/view/View;)V
    .locals 0

    const-string p2, "$simpleDraweeView"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p2, p0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
