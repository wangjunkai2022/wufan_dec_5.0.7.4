.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;
.super Ljava/lang/Object;
.source "GamedetialModleFiveFragemnt.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->z1(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->o:Lcom/google/android/material/appbar/AppBarLayout;

    if-nez v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v0, 0x2

    new-array v2, v0, [I

    .line 3
    iget-object v3, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v3, v3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

    invoke-virtual {v3, v2}, Landroid/widget/HorizontalScrollView;->getLocationInWindow([I)V

    .line 4
    iget-object v3, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$s;->b:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-object v4, v3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->H:Lcom/join/mgps/customview/CoordinatorLayout;

    iget-object v5, v3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->o:Lcom/google/android/material/appbar/AppBarLayout;

    iget-object v6, v3, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->j:Lcom/flyco/tablayout/SlidingTabLayout;

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

    :cond_1
    :goto_0
    return-void

    :array_0
    .array-data 4
        0x0
        0x0
    .end array-data
.end method
