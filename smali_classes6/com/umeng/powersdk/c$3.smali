.class final Lcom/umeng/powersdk/c$3;
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
.field final synthetic a:J

.field final synthetic b:I

.field final synthetic c:Landroid/os/Handler;

.field final synthetic d:I

.field final synthetic e:Lcom/umeng/powersdk/c;


# direct methods
.method constructor <init>(Lcom/umeng/powersdk/c;JILandroid/os/Handler;I)V
    .locals 0

    iput-object p1, p0, Lcom/umeng/powersdk/c$3;->e:Lcom/umeng/powersdk/c;

    iput-wide p2, p0, Lcom/umeng/powersdk/c$3;->a:J

    iput p4, p0, Lcom/umeng/powersdk/c$3;->b:I

    iput-object p5, p0, Lcom/umeng/powersdk/c$3;->c:Landroid/os/Handler;

    iput p6, p0, Lcom/umeng/powersdk/c$3;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lcom/umeng/powersdk/c$3;->e:Lcom/umeng/powersdk/c;

    iget-boolean v0, v0, Lcom/umeng/powersdk/c;->e:Z

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/umeng/powersdk/c$3;->a:J

    sub-long/2addr v0, v2

    iget v2, p0, Lcom/umeng/powersdk/c$3;->b:I

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v2, v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v0, p0, Lcom/umeng/powersdk/c$3;->c:Landroid/os/Handler;

    iget-object v1, p0, Lcom/umeng/powersdk/c$3;->e:Lcom/umeng/powersdk/c;

    iget v1, v1, Lcom/umeng/powersdk/c;->a:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    return-void

    :cond_0
    :try_start_0
    new-instance v0, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;

    const-string v1, "powerperf"

    invoke-direct {v0, v1}, Lcom/efs/sdk/base/protocol/record/EfsJSONLog;-><init>(Ljava/lang/String;)V

    const-string v1, "power"

    iget-object v2, p0, Lcom/umeng/powersdk/c$3;->e:Lcom/umeng/powersdk/c;

    invoke-virtual {v2}, Lcom/umeng/powersdk/c;->a()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/efs/sdk/base/protocol/record/AbsRecordLog;->put(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Lcom/umeng/powersdk/PowerManager;->getReporter()Lcom/efs/sdk/base/EfsReporter;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Lcom/efs/sdk/base/EfsReporter;->send(Lcom/efs/sdk/base/protocol/ILogProtocol;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    iget-object v0, p0, Lcom/umeng/powersdk/c$3;->c:Landroid/os/Handler;

    iget v1, p0, Lcom/umeng/powersdk/c$3;->d:I

    mul-int/lit16 v1, v1, 0x3e8

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
