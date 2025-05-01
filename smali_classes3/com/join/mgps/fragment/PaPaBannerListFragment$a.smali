.class Lcom/join/mgps/fragment/PaPaBannerListFragment$a;
.super Ljava/lang/Object;
.source "PaPaBannerListFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/PaPaBannerListFragment;->afterViews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/fragment/PaPaBannerListFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/PaPaBannerListFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->isActivityFinish()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->V(Lcom/join/mgps/fragment/PaPaBannerListFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->W(Lcom/join/mgps/fragment/PaPaBannerListFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/PaPaBannerListFragment;->f:Lcom/join/mgps/customview/XListView2;

    invoke-virtual {v0}, Lcom/join/mgps/customview/XListView2;->u()V

    .line 5
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    const v1, 0x7f100299

    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->showToast(Ljava/lang/String;)V

    return-void

    .line 6
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/fragment/PaPaBannerListFragment$a;->b:Lcom/join/mgps/fragment/PaPaBannerListFragment;

    invoke-virtual {v0}, Lcom/join/mgps/fragment/PaPaBannerListFragment;->Z()V

    :cond_2
    return-void
.end method
