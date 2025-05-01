.class Lcom/mob/tools/utils/MobPersistence$i$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/mob/commons/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mob/tools/utils/MobPersistence$i;->a(Ljava/util/List;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lcom/mob/tools/utils/MobPersistence$i;


# direct methods
.method constructor <init>(Lcom/mob/tools/utils/MobPersistence$i;Ljava/util/List;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    iput-object p2, p0, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    iput-object p3, p0, Lcom/mob/tools/utils/MobPersistence$i$2;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/mob/tools/utils/FileLocker;)Z
    .locals 22

    move-object/from16 v1, p0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    .line 2
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->d(Lcom/mob/tools/utils/MobPersistence$i;)Z

    .line 3
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x1

    if-le v0, v5, :cond_6

    .line 4
    new-instance v6, Ljava/util/LinkedList;

    invoke-direct {v6}, Ljava/util/LinkedList;-><init>()V

    .line 5
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v7, v0, [[B

    .line 6
    iget-object v8, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_0
    const/4 v10, 0x0

    if-ge v9, v8, :cond_0

    .line 7
    iget-object v11, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v11, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/mob/tools/utils/MobPersistence$j;

    .line 8
    new-instance v12, Lcom/mob/tools/utils/MobPersistence$g;

    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$j;->b(Lcom/mob/tools/utils/MobPersistence$j;)[B

    move-result-object v13

    invoke-direct {v12, v13}, Lcom/mob/tools/utils/MobPersistence$g;-><init>([B)V

    .line 9
    new-instance v13, Lcom/mob/tools/utils/MobPersistence$a;

    invoke-virtual {v11}, Lcom/mob/tools/utils/MobPersistence$j;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v11}, Lcom/mob/tools/utils/MobPersistence$j;->c()Ljava/lang/Object;

    move-result-object v15

    invoke-direct {v13, v14, v15}, Lcom/mob/tools/utils/MobPersistence$a;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 10
    iget-object v14, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v14}, Lcom/mob/tools/utils/MobPersistence$i;->h(Lcom/mob/tools/utils/MobPersistence$i;)Lcom/mob/tools/utils/MobPersistence$f;

    move-result-object v14

    invoke-virtual {v13}, Lcom/mob/tools/utils/MobPersistence$a;->b()Ljava/util/HashMap;

    move-result-object v13

    invoke-static {v14, v13}, Lcom/mob/tools/utils/MobPersistence$f;->a(Lcom/mob/tools/utils/MobPersistence$f;Ljava/lang/Object;)[B

    move-result-object v13

    .line 11
    iget-object v14, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v14, v12}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$g;)Lcom/mob/tools/utils/MobPersistence$i$a;

    move-result-object v12

    const/16 v16, 0x0

    .line 12
    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$j;->b(Lcom/mob/tools/utils/MobPersistence$j;)[B

    move-result-object v17

    array-length v14, v13

    int-to-long v14, v14

    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$j;->c(Lcom/mob/tools/utils/MobPersistence$j;)J

    move-result-wide v20

    move-wide/from16 v18, v14

    move-object v15, v12

    invoke-virtual/range {v15 .. v21}, Lcom/mob/tools/utils/MobPersistence$i$a;->a(B[BJJ)V

    .line 13
    iget-object v14, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v14}, Lcom/mob/tools/utils/MobPersistence$i;->i(Lcom/mob/tools/utils/MobPersistence$i;)Lcom/mob/tools/utils/MobPersistence$h;

    move-result-object v14

    new-instance v15, Lcom/mob/tools/utils/MobPersistence$g;

    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$j;->d(Lcom/mob/tools/utils/MobPersistence$j;)[B

    move-result-object v5

    invoke-direct {v15, v5}, Lcom/mob/tools/utils/MobPersistence$g;-><init>([B)V

    new-instance v5, Lcom/mob/tools/utils/MobPersistence$c;

    move-wide/from16 v17, v3

    .line 14
    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$j;->c(Lcom/mob/tools/utils/MobPersistence$j;)J

    move-result-wide v2

    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$j;->e(Lcom/mob/tools/utils/MobPersistence$j;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v5, v2, v3, v4, v10}, Lcom/mob/tools/utils/MobPersistence$c;-><init>(JLjava/lang/Object;Lcom/mob/tools/utils/MobPersistence$1;)V

    .line 15
    invoke-static {v14, v15, v5}, Lcom/mob/tools/utils/MobPersistence$h;->a(Lcom/mob/tools/utils/MobPersistence$h;Lcom/mob/tools/utils/MobPersistence$g;Lcom/mob/tools/utils/MobPersistence$c;)V

    .line 16
    invoke-virtual {v6, v12}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 17
    aput-object v13, v7, v9

    add-int/lit8 v9, v9, 0x1

    move-wide/from16 v3, v17

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    move-wide/from16 v17, v3

    .line 18
    iget-object v2, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v2}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 v4, 0x2

    .line 19
    :try_start_1
    new-instance v5, Ljava/io/FileOutputStream;

    iget-object v9, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v9}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v9

    invoke-virtual {v9}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v9

    invoke-direct {v5, v9}, Ljava/io/FileOutputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 20
    :try_start_2
    new-instance v9, Ljava/io/BufferedOutputStream;

    invoke-direct {v9, v5}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 21
    :try_start_3
    iget-object v10, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v10}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v10

    iget-object v11, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v11}, Lcom/mob/tools/utils/MobPersistence$i;->j(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/io/RandomAccessFile;

    move-result-object v11

    invoke-virtual {v11}, Ljava/io/RandomAccessFile;->length()J

    move-result-wide v11

    invoke-virtual {v10, v11, v12}, Ljava/io/RandomAccessFile;->seek(J)V

    const/4 v10, 0x0

    :goto_1
    if-ge v10, v0, :cond_1

    .line 22
    aget-object v11, v7, v10

    .line 23
    array-length v12, v11

    const/4 v13, 0x0

    invoke-virtual {v9, v11, v13, v12}, Ljava/io/BufferedOutputStream;->write([BII)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {v9}, Ljava/io/BufferedOutputStream;->flush()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    new-array v0, v4, [Ljava/io/Closeable;

    const/4 v4, 0x0

    aput-object v9, v0, v4

    const/4 v4, 0x1

    aput-object v5, v0, v4

    .line 25
    invoke-static {v0}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    const/4 v5, 0x1

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object v10, v9

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v5, v10

    .line 26
    :goto_2
    :try_start_5
    iget-object v9, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v9}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/mob/tools/utils/MobPersistence;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "sta err sz "

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v9, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v9, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v9}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lcom/mob/tools/utils/MobPersistence;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    invoke-virtual {v6}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/mob/tools/utils/MobPersistence$i$a;

    .line 29
    invoke-static {v9}, Lcom/mob/tools/utils/MobPersistence$i$a;->g(Lcom/mob/tools/utils/MobPersistence$i$a;)B

    move-result v11

    if-nez v11, :cond_2

    .line 30
    iget-object v11, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v11, v9}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$i$a;)V

    goto :goto_3

    .line 31
    :cond_3
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->b:Ljava/util/List;

    iget-object v9, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    new-array v0, v4, [Ljava/io/Closeable;

    const/4 v4, 0x0

    aput-object v10, v0, v4

    const/4 v4, 0x1

    aput-object v5, v0, v4

    .line 32
    invoke-static {v0}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_5

    const/4 v0, 0x0

    :goto_5
    if-ge v0, v8, :cond_5

    .line 33
    invoke-virtual {v6, v0}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/mob/tools/utils/MobPersistence$i$a;

    .line 34
    invoke-static {v4, v2, v3}, Lcom/mob/tools/utils/MobPersistence$i$a;->d(Lcom/mob/tools/utils/MobPersistence$i$a;J)J

    .line 35
    iget-object v5, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v5, v4}, Lcom/mob/tools/utils/MobPersistence$i;->b(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$i$a;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 36
    aget-object v4, v7, v0

    array-length v4, v4

    int-to-long v4, v4

    add-long/2addr v2, v4

    goto :goto_6

    .line 37
    :cond_4
    iget-object v5, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v5, v4}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$i$a;)V

    .line 38
    iget-object v4, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->b:Ljava/util/List;

    iget-object v5, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    .line 39
    :cond_5
    invoke-virtual {v6}, Ljava/util/LinkedList;->clear()V

    goto :goto_7

    :catchall_3
    move-exception v0

    new-array v2, v4, [Ljava/io/Closeable;

    const/4 v3, 0x0

    aput-object v10, v2, v3

    const/4 v3, 0x1

    aput-object v5, v2, v3

    .line 40
    invoke-static {v2}, Lcom/mob/commons/v;->a([Ljava/io/Closeable;)V

    .line 41
    throw v0

    :cond_6
    move-wide/from16 v17, v3

    .line 42
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/mob/tools/utils/MobPersistence$j;

    .line 43
    new-instance v0, Lcom/mob/tools/utils/MobPersistence$g;

    invoke-static {v2}, Lcom/mob/tools/utils/MobPersistence$j;->b(Lcom/mob/tools/utils/MobPersistence$j;)[B

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/mob/tools/utils/MobPersistence$g;-><init>([B)V

    .line 44
    iget-object v3, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v3, v0}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$g;)Lcom/mob/tools/utils/MobPersistence$i$a;

    move-result-object v3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 45
    :try_start_7
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0, v3, v2}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$i$a;Lcom/mob/tools/utils/MobPersistence$j;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_7

    :catchall_4
    move-exception v0

    .line 46
    :try_start_8
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "set fail "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v4, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v4}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lcom/mob/tools/utils/MobPersistence;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0, v3}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;Lcom/mob/tools/utils/MobPersistence$i$a;)V

    .line 48
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->b:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    :goto_7
    iget-object v0, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v0}, Lcom/mob/tools/utils/MobPersistence$i;->g(Lcom/mob/tools/utils/MobPersistence$i;)V

    .line 50
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " all cost "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v2, v2, v17

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " size "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->a:Ljava/util/List;

    .line 51
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v2, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v2}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v2

    .line 52
    invoke-static {v0, v2}, Lcom/mob/tools/utils/MobPersistence;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_8

    :catchall_5
    move-exception v0

    .line 53
    iget-object v2, v1, Lcom/mob/tools/utils/MobPersistence$i$2;->c:Lcom/mob/tools/utils/MobPersistence$i;

    invoke-static {v2}, Lcom/mob/tools/utils/MobPersistence$i;->a(Lcom/mob/tools/utils/MobPersistence$i;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/mob/tools/utils/MobPersistence;->a(Ljava/lang/Throwable;Ljava/lang/String;)V

    :goto_8
    const/4 v2, 0x0

    return v2
.end method
