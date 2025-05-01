.class final Lcom/umeng/powersdk/c$1;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/powersdk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/HandlerThread;

.field final synthetic b:Lcom/umeng/powersdk/c;


# direct methods
.method constructor <init>(Lcom/umeng/powersdk/c;Landroid/os/Looper;Landroid/os/HandlerThread;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/powersdk/c$1;->b:Lcom/umeng/powersdk/c;

    iput-object p3, p0, Lcom/umeng/powersdk/c$1;->a:Landroid/os/HandlerThread;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget p1, p1, Landroid/os/Message;->what:I

    iget-object v0, p0, Lcom/umeng/powersdk/c$1;->b:Lcom/umeng/powersdk/c;

    iget v0, v0, Lcom/umeng/powersdk/c;->a:I

    if-ne p1, v0, :cond_0

    :try_start_0
    iget-object p1, p0, Lcom/umeng/powersdk/c$1;->a:Landroid/os/HandlerThread;

    invoke-virtual {p1}, Landroid/os/HandlerThread;->quit()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method
