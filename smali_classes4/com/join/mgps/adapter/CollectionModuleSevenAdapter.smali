.class public Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "CollectionModuleSevenAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/dto/CollectionSevenListBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:I = 0x1

.field public static final f:I = 0x2

.field public static final g:I = 0x3

.field public static final h:I = 0x4

.field public static final i:I = 0x5


# instance fields
.field private d:Lcom/join/android/app/component/video/g;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/join/android/app/component/video/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CollectionSevenListBean;",
            ">;",
            "Lcom/join/android/app/component/video/g;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->d:Lcom/join/android/app/component/video/g;

    const/4 p1, 0x1

    const p2, 0x7f0c0379

    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x2

    const p2, 0x7f0c037a

    .line 4
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x3

    const p2, 0x7f0c0376

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x4

    const p2, 0x7f0c0377

    .line 6
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x5

    const p2, 0x7f0c0375

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    return-void
.end method

.method static synthetic A(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic B(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic C(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic D(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic E(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic F(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method private synthetic I(Lcom/join/mgps/dto/CollectionSevenListBean;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionSevenListBean;->getTpl_type()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionSevenListBean;->getCollection_id()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->goColloctionList(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private J(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 5

    const/16 v0, 0x8

    .line 1
    :try_start_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v1

    instance-of v1, v1, Ljava/util/ArrayList;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    const v1, 0x7f0910e9

    .line 3
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v3, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 5
    new-instance v2, Lcom/join/mgps/adapter/CollectionModuleSevenAdAdapter;

    invoke-direct {v2, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdAdapter;-><init>(Ljava/util/List;)V

    .line 6
    new-instance v3, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;

    invoke-direct {v3, p0, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$a;-><init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Ljava/util/ArrayList;)V

    invoke-virtual {v2, v3}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 7
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p2

    .line 9
    invoke-virtual {p2}, Ljava/lang/Exception;->printStackTrace()V

    .line 10
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private K(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v2, :cond_f

    .line 2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 4
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_10

    .line 5
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    .line 6
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v5

    const v6, 0x7f09078d

    .line 7
    invoke-virtual {v1, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :cond_0
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v7

    :goto_0
    invoke-static {v6, v7}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v6, 0x7f090664

    .line 8
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v6, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v6, 0x1

    new-array v7, v6, [I

    const v8, 0x7f090488

    aput v8, v7, v4

    .line 9
    invoke-virtual {v1, v7}, Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;

    .line 10
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    const-string v9, ""

    const/4 v10, 0x0

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x2

    if-eqz v11, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/TipBean;

    if-lt v10, v12, :cond_2

    goto/16 :goto_2

    .line 11
    :cond_2
    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "44"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "45"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "47"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "48"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "25"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "154"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "7"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto/16 :goto_1

    .line 12
    :cond_3
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " \u00b7 "

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_1

    .line 13
    :cond_4
    :goto_2
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v7

    sub-int/2addr v7, v12

    invoke-static {v4, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v9, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 14
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    const-wide/high16 v13, 0x4090000000000000L    # 1024.0

    mul-double v9, v9, v13

    mul-double v9, v9, v13

    double-to-long v9, v9

    .line 15
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "| "

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const v9, 0x7f09156c

    .line 16
    invoke-virtual {v1, v9, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v7, 0x7f090663

    .line 17
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v7, v9}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v7, "\u66f4\u65b0"

    const v9, 0x7f060034

    const v10, 0x7f080c50

    const-string v11, "\u542f\u52a8"

    const v13, 0x7f060031

    const v14, 0x7f080c49

    const v4, 0x7f0914f9

    if-nez v3, :cond_8

    .line 18
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v3

    const v12, 0x7f080c43

    if-eqz v3, :cond_7

    .line 19
    iget-object v3, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v6, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3, v6, v15}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 20
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_6

    .line 21
    iget-object v3, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v6, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v6, v12}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v3

    .line 22
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    if-ge v3, v5, :cond_5

    .line 23
    invoke-virtual {v1, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v14}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 24
    :cond_5
    invoke-virtual {v1, v4, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v10}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 25
    :cond_6
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 26
    invoke-virtual {v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v1, v8}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v3, v6, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    .line 27
    invoke-virtual {v1, v8, v12}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 28
    :cond_7
    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v5}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v6}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 29
    invoke-virtual {v1, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v1, v8}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    invoke-static {v3, v6, v5}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    .line 30
    invoke-virtual {v1, v8, v12}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 31
    :cond_8
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    const v5, 0x7f080c44

    if-eqz v3, :cond_d

    const/16 v6, 0x2a

    if-eq v3, v6, :cond_c

    const/16 v6, 0x30

    if-eq v3, v6, :cond_b

    if-eq v3, v12, :cond_a

    const/4 v6, 0x3

    if-eq v3, v6, :cond_9

    const/4 v6, 0x5

    if-eq v3, v6, :cond_c

    const/4 v6, 0x6

    if-eq v3, v6, :cond_9

    const/4 v6, 0x7

    if-eq v3, v6, :cond_d

    packed-switch v3, :pswitch_data_0

    goto/16 :goto_3

    :pswitch_0
    const-string v3, "\u89e3\u538b"

    .line 32
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    :pswitch_1
    const-string v3, "\u89e3\u538b\u4e2d"

    .line 33
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    :pswitch_2
    const-string v3, "\u5b89\u88c5"

    .line 34
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v14}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    :pswitch_3
    const-string v3, "\u7b49\u5f85"

    .line 35
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    .line 36
    :pswitch_4
    invoke-virtual {v1, v4, v7}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v14}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v13}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_3

    :cond_9
    const-string v3, "\u7ee7\u7eed"

    .line 37
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    :cond_a
    const v6, 0x7f06002b

    const-string v3, "\u6682\u505c"

    .line 38
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    :cond_b
    const v6, 0x7f06002b

    const-string v3, "\u5b89\u88c5\u4e2d"

    .line 39
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 40
    :cond_c
    invoke-virtual {v1, v4, v11}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v10}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    :cond_d
    const-string v3, "\u83b7\u53d6"

    .line 41
    invoke-virtual {v1, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v8, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    iget-object v5, v0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-virtual {v3, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    :goto_3
    const v3, 0x7f09180f

    .line 42
    invoke-virtual {v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/join/android/app/component/video/MultiStandVideo;

    if-eqz v1, :cond_10

    .line 43
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/join/android/app/component/video/MultiStandVideo;->getUrl()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_e

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object v3

    invoke-virtual {v3}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_10

    .line 44
    :cond_e
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/android/app/component/video/MultiStandVideo;->g(Ljava/lang/String;)V

    .line 45
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/join/android/app/component/video/MultiStandVideo;->setName(Ljava/lang/String;)V

    .line 46
    iget-object v3, v0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->d:Lcom/join/android/app/component/video/g;

    invoke-virtual {v3}, Lcom/join/android/app/component/video/g;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayTag(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->hashCode()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setPlayPosition(I)V

    .line 48
    invoke-virtual {v2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getV_url()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, ""

    move-object v3, v1

    invoke-virtual/range {v3 .. v8}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setUpLazy(Ljava/lang/String;ZLjava/io/File;Ljava/util/Map;Ljava/lang/String;)Z

    const/4 v3, 0x0

    .line 49
    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setRotateViewAuto(Z)V

    const/4 v4, 0x1

    .line 50
    invoke-virtual {v1, v4}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setLockLand(Z)V

    .line 51
    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setReleaseWhenLossAudio(Z)V

    .line 52
    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYBaseVideoPlayer;->setShowFullAnimation(Z)V

    .line 53
    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setIsTouchWiget(Z)V

    .line 54
    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoControlView;->setNeedLockFull(Z)V

    const/4 v3, 0x0

    .line 55
    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/StandardGSYVideoPlayer;->setBottomProgressBarDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    new-instance v3, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;

    invoke-direct {v3, v0, v2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$b;-><init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    invoke-virtual {v1, v3}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->setVideoAllCallBack(Ls2/h;)V

    goto :goto_4

    .line 57
    :cond_f
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_10
    :goto_4
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

.method private L(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    .line 1
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    if-eqz v0, :cond_10

    .line 2
    invoke-virtual/range {p2 .. p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 3
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v3

    if-eqz v3, :cond_11

    .line 5
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v3

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    const v5, 0x7f09063c

    .line 7
    invoke-virtual {v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v6

    :goto_0
    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v5, 0x7f09151e

    .line 8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v5, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v5, 0x1

    new-array v6, v5, [I

    const v7, 0x7f090488

    aput v7, v6, v4

    .line 9
    invoke-virtual {v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;

    .line 10
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const-string v8, ""

    move-object v10, v8

    const/4 v9, 0x0

    :cond_1
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/4 v12, 0x2

    if-eqz v11, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/join/mgps/dto/TipBean;

    if-lt v9, v12, :cond_2

    goto/16 :goto_2

    .line 11
    :cond_2
    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "44"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "45"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "47"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "48"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "25"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "154"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    const-string v13, "7"

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v12

    invoke-virtual {v12}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v12

    if-eqz v12, :cond_3

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v13

    invoke-virtual {v13}, Lcom/join/mgps/dto/TipBean;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto/16 :goto_1

    .line 12
    :cond_3
    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " \u00b7 "

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_1

    .line 13
    :cond_4
    :goto_2
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v12

    invoke-static {v4, v6}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-virtual {v10, v4, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    .line 14
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getApp_size()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v9

    const-wide/high16 v13, 0x4090000000000000L    # 1024.0

    mul-double v9, v9, v13

    mul-double v9, v9, v13

    double-to-long v9, v9

    .line 15
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, "| "

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->J2(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const v11, 0x7f09156c

    .line 16
    invoke-virtual {v2, v11, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 17
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getInfo()Ljava/lang/String;

    move-result-object v6

    const v13, 0x7f090663

    invoke-virtual {v2, v13, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 18
    sget-object v6, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v6}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v6

    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const v14, 0x7f090c7d

    const v15, 0x7f091051

    const v12, 0x7f09104a

    if-eqz v6, :cond_5

    .line 19
    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v12, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_5
    const-string v6, "\u542f\u52a8"

    const v7, 0x7f0914f9

    if-nez v3, :cond_9

    .line 20
    invoke-virtual {v2, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v3

    invoke-virtual {v3, v12, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 21
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 22
    iget-object v3, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 23
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v3

    if-nez v3, :cond_7

    .line 24
    iget-object v3, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {v3}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v3

    iget-object v4, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v3

    .line 25
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-virtual {v3}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ge v3, v0, :cond_6

    const-string v0, "\u66f4\u65b0"

    .line 26
    invoke-virtual {v2, v7, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090488

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_6
    const v3, 0x7f090488

    .line 27
    invoke-virtual {v2, v7, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c50

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060034

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 28
    :cond_7
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 29
    invoke-virtual {v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f090488

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v3, v5, v0}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const v3, 0x7f080c43

    .line 30
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06002b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 31
    :cond_8
    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v3

    invoke-virtual {v0}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 32
    invoke-virtual {v2, v7}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f090488

    invoke-virtual {v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v3, v5, v0}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    const v3, 0x7f080c43

    .line 33
    invoke-virtual {v2, v4, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06002b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 34
    :cond_9
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-eqz v0, :cond_f

    const/16 v7, 0x2a

    if-eq v0, v7, :cond_e

    const/16 v7, 0x30

    if-eq v0, v7, :cond_d

    const-string v7, "/"

    const/4 v12, 0x2

    if-eq v0, v12, :cond_c

    const/4 v12, 0x3

    if-eq v0, v12, :cond_a

    const/4 v12, 0x5

    if-eq v0, v12, :cond_e

    const/4 v6, 0x6

    if-eq v0, v6, :cond_a

    const/4 v6, 0x7

    if-eq v0, v6, :cond_f

    const v6, 0x7f080c48

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_5

    .line 35
    :pswitch_0
    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v5, 0x7f09104a

    invoke-virtual {v0, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 37
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v4, v3

    const v3, 0x7f0900f1

    .line 38
    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    const v3, 0x7f090d81

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b"

    const v3, 0x7f0914f9

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 39
    :pswitch_1
    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v5, 0x7f09104a

    invoke-virtual {v0, v5, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v4, v3

    const v3, 0x7f0900f1

    .line 42
    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b\u4e2d"

    const v3, 0x7f090d81

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u89e3\u538b\u4e2d"

    const v3, 0x7f0914f9

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_2
    const v3, 0x7f0914f9

    .line 43
    invoke-virtual {v2, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f090488

    invoke-virtual {v0, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f060031

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u5b89\u88c5"

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 44
    :pswitch_3
    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v4, 0x7f09104a

    invoke-virtual {v0, v4, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3

    long-to-int v4, v3

    const v3, 0x7f0900f1

    .line 47
    invoke-virtual {v2, v3, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u7b49\u5f85\u4e2d"

    const v3, 0x7f090d81

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v3, 0x7f09104a

    invoke-virtual {v0, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u7b49\u5f85"

    const v7, 0x7f0914f9

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :pswitch_4
    const v3, 0x7f09104a

    const v7, 0x7f0914f9

    .line 48
    invoke-virtual {v2, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f090488

    invoke-virtual {v0, v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060031

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u66f4\u65b0"

    invoke-virtual {v0, v7, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 49
    :cond_a
    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v6, 0x7f09104a

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v5, 0x7f080c43

    const v6, 0x7f090488

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v5, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f06002b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    const v6, 0x7f0914f9

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v5, "\u7ee7\u7eed"

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 50
    :try_start_0
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v5

    const-wide/16 v11, 0x0

    cmp-long v0, v5, v11

    if-nez v0, :cond_b

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_3

    .line 52
    :cond_b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_3
    move-object v8, v0

    .line 53
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    long-to-int v4, v3

    goto :goto_4

    :catch_0
    move-exception v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_4
    const v3, 0x7f0900f1

    .line 55
    invoke-virtual {v2, v3, v8}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u6682\u505c\u4e2d"

    const v3, 0x7f090d81

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090488

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06002b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const v3, 0x7f0914f9

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v6, 0x7f09104a

    invoke-virtual {v0, v6, v4}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_c
    const v6, 0x7f09104a

    .line 56
    invoke-virtual {v2, v11, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v5, v4

    const v4, 0x7f0900f1

    .line 59
    invoke-virtual {v2, v4, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSpeed()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/S"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const v3, 0x7f090d81

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v5}, Lcom/join/mgps/base/BaseViewHolder;->setProgress(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090488

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06002b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const v3, 0x7f0914f9

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u6682\u505c"

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    :cond_d
    const v3, 0x7f0914f9

    .line 60
    invoke-virtual {v2, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v4, 0x7f090488

    invoke-virtual {v0, v4, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v4, 0x7f06002b

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u5b89\u88c5\u4e2d"

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_5

    .line 61
    :cond_e
    invoke-virtual {v2, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c50

    const v3, 0x7f090488

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f060034

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const v3, 0x7f0914f9

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v3, v6}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 62
    :cond_f
    invoke-virtual {v2, v11, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v13, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v14, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    invoke-virtual {v0, v15, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f09104a

    invoke-virtual {v0, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v2, 0x7f080c43

    const v3, 0x7f090488

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    iget-object v2, v1, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f06002b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    const v3, 0x7f0914f9

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const-string v2, "\u83b7\u53d6"

    invoke-virtual {v0, v3, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 63
    :cond_10
    iget-object v0, v2, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_11
    :goto_5
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

.method private M(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getItem()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/ArrayList;

    const v0, 0x7f0910e9

    .line 3
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object v1, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 5
    new-instance v0, Lcom/join/mgps/adapter/CollectionModuleSevenHorizontalAdapter;

    invoke-direct {v0, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenHorizontalAdapter;-><init>(Ljava/util/List;)V

    .line 6
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 7
    new-instance p1, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;

    invoke-direct {p1, p0, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$c;-><init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Ljava/util/ArrayList;)V

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/join/mgps/base/BaseQuickAdapter$j;)V

    .line 8
    new-instance p1, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;

    invoke-direct {p1, p0, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;-><init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Ljava/util/ArrayList;)V

    invoke-virtual {v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->setOnItemChildClickListener(Lcom/join/mgps/base/BaseQuickAdapter$h;)V

    goto :goto_0

    .line 9
    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method private N(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f091461

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getCollection_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const v1, 0x7f090e4f

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    const v2, 0x7f09133f

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getSubTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/adapter/f;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/f;-><init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Lcom/join/mgps/dto/CollectionSevenListBean;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->I(Lcom/join/mgps/dto/CollectionSevenListBean;Landroid/view/View;)V

    return-void
.end method

.method static synthetic i(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic j(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic k(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic l(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic m(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic n(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic o(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic p(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic q(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic r(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic s(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic t(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic u(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic v(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic w(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic x(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic y(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic z(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    return-object p0
.end method


# virtual methods
.method G(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 3

    const/16 v0, 0x96

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from(I)V

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->set_from_type(I)V

    .line 3
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->getExt()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    new-instance v0, Lcom/join/mgps/dto/ExtBean;

    invoke-direct {v0}, Lcom/join/mgps/dto/ExtBean;-><init>()V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v0

    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->getExt()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/ExtBean;

    invoke-virtual {v0, v1, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/ExtBean;

    :goto_0
    const-string v1, "150"

    .line 6
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    .line 7
    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/dto/DownloadPointBase;->setExt(Ljava/lang/String;)V

    return-void
.end method

.method protected H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/dto/CollectionSevenListBean;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->J(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    goto :goto_0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->M(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    goto :goto_0

    .line 4
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->L(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    goto :goto_0

    .line 5
    :cond_3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->K(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    goto :goto_0

    .line 6
    :cond_4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->N(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    :goto_0
    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/CollectionSevenListBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->H(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V

    return-void
.end method
