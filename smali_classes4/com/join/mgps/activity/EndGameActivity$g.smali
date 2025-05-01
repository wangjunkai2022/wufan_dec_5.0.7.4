.class Lcom/join/mgps/activity/EndGameActivity$g;
.super Lcom/papa91/arc/interfaces/DialogListenerWrap;
.source "EndGameActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/EndGameActivity;->t0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/EndGameActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/EndGameActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/EndGameActivity$g;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-direct {p0}, Lcom/papa91/arc/interfaces/DialogListenerWrap;-><init>()V

    return-void
.end method


# virtual methods
.method public onConfirm()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/EndGameActivity$g;->a:Lcom/join/mgps/activity/EndGameActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/CreateEndGameActivity_;->D0(Landroid/content/Context;)Lcom/join/mgps/activity/CreateEndGameActivity_$n;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/EndGameActivity$g;->a:Lcom/join/mgps/activity/EndGameActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/EndGameActivity;->p:Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;

    invoke-virtual {v0, v1}, Lcom/join/mgps/activity/CreateEndGameActivity_$n;->a(Lcom/join/mgps/dto/GameMainV4DataBean$EndGameConfigBean;)Lcom/join/mgps/activity/CreateEndGameActivity_$n;

    move-result-object v0

    invoke-virtual {v0}, Lorg/androidannotations/api/builder/a;->start()Lorg/androidannotations/api/builder/f;

    return-void
.end method
