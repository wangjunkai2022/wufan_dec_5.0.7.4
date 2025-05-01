.class public Lcom/aggmoread/sdk/z/a/j/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/aggmoread/sdk/z/a/j/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/aggmoread/sdk/z/a/j/f;

    invoke-direct {v0}, Lcom/aggmoread/sdk/z/a/j/f;-><init>()V

    sput-object v0, Lcom/aggmoread/sdk/z/a/j/f;->a:Lcom/aggmoread/sdk/z/a/j/f;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/aggmoread/sdk/z/a/j/f;
    .locals 1

    sget-object v0, Lcom/aggmoread/sdk/z/a/j/f;->a:Lcom/aggmoread/sdk/z/a/j/f;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 1

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/f;->a()Lcom/aggmoread/sdk/z/a/m/k;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/aggmoread/sdk/z/a/m/k;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public a(Ljava/lang/String;I)V
    .locals 1

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {}, Lcom/aggmoread/sdk/z/a/m/f;->a()Lcom/aggmoread/sdk/z/a/m/k;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/aggmoread/sdk/z/a/m/k;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
