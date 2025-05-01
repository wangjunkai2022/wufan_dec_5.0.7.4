.class Lcom/mob/tools/utils/MobPersistence$i$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/commons/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/tools/utils/MobPersistence$i;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/mob/tools/utils/MobPersistence$i;


# direct methods
.method constructor <init>(Lcom/mob/tools/utils/MobPersistence$i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/mob/tools/utils/FileLocker;)Z
    .locals 4

    .line 1
    :try_start_0
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->b(Lcom/mob/tools/utils/MobPersistence$i;)Landroid/content/Context;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 2
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->b(Lcom/mob/tools/utils/MobPersistence$i;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence;->a(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    .line 3
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v2}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Ljava/io/File;)Ljava/io/File;

    .line 4
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_0

    .line 5
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->mkdirs()Z

    .line 6
    :cond_0
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->length()J

    move-result-wide v0

    const-wide/32 v2, 0xa800

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    .line 7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Del dirty, size: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->length()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", min: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mob/tools/utils/MobPersistence;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 9
    :cond_1
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    move-result p1

    if-nez p1, :cond_2

    .line 10
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->createNewFile()Z

    .line 11
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object v1

    const-string v2, "002?ekgh"

    invoke-static {v2}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Ljava/io/RandomAccessFile;)Ljava/io/RandomAccessFile;

    .line 12
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    const/16 v0, 0x400

    invoke-static {p1, v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;I)V

    goto :goto_0

    .line 13
    :cond_2
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    new-instance v0, Ljava/io/RandomAccessFile;

    iget-object v1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v1}, Lcom/mob/tools/utils/MobPersistence$i;->c(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/File;

    move-result-object v1

    const-string v2, "002\'ekgh"

    invoke-static {v2}, Lcom/mob/commons/a/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Ljava/io/RandomAccessFile;)Ljava/io/RandomAccessFile;

    .line 14
    iget-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {p1}, Lcom/mob/tools/utils/MobPersistence$i;->d(Lcom/mob/tools/utils/MobPersistence$i;)Z

    .line 15
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "ava sz "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->e(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/LinkedList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedList;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " useds "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->f(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mob/tools/utils/MobPersistence;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 16
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$1;->a:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/mob/tools/utils/MobPersistence;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
