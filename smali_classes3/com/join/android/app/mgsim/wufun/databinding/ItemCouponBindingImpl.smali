.class public Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;
.super Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;
.source "ItemCouponBindingImpl.java"

# interfaces
.implements Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;


# static fields
.field private static final C:Landroidx/databinding/ViewDataBinding$IncludedLayouts;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private static final D:Landroid/util/SparseIntArray;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# instance fields
.field private final A:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private B:J

.field private final t:Landroidx/constraintlayout/widget/ConstraintLayout;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final u:Landroidx/constraintlayout/widget/Group;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final v:Landroid/widget/ImageView;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final w:Landroidx/constraintlayout/widget/Group;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final x:Landroidx/constraintlayout/widget/Group;
    .annotation build Landroidx/annotation/NonNull;
    .end annotation
.end field

.field private final y:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final z:Landroid/view/View$OnClickListener;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/SparseIntArray;

    invoke-direct {v0}, Landroid/util/SparseIntArray;-><init>()V

    sput-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->D:Landroid/util/SparseIntArray;

    const v1, 0x7f091774

    const/16 v2, 0xf

    .line 2
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091617

    const/16 v2, 0x10

    .line 3
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091618

    const/16 v2, 0x11

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091613

    const/16 v2, 0x12

    .line 5
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091780

    const/16 v2, 0x13

    .line 6
    invoke-virtual {v0, v1, v2}, Landroid/util/SparseIntArray;->put(II)V

    const v1, 0x7f091777

    const/16 v2, 0x14

    .line 7
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
    sget-object v0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->C:Landroidx/databinding/ViewDataBinding$IncludedLayouts;

    sget-object v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->D:Landroid/util/SparseIntArray;

    const/16 v2, 0x15

    invoke-static {p1, p2, v2, v0, v1}, Landroidx/databinding/ViewDataBinding;->mapBindings(Landroidx/databinding/DataBindingComponent;Landroid/view/View;ILandroidx/databinding/ViewDataBinding$IncludedLayouts;Landroid/util/SparseIntArray;)[Ljava/lang/Object;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;-><init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V

    return-void
.end method

.method private constructor <init>(Landroidx/databinding/DataBindingComponent;Landroid/view/View;[Ljava/lang/Object;)V
    .locals 21

    move-object/from16 v3, p0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/16 v4, 0xe

    .line 2
    aget-object v4, p3, v4

    check-cast v4, Landroid/widget/TextView;

    const/4 v5, 0x7

    aget-object v5, p3, v5

    check-cast v5, Landroid/widget/TextView;

    const/16 v6, 0x9

    aget-object v6, p3, v6

    check-cast v6, Landroid/widget/TextView;

    const/16 v7, 0xa

    aget-object v7, p3, v7

    check-cast v7, Landroid/widget/TextView;

    const/16 v8, 0x12

    aget-object v8, p3, v8

    check-cast v8, Landroid/widget/TextView;

    const/16 v9, 0x10

    aget-object v9, p3, v9

    check-cast v9, Landroid/widget/TextView;

    const/16 v10, 0x11

    aget-object v10, p3, v10

    check-cast v10, Landroid/widget/TextView;

    const/4 v15, 0x3

    aget-object v11, p3, v15

    check-cast v11, Landroid/widget/TextView;

    const/16 v12, 0xb

    aget-object v12, p3, v12

    check-cast v12, Landroid/widget/TextView;

    const/4 v13, 0x6

    aget-object v13, p3, v13

    check-cast v13, Landroid/widget/TextView;

    const/16 v14, 0xd

    aget-object v14, p3, v14

    check-cast v14, Landroid/widget/TextView;

    const/4 v3, 0x2

    aget-object v16, p3, v3

    check-cast v16, Landroid/widget/TextView;

    move-object/from16 v15, v16

    const/16 v16, 0x5

    aget-object v16, p3, v16

    check-cast v16, Landroid/widget/TextView;

    const/16 v17, 0xf

    aget-object v17, p3, v17

    check-cast v17, Landroid/view/View;

    const/16 v18, 0x14

    aget-object v18, p3, v18

    check-cast v18, Landroid/view/View;

    const/16 v19, 0x13

    aget-object v19, p3, v19

    check-cast v19, Landroid/view/View;

    const/16 v20, 0x0

    move/from16 v3, v20

    invoke-direct/range {v0 .. v19}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;-><init>(Ljava/lang/Object;Landroid/view/View;ILandroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V

    const-wide/16 v0, -0x1

    move-object/from16 v2, p0

    .line 3
    iput-wide v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

    const/4 v0, 0x0

    .line 4
    aget-object v0, p3, v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    iput-object v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->t:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTag(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 6
    aget-object v3, p3, v0

    check-cast v3, Landroidx/constraintlayout/widget/Group;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->u:Landroidx/constraintlayout/widget/Group;

    .line 7
    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0xc

    .line 8
    aget-object v3, p3, v3

    check-cast v3, Landroid/widget/ImageView;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->v:Landroid/widget/ImageView;

    .line 9
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    const/4 v3, 0x4

    .line 10
    aget-object v3, p3, v3

    check-cast v3, Landroidx/constraintlayout/widget/Group;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->w:Landroidx/constraintlayout/widget/Group;

    .line 11
    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const/16 v3, 0x8

    .line 12
    aget-object v3, p3, v3

    check-cast v3, Landroidx/constraintlayout/widget/Group;

    iput-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->x:Landroidx/constraintlayout/widget/Group;

    .line 13
    invoke-virtual {v3, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 14
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 15
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 16
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->d:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 17
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->e:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 18
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->i:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 19
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->j:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 20
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->k:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 21
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->l:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 22
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->m:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    .line 23
    iget-object v3, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->n:Landroid/widget/TextView;

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTag(Ljava/lang/Object;)V

    move-object/from16 v1, p2

    .line 24
    invoke-virtual {v2, v1}, Landroidx/databinding/ViewDataBinding;->setRootTag(Landroid/view/View;)V

    .line 25
    new-instance v1, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    invoke-direct {v1, v2, v0}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v1, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->y:Landroid/view/View$OnClickListener;

    .line 26
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    const/4 v1, 0x2

    invoke-direct {v0, v2, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->z:Landroid/view/View$OnClickListener;

    .line 27
    new-instance v0, Lcom/join/android/app/mgsim/wufun/generated/callback/a;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Lcom/join/android/app/mgsim/wufun/generated/callback/a;-><init>(Lcom/join/android/app/mgsim/wufun/generated/callback/a$a;I)V

    iput-object v0, v2, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->A:Landroid/view/View$OnClickListener;

    .line 28
    invoke-virtual/range {p0 .. p0}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->invalidateAll()V

    return-void
.end method


# virtual methods
.method public final a(ILandroid/view/View;)V
    .locals 3

    const/4 p2, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_5

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->r:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 2
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->s:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_7

    if-eqz p1, :cond_2

    const/4 p2, 0x1

    :cond_2
    if-eqz p2, :cond_7

    .line 3
    invoke-virtual {p1}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getUse_tip()Lcom/join/kotlin/discount/model/bean/CouponUseTip;

    move-result-object p1

    .line 4
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->showUseTip(Lcom/join/kotlin/discount/model/bean/CouponUseTip;)V

    goto :goto_1

    .line 5
    :cond_3
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->r:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 6
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->s:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_4

    const/4 p2, 0x1

    :cond_4
    if-eqz p2, :cond_7

    .line 7
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->onDetailClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    goto :goto_1

    .line 8
    :cond_5
    iget-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->r:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 9
    iget-object v1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->s:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    if-eqz v1, :cond_6

    const/4 p2, 0x1

    :cond_6
    if-eqz p2, :cond_7

    .line 10
    invoke-interface {v1, p1}, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;->onUnSupportClick(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    :cond_7
    :goto_1
    return-void
.end method

.method protected executeBindings()V
    .locals 34

    move-object/from16 v1, p0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

    const-wide/16 v4, 0x0

    .line 3
    iput-wide v4, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

    .line 4
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->r:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    const-wide/16 v6, 0x5

    and-long v8, v2, v6

    cmp-long v16, v8, v4

    if-eqz v16, :cond_10

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getRange_op()Ljava/lang/Integer;

    move-result-object v16

    .line 7
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getCoupon_name()Ljava/lang/String;

    move-result-object v17

    .line 8
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getCoupon_type()Ljava/lang/Integer;

    move-result-object v18

    .line 9
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getAmount()Ljava/lang/String;

    move-result-object v19

    .line 10
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getThreshold_text()Ljava/lang/String;

    move-result-object v20

    .line 11
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getUse_tip()Lcom/join/kotlin/discount/model/bean/CouponUseTip;

    move-result-object v21

    .line 12
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getDiscount()Ljava/lang/String;

    move-result-object v22

    .line 13
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getThreshold()Ljava/lang/String;

    move-result-object v23

    .line 14
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->formatBalance()Landroid/text/SpannableStringBuilder;

    move-result-object v24

    .line 15
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getUse_time_text()Ljava/lang/String;

    move-result-object v25

    .line 16
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getUse_range_text()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v12, v23

    move-object/from16 v13, v25

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    .line 17
    :goto_0
    invoke-static/range {v16 .. v16}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v16

    .line 18
    invoke-static/range {v18 .. v18}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Integer;)I

    move-result v18

    if-eqz v21, :cond_1

    const/16 v21, 0x1

    goto :goto_1

    :cond_1
    const/16 v21, 0x0

    .line 19
    :goto_1
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v15, "\u6ee1"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    .line 20
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v15, "\u4f7f\u7528\u65f6\u95f4:"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    cmp-long v14, v8, v4

    if-eqz v14, :cond_3

    if-eqz v21, :cond_2

    const-wide/32 v8, 0x10000

    goto :goto_2

    :cond_2
    const-wide/32 v8, 0x8000

    :goto_2
    or-long/2addr v2, v8

    :cond_3
    if-eqz v16, :cond_4

    const/4 v8, 0x1

    goto :goto_3

    :cond_4
    const/4 v8, 0x0

    :goto_3
    if-nez v16, :cond_5

    const/4 v9, 0x1

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    if-nez v18, :cond_6

    const/4 v14, 0x1

    goto :goto_5

    :cond_6
    const/4 v14, 0x0

    :goto_5
    if-eqz v18, :cond_7

    const/4 v15, 0x1

    goto :goto_6

    :cond_7
    const/4 v15, 0x0

    :goto_6
    if-eqz v21, :cond_8

    const/16 v18, 0x0

    goto :goto_7

    :cond_8
    const/16 v18, 0x8

    .line 21
    :goto_7
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string/jumbo v11, "\u53ef\u7528"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    and-long v11, v2, v6

    cmp-long v21, v11, v4

    if-eqz v21, :cond_a

    if-eqz v9, :cond_9

    const-wide/16 v11, 0x40

    goto :goto_8

    :cond_9
    const-wide/16 v11, 0x20

    :goto_8
    or-long/2addr v2, v11

    :cond_a
    and-long v11, v2, v6

    cmp-long v21, v11, v4

    if-eqz v21, :cond_c

    if-eqz v14, :cond_b

    const-wide/32 v11, 0x40000

    or-long/2addr v2, v11

    const-wide/32 v11, 0x400000

    goto :goto_9

    :cond_b
    const-wide/32 v11, 0x20000

    or-long/2addr v2, v11

    const-wide/32 v11, 0x200000

    :goto_9
    or-long/2addr v2, v11

    :cond_c
    and-long v11, v2, v6

    cmp-long v21, v11, v4

    if-eqz v21, :cond_e

    if-eqz v15, :cond_d

    const-wide/16 v11, 0x4000

    or-long/2addr v2, v11

    const-wide/32 v11, 0x100000

    goto :goto_a

    :cond_d
    const-wide/16 v11, 0x2000

    or-long/2addr v2, v11

    const-wide/32 v11, 0x80000

    :goto_a
    or-long/2addr v2, v11

    :cond_e
    if-eqz v14, :cond_f

    const/4 v11, 0x0

    goto :goto_b

    :cond_f
    const/16 v11, 0x8

    :goto_b
    move/from16 v12, v16

    move-object/from16 v27, v17

    move/from16 v28, v18

    move-object/from16 v29, v19

    move-object/from16 v30, v20

    move-object/from16 v31, v22

    move-object/from16 v32, v24

    move-object/from16 v33, v26

    const-wide/16 v16, 0x20

    goto :goto_c

    :cond_10
    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x20

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    :goto_c
    and-long v16, v2, v16

    cmp-long v18, v16, v4

    if-eqz v18, :cond_15

    const/4 v6, -0x1

    if-ne v12, v6, :cond_11

    const/4 v6, 0x1

    goto :goto_d

    :cond_11
    const/4 v6, 0x0

    :goto_d
    cmp-long v7, v16, v4

    if-eqz v7, :cond_13

    if-eqz v6, :cond_12

    const-wide/16 v16, 0x400

    goto :goto_e

    :cond_12
    const-wide/16 v16, 0x200

    :goto_e
    or-long v2, v2, v16

    :cond_13
    if-eqz v6, :cond_14

    const-string/jumbo v6, "\u4e0d\u9002\u7528\u8303\u56f4"

    goto :goto_f

    :cond_14
    const-string/jumbo v6, "\u9002\u7528\u8303\u56f4"

    goto :goto_f

    :cond_15
    const/4 v6, 0x0

    :goto_f
    const-wide/32 v16, 0x304000

    and-long v16, v2, v16

    cmp-long v7, v16, v4

    if-eqz v7, :cond_17

    if-eqz v0, :cond_16

    .line 22
    invoke-virtual {v0}, Lcom/join/kotlin/discount/model/bean/CouponItemBean;->getRepeatable()Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_10

    :cond_16
    const/4 v0, 0x0

    .line 23
    :goto_10
    invoke-static {v0}, Landroidx/databinding/ViewDataBinding;->safeUnbox(Ljava/lang/Boolean;)Z

    move-result v0

    const-wide/32 v16, 0x204000

    and-long v16, v2, v16

    cmp-long v7, v16, v4

    if-eqz v7, :cond_18

    xor-int/lit8 v7, v0, 0x1

    goto :goto_11

    :cond_17
    const/4 v0, 0x0

    :cond_18
    const/4 v7, 0x0

    :goto_11
    const-wide/16 v16, 0x5

    and-long v20, v2, v16

    cmp-long v12, v20, v4

    if-eqz v12, :cond_26

    if-eqz v9, :cond_19

    const-string/jumbo v6, "\u5168\u90e8\u9002\u7528"

    :cond_19
    if-eqz v15, :cond_1a

    move v9, v7

    goto :goto_12

    :cond_1a
    const/4 v9, 0x0

    :goto_12
    if-eqz v15, :cond_1b

    goto :goto_13

    :cond_1b
    const/4 v0, 0x0

    :goto_13
    if-eqz v14, :cond_1c

    const/4 v7, 0x1

    :cond_1c
    cmp-long v12, v20, v4

    if-eqz v12, :cond_1e

    if-eqz v9, :cond_1d

    const-wide/16 v14, 0x1000

    goto :goto_14

    :cond_1d
    const-wide/16 v14, 0x800

    :goto_14
    or-long/2addr v2, v14

    :cond_1e
    const-wide/16 v14, 0x5

    and-long v16, v2, v14

    cmp-long v12, v16, v4

    if-eqz v12, :cond_20

    if-eqz v0, :cond_1f

    const-wide/16 v16, 0x100

    goto :goto_15

    :cond_1f
    const-wide/16 v16, 0x80

    :goto_15
    or-long v2, v2, v16

    :cond_20
    and-long v16, v2, v14

    cmp-long v12, v16, v4

    if-eqz v12, :cond_22

    if-eqz v7, :cond_21

    const-wide/16 v14, 0x10

    goto :goto_16

    :cond_21
    const-wide/16 v14, 0x8

    :goto_16
    or-long/2addr v2, v14

    :cond_22
    if-eqz v9, :cond_23

    const/4 v9, 0x0

    goto :goto_17

    :cond_23
    const/16 v9, 0x8

    :goto_17
    if-eqz v0, :cond_24

    const/4 v0, 0x0

    goto :goto_18

    :cond_24
    const/16 v0, 0x8

    :goto_18
    if-eqz v7, :cond_25

    const/4 v12, 0x0

    goto :goto_19

    :cond_25
    const/16 v12, 0x8

    :goto_19
    move-object v14, v6

    move v15, v9

    const-wide/16 v6, 0x5

    goto :goto_1a

    :cond_26
    const/4 v0, 0x0

    const-wide/16 v6, 0x5

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_1a
    and-long/2addr v6, v2

    cmp-long v9, v6, v4

    if-eqz v9, :cond_27

    .line 24
    iget-object v6, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->u:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v6, v15}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 25
    iget-object v6, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->v:Landroid/widget/ImageView;

    move/from16 v7, v28

    invoke-virtual {v6, v7}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 26
    iget-object v6, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->w:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v6, v0}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 27
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->x:Landroidx/constraintlayout/widget/Group;

    invoke-virtual {v0, v11}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 28
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setVisibility(I)V

    .line 29
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->b:Landroid/widget/TextView;

    move-object/from16 v6, v33

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 30
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->d:Landroid/widget/TextView;

    move-object/from16 v6, v31

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 31
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->e:Landroid/widget/TextView;

    move-object/from16 v6, v30

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 32
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->i:Landroid/widget/TextView;

    invoke-static {v0, v10}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 33
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->j:Landroid/widget/TextView;

    move-object/from16 v6, v27

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 34
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->k:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 35
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->k:Landroid/widget/TextView;

    invoke-static {v0, v14}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 36
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->l:Landroid/widget/TextView;

    invoke-static {v0, v13}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 37
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->m:Landroid/widget/TextView;

    move-object/from16 v6, v29

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 38
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->n:Landroid/widget/TextView;

    move-object/from16 v6, v32

    invoke-static {v0, v6}, Landroidx/databinding/adapters/TextViewBindingAdapter;->setText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    :cond_27
    const-wide/16 v6, 0x4

    and-long/2addr v2, v6

    cmp-long v0, v2, v4

    if-eqz v0, :cond_28

    .line 39
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->v:Landroid/widget/ImageView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->A:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 40
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->c:Landroid/widget/TextView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->z:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    iget-object v0, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->k:Landroid/widget/TextView;

    iget-object v2, v1, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->y:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_28
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
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->s:Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

    const-wide/16 v2, 0x2

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

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
    iput-object p1, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBinding;->r:Lcom/join/kotlin/discount/model/bean/CouponItemBean;

    .line 2
    monitor-enter p0

    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

    const-wide/16 v2, 0x1

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

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
    iget-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

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
    iput-wide v0, p0, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->B:J

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

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->h(Lcom/join/kotlin/discount/model/bean/CouponItemBean;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x7

    if-ne v0, p1, :cond_1

    .line 2
    check-cast p2, Lcom/join/kotlin/discount/proxy/CouponListClickProxy;

    invoke-virtual {p0, p2}, Lcom/join/android/app/mgsim/wufun/databinding/ItemCouponBindingImpl;->g(Lcom/join/kotlin/discount/proxy/CouponListClickProxy;)V

    :goto_0
    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method
