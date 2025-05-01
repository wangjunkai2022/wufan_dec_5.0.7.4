.class Lcom/join/mgps/activity/PapaMainFragment$i;
.super Ljava/lang/Object;
.source "PapaMainFragment.java"

# interfaces
.implements Lcom/join/mgps/customview/f;


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
    iput-object p1, p0, Lcom/join/mgps/activity/PapaMainFragment$i;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLoadMore()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/PapaMainFragment$i;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {v0}, Lcom/join/mgps/activity/PapaMainFragment;->e0(Lcom/join/mgps/activity/PapaMainFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/PapaMainFragment$i;->b:Lcom/join/mgps/activity/PapaMainFragment;

    invoke-static {v2}, Lcom/join/mgps/activity/PapaMainFragment;->g0(Lcom/join/mgps/activity/PapaMainFragment;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/join/mgps/activity/PapaMainFragment;->I0(Ljava/lang/String;I)V

    return-void
.end method
