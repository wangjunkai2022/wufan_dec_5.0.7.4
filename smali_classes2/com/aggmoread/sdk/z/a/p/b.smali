.class public Lcom/aggmoread/sdk/z/a/p/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/aggmoread/sdk/z/a/p/b;

.field public static final c:Lcom/aggmoread/sdk/z/a/p/b;

.field public static final d:Lcom/aggmoread/sdk/z/a/p/b;

.field public static final e:Lcom/aggmoread/sdk/z/a/p/b;


# instance fields
.field private a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/b$a;

    const/16 v1, 0x63

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/p/b$a;-><init>(I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/p/b;->b:Lcom/aggmoread/sdk/z/a/p/b;

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/b$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/p/b$b;-><init>(I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/p/b;->c:Lcom/aggmoread/sdk/z/a/p/b;

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/b$c;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/p/b$c;-><init>(I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/p/b;->d:Lcom/aggmoread/sdk/z/a/p/b;

    new-instance v0, Lcom/aggmoread/sdk/z/a/p/b$d;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/a/p/b$d;-><init>(I)V

    sput-object v0, Lcom/aggmoread/sdk/z/a/p/b;->e:Lcom/aggmoread/sdk/z/a/p/b;

    return-void
.end method

.method private constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/aggmoread/sdk/z/a/p/b;->a:I

    return-void
.end method

.method synthetic constructor <init>(ILcom/aggmoread/sdk/z/a/p/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/aggmoread/sdk/z/a/p/b;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/aggmoread/sdk/z/a/p/b;->a:I

    return v0
.end method
