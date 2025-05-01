.class public Lcom/aggmoread/sdk/z/a/r/h;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/r/h$a;
    }
.end annotation


# instance fields
.field a:Landroid/view/View;

.field b:Lcom/aggmoread/sdk/z/a/r/h$a;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/aggmoread/sdk/z/a/r/h$a;JJ)V
    .locals 0

    invoke-direct {p0, p3, p4, p5, p6}, Landroid/os/CountDownTimer;-><init>(JJ)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/r/h;->a:Landroid/view/View;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/r/h;->b:Lcom/aggmoread/sdk/z/a/r/h$a;

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/h;->b:Lcom/aggmoread/sdk/z/a/r/h$a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/r/h$a;->a()V

    return-void
.end method

.method public onTick(J)V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/h;->a:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8df3\u8fc7"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0x3e8

    div-long v2, p1, v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "s"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/r/h;->b:Lcom/aggmoread/sdk/z/a/r/h$a;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/r/h$a;->a(J)V

    :cond_1
    return-void
.end method
