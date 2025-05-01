.class public abstract Lcom/aggmoread/sdk/z/a/m/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;)Lcom/aggmoread/sdk/z/a/m/h;
    .locals 1

    const/16 v0, 0x1000

    invoke-static {p0, p1, v0}, Lcom/aggmoread/sdk/z/a/m/h;->a(Landroid/content/Context;Ljava/lang/String;I)Lcom/aggmoread/sdk/z/a/m/h;

    move-result-object p0

    return-object p0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)Lcom/aggmoread/sdk/z/a/m/h;
    .locals 1

    const/16 v0, 0x1000

    if-ne v0, p2, :cond_0

    new-instance p2, Lcom/aggmoread/sdk/z/a/m/i;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/m/i;-><init>(Landroid/content/Context;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lcom/aggmoread/sdk/z/a/m/i;

    invoke-direct {p2, p0}, Lcom/aggmoread/sdk/z/a/m/i;-><init>(Landroid/content/Context;)V

    :goto_0
    invoke-virtual {p2, p1}, Lcom/aggmoread/sdk/z/a/m/h;->c(Ljava/lang/String;)V

    return-object p2
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract a(Ljava/lang/String;)Z
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract b(Ljava/lang/String;)Z
.end method

.method public abstract c(Ljava/lang/String;)V
.end method
