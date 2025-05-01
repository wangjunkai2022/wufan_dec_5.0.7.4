.class Lcom/beizi/ad/a/a/e$4;
.super Ljava/lang/Object;
.source "ShakeUtil.java"

# interfaces
.implements Landroid/hardware/SensorEventListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/a/a/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/beizi/ad/a/a/e;


# direct methods
.method constructor <init>(Lcom/beizi/ad/a/a/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/beizi/ad/a/a/e$4;->a:Lcom/beizi/ad/a/a/e;

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
    iget-object v0, p0, Lcom/beizi/ad/a/a/e$4;->a:Lcom/beizi/ad/a/a/e;

    invoke-static {v0, p1}, Lcom/beizi/ad/a/a/e;->a(Lcom/beizi/ad/a/a/e;Landroid/hardware/SensorEvent;)V

    return-void
.end method
