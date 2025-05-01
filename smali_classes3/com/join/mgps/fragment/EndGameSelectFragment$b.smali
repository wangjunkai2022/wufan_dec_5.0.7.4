.class Lcom/join/mgps/fragment/EndGameSelectFragment$b;
.super Ljava/lang/Object;
.source "EndGameSelectFragment.java"

# interfaces
.implements Lcom/join/mgps/base/BaseQuickAdapter$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/EndGameSelectFragment;->a0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/fragment/EndGameSelectFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/EndGameSelectFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Lcom/join/mgps/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 2

    const/4 p1, 0x0

    const/4 p2, 0x0

    .line 1
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->X(Lcom/join/mgps/fragment/EndGameSelectFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {v0}, Lcom/join/mgps/fragment/EndGameSelectFragment;->X(Lcom/join/mgps/fragment/EndGameSelectFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/EndGameNameListBean;

    if-ne p2, p3, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/EndGameNameListBean;->setSelected(Z)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {p1}, Lcom/join/mgps/fragment/EndGameSelectFragment;->Z(Lcom/join/mgps/fragment/EndGameSelectFragment;)Lcom/join/mgps/fragment/EndGameSelectFragment$c;

    move-result-object p1

    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameSelectFragment;->X(Lcom/join/mgps/fragment/EndGameSelectFragment;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/base/BaseQuickAdapter;->setNewData(Ljava/util/List;)V

    .line 4
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of p1, p1, Lcom/join/mgps/activity/EndGameActivity_;

    if-eqz p1, :cond_2

    .line 5
    iget-object p1, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    check-cast p1, Lcom/join/mgps/activity/EndGameActivity_;

    iget-object p2, p0, Lcom/join/mgps/fragment/EndGameSelectFragment$b;->a:Lcom/join/mgps/fragment/EndGameSelectFragment;

    invoke-static {p2}, Lcom/join/mgps/fragment/EndGameSelectFragment;->X(Lcom/join/mgps/fragment/EndGameSelectFragment;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/join/mgps/dto/EndGameNameListBean;

    invoke-virtual {p2}, Lcom/join/mgps/dto/EndGameNameListBean;->getGameId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/join/mgps/activity/EndGameActivity;->s0(Ljava/lang/String;)V

    :cond_2
    return-void
.end method
