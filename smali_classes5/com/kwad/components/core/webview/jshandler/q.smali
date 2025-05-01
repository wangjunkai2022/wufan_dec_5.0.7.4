.class public final Lcom/kwad/components/core/webview/jshandler/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/SensorEventListener;
.implements Lcom/kwad/sdk/core/webview/c/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kwad/components/core/webview/jshandler/q$a;
    }
.end annotation


# instance fields
.field private WT:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/kwad/sdk/core/webview/c/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/kwad/components/core/webview/jshandler/q;->WT:Ljava/util/Map;

    return-void
.end method

.method private a(IILcom/kwad/sdk/core/webview/c/c;)V
    .locals 2

    .line 8
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v0

    new-instance v1, Lcom/kwad/components/core/webview/jshandler/q$1;

    invoke-direct {v1, p0, p3}, Lcom/kwad/components/core/webview/jshandler/q$1;-><init>(Lcom/kwad/components/core/webview/jshandler/q;Lcom/kwad/sdk/core/webview/c/c;)V

    invoke-virtual {v0, p1, p2, p0, v1}, Lcom/kwad/sdk/utils/bb;->a(IILandroid/hardware/SensorEventListener;Lcom/kwad/sdk/utils/bb$b;)V

    return-void
.end method

.method private a(Landroid/hardware/SensorEvent;)V
    .locals 5

    .line 9
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/16 v1, 0xa

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    .line 10
    :goto_0
    iget-object v1, p0, Lcom/kwad/components/core/webview/jshandler/q;->WT:Ljava/util/Map;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kwad/sdk/core/webview/c/c;

    if-eqz v0, :cond_3

    .line 11
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    .line 12
    :goto_1
    iget-object v3, p1, Landroid/hardware/SensorEvent;->values:[F

    array-length v4, v3

    if-ge v2, v4, :cond_2

    .line 13
    aget v3, v3, v2

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 14
    :cond_2
    new-instance v2, Lcom/kwad/components/core/webview/jshandler/q$a;

    invoke-direct {v2}, Lcom/kwad/components/core/webview/jshandler/q$a;-><init>()V

    .line 15
    iput-object v1, v2, Lcom/kwad/components/core/webview/jshandler/q$a;->WX:Ljava/util/ArrayList;

    .line 16
    iget-wide v3, p1, Landroid/hardware/SensorEvent;->timestamp:J

    iput-wide v3, v2, Lcom/kwad/components/core/webview/jshandler/q$a;->timestamp:J

    .line 17
    iget p1, p1, Landroid/hardware/SensorEvent;->accuracy:I

    iput p1, v2, Lcom/kwad/components/core/webview/jshandler/q$a;->accuracy:I

    .line 18
    invoke-interface {v0, v2}, Lcom/kwad/sdk/core/webview/c/c;->a(Lcom/kwad/sdk/core/b;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/kwad/sdk/core/webview/c/c;)V
    .locals 2
    .param p2    # Lcom/kwad/sdk/core/webview/c/c;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/kwad/components/core/webview/jshandler/q$a;

    invoke-direct {v0}, Lcom/kwad/components/core/webview/jshandler/q$a;-><init>()V

    .line 3
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kwad/components/core/webview/jshandler/q$a;->parseJson(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 4
    invoke-virtual {p1}, Lorg/json/JSONException;->printStackTrace()V

    .line 5
    :goto_0
    iget-object p1, p0, Lcom/kwad/components/core/webview/jshandler/q;->WT:Ljava/util/Map;

    iget v1, v0, Lcom/kwad/components/core/webview/jshandler/q$a;->type:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget p1, v0, Lcom/kwad/components/core/webview/jshandler/q$a;->type:I

    iget v0, v0, Lcom/kwad/components/core/webview/jshandler/q$a;->WW:I

    invoke-direct {p0, p1, v0, p2}, Lcom/kwad/components/core/webview/jshandler/q;->a(IILcom/kwad/sdk/core/webview/c/c;)V

    return-void

    :cond_0
    const/4 p1, -0x1

    const-string v0, "data is empty"

    .line 7
    invoke-interface {p2, p1, v0}, Lcom/kwad/sdk/core/webview/c/c;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public final getKey()Ljava/lang/String;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    const-string v0, "registerSensorListener"

    return-object v0
.end method

.method public final onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/kwad/sdk/utils/bb;->Nn()Lcom/kwad/sdk/utils/bb;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/kwad/sdk/utils/bb;->a(Landroid/hardware/SensorEventListener;)V

    return-void
.end method

.method public final onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/kwad/components/core/webview/jshandler/q;->a(Landroid/hardware/SensorEvent;)V

    return-void
.end method
