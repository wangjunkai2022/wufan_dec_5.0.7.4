.class Lcom/papa91/arc/view/MenuView$12$1;
.super Ljava/lang/Object;
.source "MenuView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/view/MenuView$12;->onAnimationEnd(Landroid/animation/Animator;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/papa91/arc/view/MenuView$12;


# direct methods
.method constructor <init>(Lcom/papa91/arc/view/MenuView$12;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView;->tvCloseTips:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/view/MenuView$12$1;->this$1:Lcom/papa91/arc/view/MenuView$12;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView;->clSuccess:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v1, Lcom/papa91/arc/view/MenuView$12$1$1;

    invoke-direct {v1, p0}, Lcom/papa91/arc/view/MenuView$12$1$1;-><init>(Lcom/papa91/arc/view/MenuView$12$1;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
