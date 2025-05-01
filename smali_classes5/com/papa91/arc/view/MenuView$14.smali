.class Lcom/papa91/arc/view/MenuView$14;
.super Landroid/os/CountDownTimer;
.source "MenuView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/view/MenuView;->showEndGameCountdown()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/view/MenuView;


# direct methods
.method constructor <init>(Lcom/papa91/arc/view/MenuView;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView;->flCountDown:Landroid/widget/FrameLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setVisibility(I)V

    .line 2
    iget-object v0, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    invoke-virtual {v0}, Lcom/papa91/arc/view/MenuView;->showQuestAndTime()V

    .line 3
    iget-object v0, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView;->menuViewListener:Lcom/papa91/arc/view/MenuViewListener;

    if-eqz v0, :cond_0

    .line 4
    invoke-interface {v0}, Lcom/papa91/arc/view/MenuViewListener;->gameOnResume()V

    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 3

    const-wide/16 v0, 0x3e8

    .line 1
    div-long/2addr p1, v0

    const-wide/16 v0, 0x3

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->ivCountDown:Landroid/widget/ImageView;

    sget p2, Lorg/ppsspp/ppsspp/R$drawable;->count_down_3:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x2

    cmp-long v2, p1, v0

    if-nez v2, :cond_1

    .line 3
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->ivCountDown:Landroid/widget/ImageView;

    sget p2, Lorg/ppsspp/ppsspp/R$drawable;->count_down_2:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1

    cmp-long v2, p1, v0

    if-nez v2, :cond_2

    .line 4
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$14;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->ivCountDown:Landroid/widget/ImageView;

    sget p2, Lorg/ppsspp/ppsspp/R$drawable;->count_down_1:I

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_2
    :goto_0
    return-void
.end method
