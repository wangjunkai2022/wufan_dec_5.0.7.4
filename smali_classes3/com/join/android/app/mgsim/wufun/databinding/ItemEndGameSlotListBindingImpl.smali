.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;
.source "ItemEndGameSlotListBindingImpl.java"

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
.field private final e:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final f:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final g:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final h:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final i:Landroid/widget/CheckBox;
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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->n:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->o:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 4

    const/4 v0, 0x4

    .line 2
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v1, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;)V

    const-wide/16 v2, -0x1

    .line 3
    iput-wide v2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

    .line 4
    aget-object p1, p3, v1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->e:Landroid/widget/LinearLayout;

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p1, v0}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 6
    aget-object v1, p3, p1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->f:Landroid/widget/ImageView;

    .line 7
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v1, 0x2

    .line 8
    aget-object v2, p3, v1

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 9
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    const/4 v2, 0x3

    .line 10
    aget-object v3, p3, v2

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->h:Landroid/widget/TextView;

    .line 11
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 v3, 0x5

    .line 12
    aget-object p3, p3, v3

    check-cast p3, Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->i:Landroid/widget/CheckBox;

    .line 13
    invoke-virtual {p3, v0}, Landroid/widget/CheckBox;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object p3, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->b:Landroid/widget/TextView;

    invoke-virtual {p3, v0}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 15
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 16
    new-instance p2, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p2, p0, v2}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->j:Landroid/view/View$OnClickListener;

    .line 17
    new-instance p2, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p2, p0, p1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->k:Landroid/view/View$OnClickListener;

    .line 18
    new-instance p1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p1, p0, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->l:Landroid/view/View$OnClickListener;

    .line 19
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->invalidateAll()V

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
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->c:Lcom/join/mgps/dto/ArchiveListBean;

    .line 2
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->d:Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;

    if-eqz v1, :cond_1

    const/4 p2, 0x1

    :cond_1
    if-eqz p2, :cond_6

    .line 3
    invoke-interface {v1, p1}, Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;->onItemCheckedChanged(Lcom/join/mgps/dto/ArchiveListBean;)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->c:Lcom/join/mgps/dto/ArchiveListBean;

    .line 5
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->d:Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;

    if-eqz v1, :cond_3

    const/4 p2, 0x1

    :cond_3
    if-eqz p2, :cond_6

    .line 6
    invoke-interface {v1, p1}, Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;->onItemCheckedChanged(Lcom/join/mgps/dto/ArchiveListBean;)V

    goto :goto_0

    .line 7
    :cond_4
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->c:Lcom/join/mgps/dto/ArchiveListBean;

    .line 8
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->d:Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;

    if-eqz v1, :cond_5

    const/4 p2, 0x1

    :cond_5
    if-eqz p2, :cond_6

    .line 9
    invoke-interface {v1, p1}, Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;->onItemCheckedChanged(Lcom/join/mgps/dto/ArchiveListBean;)V

    :cond_6
    :goto_0
    return-void
.end method

.method protected executeBindings()V
    .locals 12

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

    const-wide/16 v2, 0x0

    .line 3
    iput-wide v2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v4, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->c:Lcom/join/mgps/dto/ArchiveListBean;

    const-wide/16 v5, 0x5

    and-long/2addr v5, v0

    const/4 v7, 0x0

    const/4 v8, 0x0

    cmp-long v9, v5, v2

    if-eqz v9, :cond_2

    if-eqz v4, :cond_0

    .line 6
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArchiveListBean;->getIsCheck()I

    move-result v7

    .line 7
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArchiveListBean;->getAddTime()Ljava/lang/String;

    move-result-object v9

    .line 8
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArchiveListBean;->getArchiveName()Ljava/lang/String;

    move-result-object v10

    .line 9
    invoke-virtual {v4}, Lcom/join/mgps/dto/ArchiveListBean;->getArchiveCover()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v7

    move-object v9, v4

    move-object v10, v9

    const/4 v7, 0x0

    :goto_0
    const/4 v11, 0x1

    if-ne v7, v11, :cond_1

    const/4 v8, 0x1

    :cond_1
    move-object v7, v4

    goto :goto_1

    :cond_2
    move-object v9, v7

    move-object v10, v9

    :goto_1
    cmp-long v4, v5, v2

    if-eqz v4, :cond_3

    .line 10
    iget-object v4, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->f:Landroid/widget/ImageView;

    invoke-static {v4, v7}, Lcom/join/kotlin/bindingadapter/ImageViewExtKt;->loadUri(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 11
    iget-object v4, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->h:Landroid/widget/TextView;

    invoke-static {v4, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 12
    iget-object v4, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->i:Landroid/widget/CheckBox;

    invoke-static {v4, v8}, Landroidx/databinding/adapters/CompoundButtonBindingAdapter;->setChecked(Landroid/widget/CompoundButton;Z)V

    .line 13
    iget-object v4, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->b:Landroid/widget/TextView;

    invoke-static {v4, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_3
    const-wide/16 v4, 0x4

    and-long/2addr v0, v4

    cmp-long v4, v0, v2

    if-eqz v4, :cond_4

    .line 14
    iget-object v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->f:Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->k:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iget-object v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->l:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16
    iget-object v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->i:Landroid/widget/CheckBox;

    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->j:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
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

.method public g(Lcom/join/mgps/dto/ArchiveListBean;)V
    .locals 4
    .param p1    # Lcom/join/mgps/dto/ArchiveListBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->c:Lcom/join/mgps/dto/ArchiveListBean;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

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

.method public h(Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBinding;->d:Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x14

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
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

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
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->m:J

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
    check-cast p2, Lcom/join/mgps/dto/ArchiveListBean;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->g(Lcom/join/mgps/dto/ArchiveListBean;)V

    goto :goto_0

    :cond_0
    const/16 v0, 0x14

    if-ne v0, p1, :cond_1

    .line 2
    check-cast p2, Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemEndGameSlotListBindingImpl;->h(Lcom/join/kotlin/ui/endgame/adapter/ISlotAdapterListener;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
