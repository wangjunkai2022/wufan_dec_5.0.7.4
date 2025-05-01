.class public Lcom/beizi/fusion/g/ai;
.super Ljava/lang/Object;
.source "OaidUtil.java"


# static fields
.field static a:Ljava/lang/String; = "OaidUtil"

.field public static b:Lcom/beizi/fusion/e/a/b$a;

.field private static c:Ljava/lang/String;

.field private static d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/beizi/fusion/g/ai$1;

    invoke-direct {v0}, Lcom/beizi/fusion/g/ai$1;-><init>()V

    sput-object v0, Lcom/beizi/fusion/g/ai;->b:Lcom/beizi/fusion/e/a/b$a;

    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/beizi/fusion/g/ai;->d:Z

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/fusion/g/ai;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 2
    sput-object p0, Lcom/beizi/fusion/g/ai;->c:Ljava/lang/String;

    return-object p0
.end method
