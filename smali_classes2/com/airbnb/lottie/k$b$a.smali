.class final Lcom/airbnb/lottie/k$b$a;
.super Ljava/lang/Object;
.source "LottieComposition.java"

# interfaces
.implements Lcom/airbnb/lottie/p0;
.implements Lcom/airbnb/lottie/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/k$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/airbnb/lottie/p0<",
        "Lcom/airbnb/lottie/k;",
        ">;",
        "Lcom/airbnb/lottie/b;"
    }
.end annotation


# instance fields
.field private final a:Lcom/airbnb/lottie/w0;

.field private b:Z


# direct methods
.method private constructor <init>(Lcom/airbnb/lottie/w0;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput-boolean v0, p0, Lcom/airbnb/lottie/k$b$a;->b:Z

    .line 4
    iput-object p1, p0, Lcom/airbnb/lottie/k$b$a;->a:Lcom/airbnb/lottie/w0;

    return-void
.end method

.method synthetic constructor <init>(Lcom/airbnb/lottie/w0;Lcom/airbnb/lottie/k$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/w0;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/airbnb/lottie/k;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/airbnb/lottie/k$b$a;->b:Z

    if-eqz v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/k$b$a;->a:Lcom/airbnb/lottie/w0;

    invoke-interface {v0, p1}, Lcom/airbnb/lottie/w0;->a(Lcom/airbnb/lottie/k;)V

    return-void
.end method

.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    iput-boolean v0, p0, Lcom/airbnb/lottie/k$b$a;->b:Z

    return-void
.end method

.method public bridge synthetic onResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/airbnb/lottie/k;

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/k$b$a;->a(Lcom/airbnb/lottie/k;)V

    return-void
.end method
