.class Lnet/lingala/zip4j/unzip/a;
.super Ljava/lang/Thread;
.source "Unzip.java"


# instance fields
.field final synthetic b:Lnet/lingala/zip4j/unzip/c;

.field private final synthetic c:Ljava/util/ArrayList;

.field private final synthetic d:Lw3/k;

.field private final synthetic e:Lx3/a;

.field private final synthetic f:Ljava/lang/String;


# direct methods
.method constructor <init>(Lnet/lingala/zip4j/unzip/c;Ljava/lang/String;Ljava/util/ArrayList;Lw3/k;Lx3/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lnet/lingala/zip4j/unzip/a;->b:Lnet/lingala/zip4j/unzip/c;

    iput-object p3, p0, Lnet/lingala/zip4j/unzip/a;->c:Ljava/util/ArrayList;

    iput-object p4, p0, Lnet/lingala/zip4j/unzip/a;->d:Lw3/k;

    iput-object p5, p0, Lnet/lingala/zip4j/unzip/a;->e:Lx3/a;

    iput-object p6, p0, Lnet/lingala/zip4j/unzip/a;->f:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/lingala/zip4j/unzip/a;->b:Lnet/lingala/zip4j/unzip/c;

    iget-object v1, p0, Lnet/lingala/zip4j/unzip/a;->c:Ljava/util/ArrayList;

    iget-object v2, p0, Lnet/lingala/zip4j/unzip/a;->d:Lw3/k;

    iget-object v3, p0, Lnet/lingala/zip4j/unzip/a;->e:Lx3/a;

    iget-object v4, p0, Lnet/lingala/zip4j/unzip/a;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lnet/lingala/zip4j/unzip/c;->a(Lnet/lingala/zip4j/unzip/c;Ljava/util/ArrayList;Lw3/k;Lx3/a;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lnet/lingala/zip4j/unzip/a;->e:Lx3/a;

    invoke-virtual {v0}, Lx3/a;->c()V
    :try_end_0
    .catch Lnet/lingala/zip4j/exception/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
