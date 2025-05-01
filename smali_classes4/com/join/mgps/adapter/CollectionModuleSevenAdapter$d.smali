.class Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;
.super Ljava/lang/Object;
.source "CollectionModuleSevenAdapter.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->M(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionSevenListBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/ArrayList;

.field final synthetic b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->a:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemChildClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 3

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/dto/CommonGameInfoBean;

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getJp_info()Lcom/join/mgps/dto/JpInfoBean;

    move-result-object p2

    invoke-virtual {p2}, Lcom/join/mgps/dto/JpInfoBean;->getLink_type()Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const/4 p3, 0x1

    if-eq p2, p3, :cond_0

    .line 3
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p3}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->A(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    invoke-virtual {p2, p3, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    goto/16 :goto_2

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p2

    if-nez p2, :cond_1

    return-void

    .line 5
    :cond_1
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p2

    .line 6
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getG_info()Lcom/join/mgps/dto/GInfoBean;

    move-result-object p3

    .line 7
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v2, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v2}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    invoke-virtual {p1}, Lcom/join/mgps/dto/CommonGameInfoBean;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 9
    iget-object p3, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p3}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->B(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p3

    invoke-static {p2, p3}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 10
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object p3, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p3}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->C(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_2
    if-nez p2, :cond_6

    .line 11
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getTag_info()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 12
    iget-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->E(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->D(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 13
    iget-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->k(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {v0}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->F(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object p2

    .line 14
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result p2

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ge p2, v0, :cond_3

    goto :goto_0

    .line 15
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->m(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->l(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getPackage_name()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 16
    :cond_4
    :goto_0
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p2

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p2

    if-lez p2, :cond_5

    .line 17
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->n(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_1

    .line 18
    :cond_5
    iget-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->o(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :goto_1
    return-void

    :cond_6
    const/4 v0, 0x0

    if-eqz p2, :cond_7

    .line 19
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    .line 20
    :cond_7
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from(I)V

    .line 21
    invoke-virtual {p1}, Lcom/join/mgps/dto/DownloadPointBase;->get_from_type()I

    move-result v1

    invoke-virtual {p2, v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->set_from_type(I)V

    .line 22
    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    invoke-virtual {p3}, Lcom/join/mgps/dto/GInfoBean;->getId()Ljava/lang/String;

    move-result-object p3

    invoke-static {v1, p3}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p3

    const/16 v1, 0x2b

    if-lez p3, :cond_8

    const/16 v0, 0x2b

    :cond_8
    if-eqz v0, :cond_f

    const/16 p3, 0xd

    if-eq v0, p3, :cond_e

    const/4 p3, 0x2

    if-eq v0, p3, :cond_d

    const/4 p3, 0x3

    if-eq v0, p3, :cond_c

    const/4 p3, 0x5

    if-eq v0, p3, :cond_b

    const/4 p3, 0x6

    if-eq v0, p3, :cond_c

    const/4 p3, 0x7

    if-eq v0, p3, :cond_f

    const/16 p3, 0x2a

    if-eq v0, p3, :cond_a

    if-eq v0, v1, :cond_f

    packed-switch v0, :pswitch_data_0

    goto :goto_2

    .line 23
    :pswitch_0
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->t(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 24
    :pswitch_1
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->v(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_9

    .line 25
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->w(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string p2, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 26
    :cond_9
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->x(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 27
    :cond_a
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->y(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 28
    :cond_b
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->q(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/join/mgps/Util/UtilsMy;->T3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 29
    :cond_c
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->r(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p2, p1}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto :goto_2

    .line 30
    :cond_d
    :pswitch_2
    invoke-static {p2}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 31
    :cond_e
    iget-object p1, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->p(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_2

    .line 32
    :cond_f
    iget-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-virtual {p2, p1}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->G(Lcom/join/mgps/dto/CommonGameInfoBean;)V

    .line 33
    iget-object p2, p0, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter$d;->b:Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;

    invoke-static {p2}, Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;->s(Lcom/join/mgps/adapter/CollectionModuleSevenAdapter;)Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, p1}, Lcom/join/mgps/Util/UtilsMy;->F2(Landroid/content/Context;Lcom/join/mgps/dto/CommonGameInfoBean;)V

    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
