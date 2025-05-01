.class public final synthetic Lcom/join/mgps/activity/p1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/activity/MiniGameLoadingActivity;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/activity/p1;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iput-object p2, p0, Lcom/join/mgps/activity/p1;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/activity/p1;->b:Lcom/join/mgps/activity/MiniGameLoadingActivity;

    iget-object v1, p0, Lcom/join/mgps/activity/p1;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/join/mgps/activity/MiniGameLoadingActivity;->k0(Lcom/join/mgps/activity/MiniGameLoadingActivity;Ljava/lang/String;)V

    return-void
.end method
