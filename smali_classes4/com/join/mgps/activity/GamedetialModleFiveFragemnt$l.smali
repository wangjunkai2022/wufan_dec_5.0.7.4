.class Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;
.super Ljava/lang/Object;
.source "GamedetialModleFiveFragemnt.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->Z0(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:I

.field final synthetic e:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;III)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->e:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iput p2, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->b:I

    iput p3, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->c:I

    iput p4, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->e:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget-boolean v1, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->I1:Z

    if-eqz v1, :cond_0

    iget v1, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->J1:I

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 2
    :goto_0
    iget v2, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->b:I

    iget v3, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->c:I

    add-int/2addr v2, v3

    iget v3, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->d:I

    add-int/2addr v2, v3

    invoke-static {v0}, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->k0(Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;)I

    move-result v0

    add-int/2addr v2, v0

    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt$l;->e:Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;

    iget v3, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->K1:I

    sub-int/2addr v2, v3

    add-int/2addr v2, v1

    if-lez v2, :cond_1

    .line 3
    iget-object v0, v0, Lcom/join/mgps/activity/GamedetialModleFiveFragemnt;->o:Lcom/google/android/material/appbar/AppBarLayout;

    if-eqz v0, :cond_1

    .line 4
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;

    invoke-virtual {v0}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$LayoutParams;->getBehavior()Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;

    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    if-eqz v1, :cond_1

    .line 6
    check-cast v0, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    neg-int v1, v2

    .line 7
    invoke-virtual {v0, v1}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;->setTopAndBottomOffset(I)Z

    :cond_1
    return-void
.end method
