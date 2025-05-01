.class Lcom/join/mgps/activity/GivePraiceActivity$a;
.super Ljava/lang/Object;
.source "GivePraiceActivity.java"

# interfaces
.implements Lcom/join/mgps/customview/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/GivePraiceActivity;->f0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/GivePraiceActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/GivePraiceActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/GivePraiceActivity$a;->b:Lcom/join/mgps/activity/GivePraiceActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onRefresh()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/GivePraiceActivity$a;->b:Lcom/join/mgps/activity/GivePraiceActivity;

    invoke-virtual {v0}, Lcom/join/mgps/activity/GivePraiceActivity;->g0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/GivePraiceActivity$a;->b:Lcom/join/mgps/activity/GivePraiceActivity;

    iget v1, v0, Lcom/join/mgps/activity/GivePraiceActivity;->r:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 3
    iput v2, v0, Lcom/join/mgps/activity/GivePraiceActivity;->k:I

    .line 4
    invoke-virtual {v0}, Lcom/join/mgps/activity/GivePraiceActivity;->m0()V

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne v1, v3, :cond_1

    .line 5
    iput v2, v0, Lcom/join/mgps/activity/GivePraiceActivity;->k:I

    .line 6
    invoke-virtual {v0}, Lcom/join/mgps/activity/GivePraiceActivity;->n0()V

    :cond_1
    :goto_0
    return-void
.end method
