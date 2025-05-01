.class Lcom/join/mgps/activity/GamedetialModleBtFragemnt$p;
.super Ljava/lang/Object;
.source "GamedetialModleBtFragemnt.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->o1(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->p:Lcom/google/android/material/appbar/AppBarLayout;

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v1

    if-eqz v1, :cond_0

    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 2
    iget-object v3, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object v3, v3, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v3, v2}, Landroid/widget/HorizontalScrollView;->getLocationInWindow([I)V

    .line 3
    iget-object v3, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$p;->b:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object v4, v3, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->G:Lcom/join/mgps/customview/CoordinatorLayout;

    iget-object v5, v3, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->p:Lcom/google/android/material/appbar/AppBarLayout;

    iget-object v6, v3, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    const/4 v7, 0x0

    const/4 v3, 0x1

    aget v8, v2, v3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const/4 v9, 0x0

    move-object v2, v4

    move-object v3, v5

    move-object v4, v6

    move v5, v7

    move v6, v8

    move-object v7, v0

    move v8, v9

    invoke-virtual/range {v1 .. v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;->onNestedPreScroll(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;II[II)V

    :cond_0
    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method
