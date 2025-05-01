.class Lcom/join/mgps/activity/MiniGameLoadingActivity$b;
.super Ljava/lang/Object;
.source "MiniGameLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity;->N0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MiniGameLoadingActivity;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/join/mgps/va/overmind/d;->d0()V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    .line 3
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v1, v1, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/join/mgps/va/overmind/d;->N(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v0}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m0(Lcom/join/mgps/activity/MiniGameLoadingActivity;)V

    goto :goto_1

    .line 5
    :cond_0
    invoke-static {}, Lcom/join/mgps/va/overmind/d;->o()Lcom/join/mgps/va/overmind/d;

    move-result-object v1

    iget-object v2, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$b;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v3, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->l:Ljava/lang/String;

    iget-object v4, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->m:Ljava/lang/String;

    iget-object v5, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->n:Ljava/lang/String;

    iget v6, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->o:I

    iget v0, v2, Lcom/join/mgps/activity/MiniGameLoadingActivity;->p:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    const/4 v7, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    const/4 v7, 0x0

    :goto_0
    invoke-virtual/range {v1 .. v7}, Lcom/join/mgps/va/overmind/d;->m(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    :goto_1
    return-void
.end method
