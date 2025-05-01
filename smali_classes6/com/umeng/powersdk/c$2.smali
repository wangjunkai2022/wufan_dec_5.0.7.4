.class final Lcom/umeng/powersdk/c$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/powersdk/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/os/Handler;

.field final synthetic b:Lcom/umeng/powersdk/c;


# direct methods
.method constructor <init>(Lcom/umeng/powersdk/c;Landroid/os/Handler;)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/powersdk/c$2;->b:Lcom/umeng/powersdk/c;

    iput-object p2, p0, Lcom/umeng/powersdk/c$2;->a:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    :try_start_0
    iget-object v1, p0, Lcom/umeng/powersdk/c$2;->b:Lcom/umeng/powersdk/c;

    iget-object v7, p0, Lcom/umeng/powersdk/c$2;->a:Landroid/os/Handler;

    iget v6, v1, Lcom/umeng/powersdk/c;->b:I

    iget v4, v1, Lcom/umeng/powersdk/c;->c:I

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    new-instance v8, Lcom/umeng/powersdk/c$3;

    move-object v0, v8

    move-object v5, v7

    invoke-direct/range {v0 .. v6}, Lcom/umeng/powersdk/c$3;-><init>(Lcom/umeng/powersdk/c;JILandroid/os/Handler;I)V

    invoke-virtual {v7, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    iget-object v0, p0, Lcom/umeng/powersdk/c$2;->a:Landroid/os/Handler;

    iget-object v1, p0, Lcom/umeng/powersdk/c$2;->b:Lcom/umeng/powersdk/c;

    iget v1, v1, Lcom/umeng/powersdk/c;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void
.end method
