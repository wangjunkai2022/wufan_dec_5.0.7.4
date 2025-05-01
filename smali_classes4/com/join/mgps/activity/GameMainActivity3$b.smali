.class Lcom/join/mgps/activity/GameMainActivity3$b;
.super Lcom/join/mgps/ad/x;
.source "GameMainActivity3.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GameMainActivity3;->S1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic s:Lcom/join/mgps/activity/GameMainActivity3;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GameMainActivity3;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GameMainActivity3$b;->s:Lcom/join/mgps/activity/GameMainActivity3;

    invoke-direct {p0, p2, p3, p4}, Lcom/join/mgps/ad/x;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/ad/d;->a(Ljava/lang/String;II)V

    .line 2
    sget-object p2, Lcom/papa/sim/statistic/Event;->Emu_ExitAd_Close:Lcom/papa/sim/statistic/Event;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2, p1}, Lcom/join/mgps/ad/d;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/d;->b(Z)V

    return-void
.end method

.method public onADClick()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADClick()V

    .line 2
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/MApplication;->G(Z)V

    .line 3
    sget-object v0, Lcom/papa/sim/statistic/Event;->Emu_ExitAd_Click:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/join/mgps/ad/d;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onADShow()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onADShow()V

    .line 2
    sget-object v0, Lcom/papa/sim/statistic/Event;->Emu_ExitAd_Pop:Lcom/papa/sim/statistic/Event;

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

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/join/mgps/ad/x;->h(Z)V

    return-void
.end method

.method public onVideoCached()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/d;->onVideoCached()V

    return-void
.end method
