.class Lcom/umeng/commonsdk/utils/b$a;
.super Ljava/lang/Object;
.source "PkgInfoUtil.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/commonsdk/utils/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/umeng/commonsdk/utils/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/umeng/commonsdk/utils/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/commonsdk/utils/b;-><init>(Lcom/umeng/commonsdk/utils/b$1;)V

    sput-object v0, Lcom/umeng/commonsdk/utils/b$a;->a:Lcom/umeng/commonsdk/utils/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lcom/umeng/commonsdk/utils/b;
    .locals 1

    .line 1
    sget-object v0, Lcom/umeng/commonsdk/utils/b$a;->a:Lcom/umeng/commonsdk/utils/b;

    return-object v0
.end method
