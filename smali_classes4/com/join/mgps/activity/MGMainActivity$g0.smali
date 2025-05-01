.class Lcom/join/mgps/activity/MGMainActivity$g0;
.super Lcom/join/mgps/ad/l;
.source "MGMainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MGMainActivity;->initGrMPspAd(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Z

.field final synthetic t:Lcom/join/mgps/activity/MGMainActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MGMainActivity;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MGMainActivity$g0;->t:Lcom/join/mgps/activity/MGMainActivity;

    iput-boolean p5, p0, Lcom/join/mgps/activity/MGMainActivity$g0;->s:Z

    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/l;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onADClose()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADClose()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$g0;->t:Lcom/join/mgps/activity/MGMainActivity;

    iget-object v1, v0, Lcom/join/mgps/activity/MGMainActivity;->groPspAd:Lcom/join/mgps/ad/l;

    const/16 v1, 0x12

    invoke-static {v0, v1}, Lcom/join/mgps/ad/d;->i(Landroid/content/Context;I)V

    return-void
.end method

.method public onADShow()V
    .locals 3

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADShow()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MGMainActivity$g0;->t:Lcom/join/mgps/activity/MGMainActivity;

    const/4 v1, 0x2

    const/4 v2, 0x7

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/MGMainActivity;->sendVideoAdWatchLog(II)V

    .line 3
    sget-object v0, Lcom/papa/sim/statistic/Event;->Stopad_GromoreSdk_VideoShow:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/ad/d;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onInitSuccess()V
    .locals 1

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onInitSuccess()V

    .line 2
    iget-boolean v0, p0, Lcom/join/mgps/activity/MGMainActivity$g0;->s:Z

    invoke-virtual {p0, v0}, Lcom/join/mgps/ad/l;->h(Z)V

    return-void
.end method

.method public y()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/l;->y()V

    .line 2
    sget-object v0, Lcom/papa/sim/statistic/Event;->Stopad_GromoreSdk_Videoloading:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/ad/d;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
