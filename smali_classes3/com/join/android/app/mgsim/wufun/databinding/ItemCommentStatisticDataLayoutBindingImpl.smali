.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBinding;
.source "ItemCommentStatisticDataLayoutBindingImpl.java"


# static fields
.field private static final k:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final l:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final e:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final f:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final g:Landroid/widget/FrameLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final h:Landroid/widget/ProgressBar;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final i:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private j:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->l:Landroid/util/SparseIntArray;

    const v1, 0x7f09039b

    const/4 v2, 0x6

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;)V
    .locals 3
    .param p1    # Landroidx/databinding/DataBindingComponent;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->k:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->l:Landroid/util/SparseIntArray;

    const/4 v2, 0x7

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 7

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/LinearLayout;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Lcom/join/mgps/customview/MStarBar;

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/LinearLayout;Lcom/join/mgps/customview/MStarBar;)V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    .line 4
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBinding;->c:Lcom/join/mgps/customview/MStarBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 5
    aget-object p1, p3, p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 6
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 7
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->f:Landroid/widget/TextView;

    .line 8
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x2

    .line 9
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/FrameLayout;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->g:Landroid/widget/FrameLayout;

    .line 10
    invoke-virtual {p1, v0}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x4

    .line 11
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/ProgressBar;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->h:Landroid/widget/ProgressBar;

    .line 12
    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x5

    .line 13
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->i:Landroid/widget/TextView;

    .line 14
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method protected executeBindings()V
    .locals 17

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBinding;->d:Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    const-wide/16 v6, 0x3

    and-long v8, v2, v6

    const/4 v10, 0x0

    cmp-long v12, v8, v4

    if-eqz v12, :cond_9

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->getStarCount()I

    move-result v10

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->getProgress()I

    move-result v12

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->getTitle()Ljava/lang/String;

    move-result-object v13

    .line 9
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->getUserPercent()Ljava/lang/String;

    move-result-object v14

    .line 10
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->getType()I

    move-result v15

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;->getMax()I

    move-result v0

    goto :goto_0

    :cond_0
    move-object v13, v10

    move-object v14, v13

    const/4 v0, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    :goto_0
    const/4 v11, 0x1

    if-ne v15, v11, :cond_1

    const/16 v16, 0x1

    goto :goto_1

    :cond_1
    const/16 v16, 0x0

    :goto_1
    const/4 v11, 0x2

    if-ne v15, v11, :cond_2

    const/4 v11, 0x1

    goto :goto_2

    :cond_2
    const/4 v11, 0x0

    :goto_2
    cmp-long v15, v8, v4

    if-eqz v15, :cond_4

    if-eqz v16, :cond_3

    const-wide/16 v8, 0x8

    goto :goto_3

    :cond_3
    const-wide/16 v8, 0x4

    :goto_3
    or-long/2addr v2, v8

    :cond_4
    and-long v8, v2, v6

    cmp-long v15, v8, v4

    if-eqz v15, :cond_6

    if-eqz v11, :cond_5

    const-wide/16 v8, 0x20

    goto :goto_4

    :cond_5
    const-wide/16 v8, 0x10

    :goto_4
    or-long/2addr v2, v8

    :cond_6
    const/16 v8, 0x8

    if-eqz v16, :cond_7

    const/4 v9, 0x0

    goto :goto_5

    :cond_7
    const/16 v9, 0x8

    :goto_5
    if-eqz v11, :cond_8

    const/4 v11, 0x0

    goto :goto_6

    :cond_8
    const/16 v11, 0x8

    :goto_6
    move v8, v0

    move v0, v11

    move v11, v10

    move-object v10, v13

    goto :goto_7

    :cond_9
    move-object v14, v10

    const/4 v0, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    :goto_7
    and-long/2addr v2, v6

    cmp-long v6, v2, v4

    if-eqz v6, :cond_a

    .line 12
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBinding;->c:Lcom/join/mgps/customview/MStarBar;

    invoke-virtual {v2, v11}, Lcom/join/mgps/customview/MStarBar;->setStarCount(I)V

    .line 13
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->f:Landroid/widget/TextView;

    invoke-static {v2, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 14
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 15
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->g:Landroid/widget/FrameLayout;

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 16
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v8}, Landroid/widget/ProgressBar;->setMax(I)V

    .line 17
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->h:Landroid/widget/ProgressBar;

    invoke-virtual {v0, v12}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 18
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->i:Landroid/widget/TextView;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_a
    return-void

    :catchall_0
    move-exception v0

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public f(Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBinding;->d:Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x12

    .line 5
    invoke-virtual {p0, p1}, Landroidx/databinding/BaseObservable;->notifyPropertyChanged(I)V

    .line 6
    invoke-super {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    .line 3
    monitor-exit p0

    return v0

    .line 4
    :cond_0
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    const-wide/16 v0, 0x2

    .line 2
    :try_start_0
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->j:J

    .line 3
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    invoke-virtual {p0}, Landroidx/databinding/ViewDataBinding;->requestRebind()V

    return-void

    :catchall_0
    move-exception v0

    .line 5
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method protected onFieldChange(ILjava/lang/Object;I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/16 v0, 0x12

    if-ne v0, p1, :cond_0

    .line 1
    check-cast p2, Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCommentStatisticDataLayoutBindingImpl;->f(Lcom/join/kotlin/discount/model/bean/CommentDataProgressBean;)V

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
