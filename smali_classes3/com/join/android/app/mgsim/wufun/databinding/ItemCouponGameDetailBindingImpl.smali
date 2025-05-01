.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;
.source "ItemCouponGameDetailBindingImpl.java"

# interfaces
.implements Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;


# static fields
.field private static final A:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final B:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final q:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final r:Landroidx/constraintlayout/widget/Group;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final s:Landroid/widget/LinearLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final t:Landroid/widget/TextView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final u:Landroidx/constraintlayout/widget/Group;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final v:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final w:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final x:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final y:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->B:Landroid/util/SparseIntArray;

    const v1, 0x7f091774

    const/16 v2, 0xd

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091617

    const/16 v2, 0xe

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091618

    const/16 v2, 0xf

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091780

    const/16 v2, 0x10

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091767

    const/16 v2, 0x11

    .line 6
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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->A:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->B:Landroid/util/SparseIntArray;

    const/16 v2, 0x12

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 18

    move-object/from16 v3, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v4, 0xa

    .line 2
    aget-object v4, p3, v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v5, 0x7

    aget-object v5, p3, v5

    check-cast v5, Landroid/widget/TextView;

    const/16 v6, 0xe

    aget-object v6, p3, v6

    check-cast v6, Landroid/widget/TextView;

    const/16 v7, 0xf

    aget-object v7, p3, v7

    check-cast v7, Landroid/widget/TextView;

    const/4 v15, 0x3

    aget-object v8, p3, v15

    check-cast v8, Landroid/widget/TextView;

    const/16 v9, 0x8

    aget-object v9, p3, v9

    check-cast v9, Landroid/widget/TextView;

    const/4 v10, 0x6

    aget-object v10, p3, v10

    check-cast v10, Landroid/widget/TextView;

    const/16 v11, 0x9

    aget-object v11, p3, v11

    check-cast v11, Landroid/widget/TextView;

    const/4 v14, 0x2

    aget-object v12, p3, v14

    check-cast v12, Landroid/widget/TextView;

    const/4 v13, 0x5

    aget-object v13, p3, v13

    check-cast v13, Landroid/widget/TextView;

    const/16 v16, 0xd

    aget-object v16, p3, v16

    check-cast v16, Landroid/view/View;

    move-object/from16 v14, v16

    const/16 v16, 0x11

    aget-object v16, p3, v16

    check-cast v16, Landroid/view/View;

    move-object/from16 v15, v16

    const/16 v16, 0x10

    aget-object v16, p3, v16

    check-cast v16, Landroid/view/View;

    const/16 v17, 0x0

    move/from16 v3, v17

    invoke-direct/range {v0 .. v16}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    const-wide/16 v0, -0x1

    move-object/from16 v2, p0

    .line 3
    iput-wide v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

    const/4 v0, 0x0

    .line 4
    aget-object v0, p3, v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 6
    aget-object v3, p3, v0

    check-cast v3, Landroidx/constraintlayout/widget/Group;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->r:Landroidx/constraintlayout/widget/Group;

    .line 7
    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0xb

    .line 8
    aget-object v3, p3, v3

    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->s:Landroid/widget/LinearLayout;

    .line 9
    invoke-virtual {v3, v1}, Landroid/widget/LinearLayout;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0xc

    .line 10
    aget-object v3, p3, v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->t:Landroid/widget/TextView;

    .line 11
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    const/4 v3, 0x4

    .line 12
    aget-object v4, p3, v3

    check-cast v4, Landroidx/constraintlayout/widget/Group;

    iput-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->u:Landroidx/constraintlayout/widget/Group;

    .line 13
    invoke-virtual {v4, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->c:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->f:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->g:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->h:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->i:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 20
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->j:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 21
    iget-object v4, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->k:Landroid/widget/TextView;

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 22
    invoke-virtual {v2, v1}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 23
    new-instance v1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v1, v2, v3}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v1, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->v:Landroid/view/View$OnClickListener;

    .line 24
    new-instance v1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v1, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->w:Landroid/view/View$OnClickListener;

    .line 25
    new-instance v1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v1, v2, v0}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v1, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->x:Landroid/view/View$OnClickListener;

    .line 26
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->y:Landroid/view/View$OnClickListener;

    .line 27
    invoke-virtual/range {p0 .. p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/View;)V
    .locals 2

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_6

    const/4 v1, 0x2

    if-eq p1, v1, :cond_4

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->o:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 2
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->p:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_1

    const/4 p2, 0x1

    :cond_1
    if-eqz p2, :cond_8

    .line 3
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->onReceiveClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->o:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 5
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->p:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_3

    const/4 p2, 0x1

    :cond_3
    if-eqz p2, :cond_8

    .line 6
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->onUseClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    goto :goto_0

    .line 7
    :cond_4
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->o:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 8
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->p:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_5

    const/4 p2, 0x1

    :cond_5
    if-eqz p2, :cond_8

    .line 9
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->onDetailClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    goto :goto_0

    .line 10
    :cond_6
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->o:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 11
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->p:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_7

    const/4 p2, 0x1

    :cond_7
    if-eqz p2, :cond_8

    .line 12
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->onUnSupportClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    :cond_8
    :goto_0
    return-void
.end method

.method protected executeBindings()V
    .locals 32

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->o:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    const-wide/16 v6, 0x5

    and-long v8, v2, v6

    const/4 v12, 0x1

    cmp-long v15, v8, v4

    if-eqz v15, :cond_11

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getRange_op()Ljava/lang/Integer;

    move-result-object v15

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getCoupon_name()Ljava/lang/String;

    move-result-object v16

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getThreshold_text()Ljava/lang/String;

    move-result-object v17

    .line 9
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->receiveBtnText()Ljava/lang/String;

    move-result-object v18

    .line 10
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->receiveBtnTextColor()Ljava/lang/String;

    move-result-object v19

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getRepeatable()Ljava/lang/Boolean;

    move-result-object v20

    .line 12
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getAmount_text()Ljava/lang/String;

    move-result-object v21

    .line 13
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->formatBalance()Landroid/text/SpannableStringBuilder;

    move-result-object v22

    .line 14
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getReceive_time_text()Ljava/lang/String;

    move-result-object v23

    .line 15
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getUse_range_text()Ljava/lang/String;

    move-result-object v24

    .line 16
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getState()Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v13, v17

    move-object/from16 v14, v23

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    .line 17
    :goto_0
    invoke-static {v15}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v15

    .line 18
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v11, "\u6ee1"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    .line 19
    invoke-static/range {v19 .. v19}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    .line 20
    invoke-static/range {v20 .. v20}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v13

    .line 21
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v7, "\u9886\u53d6\u65f6\u95f4:"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 22
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v0

    cmp-long v7, v8, v4

    if-eqz v7, :cond_2

    if-eqz v13, :cond_1

    const-wide/16 v7, 0x100

    or-long/2addr v2, v7

    const-wide/16 v7, 0x400

    goto :goto_1

    :cond_1
    const-wide/16 v7, 0x80

    or-long/2addr v2, v7

    const-wide/16 v7, 0x200

    :goto_1
    or-long/2addr v2, v7

    :cond_2
    if-eqz v15, :cond_3

    const/4 v7, 0x1

    goto :goto_2

    :cond_3
    const/4 v7, 0x0

    :goto_2
    if-nez v15, :cond_4

    const/4 v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    .line 23
    :goto_3
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v10, "\u53ef\u7528"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x8

    if-eqz v13, :cond_5

    const/4 v14, 0x0

    goto :goto_4

    :cond_5
    const/16 v14, 0x8

    :goto_4
    if-eqz v13, :cond_6

    goto :goto_5

    :cond_6
    const/4 v10, 0x0

    :goto_5
    if-eq v0, v12, :cond_7

    const/4 v13, 0x1

    goto :goto_6

    :cond_7
    const/4 v13, 0x0

    :goto_6
    if-ne v0, v12, :cond_8

    const/4 v0, 0x1

    goto :goto_7

    :cond_8
    const/4 v0, 0x0

    :goto_7
    const-wide/16 v19, 0x5

    and-long v27, v2, v19

    cmp-long v29, v27, v4

    if-eqz v29, :cond_a

    if-eqz v8, :cond_9

    const-wide/16 v27, 0x10

    or-long v2, v2, v27

    goto :goto_8

    :cond_9
    const-wide/16 v25, 0x8

    or-long v2, v2, v25

    :cond_a
    :goto_8
    and-long v27, v2, v19

    cmp-long v29, v27, v4

    if-eqz v29, :cond_c

    if-eqz v13, :cond_b

    const-wide/16 v27, 0x4000

    goto :goto_9

    :cond_b
    const-wide/16 v27, 0x2000

    :goto_9
    or-long v2, v2, v27

    :cond_c
    and-long v27, v2, v19

    cmp-long v29, v27, v4

    if-eqz v29, :cond_e

    if-eqz v0, :cond_d

    const-wide/16 v27, 0x1000

    goto :goto_a

    :cond_d
    const-wide/16 v27, 0x800

    :goto_a
    or-long v2, v2, v27

    :cond_e
    const/16 v27, 0x4

    if-eqz v13, :cond_f

    const/4 v13, 0x0

    goto :goto_b

    :cond_f
    const/4 v13, 0x4

    :goto_b
    if-eqz v0, :cond_10

    const/16 v27, 0x0

    :cond_10
    move-object/from16 v0, v16

    move-object/from16 v12, v18

    move-object/from16 v30, v21

    move-object/from16 v31, v22

    move-object/from16 v18, v6

    move/from16 v21, v7

    move-object/from16 v6, v24

    move/from16 v7, v27

    const-wide/16 v24, 0x8

    goto :goto_c

    :cond_11
    const/4 v0, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const-wide/16 v24, 0x8

    const/16 v30, 0x0

    const/16 v31, 0x0

    :goto_c
    and-long v24, v2, v24

    cmp-long v22, v24, v4

    if-eqz v22, :cond_16

    const/4 v4, -0x1

    if-ne v15, v4, :cond_12

    const-wide/16 v4, 0x0

    const/16 v16, 0x1

    goto :goto_d

    :cond_12
    const-wide/16 v4, 0x0

    const/16 v16, 0x0

    :goto_d
    cmp-long v15, v24, v4

    if-eqz v15, :cond_14

    if-eqz v16, :cond_13

    const-wide/16 v4, 0x40

    goto :goto_e

    :cond_13
    const-wide/16 v4, 0x20

    :goto_e
    or-long/2addr v2, v4

    :cond_14
    if-eqz v16, :cond_15

    const-string/jumbo v4, "\u4e0d\u9002\u7528\u8303\u56f4"

    goto :goto_f

    :cond_15
    const-string/jumbo v4, "\u9002\u7528\u8303\u56f4"

    goto :goto_f

    :cond_16
    const/4 v4, 0x0

    :goto_f
    const-wide/16 v15, 0x5

    and-long/2addr v15, v2

    const-wide/16 v19, 0x0

    cmp-long v5, v15, v19

    if-eqz v5, :cond_17

    if-eqz v8, :cond_18

    const-string/jumbo v4, "\u5168\u90e8\u9002\u7528"

    goto :goto_10

    :cond_17
    const/4 v4, 0x0

    :cond_18
    :goto_10
    cmp-long v5, v15, v19

    if-eqz v5, :cond_19

    .line 24
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->r:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v5, v10}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 25
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->s:Landroid/widget/LinearLayout;

    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 26
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->t:Landroid/widget/TextView;

    invoke-static {v5, v12}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 27
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->t:Landroid/widget/TextView;

    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 28
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->u:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v5, v14}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 29
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->b:Landroid/widget/TextView;

    invoke-static {v5, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 30
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v5, v13}, Landroid/widget/TextView;->setVisibility(I)V

    .line 31
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->f:Landroid/widget/TextView;

    invoke-static {v5, v9}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 32
    iget-object v5, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->g:Landroid/widget/TextView;

    invoke-static {v5, v0}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 33
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->h:Landroid/widget/TextView;

    move/from16 v7, v21

    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 34
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->h:Landroid/widget/TextView;

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 35
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->i:Landroid/widget/TextView;

    move-object/from16 v6, v18

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 36
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->j:Landroid/widget/TextView;

    move-object/from16 v4, v30

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 37
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->k:Landroid/widget/TextView;

    move-object/from16 v4, v31

    invoke-static {v0, v4}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_19
    const-wide/16 v4, 0x4

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-eqz v0, :cond_1a

    .line 38
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->s:Landroid/widget/LinearLayout;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->y:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->t:Landroid/widget/TextView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->v:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->c:Landroid/widget/TextView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->w:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->h:Landroid/widget/TextView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->x:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1a
    return-void

    :catchall_0
    move-exception v0

    .line 42
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public g(Lcom/join/kotlin/discount/proxy/CouponListClickProxy;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/discount/proxy/CouponListClickProxy;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->p:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

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

.method public h(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V
    .locals 4
    .param p1    # Lcom/join/kotlin/discount/model/bean/CouponItemBean;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBinding;->o:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

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
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

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
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->z:J

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
    check-cast p2, Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->h(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    if-ne v0, p1, :cond_1

    .line 2
    check-cast p2, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponGameDetailBindingImpl;->g(Lcom/join/kotlin/discount/proxy/CouponListClickProxy;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
