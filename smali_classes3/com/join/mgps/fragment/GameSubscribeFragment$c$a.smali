.class Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;
.super Ljava/lang/Object;
.source "GameSubscribeFragment.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/fragment/GameSubscribeFragment$c;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/join/mgps/fragment/GameSubscribeFragment$c;


# direct methods
.method constructor <init>(Lcom/join/mgps/fragment/GameSubscribeFragment$c;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->c:Lcom/join/mgps/fragment/GameSubscribeFragment$c;

    iput p2, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->c:Lcom/join/mgps/fragment/GameSubscribeFragment$c;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameSubscribeFragment$c;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v0

    const-class v1, Lcom/join/mgps/activity/GameDetailActivity_;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->c:Lcom/join/mgps/fragment/GameSubscribeFragment$c;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameSubscribeFragment$c;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameSubscribeFragment;->p:Ljava/util/List;

    iget v1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "fromid"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->c:Lcom/join/mgps/fragment/GameSubscribeFragment$c;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameSubscribeFragment$c;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameSubscribeFragment;->p:Ljava/util/List;

    iget v1, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->b:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/GameFromPopoWinBean$DataBean;->getUid()I

    move-result v0

    const-string v1, "groupuid"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "_from"

    const/16 v1, 0x2b60

    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "gameid"

    const-string v1, "0"

    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "company_id"

    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 7
    iget-object v0, p0, Lcom/join/mgps/fragment/GameSubscribeFragment$c$a;->c:Lcom/join/mgps/fragment/GameSubscribeFragment$c;

    iget-object v0, v0, Lcom/join/mgps/fragment/GameSubscribeFragment$c;->b:Lcom/join/mgps/fragment/GameSubscribeFragment;

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    return-void
.end method
