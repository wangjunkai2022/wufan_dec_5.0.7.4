.class public Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "InstallAppDialogActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/InstallAppDialogActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MYAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/github/snowdream/android/app/downloader/DownloadTask;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/InstallAppDialogActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/InstallAppDialogActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;->a:Lcom/join/mgps/activity/InstallAppDialogActivity;

    const p1, 0x7f0c0358

    .line 2
    invoke-direct {p0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(I)V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 8

    const v0, 0x7f09145e

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    const v1, 0x7f09096f

    .line 2
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f091673

    .line 3
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f090253

    .line 4
    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/Button;

    const v5, 0x7f0900e0

    .line 5
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lcom/join/android/app/common/utils/MyImageLoader;->h(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v5, 0x7f0900e8

    .line 6
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v5, 0x7f080c43

    .line 7
    invoke-virtual {v4, v5}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 8
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getScore()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/join/mgps/Util/g2;->h(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_1

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getScore()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    const/4 v7, 0x0

    cmpg-float v5, v5, v7

    if-gtz v5, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setVisibility(I)V

    .line 10
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getScore()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    :cond_1
    :goto_0
    const/16 v5, 0x8

    .line 12
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 13
    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    :goto_1
    iget-object v1, p0, Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;->a:Lcom/join/mgps/activity/InstallAppDialogActivity;

    iget v2, v1, Lcom/join/mgps/activity/InstallAppDialogActivity;->h:I

    const/4 v5, 0x1

    if-ne v2, v5, :cond_2

    .line 15
    invoke-static {v1}, Lcom/join/mgps/activity/InstallAppDialogActivity;->a(Lcom/join/mgps/activity/InstallAppDialogActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1000f7

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f080c4f

    .line 16
    invoke-virtual {v4, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 17
    iget-object v1, p0, Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;->a:Lcom/join/mgps/activity/InstallAppDialogActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/InstallAppDialogActivity;->a(Lcom/join/mgps/activity/InstallAppDialogActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060034

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/widget/Button;->setTextColor(I)V

    goto :goto_2

    .line 18
    :cond_2
    invoke-static {v1}, Lcom/join/mgps/activity/InstallAppDialogActivity;->a(Lcom/join/mgps/activity/InstallAppDialogActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f1001bc

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f080c48

    .line 19
    invoke-virtual {v4, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 20
    iget-object v1, p0, Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;->a:Lcom/join/mgps/activity/InstallAppDialogActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/InstallAppDialogActivity;->a(Lcom/join/mgps/activity/InstallAppDialogActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f060031

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v4, v1}, Landroid/widget/Button;->setTextColor(I)V

    .line 21
    :goto_2
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getTipBeans()Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object p2

    iget-object v2, p0, Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;->a:Lcom/join/mgps/activity/InstallAppDialogActivity;

    invoke-static {v2}, Lcom/join/mgps/activity/InstallAppDialogActivity;->a(Lcom/join/mgps/activity/InstallAppDialogActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, p2, v0, v2}, Lcom/join/mgps/Util/UtilsMy;->J(Ljava/util/List;Lcom/join/mgps/dto/TipNew;Landroid/widget/LinearLayout;Landroid/content/Context;)V

    new-array p2, v5, [I

    aput v3, p2, v6

    .line 22
    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseViewHolder;->addOnClickListener([I)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method public bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/InstallAppDialogActivity$MYAdapter;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method
