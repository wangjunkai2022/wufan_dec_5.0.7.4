.class public Lcom/join/mgps/adapter/CollectionModuleSevenHorizontalAdapter;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "CollectionModuleSevenHorizontalAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/dto/CommonGameInfoBean;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/CommonGameInfoBean;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7f0c0378

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 11
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 2
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object v0

    if-eqz v0, :cond_a

    .line 3
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v0

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p2

    const v2, 0x7f0907a4

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getIco()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getGif_ico()Ljava/lang/String;

    move-result-object v3

    :goto_0
    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v2, 0x7f09010a

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v2, 0x1

    new-array v2, v2, [I

    const v3, 0x7f090488

    aput v3, v2, v1

    .line 7
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;

    const-string v1, "\u66f4\u65b0"

    const v2, 0x7f060034

    const v4, 0x7f080c50

    const-string v5, "\u542f\u52a8"

    const v6, 0x7f060031

    const v7, 0x7f080c49

    const v8, 0x7f0914f9

    if-nez v0, :cond_4

    .line 8
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    iget-object v0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v9, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 10
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_2

    .line 11
    iget-object v0, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-static {v0}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v0

    iget-object v9, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v9, v10}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object v0

    .line 12
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v0}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p2

    if-ge v0, p2, :cond_1

    .line 13
    invoke-virtual {p1, v8, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 14
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 15
    :cond_1
    invoke-virtual {p1, v8, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 16
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 17
    :cond_2
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 18
    invoke-virtual {p1, v8}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_1

    .line 19
    :cond_3
    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    invoke-virtual {p2}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    .line 20
    invoke-virtual {p1, v8}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-static {v0, p1, p2}, Lcom/join/mgps/Util/UtilsMy;->g3(Landroid/widget/TextView;Landroid/view/View;Lcom/join/mgps/dto/GInfoBean;)V

    goto/16 :goto_1

    .line 21
    :cond_4
    invoke-virtual {v0}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result p2

    const v0, 0x7f06002b

    const v9, 0x7f080c44

    if-eqz p2, :cond_9

    const/16 v10, 0x2a

    if-eq p2, v10, :cond_8

    const/16 v10, 0x30

    if-eq p2, v10, :cond_7

    const/4 v10, 0x2

    if-eq p2, v10, :cond_6

    const/4 v10, 0x3

    if-eq p2, v10, :cond_5

    const/4 v10, 0x5

    if-eq p2, v10, :cond_8

    const/4 v2, 0x6

    if-eq p2, v2, :cond_5

    const/4 v2, 0x7

    if-eq p2, v2, :cond_9

    packed-switch p2, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    const-string p2, "\u89e3\u538b"

    .line 22
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :pswitch_1
    const-string p2, "\u5b89\u88c5"

    .line 23
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 24
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :pswitch_2
    const-string p2, "\u7b49\u5f85"

    .line 25
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    .line 26
    :pswitch_3
    invoke-virtual {p1, v8, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v7}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 27
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto/16 :goto_1

    :cond_5
    const-string p2, "\u7ee7\u7eed"

    .line 28
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 29
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    :cond_6
    const-string p2, "\u6682\u505c"

    .line 30
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 31
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    :cond_7
    const-string p2, "\u5b89\u88c5\u4e2d"

    .line 32
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 33
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 34
    :cond_8
    invoke-virtual {p1, v8, v5}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 35
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    :cond_9
    const-string p2, "\u83b7\u53d6"

    .line 36
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    invoke-virtual {p1, v3, v9}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    .line 37
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    :cond_a
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/CollectionModuleSevenHorizontalAdapter;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    return-void
.end method
