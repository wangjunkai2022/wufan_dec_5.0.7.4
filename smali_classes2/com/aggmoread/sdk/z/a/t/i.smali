.class public Lcom/aggmoread/sdk/z/a/t/i;
.super Landroid/os/CountDownTimer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/aggmoread/sdk/z/a/t/i$a;
    }
.end annotation


# instance fields
.field a:Landroid/widget/TextView;

.field b:Lcom/aggmoread/sdk/z/a/t/i$a;


# direct methods
.method public constructor <init>(Lcom/aggmoread/sdk/z/a/t/i$a;JJ)V
    .locals 0

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/t/i;->b:Lcom/aggmoread/sdk/z/a/t/i$a;

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/i;->b:Lcom/aggmoread/sdk/z/a/t/i$a;

    invoke-interface {v0}, Lcom/aggmoread/sdk/z/a/t/i$a;->a()V

    return-void
.end method

.method public onTick(J)V
    .locals 4

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/i;->b:Lcom/aggmoread/sdk/z/a/t/i$a;

    invoke-interface {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/t/i$a;->a(J)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/t/i;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u8df3\u8fc7("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0x3e8

    div-long/2addr p1, v2

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method
