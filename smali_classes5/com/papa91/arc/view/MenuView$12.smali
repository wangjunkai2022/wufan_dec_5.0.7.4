.class Lcom/papa91/arc/view/MenuView$12;
.super Landroid/animation/AnimatorListenerAdapter;
.source "MenuView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/papa91/arc/view/MenuView;->showAnimationResult(ILcom/papa91/arc/bean/EndGameAllowBean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/papa91/arc/view/MenuView;

.field final synthetic val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

.field final synthetic val$mills:I


# direct methods
.method constructor <init>(Lcom/papa91/arc/view/MenuView;ILcom/papa91/arc/bean/EndGameAllowBean;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iput p2, p0, Lcom/papa91/arc/view/MenuView$12;->val$mills:I

    iput-object p3, p0, Lcom/papa91/arc/view/MenuView$12;->val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 2
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->tvTimeCost:Landroid/widget/TextView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 3
    iget p1, p0, Lcom/papa91/arc/view/MenuView$12;->val$mills:I

    int-to-float p1, p1

    const/high16 v1, 0x3f800000    # 1.0f

    mul-float p1, p1, v1

    const/high16 v1, 0x447a0000    # 1000.0f

    div-float/2addr p1, v1

    const/high16 v1, 0x42700000    # 60.0f

    cmpg-float v1, p1, v1

    if-gez v1, :cond_0

    .line 4
    new-instance v1, Ljava/text/DecimalFormat;

    const-string v2, "#0.00"

    invoke-direct {v1, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    float-to-double v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    goto :goto_0

    :cond_0
    float-to-int p1, p1

    .line 5
    div-int/lit8 v1, p1, 0x3c

    rem-int/lit8 p1, p1, 0x3c

    .line 6
    :goto_0
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->tvTimeCost:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/papa91/arc/view/MenuView$12;->val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {v1}, Lcom/papa91/arc/bean/EndGameAllowBean;->getElapsedTimeHint()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/EndGameAllowBean;->getAwardCards()I

    move-result p1

    if-lez p1, :cond_2

    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {p1}, Lcom/papa91/arc/bean/EndGameAllowBean;->getMultipleAwardCards()I

    move-result p1

    if-gtz p1, :cond_1

    goto :goto_1

    .line 8
    :cond_1
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->clReward:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    goto :goto_2

    .line 9
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->clReward:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 10
    :goto_2
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->tvRewardCount:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/papa91/arc/view/MenuView$12;->val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {v1}, Lcom/papa91/arc/bean/EndGameAllowBean;->getAwardCards()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11
    iget-object p1, p0, Lcom/papa91/arc/view/MenuView$12;->this$0:Lcom/papa91/arc/view/MenuView;

    iget-object p1, p1, Lcom/papa91/arc/view/MenuView;->tvRewardCountDouble:Landroid/widget/TextView;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/papa91/arc/view/MenuView$12;->val$bean:Lcom/papa91/arc/bean/EndGameAllowBean;

    invoke-virtual {v2}, Lcom/papa91/arc/bean/EndGameAllowBean;->getMultipleAwardCards()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/papa91/arc/view/MenuView$12$1;

    invoke-direct {v0, p0}, Lcom/papa91/arc/view/MenuView$12$1;-><init>(Lcom/papa91/arc/view/MenuView$12;)V

    const-wide/16 v1, 0x5dc

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
