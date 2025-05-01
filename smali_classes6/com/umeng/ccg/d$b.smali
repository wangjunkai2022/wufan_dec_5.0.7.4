.class Lcom/umeng/ccg/d$b;
.super Ljava/lang/Object;
.source "Monitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/ccg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# static fields
.field private static final a:Lcom/umeng/ccg/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/umeng/ccg/d;

    invoke-direct {v0}, Lcom/umeng/ccg/d;-><init>()V

    sput-object v0, Lcom/umeng/ccg/d$b;->a:Lcom/umeng/ccg/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/umeng/ccg/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/ccg/d$b;->a:Lcom/umeng/ccg/d;

    return-object v0
.end method
