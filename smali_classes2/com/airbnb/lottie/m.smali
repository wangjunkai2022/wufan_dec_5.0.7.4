.class public final synthetic Lcom/airbnb/lottie/m;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lorg/json/JSONObject;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lorg/json/JSONObject;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/m;->b:Lorg/json/JSONObject;

    iput-object p2, p0, Lcom/airbnb/lottie/m;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/m;->b:Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/airbnb/lottie/m;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/airbnb/lottie/x;->e(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object v0

    return-object v0
.end method
