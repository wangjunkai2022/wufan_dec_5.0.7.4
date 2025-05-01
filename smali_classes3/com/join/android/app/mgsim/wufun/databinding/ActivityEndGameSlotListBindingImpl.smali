.class public Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;
.source "ActivityEndGameSlotListBindingImpl.java"

# interfaces
.implements Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;


# static fields
.field private static final o:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final p:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final k:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final l:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final m:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private n:J


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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->o:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->p:Landroid/util/SparseIntArray;

    const/4 v2, 0x6

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 11

    const/4 v0, 0x1

    .line 2
    aget-object v1, p3, v0

    move-object v6, v1

    check-cast v6, Landroid/widget/ImageView;

    const/4 v1, 0x4

    aget-object v1, p3, v1

    move-object v7, v1

    check-cast v7, Landroid/widget/LinearLayout;

    const/4 v1, 0x5

    aget-object v1, p3, v1

    move-object v8, v1

    check-cast v8, Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    const/4 v1, 0x3

    aget-object v1, p3, v1

    move-object v9, v1

    check-cast v9, Landroid/widget/TextView;

    const/4 v1, 0x2

    aget-object v2, p3, v1

    move-object v10, v2

    check-cast v10, Landroid/widget/TextView;

    const/4 v5, 0x4

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v10}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/ImageView;Landroid/widget/LinearLayout;Lcom/join/android/app/component/xrecyclerview/XRecyclerView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    const-wide/16 v2, -0x1

    .line 3
    iput-wide v2, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 4
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->b:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 5
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->c:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 6
    aget-object p1, p3, p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->k:Landroid/widget/LinearLayout;

    .line 7
    invoke-virtual {p1, v2}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    .line 9
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->e:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 10
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->f:Landroid/widget/TextView;

    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 11
    invoke-virtual {p0, p2}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 12
    new-instance p1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p1, p0, v0}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->l:Landroid/view/View$OnClickListener;

    .line 13
    new-instance p1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {p1, p0, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->m:Landroid/view/View$OnClickListener;

    .line 14
    invoke-virtual {p0}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->invalidateAll()V

    return-void
.end method

.method private m(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/Boolean;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v0, 0x8

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 3
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private n(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/lang/String;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v0, 0x4

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 3
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private o(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Ljava/util/List<",
            "Lcom/join/mgps/dto/ArchiveListBean;",
            ">;>;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v0, 0x2

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 3
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private p(Landroidx/lifecycle/MutableLiveData;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/join/kotlin/domain/common/LoadBindindData;",
            ">;I)Z"
        }
    .end annotation

    if-nez p2, :cond_0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v0, 0x1

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 3
    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    return p1
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
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->j:Lcom/join/kotlin/ui/endgame/ISlotListener;

    if-eqz p1, :cond_1

    const/4 p2, 0x1

    :cond_1
    if-eqz p2, :cond_4

    .line 2
    invoke-interface {p1}, Lcom/join/kotlin/ui/endgame/ISlotListener;->onCommit()V

    goto :goto_0

    .line 3
    :cond_2
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->j:Lcom/join/kotlin/ui/endgame/ISlotListener;

    if-eqz p1, :cond_3

    const/4 p2, 0x1

    :cond_3
    if-eqz p2, :cond_4

    .line 4
    invoke-interface {p1}, Lcom/join/kotlin/ui/endgame/ISlotListener;->onBack()V

    :cond_4
    :goto_0
    return-void
.end method

.method protected executeBindings()V
    .locals 25

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->g:Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    const-wide/16 v6, 0x14f

    and-long/2addr v6, v2

    const-wide/16 v12, 0x140

    const-wide/16 v14, 0x142

    const-wide/16 v16, 0x141

    const/16 v18, 0x0

    const/4 v10, 0x0

    cmp-long v11, v6, v4

    if-eqz v11, :cond_16

    and-long v6, v2, v16

    const/4 v11, 0x1

    cmp-long v22, v6, v4

    if-eqz v22, :cond_7

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getLoadBindData()Landroidx/lifecycle/MutableLiveData;

    move-result-object v22

    move-object/from16 v8, v22

    goto :goto_0

    :cond_0
    move-object/from16 v8, v18

    .line 7
    :goto_0
    invoke-virtual {v1, v10, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    if-eqz v8, :cond_1

    .line 8
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/join/kotlin/domain/common/LoadBindindData;

    goto :goto_1

    :cond_1
    move-object/from16 v8, v18

    :goto_1
    if-eqz v8, :cond_2

    .line 9
    invoke-virtual {v8}, Lcom/join/kotlin/domain/common/LoadBindindData;->getShowStatus()I

    move-result v8

    goto :goto_2

    :cond_2
    const/4 v8, 0x0

    :goto_2
    if-ne v8, v11, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    :goto_3
    cmp-long v9, v6, v4

    if-eqz v9, :cond_5

    if-eqz v8, :cond_4

    const-wide/16 v6, 0x1000

    goto :goto_4

    :cond_4
    const-wide/16 v6, 0x800

    :goto_4
    or-long/2addr v2, v6

    :cond_5
    if-eqz v8, :cond_6

    goto :goto_5

    :cond_6
    const/16 v6, 0x8

    goto :goto_6

    :cond_7
    :goto_5
    const/4 v6, 0x0

    :goto_6
    and-long v7, v2, v14

    cmp-long v9, v7, v4

    if-eqz v9, :cond_e

    if-eqz v0, :cond_8

    .line 10
    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getListArchive()Landroidx/lifecycle/MutableLiveData;

    move-result-object v9

    goto :goto_7

    :cond_8
    move-object/from16 v9, v18

    .line 11
    :goto_7
    invoke-virtual {v1, v11, v9}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    if-eqz v9, :cond_9

    .line 12
    invoke-virtual {v9}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    goto :goto_8

    :cond_9
    move-object/from16 v9, v18

    :goto_8
    if-eqz v9, :cond_a

    .line 13
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v23

    goto :goto_9

    :cond_a
    const/16 v23, 0x0

    :goto_9
    if-lez v23, :cond_b

    goto :goto_a

    :cond_b
    const/4 v11, 0x0

    :goto_a
    cmp-long v23, v7, v4

    if-eqz v23, :cond_d

    if-eqz v11, :cond_c

    const-wide/16 v7, 0x400

    goto :goto_b

    :cond_c
    const-wide/16 v7, 0x200

    :goto_b
    or-long/2addr v2, v7

    :cond_d
    if-eqz v11, :cond_f

    const/16 v11, 0x8

    goto :goto_c

    :cond_e
    move-object/from16 v9, v18

    :cond_f
    const/4 v11, 0x0

    :goto_c
    and-long v7, v2, v12

    cmp-long v21, v7, v4

    if-eqz v21, :cond_10

    if-eqz v0, :cond_10

    .line 14
    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    goto :goto_d

    :cond_10
    move-object/from16 v7, v18

    :goto_d
    const-wide/16 v21, 0x144

    and-long v23, v2, v21

    cmp-long v8, v23, v4

    if-eqz v8, :cond_12

    if-eqz v0, :cond_11

    .line 15
    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getCommitText()Landroidx/lifecycle/MutableLiveData;

    move-result-object v8

    goto :goto_e

    :cond_11
    move-object/from16 v8, v18

    :goto_e
    const/4 v10, 0x2

    .line 16
    invoke-virtual {v1, v10, v8}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    if-eqz v8, :cond_12

    .line 17
    invoke-virtual {v8}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    goto :goto_f

    :cond_12
    move-object/from16 v8, v18

    :goto_f
    const-wide/16 v19, 0x148

    and-long v23, v2, v19

    cmp-long v10, v23, v4

    if-eqz v10, :cond_15

    if-eqz v0, :cond_13

    .line 18
    invoke-virtual {v0}, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;->getCommitEnableStatus()Landroidx/lifecycle/MutableLiveData;

    move-result-object v0

    goto :goto_10

    :cond_13
    move-object/from16 v0, v18

    :goto_10
    const/4 v10, 0x3

    .line 19
    invoke-virtual {v1, v10, v0}, Landroidx/databinding/ViewDataBinding;->updateLiveDataRegistration(ILandroidx/lifecycle/LiveData;)Z

    if-eqz v0, :cond_14

    .line 20
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v18, v0

    check-cast v18, Ljava/lang/Boolean;

    .line 21
    :cond_14
    invoke-static/range {v18 .. v18}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v10

    move v0, v10

    move v10, v11

    goto :goto_11

    :cond_15
    move v10, v11

    const/4 v0, 0x0

    goto :goto_11

    :cond_16
    move-object/from16 v7, v18

    move-object v8, v7

    move-object v9, v8

    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    :goto_11
    const-wide/16 v23, 0x100

    and-long v23, v2, v23

    cmp-long v11, v23, v4

    if-eqz v11, :cond_17

    .line 22
    iget-object v11, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->b:Landroid/widget/ImageView;

    iget-object v12, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->l:Landroid/view/View$OnClickListener;

    invoke-virtual {v11, v12}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 23
    iget-object v11, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->e:Landroid/widget/TextView;

    iget-object v12, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->m:Landroid/view/View$OnClickListener;

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_17
    and-long v11, v2, v14

    cmp-long v13, v11, v4

    if-eqz v13, :cond_18

    .line 24
    iget-object v11, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v11, v10}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 25
    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-static {v10, v9}, Lcom/join/kotlin/bindingadapter/ViewbindingRecycleviewAdapterKt;->recycleviewdataBinding(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/List;)V

    :cond_18
    and-long v9, v2, v16

    cmp-long v11, v9, v4

    if-eqz v11, :cond_19

    .line 26
    iget-object v9, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->d:Lcom/join/android/app/component/xrecyclerview/XRecyclerView;

    invoke-virtual {v9, v6}, Landroid/view/ViewGroup;->setVisibility(I)V

    :cond_19
    const-wide/16 v9, 0x148

    and-long/2addr v9, v2

    cmp-long v6, v9, v4

    if-eqz v6, :cond_1a

    .line 27
    iget-object v6, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->e:Landroid/widget/TextView;

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setEnabled(Z)V

    :cond_1a
    const-wide/16 v9, 0x144

    and-long/2addr v9, v2

    cmp-long v0, v9, v4

    if-eqz v0, :cond_1b

    .line 28
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->e:Landroid/widget/TextView;

    invoke-static {v0, v8}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1b
    const-wide/16 v8, 0x140

    and-long/2addr v2, v8

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1c

    .line 29
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->f:Landroid/widget/TextView;

    invoke-static {v0, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_1c
    return-void

    :catchall_0
    move-exception v0

    .line 30
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
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

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

.method public i(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V
    .locals 0
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$Adapter;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->h:Landroidx/recyclerview/widget/RecyclerView$Adapter;

    return-void
.end method

.method public invalidateAll()V
    .locals 2

    .line 1
    monitor-enter p0

    const-wide/16 v0, 0x100

    .line 2
    :try_start_0
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

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

.method public j(Lcom/join/kotlin/ui/endgame/ISlotListener;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/ui/endgame/ISlotListener;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->j:Lcom/join/kotlin/ui/endgame/ISlotListener;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v2, 0x20

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

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

.method public k(Lcom/join/kotlin/domain/common/LoadBindClickProxy;)V
    .locals 0
    .param p1    # Lcom/join/kotlin/domain/common/LoadBindClickProxy;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->i:Lcom/join/kotlin/domain/common/LoadBindClickProxy;

    return-void
.end method

.method public l(Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBinding;->g:Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    const-wide/16 v2, 0x40

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p1, 0x22

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
    .locals 1

    if-eqz p1, :cond_3

    const/4 v0, 0x1

    if-eq p1, v0, :cond_2

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1
    :cond_0
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p0, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->m(Landroidx/lifecycle/MutableLiveData;I)Z

    move-result p1

    return p1

    .line 2
    :cond_1
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p0, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->n(Landroidx/lifecycle/MutableLiveData;I)Z

    move-result p1

    return p1

    .line 3
    :cond_2
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p0, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->o(Landroidx/lifecycle/MutableLiveData;I)Z

    move-result p1

    return p1

    .line 4
    :cond_3
    check-cast p2, Landroidx/lifecycle/MutableLiveData;

    invoke-direct {p0, p2, p3}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->p(Landroidx/lifecycle/MutableLiveData;I)Z

    move-result p1

    return p1
.end method

.method public setVariable(ILjava/lang/Object;)Z
    .locals 2
    .param p2    # Ljava/lang/Object;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    const/16 v1, 0x15

    if-ne v1, p1, :cond_0

    .line 1
    check-cast p2, Lcom/join/kotlin/domain/common/LoadBindClickProxy;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->k(Lcom/join/kotlin/domain/common/LoadBindClickProxy;)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x14

    if-ne v1, p1, :cond_1

    .line 2
    check-cast p2, Lcom/join/kotlin/ui/endgame/ISlotListener;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->j(Lcom/join/kotlin/ui/endgame/ISlotListener;)V

    goto :goto_0

    :cond_1
    const/16 v1, 0x22

    if-ne v1, p1, :cond_2

    .line 3
    check-cast p2, Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->l(Lcom/join/kotlin/ui/endgame/EndGameSlotViewModel;)V

    goto :goto_0

    :cond_2
    if-ne v0, p1, :cond_3

    .line 4
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$Adapter;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ActivityEndGameSlotListBindingImpl;->i(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
