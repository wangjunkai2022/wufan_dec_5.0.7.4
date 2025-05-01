.class Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;
.super Landroid/os/CountDownTimer;
.source "OnlineGameInstallCheckActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->m0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;JJ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;->a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-direct {p0, p2, p3, p4, p5}, Landroid/os/CountDownTimer;-><init>(JJ)V

    return-void
.end method


# virtual methods
.method public onFinish()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;->a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g:Landroid/widget/TextView;

    const-string v1, "\u7acb\u5373\u5b89\u88c5"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;->a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->l0(Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;)V

    return-void
.end method

.method public onTick(J)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity$b;->a:Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/OnlineGameInstallCheckActivity;->g:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\u7acb\u5373\u5b89\u88c5 "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide/16 v2, 0x3e8

    div-long/2addr p1, v2

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, "\u79d2"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
