.class public Lcom/aggmoread/sdk/z/c/a/a/c/r/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static d:Lcom/aggmoread/sdk/z/c/a/a/c/r/c;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Lcom/aggmoread/sdk/z/c/a/a/c/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;

    const-string v1, "default-u"

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->d:Lcom/aggmoread/sdk/z/c/a/a/c/r/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->b:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/b;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->c:Lcom/aggmoread/sdk/z/c/a/a/c/b;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->b:Ljava/lang/String;

    return-void
.end method

.method public b()Lcom/aggmoread/sdk/z/c/a/a/c/b;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->c:Lcom/aggmoread/sdk/z/c/a/a/c/b;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/c/r/c;->a:Ljava/lang/String;

    return-void
.end method
