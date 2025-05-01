.class Lcom/join/mgps/activity/PapaMainFragment$h;
.super Ljava/lang/Object;
.source "PapaMainFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/PapaMainFragment;->C0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/PapaMainFragment;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/PapaMainFragment;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainFragment;->a0(Lcom/join/mgps/activity/PapaMainFragment;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    const-string v1, "m1"

    invoke-static {v0, v1}, Lcom/join/mgps/activity/PapaMainFragment;->f0(Lcom/join/mgps/activity/PapaMainFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 3
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/join/mgps/activity/PapaMainFragment;->h0(Lcom/join/mgps/activity/PapaMainFragment;I)I

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/activity/PapaMainFragment;->i0(Lcom/join/mgps/activity/PapaMainFragment;I)I

    .line 5
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainFragment;->e0(Lcom/join/mgps/activity/PapaMainFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainFragment;->g0(Lcom/join/mgps/activity/PapaMainFragment;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/PapaMainFragment;->I0(Ljava/lang/String;I)V

    .line 6
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-virtual {v0}, Lcom/join/mgps/activity/PapaMainFragment;->y0()V

    .line 7
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$h;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-virtual {v0}, Lcom/join/mgps/activity/PapaMainFragment;->t0()V

    :cond_0
    return-void
.end method
