.class Lcom/papa91/arc/view/MenuView$12$1$1;
.super Ljava/lang/Object;
.source "MenuView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/view/MenuView$12$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/papa91/arc/view/MenuView$12$1;


# direct methods
.method constructor <init>(Lcom/papa91/arc/view/MenuView$12$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/view/MenuView$12$1$1;->this$2:Lcom/papa91/arc/view/MenuView$12$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12$1$1;->this$2:Lcom/papa91/arc/view/MenuView$12$1;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object v0, p1, Lcom/papa91/arc/view/MenuView;->menuViewListener:Lcom/papa91/arc/view/MenuViewListener;

    if-eqz v0, :cond_2

    .line 2
    invoke-static {p1}, Lcom/papa91/arc/view/MenuView;->access$100(Lcom/papa91/arc/view/MenuView;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12$1$1;->this$2:Lcom/papa91/arc/view/MenuView$12$1;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->clReward:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12$1$1;->this$2:Lcom/papa91/arc/view/MenuView$12$1;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->menuViewListener:Lcom/papa91/arc/view/MenuViewListener;

    invoke-interface {p1}, Lcom/papa91/arc/view/MenuViewListener;->getPassRewardPoint()V

    goto :goto_1

    .line 4
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12$1$1;->this$2:Lcom/papa91/arc/view/MenuView$12$1;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->menuViewListener:Lcom/papa91/arc/view/MenuViewListener;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lcom/papa91/arc/view/MenuViewListener;->exitEndGame(Z)V

    :cond_2
    :goto_1
    return-void
.end method
