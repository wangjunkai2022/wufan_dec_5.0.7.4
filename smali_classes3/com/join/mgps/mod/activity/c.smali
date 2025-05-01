.class public final synthetic Lcom/join/mgps/mod/activity/c;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/mod/activity/ModLoadingActivity;

.field public final synthetic c:Landroid/os/Handler;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/mod/activity/ModLoadingActivity;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/mod/activity/c;->b:Lcom/join/mgps/mod/activity/ModLoadingActivity;

    iput-object p2, p0, Lcom/join/mgps/mod/activity/c;->c:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/mod/activity/c;->b:Lcom/join/mgps/mod/activity/ModLoadingActivity;

    iget-object v1, p0, Lcom/join/mgps/mod/activity/c;->c:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/join/mgps/mod/activity/ModLoadingActivity;->g0(Lcom/join/mgps/mod/activity/ModLoadingActivity;Landroid/os/Handler;)V

    return-void
.end method
