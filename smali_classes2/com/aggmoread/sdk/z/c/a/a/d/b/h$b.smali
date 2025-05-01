.class public Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/aggmoread/sdk/z/c/a/a/d/b/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private a:I

.field private b:Z

.field private c:Ljava/lang/String;

.field private d:Lcom/aggmoread/sdk/z/c/a/a/c/j;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->a:I

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/c/a/a/c/j;)Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->d:Lcom/aggmoread/sdk/z/c/a/a/c/j;

    return-object p0
.end method

.method public a()Lcom/aggmoread/sdk/z/c/a/a/d/b/h;
    .locals 2

    new-instance v0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;-><init>(Lcom/aggmoread/sdk/z/c/a/a/d/b/h$a;)V

    iget v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->a:I

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/h;I)I

    iget-boolean v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->b:Z

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/h;Z)Z

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->d:Lcom/aggmoread/sdk/z/c/a/a/c/j;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/h;Lcom/aggmoread/sdk/z/c/a/a/c/j;)Lcom/aggmoread/sdk/z/c/a/a/c/j;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/c/a/a/d/b/h$b;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/aggmoread/sdk/z/c/a/a/d/b/h;->a(Lcom/aggmoread/sdk/z/c/a/a/d/b/h;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method
