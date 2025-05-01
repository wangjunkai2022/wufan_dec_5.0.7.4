.class Lcom/beizi/ad/internal/b/c;
.super Ljava/lang/Object;
.source "Config.java"


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Lcom/beizi/ad/internal/b/a/c;

.field public final c:Lcom/beizi/ad/internal/b/a/a;

.field public final d:Lcom/beizi/ad/internal/b/b/c;


# direct methods
.method constructor <init>(Ljava/io/File;Lcom/beizi/ad/internal/b/a/c;Lcom/beizi/ad/internal/b/a/a;Lcom/beizi/ad/internal/b/b/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/beizi/ad/internal/b/c;->a:Ljava/io/File;

    .line 3
    iput-object p2, p0, Lcom/beizi/ad/internal/b/c;->b:Lcom/beizi/ad/internal/b/a/c;

    .line 4
    iput-object p3, p0, Lcom/beizi/ad/internal/b/c;->c:Lcom/beizi/ad/internal/b/a/a;

    .line 5
    iput-object p4, p0, Lcom/beizi/ad/internal/b/c;->d:Lcom/beizi/ad/internal/b/b/c;

    return-void
.end method


# virtual methods
.method a(Ljava/lang/String;)Ljava/io/File;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/beizi/ad/internal/b/c;->b:Lcom/beizi/ad/internal/b/a/c;

    invoke-interface {v0, p1}, Lcom/beizi/ad/internal/b/a/c;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/beizi/ad/internal/b/c;->a:Ljava/io/File;

    invoke-direct {v0, v1, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method
