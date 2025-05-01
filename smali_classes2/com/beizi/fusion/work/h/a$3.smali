.class Lcom/beizi/fusion/work/h/a$3;
.super Landroid/os/CountDownTimer;
.source "BaseUnifiedCustomWorker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/beizi/fusion/work/h/a;->a(III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lcom/beizi/fusion/work/h/a;


# direct methods
.method constructor <init>(Lcom/beizi/fusion/work/h/a;JJIII)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/fusion/work/h/a$3;->d:Lcom/beizi/fusion/work/h/a;

    iput p6, p0, Lcom/beizi/fusion/work/h/a$3;->a:I

    iput p7, p0, Lcom/beizi/fusion/work/h/a$3;->b:I

    iput p8, p0, Lcom/beizi/fusion/work/h/a$3;->c:I

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/beizi/fusion/work/h/a$3;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/beizi/fusion/work/h/a$3;->d:Lcom/beizi/fusion/work/h/a;

    invoke-virtual {v0}, Lcom/beizi/fusion/work/h/a;->aY()V

    :cond_0
    return-void
.end method

.method public onTick(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/fusion/work/h/a$3;->d:Lcom/beizi/fusion/work/h/a;

    iget-object v1, v0, Lcom/beizi/fusion/work/h/a;->C:Landroid/widget/TextView;

    if-eqz v1, :cond_1

    iget-object v0, v0, Lcom/beizi/fusion/work/h/a;->z:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    long-to-float p1, p1

    const/high16 p2, 0x447a0000    # 1000.0f

    div-float/2addr p1, p2

    float-to-int p1, p1

    .line 2
    iget p2, p0, Lcom/beizi/fusion/work/h/a$3;->a:I

    sub-int/2addr p2, p1

    iget v0, p0, Lcom/beizi/fusion/work/h/a$3;->b:I

    if-lt p2, v0, :cond_0

    const/16 p1, 0x8

    .line 3
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 4
    iget-object p1, p0, Lcom/beizi/fusion/work/h/a$3;->d:Lcom/beizi/fusion/work/h/a;

    iget-object p1, p1, Lcom/beizi/fusion/work/h/a;->z:Landroid/widget/ImageView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    :goto_0
    return-void
.end method
