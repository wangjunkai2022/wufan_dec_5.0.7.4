.class public abstract Lcom/join/mgps/ad/d;
.super Lcom/join/mgps/ad/t;
.source "BaseRewardVideo.java"


# static fields
.field protected static l:Z


# instance fields
.field protected a:Landroid/content/Context;

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Ljava/lang/String;

.field protected e:Landroid/app/Activity;

.field protected f:Ljava/lang/String;

.field protected g:I

.field protected h:I

.field protected i:J

.field protected j:Z

.field protected k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/join/android/app/common/http/c;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/join/mgps/ad/d;->l:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/join/mgps/ad/t;-><init>()V

    const-wide/16 v0, 0x0

    .line 2
    iput-wide v0, p0, Lcom/join/mgps/ad/d;->i:J

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/join/mgps/ad/d;->j:Z

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "RewardVideo"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/join/mgps/ad/d;->d:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    .line 6
    iput-object p3, p0, Lcom/join/mgps/ad/d;->b:Ljava/lang/String;

    .line 7
    iput-object p4, p0, Lcom/join/mgps/ad/d;->c:Ljava/lang/String;

    return-void
.end method

.method public static i(Landroid/content/Context;I)V
    .locals 2

    if-eqz p0, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    .line 1
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/MApplication;->G(Z)V

    .line 2
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.emu.ad.result"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "adAction"

    .line 4
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method

.method public static j(Landroid/content/Context;ILjava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_0

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.emu.ad.result"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "adAction"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 4
    invoke-static {p2}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "extras"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method public static k(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 1
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "com.join.android.app.mgsim.wufun.ad.result"

    .line 2
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "adAction"

    .line 3
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "gameId"

    .line 4
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5
    invoke-virtual {p0, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, Lcom/join/mgps/ad/t;->a(Ljava/lang/String;II)V

    return-void
.end method

.method public b(Z)V
    .locals 6

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/t;->b(Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/ad/d;->e:Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    sget-object v0, Lcom/MApplication;->x:Lcom/MApplication;

    invoke-virtual {v0}, Lcom/MApplication;->getActivity()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Lcom/join/mgps/ad/d;->e:Landroid/app/Activity;

    :cond_1
    if-eqz p1, :cond_2

    .line 4
    iget-object p1, p0, Lcom/join/mgps/ad/d;->e:Landroid/app/Activity;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    move-result p1

    if-nez p1, :cond_2

    .line 5
    iget-object v1, p0, Lcom/join/mgps/ad/d;->e:Landroid/app/Activity;

    iget-object v2, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    iget v3, p0, Lcom/join/mgps/ad/d;->g:I

    iget v4, p0, Lcom/join/mgps/ad/d;->h:I

    iget-object v5, p0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/ad/d;->t(Landroid/app/Activity;Ljava/lang/String;IILjava/util/Map;)V

    :cond_2
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/t;->c(Ljava/lang/String;)V

    return-void
.end method

.method public d(Ljava/lang/String;IILjava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/join/mgps/ad/t;->d(Ljava/lang/String;IILjava/util/Map;)V

    return-void
.end method

.method public abstract e()V
.end method

.method protected f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0}, Lcom/join/mgps/ad/d;->h(Z)V

    return-void
.end method

.method public abstract h(Z)V
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.join.android.app.mgsim.wufun.broadcast.emu.commonpoint"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "eventName"

    .line 2
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "gameId"

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    iget-object p1, p0, Lcom/join/mgps/ad/d;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method

.method public m(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    return-void
.end method

.method public n(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    return-void
.end method

.method public o(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/ad/d;->g:I

    return-void
.end method

.method public onADClick()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onADClick()V

    return-void
.end method

.method public onADClose()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onADClose()V

    return-void
.end method

.method public onADExpose()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onADExpose()V

    return-void
.end method

.method public onADShow()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onADShow()V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1, p2}, Lcom/join/mgps/ad/t;->onError(ILjava/lang/String;)V

    .line 2
    sget-boolean p1, Lcom/join/mgps/ad/d;->l:Z

    if-eqz p1, :cond_0

    .line 3
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onError:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public onInitSuccess()V
    .locals 2

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onInitSuccess()V

    .line 2
    sget-boolean v0, Lcom/join/mgps/ad/d;->l:Z

    if-eqz v0, :cond_0

    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onInitSuccess appID:["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/ad/d;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "],posID:["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/ad/d;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public onReward(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/join/mgps/ad/t;->onReward(Ljava/util/Map;)V

    return-void
.end method

.method public onVideoCached()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onVideoCached()V

    return-void
.end method

.method public onVideoComplete()V
    .locals 0

    .line 1
    invoke-super {p0}, Lcom/join/mgps/ad/t;->onVideoComplete()V

    return-void
.end method

.method public p(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/join/mgps/ad/d;->h:I

    return-void
.end method

.method public q(Landroid/app/Activity;)V
    .locals 1

    const-string v0, ""

    .line 1
    invoke-virtual {p0, p1, v0}, Lcom/join/mgps/ad/d;->r(Landroid/app/Activity;Ljava/lang/String;)V

    return-void
.end method

.method public r(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, p2, v0, v0}, Lcom/join/mgps/ad/d;->s(Landroid/app/Activity;Ljava/lang/String;II)V

    return-void
.end method

.method public s(Landroid/app/Activity;Ljava/lang/String;II)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    .line 1
    invoke-virtual/range {v0 .. v5}, Lcom/join/mgps/ad/d;->t(Landroid/app/Activity;Ljava/lang/String;IILjava/util/Map;)V

    return-void
.end method

.method public t(Landroid/app/Activity;Ljava/lang/String;IILjava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/lang/String;",
            "II",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p2, p0, Lcom/join/mgps/ad/d;->f:Ljava/lang/String;

    .line 2
    iput p4, p0, Lcom/join/mgps/ad/d;->h:I

    .line 3
    iput p3, p0, Lcom/join/mgps/ad/d;->g:I

    .line 4
    iput-object p5, p0, Lcom/join/mgps/ad/d;->k:Ljava/util/Map;

    .line 5
    iput-object p1, p0, Lcom/join/mgps/ad/d;->e:Landroid/app/Activity;

    .line 6
    invoke-static {p1}, Lcom/join/android/app/common/utils/j;->j(Landroid/content/Context;)Z

    move-result p2

    const/4 p3, -0x1

    if-eqz p2, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/join/mgps/ad/d;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 8
    iget-object p1, p0, Lcom/join/mgps/ad/d;->e:Landroid/app/Activity;

    invoke-virtual {p0, p1}, Lcom/join/mgps/ad/d;->u(Landroid/app/Activity;)V

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iget-wide p4, p0, Lcom/join/mgps/ad/d;->i:J

    sub-long/2addr p1, p4

    invoke-static {p1, p2}, Ljava/lang/Math;->abs(J)J

    move-result-wide p1

    const-wide/16 p4, 0x7d0

    cmp-long v0, p1, p4

    if-gez v0, :cond_1

    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/join/mgps/ad/d;->i:J

    const-string p1, "\u89c6\u9891\u52a0\u8f7d\u4e2d,\u8bf7\u7a0d\u5019..."

    .line 11
    invoke-virtual {p0, p3, p1}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    return-void

    .line 12
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Lcom/join/mgps/ad/d;->i:J

    const/4 p1, 0x1

    .line 13
    invoke-virtual {p0, p1}, Lcom/join/mgps/ad/d;->h(Z)V

    goto :goto_0

    .line 14
    :cond_2
    invoke-static {p1}, Lcom/join/mgps/Util/l2;->a(Landroid/content/Context;)Lcom/join/mgps/Util/l2;

    move-result-object p1

    const-string p2, "\u7f51\u7edc\u5f02\u5e38\uff0c\u8bf7\u8054\u7f51\u91cd\u8bd5"

    invoke-virtual {p1, p2}, Lcom/join/mgps/Util/l2;->b(Ljava/lang/String;)V

    .line 15
    invoke-virtual {p0, p3, p2}, Lcom/join/mgps/ad/d;->onError(ILjava/lang/String;)V

    :goto_0
    return-void
.end method

.method protected u(Landroid/app/Activity;)V
    .locals 0

    return-void
.end method
