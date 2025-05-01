.class public Lcom/join/mgps/adapter/MyGameAdapterV1;
.super Lcom/join/mgps/base/BaseMultiItemQuickAdapter;
.source "MyGameAdapterV1.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/adapter/MyGameAdapterV1$f;,
        Lcom/join/mgps/adapter/MyGameAdapterV1$g;,
        Lcom/join/mgps/adapter/MyGameAdapterV1$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseMultiItemQuickAdapter<",
        "Lcom/join/mgps/adapter/MyGameAdapterV1$g;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# static fields
.field public static final l:I = 0x1

.field public static final m:I = 0x2

.field public static final n:I = 0x3

.field public static final o:I = 0x4

.field public static final p:I = 0x5

.field public static final q:I = 0x6


# instance fields
.field d:Landroid/content/Context;

.field e:Ljava/lang/String;

.field f:Z

.field g:Z

.field h:I

.field i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

.field private j:Lcom/join/mgps/dto/CommonGameInfoBean;

.field private k:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;-><init>(Ljava/util/List;)V

    const-string v0, ""

    .line 2
    iput-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->e:Ljava/lang/String;

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->f:Z

    .line 4
    iput-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->g:Z

    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->h:I

    .line 6
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    const/4 p1, 0x1

    const v0, 0x7f0c0286

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x2

    const v0, 0x7f0c0282

    .line 8
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x3

    const v0, 0x7f0c0281

    .line 9
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x4

    const v1, 0x7f0c027f

    .line 10
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x5

    const v1, 0x7f0c0283

    .line 11
    invoke-virtual {p0, p1, v1}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    const/4 p1, 0x6

    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/base/BaseMultiItemQuickAdapter;->a(II)V

    .line 13
    new-instance p1, Lcom/join/mgps/adapter/MyGameAdapterV1$a;

    invoke-direct {p1, p0}, Lcom/join/mgps/adapter/MyGameAdapterV1$a;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;)V

    invoke-virtual {p0, p1}, Lcom/join/mgps/base/BaseQuickAdapter;->setSpanSizeLookup(Lcom/join/mgps/base/BaseQuickAdapter$m;)V

    return-void
.end method

.method private synthetic C(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/join/mgps/activity/mygame/MyGameGuesslikeActivity_;->intent(Landroid/content/Context;)Lcom/join/mgps/activity/mygame/MyGameGuesslikeActivity_$IntentBuilder_;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    instance-of v0, p1, Lcom/join/mgps/activity/MGMainActivity;

    if-eqz v0, :cond_0

    .line 3
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onclickTabGuessuLike:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    .line 4
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    instance-of v0, p1, Lcom/join/mgps/activity/MyGameManagerActivity;

    if-eqz v0, :cond_1

    .line 5
    invoke-static {p1}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object p1

    sget-object v0, Lcom/papa/sim/statistic/Event;->onclickCentreGuessuLike:Lcom/papa/sim/statistic/Event;

    new-instance v1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    invoke-virtual {p1, v0, v1}, Lcom/papa/sim/statistic/p;->O1(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;)V

    :cond_1
    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->g:Z

    return-void
.end method

.method private static synthetic D(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Lcom/join/mgps/activity/MyGameUpdateManagerActivity_;->J0(Landroid/content/Context;)Lcom/join/mgps/activity/MyGameUpdateManagerActivity_$k;

    move-result-object p0

    invoke-virtual {p0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method

.method private synthetic E(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1$f;->b(Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {p2, v0, p1}, Lcom/join/mgps/Util/IntentUtil;->goGameDetialActivityBYDownloadTAsk(Landroid/content/Context;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :goto_0
    return-void
.end method

.method private synthetic F(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    if-eqz p3, :cond_1

    .line 2
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result p3

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    .line 3
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$f;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result p3

    const/4 v0, 0x6

    if-ne p3, v0, :cond_1

    .line 5
    iget-object p3, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result p1

    invoke-interface {p3, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$f;->c(ILcom/github/snowdream/android/app/downloader/DownloadTask;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static synthetic G(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method private synthetic H(ZLcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object p4, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p4, v0}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object p1

    iget-object p4, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p4, p2}, Lcom/join/android/app/common/utils/APKUtils;->f0(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {p0, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->x(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 4
    invoke-static {p2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p0, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->x(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 7
    invoke-static {p2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 9
    :goto_0
    invoke-virtual {p3}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method private synthetic I(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)Z
    .locals 7

    .line 1
    iget-object p2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    const/4 v0, 0x1

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1$f;->i(Ljava/lang/String;)V

    return v0

    .line 3
    :cond_0
    new-instance p2, Lcom/join/mgps/customview/o;

    iget-object v1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    const v2, 0x7f110191

    invoke-direct {p2, v1, v2}, Lcom/join/mgps/customview/o;-><init>(Landroid/content/Context;I)V

    const v1, 0x7f0c0167

    .line 4
    invoke-virtual {p2, v1}, Landroid/app/Dialog;->setContentView(I)V

    const v1, 0x7f090425

    .line 5
    invoke-virtual {p2, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const v2, 0x7f09145c

    .line 6
    invoke-virtual {p2, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f090428

    .line 7
    invoke-virtual {p2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const-string v4, "\u5220\u9664\u6e38\u620f"

    .line 8
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v2, 0x0

    .line 9
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u5220\u9664"

    if-eqz v4, :cond_2

    .line 10
    sget-object v6, Lcom/join/mgps/enums/Dtype;->android:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 11
    iget-object v2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-static {v2}, Lcom/join/android/app/common/utils/e;->l0(Landroid/content/Context;)Lcom/join/android/app/common/utils/e;

    move-result-object v2

    iget-object v4, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v4, v6}, Lcom/join/android/app/common/utils/APKUtils;->d(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "\u4f60\u786e\u5b9a\u8981\u5378\u8f7d\u8be5\u6e38\u620f\uff1f"

    .line 12
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const-string v2, "\u5378\u8f7d"

    .line 13
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    const-string v2, "\u4f60\u786e\u5b9a\u8981\u5220\u9664\u8be5\u6e38\u620f\uff1f"

    .line 14
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    invoke-virtual {v1, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    const/4 v2, 0x1

    goto :goto_1

    :cond_2
    const-string v4, "\u4f60\u786e\u5b9a\u8981\u5220\u9664\u8be5\u6e38\u620f\u53ca\u6587\u4ef6\uff1f"

    .line 16
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 17
    invoke-virtual {v1, v5}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    :goto_1
    const v3, 0x7f09041f

    .line 18
    invoke-virtual {p2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    .line 19
    new-instance v4, Lcom/join/mgps/adapter/p2;

    invoke-direct {v4, p2}, Lcom/join/mgps/adapter/p2;-><init>(Landroid/app/Dialog;)V

    invoke-virtual {v3, v4}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 20
    new-instance v3, Lcom/join/mgps/adapter/t2;

    invoke-direct {v3, p0, v2, p1, p2}, Lcom/join/mgps/adapter/t2;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;ZLcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/app/Dialog;)V

    invoke-virtual {v1, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 21
    invoke-virtual {p2}, Landroid/app/Dialog;->show()V

    return v0
.end method

.method private T(Lcom/join/mgps/base/BaseViewHolder;Z)V
    .locals 7

    const v0, 0x7f09078d

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const v2, 0x7f090ea1

    .line 3
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const/4 v4, 0x0

    if-eqz p2, :cond_0

    .line 4
    iget-object v5, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f07114b

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    iput v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v5, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f071220

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    invoke-virtual {v2, v4, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v2, 0x1

    .line 6
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 7
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setSingleLine(Z)V

    const/4 v5, 0x2

    .line 9
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 10
    iget-object v3, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f0711c3

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    float-to-int v3, v3

    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 11
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iget-object v3, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v5, 0x7f07124c

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v3

    invoke-virtual {v2, v4, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 12
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f09087b

    .line 13
    invoke-virtual {p1, v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f090cf6

    .line 14
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 15
    invoke-virtual {p1, v0, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09176a

    .line 16
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const p2, 0x7f0915ca

    .line 17
    invoke-virtual {p1, p2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const p2, 0x7f0903f9

    .line 18
    invoke-virtual {p1, p2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method private U(Lcom/join/mgps/base/BaseViewHolder;)V
    .locals 4

    const v0, 0x7f09078d

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f07114b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f090ea1

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 7
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f071220

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    const v0, 0x7f09087b

    .line 9
    invoke-virtual {p1, v0, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f09104a

    .line 10
    invoke-virtual {p1, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v1, 0x7f09176a

    .line 11
    invoke-virtual {p1, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f090cf6

    .line 12
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f0915ca

    .line 13
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v2, 0x7f0903f9

    .line 14
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 15
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 16
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 17
    iput v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 18
    iput v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private V(Lcom/join/mgps/base/BaseViewHolder;Z)V
    .locals 12

    const v0, 0x7f09078d

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 2
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const v2, 0x7f09087b

    .line 3
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 4
    invoke-virtual {v3}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const v5, 0x7f090ea1

    .line 5
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v7, 0x7f07122b

    const v8, 0x7f09176a

    const/4 v9, 0x0

    if-eqz p2, :cond_0

    .line 6
    iget-object v10, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f07114b

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    float-to-int v10, v10

    iput v10, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 7
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iget-object v10, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f071220

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-virtual {v5, v9, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    const/4 v5, -0x1

    .line 8
    iput v5, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 9
    iget-object v5, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    iput v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v5, 0x1

    .line 10
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 11
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    goto :goto_0

    .line 12
    :cond_0
    iput v8, v4, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 13
    iget-object v10, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f0711c3

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    float-to-int v10, v10

    iput v10, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 14
    invoke-virtual {p1, v5}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    iget-object v10, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v11, 0x7f07124c

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    invoke-virtual {v5, v9, v10}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 15
    iget-object v5, p0, Lcom/join/mgps/base/BaseQuickAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v5

    float-to-int v5, v5

    iput v5, v4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 v5, 0x2

    .line 16
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 17
    invoke-virtual {v6, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 18
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const v0, 0x7f090cf6

    .line 20
    invoke-virtual {p1, v0, v9}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 21
    invoke-virtual {p1, v2, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f09104a

    .line 22
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 23
    invoke-virtual {p1, v8, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f0903f9

    .line 24
    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method public static synthetic h(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->E(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic i(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->I(Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->G(Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic k(Lcom/join/mgps/adapter/MyGameAdapterV1;ZLcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/app/Dialog;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/join/mgps/adapter/MyGameAdapterV1;->H(ZLcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/app/Dialog;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic l(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/join/mgps/adapter/MyGameAdapterV1;->D(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic m(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/join/mgps/adapter/MyGameAdapterV1;->F(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic n(Lcom/join/mgps/adapter/MyGameAdapterV1;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->C(Landroid/view/View;)V

    return-void
.end method

.method static synthetic o(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/join/mgps/base/BaseViewHolder;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    return-void
.end method

.method static synthetic p(Lcom/join/mgps/adapter/MyGameAdapterV1;)Lcom/join/mgps/dto/CommonGameInfoBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->j:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-object p0
.end method

.method private q(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5171"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "\u6b3e\u6e38\u620f"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f0903b5

    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    return-void
.end method

.method private r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09078d

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 3
    invoke-virtual {v1}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getTag()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 4
    :cond_1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    .line 5
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    :cond_2
    const v0, 0x7f090ea1

    .line 6
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 7
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0x8

    const v2, 0x7f09104a

    const/4 v3, 0x0

    if-ne v0, v1, :cond_3

    .line 8
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v2, v4

    invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0

    .line 9
    :cond_3
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ProgressBar;

    invoke-virtual {v1, v3}, Landroid/widget/ProgressBar;->setProgress(I)V

    :goto_0
    const/4 v1, 0x5

    const v2, 0x7f090f19

    const/4 v4, 0x1

    if-ne v0, v1, :cond_4

    .line 10
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isOpen()Z

    move-result v0

    xor-int/2addr v0, v4

    invoke-virtual {p1, v2, v0}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 11
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 12
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isOpen()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info_switch()I

    move-result v1

    if-ne v1, v4, :cond_5

    const v1, 0x7f0915e9

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/CommonGameInfoBean;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_1

    .line 14
    :cond_4
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 15
    :cond_5
    :goto_1
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->P(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 16
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-virtual {p0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItemCount()I

    move-result v1

    const v2, 0x7f0912e7

    if-ge v0, v1, :cond_6

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getLayoutPosition()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;

    iget-boolean v0, v0, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->f:Z

    if-eqz v0, :cond_6

    .line 17
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_2

    .line 18
    :cond_6
    invoke-virtual {p0, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 19
    invoke-virtual {p1, v2, v4}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 20
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    new-instance v0, Lcom/join/mgps/adapter/MyGameAdapterV1$b;

    invoke-direct {v0, p0, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$b;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 21
    :cond_7
    invoke-virtual {p1, v2, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    :goto_2
    return-void
.end method

.method private s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V
    .locals 6

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/activity/mygame/data/RecommendGameListBean;

    .line 3
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/adapter/q2;

    invoke-direct {v1, p0}, Lcom/join/mgps/adapter/q2;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/activity/mygame/data/RecommendGameListBean;->getRecommend_list()Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x3

    new-array v1, v0, [Lcom/facebook/drawee/view/SimpleDraweeView;

    const v2, 0x7f09078e

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    const v3, 0x7f09078f

    invoke-virtual {p1, v3}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v5, 0x1

    aput-object v3, v1, v5

    const/4 v3, 0x2

    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/facebook/drawee/view/SimpleDraweeView;

    aput-object p1, v1, v3

    const/4 p1, 0x0

    :goto_0
    if-ge p1, v0, :cond_2

    .line 6
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v2

    if-lt p1, v2, :cond_1

    .line 7
    aget-object v2, v1, p1

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 8
    :cond_1
    aget-object v2, v1, p1

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 9
    aget-object v2, v1, p1

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/join/mgps/dto/CommonGameInfoBean;

    invoke-virtual {v3}, Lcom/join/mgps/dto/CommonGameInfoBean;->getBig_pic()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    :goto_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    if-nez p2, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09078d

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v0, 0x7f090ea1

    .line 3
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 4
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/16 v1, 0x8

    const v2, 0x7f09104a

    if-ne v0, v1, :cond_1

    .line 5
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Landroid/widget/ProgressBar;->setProgress(I)V

    goto :goto_0

    .line 6
    :cond_1
    invoke-virtual {p1, v2}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 7
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->P(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method private u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V
    .locals 1

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "\u6b3e\u6e38\u620f\u9700\u66f4\u65b0"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f0903b5

    invoke-virtual {p1, v0, p2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    sget-object p2, Lcom/join/mgps/adapter/u2;->b:Lcom/join/mgps/adapter/u2;

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->f:Z

    return v0
.end method

.method public B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->g:Z

    return v0
.end method

.method J()V
    .locals 10

    .line 1
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lp1/f;->X(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    if-eqz v0, :cond_3

    .line 2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_3

    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide v4, v2

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    cmp-long v7, v4, v2

    if-eqz v7, :cond_1

    .line 4
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFinishTime()J

    move-result-wide v7

    cmp-long v9, v4, v7

    if-gez v9, :cond_0

    .line 5
    :cond_1
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFinishTime()J

    move-result-wide v4

    move-object v1, v6

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_a

    .line 6
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->e:Ljava/lang/String;

    goto :goto_3

    .line 7
    :cond_3
    invoke-static {}, Lp1/f;->K()Lp1/f;

    move-result-object v0

    invoke-virtual {v0}, Lp1/f;->d()Ljava/util/List;

    move-result-object v0

    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .line 9
    :cond_4
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 10
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 11
    invoke-virtual {v5}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x3

    if-gt v5, v6, :cond_4

    .line 12
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 13
    :cond_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide v4, v2

    :cond_6
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 14
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v7

    const/4 v8, 0x5

    if-ne v7, v8, :cond_6

    cmp-long v7, v4, v2

    if-eqz v7, :cond_7

    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOpenTime()J

    move-result-wide v7

    cmp-long v9, v4, v7

    if-gez v9, :cond_6

    .line 15
    :cond_7
    invoke-virtual {v6}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getOpenTime()J

    move-result-wide v4

    move-object v1, v6

    goto :goto_2

    :cond_8
    if-eqz v1, :cond_9

    .line 16
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->e:Ljava/lang/String;

    goto :goto_3

    :cond_9
    const-string v0, ""

    .line 17
    iput-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->e:Ljava/lang/String;

    :cond_a
    :goto_3
    return-void
.end method

.method public K(Lcom/join/mgps/dto/CommonGameInfoBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->j:Lcom/join/mgps/dto/CommonGameInfoBean;

    return-void
.end method

.method public L(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->f:Z

    return-void
.end method

.method public M(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->g:Z

    return-void
.end method

.method public N(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->k:Ljava/lang/String;

    return-void
.end method

.method O(Landroid/widget/TextView;I)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ge p2, v0, :cond_1

    const/16 p2, 0x8

    .line 1
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setVisibility(I)V

    return-void

    :cond_1
    const/4 v1, 0x0

    .line 2
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 4
    invoke-virtual {p1}, Landroid/widget/TextView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/16 v4, 0xa

    const v5, 0x7f071279

    const/4 v6, 0x0

    if-ge p2, v4, :cond_2

    .line 5
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 6
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    iput v2, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 7
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 8
    invoke-virtual {p1, v6, v6, v6, v6}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const v2, 0x7f080a5d

    .line 9
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 10
    invoke-virtual {p1, v1, v1, v1, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    goto :goto_0

    :cond_2
    const/4 v4, -0x2

    .line 11
    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 12
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v4

    iput v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/16 v4, 0x11

    .line 13
    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 14
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 15
    invoke-virtual {p1, v6, v6, v6, v6}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const v3, 0x7f0809a0

    .line 16
    invoke-virtual {p1, v3}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const v3, 0x7f07106c

    .line 17
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v2

    .line 18
    invoke-virtual {p1, v2, v1, v2, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 19
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, ""

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method P(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 6

    const v0, 0x7f090cf6

    .line 1
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/MyGameAdapterV1$c;

    invoke-direct {v1, p0, p2, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1$c;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;Lcom/join/mgps/base/BaseViewHolder;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/adapter/r2;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/r2;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/adapter/MyGameAdapterV1$e;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$e;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f09087b

    .line 5
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/MyGameAdapterV1$e;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$e;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0907e6

    .line 6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v1

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_2
    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f090779

    .line 7
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v2

    const/4 v5, 0x6

    if-ne v2, v5, :cond_3

    const/4 v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 8
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v1

    if-ne v1, v5, :cond_4

    goto :goto_4

    :cond_4
    const/4 v3, 0x0

    :goto_4
    const v1, 0x7f09077b

    invoke-virtual {v0, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 9
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_5

    .line 10
    invoke-virtual {p1, v1}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->k:Ljava/lang/String;

    sget-object v2, Lcom/facebook/drawee/drawable/r$c;->b:Lcom/facebook/drawee/drawable/r$c;

    invoke-static {v0, v1, v2}, Lcom/join/android/app/common/utils/MyImageLoader;->p(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Lcom/facebook/drawee/drawable/r$c;)V

    :cond_5
    const v0, 0x7f090e4f

    .line 11
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/join/mgps/adapter/s2;

    invoke-direct {v1, p0, p1, p2}, Lcom/join/mgps/adapter/s2;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 12
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance v1, Lcom/join/mgps/adapter/v2;

    invoke-direct {v1, p0, p2}, Lcom/join/mgps/adapter/v2;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 13
    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->R(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method Q(Landroid/widget/TextView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 1
    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v1}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const p2, 0x7f080c43

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setBackgroundResource(I)V

    const-string p2, "\u5f00\u59cb"

    .line 3
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    iget-object p2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v0, 0x7f06002b

    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method R(Lcom/join/mgps/base/BaseViewHolder;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    if-nez v0, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPlugin_num()Ljava/lang/String;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v7, Lcom/join/mgps/enums/ConstantIntEnum;->H5:Lcom/join/mgps/enums/ConstantIntEnum;

    invoke-virtual {v7}, Lcom/join/mgps/enums/ConstantIntEnum;->value()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ""

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    const v6, 0x7f09087b

    .line 2
    invoke-virtual {v2, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    .line 3
    invoke-virtual {v2, v6, v5}, Lcom/join/mgps/base/BaseViewHolder;->setEnabled(IZ)Lcom/join/mgps/base/BaseViewHolder;

    if-eqz v3, :cond_2

    .line 4
    invoke-virtual {v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v1, v2, v0}, Lcom/join/mgps/adapter/MyGameAdapterV1;->Q(Landroid/widget/TextView;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    goto/16 :goto_7

    .line 5
    :cond_2
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v3

    .line 6
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowSize()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v7

    const-wide/high16 v9, 0x4090000000000000L    # 1024.0

    mul-double v7, v7, v9

    mul-double v7, v7, v9

    double-to-long v7, v7

    .line 7
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result v9

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lcom/join/mgps/Util/UtilsMy;->v0(ILjava/lang/String;)I

    move-result v9

    const/16 v10, 0x2b

    if-lez v9, :cond_3

    const/16 v3, 0x2b

    :cond_3
    if-eqz v3, :cond_5

    const/16 v12, 0x1b

    const-string v13, "\u6682\u505c\u4e2d"

    if-eq v3, v12, :cond_e

    const/16 v12, 0x30

    if-eq v3, v12, :cond_d

    const/4 v12, 0x2

    const-string v14, "/"

    const-string v15, "#.0"

    const v9, 0x7f09104a

    const v11, 0x7f0903f9

    if-eq v3, v12, :cond_b

    const/4 v12, 0x3

    if-eq v3, v12, :cond_7

    const/4 v12, 0x5

    if-eq v3, v12, :cond_8

    const/4 v12, 0x6

    if-eq v3, v12, :cond_7

    const/4 v12, 0x7

    if-eq v3, v12, :cond_5

    const/16 v12, 0x2a

    if-eq v3, v12, :cond_6

    if-eq v3, v10, :cond_5

    packed-switch v3, :pswitch_data_0

    .line 8
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/Util/UtilsMy;->O1(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Ljava/lang/String;

    move-result-object v3

    .line 9
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v5

    invoke-virtual {v5}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v5

    if-eqz v5, :cond_4

    .line 10
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSp_tag_info()Lcom/join/mgps/dto/TipNew;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipNew;->getModel()Lcom/join/mgps/dto/TipBean;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/dto/TipBean;->getName()Ljava/lang/String;

    move-result-object v3

    .line 11
    :cond_4
    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "#FFA8A8A8"

    .line 12
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 13
    invoke-direct {v1, v2, v4}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto/16 :goto_7

    :pswitch_0
    const-string v3, "\u70b9\u51fb\u91cd\u65b0\u89e3\u538b"

    .line 14
    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 15
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v0, v4

    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f080c5c

    .line 16
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b"

    .line 17
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 18
    iget-object v0, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f060032

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 19
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->U(Lcom/join/mgps/base/BaseViewHolder;)V

    goto/16 :goto_7

    :pswitch_1
    const-string v3, "\u89e3\u538b\u4e2d.."

    .line 20
    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 21
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v7

    long-to-int v0, v7

    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    const v0, 0x7f08043a

    .line 22
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u89e3\u538b\u4e2d"

    .line 23
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, -0x4a4a4b

    .line 24
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 25
    invoke-direct {v1, v2, v5}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto/16 :goto_7

    :pswitch_2
    const v3, 0x7f080292

    .line 26
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5"

    .line 27
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 28
    iget-object v0, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f06002b

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 29
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->U(Lcom/join/mgps/base/BaseViewHolder;)V

    goto/16 :goto_7

    :pswitch_3
    const v3, 0x7f080292

    const v4, 0x7f06002b

    .line 30
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v3, "\u7b49\u5f85"

    .line 31
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 32
    iget-object v3, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 33
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v12

    invoke-static {v12, v13, v15}, Lcom/join/mgps/Util/UtilsMy;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 34
    :try_start_0
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v6

    long-to-int v0, v6

    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    const-string v0, "\u7b49\u5f85\u4e2d"

    .line 36
    invoke-virtual {v2, v11, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 37
    invoke-direct {v1, v2, v5}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto/16 :goto_7

    :pswitch_4
    const v0, 0x7f080292

    .line 38
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u66f4\u65b0"

    .line 39
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 40
    iget-object v0, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f06002b

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 41
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->U(Lcom/join/mgps/base/BaseViewHolder;)V

    goto/16 :goto_7

    :cond_5
    const v3, 0x7f080292

    goto/16 :goto_6

    .line 42
    :cond_6
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->U(Lcom/join/mgps/base/BaseViewHolder;)V

    goto/16 :goto_7

    :cond_7
    const v3, 0x7f080292

    goto :goto_2

    .line 43
    :cond_8
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info()Lcom/join/mgps/dto/CommonGameInfoBean;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->isOpen()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getAd_info_switch()I

    move-result v0

    if-ne v0, v5, :cond_9

    const/4 v4, 0x1

    :cond_9
    invoke-direct {v1, v2, v4}, Lcom/join/mgps/adapter/MyGameAdapterV1;->T(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto/16 :goto_7

    .line 44
    :goto_2
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v3, "\u7ee7\u7eed"

    .line 45
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 46
    iget-object v3, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06002b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 47
    :try_start_1
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v3

    const-wide/16 v16, 0x0

    cmp-long v6, v3, v16

    if-nez v6, :cond_a

    .line 48
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v5

    invoke-static {v5, v6, v15}, Lcom/join/mgps/Util/UtilsMy;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_3

    .line 49
    :cond_a
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v4

    invoke-static {v4, v5, v15}, Lcom/join/mgps/Util/UtilsMy;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 50
    :goto_3
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v0, v4

    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setProgress(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_4

    :catch_1
    move-exception v0

    .line 51
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 52
    :goto_4
    invoke-virtual {v2, v11, v13}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    .line 53
    invoke-direct {v1, v2, v3}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto/16 :goto_7

    .line 54
    :cond_b
    invoke-static/range {p2 .. p2}, Lcom/join/mgps/Util/UtilsMy;->x4(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    const v3, 0x7f080292

    .line 55
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v3, "\u6682\u505c"

    .line 56
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 57
    iget-object v3, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06002b

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 58
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getSize()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v12, v3, v5

    if-nez v12, :cond_c

    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v4

    invoke-static {v4, v5, v15}, Lcom/join/mgps/Util/UtilsMy;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    goto :goto_5

    .line 60
    :cond_c
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCurrentSize()J

    move-result-wide v4

    invoke-static {v4, v5, v15}, Lcom/join/mgps/Util/UtilsMy;->b(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v7, v8}, Lcom/join/mgps/Util/UtilsMy;->a(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v11, v3}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 61
    :goto_5
    invoke-virtual {v2, v9}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ProgressBar;

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getProgress()J

    move-result-wide v4

    long-to-int v0, v4

    invoke-virtual {v3, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    const/4 v3, 0x1

    .line 62
    invoke-direct {v1, v2, v3}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto :goto_7

    :cond_d
    const v0, 0x7f080292

    .line 63
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    const-string v0, "\u5b89\u88c5\u4e2d"

    .line 64
    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    .line 65
    iget-object v0, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f06002b

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 66
    invoke-direct/range {p0 .. p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->U(Lcom/join/mgps/base/BaseViewHolder;)V

    goto :goto_7

    .line 67
    :cond_e
    invoke-virtual {v2, v6, v13}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const/4 v3, 0x1

    .line 68
    invoke-direct {v1, v2, v3}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    goto :goto_7

    .line 69
    :goto_6
    invoke-virtual {v2, v6, v3}, Lcom/join/mgps/base/BaseViewHolder;->setBackgroundRes(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 70
    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPay_game_amount()I

    move-result v3

    invoke-virtual/range {p2 .. p2}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/join/mgps/Util/UtilsMy;->v0(ILjava/lang/String;)I

    .line 71
    invoke-virtual {v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v2, v6}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v5

    invoke-static {v3, v5, v0}, Lcom/join/mgps/Util/UtilsMy;->X2(Landroid/widget/TextView;Landroid/view/View;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 72
    iget-object v0, v1, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v3, 0x7f06002b

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v6, v0}, Lcom/join/mgps/base/BaseViewHolder;->setTextColor(II)Lcom/join/mgps/base/BaseViewHolder;

    .line 73
    invoke-direct {v1, v2, v4}, Lcom/join/mgps/adapter/MyGameAdapterV1;->V(Lcom/join/mgps/base/BaseViewHolder;Z)V

    :goto_7
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

.method public S(Lcom/join/mgps/adapter/MyGameAdapterV1$f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/adapter/MyGameAdapterV1$g;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->w(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    return-void
.end method

.method v(Lcom/github/snowdream/android/app/downloader/DownloadTask;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getStatus()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    goto :goto_0

    :cond_1
    return v0

    .line 2
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    .line 3
    iget-object v2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-static {v2, v1}, Lcom/join/mgps/Util/UtilsMy;->h2(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    new-instance v1, Lcom/join/mgps/pref/PrefDef_;

    iget-object v2, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->d:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1}, Lcom/join/mgps/pref/PrefDef_;->downloadSpeedUpGameSize()Lorg/androidannotations/api/sharedpreferences/i;

    move-result-object v1

    invoke-virtual {v1}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getActual_size()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_4

    .line 4
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getFileType()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lcom/join/mgps/enums/Dtype;->chajian:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    return v0
.end method

.method protected w(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V
    .locals 2
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->u(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->s(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    if-ne v0, v1, :cond_2

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    goto :goto_0

    :cond_2
    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    .line 5
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->t(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    goto :goto_0

    :cond_3
    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 6
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->q(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    goto :goto_0

    :cond_4
    const/4 v1, 0x6

    if-ne v0, v1, :cond_5

    .line 7
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/adapter/MyGameAdapterV1;->r(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/adapter/MyGameAdapterV1$g;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public x(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    invoke-static {p1}, Lcom/php25/PDownload/d;->a(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 2
    :try_start_0
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 3
    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/enums/Dtype;->androidobb:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/enums/Dtype;->androiddata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getRomType()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/join/mgps/enums/Dtype;->androidobbdata:Lcom/join/mgps/enums/Dtype;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 4
    :cond_1
    new-instance v0, Lcom/join/mgps/adapter/MyGameAdapterV1$d;

    invoke-direct {v0, p0, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1$d;-><init>(Lcom/join/mgps/adapter/MyGameAdapterV1;Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 6
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 7
    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lcom/join/mgps/adapter/MyGameAdapterV1;->y(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V

    return-void
.end method

.method public y(Lcom/github/snowdream/android/app/downloader/DownloadTask;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/join/mgps/base/BaseQuickAdapter;->getData()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 2
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/join/mgps/adapter/MyGameAdapterV1$g;

    .line 4
    invoke-virtual {v1}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->c()I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_2

    goto :goto_0

    .line 5
    :cond_2
    invoke-virtual {v1}, Lcom/join/mgps/adapter/MyGameAdapterV1$g;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/github/snowdream/android/app/downloader/DownloadTask;

    .line 6
    invoke-virtual {v1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getCrc_link_type_val()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    .line 9
    :cond_3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method public z()Lcom/join/mgps/adapter/MyGameAdapterV1$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/adapter/MyGameAdapterV1;->i:Lcom/join/mgps/adapter/MyGameAdapterV1$f;

    return-object v0
.end method
