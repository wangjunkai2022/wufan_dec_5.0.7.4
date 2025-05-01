.class Lcom/join/mgps/activity/EndGameLaunchActivity$e;
.super Ljava/lang/Object;
.source "EndGameLaunchActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/join/mgps/activity/EndGameLaunchActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/EndGameLaunchActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameLaunchActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->q0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v0

    const/16 v1, 0x50

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->i0(Lcom/join/mgps/activity/EndGameLaunchActivity;I)I

    .line 3
    :cond_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->w0(I)V

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->g0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    move-result v0

    const/16 v1, 0x64

    if-ge v0, v1, :cond_3

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->q0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    const/4 v1, 0x5

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->l0(Lcom/join/mgps/activity/EndGameLaunchActivity;I)I

    goto :goto_0

    .line 7
    :cond_1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->j0(Lcom/join/mgps/activity/EndGameLaunchActivity;)I

    .line 8
    :goto_0
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->r0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1}, Landroid/os/Handler;-><init>()V

    invoke-static {v0, v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->s0(Lcom/join/mgps/activity/EndGameLaunchActivity;Landroid/os/Handler;)Landroid/os/Handler;

    .line 9
    :cond_2
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->t0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto/16 :goto_2

    .line 10
    :cond_3
    new-instance v0, Lcom/join/mgps/pref/PrefDef_;

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v1}, Lcom/join/mgps/activity/EndGameLaunchActivity;->f0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/join/mgps/pref/PrefDef_;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/join/mgps/pref/PrefDef_;->endGameConfig()Lorg/androidannotations/api/sharedpreferences/p;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/sharedpreferences/b;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 11
    invoke-static {}, Lcom/join/android/app/common/utils/JsonMapper;->getInstance()Lcom/join/android/app/common/utils/JsonMapper;

    move-result-object v1

    const-class v2, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v1, v0, v2}, Lcom/join/android/app/common/utils/JsonMapper;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    if-eqz v0, :cond_4

    .line 12
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getEndgame_challenge_level()Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 13
    invoke-virtual {v0}, Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;->getEndgame_challenge_level()Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lcom/join/android/app/common/utils/JsonMapper;->toJsonString(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v0, ""

    :goto_1
    move-object v10, v0

    .line 14
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->f0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/app/Activity;

    move-result-object v1

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/EndGameLaunchActivity;->f0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/join/mgps/Util/AccountUtil_;->getInstance_(Landroid/content/Context;)Lcom/join/mgps/Util/AccountUtil_;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/Util/b;->getUid()Ljava/lang/String;

    move-result-object v2

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    iget-object v3, v0, Lcom/join/mgps/activity/EndGameLaunchActivity;->e:Ljava/lang/String;

    const/16 v4, 0x10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v5}, Lcom/join/mgps/activity/EndGameLaunchActivity;->h0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v5, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-static {v5}, Lcom/join/mgps/activity/EndGameLaunchActivity;->k0(Lcom/join/mgps/activity/EndGameLaunchActivity;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getIndex()I

    move-result v6

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getDuration()I

    move-result v0

    div-int/lit16 v7, v0, 0x3e8

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getSubTitle()Ljava/lang/String;

    move-result-object v8

    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    iget-object v0, v0, Lcom/join/mgps/activity/EndGameLaunchActivity;->f:Lcom/join/mgps/dto/EndGameBean;

    invoke-virtual {v0}, Lcom/join/mgps/dto/EndGameBean;->getEndgameId()Ljava/lang/String;

    move-result-object v9

    invoke-static/range {v1 .. v10}, Lcom/join/mgps/Util/UtilsMy;->R3(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 15
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameLaunchActivity$e;->b:Lcom/join/mgps/activity/EndGameLaunchActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    :cond_5
    :goto_2
    return-void
.end method
