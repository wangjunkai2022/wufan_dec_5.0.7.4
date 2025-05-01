.class Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;
.super Ljava/lang/Object;
.source "GamedetialModleBtFragemnt.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->P0(Lcom/join/mgps/dto/GamedetialModleFourBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/widget/RelativeLayout$LayoutParams;

.field final synthetic c:Landroid/widget/RelativeLayout$LayoutParams;

.field final synthetic d:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GamedetialModleBtFragemnt;Landroid/widget/RelativeLayout$LayoutParams;Landroid/widget/RelativeLayout$LayoutParams;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->d:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iput-object p2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->b:Landroid/widget/RelativeLayout$LayoutParams;

    iput-object p3, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->c:Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->d:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget-object v1, v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->U:Landroid/widget/RelativeLayout;

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getMeasuredHeight()I

    move-result v1

    int-to-float v1, v1

    iget-object v2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->d:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0712a5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    add-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->G1:I

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->b:Landroid/widget/RelativeLayout$LayoutParams;

    iget-object v1, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->d:Lcom/join/mgps/activity/GamedetialModleBtFragemnt;

    iget v2, v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->G1:I

    iput v2, v0, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 4
    iget-object v2, p0, Lcom/join/mgps/activity/GamedetialModleBtFragemnt$l;->c:Landroid/widget/RelativeLayout$LayoutParams;

    const/4 v3, -0x1

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 5
    iget-object v1, v1, Lcom/join/mgps/activity/GamedetialModleBtFragemnt;->n:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method
