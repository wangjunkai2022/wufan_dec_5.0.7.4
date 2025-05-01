.class public Lcom/airbnb/lottie/f;
.super Ljava/lang/Object;
.source "Lottie.java"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lcom/airbnb/lottie/y;)V
    .locals 1
    .param p0    # Lcom/airbnb/lottie/y;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/y;->a:Lcom/airbnb/lottie/network/e;

    invoke-static {v0}, Lcom/airbnb/lottie/e;->f(Lcom/airbnb/lottie/network/e;)V

    .line 2
    iget-object v0, p0, Lcom/airbnb/lottie/y;->b:Lcom/airbnb/lottie/network/d;

    invoke-static {v0}, Lcom/airbnb/lottie/e;->e(Lcom/airbnb/lottie/network/d;)V

    .line 3
    iget-boolean p0, p0, Lcom/airbnb/lottie/y;->c:Z

    invoke-static {p0}, Lcom/airbnb/lottie/e;->g(Z)V

    return-void
.end method
