.class Lcom/join/mgps/fragment/NewArenaMainFragment$m;
.super Ljava/lang/Object;
.source "NewArenaMainFragment.java"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/NewArenaMainFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/NewArenaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/NewArenaMainFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$m;->a:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$m;->a:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/h1;->b(Landroid/app/Activity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$m;->a:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/NewArenaMainFragment;->n:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout$LayoutParams;

    .line 3
    iget-object v1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$m;->a:Lcom/join/mgps/fragment/NewArenaMainFragment;

    invoke-virtual {v1}, Lcom/join/mgps/fragment/NewArenaMainFragment;->x0()F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 4
    iget-object v1, p0, Lcom/join/mgps/fragment/NewArenaMainFragment$m;->a:Lcom/join/mgps/fragment/NewArenaMainFragment;

    iget-object v1, v1, Lcom/join/mgps/fragment/NewArenaMainFragment;->n:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 5
    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->onApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method
