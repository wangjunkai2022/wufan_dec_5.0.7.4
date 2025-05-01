.class Lcom/join/mgps/activity/MiniGameLoadingActivity$c$c;
.super Ljava/lang/Object;
.source "MiniGameLoadingActivity.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/activity/MiniGameLoadingActivity$c;->onFinish(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/activity/MiniGameLoadingActivity$c;


# direct methods
.method constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$c$c;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$c$c;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$c;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->n0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Z)V

    .line 2
    iget-object v0, p0, Lcom/join/mgps/activity/MiniGameLoadingActivity$c$c;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity$c;

    iget-object v0, v0, Lcom/join/mgps/activity/MiniGameLoadingActivity$c;->a:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->o0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Z)V

    return-void
.end method
