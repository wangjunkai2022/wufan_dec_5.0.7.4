.class public Lcom/join/mgps/adapter/PapaMainV4Adapter;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "PapaMainV4Adapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/PapaMainV4Adapter$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/dto/CommonMultiItemBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final f:I = 0x1

.field public static final g:I = 0x2

.field public static final h:I = 0x3

.field public static final i:I = 0x4

.field public static final j:I = 0x5

.field public static final k:I = 0x6

.field public static final l:I = 0x7

.field public static final m:I = 0x8

.field public static final n:I = 0x9

.field public static final o:I = 0xa

.field public static final p:I = 0xb

.field public static final q:I = 0xc


# instance fields
.field private d:Landroid/content/Context;

.field private e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/join/mgps/adapter/PapaMainV4Adapter$e;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 2
    iput-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    const/4 p1, 0x1

    const p2, 0x7f0c0509

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x2

    const p2, 0x7f0c050b

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x3

    const p2, 0x7f0c050a

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x4

    const p2, 0x7f0c0510

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x5

    const p2, 0x7f0c050c

    .line 8
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x6

    const p2, 0x7f0c0511

    .line 9
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x7

    const p2, 0x7f0c06d5

    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0x8

    const p2, 0x7f0c050e

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0x9

    const p2, 0x7f0c050f

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xa

    const p2, 0x7f0c010d

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xb

    const p2, 0x7f0c050d

    .line 14
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/16 p1, 0xc

    const p2, 0x7f0c06ce

    .line 15
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    return-void
.end method

.method private A(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_13

    .line 2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    const v4, 0x7f090e0c

    .line 4
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-static {v4, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 5
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v5, Lcom/join/mgps/adapter/l4;

    invoke-direct {v5, v1, v2}, Lcom/join/mgps/adapter/l4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090e0d

    .line 6
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    new-instance v6, Lcom/join/mgps/adapter/p4;

    invoke-direct {v6, v1, v2}, Lcom/join/mgps/adapter/p4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-nez v3, :cond_2

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v5

    :goto_1
    const v6, 0x7f090e0a

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v5

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v7

    invoke-virtual {v7}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f090e0b

    invoke-virtual {v5, v8, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_3

    .line 9
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getDown_count()I

    move-result v10

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v13

    const v5, 0x7f09145e

    invoke-virtual {v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Landroid/widget/LinearLayout;

    iget-object v15, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    const/16 v16, 0x0

    invoke-static/range {v9 .. v16}, Lcom/join/mgps/Util/UtilsMy;->O(Ljava/lang/String;ILjava/lang/String;Lcom/join/mgps/dto/TipNew;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;Z)V

    .line 10
    :cond_3
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v5

    const v7, 0x7f080c43

    const v9, 0x7f06002b

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_4

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v5, v10, :cond_4

    const-string v3, "\u6253\u5f00"

    .line 11
    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    .line 12
    invoke-virtual {v3, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 13
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    .line 14
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    .line 15
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getSub_title()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v8, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 16
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_3

    :cond_4
    if-eqz v3, :cond_5

    .line 17
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v12, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v12}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v12

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, ""

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v3, "\u5f00\u59cb"

    .line 18
    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    .line 19
    invoke-virtual {v3, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 20
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    .line 21
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    .line 22
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getSub_title()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v8, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 23
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_3

    .line 24
    :cond_5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const v5, 0x7f060034

    const v6, 0x7f080c4f

    const-string v8, "\u66f4\u65b0"

    const-string v12, "\u542f\u52a8"

    const-string v13, "\u83b7\u53d6"

    const v15, 0x7f060031

    const v14, 0x7f080c48

    if-nez v2, :cond_a

    .line 25
    :try_start_1
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 26
    invoke-virtual {v0, v4, v13}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    .line 27
    invoke-virtual {v2, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 28
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v2, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    if-nez v3, :cond_6

    return-void

    .line 29
    :cond_6
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 30
    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v7, v9}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 31
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_8

    .line 32
    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v7, v9}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v2

    .line 33
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ge v2, v3, :cond_7

    .line 34
    invoke-virtual {v0, v4, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 35
    invoke-virtual {v0, v4, v14}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 37
    :cond_7
    invoke-virtual {v0, v4, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 38
    invoke-virtual {v0, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 39
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 40
    :cond_8
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 41
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_3

    .line 42
    :cond_9
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 43
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_3

    .line 44
    :cond_a
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v16

    const/16 v5, 0x2b

    if-eqz v3, :cond_b

    .line 45
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v6

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-lez v6, :cond_b

    const/16 v6, 0x2b

    goto :goto_2

    :cond_b
    move/from16 v6, v16

    :goto_2
    if-eqz v6, :cond_11

    const/16 v7, 0x1b

    const-string v15, "\u6682\u505c"

    if-eq v6, v7, :cond_10

    const/16 v7, 0x30

    if-eq v6, v7, :cond_f

    const/4 v7, 0x2

    const v14, 0x7f090d81

    const-string v9, "/"

    const v4, 0x7f0900f1

    if-eq v6, v7, :cond_e

    const/4 v7, 0x3

    if-eq v6, v7, :cond_d

    const/4 v7, 0x5

    if-eq v6, v7, :cond_c

    const/4 v7, 0x6

    if-eq v6, v7, :cond_d

    const/4 v7, 0x7

    if-eq v6, v7, :cond_11

    const/16 v7, 0x2a

    if-eq v6, v7, :cond_c

    if-eq v6, v5, :cond_11

    const v3, 0x7f091051

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_3

    .line 46
    :pswitch_0
    :try_start_2
    invoke-direct {v1, v0, v11, v10}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 47
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v4, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 48
    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 49
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v2, v4

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b"

    const v3, 0x7f090e0d

    .line 50
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c5c

    .line 51
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 52
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f06002b

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 53
    :pswitch_1
    invoke-direct {v1, v0, v11, v10}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v6

    invoke-static {v6, v7}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v4, "\u89e3\u538b\u4e2d.."

    .line 55
    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 56
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v2, v4

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b\u4e2d"

    const v3, 0x7f090e0d

    .line 57
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f08043a

    .line 58
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 59
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f060032

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    :pswitch_2
    const-string v2, "\u5b89\u88c5"

    const v3, 0x7f090e0d

    .line 60
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    const v4, 0x7f080c48

    .line 61
    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 62
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 63
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_3

    .line 64
    :pswitch_3
    invoke-direct {v1, v0, v11, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    const-string v3, "\u7b49\u5f85"

    const v5, 0x7f090e0d

    .line 65
    invoke-virtual {v0, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 67
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v2

    long-to-int v3, v2

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u7b49\u5f85\u4e2d"

    .line 68
    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090e0d

    .line 69
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 70
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f06002b

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    :pswitch_4
    const v2, 0x7f090e0d

    .line 71
    invoke-virtual {v0, v2, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c48

    .line 72
    invoke-virtual {v3, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 73
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060031

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 74
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_3

    :cond_c
    const v2, 0x7f090e0d

    .line 75
    invoke-virtual {v0, v2, v12}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    const v4, 0x7f080c4f

    .line 76
    invoke-virtual {v3, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 77
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f060034

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 78
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto/16 :goto_3

    .line 79
    :cond_d
    invoke-direct {v1, v0, v11, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    const-string v3, "\u7ee7\u7eed"

    const v5, 0x7f090e0d

    .line 80
    invoke-virtual {v0, v5, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 82
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v2

    long-to-int v3, v2

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u6682\u505c\u4e2d"

    .line 83
    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090e0d

    .line 84
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 85
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f06002b

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception v0

    .line 86
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_3

    .line 87
    :cond_e
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 88
    invoke-direct {v1, v0, v11, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    const v3, 0x7f090e0d

    .line 89
    :try_start_5
    invoke-virtual {v0, v3, v15}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 90
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 91
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v4, v3

    const v3, 0x7f09104a

    invoke-virtual {v0, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/S"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090e0d

    .line 93
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 94
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f06002b

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto/16 :goto_3

    :catch_1
    move-exception v0

    .line 95
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_3

    :cond_f
    const-string v2, "\u5b89\u88c5\u4e2d"

    const v3, 0x7f090e0d

    .line 96
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    const v4, 0x7f080c43

    .line 97
    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v4, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 98
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f06002b

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    invoke-virtual {v2, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 99
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V

    goto :goto_3

    :cond_10
    const v2, 0x7f090e0d

    .line 100
    invoke-virtual {v0, v2, v15}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v3, 0x7f080c43

    .line 101
    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 102
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06002b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    :cond_11
    const v2, 0x7f090e0d

    .line 103
    invoke-virtual {v0, v2, v13}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    const v5, 0x7f080c43

    .line 104
    invoke-virtual {v4, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v4

    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 105
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_12

    .line 106
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v4

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 107
    invoke-virtual {v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    invoke-static {v2, v4, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    .line 108
    :cond_12
    invoke-direct {v1, v0, v10, v11}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_3

    :catch_2
    move-exception v0

    .line 109
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_13
    :goto_3
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

.method private B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const v0, 0x7f0910e8

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance v0, Lcom/join/mgps/adapter/HomeGameListAdapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-direct {v0, v1, p2}, Lcom/join/mgps/adapter/HomeGameListAdapter;-><init>(Landroid/content/Context;Ljava/util/List;)V

    .line 5
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 6
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    new-instance v0, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;

    invoke-direct {v0, p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter$d;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 10

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/HomeRankingListBean;

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/HomeRankingListBean;

    const v0, 0x7f0917c8

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    const v1, 0x7f09135d

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/tabs/TabLayout;

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeRankingListBean;->getTxt()Ljava/lang/String;

    move-result-object v2

    .line 6
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, ","

    .line 7
    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    .line 8
    new-instance v3, Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;

    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeRankingListBean;->getList()Ljava/util/List;

    move-result-object v4

    iget-object v5, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    invoke-direct {v3, v4, v5}, Lcom/join/mgps/adapter/PapaMainHomeRankAdapter;-><init>(Ljava/util/List;Lcom/join/mgps/adapter/PapaMainV4Adapter$e;)V

    invoke-virtual {v0, v3}, Landroidx/viewpager2/widget/ViewPager2;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 9
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->removeAllTabs()V

    .line 10
    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, v2, v5

    .line 11
    invoke-virtual {v1}, Lcom/google/android/material/tabs/TabLayout;->newTab()Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v7

    const v8, 0x7f0c04e7

    invoke-virtual {v7, v8}, Lcom/google/android/material/tabs/TabLayout$Tab;->setCustomView(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object v7

    .line 12
    invoke-virtual {v7}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v8

    if-eqz v8, :cond_0

    .line 13
    invoke-virtual {v7}, Lcom/google/android/material/tabs/TabLayout$Tab;->getCustomView()Landroid/view/View;

    move-result-object v8

    const v9, 0x7f09135c

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    .line 14
    invoke-virtual {v8, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-virtual {v1, v7}, Lcom/google/android/material/tabs/TabLayout;->addTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 16
    :cond_1
    new-instance v2, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;

    invoke-direct {v2, p0, v1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter$b;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/google/android/material/tabs/TabLayout;Lcom/join/mgps/dto/HomeRankingListBean;)V

    invoke-virtual {v0, v2}, Landroidx/viewpager2/widget/ViewPager2;->registerOnPageChangeCallback(Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;)V

    .line 17
    new-instance p2, Lcom/join/mgps/adapter/PapaMainV4Adapter$c;

    invoke-direct {p2, p0, v0, v1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$c;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/material/tabs/TabLayout;)V

    invoke-virtual {v1, p2}, Lcom/google/android/material/tabs/TabLayout;->addOnTabSelectedListener(Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;)V

    const p2, 0x7f0910ac

    .line 18
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    sget-object p2, Lcom/join/mgps/adapter/g4;->b:Lcom/join/mgps/adapter/g4;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 19
    invoke-virtual {v1, v4}, Lcom/google/android/material/tabs/TabLayout;->getTabAt(I)Lcom/google/android/material/tabs/TabLayout$Tab;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/material/tabs/TabLayout;->selectTab(Lcom/google/android/material/tabs/TabLayout$Tab;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 20
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_2
    :goto_1
    return-void
.end method

.method private D(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_f

    .line 2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v4, Lcom/join/mgps/adapter/o4;

    invoke-direct {v4, v1, v2}, Lcom/join/mgps/adapter/o4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v3, 0x7f09049a

    .line 4
    invoke-virtual {v0, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    new-instance v5, Lcom/join/mgps/adapter/n4;

    invoke-direct {v5, v1, v2}, Lcom/join/mgps/adapter/n4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f090104

    .line 5
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v4, 0x7f090109

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v5

    :goto_0
    invoke-virtual {v0, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v4

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v5

    const v6, 0x7f080c43

    const v7, 0x7f06002b

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v8, 0x1

    if-eq v5, v8, :cond_1

    const-string v2, "\u6253\u5f00"

    .line 9
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 10
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 11
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :cond_1
    if-eqz v4, :cond_2

    .line 12
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v8, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v8}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ""

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v2, "\u5f00\u59cb"

    .line 13
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 14
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 15
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 16
    :cond_2
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2

    const-string v5, "\u66f4\u65b0"

    const v8, 0x7f060034

    const v9, 0x7f080c4f

    const-string v10, "\u542f\u52a8"

    const-string v11, "\u83b7\u53d6"

    const v12, 0x7f060031

    const v13, 0x7f080c48

    if-nez v2, :cond_7

    .line 17
    invoke-virtual {v0, v3, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    .line 18
    invoke-virtual {v2, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v6, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 19
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-virtual {v2, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    if-nez v4, :cond_3

    return-void

    .line 20
    :cond_3
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 21
    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v6, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 22
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_5

    .line 23
    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v6, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v6, v7}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v2

    .line 24
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v2

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    if-ge v2, v4, :cond_4

    .line 25
    invoke-virtual {v0, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 26
    invoke-virtual {v0, v3, v13}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 27
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 28
    :cond_4
    invoke-virtual {v0, v3, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 29
    invoke-virtual {v0, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 30
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 31
    :cond_5
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 32
    :cond_6
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 33
    :cond_7
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v14

    const/16 v15, 0x2b

    if-eqz v4, :cond_8

    .line 34
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v8

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v8

    if-lez v8, :cond_8

    const/16 v14, 0x2b

    :cond_8
    if-eqz v14, :cond_e

    const/16 v8, 0x1b

    const-string v9, "\u6682\u505c"

    if-eq v14, v8, :cond_d

    const/16 v8, 0x30

    if-eq v14, v8, :cond_c

    const/4 v8, 0x2

    if-eq v14, v8, :cond_b

    const/4 v2, 0x3

    if-eq v14, v2, :cond_a

    const/4 v2, 0x5

    if-eq v14, v2, :cond_9

    const/4 v2, 0x6

    if-eq v14, v2, :cond_a

    const/4 v2, 0x7

    if-eq v14, v2, :cond_e

    const/16 v2, 0x2a

    if-eq v14, v2, :cond_9

    if-eq v14, v15, :cond_e

    packed-switch v14, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const-string v2, "\u89e3\u538b"

    .line 35
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c5c

    .line 36
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 37
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :pswitch_1
    const-string v2, "\u89e3\u538b\u4e2d"

    .line 38
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f08043a

    .line 39
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 40
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f060032

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :pswitch_2
    const-string v2, "\u5b89\u88c5"

    .line 41
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 42
    invoke-virtual {v0, v3, v13}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 43
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :pswitch_3
    const-string v2, "\u7b49\u5f85"

    .line 44
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 45
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 46
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 47
    :pswitch_4
    invoke-virtual {v0, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 48
    invoke-virtual {v0, v3, v13}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 49
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 50
    :cond_9
    invoke-virtual {v0, v3, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c4f

    .line 51
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 52
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f060034

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :cond_a
    :try_start_0
    const-string v2, "\u7ee7\u7eed"

    .line 53
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 54
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 55
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    :catch_0
    move-exception v0

    .line 56
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_1

    .line 57
    :cond_b
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 58
    :try_start_1
    invoke-virtual {v0, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 59
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 60
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    .line 61
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_1

    :cond_c
    const-string v2, "\u5b89\u88c5\u4e2d"

    .line 62
    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 63
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 64
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 65
    :cond_d
    invoke-virtual {v0, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 66
    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 67
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 68
    :cond_e
    invoke-virtual {v0, v3, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    .line 69
    invoke-virtual {v2, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 70
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v3, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v4, :cond_f

    .line 71
    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v4}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 72
    invoke-virtual {v0, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f09109f

    invoke-virtual {v0, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2, v0, v4}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    :cond_f
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private E(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    const v0, 0x7f0912df

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    float-to-int p2, p2

    .line 4
    iput p2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const v0, 0x7f091461

    .line 3
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method

.method private G(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    .line 1
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_12

    .line 2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    .line 4
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v5, Lcom/join/mgps/adapter/j4;

    invoke-direct {v5, v1, v2}, Lcom/join/mgps/adapter/j4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0908a9

    .line 5
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    new-instance v6, Lcom/join/mgps/adapter/q4;

    invoke-direct {v6, v1, v2}, Lcom/join/mgps/adapter/q4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v5, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v5, 0x7f090154

    .line 6
    invoke-virtual {v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v5, 0x7f09063c

    .line 7
    invoke-virtual {v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v6

    :goto_0
    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    if-nez v3, :cond_2

    .line 8
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v5

    :goto_1
    const v6, 0x7f090109

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_3

    .line 9
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getScore()Ljava/lang/Double;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getDown_count()I

    move-result v8

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v10

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v11

    const v5, 0x7f09145e

    invoke-virtual {v0, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    move-object v12, v5

    check-cast v12, Landroid/widget/LinearLayout;

    iget-object v13, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lcom/join/mgps/Util/UtilsMy;->O(Ljava/lang/String;ILjava/lang/String;Lcom/join/mgps/dto/TipNew;Ljava/util/List;Landroid/widget/LinearLayout;Landroid/content/Context;Z)V

    .line 10
    :cond_3
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v5

    const v7, 0x7f080c43

    const v8, 0x7f06002b

    if-eqz v5, :cond_4

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v9, 0x1

    if-eq v5, v9, :cond_4

    const-string v3, "\u6253\u5f00"

    .line 11
    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 13
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 14
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v6, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    :cond_4
    if-eqz v3, :cond_5

    .line 15
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v9, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v9}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const-string v3, "\u5f00\u59cb"

    .line 16
    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 17
    invoke-virtual {v0, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v3, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 18
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 19
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v3, 0x7f090e0b

    .line 20
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getSub_title()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    .line 21
    :cond_5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const v5, 0x7f060034

    const v6, 0x7f080c4f

    const-string v9, "\u66f4\u65b0"

    const-string v10, "\u542f\u52a8"

    const-string v11, "\u83b7\u53d6"

    const v12, 0x7f09109f

    const v13, 0x7f060031

    const v14, 0x7f080c48

    if-nez v2, :cond_a

    .line 22
    :try_start_1
    invoke-virtual {v0, v4, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    .line 23
    invoke-virtual {v2, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 24
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-virtual {v2, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    if-nez v3, :cond_6

    return-void

    .line 25
    :cond_6
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 26
    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 27
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_8

    .line 28
    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v7, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v7, v8}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v2

    .line 29
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v2}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    if-ge v2, v3, :cond_7

    .line 30
    invoke-virtual {v0, v4, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 31
    invoke-virtual {v0, v4, v14}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 32
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    .line 33
    :cond_7
    invoke-virtual {v0, v4, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 34
    invoke-virtual {v0, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 35
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    .line 36
    :cond_8
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 37
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_2

    .line 38
    :cond_9
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 39
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_2

    .line 40
    :cond_a
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v15

    const/16 v12, 0x2b

    if-eqz v3, :cond_b

    .line 41
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v5

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    if-lez v5, :cond_b

    const/16 v15, 0x2b

    :cond_b
    if-eqz v15, :cond_11

    const/16 v5, 0x1b

    const-string v6, "\u6682\u505c"

    if-eq v15, v5, :cond_10

    const/16 v5, 0x30

    if-eq v15, v5, :cond_f

    const/4 v5, 0x2

    const v7, 0x7f090d81

    const-string v13, "/"

    const v14, 0x7f0900f1

    if-eq v15, v5, :cond_e

    const/4 v5, 0x3

    if-eq v15, v5, :cond_d

    const/4 v5, 0x5

    if-eq v15, v5, :cond_c

    const/4 v5, 0x6

    if-eq v15, v5, :cond_d

    const/4 v5, 0x7

    if-eq v15, v5, :cond_11

    const/16 v5, 0x2a

    if-eq v15, v5, :cond_c

    if-eq v15, v12, :cond_11

    packed-switch v15, :pswitch_data_0

    goto/16 :goto_2

    .line 42
    :pswitch_0
    :try_start_2
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 43
    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b"

    .line 44
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c5c

    .line 45
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 46
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    .line 47
    :pswitch_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b\u4e2d.."

    .line 48
    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b\u4e2d"

    .line 49
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f08043a

    .line 50
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 51
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060032

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    :pswitch_2
    const-string v2, "\u5b89\u88c5"

    .line 52
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c48

    .line 53
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 54
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    :pswitch_3
    const-string v3, "\u7b49\u5f85"

    .line 55
    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u7b49\u5f85\u4e2d"

    .line 57
    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    .line 58
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 59
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    .line 60
    :pswitch_4
    invoke-virtual {v0, v4, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c48

    .line 61
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 62
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_2

    .line 63
    :cond_c
    invoke-virtual {v0, v4, v10}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c4f

    .line 64
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 65
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060034

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto/16 :goto_2

    :cond_d
    :try_start_3
    const-string v3, "\u7ee7\u7eed"

    .line 66
    invoke-virtual {v0, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v14, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u6682\u505c\u4e2d"

    .line 68
    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    .line 69
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 70
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception v0

    .line 71
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto/16 :goto_2

    .line 72
    :cond_e
    invoke-static {v2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    .line 73
    :try_start_5
    invoke-virtual {v0, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 74
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->g(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v14, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    invoke-virtual {v2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "/S"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    .line 76
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 77
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 78
    :try_start_6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_2

    :cond_f
    const-string v2, "\u5b89\u88c5\u4e2d"

    .line 79
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    .line 80
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 81
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 82
    :cond_10
    invoke-virtual {v0, v4, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    .line 83
    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 84
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 85
    :cond_11
    invoke-virtual {v0, v4, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    const v5, 0x7f080c43

    .line 86
    invoke-virtual {v2, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v2

    iget-object v5, v1, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    .line 87
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v2, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_12

    .line 88
    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v2

    invoke-virtual {v3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 89
    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v4, 0x7f09109f

    invoke-virtual {v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v2, v0, v3}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    goto :goto_2

    :catch_2
    move-exception v0

    .line 90
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_12
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/HomeTopChannelBean;

    if-eqz v0, :cond_2

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/HomeTopChannelBean;

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getTheNew()Lcom/join/mgps/dto/HomeDailyNewBean;

    move-result-object v0

    if-eqz v0, :cond_0

    const v0, 0x7f09163b

    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getTheNew()Lcom/join/mgps/dto/HomeDailyNewBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/HomeDailyNewBean;->getCount()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "\u6b3e"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090853

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/e4;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/e4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0911d8

    .line 6
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 8
    new-instance v1, Lcom/join/mgps/adapter/PapaMainDailyNewAdapter;

    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getTheNew()Lcom/join/mgps/dto/HomeDailyNewBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/HomeDailyNewBean;->getList()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/join/mgps/adapter/PapaMainDailyNewAdapter;-><init>(Ljava/util/List;)V

    .line 9
    new-instance v2, Lcom/join/mgps/adapter/h4;

    invoke-direct {v2, p0}, Lcom/join/mgps/adapter/h4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;)V

    invoke-virtual {v1, v2}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 10
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 11
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    if-eqz v0, :cond_1

    const v0, 0x7f090825

    .line 12
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/r4;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/r4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/HomeTopChannelBean;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    :cond_1
    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getBroadcast()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    if-eqz v0, :cond_2

    const v0, 0x7f0904b5

    .line 15
    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getBroadcast()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getSub_title()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f0904b4

    .line 16
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/HomeTopChannelBean;->getBroadcast()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v0, 0x7f0902ad

    .line 17
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/adapter/f4;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/f4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/HomeTopChannelBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    return-void
.end method

.method private synthetic J(Ljava/util/List;I)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "1-"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic K(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const-string p1, "3-1"

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic L(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "2-"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getPosition()I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic M(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getExp_position()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic N(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->B(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_0
    return-void
.end method

.method private static synthetic O(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/d0;->a()Lcom/join/mgps/Util/d0;

    move-result-object p0

    new-instance v0, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/join/kotlin/ui/findgame/data/IntentClassfyEvent;-><init>(I)V

    invoke-virtual {p0, v0}, Lcom/join/mgps/Util/d0;->c(Ljava/lang/Object;)V

    return-void
.end method

.method private synthetic P(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getExp_position()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic Q(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->B(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_0
    return-void
.end method

.method private synthetic R(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    if-eqz p2, :cond_0

    .line 2
    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->B(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :cond_0
    return-void
.end method

.method private synthetic S(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getExp_position()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic T(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    const-class v2, Lcom/join/kotlin/EverdayNewGameActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const-string p1, "3-3"

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic U(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    new-instance p2, Landroid/content/Intent;

    iget-object p3, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    const-class v0, Lcom/join/kotlin/EverdayNewGameActivity;

    invoke-direct {p2, p3, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private synthetic V(Lcom/join/mgps/dto/HomeTopChannelBean;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeTopChannelBean;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 2
    new-instance p2, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {p2}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    const-string v0, "20004"

    .line 3
    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    const/16 v0, 0x4e24

    .line 4
    invoke-virtual {p2, v0}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 5
    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/IntentDateBean;->setExtBean(Lcom/join/mgps/dto/ExtBean;)V

    .line 6
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const-string p1, "3-4"

    .line 7
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic W(Lcom/join/mgps/dto/HomeTopChannelBean;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/HomeTopChannelBean;->getBroadcast()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object p1

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    const-string p1, "3-2"

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->X(Ljava/lang/String;)V

    return-void
.end method

.method private X(Ljava/lang/String;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v1, Lcom/papa/sim/statistic/ExtFrom;->home:Lcom/papa/sim/statistic/ExtFrom;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "22-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v2

    invoke-virtual {v2}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Lcom/papa/sim/statistic/p;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private Y(Lcom/join/mgps/base/BaseViewHolder;ZZ)V
    .locals 4

    const v0, 0x7f090e0b

    .line 1
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f09145e

    .line 2
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    xor-int/lit8 v0, p2, 0x1

    const v1, 0x7f090c7d

    .line 3
    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f091051

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez p2, :cond_0

    if-eqz p3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 4
    :goto_0
    invoke-virtual {p1, v0, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    const v0, 0x7f09104a

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    const/4 v1, 0x1

    .line 5
    :cond_1
    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->S(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->O(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic j(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/HomeTopChannelBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->V(Lcom/join/mgps/dto/HomeTopChannelBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->L(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->M(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->K(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/join/mgps/adapter/PapaMainV4Adapter;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->T(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic o(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->Q(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic p(Lcom/join/mgps/adapter/PapaMainV4Adapter;Ljava/util/List;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->J(Ljava/util/List;I)V

    return-void
.end method

.method public static synthetic q(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->P(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic r(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->U(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V

    return-void
.end method

.method public static synthetic s(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->N(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic t(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->R(Lcom/join/mgps/dto/CommonGameInfoBean;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/HomeTopChannelBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->W(Lcom/join/mgps/dto/HomeTopChannelBean;Landroid/view/View;)V

    return-void
.end method

.method static synthetic v(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Lcom/join/mgps/adapter/PapaMainV4Adapter$e;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    return-object p0
.end method

.method static synthetic w(Lcom/join/mgps/adapter/PapaMainV4Adapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->d:Landroid/content/Context;

    return-object p0
.end method

.method private x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/util/List;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/List;

    const v0, 0x7f09014e

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/youth/banner/Banner;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_0
    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getTag()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    sget-object v2, Lcom/join/mgps/base/BaseQuickAdapter;->TAG:Ljava/lang/String;

    invoke-static {v1, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 8
    invoke-virtual {p1, v0}, Lcom/youth/banner/Banner;->z(Ljava/util/List;)Lcom/youth/banner/Banner;

    move-result-object v0

    new-instance v1, Lcom/papa91/arc/view/GlideImageLoader;

    invoke-direct {v1}, Lcom/papa91/arc/view/GlideImageLoader;-><init>()V

    .line 9
    invoke-virtual {v0, v1}, Lcom/youth/banner/Banner;->y(Lcom/youth/banner/loader/ImageLoaderInterface;)Lcom/youth/banner/Banner;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/i4;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/i4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Ljava/util/List;)V

    .line 10
    invoke-virtual {v0, v1}, Lcom/youth/banner/Banner;->D(Lm3/b;)Lcom/youth/banner/Banner;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter$a;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Ljava/util/List;)V

    .line 11
    invoke-virtual {v0, v1}, Lcom/youth/banner/Banner;->setOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 12
    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    .line 13
    invoke-virtual {p1}, Lcom/youth/banner/Banner;->I()Lcom/youth/banner/Banner;

    .line 14
    iget-object p1, p0, Lcom/join/mgps/adapter/PapaMainV4Adapter;->e:Lcom/join/mgps/adapter/PapaMainV4Adapter$e;

    if-eqz p1, :cond_1

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-interface {p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter$e;->s(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method

.method private y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v0, :cond_1

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    const v1, 0x7f090839

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v1

    invoke-virtual {v1}, Lcom/join/mgps/dto/GInfoBean;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :goto_0
    const v0, 0x7f0915c8

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/adapter/m4;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/m4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    :goto_1
    return-void
.end method

.method private z(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getData()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    const v0, 0x7f090ea1

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09078d

    .line 4
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 5
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v0, Lcom/join/mgps/adapter/k4;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/k4;-><init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method protected I(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V
    .locals 1
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonMultiItemBean;->getItemType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    goto :goto_0

    .line 2
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->E(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 3
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->D(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 4
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->B(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 5
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->C(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 6
    :pswitch_5
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->G(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 7
    :pswitch_6
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 8
    :pswitch_7
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->A(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 9
    :pswitch_8
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->F(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 10
    :pswitch_9
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->y(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 11
    :pswitch_a
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->z(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    goto :goto_0

    .line 12
    :pswitch_b
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->x(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/CommonMultiItemBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->I(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonMultiItemBean;)V

    return-void
.end method
