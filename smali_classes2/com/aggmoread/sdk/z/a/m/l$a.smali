.class final Lcom/aggmoread/sdk/z/a/m/l$a;
.super Lcom/aggmoread/sdk/z/a/r/g$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/aggmoread/sdk/z/a/m/l;->a(Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/i/b;Lcom/aggmoread/sdk/z/a/t/b$a;Lcom/aggmoread/sdk/z/a/m/l$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/aggmoread/sdk/z/a/g/c;

.field final synthetic b:Lcom/aggmoread/sdk/z/a/g/b;

.field final synthetic c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

.field final synthetic d:Lcom/aggmoread/sdk/z/a/m/l$c;


# direct methods
.method constructor <init>(Lcom/aggmoread/sdk/z/a/g/c;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/m/l$c;)V
    .locals 0

    iput-object p1, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->a:Lcom/aggmoread/sdk/z/a/g/c;

    iput-object p2, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->b:Lcom/aggmoread/sdk/z/a/g/b;

    iput-object p3, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    iput-object p4, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->d:Lcom/aggmoread/sdk/z/a/m/l$c;

    invoke-direct {p0}, Lcom/aggmoread/sdk/z/a/r/g$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/aggmoread/sdk/z/a/r/g$b;)V
    .locals 3

    invoke-virtual {p1}, Lcom/aggmoread/sdk/z/a/r/g$b;->a()Z

    move-result v0

    const-string v1, "JHAPIHTAG"

    if-eqz v0, :cond_0

    const-string p1, "ClickUrlRequestJuHeApi onResult enter, empty"

    invoke-static {v1, p1}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ClickUrlRequestJuHeApi onResult enter, clickUrlResponse = "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/aggmoread/sdk/z/a/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->a:Lcom/aggmoread/sdk/z/a/g/c;

    iget-object v1, p1, Lcom/aggmoread/sdk/z/a/r/g$b;->a:Ljava/lang/String;

    iput-object v1, v0, Lcom/aggmoread/sdk/z/a/g/c;->i:Ljava/lang/String;

    iget-object p1, p1, Lcom/aggmoread/sdk/z/a/r/g$b;->b:Ljava/lang/String;

    iget-object v1, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->b:Lcom/aggmoread/sdk/z/a/g/b;

    iget-object v2, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->c:Lcom/aggmoread/sdk/z/a/g/b$a$a;

    invoke-static {p1, v1, v2, v0}, Lcom/aggmoread/sdk/z/a/m/l;->a(Ljava/lang/String;Lcom/aggmoread/sdk/z/a/g/b;Lcom/aggmoread/sdk/z/a/g/b$a$a;Lcom/aggmoread/sdk/z/a/g/c;)V

    iget-object p1, p0, Lcom/aggmoread/sdk/z/a/m/l$a;->d:Lcom/aggmoread/sdk/z/a/m/l$c;

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/aggmoread/sdk/z/a/m/l$c;->a()V

    :cond_1
    return-void
.end method
