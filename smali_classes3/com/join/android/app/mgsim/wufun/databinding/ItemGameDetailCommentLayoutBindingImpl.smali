.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;
.source "ItemGameDetailCommentLayoutBindingImpl.java"

# interfaces
.implements Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;


# static fields
.field private static final s:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final t:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final m:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final n:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final o:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final p:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final q:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private r:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->t:Landroid/util/SparseIntArray;

    const v1, 0x7f09044b

    const/16 v2, 0x8

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f09136d

    const/16 v2, 0x9

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091367

    const/16 v2, 0xa

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091370

    const/16 v2, 0xb

    .line 5
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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->s:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->t:Landroid/util/SparseIntArray;

    const/16 v2, 0xc

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 15

    move-object v13, p0

    const/4 v14, 0x1

    .line 2
    aget-object v0, p3, v14

    move-object v4, v0

    check-cast v4, Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v0, 0x3

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Lcom/join/mgps/customview/CollapsedTextView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v6, v0

    check-cast v6, Landroid/view/View;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    const/4 v0, 0x6

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    const/16 v0, 0xa

    aget-object v0, p3, v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ImageView;

    const/16 v0, 0x9

    aget-object v0, p3, v0

    move-object v10, v0

    check-cast v10, Landroid/widget/ImageView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/4 v0, 0x4

    aget-object v0, p3, v0

    move-object v12, v0

    check-cast v12, Landroid/widget/TextView;

    const/4 v3, 0x0

    move-object v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-direct/range {v0 .. v12}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/facebook/drawee/view/SimpleDraweeView;Lcom/join/mgps/customview/CollapsedTextView;Landroid/view/View;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

    .line 4
    iget-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->c:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 6
    iget-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->e:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 7
    iget-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->f:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 8
    aget-object v0, p3, v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->m:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x2

    .line 10
    aget-object v2, p3, v0

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->n:Landroid/widget/TextView;

    .line 11
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x5

    .line 12
    aget-object v2, p3, v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->o:Landroid/widget/LinearLayout;

    .line 13
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->j:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 15
    invoke-virtual {p0, v1}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    new-instance v1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v1, p0, v0}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v1, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->p:Landroid/view/View$OnClickListener;

    .line 17
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v0, p0, v14}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->q:Landroid/view/View$OnClickListener;

    .line 18
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/View;)V
    .locals 2

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->k:Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    .line 2
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->l:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    if-eqz v1, :cond_1

    const/4 p2, 0x1

    :cond_1
    if-eqz p2, :cond_4

    .line 3
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;->like(Lcom/join/kotlin/discount/model/bean/CommentDetailBean;)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->k:Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    .line 5
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->l:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    if-eqz v1, :cond_3

    const/4 p2, 0x1

    :cond_3
    if-eqz p2, :cond_4

    .line 6
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;->like(Lcom/join/kotlin/discount/model/bean/CommentDetailBean;)V

    :cond_4
    :goto_0
    return-void
.end method

.method protected executeBindings()V
    .locals 17

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->k:Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    const-wide/16 v6, 0x5

    and-long v8, v2, v6

    const/4 v10, 0x0

    cmp-long v11, v8, v4

    if-eqz v11, :cond_5

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getShow_time()Ljava/lang/String;

    move-result-object v11

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getNickname()Ljava/lang/String;

    move-result-object v12

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getLike()Ljava/lang/Integer;

    move-result-object v13

    .line 9
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getMy_like()Ljava/lang/Boolean;

    move-result-object v14

    .line 10
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getContent()Ljava/lang/String;

    move-result-object v15

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;->getAvatar()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v10

    move-object v11, v0

    move-object v12, v11

    move-object v13, v12

    move-object v14, v13

    move-object v15, v14

    :goto_0
    if-eqz v13, :cond_1

    .line 12
    invoke-virtual {v13}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_1

    :cond_1
    move-object v13, v10

    .line 13
    :goto_1
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v14

    cmp-long v16, v8, v4

    if-eqz v16, :cond_3

    if-eqz v14, :cond_2

    const-wide/16 v8, 0x10

    goto :goto_2

    :cond_2
    const-wide/16 v8, 0x8

    :goto_2
    or-long/2addr v2, v8

    .line 14
    :cond_3
    iget-object v8, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->f:Landroid/widget/ImageView;

    invoke-virtual {v8}, Landroid/widget/ImageView;->getContext()Landroid/content/Context;

    move-result-object v8

    if-eqz v14, :cond_4

    const v9, 0x7f080619

    goto :goto_3

    :cond_4
    const v9, 0x7f08061d

    :goto_3
    invoke-static {v8, v9}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_4

    :cond_5
    move-object v0, v10

    move-object v8, v0

    move-object v11, v8

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    :goto_4
    and-long/2addr v6, v2

    cmp-long v9, v6, v4

    if-eqz v9, :cond_6

    .line 15
    iget-object v6, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v7, 0x0

    invoke-static {v6, v0, v10, v7}, Lcom/join/kotlin/bindingadapter/SimpleDrawableViewKt;->loadUrl(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Ljava/lang/String;I)V

    .line 16
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->c:Lcom/join/mgps/customview/CollapsedTextView;

    invoke-static {v0, v15}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 17
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->e:Landroid/widget/TextView;

    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 18
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->f:Landroid/widget/ImageView;

    invoke-static {v0, v8}, Landroidx/databinding/adapters/ImageViewBindingAdapter;->setImageDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;)V

    .line 19
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->n:Landroid/widget/TextView;

    invoke-static {v0, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 20
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->j:Landroid/widget/TextView;

    invoke-static {v0, v11}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_6
    const-wide/16 v6, 0x4

    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_7

    .line 21
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->f:Landroid/widget/ImageView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->p:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 22
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->o:Landroid/widget/LinearLayout;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->q:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    return-void

    :catchall_0
    move-exception v0

    .line 23
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public g(Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->l:Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

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

.method public h(Lcom/join/kotlin/discount/model/bean/CommentDetailBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/discount/model/bean/CommentDetailBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBinding;->k:Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

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
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

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

    const-wide/16 v0, 0x4

    .line 2
    :try_start_0
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->r:J

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
    check-cast p2, Lcom/join/kotlin/discount/model/bean/CommentDetailBean;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->h(Lcom/join/kotlin/discount/model/bean/CommentDetailBean;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    if-ne v0, p1, :cond_1

    .line 2
    check-cast p2, Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemGameDetailCommentLayoutBindingImpl;->g(Lcom/join/kotlin/discount/proxy/ItemGameDetailCommentListClickProxy;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
