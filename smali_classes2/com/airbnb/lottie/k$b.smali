.class public Lcom/airbnb/lottie/k$b;
.super Ljava/lang/Object;
.source "LottieComposition.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/airbnb/lottie/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/airbnb/lottie/k$b$a;
    }
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Lcom/airbnb/lottie/w0;)Lcom/airbnb/lottie/b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/k$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/w0;Lcom/airbnb/lottie/k$a;)V

    .line 2
    invoke-static {p0, p1}, Lcom/airbnb/lottie/x;->o(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/v0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/v0;->d(Lcom/airbnb/lottie/p0;)Lcom/airbnb/lottie/v0;

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/k;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-static {p0, p1}, Lcom/airbnb/lottie/x;->q(Landroid/content/Context;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/airbnb/lottie/t0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method

.method public static c(Ljava/io/InputStream;Lcom/airbnb/lottie/w0;)Lcom/airbnb/lottie/b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/k$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/w0;Lcom/airbnb/lottie/k$a;)V

    .line 2
    invoke-static {p0, v1}, Lcom/airbnb/lottie/x;->t(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/v0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/v0;->d(Lcom/airbnb/lottie/p0;)Lcom/airbnb/lottie/v0;

    return-object v0
.end method

.method public static d(Ljava/io/InputStream;)Lcom/airbnb/lottie/k;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/airbnb/lottie/x;->u(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/airbnb/lottie/t0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method

.method public static e(Ljava/io/InputStream;Z)Lcom/airbnb/lottie/k;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-eqz p1, :cond_0

    const-string p1, "Lottie now auto-closes input stream!"

    .line 1
    invoke-static {p1}, Lcom/airbnb/lottie/utils/d;->e(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    .line 2
    invoke-static {p0, p1}, Lcom/airbnb/lottie/x;->u(Ljava/io/InputStream;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/airbnb/lottie/t0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method

.method public static f(Lcom/airbnb/lottie/parser/moshi/JsonReader;Lcom/airbnb/lottie/w0;)Lcom/airbnb/lottie/b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/k$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/w0;Lcom/airbnb/lottie/k$a;)V

    .line 2
    invoke-static {p0, v1}, Lcom/airbnb/lottie/x;->w(Lcom/airbnb/lottie/parser/moshi/JsonReader;Ljava/lang/String;)Lcom/airbnb/lottie/v0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/v0;->d(Lcom/airbnb/lottie/p0;)Lcom/airbnb/lottie/v0;

    return-object v0
.end method

.method public static g(Ljava/lang/String;Lcom/airbnb/lottie/w0;)Lcom/airbnb/lottie/b;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/k$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/w0;Lcom/airbnb/lottie/k$a;)V

    .line 2
    invoke-static {p0, v1}, Lcom/airbnb/lottie/x;->z(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/v0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/v0;->d(Lcom/airbnb/lottie/p0;)Lcom/airbnb/lottie/v0;

    return-object v0
.end method

.method public static h(Landroid/content/res/Resources;Lorg/json/JSONObject;)Lcom/airbnb/lottie/k;
    .locals 0
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 p0, 0x0

    .line 1
    invoke-static {p1, p0}, Lcom/airbnb/lottie/x;->B(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/airbnb/lottie/t0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method

.method public static i(Lcom/airbnb/lottie/parser/moshi/JsonReader;)Lcom/airbnb/lottie/k;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/airbnb/lottie/x;->x(Lcom/airbnb/lottie/parser/moshi/JsonReader;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/airbnb/lottie/t0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method

.method public static j(Ljava/lang/String;)Lcom/airbnb/lottie/k;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation build Landroidx/annotation/WorkerThread;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {p0, v0}, Lcom/airbnb/lottie/x;->A(Ljava/lang/String;Ljava/lang/String;)Lcom/airbnb/lottie/t0;

    move-result-object p0

    invoke-virtual {p0}, Lcom/airbnb/lottie/t0;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/airbnb/lottie/k;

    return-object p0
.end method

.method public static k(Landroid/content/Context;ILcom/airbnb/lottie/w0;)Lcom/airbnb/lottie/b;
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/RawRes;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    new-instance v0, Lcom/airbnb/lottie/k$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, v1}, Lcom/airbnb/lottie/k$b$a;-><init>(Lcom/airbnb/lottie/w0;Lcom/airbnb/lottie/k$a;)V

    .line 2
    invoke-static {p0, p1}, Lcom/airbnb/lottie/x;->C(Landroid/content/Context;I)Lcom/airbnb/lottie/v0;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/v0;->d(Lcom/airbnb/lottie/p0;)Lcom/airbnb/lottie/v0;

    return-object v0
.end method
