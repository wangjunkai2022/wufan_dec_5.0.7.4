.class public Lcom/airbnb/lottie/y;
.super Ljava/lang/Object;
.source "LottieConfig.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/y$b;
    }
.end annotation


# instance fields
.field final a:Lcom/airbnb/lottie/network/e;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field final b:Lcom/airbnb/lottie/network/d;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field final c:Z


# direct methods
.method private constructor <init>(Lcom/airbnb/lottie/network/e;Lcom/airbnb/lottie/network/d;Z)V
    .locals 0
    .param p1    # Lcom/airbnb/lottie/network/e;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/airbnb/lottie/network/d;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/airbnb/lottie/y;->a:Lcom/airbnb/lottie/network/e;

    .line 4
    iput-object p2, p0, Lcom/airbnb/lottie/y;->b:Lcom/airbnb/lottie/network/d;

    .line 5
    iput-boolean p3, p0, Lcom/airbnb/lottie/y;->c:Z

    return-void
.end method

.method synthetic constructor <init>(Lcom/airbnb/lottie/network/e;Lcom/airbnb/lottie/network/d;ZLcom/airbnb/lottie/y$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/airbnb/lottie/y;-><init>(Lcom/airbnb/lottie/network/e;Lcom/airbnb/lottie/network/d;Z)V

    return-void
.end method
