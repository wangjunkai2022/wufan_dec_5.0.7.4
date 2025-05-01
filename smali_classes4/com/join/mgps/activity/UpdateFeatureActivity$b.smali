.class Lcom/join/mgps/activity/UpdateFeatureActivity$b;
.super Ljava/lang/Object;
.source "UpdateFeatureActivity.java"

# interfaces
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/UpdateFeatureActivity;->n0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/UpdateFeatureActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/UpdateFeatureActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 2

    .line 1
    iget-object p3, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {p3}, Lcom/join/mgps/activity/UpdateFeatureActivity;->h0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p3

    add-int/lit8 p3, p3, -0x2

    if-lt p1, p3, :cond_0

    float-to-double p1, p2

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    cmpl-double p3, p1, v0

    if-ltz p3, :cond_0

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/UpdateFeatureActivity;->finish()V

    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->h0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/UpdateFeatureActivity;->j0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    const/4 v2, 0x0

    .line 3
    :goto_0
    iget-object v3, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v3}, Lcom/join/mgps/activity/UpdateFeatureActivity;->j0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 4
    iget-object v3, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v3}, Lcom/join/mgps/activity/UpdateFeatureActivity;->j0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v3

    iget-object v4, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v4}, Lcom/join/mgps/activity/UpdateFeatureActivity;->j0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    rem-int v4, p1, v4

    if-ne v2, v4, :cond_1

    const/4 v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-interface {v3, v2, v4}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v3, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v3}, Lcom/join/mgps/activity/UpdateFeatureActivity;->k0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Lcom/join/mgps/activity/UpdateFeatureActivity$c;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {v3}, Lcom/join/mgps/activity/UpdateFeatureActivity;->k0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Lcom/join/mgps/activity/UpdateFeatureActivity$c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 6
    :cond_3
    iget-object p1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/UpdateFeatureActivity;->l0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Landroid/os/Handler;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 7
    iget-object p1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/UpdateFeatureActivity;->l0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 8
    iget-object p1, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/UpdateFeatureActivity;->l0(Lcom/join/mgps/activity/UpdateFeatureActivity;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/activity/UpdateFeatureActivity$b;->b:Lcom/join/mgps/activity/UpdateFeatureActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/UpdateFeatureActivity;->k:Ljava/lang/Runnable;

    const-wide/16 v1, 0xbb8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_4
    return-void
.end method
