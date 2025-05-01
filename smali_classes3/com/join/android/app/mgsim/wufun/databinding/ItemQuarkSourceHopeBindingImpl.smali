.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;
.source "ItemQuarkSourceHopeBindingImpl.java"

# interfaces
.implements Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;


# static fields
.field private static final w:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final x:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final m:Landroidx/cardview/widget/CardView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final n:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final o:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final p:Landroid/view/View;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final q:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final r:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final s:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final t:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final u:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private v:J


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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->w:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->x:Landroid/util/SparseIntArray;

    const/16 v2, 0xd

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 18

    move-object/from16 v13, p0

    const/4 v0, 0x6

    .line 2
    aget-object v0, p3, v0

    move-object v4, v0

    check-cast v4, Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v0, 0x7

    aget-object v0, p3, v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    const/4 v14, 0x2

    aget-object v0, p3, v14

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    const/16 v0, 0xb

    aget-object v0, p3, v0

    move-object v7, v0

    check-cast v7, Landroid/widget/ImageView;

    const/16 v0, 0x8

    aget-object v0, p3, v0

    move-object v8, v0

    check-cast v8, Landroid/widget/TextView;

    const/4 v15, 0x1

    aget-object v0, p3, v15

    move-object v9, v0

    check-cast v9, Landroid/widget/TextView;

    const/4 v12, 0x4

    aget-object v0, p3, v12

    move-object v10, v0

    check-cast v10, Landroid/widget/TextView;

    const/16 v0, 0xc

    aget-object v0, p3, v0

    move-object v11, v0

    check-cast v11, Landroid/widget/TextView;

    const/4 v3, 0x3

    aget-object v0, p3, v3

    move-object/from16 v16, v0

    check-cast v16, Landroid/view/View;

    const/16 v17, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, v17

    move-object/from16 v12, v16

    invoke-direct/range {v0 .. v12}, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILcom/facebook/drawee/view/SimpleDraweeView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;)V

    const-wide/16 v0, -0x1

    .line 3
    iput-wide v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

    const/4 v0, 0x0

    .line 4
    aget-object v0, p3, v0

    check-cast v0, Landroidx/cardview/widget/CardView;

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->m:Landroidx/cardview/widget/CardView;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setTag(Ljava/lang/Object;)V

    const/16 v0, 0xa

    .line 6
    aget-object v0, p3, v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->n:Landroid/widget/ImageView;

    .line 7
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x5

    .line 8
    aget-object v2, p3, v0

    check-cast v2, Landroid/widget/ImageView;

    iput-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->o:Landroid/widget/ImageView;

    .line 9
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/16 v2, 0x9

    .line 10
    aget-object v2, p3, v2

    check-cast v2, Landroid/view/View;

    iput-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->p:Landroid/view/View;

    .line 11
    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 12
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 13
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->d:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->g:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->h:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->i:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 20
    iget-object v2, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->j:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 21
    invoke-virtual {v13, v1}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 22
    new-instance v1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v1, v13, v0}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v1, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->q:Landroid/view/View$OnClickListener;

    .line 23
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v0, v13, v15}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->r:Landroid/view/View$OnClickListener;

    .line 24
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v0, v13, v14}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->s:Landroid/view/View$OnClickListener;

    .line 25
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    const/4 v1, 0x3

    invoke-direct {v0, v13, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->t:Landroid/view/View$OnClickListener;

    .line 26
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    const/4 v1, 0x4

    invoke-direct {v0, v13, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v13, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->u:Landroid/view/View$OnClickListener;

    .line 27
    invoke-virtual/range {p0 .. p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/View;)V
    .locals 2

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_8

    const/4 v1, 0x2

    if-eq p1, v1, :cond_6

    const/4 v1, 0x3

    if-eq p1, v1, :cond_4

    const/4 v1, 0x4

    if-eq p1, v1, :cond_2

    const/4 v1, 0x5

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 2
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->l:Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    if-eqz v1, :cond_1

    const/4 p2, 0x1

    :cond_1
    if-eqz p2, :cond_a

    .line 3
    invoke-interface {v1, p1}, Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;->onUploadSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 5
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->l:Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    if-eqz v1, :cond_3

    const/4 p2, 0x1

    :cond_3
    if-eqz p2, :cond_a

    .line 6
    invoke-interface {v1, p1}, Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;->onWantClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    goto :goto_0

    .line 7
    :cond_4
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 8
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->l:Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    if-eqz v1, :cond_5

    const/4 p2, 0x1

    :cond_5
    if-eqz p2, :cond_a

    .line 9
    invoke-interface {v1, p1}, Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;->onWantClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    goto :goto_0

    .line 10
    :cond_6
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 11
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->l:Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    if-eqz v1, :cond_7

    const/4 p2, 0x1

    :cond_7
    if-eqz p2, :cond_a

    .line 12
    invoke-interface {v1, p1}, Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;->onWantClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    goto :goto_0

    .line 13
    :cond_8
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 14
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->l:Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    if-eqz v1, :cond_9

    const/4 p2, 0x1

    :cond_9
    if-eqz p2, :cond_a

    .line 15
    invoke-interface {v1, p1}, Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;->onViewSourceClick(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    :cond_a
    :goto_0
    return-void
.end method

.method protected executeBindings()V
    .locals 33

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    const/4 v6, 0x0

    const-wide/16 v7, 0x5

    and-long v9, v2, v7

    cmp-long v13, v9, v4

    if-eqz v13, :cond_1a

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getWanters()Ljava/lang/Integer;

    move-result-object v6

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->wantVisible()Z

    move-result v13

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getStatus()Ljava/lang/Integer;

    move-result-object v14

    .line 9
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getTypeColor()Ljava/lang/String;

    move-result-object v15

    .line 10
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getTitle()Ljava/lang/String;

    move-result-object v16

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getWanted()Ljava/lang/Integer;

    move-result-object v17

    .line 12
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getAvatar()Ljava/lang/String;

    move-result-object v18

    .line 13
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->hideUploadView()Z

    move-result v19

    .line 14
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getAuthorName()Ljava/lang/String;

    move-result-object v20

    .line 15
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->withWant()Z

    move-result v21

    .line 16
    invoke-virtual {v0}, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;->getTypeName()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_0
    cmp-long v22, v9, v4

    if-eqz v22, :cond_2

    if-eqz v13, :cond_1

    const-wide/16 v9, 0x100

    or-long/2addr v2, v9

    const-wide/16 v9, 0x4000

    goto :goto_1

    :cond_1
    const-wide/16 v9, 0x80

    or-long/2addr v2, v9

    const-wide/16 v9, 0x2000

    :goto_1
    or-long/2addr v2, v9

    :cond_2
    and-long v9, v2, v7

    cmp-long v22, v9, v4

    if-eqz v22, :cond_4

    if-eqz v19, :cond_3

    const-wide/16 v9, 0x40

    goto :goto_2

    :cond_3
    const-wide/16 v9, 0x20

    :goto_2
    or-long/2addr v2, v9

    :cond_4
    and-long v9, v2, v7

    cmp-long v22, v9, v4

    if-eqz v22, :cond_6

    if-eqz v21, :cond_5

    const-wide/16 v9, 0x10

    goto :goto_3

    :cond_5
    const-wide/16 v9, 0x8

    :goto_3
    or-long/2addr v2, v9

    .line 17
    :cond_6
    invoke-static {v6}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v9

    .line 18
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string/jumbo v6, "\u4eba\u60f3\u8981"

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    if-eqz v13, :cond_7

    const/16 v22, 0x0

    goto :goto_4

    :cond_7
    const/16 v22, 0x8

    :goto_4
    if-eqz v13, :cond_8

    .line 19
    iget-object v13, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v13}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    const v10, 0x7f0713c6

    invoke-virtual {v13, v10}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    goto :goto_5

    :cond_8
    iget-object v10, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const v13, 0x7f0711c7

    invoke-virtual {v10, v13}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v10

    .line 20
    :goto_5
    invoke-static {v14}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v13

    .line 21
    invoke-static/range {v17 .. v17}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v14

    if-eqz v19, :cond_9

    const/16 v17, 0x8

    goto :goto_6

    :cond_9
    const/16 v17, 0x0

    :goto_6
    if-eqz v21, :cond_a

    const/16 v19, 0x0

    goto :goto_7

    :cond_a
    const/16 v19, 0x8

    :goto_7
    const/4 v11, 0x1

    if-lez v9, :cond_b

    const/4 v9, 0x1

    goto :goto_8

    :cond_b
    const/4 v9, 0x0

    :goto_8
    if-eqz v13, :cond_c

    const/16 v24, 0x1

    goto :goto_9

    :cond_c
    const/16 v24, 0x0

    :goto_9
    if-nez v13, :cond_d

    const/16 v25, 0x1

    goto :goto_a

    :cond_d
    const/16 v25, 0x0

    :goto_a
    if-ne v13, v11, :cond_e

    const/4 v13, 0x1

    goto :goto_b

    :cond_e
    const/4 v13, 0x0

    :goto_b
    if-nez v14, :cond_f

    goto :goto_c

    :cond_f
    const/4 v11, 0x0

    :goto_c
    and-long v26, v2, v7

    cmp-long v14, v26, v4

    if-eqz v14, :cond_11

    if-eqz v9, :cond_10

    const-wide/16 v26, 0x400

    goto :goto_d

    :cond_10
    const-wide/16 v26, 0x200

    :goto_d
    or-long v2, v2, v26

    :cond_11
    and-long v26, v2, v7

    cmp-long v14, v26, v4

    if-eqz v14, :cond_13

    if-eqz v25, :cond_12

    const-wide/16 v26, 0x1000

    or-long v2, v2, v26

    const-wide/32 v26, 0x10000

    goto :goto_e

    :cond_12
    const-wide/16 v26, 0x800

    or-long v2, v2, v26

    const-wide/32 v26, 0x8000

    :goto_e
    or-long v2, v2, v26

    :cond_13
    and-long v26, v2, v7

    cmp-long v14, v26, v4

    if-eqz v14, :cond_15

    if-eqz v13, :cond_14

    const-wide/32 v26, 0x40000

    goto :goto_f

    :cond_14
    const-wide/32 v26, 0x20000

    :goto_f
    or-long v2, v2, v26

    :cond_15
    if-eqz v9, :cond_16

    const/4 v9, 0x0

    goto :goto_10

    :cond_16
    const/16 v9, 0x8

    :goto_10
    if-eqz v25, :cond_17

    const-string/jumbo v14, "\u6536\u96c6\u4e2d"

    goto :goto_11

    :cond_17
    const-string/jumbo v14, "\u5df2\u5b9e\u73b0"

    :goto_11
    if-eqz v25, :cond_18

    .line 22
    iget-object v12, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->j:Landroid/view/View;

    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v12

    const v7, 0x7f080d00

    invoke-static {v12, v7}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    goto :goto_12

    :cond_18
    iget-object v7, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->j:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v8, 0x7f080cff

    invoke-static {v7, v8}, Landroidx/appcompat/content/res/AppCompatResources;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    :goto_12
    if-eqz v13, :cond_19

    const/16 v23, 0x0

    goto :goto_13

    :cond_19
    const/16 v23, 0x8

    :goto_13
    move-object v8, v7

    move/from16 v12, v17

    move-object/from16 v13, v18

    move/from16 v28, v19

    move-object/from16 v29, v20

    move/from16 v30, v22

    move/from16 v31, v23

    move/from16 v32, v24

    move-object v7, v6

    move v6, v10

    move-object/from16 v10, v16

    goto :goto_14

    :cond_1a
    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    :goto_14
    const-wide/16 v16, 0x4

    and-long v16, v2, v16

    cmp-long v18, v16, v4

    if-eqz v18, :cond_1b

    .line 23
    iget-object v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->n:Landroid/widget/ImageView;

    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->t:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 24
    iget-object v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->e:Landroid/widget/ImageView;

    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->u:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 25
    iget-object v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->s:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 26
    iget-object v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->i:Landroid/widget/TextView;

    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->q:Landroid/view/View$OnClickListener;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1b
    const-wide/16 v4, 0x5

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v16, v2, v4

    if-eqz v16, :cond_1c

    .line 27
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->n:Landroid/widget/ImageView;

    move/from16 v3, v30

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 28
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->o:Landroid/widget/ImageView;

    move/from16 v4, v31

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 29
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->p:Landroid/view/View;

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 30
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->b:Lcom/facebook/drawee/view/SimpleDraweeView;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v2, v13, v3, v4}, Lcom/join/kotlin/bindingadapter/SimpleDrawableViewKt;->loadUrl(Lcom/facebook/drawee/view/SimpleDraweeView;Ljava/lang/String;Ljava/lang/String;I)V

    .line 31
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->c:Landroid/widget/TextView;

    move-object/from16 v3, v29

    invoke-static {v2, v3}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 32
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->d:Landroid/widget/TextView;

    invoke-static {v2, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 33
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->e:Landroid/widget/ImageView;

    move/from16 v3, v28

    invoke-virtual {v2, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 34
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v11}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 35
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-static {v2, v6}, Landroidx/databinding/adapters/ViewBindingAdapter;->setPaddingRight(Landroid/view/View;F)V

    .line 36
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-static {v2, v7}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 37
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setVisibility(I)V

    .line 38
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->g:Landroid/widget/TextView;

    invoke-static {v2, v15}, Lcom/join/kotlin/bindingadapter/ViewBindingTextviewKt;->textViewColorBinding(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 39
    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->g:Landroid/widget/TextView;

    invoke-static {v2, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 40
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->h:Landroid/widget/TextView;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 41
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->i:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 42
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->j:Landroid/view/View;

    invoke-static {v0, v8}, Landroidx/databinding/adapters/ViewBindingAdapter;->setBackground(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V

    .line 43
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->j:Landroid/view/View;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->r:Landroid/view/View$OnClickListener;

    move/from16 v3, v32

    invoke-static {v0, v2, v3}, Landroidx/databinding/adapters/ViewBindingAdapter;->setOnClick(Landroid/view/View;Landroid/view/View$OnClickListener;Z)V

    :cond_1c
    return-void

    :catchall_0
    move-exception v0

    .line 44
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public g(Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->l:Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

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

.method public h(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/quark/model/bean/SourceListItemBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBinding;->k:Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

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
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

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
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->v:J

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
    check-cast p2, Lcom/join/kotlin/quark/model/bean/SourceListItemBean;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->h(Lcom/join/kotlin/quark/model/bean/SourceListItemBean;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    if-ne v0, p1, :cond_1

    .line 2
    check-cast p2, Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemQuarkSourceHopeBindingImpl;->g(Lcom/join/kotlin/quark/proxy/SourceHopeItemClickProxy;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
