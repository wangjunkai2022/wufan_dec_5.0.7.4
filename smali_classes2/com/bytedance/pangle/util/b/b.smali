.class public final Lcom/bytedance/pangle/util/b/b;
.super Ljava/lang/Object;


# direct methods
.method private static a(ILjava/lang/String;IJLjava/lang/Throwable;Ljava/lang/String;)V
    .locals 4

    .line 121
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 122
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 123
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v3, "status_code"

    .line 124
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, v3, p0}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "plugin_package_name"

    .line 125
    invoke-static {p1}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "version_code"

    .line 126
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "duration"

    .line 127
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lcom/bytedance/pangle/log/b;->b(Ljava/lang/Object;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "message"

    .line 128
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p5}, Lcom/bytedance/pangle/log/b;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p0, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 129
    invoke-virtual {p0}, Lorg/json/JSONException;->printStackTrace()V

    .line 130
    :goto_0
    invoke-static {}, Lcom/bytedance/pangle/c/b;->a()Lcom/bytedance/pangle/c/b;

    move-result-object p0

    sget-object p1, Lcom/bytedance/pangle/c/b;->k:Ljava/lang/String;

    invoke-virtual {p0, p1, v0, v2, v1}, Lcom/bytedance/pangle/c/b;->a(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static a(Ljava/lang/String;ZZLjava/lang/String;II)Z
    .locals 30

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p5

    const-string v4, "[shootsTag]"

    const-string v5, "Zeus_pangle"

    const-string v6, "rmSo:"

    const-string v7, " rmDex:"

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    .line 2
    :try_start_0
    new-instance v0, Lcom/bytedance/pangle/util/b/a/a;

    invoke-direct {v0}, Lcom/bytedance/pangle/util/b/a/a;-><init>()V

    invoke-static/range {p0 .. p0}, Lcom/bytedance/pangle/util/b/a/a;->a(Ljava/lang/String;)Lcom/bytedance/pangle/util/b/b/d;

    move-result-object v0

    .line 3
    new-instance v13, Lcom/bytedance/pangle/util/b/a;

    invoke-direct {v13, v0}, Lcom/bytedance/pangle/util/b/a;-><init>(Lcom/bytedance/pangle/util/b/b/d;)V

    .line 4
    new-instance v14, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v15, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 5
    iget-object v15, v15, Lcom/bytedance/pangle/util/b/b/d;->d:Ljava/io/File;

    .line 6
    invoke-virtual {v15}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, ".rm_tmp"

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v14, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 7
    invoke-virtual {v14}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 8
    invoke-virtual {v14}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_12

    .line 9
    :cond_0
    :try_start_1
    new-instance v15, Ljava/io/RandomAccessFile;

    const-string v0, "rw"

    invoke-direct {v15, v14, v0}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_10

    .line 10
    :try_start_2
    new-instance v10, Ljava/io/RandomAccessFile;

    iget-object v0, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 11
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/d;->d:Ljava/io/File;

    const-string v11, "r"

    .line 12
    invoke-direct {v10, v0, v11}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_f

    .line 13
    :try_start_3
    iget-object v0, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 14
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    .line 15
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    .line 16
    new-instance v11, Ljava/util/HashSet;

    invoke-direct {v11}, Ljava/util/HashSet;-><init>()V

    .line 17
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v12, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_e

    if-eqz v16, :cond_8

    :try_start_4
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v24, v0

    move-object/from16 v0, v16

    check-cast v0, Lcom/bytedance/pangle/util/b/b/c;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    if-eqz v1, :cond_2

    .line 18
    :try_start_5
    invoke-static {}, Lcom/bytedance/pangle/util/i;->d()Z

    move-result v16
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v16, :cond_1

    move-wide/from16 v25, v8

    .line 19
    :try_start_6
    iget-object v8, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    const-string v9, "classes.dex"

    .line 20
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_1

    :cond_1
    move-wide/from16 v25, v8

    .line 21
    :goto_1
    iget-object v8, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    const-string v9, "classes"

    .line 22
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 23
    iget-object v8, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    const-string v9, ".dex"

    .line 24
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_3

    :catchall_0
    move-exception v0

    move-wide/from16 v25, v8

    :goto_2
    move-object v8, v4

    move-object v9, v5

    move-object/from16 v23, v15

    move v5, v1

    move v4, v2

    move-object v2, v6

    move-object v15, v10

    const/4 v6, 0x0

    goto/16 :goto_10

    :cond_2
    move-wide/from16 v25, v8

    :cond_3
    if-eqz v2, :cond_4

    .line 25
    iget-object v8, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    const-string v9, "lib/"

    .line 26
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 27
    iget-object v8, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    const-string v9, ".so"

    .line 28
    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_4

    :goto_3
    const/4 v8, 0x1

    goto :goto_4

    :catchall_1
    move-exception v0

    goto :goto_2

    :cond_4
    const/4 v8, 0x0

    :goto_4
    if-eqz v8, :cond_5

    .line 29
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    .line 30
    invoke-interface {v11, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    move-object/from16 v0, v24

    move-wide/from16 v8, v25

    goto :goto_0

    .line 31
    :cond_5
    :try_start_7
    iget-wide v8, v0, Lcom/bytedance/pangle/util/b/b/c;->i:J
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    move-object/from16 v27, v5

    :try_start_8
    const-string v5, "resources.arsc"
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    move-object/from16 v28, v4

    .line 32
    :try_start_9
    iget-object v4, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    .line 33
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 34
    invoke-virtual {v15}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v4

    .line 35
    invoke-virtual {v0}, Lcom/bytedance/pangle/util/b/b/c;->c()J

    move-result-wide v16

    add-long v4, v4, v16

    const-wide/16 v16, 0x1000

    .line 36
    rem-long v18, v4, v16

    const-wide/16 v20, 0x0

    cmp-long v22, v18, v20

    if-nez v22, :cond_6

    move-wide/from16 v1, v20

    goto :goto_5

    .line 37
    :cond_6
    iget v1, v0, Lcom/bytedance/pangle/util/b/b/c;->g:I

    int-to-long v1, v1

    sub-long/2addr v4, v1

    .line 38
    rem-long v4, v4, v16

    sub-long v16, v16, v4

    move-wide/from16 v1, v16

    :goto_5
    cmp-long v4, v1, v20

    if-eqz v4, :cond_7

    .line 39
    iget v4, v0, Lcom/bytedance/pangle/util/b/b/c;->g:I

    long-to-int v2, v1

    .line 40
    iput v2, v0, Lcom/bytedance/pangle/util/b/b/c;->g:I

    const-wide/16 v20, 0x1c

    .line 41
    iget-object v1, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    move-object/from16 v16, v10

    move-object/from16 v17, v15

    move-wide/from16 v18, v8

    move-object/from16 v22, v1

    .line 42
    invoke-static/range {v16 .. v22}, Lcom/bytedance/pangle/util/b/a;->a(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;JJLjava/lang/String;)V

    .line 43
    iget-object v1, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 44
    iget-object v1, v1, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 45
    iget-object v5, v1, Lcom/bytedance/pangle/util/b/a/c;->a:[B

    invoke-static {v5, v2}, Lcom/bytedance/pangle/util/b/a/c;->a([BI)V

    .line 46
    iget-object v1, v1, Lcom/bytedance/pangle/util/b/a/c;->a:[B

    invoke-virtual {v15, v1}, Ljava/io/RandomAccessFile;->write([B)V

    const-wide/16 v16, 0x1c

    add-long v8, v8, v16

    const-wide/16 v16, 0x2

    add-long v8, v8, v16

    .line 47
    iget v1, v0, Lcom/bytedance/pangle/util/b/b/c;->e:I
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    move-object/from16 v29, v6

    int-to-long v5, v1

    .line 48
    :try_start_a
    iget-object v1, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    move-object/from16 v16, v10

    move-object/from16 v17, v15

    move-wide/from16 v18, v8

    move-wide/from16 v20, v5

    move-object/from16 v22, v1

    .line 49
    invoke-static/range {v16 .. v22}, Lcom/bytedance/pangle/util/b/a;->a(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;JJLjava/lang/String;)V

    .line 50
    new-array v1, v2, [B

    .line 51
    invoke-virtual {v15, v1}, Ljava/io/RandomAccessFile;->write([B)V

    .line 52
    iget v1, v0, Lcom/bytedance/pangle/util/b/b/c;->e:I

    int-to-long v1, v1

    add-long/2addr v8, v1

    int-to-long v1, v4

    add-long v18, v8, v1

    .line 53
    invoke-virtual {v0}, Lcom/bytedance/pangle/util/b/b/c;->a()J

    move-result-wide v20

    .line 54
    iget-object v1, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    move-object/from16 v16, v10

    move-object/from16 v17, v15

    move-object/from16 v22, v1

    .line 55
    invoke-static/range {v16 .. v22}, Lcom/bytedance/pangle/util/b/a;->a(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;JJLjava/lang/String;)V

    goto :goto_6

    :cond_7
    move-object/from16 v29, v6

    .line 56
    invoke-virtual {v0}, Lcom/bytedance/pangle/util/b/b/c;->b()J

    move-result-wide v20

    .line 57
    iget-object v1, v0, Lcom/bytedance/pangle/util/b/b/c;->h:Ljava/lang/String;

    move-object/from16 v16, v10

    move-object/from16 v17, v15

    move-wide/from16 v18, v8

    move-object/from16 v22, v1

    .line 58
    invoke-static/range {v16 .. v22}, Lcom/bytedance/pangle/util/b/a;->a(Ljava/io/RandomAccessFile;Ljava/io/RandomAccessFile;JJLjava/lang/String;)V

    :goto_6
    int-to-long v1, v12

    .line 59
    iput-wide v1, v0, Lcom/bytedance/pangle/util/b/b/c;->i:J

    .line 60
    invoke-virtual {v0}, Lcom/bytedance/pangle/util/b/b/c;->b()J

    move-result-wide v4
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    add-long/2addr v1, v4

    long-to-int v12, v1

    move/from16 v1, p1

    move/from16 v2, p2

    move-object/from16 v0, v24

    move-wide/from16 v8, v25

    move-object/from16 v5, v27

    move-object/from16 v4, v28

    move-object/from16 v6, v29

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v23, v15

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    goto :goto_7

    :catchall_3
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object v2, v6

    move-object/from16 v23, v15

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    :goto_7
    const/4 v6, 0x0

    goto/16 :goto_f

    :catchall_4
    move-exception v0

    move/from16 v5, p1

    move-object v8, v4

    move-object v2, v6

    move-object/from16 v23, v15

    move-object/from16 v9, v27

    const/4 v6, 0x0

    goto :goto_9

    :catchall_5
    move-exception v0

    goto :goto_8

    :catchall_6
    move-exception v0

    move-wide/from16 v25, v8

    :goto_8
    move-object v8, v4

    move-object v9, v5

    move-object v2, v6

    move-object/from16 v23, v15

    const/4 v6, 0x0

    move/from16 v5, p1

    :goto_9
    move/from16 v4, p2

    goto/16 :goto_f

    :cond_8
    move-object/from16 v28, v4

    move-object/from16 v27, v5

    move-object/from16 v29, v6

    move-wide/from16 v25, v8

    .line 61
    :try_start_b
    iget-object v0, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 62
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    .line 63
    invoke-virtual {v0, v11}, Lcom/bytedance/pangle/util/b/b/a;->a(Ljava/util/Set;)V

    .line 64
    iget-object v0, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_d

    if-eqz v0, :cond_e

    .line 65
    :try_start_c
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    .line 66
    :try_start_d
    invoke-virtual {v15}, Ljava/io/RandomAccessFile;->getFilePointer()J

    move-result-wide v4

    .line 67
    invoke-static {v0, v1}, Lcom/bytedance/pangle/util/b/a/b;->a(Lcom/bytedance/pangle/util/b/b/d;Ljava/io/ByteArrayOutputStream;)V

    .line 68
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    long-to-int v5, v4

    .line 69
    iget-object v4, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    const v6, 0x6054b50

    .line 70
    invoke-virtual {v4, v1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 71
    iget-object v4, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    const/4 v6, 0x0

    .line 72
    :try_start_e
    invoke-virtual {v4, v1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 73
    iget-object v4, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 74
    invoke-virtual {v4, v1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    .line 75
    :try_start_f
    iget-object v4, v0, Lcom/bytedance/pangle/util/b/b/d;->a:Lcom/bytedance/pangle/util/b/b/a;

    .line 76
    iget-object v4, v4, Lcom/bytedance/pangle/util/b/b/a;->a:Ljava/util/List;

    .line 77
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    .line 78
    iget-object v6, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 79
    invoke-virtual {v6, v1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 80
    iget-object v6, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 81
    invoke-virtual {v6, v1, v4}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 82
    iget-object v4, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 83
    invoke-virtual {v4, v1, v2}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 84
    iget-object v2, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;

    .line 85
    invoke-virtual {v2, v1, v5}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/OutputStream;I)V

    .line 86
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/d;->c:Lcom/bytedance/pangle/util/b/a/c;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    const/4 v6, 0x0

    .line 87
    :try_start_10
    invoke-virtual {v0, v1, v6}, Lcom/bytedance/pangle/util/b/a/c;->a(Ljava/io/ByteArrayOutputStream;I)V

    .line 88
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    invoke-virtual {v15, v0}, Ljava/io/RandomAccessFile;->write([B)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_9

    .line 89
    :try_start_11
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 90
    iget-object v0, v13, Lcom/bytedance/pangle/util/b/a;->a:Lcom/bytedance/pangle/util/b/b/d;

    .line 91
    iget-object v0, v0, Lcom/bytedance/pangle/util/b/b/d;->d:Ljava/io/File;

    .line 92
    invoke-virtual {v14, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    if-eqz v0, :cond_c

    .line 93
    :try_start_12
    invoke-virtual {v10}, Ljava/io/RandomAccessFile;->close()V

    .line 94
    invoke-virtual {v15}, Ljava/io/RandomAccessFile;->close()V

    .line 95
    invoke-static {v14}, Lcom/bytedance/pangle/util/b/a;->a(Ljava/io/File;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    if-eqz v3, :cond_b

    const/4 v1, 0x1

    if-ne v3, v1, :cond_9

    .line 96
    sget v12, Lcom/bytedance/pangle/c/b$a;->a:I

    :goto_a
    move v0, v12

    goto :goto_b

    :cond_9
    const/4 v1, 0x2

    if-ne v3, v1, :cond_a

    .line 97
    sget v12, Lcom/bytedance/pangle/c/b$a;->b:I

    goto :goto_a

    :cond_a
    const/4 v0, 0x0

    .line 98
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    move-object/from16 v2, v29

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v4, p2

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v5, p1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 99
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v8, v28

    invoke-virtual {v8, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v9, v27

    invoke-static {v9, v1}, Lcom/bytedance/pangle/log/ZeusLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    sub-long v3, v1, v25

    const/4 v5, 0x0

    move-object/from16 v1, p3

    move/from16 v2, p4

    invoke-static/range {v0 .. v6}, Lcom/bytedance/pangle/util/b/b;->a(ILjava/lang/String;IJLjava/lang/Throwable;Ljava/lang/String;)V

    :cond_b
    const/4 v11, 0x1

    goto/16 :goto_15

    :catchall_7
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    goto/16 :goto_12

    :cond_c
    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    .line 101
    :try_start_13
    new-instance v0, Ljava/util/zip/ZipException;

    const-string v1, "cannot rename modified zip file"

    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_8
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    goto/16 :goto_e

    :catchall_9
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    goto :goto_c

    :catchall_a
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    const/4 v6, 0x0

    goto :goto_c

    :catchall_b
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    const/4 v6, 0x0

    const/4 v1, 0x0

    :goto_c
    if-eqz v1, :cond_d

    .line 102
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 103
    :cond_d
    throw v0

    :cond_e
    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    const/4 v6, 0x0

    .line 104
    new-instance v0, Ljava/io/IOException;

    const-string v1, "input parameters is null, cannot finalize zip file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_c

    :catchall_c
    move-exception v0

    goto :goto_e

    :catchall_d
    move-exception v0

    move/from16 v5, p1

    move/from16 v4, p2

    move-object/from16 v9, v27

    move-object/from16 v8, v28

    move-object/from16 v2, v29

    goto :goto_d

    :catchall_e
    move-exception v0

    move-wide/from16 v25, v8

    move-object v8, v4

    move-object v9, v5

    move v5, v1

    move v4, v2

    move-object v2, v6

    :goto_d
    const/4 v6, 0x0

    :goto_e
    move-object/from16 v23, v15

    :goto_f
    move-object v15, v10

    goto :goto_10

    :catchall_f
    move-exception v0

    move-wide/from16 v25, v8

    move-object v8, v4

    move-object v9, v5

    move v5, v1

    move v4, v2

    move-object v2, v6

    const/4 v6, 0x0

    move-object/from16 v23, v15

    const/4 v15, 0x0

    goto :goto_10

    :catchall_10
    move-exception v0

    move-wide/from16 v25, v8

    move-object v8, v4

    move-object v9, v5

    move v5, v1

    move v4, v2

    move-object v2, v6

    const/4 v6, 0x0

    const/4 v15, 0x0

    const/16 v23, 0x0

    :goto_10
    if-eqz v15, :cond_f

    .line 105
    :try_start_14
    invoke-virtual {v15}, Ljava/io/RandomAccessFile;->close()V

    goto :goto_11

    :catchall_11
    move-exception v0

    goto :goto_12

    :cond_f
    :goto_11
    if-eqz v23, :cond_10

    .line 106
    invoke-virtual/range {v23 .. v23}, Ljava/io/RandomAccessFile;->close()V

    .line 107
    :cond_10
    invoke-static {v14}, Lcom/bytedance/pangle/util/b/a;->a(Ljava/io/File;)V

    .line 108
    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_11

    :catchall_12
    move-exception v0

    move-wide/from16 v25, v8

    move-object v8, v4

    move-object v9, v5

    move v5, v1

    move v4, v2

    move-object v2, v6

    const/4 v6, 0x0

    :goto_12
    move-object v1, v0

    :try_start_15
    const-string v0, "Zeus/install_pangle"

    .line 109
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "rmEntries failed. zipFile:"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v11, p0

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v11, " rmSO:"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-static {v0, v10, v1}, Lcom/bytedance/pangle/log/ZeusLogger;->errReport(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_13

    if-eqz v3, :cond_13

    const/4 v10, 0x1

    if-ne v3, v10, :cond_11

    .line 110
    sget v0, Lcom/bytedance/pangle/c/b$a;->c:I

    :goto_13
    move/from16 v16, v0

    goto :goto_14

    :cond_11
    const/4 v10, 0x2

    if-ne v3, v10, :cond_12

    .line 111
    sget v0, Lcom/bytedance/pangle/c/b$a;->d:I

    goto :goto_13

    :cond_12
    const/16 v16, 0x0

    .line 112
    :goto_14
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 113
    invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/bytedance/pangle/log/ZeusLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v19, v2, v25

    move-object/from16 v17, p3

    move/from16 v18, p4

    move-object/from16 v21, v1

    invoke-static/range {v16 .. v22}, Lcom/bytedance/pangle/util/b/b;->a(ILjava/lang/String;IJLjava/lang/Throwable;Ljava/lang/String;)V

    :cond_13
    const/4 v11, 0x0

    :goto_15
    return v11

    :catchall_13
    move-exception v0

    if-eqz v3, :cond_16

    const/4 v10, 0x1

    if-eq v3, v10, :cond_15

    const/4 v10, 0x2

    if-ne v3, v10, :cond_14

    .line 115
    sget v12, Lcom/bytedance/pangle/c/b$a;->d:I

    goto :goto_16

    :cond_14
    const/16 v16, 0x0

    goto :goto_17

    .line 116
    :cond_15
    sget v12, Lcom/bytedance/pangle/c/b$a;->c:I

    :goto_16
    move/from16 v16, v12

    .line 117
    :goto_17
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v22

    .line 118
    invoke-static/range {v22 .. v22}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v8, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v9, v2}, Lcom/bytedance/pangle/log/ZeusLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long v19, v2, v25

    move-object/from16 v17, p3

    move/from16 v18, p4

    move-object/from16 v21, v1

    invoke-static/range {v16 .. v22}, Lcom/bytedance/pangle/util/b/b;->a(ILjava/lang/String;IJLjava/lang/Throwable;Ljava/lang/String;)V

    .line 120
    :cond_16
    goto :goto_19

    :goto_18
    throw v0

    :goto_19
    goto :goto_18
.end method
