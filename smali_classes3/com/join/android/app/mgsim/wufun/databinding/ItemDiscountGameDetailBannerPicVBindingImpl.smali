.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;
.source "ItemDiscountGameDetailBannerPicVBindingImpl.java"

# interfaces
.implements Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;


# static fields
.field private static final n:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final o:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final f:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final g:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final h:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final i:Lcom/facebook/drawee/view/SimpleDraweeView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final j:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final k:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final l:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private m:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->n:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->o:Landroid/util/SparseIntArray;

    const/4 v2, 0x4

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;-><init>(Ljava/lang/Object;Landroid/view/View;I)V

    const-wide/16 v1, -0x1

    .line 3
    iput-wide v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    .line 4
    aget-object p1, p3, v0

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    aget-object v1, p3, p1

    check-cast v1, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 7
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 8
    aget-object v2, p3, v1

    check-cast v2, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object v2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 9
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x3

    .line 10
    aget-object p3, p3, v2

    check-cast p3, Lcom/facebook/drawee/view/SimpleDraweeView;

    iput-object p3, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    .line 11
    invoke-virtual {p3, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 13
    new-instance p2, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p2, p0, v2}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->j:Landroid/view/View$OnClickListener;

    .line 14
    new-instance p2, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p2, p0, p1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->k:Landroid/view/View$OnClickListener;

    .line 15
    new-instance p1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p1, p0, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->l:Landroid/view/View$OnClickListener;

    .line 16
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/View;)V
    .locals 2

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->d:Ljava/lang/String;

    .line 2
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->e:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    if-eqz v1, :cond_1

    const/4 p2, 0x1

    :cond_1
    if-eqz p2, :cond_6

    .line 3
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;->verticalPicClick(Ljava/lang/String;)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->c:Ljava/lang/String;

    .line 5
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->e:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    if-eqz v1, :cond_3

    const/4 p2, 0x1

    :cond_3
    if-eqz p2, :cond_6

    .line 6
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;->verticalPicClick(Ljava/lang/String;)V

    goto :goto_0

    .line 7
    :cond_4
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->b:Ljava/lang/String;

    .line 8
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->e:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    if-eqz v1, :cond_5

    const/4 p2, 0x1

    :cond_5
    if-eqz p2, :cond_6

    .line 9
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;->verticalPicClick(Ljava/lang/String;)V

    :cond_6
    :goto_0
    return-void
.end method

.method protected executeBindings()V
    .locals 28

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->c:Ljava/lang/String;

    .line 6
    iget-object v6, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->d:Ljava/lang/String;

    .line 7
    iget-object v7, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->b:Ljava/lang/String;

    const-wide/16 v8, 0x11

    and-long v10, v2, v8

    const-wide/16 v12, 0x800

    cmp-long v16, v10, v4

    if-eqz v16, :cond_2

    if-nez v0, :cond_0

    const/16 v16, 0x1

    goto :goto_0

    :cond_0
    const/16 v16, 0x0

    :goto_0
    cmp-long v17, v10, v4

    if-eqz v17, :cond_3

    if-eqz v16, :cond_1

    const-wide/16 v10, 0x1000

    or-long/2addr v2, v10

    goto :goto_1

    :cond_1
    or-long/2addr v2, v12

    goto :goto_1

    :cond_2
    const/16 v16, 0x0

    :cond_3
    :goto_1
    const-wide/16 v10, 0x12

    and-long v17, v2, v10

    const-wide/16 v19, 0x2000

    cmp-long v21, v17, v4

    if-eqz v21, :cond_6

    if-nez v6, :cond_4

    const/16 v21, 0x1

    goto :goto_2

    :cond_4
    const/16 v21, 0x0

    :goto_2
    cmp-long v22, v17, v4

    if-eqz v22, :cond_7

    if-eqz v21, :cond_5

    const-wide/16 v17, 0x4000

    or-long v2, v2, v17

    goto :goto_3

    :cond_5
    or-long v2, v2, v19

    goto :goto_3

    :cond_6
    const/16 v21, 0x0

    :cond_7
    :goto_3
    const-wide/16 v17, 0x14

    and-long v22, v2, v17

    const-wide/16 v24, 0x200

    cmp-long v26, v22, v4

    if-eqz v26, :cond_a

    if-nez v7, :cond_8

    const/16 v26, 0x1

    goto :goto_4

    :cond_8
    const/16 v26, 0x0

    :goto_4
    cmp-long v27, v22, v4

    if-eqz v27, :cond_b

    if-eqz v26, :cond_9

    const-wide/16 v22, 0x400

    or-long v2, v2, v22

    goto :goto_5

    :cond_9
    or-long v2, v2, v24

    goto :goto_5

    :cond_a
    const/16 v26, 0x0

    :cond_b
    :goto_5
    and-long v19, v2, v19

    cmp-long v22, v19, v4

    if-eqz v22, :cond_c

    const-string v14, ""

    if-ne v6, v14, :cond_c

    const/4 v14, 0x1

    goto :goto_6

    :cond_c
    const/4 v14, 0x0

    :goto_6
    and-long v22, v2, v24

    cmp-long v20, v22, v4

    if-eqz v20, :cond_d

    const-string v15, ""

    if-ne v7, v15, :cond_d

    const/4 v15, 0x1

    goto :goto_7

    :cond_d
    const/4 v15, 0x0

    :goto_7
    and-long/2addr v12, v2

    cmp-long v22, v12, v4

    if-eqz v22, :cond_e

    const-string v12, ""

    if-ne v0, v12, :cond_e

    const/4 v12, 0x1

    goto :goto_8

    :cond_e
    const/4 v12, 0x0

    :goto_8
    and-long v22, v2, v17

    const/16 v13, 0x8

    cmp-long v24, v22, v4

    if-eqz v24, :cond_12

    if-eqz v26, :cond_f

    const/4 v15, 0x1

    :cond_f
    cmp-long v24, v22, v4

    if-eqz v24, :cond_11

    if-eqz v15, :cond_10

    const-wide/32 v22, 0x10000

    goto :goto_9

    :cond_10
    const-wide/32 v22, 0x8000

    :goto_9
    or-long v2, v2, v22

    :cond_11
    if-eqz v15, :cond_12

    const/16 v15, 0x8

    goto :goto_a

    :cond_12
    const/4 v15, 0x0

    :goto_a
    and-long v22, v2, v8

    cmp-long v24, v22, v4

    if-eqz v24, :cond_16

    if-eqz v16, :cond_13

    const/4 v12, 0x1

    :cond_13
    cmp-long v16, v22, v4

    if-eqz v16, :cond_15

    if-eqz v12, :cond_14

    const-wide/16 v22, 0x40

    goto :goto_b

    :cond_14
    const-wide/16 v22, 0x20

    :goto_b
    or-long v2, v2, v22

    :cond_15
    if-eqz v12, :cond_16

    const/16 v12, 0x8

    goto :goto_c

    :cond_16
    const/4 v12, 0x0

    :goto_c
    and-long v22, v2, v10

    cmp-long v16, v22, v4

    if-eqz v16, :cond_1a

    if-eqz v21, :cond_17

    const/4 v14, 0x1

    :cond_17
    cmp-long v16, v22, v4

    if-eqz v16, :cond_19

    if-eqz v14, :cond_18

    const-wide/16 v21, 0x100

    goto :goto_d

    :cond_18
    const-wide/16 v21, 0x80

    :goto_d
    or-long v2, v2, v21

    :cond_19
    if-eqz v14, :cond_1a

    goto :goto_e

    :cond_1a
    const/4 v13, 0x0

    :goto_e
    const-wide/16 v21, 0x10

    and-long v21, v2, v21

    cmp-long v14, v21, v4

    if-eqz v14, :cond_1b

    .line 8
    iget-object v14, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->k:Landroid/view/View$OnClickListener;

    invoke-virtual {v14, v10}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v11, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->l:Landroid/view/View$OnClickListener;

    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10
    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    iget-object v11, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->j:Landroid/view/View$OnClickListener;

    invoke-virtual {v10, v11}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1b
    and-long v10, v2, v17

    const/4 v14, 0x0

    cmp-long v16, v10, v4

    if-eqz v16, :cond_1c

    .line 11
    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v10, v15}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->g:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v11, 0x0

    invoke-static {v10, v7, v14, v11}, Lcom/join/kotlin/bindingadapter/SimpleDrawableViewKt;->loadUrl(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Ljava/lang/String;I)V

    goto :goto_f

    :cond_1c
    const/4 v11, 0x0

    :goto_f
    and-long/2addr v8, v2

    cmp-long v7, v8, v4

    if-eqz v7, :cond_1d

    .line 13
    iget-object v7, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v7, v12}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 14
    iget-object v7, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->h:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v7, v0, v14, v11}, Lcom/join/kotlin/bindingadapter/SimpleDrawableViewKt;->loadUrl(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_1d
    const-wide/16 v7, 0x12

    and-long/2addr v2, v7

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1e

    .line 15
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v0, v13}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 16
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->i:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-static {v0, v6, v14, v11}, Lcom/join/kotlin/bindingadapter/SimpleDrawableViewKt;->loadUrl(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Ljava/lang/String;I)V

    :cond_1e
    return-void

    :catchall_0
    move-exception v0

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public hasPendingBindings()Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

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

.method public i(Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->e:Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    const-wide/16 v2, 0x8

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x7

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

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    const-wide/16 v0, 0x10

    .line 2
    :try_start_0
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

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

.method public j(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->b:Ljava/lang/String;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    const-wide/16 v2, 0x4

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x19

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

.method public k(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->c:Ljava/lang/String;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x1a

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

.method public l(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBinding;->d:Ljava/lang/String;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x1b

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

    const/16 v0, 0x1a

    if-ne v0, p1, :cond_0

    .line 1
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->k(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x1b

    if-ne v0, p1, :cond_1

    .line 2
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->l(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    const/16 v0, 0x19

    if-ne v0, p1, :cond_2

    .line 3
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->j(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/4 v0, 0x7

    if-ne v0, p1, :cond_3

    .line 4
    check-cast p2, Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemDiscountGameDetailBannerPicVBindingImpl;->i(Lcom/join/kotlin/discount/proxy/GameDetailFragmentClickProxy;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
