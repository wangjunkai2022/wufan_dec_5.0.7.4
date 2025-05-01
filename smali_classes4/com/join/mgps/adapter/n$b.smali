.class Lcom/join/mgps/adapter/n$b;
.super Ljava/lang/Object;
.source "DownloadCenterAdapter1.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/adapter/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

.field c:Lcom/join/mgps/business/CollectionBeanSubBusiness;

.field d:I

.field e:Ljava/lang/String;

.field final synthetic f:Lcom/join/mgps/adapter/n;


# direct methods
.method public constructor <init>(Lcom/join/mgps/adapter/n;Lcom/join/mgps/business/CollectionBeanSubBusiness;ILjava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 3
    iput-object p2, p0, Lcom/join/mgps/adapter/n$b;->c:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    .line 4
    iput p3, p0, Lcom/join/mgps/adapter/n$b;->d:I

    .line 5
    iput-object p4, p0, Lcom/join/mgps/adapter/n$b;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->c:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/business/CollectionBeanSubBusiness;->getDownloadTask()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->e:Ljava/lang/String;

    const-string v1, "4-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->e:Ljava/lang/String;

    const-string v1, "6-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->e:Ljava/lang/String;

    const-string v1, "5-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 5
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/join/mgps/adapter/n$b;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/mgps/adapter/n;->k(Lcom/join/mgps/adapter/n;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v3, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v3}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, ""

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 7
    new-instance v0, Lcom/join/mgps/Util/IntentDateBean;

    invoke-direct {v0}, Lcom/join/mgps/Util/IntentDateBean;-><init>()V

    const/4 v1, 0x4

    .line 8
    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type(I)V

    .line 9
    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_url_remote()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/Util/IntentDateBean;->setLink_type_val(Ljava/lang/String;)V

    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadtaskDown()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object p1

    .line 11
    :cond_2
    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v1, v1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1, v1}, Lcom/join/mgps/Util/UtilsMy;->T2(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    .line 12
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v1, v1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void

    :cond_3
    if-nez p1, :cond_9

    .line 13
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTag_info()Ljava/util/ArrayList;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->o0(Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 14
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object p1

    if-nez p1, :cond_5

    .line 15
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 16
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->l(Landroid/content/Context;Ljava/lang/String;)Lcom/join/android/app/common/utils/APKUtils$a;

    move-result-object p1

    .line 17
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/g2;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lcom/join/android/app/common/utils/APKUtils$a;->d()I

    move-result p1

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getVer()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-ge p1, v0, :cond_4

    goto :goto_1

    .line 18
    :cond_4
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->a0(Landroid/content/Context;Ljava/lang/String;)Z

    return-void

    .line 19
    :cond_5
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    .line 20
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPackage_name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->F(Ljava/lang/String;)Z

    move-result v0

    if-nez p1, :cond_6

    if-eqz v0, :cond_7

    .line 21
    :cond_6
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getMod_info()Lcom/join/mgps/dto/ModInfoBean;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/android/app/common/utils/APKUtils;->V(Landroid/content/Context;Lcom/join/mgps/dto/ModInfoBean;)V

    return-void

    .line 22
    :cond_7
    :goto_1
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_8

    .line 23
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_2

    .line 24
    :cond_8
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->Y0(Landroid/content/Context;Lcom/join/mgps/dto/CollectionBeanSub;)V

    :goto_2
    return-void

    :cond_9
    const/4 v0, 0x0

    if-eqz p1, :cond_a

    .line 25
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    .line 26
    :cond_a
    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    const/16 v3, 0x2b

    if-eqz v1, :cond_b

    .line 27
    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v1

    iget-object v4, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v4}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/join/mgps/Util/UtilsMy;->w0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v1

    if-lez v1, :cond_b

    const/16 v0, 0x2b

    :cond_b
    const/4 v1, 0x5

    if-eqz v0, :cond_14

    const/16 v4, 0xd

    if-eq v0, v4, :cond_13

    const/4 v4, 0x2

    if-eq v0, v4, :cond_12

    const/4 v5, 0x3

    if-eq v0, v5, :cond_11

    if-eq v0, v1, :cond_10

    const/4 v5, 0x6

    if-eq v0, v5, :cond_11

    const/4 v5, 0x7

    if-eq v0, v5, :cond_14

    const/16 v5, 0x2a

    const-string v6, "\u65e0\u7f51\u7edc\u8fde\u63a5"

    if-eq v0, v5, :cond_e

    if-eq v0, v3, :cond_14

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_3

    .line 28
    :pswitch_0
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->a4(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_3

    .line 29
    :pswitch_1
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 30
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v6}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 31
    :cond_c
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDownloadType()I

    move-result v0

    if-eq v0, v4, :cond_d

    .line 32
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->I2(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 33
    :cond_d
    invoke-static {p1}, Lcom/join/mgps/Util/UtilsMy;->u4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 34
    :cond_e
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_f

    .line 35
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    invoke-virtual {p1, v6}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    return-void

    .line 36
    :cond_f
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->r4(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 37
    :cond_10
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    const-string v1, "1"

    invoke-static {v0, p1, v1}, Lcom/join/mgps/Util/UtilsMy;->W3(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/lang/String;)V

    goto/16 :goto_3

    .line 38
    :cond_11
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {p1, v0}, Lcom/php25/PDownload/d;->c(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/content/Context;)V

    goto/16 :goto_3

    .line 39
    :cond_12
    :pswitch_2
    invoke-static {p1}, Lcom/php25/PDownload/d;->i(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 40
    :cond_13
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/php25/PDownload/d;->l(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_3

    .line 41
    :cond_14
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/join/mgps/adapter/n$b;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/adapter/n;->k(Lcom/join/mgps/adapter/n;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    if-eqz v0, :cond_18

    .line 43
    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getPay_tag_info()Lcom/join/mgps/dto/PayTagInfo;

    move-result-object v0

    iget-object v2, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/mgps/Util/UtilsMy;->y0(Lcom/join/mgps/dto/PayTagInfo;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_15

    .line 44
    iget-object p1, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object p1, p1, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getCrc_sign_id()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->d4(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_3

    .line 45
    :cond_15
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    const-string v2, "downloadGame4.2.0.6"

    invoke-static {v0, v2}, Lcom/umeng/analytics/MobclickAgent;->onEvent(Landroid/content/Context;Ljava/lang/String;)V

    .line 46
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-static {p1, v0}, Lcom/join/mgps/Util/UtilsMy;->y1(Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/dto/CollectionBeanSub;)V

    .line 47
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->o1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_16

    goto :goto_3

    .line 48
    :cond_16
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v0}, Lcom/join/mgps/dto/CollectionBeanSub;->getDown_status()I

    move-result v0

    if-ne v0, v1, :cond_17

    .line 49
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/join/mgps/Util/UtilsMy;->l1(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto :goto_3

    .line 50
    :cond_17
    iget-object v0, p0, Lcom/join/mgps/adapter/n$b;->f:Lcom/join/mgps/adapter/n;

    iget-object v0, v0, Lcom/join/mgps/adapter/m;->c:Landroid/app/Activity;

    iget-object v1, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/dto/CollectionBeanSub;->getTp_down_url()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v2}, Lcom/join/mgps/dto/CollectionBeanSub;->getOther_down_switch()I

    move-result v2

    iget-object v3, p0, Lcom/join/mgps/adapter/n$b;->b:Lcom/join/mgps/business/CollectionBeanSubBusiness;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CollectionBeanSub;->getCdn_down_switch()I

    move-result v3

    invoke-static {v0, p1, v1, v2, v3}, Lcom/join/mgps/Util/UtilsMy;->R0(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;Ljava/util/List;II)V

    :cond_18
    :goto_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
