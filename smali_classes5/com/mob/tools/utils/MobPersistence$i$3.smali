.class Lcom/mob/tools/utils/MobPersistence$i$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/commons/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/tools/utils/MobPersistence$i;->d()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:[Z

.field final synthetic b:Lcom/mob/tools/utils/MobPersistence$i;


# direct methods
.method constructor <init>(Lcom/mob/tools/utils/MobPersistence$i;[Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    iput-object p2, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->a:[Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/mob/tools/utils/FileLocker;)Z
    .locals 7

    const/4 p1, 0x0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->f(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mob/tools/utils/MobPersistence$i$a;

    .line 2
    iget-object v3, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v3}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v3

    invoke-virtual {v1}, Lcom/mob/tools/utils/MobPersistence$i$a;->a()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 3
    iget-object v3, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v3}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/io/RandomAccessFile;->writeByte(I)V

    .line 4
    invoke-virtual {v1}, Lcom/mob/tools/utils/MobPersistence$i$a;->f()V

    goto :goto_0

    .line 5
    :cond_0
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->e(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/LinkedList;

    move-result-object v0

    iget-object v1, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v1}, Lcom/mob/tools/utils/MobPersistence$i;->f(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    .line 6
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->f(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/HashMap;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    const-wide/16 v0, 0x400

    .line 7
    iget-object v3, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v3}, Lcom/mob/tools/utils/MobPersistence$i;->e(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/util/LinkedList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/LinkedList;->size()I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v5, 0x29

    mul-long v3, v3, v5

    add-long/2addr v3, v0

    .line 8
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Ljava/io/RandomAccessFile;->setLength(J)V

    .line 9
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->a:[Z

    aput-boolean v2, v0, p1

    .line 10
    iget-object v0, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->g(Lcom/mob/tools/utils/MobPersistence$i;)V

    const-string v0, "Clear done, new size: "

    .line 11
    iget-object v1, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v1}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mob/tools/utils/MobPersistence;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    .line 12
    iget-object v1, p0, Lcom/mob/tools/utils/MobPersistence$i$3;->b:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v1}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/mob/tools/utils/MobPersistence;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_1
    return p1
.end method
