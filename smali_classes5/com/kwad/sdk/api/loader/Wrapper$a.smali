.class final Lcom/kwad/sdk/api/loader/Wrapper$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kwad/sdk/api/loader/Wrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private ajA:I

.field private ajB:[Ljava/lang/StackTraceElement;

.field private ajC:I

.field private ajD:J

.field private ajz:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajz:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajA:I

    .line 4
    iput-object v1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajB:[Ljava/lang/StackTraceElement;

    .line 5
    iput v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajC:I

    return-void
.end method

.method synthetic constructor <init>(B)V
    .locals 0

    .line 6
    invoke-direct {p0}, Lcom/kwad/sdk/api/loader/Wrapper$a;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/Wrapper$a;J)J
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajD:J

    return-wide p1
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/Wrapper$a;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajz:Ljava/lang/ref/WeakReference;

    return-object p0
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/Wrapper$a;Ljava/lang/ref/WeakReference;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajz:Ljava/lang/ref/WeakReference;

    return-object p1
.end method

.method static synthetic a(Lcom/kwad/sdk/api/loader/Wrapper$a;[Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajB:[Ljava/lang/StackTraceElement;

    return-object p1
.end method

.method static synthetic b(Lcom/kwad/sdk/api/loader/Wrapper$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajD:J

    return-wide v0
.end method

.method static synthetic c(Lcom/kwad/sdk/api/loader/Wrapper$a;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajA:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajA:I

    return v0
.end method

.method private clear()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajz:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajA:I

    .line 3
    iput-object v1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajB:[Ljava/lang/StackTraceElement;

    .line 4
    iput v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajC:I

    const-wide/16 v0, 0x0

    .line 5
    iput-wide v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajD:J

    return-void
.end method

.method static synthetic d(Lcom/kwad/sdk/api/loader/Wrapper$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajA:I

    return p0
.end method

.method static synthetic e(Lcom/kwad/sdk/api/loader/Wrapper$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/kwad/sdk/api/loader/Wrapper$a;->clear()V

    return-void
.end method

.method static synthetic f(Lcom/kwad/sdk/api/loader/Wrapper$a;)[Ljava/lang/StackTraceElement;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajB:[Ljava/lang/StackTraceElement;

    return-object p0
.end method

.method static synthetic g(Lcom/kwad/sdk/api/loader/Wrapper$a;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajC:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajC:I

    return v0
.end method

.method static synthetic h(Lcom/kwad/sdk/api/loader/Wrapper$a;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/kwad/sdk/api/loader/Wrapper$a;->ajC:I

    return p0
.end method
