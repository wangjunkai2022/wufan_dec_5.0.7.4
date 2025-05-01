.class Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;
.super Ljava/lang/Object;
.source "MyGamePapaLocalFragment.java"

# interfaces
.implements Lcom/join/mgps/broadcast/NetBroadcastReceiver$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaLocalFragment;->R0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->a0(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->a0(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->X(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->b0(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)I

    move-result p1

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->X(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eq p1, v0, :cond_2

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->X(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->X(Lcom/join/mgps/activity/MyGamePapaLocalFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->c0(Lcom/join/mgps/activity/MyGamePapaLocalFragment;I)I

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaLocalFragment$d;->a:Lcom/join/mgps/activity/MyGamePapaLocalFragment;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MyGamePapaLocalFragment;->p0(Z)V

    :cond_2
    return-void
.end method
