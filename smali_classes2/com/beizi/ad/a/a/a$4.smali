.class Lcom/beizi/ad/a/a/a$4;
.super Ljava/lang/Object;
.source "EulerAngleUtil.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/a/a/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/a/a/a;


# direct methods
.method constructor <init>(Lcom/beizi/ad/a/a/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/a/a/a$4;->a:Lcom/beizi/ad/a/a/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/beizi/ad/a/a/a$4;->a:Lcom/beizi/ad/a/a/a;

    invoke-static {v0, p1}, Lcom/beizi/ad/a/a/a;->a(Lcom/beizi/ad/a/a/a;Landroid/hardware/SensorEvent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 2
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :goto_0
    return-void
.end method
