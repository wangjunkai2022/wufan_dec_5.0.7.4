.class Lcom/airbnb/lottie/y$b$b;
.super Ljava/lang/Object;
.source "LottieConfig.java"

# interfaces
.implements Lcom/airbnb/lottie/network/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/airbnb/lottie/y$b;->d(Lcom/airbnb/lottie/network/d;)Lcom/airbnb/lottie/y$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/airbnb/lottie/network/d;

.field final synthetic b:Lcom/airbnb/lottie/y$b;


# direct methods
.method constructor <init>(Lcom/airbnb/lottie/y$b;Lcom/airbnb/lottie/network/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/airbnb/lottie/y$b$b;->b:Lcom/airbnb/lottie/y$b;

    iput-object p2, p0, Lcom/airbnb/lottie/y$b$b;->a:Lcom/airbnb/lottie/network/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/io/File;
    .locals 2
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/y$b$b;->a:Lcom/airbnb/lottie/network/d;

    invoke-interface {v0}, Lcom/airbnb/lottie/network/d;->a()Ljava/io/File;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 3
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "cache file must be a directory"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
