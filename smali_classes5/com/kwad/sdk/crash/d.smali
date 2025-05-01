.class public final Lcom/kwad/sdk/crash/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final aGR:D

.field public static final aGS:Ljava/util/regex/Pattern;

.field public static final aGT:Ljava/util/regex/Pattern;

.field public static final aGU:Ljava/util/regex/Pattern;

.field public static final aGV:Ljava/util/regex/Pattern;

.field public static aGW:I

.field public static aGX:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->maxMemory()J

    move-result-wide v0

    long-to-double v0, v0

    sput-wide v0, Lcom/kwad/sdk/crash/d;->aGR:D

    const-string v0, "/data/user"

    .line 2
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/crash/d;->aGS:Ljava/util/regex/Pattern;

    const-string v0, "/data"

    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/crash/d;->aGT:Ljava/util/regex/Pattern;

    const-string v0, "/data/data/(.*)/data/.*"

    .line 4
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/crash/d;->aGU:Ljava/util/regex/Pattern;

    const-string v0, "/data/user/.*/(.*)/data/.*"

    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/kwad/sdk/crash/d;->aGV:Ljava/util/regex/Pattern;

    const/16 v0, 0x14

    .line 6
    sput v0, Lcom/kwad/sdk/crash/d;->aGW:I

    const-string v0, "sessionId"

    .line 7
    sput-object v0, Lcom/kwad/sdk/crash/d;->aGX:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
