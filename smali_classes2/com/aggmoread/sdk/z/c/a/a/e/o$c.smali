.class public final enum Lcom/aggmoread/sdk/z/c/a/a/e/o$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/e/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/aggmoread/sdk/z/c/a/a/e/o$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum d:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

.field public static final enum e:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

.field public static final enum f:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

.field public static final enum g:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

.field public static final enum h:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

.field public static final enum i:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;


# instance fields
.field public b:J

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v6, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    const-string v1, "REQUEST_DAILY"

    const/4 v2, 0x0

    const-wide/32 v3, 0x5265c00

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;-><init>(Ljava/lang/String;IJI)V

    sput-object v6, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->d:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    const-string v8, "REQUEST_HOURLY"

    const/4 v9, 0x1

    const-wide/32 v10, 0x36ee80

    const/4 v12, 0x1

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;-><init>(Ljava/lang/String;IJI)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->e:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    const-string v2, "EXPOSURE_DAILY"

    const/4 v3, 0x2

    const-wide/32 v4, 0x5265c00

    const/4 v6, 0x2

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;-><init>(Ljava/lang/String;IJI)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->f:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    const-string v8, "EXPOSURE_HOURLY"

    const/4 v9, 0x3

    const/4 v12, 0x3

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;-><init>(Ljava/lang/String;IJI)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->g:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    const-string v2, "CLICK_DAILY"

    const/4 v3, 0x4

    const/4 v6, 0x4

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;-><init>(Ljava/lang/String;IJI)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->h:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    const-string v8, "CLICK_HOURLY"

    const/4 v9, 0x5

    const/4 v12, 0x5

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;-><init>(Ljava/lang/String;IJI)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->i:Lcom/aggmoread/sdk/z/c/a/a/e/o$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IJI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-wide p3, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->b:J

    iput p5, p0, Lcom/aggmoread/sdk/z/c/a/a/e/o$c;->c:I

    return-void
.end method
