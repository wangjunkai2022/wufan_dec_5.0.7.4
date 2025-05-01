.class public final Lcom/airbnb/lottie/y$b;
.super Ljava/lang/Object;
.source "LottieConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Lcom/airbnb/lottie/network/e;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private b:Lcom/airbnb/lottie/network/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private c:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/airbnb/lottie/y$b;->c:Z

    return-void
.end method


# virtual methods
.method public a()Lcom/airbnb/lottie/y;
    .locals 5
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/y;

    iget-object v1, p0, Lcom/airbnb/lottie/y$b;->a:Lcom/airbnb/lottie/network/e;

    iget-object v2, p0, Lcom/airbnb/lottie/y$b;->b:Lcom/airbnb/lottie/network/d;

    iget-boolean v3, p0, Lcom/airbnb/lottie/y$b;->c:Z

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/airbnb/lottie/y;-><init>(Lcom/airbnb/lottie/network/e;Lcom/airbnb/lottie/network/d;ZLcom/airbnb/lottie/y$a;)V

    return-object v0
.end method

.method public b(Z)Lcom/airbnb/lottie/y$b;
    .locals 0
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput-boolean p1, p0, Lcom/airbnb/lottie/y$b;->c:Z

    return-object p0
.end method

.method public c(Ljava/io/File;)Lcom/airbnb/lottie/y$b;
    .locals 1
    .param p1    # Ljava/io/File;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/y$b;->b:Lcom/airbnb/lottie/network/d;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/airbnb/lottie/y$b$a;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/y$b$a;-><init>(Lcom/airbnb/lottie/y$b;Ljava/io/File;)V

    iput-object v0, p0, Lcom/airbnb/lottie/y$b;->b:Lcom/airbnb/lottie/network/d;

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "There is already a cache provider!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lcom/airbnb/lottie/network/d;)Lcom/airbnb/lottie/y$b;
    .locals 1
    .param p1    # Lcom/airbnb/lottie/network/d;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/y$b;->b:Lcom/airbnb/lottie/network/d;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/airbnb/lottie/y$b$b;

    invoke-direct {v0, p0, p1}, Lcom/airbnb/lottie/y$b$b;-><init>(Lcom/airbnb/lottie/y$b;Lcom/airbnb/lottie/network/d;)V

    iput-object v0, p0, Lcom/airbnb/lottie/y$b;->b:Lcom/airbnb/lottie/network/d;

    return-object p0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "There is already a cache provider!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public e(Lcom/airbnb/lottie/network/e;)Lcom/airbnb/lottie/y$b;
    .locals 0
    .param p1    # Lcom/airbnb/lottie/network/e;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/airbnb/lottie/y$b;->a:Lcom/airbnb/lottie/network/e;

    return-object p0
.end method
