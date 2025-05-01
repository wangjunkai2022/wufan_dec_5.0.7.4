.class Lcom/join/mgps/activity/EndGameActivity$b;
.super Ljava/lang/Object;
.source "EndGameActivity.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameActivity;->afterviews()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/EndGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {p1}, Lcom/join/mgps/activity/EndGameActivity;->i0(Lcom/join/mgps/activity/EndGameActivity;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/EndGameActivity;->y0()V

    :cond_0
    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 2
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->j0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_2

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->j0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameNameListBean;

    if-ne p2, p3, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameNameListBean;->setSelected(Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 4
    :cond_2
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/EndGameActivity;->k0(Lcom/join/mgps/activity/EndGameActivity;)Lcom/join/mgps/activity/EndGameActivity$i;

    move-result-object p2

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameActivity;->j0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/join/mgps/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 5
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {p2}, Lcom/join/mgps/activity/EndGameActivity;->j0(Lcom/join/mgps/activity/EndGameActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-static {p2, v0}, Lcom/join/mgps/activity/EndGameActivity;->m0(Lcom/join/mgps/activity/EndGameActivity;Lcom/join/mgps/dto/EndGameNameListBean;)Lcom/join/mgps/dto/EndGameNameListBean;

    .line 6
    iget-object p2, p0, Lcom/join/mgps/activity/EndGameActivity$b;->a:Lcom/join/mgps/activity/EndGameActivity;

    iget-object p2, p2, Lcom/join/mgps/activity/EndGameActivity;->d:Landroidx/viewpager2/widget/ViewPager2;

    if-eqz p2, :cond_3

    invoke-virtual {p2, p3, p1}, Landroidx/viewpager2/widget/ViewPager2;->setCurrentItem(IZ)V

    :cond_3
    return-void
.end method
