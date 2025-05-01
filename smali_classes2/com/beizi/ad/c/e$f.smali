.class public final enum Lcom/beizi/ad/c/e$f;
.super Ljava/lang/Enum;
.source "EnumType.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/beizi/ad/c/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/beizi/ad/c/e$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/beizi/ad/c/e$f;

.field public static final enum b:Lcom/beizi/ad/c/e$f;

.field public static final enum c:Lcom/beizi/ad/c/e$f;

.field public static final enum d:Lcom/beizi/ad/c/e$f;

.field public static final enum e:Lcom/beizi/ad/c/e$f;

.field public static final enum f:Lcom/beizi/ad/c/e$f;

.field private static final synthetic h:[Lcom/beizi/ad/c/e$f;


# instance fields
.field private final g:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Lcom/beizi/ad/c/e$f;

    const-string v1, "RENDER_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/beizi/ad/c/e$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/beizi/ad/c/e$f;->a:Lcom/beizi/ad/c/e$f;

    .line 2
    new-instance v1, Lcom/beizi/ad/c/e$f;

    const-string v3, "RENDER_VIDEO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lcom/beizi/ad/c/e$f;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/beizi/ad/c/e$f;->b:Lcom/beizi/ad/c/e$f;

    .line 3
    new-instance v3, Lcom/beizi/ad/c/e$f;

    const-string v5, "RENDER_PIC"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lcom/beizi/ad/c/e$f;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lcom/beizi/ad/c/e$f;->c:Lcom/beizi/ad/c/e$f;

    .line 4
    new-instance v5, Lcom/beizi/ad/c/e$f;

    const-string v7, "RENDER_H5"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lcom/beizi/ad/c/e$f;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lcom/beizi/ad/c/e$f;->d:Lcom/beizi/ad/c/e$f;

    .line 5
    new-instance v7, Lcom/beizi/ad/c/e$f;

    const-string v9, "RENDER_JSON"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lcom/beizi/ad/c/e$f;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lcom/beizi/ad/c/e$f;->e:Lcom/beizi/ad/c/e$f;

    .line 6
    new-instance v9, Lcom/beizi/ad/c/e$f;

    const-string v11, "RENDER_VAST_VIDEO"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lcom/beizi/ad/c/e$f;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lcom/beizi/ad/c/e$f;->f:Lcom/beizi/ad/c/e$f;

    const/4 v11, 0x6

    new-array v11, v11, [Lcom/beizi/ad/c/e$f;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Lcom/beizi/ad/c/e$f;->h:[Lcom/beizi/ad/c/e$f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Lcom/beizi/ad/c/e$f;->g:I

    return-void
.end method

.method public static a(I)Lcom/beizi/ad/c/e$f;
    .locals 1

    if-eqz p0, :cond_5

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    const/4 v0, 0x5

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 1
    :cond_0
    sget-object p0, Lcom/beizi/ad/c/e$f;->f:Lcom/beizi/ad/c/e$f;

    return-object p0

    .line 2
    :cond_1
    sget-object p0, Lcom/beizi/ad/c/e$f;->e:Lcom/beizi/ad/c/e$f;

    return-object p0

    .line 3
    :cond_2
    sget-object p0, Lcom/beizi/ad/c/e$f;->d:Lcom/beizi/ad/c/e$f;

    return-object p0

    .line 4
    :cond_3
    sget-object p0, Lcom/beizi/ad/c/e$f;->c:Lcom/beizi/ad/c/e$f;

    return-object p0

    .line 5
    :cond_4
    sget-object p0, Lcom/beizi/ad/c/e$f;->b:Lcom/beizi/ad/c/e$f;

    return-object p0

    .line 6
    :cond_5
    sget-object p0, Lcom/beizi/ad/c/e$f;->a:Lcom/beizi/ad/c/e$f;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/beizi/ad/c/e$f;
    .locals 1

    .line 1
    const-class v0, Lcom/beizi/ad/c/e$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/beizi/ad/c/e$f;

    return-object p0
.end method

.method public static values()[Lcom/beizi/ad/c/e$f;
    .locals 1

    .line 1
    sget-object v0, Lcom/beizi/ad/c/e$f;->h:[Lcom/beizi/ad/c/e$f;

    invoke-virtual {v0}, [Lcom/beizi/ad/c/e$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/beizi/ad/c/e$f;

    return-object v0
.end method
