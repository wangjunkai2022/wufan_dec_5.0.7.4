.class Lnet/lingala/zip4j/unzip/b;
.super Ljava/lang/Thread;
.source "Unzip.java"


# instance fields
.field final synthetic b:Lnet/lingala/zip4j/unzip/c;

.field private final synthetic c:Lw3/h;

.field private final synthetic d:Ljava/lang/String;

.field private final synthetic e:Lw3/k;

.field private final synthetic f:Ljava/lang/String;

.field private final synthetic g:Lx3/a;


# direct methods
.method constructor <init>(Lnet/lingala/zip4j/unzip/c;Ljava/lang/String;Lw3/h;Ljava/lang/String;Lw3/k;Ljava/lang/String;Lx3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lnet/lingala/zip4j/unzip/b;->b:Lnet/lingala/zip4j/unzip/c;

    iput-object p3, p0, Lnet/lingala/zip4j/unzip/b;->c:Lw3/h;

    iput-object p4, p0, Lnet/lingala/zip4j/unzip/b;->d:Ljava/lang/String;

    iput-object p5, p0, Lnet/lingala/zip4j/unzip/b;->e:Lw3/k;

    iput-object p6, p0, Lnet/lingala/zip4j/unzip/b;->f:Ljava/lang/String;

    iput-object p7, p0, Lnet/lingala/zip4j/unzip/b;->g:Lx3/a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/lingala/zip4j/unzip/b;->b:Lnet/lingala/zip4j/unzip/c;

    iget-object v1, p0, Lnet/lingala/zip4j/unzip/b;->c:Lw3/h;

    iget-object v2, p0, Lnet/lingala/zip4j/unzip/b;->d:Ljava/lang/String;

    iget-object v3, p0, Lnet/lingala/zip4j/unzip/b;->e:Lw3/k;

    iget-object v4, p0, Lnet/lingala/zip4j/unzip/b;->f:Ljava/lang/String;

    iget-object v5, p0, Lnet/lingala/zip4j/unzip/b;->g:Lx3/a;

    invoke-static/range {v0 .. v5}, Lnet/lingala/zip4j/unzip/c;->b(Lnet/lingala/zip4j/unzip/c;Lw3/h;Ljava/lang/String;Lw3/k;Ljava/lang/String;Lx3/a;)V

    .line 2
    iget-object v0, p0, Lnet/lingala/zip4j/unzip/b;->g:Lx3/a;

    invoke-virtual {v0}, Lx3/a;->c()V
    :try_end_0
    .catch Lnet/lingala/zip4j/exception/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
