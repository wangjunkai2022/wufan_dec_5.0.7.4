.class Lcom/join/mgps/activity/MyGamePapaFragment$e;
.super Ljava/lang/Object;
.source "MyGamePapaFragment.java"

# interfaces
.implements Lcom/join/mgps/broadcast/NetBroadcastReceiver$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MyGamePapaFragment;->p1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/activity/MyGamePapaFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MyGamePapaFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->o0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->o0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->m0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->p0(Lcom/join/mgps/activity/MyGamePapaFragment;)I

    move-result p1

    iget-object v0, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/MyGamePapaFragment;->m0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eq p1, v0, :cond_2

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->m0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    invoke-static {p1}, Lcom/join/mgps/activity/MyGamePapaFragment;->m0(Lcom/join/mgps/activity/MyGamePapaFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/join/mgps/activity/MyGamePapaFragment;->q0(Lcom/join/mgps/activity/MyGamePapaFragment;I)I

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/join/mgps/activity/MyGamePapaFragment$e;->a:Lcom/join/mgps/activity/MyGamePapaFragment;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/join/mgps/activity/MyGamePapaFragment;->E0(Z)V

    :cond_2
    return-void
.end method
