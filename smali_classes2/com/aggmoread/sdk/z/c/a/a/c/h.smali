.class public final Lcom/aggmoread/sdk/z/c/a/a/c/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lcom/aggmoread/sdk/z/c/a/a/c/h;


# instance fields
.field private a:I

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/h;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Lcom/aggmoread/sdk/z/c/a/a/c/h;-><init>(II)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->c:Lcom/aggmoread/sdk/z/c/a/a/c/h;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->a:I

    iput p2, p0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->b:I

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/h;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "{w= %s,h= %s}"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
