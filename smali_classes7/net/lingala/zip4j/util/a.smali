.class Lnet/lingala/zip4j/util/a;
.super Ljava/lang/Thread;
.source "ArchiveMaintainer.java"


# instance fields
.field final synthetic b:Lnet/lingala/zip4j/util/c;

.field private final synthetic c:Lw3/o;

.field private final synthetic d:Lw3/h;

.field private final synthetic e:Lx3/a;


# direct methods
.method constructor <init>(Lnet/lingala/zip4j/util/c;Ljava/lang/String;Lw3/o;Lw3/h;Lx3/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 2
    iput-object p1, p0, Lnet/lingala/zip4j/util/a;->b:Lnet/lingala/zip4j/util/c;

    iput-object p3, p0, Lnet/lingala/zip4j/util/a;->c:Lw3/o;

    iput-object p4, p0, Lnet/lingala/zip4j/util/a;->d:Lw3/h;

    iput-object p5, p0, Lnet/lingala/zip4j/util/a;->e:Lx3/a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Lnet/lingala/zip4j/util/a;->b:Lnet/lingala/zip4j/util/c;

    iget-object v1, p0, Lnet/lingala/zip4j/util/a;->c:Lw3/o;

    iget-object v2, p0, Lnet/lingala/zip4j/util/a;->d:Lw3/h;

    iget-object v3, p0, Lnet/lingala/zip4j/util/a;->e:Lx3/a;

    invoke-virtual {v0, v1, v2, v3}, Lnet/lingala/zip4j/util/c;->j(Lw3/o;Lw3/h;Lx3/a;)Ljava/util/HashMap;

    .line 2
    iget-object v0, p0, Lnet/lingala/zip4j/util/a;->e:Lx3/a;

    invoke-virtual {v0}, Lx3/a;->c()V
    :try_end_0
    .catch Lnet/lingala/zip4j/exception/ZipException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
