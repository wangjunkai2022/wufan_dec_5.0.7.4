.class Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;
.super Ljava/lang/Object;
.source "SimulatorIntroductionFragment.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->aftervidew()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->W(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->W(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->X(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/BbsTagListBean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/BbsTagListBean;->setSelected(Z)V

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->a0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->X(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v0, p1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->Z(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;I)I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->W(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->X(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/BbsTagListBean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/BbsTagListBean;->setSelected(Z)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->a0(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)Lcom/join/mgps/fragment/SimulatorIntroductionFragment$c;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    invoke-static {v1}, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->X(Lcom/join/mgps/fragment/SimulatorIntroductionFragment;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment$b;->b:Lcom/join/mgps/fragment/SimulatorIntroductionFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/SimulatorIntroductionFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    :cond_0
    return-void
.end method
