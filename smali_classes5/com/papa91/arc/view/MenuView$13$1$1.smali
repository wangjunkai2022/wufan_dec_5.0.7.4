.class Lcom/papa91/arc/view/MenuView$13$1$1;
.super Ljava/lang/Object;
.source "MenuView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/view/MenuView$13$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/papa91/arc/view/MenuView$13$1;


# direct methods
.method constructor <init>(Lcom/papa91/arc/view/MenuView$13$1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/view/MenuView$13$1$1;->this$2:Lcom/papa91/arc/view/MenuView$13$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$13$1$1;->this$2:Lcom/papa91/arc/view/MenuView$13$1;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$13$1;->this$1:Lcom/papa91/arc/view/MenuView$13;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView$13;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->menuViewListener:Lcom/papa91/arc/view/MenuViewListener;

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Lcom/papa91/arc/view/MenuViewListener;->exitEndGame(Z)V

    :cond_0
    return-void
.end method
