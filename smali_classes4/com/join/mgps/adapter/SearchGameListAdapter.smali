.class public Lcom/join/mgps/adapter/SearchGameListAdapter;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "SearchGameListAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/SearchGameListAdapter$g;,
        Lcom/join/mgps/adapter/SearchGameListAdapter$f;,
        Lcom/join/mgps/adapter/SearchGameListAdapter$h;,
        Lcom/join/mgps/adapter/SearchGameListAdapter$i;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/adapter/SearchGameListAdapter$i;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private d:Landroid/content/Context;

.field private e:Ljava/lang/String;

.field f:Lcom/join/android/app/component/video/g;

.field private g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/android/app/component/video/g;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 2
    iput-object v0, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    .line 3
    iput-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    .line 4
    iput-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->f:Lcom/join/android/app/component/video/g;

    const/4 p1, 0x1

    const p2, 0x7f0c05ec

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x2

    const p2, 0x7f0c05eb

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x3

    const p2, 0x7f0c05ee

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x4

    const p2, 0x7f0c05ed

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x5

    const p2, 0x7f0c05e9

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x6

    const p2, 0x7f0c05e8

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x7

    const p2, 0x7f0c0400

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xe

    const p2, 0x7f0c0401

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xb

    const p2, 0x7f0c0405

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xc

    const v0, 0x7f0c0406

    .line 14
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0x8

    const v1, 0x7f0c02f8

    .line 15
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0x9

    const v1, 0x7f0c05e5

    .line 16
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xa

    const v1, 0x7f0c05e7

    .line 17
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xd

    const v1, 0x7f0c0408

    .line 18
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xf

    const v1, 0x7f0c0407

    .line 19
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0x10

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0x11

    .line 21
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    return-void
.end method

.method private A(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 9

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    const v1, 0x7f090949

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f09094a

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    .line 6
    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x0

    .line 7
    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x1

    const-string v7, "#00000000"

    const/4 v8, 0x2

    if-eqz v5, :cond_1

    new-array v5, v8, [I

    .line 9
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v7

    aput v7, v5, v4

    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    aput v0, v5, v6

    invoke-virtual {v3, v5}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    goto :goto_0

    :cond_1
    new-array v0, v8, [I

    .line 10
    invoke-static {v7}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    aput v5, v0, v4

    const-string v4, "#99000000"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    aput v4, v0, v6

    invoke-virtual {v3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 11
    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz v2, :cond_2

    .line 12
    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->K(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    return-void
.end method

.method private B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 13

    const-string v0, "#"

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v1

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v2

    const-string v3, ""

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_5

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f090e0a

    invoke-virtual {p1, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    invoke-virtual {p1, v7}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    sget-object v7, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v6, v7, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const v6, 0x7f091101

    .line 7
    invoke-virtual {p1, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    new-instance v8, Lcom/join/mgps/adapter/a5;

    invoke-direct {v8, p0, v2, p2}, Lcom/join/mgps/adapter/a5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 9
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    const v8, 0x7f09120b

    if-eqz v7, :cond_1

    .line 10
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v7

    .line 11
    invoke-virtual {p1, v8}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v8, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getPic_info()Ljava/util/List;

    move-result-object v7

    .line 13
    invoke-static {v3}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_2

    if-eqz v7, :cond_2

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    if-lez v9, :cond_2

    .line 14
    invoke-interface {v7, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    .line 15
    invoke-virtual {p1, v8}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v8, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :cond_2
    :goto_0
    const v7, 0x7f0906da

    .line 16
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getGift_package_switch()I

    move-result v8

    if-ne v8, v4, :cond_3

    const/4 v8, 0x1

    goto :goto_1

    :cond_3
    const/4 v8, 0x0

    :goto_1
    invoke-virtual {p1, v7, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    const-wide/16 v9, 0x0

    const v11, 0x7f091673

    cmpl-double v12, v7, v9

    if-lez v12, :cond_4

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->showScore()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 18
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p1, v11, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 19
    invoke-virtual {p1, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 20
    :cond_4
    invoke-virtual {p1, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_2
    const v7, 0x7f091607

    .line 21
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v8

    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->L1(Lcom/join/mgps/dto/TipNew;Ljava/util/List;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p1, v7, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 22
    invoke-virtual {v2}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v7

    invoke-virtual {p1, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v7, v6, v1}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const v1, 0x7f09109f

    .line 23
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    new-instance v6, Lcom/join/mgps/adapter/SearchGameListAdapter$h;

    invoke-direct {v6, p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$h;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v1, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_5
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    const v1, 0x7f09180f

    .line 25
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v1, :cond_6

    .line 26
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    .line 27
    iget-object v6, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->f:Lcom/join/android/app/component/video/g;

    invoke-virtual {v6}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->hashCode()I

    move-result v6

    invoke-virtual {v1, v6}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 29
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, ""

    move-object v6, v1

    .line 30
    invoke-virtual/range {v6 .. v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    .line 31
    invoke-virtual {v1, v5}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    .line 32
    invoke-virtual {v1, v4}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 33
    invoke-virtual {v1, v5}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 34
    invoke-virtual {v1, v5}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 35
    invoke-virtual {v1, v5}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 36
    invoke-virtual {v1, v5}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    .line 37
    new-instance v6, Lcom/join/mgps/adapter/SearchGameListAdapter$a;

    invoke-direct {v6, p0, v2, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$a;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v1, v6}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 38
    :cond_6
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v1

    const v2, 0x7f090cda

    if-eqz v1, :cond_8

    .line 39
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 40
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 41
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    :cond_8
    const-string v0, "#994558"

    .line 43
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 44
    :goto_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getRequestStatus()I

    move-result v0

    const/16 v1, 0x2f

    const v2, 0x7f090fea

    const v6, 0x7f090e0d

    if-ne v0, v1, :cond_9

    .line 45
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 46
    invoke-virtual {p1, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_4

    .line 47
    :cond_9
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 48
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isSingleGame()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p2

    const/16 v0, 0xb

    if-ne p2, v0, :cond_a

    const-string p2, "\u5b89\u88c5"

    .line 49
    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_4

    :cond_a
    const-string p2, "\u6253\u5f00"

    .line 50
    invoke-virtual {p1, v6, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    :goto_4
    return-void
.end method

.method private C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->J(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    return-void
.end method

.method private D(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 5

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    if-eqz p2, :cond_3

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getPd_info()Lcom/join/mgps/dto/DomainInfoBean;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->isHasExposure()Z

    move-result v1

    if-nez v1, :cond_1

    .line 5
    iget-object v1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-static {v1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v1

    sget-object v2, Lcom/papa/sim/statistic/Event;->pdGameWish:Lcom/papa/sim/statistic/Event;

    new-instance v3, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v3}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    const-string v4, "1"

    invoke-virtual {v3, v4}, Lcom/papa/sim/statistic/Ext;->setIsResultPage(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    const/4 v1, 0x1

    .line 6
    invoke-virtual {p2, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setHasExposure(Z)V

    :cond_1
    const p2, 0x7f09120b

    .line 7
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-eqz p2, :cond_2

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getPic()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 9
    :cond_2
    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 10
    :try_start_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/DomainInfoBean;->getInfo()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 11
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/WxProgram;

    invoke-virtual {v1, p2, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/WxProgram;

    if-eqz p2, :cond_3

    .line 12
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/adapter/e5;

    invoke-direct {v1, p0, p2, v0}, Lcom/join/mgps/adapter/e5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/WxProgram;Lcom/join/mgps/dto/DomainInfoBean;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_3
    :goto_0
    return-void
.end method

.method private E(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "#"

    if-nez p2, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 3
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    .line 4
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    const v6, 0x7f0906da

    const v7, 0x7f09109f

    const-string v8, ""

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v5, :cond_5

    .line 5
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v11

    const v12, 0x7f090e0a

    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    sget-object v12, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {v11, v12, v10}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    const v11, 0x7f091101

    .line 7
    invoke-virtual {v2, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v12

    new-instance v13, Lcom/join/mgps/adapter/d5;

    invoke-direct {v13, v1, v5, v3}, Lcom/join/mgps/adapter/d5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v12, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 8
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGameAdVideoUrl()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_2

    .line 9
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGAmeAdPic()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v12

    const v13, 0x7f09120b

    if-eqz v12, :cond_1

    .line 10
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGAmeAdPic()Ljava/lang/String;

    move-result-object v12

    .line 11
    invoke-virtual {v2, v13}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v13, v12}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPic_info()Ljava/util/List;

    move-result-object v12

    .line 13
    invoke-static {v8}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_2

    if-eqz v12, :cond_2

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v14

    if-lez v14, :cond_2

    .line 14
    invoke-interface {v12, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    .line 15
    invoke-virtual {v2, v13}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v13

    check-cast v13, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v13, v12}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 16
    :cond_2
    :goto_0
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getGift_package_switch()I

    move-result v12

    if-ne v12, v9, :cond_3

    const/4 v12, 0x1

    goto :goto_1

    :cond_3
    const/4 v12, 0x0

    :goto_1
    invoke-virtual {v2, v6, v12}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    const-wide/16 v14, 0x0

    const v6, 0x7f091673

    cmpl-double v16, v12, v14

    if-lez v16, :cond_4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->showScore()Z

    move-result v12

    if-eqz v12, :cond_4

    .line 18
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v6, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 19
    invoke-virtual {v2, v6, v9}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 20
    :cond_4
    invoke-virtual {v2, v6, v10}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_2
    const v6, 0x7f091607

    .line 21
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v13

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->L1(Lcom/join/mgps/dto/TipNew;Ljava/util/List;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v6, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 22
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v6

    invoke-virtual {v2, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    invoke-static {v6, v11, v4}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 23
    invoke-virtual {v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    new-instance v11, Lcom/join/mgps/adapter/SearchGameListAdapter$h;

    invoke-direct {v11, v1, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter$h;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v6, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    :cond_5
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGameAdVideoUrl()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    const v6, 0x7f09180f

    .line 25
    invoke-virtual {v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v6, :cond_6

    .line 26
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGAmeAdPic()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    .line 27
    iget-object v11, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->f:Lcom/join/android/app/component/video/g;

    invoke-virtual {v11}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v6, v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 28
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->hashCode()I

    move-result v11

    invoke-virtual {v6, v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 29
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getOnlineGameAdVideoUrl()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v16, ""

    move-object v11, v6

    .line 30
    invoke-virtual/range {v11 .. v16}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    .line 31
    invoke-virtual {v6, v10}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    .line 32
    invoke-virtual {v6, v9}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 33
    invoke-virtual {v6, v10}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 34
    invoke-virtual {v6, v10}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 35
    invoke-virtual {v6, v10}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 36
    invoke-virtual {v6, v10}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    .line 37
    new-instance v11, Lcom/join/mgps/adapter/SearchGameListAdapter$b;

    invoke-direct {v11, v1, v5, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter$b;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v6, v11}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    .line 38
    :cond_6
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    const v11, 0x7f090cda

    if-eqz v6, :cond_8

    .line 39
    :try_start_0
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 40
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 41
    :cond_7
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBg_color()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_3

    :cond_8
    const-string v0, "#994558"

    .line 43
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 44
    :goto_3
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v11, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v11}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v11

    invoke-virtual {v6, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v6, 0x7f060412

    const v11, 0x7f080c54

    const v12, 0x7f090e0d

    if-eqz v0, :cond_9

    .line 45
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5f00\u59cb"

    .line 46
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 47
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    const v4, 0x7f0906da

    .line 48
    invoke-virtual {v2, v4, v10}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    :cond_9
    const v0, 0x7f1000f7

    if-nez v4, :cond_d

    .line 49
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v4, v13}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 50
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 51
    iget-object v4, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    iget-object v13, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4, v13, v14}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 52
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v4, v13}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_b

    .line 53
    iget-object v4, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-static {v4}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    iget-object v7, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4, v7, v13}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v4

    .line 54
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-virtual {v4}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v4, v5, :cond_a

    .line 55
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u66f4\u65b0"

    .line 56
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 57
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    .line 58
    :cond_a
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 59
    iget-object v4, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 60
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    .line 61
    :cond_b
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 62
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 63
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v0, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->a3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_6

    .line 64
    :cond_c
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 65
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    goto/16 :goto_6

    .line 66
    :cond_d
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v13

    .line 67
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v14

    const-wide/high16 v16, 0x4090000000000000L    # 1024.0

    mul-double v14, v14, v16

    mul-double v14, v14, v16

    double-to-long v14, v14

    .line 68
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v10

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v10, v9}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v9

    const/16 v10, 0x2b

    if-lez v9, :cond_e

    const/16 v13, 0x2b

    :cond_e
    if-eqz v13, :cond_14

    const/16 v9, 0x1b

    if-eq v13, v9, :cond_13

    const/16 v9, 0x30

    if-eq v13, v9, :cond_12

    const/4 v9, 0x2

    const v7, 0x7f090d81

    const-string v0, "/"

    const v6, 0x7f0900f1

    if-eq v13, v9, :cond_11

    const/4 v9, 0x3

    if-eq v13, v9, :cond_10

    const/4 v9, 0x5

    if-eq v13, v9, :cond_f

    const/4 v9, 0x6

    if-eq v13, v9, :cond_10

    const/4 v9, 0x7

    if-eq v13, v9, :cond_14

    const/16 v9, 0x2a

    if-eq v13, v9, :cond_f

    if-eq v13, v10, :cond_14

    packed-switch v13, :pswitch_data_0

    goto/16 :goto_6

    .line 69
    :pswitch_0
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v5, v9}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 70
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 71
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f091051

    .line 72
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 73
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b"

    .line 74
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 75
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060412

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    .line 76
    :pswitch_1
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v5, v9}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 77
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d.."

    .line 78
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f091051

    .line 79
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 80
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 81
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 82
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f060412

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    :pswitch_2
    const v5, 0x7f060412

    .line 83
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5"

    .line 84
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 85
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 86
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_6

    :pswitch_3
    const v5, 0x7f060412

    .line 87
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v9, "\u7b49\u5f85"

    .line 88
    invoke-virtual {v2, v12, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 89
    iget-object v9, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v9

    invoke-virtual {v9, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 90
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v5, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 91
    :try_start_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 92
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 94
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    .line 95
    :pswitch_4
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u66f4\u65b0"

    .line 96
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 97
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060412

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 98
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_6

    .line 99
    :cond_f
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 100
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f1000f7

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 101
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060412

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 102
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_6

    .line 103
    :cond_10
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v5, "\u7ee7\u7eed"

    .line 104
    invoke-virtual {v2, v12, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 105
    iget-object v5, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v9, 0x7f060412

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 106
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v5, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 107
    :try_start_2
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 108
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_5
    const-string v0, "\u6682\u505c\u4e2d"

    .line 110
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_6

    .line 111
    :cond_11
    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 112
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v5, "\u6682\u505c"

    .line 113
    invoke-virtual {v2, v12, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 114
    iget-object v5, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v9, 0x7f060412

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v12, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 115
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v5, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 116
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v9

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/S"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 118
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_6

    .line 119
    :cond_12
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 120
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 121
    iget-object v0, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060412

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 122
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto :goto_6

    :cond_13
    const-string v0, "\u6682\u505c\u4e2d"

    .line 123
    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_6

    .line 124
    :cond_14
    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 125
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 126
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v0, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->a3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    .line 127
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 128
    :goto_6
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getRequestStatus()I

    move-result v0

    const/16 v3, 0x2f

    const v4, 0x7f090fea

    if-ne v0, v3, :cond_15

    const/4 v3, 0x1

    .line 129
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 130
    invoke-virtual {v2, v12, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_7

    :cond_15
    const/4 v3, 0x0

    .line 131
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_7
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 3

    const-string v0, "0"

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;

    if-eqz p2, :cond_0

    const v1, 0x7f090603

    .line 2
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getView()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/join/mgps/Util/j0;->D1(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    const v1, 0x7f0905f2

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getComment()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/join/mgps/Util/j0;->D1(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    const v1, 0x7f0905fc

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getPraise()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/join/mgps/Util/j0;->D1(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getPid()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f090311

    .line 6
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->a0(Landroid/view/View;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private G(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;

    if-eqz p2, :cond_2

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getKeyword()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v3, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0603bb

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    add-int/2addr v1, v4

    .line 8
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v1, v0, :cond_0

    if-ltz v4, :cond_0

    .line 9
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v3, 0x21

    invoke-virtual {v2, v0, v4, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 11
    :cond_0
    :goto_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getPid()Ljava/lang/String;

    move-result-object v0

    .line 12
    new-instance v1, Lcom/join/mgps/adapter/f5;

    invoke-direct {v1, p0, v0}, Lcom/join/mgps/adapter/f5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Ljava/lang/String;)V

    const v0, 0x7f090e05

    .line 13
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v1, 0x7f0905f8

    .line 14
    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 15
    :try_start_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->isShowDivider()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    const-string p2, "#3b3b3b"

    .line 16
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 v3, 0x1

    invoke-virtual {p2, v2, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 18
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v2, 0x7f0712a5

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    goto :goto_1

    :cond_1
    const-string p2, "#FF4A4A4A"

    .line 19
    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, v1, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 20
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-virtual {p2, v3, v2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 21
    :goto_1
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroid/widget/LinearLayout$LayoutParams;

    .line 22
    iput v2, p2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 23
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-exception p2

    .line 24
    :try_start_4
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 25
    :goto_2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_3

    :catch_2
    move-exception p1

    .line 26
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_3
    return-void
.end method

.method private H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;

    if-nez p2, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getSubject()Ljava/lang/String;

    move-result-object v0

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getKeyword()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/join/mgps/Util/g2;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 4
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 5
    iget-object v3, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0603bb

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 6
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    .line 7
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    add-int/2addr v1, v4

    .line 8
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v1, v0, :cond_1

    if-ltz v4, :cond_1

    .line 9
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v3, 0x21

    invoke-virtual {v2, v0, v4, v1, v3}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 10
    :try_start_2
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_0
    const v0, 0x7f090601

    .line 11
    invoke-virtual {p1, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    invoke-virtual {p2}, Lcom/join/mgps/dto/ForumBean$ForumSearchQueryBean;->getPid()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f090d28

    .line 13
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->a0(Landroid/view/View;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    .line 14
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method

.method private I(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;

    const v0, 0x7f09078d

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;->getIcon_src()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;->getName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090ea1

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;->getDescription()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0903f9

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u4eca\u65e5\u66f4\u65b0:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;->getToday_posts()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0903b5

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090311

    .line 6
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/adapter/g5;

    invoke-direct {v0, p2}, Lcom/join/mgps/adapter/g5;-><init>(Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object v0

    const-string v1, ""

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getStatistics()Lcom/join/mgps/dto/StatisticsBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/StatisticsBean;->getMin_game_search_source()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v1
.end method

.method private synthetic P(ILandroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    check-cast p2, Lcom/join/mgps/activity/SearchListActivity1;

    invoke-virtual {p2, p1}, Lcom/join/mgps/activity/SearchListActivity1;->L0(I)V

    return-void
.end method

.method private synthetic Q(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getSp_tpl_two_position()I

    move-result v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v6

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v7

    sget-object p3, Lcom/papa/sim/statistic/Where;->search:Lcom/papa/sim/statistic/Where;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v1 .. v10}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->e(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private synthetic R(Lcom/join/mgps/dto/WxProgram;Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 1
    iget-object p3, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-static {p3}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p3

    sget-object v0, Lcom/papa/sim/statistic/Event;->pdGameWishClick:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getAb_test_number()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setTestAbNumber(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    const-string v2, "1"

    invoke-virtual {v1, v2}, Lcom/papa/sim/statistic/Ext;->setIsResultPage(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object v1

    invoke-virtual {p2}, Lcom/join/mgps/dto/DomainInfoBean;->getIs_join()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/papa/sim/statistic/Ext;->setIsJoin(Ljava/lang/String;)Lcom/papa/sim/statistic/Ext;

    move-result-object p2

    invoke-virtual {p3, v0, p2}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    const-string p2, "game_search_wish"

    .line 2
    invoke-virtual {p1, p2}, Lcom/join/mgps/dto/WxProgram;->setSceneType(Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->g4(Landroid/content/Context;Lcom/join/mgps/dto/WxProgram;)V

    :cond_0
    return-void
.end method

.method private synthetic S(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getSp_tpl_two_position()I

    move-result v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v6

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v7

    sget-object p3, Lcom/papa/sim/statistic/Where;->search:Lcom/papa/sim/statistic/Where;

    invoke-virtual {p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v1 .. v10}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->e(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private synthetic T(Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->X(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic U(Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;Landroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/dto/ForumBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean;-><init>()V

    .line 2
    invoke-virtual {p0}, Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;->getFid()I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/join/mgps/dto/ForumBean;->setFid(I)V

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0, v0}, Lcom/join/mgps/Util/j0;->r0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean;)V

    return-void
.end method

.method private synthetic V(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getSp_tpl_two_position()I

    move-result v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v6

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v1 .. v10}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->e(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private synthetic W(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v1

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getGame_info_tpl_type()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getSp_tpl_two_position()I

    move-result v5

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v6

    invoke-virtual {p2}, Lcom/join/mgps/dto/DownloadPointBase;->getReMarks()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {v1 .. v10}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivity(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    if-eqz p2, :cond_0

    .line 4
    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->e(Ljava/lang/String;)V

    .line 5
    iget-object p2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    invoke-virtual {p1}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter$f;->k(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->Q(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/WxProgram;Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->R(Lcom/join/mgps/dto/WxProgram;Lcom/join/mgps/dto/DomainInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->V(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/join/mgps/adapter/SearchGameListAdapter;Ljava/lang/String;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->T(Ljava/lang/String;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->W(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->U(Lcom/join/mgps/dto/SearchIntegratedPostBean$TopArea;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->S(Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/join/mgps/adapter/SearchGameListAdapter;ILandroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->P(ILandroid/view/View;)V

    return-void
.end method

.method static synthetic p(Lcom/join/mgps/adapter/SearchGameListAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic q(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(Lcom/join/mgps/adapter/SearchGameListAdapter;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->e:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic s(Lcom/join/mgps/adapter/SearchGameListAdapter;)Lcom/join/mgps/adapter/SearchGameListAdapter$f;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    return-object p0
.end method

.method private u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 2
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 3
    instance-of v2, v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz v2, :cond_0

    .line 4
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 5
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    :cond_0
    const v0, 0x7f090ea1

    const v2, 0x7f09078d

    if-ne p2, v1, :cond_1

    const p2, 0x7f0807e7

    .line 6
    invoke-virtual {p1, v2, p2}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string p2, "\u672a\u641c\u7d22\u5230\u76f8\u5e94\u6e38\u620f\n\u5df2\u4e3a\u60a8\u63a8\u8350\u5176\u5b83\u6e38\u620f"

    .line 7
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    if-ne p2, v1, :cond_2

    const p2, 0x7f0807e5

    .line 8
    invoke-virtual {p1, v2, p2}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string p2, "\u672a\u641c\u7d22\u5230\u76f8\u5e94\u6e38\u620f\u5355\n\u5df2\u4e3a\u60a8\u63a8\u8350\u70ed\u95e8\u6e38\u620f\u5355"

    .line 9
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    if-ne p2, v1, :cond_3

    const p2, 0x7f0807e8

    .line 10
    invoke-virtual {p1, v2, p2}, Lcom/join/mgps/base/BaseViewHolder;->setImageResource(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string p2, "\u672a\u641c\u7d22\u5230\u76f8\u5e94\u793e\u533a\n\u5df2\u4e3a\u60a8\u63a8\u8350\u5176\u4ed6\u70ed\u95e8\u793e\u533a"

    .line 11
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    :cond_3
    :goto_0
    return-void
.end method

.method private v(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const v0, 0x7f090311

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/adapter/z4;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/z4;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private w(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;

    const v0, 0x7f09078d

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;->getPic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f090ea1

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;->getAuth_name()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0903f9

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;->getGame_count()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u6b3e"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const v1, 0x7f0903b5

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;->isShowDivider()Z

    move-result v0

    const v1, 0x7f09044b

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090311

    .line 7
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/adapter/SearchGameListAdapter$d;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$d;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/SearchIntegratedFavoriteBean$FavoriteBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "\u5305\u542b%s\u7684\u6e38\u620f\u5355"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    .line 2
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 3
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 4
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    const-string v2, "#FFF47500"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    invoke-direct {v0, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    const/4 v2, 0x2

    add-int/2addr p2, v2

    const/16 v3, 0x12

    invoke-virtual {v1, v0, v2, p2, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    const p2, 0x7f091461

    .line 5
    invoke-virtual {p1, p2, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method

.method private y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 0

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    instance-of p2, p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    if-eqz p2, :cond_0

    .line 3
    check-cast p1, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;

    const/4 p2, 0x1

    .line 4
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager$LayoutParams;->setFullSpan(Z)V

    :cond_0
    return-void
.end method

.method private z(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->L(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    return-void
.end method


# virtual methods
.method public J(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 22

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 3
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    .line 4
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    const-string v6, ""

    const/4 v7, 0x1

    const/4 v8, 0x0

    const v9, 0x7f090e0d

    if-eqz v5, :cond_16

    .line 5
    iget-object v10, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    .line 6
    iget-boolean v11, v0, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->d:Z

    const v12, 0x7f090c6b

    if-eqz v11, :cond_2

    .line 7
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    if-eqz v11, :cond_1

    .line 8
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroid/widget/RelativeLayout$LayoutParams;

    goto :goto_0

    .line 9
    :cond_1
    new-instance v11, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v13, -0x1

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    invoke-static {v7, v14, v15}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v14

    float-to-int v14, v14

    invoke-direct {v11, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 10
    :goto_0
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v14, 0x7f07128f

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v13

    iput v13, v11, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 11
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v13

    iput v13, v11, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 12
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    :cond_2
    iget-boolean v0, v0, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->d:Z

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090e0a

    .line 14
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 15
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    const v11, 0x7f090e0b

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {v2, v11, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 18
    :cond_3
    invoke-virtual {v2, v11, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    const v0, 0x7f091101

    .line 19
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    new-instance v12, Lcom/join/mgps/adapter/b5;

    invoke-direct {v12, v1, v5, v3}, Lcom/join/mgps/adapter/b5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v11, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v11

    const v12, 0x7f09120b

    if-eqz v11, :cond_4

    .line 21
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v11

    .line 22
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v12, v11}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_2

    .line 23
    :cond_4
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPic_info()Ljava/util/List;

    move-result-object v11

    .line 24
    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_5

    if-eqz v11, :cond_5

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v13

    if-lez v13, :cond_5

    .line 25
    invoke-interface {v11, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 26
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v12

    check-cast v12, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v12, v11}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 27
    :cond_5
    :goto_2
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getGift_package_switch()I

    move-result v11

    if-ne v11, v7, :cond_6

    const/4 v11, 0x1

    goto :goto_3

    :cond_6
    const/4 v11, 0x0

    :goto_3
    const v12, 0x7f0906da

    invoke-virtual {v2, v12, v11}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 28
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v13

    const-wide/high16 v15, 0x4090000000000000L    # 1024.0

    mul-double v13, v13, v15

    mul-double v13, v13, v15

    double-to-long v13, v13

    .line 29
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v15

    const-wide/16 v17, 0x0

    const v11, 0x7f091673

    cmpl-double v19, v15, v17

    if-lez v19, :cond_7

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->showScore()Z

    move-result v15

    if-eqz v15, :cond_7

    .line 30
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2, v11, v15}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 31
    invoke-virtual {v2, v11, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_4

    .line 32
    :cond_7
    invoke-virtual {v2, v11, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_4
    const v11, 0x7f091607

    .line 33
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v15

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v7

    invoke-static {v15, v7}, Lcom/join/mgps/Util/UtilsMy;->M1(Lcom/join/mgps/dto/TipNew;Ljava/util/List;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v11, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 34
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v7

    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v7, v0, v4}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 35
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->isCpsGame()Z

    move-result v0

    const v7, 0x7f1000f7

    if-eqz v0, :cond_8

    invoke-static {}, Lcom/join/mgps/Util/s0;->c()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/s0;->a(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_8

    const v0, 0x7f080c4f

    .line 36
    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 37
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 38
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060034

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 39
    :cond_8
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v17, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual/range {v17 .. v17}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v11

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v11, 0x7f06002b

    const v15, 0x7f080292

    if-eqz v0, :cond_9

    .line 40
    invoke-virtual {v2, v9, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5f00\u59cb"

    .line 41
    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 42
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 43
    invoke-virtual {v2, v12, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_5
    const v4, 0x7f09109f

    goto/16 :goto_b

    :cond_9
    if-nez v4, :cond_d

    .line 44
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 45
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 46
    invoke-static {v10}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v10, v4}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 47
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_b

    .line 48
    invoke-static {v10}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v10, v4}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 49
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-ge v0, v4, :cond_a

    .line 50
    invoke-virtual {v2, v9, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u66f4\u65b0"

    .line 51
    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 52
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 53
    :cond_a
    invoke-virtual {v2, v9, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 54
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 55
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 56
    :cond_b
    invoke-virtual {v2, v9, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 57
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 58
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v0, v7, v5}, Lcom/join/mgps/Util/UtilsMy;->a3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_b

    :cond_c
    const v4, 0x7f09109f

    .line 59
    invoke-virtual {v2, v9, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 60
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 61
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v0, v7, v5}, Lcom/join/mgps/Util/UtilsMy;->a3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 62
    :cond_d
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    .line 63
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v12

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v12, v8}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v8

    const/16 v12, 0x2b

    if-lez v8, :cond_e

    const/16 v0, 0x2b

    :cond_e
    if-eqz v0, :cond_f

    const/16 v8, 0x1b

    if-eq v0, v8, :cond_15

    const/16 v8, 0x30

    if-eq v0, v8, :cond_14

    const/4 v8, 0x2

    const v7, 0x7f090d81

    const-string v11, "/"

    const v9, 0x7f0900f1

    if-eq v0, v8, :cond_13

    const/4 v8, 0x3

    if-eq v0, v8, :cond_12

    const/4 v8, 0x5

    if-eq v0, v8, :cond_10

    const/4 v8, 0x6

    if-eq v0, v8, :cond_11

    const/4 v8, 0x7

    if-eq v0, v8, :cond_f

    const/16 v8, 0x2a

    if-eq v0, v8, :cond_10

    if-eq v0, v12, :cond_f

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 64
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 66
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f091051

    .line 67
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v4, 0x7f090e0d

    .line 68
    invoke-virtual {v2, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b"

    .line 69
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 70
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f06002b

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 71
    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d.."

    .line 73
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f091051

    .line 74
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f08043a

    const v5, 0x7f090e0d

    .line 75
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 76
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 77
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060032

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_2
    const v5, 0x7f090e0d

    .line 78
    invoke-virtual {v2, v5, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5"

    .line 79
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 80
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v8, 0x7f06002b

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 81
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :pswitch_3
    const v5, 0x7f090e0d

    const v8, 0x7f06002b

    .line 82
    invoke-virtual {v2, v5, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u7b49\u5f85"

    .line 83
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 84
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 85
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 86
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 87
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception v0

    .line 88
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_6
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 89
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_4
    const v8, 0x7f090e0d

    .line 90
    invoke-virtual {v2, v8, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u66f4\u65b0"

    .line 91
    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 92
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f06002b

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 93
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :cond_f
    const v4, 0x7f090e0d

    goto/16 :goto_a

    :cond_10
    const v8, 0x7f090e0d

    goto :goto_7

    :cond_11
    const v8, 0x7f090e0d

    const v5, 0x7f06002b

    goto :goto_8

    .line 94
    :goto_7
    invoke-virtual {v2, v8, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 95
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f1000f7

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 96
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f06002b

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 97
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :cond_12
    const v5, 0x7f06002b

    const v8, 0x7f090e0d

    .line 98
    :goto_8
    invoke-virtual {v2, v8, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u7ee7\u7eed"

    .line 99
    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 100
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 101
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 102
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 103
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :catch_1
    move-exception v0

    .line 104
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_9
    const-string v0, "\u6682\u505c\u4e2d"

    .line 105
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 106
    :cond_13
    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const v5, 0x7f090e0d

    .line 107
    invoke-virtual {v2, v5, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u6682\u505c"

    .line 108
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 109
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v8, 0x7f06002b

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 110
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 111
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v13, v14}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/S"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 113
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto/16 :goto_5

    :cond_14
    const v4, 0x7f090e0d

    .line 114
    invoke-virtual {v2, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 115
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 116
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f06002b

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 117
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :cond_15
    const v4, 0x7f090e0d

    const-string v0, "\u6682\u505c\u4e2d"

    .line 118
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 119
    :goto_a
    invoke-virtual {v2, v4, v15}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 120
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 121
    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v0, v7, v5}, Lcom/join/mgps/Util/UtilsMy;->a3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    .line 122
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 123
    :goto_b
    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v4, Lcom/join/mgps/adapter/SearchGameListAdapter$h;

    invoke-direct {v4, v1, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter$h;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    :cond_16
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getRequestStatus()I

    move-result v0

    const/16 v3, 0x2f

    const v4, 0x7f090fea

    if-ne v0, v3, :cond_17

    const/4 v3, 0x1

    .line 125
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v3, 0x7f090e0d

    .line 126
    invoke-virtual {v2, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_c

    :cond_17
    const/4 v3, 0x0

    .line 127
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_c
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public K(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {v1, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 3
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    .line 4
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    const-string v6, ""

    const/4 v7, 0x1

    const/4 v8, 0x0

    const v9, 0x7f090e0d

    if-eqz v5, :cond_16

    .line 5
    iget-object v10, v1, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    .line 6
    iget-boolean v11, v0, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->d:Z

    const v12, 0x7f090c6b

    if-eqz v11, :cond_2

    .line 7
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    if-eqz v11, :cond_1

    .line 8
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v11

    check-cast v11, Landroid/widget/RelativeLayout$LayoutParams;

    goto :goto_0

    .line 9
    :cond_1
    new-instance v11, Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v13, -0x1

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v15

    invoke-static {v7, v14, v15}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v14

    float-to-int v14, v14

    invoke-direct {v11, v13, v14}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    .line 10
    :goto_0
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v14, 0x7f07128f

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v13

    iput v13, v11, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 11
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13, v14}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v13

    iput v13, v11, Landroid/widget/RelativeLayout$LayoutParams;->rightMargin:I

    .line 12
    invoke-virtual {v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v13

    invoke-virtual {v13, v11}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 13
    :cond_2
    iget-boolean v0, v0, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->d:Z

    invoke-virtual {v2, v12, v0}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090e0a

    .line 14
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v2, v0, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 15
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    const v11, 0x7f090e0b

    if-eqz v0, :cond_3

    .line 16
    invoke-virtual {v2, v11, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 18
    :cond_3
    invoke-virtual {v2, v11, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 19
    :goto_1
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v11, Lcom/join/mgps/adapter/c5;

    invoke-direct {v11, v1, v5, v3}, Lcom/join/mgps/adapter/c5;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/GInfoBean;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v0, v11}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    const v11, 0x7f09120b

    if-eqz v0, :cond_4

    .line 21
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v0

    .line 22
    invoke-virtual {v2, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_2

    .line 23
    :cond_4
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPic_info()Ljava/util/List;

    move-result-object v0

    .line 24
    invoke-static {v6}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v12

    if-lez v12, :cond_5

    .line 25
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 26
    invoke-virtual {v2, v11}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v11, v0}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 27
    :cond_5
    :goto_2
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getGift_package_switch()I

    move-result v0

    if-ne v0, v7, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    const v11, 0x7f0906da

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 28
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    const-wide/high16 v14, 0x4090000000000000L    # 1024.0

    mul-double v12, v12, v14

    mul-double v12, v12, v14

    double-to-long v12, v12

    .line 29
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    const-wide/16 v16, 0x0

    const v0, 0x7f091673

    cmpl-double v18, v14, v16

    if-lez v18, :cond_7

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->showScore()Z

    move-result v14

    if-eqz v14, :cond_7

    .line 30
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v14

    invoke-static {v14}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v0, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 31
    invoke-virtual {v2, v0, v7}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_4

    .line 32
    :cond_7
    invoke-virtual {v2, v0, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_4
    const v0, 0x7f091607

    .line 33
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v14

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v15

    invoke-static {v14, v15}, Lcom/join/mgps/Util/UtilsMy;->M1(Lcom/join/mgps/dto/TipNew;Ljava/util/List;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v0, v14}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 34
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    const v14, 0x7f091101

    invoke-virtual {v2, v14}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v14

    invoke-static {v0, v14, v4}, Lcom/join/mgps/Util/UtilsMy;->j3(Lcom/join/mgps/dto/TipNew;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 35
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v15, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v15}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const v14, 0x7f09109f

    const v15, 0x7f060412

    const v7, 0x7f080c54

    if-eqz v0, :cond_8

    .line 36
    invoke-virtual {v2, v9, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5f00\u59cb"

    .line 37
    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 38
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 39
    invoke-virtual {v2, v11, v8}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_5
    const v4, 0x7f09109f

    goto/16 :goto_c

    :cond_8
    const-string v0, "\u66f4\u65b0"

    const v11, 0x7f1000f7

    if-nez v4, :cond_c

    .line 40
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v4, v12}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 41
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v4

    if-eqz v4, :cond_b

    .line 42
    invoke-static {v10}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v10, v12}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 43
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v4, v12}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v4

    if-nez v4, :cond_a

    .line 44
    invoke-static {v10}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v10, v12}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v4

    .line 45
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v4}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v4

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v4, v5, :cond_9

    .line 46
    invoke-virtual {v2, v9, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 47
    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 48
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 49
    :cond_9
    invoke-virtual {v2, v9, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 50
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 51
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 52
    :cond_a
    invoke-virtual {v2, v9, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 53
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 54
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v0, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->h3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 55
    :cond_b
    invoke-virtual {v2, v9, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 56
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 57
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v2, v14}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v0, v4, v5}, Lcom/join/mgps/Util/UtilsMy;->h3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_5

    .line 58
    :cond_c
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v17

    .line 59
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v8

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v8, v14}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v8

    const/16 v14, 0x2b

    if-lez v8, :cond_d

    const/16 v8, 0x2b

    goto :goto_6

    :cond_d
    move/from16 v8, v17

    :goto_6
    if-eqz v8, :cond_15

    const/16 v11, 0x1b

    if-eq v8, v11, :cond_14

    const/16 v11, 0x30

    if-eq v8, v11, :cond_13

    const/4 v11, 0x2

    const v15, 0x7f090d81

    const-string v7, "/"

    const v9, 0x7f0900f1

    if-eq v8, v11, :cond_12

    const/4 v11, 0x3

    if-eq v8, v11, :cond_11

    const/4 v11, 0x5

    if-eq v8, v11, :cond_f

    const/4 v11, 0x6

    if-eq v8, v11, :cond_10

    const/4 v11, 0x7

    if-eq v8, v11, :cond_e

    const/16 v11, 0x2a

    if-eq v8, v11, :cond_f

    if-eq v8, v14, :cond_e

    packed-switch v8, :pswitch_data_0

    goto/16 :goto_5

    .line 60
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 61
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 62
    invoke-virtual {v2, v15, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f091051

    .line 63
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f080c54

    const v4, 0x7f090e0d

    .line 64
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b"

    .line 65
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 66
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f060412

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 67
    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d.."

    .line 69
    invoke-virtual {v2, v15, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f091051

    .line 70
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f08043a

    const v5, 0x7f090e0d

    .line 71
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 72
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 73
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060032

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_2
    const v0, 0x7f080c54

    const v5, 0x7f090e0d

    .line 74
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5"

    .line 75
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 76
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v8, 0x7f060412

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 77
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :pswitch_3
    const v0, 0x7f080c54

    const v5, 0x7f090e0d

    const v8, 0x7f060412

    .line 78
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u7b49\u5f85"

    .line 79
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 80
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 81
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 82
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 83
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    .line 84
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_7
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 85
    invoke-virtual {v2, v15, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_4
    const v4, 0x7f080c54

    const v8, 0x7f090e0d

    .line 86
    invoke-virtual {v2, v8, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 87
    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 88
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f060412

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 89
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :cond_e
    const v0, 0x7f080c54

    const v4, 0x7f090e0d

    goto/16 :goto_b

    :cond_f
    const v8, 0x7f090e0d

    const v0, 0x7f080c54

    goto :goto_8

    :cond_10
    const v8, 0x7f090e0d

    const v0, 0x7f080c54

    const v5, 0x7f060412

    goto :goto_9

    .line 90
    :goto_8
    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 91
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f1000f7

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 92
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f060412

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 93
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v4}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :cond_11
    const v5, 0x7f060412

    const v8, 0x7f090e0d

    const v0, 0x7f080c54

    .line 94
    :goto_9
    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u7ee7\u7eed"

    .line 95
    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 96
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v8, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 97
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 98
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 99
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_a

    :catch_1
    move-exception v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_a
    const-string v0, "\u6682\u505c\u4e2d"

    .line 101
    invoke-virtual {v2, v15, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 102
    :cond_12
    invoke-static {v4}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const v0, 0x7f080c54

    const v5, 0x7f090e0d

    .line 103
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u6682\u505c"

    .line 104
    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 105
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v8, 0x7f060412

    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v5, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 106
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 107
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v10

    invoke-static {v10, v11}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v12, v13}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v9, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "/S"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v15, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 109
    invoke-virtual {v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    invoke-virtual {v0, v5}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto/16 :goto_5

    :cond_13
    const v0, 0x7f080c54

    const v4, 0x7f090e0d

    .line 110
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 111
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 112
    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f060412

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 113
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    goto/16 :goto_5

    :cond_14
    const v4, 0x7f090e0d

    const-string v0, "\u6682\u505c\u4e2d"

    .line 114
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_15
    const v4, 0x7f090e0d

    const v0, 0x7f080c54

    .line 115
    :goto_b
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 116
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 117
    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v7

    invoke-static {v0, v7, v5}, Lcom/join/mgps/Util/UtilsMy;->h3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    .line 118
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v0, v5}, Lcom/join/mgps/adapter/SearchGameListAdapter;->d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V

    .line 119
    :goto_c
    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v4, Lcom/join/mgps/adapter/SearchGameListAdapter$h;

    invoke-direct {v4, v1, v3}, Lcom/join/mgps/adapter/SearchGameListAdapter$h;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    :cond_16
    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getRequestStatus()I

    move-result v0

    const/16 v3, 0x2f

    const v4, 0x7f090fea

    if-ne v0, v3, :cond_17

    const/4 v3, 0x1

    .line 121
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v3, 0x7f090e0d

    .line 122
    invoke-virtual {v2, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_d

    :cond_17
    const/4 v3, 0x0

    .line 123
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_d
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public L(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 8

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->t(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 4
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-nez v2, :cond_4

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 7
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 8
    :goto_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPic_info()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_1

    const/4 v6, 0x0

    .line 9
    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_1

    .line 10
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 11
    :cond_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-lez v5, :cond_2

    const/4 v3, 0x1

    :cond_2
    const v5, 0x7f0911f6

    invoke-virtual {p1, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_4

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPic_position()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 14
    new-instance v3, Lcom/join/mgps/adapter/p0;

    iget-object v6, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-direct {v3, v6, v0, v1, v2}, Lcom/join/mgps/adapter/p0;-><init>(Landroid/content/Context;ILjava/util/List;Z)V

    .line 15
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lit/sephiroth/android/library/widget/HListView;

    invoke-virtual {v2, v3}, Lit/sephiroth/android/library/widget/HListView;->setAdapter(Landroid/widget/ListAdapter;)V

    if-ne v0, v4, :cond_3

    .line 16
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07106c

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lit/sephiroth/android/library/widget/HListView;->setDividerWidth(I)V

    .line 17
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->postInvalidate()V

    goto :goto_2

    .line 18
    :cond_3
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    iget-object v2, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->d:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0711f4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-virtual {v0, v2}, Lit/sephiroth/android/library/widget/HListView;->setDividerWidth(I)V

    .line 19
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lit/sephiroth/android/library/widget/HListView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->postInvalidate()V

    .line 20
    :goto_2
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lit/sephiroth/android/library/widget/HListView;

    new-instance v0, Lcom/join/mgps/adapter/SearchGameListAdapter$c;

    invoke-direct {v0, p0, v1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$c;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Ljava/util/List;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {p1, v0}, Lit/sephiroth/android/library/widget/AdapterView;->setOnItemClickListener(Lit/sephiroth/android/library/widget/AdapterView$d;)V

    :cond_4
    return-void
.end method

.method protected M(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V
    .locals 1
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$i;->getItemType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 2
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->E(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 3
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->D(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 4
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->A(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 5
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 6
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 7
    :pswitch_5
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->v(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 8
    :pswitch_6
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 9
    :pswitch_7
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->z(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 10
    :pswitch_8
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 11
    :pswitch_9
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->w(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 12
    :pswitch_a
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 13
    :pswitch_b
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->I(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 14
    :pswitch_c
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 15
    :pswitch_d
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->G(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    goto :goto_0

    .line 16
    :pswitch_e
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public O()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->e:Ljava/lang/String;

    return-object v0
.end method

.method public X(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;-><init>()V

    .line 2
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Lcom/join/mgps/dto/ForumBean$ForumPostsBean;->setPid(I)V

    .line 3
    invoke-static {p1, v0}, Lcom/join/mgps/Util/j0;->v0(Landroid/content/Context;Lcom/join/mgps/dto/ForumBean$ForumPostsBean;)V

    return-void
.end method

.method public Y(Lcom/join/mgps/adapter/SearchGameListAdapter$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->g:Lcom/join/mgps/adapter/SearchGameListAdapter$f;

    return-void
.end method

.method Z(Landroid/view/View;I)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    .line 3
    invoke-virtual {p1, v0, p2, v1, p2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public a0(Landroid/view/View;Ljava/lang/String;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/join/mgps/adapter/SearchGameListAdapter$e;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter$e;-><init>(Lcom/join/mgps/adapter/SearchGameListAdapter;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public b0(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/SearchGameListAdapter;->e:Ljava/lang/String;

    return-void
.end method

.method c0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const v0, 0x7f090d00

    const v1, 0x7f090c7d

    const v2, 0x7f091051

    const v3, 0x7f09104a

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1, v1, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    invoke-virtual {p1, v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p1, v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 8
    invoke-virtual {p1, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 9
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    invoke-virtual {p1, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 12
    :goto_0
    invoke-virtual {p1, v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/adapter/SearchGameListAdapter$i;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/SearchGameListAdapter;->M(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/SearchGameListAdapter$i;)V

    return-void
.end method

.method d0(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 7

    .line 1
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    const v0, 0x7f090e0b

    const v1, 0x7f09116c

    const v2, 0x7f090c7d

    const v3, 0x7f091051

    const v4, 0x7f09104a

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1, v1, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {p1, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p1, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    invoke-virtual {p1, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    invoke-virtual {p1, v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p1, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 8
    invoke-virtual {p1, v1, v5}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 9
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 10
    invoke-virtual {p1, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    invoke-virtual {p1, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p1, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 13
    invoke-virtual {p1, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 14
    :goto_0
    invoke-virtual {p1, v0, v6}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_1
    return-void
.end method

.method t(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->isAdInfo()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x93

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    const-string v2, "147"

    .line 5
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    goto :goto_0

    :cond_1
    const/16 v1, 0x67

    .line 7
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 8
    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    const-string v2, "103"

    .line 9
    invoke-virtual {v0, v2}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 11
    :goto_0
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/SearchGameListAdapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setDataFlag(Ljava/lang/String;)Lcom/join/mgps/dto/ExtBean;

    .line 12
    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->setKeyword(Ljava/lang/String;)V

    const-string v1, "112"

    .line 13
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setPosition(Ljava/lang/String;)V

    .line 14
    invoke-virtual {p0}, Lcom/join/mgps/adapter/SearchGameListAdapter;->O()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setWhere(Ljava/lang/String;)V

    .line 15
    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setExt(Ljava/lang/String;)V

    return-void
.end method
