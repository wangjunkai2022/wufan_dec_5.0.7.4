.class public Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;
.super Landroidx/fragment/app/Fragment;
.source "SimulatorGoldFingerFragment.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$b;
    }
.end annotation

.annotation build Lorg/androidannotations/annotations/EFragment;
    value = 0x7f0c029c
.end annotation


# instance fields
.field b:Landroidx/recyclerview/widget/RecyclerView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field c:Landroid/widget/LinearLayout;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field d:Landroidx/core/widget/NestedScrollView;
    .annotation build Lorg/androidannotations/annotations/ViewById;
    .end annotation
.end field

.field e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    return-void
.end method


# virtual methods
.method V()V
    .locals 5
    .annotation build Lorg/androidannotations/annotations/AfterViews;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "contents"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->e:Ljava/util/ArrayList;

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->e:Ljava/util/ArrayList;

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    .line 4
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->d:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_1

    .line 7
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->d:Landroidx/core/widget/NestedScrollView;

    invoke-virtual {v0, v2}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 8
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->c:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 9
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :goto_1
    new-instance v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v0}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    .line 11
    iput v2, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 12
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x7f07148d

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->b:I

    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v4, 0x7f0711f4

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    .line 14
    new-instance v1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;

    invoke-direct {v1}, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;-><init>()V

    .line 15
    iput v2, v1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;->f:I

    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->a:I

    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v2

    float-to-int v2, v2

    iput v2, v1, Lcom/join/mgps/base/decoration/UniversalItemDecoration$b;->d:I

    .line 18
    iget-object v2, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;

    invoke-direct {v3, p0, v0, v1}, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$a;-><init>(Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;Lcom/join/mgps/base/decoration/UniversalItemDecoration$a;)V

    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    .line 19
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 20
    iget-object v0, p0, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;->b:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$b;

    invoke-direct {v1, p0}, Lcom/join/mgps/fragment/SimulatorGoldFingerFragment$b;-><init>(Lcom/join/mgps/fragment/SimulatorGoldFingerFragment;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method
