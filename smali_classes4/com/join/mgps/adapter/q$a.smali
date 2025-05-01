.class Lcom/join/mgps/adapter/q$a;
.super Ljava/lang/Object;
.source "FightServerChoseAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/q;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/data/a;

.field final synthetic c:Lcom/join/mgps/adapter/q;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/q;Lcom/join/mgps/data/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/q$a;->c:Lcom/join/mgps/adapter/q;

    iput-object p2, p0, Lcom/join/mgps/adapter/q$a;->b:Lcom/join/mgps/data/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/adapter/q$a;->b:Lcom/join/mgps/data/a;

    invoke-virtual {v1}, Lcom/join/mgps/data/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/join/mgps/adapter/q$a;->b:Lcom/join/mgps/data/a;

    invoke-virtual {v1}, Lcom/join/mgps/data/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ssid"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "FIGHT_JOIN_SERVER"

    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 4
    iget-object v0, p0, Lcom/join/mgps/adapter/q$a;->c:Lcom/join/mgps/adapter/q;

    invoke-static {v0}, Lcom/join/mgps/adapter/q;->a(Lcom/join/mgps/adapter/q;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    return-void
.end method
