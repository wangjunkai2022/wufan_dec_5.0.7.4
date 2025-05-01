.class Lcom/join/mgps/activity/QuarkPromptActivity$c;
.super Ljava/lang/Object;
.source "QuarkPromptActivity.java"

# interfaces
.implements Lio/reactivex/functions/Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/QuarkPromptActivity;->l0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/reactivex/functions/Consumer<",
        "Lcom/tbruyelle/rxpermissions2/b;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/QuarkPromptActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/QuarkPromptActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/tbruyelle/rxpermissions2/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    sget-object v0, Lcom/papa/sim/statistic/Event;->clickSpeedDownQkButton:Lcom/papa/sim/statistic/Event;

    iget-object v1, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    iget-boolean v2, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    const-string v3, "detail"

    const-string v4, "list"

    if-eqz v2, :cond_0

    move-object v2, v3

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    invoke-static {p1, v0, v1, v2}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    sget-object v0, Lcom/papa/sim/statistic/Event;->clickSpeedDownUpQk:Lcom/papa/sim/statistic/Event;

    iget-object v1, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->l:Ljava/lang/String;

    iget-boolean v2, p1, Lcom/join/mgps/activity/QuarkPromptActivity;->t:Z

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :goto_1
    invoke-static {p1, v0, v1, v3}, Lcom/join/mgps/Util/q1;->t(Landroid/content/Context;Lcom/papa/sim/statistic/Event;Ljava/lang/String;Ljava/lang/String;)V

    .line 3
    iget-object p1, p0, Lcom/join/mgps/activity/QuarkPromptActivity$c;->b:Lcom/join/mgps/activity/QuarkPromptActivity;

    invoke-virtual {p1}, Lcom/join/mgps/activity/QuarkPromptActivity;->finish()V

    .line 4
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    new-instance v0, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;

    invoke-direct {v0, p0}, Lcom/join/mgps/activity/QuarkPromptActivity$c$a;-><init>(Lcom/join/mgps/activity/QuarkPromptActivity$c;)V

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Lcom/tbruyelle/rxpermissions2/b;

    invoke-virtual {p0, p1}, Lcom/join/mgps/activity/QuarkPromptActivity$c;->a(Lcom/tbruyelle/rxpermissions2/b;)V

    return-void
.end method
