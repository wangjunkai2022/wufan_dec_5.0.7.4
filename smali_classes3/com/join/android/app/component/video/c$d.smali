.class Lcom/join/android/app/component/video/c$d;
.super Ljava/lang/Object;
.source "MyListViewVideoHelper.java"

# interfaces
.implements Lcom/join/android/app/component/video/StandardVideoView$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/android/app/component/video/c;->E(Landroid/content/Context;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/join/android/app/component/video/c;


# direct methods
.method constructor <init>(Lcom/join/android/app/component/video/c;Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/android/app/component/video/c$d;->b:Lcom/join/android/app/component/video/c;

    iput-object p2, p0, Lcom/join/android/app/component/video/c$d;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/join/android/app/component/video/StandardVideoView;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/join/android/app/component/video/c$d;->b:Lcom/join/android/app/component/video/c;

    iget-object v1, v0, Lcom/join/android/app/component/video/c;->f:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c;->A()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/android/app/component/video/c$l;

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Lcom/papa/gsyvideoplayer/video/base/GSYVideoView;->isInPlayingState()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Lcom/join/android/app/component/video/c$d;->b:Lcom/join/android/app/component/video/c;

    const/4 v2, 0x1

    iput-boolean v2, v1, Lcom/join/android/app/component/video/c;->e:Z

    .line 4
    invoke-static {p1}, Lcom/join/android/app/component/video/i;->f(Lcom/join/android/app/component/video/StandardVideoView;)V

    .line 5
    invoke-virtual {p1}, Lcom/join/android/app/component/video/StandardVideoView;->getGSYVideoManager()Lcom/papa/gsyvideoplayer/video/base/a;

    move-result-object v1

    invoke-interface {v1, p1}, Lcom/papa/gsyvideoplayer/video/base/a;->A(Ls2/a;)V

    .line 6
    iget-object p1, p0, Lcom/join/android/app/component/video/c$d;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/EndGameDetailActivity_;->C0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->a(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->d(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {p1, v2}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->c(Z)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    goto :goto_0

    .line 7
    :cond_1
    iget-object p1, p0, Lcom/join/android/app/component/video/c$d;->a:Landroid/content/Context;

    invoke-static {p1}, Lcom/join/mgps/activity/EndGameDetailActivity_;->C0(Landroid/content/Context;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->b(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->a(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/join/mgps/activity/EndGameDetailActivity_$o;->d(Ljava/lang/String;)Lcom/join/mgps/activity/EndGameDetailActivity_$o;

    move-result-object p1

    invoke-virtual {p1}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    .line 8
    :goto_0
    new-instance p1, Lcom/papa/sim/statistic/Ext;

    invoke-direct {p1}, Lcom/papa/sim/statistic/Ext;-><init>()V

    .line 9
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/papa/sim/statistic/Ext;->setEndId(Ljava/lang/String;)V

    .line 10
    new-instance v1, Lcom/papa/sim/statistic/Data;

    invoke-direct {v1}, Lcom/papa/sim/statistic/Data;-><init>()V

    .line 11
    invoke-virtual {v0}, Lcom/join/android/app/component/video/c$l;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/papa/sim/statistic/Data;->setGameId(J)Lcom/papa/sim/statistic/Data;

    .line 12
    iget-object v0, p0, Lcom/join/android/app/component/video/c$d;->b:Lcom/join/android/app/component/video/c;

    invoke-static {v0}, Lcom/join/android/app/component/video/c;->c(Lcom/join/android/app/component/video/c;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/papa/sim/statistic/p;->l(Landroid/content/Context;)Lcom/papa/sim/statistic/p;

    move-result-object v0

    sget-object v2, Lcom/papa/sim/statistic/Event;->clickEndGameDetail:Lcom/papa/sim/statistic/Event;

    invoke-virtual {v0, v2, p1, v1}, Lcom/papa/sim/statistic/p;->i0(Lcom/papa/sim/statistic/Event;Lcom/papa/sim/statistic/Ext;Lcom/papa/sim/statistic/Data;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 13
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_1
    return-void
.end method
