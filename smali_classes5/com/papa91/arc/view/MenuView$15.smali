.class Lcom/papa91/arc/view/MenuView$15;
.super Landroid/os/CountDownTimer;
.source "MenuView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/view/MenuView;->showQuestAndTime()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/view/MenuView;

.field final synthetic val$endGameTime:I


# direct methods
.method constructor <init>(Lcom/papa91/arc/view/MenuView;JJI)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/view/MenuView$15;->this$0:Lcom/papa91/arc/view/MenuView;

    iput p6, p0, Lcom/papa91/arc/view/MenuView$15;->val$endGameTime:I

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/papa91/arc/view/MenuView$15;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object v0, v0, Lcom/papa91/arc/view/MenuView;->llQuest:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2
    invoke-virtual {p0}, Landroid/os/CountDownTimer;->cancel()V

    return-void
.end method

.method public onTick(J)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$15;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->menuViewListener:Lcom/papa91/arc/view/MenuViewListener;

    invoke-interface {p1}, Lcom/papa91/arc/view/MenuViewListener;->getGamePlayTime()I

    move-result p1

    .line 2
    iget p2, p0, Lcom/papa91/arc/view/MenuView$15;->val$endGameTime:I

    div-int/lit16 p1, p1, 0x3e8

    sub-int/2addr p2, p1

    .line 3
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$15;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->tvTime:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5269\u4f59\u65f6\u95f4\uff1a"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "\u79d2"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-gtz p2, :cond_0

    .line 4
    invoke-virtual {p0}, Lcom/papa91/arc/view/MenuView$15;->onFinish()V

    :cond_0
    return-void
.end method
