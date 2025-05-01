.class public final synthetic Lcom/airbnb/lottie/q;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/airbnb/lottie/k;


# direct methods
.method public synthetic constructor <init>(Lcom/airbnb/lottie/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/airbnb/lottie/q;->b:Lcom/airbnb/lottie/k;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/q;->b:Lcom/airbnb/lottie/k;

    invoke-static {v0}, Lcom/airbnb/lottie/x;->g(Lcom/airbnb/lottie/k;)Lcom/airbnb/lottie/t0;

    move-result-object v0

    return-object v0
.end method
