.class Lcom/join/mgps/activity/CleanSpaceActivity$d;
.super Lcom/join/mgps/base/BaseQuickAdapter;
.source "CleanSpaceActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/CleanSpaceActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/join/mgps/base/BaseQuickAdapter<",
        "Lcom/join/mgps/activity/CleanSpaceActivity$c;",
        "Lcom/join/mgps/base/BaseViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lcom/join/mgps/activity/CleanSpaceActivity;


# direct methods
.method public constructor <init>(Lcom/join/mgps/activity/CleanSpaceActivity;Ljava/util/List;I)V
    .locals 0
    .param p1    # Lcom/join/mgps/activity/CleanSpaceActivity;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/join/mgps/activity/CleanSpaceActivity$c;",
            ">;I)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b:Lcom/join/mgps/activity/CleanSpaceActivity;

    const p1, 0x7f0c0371

    .line 2
    invoke-direct {p0, p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;-><init>(ILjava/util/List;)V

    .line 3
    iput p3, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->a:I

    return-void
.end method

.method public static synthetic a(Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/join/mgps/activity/CleanSpaceActivity$d;->c(Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/ImageView;Landroid/view/View;)V

    return-void
.end method

.method private static synthetic c(Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p3

    if-nez p3, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p2}, Landroid/widget/ImageView;->isSelected()Z

    move-result p3

    if-eqz p3, :cond_2

    const/4 p3, 0x0

    .line 3
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 4
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 5
    :cond_1
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {p1, p3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    :cond_2
    const/4 p3, 0x1

    .line 6
    invoke-virtual {p2, p3}, Landroid/widget/ImageView;->setSelected(Z)V

    .line 7
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0, p3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 8
    :cond_3
    invoke-virtual {p1}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p0

    if-eqz p0, :cond_4

    invoke-virtual {p1, p3}, Landroid/widget/CheckBox;->setChecked(Z)V

    :cond_4
    :goto_0
    return-void
.end method


# virtual methods
.method protected b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/CleanSpaceActivity$c;)V
    .locals 10
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->e()Lcom/github/snowdream/android/app/downloader/DownloadTask;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    :cond_0
    const v0, 0x7f09063c

    .line 2
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getPortraitURL()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/join/android/app/common/utils/MyImageLoader;->n(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;)V

    const v0, 0x7f090664

    .line 3
    invoke-virtual {v4}, Lcom/github/snowdream/android/app/downloader/DownloadTask;->getShowName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f09151f

    .line 4
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->d()J

    move-result-wide v2

    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->b()J

    move-result-wide v5

    add-long/2addr v2, v5

    const-string v5, "0.0"

    invoke-static {v2, v3, v5}, Lcom/join/mgps/Util/UtilsMy;->e(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    const v1, 0x7f090cc1

    .line 5
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->getType()I

    move-result v2

    const/4 v3, 0x1

    const/4 v6, 0x0

    if-nez v2, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setGone(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 6
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->getType()I

    move-result v1

    if-ne v1, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    const v1, 0x7f091566

    invoke-virtual {v0, v1, v3}, Lcom/join/mgps/base/BaseViewHolder;->setVisible(IZ)Lcom/join/mgps/base/BaseViewHolder;

    move-result-object v0

    .line 7
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->d()J

    move-result-wide v2

    invoke-static {v2, v3, v5}, Lcom/join/mgps/Util/UtilsMy;->e(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/base/BaseViewHolder;->setText(ILjava/lang/CharSequence;)Lcom/join/mgps/base/BaseViewHolder;

    const v0, 0x7f0902e8

    .line 8
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/CheckBox;

    const v0, 0x7f0902e6

    .line 9
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/CheckBox;

    const v0, 0x7f0902e2

    .line 10
    invoke-virtual {p1, v0}, Lcom/join/mgps/base/BaseViewHolder;->getView(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    .line 11
    iget v0, p0, Lcom/join/mgps/activity/CleanSpaceActivity$d;->a:I

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/16 v6, 0x8

    :goto_2
    invoke-virtual {v8, v6}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 12
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->i()Z

    move-result v0

    invoke-virtual {v7, v0}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 13
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->h()Z

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/CheckBox;->setEnabled(Z)V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u6e38\u620f\u5305 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->d()J

    move-result-wide v1

    invoke-static {v1, v2, v5}, Lcom/join/mgps/Util/UtilsMy;->e(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u6570\u636e\u4e0e\u8fdb\u5ea6 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->b()J

    move-result-wide v1

    invoke-static {v1, v2, v5}, Lcom/join/mgps/Util/UtilsMy;->e(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 16
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->i()Z

    move-result v0

    const-string v1, "#646464"

    const-string v2, "#DEDEDE"

    if-eqz v0, :cond_4

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    goto :goto_3

    :cond_4
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    :goto_3
    invoke-virtual {v7, v0}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 17
    invoke-virtual {p2}, Lcom/join/mgps/activity/CleanSpaceActivity$c;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    goto :goto_4

    :cond_5
    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    :goto_4
    invoke-virtual {v8, v0}, Landroid/widget/CheckBox;->setTextColor(I)V

    .line 18
    new-instance v6, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;

    move-object v0, v6

    move-object v1, p0

    move-object v2, v9

    move-object v3, p2

    move-object v5, v8

    invoke-direct/range {v0 .. v5}, Lcom/join/mgps/activity/CleanSpaceActivity$d$a;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity$d;Landroid/widget/ImageView;Lcom/join/mgps/activity/CleanSpaceActivity$c;Lcom/github/snowdream/android/app/downloader/DownloadTask;Landroid/widget/CheckBox;)V

    invoke-virtual {v7, v6}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 19
    new-instance v0, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;

    invoke-direct {v0, p0, v9, p2, v7}, Lcom/join/mgps/activity/CleanSpaceActivity$d$b;-><init>(Lcom/join/mgps/activity/CleanSpaceActivity$d;Landroid/widget/ImageView;Lcom/join/mgps/activity/CleanSpaceActivity$c;Landroid/widget/CheckBox;)V

    invoke-virtual {v8, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 20
    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->itemView:Landroid/view/View;

    new-instance p2, Lcom/join/mgps/activity/c;

    invoke-direct {p2, v8, v7, v9}, Lcom/join/mgps/activity/c;-><init>(Landroid/widget/CheckBox;Landroid/widget/CheckBox;Landroid/widget/ImageView;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method protected bridge synthetic convert(Lcom/join/mgps/base/BaseViewHolder;Ljava/lang/Object;)V
    .locals 0
    .param p1    # Lcom/join/mgps/base/BaseViewHolder;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    check-cast p2, Lcom/join/mgps/activity/CleanSpaceActivity$c;

    invoke-virtual {p0, p1, p2}, Lcom/join/mgps/activity/CleanSpaceActivity$d;->b(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/activity/CleanSpaceActivity$c;)V

    return-void
.end method
